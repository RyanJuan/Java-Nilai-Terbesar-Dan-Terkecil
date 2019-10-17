/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pboulg.pkg10115557.latihan39.nilaiterbesardanterkecil;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Rayan
 * KELAS    : PBO-Ulg
 * NIM      : 10115557
 * Deskripsi Program : Membuat program Nilai Terbesar dan Terkecil berbasis object
 */
class Nilai {
   public int nilai[] = new int[20];
    public int max, min;

    public void inputNilai(int jmlhMahasiswa) {
        int i;
        Scanner scn = new Scanner(System.in);
        for (i = 1; i <= jmlhMahasiswa; i++) {
            System.out.print("Masukkan nilai Mahasiswa ke-" + i + " : ");
            nilai[i] = scn.nextInt();
        }
    }

    public void tampilNilai(int jmlhMahasiswa) {
        int i;
        System.out.println("===Hasil Nilai Mahasiswa===");
        for (i = 1; i <= jmlhMahasiswa; i++) {
            System.out.println("Nilai Mahasiswa ke-" + i + " = " + nilai[i]);
        }
    }
    public void tampilNilaiTerbesarTerkecil(int jmlhMahasiswa) {
        int i;

        min = nilai[1];
        max = nilai[1];

        for (i = 1; i <= jmlhMahasiswa; i++) {
            if (nilai[i] > max) {
                max = nilai[i];
            } else if (nilai[i] < min) {
                min = nilai[i];
            }
        }
    }
}