# 20104006_Aditya-Rizkiawan-Nugraha_S1SE4A_Pemrograman2
Mata kuliah Pemrograman2

### DASAR TEORI 
* Konsep Dasar Polimorfisme <br>
Menyatakan suatu nama yang merujuk pada beberapa fungsi yang berbeda. Pada polimorfisme ini rujukan dapat dilakukan pada objek - objek. Hal ini dikarenakan setiap objek dimungkinkan memiliki instruksi yang berbeda. Dalam mengimplementasikan polimorfisme perlu diperhatikan sebagai berikut : 
1. Method yang dipanggil harus **melalui variabel dari Super class** 
2. Method yang dipanggil juga harus merupakan **method yang ada pada Super Class**
3. Signature method harus sama baik yang ada pada super class maupun di subclass
4. Method acces attribute pada subclass tidak boleh lebih terbatas dari pada yang ada pada super class

* Virtual Method Invocation <br>
VMI ini bisa terjadi jika polimorphisme dan overriding  pada saat objek yang sudah dibuat tersebut memanggil overriden method pada parent class. Kompiler java akan melakukan invocation (pemanggilan) terhadap overriding method pada subclass dimana yang seharusnya dipanggil adalah overriden method. 


* Polymorphic Arguments <br>
Merupakan tipe suatu parameter yang menerima suatu nilai yang bertipe subclassnya. 


* Penyataan Instance Of
Instance OF merupakan operator yang dapat digunakan untuk mengoperasikan dua buah tipe data reference selain itu digunakan dalam proses sebelum dilakukan downcast dari subtype ke supertype supaya tidak terjadi ClassCastException. 

* Casting Object
Mengubah tipe deklarasi class pada suatu objek atau memperbolehkan untuk membuat objek dari subclass untuk diberikan ke variabel acuan tipe superclass. 

<hr>

### PRAKTIKUM PERCOBAAN

<hr>

Soal : <br>

1. Virtual Method Invocation <br>
Class Parent
```java
package Modul8.Percobaan;

public class Parent {
    int x = 5;
    public void info() {
        System.out.println(" INI CLASS PARENT ");
    }
}
```

Class Child
```java
public class Child extends Parent{
    int x = 10;

    public void info() {
        System.out.println(" INI CHILD ");
    }
}


```

Class Test
```java
package Modul8.Percobaan;

public class Test {

    public static void main(String[] args) {
        Parent kelas = new Child();
        System.out.println("Nilai x : " + kelas.x);
        kelas.info();
    }
}
```
<hr>

**Penjelasan** = Terdapat dua class bernama parent dan child yang dimana dua kelas tersebut menerapkan konsep Inheritance karena terdapat penggunaan extends pada class child terhadap parent. Selanjutnya pada class Parent terdapat variabel x yang di inisialisasi = 5 lalu terdapat method void info yang menampilkan " Ini Class Parent " sedangkan pada kelas child terdapat variabel x juga yang di inisialisasi 10 dan ada method info menampilkan " Ini Class Child ".

<hr>

2. Polymorphics Arguments

Class Pegawai : 
```java
package Modul8.Latihan;

public class Pegawai {
}
```
Class Manajer Extends Pegawai
```java
package Modul8.Latihan;

public class Manajer extends Pegawai{
}
```
Class Tes
```java
package Modul8.Latihan;

public class Tes {
    public static void Proses (Pegawai peg) {

    }

    public static void main(String[] args) {
        Manajer man = new Manajer();
        Proses(man);
    }
}
```

<hr>

**Penjelasan :** Pada kodingan main hanya terdapat Objek dari kelas Manajer yaitu man dan memanggil method proses di kelas Tes. 

<hr>

3. Pernyataan InstanceOff 

Class Kurir
```java
package Modul8.Latihan;

public class Kurir extends Pegawai{

}
```

Class Tes2
```java
package Modul8.Latihan;

public class Tes2 {
    public static void Proses(Pegawai peg) {
        if (peg instanceof Manajer) {
            System.out.println("Melakukan Tugas - tugas Manajer");
        } else if (peg instanceof Kurir) {
            System.out.println("Melakukan tugas tugas kurir");
        } else {
            System.out.println("Melakukan tugas lainnya");
        }
    }

    public static void main(String[] args) {
        Manajer man = new Manajer();
        Kurir kur = new Kurir();
        Proses(man);
        Proses(kur);
    }
}
```

<hr>

**Penjelasan :** Pada kodingan main terdapat method proses dengan parameter dari kelas Pegawai yaitu peg lalu didalamnya terdapat percabangan yang berkondisikan instance off berupa perbandingan suatu objek yang instansiasi nya dari class atau tidak. Hasil perbandingan nya akan menampilkan boolean true dan false.

<hr>

<hr>

### PRAKTIKUM LATIHAN

<hr>

4. Class Pegawai
```java
package Modul8.Latihan.VIM;

public class Pegawai {

    private String name;
    private String address;
    private int number;
    private double salary;


    public Pegawai(String name, String address,  int number, double salary) {
        this.name = name;
        this.address = address;
        this.number = number;
        this.salary = salary;
    }


    public void MailCheck() {
        System.out.println("Memeriksa kelas gaji dalam surat ");
        System.out.println("Surat tertuju untuk " + this.name + " dengan gaji " + salary);
    }

    public String toString() {
        return name + " " + address + " " + number;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String newAddres) {
        address = newAddres;
    }

    public int getNumber() {
        return number;
    }

    public double getSalary() {
        return salary;
    }
}

```

Class Gaji extends Pegawai
```java
package Modul8.Latihan.VIM;

public class Gaji extends Pegawai{

    private double salary; // Gaji Tahunan

    public Gaji(String name, String address, int number, double salary ) {
        super(name, address, number, salary);
        this.salary = salary;
        System.out.println("Menyusun Pegawai");
    }

    public void MailCheck() {
        System.out.println("Memeriksa Kelas gaji dalam Surat ");
        System.out.println("Surat tertuju untuk " + getName() + " dengan gaji " + salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double newSalary) {
        if (newSalary >=0.0) {
            salary = newSalary;
        }
    }

    public double computePay() {
        System.out.println("Menghitung pembayaran gaji untuk " + getName());
        return salary/52;
    }
}

```

Class Demo
```java
package Modul8.Latihan.VIM;

public class Demo {

    public static void main(String[] args) {

        Gaji s = new Gaji("Aditya", "Majalengka", 1, 80000);

        Pegawai e = new Pegawai("Fadli", "Kadipaten", 2, 25000);

        System.out.println("\nMemanggil mailcheck berdasarkan referensi Gaji--");

        s.MailCheck();

        System.out.println("\nMemanggil mailcheck berdasarkan referensi Pegawai--");

        e.MailCheck();


    }
}

```

Hasil Running : 
![image](https://user-images.githubusercontent.com/92510019/145916288-c610ee9a-e15a-4526-9b08-c8fbba5b2504.png)

<hr>

**Penjelasan :** Pada kelas pegawai mendeklarasikan terlebih dahulu variabel yang akan digunakan yaitu String name, String address, int number dan double salary. Selanjutnya terdapat konstraktor Pegawai dengan parameter variabel yang telah di deklarasikan dan terdapat this yang digunakan untuk referensi kelas itu sendiri. Lalu terdapat method mailcheck yang dimana akan menampilkan gaji dan surat kepada variabel nama yang diisi di kelas main. Selanjutnya terdapat get dan set name, address dan salary. Sedangkan pada kelas gaji yang merupakan extends dari Pegawai terdapat variabel double salary dan konstraktor Gaji dengan parameter nama, address int number dan salary. Lalu diaakukan pemanggilan untuk mereferensikan diri dari kelas induk dan menggunakan this pada variabel salary. Setelah itu terdapat method mailcheck yang dimana akan menampilkan kelas gaji dan surat dengan jumlah gaji yang ada pada main. Selanjutnya ada get dan set salary. Pada set salary terdapat percabangan dan pada kelas demo menginisialisasi kan tiap tiap variabel ke dalam masing masing kelas dengan menggunakan objek s untuk kelas gaji dan e kelas pegawai selanjutnya memanggil method method yang pada masing " kelas.

<hr>

**Kesimpulan**
Langkah pertama harus mendeklarasikan terlebih dahulu variabel yang akan digunakan dan jika terdapat konstraktor dengan menggunakan parameter variabel maka akan menggunakan this untuk mereferensikan variabel kelasnya lalu jika ingin menggunakan di kelas extends maka harus menggunakan super dengan mereferensikan variabel dari kelas induk. Sedangkan pada penggunaan InstanceOff harus menggunakan parameter dan variabel yang ada pada kodingan main lalu dilakukan membuat objek dari tiap masing - masing kelas dan method. Dan pada percobaan kelas main terdapat objek dengan menggunakan parent namun dibagian new menggunakan kelas extends.
