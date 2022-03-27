package simplilearnFinalProject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LockedMe {
    /**
     * Menu should be there
     * 4 Options
     * ============================
     * 1.get all files in ascending order
     * 2.  Add files to add a user specified file to the application
     * 3. to delete a user specified file from the application
     * 4.  to search a user specified file from the application
     * 5. Navigation option to close the current execution context and return to the main context - Exit
     * **/

    static final String projectFilesPath = "/Users/aishas/Desktop/LockedMeProject/Files";

    //Menu Method
    public static void displayMenu(){
        System.out.println("***************************************************************************************************");

        System.out.println("\t\t Welcome to LockedMe.com secure App");
        System.out.println("\t\t Developed by : Asho Hassan ");
        System.out.println("***************************************************************************************************");
        System.out.println("\t\t1. Get all files in ascending order");
        System.out.println("\t\t2. Add a user specified file to the application");
        System.out.println("\t\t3. Delete a user specified file from the application");
        System.out.println("\t\t4. Search a user specified file from the applications");
        System.out.println("\t\t5. Navigation option to close the current execution context and return to the main context");
        System.out.println("****************************************************************************************************");

    } //end display menu

    /**
     * This method will take file name as parameters and checks if
     * it is exist in the project folder or not
   **/
    public static boolean checkFileExists(String fileName){
        // all files names into a list
        ArrayList <String> allFilesNames = new ArrayList<>();
        File folder = new File(projectFilesPath);
        File [] listOfFiles = folder.listFiles();
        if (listOfFiles.length >0){
            for (var l : listOfFiles){
                allFilesNames.add(l.getName());

            }//end for
        } //end if
        File f = new File(projectFilesPath + "/" + fileName);
        if (allFilesNames.contains(fileName))
            return true;
        else return false;

    } //end checkfileExists



    /*This method get all the files*/
    public static void getAllFiles(){
        File fileObj = new File(projectFilesPath) ;
        // returns an array of all files
            File[] listOfFiles = fileObj.listFiles(); // creating array
        if (listOfFiles.length > 0 ) {
            System.out.println("File lists is below\n");
            for (var l : listOfFiles) {
                System.out.println(l.getName());
            } //end for
        }//end if
    } //end getfiles

    // This Mehod Adds a file
    public static void createFiles () throws IOException {
        Scanner obj = new Scanner(System.in);
        String fileName;
        System.out.println("Enter a file name");
        fileName = obj.nextLine();
        int linesCount;
        System.out.println("Enter how many lines in the file :");
        linesCount = Integer.parseInt(obj.nextLine());
        FileWriter fileWriter = new FileWriter(projectFilesPath + "/" + fileName);

        //Read line by line from user
        for (int i = 1; i <linesCount ; i++) {

            fileWriter.write(obj.nextLine() + "\n");

        }//end for

        System.out.println("File Created Successfully ");
        fileWriter.close();

    }//end create

    //This Method Deletes a files
   public static void deleteFiles () {
       try {
           Scanner scanobj = new Scanner(System.in);
           String fileName;
           System.out.println("Enter file name to be deleted :");
           fileName = scanobj.nextLine();
           //Get all files names into alist

           File f = new File(projectFilesPath + "/" + fileName);
           if (checkFileExists(fileName)) {
               f.delete();
               System.out.println("File deleted Successfully ");
           } else {
               System.out.println("File does not exist");
           } //end if
       }
       catch (Exception Ex){
           System.out.println("Unable to delete file. please contact : admin@test.com");
       } //end exception


       }//end delete

    //ThismMethod Searches files
   public static void searchFiles (){
        try {
       Scanner scanobj = new Scanner(System.in);
       String fileName;
       System.out.println( "Enter the file name to be searched :");
       fileName = scanobj.nextLine();
            // all files names into a list
            /*ArrayList <String> allFilesNames = new ArrayList<>();
            File folder = new File(projectFilesPath);
            File [] listOfFiles = folder.listFiles();
            if (listOfFiles.length >0){
                for (var l : listOfFiles){
                    allFilesNames.add(l.getName());

                }//end for
            } //end if
            File f = new File(projectFilesPath + "/" + fileName);*/
            if (checkFileExists(fileName)){
                System.out.println("File is available");
            }else {
                System.out.println("file is not available");
            }//end if

        }
        catch (Exception Ex){

        } //end except


   }//end search








}
