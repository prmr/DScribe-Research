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
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray2, (int) (byte) 1, (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 0]");
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        int int1 = org.apache.commons.io.EndianUtils.swapInteger(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(outputStream0, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray2, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double1 = org.apache.commons.io.EndianUtils.readSwappedDouble(inputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.InputStream.read()\" because \"input\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.commons.io.EndianUtils.readSwappedLong(inputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.InputStream.read()\" because \"input\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(outputStream0, (float) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray0, (int) 'a', (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot store to byte/boolean array because \"data\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray3, (int) '#', 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[1, 10, 1]");
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            short short1 = org.apache.commons.io.EndianUtils.readSwappedShort(inputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.InputStream.read()\" because \"input\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray2, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 1]");
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray4, (int) 'a', (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[100, 10, 0, 0]");
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        byte[] byteArray1 = new byte[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            long long3 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1]");
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray3, 0, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 0]");
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray0, (int) (short) 10, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot store to byte/boolean array because \"data\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(outputStream0, (float) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from byte/boolean array because \"data\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray2, 0, 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0]");
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        byte[] byteArray1 = new byte[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            long long3 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1]");
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray6, (int) (byte) 100, (short) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, 0, 10, 1, 10]");
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        int int1 = org.apache.commons.io.EndianUtils.swapInteger((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 16777216 + "'", int1 == 16777216);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            float float5 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray3, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-1, 10, 1]");
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray2, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, -1]");
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        float float1 = org.apache.commons.io.EndianUtils.swapFloat(10.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.157E-41f + "'", float1 == 1.157E-41f);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray2, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 100]");
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            float float1 = org.apache.commons.io.EndianUtils.readSwappedFloat(inputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.InputStream.read()\" because \"input\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.apache.commons.io.EndianUtils endianUtils0 = new org.apache.commons.io.EndianUtils();
        java.lang.Class<?> wildcardClass1 = endianUtils0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            double double8 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray6, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 1, 1, -1, -1, 100]");
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            long long7 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray5, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 1, 100, 100, 100]");
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray3, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, -1, 0]");
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray2, (int) (byte) -1, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 10]");
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(inputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.InputStream.read()\" because \"input\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 16777216, (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 16777216 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, 0, 0]");
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        byte[] byteArray0 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(outputStream0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, (int) (byte) 1, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, 0, 0, 0]");
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        long long1 = org.apache.commons.io.EndianUtils.swapLong(100L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 7205759403792793600L + "'", long1 == 7205759403792793600L);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        float float1 = org.apache.commons.io.EndianUtils.swapFloat((float) 10L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.157E-41f + "'", float1 == 1.157E-41f);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        byte[] byteArray1 = new byte[] { (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray1, (int) (short) 0, (short) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1]");
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray2, (int) (byte) 1, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0]");
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, (int) (short) 10, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 1, 100, 1, -1]");
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            short short10 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, 0, 0]");
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(outputStream0, (float) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(outputStream0, (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        float float1 = org.apache.commons.io.EndianUtils.swapFloat((float) 16777216);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.6023E-41f + "'", float1 == 4.6023E-41f);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray5, (int) '#', (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, 0, 0]");
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        byte[] byteArray0 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray0, 1, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long8 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray4, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 100, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(outputStream0, (short) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray4, (int) (short) 10, (long) 16777216);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(inputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.InputStream.read()\" because \"input\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble(100.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.12884E-319d + "'", double1 == 1.12884E-319d);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        long long1 = org.apache.commons.io.EndianUtils.swapLong((long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 7205759403792793600L + "'", long1 == 7205759403792793600L);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(outputStream0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray4, (int) (byte) 0, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.io.EndianUtils.readSwappedInteger(inputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.InputStream.read()\" because \"input\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        long long1 = org.apache.commons.io.EndianUtils.swapLong((long) (short) 100);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 7205759403792793600L + "'", long1 == 7205759403792793600L);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        java.lang.Class<?> wildcardClass11 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray3, (int) (byte) 10, (float) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, 0, 0]");
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, (float) 100L);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray4, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        short short1 = org.apache.commons.io.EndianUtils.swapShort((short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 256 + "'", short1 == (short) 256);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(outputStream0, 1.157E-41f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (byte) 1, 1);
        java.lang.Class<?> wildcardClass12 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 0, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 10, (byte) 1, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (byte) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 10, 1, -1, 10]");
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long12 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray5, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        float float1 = org.apache.commons.io.EndianUtils.swapFloat((float) (short) 100);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 7.1839E-41f + "'", float1 == 7.1839E-41f);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(outputStream0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        int int1 = org.apache.commons.io.EndianUtils.swapInteger((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1677721600 + "'", int1 == 1677721600);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray0, 0, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot store to byte/boolean array because \"data\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (byte) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 1677721600);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1677721600 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 0, 0, 0]");
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, (float) 100L);
        java.lang.Class<?> wildcardClass13 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (byte) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            short short13 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 0, 0, 0]");
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(outputStream0, (long) (short) 256);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(outputStream0, 4284743681L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (byte) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray5, (int) (byte) 0, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, -1, -1, -1, -1]");
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(outputStream0, (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, (int) 'a', (double) 1677721600);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(outputStream0, (float) (short) 256);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (byte) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (-1), (float) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 0, 0, 0]");
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray4, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 100, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        float float1 = org.apache.commons.io.EndianUtils.swapFloat((float) 100L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 7.1839E-41f + "'", float1 == 7.1839E-41f);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, (float) 100L);
        // The following exception was thrown during execution in test generation
        try {
            long long14 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        long long1 = org.apache.commons.io.EndianUtils.swapLong((long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(outputStream0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        short short1 = org.apache.commons.io.EndianUtils.swapShort((short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 25600 + "'", short1 == (short) 25600);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(outputStream0, (int) (short) 25600);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, (float) 100L);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray4, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        long long1 = org.apache.commons.io.EndianUtils.swapLong((long) (short) -1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, (double) 7205759403792793600L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) 100, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            short short8 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray6, 1677721600);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1677721600 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 0, 10, 100, 0, -1]");
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        float float1 = org.apache.commons.io.EndianUtils.swapFloat((float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.6006E-41f + "'", float1 == 4.6006E-41f);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray4, 1677721600, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1677721600 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 100, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray5, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        long long1 = org.apache.commons.io.EndianUtils.swapLong((long) (-1));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray3, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, 0, 10]");
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, (float) 100L);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray4, (int) '#', 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(outputStream0, 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray5, (int) (short) 25600, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 25600 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, 0, 0]");
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(outputStream0, (float) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        float float8 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray4, 16777216, (double) 1677721600);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 16777216 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 100, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-3.03064E38f) + "'", float8 == (-3.03064E38f));
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        float float1 = org.apache.commons.io.EndianUtils.swapFloat((float) ' ');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9.2E-44f + "'", float1 == 9.2E-44f);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (byte) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            float float13 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 1677721600);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1677721600 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 0, 0, 0]");
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, (float) 100L);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, (int) (short) -1, 1677721600);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        short short1 = org.apache.commons.io.EndianUtils.swapShort((short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) -1 + "'", short1 == (short) -1);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(outputStream0, (int) (short) 256);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        float float8 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, (int) (short) 0);
        java.lang.Class<?> wildcardClass9 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 100, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-3.03064E38f) + "'", float8 == (-3.03064E38f));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        java.lang.Class<?> wildcardClass7 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 100, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        long long1 = org.apache.commons.io.EndianUtils.swapLong((long) ' ');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2305843009213693952L + "'", long1 == 2305843009213693952L);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) -1, (byte) -1, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray5, 0, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 0, 0, 0]");
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        long long1 = org.apache.commons.io.EndianUtils.swapLong(0L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray4, (int) (short) -1, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(outputStream0, (int) (short) 13322);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(outputStream0, (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from byte/boolean array because \"data\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (byte) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            float float13 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 0, 0, 0]");
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        float float8 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, (int) (short) 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) '4');
        // The following exception was thrown during execution in test generation
        try {
            short short13 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 80, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-3.03064E38f) + "'", float8 == (-3.03064E38f));
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        float float8 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, (int) (short) 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray4, 100, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 80, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-3.03064E38f) + "'", float8 == (-3.03064E38f));
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray5, (-1), 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, 0, 0]");
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            float float12 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray0, (int) (byte) 100, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot store to byte/boolean array because \"data\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) 25600);
        java.lang.Class<?> wildcardClass13 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 100, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, (float) 100L);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray4, 10, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        float float1 = org.apache.commons.io.EndianUtils.swapFloat((float) '4');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.8791E-41f + "'", float1 == 2.8791E-41f);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(outputStream0, (short) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (byte) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray5, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 0, 0, 0]");
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        float float1 = org.apache.commons.io.EndianUtils.swapFloat((float) 'a');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 6.9687E-41f + "'", float1 == 6.9687E-41f);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        float float1 = org.apache.commons.io.EndianUtils.swapFloat((float) (-1));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.6185E-41f + "'", float1 == 4.6185E-41f);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        int int1 = org.apache.commons.io.EndianUtils.swapInteger((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int11 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray4, 16777216);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 16777216 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 0, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, (float) 100L);
        // The following exception was thrown during execution in test generation
        try {
            float float14 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, (int) (short) 13322);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13322 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        float float8 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long10 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray4, (int) (short) 256);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 256 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 100, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-3.03064E38f) + "'", float8 == (-3.03064E38f));
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, (float) 100L);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, (int) (short) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 52, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray5, (int) (short) 100, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        float float8 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, (int) (short) 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) '4');
        java.lang.Class<?> wildcardClass12 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 80, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-3.03064E38f) + "'", float8 == (-3.03064E38f));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, (float) 100L);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray4, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        float float8 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, (int) (short) 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) '4');
        // The following exception was thrown during execution in test generation
        try {
            double double13 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray4, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 80, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-3.03064E38f) + "'", float8 == (-3.03064E38f));
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, (double) 2.8791E-41f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        long long1 = org.apache.commons.io.EndianUtils.swapLong((long) 16777216);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 4294967296L + "'", long1 == 4294967296L);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (byte) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (-1), (float) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 0, 0, 0]");
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        float float1 = org.apache.commons.io.EndianUtils.swapFloat((float) 4294967296L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.6028E-41f + "'", float1 == 4.6028E-41f);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long12 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 1677721600);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1677721600 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 0, 0, 0]");
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        int int1 = org.apache.commons.io.EndianUtils.swapInteger((int) (short) 256);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 65536 + "'", int1 == 65536);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, (float) 100L);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray4, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        short short1 = org.apache.commons.io.EndianUtils.swapShort((short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 2560 + "'", short1 == (short) 2560);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble((double) 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.773533E-318d + "'", double1 == 1.773533E-318d);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, (int) ' ', (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, 0, 0]");
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(outputStream0, (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray4, (int) '4', 1.773533E-318d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        int int1 = org.apache.commons.io.EndianUtils.swapInteger((int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 536870912 + "'", int1 == 536870912);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) 25600);
        // The following exception was thrown during execution in test generation
        try {
            float float14 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 100, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        // The following exception was thrown during execution in test generation
        try {
            float float11 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, 536870912);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 536870912 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 0, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        float float8 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray4, 1677721600, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1677721600 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 100, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-3.03064E38f) + "'", float8 == (-3.03064E38f));
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        float float1 = org.apache.commons.io.EndianUtils.swapFloat((float) 65536);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.6017E-41f + "'", float1 == 4.6017E-41f);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        float float8 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long10 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray4, 65536);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 65536 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 100, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-3.03064E38f) + "'", float8 == (-3.03064E38f));
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        // The following exception was thrown during execution in test generation
        try {
            short short19 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, -56, 66]");
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, (int) (byte) 0, (double) 536870912);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 13322 + "'", short12 == (short) 13322);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int11 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray4, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 0, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        // The following exception was thrown during execution in test generation
        try {
            short short19 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 65536);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 65536 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, -56, 66]");
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(outputStream0, 4.6023E-41f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        java.lang.Class<?> wildcardClass12 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 100, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            short short8 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray6, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, -1, 100, 100, 0, -1]");
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray5, (int) (short) 0, (long) (short) 2560);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 10, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 13322 + "'", short12 == (short) 13322);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, (double) 65536);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray2, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 0]");
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, -56, 66]");
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) 25600);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray4, 10, (double) 4.6028E-41f);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 100, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            short short8 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 100, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, -56, 66]");
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        float float1 = org.apache.commons.io.EndianUtils.swapFloat((float) 65535);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.346371E-38f + "'", float1 == 2.346371E-38f);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        // The following exception was thrown during execution in test generation
        try {
            long long19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, -56, 66]");
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(outputStream0, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 65535);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 65535 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 13322 + "'", short12 == (short) 13322);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        java.lang.Class<?> wildcardClass18 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, -56, 66]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(outputStream0, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        int int11 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, (int) (short) 1);
        java.lang.Class<?> wildcardClass12 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 65535 + "'", int11 == 65535);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 100, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, (float) 100L);
        // The following exception was thrown during execution in test generation
        try {
            long long14 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (-1), (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 0, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) '4', (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray5, 1677721600);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1677721600 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble((double) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.585E-320d + "'", double1 == 4.585E-320d);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        long long1 = org.apache.commons.io.EndianUtils.swapLong((long) (short) 0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        float float1 = org.apache.commons.io.EndianUtils.swapFloat((float) 1L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.6006E-41f + "'", float1 == 4.6006E-41f);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        java.lang.Class<?> wildcardClass15 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 12, 66, 0]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(outputStream0, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(outputStream0, 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        long long1 = org.apache.commons.io.EndianUtils.swapLong(2305843009213693952L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 32L + "'", long1 == 32L);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        int int11 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 536870912, 1677721600);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 536870912 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 65535 + "'", int11 == 65535);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) '4', (float) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, -56, 66]");
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        short short1 = org.apache.commons.io.EndianUtils.swapShort((short) 25600);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 100 + "'", short1 == (short) 100);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        float float1 = org.apache.commons.io.EndianUtils.swapFloat(0.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        float float8 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, (int) (short) 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) '4');
        // The following exception was thrown during execution in test generation
        try {
            double double13 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray4, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 80, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-3.03064E38f) + "'", float8 == (-3.03064E38f));
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        // The following exception was thrown during execution in test generation
        try {
            short short11 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 0, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray4, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 100, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray5, (int) (short) 13322, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13322 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 0, 0, 0]");
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray4, 0, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, (double) 1.157E-41f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(outputStream0, (short) 256);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        // The following exception was thrown during execution in test generation
        try {
            long long11 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray4, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 0, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        short short1 = org.apache.commons.io.EndianUtils.swapShort((short) -1);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) -1 + "'", short1 == (short) -1);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        // The following exception was thrown during execution in test generation
        try {
            long long19 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray5, 16777216);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 16777216 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, -56, 66]");
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) 25600);
        // The following exception was thrown during execution in test generation
        try {
            long long14 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray4, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 100, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        float float1 = org.apache.commons.io.EndianUtils.swapFloat((float) (short) 2560);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.1576E-41f + "'", float1 == 1.1576E-41f);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble((double) 2305843009213693952L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.43174E-319d + "'", double1 == 2.43174E-319d);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 16777216, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 16777216 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 100, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(outputStream0, (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        // The following exception was thrown during execution in test generation
        try {
            short short11 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, (int) (short) 2560);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2560 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 0, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        int int8 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 100, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        float float8 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray4, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 100, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-3.03064E38f) + "'", float8 == (-3.03064E38f));
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        short short1 = org.apache.commons.io.EndianUtils.swapShort((short) 13322);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 2612 + "'", short1 == (short) 2612);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(outputStream0, (long) 65535);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (byte) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            float float13 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 536870912);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 536870912 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 0, 0, 0]");
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 536870912, (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 536870912 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(outputStream0, (short) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            short short2 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from byte/boolean array because \"data\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) 25600);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray4, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 100, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, (float) 100L);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) '4', (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            double double10 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray5, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, 0, 0]");
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (byte) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) '#', (short) 25600);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 0, 0, 0]");
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        int int1 = org.apache.commons.io.EndianUtils.swapInteger(1677721600);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(outputStream0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        float float8 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, (int) (short) 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) '4', (float) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 80, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-3.03064E38f) + "'", float8 == (-3.03064E38f));
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble((double) 7205759403792793600L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.74794E-319d + "'", double1 == 2.74794E-319d);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) 25600);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, (int) (byte) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 100, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray0, (int) (short) 1, (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot store to byte/boolean array because \"data\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble((double) 57.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.154167E-317d + "'", double1 == 4.154167E-317d);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(outputStream0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 2612);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2612 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble((double) 'a');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0834234E-317d + "'", double1 == 2.0834234E-317d);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        float float1 = org.apache.commons.io.EndianUtils.swapFloat((-1.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.6185E-41f + "'", float1 == 4.6185E-41f);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, (int) (byte) 0, (double) 2305843009213693952L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, 0, 0]");
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        // The following exception was thrown during execution in test generation
        try {
            long long14 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray4, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[10, 52, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        byte[] byteArray0 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray0, 10, (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        // The following exception was thrown during execution in test generation
        try {
            double double13 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray5, (-10223615));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -10223615 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(outputStream0, (float) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble((double) '#');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.152776E-317d + "'", double1 == 4.152776E-317d);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            long long11 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray4, 65535);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 65535 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray5, (int) (short) -1, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(outputStream0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble((double) 65536);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0387E-319d + "'", double1 == 3.0387E-319d);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray4, (int) (short) 100, 7205759403792793600L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 100, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        int int1 = org.apache.commons.io.EndianUtils.swapInteger((-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        float float1 = org.apache.commons.io.EndianUtils.swapFloat(7.1839E-41f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 100.0f + "'", float1 == 100.0f);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        java.lang.Class<?> wildcardClass13 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 13322 + "'", short12 == (short) 13322);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (byte) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 536870912);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 536870912 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 0, 0, 0]");
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        int int1 = org.apache.commons.io.EndianUtils.swapInteger(100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1677721600 + "'", int1 == 1677721600);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        long long1 = org.apache.commons.io.EndianUtils.swapLong((long) (short) 256);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 281474976710656L + "'", long1 == 281474976710656L);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, 2.0834234E-317d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long12 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray5, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 16777216, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 16777216 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(outputStream0, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble((double) (-10223615));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.77444888682E-312d + "'", double1 == 4.77444888682E-312d);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(outputStream0, (float) 65535);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, (float) 100L);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray4, (int) '#', (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(outputStream0, (float) 4294967296L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(outputStream0, (short) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble(1.12884E-319d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            short short11 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, (double) (-10223615));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(outputStream0, (float) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(outputStream0, (-10223615));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray4, 536870912, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 536870912 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 100, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, 16777216, (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 16777216 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[10, 0, -1, 10]");
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            short short10 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, 0, 0]");
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(outputStream0, 65536);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) ' ', 9.2E-44f);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[10, 52, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        int int11 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, (int) (short) 2612);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2612 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 65535 + "'", int11 == 65535);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray0, (-1), (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot store to byte/boolean array because \"data\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) 25600);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (byte) 10, (float) 281474976710656L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 100, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            short short2 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from byte/boolean array because \"data\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, (int) (short) 1, (int) (short) 2560);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 10, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(outputStream0, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            float float14 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 13322 + "'", short12 == (short) 13322);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(outputStream0, 7205759403792793600L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 0, 0, 0]");
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            int int6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, (int) (short) 256);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 256 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 10, -1]");
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray4, 16777216, (double) 1.157E-41f);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 16777216 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[10, 52, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        int int1 = org.apache.commons.io.EndianUtils.swapInteger((int) (short) 13322);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 171180032 + "'", int1 == 171180032);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            float float12 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, (int) (short) 256);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 256 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, (double) 57.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(outputStream0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray4, (int) (short) 0, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[100, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) 25600);
        float float14 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray4, 1677721600, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1677721600 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 100, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 57.0f + "'", float14 == 57.0f);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        int int8 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, 65536);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 65536 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 100, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 65536, (float) 1677721600);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 65536 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 100, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(outputStream0, (float) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        long long1 = org.apache.commons.io.EndianUtils.swapLong((long) 65535);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-281474976710656L) + "'", long1 == (-281474976710656L));
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        long long1 = org.apache.commons.io.EndianUtils.swapLong((long) 65536);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1099511627776L + "'", long1 == 1099511627776L);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 2612);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray4, 10, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[52, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) 25600);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (-1), (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 100, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        long long1 = org.apache.commons.io.EndianUtils.swapLong(1L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 72057594037927936L + "'", long1 == 72057594037927936L);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, (-10223615), (int) (short) 2560);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -10223615 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        short short13 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 1 + "'", short13 == (short) 1);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(outputStream0, 1.1576E-41f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (byte) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 65536, (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 65536 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 0, 0, 0]");
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray5, 1, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 13322 + "'", short12 == (short) 13322);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        float float8 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray4, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 100, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-3.03064E38f) + "'", float8 == (-3.03064E38f));
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        int int8 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long10 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray4, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 100, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(outputStream0, 32L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 0, (float) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray5, (int) ' ', (-281474976710656L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, -56, 66, 0]");
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        short short13 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray5, (int) (byte) 100, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 1 + "'", short13 == (short) 1);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) 25600);
        float float14 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray4, (int) '#', (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 100, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 57.0f + "'", float14 == 57.0f);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        // The following exception was thrown during execution in test generation
        try {
            int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 1677721600);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1677721600 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        int int1 = org.apache.commons.io.EndianUtils.swapInteger(171180032);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 13322 + "'", int1 == 13322);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        float float1 = org.apache.commons.io.EndianUtils.swapFloat((float) 1099511627776L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.6034E-41f + "'", float1 == 4.6034E-41f);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(outputStream0, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 13322, (float) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13322 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, -56, 66]");
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        short short13 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        java.lang.Class<?> wildcardClass14 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 1 + "'", short13 == (short) 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        float float1 = org.apache.commons.io.EndianUtils.swapFloat(2.346371E-38f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 65535.0f + "'", float1 == 65535.0f);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) 25600);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray4, (int) (byte) 0, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[32, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        short short1 = org.apache.commons.io.EndianUtils.swapShort((short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) 25600);
        long long14 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, (int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1113849856L + "'", long14 == 1113849856L);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(outputStream0, (long) (short) 2612);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 1677721600);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1677721600 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        int int1 = org.apache.commons.io.EndianUtils.swapInteger(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 16777216 + "'", int1 == 16777216);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        // The following exception was thrown during execution in test generation
        try {
            long long17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, -56, 94, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 13322 + "'", short12 == (short) 13322);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) 25600);
        long long14 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        java.lang.Class<?> wildcardClass15 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 100, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1113849856L + "'", long14 == 1113849856L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        long long1 = org.apache.commons.io.EndianUtils.swapLong((long) 171180032);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 57217554317312L + "'", long1 == 57217554317312L);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        java.lang.Class<?> wildcardClass10 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 0, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(outputStream0, (float) 281474976710656L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) 25600);
        float float14 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 536870912);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 536870912 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 100, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 57.0f + "'", float14 == 57.0f);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) 25600);
        float float14 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            float float16 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 100, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 57.0f + "'", float14 == 57.0f);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, (float) 100L);
        // The following exception was thrown during execution in test generation
        try {
            short short14 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, (-10223615));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -10223615 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        float float8 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, (int) (short) 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) '4');
        // The following exception was thrown during execution in test generation
        try {
            float float13 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, 13322);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13322 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 80, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-3.03064E38f) + "'", float8 == (-3.03064E38f));
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            float float11 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, 65535);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 65535 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        short short1 = org.apache.commons.io.EndianUtils.swapShort((short) 0);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(outputStream0, (short) 25600);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        int int8 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 16777216, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 16777216 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 100, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        float float1 = org.apache.commons.io.EndianUtils.swapFloat((float) 0L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (-1), 171180032);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 0, 0, 0]");
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, 100, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, 100, -1, 0]");
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(outputStream0, (float) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        java.lang.Class<?> wildcardClass16 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, -56, 94, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 13322 + "'", short12 == (short) 13322);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(outputStream0, 9.2E-44f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 0, (float) (short) 100);
        java.lang.Class<?> wildcardClass15 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, -56, 66, 0]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        int int8 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long10 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray4, (int) (short) 25600);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 25600 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 100, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        short short1 = org.apache.commons.io.EndianUtils.swapShort((short) 10);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 2560 + "'", short1 == (short) 2560);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) 25600);
        long long14 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray4, 0, 2.43174E-319d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[67, -64, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1113849856L + "'", long14 == 1113849856L);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(outputStream0, (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 65536);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 65536 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, 1, (short) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[10, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray4, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[10, 52, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        short short1 = org.apache.commons.io.EndianUtils.swapShort((short) 2560);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 10 + "'", short1 == (short) 10);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(outputStream0, (long) (short) 13322);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        float float8 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 10, (float) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 100, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-3.03064E38f) + "'", float8 == (-3.03064E38f));
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) 25600);
        long long14 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 100, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1113849856L + "'", long14 == 1113849856L);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        float float1 = org.apache.commons.io.EndianUtils.swapFloat((float) 1113849856L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.8414561E-38f + "'", float1 == 1.8414561E-38f);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) 25600);
        float float14 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray4, 1677721600, (double) 65535);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1677721600 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 100, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 57.0f + "'", float14 == 57.0f);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        long long15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 100, (-10223615));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 4284743681L + "'", long15 == 4284743681L);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(outputStream0, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray5, 1677721600);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1677721600 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, 100, -1, 0]");
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 4.6006E-41f);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray5, 0, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[35, 0, 0, 0, 0]");
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, (double) 171180032);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, 1, (short) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, (int) '#', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[10, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 0, (int) (short) 13322);
        // The following exception was thrown during execution in test generation
        try {
            long long15 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray5, 536870912);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 536870912 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 0, (int) (short) 13322);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 256);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 256 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(outputStream0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (byte) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, 16777216, (double) (short) 2560);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 16777216 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 0, 0, 0]");
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        int int1 = org.apache.commons.io.EndianUtils.swapInteger((int) (short) 25600);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6553600 + "'", int1 == 6553600);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray2, 16777216);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 16777216 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 100]");
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(outputStream0, 57217554317312L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, (double) (-281474976710656L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 100, 65535.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 12, 66, 0]");
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from byte/boolean array because \"data\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        float float8 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, (int) (short) 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, 0, (short) 2560);
        // The following exception was thrown during execution in test generation
        try {
            long long13 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray4, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 10, 100, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-3.03064E38f) + "'", float8 == (-3.03064E38f));
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble((double) 536870912);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.43164E-319d + "'", double1 == 2.43164E-319d);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        long long13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) (short) 2560);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2560 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 16737280L + "'", long13 == 16737280L);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(outputStream0, 65535);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        long long1 = org.apache.commons.io.EndianUtils.swapLong(57217554317312L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 171180032L + "'", long1 == 171180032L);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (byte) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            long long13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 0, 0, 0]");
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, 100, -1, 0]");
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, (float) 100L);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray4, 171180032);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 171180032 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray4, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 100, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        float float1 = org.apache.commons.io.EndianUtils.swapFloat((float) (short) 13322);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.702217E-39f + "'", float1 == 3.702217E-39f);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        float float1 = org.apache.commons.io.EndianUtils.swapFloat((float) 52);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.8791E-41f + "'", float1 == 2.8791E-41f);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) '4', (short) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        long long15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray5, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 4284743681L + "'", long15 == 4284743681L);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) 25600);
        long long14 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray4, (int) (short) 25600, 57217554317312L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 25600 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 100, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1113849856L + "'", long14 == 1113849856L);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(outputStream0, (float) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) ' ', (short) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 2612);
        // The following exception was thrown during execution in test generation
        try {
            long long14 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray4, 13322);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13322 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[52, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(outputStream0, (short) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 100, (int) (short) 25600);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, 0, 0]");
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(outputStream0, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 0, 0, 0]");
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(outputStream0, (long) (-10223615));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(outputStream0, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        float float1 = org.apache.commons.io.EndianUtils.swapFloat(65535.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.346371E-38f + "'", float1 == 2.346371E-38f);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            float float11 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (byte) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 12, 66, 0]");
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 4.6006E-41f);
        java.lang.Class<?> wildcardClass15 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 63, -128, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        int int10 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long12 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, (float) 100L);
        // The following exception was thrown during execution in test generation
        try {
            float float14 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, 536870912);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 536870912 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (byte) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray5, 52, (long) (short) 13322);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 0, 0, 0]");
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        // The following exception was thrown during execution in test generation
        try {
            long long17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (-10223615));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -10223615 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, -56, 94, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 13322 + "'", short12 == (short) 13322);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, 1, (short) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            long long17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[10, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, 1, (short) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[10, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        float float8 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, (int) (short) 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) '4');
        // The following exception was thrown during execution in test generation
        try {
            long long13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 80, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-3.03064E38f) + "'", float8 == (-3.03064E38f));
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        short short13 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (byte) -1, (short) 2560);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 1 + "'", short13 == (short) 1);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray5, (int) (byte) -1, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (-1), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, -56, 66]");
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) 25600);
        // The following exception was thrown during execution in test generation
        try {
            long long14 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 65536);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 65536 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 100, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int10 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) (short) 256);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 256 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, 0, 0]");
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(outputStream0, (int) (short) 2560);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (short) 13322, (int) (short) 25600);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13322 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, 100, -1, 0]");
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, (double) 1.1576E-41f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        long long1 = org.apache.commons.io.EndianUtils.swapLong((long) (short) 2560);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2814749767106560L + "'", long1 == 2814749767106560L);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        long long15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            short short17 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 4284743681L + "'", long15 == 4284743681L);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        int int1 = org.apache.commons.io.EndianUtils.swapInteger((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 167772160 + "'", int1 == 167772160);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 2612);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray4, 1677721600, 32L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1677721600 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[52, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 16777216, (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 16777216 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, 0, 0]");
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        float float8 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, (int) (short) 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, 0, (short) 2560);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray4, (int) (short) 13322);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13322 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 10, 100, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-3.03064E38f) + "'", float8 == (-3.03064E38f));
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        long long17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 2612);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2612 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, -56, 94, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 13322 + "'", short12 == (short) 13322);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1590165504L + "'", long17 == 1590165504L);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        // The following exception was thrown during execution in test generation
        try {
            short short17 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (short) 25600);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 25600 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, -56, 94, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 13322 + "'", short12 == (short) 13322);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 171180032);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 171180032 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, -56, 94, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 13322 + "'", short12 == (short) 13322);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 100, (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, 0, 0]");
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        int int11 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray4, 10, 4294967296L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 65535 + "'", int11 == 65535);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        int int1 = org.apache.commons.io.EndianUtils.swapInteger((int) (short) 2612);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 873070592 + "'", int1 == 873070592);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        long long1 = org.apache.commons.io.EndianUtils.swapLong(4294967296L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 16777216L + "'", long1 == 16777216L);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 2612);
        // The following exception was thrown during execution in test generation
        try {
            float float14 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[52, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, (float) 100L);
        // The following exception was thrown during execution in test generation
        try {
            long long14 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray4, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(outputStream0, (short) 2612);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        long long17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        long long19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray5, (int) (byte) 100, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, -56, 94, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 13322 + "'", short12 == (short) 13322);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1590165504L + "'", long17 == 1590165504L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1590165504L + "'", long19 == 1590165504L);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) 25600);
        float float14 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray4, (int) (short) 2612);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2612 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 100, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 57.0f + "'", float14 == 57.0f);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        long long15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, (float) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double20 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray5, 16777216);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 16777216 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 0, -128, 63]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 4284743681L + "'", long15 == 4284743681L);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 2612);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray4, 167772160, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 167772160 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[52, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        int int8 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 1, 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(outputStream0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) (short) 256);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 256 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 0, 0, 0]");
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(outputStream0, 72057594037927936L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, (float) 100L);
        // The following exception was thrown during execution in test generation
        try {
            long long14 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray4, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        long long1 = org.apache.commons.io.EndianUtils.swapLong(1099511627776L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 65536L + "'", long1 == 65536L);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        long long17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray5, (int) (byte) 0, 171180032L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 52, 10, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 13322 + "'", short12 == (short) 13322);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1590165504L + "'", long17 == 1590165504L);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        long long17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        long long19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 1677721600);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1677721600 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, -56, 94, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 13322 + "'", short12 == (short) 13322);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1590165504L + "'", long17 == 1590165504L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1590165504L + "'", long19 == 1590165504L);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        float float1 = org.apache.commons.io.EndianUtils.swapFloat(1.8414561E-38f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.11384986E9f + "'", float1 == 1.11384986E9f);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            float float5 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray3, (int) (short) 256);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 256 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[1, 10, -1]");
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(outputStream0, 16737280L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 0, (float) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray5, 6553600);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6553600 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, -56, 66, 0]");
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        long long1 = org.apache.commons.io.EndianUtils.swapLong((long) 1677721600);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 429496729600L + "'", long1 == 429496729600L);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(outputStream0, 16777216);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, (float) 100L);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 100, (float) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        float float8 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, (int) (short) 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, 0, (short) 2560);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray4, 13322);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13322 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 10, 100, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-3.03064E38f) + "'", float8 == (-3.03064E38f));
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) 25600);
        // The following exception was thrown during execution in test generation
        try {
            long long14 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 100, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 2612);
        // The following exception was thrown during execution in test generation
        try {
            long long14 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray4, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[52, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(outputStream0, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray4, (int) (short) 10, (long) 873070592);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 100, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 536870912, 4.6006E-41f);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 536870912 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[10, 52, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(outputStream0, 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        long long17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long19 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray5, 171180032);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 171180032 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, -56, 94, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 13322 + "'", short12 == (short) 13322);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1590165504L + "'", long17 == 1590165504L);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 0, (int) (short) 13322);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray5, (int) 'a', (long) (-10223615));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        int int8 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, (-1), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 100, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(outputStream0, (float) 16737280L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        float float1 = org.apache.commons.io.EndianUtils.swapFloat((float) 281474976710656L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.604E-41f + "'", float1 == 4.604E-41f);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) -1, (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) 25600);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray4, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 100, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, (int) (short) 100, (double) 65535);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, -56, 94, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 13322 + "'", short12 == (short) 13322);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        int int8 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 2560, (float) (short) 25600);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2560 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 100, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        float float8 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, (int) (short) 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, 0, (short) 2560);
        // The following exception was thrown during execution in test generation
        try {
            short short13 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 10, 100, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-3.03064E38f) + "'", float8 == (-3.03064E38f));
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from byte/boolean array because \"data\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray4, 171180032);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 171180032 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 100, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, (int) (byte) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray4, 13322);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13322 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        long long1 = org.apache.commons.io.EndianUtils.swapLong((long) 0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        long long13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 1);
        float float15 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 1677721600);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1677721600 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 16737280L + "'", long13 == 16737280L);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-3.03064E38f) + "'", float15 == (-3.03064E38f));
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(outputStream0, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        long long1 = org.apache.commons.io.EndianUtils.swapLong(4284743681L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 72168640417366016L + "'", long1 == 72168640417366016L);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (byte) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray5, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 0, 0, 0]");
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        int int10 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 2612);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2612 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray0, (-10223615), (-10223615));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot store to byte/boolean array because \"data\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 65535, 1.1576E-41f);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 65535 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray0, (int) (byte) -1, (short) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot store to byte/boolean array because \"data\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        long long13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 1);
        float float15 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            short short17 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 1677721600);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1677721600 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 16737280L + "'", long13 == 16737280L);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-3.03064E38f) + "'", float15 == (-3.03064E38f));
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(outputStream0, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 65536, 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 65536 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[10, 52, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        long long15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray5, 167772160, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 167772160 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 4284743681L + "'", long15 == 4284743681L);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        java.lang.Class<?> wildcardClass9 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from byte/boolean array because \"data\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray3, (int) (short) 13322, (float) 57217554317312L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13322 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[1, 100, -1]");
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        short short13 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (-1), (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 1 + "'", short13 == (short) 1);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(outputStream0, (long) 13322);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        long long17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        long long19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        int int21 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) 'a', (short) 2612);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, -56, 94, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 13322 + "'", short12 == (short) 13322);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1590165504L + "'", long17 == 1590165504L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1590165504L + "'", long19 == 1590165504L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        float float1 = org.apache.commons.io.EndianUtils.swapFloat(1.8668E-41f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 8.666685E-33f + "'", float1 == 8.666685E-33f);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        long long13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 13322, (short) 2560);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13322 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 16737280L + "'", long13 == 16737280L);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        short short13 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, (int) (short) 2612, (double) 536870912);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2612 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 1 + "'", short13 == (short) 1);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, 1, (short) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            float float17 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, 65535);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 65535 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[10, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        long long17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        long long19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        int int21 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (byte) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, -56, 94, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 13322 + "'", short12 == (short) 13322);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1590165504L + "'", long17 == 1590165504L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1590165504L + "'", long19 == 1590165504L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray4, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }
}

