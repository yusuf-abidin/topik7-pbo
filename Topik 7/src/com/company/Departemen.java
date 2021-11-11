package com.company;

import java.util.ArrayList;

public class Departemen {
    private String nama;
    private ArrayList<Karyawan> kar;

    public Departemen(String nama) {
        kar = new ArrayList<>();
        this.nama=nama;
    }

    public void addKaryawan(Karyawan k){
        kar.add(k);
    }

    public void displayAll(){
        System.out.println("\n-- Karyawan " + this.nama + " --");
        for (Karyawan k : kar){
            k.display();
        }
    }

    public void displayKontrak(){
        System.out.println("\n-- Karyawan Kontrak " + this.nama + " --");
        for (Karyawan k: kar){
            if (k instanceof Kontrak){
                k.display();
            }
        }
    }

    public void displayTetap(){
        System.out.println("\n-- Karyawan Tetap " + this.nama + " --");
        for (Karyawan k: kar){
            if (k instanceof Tetap){
                k.display();
            }
        }
    }

}
