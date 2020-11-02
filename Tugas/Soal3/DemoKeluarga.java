package com.teguh.pertemuan3.Tugas.Soal3;

import java.util.ArrayList;
import java.util.List;

public class DemoKeluarga {
    public static void main(String[] args) {
        // menambahkan objek keluarga
        Keluarga keluarga = new Keluarga("Keluarga Bahagia", "Konoha");

        // objek ayah dan ibu
        Ayah ayah = new Ayah(1, "Naruto", 70);
        Ibu ibu = new Ibu(2, "Hinata", 60);

        // menambahkan anakList agar dapat dimasukkan ke parameter add anggota keluarga
        List<Anak> anakList = new ArrayList<>();
        Anak anak = new Anak(3, "Boruto", 20, "Anak Kandung");
        Anak anak1 = new Anak(4, "Uzumaki Binomo", 18, "Anak Pungut");

        // menambahkan objek anak ke anakList
        anakList.add(anak);
        anakList.add(anak1);

        // menambahkan objek ayah,ibu dan anakList
        keluarga.addAnggotaKeluarga(ayah,ibu, anakList);
        // menampilkan data keluarga
        keluarga.getDataKeluarga();
    }
}
