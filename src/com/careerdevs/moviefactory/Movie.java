/**
 * Assignment- java basic: object factory
 * Create movie class with fields, constructor and to string method
 */
package com.careerdevs.moviefactory;

public class Movie {
    //Fields: title (String), director (String), runtimeInMin (float), hasBeenReleased (boolean)
    public String title;
    public String director;
    public float runtimeInMin;
    public boolean hasBeenReleased;


    // create a constructor
    public Movie (String title, String director, float runtimeInMin, boolean hasBeenReleased){
        this.title = title;
        this.director = director;
        this.runtimeInMin =  runtimeInMin;
        this.hasBeenReleased = hasBeenReleased;
    }
    // auto-generate a toString method

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", runtimeInMin=" + runtimeInMin +
                ", hasBeenReleased=" + hasBeenReleased +
                '}';
    }
}
