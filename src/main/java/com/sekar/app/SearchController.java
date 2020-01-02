package com.sekar.app;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController

public class SearchController {
    @RequestMapping("/search")
    public List<RecycleObject>  search() {
      return getData();
    }

    private static List<RecycleObject> getData() {
        List<RecycleObject> objectList = new ArrayList();
        objectList.add(new RecycleObject(0L, "Metal"));
        objectList.add(new RecycleObject(1L, "Plastic"));
        objectList.add(new RecycleObject(2L, "Paper"));
        objectList.add(new RecycleObject(3L, "Wood"));
        objectList.add(new RecycleObject(4L, "Food"));
        return objectList;
    }

}
