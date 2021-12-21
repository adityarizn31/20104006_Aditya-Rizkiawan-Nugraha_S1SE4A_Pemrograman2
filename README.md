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
Jika metode dimaksudkan untuk menangkap Exception yang dilempar metode yang dipanggil maka pemanggilan harus ditempatkan di blok try. <br>
Jika Exception dilempar, Exception itu ditangani blok catch. Blok - blok catch menangani tipe - tipe exception berbeda. 

Contoh <br>
```java
try {
      //Pemanggilan metode yang menghasilkan exception
      //Dilakukan disini
} catch (Exception e) {
      //Penanganan terhadap exception
      //Dilakukan disini
}
```

* Finally <br>
Java menyediakan klausa finally untuk menandai blok itu selalu dieksekusi. Pada situasi yang biasa / normal (tidak ada catch /exception yang dilempar) blok finally akan dieksekusi segera setelah blok try sedangkan jika terdapat catch maka exception dilempar, blok finally dieksekusi setelah blok catch yang menangani exception dilakukan. 

Contoh <br>

```java
try {
      //Pemanggilan metode yang menghasilkan exception
      //Dilakukan disini
} catch (Exception e) {
      //Penanganan terhadap exception
      //Dilakukan disini
} finally {
      //Blok kode yang
      //Selalu harus dieksekusi
```

* Throw & Throws <br>
Kata kunci **throw** digunakan di program untuk melempar (throw) exception secara eksplisit. Bentuk umum kalimat adalah : <br>
```java
throw ThrowableInstance;
```

Instan throw ini harus merupakan objek dengan tipe throwable adapun cara memperoleh objeknya yaitu : 
1. Menggunakan parameter clausa Catch
2. Menciptakan salah satu dengan menggunakan operator new();

Eksekusi progam akan dihentikan segera setelah kalimat throw, kalimat setelah throw tidak dieksekusi. <br>

Kata kunci **Throws** Jika metode menghasilkan exception metode harus menspesifikasikan perilaku ini sehingga pemanggil metode itu dapat dipaksa agar menghadapi exception. Memberikan klausa throws di deklarasi metode. 

<hr>

### PRAKTIKUM PERCOBAAN TIPE TIPE EXCEPTION

<hr>

1. Percobaan2 || Penggunaan Blok Try-Catch

Class main : <br>
```java
package Modul9.Percobaan;

public class Percobaan2 {
    public static void main(String[] args) {
        int a[] = new int[5];

        try {
            a[5] = 100;
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Indeks array melebih batas");
        }
        System.out.println("Setelah blok try-catch");
    }
}
```
<br>

2. Percobaan2 || Penggunaan Finally

Class main : <br>
```java
package Modul9.Percobaan;

public class Percobaan_finally {
    public static void main(String[] args) {
        int a[] = new int[5];

        try {

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Terjadi exception karena indeks melebih batas");
        } finally {
            System.out.println("Selalu dijalankan");
        }
        System.out.println("Setelah blok try-catch");
    }
}
```
<br>

3. Percobaan2 || Penggunaan Throw dan Throws

Class method1 dan main: <br>
```java
package Modul9.Percobaan;

import java.io.FileNotFoundException;
import java.security.PublicKey;

public class Percobaan_throws {

    public static void method1() throws FileNotFoundException {
        throw new FileNotFoundException("File tidak ada");
    }
    public static void main(String[] args) {
        try {
            method1();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
```

<br>

<hr>

### PRAKTIKUM PERCOBAAN

<hr>

4. Percobaan 1

Class main : <br>
```java
package Modul9.Percobaan;

public class Percobaan1 {
    public static void main(String[] args) {
        int a[] = new int[5];

        try {
            a[5] = 100;
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Indeks Array melebihi batas");
        }
    }
}

```

6. Percobaan 2 & Percobaan2.2

Class main : <br>
```java
package Modul9.Percobaan;

public class Percobaan2 {
    public static void main(String[] args) {
        int bil = 10;
        System.out.println(bil / 0);


    }
}

```

Class main : <br>
```java
package Modul9.Percobaan;

public class Percobaan22 {
    public static void main(String[] args) {
        int bil = 10;

        try {
            System.out.println(bil / 0);
        } catch (ArithmeticException A) {
            System.out.println("Bilangan tidak boleh dibagian dengan angka 0");
        }
    }
}
```

8. Percobaan 3

Class main : <br>
```java
package Modul9.Percobaan;

public class Percobaan3 {
    public static void main(String[] args) {
        int bil = 10;

        try {
            System.out.println(bil / 0);
        } catch (ArithmeticException e) {
            System.out.println("Tidak boleh membagi bilangan dengan 0");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Terdapat Error");
        }
    }
}
```

9. Percobaan 4

Class main : <br>
```java
package Modul9.Percobaan;

public class Percobaan4 {
    public static void main(String[] args) {
        int bil = 10;

        try {
            System.out.println(bil / 0);
        } catch (ArithmeticException e) {
            System.out.println("Tidak boleh membagi bilangan dengan 0");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Terdapat Error");
        }
    }
}
```

<hr>

### PERCOBAAN LATIHAN

<hr>

10. Percobaan melempar CheckedException

Class main : <br>

```java
package Modul9.Latihan;

import java.io.FileNotFoundException;

public class Melempar_CheckedException {

    public static void method1() throws FileNotFoundException {
        throw new FileNotFoundException("File tidak ada");
    }

    public static void main(String[] args) {
        try {
            method1();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
```

11. Percobaan melempar UncheckedException

Class main : <br>
```java
package Modul9.Latihan;

import java.util.Scanner;

public class Melempar_UncheckedException {
    public static void main(String[] args) {
        Scanner asupkeun = new Scanner(System.in);

        try {
            System.out.println("Masukan angka = ");
            int nilai = asupkeun.nextInt();

            if (nilai > 10) throw new Exception();
            System.out.println("Angka kurang dari atau sama dengan 10");
        } catch (Exception s) {
            System.out.println("Angka lebih dari 10");
            System.out.println("Selesai");

        }
    }
}
```

12. Percobaan menangkap Exception

Class main : <br>

```java
package Modul9.Latihan;

import javax.swing.*;

    class ExceptionA extends Exception {
    }

    class ExceptionB extends ExceptionA {
    }

    class ExceptionC extends ExceptionB {
    }

public class Inheritance_MenangkapException {

    public static void main(String[] args) {
        try {
            throw new ExceptionC();
        } catch (ExceptionA a) {
            JOptionPane.showMessageDialog(null, a.toString(), "Exception", JOptionPane.INFORMATION_MESSAGE);
        }
        try {
            throw new ExceptionB();
        } catch (ExceptionA b) {
            JOptionPane.showMessageDialog(null, b.toString(), "Exception", JOptionPane.INFORMATION_MESSAGE);
        }
        System.exit(0);
    }
}
```

<hr>

### Kesimpulan 

<hr>
