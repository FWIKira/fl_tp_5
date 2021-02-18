package testtemperature;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.*;
import  org.mockito.MockitoAnnotations;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
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
    public void testconvF2C() {}

    @Test
    public void testconvC2F() {}




}
