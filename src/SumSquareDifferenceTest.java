import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by arshadshaik on 12/17/15.
 */
public class SumSquareDifferenceTest {

@Test
    public void sumOfSquaresTest(){
    int sum = 0;
    for (int i = 1; i<=10;++i){
        sum = sum + i*i;
    }
    SumSquareDifference ssd = new SumSquareDifference();
    int actualSum = ssd.sumOfSquares();
    assertEquals(sum,actualSum);
    }
}