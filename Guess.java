import java.math.BigDecimal;

public class Guess extends User {
    public static void showAllProduct(){
        System.out.println("Chọn cách hiển thị: ");
        System.out.println("1: Dạng danh sách");
        System.out.println("2: Dạng bảng");
        Integer chooseMode = Integer.parseInt(sc.nextLine());
        WareHouse.getAllProduct(chooseMode);
    }
    public static void showMode(){
        System.out.println("Chọn chức năng cần thực hiện: ");
        System.out.println("1: Xem danh sách sản phẩm: ");
        System.out.println("2: Tìm kiếm sản phẩm: ");
        System.out.println("3: Mua sản phẩm: ");
        System.out.println("4: Đăng xuất");
    }
    public static void chooseMode(){
        showMode();
        Integer mode = Integer.parseInt(sc.nextLine());
        while(mode != 4) {
            if (mode.equals(1)) showAllProduct();
            else if (mode.equals(2)) User.findProduct();
            else if (mode.equals(3)) buyProduct();
            else if (mode.equals(4)) break;
            showMode();
            mode = Integer.parseInt(sc.nextLine());
        }
    }
    public static void buyProduct(){
        User.eraseProduct(new Guess());
        Product boughtProduct = User.getProductDeleted();
        if (boughtProduct.getName().equals("FirstName")) return;
        System.out.println("Mua thành công");
//        Admin.setRevenue(new BigDecimal(boughtProduct.getPrice()));
        if (boughtProduct instanceof Book) Book.setCountSoldProduct(Book.getCountSoldProduct() + 1);
        if (boughtProduct instanceof NoteBook) NoteBook.setCountSoldProduct(NoteBook.getCountSoldProduct() + 1);
        if (boughtProduct instanceof Pen) Pen.setCountSoldProduct(Pen.getCountSoldProduct() + 1);
        if (boughtProduct instanceof Pencil) Pencil.setCountSoldProduct(Pencil.getCountSoldProduct() + 1);
//        Product.setNumberProductAll(getProductDeleted());
    }
}
