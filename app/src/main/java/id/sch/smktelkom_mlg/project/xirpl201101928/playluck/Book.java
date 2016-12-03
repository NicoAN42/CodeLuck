package id.sch.smktelkom_mlg.project.xirpl201101928.playluck;

/**
 * Created by Aisyatush Shofiah on 03/12/2016.
 */

public class Book {
    private final int name;
    private final int author;
    private final int imageResource;
    private final String imageUrl;
    private boolean isFavorite;

    public Book(int name, int author, int imageResource, String imageUrl) {
        this.name = name;
        this.author = author;
        this.imageResource = imageResource;
        this.imageUrl = imageUrl;
    }

    public int getName() {
        return this.name;
    }

    public int getAuthor() {
        return this.author;
    }

    public int getImageResource() {
        return this.imageResource;
    }

    public boolean getIsFavorite() {
        return this.isFavorite;
    }

    public void setIsFavorite(boolean isFavorite) {
        this.isFavorite = isFavorite;
    }

    public void toggleFavorite() {
        this.isFavorite = !this.isFavorite;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }
}
