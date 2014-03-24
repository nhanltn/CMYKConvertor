package test;

import java.io.File;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestCMYK2RGBImage {
	String sytemPath = System.getProperty("user.dir");
	@Test
	public void main(){
		assertEquals(true, (new File(sytemPath+"/cmyk")).isFile() );
	}
}
