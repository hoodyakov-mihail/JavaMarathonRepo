package day12;

import java.util.ArrayList;
import java.util.List;

public class MusicBandObjectArtist {
    private String name;
    private int year;
    private ArrayList<MusicArtist> musicArtists;

    public String getName() {
        return name;
    }
    public int getYear() {
        return year;
    }
    public List<MusicArtist> getMusicArtists() {
        return musicArtists;
    }
    public void setMusicArtists(MusicArtist musicArtists) {
        this.musicArtists.add(musicArtists);
    }

    public MusicBandObjectArtist(String name, int year, ArrayList<MusicArtist> musicArtist) {
        this.name = name;
        this.year = year;
        this.musicArtists = musicArtist;
    }

    public void mergeMusicArtists(MusicBandObjectArtist musicBandB){
        for (int i = 0; i < musicArtists.size(); i++) {
            musicBandB.setMusicArtists(musicArtists.get(i));
        }
        musicArtists.clear();
    }
    public void showMusicArtists() {
        for (MusicArtist mA:musicArtists) System.out.println(mA.getName() + " " + mA.getAge());
    }
}
