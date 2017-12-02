package com.company;

import exceptions.InvalidValueException;

public class ZipCode {
    private String zipCode;


    public ZipCode() {
    }

    public ZipCode(String zipCode) throws InvalidValueException {
        this.zipCode = zipCode;
        if (!validateZipCode(zipCode)) {
            throw new InvalidValueException();
           // this.zipCode = "nevalidnaVrednostZaZipCode";
        }

    }

    public String getZipCode() {
        return zipCode;
    }

    public boolean validateZipCode(String zipCode) {
        boolean flag;

        if (this.getZipCode().length() == 5 || this.getZipCode().length() == 9) {
            flag = true;
        }
        else {
            flag = false;
        }

        return flag;
    }

    @Override
    public String toString() {
        return this.getZipCode();
    }
}
