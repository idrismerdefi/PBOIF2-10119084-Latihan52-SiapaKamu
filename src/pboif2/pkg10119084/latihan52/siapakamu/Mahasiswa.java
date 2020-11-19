/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119084.latihan52.siapakamu;

/**
NAMA : MUHAMMAD IDRIS MERDEFI
KELAS : PBOIF2
NIM : 10119084
DESKRIPSI PROGAM : PROGRAM INI BERISI PROGRAM UNTUK SIAPA KAMU
 */
public class Mahasiswa extends Manusia{
    private String nim,kelas;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
    
 public void kelasApa(){
        System.out.print("Saya "+nama+" umur "+umur+" tahun sedang belajar di kelas "+kelas);
    }
    
    public void siapaKamu(){
        System.out.println("Saya Mahasiswa");
    }
}
