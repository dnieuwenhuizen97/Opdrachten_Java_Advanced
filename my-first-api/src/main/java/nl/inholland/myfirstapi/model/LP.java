package nl.inholland.myfirstapi.model;

public class LP extends Album {

    private int numberOfLPs;

    public LP(long id, String title, String artist, int price, int numberOfLPs) {
        super(id, title, artist, price);

        this.numberOfLPs = numberOfLPs;

    }

    public int getNumberOfLPs() {
        return numberOfLPs;
    }

    public void setNumberOfLPs(int numberOfLPs) {
        this.numberOfLPs = numberOfLPs;
    }

    @Override
    public java.lang.String toString() {
        final StringBuffer sb = new StringBuffer("Album{");
        sb.append("id=").append(id);
        sb.append(", title='").append(title).append('\'');
        sb.append(", artist='").append(artist).append('\'');
        sb.append(", price=").append(price);
        sb.append(", numberOfLPs=").append(numberOfLPs);
        sb.append('}');
        return sb.toString();
    }
}
