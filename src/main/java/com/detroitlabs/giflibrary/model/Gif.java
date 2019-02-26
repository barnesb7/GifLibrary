package com.detroitlabs.giflibrary.model;

import java.time.LocalDate;

public class Gif {
    private String name;
    private LocalDate dateUploaded;
    private String username;
    private boolean favorite;
    private String avatarURL;
    private int id;

    public Gif(String name, LocalDate dateUploaded, String username, boolean favorite, int id) {
        this.name = name;
        this.dateUploaded = dateUploaded;
        this.username = username;
        this.favorite = favorite;
        this.avatarURL = getLowerCaseURL();
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateUploaded() {
        return dateUploaded;
    }

    public void setDateUploaded(LocalDate dateUploaded) {
        this.dateUploaded = dateUploaded;
    }

    public String getUsername() {
        return username;
    }

    public String getLowerCaseURL(){
        String lowerCaseUserName = this.username.toLowerCase();
        String noSpaceUserName = lowerCaseUserName.replaceAll("\\s", "");
        String url = "/images/" + noSpaceUserName + ".jpg";
        return url;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public String getAvatarURL() {
        return avatarURL;
    }

    public void setAvatarURL(String avatarURL) {
        this.avatarURL = avatarURL;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

