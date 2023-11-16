public class NoteBook extends Product{
    private static Integer countSoldProduct = 0;
    public static Integer getCountSoldProduct(){
        return countSoldProduct;
    }
    public static void setCountSoldProduct(Integer countSoldProducts) {
        NoteBook.countSoldProduct = countSoldProducts;
    }
    private String pages;
    private String material;
    private String size;

    public String getPages() {
        return pages;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public boolean productLeft(String Info) {
        return (super.productLeft(Info) || pages.contains(Info) || material.contains(Info)
                || size.contains(Info));
    }

    @Override
    public void productInfo() {
        super.productInfo();
        System.out.println("Số trang: " + getPages());
        System.out.println("Loại vở: " + getType());
        System.out.println("Màu sắc bìa: " + getColor());
        System.out.println("Chất liệu giấy: " + getMaterial());
        System.out.println("Kích thước: " + getSize());
//        System.out.println("Số sản phẩm còn lại: " + getQuantityLeft());
    }
    public void addInfo(){
        super.addInfo();
        System.out.println("Nhập số trang của vở: ");
        setPages(sc.nextLine());
        System.out.println("Loại vở: " );
        setType(sc.nextLine());
        System.out.println("Màu sắc bìa: ");
        setColor(sc.nextLine());
        System.out.println("Chất liệu giấy: " );
        setMaterial(sc.nextLine());
        System.out.println("Kích thước: ");
        setSize(sc.nextLine());
    }
    public void productTable(){
        System.out.format("%-15s %-20s %-10s %-15s", getId(), getName(), getPrice(), getBrand());
        System.out.println(" Số trang: " + getPages());
        System.out.format("%-15s %-20s %-10s %-15s %-60s\n", "", "", "", "", "Loại vở: " + getType());
        System.out.format("%-15s %-20s %-10s %-15s %-60s\n", "", "", "", "", "Màu sắc bìa: " + getColor());
        System.out.format("%-15s %-20s %-10s %-15s %-60s\n", "", "", "", "", "Chất liệu giấy: " + getMaterial());
        System.out.format("%-15s %-20s %-10s %-15s %-60s\n", "", "", "", "", "Kích thước: " + getSize());
    }
}
