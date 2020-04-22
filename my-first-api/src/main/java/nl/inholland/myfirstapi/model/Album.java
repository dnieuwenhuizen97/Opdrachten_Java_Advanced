package nl.inholland.myfirstapi.model;

public abstract class Album {

    protected long id;
    protected String title;
    protected String artist;
    protected int price;

    public Album() {

    }

    public Album(long id, String title, String artist, int price) {
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public abstract String toString();
}
