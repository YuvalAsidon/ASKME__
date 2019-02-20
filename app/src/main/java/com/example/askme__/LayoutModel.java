package com.example.askme__;


public class LayoutModel {

    private String category;
    private String where;
    private String question;
    private String answer;

    /*Setters and Getters*/

    public String getCategory() {
        return category;
    }


    public String getWhere() {
        return where;
    }


    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }


    public LayoutModel(String category,String where,String question, String answer) {
        this.category = category;
        this.where = where;
        this.question = question;
        this.answer = answer;
    }
}