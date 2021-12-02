package pl.camp.it.rent.model;

public class Tale {
    private String title;
    private String cast;
    private String tag;

    public Tale(String title, String cast, String tag) {
        this.title = title;
        this.cast = cast;
        this.tag = tag;
    }

    public Tale() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCast() {
        return cast;
    }

    public void setCast(String cast) {
        this.cast = cast;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
