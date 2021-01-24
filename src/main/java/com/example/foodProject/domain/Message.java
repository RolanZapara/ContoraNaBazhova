package com.example.foodProject.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity //this annotation give Spring understanding that this is not program code, this is Entity (сущность)
public class Message {
    @Id //we need id to understand two same objects in table
    @GeneratedValue(strategy = GenerationType.AUTO) //annotation for framework and annotation - в каком виде и в каком порядке генерятся индентификаторы
    private Integer id;

    private String text;
    private String tag; //with private fields we have to generate getters and setters (ALT + INS)

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
