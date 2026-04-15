package fr.uga.numja;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class NdarrayTest {

    @Test(expected = IllegalArgumentException.class)
    public void testCreateZerosEmptyNdarray1D(){
        Ndarray.zeros(0);
    }


}
