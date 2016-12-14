package com.mt.middleware.core.model.entity;

import com.mt.middleware.core.model.common.Transferable;
import com.mt.middleware.core.model.dto.AddressDTO;
import com.mt.middleware.core.model.dto.EmployeeDTO;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * Created by max on 14/12/16.
 */
@Entity
public class Employee implements Transferable<EmployeeDTO> {
    @Id
    private int id;

    public EmployeeDTO getDTO() {
        return null;
    }

    public void writeExternal(ObjectOutput objectOutput) throws IOException {

    }

    public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {

    }
}
