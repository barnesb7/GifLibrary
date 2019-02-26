package com.detroitlabs.giflibrary.data;

import com.detroitlabs.giflibrary.model.Category;
import com.detroitlabs.giflibrary.model.Gif;
import org.springframework.stereotype.Component;

import java.security.AllPermission;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class GifRepository {
    private static final List<Gif> ALL_GIFS = Arrays.asList(
            new Gif("toobad", LocalDate.of(2019, 2, 23), "Erika Languirand", true, 1),
            new Gif("exhausting", LocalDate.of(2019, 2, 23), "Jen Bloomer", false, 1),
            new Gif("headtilt", LocalDate.of(2019, 2, 23), "Dan Newport", true, 2),
            new Gif("corgibeg", LocalDate.of(2019, 2, 23), "Matt of Lansing", false, 2),
            new Gif("hugemistake", LocalDate.of(2019, 2, 23), "Erika Languirand", true, 3),
            new Gif("whatisaid", LocalDate.of(2019, 2, 23), "Dan Newport", true, 3)
    );

    public List<Gif> getAllGifs() {
        return ALL_GIFS;
    }

    public Gif findByName(String name){

        for(Gif gif:ALL_GIFS){
            if(gif.getName().equals(name)){
                return gif;
            }
        }

        return null;
    }

    public List<Gif> getAllGifsByCategory(Category category){

        List<Gif> allGifsInCategory = new ArrayList<>();

        for(Gif gif : ALL_GIFS){
            if(category.getId() == gif.getId()){
                allGifsInCategory.add(gif);
            }
        }
        return allGifsInCategory;
    }


    public List<Gif> getFavoriteGifs(){

        List<Gif> favoriteGifs = new ArrayList<>();

        for(Gif gif : ALL_GIFS){
            if(gif.isFavorite()){
                favoriteGifs.add(gif);
            }
        }
        return favoriteGifs;
    }

    public List<Gif> getGifsBySearch(String searchValue){

        List<Gif> searchResults = new ArrayList<>();

        for(Gif gif : ALL_GIFS){
            if(gif.getName().contains(searchValue)){
                searchResults.add(gif);
            }
        }

        return searchResults;
    }

}
