package models;


import com.avaje.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Business extends Model
{
    @Id
    private String businessId;

    private String name;

    private String description;

    private String categoryId;

    @Lob
    private byte[] image;

    private String passwordHash;


    public Business(String businessId, String name, String description, String categoryId, byte[] image, String passwordHash)
    {
        this.businessId = businessId;
        this.name = name;
        this.description = description;
        this.categoryId = categoryId;
        this.image = image;
        this.passwordHash = passwordHash;
    }
}
