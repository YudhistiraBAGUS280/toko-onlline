/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package online_toko;

import java.util.ArrayList;
public class Barang {

    private ArrayList<String> namaBarang = new ArrayList<String>();
    private ArrayList<Integer> stok = new ArrayList<Integer>();
    private ArrayList<Integer> harga = new ArrayList<Integer>();

    public Barang() {
        this.namaBarang.add("Mercedes-Benz OH 1626");
        this.stok.add(4);
        this.harga.add(10000000);
        this.namaBarang.add("Mercedes-Benz OF 1623");
        this.stok.add(16);
        this.harga.add(90000);
        this.namaBarang.add("Mercedes-Benz O500RS 1836");
        this.stok.add(3);
        this.harga.add(17000000);
    }

    public int getJmlBarang(){
        return this.namaBarang.size();
    }

    public void setNamaBarang(String namaBarang ){
        this.namaBarang.add(namaBarang);
    }

    public String getNamaBarang(int idBarang){
        return this.namaBarang.get(idBarang);
    }

    public void setStok(int stok ){
        this.stok.add(stok);
    }

    public int getStok(int idBarang){
        return this.stok.get(idBarang);
    }

    public void editStok(int idBarang, int stok){
        this.stok.set(idBarang, stok);;
    }

    public void setHarga(int harga ){
        this.harga.add(harga);
    }

    public int getHarga(int idBarang){
        return this.harga.get(idBarang);
    }
}
