package models;


import com.avaje.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Category extends Model
{
    @Id
    private Integer catid;

    private String cname;

    private String cdescription;


    public Category(Integer categoryId, String name, String description)
    {
        this.catid = categoryId;
        this.cname = name;
        this.cdescription = description;
    }
}
