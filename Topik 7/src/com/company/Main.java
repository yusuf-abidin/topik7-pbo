package com.company;

public class Main {

    public static void main(String[] args) {
	Departemen keuangan = new Departemen("Keuangan");

	Karyawan keuangan1 = new Tetap("Yusuf Abidin", 2000000, 3400000);
	Karyawan keuangan2 = new Tetap("Raditya Dika", 1900000, 3200000);

	Karyawan keuangan3 = new Kontrak("Suratno", 2, 2700000);
	Karyawan keuangan4 = new Kontrak("Sukamti", 3, 2900000);

	keuangan.addKaryawan(keuangan1);
	keuangan.addKaryawan(keuangan2);
	keuangan.addKaryawan(keuangan3);
	keuangan.addKaryawan(keuangan4);

	keuangan.displayAll();
	keuangan.displayKontrak();
	keuangan.displayTetap();


    }
}
