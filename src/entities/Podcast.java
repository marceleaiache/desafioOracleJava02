package entities;

public class Podcast extends Audio {
    //DECLARAÇÃO DE ARGUMENTOS
    private String host;
    private String description;

    //MÉTODO CONSTRUTOR SEM ARGUMENTO
    public Podcast() {
    }

    //MÉTODO CONSTRUTOR COM ARGUMENTO
    public Podcast(String title, int totalPlays, int totalLikes, int classification, String host, String description) {
        super(title, totalPlays, totalLikes, classification);
        this.host = host;
        this.description = description;
    }

    //MÉTODO GETTERS AND SETTERS
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int getClassification() {
        if (this.getTotalLikes() > 500) {
            return 10;
        }
        else {
            return 8;
        }
    }
}
