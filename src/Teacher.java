public class Teacher {
    String name;
    String phonenum;
    String branch;
    Teacher(String name,String phonenum,String branch){
        this.name = name;
        this.phonenum = phonenum;
        this.branch = branch;

    }

    void print(){
        System.out.println("Hocanin adi : "+this.name);
        System.out.println("Hocanin telefon numarasi :"+this.phonenum);
        System.out.println("Hocanin bransi : "+this.branch);
    }
}
