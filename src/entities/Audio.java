package entities;

public class Audio {
    //DECLARAÇÃO DOS ARGUMENTOS
    private String title;
    private int totalPlays;
    private int totalLikes;
    private int classification;

    //MÉTODO CONSTRUTOR SEM ARGUMENTO
    public Audio() {
    }

    //MÉTODO CONSTRUTOR COM ARGUMENTOS
    public Audio(String title, int totalPlays, int totalLikes, int classification) {
        this.title = title;
        this.totalPlays = totalPlays;
        this.totalLikes = totalLikes;
        this.classification = classification;
    }

    //MÉTODO GETTERS AND SETTERS
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTotalPlays() {
        return totalPlays;
    }

    public int getTotalLikes() {
        return totalLikes;
    }

    public int getClassification() {
        return classification;
    }


    //MÉTODO~FUNÇÃO
    public void like() {
        this.totalLikes++;
    }

    //MÉTODO~FUNÇÃO
    public void play() {
        this.totalPlays++;
    }
}
