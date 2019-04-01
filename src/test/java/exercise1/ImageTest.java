package exercise1;

import org.junit.Test;
import static org.junit.Assert.*;

public class ImageTest {

    @Test
    public void ImageTest1() {
        Image i = new Image(100,100);
        assertEquals(i.data.length, 30000);
    }

    @Test
    public void ImageTest2() {
        Image i = new Image(100,100);
        i.set(0,0,0x123456);
        assertEquals(i.data[0], (byte)0x12);
        assertEquals(i.data[1], (byte)0x34);
        assertEquals(i.data[2], (byte)0x56);
        assertEquals(i.data[3], (byte)0x00);
    }

    @Test 
    public void ImageTest3() throws java.io.FileNotFoundException,java.io.IOException {
        String filename = "test.ppm";
        Image i = new Image(100,100);
        i.write(filename);
        java.io.File f = new java.io.File(filename);
        boolean exists = f.exists() && f.isFile();
        assertTrue(exists);
    }

}
