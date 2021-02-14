package com.tts.TechTalentBlog.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// the entity is going to align to data in our database
// the entity class can be thought of as a table in a database
@Entity
public class BlogPost {

    //defining elements of the object model
    //specifies this field as the unique id in the database
    @Id
    //this tells the program to autogenerate a unique key
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String author;
    private String blogEntry;

    //constructor
    public BlogPost(String title, String author, String blogEntry) {
        this.title = title;
        this.author = author;
        this.blogEntry = blogEntry;
    }

    //default constructor's are needed to utilize the @Entity annotation
    public BlogPost() {

    }

    //getters and setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {

        return title;
    }

    public void setTitle(String title) {

        this.title = title;
    }

    public String getAuthor() {

        return author;
    }

    public void setAuthor(String author) {

        this.author = author;
    }

    public String getBlogEntry() {

        return blogEntry;
    }

    public void setBlogEntry(String blogEntry) {

        this.blogEntry = blogEntry;
    }

    //overriding the toString() method to allow us to control
    //how the object is displayed
    @Override
    public String toString() {
        return "BlogPost{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", blogEntry='" + blogEntry + '\'' +
                '}';

    }

}
// additionally, you should override .hashcode() and .equals()
//hashcode
//equals
