package com.example.project48;

public class data {
    private String Name;
    private String LastName;
    private String Email;

    public data(String dataname, String datalast, String dataemail) {
        this.Name = dataname;
        this.LastName = datalast;
        this.Email = dataemail;
    }

    public String getDataname() {
        return Name;
    }

    public String getDatalast() {
        return LastName;
    }

    public String getDataemail() {
        return Email;
    }
}
