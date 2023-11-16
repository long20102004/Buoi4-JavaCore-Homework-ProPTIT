public class Book extends Product{
    private static Integer countSoldProduct = 0;
    public static Integer getCountSoldProduct(){
        return countSoldProduct;
    }
    public static void setCountSoldProduct(Integer countSoldProducts) {
        Book.countSoldProduct = countSoldProducts;
    }
    private String author;
    private String publishingYear;
    public String language;
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(String publishingYear) {
        this.publishingYear = publishingYear;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
    @Override
    public boolean productLeft(String Info) {
        if (super.productLeft(Info) || author.contains(Info) || publishingYear.contains(Info)
            || language.contains(Info)) return true;
        return false;
    }
    public void productInfo() {
        super.productInfo();
        System.out.println("Thể loại: " + getType());
        System.out.println("Tác giả: " + getAuthor());
        System.out.println("Năm xuất bản: " + getPublishingYear());
        System.out.println("Ngôn ngữ: " + getLanguage());
//        System.out.println("Số sản phẩm còn lại: " + getQuantityLeft());
    }
    public void addInfo(){
        super.addInfo();
        System.out.println("Nhập tên tác giả: ");
        setAuthor(sc.nextLine());
        System.out.println("Nhập năm phát hành");
        setPublishingYear(sc.nextLine());
        System.out.println("Nhập ngôn ngữ của cuốn sách: ");
        setLanguage(sc.nextLine());
        System.out.println("Nhập thể loại sách: ");
        setType(sc.nextLine());
    }
    public void productTable(){
        System.out.format("%-15s %-20s %-10s %-15s", getId(), getName(), getPrice(), getBrand());
        System.out.println(" Tác giả: " + getAuthor());
        System.out.format("%-15s %-20s %-10s %-15s %-60s\n", "", "", "", "", "Năm xuất bản: " + getPublishingYear());
        System.out.format("%-15s %-20s %-10s %-15s %-60s\n", "", "", "", "", "Ngôn ngữ: " + getLanguage());
        System.out.format("%-15s %-20s %-10s %-15s %-60s\n", "", "", "", "", "Thể loại: " + getType());
    }
}
