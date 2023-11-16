import java.math.BigDecimal;
import java.util.Scanner;

public class Product {
    public static Scanner sc = new Scanner(System.in);
    private static Integer countSoldProduct = 0;
    private String id;
    private String type;
    private String color;
    private String name;
    private String outPrice;
    private String brand;
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return outPrice;
    }

    public void setPrice(String price) {
        this.outPrice = price;
    }
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return this.id;
    }
    public boolean productLeft(String Info){
        if (brand.contains(Info) ||
           name.contains(Info) || outPrice.contains(Info)) return true;
        return false;
    }
    public void productInfo(){
        System.out.println("Mã sản phẩm: " + id);
        System.out.println("Tên sản phẩm: " + name);
        System.out.println("Giá bán: " + outPrice);
        System.out.println("Thương hiệu: " + brand);
//        System.out.println("Số sản phẩm đã nhập: " + WareHouse.countImportedProduct.get());
//        System.out.println("Số sản phầm đã xóa: " + quantityDeleted);
//        System.out.println("Số sản phẩm đã bán: " + quantitySold);
//        System.out.println("");
    }
    public void addInfo() {
        System.out.println("Nhập tên sản phẩm: ");
        name = sc.nextLine();
        System.out.println("Nhập giá bán: ");
        outPrice = sc.nextLine();
        System.out.println("Nhập thương hiệu: ");
        brand = sc.nextLine();
    }
    public static void productInfoTable(){
        System.out.format("%-15s %-20s %-10s %-15s %-20s\n", "Mã sản phẩm" , "Tên sản phẩm" , "Giá bán" , "Thương hiệu" , "Thông tin thêm");
    }
//    public void setNumberProductAll(Product product){
//        if (product instanceof Book) product.setNumberProducts(numberBook++);
//        if (product instanceof NoteBook) product.setNumberProducts(numberNoteBook++);
//        if (product instanceof Pen) product.setNumberProducts(numberPen++);
//        if (product instanceof Pencil) product.setNumberProducts(numberPencil++);
//    }
//    public void setNumberSoldAll(Product product){
//        if (product instanceof Book) product.setSoldProducts(numberBookSold++);
//        if (product instanceof NoteBook) product.setSoldProducts(numberNoteBookSold++);
//        if (product instanceof Pen) product.setSoldProducts(numberPenSold++);
//        if (product instanceof Pencil) product.setSoldProducts(numberPencilSold++);
//    }
}
