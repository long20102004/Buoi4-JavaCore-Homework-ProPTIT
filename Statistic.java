public class Statistic {
    public static void calculate(){
        System.out.println("Số sách đã bán: " + Book.getCountSoldProduct());
        System.out.println("Số vở đã bán: " + NoteBook.getCountSoldProduct());
        System.out.println("Số bút bi đã bán: " + Pen.getCountSoldProduct());
        System.out.println("Số bút chì đã bán: " + Pencil.getCountSoldProduct());
        System.out.println("Doanh thu: " + Admin.getRevenue());
        System.out.println("Lợi nhuân: Chưa tính được do chưa có giá nhập");
    }
}
