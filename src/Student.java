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

    //parameterised ctor
    public Student(int id , int age, String name){
        System.out.println("Student parameterised ctor called");
        this.id=id;
        this.name=name;
        this.age=age;
    }

    //copy constructor
    public Student(Student copy){
        System.out.println("Student copy ctor called");
        this.id=copy.id;
        this.name= copy.name;
        this.age= copy.age;
    }

    //Method /Behavior
    public void study(){
        System.out.println(name + " studying");
    }
    public void sleep() {
        System.out.println(name + " sleeping");
    }


        public void bunk(){
            System.out.println(name + " bunking");
        }
    }
