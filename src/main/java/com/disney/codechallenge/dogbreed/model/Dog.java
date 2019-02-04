package com.disney.codechallenge.dogbreed.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Arrays;

@Entity
@Table(name="DOG")
public class Dog implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="DOG_ID")
    public Long id;

    @Column(name="DOG_NAME", nullable = false)
    public String name;

    @Lob
    @Column(name="DOG_IMAGE", nullable = false, columnDefinition = "mediumblob")
    public byte[] image;

    @Column(name="DOG_BREED_ID", nullable = false)
    public String breedid;

    public Dog() {}

    public Dog(String name, byte[] image, String breedid) {
        this.name = name;
        this.image = image;
        this.breedid = breedid;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long _id) {
        this.id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getBreedid() {
        return breedid;
    }

    public void setBreedid(String breedid) {
        this.breedid = breedid;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", image=" + Arrays.toString(image) +
                ", breedid='" + breedid + '\'' +
                '}';
    }
}
