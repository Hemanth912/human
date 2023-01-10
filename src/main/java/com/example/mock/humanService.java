package com.example.mock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class humanService {

    @Autowired
    humanRepository humanrepository;


    String addHuman(human human)
    {
        String result = humanrepository.addHumanToDb(human);
        return result;
    }

    String getHuman(long id)
    {
        return humanrepository.getHumanFromDb(id);
    }
}

