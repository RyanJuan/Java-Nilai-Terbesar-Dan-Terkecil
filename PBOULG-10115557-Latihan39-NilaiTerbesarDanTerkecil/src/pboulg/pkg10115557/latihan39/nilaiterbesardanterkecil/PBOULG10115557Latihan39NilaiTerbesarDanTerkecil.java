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
public class PBOULG10115557Latihan39NilaiTerbesarDanTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    String namaPetugas;
        int jmlhMahasiswa;

        Nilai result = new Nilai();
        Scanner scn = new Scanner(System.in);

        System.out.println("===Program nilai terbesar dan nilai terkceil===");
        System.out.print("Masukkan Nama Petugas : ");
        namaPetugas = scn.nextLine();
        System.out.print("Masukkan Banyaknya Mahasiswa :  ");
        jmlhMahasiswa = scn.nextInt();
        System.out.println();

        result.inputNilai(jmlhMahasiswa);
        System.out.println();
        result.tampilNilaiTerbesarTerkecil(jmlhMahasiswa);

        System.out.println("Nilai Terbesar : " + result.max);
        System.out.println("Nilai Terkecil : " + result.min);
        System.out.println();
        System.out.println("Nama Petugas : " + namaPetugas);
    }
}
