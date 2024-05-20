/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplikasi;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Main {
  
    public static void main(String[] args) {
        // Inisialisasi array Data[] dengan panjang 100
        Data[] data = new Data[100];
        
        // Membuat instance Aplikasi dengan array data[] dan count = 0
        Aplikasi app = new Aplikasi(data, 0);
        
        // Memanggil metode menu() untuk menjalankan aplikasi
        app.menu();
    }
}


    

