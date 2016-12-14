package com.mt.middleware.core.model;

import com.mt.middleware.core.model.entity.Address;
import com.mt.middleware.core.model.enums.Country;

import java.util.Date;
import java.util.UUID;

/**
 * Created by max on 14/12/16.
 */
public class TestUtils {

    private static String randomString30(String seed) {
        final String result = String.format("%s@%s", seed, UUID.randomUUID().toString().replaceAll("-", ""));
        return result.substring(0, 30 - seed.length());
    }

    public static Address getAddress() {
        return new Address(
                (int) System.nanoTime(), randomString30("city"), randomString30("postcode"), Country.UK, new Date()
        );
    }

}
