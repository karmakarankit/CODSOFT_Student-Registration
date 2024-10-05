import java.util.*;
class studentregistration
{
    public static void main(String ar[])
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter your name");
        String name=ob.nextLine();
        System.out.println("enter your age");
        int age=ob.nextInt();
        System.out.println("1 for python");
        System.out.println("2 for JAVA");
        System.out.println("3 for Tonoy khankimagi");
        System.out.println("enter your choice");
        int a=ob.nextInt();
        if(a==1)
        {
            System.out.println(name);
            System.out.println(age);
            System.out.println("python");
        }
        else if (a==2) 
        {
            System.out.println(name);
            System.out.println(age);
            System.out.println("JAVA");
    
        }
        else if (a==3) 
        {
            System.out.println(name);
            System.out.println(age);
            System.out.println("Tonoy khankimagi");  
        }
        else
        {
            System.out.println("invalid option");
        }
    }
}