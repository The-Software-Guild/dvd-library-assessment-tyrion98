
/**
 *@author DeJone' Williamson
 *email: tyrionw@gmail.com
 *date: 7/29/2021
 *purpose: practice file IO and hash maps
 */


package main.java.com.dtw.dvdlibrary;

// import needed libraries
import java.util.Scanner;

import com.dtw.dvdlibrary.DVD;

import java.util.File;
import java.util.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class DvdMain{


    // main function
    public static void main(String[] args){

        // declarations
        int userInput=-1;
        List<DVD> dvdList = new ArrayList<DVD>();

        // while the user hasn't exited the program
        while(userInput != 7){      

            // call the main menu function
            dvdMenu();

            // get user menu input
            userInput = userMenuInput();

            // call function that handles each menu option
            optionChosen(userInput, dvdList);
        }

    }

    // dvd menu function
    public static void dvdMenu(){

        // print out the dvd menu
        System.out.println("\nWELCOME TO THE DVD LIBRARY!\n====================================\n");
        System.out.println("Select one of the following choices (1-7):");
        System.out.println("1. Add a DVD to the collection.");
        System.out.println("2. Remove a DVD from the collection.");
        System.out.println("3. Edit a DVD from the collection.");
        System.out.println("4. List all DVDs in the collection.");
        System.out.println("5. Display the information of a DVD");
        System.out.println("6. Search for DVD by title.");
        System.out.println("7. Quit.");

    }

    // retrieves the user's input
    public static int userMenuInput(){

        //declarations
        String userInput = "0";
        Scanner sc = new Scanner(System.in);
        
        // get input, make sure its an int, if not print error msg and exit program
        try{

            userInput = sc.nextLine();
            
            // check if its not a number between 1-7
            if(Integer.parseInt(userInput) < 1 || Integer.parseInt(userInput) > 7){

                // throw exception
                //sc.close();
                throw new Exception();
            }

        } catch(Exception e) {

            System.out.println("\nWRONG INPUT! EXITING PROGRAM!");
            System.exit(0);

        }

        // close scanner
        //sc.close();

        // return user input
        return Integer.parseInt(userInput);

    }

    // branch off to different functions based on menu choice
    public static void optionChosen(int userInput, List<DVD> dvdList){
          
        // declarations

        // switch statement
        switch(userInput){

            // case 1 - add dvd
            case 1:
                addDVD(dvdList);
                break;

            // case 2 - remove dvd
            case 2:
                removeDVD(dvdList);
                break;
                
            // case 3 - edit a dvd
            case 3:
                //editDVD(dvdList);
                break;
            
            // case 4 - list all dvds
            case 4:
                listAllDVDs(dvdList);
                break;

            // case 5 - display dvd info
            case 5:
                //displayDVD(dvdList);
                break;
            
            // case 6 - search for dvd by title
            case 6:
                searchDVDByTitle(dvdList);
                break;

            // case 7 - exit program   
            case 7:
                exit();
                break;    
        }

    }

    // 1 - add a dvd to the collection
    public static void addDVD(List<DVD> dvdList){

        // declarations
        String title, releaseDate, mpaaRating, directorName, studio, userRating;
        Scanner sc = new Scanner(System.in);
        // prompt
        System.out.println("Adding Dvd.......\n======================================\n");
        System.out.println("What is the title of the DVD you would like to add?");

        // input
        title = sc.nextLine();

        System.out.println("What is the release date of the DVD you would like to add? (Please put in the year of release)");
        releaseDate = sc.nextLine();
        System.out.println("What is the MPAA rating of the DVD you would like to add? (Example: G, PG, PG-13, R, NC-17)");
        mpaaRating = sc.nextLine();
        System.out.println("What is the Director's name of the DVD you would like to add? (Last name, First name) -> Peele, Jordan");
        directorName = sc.nextLine();
        System.out.println("What is the Studio of the DVD you would like to add?");
        studio = sc.nextLine();
        System.out.println("What is the User rating/note of the DVD you would like to add?");
        userRating = sc.nextLine();

        // add to the dvd list
        DVD newDvd = new DVD(title, releaseDate, mpaaRating, directorName, studio, userRating);
        dvdList.add(newDvd);

        // closing msg
        System.out.println("\n'" + title +"'"+ " added to the DVD library.");

        // close scanner
        //sc.close();

    }

    // 2 - remove a dvd from the collection
    public static void removeDVD(List<DVD> dvdList){

        // declarations
        String title;
        int dvdLength = dvd.size();
        Scanner sc = new Scanner(System.in);
        // prompt
        System.out.println("\nRemoving Dvd......\n======================================\n");
        System.out.println("What is the title of the DVD you would like to remove?");

        // input
        title = sc.nextLine();

        // remove
        dvdList.remove(title);

        // check if anything was actually removed, if not then say nothing removed
        if(dvdList.size() < dvdLength){

            // state that the dvd has been removed
            System.out.println("'" + title + "'"+ " has been removed from the DVD library.");

        } else{

            System.out.println(title + " not in the DVD library. Nothing was removed.");
        }


    }

    // 4 - list all of the dvds in the collection
    public static void listAllDVDs(List<DVD> dvdList){

        // print out what the program is doing
        System.out.println("\nDVDs in the collection\n====================================\n");
        // go through the list of dvds and print them all out
        for(DVD dvd : dvdList){

            // pretty print 
            System.out.println("Title: " + dvd.getTitle());
            System.out.println("Release Date: " + dvd.getReleaseDate());
            System.out.println("MPAA Rating: " + dvd.getMpaaRating());
            System.out.println("Director Name: " + dvd.getDirectorName());
            System.out.println("Studio: " + dvd.getStudio());
            System.out.println("User Rating/Note: " + dvd.getUserRating());

            System.out.println();

        }

    }

    // 6 - searches for dvd in the collection
    public static void searchDVDByTitle(List<DVD> dvdList){

        // declarations
        Scanner sc = new Scanner(System.in);
        String dvdTitle = "";

        // ask for the dvd they are looking for 
        System.out.println("\nWhat is title of the DVD you are searching for?:");

        // store their input into a variable
        dvdTitle = sc.nextLine();

        // searching msg
        System.out.println("\nSearching for dvd....");

        // search for the dvd in the dvd list
        for(DVD dvd: dvdList){

            // if found print out the info of the dvd
            if(dvd.getTitle().equals(dvdTitle)){

                System.out.println("DVD FOUND! Dislaying information below...=============================\n");
                 
                System.out.println("Title: " + dvd.getTitle());
                System.out.println("Release Date: " + dvd.getReleaseDate());
                System.out.println("MPAA Rating: " + dvd.getMpaaRating());
                System.out.println("Director Name: " + dvd.getDirectorName());
                System.out.println("Studio: " + dvd.getStudio());
                System.out.println("User Rating/Note: " + dvd.getUserRating());
    
                System.out.println();

                // return function
                return;

            }

        }

        // not found msg
        System.out.println("Aww, dvd not found. Returning to main menu!");

    }

    // 7 - exit program
    public static void exit(){

        System.out.println("Updated DVD collection printed to file. Closing program.");
        System.exit(0);

    }

}