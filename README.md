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
1. Menggunakan kata kunci super<br> 

[Bentuk](https://github.com/adityarizn31/20104006_Aditya-Rizkiawan-Nugraha_S1SE4A_Pemrograman2/blob/modul6/Percobaan/Bentuk.java) <br> 
[Persegi](https://github.com/adityarizn31/20104006_Aditya-Rizkiawan-Nugraha_S1SE4A_Pemrograman2/blob/modul6/Percobaan/Persegi.java) <br>
[Persegi Test](https://github.com/adityarizn31/20104006_Aditya-Rizkiawan-Nugraha_S1SE4A_Pemrograman2/blob/modul6/Percobaan/PersegiTest.java)


Penggunaan this dan super:  
<hr>

```java

package Modul6.Percobaan;

public class Persegi extends Bentuk{

        protected int p, l; // variabel this p di kelas ini

        //Merupakan luas
        public void setSuperP(int p) { // variabel this p di kelas bentuk
            super.p = p;
        }

        public void setSuperL(int l) { // variabel this p di kelas bentuk
            super.l = l;
        }

        // Merupakan Luas yang di isi
        public void setL(int l) {
            this.l = l;
        } // variabel this p di kelas ini

        public void setP(int p) {
            this.p = p;
        } // variabel this p di kelas ini

        // Method yang nantinya akan dipanggil di kodingan main
        public void getLuas(){
            System.out.println("Luas super = "+ (super.l * super.p));
            System.out.println("Luas  = "+ (this.l * this.p));
        }
}

```

```java

public class PersegiTest {
    public static void main(String[] args){
        Persegi kotak = new Persegi();
        //Mengisikan pada variabel super P, L dan Set P,L
            kotak.setSuperP(5);
            kotak.setSuperL(10);
            kotak.setP(3);
            kotak.setL(13);

        // Method dari kodingan extends bentuk dipanggil disini
            kotak.getLuas();
        }
        
```

<hr>

**Penjelasan** : Terdapat class parent Bentuk yang di dalamnya terdapat variabel protected int p dan l. Lalu pada class Persegi yang merupakan anak dari class bentuk terdapat dua method yang digunakan untuk mengisi variabel p dan l pada class induk dengan menggunakan super yang berfungsi memanggil konstruktor atau memanggil variabel yang ada pada class induk pada super class sedangkan dua method lainnya digunakan untuk mengisi variabel yang ada pada class tersebut atau class Perseginya sebagai menyatakan variabel pada class tersebut dan satu method lainnya digunakan untuk menampilkan luas yang di dalamnya terdapat proses aritmetika yaitu perkalian. 

<hr>


<br>
2. Mendefinisikan superclass dan subclass

[Person](https://github.com/adityarizn31/20104006_Aditya-Rizkiawan-Nugraha_S1SE4A_Pemrograman2/blob/modul6/Percobaan/Person.java) <br>
[Student](https://github.com/adityarizn31/20104006_Aditya-Rizkiawan-Nugraha_S1SE4A_Pemrograman2/blob/modul6/Percobaan/Students.java) <br>
[Inherit Demo](https://github.com/adityarizn31/20104006_Aditya-Rizkiawan-Nugraha_S1SE4A_Pemrograman2/blob/modul6/Percobaan/InheritDemo.java)

Kelas Induk : 
<hr>
 
 ```java
 
 public class Person {

    protected String name;
    protected String address;

    public Person() {
        System.out.println("INSIDE PERSON : CONSTRUCTOR ");
        name = "";
        address = "";
    }

    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }


    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
 ```
 
 kelas anak : <br>
 
 ```java
 
 ublic class Students extends Person{

    public Students() {
//        super("Ini nama", "Ini alamat");
//        super();
//        super.name = "Ini nama";

        System.out.println("INSIDE STUDENT : CONSTRUCTOR");

    }
    
```

<hr>

**Penjelasan** : Pada class person yang merupakan superclass di dalamnya terdapat variabel protected String name dan String address lalu terdapat dua konstruktor yang memiliki parameter dan tidak memiliki, Pada konstruktor yang tidak berparamater digunakan menampilkan variabel yang sebelumnya menyatakan variabel pada konstruktor yang berparameter. Lalu terdapat method yang digunakan untuk menampilkan isi dari variabel dan mengisi di variabel. Sedangkan pada class anak hanya menampilkan argumen. Lalu pada mainnya terdapat object siswa dari class anak yaitu students

<br>

<hr>
3. Mengontrol Pengaksesan

[A](https://github.com/adityarizn31/20104006_Aditya-Rizkiawan-Nugraha_S1SE4A_Pemrograman2/blob/modul6/Percobaan/A.java) <br> 
[B](https://github.com/adityarizn31/20104006_Aditya-Rizkiawan-Nugraha_S1SE4A_Pemrograman2/blob/modul6/Percobaan/B.java) <br>
[Inherit Test](https://github.com/adityarizn31/20104006_Aditya-Rizkiawan-Nugraha_S1SE4A_Pemrograman2/blob/modul6/Percobaan/InheritanceTest.java)

Kelas Induk : 
<hr>

```java
public class A {
    protected int x;
    protected int y;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public void getNilai() {
        System.out.println("Nilai x : " + x + " Nilai y : " + y);
    }
```

Kelas anak : 

``` java

public class B extends A {
    private int z;

    public void setZ(int z) {
        this.z = z;
    }


    public void getJumlah() {
        System.out.println("Jumlah = " + (x + y + z));
    }

```

<hr>

**Penjelasan** : Pada kelas A terdapat variabel int x dan y yang memiliki modifier protected selanjut terdapat tiga method yang digunakan untuk mengisi variabel dengan menggunakan kata kunci this yang merupakan menyatakan variabel dari class itu lalu method getNilai yang mereturn nilai atau mengembalikan nilai. Sedangkan pada class B yang merupakan anak terdapat variabel int z dan dua method yaitu 1. mengisi nilai pada variabel z dan menjumlahkan nilai yang ada pada variabel kelas induk dan kelas anak. Pada class main nya diberikan objek dari kelas A dengna nama ortu dan B dengan nama anak lalu menampilkan Super class yang didalamnya sudah berisi nilai masing - masing variabel dengan menggunakan kata set begitu pun sama dengan sub class yang dimana diisikan nilai dan ditampilkan dengan menggunakan method get.

<hr>
4. Konstruktor tidak diwariskan 

[Parent](https://github.com/adityarizn31/20104006_Aditya-Rizkiawan-Nugraha_S1SE4A_Pemrograman2/blob/modul6/Percobaan/Parent.java) <br>
[Child](https://github.com/adityarizn31/20104006_Aditya-Rizkiawan-Nugraha_S1SE4A_Pemrograman2/blob/modul6/Percobaan/Child.java) <br>


Kodingan induk : 

```java

package Modul6.Percobaan;

public class Parent {
}
```


Kodingan anak : 

```java

public class Child extends Parent{
    int x;

    public Child() {
        super();
        x = 5;

    }
```

<hr>

**Penjelasan** : Child merupakan kelas anak dari parent yang dimana child memiliki variabel int x dan juga mendeklarasikan kata kunci this lalu menginisialisasi variabel x bernilai 5. 

<hr>


### KESIMPULAN
Kesimpulan pada praktikum ini Kita harus mengetahui terlebih dahulu modifier apa yang akan digunakan dan apakah akan menggunakan konstruktur yang berparameter atau tidak. Lalu harus memahami mana yang class untuk parent class, class anak dan class main serta penggunakan kata kunci this dan super. Mengetahui bagaimana menampilkan nilai yang sudah dinyatakan pada variabel dengan this. Dan mengetahui apa saja yang harus dilakukan get & set serta method lainnya seperti aritmetika yang akan digunakan.
