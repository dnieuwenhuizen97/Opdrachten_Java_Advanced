package nl.inholland.myfirstapi.controller;

import nl.inholland.myfirstapi.model.Album;
import nl.inholland.myfirstapi.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping(value = "/albums")
public class AlbumController {

    @Autowired
    private AlbumService service;

    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Album>> getAllAlbums() {
        return ResponseEntity.status(200).body(service.GetAllAlbums());
    }

}
