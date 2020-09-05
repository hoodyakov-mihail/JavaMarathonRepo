package day12;

import day12.MusicBand;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<MusicBand> musicBands = new ArrayList<>();

        MusicBand band1 = new MusicBand("Metallica", 1981);
        MusicBand band2 = new MusicBand("Likin Park", 1996);

        band1.setParticipant("James Hetfield");
        band1.setParticipant("Lars Ulrich");
        band2.setParticipant("Mike Shinoda");
        band2.setParticipant("Chester Benington");

        band1.mergeParticipants(band2);
        System.out.println("Группа 1:");
        band1.showParticipants();
        System.out.println("Группа 2:");
        band2.showParticipants();
    }
}
