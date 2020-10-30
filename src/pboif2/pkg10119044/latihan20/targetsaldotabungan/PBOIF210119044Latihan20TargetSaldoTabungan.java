/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119044.latihan20.targetsaldotabungan;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
/**
 *
 * @author 
 * NAMA     : Yohana Sri Rejeki
 * KELAS    : IF2
 * NIM      : 10119044
 * Deskripsi Program : Program ini bertujuan menampilkan target saldo tabungan 
 * dengan perulangan
 */

public class PBOIF210119044Latihan20TargetSaldoTabungan {
    public static void main(String[] args) {
        int saldoAwal,lama,i,akhir,saldoTarget;
        double bunga;
       
        saldoAwal=3500000;
        bunga=8;
        saldoTarget=6000000;
        i=1;
        
        DecimalFormat rupiah = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        formatRp.setCurrencySymbol(" Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');

        rupiah.setDecimalFormatSymbols(formatRp);
        
        while(saldoAwal<=saldoTarget){
            akhir=(int) (saldoAwal+((bunga/100)*saldoAwal));
            saldoAwal=akhir;
            
            System.out.println("Saldo di bulan ke-"+i+rupiah.format(akhir));
            i = i+1;
        }
        
    }
    
}
