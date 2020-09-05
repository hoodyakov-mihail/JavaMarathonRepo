package day12;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        ArrayList<MusicArtist> metallica = new ArrayList<>();
        ArrayList<MusicArtist> linkinPark = new ArrayList<>();
        metallica.add(new MusicArtist("James Hetfield",55));
        metallica.add(new MusicArtist("Lars Ulrich", 58));
        linkinPark.add(new MusicArtist("Mike Shinoda", 42));
        linkinPark.add(new MusicArtist("Chester Benington", 44));

        List<MusicBandObjectArtist> musicBands = new ArrayList<>();

        MusicBandObjectArtist band1 = new MusicBandObjectArtist("Metallica", 1981, metallica);
        MusicBandObjectArtist band2 = new MusicBandObjectArtist("Likin Park", 1996, linkinPark);

        band1.mergeMusicArtists(band2);
        System.out.println("Группа 1");
        band1.showMusicArtists();
        System.out.println("Группа 2");
        band2.showMusicArtists();
    }
}
