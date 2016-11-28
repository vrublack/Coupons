package models;


import com.avaje.ebean.Model;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Favorite extends Model
{
    @Id
    private String key;

    private String cookie;

    private Integer couponid;


    public Favorite(String cookie, Integer couponId)
    {
        // a composite key should be used (using @EmbeddedId) but we'll use this for now as a dirty fix
        key = cookie + "_" + couponId;
        this.cookie = cookie;
        this.couponid = couponId;
    }
}
