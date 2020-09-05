package day12;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private ArrayList<String> participant;

    public String getName() {
        return name;
    }
    public int getYear() {
        return year;
    }
    public List<String> getParticipant() {
        return participant;
    }
    public void setParticipant(String participant) {
        this.participant.add(participant);
    }

    public MusicBand(String name, int year) {
        this.name = name;
        this.year = year;
        this.participant = new ArrayList<>();
    }

    public void mergeParticipants(MusicBand musicBandB){
        for (int i = 0; i < participant.size(); i++) {
            musicBandB.setParticipant(participant.get(i));
        }
        participant.clear();
    }
    public void showParticipants() {
        for (String p:participant) System.out.println(p);
    }
}
