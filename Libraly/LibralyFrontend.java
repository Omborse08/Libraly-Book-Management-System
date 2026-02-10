package Libraly;
import java.util.Scanner;

public class LibralyFrontend {
    static void showMenu() {
        System.out.println("\n1. Add Book\n" +
                "2. Add Member\n" +
                "3. Issue Book\n" +
                "4. Return Book\n" +
                "5. Search Book\n" +
                "6. Exit");
    }
    public static void main(String[] args) {
        int countBooks = 100;
        int countMember = 1;
        System.out.println("===== LIBRARY MANAGEMENT SYSTEM =====");
        Scanner sc = new Scanner(System.in);
        Libraly libs = new Libraly();
        showMenu();
        boolean isRun = true;
        while (isRun) {

            System.out.print("\nChoose Option: ");
            int choose = sc.nextInt();
            switch (choose) {
                case 1:
                    sc.nextLine();
                    System.out.print("Enter Book Title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter Book Author: ");
                    String author = sc.nextLine();
                    Books book = new Books(countBooks++,title,author);
                    if (libs.addBook(book)) {
                        System.out.println("Book Added Successfully!");
                        System.out.println("Book Id: "+book.getId());
                        System.out.print("Book Status: ");
                        if (book.isAvailable()) {
                            System.out.println("Available");
                        }
                        else {
                            System.out.println("Not Available");
                        }
                    }
                    else {
                        System.out.println("Book Not Added Try Again!");
                    }
                    break;

                case 2:
                    sc.nextLine();
                    System.out.print("Enter Member Name: ");
                    String name = sc.nextLine();
                    Members member = new Members(countMember++,name);
                    if (libs.addMember(member)) {
                        System.out.println("Member Added Successfully!");
                        System.out.println("Member Id: "+member.getMemberid());
                    }
                    else {
                        System.out.println("Member Not Added!");
                    }
                    break;

                case 3:
                    System.out.print("Enter Book Id: ");
                    int issueID = sc.nextInt();
                    System.out.print("Issued To Member Id: ");
                    int memberID = sc.nextInt();
                    Members lu = libs.issueBook(issueID,memberID);
                    if(lu != null) {
                        System.out.println("Book Issued Successfully!");
                        System.out.println("Book Issue To "+lu.getMemberName());
                    }
                    else {
                        System.out.println("Book can't be issued");
                    }
                    break;

                case 4:
                    System.out.print("Enter Book ID To Return: ");
                    int returnID = sc.nextInt();
                    if (libs.returnBook(returnID)) {
                        System.out.println("Book Returned Successfully!");
                    }
                    else {
                        System.out.println("Check Id And Try Again!");
                    }
                    break;

                case 5:
                    System.out.print("Enter Book ID: ");
                    int searchId = sc.nextInt();
                    Books EBA = libs.searchBook(searchId);
                    if (EBA != null) {
                        System.out.println("Book Title: " + EBA.getTitle());
                        System.out.println("Book Author: " + EBA.getAuthor());
                        System.out.print("Book Status: ");
                        if (EBA.isAvailable()) {
                            System.out.println("Available");
                        } else {
                            System.out.println("Not Available");
                        }
                    }
                    else {
                        System.out.println("Book Is Not Available!");
                    }
                    break;

                case 6:
                    System.out.println("Thank You Bye!");
                    isRun = false;
                    break;
            }
        }
    }
}
