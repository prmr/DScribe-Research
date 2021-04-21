package org.apache.commons.io;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.nio.charset.Charset;

import org.junit.jupiter.api.Test;

public class CharsetsTest {
	
	@Test
	public void testUtf8() {
		assertEquals("UTF-8", Charsets.UTF_8.name());
	}
	
	@Test
	public void testToCharset() {
		Charset charset0 = Charsets.UTF_16BE;
		Charset charset1 = Charsets.toCharset(charset0);
		Charset charset2 = Charsets.toCharset(charset0);
		Charset charset3 = Charsets.toCharset(charset2);
		Charset charset4 = Charsets.toCharset(charset2);
		Charset charset5 = Charsets.toCharset(charset2);
		Charset charset6 = Charsets.toCharset(charset2);
		Charset charset7 = Charsets.toCharset(charset6);
		Charset charset8 = Charsets.toCharset(charset6);
		Charset charset9 = Charsets.toCharset(charset6);
		Charset charset10 = Charsets.toCharset(charset6);
		Charset charset11 = Charsets.toCharset(charset10);
		Charset charset12 = Charsets.toCharset(charset11);
		Charset charset13 = Charsets.toCharset(charset12);
		Charset charset14 = Charsets.toCharset(charset12);
		Class<?> wildcardClass = charset14.getClass();
		assertNotNull(charset0);
		assertNotNull(charset1);
		assertNotNull(charset2);
		assertNotNull(charset3);
		assertNotNull(charset4);
		assertNotNull(charset5);
		assertNotNull(charset6);
		assertNotNull(charset7);
		assertNotNull(charset8);
		assertNotNull(charset9);
		assertNotNull(charset10);
		assertNotNull(charset11);
		assertNotNull(charset12);
		assertNotNull(charset13);
		assertNotNull(charset14);
		assertNotNull(wildcardClass);
	}
}
