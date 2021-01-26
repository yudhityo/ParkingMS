/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ParkingMS;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author fadhilmda-PC
 */
public class ParkingMSTest {

    public ParkingMSTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    
    // Lebih dari 3 jam
    @Test
    public void mainTest() {
        System.out.println("parking total price");
        ParkingMS pms = new ParkingMS(9.00, 15.00);
        double expResult = 18;
        double result = pms.Calculate();
        assertEquals(expResult, result, 0.0);
    }

    // 2 Jam
    @Test
    public void mainTest2() {
        System.out.println("parking total price");
        ParkingMS pms = new ParkingMS(13.00, 15.00);
        double expResult = 9;
        double result = pms.Calculate();
        assertEquals(expResult, result, 0.0);
    }

    // 1 Jam
    @Test
    public void mainTest3() {
        System.out.println("parking total price");
        ParkingMS pms = new ParkingMS(15.00, 15.00);
        double expResult = 5;
        double result = pms.Calculate();
        assertEquals(expResult, result, 0.0);
    }

//    // harusnya  error
//    public void mainTest4() {
//        System.out.println("parking total price");
//        ParkingMS pms = new ParkingMS(15.00, 16.00);
//        double expResult = 0;
//        double result = pms.Calculate();
//        assertEquals(expResult, result, 0.0);
//    }
}

