package patika;

public class Student {
    Course c1;
    Course c2;
    Course c3;

    String name;
    String stuno;
    String classes;
    double average;
    boolean isPass;

    Student(String name, String stuno, String classes, Course c1, Course c2, Course c3){
        this.name = name;
        this.stuno = stuno;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        calcAverage();
        this.isPass = false;

    }
    public void addBulkVerbalNote(int verb_mat, int verb_fizik, int verb_kimya){
        if (verb_mat >= 0 && verb_mat <= 100) {
            this.c1.quiz = verb_mat;
        }

        if (verb_fizik >= 0 && verb_fizik <= 100) {
            this.c2.quiz = verb_fizik;
        }

        if (verb_kimya >= 0 && verb_kimya <= 100) {
            this.c3.quiz = verb_kimya;
        }
    }
    void addBulkExamNote(int note1, int note2, int note3){
        if (note1 >=0 && note1 <= 100){
            this.c1.note = note1;
        }
        if (note2 >=0 && note2 <= 100){
            this.c2.note = note2;
        }
        if (note3 >=0 && note3 <= 100){
            this.c3.note = note3;
        }

    }

    public void isPass() {
        if (this.c1.note == 0 || this.c2.note == 0 || this.c3.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.average);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAverage(){
        double mat_ave = this.c1.note * 0.75 + this.c1.quiz * 0.25;
        double fzk_ave = this.c2.note * 0.8 + this.c2.quiz * 0.2;
        double bio_ave = this.c3.note * 0.7 + this.c3.quiz * 0.3;
        double _average = (mat_ave + fzk_ave + bio_ave) / 3;
        this.average = Math.round( _average*100)/100d;
        }

    public boolean isCheckPass() {
        calcAverage();
        return this.average > 55;
    }

    void printNote() {
        System.out.println("öğrenci : " + this.name);
        System.out.println(this.c1.name + " Notu\t: " + this.c1.note+" sözel notu : " +this.c1.quiz+ "   Oran ==> sınav %75  sözlü %25");
        System.out.println(this.c2.name + " Notu\t: " + this.c2.note+" sözel notu : " +this.c2.quiz+ "   Oran ==> sınav %80  sözlü %20");
        System.out.println(this.c3.name + " Notu\t: " + this.c3.note+" sözel notu : " +this.c3.quiz+ "   Oran ==> sınav %70  sözlü %30");
        System.out.println("ortalamaniz : "+ this.average);
    }
}
