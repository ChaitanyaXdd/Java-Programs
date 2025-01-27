class ParentClass
{

   public ParentClass()
   {
       System.out.println("Default Parent Class Constructor");
   }

   public ParentClass(int a)
   {
       System.out.println("Parameterized Parent Class Constructor");
   }

}

class SubClass extends ParentClass {
    SubClass()
    {

        super(13);
        // Default parent class constructor will be executed
        System.out.println("Default Sub class Constructor");
    }

    SubClass(int b)
    {
        //super()

        System.out.println("Parameterized SubClass Constructor");
    }

    }
    public class Constructor1 {
        public static void main(String[] args) {
      //  ParentClass p = new ParentClass();
       // ParentClass p1 = new ParentClass(8);
            SubClass s = new SubClass();
          //  SubClass s1 = new SubClass(7);
        }
}

