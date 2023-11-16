import java.math.BigDecimal;
import java.util.ArrayList;
public class Admin extends User{
    private static Integer id = 1;
//    private static BigDecimal revenue = new BigDecimal(0);
    private static Integer revenue = 0;
    public static void setRevenue(Integer addRevenue) {
        revenue = revenue + addRevenue;
    }
    public static Integer getRevenue(){
        return revenue;
    }
    public static void addProduct(Product newProduct){
        newProduct.addInfo();
        newProduct.setId(id.toString());
        id++;
        if (newProduct instanceof Book) WareHouse.bookList.add((Book)newProduct);
        else if (newProduct instanceof NoteBook) WareHouse.noteBookList.add((NoteBook)newProduct);
        else if (newProduct instanceof Pen) WareHouse.penList.add((Pen)newProduct);
        else if (newProduct instanceof Pencil) WareHouse.pencilList.add((Pencil)newProduct);
    }
    public static void addProductMode() {
        System.out.println("Chọn loại sản phẩm muốn thêm: ");
        System.out.println("1: Sách");
        System.out.println("2: Vở");
        System.out.println("3: Bút mực");
        System.out.println("4: Bút chì");
        Integer mode = Integer.parseInt(sc.nextLine());
        System.out.println("Chọn số lượng sản phẩm muốn thêm: ");
        Integer numberProduct = Integer.parseInt(sc.nextLine());
        for (int i=1; i<=numberProduct; i++) {
            if (mode.equals(1)) {
                addProduct(new Book());
//                Book.setNumberProductAll(new Book());
            }
            else if (mode.equals(2)) {
                addProduct(new NoteBook());
//                NoteBook.setNumberProductAll(new NoteBook());
            }
            else if (mode.equals(3)) {
                addProduct(new Pen());
//                Pen.setNumberProductAll(new Pen());
            }
            else if (mode.equals(4)) {
                addProduct(new Pencil());
//                Pencil.setNumberProductAll(new Pencil());
            }
            else{
                while(mode > 4 || mode < 1){
                    System.out.println("Không hợp lệ, vui lòng nhập lại: ");
                    mode = Integer.parseInt(sc.nextLine());
                }
                i--;
                continue;
            }
            System.out.println("Thêm thành công.");
            if (i < numberProduct) System.out.println("Nhập sản phẩm tiếp: ");
        }
    }
    public static void showMode(){
        System.out.println("Chọn chức năng cần thực hiện: ");
        System.out.println("1: Xem danh sách sản phẩm hiện có");
        System.out.println("2: Thêm sản phẩm mới vào kho");
        System.out.println("3: Xóa sản phẩm ra khỏi kho");
        System.out.println("4: Thống kê");
        System.out.println("5: Đăng xuất");
    }
    public static void chooseMode(){
        showMode();

        Integer mode = Integer.parseInt(sc.nextLine());
        while(true) {
            if (mode.equals(1)){
                System.out.println("1: Xem theo danh sách: ");
                System.out.println("2: Xem dạng bảng");
                Integer chooseMode = Integer.parseInt(sc.nextLine());
                WareHouse.getAllProduct(chooseMode);
            }
            if (mode.equals(2)) addProductMode();
            if (mode.equals(3)) eraseProduct();
            if (mode.equals(4)) Statistic.calculate();
            if (mode.equals(5)) break;
            System.out.println("Chọn công việc cần thực hiện tiếp: ");
            showMode();
            mode = Integer.parseInt(sc.nextLine());
        }
    }
    public static void eraseProduct(){
        User.eraseProduct(new Admin());
        System.out.println("Xóa thành công");
    }
}
