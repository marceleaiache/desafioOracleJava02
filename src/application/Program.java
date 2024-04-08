package application;

import entities.Music;
import entities.MyFav;
import entities.Podcast;

public class Program {
    public static void main(String[] args) {

        Music myMusic = new Music();
        myMusic.setTitle("Forever");
        myMusic.setArtist("Kiss");

        for (int i=0; i<1000; i++) {
            myMusic.play();
        }

        for (int i = 0; i<50; i++) {
            myMusic.like();
        }

        Podcast myPodcast = new Podcast();
        myPodcast.setTitle("BolhaDev");
        myPodcast.setHost("Marcus Mendes");

        for (int i=0; i<5000; i++) {
            myPodcast.play();
        }

        for (int i=0; i<1000; i++) {
            myPodcast.like();
        }

        MyFav myFav = new MyFav();
        myFav.add(myPodcast);
        myFav.add(myMusic);
    }
}
