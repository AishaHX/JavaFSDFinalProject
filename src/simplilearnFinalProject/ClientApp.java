package simplilearnFinalProject;

import java.io.IOException;
import java.util.Scanner;

public class ClientApp {
    public static void main(String[] args) throws IOException {
        Scanner obj = new Scanner(System.in);
        int ch;
        do  {
            LockedMe.displayMenu();
            System.out.println("Enter your choice: ");
            ch=Integer.parseInt(obj.nextLine());

            switch (ch){
                case 1 : LockedMe.getAllFiles();
                break;
                case 2: LockedMe.createFiles();
                break;
                case 3: LockedMe.deleteFiles();
                break;
                case 4:LockedMe.searchFiles();
                break;
                case 5: System.exit(0);
                default:
                    System.out.println("invalid option");
                    break;
            }//end switch
        }//end do
        while (ch>0);
        obj.nextLine();
        obj.close();


    }
}
