/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplikasi;

import java.util.Scanner;

public class Data {
    private int nim;
    private String name;
    private String jurusan;

    public Data() {
        // Default constructor
    }

    public Data(int nim, String name, String jurusan) {
        this.nim = nim;
        this.name = name;
        this.jurusan = jurusan;
    }

    public int getNim() {
        return nim;
    }

    public String getName() {
        return name;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setJurusan(String newJurusan) {
        this.jurusan = newJurusan;
    }

    public static void main(String[] args) {
        Aplikasi app = new Aplikasi();
        app.menu();
    }
}
