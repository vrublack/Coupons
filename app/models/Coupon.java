package models;


import com.avaje.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Coupon extends Model
{
    @Id
    private String couponId;

    private String name;

    private String description;

    private String promoCode;

    private float discountRate;

    private String expirationDate;

    private String businessId;


    public Coupon(String couponId, String name, String description, String promoCode, float discountRate, String expirationDate, String businessId)
    {
        this.couponId = couponId;
        this.name = name;
        this.description = description;
        this.promoCode = promoCode;
        this.discountRate = discountRate;
        this.expirationDate = expirationDate;
        this.businessId = businessId;
    }
}
