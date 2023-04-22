
//Create a class called Book that has instance variables for title,
// author, and number of pages. Add a method called getTitle that returns the book's title.
public class newBook {
    String title;
    String auther;
    int numberPages;

    public newBook(String title, String auther, int numberPages) {
        this.title =  title;
        this.auther =  auther;
        this.numberPages =  numberPages;
    }

    public String getinfo() {
        return ("Title:"  + " " + title + " " + "\nAuther:" + " " + auther + "\nNumber Pages:" + " " + numberPages);

    }

    public static void main(String[] args) {
        newBook myObj = new newBook("The little Prince", "Ekzyuperi", 40);
        System.out.println(myObj.getinfo());
    }
}
