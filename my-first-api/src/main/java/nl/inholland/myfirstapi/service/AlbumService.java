package nl.inholland.myfirstapi.service;

import nl.inholland.myfirstapi.model.Album;
import nl.inholland.myfirstapi.model.CD;
import nl.inholland.myfirstapi.model.LP;
import org.springframework.stereotype.Service;

import java.util.*;
import java.time.Duration;
import java.util.function.Function;
import java.util.function.Predicate;

@Service
public class AlbumService {

    private List<Album> albums;
    private int albumId;
    Scanner scanner = new Scanner(System.in);


    public AlbumService() {
        this.albumId = 0;

        this.albums =
                Arrays.asList(
                        new LP(getUniqueId(), "Appetite For Destruction", "Guns N' Roses", 30, 2),
                        new LP(getUniqueId(), "Black Holes And Revelations", "Muse", 31, 2),
                        new CD(getUniqueId(), "The Joshua Tree", "U2", 25, Duration.ofHours(0).plus(Duration.ofMinutes(50).plus(Duration.ofSeconds(9)))),
                        new CD(getUniqueId(), "Broken Machine", "Nothing But Thieves", 29, Duration.ofHours(0).plus(Duration.ofMinutes(57).plus(Duration.ofSeconds(19)))),
                        new LP(getUniqueId(), "Back In Black", "AC/DC", 24, 1),
                        new CD(getUniqueId(), "Nevermind", "Nirvana", 25, Duration.ofHours(0).plus(Duration.ofMinutes(49).plus(Duration.ofSeconds(15)))),
                        new CD(getUniqueId(), "Stadium Arcadium", "Red Hot Chili Peppers", 20, Duration.ofHours(2).plus(Duration.ofMinutes(31).plus(Duration.ofSeconds(0)))),
                        new LP(getUniqueId(), "A Night At The Opera", "Queen", 24, 1),
                        new LP(getUniqueId(), "Abbey Road", "The Beatles", 29, 1),
                        new LP(getUniqueId(), "Let It Bleed", "The Rolling Stones", 28, 1),
                        new LP(getUniqueId(), "There Is Nothing Left To Lose", "Foo Fighters", 25, 1),
                        new LP(getUniqueId(), "Cut", "Golden Earring", 20, 1),
                        new CD(getUniqueId(), "American Idiot", "Green Day", 26, Duration.ofHours(1).plus(Duration.ofMinutes(5))),
                        new LP(getUniqueId(), "My Generation", "The Who", 23, 1)
                );
    }

    private int getUniqueId() {
        return albumId += 1;
    }

    public List<Album> GetSortedAlbums() {
        Collections.sort(albums, Comparator.comparingInt(Album::getPrice));


        return albums;
    }

    public List<Album> GetAllAlbums() {
        return albums;
    }

    public List<Album> GetFilteredAlbums() {
        List<Album> filteredBy = new ArrayList<Album>();

        Predicate<Album> startsWithArtist = a -> a.getArtist().startsWith("G");
        Predicate<Album> startsWithTitle = a -> a.getTitle().startsWith("A");

        for (Album a : albums) {
            if (startsWithArtist.test(a) == true && startsWithTitle.test(a) == true)
                filteredBy.add(a);

        }
        return filteredBy;
    }

    private Duration getDurationFromString(String userInput) {
        return Duration.ofHours(Integer.parseInt(userInput.split(":")[0])).plus(Duration.ofMinutes(Integer.parseInt(userInput.split(":")[1])).plus(Duration.ofSeconds(Integer.parseInt(userInput.split(":")[2]))));
    }


}
