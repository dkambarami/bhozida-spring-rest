package com.bhozida.model;
import javax.persistence.*;

@Entity
@Table(name = "image")
public class Image {
    @Id
    @Column(name = "id")
    private Long id;

    @OneToOne()
    private Profile profile;

    @Column(name = "name")
    private String name;

    @Column(name = "type")
    private String type;

    @Lob
    @Column(name = "pic")
    private byte[] pic;


    public Image(String name, String type, byte[] pic) {
        this.name = name;
        this.type = type;
        this.pic = pic;
    }

    public Image(Long id, String type, byte[] pic) {
        this.id = id;
        this.type = type;
        this.pic = pic;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public byte[] getPic() {
        return pic;
    }

    public void setPic(byte[] pic) {
        this.pic = pic;
    }

    @Override
    public String toString() {
        return "Image [id=" + id + ", name=" + name + ", type=" + type + "]";
    }

    public Image() {
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public Image(Long id, Profile profile) {
        this.id = id;
        this.profile = profile;
    }

    public Image() {
    }

    

    

    
    

    
}