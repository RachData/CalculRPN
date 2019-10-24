package Test;


import static org.junit.Assert.*;

import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MAIGA
 */
public class TestJ {
    
    public TestJ() {
    }
   
    /**
     * Test of values method, of class Operation.
     */
  /*  @Test
    public void testValues() {
        System.out.println("values");
        Operation[] expResult = null;
        Operation[] result = Operation.values();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valueOf method, of class Operation.
     */
  /*  @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String name = "";
        Operation expResult = null;
        Operation result = Operation.valueOf(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
*/
    /**
     * je teste ma fonction eval avec la division 
     */
    @Test
    public void testEval() throws Exception 
    {
        System.out.println("Test fonction eval");
        double operande1 = 8;
        double operande2 = 4;
        Operation monOperation = Operation.PLUS;
        double resultat_attendue = 12;
        double result = monOperation.eval(operande1, operande2);
        assertEquals(resultat_attendue, result, 2);
        //assertEquals(expResult, result, result);
        
    }
    }
    
