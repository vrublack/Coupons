package models;

/*
import com.avaje.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
*/

import java.util.*;
import javax.persistence.*;

import com.avaje.ebean.Model;
import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.*;

@Entity
public class Coupon extends Model
{
    @Id
    public Long id;

    public String name;

    public String description;

    public String promocode;

    public float discountRate;

    /**
     * Date serialized as string
     */
    public String expirationDate;

    /**
     * Email address of business
     */
    public String bemail;

    public static Find<Long,Coupon> find = new Find<Long,Coupon>(){};

    /**
     * Return a paged list of computer
     *
     * @param page Page to display
     * @param pageSize Number of computers per page
     * @param sortBy Computer property used for sorting
     * @param order Sort order (either or asc or desc)
     * @param filter Filter applied on the name column
     */
    public static PagedList<Coupon> page(int page, int pageSize, String sortBy, String order, String filter) {
        return
                find.where()
                        .ilike("name", "%" + filter + "%")
                        .orderBy(sortBy + " " + order)
                        //.fetch("company")
                        .findPagedList(page, pageSize);
    }


    public Coupon(Long id, String name, String description, String promoCode, float discountRate, String expirationDate, String businessId)
    {
        this.id = id;
        this.name = name;
        this.description = description;
        this.promocode = promoCode;
        this.discountRate = discountRate;
        this.expirationDate = expirationDate;
        this.bemail = businessId;
    }
}
