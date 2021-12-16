# 20104006_Aditya-Rizkiawan-Nugraha_S1SE4A_Pemrograman2

### Mata kuliah Praktikum Pemrograman2

* Exception Handling <br>
Exception adalah kondisi pengecualian yang merupakan sesuai diluar biasanya. Exception ini kebanyakan digunakan sebagai sarana melaporkan kondisi - kondisi kesalahan. <br>
Java menangani exception melibatkan lima kata kunci : 
1. Try
2. Catch
3. Throw
4. Throws
5. Finally

Exception merupakan sub kelas java.lang.Throwable dikarenakan mengimplementasikan metode yang mengirim String yang mendeskripsikan kesalahan yang disebabkan exception. Excetion merupakan kelas objek spesial yang menangani seluruh kesalahan di Java. Kode penanganan di Java terletak di paket java.Lang dan secara otomatis dimasukkan di semua kode hasil kompilasi.

* Try <br>
Merupakan blok kode yang dimulai dengan kata kunci try diapit pasangan kurung kurawal ({...}). Setiap blok try diasosiakan dengan satu blok catch atau lebih. 

Contoh <br>

```java
try {
      //Pemanggilan metode yang menghasilkan exception
      //dilakukan disini
}
```

* Catch <br>
Jika metode dimaksudkan untuk menangkap Exception yang dilempar metode yang dipanggil maka pemanggilan harus ditempatkan di blok try. 
