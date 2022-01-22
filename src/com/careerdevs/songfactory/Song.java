/**
 * create class with the fields: title (String), artist (String), genre (String), seconds (int)
 * create a constructor for the class
 * auto-generate a toString method
 */
package com.careerdevs.songfactory;

public class Song {
    //Fields: title (String), artist (String), genre (String), seconds (int)
    public String title;
    public String artist;
    public String genre;
    public int seconds;

    // create a constructor
    public Song (String title, String artist, String genre, int seconds){
        this.title = title;
        this.artist = artist;
        this.genre = genre;
        this.seconds = seconds;
    }
    //auto-generate a toString method


    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", genre='" + genre + '\'' +
                ", seconds=" + seconds +
                '}';
    }
}
