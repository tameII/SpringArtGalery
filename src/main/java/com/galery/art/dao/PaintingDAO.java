package com.galery.art.dao;

import com.galery.art.model.IArt;
import com.galery.art.model.Painting;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PaintingDAO implements IArtDAO{
    private ArrayList<Painting> painting;

    public PaintingDAO(){
        painting = new ArrayList<>();
        this.painting.add(new Painting(0,"Sunflower", "Van Gogh"));
        this.painting.add(new Painting(1, "Wheatfield with Crows", "Van Gogh"));
        this.painting.add(new Painting(2, "The Empire of Light", "Magritte"));
    }

    @Override
    public List<Painting> findAll() {
        return this.painting;
    }

    @Override
    public Painting findById(int id) {
        return this.painting.get(id);
    }

    @Override
    public void add(Painting art) {
        this.painting.add(art);
    }
}
