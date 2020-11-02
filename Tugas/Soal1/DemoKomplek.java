package com.teguh.pertemuan3.Tugas.Soal1;

import java.util.ArrayList;
import java.util.List;

public class DemoKomplek {
    public static void main(String[] args) {
        Komplek komplek = new Komplek("234", "Geng Buntu");
        Rumah rumah = new Rumah("12B", "Naruto", 4);
        Rumah rumah1 = new Rumah("12A", "Boruto", 6);

        List<Rumah> rumahList = new ArrayList<>();
        rumahList.add(rumah);
        rumahList.add(rumah1);
        komplek.setRumahList(rumahList);
        komplek.getDataKomplek();

    }
}
