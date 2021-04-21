import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        char[] charArray2 = new char[] { '4', ' ' };
        java.io.OutputStream outputStream3 = null;
        java.nio.charset.Charset charset4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write(charArray2, outputStream3, charset4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(byte[])\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        java.io.InputStream inputStream0 = null;
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long4 = org.apache.commons.io.IOUtils.copyLarge(inputStream0, outputStream1, 1L, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.InputStream.read(byte[], int, int)\" because \"input\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        java.io.Reader reader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList1 = org.apache.commons.io.IOUtils.readLines(reader0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        java.io.InputStream inputStream0 = null;
        java.io.Writer writer1 = null;
        java.nio.charset.Charset charset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.copy(inputStream0, writer1, charset2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        java.io.OutputStream outputStream4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write(byteArray3, outputStream4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(byte[])\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-1, 10, 10]");
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        java.io.Reader reader0 = null;
        char[] charArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.readFully(reader0, charArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"buffer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        java.io.Reader reader0 = null;
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.copy(reader0, outputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        java.io.Reader reader0 = null;
        java.io.Writer writer1 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.io.IOUtils.copyLarge(reader0, writer1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[])\" because \"input\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        java.io.Writer writer0 = null;
        org.apache.commons.io.IOUtils.closeQuietly(writer0);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        java.nio.charset.Charset charset1 = null;
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.io.IOUtils.resourceToString("hi!", charset1, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Resource not found: hi!");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        java.io.Reader reader0 = null;
        org.apache.commons.io.IOUtils.closeQuietly(reader0);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.io.IOUtils.toString(inputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        java.io.Reader reader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.LineIterator lineIterator1 = org.apache.commons.io.IOUtils.lineIterator(reader0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Reader must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        java.net.URLConnection uRLConnection0 = null;
        org.apache.commons.io.IOUtils.close(uRLConnection0);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        java.io.InputStream inputStream0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) -1, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.readFully(inputStream0, byteArray7, 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.InputStream.read(byte[], int, int)\" because \"input\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 10, 10, -1, -1, 10]");
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        char[] charArray3 = new char[] { '4', ' ', 'a' };
        java.io.OutputStream outputStream4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write(charArray3, outputStream4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(byte[])\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4 a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4 a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4,  , a]");
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        char[] charArray3 = new char[] { '4', '4', 'a' };
        java.io.OutputStream outputStream4 = null;
        java.nio.charset.Charset charset5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write(charArray3, outputStream4, charset5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(byte[])\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "44a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "44a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, 4, a]");
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        java.io.Reader reader0 = null;
        java.io.Reader reader1 = null;
        boolean boolean2 = org.apache.commons.io.IOUtils.contentEquals(reader0, reader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        java.io.InputStream inputStream0 = null;
        java.io.Writer writer1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.copy(inputStream0, writer1, "");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        java.net.URI uRI0 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray1 = org.apache.commons.io.IOUtils.toByteArray(uRI0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.net.URI.toURL()\" because \"uri\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        java.io.Closeable closeable0 = null;
        org.apache.commons.io.IOUtils.closeQuietly(closeable0);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        java.io.OutputStream outputStream1 = null;
        java.nio.charset.Charset charset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write((java.lang.CharSequence) "hi!", outputStream1, charset2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(byte[])\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toBufferedInputStream(inputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.InputStream.read(byte[], int, int)\" because \"in\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        java.io.Writer writer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.BufferedWriter bufferedWriter2 = org.apache.commons.io.IOUtils.buffer(writer0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        java.io.OutputStream outputStream4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write(charArray3, outputStream4, "hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #, a]");
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        java.io.Reader reader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray1 = org.apache.commons.io.IOUtils.toCharArray(reader0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[])\" because \"input\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        java.io.InputStream inputStream0 = null;
        byte[] byteArray1 = new byte[] {};
        int int2 = org.apache.commons.io.IOUtils.read(inputStream0, byteArray1);
        java.lang.Class<?> wildcardClass3 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        java.io.Reader reader0 = null;
        java.io.Writer writer1 = null;
        char[] charArray4 = new char[] {};
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.io.IOUtils.copyLarge(reader0, writer1, 1L, (long) (short) 1, charArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"input\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream2 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        java.io.Writer writer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.BufferedWriter bufferedWriter1 = org.apache.commons.io.IOUtils.buffer(writer0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        java.io.Closeable closeable0 = null;
        org.apache.commons.io.IOUtils.close(closeable0);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        java.lang.String str0 = org.apache.commons.io.IOUtils.LINE_SEPARATOR;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "\r\n" + "'", str0, "\r\n");
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        java.io.InputStream inputStream0 = null;
        java.io.Writer writer1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.copy(inputStream0, writer1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray2 = org.apache.commons.io.IOUtils.toCharArray(inputStream0, "\r\n");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ??");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        java.io.Reader reader0 = null;
        java.io.Writer writer1 = null;
        char[] charArray4 = new char[] {};
        long long5 = org.apache.commons.io.IOUtils.copyLarge(reader0, writer1, (long) (byte) 0, (long) 1, charArray4);
        java.io.OutputStream outputStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write(charArray4, outputStream6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(byte[])\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        java.io.InputStream inputStream0 = null;
        java.io.OutputStream outputStream1 = null;
        byte[] byteArray4 = new byte[] {};
        int int5 = org.apache.commons.io.IOUtils.length(byteArray4);
        java.io.OutputStream outputStream6 = null;
        org.apache.commons.io.IOUtils.writeChunked(byteArray4, outputStream6);
        long long8 = org.apache.commons.io.IOUtils.copyLarge(inputStream0, outputStream1, 0L, (long) (byte) -1, byteArray4);
        java.io.Writer writer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write(byteArray4, writer9, "");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        java.io.InputStream inputStream0 = null;
        java.io.OutputStream outputStream1 = null;
        byte[] byteArray4 = new byte[] {};
        int int5 = org.apache.commons.io.IOUtils.length(byteArray4);
        java.io.OutputStream outputStream6 = null;
        org.apache.commons.io.IOUtils.writeChunked(byteArray4, outputStream6);
        long long8 = org.apache.commons.io.IOUtils.copyLarge(inputStream0, outputStream1, 0L, (long) (byte) -1, byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.io.IOUtils.toString(byteArray4, "");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        java.io.Reader reader0 = null;
        java.lang.Appendable appendable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.io.IOUtils.copy(reader0, appendable1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(java.nio.CharBuffer)\" because \"input\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        java.io.InputStream inputStream0 = null;
        java.nio.charset.Charset charset1 = null;
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray2 = org.apache.commons.io.IOUtils.toCharArray(inputStream0, charset1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        int int1 = org.apache.commons.io.IOUtils.length((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.io.IOUtils.readFully(inputStream0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.InputStream.read(byte[], int, int)\" because \"input\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        java.io.Reader reader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.skipFully(reader0, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"input\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        java.io.Reader reader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray1 = org.apache.commons.io.IOUtils.toByteArray(reader0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[])\" because \"input\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        java.io.Reader reader0 = null;
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.copy(reader0, outputStream1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        java.io.InputStream inputStream0 = null;
        java.nio.charset.Charset charset1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.LineIterator lineIterator2 = org.apache.commons.io.IOUtils.lineIterator(inputStream0, charset1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        java.io.Reader reader0 = null;
        java.io.Writer writer1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.io.IOUtils.copy(reader0, writer1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[])\" because \"input\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        java.io.Reader reader0 = null;
        java.io.Reader reader1 = null;
        boolean boolean2 = org.apache.commons.io.IOUtils.contentEqualsIgnoreEOL(reader0, reader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        byte[] byteArray0 = new byte[] {};
        int int1 = org.apache.commons.io.IOUtils.length(byteArray0);
        java.io.Writer writer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write(byteArray0, writer2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Writer.write(String)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.io.IOUtils.readFully(inputStream0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.InputStream.read(byte[], int, int)\" because \"input\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.apache.commons.io.IOUtils iOUtils0 = new org.apache.commons.io.IOUtils();
        java.lang.Class<?> wildcardClass1 = iOUtils0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        java.io.Writer writer1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write("\r\n", writer1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Writer.write(String)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        char[] charArray0 = null;
        int int1 = org.apache.commons.io.IOUtils.length(charArray0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.io.IOUtils.closeQuietly(inputStream0);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        java.io.Reader reader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.BufferedReader bufferedReader2 = org.apache.commons.io.IOUtils.toBufferedReader(reader0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        java.net.ServerSocket serverSocket0 = null;
        org.apache.commons.io.IOUtils.closeQuietly(serverSocket0);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write((java.lang.CharSequence) "\r\n", outputStream1, "\r\n");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ??");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        java.nio.channels.Selector selector0 = null;
        org.apache.commons.io.IOUtils.closeQuietly(selector0);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        java.io.Reader reader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.io.IOUtils.skip(reader0, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"input\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        java.net.URL uRL1 = org.apache.commons.io.IOUtils.resourceToURL("");
        java.lang.Class<?> wildcardClass2 = uRL1.getClass();
        org.junit.Assert.assertNotNull(uRL1);
        org.junit.Assert.assertEquals(uRL1.toString(), "file:/F:/Mathieu/git/commons-io/bin/org/apache/commons/io/");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        java.io.InputStream inputStream0 = null;
        java.io.OutputStream outputStream1 = null;
        byte[] byteArray3 = new byte[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            long long4 = org.apache.commons.io.IOUtils.copyLarge(inputStream0, outputStream1, byteArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.InputStream.read(byte[])\" because \"input\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-1]");
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        java.net.URLConnection uRLConnection0 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray1 = org.apache.commons.io.IOUtils.toByteArray(uRLConnection0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.net.URLConnection.getInputStream()\" because \"urlConn\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.BufferedInputStream bufferedInputStream2 = org.apache.commons.io.IOUtils.buffer(inputStream0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: inputStream");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        java.io.Reader reader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.io.IOUtils.toString(reader0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[])\" because \"input\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        java.io.Reader reader0 = null;
        char[] charArray5 = new char[] { '4', 'a', '#', 'a' };
        int int6 = org.apache.commons.io.IOUtils.length(charArray5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.readFully(reader0, charArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"input\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "4a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "4a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[4, a, #, a]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        java.nio.channels.ReadableByteChannel readableByteChannel0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.skipFully(readableByteChannel0, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.ReadableByteChannel.read(java.nio.ByteBuffer)\" because \"input\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        java.io.Reader reader0 = null;
        char[] charArray4 = new char[] { '#', '#', '#' };
        org.apache.commons.io.IOUtils.readFully(reader0, charArray4, (int) ' ', (int) (short) 0);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.writeChunked(charArray4, writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Writer.write(char[], int, int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "###");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "###");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#, #, #]");
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        java.io.InputStream inputStream0 = null;
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.io.IOUtils.copyLarge(inputStream0, outputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.InputStream.read(byte[])\" because \"input\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        char char0 = org.apache.commons.io.IOUtils.DIR_SEPARATOR_WINDOWS;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + '\\' + "'", char0 == '\\');
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        java.lang.Appendable appendable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.Writer writer1 = org.apache.commons.io.IOUtils.writer(appendable0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: appendable");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write("hi!", outputStream1, "\r\n");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ??");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        java.io.InputStream inputStream0 = null;
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long3 = org.apache.commons.io.IOUtils.copy(inputStream0, outputStream1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        java.io.InputStream inputStream0 = null;
        byte[] byteArray2 = org.apache.commons.io.IOUtils.toByteArray("");
        int int3 = org.apache.commons.io.IOUtils.read(inputStream0, byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.io.IOUtils.toString(byteArray2, "hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        char char0 = org.apache.commons.io.IOUtils.DIR_SEPARATOR;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + '\\' + "'", char0 == '\\');
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        boolean boolean2 = org.apache.commons.io.IOUtils.contentEquals(inputStream0, inputStream1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.io.IOUtils.closeQuietly(outputStream0);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        java.nio.charset.Charset charset1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.io.IOUtils.resourceToString("hi!", charset1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Resource not found: hi!");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        java.nio.channels.ReadableByteChannel readableByteChannel0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.skipFully(readableByteChannel0, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.ReadableByteChannel.read(java.nio.ByteBuffer)\" because \"input\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        java.io.InputStream inputStream0 = null;
        java.io.OutputStream outputStream1 = null;
        byte[] byteArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long3 = org.apache.commons.io.IOUtils.copyLarge(inputStream0, outputStream1, byteArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.InputStream.read(byte[])\" because \"input\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        java.io.Reader reader0 = null;
        java.io.Reader reader1 = null;
        char[] charArray5 = new char[] { '#', '#', '#' };
        org.apache.commons.io.IOUtils.readFully(reader1, charArray5, (int) ' ', (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.readFully(reader0, charArray5, 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"input\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "###");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "###");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[#, #, #]");
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        java.lang.StringBuffer stringBuffer0 = null;
        java.io.Writer writer1 = null;
        org.apache.commons.io.IOUtils.write(stringBuffer0, writer1);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.BufferedInputStream bufferedInputStream2 = org.apache.commons.io.IOUtils.buffer(inputStream0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: inputStream");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        java.nio.channels.ReadableByteChannel readableByteChannel0 = null;
        long long2 = org.apache.commons.io.IOUtils.skip(readableByteChannel0, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        java.lang.StringBuffer stringBuffer0 = null;
        java.io.OutputStream outputStream1 = null;
        org.apache.commons.io.IOUtils.write(stringBuffer0, outputStream1);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        java.nio.channels.ReadableByteChannel readableByteChannel0 = null;
        java.nio.ByteBuffer byteBuffer1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.io.IOUtils.read(readableByteChannel0, byteBuffer1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.ByteBuffer.remaining()\" because \"buffer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        java.net.URI uRI0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.io.IOUtils.toString(uRI0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        java.io.Reader reader0 = null;
        java.nio.charset.Charset charset1 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.io.IOUtils.toByteArray(reader0, charset1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[])\" because \"input\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        java.io.InputStream inputStream0 = null;
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long3 = org.apache.commons.io.IOUtils.copy(inputStream0, outputStream1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.InputStream.read(byte[])\" because \"input\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        int int0 = org.apache.commons.io.IOUtils.EOF;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-1) + "'", int0 == (-1));
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream2 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "", "");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        java.io.InputStream inputStream0 = null;
        byte[] byteArray1 = new byte[] {};
        int int2 = org.apache.commons.io.IOUtils.read(inputStream0, byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.io.IOUtils.toString(byteArray1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        java.io.InputStream inputStream0 = null;
        java.io.Writer writer1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.copy(inputStream0, writer1, "\r\n");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ??");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        java.nio.channels.ReadableByteChannel readableByteChannel0 = null;
        org.apache.commons.io.IOUtils.skipFully(readableByteChannel0, (long) (byte) 0);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        java.lang.StringBuffer stringBuffer0 = null;
        java.io.OutputStream outputStream1 = null;
        org.apache.commons.io.IOUtils.write(stringBuffer0, outputStream1, "hi!");
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        java.io.Writer writer1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write("hi!", writer1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Writer.write(String)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        java.nio.charset.Charset charset1 = null;
        java.io.InputStream inputStream2 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "\r\n", charset1);
        java.io.Writer writer3 = null;
        java.nio.charset.Charset charset4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.copy(inputStream2, writer3, charset4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Writer.write(char[], int, int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream2);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        java.io.Reader reader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.io.IOUtils.toByteArray(reader0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        char char0 = org.apache.commons.io.IOUtils.DIR_SEPARATOR_UNIX;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + '/' + "'", char0 == '/');
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        char[] charArray6 = new char[] { 'a', '#', '4', '/', '4', '\\' };
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write(charArray6, outputStream7, "hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "a#4/4\\");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "a#4/4\\");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[a, #, 4, /, 4, \\]");
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream2 = null;
        java.io.InputStream inputStream5 = null;
        byte[] byteArray7 = org.apache.commons.io.IOUtils.toByteArray("");
        int int8 = org.apache.commons.io.IOUtils.read(inputStream5, byteArray7);
        long long9 = org.apache.commons.io.IOUtils.copyLarge(inputStream1, outputStream2, 0L, 0L, byteArray7);
        org.apache.commons.io.IOUtils.closeQuietly((java.io.Closeable) outputStream2);
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        java.net.Socket socket0 = null;
        org.apache.commons.io.IOUtils.closeQuietly(socket0);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        int int1 = org.apache.commons.io.IOUtils.length((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream2 = null;
        java.io.InputStream inputStream5 = null;
        byte[] byteArray7 = org.apache.commons.io.IOUtils.toByteArray("");
        int int8 = org.apache.commons.io.IOUtils.read(inputStream5, byteArray7);
        long long9 = org.apache.commons.io.IOUtils.copyLarge(inputStream1, outputStream2, 0L, 0L, byteArray7);
        java.io.OutputStream outputStream10 = null;
        long long13 = org.apache.commons.io.IOUtils.copyLarge(inputStream1, outputStream10, (long) (short) 0, (-1L));
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray15 = org.apache.commons.io.IOUtils.toCharArray(inputStream1, "");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        java.io.Reader reader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.BufferedReader bufferedReader1 = org.apache.commons.io.IOUtils.toBufferedReader(reader0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        java.io.Writer writer1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write((java.lang.CharSequence) "hi!", writer1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Writer.write(String)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        java.io.Reader reader0 = null;
        char[] charArray3 = new char[] { '/', '#' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.readFully(reader0, charArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"input\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "/#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "/#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[/, #]");
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        java.io.Reader reader0 = null;
        char[] charArray4 = new char[] { '#', '#', '#' };
        org.apache.commons.io.IOUtils.readFully(reader0, charArray4, (int) ' ', (int) (short) 0);
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write(charArray4, outputStream8, "");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "###");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "###");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#, #, #]");
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream2 = null;
        java.io.InputStream inputStream4 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream5 = null;
        java.io.InputStream inputStream8 = null;
        byte[] byteArray10 = org.apache.commons.io.IOUtils.toByteArray("");
        int int11 = org.apache.commons.io.IOUtils.read(inputStream8, byteArray10);
        long long12 = org.apache.commons.io.IOUtils.copyLarge(inputStream4, outputStream5, 0L, 0L, byteArray10);
        long long13 = org.apache.commons.io.IOUtils.copyLarge(inputStream1, outputStream2, byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.LineIterator lineIterator15 = org.apache.commons.io.IOUtils.lineIterator(inputStream1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(inputStream4);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        java.io.Writer writer1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write((java.lang.CharSequence) "", writer1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Writer.write(String)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray2 = new byte[] {};
        int int3 = org.apache.commons.io.IOUtils.length(byteArray2);
        int int4 = org.apache.commons.io.IOUtils.read(inputStream1, byteArray2);
        org.apache.commons.io.IOUtils.closeQuietly(inputStream1);
        java.io.InputStream inputStream7 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray8 = org.apache.commons.io.IOUtils.toByteArray(inputStream7);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = org.apache.commons.io.IOUtils.read(inputStream1, byteArray8, (int) (short) 10, (int) '\\');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [10, 10 + 92) out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        java.lang.StringBuffer stringBuffer0 = null;
        java.io.OutputStream outputStream1 = null;
        org.apache.commons.io.IOUtils.write(stringBuffer0, outputStream1, "\r\n");
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        java.io.Reader reader0 = null;
        char[] charArray5 = new char[] { '4', 'a', '#', 'a' };
        int int6 = org.apache.commons.io.IOUtils.length(charArray5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.readFully(reader0, charArray5, (int) (short) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"input\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "4a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "4a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[4, a, #, a]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        java.net.URL uRL1 = org.apache.commons.io.IOUtils.resourceToURL("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.io.IOUtils.toString(uRL1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(uRL1);
        org.junit.Assert.assertEquals(uRL1.toString(), "file:/F:/Mathieu/git/commons-io/bin/org/apache/commons/io/");
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream2 = null;
        java.io.InputStream inputStream5 = null;
        byte[] byteArray7 = org.apache.commons.io.IOUtils.toByteArray("");
        int int8 = org.apache.commons.io.IOUtils.read(inputStream5, byteArray7);
        long long9 = org.apache.commons.io.IOUtils.copyLarge(inputStream1, outputStream2, 0L, 0L, byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray11 = org.apache.commons.io.IOUtils.toByteArray(inputStream1, 3);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Unexpected read size. current: 0, expected: 3");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        java.io.Reader reader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.io.IOUtils.toByteArray(reader0, "");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        java.io.Reader reader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.BufferedReader bufferedReader2 = org.apache.commons.io.IOUtils.buffer(reader0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        java.io.Reader reader0 = null;
        java.lang.Appendable appendable1 = null;
        java.nio.CharBuffer charBuffer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long3 = org.apache.commons.io.IOUtils.copy(reader0, appendable1, charBuffer2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(java.nio.CharBuffer)\" because \"input\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        java.io.Reader reader0 = null;
        java.io.Writer writer1 = null;
        char[] charArray4 = new char[] {};
        long long5 = org.apache.commons.io.IOUtils.copyLarge(reader0, writer1, (long) (byte) 0, (long) 1, charArray4);
        java.io.OutputStream outputStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write(charArray4, outputStream6, "\r\n");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ??");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.io.IOUtils.resourceToByteArray("hi!", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Resource not found: hi!");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray2 = new byte[] {};
        int int3 = org.apache.commons.io.IOUtils.length(byteArray2);
        int int4 = org.apache.commons.io.IOUtils.read(inputStream1, byteArray2);
        byte[] byteArray5 = org.apache.commons.io.IOUtils.toByteArray(inputStream1);
        byte[] byteArray7 = org.apache.commons.io.IOUtils.toByteArray(inputStream1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray9 = org.apache.commons.io.IOUtils.toByteArray(inputStream1, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Size must be equal or greater than zero: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream2 = null;
        java.io.InputStream inputStream5 = null;
        byte[] byteArray7 = org.apache.commons.io.IOUtils.toByteArray("");
        int int8 = org.apache.commons.io.IOUtils.read(inputStream5, byteArray7);
        long long9 = org.apache.commons.io.IOUtils.copyLarge(inputStream1, outputStream2, 0L, 0L, byteArray7);
        java.io.OutputStream outputStream10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write(byteArray7, outputStream10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(byte[])\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        java.nio.charset.Charset charset1 = null;
        java.io.InputStream inputStream2 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "\r\n", charset1);
        java.io.OutputStream outputStream3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.io.IOUtils.copy(inputStream2, outputStream3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(byte[], int, int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream2);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream2 = null;
        java.io.InputStream inputStream5 = null;
        byte[] byteArray7 = org.apache.commons.io.IOUtils.toByteArray("");
        int int8 = org.apache.commons.io.IOUtils.read(inputStream5, byteArray7);
        long long9 = org.apache.commons.io.IOUtils.copyLarge(inputStream1, outputStream2, 0L, 0L, byteArray7);
        java.nio.charset.Charset charset10 = null;
        java.util.List<java.lang.String> strList11 = org.apache.commons.io.IOUtils.readLines(inputStream1, charset10);
        java.io.InputStream inputStream13 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream14 = null;
        java.io.InputStream inputStream16 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream17 = null;
        java.io.InputStream inputStream20 = null;
        byte[] byteArray22 = org.apache.commons.io.IOUtils.toByteArray("");
        int int23 = org.apache.commons.io.IOUtils.read(inputStream20, byteArray22);
        long long24 = org.apache.commons.io.IOUtils.copyLarge(inputStream16, outputStream17, 0L, 0L, byteArray22);
        long long25 = org.apache.commons.io.IOUtils.copyLarge(inputStream13, outputStream14, byteArray22);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = org.apache.commons.io.IOUtils.read(inputStream1, byteArray22, (int) (byte) 10, (int) '\\');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [10, 10 + 92) out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(inputStream13);
        org.junit.Assert.assertNotNull(inputStream16);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        char[] charArray6 = new char[] { 'a', '\\', '4', '4', 'a', '#' };
        java.io.OutputStream outputStream7 = null;
        java.nio.charset.Charset charset8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write(charArray6, outputStream7, charset8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(byte[])\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "a\\44a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "a\\44a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[a, \\, 4, 4, a, #]");
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray2 = new byte[] {};
        int int3 = org.apache.commons.io.IOUtils.length(byteArray2);
        int int4 = org.apache.commons.io.IOUtils.read(inputStream1, byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray6 = org.apache.commons.io.IOUtils.toByteArray(inputStream1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Unexpected read size. current: 0, expected: 100");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        java.io.Reader reader0 = null;
        java.io.Reader reader1 = null;
        java.io.Writer writer2 = null;
        char[] charArray5 = new char[] {};
        long long6 = org.apache.commons.io.IOUtils.copyLarge(reader1, writer2, (long) (byte) 0, (long) 1, charArray5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.readFully(reader0, charArray5, (int) (byte) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"input\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream2 = null;
        java.io.InputStream inputStream4 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream5 = null;
        java.io.InputStream inputStream8 = null;
        byte[] byteArray10 = org.apache.commons.io.IOUtils.toByteArray("");
        int int11 = org.apache.commons.io.IOUtils.read(inputStream8, byteArray10);
        long long12 = org.apache.commons.io.IOUtils.copyLarge(inputStream4, outputStream5, 0L, 0L, byteArray10);
        long long13 = org.apache.commons.io.IOUtils.copyLarge(inputStream1, outputStream2, byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList15 = org.apache.commons.io.IOUtils.readLines(inputStream1, "");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(inputStream4);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        java.nio.channels.ReadableByteChannel readableByteChannel0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.skipFully(readableByteChannel0, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.ReadableByteChannel.read(java.nio.ByteBuffer)\" because \"input\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        java.io.Reader reader0 = null;
        char[] charArray4 = new char[] { '#', '#', '#' };
        org.apache.commons.io.IOUtils.readFully(reader0, charArray4, (int) ' ', (int) (short) 0);
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write(charArray4, outputStream8, "\r\n");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ??");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "###");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "###");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#, #, #]");
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray2 = new byte[] {};
        int int3 = org.apache.commons.io.IOUtils.length(byteArray2);
        int int4 = org.apache.commons.io.IOUtils.read(inputStream1, byteArray2);
        byte[] byteArray5 = org.apache.commons.io.IOUtils.toByteArray(inputStream1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList7 = org.apache.commons.io.IOUtils.readLines(inputStream1, "");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        java.io.Reader reader0 = null;
        java.io.Writer writer1 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long4 = org.apache.commons.io.IOUtils.copyLarge(reader0, writer1, (long) ' ', (long) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"input\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        java.nio.charset.Charset charset1 = null;
        java.io.InputStream inputStream2 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "\r\n", charset1);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.copy(inputStream2, writer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Writer.write(char[], int, int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream2);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream2 = org.apache.commons.io.IOUtils.toInputStream("hi!", "\r\n");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ??");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        java.io.Reader reader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.BufferedReader bufferedReader2 = org.apache.commons.io.IOUtils.toBufferedReader(reader0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.BufferedOutputStream bufferedOutputStream2 = org.apache.commons.io.IOUtils.buffer(outputStream0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: outputStream");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write("", outputStream1, "\r\n");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ??");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream2 = null;
        java.io.InputStream inputStream5 = null;
        byte[] byteArray7 = org.apache.commons.io.IOUtils.toByteArray("");
        int int8 = org.apache.commons.io.IOUtils.read(inputStream5, byteArray7);
        long long9 = org.apache.commons.io.IOUtils.copyLarge(inputStream1, outputStream2, 0L, 0L, byteArray7);
        java.nio.charset.Charset charset10 = null;
        java.util.List<java.lang.String> strList11 = org.apache.commons.io.IOUtils.readLines(inputStream1, charset10);
        java.io.InputStream inputStream13 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream14 = null;
        java.io.InputStream inputStream17 = null;
        byte[] byteArray19 = org.apache.commons.io.IOUtils.toByteArray("");
        int int20 = org.apache.commons.io.IOUtils.read(inputStream17, byteArray19);
        long long21 = org.apache.commons.io.IOUtils.copyLarge(inputStream13, outputStream14, 0L, 0L, byteArray19);
        java.nio.charset.Charset charset22 = null;
        java.util.List<java.lang.String> strList23 = org.apache.commons.io.IOUtils.readLines(inputStream13, charset22);
        org.apache.commons.io.IOUtils.close((java.io.Closeable) inputStream13);
        boolean boolean25 = org.apache.commons.io.IOUtils.contentEquals(inputStream1, inputStream13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = org.apache.commons.io.IOUtils.toString(inputStream1, "");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(inputStream13);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        java.lang.String str0 = org.apache.commons.io.IOUtils.LINE_SEPARATOR_UNIX;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "\n" + "'", str0, "\n");
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        byte[] byteArray0 = new byte[] {};
        int int1 = org.apache.commons.io.IOUtils.length(byteArray0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.io.IOUtils.toString(byteArray0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        java.io.Reader reader0 = null;
        org.apache.commons.io.IOUtils.skipFully(reader0, (long) 0);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream2 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "\r\n", "");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        java.io.InputStream inputStream0 = null;
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.io.IOUtils.copy(inputStream0, outputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.InputStream.read(byte[])\" because \"input\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        java.net.URI uRI0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.io.IOUtils.toString(uRI0, "");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray2 = new byte[] {};
        int int3 = org.apache.commons.io.IOUtils.length(byteArray2);
        int int4 = org.apache.commons.io.IOUtils.read(inputStream1, byteArray2);
        byte[] byteArray5 = org.apache.commons.io.IOUtils.toByteArray(inputStream1);
        byte[] byteArray7 = org.apache.commons.io.IOUtils.toByteArray(inputStream1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.skipFully(inputStream1, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: Bytes to skip: 10 actual: 0");
        } catch (java.io.EOFException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray2 = org.apache.commons.io.IOUtils.toByteArray(inputStream1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.LineIterator lineIterator4 = org.apache.commons.io.IOUtils.lineIterator(inputStream1, "");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        byte[] byteArray1 = org.apache.commons.io.IOUtils.toByteArray("");
        java.io.Writer writer2 = null;
        java.nio.charset.Charset charset3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write(byteArray1, writer2, charset3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Writer.write(String)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        java.nio.channels.ReadableByteChannel readableByteChannel0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.skipFully(readableByteChannel0, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Bytes to skip must not be negative: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream2 = null;
        java.io.InputStream inputStream5 = null;
        byte[] byteArray7 = org.apache.commons.io.IOUtils.toByteArray("");
        int int8 = org.apache.commons.io.IOUtils.read(inputStream5, byteArray7);
        long long9 = org.apache.commons.io.IOUtils.copyLarge(inputStream1, outputStream2, 0L, 0L, byteArray7);
        java.nio.charset.Charset charset10 = null;
        java.util.List<java.lang.String> strList11 = org.apache.commons.io.IOUtils.readLines(inputStream1, charset10);
        org.apache.commons.io.IOUtils.close((java.io.Closeable) inputStream1);
        java.io.OutputStream outputStream13 = null;
        java.io.InputStream inputStream17 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray18 = new byte[] {};
        int int19 = org.apache.commons.io.IOUtils.length(byteArray18);
        int int20 = org.apache.commons.io.IOUtils.read(inputStream17, byteArray18);
        byte[] byteArray21 = org.apache.commons.io.IOUtils.toByteArray(inputStream17);
        byte[] byteArray23 = org.apache.commons.io.IOUtils.toByteArray(inputStream17, (int) (short) 0);
        byte[] byteArray24 = new byte[] {};
        int int25 = org.apache.commons.io.IOUtils.length(byteArray24);
        org.apache.commons.io.IOUtils.readFully(inputStream17, byteArray24);
        // The following exception was thrown during execution in test generation
        try {
            long long27 = org.apache.commons.io.IOUtils.copyLarge(inputStream1, outputStream13, 100L, (long) (byte) -1, byteArray24);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: Bytes to skip: 100 actual: 0");
        } catch (java.io.EOFException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(inputStream17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write((java.lang.CharSequence) "\n", outputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(byte[])\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        char[] charArray1 = new char[] { '4' };
        java.io.OutputStream outputStream2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write(charArray1, outputStream2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(byte[])\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[4]");
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.apache.commons.io.IOUtils.resourceToURL("hi!", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Resource not found: hi!");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        java.io.Reader reader0 = null;
        char[] charArray1 = new char[] {};
        int int2 = org.apache.commons.io.IOUtils.length(charArray1);
        java.io.Writer writer3 = null;
        org.apache.commons.io.IOUtils.writeChunked(charArray1, writer3);
        org.apache.commons.io.IOUtils.readFully(reader0, charArray1);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write(charArray1, writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Writer.write(char[])\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        java.io.Reader reader0 = null;
        java.io.Writer writer1 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long4 = org.apache.commons.io.IOUtils.copyLarge(reader0, writer1, (long) (short) 1, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"input\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write("", outputStream1, "");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        java.io.InputStream inputStream0 = null;
        byte[] byteArray2 = org.apache.commons.io.IOUtils.toByteArray("");
        int int3 = org.apache.commons.io.IOUtils.read(inputStream0, byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.io.IOUtils.toString(byteArray2, "\r\n");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ??");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream2 = null;
        java.io.InputStream inputStream5 = null;
        byte[] byteArray7 = org.apache.commons.io.IOUtils.toByteArray("");
        int int8 = org.apache.commons.io.IOUtils.read(inputStream5, byteArray7);
        long long9 = org.apache.commons.io.IOUtils.copyLarge(inputStream1, outputStream2, 0L, 0L, byteArray7);
        java.nio.charset.Charset charset10 = null;
        java.util.List<java.lang.String> strList11 = org.apache.commons.io.IOUtils.readLines(inputStream1, charset10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList13 = org.apache.commons.io.IOUtils.readLines(inputStream1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        java.lang.String str0 = org.apache.commons.io.IOUtils.LINE_SEPARATOR_WINDOWS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "\r\n" + "'", str0, "\r\n");
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        java.io.Reader reader0 = null;
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.copy(reader0, outputStream1, "");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray2 = new byte[] {};
        int int3 = org.apache.commons.io.IOUtils.length(byteArray2);
        int int4 = org.apache.commons.io.IOUtils.read(inputStream1, byteArray2);
        byte[] byteArray5 = org.apache.commons.io.IOUtils.toByteArray(inputStream1);
        java.util.function.Consumer<java.io.IOException> iOExceptionConsumer6 = null;
        org.apache.commons.io.IOUtils.closeQuietly((java.io.Closeable) inputStream1, iOExceptionConsumer6);
        org.apache.commons.io.IOUtils.close((java.io.Closeable) inputStream1);
        java.io.BufferedInputStream bufferedInputStream10 = org.apache.commons.io.IOUtils.buffer(inputStream1, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray12 = org.apache.commons.io.IOUtils.toCharArray(inputStream1, "\n");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ?");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(bufferedInputStream10);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.LineIterator lineIterator3 = org.apache.commons.io.IOUtils.lineIterator(inputStream1, "");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray2 = new byte[] {};
        int int3 = org.apache.commons.io.IOUtils.length(byteArray2);
        int int4 = org.apache.commons.io.IOUtils.read(inputStream1, byteArray2);
        byte[] byteArray5 = org.apache.commons.io.IOUtils.toByteArray(inputStream1);
        java.util.function.Consumer<java.io.IOException> iOExceptionConsumer6 = null;
        org.apache.commons.io.IOUtils.closeQuietly((java.io.Closeable) inputStream1, iOExceptionConsumer6);
        org.apache.commons.io.IOUtils.close((java.io.Closeable) inputStream1);
        java.io.BufferedInputStream bufferedInputStream10 = org.apache.commons.io.IOUtils.buffer(inputStream1, (int) (byte) 10);
        org.apache.commons.io.function.IOConsumer<java.io.IOException> iOExceptionIOConsumer11 = null;
        org.apache.commons.io.IOUtils.close((java.io.Closeable) bufferedInputStream10, iOExceptionIOConsumer11);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList13 = org.apache.commons.io.IOUtils.readLines((java.io.InputStream) bufferedInputStream10);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(bufferedInputStream10);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.BufferedInputStream bufferedInputStream2 = org.apache.commons.io.IOUtils.buffer(inputStream0, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: inputStream");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream2 = null;
        java.io.InputStream inputStream5 = null;
        byte[] byteArray7 = org.apache.commons.io.IOUtils.toByteArray("");
        int int8 = org.apache.commons.io.IOUtils.read(inputStream5, byteArray7);
        long long9 = org.apache.commons.io.IOUtils.copyLarge(inputStream1, outputStream2, 0L, 0L, byteArray7);
        java.io.OutputStream outputStream10 = null;
        long long13 = org.apache.commons.io.IOUtils.copyLarge(inputStream1, outputStream10, (long) (short) 0, (-1L));
        org.apache.commons.io.IOUtils.close((java.io.Closeable) outputStream10);
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        java.io.Reader reader0 = null;
        char[] charArray1 = new char[] {};
        java.io.Writer writer2 = null;
        org.apache.commons.io.IOUtils.writeChunked(charArray1, writer2);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = org.apache.commons.io.IOUtils.read(reader0, charArray1, (int) (short) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Length must not be negative: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[]");
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        java.lang.StringBuffer stringBuffer0 = null;
        java.io.OutputStream outputStream1 = null;
        org.apache.commons.io.IOUtils.write(stringBuffer0, outputStream1, "\n");
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.BufferedOutputStream bufferedOutputStream1 = org.apache.commons.io.IOUtils.buffer(outputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: outputStream");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        java.net.URI uRI0 = null;
        java.nio.charset.Charset charset1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.io.IOUtils.toString(uRI0, charset1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.net.URI.toURL()\" because \"uri\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream2 = org.apache.commons.io.IOUtils.toInputStream("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.io.IOUtils.toString(uRL0, charset1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.net.URL.openStream()\" because \"url\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        char[] charArray4 = new char[] { '4', 'a', '#', 'a' };
        int int5 = org.apache.commons.io.IOUtils.length(charArray4);
        int int6 = org.apache.commons.io.IOUtils.length(charArray4);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.writeChunked(charArray4, writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Writer.write(char[], int, int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, #, a]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray2 = org.apache.commons.io.IOUtils.toByteArray(inputStream1);
        org.apache.commons.io.IOUtils.closeQuietly((java.io.Closeable) inputStream1);
        java.util.List<java.lang.String> strList4 = org.apache.commons.io.IOUtils.readLines(inputStream1);
        java.io.OutputStream outputStream5 = null;
        long long6 = org.apache.commons.io.IOUtils.copyLarge(inputStream1, outputStream5);
        java.io.OutputStream outputStream7 = null;
        java.io.InputStream inputStream11 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray12 = new byte[] {};
        int int13 = org.apache.commons.io.IOUtils.length(byteArray12);
        int int14 = org.apache.commons.io.IOUtils.read(inputStream11, byteArray12);
        long long15 = org.apache.commons.io.IOUtils.copyLarge(inputStream1, outputStream7, (-1L), 1L, byteArray12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.io.IOUtils.toString(inputStream1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(inputStream11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        java.io.Writer writer1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write((java.lang.CharSequence) "\n", writer1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Writer.write(String)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        char[] charArray0 = new char[] {};
        int int1 = org.apache.commons.io.IOUtils.length(charArray0);
        java.io.Writer writer2 = null;
        org.apache.commons.io.IOUtils.writeChunked(charArray0, writer2);
        java.io.OutputStream outputStream4 = null;
        java.nio.charset.Charset charset5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write(charArray0, outputStream4, charset5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(byte[])\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray2 = org.apache.commons.io.IOUtils.toByteArray(inputStream1);
        org.apache.commons.io.IOUtils.closeQuietly((java.io.Closeable) inputStream1);
        java.nio.charset.Charset charset4 = null;
        org.apache.commons.io.LineIterator lineIterator5 = org.apache.commons.io.IOUtils.lineIterator(inputStream1, charset4);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray7 = org.apache.commons.io.IOUtils.toByteArray(inputStream1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Unexpected read size. current: 0, expected: 35");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(lineIterator5);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        java.io.Reader reader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.skipFully(reader0, (long) '\\');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"input\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write((java.lang.CharSequence) "\r\n", outputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(byte[])\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        java.io.Reader reader0 = null;
        char[] charArray1 = new char[] {};
        int int2 = org.apache.commons.io.IOUtils.length(charArray1);
        java.io.Writer writer3 = null;
        org.apache.commons.io.IOUtils.writeChunked(charArray1, writer3);
        org.apache.commons.io.IOUtils.readFully(reader0, charArray1);
        java.io.OutputStream outputStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write(charArray1, outputStream6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(byte[])\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream2 = null;
        java.io.InputStream inputStream5 = null;
        byte[] byteArray7 = org.apache.commons.io.IOUtils.toByteArray("");
        int int8 = org.apache.commons.io.IOUtils.read(inputStream5, byteArray7);
        long long9 = org.apache.commons.io.IOUtils.copyLarge(inputStream1, outputStream2, 0L, 0L, byteArray7);
        java.nio.charset.Charset charset10 = null;
        java.util.List<java.lang.String> strList11 = org.apache.commons.io.IOUtils.readLines(inputStream1, charset10);
        java.io.InputStream inputStream13 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream14 = null;
        java.io.InputStream inputStream17 = null;
        byte[] byteArray19 = org.apache.commons.io.IOUtils.toByteArray("");
        int int20 = org.apache.commons.io.IOUtils.read(inputStream17, byteArray19);
        long long21 = org.apache.commons.io.IOUtils.copyLarge(inputStream13, outputStream14, 0L, 0L, byteArray19);
        java.nio.charset.Charset charset22 = null;
        java.util.List<java.lang.String> strList23 = org.apache.commons.io.IOUtils.readLines(inputStream13, charset22);
        org.apache.commons.io.IOUtils.close((java.io.Closeable) inputStream13);
        boolean boolean25 = org.apache.commons.io.IOUtils.contentEquals(inputStream1, inputStream13);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.skipFully(inputStream13, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: Bytes to skip: 97 actual: 0");
        } catch (java.io.EOFException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(inputStream13);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        java.net.URI uRI0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.io.IOUtils.toString(uRI0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.net.URI.toURL()\" because \"uri\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL1 = org.apache.commons.io.IOUtils.resourceToURL("hi!");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Resource not found: hi!");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray2 = new byte[] {};
        int int3 = org.apache.commons.io.IOUtils.length(byteArray2);
        int int4 = org.apache.commons.io.IOUtils.read(inputStream1, byteArray2);
        byte[] byteArray5 = org.apache.commons.io.IOUtils.toByteArray(inputStream1);
        java.util.function.Consumer<java.io.IOException> iOExceptionConsumer6 = null;
        org.apache.commons.io.IOUtils.closeQuietly((java.io.Closeable) inputStream1, iOExceptionConsumer6);
        org.apache.commons.io.IOUtils.close((java.io.Closeable) inputStream1);
        java.io.BufferedInputStream bufferedInputStream10 = org.apache.commons.io.IOUtils.buffer(inputStream1, (int) (byte) 10);
        java.io.InputStream inputStream12 = org.apache.commons.io.IOUtils.toBufferedInputStream(inputStream1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray14 = org.apache.commons.io.IOUtils.readFully(inputStream12, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: Length to read: 100 actual: 0");
        } catch (java.io.EOFException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(bufferedInputStream10);
        org.junit.Assert.assertNotNull(inputStream12);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        java.io.Writer writer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.BufferedWriter bufferedWriter2 = org.apache.commons.io.IOUtils.buffer(writer0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray2 = new byte[] {};
        int int3 = org.apache.commons.io.IOUtils.length(byteArray2);
        int int4 = org.apache.commons.io.IOUtils.read(inputStream1, byteArray2);
        byte[] byteArray5 = org.apache.commons.io.IOUtils.toByteArray(inputStream1);
        java.util.function.Consumer<java.io.IOException> iOExceptionConsumer6 = null;
        org.apache.commons.io.IOUtils.closeQuietly((java.io.Closeable) inputStream1, iOExceptionConsumer6);
        org.apache.commons.io.IOUtils.close((java.io.Closeable) inputStream1);
        java.io.BufferedInputStream bufferedInputStream10 = org.apache.commons.io.IOUtils.buffer(inputStream1, (int) (byte) 10);
        java.io.InputStream inputStream12 = org.apache.commons.io.IOUtils.toBufferedInputStream(inputStream1, (int) (byte) 1);
        java.io.OutputStream outputStream13 = null;
        int int14 = org.apache.commons.io.IOUtils.copy(inputStream12, outputStream13);
        org.apache.commons.io.function.IOConsumer<java.io.IOException> iOExceptionIOConsumer15 = null;
        org.apache.commons.io.IOUtils.close((java.io.Closeable) outputStream13, iOExceptionIOConsumer15);
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(bufferedInputStream10);
        org.junit.Assert.assertNotNull(inputStream12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        java.lang.ClassLoader classLoader1 = null;
        java.net.URL uRL2 = org.apache.commons.io.IOUtils.resourceToURL("", classLoader1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.io.IOUtils.toString(uRL2, "hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(uRL2);
        org.junit.Assert.assertEquals(uRL2.toString(), "file:/F:/Mathieu/git/commons-io/bin/org/apache/commons/io/");
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        java.io.Reader reader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.BufferedReader bufferedReader2 = org.apache.commons.io.IOUtils.buffer(reader0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray2 = new byte[] {};
        int int3 = org.apache.commons.io.IOUtils.length(byteArray2);
        int int4 = org.apache.commons.io.IOUtils.read(inputStream1, byteArray2);
        byte[] byteArray5 = org.apache.commons.io.IOUtils.toByteArray(inputStream1);
        java.util.function.Consumer<java.io.IOException> iOExceptionConsumer6 = null;
        org.apache.commons.io.IOUtils.closeQuietly((java.io.Closeable) inputStream1, iOExceptionConsumer6);
        org.apache.commons.io.IOUtils.close((java.io.Closeable) inputStream1);
        java.io.BufferedInputStream bufferedInputStream10 = org.apache.commons.io.IOUtils.buffer(inputStream1, (int) (byte) 10);
        java.io.InputStream inputStream12 = org.apache.commons.io.IOUtils.toBufferedInputStream(inputStream1, (int) (byte) 1);
        java.io.OutputStream outputStream13 = null;
        int int14 = org.apache.commons.io.IOUtils.copy(inputStream12, outputStream13);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray16 = org.apache.commons.io.IOUtils.toByteArray(inputStream12, 10);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Unexpected read size. current: 0, expected: 10");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(bufferedInputStream10);
        org.junit.Assert.assertNotNull(inputStream12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        java.io.Reader reader0 = null;
        java.io.OutputStream outputStream1 = null;
        java.nio.charset.Charset charset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.copy(reader0, outputStream1, charset2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream2 = null;
        java.io.InputStream inputStream5 = null;
        byte[] byteArray7 = org.apache.commons.io.IOUtils.toByteArray("");
        int int8 = org.apache.commons.io.IOUtils.read(inputStream5, byteArray7);
        long long9 = org.apache.commons.io.IOUtils.copyLarge(inputStream1, outputStream2, 0L, 0L, byteArray7);
        java.nio.charset.Charset charset10 = null;
        java.util.List<java.lang.String> strList11 = org.apache.commons.io.IOUtils.readLines(inputStream1, charset10);
        org.apache.commons.io.IOUtils.closeQuietly((java.io.Closeable) inputStream1);
        java.io.OutputStream outputStream13 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long16 = org.apache.commons.io.IOUtils.copyLarge(inputStream1, outputStream13, (long) '#', 10L);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: Bytes to skip: 35 actual: 0");
        } catch (java.io.EOFException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        java.io.Reader reader0 = null;
        java.io.Writer writer1 = null;
        char[] charArray6 = new char[] { '4', 'a', '#', 'a' };
        int int7 = org.apache.commons.io.IOUtils.length(charArray6);
        // The following exception was thrown during execution in test generation
        try {
            long long8 = org.apache.commons.io.IOUtils.copyLarge(reader0, writer1, charArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[])\" because \"input\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4, a, #, a]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        java.nio.channels.ReadableByteChannel readableByteChannel0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.skipFully(readableByteChannel0, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.ReadableByteChannel.read(java.nio.ByteBuffer)\" because \"input\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream("hi!");
        java.io.InputStream inputStream3 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray4 = new byte[] {};
        int int5 = org.apache.commons.io.IOUtils.length(byteArray4);
        int int6 = org.apache.commons.io.IOUtils.read(inputStream3, byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.readFully(inputStream1, byteArray4, 3, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [3, 3 + 4) out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(inputStream3);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        java.nio.charset.Charset charset1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.io.IOUtils.resourceToString("\n", charset1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Resource not found: ?");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray1 = org.apache.commons.io.IOUtils.resourceToByteArray("\n");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Resource not found: ?");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray2 = new byte[] {};
        int int3 = org.apache.commons.io.IOUtils.length(byteArray2);
        int int4 = org.apache.commons.io.IOUtils.read(inputStream1, byteArray2);
        byte[] byteArray5 = org.apache.commons.io.IOUtils.toByteArray(inputStream1);
        java.util.function.Consumer<java.io.IOException> iOExceptionConsumer6 = null;
        org.apache.commons.io.IOUtils.closeQuietly((java.io.Closeable) inputStream1, iOExceptionConsumer6);
        org.apache.commons.io.IOUtils.close((java.io.Closeable) inputStream1);
        java.io.BufferedInputStream bufferedInputStream10 = org.apache.commons.io.IOUtils.buffer(inputStream1, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.LineIterator lineIterator12 = org.apache.commons.io.IOUtils.lineIterator(inputStream1, "\n");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ?");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(bufferedInputStream10);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        java.nio.channels.ReadableByteChannel readableByteChannel0 = null;
        java.nio.ByteBuffer byteBuffer1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.readFully(readableByteChannel0, byteBuffer1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.ByteBuffer.remaining()\" because \"buffer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream2 = org.apache.commons.io.IOUtils.toInputStream(charSequence0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        java.nio.charset.Charset charset1 = null;
        java.io.InputStream inputStream2 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "\r\n", charset1);
        java.io.OutputStream outputStream3 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long4 = org.apache.commons.io.IOUtils.copyLarge(inputStream2, outputStream3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(byte[], int, int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream2);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream2 = org.apache.commons.io.IOUtils.toInputStream("", "");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        java.io.Reader reader0 = null;
        java.io.Writer writer1 = null;
        long long4 = org.apache.commons.io.IOUtils.copyLarge(reader0, writer1, 0L, 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        java.io.Reader reader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.io.IOUtils.skip(reader0, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"input\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        java.io.Closeable[] closeableArray0 = null;
        org.apache.commons.io.IOUtils.closeQuietly(closeableArray0);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        java.io.Reader reader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.io.IOUtils.skip(reader0, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"input\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream2 = null;
        java.io.InputStream inputStream5 = null;
        byte[] byteArray7 = org.apache.commons.io.IOUtils.toByteArray("");
        int int8 = org.apache.commons.io.IOUtils.read(inputStream5, byteArray7);
        long long9 = org.apache.commons.io.IOUtils.copyLarge(inputStream1, outputStream2, 0L, 0L, byteArray7);
        java.io.OutputStream outputStream10 = null;
        long long13 = org.apache.commons.io.IOUtils.copyLarge(inputStream1, outputStream10, (long) (short) 0, (-1L));
        java.util.function.Consumer<java.io.IOException> iOExceptionConsumer14 = null;
        org.apache.commons.io.IOUtils.closeQuietly((java.io.Closeable) outputStream10, iOExceptionConsumer14);
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        java.io.Writer writer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.BufferedWriter bufferedWriter2 = org.apache.commons.io.IOUtils.buffer(writer0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray1 = org.apache.commons.io.IOUtils.resourceToByteArray("hi!");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Resource not found: hi!");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray2 = new byte[] {};
        int int3 = org.apache.commons.io.IOUtils.length(byteArray2);
        int int4 = org.apache.commons.io.IOUtils.read(inputStream1, byteArray2);
        byte[] byteArray5 = org.apache.commons.io.IOUtils.toByteArray(inputStream1);
        java.io.InputStream inputStream7 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray8 = new byte[] {};
        int int9 = org.apache.commons.io.IOUtils.length(byteArray8);
        int int10 = org.apache.commons.io.IOUtils.read(inputStream7, byteArray8);
        byte[] byteArray11 = org.apache.commons.io.IOUtils.toByteArray(inputStream7);
        int int12 = org.apache.commons.io.IOUtils.length(byteArray11);
        org.apache.commons.io.IOUtils.readFully(inputStream1, byteArray11);
        java.io.Writer writer14 = null;
        java.nio.charset.Charset charset15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write(byteArray11, writer14, charset15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Writer.write(String)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        java.io.Writer writer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.BufferedWriter bufferedWriter2 = org.apache.commons.io.IOUtils.buffer(writer0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray2 = org.apache.commons.io.IOUtils.toByteArray(inputStream1);
        org.apache.commons.io.IOUtils.closeQuietly((java.io.Closeable) inputStream1);
        java.util.List<java.lang.String> strList4 = org.apache.commons.io.IOUtils.readLines(inputStream1);
        java.io.OutputStream outputStream5 = null;
        long long6 = org.apache.commons.io.IOUtils.copyLarge(inputStream1, outputStream5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList8 = org.apache.commons.io.IOUtils.readLines(inputStream1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        java.io.Reader reader0 = null;
        java.io.Writer writer1 = null;
        char[] charArray4 = new char[] {};
        long long5 = org.apache.commons.io.IOUtils.copyLarge(reader0, writer1, (long) (byte) 0, (long) 1, charArray4);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write(charArray4, writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Writer.write(char[])\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        char[] charArray4 = new char[] { '4', 'a', '#', 'a' };
        int int5 = org.apache.commons.io.IOUtils.length(charArray4);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write(charArray4, writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Writer.write(char[])\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, #, a]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        char[] charArray4 = new char[] { '4', 'a', '#', 'a' };
        int int5 = org.apache.commons.io.IOUtils.length(charArray4);
        int int6 = org.apache.commons.io.IOUtils.length(charArray4);
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write(charArray4, outputStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(byte[])\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, #, a]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        java.io.InputStream inputStream0 = null;
        byte[] byteArray2 = org.apache.commons.io.IOUtils.toByteArray("");
        int int3 = org.apache.commons.io.IOUtils.read(inputStream0, byteArray2);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write(byteArray2, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Writer.write(String)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write("\n", outputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(byte[])\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream2 = org.apache.commons.io.IOUtils.toInputStream("\r\n", "\n");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ?");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        java.lang.ClassLoader classLoader1 = null;
        java.net.URL uRL2 = org.apache.commons.io.IOUtils.resourceToURL("", classLoader1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.io.IOUtils.toString(uRL2, "");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(uRL2);
        org.junit.Assert.assertEquals(uRL2.toString(), "file:/F:/Mathieu/git/commons-io/bin/org/apache/commons/io/");
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        java.io.InputStream inputStream0 = null;
        byte[] byteArray1 = new byte[] {};
        int int2 = org.apache.commons.io.IOUtils.read(inputStream0, byteArray1);
        java.io.Writer writer3 = null;
        java.nio.charset.Charset charset4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write(byteArray1, writer3, charset4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Writer.write(String)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray2 = new byte[] {};
        int int3 = org.apache.commons.io.IOUtils.length(byteArray2);
        int int4 = org.apache.commons.io.IOUtils.read(inputStream1, byteArray2);
        java.nio.charset.Charset charset5 = null;
        java.lang.String str6 = org.apache.commons.io.IOUtils.toString(inputStream1, charset5);
        java.io.InputStream inputStream8 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray9 = org.apache.commons.io.IOUtils.toByteArray(inputStream8);
        org.apache.commons.io.IOUtils.closeQuietly((java.io.Closeable) inputStream8);
        java.io.InputStream inputStream12 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream13 = null;
        java.io.InputStream inputStream16 = null;
        byte[] byteArray18 = org.apache.commons.io.IOUtils.toByteArray("");
        int int19 = org.apache.commons.io.IOUtils.read(inputStream16, byteArray18);
        long long20 = org.apache.commons.io.IOUtils.copyLarge(inputStream12, outputStream13, 0L, 0L, byteArray18);
        java.nio.charset.Charset charset21 = null;
        java.util.List<java.lang.String> strList22 = org.apache.commons.io.IOUtils.readLines(inputStream12, charset21);
        java.io.InputStream inputStream24 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream25 = null;
        java.io.InputStream inputStream28 = null;
        byte[] byteArray30 = org.apache.commons.io.IOUtils.toByteArray("");
        int int31 = org.apache.commons.io.IOUtils.read(inputStream28, byteArray30);
        long long32 = org.apache.commons.io.IOUtils.copyLarge(inputStream24, outputStream25, 0L, 0L, byteArray30);
        java.nio.charset.Charset charset33 = null;
        java.util.List<java.lang.String> strList34 = org.apache.commons.io.IOUtils.readLines(inputStream24, charset33);
        org.apache.commons.io.IOUtils.close((java.io.Closeable) inputStream24);
        boolean boolean36 = org.apache.commons.io.IOUtils.contentEquals(inputStream12, inputStream24);
        java.io.OutputStream outputStream37 = null;
        java.io.InputStream inputStream39 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream40 = null;
        java.io.InputStream inputStream43 = null;
        byte[] byteArray45 = org.apache.commons.io.IOUtils.toByteArray("");
        int int46 = org.apache.commons.io.IOUtils.read(inputStream43, byteArray45);
        long long47 = org.apache.commons.io.IOUtils.copyLarge(inputStream39, outputStream40, 0L, 0L, byteArray45);
        long long48 = org.apache.commons.io.IOUtils.copyLarge(inputStream24, outputStream37, byteArray45);
        org.apache.commons.io.IOUtils.readFully(inputStream8, byteArray45);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.readFully(inputStream1, byteArray45, 3, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Length must not be negative: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(inputStream8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(inputStream12);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(inputStream24);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(inputStream39);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        java.io.Writer writer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.BufferedWriter bufferedWriter2 = org.apache.commons.io.IOUtils.buffer(writer0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray2 = new byte[] {};
        int int3 = org.apache.commons.io.IOUtils.length(byteArray2);
        int int4 = org.apache.commons.io.IOUtils.read(inputStream1, byteArray2);
        byte[] byteArray5 = org.apache.commons.io.IOUtils.toByteArray(inputStream1);
        java.util.function.Consumer<java.io.IOException> iOExceptionConsumer6 = null;
        org.apache.commons.io.IOUtils.closeQuietly((java.io.Closeable) inputStream1, iOExceptionConsumer6);
        org.apache.commons.io.IOUtils.close((java.io.Closeable) inputStream1);
        java.io.BufferedInputStream bufferedInputStream10 = org.apache.commons.io.IOUtils.buffer(inputStream1, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.skipFully((java.io.InputStream) bufferedInputStream10, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Bytes to skip must not be negative: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(bufferedInputStream10);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        char[] charArray0 = new char[] {};
        int int1 = org.apache.commons.io.IOUtils.length(charArray0);
        java.io.Writer writer2 = null;
        org.apache.commons.io.IOUtils.writeChunked(charArray0, writer2);
        java.io.OutputStream outputStream4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write(charArray0, outputStream4, "\r\n");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ??");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray2 = new byte[] {};
        int int3 = org.apache.commons.io.IOUtils.length(byteArray2);
        int int4 = org.apache.commons.io.IOUtils.read(inputStream1, byteArray2);
        byte[] byteArray5 = org.apache.commons.io.IOUtils.toByteArray(inputStream1);
        java.util.function.Consumer<java.io.IOException> iOExceptionConsumer6 = null;
        org.apache.commons.io.IOUtils.closeQuietly((java.io.Closeable) inputStream1, iOExceptionConsumer6);
        org.apache.commons.io.IOUtils.close((java.io.Closeable) inputStream1);
        java.io.BufferedInputStream bufferedInputStream10 = org.apache.commons.io.IOUtils.buffer(inputStream1, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.io.BufferedInputStream bufferedInputStream12 = org.apache.commons.io.IOUtils.buffer(inputStream1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Buffer size <= 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(bufferedInputStream10);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        java.io.Reader reader0 = null;
        char[] charArray1 = new char[] {};
        int int2 = org.apache.commons.io.IOUtils.length(charArray1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.readFully(reader0, charArray1, (int) (byte) 10, (int) '\\');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"input\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write("", outputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(byte[])\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        java.io.OutputStream outputStream1 = null;
        java.nio.charset.Charset charset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write("", outputStream1, charset2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(byte[])\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        java.nio.channels.ReadableByteChannel readableByteChannel0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.skipFully(readableByteChannel0, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.ReadableByteChannel.read(java.nio.ByteBuffer)\" because \"input\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray2 = new byte[] {};
        int int3 = org.apache.commons.io.IOUtils.length(byteArray2);
        int int4 = org.apache.commons.io.IOUtils.read(inputStream1, byteArray2);
        byte[] byteArray5 = org.apache.commons.io.IOUtils.toByteArray(inputStream1);
        java.util.function.Consumer<java.io.IOException> iOExceptionConsumer6 = null;
        org.apache.commons.io.IOUtils.closeQuietly((java.io.Closeable) inputStream1, iOExceptionConsumer6);
        org.apache.commons.io.IOUtils.close((java.io.Closeable) inputStream1);
        java.io.BufferedInputStream bufferedInputStream10 = org.apache.commons.io.IOUtils.buffer(inputStream1, (int) (byte) 10);
        java.io.Writer writer11 = null;
        org.apache.commons.io.IOUtils.copy((java.io.InputStream) bufferedInputStream10, writer11);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList14 = org.apache.commons.io.IOUtils.readLines((java.io.InputStream) bufferedInputStream10, "\n");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ?");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(bufferedInputStream10);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        java.io.Reader reader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.BufferedReader bufferedReader2 = org.apache.commons.io.IOUtils.buffer(reader0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        char[] charArray0 = null;
        java.io.OutputStream outputStream1 = null;
        org.apache.commons.io.IOUtils.write(charArray0, outputStream1);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        char[] charArray0 = new char[] {};
        int int1 = org.apache.commons.io.IOUtils.length(charArray0);
        java.io.OutputStream outputStream2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write(charArray0, outputStream2, "");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        java.io.Reader reader0 = null;
        long long2 = org.apache.commons.io.IOUtils.skip(reader0, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream2 = null;
        java.io.InputStream inputStream5 = null;
        byte[] byteArray7 = org.apache.commons.io.IOUtils.toByteArray("");
        int int8 = org.apache.commons.io.IOUtils.read(inputStream5, byteArray7);
        long long9 = org.apache.commons.io.IOUtils.copyLarge(inputStream1, outputStream2, 0L, 0L, byteArray7);
        java.io.InputStream inputStream11 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray12 = new byte[] {};
        int int13 = org.apache.commons.io.IOUtils.length(byteArray12);
        int int14 = org.apache.commons.io.IOUtils.read(inputStream11, byteArray12);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.readFully(inputStream1, byteArray12, 4, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [4, 4 + 10) out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(inputStream11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray2 = org.apache.commons.io.IOUtils.toByteArray(inputStream1);
        org.apache.commons.io.IOUtils.closeQuietly((java.io.Closeable) inputStream1);
        java.util.List<java.lang.String> strList4 = org.apache.commons.io.IOUtils.readLines(inputStream1);
        java.io.BufferedInputStream bufferedInputStream5 = org.apache.commons.io.IOUtils.buffer(inputStream1);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray7 = org.apache.commons.io.IOUtils.toByteArray(inputStream1, (int) '/');
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Unexpected read size. current: 0, expected: 47");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(bufferedInputStream5);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream2 = null;
        java.io.InputStream inputStream4 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream5 = null;
        java.io.InputStream inputStream8 = null;
        byte[] byteArray10 = org.apache.commons.io.IOUtils.toByteArray("");
        int int11 = org.apache.commons.io.IOUtils.read(inputStream8, byteArray10);
        long long12 = org.apache.commons.io.IOUtils.copyLarge(inputStream4, outputStream5, 0L, 0L, byteArray10);
        long long13 = org.apache.commons.io.IOUtils.copyLarge(inputStream1, outputStream2, byteArray10);
        java.io.BufferedInputStream bufferedInputStream15 = org.apache.commons.io.IOUtils.buffer(inputStream1, (int) (byte) 10);
        java.io.InputStream inputStream17 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray18 = org.apache.commons.io.IOUtils.toByteArray(inputStream17);
        org.apache.commons.io.IOUtils.closeQuietly((java.io.Closeable) inputStream17);
        java.io.InputStream inputStream21 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream22 = null;
        java.io.InputStream inputStream25 = null;
        byte[] byteArray27 = org.apache.commons.io.IOUtils.toByteArray("");
        int int28 = org.apache.commons.io.IOUtils.read(inputStream25, byteArray27);
        long long29 = org.apache.commons.io.IOUtils.copyLarge(inputStream21, outputStream22, 0L, 0L, byteArray27);
        java.nio.charset.Charset charset30 = null;
        java.util.List<java.lang.String> strList31 = org.apache.commons.io.IOUtils.readLines(inputStream21, charset30);
        java.io.InputStream inputStream33 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream34 = null;
        java.io.InputStream inputStream37 = null;
        byte[] byteArray39 = org.apache.commons.io.IOUtils.toByteArray("");
        int int40 = org.apache.commons.io.IOUtils.read(inputStream37, byteArray39);
        long long41 = org.apache.commons.io.IOUtils.copyLarge(inputStream33, outputStream34, 0L, 0L, byteArray39);
        java.nio.charset.Charset charset42 = null;
        java.util.List<java.lang.String> strList43 = org.apache.commons.io.IOUtils.readLines(inputStream33, charset42);
        org.apache.commons.io.IOUtils.close((java.io.Closeable) inputStream33);
        boolean boolean45 = org.apache.commons.io.IOUtils.contentEquals(inputStream21, inputStream33);
        java.io.OutputStream outputStream46 = null;
        java.io.InputStream inputStream48 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream49 = null;
        java.io.InputStream inputStream52 = null;
        byte[] byteArray54 = org.apache.commons.io.IOUtils.toByteArray("");
        int int55 = org.apache.commons.io.IOUtils.read(inputStream52, byteArray54);
        long long56 = org.apache.commons.io.IOUtils.copyLarge(inputStream48, outputStream49, 0L, 0L, byteArray54);
        long long57 = org.apache.commons.io.IOUtils.copyLarge(inputStream33, outputStream46, byteArray54);
        org.apache.commons.io.IOUtils.readFully(inputStream17, byteArray54);
        org.apache.commons.io.IOUtils.readFully((java.io.InputStream) bufferedInputStream15, byteArray54);
        java.io.Writer writer60 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write(byteArray54, writer60, "");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(inputStream4);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(bufferedInputStream15);
        org.junit.Assert.assertNotNull(inputStream17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
        org.junit.Assert.assertNotNull(inputStream21);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertNotNull(inputStream33);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(inputStream48);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray54), "[]");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        java.io.Reader reader0 = null;
        char[] charArray5 = new char[] { '4', 'a', '#', 'a' };
        int int6 = org.apache.commons.io.IOUtils.length(charArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = org.apache.commons.io.IOUtils.read(reader0, charArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"input\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "4a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "4a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[4, a, #, a]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray2 = org.apache.commons.io.IOUtils.toByteArray(inputStream1);
        org.apache.commons.io.IOUtils.closeQuietly((java.io.Closeable) inputStream1);
        java.util.List<java.lang.String> strList4 = org.apache.commons.io.IOUtils.readLines(inputStream1);
        java.io.OutputStream outputStream5 = null;
        long long6 = org.apache.commons.io.IOUtils.copyLarge(inputStream1, outputStream5);
        java.io.Writer writer7 = null;
        org.apache.commons.io.IOUtils.copy(inputStream1, writer7);
        org.apache.commons.io.IOUtils.close((java.io.Closeable) writer7);
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write((java.lang.CharSequence) "hi!", outputStream1, "");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream2 = org.apache.commons.io.IOUtils.toInputStream("hi!", "\n");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ?");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        java.io.Reader reader0 = null;
        java.io.Writer writer1 = null;
        char[] charArray7 = new char[] { '\\', 'a', '#', '4', '/' };
        // The following exception was thrown during execution in test generation
        try {
            long long8 = org.apache.commons.io.IOUtils.copyLarge(reader0, writer1, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[])\" because \"input\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\\a#4/");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\\a#4/");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\\, a, #, 4, /]");
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        java.net.URL uRL1 = org.apache.commons.io.IOUtils.resourceToURL("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.io.IOUtils.toString(uRL1, "");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(uRL1);
        org.junit.Assert.assertEquals(uRL1.toString(), "file:/F:/Mathieu/git/commons-io/bin/org/apache/commons/io/");
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray2 = new byte[] {};
        int int3 = org.apache.commons.io.IOUtils.length(byteArray2);
        int int4 = org.apache.commons.io.IOUtils.read(inputStream1, byteArray2);
        byte[] byteArray5 = org.apache.commons.io.IOUtils.toByteArray(inputStream1);
        java.util.function.Consumer<java.io.IOException> iOExceptionConsumer6 = null;
        org.apache.commons.io.IOUtils.closeQuietly((java.io.Closeable) inputStream1, iOExceptionConsumer6);
        org.apache.commons.io.IOUtils.close((java.io.Closeable) inputStream1);
        java.io.BufferedInputStream bufferedInputStream10 = org.apache.commons.io.IOUtils.buffer(inputStream1, (int) (byte) 10);
        org.apache.commons.io.function.IOConsumer<java.io.IOException> iOExceptionIOConsumer11 = null;
        org.apache.commons.io.IOUtils.close((java.io.Closeable) bufferedInputStream10, iOExceptionIOConsumer11);
        java.io.OutputStream outputStream13 = null;
        byte[] byteArray16 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long17 = org.apache.commons.io.IOUtils.copyLarge((java.io.InputStream) bufferedInputStream10, outputStream13, (long) (byte) 100, (long) (short) 0, byteArray16);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(bufferedInputStream10);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream2 = null;
        java.io.InputStream inputStream5 = null;
        byte[] byteArray7 = org.apache.commons.io.IOUtils.toByteArray("");
        int int8 = org.apache.commons.io.IOUtils.read(inputStream5, byteArray7);
        long long9 = org.apache.commons.io.IOUtils.copyLarge(inputStream1, outputStream2, 0L, 0L, byteArray7);
        java.nio.charset.Charset charset10 = null;
        java.util.List<java.lang.String> strList11 = org.apache.commons.io.IOUtils.readLines(inputStream1, charset10);
        java.io.InputStream inputStream13 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream14 = null;
        java.io.InputStream inputStream17 = null;
        byte[] byteArray19 = org.apache.commons.io.IOUtils.toByteArray("");
        int int20 = org.apache.commons.io.IOUtils.read(inputStream17, byteArray19);
        long long21 = org.apache.commons.io.IOUtils.copyLarge(inputStream13, outputStream14, 0L, 0L, byteArray19);
        java.nio.charset.Charset charset22 = null;
        java.util.List<java.lang.String> strList23 = org.apache.commons.io.IOUtils.readLines(inputStream13, charset22);
        org.apache.commons.io.IOUtils.close((java.io.Closeable) inputStream13);
        boolean boolean25 = org.apache.commons.io.IOUtils.contentEquals(inputStream1, inputStream13);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray27 = org.apache.commons.io.IOUtils.readFully(inputStream1, 10);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: Length to read: 10 actual: 0");
        } catch (java.io.EOFException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(inputStream13);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        java.nio.channels.ReadableByteChannel readableByteChannel0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.io.IOUtils.skip(readableByteChannel0, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.ReadableByteChannel.read(java.nio.ByteBuffer)\" because \"input\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        java.io.Reader reader0 = null;
        char[] charArray1 = new char[] {};
        int int2 = org.apache.commons.io.IOUtils.length(charArray1);
        java.io.Writer writer3 = null;
        org.apache.commons.io.IOUtils.writeChunked(charArray1, writer3);
        org.apache.commons.io.IOUtils.readFully(reader0, charArray1);
        java.io.OutputStream outputStream6 = null;
        java.nio.charset.Charset charset7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write(charArray1, outputStream6, charset7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(byte[])\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream2 = null;
        java.io.InputStream inputStream5 = null;
        byte[] byteArray7 = org.apache.commons.io.IOUtils.toByteArray("");
        int int8 = org.apache.commons.io.IOUtils.read(inputStream5, byteArray7);
        long long9 = org.apache.commons.io.IOUtils.copyLarge(inputStream1, outputStream2, 0L, 0L, byteArray7);
        java.nio.charset.Charset charset10 = null;
        java.util.List<java.lang.String> strList11 = org.apache.commons.io.IOUtils.readLines(inputStream1, charset10);
        java.io.InputStream inputStream13 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream14 = null;
        java.io.InputStream inputStream17 = null;
        byte[] byteArray19 = org.apache.commons.io.IOUtils.toByteArray("");
        int int20 = org.apache.commons.io.IOUtils.read(inputStream17, byteArray19);
        long long21 = org.apache.commons.io.IOUtils.copyLarge(inputStream13, outputStream14, 0L, 0L, byteArray19);
        java.nio.charset.Charset charset22 = null;
        java.util.List<java.lang.String> strList23 = org.apache.commons.io.IOUtils.readLines(inputStream13, charset22);
        org.apache.commons.io.IOUtils.close((java.io.Closeable) inputStream13);
        boolean boolean25 = org.apache.commons.io.IOUtils.contentEquals(inputStream1, inputStream13);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray27 = org.apache.commons.io.IOUtils.toByteArray(inputStream13, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Size must be equal or greater than zero: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(inputStream13);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        java.io.Reader reader0 = null;
        char[] charArray5 = new char[] { '4', 'a', '#', 'a' };
        int int6 = org.apache.commons.io.IOUtils.length(charArray5);
        int int7 = org.apache.commons.io.IOUtils.length(charArray5);
        int int8 = org.apache.commons.io.IOUtils.length(charArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = org.apache.commons.io.IOUtils.read(reader0, charArray5, 6, (int) '\\');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"input\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "4a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "4a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[4, a, #, a]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        java.nio.channels.ReadableByteChannel readableByteChannel0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.io.IOUtils.skip(readableByteChannel0, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.ReadableByteChannel.read(java.nio.ByteBuffer)\" because \"input\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        java.util.Collection<java.lang.String> strCollection0 = null;
        java.io.Writer writer2 = null;
        org.apache.commons.io.IOUtils.writeLines(strCollection0, "", writer2);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        java.io.Writer writer1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write((java.lang.CharSequence) "\r\n", writer1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Writer.write(String)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        java.io.Reader reader0 = null;
        java.io.Writer writer1 = null;
        char[] charArray2 = new char[] {};
        int int3 = org.apache.commons.io.IOUtils.length(charArray2);
        // The following exception was thrown during execution in test generation
        try {
            long long4 = org.apache.commons.io.IOUtils.copyLarge(reader0, writer1, charArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[])\" because \"input\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream2 = null;
        java.io.InputStream inputStream4 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream5 = null;
        java.io.InputStream inputStream8 = null;
        byte[] byteArray10 = org.apache.commons.io.IOUtils.toByteArray("");
        int int11 = org.apache.commons.io.IOUtils.read(inputStream8, byteArray10);
        long long12 = org.apache.commons.io.IOUtils.copyLarge(inputStream4, outputStream5, 0L, 0L, byteArray10);
        long long13 = org.apache.commons.io.IOUtils.copyLarge(inputStream1, outputStream2, byteArray10);
        java.io.BufferedInputStream bufferedInputStream15 = org.apache.commons.io.IOUtils.buffer(inputStream1, (int) (byte) 10);
        java.io.InputStream inputStream17 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray18 = org.apache.commons.io.IOUtils.toByteArray(inputStream17);
        org.apache.commons.io.IOUtils.closeQuietly((java.io.Closeable) inputStream17);
        java.io.InputStream inputStream21 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream22 = null;
        java.io.InputStream inputStream25 = null;
        byte[] byteArray27 = org.apache.commons.io.IOUtils.toByteArray("");
        int int28 = org.apache.commons.io.IOUtils.read(inputStream25, byteArray27);
        long long29 = org.apache.commons.io.IOUtils.copyLarge(inputStream21, outputStream22, 0L, 0L, byteArray27);
        java.nio.charset.Charset charset30 = null;
        java.util.List<java.lang.String> strList31 = org.apache.commons.io.IOUtils.readLines(inputStream21, charset30);
        java.io.InputStream inputStream33 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream34 = null;
        java.io.InputStream inputStream37 = null;
        byte[] byteArray39 = org.apache.commons.io.IOUtils.toByteArray("");
        int int40 = org.apache.commons.io.IOUtils.read(inputStream37, byteArray39);
        long long41 = org.apache.commons.io.IOUtils.copyLarge(inputStream33, outputStream34, 0L, 0L, byteArray39);
        java.nio.charset.Charset charset42 = null;
        java.util.List<java.lang.String> strList43 = org.apache.commons.io.IOUtils.readLines(inputStream33, charset42);
        org.apache.commons.io.IOUtils.close((java.io.Closeable) inputStream33);
        boolean boolean45 = org.apache.commons.io.IOUtils.contentEquals(inputStream21, inputStream33);
        java.io.OutputStream outputStream46 = null;
        java.io.InputStream inputStream48 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream49 = null;
        java.io.InputStream inputStream52 = null;
        byte[] byteArray54 = org.apache.commons.io.IOUtils.toByteArray("");
        int int55 = org.apache.commons.io.IOUtils.read(inputStream52, byteArray54);
        long long56 = org.apache.commons.io.IOUtils.copyLarge(inputStream48, outputStream49, 0L, 0L, byteArray54);
        long long57 = org.apache.commons.io.IOUtils.copyLarge(inputStream33, outputStream46, byteArray54);
        org.apache.commons.io.IOUtils.readFully(inputStream17, byteArray54);
        org.apache.commons.io.IOUtils.readFully(inputStream1, byteArray54);
        java.io.OutputStream outputStream60 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write(byteArray54, outputStream60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(byte[])\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(inputStream4);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(bufferedInputStream15);
        org.junit.Assert.assertNotNull(inputStream17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
        org.junit.Assert.assertNotNull(inputStream21);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertNotNull(inputStream33);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(inputStream48);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray54), "[]");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream2 = null;
        java.io.InputStream inputStream4 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream5 = null;
        java.io.InputStream inputStream8 = null;
        byte[] byteArray10 = org.apache.commons.io.IOUtils.toByteArray("");
        int int11 = org.apache.commons.io.IOUtils.read(inputStream8, byteArray10);
        long long12 = org.apache.commons.io.IOUtils.copyLarge(inputStream4, outputStream5, 0L, 0L, byteArray10);
        long long13 = org.apache.commons.io.IOUtils.copyLarge(inputStream1, outputStream2, byteArray10);
        java.io.BufferedInputStream bufferedInputStream15 = org.apache.commons.io.IOUtils.buffer(inputStream1, (int) (byte) 10);
        org.apache.commons.io.IOUtils.closeQuietly(inputStream1);
        java.io.InputStream inputStream18 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream19 = null;
        java.io.InputStream inputStream22 = null;
        byte[] byteArray24 = org.apache.commons.io.IOUtils.toByteArray("");
        int int25 = org.apache.commons.io.IOUtils.read(inputStream22, byteArray24);
        long long26 = org.apache.commons.io.IOUtils.copyLarge(inputStream18, outputStream19, 0L, 0L, byteArray24);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = org.apache.commons.io.IOUtils.read(inputStream1, byteArray24, (int) (short) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [100, 100 + 100) out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(inputStream4);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(bufferedInputStream15);
        org.junit.Assert.assertNotNull(inputStream18);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        java.io.Reader reader0 = null;
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.copy(reader0, outputStream1, "\r\n");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ??");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        char[] charArray4 = new char[] { '4', 'a', '#', 'a' };
        int int5 = org.apache.commons.io.IOUtils.length(charArray4);
        java.io.OutputStream outputStream6 = null;
        java.nio.charset.Charset charset7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write(charArray4, outputStream6, charset7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(byte[])\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, #, a]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        int int1 = org.apache.commons.io.IOUtils.length((java.lang.CharSequence) "\r\n");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        java.io.Writer writer1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write("", writer1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Writer.write(String)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        java.io.Reader reader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.io.IOUtils.skip(reader0, (long) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"input\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        java.io.Reader reader0 = null;
        char[] charArray5 = new char[] { '4', 'a', '#', 'a' };
        int int6 = org.apache.commons.io.IOUtils.length(charArray5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.readFully(reader0, charArray5, 3, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"input\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "4a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "4a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[4, a, #, a]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream2 = null;
        java.io.InputStream inputStream5 = null;
        byte[] byteArray7 = org.apache.commons.io.IOUtils.toByteArray("");
        int int8 = org.apache.commons.io.IOUtils.read(inputStream5, byteArray7);
        long long9 = org.apache.commons.io.IOUtils.copyLarge(inputStream1, outputStream2, 0L, 0L, byteArray7);
        java.nio.charset.Charset charset10 = null;
        java.util.List<java.lang.String> strList11 = org.apache.commons.io.IOUtils.readLines(inputStream1, charset10);
        java.io.InputStream inputStream13 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream14 = null;
        java.io.InputStream inputStream17 = null;
        byte[] byteArray19 = org.apache.commons.io.IOUtils.toByteArray("");
        int int20 = org.apache.commons.io.IOUtils.read(inputStream17, byteArray19);
        long long21 = org.apache.commons.io.IOUtils.copyLarge(inputStream13, outputStream14, 0L, 0L, byteArray19);
        java.nio.charset.Charset charset22 = null;
        java.util.List<java.lang.String> strList23 = org.apache.commons.io.IOUtils.readLines(inputStream13, charset22);
        org.apache.commons.io.IOUtils.close((java.io.Closeable) inputStream13);
        boolean boolean25 = org.apache.commons.io.IOUtils.contentEquals(inputStream1, inputStream13);
        java.io.Writer writer26 = null;
        org.apache.commons.io.IOUtils.copy(inputStream13, writer26);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray29 = org.apache.commons.io.IOUtils.toByteArray(inputStream13, (long) '\\');
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Unexpected read size. current: 0, expected: 92");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(inputStream13);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        java.nio.charset.Charset charset1 = null;
        java.io.InputStream inputStream2 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "", charset1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.skipFully(inputStream2, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: Bytes to skip: 100 actual: 0");
        } catch (java.io.EOFException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream2);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        java.io.Reader reader0 = null;
        java.io.Writer writer1 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long4 = org.apache.commons.io.IOUtils.copyLarge(reader0, writer1, (long) 4, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"input\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray2 = new byte[] {};
        int int3 = org.apache.commons.io.IOUtils.length(byteArray2);
        int int4 = org.apache.commons.io.IOUtils.read(inputStream1, byteArray2);
        byte[] byteArray5 = org.apache.commons.io.IOUtils.toByteArray(inputStream1);
        byte[] byteArray7 = org.apache.commons.io.IOUtils.toByteArray(inputStream1, (int) (short) 0);
        long long9 = org.apache.commons.io.IOUtils.skip(inputStream1, 100L);
        java.io.Writer writer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.copy(inputStream1, writer10, "\r\n");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ??");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        java.io.OutputStream outputStream1 = null;
        java.nio.charset.Charset charset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write("hi!", outputStream1, charset2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(byte[])\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        java.lang.StringBuffer stringBuffer0 = null;
        java.io.OutputStream outputStream1 = null;
        org.apache.commons.io.IOUtils.write(stringBuffer0, outputStream1, "");
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray2 = new byte[] {};
        int int3 = org.apache.commons.io.IOUtils.length(byteArray2);
        int int4 = org.apache.commons.io.IOUtils.read(inputStream1, byteArray2);
        byte[] byteArray5 = org.apache.commons.io.IOUtils.toByteArray(inputStream1);
        java.util.function.Consumer<java.io.IOException> iOExceptionConsumer6 = null;
        org.apache.commons.io.IOUtils.closeQuietly((java.io.Closeable) inputStream1, iOExceptionConsumer6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.io.IOUtils.toString(inputStream1, "");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        org.apache.commons.io.IOUtils.closeQuietly((java.io.Closeable) inputStream1);
        java.io.InputStream inputStream3 = org.apache.commons.io.IOUtils.toBufferedInputStream(inputStream1);
        java.io.OutputStream outputStream4 = null;
        byte[] byteArray7 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long8 = org.apache.commons.io.IOUtils.copyLarge(inputStream3, outputStream4, (long) 0, 100L, byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"buffer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(inputStream3);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray3 = org.apache.commons.io.IOUtils.toCharArray(inputStream1, "\n");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ?");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        java.io.Reader reader0 = null;
        java.io.Writer writer1 = null;
        java.io.Reader reader2 = null;
        char[] charArray3 = new char[] {};
        int int4 = org.apache.commons.io.IOUtils.length(charArray3);
        java.io.Writer writer5 = null;
        org.apache.commons.io.IOUtils.writeChunked(charArray3, writer5);
        org.apache.commons.io.IOUtils.readFully(reader2, charArray3);
        // The following exception was thrown during execution in test generation
        try {
            long long8 = org.apache.commons.io.IOUtils.copyLarge(reader0, writer1, charArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[])\" because \"input\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream2 = null;
        java.io.InputStream inputStream4 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream5 = null;
        java.io.InputStream inputStream8 = null;
        byte[] byteArray10 = org.apache.commons.io.IOUtils.toByteArray("");
        int int11 = org.apache.commons.io.IOUtils.read(inputStream8, byteArray10);
        long long12 = org.apache.commons.io.IOUtils.copyLarge(inputStream4, outputStream5, 0L, 0L, byteArray10);
        long long13 = org.apache.commons.io.IOUtils.copyLarge(inputStream1, outputStream2, byteArray10);
        java.io.BufferedInputStream bufferedInputStream15 = org.apache.commons.io.IOUtils.buffer(inputStream1, (int) (byte) 10);
        java.io.OutputStream outputStream16 = null;
        long long17 = org.apache.commons.io.IOUtils.copyLarge((java.io.InputStream) bufferedInputStream15, outputStream16);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray19 = org.apache.commons.io.IOUtils.readFully((java.io.InputStream) bufferedInputStream15, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: Length to read: 1 actual: 0");
        } catch (java.io.EOFException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(inputStream4);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(bufferedInputStream15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        java.nio.charset.Charset charset1 = null;
        java.io.InputStream inputStream2 = org.apache.commons.io.IOUtils.toInputStream("", charset1);
        java.nio.charset.Charset charset3 = null;
        java.lang.String str4 = org.apache.commons.io.IOUtils.toString(inputStream2, charset3);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.copy(inputStream2, writer5, "\r\n");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ??");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        java.io.InputStream inputStream0 = null;
        java.io.OutputStream outputStream1 = null;
        byte[] byteArray4 = new byte[] {};
        int int5 = org.apache.commons.io.IOUtils.length(byteArray4);
        java.io.OutputStream outputStream6 = null;
        org.apache.commons.io.IOUtils.writeChunked(byteArray4, outputStream6);
        long long8 = org.apache.commons.io.IOUtils.copyLarge(inputStream0, outputStream1, 0L, (long) (byte) -1, byteArray4);
        java.io.Writer writer9 = null;
        java.nio.charset.Charset charset10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write(byteArray4, writer9, charset10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Writer.write(String)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.apache.commons.io.IOUtils.resourceToURL("\r\n", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Resource not found: ??");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream2 = null;
        java.io.InputStream inputStream5 = null;
        byte[] byteArray7 = org.apache.commons.io.IOUtils.toByteArray("");
        int int8 = org.apache.commons.io.IOUtils.read(inputStream5, byteArray7);
        long long9 = org.apache.commons.io.IOUtils.copyLarge(inputStream1, outputStream2, 0L, 0L, byteArray7);
        java.nio.charset.Charset charset10 = null;
        java.util.List<java.lang.String> strList11 = org.apache.commons.io.IOUtils.readLines(inputStream1, charset10);
        org.apache.commons.io.IOUtils.close((java.io.Closeable) inputStream1);
        java.nio.charset.Charset charset13 = null;
        java.lang.String str14 = org.apache.commons.io.IOUtils.toString(inputStream1, charset13);
        java.io.Writer writer15 = null;
        org.apache.commons.io.IOUtils.copy(inputStream1, writer15);
        // The following exception was thrown during execution in test generation
        try {
            java.io.BufferedInputStream bufferedInputStream18 = org.apache.commons.io.IOUtils.buffer(inputStream1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Buffer size <= 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        java.net.URL uRL1 = org.apache.commons.io.IOUtils.resourceToURL("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.io.IOUtils.toString(uRL1, "\r\n");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ??");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(uRL1);
        org.junit.Assert.assertEquals(uRL1.toString(), "file:/F:/Mathieu/git/commons-io/bin/org/apache/commons/io/");
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray2 = org.apache.commons.io.IOUtils.toByteArray(inputStream1);
        org.apache.commons.io.IOUtils.closeQuietly((java.io.Closeable) inputStream1);
        java.util.List<java.lang.String> strList4 = org.apache.commons.io.IOUtils.readLines(inputStream1);
        java.io.OutputStream outputStream5 = null;
        long long6 = org.apache.commons.io.IOUtils.copyLarge(inputStream1, outputStream5);
        java.io.Writer writer7 = null;
        org.apache.commons.io.IOUtils.copy(inputStream1, writer7);
        java.io.Writer writer9 = null;
        org.apache.commons.io.IOUtils.copy(inputStream1, writer9);
        java.io.OutputStream outputStream11 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long14 = org.apache.commons.io.IOUtils.copyLarge(inputStream1, outputStream11, 10L, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: Bytes to skip: 10 actual: 0");
        } catch (java.io.EOFException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream2 = null;
        java.io.InputStream inputStream5 = null;
        byte[] byteArray7 = org.apache.commons.io.IOUtils.toByteArray("");
        int int8 = org.apache.commons.io.IOUtils.read(inputStream5, byteArray7);
        long long9 = org.apache.commons.io.IOUtils.copyLarge(inputStream1, outputStream2, 0L, 0L, byteArray7);
        java.io.InputStream inputStream10 = null;
        java.io.OutputStream outputStream11 = null;
        byte[] byteArray14 = new byte[] {};
        int int15 = org.apache.commons.io.IOUtils.length(byteArray14);
        java.io.OutputStream outputStream16 = null;
        org.apache.commons.io.IOUtils.writeChunked(byteArray14, outputStream16);
        long long18 = org.apache.commons.io.IOUtils.copyLarge(inputStream10, outputStream11, 0L, (long) (byte) -1, byteArray14);
        java.io.OutputStream outputStream19 = null;
        org.apache.commons.io.IOUtils.writeChunked(byteArray14, outputStream19);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.readFully(inputStream1, byteArray14, 6, (int) '\\');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [6, 6 + 92) out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray2 = org.apache.commons.io.IOUtils.toByteArray(inputStream1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.skipFully(inputStream1, 1L);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: Bytes to skip: 1 actual: 0");
        } catch (java.io.EOFException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        int int1 = org.apache.commons.io.IOUtils.length((java.lang.CharSequence) "\n");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        java.io.Reader reader0 = null;
        char[] charArray5 = new char[] { '4', 'a', '#', 'a' };
        int int6 = org.apache.commons.io.IOUtils.length(charArray5);
        int int7 = org.apache.commons.io.IOUtils.length(charArray5);
        int int8 = org.apache.commons.io.IOUtils.length(charArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = org.apache.commons.io.IOUtils.read(reader0, charArray5, 6, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"input\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "4a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "4a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[4, a, #, a]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream2 = null;
        java.io.InputStream inputStream4 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream5 = null;
        java.io.InputStream inputStream8 = null;
        byte[] byteArray10 = org.apache.commons.io.IOUtils.toByteArray("");
        int int11 = org.apache.commons.io.IOUtils.read(inputStream8, byteArray10);
        long long12 = org.apache.commons.io.IOUtils.copyLarge(inputStream4, outputStream5, 0L, 0L, byteArray10);
        long long13 = org.apache.commons.io.IOUtils.copyLarge(inputStream1, outputStream2, byteArray10);
        java.io.BufferedInputStream bufferedInputStream15 = org.apache.commons.io.IOUtils.buffer(inputStream1, (int) (byte) 10);
        java.io.InputStream inputStream17 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray18 = org.apache.commons.io.IOUtils.toByteArray(inputStream17);
        org.apache.commons.io.IOUtils.closeQuietly((java.io.Closeable) inputStream17);
        java.io.InputStream inputStream21 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream22 = null;
        java.io.InputStream inputStream25 = null;
        byte[] byteArray27 = org.apache.commons.io.IOUtils.toByteArray("");
        int int28 = org.apache.commons.io.IOUtils.read(inputStream25, byteArray27);
        long long29 = org.apache.commons.io.IOUtils.copyLarge(inputStream21, outputStream22, 0L, 0L, byteArray27);
        java.nio.charset.Charset charset30 = null;
        java.util.List<java.lang.String> strList31 = org.apache.commons.io.IOUtils.readLines(inputStream21, charset30);
        java.io.InputStream inputStream33 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream34 = null;
        java.io.InputStream inputStream37 = null;
        byte[] byteArray39 = org.apache.commons.io.IOUtils.toByteArray("");
        int int40 = org.apache.commons.io.IOUtils.read(inputStream37, byteArray39);
        long long41 = org.apache.commons.io.IOUtils.copyLarge(inputStream33, outputStream34, 0L, 0L, byteArray39);
        java.nio.charset.Charset charset42 = null;
        java.util.List<java.lang.String> strList43 = org.apache.commons.io.IOUtils.readLines(inputStream33, charset42);
        org.apache.commons.io.IOUtils.close((java.io.Closeable) inputStream33);
        boolean boolean45 = org.apache.commons.io.IOUtils.contentEquals(inputStream21, inputStream33);
        java.io.OutputStream outputStream46 = null;
        java.io.InputStream inputStream48 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream49 = null;
        java.io.InputStream inputStream52 = null;
        byte[] byteArray54 = org.apache.commons.io.IOUtils.toByteArray("");
        int int55 = org.apache.commons.io.IOUtils.read(inputStream52, byteArray54);
        long long56 = org.apache.commons.io.IOUtils.copyLarge(inputStream48, outputStream49, 0L, 0L, byteArray54);
        long long57 = org.apache.commons.io.IOUtils.copyLarge(inputStream33, outputStream46, byteArray54);
        org.apache.commons.io.IOUtils.readFully(inputStream17, byteArray54);
        org.apache.commons.io.IOUtils.readFully(inputStream1, byteArray54);
        java.lang.String str60 = org.apache.commons.io.IOUtils.toString(inputStream1);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray62 = org.apache.commons.io.IOUtils.toCharArray(inputStream1, "\r\n");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ??");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(inputStream4);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(bufferedInputStream15);
        org.junit.Assert.assertNotNull(inputStream17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
        org.junit.Assert.assertNotNull(inputStream21);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertNotNull(inputStream33);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(inputStream48);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray54), "[]");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        java.io.Reader reader0 = null;
        org.apache.commons.io.IOUtils.skipFully(reader0, 0L);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream2 = null;
        java.io.InputStream inputStream4 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream5 = null;
        java.io.InputStream inputStream8 = null;
        byte[] byteArray10 = org.apache.commons.io.IOUtils.toByteArray("");
        int int11 = org.apache.commons.io.IOUtils.read(inputStream8, byteArray10);
        long long12 = org.apache.commons.io.IOUtils.copyLarge(inputStream4, outputStream5, 0L, 0L, byteArray10);
        long long13 = org.apache.commons.io.IOUtils.copyLarge(inputStream1, outputStream2, byteArray10);
        java.io.BufferedInputStream bufferedInputStream15 = org.apache.commons.io.IOUtils.buffer(inputStream1, (int) (byte) 10);
        java.io.OutputStream outputStream16 = null;
        byte[] byteArray17 = new byte[] {};
        int int18 = org.apache.commons.io.IOUtils.length(byteArray17);
        java.io.OutputStream outputStream19 = null;
        org.apache.commons.io.IOUtils.writeChunked(byteArray17, outputStream19);
        // The following exception was thrown during execution in test generation
        try {
            long long21 = org.apache.commons.io.IOUtils.copyLarge((java.io.InputStream) bufferedInputStream15, outputStream16, byteArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(byte[], int, int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(inputStream4);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(bufferedInputStream15);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        java.nio.channels.ReadableByteChannel readableByteChannel0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.skipFully(readableByteChannel0, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.ReadableByteChannel.read(java.nio.ByteBuffer)\" because \"input\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        java.util.Collection<java.lang.String> strCollection0 = null;
        java.io.Writer writer2 = null;
        org.apache.commons.io.IOUtils.writeLines(strCollection0, "hi!", writer2);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        java.io.Reader reader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.io.IOUtils.skip(reader0, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"input\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray2 = new byte[] {};
        int int3 = org.apache.commons.io.IOUtils.length(byteArray2);
        int int4 = org.apache.commons.io.IOUtils.read(inputStream1, byteArray2);
        byte[] byteArray5 = org.apache.commons.io.IOUtils.toByteArray(inputStream1);
        java.util.function.Consumer<java.io.IOException> iOExceptionConsumer6 = null;
        org.apache.commons.io.IOUtils.closeQuietly((java.io.Closeable) inputStream1, iOExceptionConsumer6);
        org.apache.commons.io.IOUtils.close((java.io.Closeable) inputStream1);
        java.io.BufferedInputStream bufferedInputStream10 = org.apache.commons.io.IOUtils.buffer(inputStream1, (int) (byte) 10);
        org.apache.commons.io.function.IOConsumer<java.io.IOException> iOExceptionIOConsumer11 = null;
        org.apache.commons.io.IOUtils.close((java.io.Closeable) bufferedInputStream10, iOExceptionIOConsumer11);
        org.apache.commons.io.IOUtils.closeQuietly((java.io.Closeable) bufferedInputStream10);
        java.io.InputStream inputStream14 = null;
        byte[] byteArray16 = org.apache.commons.io.IOUtils.toByteArray("");
        int int17 = org.apache.commons.io.IOUtils.read(inputStream14, byteArray16);
        java.lang.String str18 = org.apache.commons.io.IOUtils.toString(byteArray16);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = org.apache.commons.io.IOUtils.read((java.io.InputStream) bufferedInputStream10, byteArray16, (int) (byte) -1, (int) '\\');
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(bufferedInputStream10);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        java.io.Reader reader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.BufferedReader bufferedReader1 = org.apache.commons.io.IOUtils.buffer(reader0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        java.io.Reader reader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.BufferedReader bufferedReader2 = org.apache.commons.io.IOUtils.toBufferedReader(reader0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray2 = new byte[] {};
        int int3 = org.apache.commons.io.IOUtils.length(byteArray2);
        int int4 = org.apache.commons.io.IOUtils.read(inputStream1, byteArray2);
        byte[] byteArray5 = org.apache.commons.io.IOUtils.toByteArray(inputStream1);
        java.util.function.Consumer<java.io.IOException> iOExceptionConsumer6 = null;
        org.apache.commons.io.IOUtils.closeQuietly((java.io.Closeable) inputStream1, iOExceptionConsumer6);
        org.apache.commons.io.IOUtils.close((java.io.Closeable) inputStream1);
        java.io.BufferedInputStream bufferedInputStream10 = org.apache.commons.io.IOUtils.buffer(inputStream1, (int) (byte) 10);
        java.io.InputStream inputStream12 = org.apache.commons.io.IOUtils.toBufferedInputStream(inputStream1, (int) (byte) 1);
        java.util.function.Consumer<java.io.IOException> iOExceptionConsumer13 = null;
        org.apache.commons.io.IOUtils.closeQuietly((java.io.Closeable) inputStream1, iOExceptionConsumer13);
        java.io.OutputStream outputStream15 = null;
        java.io.InputStream inputStream17 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray18 = new byte[] {};
        int int19 = org.apache.commons.io.IOUtils.length(byteArray18);
        int int20 = org.apache.commons.io.IOUtils.read(inputStream17, byteArray18);
        byte[] byteArray21 = org.apache.commons.io.IOUtils.toByteArray(inputStream17);
        java.io.InputStream inputStream23 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray24 = new byte[] {};
        int int25 = org.apache.commons.io.IOUtils.length(byteArray24);
        int int26 = org.apache.commons.io.IOUtils.read(inputStream23, byteArray24);
        byte[] byteArray27 = org.apache.commons.io.IOUtils.toByteArray(inputStream23);
        int int28 = org.apache.commons.io.IOUtils.length(byteArray27);
        org.apache.commons.io.IOUtils.readFully(inputStream17, byteArray27);
        long long30 = org.apache.commons.io.IOUtils.copyLarge(inputStream1, outputStream15, byteArray27);
        java.io.Writer writer31 = null;
        java.nio.charset.Charset charset32 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write(byteArray27, writer31, charset32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Writer.write(String)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(bufferedInputStream10);
        org.junit.Assert.assertNotNull(inputStream12);
        org.junit.Assert.assertNotNull(inputStream17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
        org.junit.Assert.assertNotNull(inputStream23);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray2 = new byte[] {};
        int int3 = org.apache.commons.io.IOUtils.length(byteArray2);
        int int4 = org.apache.commons.io.IOUtils.read(inputStream1, byteArray2);
        java.lang.String str5 = org.apache.commons.io.IOUtils.toString(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.io.IOUtils.toString(byteArray2, "");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        java.io.Reader reader0 = null;
        char[] charArray5 = new char[] { '4', 'a', '#', 'a' };
        int int6 = org.apache.commons.io.IOUtils.length(charArray5);
        int int7 = org.apache.commons.io.IOUtils.length(charArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = org.apache.commons.io.IOUtils.read(reader0, charArray5, (int) '/', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"input\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "4a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "4a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[4, a, #, a]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        java.nio.charset.Charset charset1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.io.IOUtils.resourceToString("\r\n", charset1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Resource not found: ??");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        java.io.Reader reader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.skipFully(reader0, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"input\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream2 = null;
        java.io.InputStream inputStream5 = null;
        byte[] byteArray7 = org.apache.commons.io.IOUtils.toByteArray("");
        int int8 = org.apache.commons.io.IOUtils.read(inputStream5, byteArray7);
        long long9 = org.apache.commons.io.IOUtils.copyLarge(inputStream1, outputStream2, 0L, 0L, byteArray7);
        java.nio.charset.Charset charset10 = null;
        java.util.List<java.lang.String> strList11 = org.apache.commons.io.IOUtils.readLines(inputStream1, charset10);
        java.io.InputStream inputStream13 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream14 = null;
        java.io.InputStream inputStream17 = null;
        byte[] byteArray19 = org.apache.commons.io.IOUtils.toByteArray("");
        int int20 = org.apache.commons.io.IOUtils.read(inputStream17, byteArray19);
        long long21 = org.apache.commons.io.IOUtils.copyLarge(inputStream13, outputStream14, 0L, 0L, byteArray19);
        java.nio.charset.Charset charset22 = null;
        java.util.List<java.lang.String> strList23 = org.apache.commons.io.IOUtils.readLines(inputStream13, charset22);
        org.apache.commons.io.IOUtils.close((java.io.Closeable) inputStream13);
        boolean boolean25 = org.apache.commons.io.IOUtils.contentEquals(inputStream1, inputStream13);
        java.io.Writer writer26 = null;
        org.apache.commons.io.IOUtils.copy(inputStream13, writer26);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList29 = org.apache.commons.io.IOUtils.readLines(inputStream13, "hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(inputStream13);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        java.io.Reader reader0 = null;
        char[] charArray5 = new char[] { '4', 'a', '#', 'a' };
        int int6 = org.apache.commons.io.IOUtils.length(charArray5);
        int int7 = org.apache.commons.io.IOUtils.length(charArray5);
        int int8 = org.apache.commons.io.IOUtils.length(charArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = org.apache.commons.io.IOUtils.read(reader0, charArray5, (int) '#', (int) '/');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"input\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "4a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "4a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[4, a, #, a]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        java.io.Reader reader0 = null;
        char[] charArray1 = new char[] {};
        int int2 = org.apache.commons.io.IOUtils.length(charArray1);
        java.io.Writer writer3 = null;
        org.apache.commons.io.IOUtils.writeChunked(charArray1, writer3);
        int int5 = org.apache.commons.io.IOUtils.read(reader0, charArray1);
        java.io.OutputStream outputStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write(charArray1, outputStream6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(byte[])\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        java.nio.channels.ReadableByteChannel readableByteChannel0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.io.IOUtils.skip(readableByteChannel0, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.ReadableByteChannel.read(java.nio.ByteBuffer)\" because \"input\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray2 = new byte[] {};
        int int3 = org.apache.commons.io.IOUtils.length(byteArray2);
        int int4 = org.apache.commons.io.IOUtils.read(inputStream1, byteArray2);
        byte[] byteArray5 = org.apache.commons.io.IOUtils.toByteArray(inputStream1);
        byte[] byteArray7 = org.apache.commons.io.IOUtils.toByteArray(inputStream1, (int) (short) 0);
        java.io.BufferedInputStream bufferedInputStream8 = org.apache.commons.io.IOUtils.buffer(inputStream1);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray10 = org.apache.commons.io.IOUtils.toCharArray(inputStream1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNotNull(bufferedInputStream8);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        java.io.OutputStream outputStream1 = null;
        java.nio.charset.Charset charset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write((java.lang.CharSequence) "\r\n", outputStream1, charset2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(byte[])\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.io.OutputStream outputStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.writeLines((java.util.Collection<java.lang.String>) strList3, "\r\n", outputStream6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(byte[])\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write((java.lang.CharSequence) "\r\n", outputStream1, "");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray2 = org.apache.commons.io.IOUtils.toByteArray(inputStream1);
        java.io.InputStream inputStream4 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray5 = new byte[] {};
        int int6 = org.apache.commons.io.IOUtils.length(byteArray5);
        int int7 = org.apache.commons.io.IOUtils.read(inputStream4, byteArray5);
        byte[] byteArray8 = org.apache.commons.io.IOUtils.toByteArray(inputStream4);
        java.util.function.Consumer<java.io.IOException> iOExceptionConsumer9 = null;
        org.apache.commons.io.IOUtils.closeQuietly((java.io.Closeable) inputStream4, iOExceptionConsumer9);
        org.apache.commons.io.IOUtils.close((java.io.Closeable) inputStream4);
        java.io.BufferedInputStream bufferedInputStream13 = org.apache.commons.io.IOUtils.buffer(inputStream4, (int) (byte) 10);
        boolean boolean14 = org.apache.commons.io.IOUtils.contentEquals(inputStream1, inputStream4);
        java.io.InputStream inputStream16 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray17 = new byte[] {};
        int int18 = org.apache.commons.io.IOUtils.length(byteArray17);
        int int19 = org.apache.commons.io.IOUtils.read(inputStream16, byteArray17);
        byte[] byteArray20 = org.apache.commons.io.IOUtils.toByteArray(inputStream16);
        byte[] byteArray22 = org.apache.commons.io.IOUtils.toByteArray(inputStream16, (int) (short) 0);
        long long24 = org.apache.commons.io.IOUtils.skip(inputStream16, 100L);
        java.io.InputStream inputStream25 = null;
        java.io.InputStream inputStream26 = null;
        java.io.OutputStream outputStream27 = null;
        byte[] byteArray30 = new byte[] {};
        int int31 = org.apache.commons.io.IOUtils.length(byteArray30);
        java.io.OutputStream outputStream32 = null;
        org.apache.commons.io.IOUtils.writeChunked(byteArray30, outputStream32);
        long long34 = org.apache.commons.io.IOUtils.copyLarge(inputStream26, outputStream27, 0L, (long) (byte) -1, byteArray30);
        java.io.OutputStream outputStream35 = null;
        org.apache.commons.io.IOUtils.writeChunked(byteArray30, outputStream35);
        org.apache.commons.io.IOUtils.readFully(inputStream25, byteArray30);
        int int38 = org.apache.commons.io.IOUtils.read(inputStream16, byteArray30);
        int int39 = org.apache.commons.io.IOUtils.read(inputStream4, byteArray30);
        java.io.OutputStream outputStream40 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write(byteArray30, outputStream40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(byte[])\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(inputStream4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(bufferedInputStream13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(inputStream16);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[]");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        byte[] byteArray1 = org.apache.commons.io.IOUtils.toByteArray("\r\n");
        java.io.OutputStream outputStream2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.writeChunked(byteArray1, outputStream2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(byte[], int, int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[13, 10]");
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray2 = new byte[] {};
        int int3 = org.apache.commons.io.IOUtils.length(byteArray2);
        int int4 = org.apache.commons.io.IOUtils.read(inputStream1, byteArray2);
        org.apache.commons.io.IOUtils.closeQuietly(inputStream1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.skipFully(inputStream1, (long) 2);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: Bytes to skip: 2 actual: 0");
        } catch (java.io.EOFException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        org.apache.commons.io.IOUtils.closeQuietly((java.io.Closeable) inputStream1);
        java.io.InputStream inputStream3 = org.apache.commons.io.IOUtils.toBufferedInputStream(inputStream1);
        java.io.Writer writer4 = null;
        java.nio.charset.Charset charset5 = null;
        org.apache.commons.io.IOUtils.copy(inputStream3, writer4, charset5);
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long9 = org.apache.commons.io.IOUtils.copy(inputStream3, outputStream7, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(byte[], int, int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(inputStream3);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream2 = org.apache.commons.io.IOUtils.toBufferedInputStream(inputStream0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.InputStream.read(byte[], int, int)\" because \"in\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        byte[] byteArray0 = new byte[] {};
        int int1 = org.apache.commons.io.IOUtils.length(byteArray0);
        java.io.OutputStream outputStream2 = null;
        org.apache.commons.io.IOUtils.writeChunked(byteArray0, outputStream2);
        java.io.OutputStream outputStream4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write(byteArray0, outputStream4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(byte[])\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        java.io.Reader reader0 = null;
        long long2 = org.apache.commons.io.IOUtils.skip(reader0, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        org.apache.commons.io.IOUtils.closeQuietly((java.io.Closeable) inputStream1);
        java.io.InputStream inputStream3 = org.apache.commons.io.IOUtils.toBufferedInputStream(inputStream1);
        java.io.Writer writer4 = null;
        java.nio.charset.Charset charset5 = null;
        org.apache.commons.io.IOUtils.copy(inputStream3, writer4, charset5);
        org.apache.commons.io.function.IOConsumer<java.io.IOException> iOExceptionIOConsumer7 = null;
        org.apache.commons.io.IOUtils.close((java.io.Closeable) inputStream3, iOExceptionIOConsumer7);
        java.io.Writer writer9 = null;
        java.nio.charset.Charset charset10 = null;
        org.apache.commons.io.IOUtils.copy(inputStream3, writer9, charset10);
        java.io.InputStream inputStream13 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray14 = new byte[] {};
        int int15 = org.apache.commons.io.IOUtils.length(byteArray14);
        int int16 = org.apache.commons.io.IOUtils.read(inputStream13, byteArray14);
        byte[] byteArray17 = org.apache.commons.io.IOUtils.toByteArray(inputStream13);
        byte[] byteArray19 = org.apache.commons.io.IOUtils.toByteArray(inputStream13, (int) (short) 0);
        java.io.BufferedInputStream bufferedInputStream20 = org.apache.commons.io.IOUtils.buffer(inputStream13);
        byte[] byteArray21 = org.apache.commons.io.IOUtils.toByteArray((java.io.InputStream) bufferedInputStream20);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = org.apache.commons.io.IOUtils.read(inputStream3, byteArray21, (int) ' ', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [32, 32 + 100) out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(inputStream3);
        org.junit.Assert.assertNotNull(inputStream13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[]");
        org.junit.Assert.assertNotNull(bufferedInputStream20);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        java.io.Writer writer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.BufferedWriter bufferedWriter2 = org.apache.commons.io.IOUtils.buffer(writer0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.skipFully(inputStream0, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.InputStream.read(byte[], int, int)\" because \"input\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream("\r\n");
        java.io.Writer writer2 = null;
        java.nio.charset.Charset charset3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.copy(inputStream1, writer2, charset3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Writer.write(char[], int, int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        java.io.Reader reader0 = null;
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.copy(reader0, outputStream1, "\n");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ?");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream2 = org.apache.commons.io.IOUtils.toInputStream("", "\r\n");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ??");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        java.io.Reader reader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.BufferedReader bufferedReader2 = org.apache.commons.io.IOUtils.buffer(reader0, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write("\r\n", outputStream1, "");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        char[] charArray4 = new char[] { '4', 'a', '#', 'a' };
        int int5 = org.apache.commons.io.IOUtils.length(charArray4);
        java.io.OutputStream outputStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write(charArray4, outputStream6, "hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, #, a]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream2 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "\r\n", "hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        java.net.URI uRI0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.io.IOUtils.toString(uRI0, "\r\n");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ??");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        java.nio.channels.ReadableByteChannel readableByteChannel0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.skipFully(readableByteChannel0, (long) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.ReadableByteChannel.read(java.nio.ByteBuffer)\" because \"input\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.io.IOUtils.resourceToByteArray("\r\n", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Resource not found: ??");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray2 = org.apache.commons.io.IOUtils.toByteArray(inputStream1);
        org.apache.commons.io.IOUtils.closeQuietly((java.io.Closeable) inputStream1);
        java.util.List<java.lang.String> strList4 = org.apache.commons.io.IOUtils.readLines(inputStream1);
        java.io.Writer writer6 = null;
        org.apache.commons.io.IOUtils.writeLines((java.util.Collection<java.lang.String>) strList4, "\r\n", writer6);
        java.io.OutputStream outputStream9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.writeLines((java.util.Collection<java.lang.String>) strList4, "", outputStream9, "\n");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ?");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray2 = new byte[] {};
        int int3 = org.apache.commons.io.IOUtils.length(byteArray2);
        int int4 = org.apache.commons.io.IOUtils.read(inputStream1, byteArray2);
        byte[] byteArray5 = org.apache.commons.io.IOUtils.toByteArray(inputStream1);
        byte[] byteArray7 = org.apache.commons.io.IOUtils.toByteArray(inputStream1, (int) (short) 0);
        long long9 = org.apache.commons.io.IOUtils.skip(inputStream1, 100L);
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.OutputStream outputStream12 = null;
        byte[] byteArray15 = new byte[] {};
        int int16 = org.apache.commons.io.IOUtils.length(byteArray15);
        java.io.OutputStream outputStream17 = null;
        org.apache.commons.io.IOUtils.writeChunked(byteArray15, outputStream17);
        long long19 = org.apache.commons.io.IOUtils.copyLarge(inputStream11, outputStream12, 0L, (long) (byte) -1, byteArray15);
        java.io.OutputStream outputStream20 = null;
        org.apache.commons.io.IOUtils.writeChunked(byteArray15, outputStream20);
        org.apache.commons.io.IOUtils.readFully(inputStream10, byteArray15);
        int int23 = org.apache.commons.io.IOUtils.read(inputStream1, byteArray15);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray25 = org.apache.commons.io.IOUtils.toByteArray(inputStream1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Size must be equal or greater than zero: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        java.io.Reader reader0 = null;
        char[] charArray4 = new char[] { '#', '#', '#' };
        org.apache.commons.io.IOUtils.readFully(reader0, charArray4, (int) ' ', (int) (short) 0);
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write(charArray4, outputStream8, "hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "###");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "###");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#, #, #]");
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray2 = new byte[] {};
        int int3 = org.apache.commons.io.IOUtils.length(byteArray2);
        int int4 = org.apache.commons.io.IOUtils.read(inputStream1, byteArray2);
        byte[] byteArray5 = org.apache.commons.io.IOUtils.toByteArray(inputStream1);
        byte[] byteArray7 = org.apache.commons.io.IOUtils.toByteArray(inputStream1, (int) (short) 0);
        java.io.BufferedInputStream bufferedInputStream8 = org.apache.commons.io.IOUtils.buffer(inputStream1);
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream10 = org.apache.commons.io.IOUtils.toBufferedInputStream(inputStream1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative initial size: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNotNull(bufferedInputStream8);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL1 = org.apache.commons.io.IOUtils.resourceToURL("\r\n");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Resource not found: ??");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray2 = new byte[] {};
        int int3 = org.apache.commons.io.IOUtils.length(byteArray2);
        int int4 = org.apache.commons.io.IOUtils.read(inputStream1, byteArray2);
        byte[] byteArray5 = org.apache.commons.io.IOUtils.toByteArray(inputStream1);
        java.util.function.Consumer<java.io.IOException> iOExceptionConsumer6 = null;
        org.apache.commons.io.IOUtils.closeQuietly((java.io.Closeable) inputStream1, iOExceptionConsumer6);
        org.apache.commons.io.IOUtils.close((java.io.Closeable) inputStream1);
        java.io.OutputStream outputStream9 = null;
        long long10 = org.apache.commons.io.IOUtils.copyLarge(inputStream1, outputStream9);
        java.lang.Class<?> wildcardClass11 = inputStream1.getClass();
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray2 = new byte[] {};
        int int3 = org.apache.commons.io.IOUtils.length(byteArray2);
        int int4 = org.apache.commons.io.IOUtils.read(inputStream1, byteArray2);
        byte[] byteArray5 = org.apache.commons.io.IOUtils.toByteArray(inputStream1);
        byte[] byteArray7 = org.apache.commons.io.IOUtils.toByteArray(inputStream1, (int) (short) 0);
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long10 = org.apache.commons.io.IOUtils.copy(inputStream1, outputStream8, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray1 = org.apache.commons.io.IOUtils.resourceToByteArray("\r\n");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Resource not found: ??");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.skipFully(inputStream1, 10L);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: Bytes to skip: 10 actual: 0");
        } catch (java.io.EOFException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.apache.commons.io.IOUtils.resourceToURL("\n", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Resource not found: ?");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray2 = new byte[] {};
        int int3 = org.apache.commons.io.IOUtils.length(byteArray2);
        int int4 = org.apache.commons.io.IOUtils.read(inputStream1, byteArray2);
        byte[] byteArray5 = org.apache.commons.io.IOUtils.toByteArray(inputStream1);
        java.io.InputStream inputStream7 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray8 = new byte[] {};
        int int9 = org.apache.commons.io.IOUtils.length(byteArray8);
        int int10 = org.apache.commons.io.IOUtils.read(inputStream7, byteArray8);
        byte[] byteArray11 = org.apache.commons.io.IOUtils.toByteArray(inputStream7);
        int int12 = org.apache.commons.io.IOUtils.length(byteArray11);
        org.apache.commons.io.IOUtils.readFully(inputStream1, byteArray11);
        java.io.OutputStream outputStream14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write(byteArray11, outputStream14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(byte[])\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        java.io.Reader reader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.skipFully(reader0, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"input\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        java.io.Reader reader0 = null;
        char[] charArray1 = new char[] {};
        java.io.Writer writer2 = null;
        org.apache.commons.io.IOUtils.writeChunked(charArray1, writer2);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = org.apache.commons.io.IOUtils.read(reader0, charArray1, 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"input\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[]");
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        java.io.Reader reader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.BufferedReader bufferedReader2 = org.apache.commons.io.IOUtils.buffer(reader0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray2 = new byte[] {};
        int int3 = org.apache.commons.io.IOUtils.length(byteArray2);
        int int4 = org.apache.commons.io.IOUtils.read(inputStream1, byteArray2);
        byte[] byteArray5 = org.apache.commons.io.IOUtils.toByteArray(inputStream1);
        byte[] byteArray7 = org.apache.commons.io.IOUtils.toByteArray(inputStream1, (int) (short) 0);
        long long9 = org.apache.commons.io.IOUtils.skip(inputStream1, 100L);
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.OutputStream outputStream12 = null;
        byte[] byteArray15 = new byte[] {};
        int int16 = org.apache.commons.io.IOUtils.length(byteArray15);
        java.io.OutputStream outputStream17 = null;
        org.apache.commons.io.IOUtils.writeChunked(byteArray15, outputStream17);
        long long19 = org.apache.commons.io.IOUtils.copyLarge(inputStream11, outputStream12, 0L, (long) (byte) -1, byteArray15);
        java.io.OutputStream outputStream20 = null;
        org.apache.commons.io.IOUtils.writeChunked(byteArray15, outputStream20);
        org.apache.commons.io.IOUtils.readFully(inputStream10, byteArray15);
        int int23 = org.apache.commons.io.IOUtils.read(inputStream1, byteArray15);
        java.io.InputStream inputStream24 = org.apache.commons.io.IOUtils.toBufferedInputStream(inputStream1);
        java.io.OutputStream outputStream25 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long27 = org.apache.commons.io.IOUtils.copy(inputStream24, outputStream25, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(byte[], int, int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(inputStream24);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        java.nio.channels.ReadableByteChannel readableByteChannel0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.io.IOUtils.skip(readableByteChannel0, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.ReadableByteChannel.read(java.nio.ByteBuffer)\" because \"input\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.BufferedOutputStream bufferedOutputStream2 = org.apache.commons.io.IOUtils.buffer(outputStream0, (int) '\\');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: outputStream");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray2 = new byte[] {};
        int int3 = org.apache.commons.io.IOUtils.length(byteArray2);
        int int4 = org.apache.commons.io.IOUtils.read(inputStream1, byteArray2);
        byte[] byteArray5 = org.apache.commons.io.IOUtils.toByteArray(inputStream1);
        java.util.function.Consumer<java.io.IOException> iOExceptionConsumer6 = null;
        org.apache.commons.io.IOUtils.closeQuietly((java.io.Closeable) inputStream1, iOExceptionConsumer6);
        org.apache.commons.io.IOUtils.close((java.io.Closeable) inputStream1);
        java.io.BufferedInputStream bufferedInputStream10 = org.apache.commons.io.IOUtils.buffer(inputStream1, (int) (byte) 10);
        org.apache.commons.io.function.IOConsumer<java.io.IOException> iOExceptionIOConsumer11 = null;
        org.apache.commons.io.IOUtils.close((java.io.Closeable) bufferedInputStream10, iOExceptionIOConsumer11);
        java.nio.charset.Charset charset13 = null;
        org.apache.commons.io.LineIterator lineIterator14 = org.apache.commons.io.IOUtils.lineIterator((java.io.InputStream) bufferedInputStream10, charset13);
        java.io.OutputStream outputStream15 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long18 = org.apache.commons.io.IOUtils.copyLarge((java.io.InputStream) bufferedInputStream10, outputStream15, (long) 6, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(bufferedInputStream10);
        org.junit.Assert.assertNotNull(lineIterator14);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        java.io.Reader reader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.io.IOUtils.toByteArray(reader0, "\r\n");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ??");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream2 = null;
        java.io.InputStream inputStream5 = null;
        byte[] byteArray7 = org.apache.commons.io.IOUtils.toByteArray("");
        int int8 = org.apache.commons.io.IOUtils.read(inputStream5, byteArray7);
        long long9 = org.apache.commons.io.IOUtils.copyLarge(inputStream1, outputStream2, 0L, 0L, byteArray7);
        java.io.OutputStream outputStream10 = null;
        long long13 = org.apache.commons.io.IOUtils.copyLarge(inputStream1, outputStream10, (long) (short) 0, (-1L));
        java.lang.String str14 = org.apache.commons.io.IOUtils.toString(inputStream1);
        org.apache.commons.io.IOUtils.closeQuietly(inputStream1);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray17 = org.apache.commons.io.IOUtils.toCharArray(inputStream1, "");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream2 = null;
        java.io.InputStream inputStream4 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream5 = null;
        java.io.InputStream inputStream8 = null;
        byte[] byteArray10 = org.apache.commons.io.IOUtils.toByteArray("");
        int int11 = org.apache.commons.io.IOUtils.read(inputStream8, byteArray10);
        long long12 = org.apache.commons.io.IOUtils.copyLarge(inputStream4, outputStream5, 0L, 0L, byteArray10);
        long long13 = org.apache.commons.io.IOUtils.copyLarge(inputStream1, outputStream2, byteArray10);
        java.io.BufferedInputStream bufferedInputStream15 = org.apache.commons.io.IOUtils.buffer(inputStream1, (int) (byte) 10);
        java.io.InputStream inputStream17 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray18 = org.apache.commons.io.IOUtils.toByteArray(inputStream17);
        org.apache.commons.io.IOUtils.closeQuietly((java.io.Closeable) inputStream17);
        java.io.InputStream inputStream21 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream22 = null;
        java.io.InputStream inputStream25 = null;
        byte[] byteArray27 = org.apache.commons.io.IOUtils.toByteArray("");
        int int28 = org.apache.commons.io.IOUtils.read(inputStream25, byteArray27);
        long long29 = org.apache.commons.io.IOUtils.copyLarge(inputStream21, outputStream22, 0L, 0L, byteArray27);
        java.nio.charset.Charset charset30 = null;
        java.util.List<java.lang.String> strList31 = org.apache.commons.io.IOUtils.readLines(inputStream21, charset30);
        java.io.InputStream inputStream33 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream34 = null;
        java.io.InputStream inputStream37 = null;
        byte[] byteArray39 = org.apache.commons.io.IOUtils.toByteArray("");
        int int40 = org.apache.commons.io.IOUtils.read(inputStream37, byteArray39);
        long long41 = org.apache.commons.io.IOUtils.copyLarge(inputStream33, outputStream34, 0L, 0L, byteArray39);
        java.nio.charset.Charset charset42 = null;
        java.util.List<java.lang.String> strList43 = org.apache.commons.io.IOUtils.readLines(inputStream33, charset42);
        org.apache.commons.io.IOUtils.close((java.io.Closeable) inputStream33);
        boolean boolean45 = org.apache.commons.io.IOUtils.contentEquals(inputStream21, inputStream33);
        java.io.OutputStream outputStream46 = null;
        java.io.InputStream inputStream48 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream49 = null;
        java.io.InputStream inputStream52 = null;
        byte[] byteArray54 = org.apache.commons.io.IOUtils.toByteArray("");
        int int55 = org.apache.commons.io.IOUtils.read(inputStream52, byteArray54);
        long long56 = org.apache.commons.io.IOUtils.copyLarge(inputStream48, outputStream49, 0L, 0L, byteArray54);
        long long57 = org.apache.commons.io.IOUtils.copyLarge(inputStream33, outputStream46, byteArray54);
        org.apache.commons.io.IOUtils.readFully(inputStream17, byteArray54);
        org.apache.commons.io.IOUtils.readFully((java.io.InputStream) bufferedInputStream15, byteArray54);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str61 = org.apache.commons.io.IOUtils.toString(byteArray54, "\n");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ?");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(inputStream4);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(bufferedInputStream15);
        org.junit.Assert.assertNotNull(inputStream17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
        org.junit.Assert.assertNotNull(inputStream21);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertNotNull(inputStream33);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(inputStream48);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray54), "[]");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream2 = null;
        java.io.InputStream inputStream5 = null;
        byte[] byteArray7 = org.apache.commons.io.IOUtils.toByteArray("");
        int int8 = org.apache.commons.io.IOUtils.read(inputStream5, byteArray7);
        long long9 = org.apache.commons.io.IOUtils.copyLarge(inputStream1, outputStream2, 0L, 0L, byteArray7);
        java.nio.charset.Charset charset10 = null;
        java.util.List<java.lang.String> strList11 = org.apache.commons.io.IOUtils.readLines(inputStream1, charset10);
        java.io.InputStream inputStream13 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream14 = null;
        java.io.InputStream inputStream17 = null;
        byte[] byteArray19 = org.apache.commons.io.IOUtils.toByteArray("");
        int int20 = org.apache.commons.io.IOUtils.read(inputStream17, byteArray19);
        long long21 = org.apache.commons.io.IOUtils.copyLarge(inputStream13, outputStream14, 0L, 0L, byteArray19);
        java.nio.charset.Charset charset22 = null;
        java.util.List<java.lang.String> strList23 = org.apache.commons.io.IOUtils.readLines(inputStream13, charset22);
        org.apache.commons.io.IOUtils.close((java.io.Closeable) inputStream13);
        boolean boolean25 = org.apache.commons.io.IOUtils.contentEquals(inputStream1, inputStream13);
        java.io.OutputStream outputStream26 = null;
        java.io.InputStream inputStream28 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream29 = null;
        java.io.InputStream inputStream32 = null;
        byte[] byteArray34 = org.apache.commons.io.IOUtils.toByteArray("");
        int int35 = org.apache.commons.io.IOUtils.read(inputStream32, byteArray34);
        long long36 = org.apache.commons.io.IOUtils.copyLarge(inputStream28, outputStream29, 0L, 0L, byteArray34);
        long long37 = org.apache.commons.io.IOUtils.copyLarge(inputStream13, outputStream26, byteArray34);
        java.io.OutputStream outputStream38 = null;
        org.apache.commons.io.IOUtils.writeChunked(byteArray34, outputStream38);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str41 = org.apache.commons.io.IOUtils.toString(byteArray34, "\n");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ?");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(inputStream13);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(inputStream28);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        java.io.Reader reader0 = null;
        char[] charArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.io.IOUtils.read(reader0, charArray1, 2, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"input\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray2 = org.apache.commons.io.IOUtils.toByteArray(inputStream1);
        org.apache.commons.io.IOUtils.closeQuietly((java.io.Closeable) inputStream1);
        java.util.List<java.lang.String> strList4 = org.apache.commons.io.IOUtils.readLines(inputStream1);
        java.io.OutputStream outputStream5 = null;
        long long6 = org.apache.commons.io.IOUtils.copyLarge(inputStream1, outputStream5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.io.IOUtils.toString(inputStream1, "\r\n");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ??");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        java.io.Writer writer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.BufferedWriter bufferedWriter2 = org.apache.commons.io.IOUtils.buffer(writer0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        java.io.Reader reader0 = null;
        java.io.Writer writer1 = null;
        char[] charArray4 = new char[] {};
        long long5 = org.apache.commons.io.IOUtils.copyLarge(reader0, writer1, (long) (byte) 0, (long) 1, charArray4);
        java.io.OutputStream outputStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write(charArray4, outputStream6, "hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.io.IOUtils.resourceToByteArray("\n", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Resource not found: ?");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray2 = new byte[] {};
        int int3 = org.apache.commons.io.IOUtils.length(byteArray2);
        int int4 = org.apache.commons.io.IOUtils.read(inputStream1, byteArray2);
        byte[] byteArray5 = org.apache.commons.io.IOUtils.toByteArray(inputStream1);
        java.io.InputStream inputStream7 = org.apache.commons.io.IOUtils.toBufferedInputStream(inputStream1, (int) (byte) 0);
        java.nio.charset.Charset charset8 = null;
        org.apache.commons.io.LineIterator lineIterator9 = org.apache.commons.io.IOUtils.lineIterator(inputStream7, charset8);
        org.apache.commons.io.function.IOConsumer<java.io.IOException> iOExceptionIOConsumer10 = null;
        org.apache.commons.io.IOUtils.close((java.io.Closeable) lineIterator9, iOExceptionIOConsumer10);
        org.apache.commons.io.IOUtils.close((java.io.Closeable) lineIterator9);
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(lineIterator9);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray2 = new byte[] {};
        int int3 = org.apache.commons.io.IOUtils.length(byteArray2);
        int int4 = org.apache.commons.io.IOUtils.read(inputStream1, byteArray2);
        byte[] byteArray5 = org.apache.commons.io.IOUtils.toByteArray(inputStream1);
        byte[] byteArray7 = org.apache.commons.io.IOUtils.toByteArray(inputStream1, (int) (short) 0);
        java.io.BufferedInputStream bufferedInputStream8 = org.apache.commons.io.IOUtils.buffer(inputStream1);
        java.nio.charset.Charset charset9 = null;
        org.apache.commons.io.LineIterator lineIterator10 = org.apache.commons.io.IOUtils.lineIterator(inputStream1, charset9);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray12 = org.apache.commons.io.IOUtils.readFully(inputStream1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: Length to read: 52 actual: 0");
        } catch (java.io.EOFException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNotNull(bufferedInputStream8);
        org.junit.Assert.assertNotNull(lineIterator10);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        java.io.Reader reader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.skipFully(reader0, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Skip count must be non-negative, actual: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        byte[] byteArray1 = org.apache.commons.io.IOUtils.toByteArray("\r\n");
        java.io.Writer writer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write(byteArray1, writer2, "");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[13, 10]");
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream2 = null;
        java.io.InputStream inputStream5 = null;
        byte[] byteArray7 = org.apache.commons.io.IOUtils.toByteArray("");
        int int8 = org.apache.commons.io.IOUtils.read(inputStream5, byteArray7);
        long long9 = org.apache.commons.io.IOUtils.copyLarge(inputStream1, outputStream2, 0L, 0L, byteArray7);
        java.nio.charset.Charset charset10 = null;
        java.util.List<java.lang.String> strList11 = org.apache.commons.io.IOUtils.readLines(inputStream1, charset10);
        java.io.InputStream inputStream13 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream14 = null;
        java.io.InputStream inputStream17 = null;
        byte[] byteArray19 = org.apache.commons.io.IOUtils.toByteArray("");
        int int20 = org.apache.commons.io.IOUtils.read(inputStream17, byteArray19);
        long long21 = org.apache.commons.io.IOUtils.copyLarge(inputStream13, outputStream14, 0L, 0L, byteArray19);
        java.nio.charset.Charset charset22 = null;
        java.util.List<java.lang.String> strList23 = org.apache.commons.io.IOUtils.readLines(inputStream13, charset22);
        org.apache.commons.io.IOUtils.close((java.io.Closeable) inputStream13);
        boolean boolean25 = org.apache.commons.io.IOUtils.contentEquals(inputStream1, inputStream13);
        java.io.OutputStream outputStream26 = null;
        java.io.InputStream inputStream28 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream29 = null;
        java.io.InputStream inputStream32 = null;
        byte[] byteArray34 = org.apache.commons.io.IOUtils.toByteArray("");
        int int35 = org.apache.commons.io.IOUtils.read(inputStream32, byteArray34);
        long long36 = org.apache.commons.io.IOUtils.copyLarge(inputStream28, outputStream29, 0L, 0L, byteArray34);
        long long37 = org.apache.commons.io.IOUtils.copyLarge(inputStream13, outputStream26, byteArray34);
        java.io.Writer writer38 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write(byteArray34, writer38, "");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(inputStream13);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(inputStream28);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray2 = new byte[] {};
        int int3 = org.apache.commons.io.IOUtils.length(byteArray2);
        int int4 = org.apache.commons.io.IOUtils.read(inputStream1, byteArray2);
        byte[] byteArray5 = org.apache.commons.io.IOUtils.toByteArray(inputStream1);
        byte[] byteArray7 = org.apache.commons.io.IOUtils.toByteArray(inputStream1, (int) (short) 0);
        long long9 = org.apache.commons.io.IOUtils.skip(inputStream1, 100L);
        java.io.InputStream inputStream11 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray12 = new byte[] {};
        int int13 = org.apache.commons.io.IOUtils.length(byteArray12);
        int int14 = org.apache.commons.io.IOUtils.read(inputStream11, byteArray12);
        byte[] byteArray15 = org.apache.commons.io.IOUtils.toByteArray(inputStream11);
        byte[] byteArray17 = org.apache.commons.io.IOUtils.toByteArray(inputStream11, (int) (short) 0);
        org.apache.commons.io.IOUtils.readFully(inputStream1, byteArray17);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray20 = org.apache.commons.io.IOUtils.toByteArray(inputStream1, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Size must be equal or greater than zero: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(inputStream11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[]");
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "hi!");
        java.io.InputStream inputStream3 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray4 = new byte[] {};
        int int5 = org.apache.commons.io.IOUtils.length(byteArray4);
        int int6 = org.apache.commons.io.IOUtils.read(inputStream3, byteArray4);
        byte[] byteArray7 = org.apache.commons.io.IOUtils.toByteArray(inputStream3);
        byte[] byteArray9 = org.apache.commons.io.IOUtils.toByteArray(inputStream3, (int) (short) 0);
        java.io.BufferedInputStream bufferedInputStream10 = org.apache.commons.io.IOUtils.buffer(inputStream3);
        byte[] byteArray11 = org.apache.commons.io.IOUtils.toByteArray((java.io.InputStream) bufferedInputStream10);
        int int14 = org.apache.commons.io.IOUtils.read(inputStream1, byteArray11, 0, 0);
        java.io.OutputStream outputStream15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.io.IOUtils.copy(inputStream1, outputStream15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(byte[], int, int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(inputStream3);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(bufferedInputStream10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream2 = null;
        java.io.InputStream inputStream4 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream5 = null;
        java.io.InputStream inputStream8 = null;
        byte[] byteArray10 = org.apache.commons.io.IOUtils.toByteArray("");
        int int11 = org.apache.commons.io.IOUtils.read(inputStream8, byteArray10);
        long long12 = org.apache.commons.io.IOUtils.copyLarge(inputStream4, outputStream5, 0L, 0L, byteArray10);
        long long13 = org.apache.commons.io.IOUtils.copyLarge(inputStream1, outputStream2, byteArray10);
        java.io.BufferedInputStream bufferedInputStream15 = org.apache.commons.io.IOUtils.buffer(inputStream1, (int) (byte) 10);
        byte[] byteArray16 = org.apache.commons.io.IOUtils.toByteArray((java.io.InputStream) bufferedInputStream15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.io.IOUtils.toString(byteArray16, "\r\n");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ??");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(inputStream4);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(bufferedInputStream15);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        java.io.Reader reader0 = null;
        java.io.Reader reader1 = null;
        java.io.Writer writer2 = null;
        char[] charArray5 = new char[] {};
        int int6 = org.apache.commons.io.IOUtils.length(charArray5);
        java.io.Writer writer7 = null;
        org.apache.commons.io.IOUtils.writeChunked(charArray5, writer7);
        java.io.Writer writer9 = null;
        org.apache.commons.io.IOUtils.writeChunked(charArray5, writer9);
        long long11 = org.apache.commons.io.IOUtils.copyLarge(reader1, writer2, 0L, (long) (byte) 100, charArray5);
        java.io.Writer writer12 = null;
        org.apache.commons.io.IOUtils.writeChunked(charArray5, writer12);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.io.IOUtils.read(reader0, charArray5, (int) (byte) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"input\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        java.io.Reader reader0 = null;
        java.io.Reader reader1 = null;
        char[] charArray5 = new char[] { '#', '#', '#' };
        org.apache.commons.io.IOUtils.readFully(reader1, charArray5, (int) ' ', (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = org.apache.commons.io.IOUtils.read(reader0, charArray5, (int) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"input\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "###");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "###");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[#, #, #]");
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray2 = new byte[] {};
        int int3 = org.apache.commons.io.IOUtils.length(byteArray2);
        int int4 = org.apache.commons.io.IOUtils.read(inputStream1, byteArray2);
        byte[] byteArray5 = org.apache.commons.io.IOUtils.toByteArray(inputStream1);
        byte[] byteArray7 = org.apache.commons.io.IOUtils.toByteArray(inputStream1, (int) (short) 0);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write(byteArray7, writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Writer.write(String)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream("\r\n");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray3 = org.apache.commons.io.IOUtils.readFully(inputStream1, 4);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: Length to read: 4 actual: 2");
        } catch (java.io.EOFException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray2 = new byte[] {};
        int int3 = org.apache.commons.io.IOUtils.length(byteArray2);
        int int4 = org.apache.commons.io.IOUtils.read(inputStream1, byteArray2);
        byte[] byteArray5 = org.apache.commons.io.IOUtils.toByteArray(inputStream1);
        java.util.function.Consumer<java.io.IOException> iOExceptionConsumer6 = null;
        org.apache.commons.io.IOUtils.closeQuietly((java.io.Closeable) inputStream1, iOExceptionConsumer6);
        org.apache.commons.io.IOUtils.close((java.io.Closeable) inputStream1);
        java.io.BufferedInputStream bufferedInputStream10 = org.apache.commons.io.IOUtils.buffer(inputStream1, (int) (byte) 10);
        java.io.InputStream inputStream12 = org.apache.commons.io.IOUtils.toBufferedInputStream(inputStream1, (int) (byte) 1);
        java.util.function.Consumer<java.io.IOException> iOExceptionConsumer13 = null;
        org.apache.commons.io.IOUtils.closeQuietly((java.io.Closeable) inputStream1, iOExceptionConsumer13);
        java.io.OutputStream outputStream15 = null;
        java.io.InputStream inputStream17 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray18 = new byte[] {};
        int int19 = org.apache.commons.io.IOUtils.length(byteArray18);
        int int20 = org.apache.commons.io.IOUtils.read(inputStream17, byteArray18);
        byte[] byteArray21 = org.apache.commons.io.IOUtils.toByteArray(inputStream17);
        java.io.InputStream inputStream23 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray24 = new byte[] {};
        int int25 = org.apache.commons.io.IOUtils.length(byteArray24);
        int int26 = org.apache.commons.io.IOUtils.read(inputStream23, byteArray24);
        byte[] byteArray27 = org.apache.commons.io.IOUtils.toByteArray(inputStream23);
        int int28 = org.apache.commons.io.IOUtils.length(byteArray27);
        org.apache.commons.io.IOUtils.readFully(inputStream17, byteArray27);
        long long30 = org.apache.commons.io.IOUtils.copyLarge(inputStream1, outputStream15, byteArray27);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList32 = org.apache.commons.io.IOUtils.readLines(inputStream1, "\r\n");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ??");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(bufferedInputStream10);
        org.junit.Assert.assertNotNull(inputStream12);
        org.junit.Assert.assertNotNull(inputStream17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
        org.junit.Assert.assertNotNull(inputStream23);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        char[] charArray4 = new char[] { '4', 'a', '#', 'a' };
        int int5 = org.apache.commons.io.IOUtils.length(charArray4);
        int int6 = org.apache.commons.io.IOUtils.length(charArray4);
        int int7 = org.apache.commons.io.IOUtils.length(charArray4);
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write(charArray4, outputStream8, "\n");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ?");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, #, a]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        java.io.Reader reader0 = null;
        java.io.Reader reader1 = null;
        java.io.Writer writer2 = null;
        char[] charArray5 = new char[] {};
        int int6 = org.apache.commons.io.IOUtils.length(charArray5);
        java.io.Writer writer7 = null;
        org.apache.commons.io.IOUtils.writeChunked(charArray5, writer7);
        java.io.Writer writer9 = null;
        org.apache.commons.io.IOUtils.writeChunked(charArray5, writer9);
        long long11 = org.apache.commons.io.IOUtils.copyLarge(reader1, writer2, 0L, (long) (byte) 100, charArray5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.readFully(reader0, charArray5, 100, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"input\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write((java.lang.CharSequence) "hi!", outputStream1, "\r\n");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ??");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.BufferedOutputStream bufferedOutputStream2 = org.apache.commons.io.IOUtils.buffer(outputStream0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: outputStream");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        java.io.Reader reader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.skipFully(reader0, (long) 6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"input\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        java.io.Reader reader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.BufferedReader bufferedReader2 = org.apache.commons.io.IOUtils.buffer(reader0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        java.io.Reader reader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.BufferedReader bufferedReader2 = org.apache.commons.io.IOUtils.toBufferedReader(reader0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.io.IOUtils.toByteArray(inputStream0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.InputStream.read(byte[], int, int)\" because \"input\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        byte[] byteArray1 = org.apache.commons.io.IOUtils.toByteArray("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.io.IOUtils.toString(byteArray1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[104, 105, 33]");
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray2 = org.apache.commons.io.IOUtils.toByteArray(inputStream1);
        org.apache.commons.io.IOUtils.closeQuietly((java.io.Closeable) inputStream1);
        java.util.List<java.lang.String> strList4 = org.apache.commons.io.IOUtils.readLines(inputStream1);
        java.io.OutputStream outputStream5 = null;
        long long6 = org.apache.commons.io.IOUtils.copyLarge(inputStream1, outputStream5);
        java.io.Writer writer7 = null;
        org.apache.commons.io.IOUtils.copy(inputStream1, writer7);
        java.util.function.Consumer<java.io.IOException> iOExceptionConsumer9 = null;
        org.apache.commons.io.IOUtils.closeQuietly((java.io.Closeable) writer7, iOExceptionConsumer9);
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        java.nio.charset.Charset charset1 = null;
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.io.IOUtils.resourceToString("\n", charset1, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Resource not found: ?");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        java.io.OutputStream outputStream1 = null;
        java.nio.charset.Charset charset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write((java.lang.CharSequence) "\n", outputStream1, charset2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(byte[])\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        java.io.Reader reader0 = null;
        java.io.Reader reader1 = null;
        char[] charArray2 = new char[] {};
        int int3 = org.apache.commons.io.IOUtils.length(charArray2);
        org.apache.commons.io.IOUtils.readFully(reader1, charArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = org.apache.commons.io.IOUtils.read(reader0, charArray2, 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"input\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        java.io.Reader reader0 = null;
        java.io.Writer writer1 = null;
        char[] charArray4 = new char[] {};
        int int5 = org.apache.commons.io.IOUtils.length(charArray4);
        int int6 = org.apache.commons.io.IOUtils.length(charArray4);
        // The following exception was thrown during execution in test generation
        try {
            long long7 = org.apache.commons.io.IOUtils.copyLarge(reader0, writer1, (long) 1, (long) 100, charArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"input\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        java.io.Reader reader0 = null;
        char[] charArray1 = new char[] {};
        int int2 = org.apache.commons.io.IOUtils.length(charArray1);
        java.io.Writer writer3 = null;
        org.apache.commons.io.IOUtils.writeChunked(charArray1, writer3);
        int int5 = org.apache.commons.io.IOUtils.read(reader0, charArray1);
        java.io.Writer writer6 = null;
        org.apache.commons.io.IOUtils.writeChunked(charArray1, writer6);
        java.io.OutputStream outputStream8 = null;
        java.nio.charset.Charset charset9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write(charArray1, outputStream8, charset9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(byte[])\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        java.io.Reader reader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.BufferedReader bufferedReader2 = org.apache.commons.io.IOUtils.buffer(reader0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        java.io.Reader reader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.BufferedReader bufferedReader2 = org.apache.commons.io.IOUtils.toBufferedReader(reader0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        java.nio.charset.Charset charset1 = null;
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.io.IOUtils.resourceToString("\r\n", charset1, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Resource not found: ??");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        java.io.OutputStream outputStream1 = null;
        java.nio.charset.Charset charset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write("\n", outputStream1, charset2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(byte[])\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        java.nio.channels.ReadableByteChannel readableByteChannel0 = null;
        org.apache.commons.io.IOUtils.skipFully(readableByteChannel0, (long) (short) 0);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream2 = null;
        java.io.InputStream inputStream5 = null;
        byte[] byteArray7 = org.apache.commons.io.IOUtils.toByteArray("");
        int int8 = org.apache.commons.io.IOUtils.read(inputStream5, byteArray7);
        long long9 = org.apache.commons.io.IOUtils.copyLarge(inputStream1, outputStream2, 0L, 0L, byteArray7);
        java.nio.charset.Charset charset10 = null;
        java.util.List<java.lang.String> strList11 = org.apache.commons.io.IOUtils.readLines(inputStream1, charset10);
        java.io.InputStream inputStream13 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray14 = new byte[] {};
        int int15 = org.apache.commons.io.IOUtils.length(byteArray14);
        int int16 = org.apache.commons.io.IOUtils.read(inputStream13, byteArray14);
        byte[] byteArray17 = org.apache.commons.io.IOUtils.toByteArray(inputStream13);
        int int18 = org.apache.commons.io.IOUtils.length(byteArray17);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.readFully(inputStream1, byteArray17, (int) '\\', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [92, 92 + 1) out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(inputStream13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray2 = new byte[] {};
        int int3 = org.apache.commons.io.IOUtils.length(byteArray2);
        int int4 = org.apache.commons.io.IOUtils.read(inputStream1, byteArray2);
        byte[] byteArray5 = org.apache.commons.io.IOUtils.toByteArray(inputStream1);
        java.io.InputStream inputStream7 = org.apache.commons.io.IOUtils.toBufferedInputStream(inputStream1, (int) (byte) 0);
        java.io.InputStream inputStream9 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream10 = null;
        java.io.InputStream inputStream12 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream13 = null;
        java.io.InputStream inputStream16 = null;
        byte[] byteArray18 = org.apache.commons.io.IOUtils.toByteArray("");
        int int19 = org.apache.commons.io.IOUtils.read(inputStream16, byteArray18);
        long long20 = org.apache.commons.io.IOUtils.copyLarge(inputStream12, outputStream13, 0L, 0L, byteArray18);
        long long21 = org.apache.commons.io.IOUtils.copyLarge(inputStream9, outputStream10, byteArray18);
        java.io.BufferedInputStream bufferedInputStream23 = org.apache.commons.io.IOUtils.buffer(inputStream9, (int) (byte) 10);
        byte[] byteArray24 = org.apache.commons.io.IOUtils.toByteArray((java.io.InputStream) bufferedInputStream23);
        java.io.InputStream inputStream25 = null;
        java.io.OutputStream outputStream26 = null;
        byte[] byteArray29 = new byte[] {};
        int int30 = org.apache.commons.io.IOUtils.length(byteArray29);
        java.io.OutputStream outputStream31 = null;
        org.apache.commons.io.IOUtils.writeChunked(byteArray29, outputStream31);
        long long33 = org.apache.commons.io.IOUtils.copyLarge(inputStream25, outputStream26, 0L, (long) (byte) -1, byteArray29);
        java.io.OutputStream outputStream34 = null;
        org.apache.commons.io.IOUtils.writeChunked(byteArray29, outputStream34);
        int int36 = org.apache.commons.io.IOUtils.length(byteArray29);
        org.apache.commons.io.IOUtils.readFully((java.io.InputStream) bufferedInputStream23, byteArray29);
        // The following exception was thrown during execution in test generation
        try {
            int int40 = org.apache.commons.io.IOUtils.read(inputStream1, byteArray29, 3, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [3, 3 + 3) out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertNotNull(inputStream12);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(bufferedInputStream23);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        java.io.Reader reader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.io.IOUtils.skip(reader0, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"input\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        java.io.Reader reader0 = null;
        char[] charArray4 = new char[] { '#', '#', '#' };
        org.apache.commons.io.IOUtils.readFully(reader0, charArray4, (int) ' ', (int) (short) 0);
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write(charArray4, outputStream8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(byte[])\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "###");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "###");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#, #, #]");
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray2 = new byte[] {};
        int int3 = org.apache.commons.io.IOUtils.length(byteArray2);
        int int4 = org.apache.commons.io.IOUtils.read(inputStream1, byteArray2);
        byte[] byteArray5 = org.apache.commons.io.IOUtils.toByteArray(inputStream1);
        java.util.function.Consumer<java.io.IOException> iOExceptionConsumer6 = null;
        org.apache.commons.io.IOUtils.closeQuietly((java.io.Closeable) inputStream1, iOExceptionConsumer6);
        long long9 = org.apache.commons.io.IOUtils.skip(inputStream1, (long) (byte) 100);
        java.lang.String str10 = org.apache.commons.io.IOUtils.toString(inputStream1);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray12 = org.apache.commons.io.IOUtils.toCharArray(inputStream1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream2 = org.apache.commons.io.IOUtils.toInputStream("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        java.net.URI uRI0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.io.IOUtils.toString(uRI0, "\n");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ?");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream2 = null;
        java.io.InputStream inputStream5 = null;
        byte[] byteArray7 = org.apache.commons.io.IOUtils.toByteArray("");
        int int8 = org.apache.commons.io.IOUtils.read(inputStream5, byteArray7);
        long long9 = org.apache.commons.io.IOUtils.copyLarge(inputStream1, outputStream2, 0L, 0L, byteArray7);
        java.io.Writer writer10 = null;
        org.apache.commons.io.IOUtils.copy(inputStream1, writer10);
        java.util.List<java.lang.String> strList12 = org.apache.commons.io.IOUtils.readLines(inputStream1);
        // The following exception was thrown during execution in test generation
        try {
            java.io.BufferedInputStream bufferedInputStream14 = org.apache.commons.io.IOUtils.buffer(inputStream1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Buffer size <= 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write("\n", outputStream1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray2 = new byte[] {};
        int int3 = org.apache.commons.io.IOUtils.length(byteArray2);
        int int4 = org.apache.commons.io.IOUtils.read(inputStream1, byteArray2);
        byte[] byteArray5 = org.apache.commons.io.IOUtils.toByteArray(inputStream1);
        java.util.function.Consumer<java.io.IOException> iOExceptionConsumer6 = null;
        org.apache.commons.io.IOUtils.closeQuietly((java.io.Closeable) inputStream1, iOExceptionConsumer6);
        org.apache.commons.io.IOUtils.close((java.io.Closeable) inputStream1);
        java.io.BufferedInputStream bufferedInputStream10 = org.apache.commons.io.IOUtils.buffer(inputStream1, (int) (byte) 10);
        org.apache.commons.io.function.IOConsumer<java.io.IOException> iOExceptionIOConsumer11 = null;
        org.apache.commons.io.IOUtils.close((java.io.Closeable) bufferedInputStream10, iOExceptionIOConsumer11);
        java.nio.charset.Charset charset13 = null;
        org.apache.commons.io.LineIterator lineIterator14 = org.apache.commons.io.IOUtils.lineIterator((java.io.InputStream) bufferedInputStream10, charset13);
        java.nio.charset.Charset charset15 = null;
        org.apache.commons.io.LineIterator lineIterator16 = org.apache.commons.io.IOUtils.lineIterator((java.io.InputStream) bufferedInputStream10, charset15);
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(bufferedInputStream10);
        org.junit.Assert.assertNotNull(lineIterator14);
        org.junit.Assert.assertNotNull(lineIterator16);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray2 = new byte[] {};
        int int3 = org.apache.commons.io.IOUtils.length(byteArray2);
        int int4 = org.apache.commons.io.IOUtils.read(inputStream1, byteArray2);
        byte[] byteArray5 = org.apache.commons.io.IOUtils.toByteArray(inputStream1);
        java.util.function.Consumer<java.io.IOException> iOExceptionConsumer6 = null;
        org.apache.commons.io.IOUtils.closeQuietly((java.io.Closeable) inputStream1, iOExceptionConsumer6);
        org.apache.commons.io.IOUtils.close((java.io.Closeable) inputStream1);
        java.io.BufferedInputStream bufferedInputStream10 = org.apache.commons.io.IOUtils.buffer(inputStream1, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray12 = org.apache.commons.io.IOUtils.toCharArray((java.io.InputStream) bufferedInputStream10, "\n");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ?");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(bufferedInputStream10);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write("\r\n", outputStream1, "\r\n");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ??");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        java.io.Reader reader0 = null;
        java.io.Writer writer1 = null;
        java.io.Reader reader4 = null;
        char[] charArray5 = new char[] {};
        int int6 = org.apache.commons.io.IOUtils.length(charArray5);
        int int7 = org.apache.commons.io.IOUtils.read(reader4, charArray5);
        // The following exception was thrown during execution in test generation
        try {
            long long8 = org.apache.commons.io.IOUtils.copyLarge(reader0, writer1, (long) (short) 10, (long) 4, charArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"input\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL1 = org.apache.commons.io.IOUtils.resourceToURL("\n");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Resource not found: ?");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray2 = org.apache.commons.io.IOUtils.toByteArray(inputStream1);
        org.apache.commons.io.IOUtils.closeQuietly((java.io.Closeable) inputStream1);
        java.util.List<java.lang.String> strList4 = org.apache.commons.io.IOUtils.readLines(inputStream1);
        java.io.OutputStream outputStream6 = null;
        org.apache.commons.io.IOUtils.writeLines((java.util.Collection<java.lang.String>) strList4, "\n", outputStream6);
        java.io.OutputStream outputStream9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.writeLines((java.util.Collection<java.lang.String>) strList4, "\n", outputStream9, "");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        java.io.Reader reader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.io.IOUtils.skip(reader0, (long) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"input\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream(charSequence0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.toString()\" because \"input\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream2 = null;
        java.io.InputStream inputStream4 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream5 = null;
        java.io.InputStream inputStream8 = null;
        byte[] byteArray10 = org.apache.commons.io.IOUtils.toByteArray("");
        int int11 = org.apache.commons.io.IOUtils.read(inputStream8, byteArray10);
        long long12 = org.apache.commons.io.IOUtils.copyLarge(inputStream4, outputStream5, 0L, 0L, byteArray10);
        long long13 = org.apache.commons.io.IOUtils.copyLarge(inputStream1, outputStream2, byteArray10);
        java.io.BufferedInputStream bufferedInputStream15 = org.apache.commons.io.IOUtils.buffer(inputStream1, (int) (byte) 10);
        java.nio.charset.Charset charset16 = null;
        java.util.List<java.lang.String> strList17 = org.apache.commons.io.IOUtils.readLines(inputStream1, charset16);
        java.io.OutputStream outputStream19 = null;
        java.nio.charset.Charset charset20 = null;
        org.apache.commons.io.IOUtils.writeLines((java.util.Collection<java.lang.String>) strList17, "hi!", outputStream19, charset20);
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(inputStream4);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(bufferedInputStream15);
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray2 = new byte[] {};
        int int3 = org.apache.commons.io.IOUtils.length(byteArray2);
        int int4 = org.apache.commons.io.IOUtils.read(inputStream1, byteArray2);
        byte[] byteArray5 = org.apache.commons.io.IOUtils.toByteArray(inputStream1);
        java.io.InputStream inputStream7 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray8 = new byte[] {};
        int int9 = org.apache.commons.io.IOUtils.length(byteArray8);
        int int10 = org.apache.commons.io.IOUtils.read(inputStream7, byteArray8);
        byte[] byteArray11 = org.apache.commons.io.IOUtils.toByteArray(inputStream7);
        int int12 = org.apache.commons.io.IOUtils.length(byteArray11);
        org.apache.commons.io.IOUtils.readFully(inputStream1, byteArray11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.io.IOUtils.toString(inputStream1, "\n");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ?");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        java.io.Reader reader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.io.IOUtils.toByteArray(reader0, "\n");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ?");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        java.io.Reader reader0 = null;
        char[] charArray1 = new char[] {};
        int int2 = org.apache.commons.io.IOUtils.length(charArray1);
        java.io.Writer writer3 = null;
        org.apache.commons.io.IOUtils.writeChunked(charArray1, writer3);
        int int5 = org.apache.commons.io.IOUtils.read(reader0, charArray1);
        java.io.Writer writer6 = null;
        org.apache.commons.io.IOUtils.writeChunked(charArray1, writer6);
        int int8 = org.apache.commons.io.IOUtils.length(charArray1);
        java.io.OutputStream outputStream9 = null;
        java.nio.charset.Charset charset10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write(charArray1, outputStream9, charset10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(byte[])\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream2 = null;
        java.io.InputStream inputStream5 = null;
        byte[] byteArray7 = org.apache.commons.io.IOUtils.toByteArray("");
        int int8 = org.apache.commons.io.IOUtils.read(inputStream5, byteArray7);
        long long9 = org.apache.commons.io.IOUtils.copyLarge(inputStream1, outputStream2, 0L, 0L, byteArray7);
        java.nio.charset.Charset charset10 = null;
        java.util.List<java.lang.String> strList11 = org.apache.commons.io.IOUtils.readLines(inputStream1, charset10);
        org.apache.commons.io.IOUtils.close((java.io.Closeable) inputStream1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList14 = org.apache.commons.io.IOUtils.readLines(inputStream1, "\r\n");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ??");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        java.io.Reader reader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.BufferedReader bufferedReader2 = org.apache.commons.io.IOUtils.toBufferedReader(reader0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream2 = null;
        java.io.InputStream inputStream4 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream5 = null;
        java.io.InputStream inputStream8 = null;
        byte[] byteArray10 = org.apache.commons.io.IOUtils.toByteArray("");
        int int11 = org.apache.commons.io.IOUtils.read(inputStream8, byteArray10);
        long long12 = org.apache.commons.io.IOUtils.copyLarge(inputStream4, outputStream5, 0L, 0L, byteArray10);
        long long13 = org.apache.commons.io.IOUtils.copyLarge(inputStream1, outputStream2, byteArray10);
        java.io.BufferedInputStream bufferedInputStream15 = org.apache.commons.io.IOUtils.buffer(inputStream1, (int) (byte) 10);
        java.io.InputStream inputStream17 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray18 = org.apache.commons.io.IOUtils.toByteArray(inputStream17);
        org.apache.commons.io.IOUtils.closeQuietly((java.io.Closeable) inputStream17);
        java.io.InputStream inputStream21 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream22 = null;
        java.io.InputStream inputStream25 = null;
        byte[] byteArray27 = org.apache.commons.io.IOUtils.toByteArray("");
        int int28 = org.apache.commons.io.IOUtils.read(inputStream25, byteArray27);
        long long29 = org.apache.commons.io.IOUtils.copyLarge(inputStream21, outputStream22, 0L, 0L, byteArray27);
        java.nio.charset.Charset charset30 = null;
        java.util.List<java.lang.String> strList31 = org.apache.commons.io.IOUtils.readLines(inputStream21, charset30);
        java.io.InputStream inputStream33 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream34 = null;
        java.io.InputStream inputStream37 = null;
        byte[] byteArray39 = org.apache.commons.io.IOUtils.toByteArray("");
        int int40 = org.apache.commons.io.IOUtils.read(inputStream37, byteArray39);
        long long41 = org.apache.commons.io.IOUtils.copyLarge(inputStream33, outputStream34, 0L, 0L, byteArray39);
        java.nio.charset.Charset charset42 = null;
        java.util.List<java.lang.String> strList43 = org.apache.commons.io.IOUtils.readLines(inputStream33, charset42);
        org.apache.commons.io.IOUtils.close((java.io.Closeable) inputStream33);
        boolean boolean45 = org.apache.commons.io.IOUtils.contentEquals(inputStream21, inputStream33);
        java.io.OutputStream outputStream46 = null;
        java.io.InputStream inputStream48 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream49 = null;
        java.io.InputStream inputStream52 = null;
        byte[] byteArray54 = org.apache.commons.io.IOUtils.toByteArray("");
        int int55 = org.apache.commons.io.IOUtils.read(inputStream52, byteArray54);
        long long56 = org.apache.commons.io.IOUtils.copyLarge(inputStream48, outputStream49, 0L, 0L, byteArray54);
        long long57 = org.apache.commons.io.IOUtils.copyLarge(inputStream33, outputStream46, byteArray54);
        org.apache.commons.io.IOUtils.readFully(inputStream17, byteArray54);
        org.apache.commons.io.IOUtils.readFully(inputStream1, byteArray54);
        java.lang.String str60 = org.apache.commons.io.IOUtils.toString(inputStream1);
        java.io.BufferedInputStream bufferedInputStream62 = org.apache.commons.io.IOUtils.buffer(inputStream1, 100);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray64 = org.apache.commons.io.IOUtils.toByteArray(inputStream1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Size must be equal or greater than zero: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(inputStream4);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(bufferedInputStream15);
        org.junit.Assert.assertNotNull(inputStream17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
        org.junit.Assert.assertNotNull(inputStream21);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertNotNull(inputStream33);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(inputStream48);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray54), "[]");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertNotNull(bufferedInputStream62);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        java.io.InputStream inputStream0 = null;
        java.io.OutputStream outputStream1 = null;
        byte[] byteArray3 = org.apache.commons.io.IOUtils.toByteArray("");
        // The following exception was thrown during execution in test generation
        try {
            long long4 = org.apache.commons.io.IOUtils.copyLarge(inputStream0, outputStream1, byteArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.InputStream.read(byte[])\" because \"input\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream2 = null;
        java.io.InputStream inputStream5 = null;
        byte[] byteArray7 = org.apache.commons.io.IOUtils.toByteArray("");
        int int8 = org.apache.commons.io.IOUtils.read(inputStream5, byteArray7);
        long long9 = org.apache.commons.io.IOUtils.copyLarge(inputStream1, outputStream2, 0L, 0L, byteArray7);
        java.nio.charset.Charset charset10 = null;
        java.util.List<java.lang.String> strList11 = org.apache.commons.io.IOUtils.readLines(inputStream1, charset10);
        org.apache.commons.io.IOUtils.closeQuietly((java.io.Closeable) inputStream1);
        java.io.InputStream inputStream14 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray15 = org.apache.commons.io.IOUtils.toByteArray(inputStream14);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.readFully(inputStream1, byteArray15, (int) '\\', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [92, 92 + 100) out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(inputStream14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        char[] charArray0 = new char[] {};
        java.io.Writer writer1 = null;
        org.apache.commons.io.IOUtils.writeChunked(charArray0, writer1);
        int int3 = org.apache.commons.io.IOUtils.length(charArray0);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write(charArray0, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Writer.write(char[])\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        java.io.Reader reader0 = null;
        java.io.Writer writer1 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long4 = org.apache.commons.io.IOUtils.copyLarge(reader0, writer1, (long) (byte) 100, (long) '/');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"input\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray2 = new byte[] {};
        int int3 = org.apache.commons.io.IOUtils.length(byteArray2);
        int int4 = org.apache.commons.io.IOUtils.read(inputStream1, byteArray2);
        java.io.Writer writer5 = null;
        java.nio.charset.Charset charset6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write(byteArray2, writer5, charset6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Writer.write(String)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        java.io.Closeable closeable0 = null;
        java.util.function.Consumer<java.io.IOException> iOExceptionConsumer1 = null;
        org.apache.commons.io.IOUtils.closeQuietly(closeable0, iOExceptionConsumer1);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        java.io.Writer writer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.BufferedWriter bufferedWriter2 = org.apache.commons.io.IOUtils.buffer(writer0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray2 = new byte[] {};
        int int3 = org.apache.commons.io.IOUtils.length(byteArray2);
        int int4 = org.apache.commons.io.IOUtils.read(inputStream1, byteArray2);
        byte[] byteArray5 = org.apache.commons.io.IOUtils.toByteArray(inputStream1);
        java.util.function.Consumer<java.io.IOException> iOExceptionConsumer6 = null;
        org.apache.commons.io.IOUtils.closeQuietly((java.io.Closeable) inputStream1, iOExceptionConsumer6);
        org.apache.commons.io.IOUtils.close((java.io.Closeable) inputStream1);
        java.io.BufferedInputStream bufferedInputStream10 = org.apache.commons.io.IOUtils.buffer(inputStream1, (int) (byte) 10);
        org.apache.commons.io.function.IOConsumer<java.io.IOException> iOExceptionIOConsumer11 = null;
        org.apache.commons.io.IOUtils.close((java.io.Closeable) bufferedInputStream10, iOExceptionIOConsumer11);
        org.apache.commons.io.IOUtils.closeQuietly((java.io.Closeable) bufferedInputStream10);
        org.apache.commons.io.IOUtils.skipFully((java.io.InputStream) bufferedInputStream10, (long) (short) 0);
        java.io.OutputStream outputStream16 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long19 = org.apache.commons.io.IOUtils.copyLarge((java.io.InputStream) bufferedInputStream10, outputStream16, (long) '4', (long) 0);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(bufferedInputStream10);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        java.io.Reader reader0 = null;
        java.io.Writer writer1 = null;
        char[] charArray8 = new char[] { '4', 'a', '#', 'a' };
        int int9 = org.apache.commons.io.IOUtils.length(charArray8);
        // The following exception was thrown during execution in test generation
        try {
            long long10 = org.apache.commons.io.IOUtils.copyLarge(reader0, writer1, (long) 5, (long) '4', charArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"input\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, a, #, a]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray2 = new byte[] {};
        int int3 = org.apache.commons.io.IOUtils.length(byteArray2);
        int int4 = org.apache.commons.io.IOUtils.read(inputStream1, byteArray2);
        byte[] byteArray5 = org.apache.commons.io.IOUtils.toByteArray(inputStream1);
        byte[] byteArray7 = org.apache.commons.io.IOUtils.toByteArray(inputStream1, (int) (short) 0);
        long long9 = org.apache.commons.io.IOUtils.skip(inputStream1, 100L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.io.IOUtils.toString(inputStream1, "\r\n");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ??");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream2 = null;
        java.io.InputStream inputStream5 = null;
        byte[] byteArray7 = org.apache.commons.io.IOUtils.toByteArray("");
        int int8 = org.apache.commons.io.IOUtils.read(inputStream5, byteArray7);
        long long9 = org.apache.commons.io.IOUtils.copyLarge(inputStream1, outputStream2, 0L, 0L, byteArray7);
        java.io.OutputStream outputStream10 = null;
        long long13 = org.apache.commons.io.IOUtils.copyLarge(inputStream1, outputStream10, (long) (short) 0, (-1L));
        java.io.OutputStream outputStream14 = null;
        long long15 = org.apache.commons.io.IOUtils.copyLarge(inputStream1, outputStream14);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList17 = org.apache.commons.io.IOUtils.readLines(inputStream1, "\r\n");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ??");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        java.io.Reader reader0 = null;
        char[] charArray1 = new char[] {};
        int int2 = org.apache.commons.io.IOUtils.length(charArray1);
        int int3 = org.apache.commons.io.IOUtils.length(charArray1);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = org.apache.commons.io.IOUtils.read(reader0, charArray1, 0, (int) '/');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"input\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList2 = org.apache.commons.io.IOUtils.readLines(inputStream0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray2 = new byte[] {};
        int int3 = org.apache.commons.io.IOUtils.length(byteArray2);
        int int4 = org.apache.commons.io.IOUtils.read(inputStream1, byteArray2);
        byte[] byteArray5 = org.apache.commons.io.IOUtils.toByteArray(inputStream1);
        java.io.InputStream inputStream7 = org.apache.commons.io.IOUtils.toBufferedInputStream(inputStream1, (int) (byte) 0);
        byte[] byteArray9 = org.apache.commons.io.IOUtils.toByteArray("hi!");
        int int10 = org.apache.commons.io.IOUtils.read(inputStream7, byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.io.IOUtils.toString(byteArray9, "\r\n");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ??");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[104, 105, 33]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        java.io.InputStream inputStream0 = null;
        java.io.OutputStream outputStream1 = null;
        long long4 = org.apache.commons.io.IOUtils.copyLarge(inputStream0, outputStream1, (long) (byte) -1, (long) 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray2 = org.apache.commons.io.IOUtils.toByteArray(inputStream1);
        org.apache.commons.io.IOUtils.closeQuietly((java.io.Closeable) inputStream1);
        java.nio.charset.Charset charset4 = null;
        org.apache.commons.io.LineIterator lineIterator5 = org.apache.commons.io.IOUtils.lineIterator(inputStream1, charset4);
        java.lang.String str6 = org.apache.commons.io.IOUtils.toString(inputStream1);
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long10 = org.apache.commons.io.IOUtils.copyLarge(inputStream1, outputStream7, 10L, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: Bytes to skip: 10 actual: 0");
        } catch (java.io.EOFException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(lineIterator5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray2 = org.apache.commons.io.IOUtils.toByteArray(inputStream1);
        org.apache.commons.io.IOUtils.closeQuietly((java.io.Closeable) inputStream1);
        java.io.InputStream inputStream5 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream6 = null;
        java.io.InputStream inputStream9 = null;
        byte[] byteArray11 = org.apache.commons.io.IOUtils.toByteArray("");
        int int12 = org.apache.commons.io.IOUtils.read(inputStream9, byteArray11);
        long long13 = org.apache.commons.io.IOUtils.copyLarge(inputStream5, outputStream6, 0L, 0L, byteArray11);
        java.nio.charset.Charset charset14 = null;
        java.util.List<java.lang.String> strList15 = org.apache.commons.io.IOUtils.readLines(inputStream5, charset14);
        java.io.InputStream inputStream17 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream18 = null;
        java.io.InputStream inputStream21 = null;
        byte[] byteArray23 = org.apache.commons.io.IOUtils.toByteArray("");
        int int24 = org.apache.commons.io.IOUtils.read(inputStream21, byteArray23);
        long long25 = org.apache.commons.io.IOUtils.copyLarge(inputStream17, outputStream18, 0L, 0L, byteArray23);
        java.nio.charset.Charset charset26 = null;
        java.util.List<java.lang.String> strList27 = org.apache.commons.io.IOUtils.readLines(inputStream17, charset26);
        org.apache.commons.io.IOUtils.close((java.io.Closeable) inputStream17);
        boolean boolean29 = org.apache.commons.io.IOUtils.contentEquals(inputStream5, inputStream17);
        java.io.OutputStream outputStream30 = null;
        java.io.InputStream inputStream32 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream33 = null;
        java.io.InputStream inputStream36 = null;
        byte[] byteArray38 = org.apache.commons.io.IOUtils.toByteArray("");
        int int39 = org.apache.commons.io.IOUtils.read(inputStream36, byteArray38);
        long long40 = org.apache.commons.io.IOUtils.copyLarge(inputStream32, outputStream33, 0L, 0L, byteArray38);
        long long41 = org.apache.commons.io.IOUtils.copyLarge(inputStream17, outputStream30, byteArray38);
        org.apache.commons.io.IOUtils.readFully(inputStream1, byteArray38);
        java.io.Writer writer43 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write(byteArray38, writer43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Writer.write(String)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(inputStream5);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(inputStream17);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(inputStream32);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        java.nio.charset.Charset charset1 = null;
        java.io.InputStream inputStream2 = org.apache.commons.io.IOUtils.toInputStream("\n", charset1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.LineIterator lineIterator4 = org.apache.commons.io.IOUtils.lineIterator(inputStream2, "\r\n");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ??");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream2);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray2 = new byte[] {};
        int int3 = org.apache.commons.io.IOUtils.length(byteArray2);
        int int4 = org.apache.commons.io.IOUtils.read(inputStream1, byteArray2);
        byte[] byteArray5 = org.apache.commons.io.IOUtils.toByteArray(inputStream1);
        java.io.InputStream inputStream7 = org.apache.commons.io.IOUtils.toBufferedInputStream(inputStream1, (int) (byte) 0);
        java.nio.charset.Charset charset8 = null;
        org.apache.commons.io.LineIterator lineIterator9 = org.apache.commons.io.IOUtils.lineIterator(inputStream7, charset8);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray11 = org.apache.commons.io.IOUtils.readFully(inputStream7, (int) '/');
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: Length to read: 47 actual: 0");
        } catch (java.io.EOFException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(lineIterator9);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray2 = org.apache.commons.io.IOUtils.toByteArray(inputStream1);
        org.apache.commons.io.IOUtils.closeQuietly((java.io.Closeable) inputStream1);
        java.util.List<java.lang.String> strList4 = org.apache.commons.io.IOUtils.readLines(inputStream1);
        java.io.Writer writer6 = null;
        org.apache.commons.io.IOUtils.writeLines((java.util.Collection<java.lang.String>) strList4, "", writer6);
        java.io.OutputStream outputStream9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.writeLines((java.util.Collection<java.lang.String>) strList4, "hi!", outputStream9, "");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        java.io.Reader reader0 = null;
        java.io.Writer writer1 = null;
        char[] charArray4 = new char[] {};
        int int5 = org.apache.commons.io.IOUtils.length(charArray4);
        java.io.Writer writer6 = null;
        org.apache.commons.io.IOUtils.writeChunked(charArray4, writer6);
        java.io.Writer writer8 = null;
        org.apache.commons.io.IOUtils.writeChunked(charArray4, writer8);
        // The following exception was thrown during execution in test generation
        try {
            long long10 = org.apache.commons.io.IOUtils.copyLarge(reader0, writer1, (long) (short) 10, (long) (-1), charArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"input\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray2 = org.apache.commons.io.IOUtils.toByteArray(inputStream1);
        java.io.InputStream inputStream4 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray5 = new byte[] {};
        int int6 = org.apache.commons.io.IOUtils.length(byteArray5);
        int int7 = org.apache.commons.io.IOUtils.read(inputStream4, byteArray5);
        byte[] byteArray8 = org.apache.commons.io.IOUtils.toByteArray(inputStream4);
        java.util.function.Consumer<java.io.IOException> iOExceptionConsumer9 = null;
        org.apache.commons.io.IOUtils.closeQuietly((java.io.Closeable) inputStream4, iOExceptionConsumer9);
        org.apache.commons.io.IOUtils.close((java.io.Closeable) inputStream4);
        java.io.BufferedInputStream bufferedInputStream13 = org.apache.commons.io.IOUtils.buffer(inputStream4, (int) (byte) 10);
        boolean boolean14 = org.apache.commons.io.IOUtils.contentEquals(inputStream1, inputStream4);
        java.io.OutputStream outputStream15 = null;
        long long18 = org.apache.commons.io.IOUtils.copyLarge(inputStream1, outputStream15, (long) (short) 0, (long) 2);
        java.io.InputStream inputStream20 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray21 = org.apache.commons.io.IOUtils.toByteArray(inputStream20);
        java.io.InputStream inputStream23 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray24 = new byte[] {};
        int int25 = org.apache.commons.io.IOUtils.length(byteArray24);
        int int26 = org.apache.commons.io.IOUtils.read(inputStream23, byteArray24);
        byte[] byteArray27 = org.apache.commons.io.IOUtils.toByteArray(inputStream23);
        java.util.function.Consumer<java.io.IOException> iOExceptionConsumer28 = null;
        org.apache.commons.io.IOUtils.closeQuietly((java.io.Closeable) inputStream23, iOExceptionConsumer28);
        org.apache.commons.io.IOUtils.close((java.io.Closeable) inputStream23);
        java.io.BufferedInputStream bufferedInputStream32 = org.apache.commons.io.IOUtils.buffer(inputStream23, (int) (byte) 10);
        boolean boolean33 = org.apache.commons.io.IOUtils.contentEquals(inputStream20, inputStream23);
        java.io.InputStream inputStream35 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray36 = new byte[] {};
        int int37 = org.apache.commons.io.IOUtils.length(byteArray36);
        int int38 = org.apache.commons.io.IOUtils.read(inputStream35, byteArray36);
        byte[] byteArray39 = org.apache.commons.io.IOUtils.toByteArray(inputStream35);
        byte[] byteArray41 = org.apache.commons.io.IOUtils.toByteArray(inputStream35, (int) (short) 0);
        long long43 = org.apache.commons.io.IOUtils.skip(inputStream35, 100L);
        java.io.InputStream inputStream44 = null;
        java.io.InputStream inputStream45 = null;
        java.io.OutputStream outputStream46 = null;
        byte[] byteArray49 = new byte[] {};
        int int50 = org.apache.commons.io.IOUtils.length(byteArray49);
        java.io.OutputStream outputStream51 = null;
        org.apache.commons.io.IOUtils.writeChunked(byteArray49, outputStream51);
        long long53 = org.apache.commons.io.IOUtils.copyLarge(inputStream45, outputStream46, 0L, (long) (byte) -1, byteArray49);
        java.io.OutputStream outputStream54 = null;
        org.apache.commons.io.IOUtils.writeChunked(byteArray49, outputStream54);
        org.apache.commons.io.IOUtils.readFully(inputStream44, byteArray49);
        int int57 = org.apache.commons.io.IOUtils.read(inputStream35, byteArray49);
        int int58 = org.apache.commons.io.IOUtils.read(inputStream23, byteArray49);
        java.io.OutputStream outputStream59 = null;
        org.apache.commons.io.IOUtils.writeChunked(byteArray49, outputStream59);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.readFully(inputStream1, byteArray49, (int) 'a', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [97, 97 + 52) out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(inputStream4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(bufferedInputStream13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(inputStream20);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
        org.junit.Assert.assertNotNull(inputStream23);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[]");
        org.junit.Assert.assertNotNull(bufferedInputStream32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(inputStream35);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[]");
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[]");
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray2 = new byte[] {};
        int int3 = org.apache.commons.io.IOUtils.length(byteArray2);
        int int4 = org.apache.commons.io.IOUtils.read(inputStream1, byteArray2);
        byte[] byteArray5 = org.apache.commons.io.IOUtils.toByteArray(inputStream1);
        java.io.InputStream inputStream7 = org.apache.commons.io.IOUtils.toBufferedInputStream(inputStream1, (int) (byte) 0);
        java.nio.charset.Charset charset8 = null;
        org.apache.commons.io.LineIterator lineIterator9 = org.apache.commons.io.IOUtils.lineIterator(inputStream7, charset8);
        java.io.OutputStream outputStream10 = null;
        java.io.InputStream inputStream14 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray15 = new byte[] {};
        int int16 = org.apache.commons.io.IOUtils.length(byteArray15);
        int int17 = org.apache.commons.io.IOUtils.read(inputStream14, byteArray15);
        byte[] byteArray18 = org.apache.commons.io.IOUtils.toByteArray(inputStream14);
        byte[] byteArray20 = org.apache.commons.io.IOUtils.toByteArray(inputStream14, (int) (short) 0);
        byte[] byteArray21 = new byte[] {};
        int int22 = org.apache.commons.io.IOUtils.length(byteArray21);
        org.apache.commons.io.IOUtils.readFully(inputStream14, byteArray21);
        // The following exception was thrown during execution in test generation
        try {
            long long24 = org.apache.commons.io.IOUtils.copyLarge(inputStream7, outputStream10, (long) (byte) 1, (long) (-1), byteArray21);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: Bytes to skip: 1 actual: 0");
        } catch (java.io.EOFException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(lineIterator9);
        org.junit.Assert.assertNotNull(inputStream14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream2 = null;
        java.io.InputStream inputStream4 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream5 = null;
        java.io.InputStream inputStream8 = null;
        byte[] byteArray10 = org.apache.commons.io.IOUtils.toByteArray("");
        int int11 = org.apache.commons.io.IOUtils.read(inputStream8, byteArray10);
        long long12 = org.apache.commons.io.IOUtils.copyLarge(inputStream4, outputStream5, 0L, 0L, byteArray10);
        long long13 = org.apache.commons.io.IOUtils.copyLarge(inputStream1, outputStream2, byteArray10);
        long long15 = org.apache.commons.io.IOUtils.skip(inputStream1, (long) 'a');
        java.io.OutputStream outputStream16 = null;
        java.io.InputStream inputStream20 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray21 = org.apache.commons.io.IOUtils.toByteArray(inputStream20);
        org.apache.commons.io.IOUtils.closeQuietly((java.io.Closeable) inputStream20);
        java.io.InputStream inputStream24 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream25 = null;
        java.io.InputStream inputStream28 = null;
        byte[] byteArray30 = org.apache.commons.io.IOUtils.toByteArray("");
        int int31 = org.apache.commons.io.IOUtils.read(inputStream28, byteArray30);
        long long32 = org.apache.commons.io.IOUtils.copyLarge(inputStream24, outputStream25, 0L, 0L, byteArray30);
        java.nio.charset.Charset charset33 = null;
        java.util.List<java.lang.String> strList34 = org.apache.commons.io.IOUtils.readLines(inputStream24, charset33);
        java.io.InputStream inputStream36 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream37 = null;
        java.io.InputStream inputStream40 = null;
        byte[] byteArray42 = org.apache.commons.io.IOUtils.toByteArray("");
        int int43 = org.apache.commons.io.IOUtils.read(inputStream40, byteArray42);
        long long44 = org.apache.commons.io.IOUtils.copyLarge(inputStream36, outputStream37, 0L, 0L, byteArray42);
        java.nio.charset.Charset charset45 = null;
        java.util.List<java.lang.String> strList46 = org.apache.commons.io.IOUtils.readLines(inputStream36, charset45);
        org.apache.commons.io.IOUtils.close((java.io.Closeable) inputStream36);
        boolean boolean48 = org.apache.commons.io.IOUtils.contentEquals(inputStream24, inputStream36);
        java.io.OutputStream outputStream49 = null;
        java.io.InputStream inputStream51 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream52 = null;
        java.io.InputStream inputStream55 = null;
        byte[] byteArray57 = org.apache.commons.io.IOUtils.toByteArray("");
        int int58 = org.apache.commons.io.IOUtils.read(inputStream55, byteArray57);
        long long59 = org.apache.commons.io.IOUtils.copyLarge(inputStream51, outputStream52, 0L, 0L, byteArray57);
        long long60 = org.apache.commons.io.IOUtils.copyLarge(inputStream36, outputStream49, byteArray57);
        org.apache.commons.io.IOUtils.readFully(inputStream20, byteArray57);
        java.io.OutputStream outputStream62 = null;
        org.apache.commons.io.IOUtils.writeChunked(byteArray57, outputStream62);
        int int64 = org.apache.commons.io.IOUtils.length(byteArray57);
        // The following exception was thrown during execution in test generation
        try {
            long long65 = org.apache.commons.io.IOUtils.copyLarge(inputStream1, outputStream16, (long) '\\', (long) (byte) 100, byteArray57);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: Bytes to skip: 92 actual: 0");
        } catch (java.io.EOFException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(inputStream4);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(inputStream20);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
        org.junit.Assert.assertNotNull(inputStream24);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertNotNull(inputStream36);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertNotNull(strList46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(inputStream51);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[]");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream2 = null;
        java.io.InputStream inputStream4 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream5 = null;
        java.io.InputStream inputStream8 = null;
        byte[] byteArray10 = org.apache.commons.io.IOUtils.toByteArray("");
        int int11 = org.apache.commons.io.IOUtils.read(inputStream8, byteArray10);
        long long12 = org.apache.commons.io.IOUtils.copyLarge(inputStream4, outputStream5, 0L, 0L, byteArray10);
        long long13 = org.apache.commons.io.IOUtils.copyLarge(inputStream1, outputStream2, byteArray10);
        java.io.BufferedInputStream bufferedInputStream15 = org.apache.commons.io.IOUtils.buffer(inputStream1, (int) (byte) 10);
        java.io.InputStream inputStream17 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray18 = org.apache.commons.io.IOUtils.toByteArray(inputStream17);
        org.apache.commons.io.IOUtils.closeQuietly((java.io.Closeable) inputStream17);
        java.io.InputStream inputStream21 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream22 = null;
        java.io.InputStream inputStream25 = null;
        byte[] byteArray27 = org.apache.commons.io.IOUtils.toByteArray("");
        int int28 = org.apache.commons.io.IOUtils.read(inputStream25, byteArray27);
        long long29 = org.apache.commons.io.IOUtils.copyLarge(inputStream21, outputStream22, 0L, 0L, byteArray27);
        java.nio.charset.Charset charset30 = null;
        java.util.List<java.lang.String> strList31 = org.apache.commons.io.IOUtils.readLines(inputStream21, charset30);
        java.io.InputStream inputStream33 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream34 = null;
        java.io.InputStream inputStream37 = null;
        byte[] byteArray39 = org.apache.commons.io.IOUtils.toByteArray("");
        int int40 = org.apache.commons.io.IOUtils.read(inputStream37, byteArray39);
        long long41 = org.apache.commons.io.IOUtils.copyLarge(inputStream33, outputStream34, 0L, 0L, byteArray39);
        java.nio.charset.Charset charset42 = null;
        java.util.List<java.lang.String> strList43 = org.apache.commons.io.IOUtils.readLines(inputStream33, charset42);
        org.apache.commons.io.IOUtils.close((java.io.Closeable) inputStream33);
        boolean boolean45 = org.apache.commons.io.IOUtils.contentEquals(inputStream21, inputStream33);
        java.io.OutputStream outputStream46 = null;
        java.io.InputStream inputStream48 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream49 = null;
        java.io.InputStream inputStream52 = null;
        byte[] byteArray54 = org.apache.commons.io.IOUtils.toByteArray("");
        int int55 = org.apache.commons.io.IOUtils.read(inputStream52, byteArray54);
        long long56 = org.apache.commons.io.IOUtils.copyLarge(inputStream48, outputStream49, 0L, 0L, byteArray54);
        long long57 = org.apache.commons.io.IOUtils.copyLarge(inputStream33, outputStream46, byteArray54);
        org.apache.commons.io.IOUtils.readFully(inputStream17, byteArray54);
        org.apache.commons.io.IOUtils.readFully(inputStream1, byteArray54);
        java.lang.String str60 = org.apache.commons.io.IOUtils.toString(inputStream1);
        java.io.BufferedInputStream bufferedInputStream62 = org.apache.commons.io.IOUtils.buffer(inputStream1, 100);
        java.io.OutputStream outputStream63 = null;
        java.io.InputStream inputStream67 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray68 = new byte[] {};
        int int69 = org.apache.commons.io.IOUtils.length(byteArray68);
        int int70 = org.apache.commons.io.IOUtils.read(inputStream67, byteArray68);
        byte[] byteArray71 = org.apache.commons.io.IOUtils.toByteArray(inputStream67);
        byte[] byteArray73 = org.apache.commons.io.IOUtils.toByteArray(inputStream67, (int) (short) 0);
        long long75 = org.apache.commons.io.IOUtils.skip(inputStream67, 100L);
        java.io.InputStream inputStream76 = null;
        java.io.InputStream inputStream77 = null;
        java.io.OutputStream outputStream78 = null;
        byte[] byteArray81 = new byte[] {};
        int int82 = org.apache.commons.io.IOUtils.length(byteArray81);
        java.io.OutputStream outputStream83 = null;
        org.apache.commons.io.IOUtils.writeChunked(byteArray81, outputStream83);
        long long85 = org.apache.commons.io.IOUtils.copyLarge(inputStream77, outputStream78, 0L, (long) (byte) -1, byteArray81);
        java.io.OutputStream outputStream86 = null;
        org.apache.commons.io.IOUtils.writeChunked(byteArray81, outputStream86);
        org.apache.commons.io.IOUtils.readFully(inputStream76, byteArray81);
        int int89 = org.apache.commons.io.IOUtils.read(inputStream67, byteArray81);
        long long90 = org.apache.commons.io.IOUtils.copyLarge(inputStream1, outputStream63, 0L, 1L, byteArray81);
        java.lang.Class<?> wildcardClass91 = inputStream1.getClass();
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(inputStream4);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(bufferedInputStream15);
        org.junit.Assert.assertNotNull(inputStream17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
        org.junit.Assert.assertNotNull(inputStream21);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertNotNull(inputStream33);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(inputStream48);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray54), "[]");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertNotNull(bufferedInputStream62);
        org.junit.Assert.assertNotNull(inputStream67);
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray68), "[]");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray71), "[]");
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray73), "[]");
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 0L + "'", long75 == 0L);
        org.junit.Assert.assertNotNull(byteArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray81), "[]");
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertTrue("'" + long85 + "' != '" + 0L + "'", long85 == 0L);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertTrue("'" + long90 + "' != '" + 0L + "'", long90 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass91);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        java.io.InputStream inputStream0 = null;
        java.io.OutputStream outputStream1 = null;
        byte[] byteArray4 = new byte[] {};
        int int5 = org.apache.commons.io.IOUtils.length(byteArray4);
        java.io.OutputStream outputStream6 = null;
        org.apache.commons.io.IOUtils.writeChunked(byteArray4, outputStream6);
        long long8 = org.apache.commons.io.IOUtils.copyLarge(inputStream0, outputStream1, 0L, (long) (byte) -1, byteArray4);
        java.io.OutputStream outputStream9 = null;
        org.apache.commons.io.IOUtils.writeChunked(byteArray4, outputStream9);
        int int11 = org.apache.commons.io.IOUtils.length(byteArray4);
        java.io.Writer writer12 = null;
        java.nio.charset.Charset charset13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write(byteArray4, writer12, charset13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Writer.write(String)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray2 = org.apache.commons.io.IOUtils.toByteArray(inputStream1);
        java.lang.String str3 = org.apache.commons.io.IOUtils.toString(byteArray2);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write(byteArray2, writer4, "");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        org.apache.commons.io.IOUtils.closeQuietly((java.io.Closeable) inputStream1);
        java.io.InputStream inputStream3 = org.apache.commons.io.IOUtils.toBufferedInputStream(inputStream1);
        java.io.InputStream inputStream4 = org.apache.commons.io.IOUtils.toBufferedInputStream(inputStream3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList6 = org.apache.commons.io.IOUtils.readLines(inputStream3, "\n");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ?");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(inputStream3);
        org.junit.Assert.assertNotNull(inputStream4);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream2 = null;
        java.io.InputStream inputStream4 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream5 = null;
        java.io.InputStream inputStream8 = null;
        byte[] byteArray10 = org.apache.commons.io.IOUtils.toByteArray("");
        int int11 = org.apache.commons.io.IOUtils.read(inputStream8, byteArray10);
        long long12 = org.apache.commons.io.IOUtils.copyLarge(inputStream4, outputStream5, 0L, 0L, byteArray10);
        long long13 = org.apache.commons.io.IOUtils.copyLarge(inputStream1, outputStream2, byteArray10);
        java.io.BufferedInputStream bufferedInputStream15 = org.apache.commons.io.IOUtils.buffer(inputStream1, (int) (byte) 10);
        java.nio.charset.Charset charset16 = null;
        java.util.List<java.lang.String> strList17 = org.apache.commons.io.IOUtils.readLines(inputStream1, charset16);
        java.io.OutputStream outputStream18 = null;
        int int19 = org.apache.commons.io.IOUtils.copy(inputStream1, outputStream18);
        org.apache.commons.io.function.IOConsumer<java.io.IOException> iOExceptionIOConsumer20 = null;
        org.apache.commons.io.IOUtils.close((java.io.Closeable) outputStream18, iOExceptionIOConsumer20);
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(inputStream4);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(bufferedInputStream15);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        java.io.Reader reader0 = null;
        java.io.Reader reader1 = null;
        java.io.Writer writer2 = null;
        char[] charArray5 = new char[] {};
        int int6 = org.apache.commons.io.IOUtils.length(charArray5);
        java.io.Writer writer7 = null;
        org.apache.commons.io.IOUtils.writeChunked(charArray5, writer7);
        java.io.Writer writer9 = null;
        org.apache.commons.io.IOUtils.writeChunked(charArray5, writer9);
        long long11 = org.apache.commons.io.IOUtils.copyLarge(reader1, writer2, 0L, (long) (byte) 100, charArray5);
        int int12 = org.apache.commons.io.IOUtils.read(reader0, charArray5);
        java.io.Writer writer13 = null;
        org.apache.commons.io.IOUtils.writeChunked(charArray5, writer13);
        java.io.OutputStream outputStream15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write(charArray5, outputStream15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(byte[])\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        java.io.Reader reader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.io.IOUtils.skip(reader0, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Skip count must be non-negative, actual: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        char[] charArray4 = new char[] { '4', 'a', '#', 'a' };
        int int5 = org.apache.commons.io.IOUtils.length(charArray4);
        int int6 = org.apache.commons.io.IOUtils.length(charArray4);
        int int7 = org.apache.commons.io.IOUtils.length(charArray4);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.writeChunked(charArray4, writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Writer.write(char[], int, int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, #, a]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray2 = new byte[] {};
        int int3 = org.apache.commons.io.IOUtils.length(byteArray2);
        int int4 = org.apache.commons.io.IOUtils.read(inputStream1, byteArray2);
        byte[] byteArray5 = org.apache.commons.io.IOUtils.toByteArray(inputStream1);
        byte[] byteArray7 = org.apache.commons.io.IOUtils.toByteArray(inputStream1, (int) (short) 0);
        byte[] byteArray8 = new byte[] {};
        int int9 = org.apache.commons.io.IOUtils.length(byteArray8);
        org.apache.commons.io.IOUtils.readFully(inputStream1, byteArray8);
        java.io.Writer writer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write(byteArray8, writer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Writer.write(String)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        java.io.Reader reader0 = null;
        java.io.Writer writer1 = null;
        java.io.Reader reader4 = null;
        java.io.Writer writer5 = null;
        char[] charArray8 = new char[] {};
        int int9 = org.apache.commons.io.IOUtils.length(charArray8);
        java.io.Writer writer10 = null;
        org.apache.commons.io.IOUtils.writeChunked(charArray8, writer10);
        java.io.Writer writer12 = null;
        org.apache.commons.io.IOUtils.writeChunked(charArray8, writer12);
        long long14 = org.apache.commons.io.IOUtils.copyLarge(reader4, writer5, 0L, (long) (byte) 100, charArray8);
        java.io.Writer writer15 = null;
        org.apache.commons.io.IOUtils.writeChunked(charArray8, writer15);
        java.io.Writer writer17 = null;
        org.apache.commons.io.IOUtils.writeChunked(charArray8, writer17);
        // The following exception was thrown during execution in test generation
        try {
            long long19 = org.apache.commons.io.IOUtils.copyLarge(reader0, writer1, 1L, (long) (-1), charArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"input\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream2 = null;
        java.io.InputStream inputStream5 = null;
        byte[] byteArray7 = org.apache.commons.io.IOUtils.toByteArray("");
        int int8 = org.apache.commons.io.IOUtils.read(inputStream5, byteArray7);
        long long9 = org.apache.commons.io.IOUtils.copyLarge(inputStream1, outputStream2, 0L, 0L, byteArray7);
        java.io.OutputStream outputStream10 = null;
        long long13 = org.apache.commons.io.IOUtils.copyLarge(inputStream1, outputStream10, (long) (short) 0, (-1L));
        java.lang.String str14 = org.apache.commons.io.IOUtils.toString(inputStream1);
        java.io.BufferedInputStream bufferedInputStream16 = org.apache.commons.io.IOUtils.buffer(inputStream1, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList18 = org.apache.commons.io.IOUtils.readLines(inputStream1, "\n");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ?");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(bufferedInputStream16);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray2 = new byte[] {};
        int int3 = org.apache.commons.io.IOUtils.length(byteArray2);
        int int4 = org.apache.commons.io.IOUtils.read(inputStream1, byteArray2);
        byte[] byteArray5 = org.apache.commons.io.IOUtils.toByteArray(inputStream1);
        java.util.function.Consumer<java.io.IOException> iOExceptionConsumer6 = null;
        org.apache.commons.io.IOUtils.closeQuietly((java.io.Closeable) inputStream1, iOExceptionConsumer6);
        org.apache.commons.io.IOUtils.close((java.io.Closeable) inputStream1);
        java.io.BufferedInputStream bufferedInputStream10 = org.apache.commons.io.IOUtils.buffer(inputStream1, (int) (byte) 10);
        org.apache.commons.io.function.IOConsumer<java.io.IOException> iOExceptionIOConsumer11 = null;
        org.apache.commons.io.IOUtils.close((java.io.Closeable) bufferedInputStream10, iOExceptionIOConsumer11);
        org.apache.commons.io.IOUtils.closeQuietly((java.io.Closeable) bufferedInputStream10);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray15 = org.apache.commons.io.IOUtils.toByteArray((java.io.InputStream) bufferedInputStream10, 100);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(bufferedInputStream10);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.BufferedInputStream bufferedInputStream1 = org.apache.commons.io.IOUtils.buffer(inputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: inputStream");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        byte[] byteArray1 = org.apache.commons.io.IOUtils.toByteArray("");
        java.io.Writer writer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write(byteArray1, writer2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Writer.write(String)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        java.io.Reader reader0 = null;
        java.io.Writer writer1 = null;
        java.io.Reader reader4 = null;
        java.io.Reader reader5 = null;
        java.io.Writer writer6 = null;
        char[] charArray9 = new char[] {};
        int int10 = org.apache.commons.io.IOUtils.length(charArray9);
        java.io.Writer writer11 = null;
        org.apache.commons.io.IOUtils.writeChunked(charArray9, writer11);
        java.io.Writer writer13 = null;
        org.apache.commons.io.IOUtils.writeChunked(charArray9, writer13);
        long long15 = org.apache.commons.io.IOUtils.copyLarge(reader5, writer6, 0L, (long) (byte) 100, charArray9);
        int int16 = org.apache.commons.io.IOUtils.read(reader4, charArray9);
        // The following exception was thrown during execution in test generation
        try {
            long long17 = org.apache.commons.io.IOUtils.copyLarge(reader0, writer1, (long) 'a', (long) 1, charArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"input\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray2 = new byte[] {};
        int int3 = org.apache.commons.io.IOUtils.length(byteArray2);
        int int4 = org.apache.commons.io.IOUtils.read(inputStream1, byteArray2);
        java.nio.charset.Charset charset5 = null;
        org.apache.commons.io.LineIterator lineIterator6 = org.apache.commons.io.IOUtils.lineIterator(inputStream1, charset5);
        java.io.InputStream inputStream8 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray9 = new byte[] {};
        int int10 = org.apache.commons.io.IOUtils.length(byteArray9);
        int int11 = org.apache.commons.io.IOUtils.read(inputStream8, byteArray9);
        byte[] byteArray12 = org.apache.commons.io.IOUtils.toByteArray(inputStream8);
        boolean boolean13 = org.apache.commons.io.IOUtils.contentEquals(inputStream1, inputStream8);
        org.apache.commons.io.IOUtils.close((java.io.Closeable) inputStream1);
        java.io.InputStream inputStream16 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream17 = null;
        java.io.InputStream inputStream19 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream20 = null;
        java.io.InputStream inputStream23 = null;
        byte[] byteArray25 = org.apache.commons.io.IOUtils.toByteArray("");
        int int26 = org.apache.commons.io.IOUtils.read(inputStream23, byteArray25);
        long long27 = org.apache.commons.io.IOUtils.copyLarge(inputStream19, outputStream20, 0L, 0L, byteArray25);
        long long28 = org.apache.commons.io.IOUtils.copyLarge(inputStream16, outputStream17, byteArray25);
        java.io.BufferedInputStream bufferedInputStream30 = org.apache.commons.io.IOUtils.buffer(inputStream16, (int) (byte) 10);
        java.io.InputStream inputStream32 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray33 = org.apache.commons.io.IOUtils.toByteArray(inputStream32);
        org.apache.commons.io.IOUtils.closeQuietly((java.io.Closeable) inputStream32);
        java.io.InputStream inputStream36 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream37 = null;
        java.io.InputStream inputStream40 = null;
        byte[] byteArray42 = org.apache.commons.io.IOUtils.toByteArray("");
        int int43 = org.apache.commons.io.IOUtils.read(inputStream40, byteArray42);
        long long44 = org.apache.commons.io.IOUtils.copyLarge(inputStream36, outputStream37, 0L, 0L, byteArray42);
        java.nio.charset.Charset charset45 = null;
        java.util.List<java.lang.String> strList46 = org.apache.commons.io.IOUtils.readLines(inputStream36, charset45);
        java.io.InputStream inputStream48 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream49 = null;
        java.io.InputStream inputStream52 = null;
        byte[] byteArray54 = org.apache.commons.io.IOUtils.toByteArray("");
        int int55 = org.apache.commons.io.IOUtils.read(inputStream52, byteArray54);
        long long56 = org.apache.commons.io.IOUtils.copyLarge(inputStream48, outputStream49, 0L, 0L, byteArray54);
        java.nio.charset.Charset charset57 = null;
        java.util.List<java.lang.String> strList58 = org.apache.commons.io.IOUtils.readLines(inputStream48, charset57);
        org.apache.commons.io.IOUtils.close((java.io.Closeable) inputStream48);
        boolean boolean60 = org.apache.commons.io.IOUtils.contentEquals(inputStream36, inputStream48);
        java.io.OutputStream outputStream61 = null;
        java.io.InputStream inputStream63 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream64 = null;
        java.io.InputStream inputStream67 = null;
        byte[] byteArray69 = org.apache.commons.io.IOUtils.toByteArray("");
        int int70 = org.apache.commons.io.IOUtils.read(inputStream67, byteArray69);
        long long71 = org.apache.commons.io.IOUtils.copyLarge(inputStream63, outputStream64, 0L, 0L, byteArray69);
        long long72 = org.apache.commons.io.IOUtils.copyLarge(inputStream48, outputStream61, byteArray69);
        org.apache.commons.io.IOUtils.readFully(inputStream32, byteArray69);
        org.apache.commons.io.IOUtils.readFully(inputStream16, byteArray69);
        java.lang.String str75 = org.apache.commons.io.IOUtils.toString(inputStream16);
        java.io.BufferedInputStream bufferedInputStream77 = org.apache.commons.io.IOUtils.buffer(inputStream16, 100);
        java.io.OutputStream outputStream78 = null;
        java.io.InputStream inputStream81 = null;
        byte[] byteArray83 = org.apache.commons.io.IOUtils.toByteArray("");
        int int84 = org.apache.commons.io.IOUtils.read(inputStream81, byteArray83);
        java.lang.String str85 = org.apache.commons.io.IOUtils.toString(byteArray83);
        long long86 = org.apache.commons.io.IOUtils.copyLarge(inputStream16, outputStream78, (-1L), (long) (short) -1, byteArray83);
        // The following exception was thrown during execution in test generation
        try {
            int int89 = org.apache.commons.io.IOUtils.read(inputStream1, byteArray83, 0, (int) '/');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [0, 0 + 47) out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(lineIterator6);
        org.junit.Assert.assertNotNull(inputStream8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(inputStream16);
        org.junit.Assert.assertNotNull(inputStream19);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(bufferedInputStream30);
        org.junit.Assert.assertNotNull(inputStream32);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[]");
        org.junit.Assert.assertNotNull(inputStream36);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertNotNull(strList46);
        org.junit.Assert.assertNotNull(inputStream48);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray54), "[]");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertNotNull(strList58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(inputStream63);
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray69), "[]");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 0L + "'", long71 == 0L);
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 0L + "'", long72 == 0L);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertNotNull(bufferedInputStream77);
        org.junit.Assert.assertNotNull(byteArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray83), "[]");
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertTrue("'" + long86 + "' != '" + 0L + "'", long86 == 0L);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        java.io.Reader reader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.BufferedReader bufferedReader2 = org.apache.commons.io.IOUtils.toBufferedReader(reader0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write("\r\n", outputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(byte[])\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        java.nio.channels.ReadableByteChannel readableByteChannel0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.io.IOUtils.skip(readableByteChannel0, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.ReadableByteChannel.read(java.nio.ByteBuffer)\" because \"input\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        java.io.InputStream inputStream0 = null;
        java.io.OutputStream outputStream1 = null;
        byte[] byteArray4 = new byte[] {};
        int int5 = org.apache.commons.io.IOUtils.length(byteArray4);
        java.io.OutputStream outputStream6 = null;
        org.apache.commons.io.IOUtils.writeChunked(byteArray4, outputStream6);
        long long8 = org.apache.commons.io.IOUtils.copyLarge(inputStream0, outputStream1, 0L, (long) (byte) -1, byteArray4);
        java.io.OutputStream outputStream9 = null;
        org.apache.commons.io.IOUtils.writeChunked(byteArray4, outputStream9);
        int int11 = org.apache.commons.io.IOUtils.length(byteArray4);
        java.io.OutputStream outputStream12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write(byteArray4, outputStream12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(byte[])\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        java.io.Reader reader0 = null;
        java.io.Writer writer1 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long4 = org.apache.commons.io.IOUtils.copyLarge(reader0, writer1, (long) '\\', (long) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"input\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write("", outputStream1, "\n");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ?");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        java.io.Reader reader0 = null;
        java.io.Writer writer1 = null;
        java.io.InputStream inputStream5 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray6 = new byte[] {};
        int int7 = org.apache.commons.io.IOUtils.length(byteArray6);
        int int8 = org.apache.commons.io.IOUtils.read(inputStream5, byteArray6);
        org.apache.commons.io.IOUtils.closeQuietly(inputStream5);
        java.io.InputStream inputStream11 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray12 = new byte[] {};
        int int13 = org.apache.commons.io.IOUtils.length(byteArray12);
        int int14 = org.apache.commons.io.IOUtils.read(inputStream11, byteArray12);
        java.lang.String str15 = org.apache.commons.io.IOUtils.toString(byteArray12);
        int int18 = org.apache.commons.io.IOUtils.read(inputStream5, byteArray12, (int) (byte) 10, (int) (short) 0);
        char[] charArray19 = org.apache.commons.io.IOUtils.toCharArray(inputStream5);
        // The following exception was thrown during execution in test generation
        try {
            long long20 = org.apache.commons.io.IOUtils.copyLarge(reader0, writer1, (long) (byte) 100, (long) (byte) -1, charArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"input\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(inputStream11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[]");
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray2 = new byte[] {};
        int int3 = org.apache.commons.io.IOUtils.length(byteArray2);
        int int4 = org.apache.commons.io.IOUtils.read(inputStream1, byteArray2);
        byte[] byteArray5 = org.apache.commons.io.IOUtils.toByteArray(inputStream1);
        byte[] byteArray7 = org.apache.commons.io.IOUtils.toByteArray(inputStream1, (int) (short) 0);
        long long9 = org.apache.commons.io.IOUtils.skip(inputStream1, 100L);
        java.io.InputStream inputStream11 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray12 = new byte[] {};
        int int13 = org.apache.commons.io.IOUtils.length(byteArray12);
        int int14 = org.apache.commons.io.IOUtils.read(inputStream11, byteArray12);
        byte[] byteArray15 = org.apache.commons.io.IOUtils.toByteArray(inputStream11);
        byte[] byteArray17 = org.apache.commons.io.IOUtils.toByteArray(inputStream11, (int) (short) 0);
        org.apache.commons.io.IOUtils.readFully(inputStream1, byteArray17);
        org.apache.commons.io.IOUtils.close((java.io.Closeable) inputStream1);
        java.io.InputStream inputStream21 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream22 = null;
        java.io.InputStream inputStream24 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream25 = null;
        java.io.InputStream inputStream28 = null;
        byte[] byteArray30 = org.apache.commons.io.IOUtils.toByteArray("");
        int int31 = org.apache.commons.io.IOUtils.read(inputStream28, byteArray30);
        long long32 = org.apache.commons.io.IOUtils.copyLarge(inputStream24, outputStream25, 0L, 0L, byteArray30);
        long long33 = org.apache.commons.io.IOUtils.copyLarge(inputStream21, outputStream22, byteArray30);
        java.io.BufferedInputStream bufferedInputStream35 = org.apache.commons.io.IOUtils.buffer(inputStream21, (int) (byte) 10);
        byte[] byteArray36 = org.apache.commons.io.IOUtils.toByteArray((java.io.InputStream) bufferedInputStream35);
        java.io.InputStream inputStream37 = null;
        java.io.OutputStream outputStream38 = null;
        byte[] byteArray41 = new byte[] {};
        int int42 = org.apache.commons.io.IOUtils.length(byteArray41);
        java.io.OutputStream outputStream43 = null;
        org.apache.commons.io.IOUtils.writeChunked(byteArray41, outputStream43);
        long long45 = org.apache.commons.io.IOUtils.copyLarge(inputStream37, outputStream38, 0L, (long) (byte) -1, byteArray41);
        java.io.OutputStream outputStream46 = null;
        org.apache.commons.io.IOUtils.writeChunked(byteArray41, outputStream46);
        int int48 = org.apache.commons.io.IOUtils.length(byteArray41);
        org.apache.commons.io.IOUtils.readFully((java.io.InputStream) bufferedInputStream35, byteArray41);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.readFully(inputStream1, byteArray41, 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Length must not be negative: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(inputStream11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[]");
        org.junit.Assert.assertNotNull(inputStream21);
        org.junit.Assert.assertNotNull(inputStream24);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNotNull(bufferedInputStream35);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[]");
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        java.io.Reader reader0 = null;
        java.io.Reader reader1 = null;
        java.io.Writer writer2 = null;
        char[] charArray5 = new char[] {};
        int int6 = org.apache.commons.io.IOUtils.length(charArray5);
        java.io.Writer writer7 = null;
        org.apache.commons.io.IOUtils.writeChunked(charArray5, writer7);
        java.io.Writer writer9 = null;
        org.apache.commons.io.IOUtils.writeChunked(charArray5, writer9);
        long long11 = org.apache.commons.io.IOUtils.copyLarge(reader1, writer2, 0L, (long) (byte) 100, charArray5);
        java.io.Writer writer12 = null;
        org.apache.commons.io.IOUtils.writeChunked(charArray5, writer12);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.readFully(reader0, charArray5, 100, (int) '\\');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"input\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray2 = new byte[] {};
        int int3 = org.apache.commons.io.IOUtils.length(byteArray2);
        int int4 = org.apache.commons.io.IOUtils.read(inputStream1, byteArray2);
        java.nio.charset.Charset charset5 = null;
        org.apache.commons.io.LineIterator lineIterator6 = org.apache.commons.io.IOUtils.lineIterator(inputStream1, charset5);
        java.io.InputStream inputStream8 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray9 = new byte[] {};
        int int10 = org.apache.commons.io.IOUtils.length(byteArray9);
        int int11 = org.apache.commons.io.IOUtils.read(inputStream8, byteArray9);
        byte[] byteArray12 = org.apache.commons.io.IOUtils.toByteArray(inputStream8);
        boolean boolean13 = org.apache.commons.io.IOUtils.contentEquals(inputStream1, inputStream8);
        java.io.Writer writer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.copy(inputStream1, writer14, "");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(lineIterator6);
        org.junit.Assert.assertNotNull(inputStream8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write((java.lang.CharSequence) "hi!", outputStream1, "\n");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ?");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        char[] charArray0 = new char[] {};
        int int1 = org.apache.commons.io.IOUtils.length(charArray0);
        java.io.Writer writer2 = null;
        org.apache.commons.io.IOUtils.writeChunked(charArray0, writer2);
        int int4 = org.apache.commons.io.IOUtils.length(charArray0);
        java.io.OutputStream outputStream5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write(charArray0, outputStream5, "\r\n");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ??");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write("hi!", outputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(byte[])\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        java.nio.channels.ReadableByteChannel readableByteChannel0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.io.IOUtils.skip(readableByteChannel0, (long) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.ReadableByteChannel.read(java.nio.ByteBuffer)\" because \"input\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        java.io.Reader reader0 = null;
        java.io.Writer writer1 = null;
        char[] charArray2 = new char[] {};
        java.io.Writer writer3 = null;
        org.apache.commons.io.IOUtils.writeChunked(charArray2, writer3);
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.io.IOUtils.copyLarge(reader0, writer1, charArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[])\" because \"input\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        java.lang.CharSequence charSequence0 = null;
        java.nio.charset.Charset charset1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream2 = org.apache.commons.io.IOUtils.toInputStream(charSequence0, charset1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.toString()\" because \"input\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "\n");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray3 = org.apache.commons.io.IOUtils.toByteArray(inputStream1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Size must be equal or greater than zero: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream2 = null;
        java.io.InputStream inputStream5 = null;
        byte[] byteArray7 = org.apache.commons.io.IOUtils.toByteArray("");
        int int8 = org.apache.commons.io.IOUtils.read(inputStream5, byteArray7);
        long long9 = org.apache.commons.io.IOUtils.copyLarge(inputStream1, outputStream2, 0L, 0L, byteArray7);
        java.io.OutputStream outputStream10 = null;
        long long13 = org.apache.commons.io.IOUtils.copyLarge(inputStream1, outputStream10, (long) (short) 0, (-1L));
        java.lang.String str14 = org.apache.commons.io.IOUtils.toString(inputStream1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.io.IOUtils.toString(inputStream1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream2 = null;
        java.io.InputStream inputStream5 = null;
        byte[] byteArray7 = org.apache.commons.io.IOUtils.toByteArray("");
        int int8 = org.apache.commons.io.IOUtils.read(inputStream5, byteArray7);
        long long9 = org.apache.commons.io.IOUtils.copyLarge(inputStream1, outputStream2, 0L, 0L, byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.io.IOUtils.toString(inputStream1, "");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        java.io.Reader reader0 = null;
        java.io.Writer writer1 = null;
        char[] charArray4 = new char[] {};
        int int5 = org.apache.commons.io.IOUtils.length(charArray4);
        java.io.Writer writer6 = null;
        org.apache.commons.io.IOUtils.writeChunked(charArray4, writer6);
        int int8 = org.apache.commons.io.IOUtils.length(charArray4);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = org.apache.commons.io.IOUtils.copyLarge(reader0, writer1, (long) 4, (long) (byte) -1, charArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"input\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray2 = org.apache.commons.io.IOUtils.toByteArray(inputStream1);
        java.util.List<java.lang.String> strList3 = org.apache.commons.io.IOUtils.readLines(inputStream1);
        java.lang.Class<?> wildcardClass4 = strList3.getClass();
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        java.io.Reader reader0 = null;
        java.io.Writer writer1 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long4 = org.apache.commons.io.IOUtils.copyLarge(reader0, writer1, (long) 5, (long) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"input\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        byte[] byteArray1 = org.apache.commons.io.IOUtils.toByteArray("");
        java.io.OutputStream outputStream2 = null;
        org.apache.commons.io.IOUtils.writeChunked(byteArray1, outputStream2);
        java.io.Writer writer4 = null;
        java.nio.charset.Charset charset5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write(byteArray1, writer4, charset5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Writer.write(String)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        java.io.Reader reader0 = null;
        java.io.Writer writer1 = null;
        java.io.Reader reader2 = null;
        java.io.Reader reader3 = null;
        java.io.Writer writer4 = null;
        char[] charArray7 = new char[] {};
        int int8 = org.apache.commons.io.IOUtils.length(charArray7);
        java.io.Writer writer9 = null;
        org.apache.commons.io.IOUtils.writeChunked(charArray7, writer9);
        java.io.Writer writer11 = null;
        org.apache.commons.io.IOUtils.writeChunked(charArray7, writer11);
        long long13 = org.apache.commons.io.IOUtils.copyLarge(reader3, writer4, 0L, (long) (byte) 100, charArray7);
        int int14 = org.apache.commons.io.IOUtils.read(reader2, charArray7);
        // The following exception was thrown during execution in test generation
        try {
            long long15 = org.apache.commons.io.IOUtils.copyLarge(reader0, writer1, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[])\" because \"input\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        java.io.Reader reader0 = null;
        char[] charArray5 = new char[] { '4', 'a', '#', 'a' };
        int int6 = org.apache.commons.io.IOUtils.length(charArray5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.readFully(reader0, charArray5, (int) '\\', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"input\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "4a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "4a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[4, a, #, a]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        java.io.Reader reader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.BufferedReader bufferedReader2 = org.apache.commons.io.IOUtils.buffer(reader0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream2 = null;
        java.io.InputStream inputStream5 = null;
        byte[] byteArray7 = org.apache.commons.io.IOUtils.toByteArray("");
        int int8 = org.apache.commons.io.IOUtils.read(inputStream5, byteArray7);
        long long9 = org.apache.commons.io.IOUtils.copyLarge(inputStream1, outputStream2, 0L, 0L, byteArray7);
        java.io.OutputStream outputStream10 = null;
        long long13 = org.apache.commons.io.IOUtils.copyLarge(inputStream1, outputStream10, (long) (short) 0, (-1L));
        java.lang.String str14 = org.apache.commons.io.IOUtils.toString(inputStream1);
        java.io.BufferedInputStream bufferedInputStream16 = org.apache.commons.io.IOUtils.buffer(inputStream1, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray18 = org.apache.commons.io.IOUtils.toCharArray((java.io.InputStream) bufferedInputStream16, "");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(bufferedInputStream16);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        byte[] byteArray1 = org.apache.commons.io.IOUtils.toByteArray("hi!");
        java.io.Writer writer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write(byteArray1, writer2, "");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[104, 105, 33]");
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write("", outputStream1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray2 = new byte[] {};
        int int3 = org.apache.commons.io.IOUtils.length(byteArray2);
        int int4 = org.apache.commons.io.IOUtils.read(inputStream1, byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.io.IOUtils.toString(byteArray2, "\r\n");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ??");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray2 = org.apache.commons.io.IOUtils.toByteArray(inputStream1);
        org.apache.commons.io.IOUtils.closeQuietly((java.io.Closeable) inputStream1);
        java.util.List<java.lang.String> strList4 = org.apache.commons.io.IOUtils.readLines(inputStream1);
        java.io.OutputStream outputStream5 = null;
        long long6 = org.apache.commons.io.IOUtils.copyLarge(inputStream1, outputStream5);
        java.io.OutputStream outputStream7 = null;
        java.io.InputStream inputStream11 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray12 = new byte[] {};
        int int13 = org.apache.commons.io.IOUtils.length(byteArray12);
        int int14 = org.apache.commons.io.IOUtils.read(inputStream11, byteArray12);
        byte[] byteArray15 = org.apache.commons.io.IOUtils.toByteArray(inputStream11);
        java.util.function.Consumer<java.io.IOException> iOExceptionConsumer16 = null;
        org.apache.commons.io.IOUtils.closeQuietly((java.io.Closeable) inputStream11, iOExceptionConsumer16);
        org.apache.commons.io.IOUtils.close((java.io.Closeable) inputStream11);
        java.io.BufferedInputStream bufferedInputStream20 = org.apache.commons.io.IOUtils.buffer(inputStream11, (int) (byte) 10);
        java.io.InputStream inputStream22 = org.apache.commons.io.IOUtils.toBufferedInputStream(inputStream11, (int) (byte) 1);
        java.util.function.Consumer<java.io.IOException> iOExceptionConsumer23 = null;
        org.apache.commons.io.IOUtils.closeQuietly((java.io.Closeable) inputStream11, iOExceptionConsumer23);
        java.io.OutputStream outputStream25 = null;
        java.io.InputStream inputStream27 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray28 = new byte[] {};
        int int29 = org.apache.commons.io.IOUtils.length(byteArray28);
        int int30 = org.apache.commons.io.IOUtils.read(inputStream27, byteArray28);
        byte[] byteArray31 = org.apache.commons.io.IOUtils.toByteArray(inputStream27);
        java.io.InputStream inputStream33 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray34 = new byte[] {};
        int int35 = org.apache.commons.io.IOUtils.length(byteArray34);
        int int36 = org.apache.commons.io.IOUtils.read(inputStream33, byteArray34);
        byte[] byteArray37 = org.apache.commons.io.IOUtils.toByteArray(inputStream33);
        int int38 = org.apache.commons.io.IOUtils.length(byteArray37);
        org.apache.commons.io.IOUtils.readFully(inputStream27, byteArray37);
        long long40 = org.apache.commons.io.IOUtils.copyLarge(inputStream11, outputStream25, byteArray37);
        long long41 = org.apache.commons.io.IOUtils.copyLarge(inputStream1, outputStream7, (long) (short) 0, 1L, byteArray37);
        java.io.Writer writer42 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write(byteArray37, writer42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Writer.write(String)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(inputStream11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
        org.junit.Assert.assertNotNull(bufferedInputStream20);
        org.junit.Assert.assertNotNull(inputStream22);
        org.junit.Assert.assertNotNull(inputStream27);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[]");
        org.junit.Assert.assertNotNull(inputStream33);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        byte[] byteArray0 = null;
        java.io.Writer writer1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write(byteArray0, writer1, "");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream2 = null;
        java.io.InputStream inputStream5 = null;
        byte[] byteArray7 = org.apache.commons.io.IOUtils.toByteArray("");
        int int8 = org.apache.commons.io.IOUtils.read(inputStream5, byteArray7);
        long long9 = org.apache.commons.io.IOUtils.copyLarge(inputStream1, outputStream2, 0L, 0L, byteArray7);
        java.nio.charset.Charset charset10 = null;
        java.util.List<java.lang.String> strList11 = org.apache.commons.io.IOUtils.readLines(inputStream1, charset10);
        java.io.InputStream inputStream13 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream14 = null;
        java.io.InputStream inputStream17 = null;
        byte[] byteArray19 = org.apache.commons.io.IOUtils.toByteArray("");
        int int20 = org.apache.commons.io.IOUtils.read(inputStream17, byteArray19);
        long long21 = org.apache.commons.io.IOUtils.copyLarge(inputStream13, outputStream14, 0L, 0L, byteArray19);
        java.nio.charset.Charset charset22 = null;
        java.util.List<java.lang.String> strList23 = org.apache.commons.io.IOUtils.readLines(inputStream13, charset22);
        org.apache.commons.io.IOUtils.close((java.io.Closeable) inputStream13);
        boolean boolean25 = org.apache.commons.io.IOUtils.contentEquals(inputStream1, inputStream13);
        java.io.OutputStream outputStream26 = null;
        java.io.InputStream inputStream28 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream29 = null;
        java.io.InputStream inputStream32 = null;
        byte[] byteArray34 = org.apache.commons.io.IOUtils.toByteArray("");
        int int35 = org.apache.commons.io.IOUtils.read(inputStream32, byteArray34);
        long long36 = org.apache.commons.io.IOUtils.copyLarge(inputStream28, outputStream29, 0L, 0L, byteArray34);
        long long37 = org.apache.commons.io.IOUtils.copyLarge(inputStream13, outputStream26, byteArray34);
        org.apache.commons.io.IOUtils.close((java.io.Closeable) outputStream26);
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(inputStream13);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(inputStream28);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray2 = new byte[] {};
        int int3 = org.apache.commons.io.IOUtils.length(byteArray2);
        int int4 = org.apache.commons.io.IOUtils.read(inputStream1, byteArray2);
        byte[] byteArray5 = org.apache.commons.io.IOUtils.toByteArray(inputStream1);
        java.util.function.Consumer<java.io.IOException> iOExceptionConsumer6 = null;
        org.apache.commons.io.IOUtils.closeQuietly((java.io.Closeable) inputStream1, iOExceptionConsumer6);
        long long9 = org.apache.commons.io.IOUtils.skip(inputStream1, (long) (byte) 100);
        java.lang.String str10 = org.apache.commons.io.IOUtils.toString(inputStream1);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray12 = org.apache.commons.io.IOUtils.toByteArray(inputStream1, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Size must be equal or greater than zero: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream2 = org.apache.commons.io.IOUtils.toInputStream("\n", "hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        java.io.Reader reader0 = null;
        char[] charArray1 = new char[] {};
        int int2 = org.apache.commons.io.IOUtils.length(charArray1);
        java.io.Writer writer3 = null;
        org.apache.commons.io.IOUtils.writeChunked(charArray1, writer3);
        org.apache.commons.io.IOUtils.readFully(reader0, charArray1);
        java.io.OutputStream outputStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write(charArray1, outputStream6, "");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        java.io.Reader reader0 = null;
        char[] charArray5 = new char[] { '/', '\\', '#', '\\' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.readFully(reader0, charArray5, 100, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"input\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "/\\#\\");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "/\\#\\");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[/, \\, #, \\]");
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray2 = new byte[] {};
        int int3 = org.apache.commons.io.IOUtils.length(byteArray2);
        int int4 = org.apache.commons.io.IOUtils.read(inputStream1, byteArray2);
        byte[] byteArray5 = org.apache.commons.io.IOUtils.toByteArray(inputStream1);
        java.util.function.Consumer<java.io.IOException> iOExceptionConsumer6 = null;
        org.apache.commons.io.IOUtils.closeQuietly((java.io.Closeable) inputStream1, iOExceptionConsumer6);
        org.apache.commons.io.IOUtils.close((java.io.Closeable) inputStream1);
        java.io.OutputStream outputStream9 = null;
        long long10 = org.apache.commons.io.IOUtils.copyLarge(inputStream1, outputStream9);
        java.io.Writer writer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.copy(inputStream1, writer11, "\n");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ?");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        java.io.Reader reader0 = null;
        java.io.Reader reader1 = null;
        java.io.Writer writer2 = null;
        char[] charArray5 = new char[] {};
        int int6 = org.apache.commons.io.IOUtils.length(charArray5);
        java.io.Writer writer7 = null;
        org.apache.commons.io.IOUtils.writeChunked(charArray5, writer7);
        java.io.Writer writer9 = null;
        org.apache.commons.io.IOUtils.writeChunked(charArray5, writer9);
        long long11 = org.apache.commons.io.IOUtils.copyLarge(reader1, writer2, 0L, (long) (byte) 100, charArray5);
        int int12 = org.apache.commons.io.IOUtils.read(reader0, charArray5);
        java.io.Writer writer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write(charArray5, writer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Writer.write(char[])\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray2 = org.apache.commons.io.IOUtils.toByteArray(inputStream1);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write(byteArray2, writer3, "");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        java.nio.channels.ReadableByteChannel readableByteChannel0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.io.IOUtils.skip(readableByteChannel0, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Skip count must be non-negative, actual: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        char[] charArray0 = new char[] {};
        int int1 = org.apache.commons.io.IOUtils.length(charArray0);
        java.io.Writer writer2 = null;
        org.apache.commons.io.IOUtils.writeChunked(charArray0, writer2);
        java.io.Writer writer4 = null;
        org.apache.commons.io.IOUtils.writeChunked(charArray0, writer4);
        java.io.OutputStream outputStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write(charArray0, outputStream6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(byte[])\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        java.io.Reader reader0 = null;
        java.io.Writer writer1 = null;
        java.io.Reader reader4 = null;
        java.io.Writer writer5 = null;
        char[] charArray8 = new char[] {};
        int int9 = org.apache.commons.io.IOUtils.length(charArray8);
        java.io.Writer writer10 = null;
        org.apache.commons.io.IOUtils.writeChunked(charArray8, writer10);
        java.io.Writer writer12 = null;
        org.apache.commons.io.IOUtils.writeChunked(charArray8, writer12);
        long long14 = org.apache.commons.io.IOUtils.copyLarge(reader4, writer5, 0L, (long) (byte) 100, charArray8);
        // The following exception was thrown during execution in test generation
        try {
            long long15 = org.apache.commons.io.IOUtils.copyLarge(reader0, writer1, (long) '\\', (long) (short) 100, charArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"input\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray2 = new byte[] {};
        int int3 = org.apache.commons.io.IOUtils.length(byteArray2);
        int int4 = org.apache.commons.io.IOUtils.read(inputStream1, byteArray2);
        byte[] byteArray5 = org.apache.commons.io.IOUtils.toByteArray(inputStream1);
        byte[] byteArray7 = org.apache.commons.io.IOUtils.toByteArray(inputStream1, (int) (short) 0);
        long long9 = org.apache.commons.io.IOUtils.skip(inputStream1, 100L);
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.OutputStream outputStream12 = null;
        byte[] byteArray15 = new byte[] {};
        int int16 = org.apache.commons.io.IOUtils.length(byteArray15);
        java.io.OutputStream outputStream17 = null;
        org.apache.commons.io.IOUtils.writeChunked(byteArray15, outputStream17);
        long long19 = org.apache.commons.io.IOUtils.copyLarge(inputStream11, outputStream12, 0L, (long) (byte) -1, byteArray15);
        java.io.OutputStream outputStream20 = null;
        org.apache.commons.io.IOUtils.writeChunked(byteArray15, outputStream20);
        org.apache.commons.io.IOUtils.readFully(inputStream10, byteArray15);
        int int23 = org.apache.commons.io.IOUtils.read(inputStream1, byteArray15);
        java.io.InputStream inputStream24 = org.apache.commons.io.IOUtils.toBufferedInputStream(inputStream1);
        org.apache.commons.io.function.IOConsumer<java.io.IOException> iOExceptionIOConsumer25 = null;
        org.apache.commons.io.IOUtils.close((java.io.Closeable) inputStream1, iOExceptionIOConsumer25);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray28 = org.apache.commons.io.IOUtils.toByteArray(inputStream1, (long) '/');
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Unexpected read size. current: 0, expected: 47");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(inputStream24);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        java.io.OutputStream outputStream1 = null;
        java.nio.charset.Charset charset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write((java.lang.CharSequence) "", outputStream1, charset2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(byte[])\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream2 = null;
        java.io.InputStream inputStream5 = null;
        byte[] byteArray7 = org.apache.commons.io.IOUtils.toByteArray("");
        int int8 = org.apache.commons.io.IOUtils.read(inputStream5, byteArray7);
        long long9 = org.apache.commons.io.IOUtils.copyLarge(inputStream1, outputStream2, 0L, 0L, byteArray7);
        java.io.OutputStream outputStream10 = null;
        long long13 = org.apache.commons.io.IOUtils.copyLarge(inputStream1, outputStream10, (long) (short) 0, (-1L));
        java.io.OutputStream outputStream14 = null;
        long long15 = org.apache.commons.io.IOUtils.copyLarge(inputStream1, outputStream14);
        java.io.InputStream inputStream17 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray18 = org.apache.commons.io.IOUtils.toByteArray(inputStream17);
        java.io.InputStream inputStream20 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray21 = new byte[] {};
        int int22 = org.apache.commons.io.IOUtils.length(byteArray21);
        int int23 = org.apache.commons.io.IOUtils.read(inputStream20, byteArray21);
        byte[] byteArray24 = org.apache.commons.io.IOUtils.toByteArray(inputStream20);
        java.util.function.Consumer<java.io.IOException> iOExceptionConsumer25 = null;
        org.apache.commons.io.IOUtils.closeQuietly((java.io.Closeable) inputStream20, iOExceptionConsumer25);
        org.apache.commons.io.IOUtils.close((java.io.Closeable) inputStream20);
        java.io.BufferedInputStream bufferedInputStream29 = org.apache.commons.io.IOUtils.buffer(inputStream20, (int) (byte) 10);
        boolean boolean30 = org.apache.commons.io.IOUtils.contentEquals(inputStream17, inputStream20);
        java.io.InputStream inputStream32 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray33 = new byte[] {};
        int int34 = org.apache.commons.io.IOUtils.length(byteArray33);
        int int35 = org.apache.commons.io.IOUtils.read(inputStream32, byteArray33);
        byte[] byteArray36 = org.apache.commons.io.IOUtils.toByteArray(inputStream32);
        byte[] byteArray38 = org.apache.commons.io.IOUtils.toByteArray(inputStream32, (int) (short) 0);
        long long40 = org.apache.commons.io.IOUtils.skip(inputStream32, 100L);
        java.io.InputStream inputStream41 = null;
        java.io.InputStream inputStream42 = null;
        java.io.OutputStream outputStream43 = null;
        byte[] byteArray46 = new byte[] {};
        int int47 = org.apache.commons.io.IOUtils.length(byteArray46);
        java.io.OutputStream outputStream48 = null;
        org.apache.commons.io.IOUtils.writeChunked(byteArray46, outputStream48);
        long long50 = org.apache.commons.io.IOUtils.copyLarge(inputStream42, outputStream43, 0L, (long) (byte) -1, byteArray46);
        java.io.OutputStream outputStream51 = null;
        org.apache.commons.io.IOUtils.writeChunked(byteArray46, outputStream51);
        org.apache.commons.io.IOUtils.readFully(inputStream41, byteArray46);
        int int54 = org.apache.commons.io.IOUtils.read(inputStream32, byteArray46);
        int int55 = org.apache.commons.io.IOUtils.read(inputStream20, byteArray46);
        java.io.OutputStream outputStream56 = null;
        org.apache.commons.io.IOUtils.writeChunked(byteArray46, outputStream56);
        org.apache.commons.io.IOUtils.readFully(inputStream1, byteArray46);
        java.io.Writer writer59 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write(byteArray46, writer59, "");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(inputStream17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
        org.junit.Assert.assertNotNull(inputStream20);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[]");
        org.junit.Assert.assertNotNull(bufferedInputStream29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(inputStream32);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[]");
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[]");
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[]");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        java.nio.channels.ReadableByteChannel readableByteChannel0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.io.IOUtils.skip(readableByteChannel0, (long) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.ReadableByteChannel.read(java.nio.ByteBuffer)\" because \"input\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "hi!");
        java.io.InputStream inputStream3 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray4 = new byte[] {};
        int int5 = org.apache.commons.io.IOUtils.length(byteArray4);
        int int6 = org.apache.commons.io.IOUtils.read(inputStream3, byteArray4);
        byte[] byteArray7 = org.apache.commons.io.IOUtils.toByteArray(inputStream3);
        byte[] byteArray9 = org.apache.commons.io.IOUtils.toByteArray(inputStream3, (int) (short) 0);
        java.io.BufferedInputStream bufferedInputStream10 = org.apache.commons.io.IOUtils.buffer(inputStream3);
        byte[] byteArray11 = org.apache.commons.io.IOUtils.toByteArray((java.io.InputStream) bufferedInputStream10);
        int int14 = org.apache.commons.io.IOUtils.read(inputStream1, byteArray11, 0, 0);
        java.io.OutputStream outputStream15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write(byteArray11, outputStream15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(byte[])\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(inputStream3);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(bufferedInputStream10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        java.io.Writer writer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.BufferedWriter bufferedWriter2 = org.apache.commons.io.IOUtils.buffer(writer0, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        java.io.Reader reader0 = null;
        java.io.Writer writer1 = null;
        char[] charArray2 = new char[] {};
        int int3 = org.apache.commons.io.IOUtils.length(charArray2);
        java.io.Writer writer4 = null;
        org.apache.commons.io.IOUtils.writeChunked(charArray2, writer4);
        // The following exception was thrown during execution in test generation
        try {
            long long6 = org.apache.commons.io.IOUtils.copyLarge(reader0, writer1, charArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[])\" because \"input\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray2 = new byte[] {};
        int int3 = org.apache.commons.io.IOUtils.length(byteArray2);
        int int4 = org.apache.commons.io.IOUtils.read(inputStream1, byteArray2);
        byte[] byteArray5 = org.apache.commons.io.IOUtils.toByteArray(inputStream1);
        int int6 = org.apache.commons.io.IOUtils.length(byteArray5);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write(byteArray5, writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Writer.write(String)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        char[] charArray1 = new char[] { 'a' };
        java.io.OutputStream outputStream2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write(charArray1, outputStream2, "");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[a]");
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        java.io.Reader reader0 = null;
        java.io.Writer writer1 = null;
        java.io.InputStream inputStream5 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream6 = null;
        java.io.InputStream inputStream8 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        java.io.OutputStream outputStream9 = null;
        java.io.InputStream inputStream12 = null;
        byte[] byteArray14 = org.apache.commons.io.IOUtils.toByteArray("");
        int int15 = org.apache.commons.io.IOUtils.read(inputStream12, byteArray14);
        long long16 = org.apache.commons.io.IOUtils.copyLarge(inputStream8, outputStream9, 0L, 0L, byteArray14);
        long long17 = org.apache.commons.io.IOUtils.copyLarge(inputStream5, outputStream6, byteArray14);
        java.io.BufferedInputStream bufferedInputStream19 = org.apache.commons.io.IOUtils.buffer(inputStream5, (int) (byte) 10);
        java.nio.charset.Charset charset20 = null;
        java.util.List<java.lang.String> strList21 = org.apache.commons.io.IOUtils.readLines(inputStream5, charset20);
        java.io.OutputStream outputStream22 = null;
        long long25 = org.apache.commons.io.IOUtils.copyLarge(inputStream5, outputStream22, 0L, (long) 0);
        java.nio.charset.Charset charset26 = null;
        char[] charArray27 = org.apache.commons.io.IOUtils.toCharArray(inputStream5, charset26);
        // The following exception was thrown during execution in test generation
        try {
            long long28 = org.apache.commons.io.IOUtils.copyLarge(reader0, writer1, (long) (byte) 10, (long) 1, charArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"input\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream5);
        org.junit.Assert.assertNotNull(inputStream8);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(bufferedInputStream19);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray27), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray27), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray27), "[]");
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        java.nio.charset.Charset charset1 = null;
        java.io.InputStream inputStream2 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "", charset1);
        java.util.List<java.lang.String> strList3 = org.apache.commons.io.IOUtils.readLines(inputStream2);
        java.io.OutputStream outputStream4 = null;
        java.io.InputStream inputStream8 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray9 = new byte[] {};
        int int10 = org.apache.commons.io.IOUtils.length(byteArray9);
        int int11 = org.apache.commons.io.IOUtils.read(inputStream8, byteArray9);
        byte[] byteArray12 = org.apache.commons.io.IOUtils.toByteArray(inputStream8);
        byte[] byteArray14 = org.apache.commons.io.IOUtils.toByteArray(inputStream8, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long15 = org.apache.commons.io.IOUtils.copyLarge(inputStream2, outputStream4, (long) '\\', (long) 'a', byteArray14);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: Bytes to skip: 92 actual: 0");
        } catch (java.io.EOFException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(inputStream8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        java.io.InputStream inputStream1 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray2 = new byte[] {};
        int int3 = org.apache.commons.io.IOUtils.length(byteArray2);
        int int4 = org.apache.commons.io.IOUtils.read(inputStream1, byteArray2);
        org.apache.commons.io.IOUtils.closeQuietly(inputStream1);
        java.io.InputStream inputStream7 = org.apache.commons.io.IOUtils.toInputStream((java.lang.CharSequence) "");
        byte[] byteArray8 = new byte[] {};
        int int9 = org.apache.commons.io.IOUtils.length(byteArray8);
        int int10 = org.apache.commons.io.IOUtils.read(inputStream7, byteArray8);
        java.lang.String str11 = org.apache.commons.io.IOUtils.toString(byteArray8);
        int int14 = org.apache.commons.io.IOUtils.read(inputStream1, byteArray8, (int) (byte) 10, (int) (short) 0);
        char[] charArray15 = org.apache.commons.io.IOUtils.toCharArray(inputStream1);
        java.io.OutputStream outputStream16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write(charArray15, outputStream16, "\n");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ?");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[]");
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        byte[] byteArray1 = org.apache.commons.io.IOUtils.toByteArray("hi!");
        java.io.Writer writer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write(byteArray1, writer2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Writer.write(String)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[104, 105, 33]");
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        char[] charArray0 = null;
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.IOUtils.write(charArray0, outputStream1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
    }
}

