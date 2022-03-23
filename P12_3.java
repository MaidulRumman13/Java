class A1 extends Thread
{
    public void run(){ 
        System.out.println("threadA started");
        for (int i = 1; i<=4; i++)
        {
        System.out.println("\t From Thread  A: i= " +i);  
        }
        System.out.println("Exit from A");
    }
}
class B1 extends Thread
{
    public void run(){ 
        System.out.println("threadB started");
        for (int j = 1; j<=4; j++)
        {
        System.out.println("\t From Thread  B: j= " +j);  
        }
        System.out.println("Exit from A");
    }
}
class C1 extends Thread
{
    public void run(){ 
        System.out.println("threadB started");
        for (int k = 1; k<=4; k++)
        {
        System.out.println("\t From Thread  C: k= " +k);  
        }
        System.out.println("Exit from A");
    }
}
public class P12_3 
{
    public static void main(String arg[ ])
    {
        A1 threadA = new A1( );
        B1 threadB = new B1( );
        C1 threadC = new C1( );

        threadC.setPriority(Thread.MAX_PRIORITY);
        threadB.setPriority(threadA.getPriority( )+1);
        threadA.setPriority(Thread.MIN_PRIORITY);

        System.out.println("Start Thread A");
        threadA.start();
        System.out.println("Start Thread B");
        threadB.start();
        System.out.println("Start Thread C");
        threadC.start();
    }
}
