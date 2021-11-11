package com.company;

public class Karyawan {
    protected String nama;
    protected double gaDas;

    public Karyawan(String nama, double gaDas){
        this.nama=nama;
        this.gaDas=gaDas;
    }

    public void display(){
        System.out.println("\nNama : " + this.nama);
        System.out.printf("Gaji Dasar : %.2f\n" , this.gaDas);
    }

}

