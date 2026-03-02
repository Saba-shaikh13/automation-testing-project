package testing.automation_testing;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class arithmetic {
	@Parameters({"A" ,"B", "C", "D"} )
	@Test
 void multiplication(int a,int b,int c,int d) {
	 int mul=a * b * c* d;
	 System.out.println("Multiplication:"+mul);
 }
	@Parameters({"P" ,"Q", "R", "S"} )

	@Test
 void Division(int p,int q,int r,int s)
 {
	 int div=p / q / r / s;
	 System.out.println("Division :"+div);
 }
	@Parameters({"W" ,"X", "Y", "Z"} )

	@Test
 void Substraction(int w ,int x,int y,int z)
 {
	 int sub=(w - x - y - z);
	 System.out.println("Sustraction :"+sub);
 
 }
}
