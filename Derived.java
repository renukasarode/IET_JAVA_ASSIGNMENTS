class Derived extends Base{
int derived =10;

}

class ObjectBase{
public static void main(String [] args)
{
   Derived d1 = new Derived();
   System.out.println(d1.derived);
 System.out.println(d1.num);

}
 
}