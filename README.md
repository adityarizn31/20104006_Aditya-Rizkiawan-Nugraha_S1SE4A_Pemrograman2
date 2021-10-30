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
4. Membuat dua class bernama StudentRecord dan MainStudentRecord || Menganalisa dan tentukan konsep apa saja yang digunakan pada (Modul 4) dan alasan mengapa hasil nya seperti itu !!!

[StudentRecord](https://github.com/adityarizn31/20104006_Aditya-Rizkiawan-Nugraha_S1SE4A_Pemrograman2/blob/modul4/Latihan/StudentRecord.java) <br>
[MainStudentRecord](https://github.com/adityarizn31/20104006_Aditya-Rizkiawan-Nugraha_S1SE4A_Pemrograman2/blob/modul4/Latihan/mainStudentRecord.java)

Hasil run ketika belum diubah menampilkan  : 
<hr>

Nama : Aditya <br>
Hitung = 0

<hr>

Pada modul 4 ini konsep yang digunakan : 
<br> (1.) Konsep Instansiasi Objek <br>
Merupakan membuat objek dari tipe kelas yang sudah didefinisikan. Di dalam instansiasi ini terdapat dua tahap :
<br> - Mendeklarasikan variabel sebagai referensi ke objek dari kelas bersangkutan
<br> - Menginstansiasi menggunakan operator 'new' memasukan ke dalam variabel
<br> Contoh : Aditya sukses = new Aditya(); <br>

<br> (2.) Konsep Constructor Berparameter <br>
Merupakan method khusus yang didefinisikan dalam kelas dan akan dpanggil secara otomatis tiap kali terjadi instansiasi objek. Berfungsi melakukan inisialisasi nilai terhadap data - data yang terdapat pada kelas yang bersangkutan. Di dalam kelas Tabungan terdapat dua constructor yang memiliki parameter yang berbeda. <br>
<br> Contoh : <br>

    Tabungan(String nama,  int noRekening) { // Constructor berparameter
        this.nama = nama;
        this.noRekening = noRekening;
    }

<br> (3.) Konsep Method dan Method Berparameter <br>
Dalam sebuah program method dapat bisa memiliki satu bahkan lebih yang dapat bersifat dinamis dan general yang bisa mengembalikan nilai atau tidak. Selain itu tiap method memilki tugas masing masing dan lebih spesifik. <br>

     public void setScienceGrade(double nilaisci) { // Digunakan untuk mengisi nilai kepada variabel di main 
         ScienceGrade = nilaisci; 
     } 

<br> (4.) Konsep Overload Constructor <br>
Dalam program di atas terdapat ada dua constructor yang mengembalikan tipe kelas (dirinya sendiri) selain itu memiliki parameter yang berbeda - beda. Overload merupakan penulisan beberapa fungsi (dua atau lebih) yang memiliki nama yang sama. <br>

    Tabungan(String nama,  int noRekening) { // Constructor berparameter
        this.nama = nama;
        this.noRekening = noRekening;
    }
    
    

    Tabungan(String nama, int noRekening, int saldo, int pin) { // Constructor berparameter
        this.nama = nama;
        this.noRekening = noRekening;
        this.saldo = saldo;
        this.pin = pin;
    }

<br>

* Penjelasan Hasil Run <br>
Hasil setelah diRun yaitu "Hitung = 0" Kenapa ?? <br>
Karena pada program main tidak adanya kode untuk menginputkan sebuah nilai dan pada class StudentRecord tidak ada method untuk menginputkan beberapa nilai <br>

Jika ditambahkan seperti ini pada bagian main : <br> 
        nilai.setMathGrade(90.33); <br>
        nilai.setEnglishGrade(89.5); <br>
        nilai.setScienceGrade(90.1); <br>
        
Dan ditambahkan kodingan dibawah ini pada bagian StudentRecord : <br>

    public void setMathGrade(Double temp) { // Digunakan untuk mengisi nilai kepada variabel di main
        MathGrade = temp;
    }
    
    public void setEnglishGrade(double nilaieng) { // Digunakan untuk mengisi nilai kepada variabel di main
        EnglishGrade = nilaieng;
    }
    
    public void setScienceGrade(double nilaisci) { // Digunakan untuk mengisi nilai kepada variabel di main
        ScienceGrade = nilaisci;
    }
    
    
<hr>

<========== HASIL RUN ==========> <br>
Nama peserta ujian = Aditya <br>
Rata - rat nilai hasil ujian = 89.97666666666665 <br>

[Hasil Running1](https://user-images.githubusercontent.com/92510019/139537416-d11c4660-35b7-44a5-802a-3df308dfaa43.png) <br>

<hr>

Ataupun dengan cara : <br> 

    public void setStudentCount(int nilai1, int nilai2, int nilai3) { // Digunakan untuk mengisi nilai kepada variabel di main
        studentCount = nilai1 + nilai2 + nilai3;
    }
    
<hr>

<========== HASIL RUN ==========> <br> 
Nama peserta ujian = Aditya <br>
Hitung = 69 <br>

[Hasil Running2](https://user-images.githubusercontent.com/92510019/139537755-eb3d4abd-6a1e-403c-bd7c-05d0521a9300.png) <br>

<hr>

    
        



### KESIMPULAN
Kesimpulan pada praktikum ketiga modul 4 ini mahasiswa harus mengerti terlebih dahulu apa itu class, objek, variabel, method, constructor dan overload. Karena pada modul ini menggunakan semua konsep yang di atas. Selain itu harus memahami alur pemrograman dari set, get dan paham bagian mana yang harus di isi oleh user serta method yang void dan non-void.
