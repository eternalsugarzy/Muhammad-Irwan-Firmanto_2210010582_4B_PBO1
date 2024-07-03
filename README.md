# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data Identitas Warga menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama dan NIK Warga, dan memberikan output berupa informasi detail dari NIK tersebut seperti Provinsi, Kabupaten, Kecamatan, Tanggal Lahir, dan Desa

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Identitas`, `IdentitasDetail`, dan `Main` adalah contoh dari class.

```bash
public class Identitas {
    ...
}

public class IdentitasDetail extends Mahasiswa {
    ...
}

public class Main {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `orang[i] = new IdentitasDetail(nama, nik);` adalah contoh pembuatan object.

```bash
orang[i] = new IdentitasDetail(nama, nik);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama` dan `nik` adalah contoh atribut.

```bash
String nama;
String nik;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Identitas` dan `IdentitasDetail`.

```bash
public Identitas(String nama, String nik) {
        this.nama = nama;
        this.nik = nik;
    }

public IdentitasDetail(String nama, String noid) {
        super(nama, noid);
    }
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNama` dan `setNik` adalah contoh method mutator.

```bash
public void setNama(String nama) {
        this.nama = nama;
    }

public void setNik(String nik) {
        this.nik = nik;
    }
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama`, `getNik`, `getKodeProv`, `getKodeKab`, `getKodeKec`, `getKodeTanggal`, dan `getKodeDesa` adalah contoh method accessor.

```bash
public String getNama() {
        return nama;
    }

public String getNik() {
        return nik;
    }
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama` dan `nik` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String nama;
private String nik;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `IdentitasDetail` mewarisi `Identitas` dengan sintaks `extends`.

```bash
public class IdentitasDetail extends Identitas {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo(String)` di `Identitas` merupakan overloading method `displayInfo` dan `displayInfo` di `IdentitasDetail` merupakan override dari method `displayInfo` di `Identitas`.

```bash
public String DisplayInfo(){
    return "Nama: "+getNama()+"\nNIK: "+getNik();
    }

@Override
    public String DisplayInfo(){
        return super.DisplayInfo()+
                    "\nKode Provinsi: "+getKodeProv()+
                    "\nKode Kabupaten: "+getKodeKab()+
                    "\nKode Kecamatan: "+getKodeKec()+
                    "\nTanggal Lahir: "+getKodeTanggal()+
                    "\nKode Desa: "+getKodeDesa();
    }
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `getKodeProv`, `getKodeDesa` dan seleksi `switch` dalam method `getKodeKab`, `getKodeKec`.

```bash
public String getKodeProv (){
        String kodeProv = getNik().substring(0 , 2);
        if (kodeProv.equals("63")) {
            return "Provinsi Kalimantan Selatan";
        } else {
            return "Provinsi Lain";
        }
    }

public String getKodeDesa(){
        String kodeDesa = getNik().substring((12));
        if (kodeDesa.equals("0002")) {
            return "Desa Jorong";
        } else {
            return "Desa Lain";
        }
    }

public String getKodeKab(){
        String kodeKab = getNik().substring(2, 4);
        switch (kodeKab) {
            case "01":
                return "Kabupaten Tanah Laut";
            case "02":
                return "Kabupaten Kotabaru";
            default:
                return "Kabupaten Banjar";
        }
    }

 public String getKodeKec(){
        String kodeKec = getNik().substring(4, 6);
        switch (kodeKec) {
            case "01": 
                return "Kecamatan Pelaihari";
            case "02":
                return "Kecamatan Jorong";
            default:
                return "Kecamatan Batulicin";
        }
    }
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (int i=0; i<orang.length; i++){
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in);
System.out.print("Masukan Nama " +(i+1)+ ":");
String nama = scanner.nextLine();
System.out.print("Masukan NIK " +(i+1)+ ":");
String nik = scanner.nextLine();

System.out.println("=================");
System.out.println("Identitas Warga: ");
System.out.println(data.DisplayInfo());
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `IdentitasDetail[] orang = new IdentitasDetail[2];` adalah contoh penggunaan array.

```bash
IdentitasDetail[] orang = new IdentitasDetail[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    // code that might throw an exception
} catch (Exception e) {
    System.out.println("Kesalahan Umum: " + e.getMessage());
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Muhammad Irwan Firmanto
NPM: 2210010582
