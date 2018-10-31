package com.example.dell.country;

// this is our modle class
public class FlagModle {

    private String Title;
    private int Images ;

    public FlagModle() {
    }

    public FlagModle(String title, int img_flags) {
        Title = title;
        Images = img_flags;
    }


    public String getTitle() {
        return Title;
    }


    public int getImages() {
        return Images;
    }

    public void setTitle(String title) {
        Title = title;
    }
    public void setImages(int img_flags)
    {
    Images = img_flags;
    }

}
