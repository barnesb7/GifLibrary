package com.detroitlabs.giflibrary.controller;

import com.detroitlabs.giflibrary.data.GifRepository;
import com.detroitlabs.giflibrary.model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class SearchDirectoryController {

@Autowired
private GifRepository gifRepository;

    @RequestMapping("/searchdirectory")
    public String displaySearchDirectory(ModelMap modelMap){

        List<Gif> getAllGifs = gifRepository.getAllGifs();
        modelMap.put("allGifs", getAllGifs);

        return "searchdirectory";
    }


    @RequestMapping("/gifsBySearch")
    public String getGifsBySearch(@RequestParam(name = "searchValue") String searchValue, ModelMap modelMap){

        List<Gif> searchResults = gifRepository.getGifsBySearch(searchValue);
        modelMap.put("allGifs", searchResults);
        return "searchdirectory";
    }
}
