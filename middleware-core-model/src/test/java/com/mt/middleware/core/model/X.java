package com.mt.middleware.core.model;

import com.mt.middleware.core.model.entity.Address;
import com.sun.nio.sctp.PeerAddressChangeNotification;
import org.junit.Test;

import java.io.*;

import static junit.framework.Assert.assertTrue;

/**
 * Created by max on 14/12/16.
 */
public class X {

    @Test
    public void x() throws Exception {

        final Address address = TestUtils.getAddress();

        File file = new File("test.txt");
        file.createNewFile();
        FileOutputStream fos = new FileOutputStream(file.getAbsolutePath());
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(address);


        FileInputStream fis = new FileInputStream(file.getAbsolutePath());
        ObjectInputStream ois = new ObjectInputStream(fis);
        final Address address1 = Address.class.cast(ois.readObject());


        System.out.printf(address.toString());
        System.out.printf(address1.toString());

        assertTrue(true);
    }
}
