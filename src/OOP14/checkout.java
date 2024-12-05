package OOP14;
public class checkout {

    protected String name;
    protected String bookTitle;
    protected int outDate;
    protected int returnDate;

    public checkout(String name, String bookTitle, int outDate, int returnDate){
        this.name = name;
        this.bookTitle = bookTitle;
        this.outDate = outDate;
        this.returnDate = returnDate;
    }

    public String toString(){
        return "Name: " + name + ", Book Title: " + bookTitle + ", Out Date: " + outDate + ", Return Date: " + returnDate;
    }
}