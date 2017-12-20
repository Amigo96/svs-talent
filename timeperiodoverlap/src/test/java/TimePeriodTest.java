import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runners.JUnit4;
import org.junit.runner.RunWith;

import java.time.LocalTime;

@RunWith(JUnit4.class)
public class TimePeriodTest {
    TimePeriod timePeriod;
    TimePeriod anotherTimePeriod;
    @Before
    public void setUp() throws Exception{
        timePeriod= new TimePeriod(LocalTime.of(10,10),LocalTime.of(20,20));
        anotherTimePeriod = new TimePeriod(LocalTime.of(8,8  ), LocalTime.of(9,9));
       // timePeriod = new TimePeriod( );
    }


   @Test
    public void testSomething(){}


   @Test
    public void timePeriodIsNotOverlapedTest() {

       System.out.println("timePeriodIsNotOverlapedTest started!");
        boolean boolTest = timePeriod.overlapsWith(anotherTimePeriod);
       System.out.println("Period 1: ["+ timePeriod.getStartPeriod().toString() +" - "+ timePeriod.getEndPeriod()+"]");
       System.out.println("Period 2: ["+ anotherTimePeriod.getStartPeriod().toString() +" - "+ anotherTimePeriod.getEndPeriod()+"]");
       System.out.println("timeOverlap = "+  boolTest);
        Assert.assertFalse(boolTest);
   }

    @Test
    public void timePeriodIsOverlapedTest() {

        System.out.println("timePeriodIsOverlapedTest started!");
        anotherTimePeriod.setEndPeriod(LocalTime.of(15,15));
        boolean boolTest = timePeriod.overlapsWith(anotherTimePeriod);
        System.out.println("Period 1: ["+ timePeriod.getStartPeriod().toString() +" - "+ timePeriod.getEndPeriod()+"]");
        System.out.println("Period 2: ["+ anotherTimePeriod.getStartPeriod().toString() +" - "+ anotherTimePeriod.getEndPeriod()+"]");
        System.out.println("timeOverlap = "+  boolTest);
        Assert.assertTrue(boolTest);
    }



}
