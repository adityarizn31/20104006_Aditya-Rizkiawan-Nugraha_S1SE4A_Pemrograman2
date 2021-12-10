## 20104006_Aditya-Rizkiawan-Nugraha_S1SE4A_Pemrograman2
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
