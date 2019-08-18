package com.example.joohonga.choice.model;

import java.sql.Timestamp;
import java.util.List;

public class Question {
    List<User> users;
    List<Choice> choices;
    //Timestamp leftTime, endTime;
    String category;

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<Choice> getChoices() {
        return choices;

    }

    public void setChoices(List<Choice> choices) {
        this.choices = choices;
    }

/*    public int getLeftTime() {
        return leftTime;
    }

    public void setLeftTime(int leftTime) {
        this.leftTime = leftTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }
*/
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
