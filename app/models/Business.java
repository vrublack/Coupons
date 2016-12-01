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

    /**
     * Hashed password (using PasswordHash class)
     */
    private String password;


    public Business(String email, String name, String passwordHash)
    {
        this.bemail = email;
        this.bname = name;
        this.password = passwordHash;
    }
}
