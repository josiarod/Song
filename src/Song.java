public class Song {
    private String artist;
    private String title;

    public Song(){

    }

    public String getArtist() {
        return artist;
    }

    public String display(){
      return this.getArtist() + " " + this.getTitle();
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
