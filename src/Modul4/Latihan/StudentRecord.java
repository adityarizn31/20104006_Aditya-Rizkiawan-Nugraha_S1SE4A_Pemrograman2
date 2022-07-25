package Modul4.Latihan;

public class StudentRecord {
    private String name;
    private String address;
    private int age;
    private double MathGrade;
    private double EnglishGrade;
    private double ScienceGrade;
    private double average;
    private static int studentCount;

    public String getName(){ // Digunakan hanya untuk mengembalikan nilai
        return name;
    }


    public void setName(String temp){ // Digunakan untuk mengisi nilai kepada variabel di main
        name = temp;
    }


    public void setMathGrade(Double temp) { // Digunakan untuk mengisi nilai kepada variabel di main
        MathGrade = temp;
    }

    public void setEnglishGrade(double nilaieng) { // Digunakan untuk mengisi nilai kepada variabel di main
        EnglishGrade = nilaieng;
    }

    public void setScienceGrade(double nilaisci) { // Digunakan untuk mengisi nilai kepada variabel di main
        ScienceGrade = nilaisci;
    }

    public void setStudentCount(int nilai1, int nilai2, int nilai3){ // Digunakan untuk mengisi nilai kepada variabel di main
        studentCount = nilai1 + nilai2 + nilai3;
    }

    public double getAverage(){
        double result = 0;
        result = ( MathGrade + EnglishGrade + ScienceGrade ) / 3;
        return result;
    }

    public static int getStudentCount(){
        return studentCount  / 3;
    }

    /* Cara lain untuk mengembalikan nilai
    public double getStudentCount(){
        double average = 0;
        average = (MathGrade + EnglishGrade + ScienceGrade ) /3;
        return average;
    }
     */
}
