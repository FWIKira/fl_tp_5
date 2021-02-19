package testtemperature;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.*;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import temperature.Atester;
import temperature.Conversion;


public class testMockitoAtester {
    /*tests Junit 5 avec mockito pour devise version sans interface*/
    private Atester atester ;
    private Conversion conv ;



    @BeforeAll
    static void setUpBeforeClass() throws Exception {
        System.out.println("debut des tests avec mockito");
    }
    @AfterAll
    static void tearDownAfterClass() throws Exception {
        System.out.println("fin des tests avec mockito");
    }
    @BeforeEach
    void setUp() throws Exception {
        conv = mock(Conversion.class);
    }

    @Test
    public void testconvertit() throws Exception {
       double temp1 = 32.0;
       double temp2 = 100.0;
       when(conv.convF2C(temp1)).thenReturn(((temp1 - 32.0) * 5.0) / 9.0);
        when(conv.convC2F(temp2)).thenReturn((temp2 * 9.0 / 5.0) + 32.0);

        atester = new Atester(conv);
        double value2=atester.convertit(temp2,"C2F");
        System.out.println(value2);
        double expected2=212.0 ;
        double value1=atester.convertit(temp1,"F2C");
        System.out.println(value1);
        double expected1= 0.0 ;

        assertTrue( value2==expected2 && value1==expected1);



    }






}
