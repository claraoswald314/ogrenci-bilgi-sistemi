public class Main {
    public static void main(String[] args){
        Teacher t1 = new Teacher("şakir","90563 852 7419","TRH");
        Teacher t2 = new Teacher("murtaza","90584 321 4569","FZK");
        Teacher t3 = new Teacher("selami","90576 753 9518","KMY");

        Course tarih = new Course("tarih","101","TRH",t1);
        tarih.addTeacher(t1);
        Course fizik = new Course("fizik","202","FZK",t2);
        fizik.addTeacher(t2);
        Course kimya = new Course("kimya","303","KMY",t3);
        kimya.addTeacher(t3);

        Student student1 = new Student("inek şaban","1001","4",tarih, fizik,kimya);
        Student student2 = new Student("güdük necmi","1001","4",tarih,fizik,kimya);

        student1.addBulkExamNote(65,75,80,45,55,75);
        student1.isPass();
        student2.addBulkExamNote(34,45,78,89,90,100);
        student2.isPass();


    }
}
