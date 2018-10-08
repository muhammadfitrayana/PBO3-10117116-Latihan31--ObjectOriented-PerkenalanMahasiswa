/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117116.latihan31.object_oriented.perkenalanmahasiswa;

/**
 *
 * @author Muhammad Fitrayana
 */
public class PBO310117116Latihan31Object_OrientedPerkenalanMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     Mahasiswa mhs1 = new Mahasiswa();
     mhs1.nim = "10117116";
     mhs1.nama = "Muhammad Fitrayana";
     mhs1.perkenalanDiri(mhs1.nim, mhs1.nama);
     
     Mahasiswa mhs2 = new Mahasiswa();
     mhs2.nim = "10117119";
     mhs2.nama = "Arditya Yoga Putra";
     mhs2.perkenalanDiri(mhs2.nim, mhs2.nama);     
        
     Mahasiswa mhs3 = new Mahasiswa();
     mhs3.nim = "10117115";
     mhs3.nama = "Deriano Nursyahban";
     mhs3.perkenalanDiri(mhs3.nim, mhs3.nama);
         
    }
    
}
