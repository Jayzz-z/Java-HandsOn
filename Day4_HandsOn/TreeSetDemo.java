package Day4_Ass;

import java.util.ArrayList;
import java.util.Scanner;


public class TreeSetDemo {
    static ArrayList<Book> books;
    static Scanner sc;

    public static void main(String[] args) {
        Book b1 = new Book(101, "Core Java", "Galvin", 30, 300);
        Book b2 = new Book(102, "CPP", "Let's Learn", 25, 450);
        Book b3 = new Book(102, "Python", "Reman", 253, 4500);
        Book b4 = new Book(102, "C", "Henry", 253, 4500);
        Book b5 = new Book(102, "C#", "Mwyor", 253, 4000);

        books = new ArrayList<>();
        books.add(b1);books.add(b2);books.add(b3);books.add(b4);books.add(b5);
        sc = new Scanner(System.in);

        int temp=0;
        do{
            System.out.println("PRESS 1 TO CONTINUE TO MENU");
            temp=sc.nextInt();
            if(temp!=1)return;
            menu();
        }while (temp==1);


    }

    private static void menu() {
        int selection;
        System.out.println("Press 1 To enter new book");
        System.out.println("Press 2 find out the high cost books names and quantity");
        System.out.println("Press 3 find out the books Written by 'Galvin'");
        System.out.println("Press 0 to exit");
        selection = sc.nextInt();

        switch (selection) {
            case 0: {
                break;
            }
            case 1: {
                addBook();
                break;
            }
            case 2: {
                highCostBooks();
                break;
            }
            case 3: {
                booksByGalvin();
                break;
            }
            default: {
                System.out.println("Invalid Selection");
            }
        }

    }

    private static void booksByGalvin() {
        System.out.println("Books whose author is Galvin");
        
        for (Book book :
                books) {
            if(book.publisher.contains("Galvin")){
                System.out.println(book.name + "  Written by: Galvin");
            }
        }
    }

    private static void highCostBooks() {
        System.out.println("High cost books are the book that costs more than ₹499");
        
        for (Book book :
                books) {
            if (book.price > 499) {
                System.out.println(book.name + " costs \t₹ " + book.price + "/-");
            }

        }
        System.out.println("------------------------------------------------------");
    }


    private static void addBook() {
        int id, quantity, price;
        String name, publisher;
        System.out.println("Enter Book ID: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("Book Name: ");
        name = sc.nextLine();
        System.out.println("Publisher: ");
        publisher = sc.nextLine();
        System.out.println("Quantity: ");
        quantity = sc.nextInt();
        sc.nextLine();
        System.out.println("Price: ");
        price = sc.nextInt();
        sc.nextLine();
        Book b1 = new Book(id, name, publisher, quantity, price);
        books.add(b1);
        System.out.println("New Book Added");
    }
}

