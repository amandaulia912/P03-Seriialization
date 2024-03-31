/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package serialisasi;
import java.io.Serializable;
/**
 *
 * @author Hp
 */
public class ProductItem implements Serializable{
    String nama;
    double harga;
    
    public ProductItem(String name, double price){
        this.nama = name;
        this.harga = price;
    }

    /**
     * @param args the command line arguments
     */
    public String toString(){
        return "\r\nNama="+ nama + "\r\nHarga=" + harga + "\r\n";
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
