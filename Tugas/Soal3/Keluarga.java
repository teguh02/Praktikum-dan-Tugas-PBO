package com.teguh.pertemuan3.Tugas.Soal3;

import java.util.ArrayList;
import java.util.List;

public class Keluarga {
    private List<Anak> anakList = new ArrayList<>();
    private String namaKeluarga;
    private String kotaAsal;
    private Ayah ayah;
    private Ibu ibu;

    public Keluarga(String namaKeluarga, String kotaAsal) {
        this.namaKeluarga = namaKeluarga;
        this.kotaAsal = kotaAsal;
    }

    public String getNamaKeluarga() {
        return namaKeluarga;
    }

    public String getKotaAsal() {
        return kotaAsal;
    }

    public void addAnggotaKeluarga(Ayah ayah, Ibu ibu, List<Anak> anakList){
        this.ayah = ayah;
        this.ibu = ibu;
        this.anakList = anakList;
    }

    public List<Anak> getAnakList() {
        return anakList;
    }

    public Ayah getAyah() {
        return ayah;
    }

    public Ibu getIbu() {
        return ibu;
    }

    public void getDataKeluarga(){
        System.out.println("Ayah : "+ayah.getNamaAyah());
        System.out.println("Umur : "+ayah.getUmurAyah());
        System.out.println("Id   : "+ayah.getIdAyah());
        System.out.println("============================");
        System.out.println("Ibu  : "+ibu.getNamaIbu());
        System.out.println("Umur : "+ibu.getUmurIbu());
        System.out.println("Id   : "+ibu.getIdIbu());
        System.out.println("============================");
        for (Anak anak: anakList) {
            System.out.println("Nama Anak : "+anak.getNamaAnak());
            System.out.println("Umur Anak : "+anak.getUmurAnak());
            System.out.println("Status Anak : "+anak.getStatusAnak());
            System.out.println("Id Anak : "+anak.getIdAnak());
            System.out.println();
        }
    }
}
