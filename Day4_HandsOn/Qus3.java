package Day4_Ass;

public class Book implements Comparable<Book> { int id;
String name, publisher;
int quantity;
int price;
public Book(int id, String name, String publisher, int quantity, int
        price) {
    this.id = id;
    this.name = name; this.publisher = publisher; this.quantity = quantity; this.price = price;
}
@Override
public int compareTo(Book o) {
    if (quantity > o.quantity) { return 1;
    } else if (quantity < o.quantity) { return -1;
    }
    return 0;}}