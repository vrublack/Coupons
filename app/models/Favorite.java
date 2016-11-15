package models;


import com.avaje.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Favorite extends Model
{
    @Id
    private String favoriteId;

    private String cookie;

    private String couponId;


    public Favorite(String favoriteId, String cookie, String couponId)
    {
        this.favoriteId = favoriteId;
        this.cookie = cookie;
        this.couponId = couponId;
    }
}
