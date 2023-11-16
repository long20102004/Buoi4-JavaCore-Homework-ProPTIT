import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;

public class WareHouse {
    public static Integer getSize(){
        return bookList.size() + noteBookList.size() + pencilList.size() + penList.size() + 1;
    }
    public static Product findParticularProduct(String id, boolean checkEmpty[]) {
        for (Book book : bookList) {
            if (book.getId().equals(id)){
                checkEmpty[0] = false;
                return book;
            }
        }
        for (NoteBook noteBook : noteBookList) {
            if (noteBook.getId().equals(id)) {
                checkEmpty[0] = false;
                return noteBook;
            }
        }
        for (Pen pen : penList) {
            if (pen.getId().equals(id)) {
                checkEmpty[0] = false;
                return pen;
            }
        }
        for (Pencil pencil : pencilList) {
            if (pencil.getId().equals(id)) {
                checkEmpty[0] = false;
                return pencil;
            }
        }
        return null;
    }

    public static void deleteParticularProduct(Product beDeleted) {
        if (beDeleted instanceof Book) bookList.remove(beDeleted);
        if (beDeleted instanceof NoteBook) noteBookList.remove(beDeleted);
        if (beDeleted instanceof Pen) penList.remove(beDeleted);
        if (beDeleted instanceof Pencil) pencilList.remove(beDeleted);
    }

    public static void getEachTypeOfProduct(String Info, Integer mode, boolean checkEmpty[]) {
        checkEmpty[0] = true;
        if (mode.equals(2)) Product.productInfoTable();
        for (Book book : bookList) {
            if (book.productLeft(Info)) {
                if (mode.equals(1)) book.productInfo();
                else book.productTable();
                checkEmpty[0] = false;
            }
        }
        for (NoteBook noteBook : noteBookList) {
            if (noteBook.productLeft(Info)) {
                if (mode.equals(1)) noteBook.productInfo();
                else noteBook.productTable();
                checkEmpty[0] = false;
            }
        }
        for (Pen pen : penList) {
            if (pen.productLeft(Info)) {
                if (mode.equals(1)) pen.productInfo();
                else pen.productTable();
                checkEmpty[0] = false;
            }
        }
        for (Pencil pencil : pencilList) {
            if (pencil.productLeft(Info)) {
                if (mode.equals(1)) pencil.productInfo();
                else pencil.productTable();
                checkEmpty[0] = false;
            }
        }
//        if (checkEmpty == true) System.out.println("Không tìm thấy sản phẩm theo yêu cầu");
    }

    public static void getEachType(Product Type) {
        if (Type instanceof Book) {
            for (Book book : bookList) book.productInfo();
        } else if (Type instanceof NoteBook) {
            for (NoteBook noteBook : noteBookList) noteBook.productInfo();
        } else if (Type instanceof Pen) {
            for (Pen pen : penList) pen.productInfo();
        } else if (Type instanceof Pencil) {
            for (Pencil pencil : pencilList) pencil.productInfo();
        }
    }

    public static void getAllProduct(Integer mode) {
        if (mode.equals(2)){
           Product.productInfoTable();
        }
        boolean checkEmpty = true;
        for (Book book : bookList) {
            if (mode.equals(1)) book.productInfo();
            else book.productTable();
            checkEmpty = false;
        }
        for (NoteBook noteBook : noteBookList) {
            if (mode.equals(1)) noteBook.productInfo();
            else noteBook.productTable();
            checkEmpty = false;
        }
        for (Pen pen : penList) {
            if (mode.equals(1)) pen.productInfo();
            else pen.productTable();
            checkEmpty = false;
        }
        for (Pencil pencil : pencilList) {
            if (mode.equals(1)) pencil.productInfo();
            else pencil.productTable();
            checkEmpty = false;
        }
        if (checkEmpty == true) System.out.println("Kho hàng trống");
    }

    public static ArrayList<Book> bookList = new ArrayList<>();
    public static ArrayList<NoteBook> noteBookList = new ArrayList<>();
    public static ArrayList<Pen> penList = new ArrayList<>();
    public static ArrayList<Pencil> pencilList = new ArrayList<>();
}
