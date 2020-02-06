

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Song> songs = new ArrayList<>();
        for (int i = 0; i< 3;i++){
            System.out.println("Please enter an artist: ");
            String artist = sc.nextLine();//modify program to prompt user for an artist
            System.out.println("Please enter a title");
            String title = sc.nextLine(); //modify program to prompt user for a title
            Song s = new Song();
            s.setArtist(artist);
            s.setTitle(title);
            songs.add(s);
        }

        //print all the songs in the array list
        for(Song song: songs){
            System.out.println(song.display());
        }

        //look for blue and print if found
        String titleToFind = "Purple Rain";
        for (Song song:songs){
            if (song.getTitle().equals(titleToFind)){
                System.out.printf("I found %s \r\n",song.display());
            }
        }
    }
}