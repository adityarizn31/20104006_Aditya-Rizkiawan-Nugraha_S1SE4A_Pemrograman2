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
1. Percobaan 1 || Constructor Berparameter 

[Constructor](https://github.com/adityarizn31/20104006_Aditya-Rizkiawan-Nugraha_S1SE4A_Pemrograman2/blob/modul4/Percobaan/Tabungan.java) <br>




<hr>

<br>
2. Percobaan 2 || Melakukan enkapsulasi pada suatu class  

[main](https://github.com/adityarizn31/20104006_Aditya-Rizkiawan-Nugraha_S1SE4A_Pemrograman2/blob/modul4/Percobaan/main.java) <br>

Hasil run menampilkan :  
<hr>

Nama 			      : Barca <br>
No Rekening 	 : 50410420 <br>
Saldo 			     : 1000000 <br>
Pin           :  4669 <br>

<hr>

Pada kodingan main ini yang dibuat terlebih dahulu yaitu membuat objek dengan variabel "aditya" dengan berparameter String nama, int noRekening, int saldo dan int pin. Selanjutnya sout memanggil urutan parameter dengan menggunakan get, get pada kodingan ini digunakan untuk mengembalikan nilai sesuai dengan tipe data yang akan diambil dan sudah dipanggil. Sebelumnya sudah di isikan melalui objek yang memiliki parameter. 

<br>
3. Percobaan 3 || Melakukan Overloading Constructor 

[mainTabungan](https://github.com/adityarizn31/20104006_Aditya-Rizkiawan-Nugraha_S1SE4A_Pemrograman2/blob/modul4/Percobaan/mainTabungan.java) <br>

Hasil run menampilkan : 
<hr>
 
Saldo awal Rizkiawan 	 : 10000 <br>
Saldo awal Nugraha 		 : 15000 <br>
Nomor pin Rizkiawan 	 : 11111 <br>
Nomor pin Nugraha 		 : 9898 <br>
 
<hr>
Pada kodingan ketiga terdapat dua objek dengan variabel yang berbeda dan memiliki parameter beda. Yang pertama ada objek dengan variabel "rizkiawan" dengan memiliki parameter String nama dan int noRekening sedangkan yang kedua memiliki variabel "nugraha" dengan parameter String nama, int noRekening, int saldo dan int pin. 
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
