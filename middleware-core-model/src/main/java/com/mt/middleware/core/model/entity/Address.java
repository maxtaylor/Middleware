package com.mt.middleware.core.model.entity;

import com.mt.middleware.core.model.common.Transferable;
import com.mt.middleware.core.model.dto.AddressDTO;
import com.mt.middleware.core.model.enums.Country;

import javax.persistence.*;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Date;

/**
 * Created by max on 14/12/16.
 */
@Entity(name = "Address")
@Table(name = "address")
public class Address implements Transferable<AddressDTO> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "house_number")
    private int houseNumber;

    @Column(name = "city")
    private String city;

    @Column(name = "postcode")
    private String postcode;

    @Column(name = "country")
    private int country;

    @Temporal(TemporalType.DATE)
    @Column(name = "move_in_date")
    private Date moveInDate;

    public Address(){}

    public Address(int houseNumber, String city, String postcode, Country country, Date moveInDate) {
        this.houseNumber = houseNumber;
        this.city = city;
        this.postcode = postcode;
        this.country = country.getId();
        this.moveInDate = moveInDate;
    }

    public AddressDTO getDTO() {
        return new AddressDTO(id, houseNumber, city, postcode, Country.getCountryById(country), moveInDate);
    }

    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeInt(id);
        objectOutput.writeInt(houseNumber);
        objectOutput.writeUTF(city);
        objectOutput.writeUTF(postcode);
        objectOutput.writeInt(country);
        objectOutput.writeObject(moveInDate);
    }

    public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        this.id = objectInput.readInt();
        this.houseNumber = objectInput.readInt();
        this.city = objectInput.readUTF();
        this.postcode = objectInput.readUTF();
        this.country = objectInput.readInt();
        this.moveInDate = Date.class.cast(objectInput.readObject());
    }
}
