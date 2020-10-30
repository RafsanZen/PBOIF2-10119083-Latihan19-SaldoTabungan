/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119083.latihan19.saldotabungan;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

/**
 *
 *  @author
 * Nama : Rafsan Zen Mustaofa
 * NIM  : 10119083
 * Kelas: IF-2
 * Deskripsi: Menamplkan tabungan
 */
public class PBOIF210119083Latihan19SaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');

        kursIndonesia.setDecimalFormatSymbols(formatRp);

        int lama, i;
        String hasil;
        float bunga;
        double saldoAwal, saldoTotal;

        System.out.print("Saldo Awal\t : Rp. ");
        saldoAwal = input.nextDouble();
        System.out.print("Bunga/bulan(%)\t : ");
        bunga = input.nextFloat();
        System.out.print("Lama (bulan)\t : ");
        lama = input.nextInt();

        bunga =  (float) (bunga/100);
        System.out.println(bunga);

        for (i=1;i<=lama;i++){
             saldoTotal = saldoAwal + (0.15 * saldoAwal);
              System.out.printf("Saldo di bulan ke-" + i + " %s %n", kursIndonesia.format(saldoTotal));
             saldoAwal = saldoTotal;
        System.out.println("==============================");
        System.out.println("Developed by : Rafsan Zen Mustaofa");     
    }
       
    }}
    

