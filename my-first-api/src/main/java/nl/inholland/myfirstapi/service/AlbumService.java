package nl.inholland.myfirstapi.service;

import nl.inholland.myfirstapi.model.Album;
import nl.inholland.myfirstapi.model.CD;
import nl.inholland.myfirstapi.model.LP;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.time.LocalTime;

@Service
public class AlbumService {

    List<Album> albums;

    public AlbumService() {
        this.albums =
                Arrays.asList(
                        new LP(1, "Appetite For Destruction", "Guns N' Roses", 30.00, 2),
                        new LP(2, "Black Holes And Revelations", "Muse", 31.99, 2),
                        new CD(3, "The Joshua Tree", "U2", 25.00, LocalTime.of(0, 50, 9)),
                        new CD(4, "Broken Machine", "Nothing But Thieves", 29.99, LocalTime.of(0, 57, 19)),
                        new LP(5, "Back In Black", "AC/DC", 24.99, 1),
                        new CD(6, "Nevermind", "Nirvana", 25.95, LocalTime.of(0, 49, 15)),
                        new CD(7, "Stadium Arcadium", "Red Hot Chili Peppers", 20.00, LocalTime.of(2, 31, 0)),
                        new LP(8, "A Night At The Opera", "Queen", 24.99, 1),
                        new LP(9, "Abbey Road", "The Beatles", 29.99, 1),
                        new LP(10, "Let It Bleed", "The Rolling Stones", 28.99, 1)
                );
    }

    public List<Album> GetAllAlbums() {
        return albums;
    }

}
