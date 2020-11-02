package com.teguh.pertemuan3.Tugas.Soal2;

import java.util.ArrayList;
import java.util.List;

public class DemoPlanet {
    public static void main(String[] args) {
        SolarSystem solarSystem = new SolarSystem("A03B", "Matahari");

        Planet planet = new Planet(034, 2, "Venus");
        Planet planet1 = new Planet(265, 1, "Merkurius");

        List<Planet> planetList = new ArrayList<>();
        planetList.add(planet);
        planetList.add(planet1);
        solarSystem.setPlanetList(planetList);
        solarSystem.getData();
    }
}
