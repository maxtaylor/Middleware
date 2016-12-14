package com.mt.middleware.core.model.enums;

/**
 * Created by max on 14/12/16.
 */
public enum Sex {
    MALE("male", 1),
    FEMALE("female", 2);

    private String name;
    private int id;

    Sex(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static Sex getSexById(int id) {
        for (Sex sex : Sex.values()) {
            if (sex.getId() == id) {
                return sex;
            }
        }
        throw new IllegalArgumentException(String.format("No Sex by id [%d]", id));
    }
}