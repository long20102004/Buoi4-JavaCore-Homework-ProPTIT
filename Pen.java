public class Pen extends Product{
    private static Integer countSoldProduct = 0;
    public static Integer getCountSoldProduct(){
        return countSoldProduct;
    }
    public static void setCountSoldProduct(Integer countSoldProducts) {
        Pen.countSoldProduct = countSoldProducts;
    }
    private String material;
    private String inkType;
    private String smoothness;
    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }

    public String getInkType() {
        return inkType;
    }

    public void setInkType(String inkType) {
        this.inkType = inkType;
    }

    public String getSmoothness() {
        return smoothness;
    }

    public void setSmoothness(String smoothness) {
        this.smoothness = smoothness;
    }

    @Override
    public boolean productLeft(String Info) {
        return (super.productLeft(Info) || material.contains(Info) || inkType.contains(Info)
         || smoothness.contains(Info));
    }
    public void productInfo() {
        super.productInfo();
        System.out.println("Màu sắc :" + getColor());
        System.out.println("Chất liệu: " + getMaterial());
        System.out.println("Độ mịn: " + getSmoothness());
        System.out.println("Loại mực: " + getInkType());
//        System.out.println("Số sản phẩm còn lại: " + getQuantityLeft());
    }

    @Override
    public void addInfo() {
        super.addInfo();
        System.out.println("Nhập màu bút: ");
        setColor(sc.nextLine());
        System.out.println("Nhập chất liệu: ");
        setMaterial(sc.nextLine());
        System.out.println("Nhập độ mịn: ");
        setSmoothness(sc.nextLine());
        System.out.println("Nhập loại mực: ");
        setInkType(sc.nextLine());
    }
    public void productTable(){
        System.out.format("%-15s %-20s %-10s %-15s", getId(), getName(), getPrice(), getBrand());
        System.out.println(" Màu bút: " + getColor());
        System.out.format("%-15s %-20s %-10s %-15s %-60s\n", "", "", "", "", "Chất liệu: " + getMaterial());
        System.out.format("%-15s %-20s %-10s %-15s %-60s\n", "", "", "", "", "Độ mịn: " + getSmoothness());
        System.out.format("%-15s %-20s %-10s %-15s %-60s\n", "", "", "", "", "Loại mực: " + getInkType());
    }
}
