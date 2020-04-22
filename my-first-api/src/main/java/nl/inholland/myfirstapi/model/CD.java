package nl.inholland.myfirstapi.model;

import java.sql.SQLOutput;
import java.time.LocalTime;
import java.time.Duration;

public class CD extends Album {

    private Duration playTime;

    public CD(long id, String title, String artist, int price, Duration playTime) {
        super(id, title, artist, price);

        this.playTime = playTime;

    }

    public Duration getPlayTime() {
        return playTime;
    }

    public void setPlayTime(Duration playTime) {
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
