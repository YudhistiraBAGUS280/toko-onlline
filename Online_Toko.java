/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package online_toko;

/**
 *
 * @author Yudis
 */
public class Online_Toko {
    public static void main(String[] args) {
        Barang barang = new Barang();
        member member = new member();
        Transaksi transaksi = new Transaksi();
        Laporan laporan = new Laporan();

        laporan.laporan(barang);
        laporan.laporan(member);
        laporan.laporan(transaksi, barang);

        transaksi.prosesTransaksi(member, transaksi, barang);

        laporan.laporan(transaksi, barang);
        laporan.laporan(barang);
        laporan.laporan(member);
        laporan.laporan(transaksi, barang);
    }
}
    
    

