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

**Penjelasan :**

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

**Penjelasan :**

<hr>
