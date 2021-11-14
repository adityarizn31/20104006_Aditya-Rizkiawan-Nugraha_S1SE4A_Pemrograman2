## 20104006_Aditya-Rizkiawan-Nugraha_S1SE4A_Pemrograman2
Mata kuliah Pemrograman2

### DASAR TEORI 
* Inheritance <br>
Inheritance merupakan suatu cara pembuatan class baru dengan menggunakan kembali class yang sudah didefinisikan sebelumnya dengan menambahkan atribut dan method baru. Sehingga sedemikian class baru tersebut mewakili variabel dan fungsi yang dimiliki oleh class sebelumnya. Atau suatu konsep penting dalam pemrograman yang menciptakan kelas baru dengan mewarisi karakteristik kelas yang telah ada ditambah dengan karakterisitik unik kelas baru itu. 

* Deklarasi Inheritance dan Single Inheritance <br>
Deklarasi yang digunakan pada inheritance yaitu menambahkan kata kunci extends setelah deklarasi nama class kemudia diikuti dengan nama parent classnya. Kata kunci extends tersebut memberitahu kompiler Java akan ada perluasan pada class contohnya *public class B extends A() {};*. Sedangkan Single inheritance merupakan pewarisan yang jumlah kelas dasarnya (basic class/superclass) tunggal tapi kelas turunan nya bisa lebih dari satu. 

* Penerapan Inheritance <br>
 Penerapan inheritance ini ada beberapa yaitu : 
 1. Tempatkan operasi - operasi dan field - field yang sama di superkelas
 2. Jangan menggunakan protected fields
 3. Gunakan pewarisan untuk memodelkan hubungan "is-a"
 4. Jangan gunakan pewarisan kecuali semua metode yang diturunkan adalah berarti
 5. Gunakan *Polymorphism* , jangan menggunakan informasi mengenai tipe

* Pengaksesan member dari parent class <br>
Pengaksesan memberi dari parent class itu menggunakan kata kunci extends yang dimana itu mengartikan anak dari kelas induk misalnya *public class B extends A() {};* yang berarti class B merupakan anak dari class A (A merupakan kelas induk). 


* Kontrol Pengaksesan <br>
Maksud dari kontrol pengaksesan yaitu suatu parent class boleh atau tidak mewariskan sebagian data dan methodnya kepada subclassnya. Sejauh mana method dan data tersebut dapat diwariskan ke kelas lain. 


* Kata kunci super <br>
Kata kunci ini digunakan untuk memanggil konstruktor dari super class atau memanggil variabel yang mengacu pada super class. Misalnya super(x, y, z) berarti atribut x, y, z diambil dari atribut class induk.

* Konstraktor tidak diwariskan  <br>
Karena konstruktor kelas A berarti membuat objek dari kelas A dan konstruktor kelas B berarti membuat objek dari kelas B yang dimana tidak bisa dilakukan konstruktor kelas A dengan objek dari B. Terkecuali menggunakan super didalalamnya yang membuat implementasi A inside B

<hr>

### PRAKTIKUM PERCOBAAN
<hr>
Soal : <br>
1. Mengakses anggota suatu class <br> 

[Codingan1](https://github.com/adityarizn31/20104006_Aditya-Rizkiawan-Nugraha_S1SE4A_Pemrograman2/blob/modul3/Percobaan/Rumah.java) <br>
[Main1](https://github.com/adityarizn31/20104006_Aditya-Rizkiawan-Nugraha_S1SE4A_Pemrograman2/blob/modul3/Percobaan/Test.java)

Hasil run menampilkan :  
<hr>

Alamat saya di jalan Lapang Sari, Majalengka <br>

<hr>

Pada kodingan yang pertama ini class Rumah membuat objek dengan variabel r selanjutnya r memanggil method setAlamat rumah yang dimana memiliki parameter(String x) dan alamat_rumah = x. Statement pertama pada class main setelah membuat objek digunakan untuk mengisikan "Alamat saya di jalan Lapangsari" dan dipanggi lagi di bagian sout.

<br>
2. Mengimplementasikan UML Class diagram untuk class tabungan

[Codingan2](https://github.com/adityarizn31/20104006_Aditya-Rizkiawan-Nugraha_S1SE4A_Pemrograman2/blob/modul3/Percobaan/Tabungan.java) <br>
[Main2](https://github.com/adityarizn31/20104006_Aditya-Rizkiawan-Nugraha_S1SE4A_Pemrograman2/blob/modul3/Percobaan/TestTabungan.java)

Hasil run menampilkan : 
<hr>
 
SALDO AWAL TABUNGAN ANDA = 5000 <br>
JUMLAH UANG YANG DIAMBIL = 1500 <br>
SALDO TABUNGAN ANDA YANG SEKARANG ADALAH = 3500 <br>
 
<hr>
Pada kodingan kedua ini class tabungan dibuat terlebih dahulu dengan memiliki atribut int saldo selanjutnya terdapat method void ambilUang dengan paramater(int saldo) selanjutnya pada kodingan main class tabungan membuat objek dengan variabel t yang dimana memliki isi 5000 
selanjutnya ditampilkan terlebih dahulu jumlah uang awal yaitu 5000 lalu variabel t memanggil method ambilUang pada class Tabungan, uang yang diambil sebesar 1500 dan terakhir ditampilkan lagi hasil dari uang yang telah dikurangi yaitu 3500.
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
