package com.example.mock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class humanController {
    @Autowired
    humanService humanservice;


    @PostMapping("/human/add-human")
    public ResponseEntity<String> addDirector(@RequestBody()human human)
    {
        String result = humanservice.addHuman(human);
        return new ResponseEntity<>(result, HttpStatus.CREATED);
    }

    @GetMapping("/human/get-human")
    public ResponseEntity<String> findHuman(@RequestParam("id")Long id){
        String st=humanservice.getHuman(id);
        return new ResponseEntity<>(st,HttpStatus.OK);
    }
}
