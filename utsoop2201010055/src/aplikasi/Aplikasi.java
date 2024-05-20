/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplikasi;

import java.util.Scanner;

// Class Data untuk menyimpan data satu entitas
class Data {
    private int nim;
    private String name;
    private String jurusan;

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

    public void setName(String name) {
        this.name = name;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }
}

// Class Aplikasi untuk mengelola data-data
public class Aplikasi {
    private Data[] data;
    private int count;
    private Scanner scanner;

    public Aplikasi() {
        data = new Data[100]; // Ukuran array disesuaikan kebutuhan
        count = 0;
        scanner = new Scanner(System.in);
    }

    Aplikasi(Data[] data, int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void menu() {
        System.out.println("1. Input Data Mahasiswa");
        System.out.println("2. Display Data Mahasiswa");
        System.out.println("3. Edit Data Mahasiswa");
        System.out.println("4. Delete Data Mahasiswa");
        System.out.println("0. Exit");
        System.out.print("Choose menu: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // consume newline

        switch (choice) {
            case 1:
                inputData();
                break;
            case 2:
                displayData();
                break;
            case 3:
                editData();
                break;
            case 4:
                deleteData();
                break;
            case 0:
                System.out.println("Exiting...");
                return;
            default:
                System.out.println("Invalid choice!");
                break;
        }

        menu(); // Recursive call to keep showing menu until exit
    }

    public void inputData() {
        System.out.print("Enter NIM: ");
        int nim = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Jurusan: ");
        String jurusan = scanner.nextLine();

        data[count] = new Data(nim, name, jurusan);
        count++;
    }

    public void displayData() {
        if (count == 0) {
            System.out.println("No data available!");
        } else {
            System.out.println("Data Mahasiswa:");
            for (int i = 0; i < count; i++) {
                System.out.println("NIM: " + data[i].getNim());
                System.out.println("Name: " + data[i].getName());
                System.out.println("Jurusan: " + data[i].getJurusan());
                System.out.println();
            }
        }
    }

    public void editData() {
        System.out.print("Enter NIM of data to edit: ");
        int nimToEdit = scanner.nextInt();
        scanner.nextLine(); // consume newline

        for (int i = 0; i < count; i++) {
            if (data[i].getNim() == nimToEdit) {
                System.out.print("Enter new Name: ");
                String newName = scanner.nextLine();
                System.out.print("Enter new Jurusan: ");
                String newJurusan = scanner.nextLine();

                data[i].setName(newName);
                data[i].setJurusan(newJurusan);

                System.out.println("Data edited successfully!");
                return;
            }
        }
        System.out.println("Data not found!");
    }

    public void deleteData() {
        System.out.print("Enter NIM of data to delete: ");
        int nimToDelete = scanner.nextInt();
        scanner.nextLine(); // consume newline

        for (int i = 0; i < count; i++) {
            if (data[i].getNim() == nimToDelete) {
                for (int j = i; j < count - 1; j++) {
                    data[j] = data[j + 1];
                }
                data[count - 1] = null;
                count--;

                System.out.println("Data deleted successfully!");
                return;
            }
        }
        System.out.println("Data not found!");
    }

    public static void main(String[] args) {
        Aplikasi app = new Aplikasi();
        app.menu();
    }
}
