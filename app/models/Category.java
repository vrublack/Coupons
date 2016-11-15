package models;


import com.avaje.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Category extends Model
{
    @Id
    private String categoryId;

    private String name;

    private String description;


    public Category(String categoryId, String name, String description)
    {
        this.categoryId = categoryId;
        this.name = name;
        this.description = description;
    }
}
