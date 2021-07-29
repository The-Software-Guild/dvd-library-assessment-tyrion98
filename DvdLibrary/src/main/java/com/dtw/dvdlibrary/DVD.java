
/**
 *@author DeJone' Williamson
 *email: tyrionw@gmail.com
 *date: 7/29/2021
 *purpose: practice file IO and hash maps
 */


package com.dtw.dvdlibrary;


public class DVD{


    // fields
    private String title;
    private String releaseDate;
    private String mpaaRating;
    private String directorName;
    private String studio;
    private String userRating;


    // set the values for the dvd in the constructor
    public DVD(String title, String releaseDate, String mpaaRating, String directorName, String studio, String userRating){

        this.title = title;
        this.releaseDate = releaseDate;
        this.mpaaRating = mpaaRating;
        this.directorName = directorName;
        this.studio = studio;
        this.userRating = userRating;

    }

    // getters and setters for each field
    // set title
    public void setTitle(String title){

        this.title = title;
    }

    // get title
    public String getTitle(){

        return this.title;
    }

    // set release date
    public void setReleaseDate(String releaseDate){

        this.releaseDate = releaseDate;
    }

    // get release date
    public String getReleaseDate(){

        return this.releaseDate;
    }

    // set mpaa rating
    public void setMpaaRating(String mpaaRating){

        this.mpaaRating = mpaaRating;
    }

    // get mpaa rating
    public String getMpaaRating(){

        return this.mpaaRating;
    }

    // set director name
    public void setDirectorName(String directorName){

        this.directorName = directorName;
    }

    // get director name
    public String getDirectorName(){

        return this.directorName;
    }

    // set studio
    public void setStudio(String studio){

        this.studio = studio;
    }

    // get studio
    public String getStudio(){

        return this.studio;
    }

    // set userRating
    public void setUserRating(String userRating){

        this.userRating = userRating;
    }

    // get userRating
    public String getUserRating(){

        return this.userRating;
    }
}