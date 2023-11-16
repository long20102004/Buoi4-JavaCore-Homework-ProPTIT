public class Pencil extends Product{
    private static Integer countSoldProduct = 0;
    public static Integer getCountSoldProduct(){
        return countSoldProduct;
    }
    public static void setCountSoldProduct(Integer countSoldProducts) {
        Pencil.countSoldProduct = countSoldProducts;
    }
    private String material;
    private String stiffness;
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getStiffness() {
        return stiffness;
    }

    public void setStiffness(String stiffness) {
        this.stiffness = stiffness;
    }

    @Override
    public boolean productLeft(String Info) {
        return (super.productLeft(Info) || material.contains(Info) || stiffness.contains(Info));
    }

    @Override
    public void productInfo() {
        super.productInfo();
        System.out.println("Màu sắc: " + getColor());
        System.out.println("Chất liệu: " + getMaterial());
        System.out.println("Độ cứng: " + getStiffness());
//        System.out.println("Số sản phẩm còn lại: " + getQuantityLeft());
    }

    @Override
    public void addInfo() {
        super.addInfo();
        System.out.println("Nhập màu sắc: ");
        setColor(sc.nextLine());
        System.out.println("Nhập chất liệu: ");
        setMaterial(sc.nextLine());
        System.out.println("Nhập độ cứng: ");
        setStiffness(sc.nextLine());
    }
    public void productTable(){
        System.out.format("%-15s %-20s %-10s %-15s", getId(), getName(), getPrice(), getBrand());
        System.out.println(" Màu bút: " + getColor());
        System.out.format("%-15s %-20s %-10s %-15s %-60s\n", "", "", "", "", "Chất liệu: " + getMaterial());
        System.out.format("%-15s %-20s %-10s %-15s %-60s\n", "", "", "", "", "Độ cứng: " + getStiffness());
    }
}
