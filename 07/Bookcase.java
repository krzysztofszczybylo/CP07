import java.util.ArrayList;

public class Bookcase
{
    // instance variables - replace the example below with your own
    private String name;
    private String colour;
    private ArrayList<Book> bookcase;

    public Bookcase(String name, String colour, ArrayList<Book> bookcase)
    {
        this.name = name;
        this.colour = colour;
        this.bookcase = new ArrayList<Book>();
    }
    public void add(Book book){
        this.bookcase.add(book);
    }
    public void remove(String name){
        for (int i=0; i < this.bookcase.size(); i++){
            if (this.bookcase.get(i).getTitle() == name)
                this.bookcase.remove(i);
            }
    }
    public void showContent(){
        for(Book book : this.bookcase){
            System.out.println(book);
        }
        
    }
    public static void main(String[] args){
        Writer w1 = new Writer("Adam", "Mickiewicz", 200, "Paryż");
        Book b1 = new Book("Pan Tadeusz", w1, "Poemat", 35);
        Book b2 = new Book("Dziady", w1, "Poemat", 20);
        Bookcase bc1 = new Bookcase("Półka", "blue");
        
        bc1.add(b1);
        bc1.add(b1);
        bc1.add(b2);
        bc1.showContent();
        bc1.remove("Pan Tadeusz");
        bc1.showContent();
    }
}
