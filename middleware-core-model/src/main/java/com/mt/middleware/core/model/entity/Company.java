package com.mt.middleware.core.model.entity;

import com.mt.middleware.core.model.common.Transferable;
import com.mt.middleware.core.model.dto.CompanyDTO;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * Created by max on 14/12/16.
 */
@Entity
public class Company implements Transferable<CompanyDTO> {
    @Id
    private int id;

    @JoinColumn(name = "")
    private Address address;


    public Company() {
    }

    public Company(Address address) {
    }

    public CompanyDTO getDTO() {
        return null;
    }

    public void writeExternal(ObjectOutput objectOutput) throws IOException {

    }

    public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {

    }
}
