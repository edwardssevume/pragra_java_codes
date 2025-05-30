public class LibraryManagement {
    String studentName;
    String bookTitle;
    String author;
    static int totalBookIssued = 0;

    public LibraryManagement(String studentName, String bookTitle, String author){
        this.studentName = studentName;
        this.bookTitle = bookTitle;
        this.author = author;
        totalBookIssued ++;
    }

    public void printInfo(){
        System.out.println(bookTitle);
        System.out.println(studentName);
        System.out.println(author);
    }

    public  static void showTotalIssued(){
        System.out.println("Total books issued" +totalBookIssued);
    }
}
