package Modul4.Latihan;

public class mainStudentRecord {
    public static void main(String[] args) {
        StudentRecord Aditya = new StudentRecord();
        StudentRecord ini = new StudentRecord();
        StudentRecord Rizkiawan = new StudentRecord();
        StudentRecord nilai = new StudentRecord();

        System.out.println("<========== HASIL RUN ==========>");

        Aditya.setName("Aditya");
        ini.setName("ini");
        Rizkiawan.setName("Nama");

//        nilai.setMathGrade(90.33);
//        nilai.setEnglishGrade(89.5);
//        nilai.setScienceGrade(90.1);
          nilai.setStudentCount(56, 55, 98);


          System.out.println("Nama peserta ujian = " + Aditya.getName());
//        System.out.println("Rata - rat nilai hasil ujian = " + nilai.getAverage());
          System.out.println("Hitung = " + StudentRecord.getStudentCount());

    }
}
