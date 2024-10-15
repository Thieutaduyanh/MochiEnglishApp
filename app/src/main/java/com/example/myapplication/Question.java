package com.example.myapplication;

import java.util.List;

public class Question {
    private int number;
    private String image;
    private List<Answer> listAnswer;

    public Question(int number, String image, List<Answer> listAnswer) {
        this.number = number;
        this.image = image;
        this.listAnswer = listAnswer;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<Answer> getListAnswer() {
        return listAnswer;
    }

    public void setListAnswer(List<Answer> listAnswer) {
        this.listAnswer = listAnswer;
    }
}
