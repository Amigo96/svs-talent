package com.company;

public class ZipCode {
    private String zipCode;


    public ZipCode() {
    }

    public ZipCode(String zipCode) {
        this.zipCode = zipCode;
        if (!validateZipCode(zipCode)) {
            this.zipCode = "nevalidnaVrednostZaZipCode";
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
