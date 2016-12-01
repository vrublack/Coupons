package models;

import com.maxmind.geoip2.DatabaseReader;
import com.maxmind.geoip2.exception.GeoIp2Exception;
import com.maxmind.geoip2.model.CityResponse;
import com.maxmind.geoip2.record.*;

import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by Valentin on 11/30/16.
 */
public class IPLocation
{
    private final File database = new File("GeoLite2-City.mmdb");

    private final DatabaseReader reader = new DatabaseReader.Builder(database).build();


    public IPLocation() throws IOException
    {
    }

    /**
     * @param ipAddr ipv4 address in the format xxx.xxx.xxx.xxx
     * @return Location based on ip address in the format "city, country". Null if an error occurred or no mapping for this
     * ip address exists
     */
    public String getCityName(String ipAddr)
    {
        InetAddress ipAddress = null;
        try
        {
            ipAddress = InetAddress.getByName(ipAddr);

            // Replace "city" with the appropriate method for your database, e.g.,
            // "country".
            CityResponse response = reader.city(ipAddress);

            Country country = response.getCountry();
            /* System.out.println(country.getIsoCode());            // 'US'
            System.out.println(country.getName());               // 'United States'
            System.out.println(country.getNames().get("zh-CN")); // '美国'


            Subdivision subdivision = response.getMostSpecificSubdivision();
            System.out.println(subdivision.getName());    // 'Minnesota'
            System.out.println(subdivision.getIsoCode()); // 'MN'
            */
            City city = response.getCity();
            return city.getName() + ", " + country.getIsoCode();

        } catch (GeoIp2Exception | IOException e)
        {
            // e.printStackTrace();
        }

        return null;
    }
}
