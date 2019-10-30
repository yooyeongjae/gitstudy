import static org.junit.Assert.*;
import org.junit.Test;

public class CalcTest{

	@Test
	public void testADD(){
		Calc c=new Calc();
		assertEquals(30, c.add(10,20));
	}
}
