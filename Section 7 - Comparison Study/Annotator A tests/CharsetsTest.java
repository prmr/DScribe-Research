package org.apache.commons.io;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.nio.charset.Charset;

import org.junit.jupiter.api.Test;

public class CharsetsTest {
	
	@Test
	public void testIso8859_1() {
		assertEquals("ISO-8859-1", Charsets.ISO_8859_1.name());
	}
	
	@Test
	public void testToCharset() {
		Charset charset0 = Charsets.UTF_16BE;
		Charset charset1 = Charsets.toCharset(charset0);
		Charset charset2 = Charsets.toCharset(charset0);
		Charset charset3 = Charsets.toCharset(charset2);
		Charset charset4 = Charsets.toCharset(charset2);
		Charset charset5 = Charsets.toCharset(charset2);
		Charset charset6 = Charsets.toCharset(charset5);
		Charset charset7 = Charsets.toCharset(charset5);
		Charset charset8 = Charsets.toCharset(charset5);
		Charset charset9 = Charsets.toCharset(charset8);
		Charset charset10 = Charsets.toCharset(charset8);
		Charset charset11 = Charsets.toCharset(charset10);
		Charset charset12 = Charsets.toCharset(charset10);
		Class<?> wildcardClass = charset12.getClass();
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
		assertNotNull(wildcardClass);
	}
}
