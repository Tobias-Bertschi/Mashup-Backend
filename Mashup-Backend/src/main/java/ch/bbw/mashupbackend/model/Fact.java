package ch.bbw.mashupbackend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Fact")
public class Fact {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String data;


    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}