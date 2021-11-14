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

[Bentuk]() <br> 
[Persegi]() <br>
[Persegi Test]()


Penggunaan this dan super:  
<hr>

```java

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

**Penjelasan** : 


<br>
2. Mendefinisikan superclass dan subclass

[Person]() <br>
[Student]() <br>
[Inherit Demo]()

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

**Penjelasan** : 

<br>

<hr>
3. Mengontrol Pengaksesan

[A]()<br>
[B]()

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
4. Konstruktor tidak diwariskan 

[Parent]() <br>
[Child]() <br>



### KESIMPULAN
Kesimpulan pada praktikum kedua ini mahasiswa harus jeli dengan method yang dibuat, variabel yang digunakna dan alur / algoritma program yang berjalan.Selain itu harus paham juga dan mengerti detai - detail dari alur pemrograman. Di dalam PBO kode dan data diatur menggunakan method sehingga dapat bekerja untuk menghasilkan program yang digunakan menyelesaikan masalah selain itu memodelkan sistem menjadi suatu objek yang dimana menjadi solusi dalam penyelesaian. 
