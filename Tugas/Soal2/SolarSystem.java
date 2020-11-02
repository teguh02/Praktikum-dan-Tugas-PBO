package com.teguh.pertemuan3.Tugas.Soal2;

import java.util.ArrayList;
import java.util.List;

public class SolarSystem {
    private String id;
    private String nama;
    private List<Planet> planetList = new ArrayList<>();

    public SolarSystem(String id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    public void getTotalMember(){
        System.out.println(planetList.size());
    }

    public List<Planet> getPlanetList() {
        return planetList;
    }

    public void setPlanetList(List<Planet> planetList) {
        this.planetList = planetList;
    }

    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public void addPlanet(Planet planet){
        planetList.add(planet);
    }

    public void getData(){
        System.out.println("ID\t: "+id);
        System.out.println("Nama : "+nama);
        System.out.print("Total Member : ");
        getTotalMember();
        System.out.println();
        System.out.println("===== DAFTAR PLANET =====");
        for (Planet planet: planetList) {
            System.out.println("Id Planet : "+planet.getIdPlanet());
            System.out.println("Urutan Planet : "+planet.getUrutanPlanet());
            System.out.println("Nama Planet : "+planet.getNamaPlanet());
            System.out.println();
        }
    }
}
