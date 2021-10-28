## 20104006_Aditya-Rizkiawan-Nugraha_S1SE4A_Pemrograman2
Mata kuliah Pemrograman 2 || Pemrograman Berorientasi Objek

### DASAR TEORI 
* Information Hiding <br>
menyembunyikan attribute suatu objek dari objek lain atau juga menyembunyikan dan melindungi informasi berupa atribut maupun method dengan menggunakan hak akses modifier private.

* Enkapsulasi (Pembungkus) <br>
Merupakan penggabungan potongan - potongan informasi dan perilaku - perilaku spesifik yang bekerja pada informasi tersebut, kemudian mengemasnya menjadi sesuatu yang spesifik yang bisa disebut objek atau proses memastikan pengguna sebuah objek tidak dapat menggantikan keadaan dari sebuah objek dengan cara yang tidak sesuai prosedur. Artinya hanya metode tertentu yang diberi izin sehingga bisa mengakses keadaan yang diinginkan atau juga menyembunyikan method suatu objek dari objek lain.

* Constructor <br>
Merupakan method khusus yang didefinisikan di dalam kelas dan akan dipanggil secara otomatis tiap kali terjadi instansiasi objek. Constructor ini berfungsi melakukan inisialisasi nilai terhadap data - data yang terdapat pada kelas yang bersangkutan. Sama seperti method constructor juga memiliki parameter dan juga dapat di-overload. 

* Overloading Constructor <br>
Overloading merupakan penulisan beberapa fungsi (dua atau lebih) yang memiliki nama yang sama. Dalam Overloading ini dikenal dengan Signature. Signature merupakan parameter lengkap dengan tipe datanya yang terdapat dalam fungsi. Overload pada constructor disebabkan karena constructor juga merupakan sebuah method yang mengembalikan tipe kelas (dirinya sendiri)


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
