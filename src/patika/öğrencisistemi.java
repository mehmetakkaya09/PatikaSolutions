package patika;

public class öğrencisistemi {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("mahmut hoca", "555", "trh");
        Teacher t2 = new Teacher("Graham Bell", "0000", "fzk");
        Teacher t3 = new Teacher("kulyutmaz", "1111", "bio");

        Course tarih = new Course("Tarih", "101", "trh");
        tarih.addTeacher(t1);
        Course fizik = new Course("fizik", "102", "fzk");
        fizik.addTeacher(t2);
        Course biyo = new Course("biyoloji", "101", "bio");
        biyo.addTeacher(t3);

        Student s1 = new Student("inek saban", "123", "4", tarih, fizik, biyo);
        s1.addBulkExamNote(100,78,50);
        s1.addBulkVerbalNote(100,50,60);
        s1.isPass();

        Student s2 = new Student("güdük necmi", "444", "4", tarih, fizik, biyo);
        s2.addBulkExamNote(50,30,70);
        s1.addBulkVerbalNote(90,65,82);
        s2.isPass();
    }

    }
