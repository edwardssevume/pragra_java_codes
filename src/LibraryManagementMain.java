public class LibraryManagementMain {
    public static void main(String[] args) {
        LibraryManagement std1 = new LibraryManagement("Edward", "Welcome to Canada", "Michael");
        LibraryManagement std2 = new LibraryManagement("Matha", "To day is gone", "Jones");
        //LibraryManagement std3 = new LibraryManagement();

        std1.printInfo();
        std2.printInfo();
        LibraryManagement.showTotalIssued();
        LibraryManagement.showTotalIssued();
    }
}
