import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {
        // Create a program that implements a playlist for songs
        // Create a Song class having Title and Duration for a song.
        // The program will have an Album class containing a list of songs.
        // The albums will be stored in an ArrayList
        // Songs from different albums can be added to the playlist and will appear in the list in the order
        // they are added.
        // Once the songs have been added to the playlist, create a menu of options to:-
        // Quit,Skip forward to the next song, skip backwards to a previous song.  Replay the current song.
        // List the songs in the playlist
        // A song must exist in an album before it can be added to the playlist (so you can only play songs that
        // you own).
        // Hint:  To replay a song, consider what happened when we went back and forth from a city before we
        // started tracking the direction we were going.
        // As an optional extra, provide an option to remove the current song from the playlist
        // (hint: listiterator.remove()

        Album album = new Album("Storm bringer","Deep purple");
        album.addSong("Storm bringer",3.34);
        album.addSong("Hold on",3.54);
        album.addSong("Lady double",2.45);
        album.addSong("High hell shooter",5.54);
        album.addSong("The gypsy",4.34);
        album.addSong("Solder of fortune",3.13);
        albums.add(album);

        album = new Album("For those about to rock","AC/DC");
        album.addSong("For those about to rock",3.24);
        album.addSong("Lets go",5.24);
        album.addSong("Rock star",5.54);
        album.addSong("Paradise",3.45);
        album.addSong("Burn",4.26);
        album.addSong("Slow Glow",3.32);
        album.addSong("We will rock you",4.54);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlaylist("Hold on",playList);
        albums.get(0).addToPlaylist("The gypsy",playList);
        albums.get(0).addToPlaylist("Paradise",playList);
        albums.get(0).addToPlaylist(3,playList);

        albums.get(1).addToPlaylist("Rock star",playList);
        albums.get(1).addToPlaylist("Burn",playList);
        albums.get(1).addToPlaylist(2,playList);

        play(playList);
    }

    private static void play(LinkedList<Song> playList) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<Song> iterator = playList.listIterator();
        if (playList.size() == 0) {
            System.out.println("Empty playlist");
        }
        else {
            System.out.println("Now playing " + iterator.next().toString());
            printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Exit Playlist.");
                    quit = true;
                    break;

                case 1:  // going to next song
                    if (!goingForward) {
                        if (iterator.hasNext()) {
                            iterator.next();
                        }
                        goingForward = true;
                    }
                    if (iterator.hasNext()) {
                        System.out.println("Now Playing " + iterator.next().toString());
                    } else {
                        System.out.println("We have reached the end of the playList");
                        goingForward = false;
                    }
                    break;

                case 2:  // going to previous song
                    if (goingForward) {
                        if (iterator.hasPrevious()) {
                            iterator.previous();
                        }
                        goingForward = false;
                    }
                    if (iterator.hasPrevious()) {
                        System.out.println("Now Playing "+iterator.previous().toString());
                    } else {
                        System.out.println("We are at the start of the playList");
                        goingForward = true;
                    }
                    break;

                case 3:
                    if (goingForward) {
                        if (iterator.hasPrevious()) {
                            System.out.println("Repeat: Now Playing " + iterator.previous().toString());
                            goingForward = false;
                        } else {
                            System.out.println("We are at the start of the play list");
                        }
                    } else {
                        if (iterator.hasNext()) {
                            System.out.println("Repeat: Now Playing " + iterator.next().toString());
                            goingForward = true;
                        } else {
                            System.out.println("We are at the end of the list");
                        }
                    }
                    break;

                case 4:
                    printList(playList);
                    break;

                case 5:
                    printMenu();
                    break;

                case 6:
                    if (playList.size() > 0) {
                        iterator.remove();
                        if (iterator.hasNext()) {
                            System.out.println("Now playing "+iterator.next());
                        } else if (iterator.hasPrevious()) {
                            System.out.println("Now playing "+iterator.previous());
                        }
                    }
                    break;
            }

        }
    }

    private static void printMenu() {
        System.out.println("Available options are.\n");
        System.out.println("0 - to quit" +
                            "1 - to go to next song\n" +
                            "2 - to go to previous song\n" +
                            "3 - to replay the current song\n" +
                            "4 - list songs in the play list\n" +
                            "5 - print available actions\n" +
                            "6 - delete current song from play list");
    }

    private static void printList(LinkedList<Song> playList) {
        System.out.println("#########################");
        for (Song song : playList) {
            System.out.println(song);
        }
        System.out.println("#########################");
    }








}
