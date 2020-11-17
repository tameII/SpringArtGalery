package com.galery.art.model;

public class Painting{
    private int id;
    private String TYPE = "painting";
    private String title;
    private String author;

    /**
     * Build an empty painting
     */
    public Painting(){
        this.id = -1;
        this.title = "no painting name available";
        this.author = "no painting author name available";
    }

    /**
     * Build a painting with no fixed id
     * @param title
     * @param author
     */
    public Painting(String title, String author){
        this.id = -1;
        this.title = title;
        this.author = author;
    }

    /**
     * Build a painting with a fixed id
     * @param id
     * @param title
     * @param author
     */
    public Painting(int id, String title, String author){
        this.id = id;
        this.title = title;
        this.author = author;
    }


    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getType() {
        return TYPE;
    }
}
