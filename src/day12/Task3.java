package day12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        MusicBand band1 = new MusicBand("Metallica", 1981);
        MusicBand band2 = new MusicBand("Deep Purple", 1968);
        MusicBand band3 = new MusicBand("Black Sabbath", 1970);
        MusicBand band5 = new MusicBand("Sabaton", 1999);
        MusicBand band6 = new MusicBand("Slipknot", 1995);
        MusicBand band4 = new MusicBand("Babymetal", 2010);
        MusicBand band7 = new MusicBand("Barones", 2003);
        MusicBand band8 = new MusicBand("Likin Park", 1996);
        MusicBand band9 = new MusicBand("Eskimo Callboy", 2010);
        MusicBand band10 = new MusicBand("Fame on Fire", 2014);

        List<MusicBand> musicBands = new ArrayList<>();
        musicBands.add(band1);
        musicBands.add(band2);
        musicBands.add(band3);
        musicBands.add(band4);
        musicBands.add(band5);
        musicBands.add(band6);
        musicBands.add(band7);
        musicBands.add(band8);
        musicBands.add(band9);
        musicBands.add(band10);

        Collections.shuffle(musicBands);
        for (MusicBand mb:musicBands) System.out.println(mb.getName() + " " + mb.getYear());

        List<MusicBand> after2000 = new ArrayList<>();
        for (int i = 0; i < musicBands.size() ; i++) {
            if(musicBands.get(i).getYear() > 2000) after2000.add(musicBands.get(i));
        }

        System.out.println("После 2000:");
        for (MusicBand mb:after2000) System.out.println(mb.getName() + " " + mb.getYear());;
    }
}
