

public class Chapter
{
    private Book book;
    private String title;
    private int pages;
    private int startingPage;

    public Chapter(Book book, String title, int pages, int startingPage)
    {
        this.book = book;
        this.title = title;
        this.pages = pages;
        this.startingPage = startingPage;
    }

    public String toString()
    {
       return(book + "Title of chapter: " + title + "\nNumber of pages: " + pages + "\nStarting page: " +startingPage);
    }
}
