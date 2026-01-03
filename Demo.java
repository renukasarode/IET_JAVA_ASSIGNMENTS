class Demo{
public static void main(String [] args)
{
if(args.length>0)
{
System.out.println("first argument is " +args[0]);

}
else{
System.out.println("no arguments are provided ");
}

int num = Integer.parseInt(args[0]);
DisplayTable(num);


}
public static void DisplayTable(int n)
{
for(int i=1;i<=20;i++)
{
System.out.println(n + "*" + i + " = " + (n*i));
}
}
}