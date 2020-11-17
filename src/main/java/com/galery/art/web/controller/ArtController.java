package com.galery.art.web.controller;

import com.galery.art.dao.IArtDAO;
import com.galery.art.model.IArt;
import com.galery.art.model.Painting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ArtController {

    @Autowired
    private IArtDAO dao;

    @GetMapping(value = "/art")
    public List<IArt> getAll(){
        return dao.findAll();
    }

    @GetMapping(value="/art/{id}")
    public IArt getPainting(@PathVariable int id){
        return dao.findById(id);
    }

    @GetMapping("/art/get")
    public IArt artGet(@RequestParam int id) {
        return dao.findById(id);
    }

    @PostMapping(value= "/art/add")
    public void addPainting(@RequestBody Painting painting){
        dao.add(painting);
    }


}
