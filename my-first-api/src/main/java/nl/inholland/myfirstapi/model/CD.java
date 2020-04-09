package nl.inholland.myfirstapi.model;

import java.time.LocalTime;

public class CD extends Album {

    private LocalTime playTime;

    public CD(long id, String title, String artist, double price, LocalTime playTime) {
        super(id, title, artist, price);

        this.playTime = playTime;

    }

    public LocalTime getPlayTime() {
        return playTime;
    }

    public void setPlayTime(LocalTime playTime) {
        this.playTime = playTime;
    }

    @Override
    public java.lang.String toString() {
        final StringBuffer sb = new StringBuffer("Album{");
        sb.append("id=").append(id);
        sb.append(", title='").append(title).append('\'');
        sb.append(", artist='").append(artist).append('\'');
        sb.append(", price=").append(price);
        sb.append(", playTime=").append(playTime);
        sb.append('}');
        return sb.toString();
    }

}
