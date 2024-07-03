package UAS;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {  

        //error handling 
        try {
            //IO Sederhana
            Scanner scanner = new Scanner(System.in);
            //Array
            IdentitasDetail[] orang = new IdentitasDetail[2];

            //perulangan
            for (int i=0; i<orang.length; i++){
                System.out.print("Masukan Nama " +(i+1)+ ":");
                String nama = scanner.nextLine();
                System.out.print("Masukan NIK " +(i+1)+ ":");
                String nik = scanner.nextLine();

                //objek
                orang[i] = new IdentitasDetail(nama, nik);
            }
            
            //perulangan
            for (IdentitasDetail data: orang){
                System.out.println("=================");
                System.out.println("Identitas Warga: ");
                System.out.println(data.DisplayInfo());
            }
        } catch (Exception e) {
            System.out.println("Kesalahan Umum; "+e.getMessage());
        }
            

    }
}
