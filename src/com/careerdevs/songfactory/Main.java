/**
 * Java basics: object factory
 * songFactory
 * create a main class- create scanner, ask user questions, create an instance of song class and print out instance.
 *
 */
package com.careerdevs.songfactory;

import java.util.Scanner;

public class Main {
   // Fields: title (String), artist (String), genre (String), seconds (int)
    public static void main(String[] args) {
        // create a scanner
        Scanner scanner = new Scanner(System.in);

        // ask questions
        System.out.print("Please enter song title: ");
        String songInput = scanner.nextLine();

        System.out.print("Please enter artist: ");
        String artistInput = scanner.nextLine();

        System.out.print("please enter genre: ");
        String genreInput = scanner.nextLine();

        System.out.print("Please enter length of song in seconds: ");
        int secondsInput = scanner.nextInt();

        // create an instance of Song class
        Song userGeneratedSong =  new Song(songInput, artistInput, genreInput, secondsInput);

        // print out user generated song value
        System.out.println(userGeneratedSong.toString());
    }
}
