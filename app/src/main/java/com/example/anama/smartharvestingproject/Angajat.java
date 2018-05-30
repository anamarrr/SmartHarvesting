package com.example.anama.smartharvestingproject;

public class Angajat {
    String id;
    String nume;
    String prenume;
    String cnp;
    String varsta;
    String sex;
    String domiciliu;
    String contact;

    public Angajat()
    {

    }

    public Angajat(String id, String nume, String prenume, String cnp, String varsta, String sex, String domiciliu, String contact) {
        this.id = id;
        this.nume = nume;
        this.prenume = prenume;
        this.cnp = cnp;
        this.varsta = varsta;
        this.sex = sex;
        this.domiciliu = domiciliu;
        this.contact = contact;
    }

    public String getId() {
        return id;
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public String getCnp() {
        return cnp;
    }

    public String getVarsta() {
        return varsta;
    }

    public String getSex() {
        return sex;
    }

    public String getDomiciliu() {
        return domiciliu;
    }

    public String getContact() {
        return contact;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public void setVarsta(String varsta) {
        this.varsta = varsta;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setDomiciliu(String domiciliu) {
        this.domiciliu = domiciliu;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}
