import java.util.ArrayList;
public class Book
{
    private String title;
    private Writer author;
    private String genre;
    private double cost;
    private ArrayList<Chapter> chapters;
    
    public Book(String title, Writer author, String genre, double cost, ArrayList<Chapter> chapters){
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.cost = cost;
        this.chapters = new ArrayList<Chapter>();
    }
    public String getTitle(){
        return title;
    }
    public void addChapter(Chapter chapter){
        this.chapters.add(chapter);
    }
    public String toString(){
        return("Title: " + title + "\nAuthor: " + author+ "\nGenre: " + genre+ "\nPrice: " + cost);
    }
    public static void main(String args[]){
        Writer w = new Writer("edgver", "fwfwfef", 456, "ewewew");
        Book b = new Book("fewfwewfe", w, "fds", 534534);
        System.out.println(b);
    }
}
