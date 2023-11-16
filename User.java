import java.math.BigDecimal;
import java.util.Scanner;

public class User  {
    public static Scanner sc = new Scanner(System.in);
    private static String username;
    private static String password;
    private static Product productDeleted = new Product();
    public static void logIn(){
        System.out.println("1: Đăng nhập");
        System.out.println("2: Thoát");
        Integer chooseMode;
        try {
            chooseMode = Integer.parseInt(sc.nextLine());
        } catch(NumberFormatException ex) {
            System.out.println("Không hợp lệ, vui lòng nhập lại: ");
            chooseMode = Integer.parseInt(sc.nextLine());
        }

        while (chooseMode.equals(1)) {
            System.out.println("Nhập tài khoản: ");
            username = sc.nextLine();
            System.out.println("Nhập mật khẩu: ");
            password = sc.nextLine();
            if (username.equals("admin") && password.equals("admin")) {
                Admin.chooseMode();
            } else {
                Guess.chooseMode();
            }
        }
    }
    public static void findProduct(){
        System.out.println("Nhập thông tin sản phẩm cần tìm: ");
        String Info = sc.nextLine();
        System.out.println("Chọn chế độ hiển thị");
        System.out.println("1: Dạng danh sách: ");
        System.out.println("2: Dạng bảng: ");
        Integer mode = Integer.parseInt(sc.nextLine());
        boolean[] checkEmpty = new boolean[1];
        checkEmpty[0] = true;
        WareHouse.getEachTypeOfProduct(Info, mode, checkEmpty);
    }
    private static void eraseByList(User user){
        System.out.println("Chọn sản phẩm: ");
        System.out.println("1: Book");
        System.out.println("2: NoteBook");
        System.out.println("3: Pen");
        System.out.println("4: Pencil");
        Integer mode = Integer.parseInt(sc.nextLine());
        if (mode == 1) WareHouse.getEachType(new Book());
        if (mode == 2) WareHouse.getEachType(new NoteBook());
        if (mode == 3) WareHouse.getEachType(new Pen());
        if (mode == 4) WareHouse.getEachType(new Pencil());
        System.out.println("Chọn id của sản phẩm cần tìm: ");
        String id = sc.nextLine();
        boolean[] checkEmpty = new boolean[1];
        checkEmpty[0] = true;
        Product beDeleted = WareHouse.findParticularProduct(id, checkEmpty);
        while (beDeleted == null){
            System.out.println("ID không hợp lệ, vui lòng nhập lại: ");
            id = sc.nextLine();
            beDeleted = WareHouse.findParticularProduct(id, checkEmpty);
        }
        WareHouse.deleteParticularProduct(beDeleted);
        if (user instanceof Guess) Admin.setRevenue(Integer.parseInt(beDeleted.getPrice()));
        productDeleted = beDeleted;
    }
    private static void eraseByInfor(User user){
        System.out.println("Nhập thông tin của sản phẩm cần tìm: ");
        String Info = sc.nextLine();
        System.out.println("Chọn chế độ hiển thị");
        System.out.println("1: Dạng danh sách: ");
        System.out.println("2: Dạng bảng: ");
        Integer mode = Integer.parseInt(sc.nextLine());
        boolean[] checkEmpty = new boolean[1];
        checkEmpty[0] = true;
        WareHouse.getEachTypeOfProduct(Info, mode, checkEmpty);
        if (checkEmpty[0] == true){
            System.out.println("Không tìm thấy sản phẩm theo yêu cầu");
            return;
        }
        System.out.println("Chọn id của sản phẩm cần tìm: ");
        String id = sc.nextLine();
        Product beDeleted = WareHouse.findParticularProduct(id, checkEmpty);
        while (beDeleted == null){
            System.out.println("ID không hợp lệ, vui lòng nhập lại: ");
            id = sc.nextLine();
            beDeleted = WareHouse.findParticularProduct(id, checkEmpty);
        }
        WareHouse.deleteParticularProduct(beDeleted);
        if (user instanceof Guess) Admin.setRevenue(Integer.parseInt(beDeleted.getPrice()));
        productDeleted = beDeleted;
    }
    public static Product getProductDeleted(){
        return productDeleted;
    }
    public static void eraseProduct(User user){ // Guess bought or Admin erased
        productDeleted.setName("FirstName");
        System.out.println("1: Hiện thị theo danh sách");
        System.out.println("2: Hiển thị theo thông tin tìm kiếm");
        Integer mode = Integer.parseInt(sc.nextLine());
        if (mode == 1) {
            if (user instanceof Guess) eraseByList(new Guess());
            else eraseByList(new Admin());
        }
        if (mode == 2) {
            if (user instanceof Guess ) eraseByInfor(new Guess());
            else eraseByInfor(new Admin());
        }
    }
}
