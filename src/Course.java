public class Course {
    Teacher t1;
    String name;
    String code;
    String prefix;
    int note;

    Course(String name,String code,String prefix){
       this.name=name;
       this.code=code;
       this.prefix=prefix;
       this.note = 0;

    }

    void addTeacher(Teacher t1){
        if(t1.branch.equals(this.prefix)){
            this.t1=t1;

        }
        else{
            System.out.println("BU DERSE BU HOCA GIREMEZ...");
        }

    }

        void printTeacherInfo(){
            this.t1.print();
        }

        void print2(){
        System.out.println("BU DERSIN ADI : "+this.name);
        System.out.println("BU DERSIN CODE : "+this.code);
        System.out.println("BU DERSIN PREFIXI : "+this.prefix);
        }

}
