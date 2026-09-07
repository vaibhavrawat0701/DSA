public class App  {
    public static void main(String[] args) throws Exception{
        //System.out.println("Hello, World");
        //Default ctor
//        Student A = new Student();
//        A.id=1;
//        A.age=14;
//        A.name="Vaibhav";
//        A.nos=7;
//        System.out.println(A.name);
//        System.out.println(A.age);
//        System.out.println(A.id);
//        System.out.println(A.nos);
//
//        A.bunk();
//        A.study();
//        A.sleep();

        Student B = new Student(1,12, "Vaibhav");
        System.out.println(B.name);
       System.out.println(B.age);
      System.out.println(B.id);
       System.out.println(B.nos);

       //COPY CONSTRUCTOR

        Student C = new Student( B);
        System.out.println(C.name);
        System.out.println(C.age);
        System.out.println(C.id);
        System.out.println(C.nos);
    }
    }



