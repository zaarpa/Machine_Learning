import Assignment_1.Calender;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class TestClass {
    @Test
    public void newMonthTest(){
        String expected= "1/12/2002";
        Calender calender = new Calender("30/11/2002");
        assertEquals(expected,calender.nextDate());
    }
    @Test
    public void newDateTest(){
        String expected= "2/12/2002";
        Calender calender = new Calender("1/12/2002");
        assertEquals(expected,calender.nextDate());
    }
    @Test
    public void newYearTest(){
        String expected= "1/1/2003";
        Calender calender = new Calender("31/12/2002");
        assertEquals(expected,calender.nextDate());
    }
    @Test
    public void LeapYearTest(){
        String expected= "29/2/2020";
        Calender calender = new Calender("28/2/2020");
        assertEquals(expected,calender.nextDate());
    }
    @Test
    public void LeapYearTest2(){
        String expected= "1/3/2019";
        Calender calender = new Calender("28/2/2019");
        assertEquals(expected,calender.nextDate());
    }

}
