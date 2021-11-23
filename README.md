## 20104006_Aditya-Rizkiawan-Nugraha_S1SE4A_Pemrograman2
Mata kuliah Pemrograman2

### DASAR TEORI 
* Overloading <br>
Merupakan penulisan beberapa fungsi dua atau lebih yang memiliki nama yang sama. Overloading ini dikenal dengan istilah *Signature* . Signature merupakan sebuah fungsi adalah parameter lengkap dengan tipe datanya yang terdapat dalam fungsi tersebut. Suatu fungsi dikatakan overload manakala terdapat beberapa fungsi dengan nama yang sama namun memiliki signature yang berbeda beda. Overloading fungsi ditentukan oleh signaturenya bukan ditentukan oleh nilai balikan fungsi.

* Overriding <br>
Suatu cara untuk mendefinisikan ulang method yang ada pada class induk apabila class anak menginginkan adanya informasi yang lain. Overriding dilakukan dengan cara menulis ulang method yang ada pada class induk dengan syarat bahwa nama dan parameter fungsi tersebut harus sama (tidak boleh diubah). 

* Aturan Overriding Method <br>
List argumen pada Overrding dan Overriden harus sama termasuk tipe data, dan urutannya selain itu jika Overriden *default* maka overrdiing harus default, protected dan public.
sedangkan jika overriden method protected maka overriding harus protected atau public atau jika public maka overriding harus public. Selain itu harus memiliki tipe return (sub type) yang sama. 
<hr>

### PRAKTIKUM PERCOBAAN
<hr>
Soal : <br>
1. Melakukan OVerloading pada method <br> 

[A]() <br>
[B]() <br>
[C]() <br>
[Overload]() <br>

```java
void myOverload(A a){
        System.out.println("OVERLOAD.MyOverload (A a)");
    }

    void myOverload(B b){
        System.out.println("OVERLOAD.MyOverload (B b)");
    }

    public static void main(String[] args) {
        Overload o = new Overload();
        C c = new C();

        o.myOverload(c);
    }
```


Hasil run menampilkan :  
<hr>

<hr>

**Penjelasan** : Terdapat satu kelas yang merupakan Induk / Super yaitu A sedangkan B dan C merupakan turunannya. Selanjutnya pada kelas main terdapat dua method yang menggunakan konsep *Overloading* yaitu method **myoverload** yang di dalamnya terdapat parameter yang lengkap lalu menggunakan argumen SOUT Println yang nantinya akan menampilkan isi argumen. Setelah itu Pada mainnya membuat objek terlebih dahulu dengan menggunakan nama *Overload* dan huruf O dan C. Lalu objek C memanggil method dan yang tampil yang bagian yang terdekat dengan C

<br>

2. Melakukan Overloading pada method

[Overload1]() <br>

```java
void myMethod(Short s) {
        System.out.println("Short");
    }

    void myMethod(int i) {
        System.out.println("int");
    }

    void myMethod(long l) {
        System.out.println("long");
    }

    public static void main(String[] args) {
        Overload1 o = new Overload1();
        byte b = 1;

        o.myMethod(b);
    }
```

Hasil run menampilkan : 
<hr>
 
<hr>

**Penjelasan** : Selanjutnya pada program ini terdapat tiga method dengan nama yang sama namun parameter yang berbeda di dalamnya terdapat masing masing argumen SOUT Println dengan menampilkan nama nama tipe data setelah itu pada mainnya membuat objek dengan nama overload dan huruf O lalu menginisialisasi variabel dengan 1 dan memanggil menggunakan objek o dengan variabel b. 

<br>

3. Melakukan Overloading Method

[Mahasiswa]() <br>
[Main]() 

Mahasiswa : 

```java
package Modul7.Percobaan;

public class Mahasiswa {
    public void info() {
        System.out.println("Haloo.. Aku Mahasiswa !!");
    }

    public void info(String nama){
        System.out.println("Haloo.. Namaku " + nama);
    }
}
```

Main : 

```java
public static void main(String[] args) {
        Mahasiswa nama = new Mahasiswa();

        nama.info();
        nama.info("toString");
    }
```

hasil Run Menampilkan : 
<hr>

<hr>

**Penjelasan** : Pada class mahasiswa terdapat dua method dengan berparameter dan tidak berparameter di dalamnya terdapat argumen SOUT Println dengan menampilkan masing masing SOUT. Pada method yang memiliki parameter menampilkan nama dan akan ditampilkan nama ketika dilakukan Run. Sedangkan pada mainnya dilakukan membuat objek dari kelas mahasiswa dengan nama objek nama lalu melakukan memanggil pada method yang ada di class Mahasiswa. Terdapat dua method yang dipanggil yaitu yang pertama yang tidak memiliki parameter dan yang kedua memiliki parameter. Perbedaanya yang pertama tidak memiliki paramater hanya menampilkan saja sedangkan yang kedua yang memiliki parameter menampilkan dengan variabel yang sudah diinisialisasi oleh nama. 

<br>

4. Overriding pada Method

[Burung]() <br>
[Penguin]() <br>
[Main]()

Class Burung :

```java
package Modul7.Percobaan;

public class Burung {
    public void terbang() {
        System.out.println("Terbang");
    }
}
```

class penguin extends burung : 
```java
public class Penguin extends Burung{
    @Override
    public void terbang() {
        System.out.println("Aku tidak bisa terbang!");
    }
}
```

Class Main Overriding : 
```java
package Modul7.Percobaan;

public class Overiding {
    public static void main(String[] args) {
        Burung burung = new Burung();
        Penguin penguin = new Penguin();

        burung.terbang();
        penguin.terbang();
    }
}
```

Hasil Run Menampilkan : 
<hr>

<hr>

**Penjelasan** : Pada program ini menggunakan konsep overrding yang dimana memiliki method dengan keduanya tidak memiliki parameter sehingga disebut Overriding. Pada class burung memiliki satu method yaitu terbang di dalamnya terdapat argumen SOUT Terbang lalu pada class penguin yang merupakan turunan dari class burung memiliki satu method juga yaitu terbang dan menampilkan SOUT Tidak bisa terbang. Selanjutnya pada class main membuat objek dari kelas burunga dan penguin dan terakhir dilakukan memanggil pada tiap tiap masing method. 

<br>

### PRAKTIKUM LATIHAN
<hr>
3. Mengimplementasikan UML Class Diagram untuk class tabungan || Transformasikan class ke dalam Program

[Codingan3]()<br>
[Main3]()

Hasil run menampilkan : 
<hr>

<hr>


### KESIMPULAN

