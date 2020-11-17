package com.galery.art.model;

public interface IArt {
    public void setId(int id);
    public void setTYPE(String TYPE);
    public void setTitle(String title);
    public void setAuthor(String author);
    public int getId();
    public String getTitle();
    public String getAuthor();
    public String getType();

}
