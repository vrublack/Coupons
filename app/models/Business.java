package models;


import com.avaje.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Business extends Model
{
    @Id
    private String bemail;

    private String bname;

    private String bdescription;

    private Integer catid;

    /**
     * Hashed password (using PasswordHash class)
     */
    private String password;


    public Business(String businessId, String name, String description, Integer categoryId, String passwordHash)
    {
        this.bemail = businessId;
        this.bname = name;
        this.bdescription = description;
        this.catid = categoryId;
        this.password = passwordHash;
    }
}
