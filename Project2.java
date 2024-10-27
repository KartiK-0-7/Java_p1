import java.util.*;

public class Project2 {
    static class Student {
        private int id;
        private String name;

        void set(String a, int b){
            name = a;
            id = b;
        }

        void show() {
            System.out.println("Name is: " + name + " with id: " + id);
        }
    }

    static class Box {
        int length;
        int height;
        int breadth;
        
        public Box(){
            this.breadth = 1;
            this.height = 1;
            this.length = 1;
        }

        public Box(int a, int b, int c){
            this.length = a;
            this.breadth = b;
            this.height = c;
        }
        
        void vol(){
            System.out.println("Volume is: " + length * breadth * height);
        }
        
        class Cube extends Box {
            public Cube(int a){
                length = breadth = height = a;
            }
        }
    }
    interface Learnable{
       public void learn();
    }
    public static class coding implements Learnable{
        public void learn(){
            System.out.println("Coding can be learned");}
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is name and id");
        String n = input.nextLine();
        int i = input.nextInt();

        Project2.Student obj1 = new Project2.Student();
        obj1.set(n, i);
        obj1.show();
        
        // Creating an instance of Box
        Box mybox1 = new Box(2, 3, 5);

        // Using mybox1
        System.out.println("Box dimensions: " + mybox1.length + "," + mybox1.breadth + "," + mybox1.height);
        mybox1.vol();   
        
        // Creating an instance of Cube
        Box.Cube c = mybox1.new Cube(5);
        c.vol();
        Learnable java=new coding();
        java.learn();
        Learnable l2=()->{
            System.out.println("Learning!!!!");
        };
        l2.learn();
    }
}
