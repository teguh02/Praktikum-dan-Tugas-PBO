package com.teguh.pertemuan3.Tugas.Soal1;

import java.util.ArrayList;
import java.util.List;

public class Komplek {
    private String idKomplek;
    private String namaKomplek;
    private int jmlRumah;
    private int idRumah;
    private List<Rumah> rumahList = new ArrayList<>();

    public Komplek(String idKomplek, String namaKomplek) {
        this.idKomplek = idKomplek;
        this.namaKomplek = namaKomplek;
    }

    public String getIdKomplek() {
        return idKomplek;
    }

    public void setIdKomplek(String idKomplek) {
        this.idKomplek = idKomplek;
    }

    public String getNamaKomplek() {
        return namaKomplek;
    }

    public void setNamaKomplek(String namaKomplek) {
        this.namaKomplek = namaKomplek;
    }

    public int getJmlRumah() {
        return jmlRumah;
    }

    public void setJmlRumah(int jmlRumah) {
        this.jmlRumah = jmlRumah;
    }

    public int getIdRumah() {
        return idRumah;
    }

    public void setIdRumah(int idRumah) {
        this.idRumah = idRumah;
    }

    public List<Rumah> getRumahList() {
        return rumahList;
    }

    public void setRumahList(List<Rumah> rumahList) {
        this.rumahList = rumahList;
    }

    public void addRumah(Rumah rumah){
        rumahList.add(rumah);
    }
    public void getDataKomplek(){
        System.out.println("Nama Komplek : "+namaKomplek);
        System.out.println("ID Komplek : "+idKomplek+"\n");
        System.out.println("===== Daftar Rumah =====\n");
        System.out.println("ID Komplek : "+idKomplek);
        for (Rumah rumah: rumahList) {
            System.out.println("Id Rumah : "+rumah.getIdRumah());
            System.out.println("Pemilik : "+rumah.getPemilikRumah());
            System.out.println("Jumlah Orang : "+rumah.getJumlahOrang());
            System.out.println();
        }
    }
}
