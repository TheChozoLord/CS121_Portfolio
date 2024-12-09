package Activity34;

public class BookOut {
    private String title;
    private int bookID;
    private String borrowersName;

    BookOut(String title, String name, int ID){
        this.bookID = ID;
        this.borrowersName = name;
        this.title = title;
    }

    public int getBookID() {
        return bookID;
    }

    public String getBorrowersName() {
        return borrowersName;
    }

    public String getTitle() {
        return title;
    }

    public void details(){
        System.out.println(title + " ID:" + bookID + "Was checked out by " + borrowersName);
    }
}
