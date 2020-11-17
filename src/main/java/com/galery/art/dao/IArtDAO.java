package com.galery.art.dao;

import com.galery.art.model.IArt;
import com.galery.art.model.Painting;

import java.util.List;

public interface IArtDAO {

    public List<Painting> findAll();
    public Painting findById(int id);
    public void add(Painting art);

}
