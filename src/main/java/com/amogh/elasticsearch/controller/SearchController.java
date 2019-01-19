package com.amogh.elasticsearch.controller;

import com.amogh.elasticsearch.model.SearchResult;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SearchController {

    @GetMapping("/search")
    public String search(@RequestParam("searchString") String searchString, Model model){
        List<SearchResult> results = new ArrayList<>();

        //TODO use @searchString to search using elastic search engine
        System.out.println("Searching for keyword - "+searchString+ " ...");

        // assuming below as the result of elastic search
        results.add(new SearchResult("Matched#1", "Additional props for Matched#1"));
        results.add(new SearchResult("Matched#2", "Additional props for Matched#2"));
        model.addAttribute("searchString", searchString);
        model.addAttribute("results", results);
        return "results";
    }

}
