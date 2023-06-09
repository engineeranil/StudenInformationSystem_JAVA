public class Main {
    public static void main(String[] args) {
        Teacher teach = new Teacher("OMAR ABDULLAH","0531","BDN");
        Teacher teach2 = new Teacher("HASBULLAH NURMAGEDOV","0333","MATH");
        Teacher teach3 = new Teacher("SEVSENKO","03921","BIO");

        Course beden = new Course("BEDEN DERSI","101","BDN");

        Course matematık = new Course("MATEMATIK DERSI","102","MATH");

        Course bıyolojı = new Course("BIYOLOJI DERSI","101","BIO");


        Student s1 = new Student("ANIL","212501029","E",beden,matematık,bıyolojı);
        s1.printNote();
        //s1.addBulkExamNote(100,100,100);
        //s1.isPass();


    }
}
