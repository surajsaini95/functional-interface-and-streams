package com.knoldus.day2.model;

import java.util.Optional;

public class Address {
    String primaryAddress;
    Optional<String> secondaryAddress;

    public Address(String primaryAddress, Optional<String> secondaryAddress) {
        this.primaryAddress = primaryAddress;
        this.secondaryAddress = secondaryAddress;
    }

    public String getPrimaryAddress() {
        return primaryAddress;
    }

    public Optional<String> getSecondaryAddress() {
        return secondaryAddress;
    }

    @Override
    public String toString() {
        String address = "primaryAddress= '" + getPrimaryAddress() + "'";
        if (getSecondaryAddress().isPresent())
            return address + " secondaryAddress= '" + getSecondaryAddress().orElse("") + ";";
        else
            return address;
    }
}
