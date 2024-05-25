package org.example.gestionapp.model;

import jakarta.persistence.*;

@Entity
@Table(name="cargo")

public class Cargo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long cargoId;


    private String nombreCargo;

    private String area;

    private String jefeDeArea;

    public Cargo() {
    }

    public Cargo(long cargoId, String nombreCargo, String area, String jefeDeArea) {
        this.cargoId = cargoId;
        this.nombreCargo = nombreCargo;
        this.area = area;
        this.jefeDeArea = jefeDeArea;
    }

    public long getCargoId() {
        return cargoId;
    }


    public String getNombreCargo() {
        return nombreCargo;
    }

    public void setNombreCargo(String nombreCargo) {
        this.nombreCargo = nombreCargo;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getJefeDeArea() {
        return jefeDeArea;
    }

    public void setJefeDeArea(String jefeDeArea) {
        this.jefeDeArea = jefeDeArea;
    }
}
