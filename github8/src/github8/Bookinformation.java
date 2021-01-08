package github8;
import java.util.*;
public class Bookinformation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Books books1 = new Books(1001, "Java", 85.0, "��е������");
        Books books2 = new Books(1002, "���ݽṹ", 49.0, "�廪������");
        HashMap<Integer, Books> booksHashMap = new HashMap<>();
        booksHashMap.put(books1.getNum(), books1);
        booksHashMap.put(books2.getNum(), books2);
        
        List<HashMap<Integer, Books>> booksList = new ArrayList<>();
        booksList.add(booksHashMap);
        
        System.out.println("���\t����\t����\t������");
        for (HashMap<Integer, Books> h : booksList) {
            Set<Integer> key = h.keySet();
            for (Integer i : key) {
                System.out.println(i
                        + "\t" + h.get(i).getName()
                        + "\t" + h.get(i).getPrice()
                        + "\t" + h.get(i).getPress());
            }
        }
    }
}

class Books {
    private int num;
    private String name;
    private double price;
    private String press;

    public Books() {

    }

    Books(int num, String name, double price, String press) {
        super();
        this.num = num;
        this.name = name;
        this.price = price;
        this.press = press;
    }

    int getNum() {
        return num;
    }

    String getName() {
        return name;
    }

    double getPrice() {
        return price;
    }

    String getPress() {
        return press;
    }


}
