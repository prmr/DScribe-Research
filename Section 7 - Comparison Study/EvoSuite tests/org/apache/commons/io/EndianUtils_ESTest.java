/*
 * This file was automatically generated by EvoSuite
 * Thu Jan 21 18:38:23 GMT 2021
 */

package org.apache.commons.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import org.apache.commons.io.EndianUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class EndianUtils_ESTest extends EndianUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      EndianUtils.writeSwappedShort(byteArray0, (int) (byte)0, (short) (byte)40);
      assertArrayEquals(new byte[] {(byte)40, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      EndianUtils.writeSwappedShort((OutputStream) byteArrayOutputStream0, (short)255);
      assertEquals("\u00FF\u0000", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      EndianUtils.writeSwappedFloat(byteArray0, 0, 0.0F);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      int int0 = EndianUtils.readSwappedUnsignedShort(byteArray0, (int) (byte)0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[14];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      int int0 = EndianUtils.readSwappedInteger((InputStream) byteArrayInputStream0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      long long0 = EndianUtils.readSwappedUnsignedInteger((InputStream) byteArrayInputStream0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[14];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)3, (byte)3);
      int int0 = EndianUtils.readSwappedUnsignedShort((InputStream) byteArrayInputStream0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      float float0 = EndianUtils.readSwappedFloat(byteArray0, (int) (byte)0);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EndianUtils endianUtils0 = new EndianUtils();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[14];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      double double0 = EndianUtils.readSwappedDouble((InputStream) byteArrayInputStream0);
      assertEquals(6, byteArrayInputStream0.available());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[14];
      short short0 = EndianUtils.readSwappedShort(byteArray0, 2);
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[14];
      EndianUtils.writeSwappedDouble(byteArray0, 2, 2381.44);
      assertEquals(14, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      float float0 = EndianUtils.swapFloat(0.0F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      short short0 = EndianUtils.swapShort((short) (-1));
      assertEquals((short) (-1), short0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      // Undeclared exception!
      try { 
        EndianUtils.readSwappedDouble(byteArray0, 572);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 572 out of bounds for length 9
         //
         verifyException("org.apache.commons.io.EndianUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(pipedOutputStream0);
      EndianUtils.writeSwappedDouble((OutputStream) bufferedOutputStream0, (-1.0));
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      InputStream inputStream0 = InputStream.nullInputStream();
      try { 
        EndianUtils.readSwappedFloat(inputStream0);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // Unexpected EOF reached
         //
         verifyException("org.apache.commons.io.EndianUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      try { 
        EndianUtils.readSwappedShort((InputStream) byteArrayInputStream0);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // Unexpected EOF reached
         //
         verifyException("org.apache.commons.io.EndianUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double double0 = EndianUtils.swapDouble((short)0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MockFile mockFile0 = new MockFile("}DGV7gI");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      EndianUtils.writeSwappedFloat((OutputStream) mockFileOutputStream0, (-4239.0986F));
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      long long0 = EndianUtils.readSwappedUnsignedInteger(byteArray0, 2);
      assertEquals(0L, long0);
  }
}
