package com.mt.middleware.core.model.dto;

import com.google.common.base.Objects;
import com.mt.middleware.core.model.common.MiddlewareDTO;
import com.mt.middleware.core.model.enums.Country;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

/**
 * Created by max on 14/12/16.
 */
public final class AddressDTO implements MiddlewareDTO {

    private final int id;

    private final int houseNumber;

    private final String city;

    private final String postcode;

    private final Country country;

    private final Date moveInDate;

    public AddressDTO(int id, int houseNumber, String city, String postcode, Country country, Date moveInDate) {
        this.id = id;
        this.houseNumber = houseNumber;
        this.city = city;
        this.postcode = postcode;
        this.country = country;
        this.moveInDate = moveInDate;
    }

    public int getId() {
        return id;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public String getCity() {
        return city;
    }

    public String getPostcode() {
        return postcode;
    }

    public Country getCountry() {
        return country;
    }

    public Date getMoveInDate() {
        return moveInDate;
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this)
                .add("id", id)
                .add("houseNumber", houseNumber)
                .add("city", city)
                .add("postcode", postcode)
                .add("country", country.getName())
                .add("moveInDate", moveInDate)
                .toString();
    }
}
