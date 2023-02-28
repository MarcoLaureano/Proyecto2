package com.example.proyecto2;

public class Persona {
    private int id;
    private String cognoms;
    private String email;
    private String nom;
    private int grup_id;
    private int rol_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCognoms() {
        return cognoms;
    }

    public void setCognoms(String cognoms) {
        this.cognoms = cognoms;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getGrup_id() {
        return grup_id;
    }

    public void setGrup_id(int grup_id) {
        this.grup_id = grup_id;
    }

    public int getRol_id() {
        return rol_id;
    }

    public void setRol_id(int rol_id) {
        this.rol_id = rol_id;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", cognoms='" + cognoms + '\'' +
                ", email='" + email + '\'' +
                ", nom='" + nom + '\'' +
                ", grup_id=" + grup_id +
                ", rol_id=" + rol_id +
                '}';
    }
}
