package fr.ensim.tp2.tp5.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Adress {
    @Id
    @GeneratedValue
    private Long id;
    private Date creation;
    private String content;
    private String author;

    public Long getId() {
        return id;
    }

    public Date getCreation() {
        return creation;
    }

    public String getContent() {
        return content;
    }

    public String getAuthor() {
        return author;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCreation(Date creation) {
        this.creation = creation;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

