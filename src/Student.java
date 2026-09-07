public class Student{
    //Attributes
    public int id;
    public String name;
    public int age;
    public int nos;

    //Default Constructor
    public Student(){
        System.out.println("Default Constructor");
    }

    //Method /Behavior
    public void study(){
        System.out.println(name + "studying");
    }
    public void sleep() {
        System.out.println(name + "sleeping");
    }


        public void bunk(){
            System.out.println(name + "bunking");
        }
    }