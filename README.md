## 20104006_Aditya-Rizkiawan-Nugraha_S1SE4A_Pemrograman2
Mata kuliah Pemrograman2

### DASAR TEORI 
* Package <br>
Sarana/ cara pengelompokan dan pengorganisasian kelas - kelas dan interface yang sekelompok menjadi suatu unit tunggal dalam library. Package juga memiliki hak akses seperti pengaruh terhadap method main(). Suatu cara memanage atau mengemlompokan class - class yang dibuat berdasarkan kesamaan atau kemiripan fungsi.

* Import Class <br>
Merupakan kata kunci untuk melibatkan class class lain yang terhimpun di dalam package yang akan di import. 

* This <br>
This merupakan referensi ke objek yang sedang aktif dan digunakan untuk di dalam method untuk mewakili nama kelas bersangkutan.



<hr>

### PRAKTIKUM PERCOBAAN
<hr>
Soal : <br>
1. Memakai kata kunci this pada overloading constructor <br> 

<br>[Kodingan Mahasiswa](https://github.com/adityarizn31/20104006_Aditya-Rizkiawan-Nugraha_S1SE4A_Pemrograman2/blob/modul5/Percobaan/Mahasiswa.java)
<hr>

 ```java
 package Modul5.Percobaan;

public class Mahasiswa {
    private int nrp;
    private String nama;


    public Mahasiswa() {
        this(0,"");
    }

    public Mahasiswa(String nama) {
        this(0, nama);
    }

    public Mahasiswa(int nrp, String nama){
        this.nrp = nrp;
        this.nama = nama;


    }
}
```
<br> **Penjelasan** : Pada class mahasiswa terdapat dua variabel dengan tipe data yang berbeda. Ada private int nrp dan private String nama. Selanjutya dibuat 3 constructor yang tidak menggunakan parameter dan menggunakan parameter namun berbeda yaitu Mahasiswa dengan di dalamnya terdapat this(0,"") lalu ada Mahasiswa (String nama) dan Mahasiswa (int nrp, String nama) yang terdapat this.nrp dan this.nama

<hr>


<br>
2. Menggunakan Package dan Import

<br>[Kodingan Kelas](https://github.com/adityarizn31/20104006_Aditya-Rizkiawan-Nugraha_S1SE4A_Pemrograman2/blob/modul5/Percobaan/Sekolah/Kelas.java)
<hr>

```java
package Modul5.Percobaan.Sekolah;

import Modul5.Percobaan.Mahasiswa;

public class Kelas {
    private int kodekelas;
    private String namakelas;
    private Mahasiswa mahasiswa;

    public Kelas (int kode, String nama){
        this.kodekelas = kode;
        this.namakelas = nama;
    }

    public void SetMhs(Mahasiswa mhs){
        this.mahasiswa = mhs;
    }
}
```
<br> **Penjelasan** : Di dalam class kelas terdapat dua variabel yaitu int kodekelas, String namakelas dan objek dari kelas Mahasiswa mahasiswa. Selanjutnya ada constructor dan method yaitu kelas dengan parameter int kode dan String nama dan method void set mahasiswa yang berfungsi mengisikan kepada variabel mhs.

<br>[Kodingan Mahasiswa](https://github.com/adityarizn31/20104006_Aditya-Rizkiawan-Nugraha_S1SE4A_Pemrograman2/blob/modul5/Percobaan/Sekolah/Mahasiswa.java)

<hr>

```java
package Modul5.Percobaan.Sekolah;

public class Mahasiswa {
    private int nrp;
    private String nama;

    public Mahasiswa(int nrp, String nama) {
        this.nrp = nrp;
        this.nama = nama;
    }
}
```
<br> **Penjelasan** : Di dalam kelas Mahasiswa ini ada dua varibale yang itu int nrp dan String nama dan ada juga contructor dengan parameter yang sama seperti variabel yang di dalamnya terdapat this.nrp dan this.nama.

<hr>

<br>
<br>
<hr>

### PRAKTIKUM LATIHAN
<hr>
3. Mengimplementasikan UML Class Diagram untuk class tabungan || Transformasikan class ke dalam Program

[Codingan3](https://github.com/adityarizn31/20104006_Aditya-Rizkiawan-Nugraha_S1SE4A_Pemrograman2/blob/modul3/Latihan/Tabungan.java)<br>
[Main3](https://github.com/adityarizn31/20104006_Aditya-Rizkiawan-Nugraha_S1SE4A_Pemrograman2/blob/modul3/Latihan/TestTabungann.java)

Hasil run menampilkan : 
<hr>

SALDO AWAL : 10000 <br>
JUMLAH UANG YANG DISIMPAN : 8000 <br>
JUMLAH UANG YANG DIAMBIL : 7000 OK <br>
JUMLAH UANG YANG DISIMPAN : 1000 <br>
JUMLAH UANG YANG DIAMBIL :  10000 OK <br>
JUMLAH UANG YANG DIAMBIL : 2500 GAGAL <br>
JUMLAH UANG YANG DISIMPAN : 2000 <br>
SALDO SEKARANG = 4000 <br>

<hr>

Pada kodingan ketiga merupakan tugas yang harus dibuat agar bisa di running, di dalamnya terdapat atribut int saldo lalu terdapat method getSaldo digunakan untuk kembalian sesuai dengan tipe data yang akan diambil sedangkan set digunakan untuk mengisi data ke dalam atribut. 
Lalu terdapat method simpanUang(int jumlah) digunakan untuk menjumlahkan saldo.Selanjutnya di dalam kodingan main terdapat Class Tabungan yang memiliki objek tabungan. dilanjutkan dengan menampilkan saldo awal yang dipanggil melalui method getSaldo lalu terdapat memanggil method simpangUang dan ambilUang. Ada juga percabangan dengan ekspresi boolean jika benar maka akan menampilkan OK namun jika salah maka Gagal. Di dalam method simpanUang dilakukan proses = saldo + jumlah; dan di ambilUang dilakukan proses jika jumlah lebih kecil dari this.getsaldo maka setSaldo akan mengisi getSaldo - jumlah. 

### KESIMPULAN
Kesimpulan pada praktikum kedua ini mahasiswa harus jeli dengan method yang dibuat, variabel yang digunakna dan alur / algoritma program yang berjalan.Selain itu harus paham juga dan mengerti detai - detail dari alur pemrograman. Di dalam PBO kode dan data diatur menggunakan method sehingga dapat bekerja untuk menghasilkan program yang digunakan menyelesaikan masalah selain itu memodelkan sistem menjadi suatu objek yang dimana menjadi solusi dalam penyelesaian. 
