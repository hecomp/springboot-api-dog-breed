package com.disney.codechallenge.dogbreed.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="BREED")
public class Breed implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="BREED_ID", nullable = false)
    public Long _id;

    @Column(name="BREED_NAME", nullable = false)
    public String name;

    public Breed() {}

    public Breed(Long id, String name) {
        this._id = id;
        this.name = name;
    }

    public Long get_id() {
        return _id;
    }

    public void set_id(Long _id) {
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Breed{" +
                "_id=" + _id +
                ", name='" + name + '\'' +
                '}';
    }
}
