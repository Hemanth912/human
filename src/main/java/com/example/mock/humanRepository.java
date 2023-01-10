package com.example.mock;

import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository

public class humanRepository {

    HashMap<Long,human> humanDb = new HashMap<>();

    String addHumanToDb(human human)
    {
        long key = human.getAdhaarId();

        humanDb.put(key, human);

        return "Successfully Added";
    }

    String getHumanFromDb(long id)
    {
        human st= humanDb.get(id);
        return st.getName();
    }

}
