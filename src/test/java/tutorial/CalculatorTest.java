package tutorial;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;


/**
 * Created by john on 2/21/16.
 * Copyright 2016
 */
public class CalculatorTest {

    @Mock
    private Calculator calc;

    @Before
    public void setup() throws Exception{
        MockitoAnnotations.initMocks(this);
        // calc = new Calculator();
    }

    /*@After
    public void tearDown() throws Exception {
        calc = null;
    }*/

    @Test
    public void testAbs()
    {
        //assertEquals(4, calc.abs(-4));
        when(calc.abs(-20)).thenReturn(20);
        assertEquals(20, calc.abs(-20));
    }
}
