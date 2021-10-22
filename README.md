## 20104006_Aditya-Rizkiawan-Nugraha_S1SE4A_Pemrograman2
Mata kuliah Pemrograman2

### DASAR TEORI 
* Keyword dalam Java
Merupakan kata kunci yang digunakan dalam bahasa pemrograman Java. Keyword ini mempunyai fungsi masing - masing dalam Java dan tidak bisa digunakan untuk memberi nama suatu variabel. Di dalam bahasa pemrograman Java terdapat banyak keyword yang sering digunakan : 
[Keyword](https://user-images.githubusercontent.com/92510019/138389675-29994f76-9812-4b54-ba5d-4676f48d8157.jpg)
* Tipe Dasar / Data
Sebuah nilai dalam bentuk konstantan atau bentuk variabel, operator. Nilai konstanta yaitu tetap, dan variabel nilai bisa berubah - ubah. Di dalam Java terdapat dua tipe data yaitu : 
<br> -  Tipe data primitif yaitu tipe data yang sudah built in di dalam bahasa pemrograman Java contohnya : boolean, char, int, double dan lain-lain.
<br> - Tipe data referensi yaitu tipe data yang mereferensikan objek dari suatu class misalnya string, interface dan array. 
* Variabel
Nama dari suatu lokasi di memori yang digunakan untuk menyimpan data sementara. Variabel diberi nama tertentu yang menunjukan domain yang diwakilinya. Dalam memberikan nama variabel ada beberapa ketentuan yaitu : 
<br> - Panjang karakter tidak dibatasi
<br> - Nama variabel diawali dengan huruf, underscore atau tanda dolar$ selanjutnya dapat diikuti oleh karakter lain selain operator (*,+,-,/)
<br> - Bersifat case sensitif (membedakan huruf kapital dan kecil)
<br> - Tidak diperbolehkan menggunakan kata kunci yang digunakan pada Java, seperti : if, else, while dan dll.

* Casting dan Promotion 
Castind dan Promotion yaitu salah satu proses perubahan jenis type data pada suatu variabel di dalam Java. Disini Konversi diperlukan Greader tujuannya bisa menyesuaikan ukuran suatu variabel sehingga tidak memboroskan memori pada komputer saat Greader sedang membuat program. Proses konversi ini Greader tidak bisa dilakukan oleh semua type data. Type data yang tidak bisa di konversi itu Greader adalah type data boolean. Casting pada Java terdiri dari dua cara, pertama automatic casting, kedua manual casting. Automatic casting adalah mengubah suatu tipe data ke tipe data baru tanpa perlu menyebutkan tipe data baru tersebut. Manual casting adalah mengubah suatu tipe data ke tipe data baru dengan harus menyebutkan tipe data baru tersebut.

<hr>

### PRAKTIKUM
Soal : <br>
1. Menganalisa batasan maksimum dari suatu tipe <br> 
[Codingan](https://github.com/adityarizn31/20104006_Aditya-Rizkiawan-Nugraha_S1SE4A_Pemrograman2/blob/modul2/Latihan/AnalisaMaksimum.java) <br>
Ketika dirun Build output menampilkan 
<hr>" C:\Users\Asus\IdeaProjects\Praktikum_Pemrograman2\src\Modul2\Latihan\AnalisaMaksimum.java:5:18
java: integer number too large "
<hr>
Mengapa error itu bisa terjadi padahal daya tampung tipe data long adalah 2^63-1 ?
Error tersebut terjadi karena java akan membaca syntax tersebut dengan tipe data integer bukan tipe data long. Jika kita ingin menggunakan tipe data long seperti syntax diatas maka kita harus menambah huruf(suffix) "L" dibelakang angka agar java dapat membaca tipe data yang kita maksud adalah tipe data long. <br> <br>
2. Membuat cerita anak ayam menggunakan bahasa Java <br>
[Codingan](https://github.com/adityarizn31/20104006_Aditya-Rizkiawan-Nugraha_S1SE4A_Pemrograman2/blob/modul2/Latihan/Anak_Ayam.java) <br>
Ketika dirun output yang tampil
<hr>
MASUKAN JUMLAH ANAK AYAM = 5 <br>
ANAK AYAM TURUN 5
MATI SATU TINGGAL 4
ANAK AYAM TURUN 4
MATI SATU TINGGAL 3
ANAK AYAM TURUN 3
MATI SATU TINGGAL 2
ANAK AYAM TURUN 2
MATI SATU TINGGAL 1
ANAK AYAM TURUN 1, MATI 1 TINGGAL INDUKNYA 
<hr>
Pada program ini menggunakan Scanner dengan variabel asupkeun / masukan lalu mendefinisikan dan deklarasi variabel ayam & anakayam yang dimana nantinya akan digunakan ketika user menginputkan. Jumlah di atas tergantung dengan scanner anakayam oleh user. Selanjutnya terdapat proses perulangan ayam = anakayam; jika ayam > 1 maka ayam akan dikurangi lalu ditampilkan "Anak Ayam turun "+ anakayam; (sesuai inputan user ) dilanjut dengan pengurangan - 1.

