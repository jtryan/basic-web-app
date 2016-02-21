package tutorial;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;


/**
 * Created by john on 2/21/16.
 * Copyright 2016
 */
public class CarTest {

    @Mock
    private Engine engine;

    @InjectMocks
    private Car car;

    @Before
    public void setup() throws Exception{
        MockitoAnnotations.initMocks(this);
    }

    /*@After
    public void tearDown() throws Exception {
        car = null;
    }*/

    @Test
    public void testWarning() {
        when(engine.getRpm()).thenReturn(6000);

        car.accelerate();

        assertEquals("Slow Down!", car.getWarningMessage());
    }

}
