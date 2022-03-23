
package Maidul2;

class A2 extends Thread
{
    public void run(){ 
        for (int i = 1; i<=5; i++)
        {
        System.out.println("\t From Thread  A: i= " +i);  
        }
        System.out.println("Exit from A");
    }
}
class B2 extends Thread
{
    public void run(){ 
        for (int j = 1; j<=5; j++)
        {
        System.out.println("\t From Thread  B: j= " +j);  
        if (j == 1)
            try
            {
                sleep(1000);
            }
        catch(Exception e)
            {
                    
            }
        }
        
        System.out.println("Exit from B");
    }
}
class C2 extends Thread
{
    public void run(){ 
        for (int k = 1; k<=5; k++)
        {
        System.out.println("\t From Thread  C: k= " +k);  
        if (k == 1)
            try
            {
                sleep(2000);
            }
        catch(Exception e)
            {
                    
            }
        }
        
        System.out.println("Exit from C");
    }
}
public class C_work extends Thread {
    public static void main(String args[ ])
    {
        new A2( ).start( );
        new B2( ).start( );
        new C2( ).start( );
    } 
}