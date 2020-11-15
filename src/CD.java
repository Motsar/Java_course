public class CD implements ToBeStored{
    private String artist;
    private String album;
    private int publishingYear;
    private double weight = 0.1;

    public CD(String artist, String album, int publishingYear){
        this.artist = artist;
        this.album = album;
        this.publishingYear = publishingYear;
    }

    @Override
    public double weight() {
        return this.weight;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.album + " (" + this.publishingYear+ ")";
    }
}
