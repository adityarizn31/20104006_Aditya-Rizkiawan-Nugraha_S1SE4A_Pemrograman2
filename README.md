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

**1. Melakukan OVerloading pada method <br>**

[A](https://github.com/adityarizn31/20104006_Aditya-Rizkiawan-Nugraha_S1SE4A_Pemrograman2/blob/modul7/Percobaan/A.java) <br>
[B](https://github.com/adityarizn31/20104006_Aditya-Rizkiawan-Nugraha_S1SE4A_Pemrograman2/blob/modul7/Percobaan/B.java) <br>
[C](https://github.com/adityarizn31/20104006_Aditya-Rizkiawan-Nugraha_S1SE4A_Pemrograman2/blob/modul7/Percobaan/C.java) <br>
[Overload](https://github.com/adityarizn31/20104006_Aditya-Rizkiawan-Nugraha_S1SE4A_Pemrograman2/blob/modul7/Percobaan/Overload.java) <br>

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

![image](https://user-images.githubusercontent.com/92510019/142975781-eb18dd44-e94c-42e1-ba32-d31daece18f6.png)


<hr>

**Penjelasan** : Terdapat satu kelas yang merupakan Induk / Super yaitu A sedangkan B dan C merupakan turunannya. Selanjutnya pada kelas main terdapat dua method yang menggunakan konsep *Overloading* yaitu method **myoverload** yang di dalamnya terdapat parameter yang lengkap lalu menggunakan argumen SOUT Println yang nantinya akan menampilkan isi argumen. Setelah itu Pada mainnya membuat objek terlebih dahulu dengan menggunakan nama *Overload* dan huruf O dan C. Lalu objek C memanggil method dan yang tampil yang bagian yang terdekat dengan C

<br>

**2. Melakukan Overloading pada method**

[Overload1](https://github.com/adityarizn31/20104006_Aditya-Rizkiawan-Nugraha_S1SE4A_Pemrograman2/blob/modul7/Percobaan/Overload1.java) <br>

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

![image](https://user-images.githubusercontent.com/92510019/142975752-2728029b-35a3-4c4e-906f-9dad4033c2f3.png)

 
<hr>

**Penjelasan** : Selanjutnya pada program ini terdapat tiga method dengan nama yang sama namun parameter yang berbeda di dalamnya terdapat masing masing argumen SOUT Println dengan menampilkan nama nama tipe data setelah itu pada mainnya membuat objek dengan nama overload dan huruf O lalu menginisialisasi variabel dengan 1 dan memanggil menggunakan objek o dengan variabel b. 

<br>

**3. Melakukan Overloading Method**

[Mahasiswa](https://github.com/adityarizn31/20104006_Aditya-Rizkiawan-Nugraha_S1SE4A_Pemrograman2/blob/modul7/Percobaan/Mahasiswa.java) <br>
[Main](https://github.com/adityarizn31/20104006_Aditya-Rizkiawan-Nugraha_S1SE4A_Pemrograman2/blob/modul7/Percobaan/Main.java) 

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

![image](https://user-images.githubusercontent.com/92510019/142975710-e31bb692-cdb0-4174-8081-d332a5e82d27.png)


<hr>

**Penjelasan** : Pada class mahasiswa terdapat dua method dengan berparameter dan tidak berparameter di dalamnya terdapat argumen SOUT Println dengan menampilkan masing masing SOUT. Pada method yang memiliki parameter menampilkan nama dan akan ditampilkan nama ketika dilakukan Run. Sedangkan pada mainnya dilakukan membuat objek dari kelas mahasiswa dengan nama objek nama lalu melakukan memanggil pada method yang ada di class Mahasiswa. Terdapat dua method yang dipanggil yaitu yang pertama yang tidak memiliki parameter dan yang kedua memiliki parameter. Perbedaanya yang pertama tidak memiliki paramater hanya menampilkan saja sedangkan yang kedua yang memiliki parameter menampilkan dengan variabel yang sudah diinisialisasi oleh nama. 

<br>

**4. Overriding pada Method**

[Burung](https://github.com/adityarizn31/20104006_Aditya-Rizkiawan-Nugraha_S1SE4A_Pemrograman2/blob/modul7/Percobaan/Burung.java) <br>
[Penguin](https://github.com/adityarizn31/20104006_Aditya-Rizkiawan-Nugraha_S1SE4A_Pemrograman2/blob/modul7/Percobaan/Penguin.java) <br>
[Overriding](https://github.com/adityarizn31/20104006_Aditya-Rizkiawan-Nugraha_S1SE4A_Pemrograman2/blob/modul7/Percobaan/Overiding.java) 

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

![image](https://user-images.githubusercontent.com/92510019/142975632-71a15c99-a9cf-4398-af5e-e58d01d9f5b7.png)

<hr>

**Penjelasan** : Pada program ini menggunakan konsep overrding yang dimana memiliki method dengan keduanya tidak memiliki parameter sehingga disebut Overriding. Pada class burung memiliki satu method yaitu terbang di dalamnya terdapat argumen SOUT Terbang lalu pada class penguin yang merupakan turunan dari class burung memiliki satu method juga yaitu terbang dan menampilkan SOUT Tidak bisa terbang. Selanjutnya pada class main membuat objek dari kelas burunga dan penguin dan terakhir dilakukan memanggil pada tiap tiap masing method. 

<br>

### PRAKTIKUM LATIHAN
<hr>

**5. Melatih Pemahaman menggunakan Overriding**

[Dosen : Parent Class](https://github.com/adityarizn31/20104006_Aditya-Rizkiawan-Nugraha_S1SE4A_Pemrograman2/blob/modul7/Latihan/Dosen.java) <br> 
[Dekan](https://github.com/adityarizn31/20104006_Aditya-Rizkiawan-Nugraha_S1SE4A_Pemrograman2/blob/modul7/Latihan/Dekan.java) <br>
[Rektor](https://github.com/adityarizn31/20104006_Aditya-Rizkiawan-Nugraha_S1SE4A_Pemrograman2/blob/modul7/Latihan/Rektor.java) <br>
[Main](https://github.com/adityarizn31/20104006_Aditya-Rizkiawan-Nugraha_S1SE4A_Pemrograman2/blob/modul7/Latihan/Main.java) 

Class Dosen : 
```java
package Modul7.Latihan;

public class Dosen {
    public String nama;
    public String nik;
    public String jurusan;

    Dosen(String namx, String nikx, String jurx) {
        this.nama = namx;
        this.nik = nikx;
        this.jurusan = jurx;
    }

    public void tampil() {
        System.out.println("\nNama \t= " + nama);
        System.out.println("Nim \t= " + nik);
        System.out.println("Jurusan = " + jurusan);
    }
}
```

Class Dekan : 
```java
package Modul7.Latihan;

public class Dekan extends Dosen{
    private String fakultas;

    Dekan(String namx, String nikx, String jurx, String kultas) {

        super(namx, nikx, jurx);
        this.fakultas = kultas;
    }

    public void tampil () {

        super.tampil();
        System.out.println("\nFakultas \t= " + fakultas);

    }
}
```

Class Rektor : 
```java
package Modul7.Latihan;

public class Rektor extends Dosen{
    private int th_mulai;
    public int jabatan;

    Rektor(String namx, String nikx, String jurx, int thx, int kex) {
        super(namx, nikx, jurx);
        this.th_mulai = thx;
        this.jabatan = kex;
    }

    public void tampil() {

        super.tampil();
        System.out.println("\nTahun mulai jabatan\t= " + th_mulai);
        System.out.println("Jabatan ke \t\t\t=- " + jabatan);
    }
}
```

Class Main :
```java
package Modul7.Latihan;

public class Main {
    public static void main(String[] args) {
        Dosen dos;
        //Dosen dosen = new Dosen("Nugraha", "20104016", "RPL");
        Rektor rek = new Rektor("Aditya", "20104006", "Rekayasa Perangkat Lunak", 2020, 1);
        Dekan dek = new Dekan("Rizkiawan", "20114006", "Teknik Informatika", "IT");

        dos = rek;
        dos.tampil();

        dos = dek;
        dos.tampil();

        //dos = dosen;
        //dos.tampil();
    }
}
```


Hasil run menampilkan : 
<hr>

![image](https://user-images.githubusercontent.com/92510019/142976547-7dc7cac2-e955-4c2f-a634-6726522c0a2a.png)

<hr>


### KESIMPULAN
Kesimpulannya Overroding yaitu menulis ulang method yang ada di class induk dengan syarat **nama dan parameter fungsinya harus sama** atau meskipun tidak memiliki parameter juga harus sama sama kosong lalu untuk memanggil nya dimain dibuat terlebih dahulu objek dari kelas induk atau kelas anak yang nantinya akan dilakukan memanggil kelas pada tiap - tiap method. Contohnya pada **Praktikum Pemahaman** terdapat method tampil pada tiap tiap masing class. Sedangkan pada overloading Method pada tiap tiap class bernama sama namun memiliki parameter yang berbeda. Mahasiswa harus mengerti terlebih dahulu pengertiannya dilanjut dengan ciri - ciri dari setiap konse dan juga memahami mana yang parent class dan sub class.
