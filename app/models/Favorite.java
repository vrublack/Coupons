package models;


import com.avaje.ebean.Model;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Favorite extends Model
{
    @EmbeddedId
    /**
     * Composite primary key
     */
    private FavoriteKey key;

    @Embeddable
    public class FavoriteKey {

        public String cookie;
        public Integer id;

        public FavoriteKey(String cookie, Integer id)
        {
            this.cookie = cookie;
            this.id = id;
        }
    }

    public Favorite(String cookie, Integer couponId)
    {
        key = new FavoriteKey(cookie, couponId);
    }
}
