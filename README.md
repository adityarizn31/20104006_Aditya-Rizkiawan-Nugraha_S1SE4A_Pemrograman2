## 20104006_Aditya-Rizkiawan-Nugraha_S1SE4A_Pemrograman2
Mata kuliah Pemrograman2

### DASAR TEORI 
* Pengenalan Berorientasi Objek <br>
Paradigma pemrograman berdasarkan konsep "objek", yang dapat berisi data, dalam bentuk field atau dikenal juga sebagai atribut; serta kode, dalam bentuk fungsi/prosedur atau dikenal juga sebagai method. Semua data dan fungsi dibungkus dalam kelas kelas atau objek dan juga semua data maupun fungsi yang didefinisikan ke dalam beberapa kelas atau objek yang tujuannya saling bekerjasama untuk memecahkan suatu masalah. Objek merupakan entitas yang memiliki atribut, karakter dan kondisi

* Class <br>
Class merupakan cetak biru dalam membuat objek atau blueprint / kerangka yang mendefinisikan variabel - variabel dan method - method (perilaku) dari sebuah objek tertentu. 

* Objek <br>
merupakan variabel yang digunakan sebagai referensi ke objek dari kelas bersangkutan biasanya dilakukan menginstansiasi kelas dengan menggunakan operator new dan memasukan instance-nya ke dalam variabel referensi yang baru dideklarasikan. 

* Method <br>
Perilaku - perilaku / kemampuan yang memiliki oleh objek
Method dalam pemrograman Java dibagi menjadi dua : 
<br>-Void : Method yang tidak mengembalikan nilai
<br>-non Void : method yang mengembalikan nilai

* Atribut <br>
Atribut merupakan karakteristik dari suatu entitas atau elemen - elemen dari data.

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
