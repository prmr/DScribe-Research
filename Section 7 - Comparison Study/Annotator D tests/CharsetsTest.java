package org.apache.commons.io;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.nio.charset.Charset;

import org.junit.jupiter.api.Test;

public class CharsetsTest {
	
	@Test
	public void testToCharset1() {
		Charset charset0 = Charsets.UTF_16LE;
		Charset charset1 = Charsets.toCharset(charset0);
		Charset charset2 = Charsets.toCharset(charset0);
		Charset charset3 = Charsets.toCharset(charset0);
		Charset charset4 = Charsets.toCharset(charset3);
		Charset charset5 = Charsets.toCharset(charset3);
		Charset charset6 = Charsets.toCharset(charset3);
		Charset charset7 = Charsets.toCharset(charset3);
		Class<?> wildcardClass = charset7.getClass();
		assertNotNull(charset0);
		assertNotNull(charset1);
		assertNotNull(charset2);
		assertNotNull(charset3);
		assertNotNull(charset4);
		assertNotNull(charset5);
		assertNotNull(charset6);
		assertNotNull(charset7);
		assertNotNull(wildcardClass);
	}
	
	@Test
	public void testToCharset2() {
		Charset charset0 = Charsets.UTF_16BE;
		Charset charset1 = Charsets.toCharset(charset0);
		Charset charset2 = Charsets.toCharset(charset0);
		Charset charset3 = Charsets.toCharset(charset0);
		Charset charset4 = Charsets.toCharset(charset3);
		Charset charset5 = Charsets.toCharset(charset3);
		Charset charset6 = Charsets.toCharset(charset3);
		Charset charset7 = Charsets.toCharset(charset6);
		Charset charset8 = Charsets.toCharset(charset6);
		Class<?> wildcardClass = charset8.getClass();
		assertNotNull(charset0);
		assertNotNull(charset1);
		assertNotNull(charset2);
		assertNotNull(charset3);
		assertNotNull(charset4);
		assertNotNull(charset5);
		assertNotNull(charset6);
		assertNotNull(charset7);
		assertNotNull(charset8);
		assertNotNull(wildcardClass);
	}
}
