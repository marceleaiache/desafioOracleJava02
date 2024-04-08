package entities;

public class Music extends Audio {
    //DECLARAÇÃO DE ARGUMENTOS
    private String album;
    private String artist;
    private String genre;

    //MÉTODO CONSTRUTOR SEM ARGUMENTO
    public Music() {
    }

    //MÉTODO CONSTRUTOR COM ARGUMENTO
    public Music(String title, int totalPlays, int totalLikes, int classification, String album, String artist, String genre) {
        super(title, totalPlays, totalLikes, classification);
        this.album = album;
        this.artist = artist;
        this.genre = genre;
    }

    //MÉTODO GETTERS AND SETTERS
    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public int getClassification() {
        if (this.getTotalPlays() > 2000) {
            return 10;
        }
        else {
            return 8;
        }
    }
}
