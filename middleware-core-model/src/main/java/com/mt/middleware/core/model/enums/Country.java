package com.mt.middleware.core.model.enums;

/**
 * Created by max on 14/12/16.
 */
public enum Country {

    UK("uk", 1),
    GERMANY("germany", 2);

    private String name;
    private int id;

    Country(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static Country getCountryById(int id) {
        for (Country country : Country.values()) {
            if (country.getId() == id) {
                return country;
            }
        }
        throw new IllegalArgumentException(String.format("No Country by id [%d]", id));
    }
}
