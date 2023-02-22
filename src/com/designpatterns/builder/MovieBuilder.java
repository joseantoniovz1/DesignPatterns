package com.designpatterns.builder;

public class MovieBuilder implements PresentationBuilder{

    private MovieDocument movieDocument = new MovieDocument();

    @Override
    public void addSlide(Slide slide) {
        movieDocument.addFrame(slide.getText(), 3);
    }

    public MovieDocument getMovie(){
        return movieDocument;
    }

}
