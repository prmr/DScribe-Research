import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, (int) (byte) 0, (int) (byte) 1);
        int int17 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 1677721600, 1627389952);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, (int) (byte) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 66, (int) (short) 256);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        long long15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, (float) 1);
        long long20 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, 16129, (double) 6989586621679009792L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 16129 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 0, -128, 63]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 4284743681L + "'", long15 == 4284743681L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 2147483649L + "'", long20 == 2147483649L);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, (int) '4', 2.58974E-319d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1107296256, (int) (short) -14336);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 12, 66, 0]");
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble((double) 16803071);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.09934032943E-312d + "'", double1 == 5.09934032943E-312d);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        long long15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, (float) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 25600, (-4.63782E-39f));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 0, -128, 63]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 4284743681L + "'", long15 == 4284743681L);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        long long15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, (float) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) -1, (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 0, -128, 63]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 4284743681L + "'", long15 == 4284743681L);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        int int8 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 0);
        short short10 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, (int) (byte) 1);
        java.lang.Class<?> wildcardClass11 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 100, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 25600 + "'", short10 == (short) 25600);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, (double) 9.2E-44f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        float float8 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, (int) (short) 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray4, (int) (short) -1, (double) (short) 200);
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
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, (double) 1590165504);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, (double) 57217554317312L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 4.6006E-41f);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 256);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 256 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 63, -128, 0, 0]");
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(outputStream0, 256);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            float float14 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, 51200);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 51200 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(outputStream0, 416611827712L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        int int11 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, 0, (short) 256);
        int int16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray4, 256, 1.0620482193E-314d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 256 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 65535 + "'", int11 == 65535);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 256 + "'", int16 == 256);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        long long15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, (float) 1);
        long long20 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, 655360, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 655360 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 0, -128, 63]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 4284743681L + "'", long15 == 4284743681L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 2147483649L + "'", long20 == 2147483649L);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(outputStream0, (float) 72058143793741824L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, (float) 100L);
        long long14 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray4, 25600, (long) (short) 200);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 25600 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1120403456L + "'", long14 == 1120403456L);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            float float4 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray2, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 1]");
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 4.6006E-41f);
        float float16 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long18 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray5, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 63, -128, 0, 0]");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.1777545E-38f + "'", float16 == 1.1777545E-38f);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        long long15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, (float) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 587202560, (short) -14336);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 587202560 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 0, -128, 63]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 4284743681L + "'", long15 == 4284743681L);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        int int11 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 0, (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 873070592);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 873070592 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, -1, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 65535 + "'", int11 == 65535);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        float float8 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, (int) (short) 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) '4');
        int int13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray4, (int) '#', 4.07601990092E-312d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 80, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-3.03064E38f) + "'", float8 == (-3.03064E38f));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray0, (int) (short) -14336, (short) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot store to byte/boolean array because \"data\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 4.6006E-41f);
        float float16 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 0, 16777216);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) (short) 200);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 200 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.1777545E-38f + "'", float16 == 1.1777545E-38f);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            short short20 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, -128, -65, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 13322 + "'", short12 == (short) 13322);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 1, (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (byte) 1, 100);
        int int22 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            short short24 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 16803071);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 16803071 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 100, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 25600 + "'", int22 == 25600);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        int int11 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, 0, (short) 256);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (byte) 1, (float) 416611827712L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 0, -62]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 65535 + "'", int11 == 65535);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        int int8 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, 97, (short) (byte) 1);
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
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        short short19 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 1);
        int int21 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 32, (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        short short19 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 1);
        int int21 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) (byte) 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 171180032);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 171180032 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, -128, 63]");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 4.6006E-41f);
        float float16 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) '4', (short) 200);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 63, -128, 0, 0]");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.1777545E-38f + "'", float16 == 1.1777545E-38f);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        int int11 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, 0, (short) 256);
        int int16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray4, 52, 3749809639739359232L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 65535 + "'", int11 == 65535);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 256 + "'", int16 == 256);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 10);
        java.lang.Class<?> wildcardClass15 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, 100, -1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            float float15 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, (-65536));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -65536 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) 25600);
        float float14 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, (float) 32L);
        int int19 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            short short21 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, 65536);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 65536 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 0, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 57.0f + "'", float14 == 57.0f);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1107296256 + "'", int19 == 1107296256);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(outputStream0, 3.4727E-41f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        float float8 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, (int) (short) 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) '4');
        int int13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray4, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 80, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-3.03064E38f) + "'", float8 == (-3.03064E38f));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(outputStream0, 3.702217E-39f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, (int) (byte) 0, (int) (byte) 1);
        int int17 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, 655360, (short) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 655360 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        float float1 = org.apache.commons.io.EndianUtils.swapFloat((float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 7.1839E-41f + "'", float1 == 7.1839E-41f);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        long long13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 1);
        short short15 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, 13322, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13322 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 16737280L + "'", long13 == 16737280L);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 1 + "'", short15 == (short) 1);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(outputStream0, 2522015791327477760L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        int int11 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 0, (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray4, (int) (short) 25600);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 25600 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, -1, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 65535 + "'", int11 == 65535);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        byte[] byteArray2 = new byte[] { (byte) 100, (byte) 100 };
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray2, (int) (short) 0, (short) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long7 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray2, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0]");
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        long long1 = org.apache.commons.io.EndianUtils.swapLong(16803071L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-43910092071895040L) + "'", long1 == (-43910092071895040L));
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        int int1 = org.apache.commons.io.EndianUtils.swapInteger(872415232);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, 1677721600);
        long long17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 51294, (float) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 0, 100]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1677721600L + "'", long17 == 1677721600L);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from byte/boolean array because \"data\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, (float) 100L);
        long long14 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray4, 1677721600);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1677721600 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1120403456L + "'", long14 == 1120403456L);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        // The following exception was thrown during execution in test generation
        try {
            long long19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, -56, 66]");
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 1627389952, (short) 2612);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1627389952 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray5, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, -56, 94, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 13322 + "'", short12 == (short) 13322);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        int int8 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            short short10 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, 12550144);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 12550144 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 100, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        short short1 = org.apache.commons.io.EndianUtils.swapShort((short) 200);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) -14336 + "'", short1 == (short) -14336);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (byte) 1, (short) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, 2612, (double) 655360);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2612 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, -1, -1, 0, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        int int11 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 0, (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (short) 1, (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray4, (int) 'a', (long) 8404737);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 65535 + "'", int11 == 65535);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        long long17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray5, 51200, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 51200 out of bounds for length 5");
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
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        short short19 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) ' ', (short) 2560);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        long long13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 1);
        short short15 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 16737280L + "'", long13 == 16737280L);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 1 + "'", short15 == (short) 1);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        int int11 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 0, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        long long17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        long long19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        int int21 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (short) 1, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 12550144, (float) (short) 2560);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 100, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 13322 + "'", short12 == (short) 13322);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1590165504L + "'", long17 == 1590165504L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1590165504L + "'", long19 == 1590165504L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        // The following exception was thrown during execution in test generation
        try {
            float float16 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 12550144);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 12550144 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 12, 66, 0]");
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(outputStream0, 2560L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(outputStream0, (-4.63782E-39f));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        short short19 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 1);
        int int21 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) -1, (float) (-65536));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        int int8 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 0);
        short short10 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long12 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 16777216);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 16777216 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 100, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 25600 + "'", short10 == (short) 25600);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        long long17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        long long19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        int int21 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        int int23 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1590165504 + "'", int23 == 1590165504);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        long long17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (-939524096));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -939524096 out of bounds for length 5");
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
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, 6.9726E-41f);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (short) 256, (int) (short) 2612);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[94, -62, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 13322 + "'", short12 == (short) 13322);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        short short19 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 587202560);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 587202560 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        long long17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        long long19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        int int21 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        int int23 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            short short25 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (short) 25600);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 25600 out of bounds for length 5");
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1590165504 + "'", int23 == 1590165504);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(outputStream0, 8.658487E-39f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(outputStream0, 10995116277760L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        float float1 = org.apache.commons.io.EndianUtils.swapFloat(1.673728E7f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9.229214E-39f + "'", float1 == 9.229214E-39f);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray0, 16803071, (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot store to byte/boolean array because \"data\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        short short13 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 16803071);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 16803071 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 1 + "'", short13 == (short) 1);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(outputStream0, (float) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 4.6006E-41f);
        float float16 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 16129, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 63, -128, 0, 0]");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.1777545E-38f + "'", float16 == 1.1777545E-38f);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 4.6006E-41f);
        float float16 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        int int18 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 0);
        int int20 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray5, (int) (byte) 0, 256L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 1, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.1777545E-38f + "'", float16 == 1.1777545E-38f);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8404737 + "'", int18 == 8404737);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 16129 + "'", int20 == 16129);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(outputStream0, (float) 16803071);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 12, 66, 0]");
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        int int8 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 0);
        short short10 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, 200, (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 200 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 100, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 25600 + "'", short10 == (short) 25600);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        long long15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, (float) 1);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (short) 1, (-65536));
        float float23 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            float float25 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, (int) (short) 200);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 200 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 0, -1, -1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 4284743681L + "'", long15 == 4284743681L);
        org.junit.Assert.assertTrue(Float.isNaN(float23));
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, (int) (byte) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 51294);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 51294 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 1113849856L);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray5, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, -56, -124, 78]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        long long17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long19 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray5, (-65536));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -65536 out of bounds for length 5");
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
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        float float1 = org.apache.commons.io.EndianUtils.swapFloat((float) 2814749767106560L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.1604E-41f + "'", float1 == 1.1604E-41f);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, (int) (byte) 0, (int) (byte) 1);
        int int17 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray4, 97, (double) 4.6017E-41f);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 0, (float) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray5, 1107296256, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1107296256 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, -56, 66, 0]");
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) 2612);
        java.lang.Class<?> wildcardClass17 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[52, 10, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, (float) 100L);
        long long14 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 12550144, 65535);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1120403456L + "'", long14 == 1120403456L);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        int int1 = org.apache.commons.io.EndianUtils.swapInteger(2612);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 873070592 + "'", int1 == 873070592);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        long long13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 1);
        float float15 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        java.lang.Class<?> wildcardClass16 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 16737280L + "'", long13 == 16737280L);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-3.03064E38f) + "'", float15 == (-3.03064E38f));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 0, (float) (short) 100);
        short short16 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 16803071, (short) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 16803071 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, -56, 66, 0]");
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) -14336 + "'", short16 == (short) -14336);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(outputStream0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, 6.9726E-41f);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[94, -62, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 13322 + "'", short12 == (short) 13322);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(outputStream0, 7.1839E-41f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 4.6006E-41f);
        float float16 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        int int18 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 0);
        int int20 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        long long22 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray5, (int) '4', 72168640417366016L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 63, -128, 0, 0]");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.1777545E-38f + "'", float16 == 1.1777545E-38f);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8404737 + "'", int18 == 8404737);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 16129 + "'", int20 == 16129);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 32831L + "'", long22 == 32831L);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        int int10 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray5, 1590165504, (long) (short) 13322);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1590165504 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, 1677721600);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, 4.6185E-41f);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, (int) (short) 0, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            float float23 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, 25600);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 25600 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[97, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        int int8 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 0);
        short short10 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 25600, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 100, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 25600 + "'", short10 == (short) 25600);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        long long1 = org.apache.commons.io.EndianUtils.swapLong((long) 200);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-4035225266123964416L) + "'", long1 == (-4035225266123964416L));
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        int int11 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 0);
        long long13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 12550144);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 12550144 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 0, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1107296256L + "'", long13 == 1107296256L);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from byte/boolean array because \"data\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            int int20 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 655360);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 655360 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, -128, -65, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 13322 + "'", short12 == (short) 13322);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray0, (int) (short) 256, (long) 12550144);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot store to byte/boolean array because \"data\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        int int10 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 200, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(outputStream0, 65535.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(outputStream0, 12550144);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(outputStream0, 5.785736E-39f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 872415232, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, -128, -65, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 13322 + "'", short12 == (short) 13322);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray0, 1677721600, 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot store to byte/boolean array because \"data\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, (double) 1099511627776L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, (double) 3.4727E-41f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        long long17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
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
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        float float8 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, (int) (short) 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray4, 0, 1590165504L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, -56, 94]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-3.03064E38f) + "'", float8 == (-3.03064E38f));
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(outputStream0, (float) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        long long17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        long long19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        int int21 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        long long23 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (byte) 0);
        float float25 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 12550144);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 12550144 out of bounds for length 5");
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
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1590165504L + "'", long23 == 1590165504L);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 7.2057594E18f + "'", float25 == 7.2057594E18f);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, (float) 100L);
        float float14 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray4, (-65536), 32831L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -65536 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 100.0f + "'", float14 == 100.0f);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        int int8 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray4, 256);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 256 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 100, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        int int11 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 12550144);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 12550144 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 65535 + "'", int11 == 65535);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 13322);
        // The following exception was thrown during execution in test generation
        try {
            short short22 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 2612);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2612 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, -56, 66]");
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 10);
        int int16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        short short18 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            long long23 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray5, 16803071);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 16803071 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 25600 + "'", short18 == (short) 25600);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        long long13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (-10223615));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray5, 2560, (long) 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2560 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 1, 0, 100, -1]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 16737280L + "'", long13 == 16737280L);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        long long15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 66);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 66 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 4284743681L + "'", long15 == 4284743681L);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 100, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        long long13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) (short) 256);
        // The following exception was thrown during execution in test generation
        try {
            long long18 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray5, 8404737);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 8404737 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, -128, 67, 0]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 16737280L + "'", long13 == 16737280L);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, 0);
        short short14 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, 0);
        long long16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 12550144);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 12550144 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 0 + "'", short14 == (short) 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        long long1 = org.apache.commons.io.EndianUtils.swapLong((long) 32);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2305843009213693952L + "'", long1 == 2305843009213693952L);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        float float8 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, (int) (short) 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) '4');
        int int13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray4, 6553600, (double) 2560);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6553600 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 80, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-3.03064E38f) + "'", float8 == (-3.03064E38f));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble((double) 1.1604E-41f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0624367683E-314d + "'", double1 == 1.0624367683E-314d);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(outputStream0, 3749809639739359232L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 1113849856L);
        java.lang.Class<?> wildcardClass14 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, -56, -124, 78]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        long long1 = org.apache.commons.io.EndianUtils.swapLong(1107296256L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 283467841536L + "'", long1 == 283467841536L);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 0, (float) (short) 100);
        short short16 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 1);
        // The following exception was thrown during execution in test generation
        try {
            long long18 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray5, (int) (short) 2560);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2560 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, -56, 66, 0]");
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) -14336 + "'", short16 == (short) -14336);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) 2612);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 66, (float) 65535);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 66 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[52, 10, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, (int) (byte) 0, (int) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long20 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 2560);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2560 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, -128, 63]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        int int11 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 0, (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 8404737);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 8404737 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, -1, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 65535 + "'", int11 == 65535);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, (double) 1627389952);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        int int8 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, (int) '4', 587202560);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 100, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble((double) 1677721600L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.74784E-319d + "'", double1 == 2.74784E-319d);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        short short19 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 1);
        // The following exception was thrown during execution in test generation
        try {
            double double21 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray5, (int) (short) 2560);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2560 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        float float17 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 65536, 1590165504);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 65536 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, -56, 94, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 13322 + "'", short12 == (short) 13322);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 7.2057594E18f + "'", float17 == 7.2057594E18f);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        // The following exception was thrown during execution in test generation
        try {
            long long19 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray5, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, -56, 66]");
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        long long13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (-10223615));
        // The following exception was thrown during execution in test generation
        try {
            short short18 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 1, 0, 100, -1]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 16737280L + "'", long13 == 16737280L);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble((double) 720575940379279360L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0776E-319d + "'", double1 == 2.0776E-319d);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) 25600);
        float float14 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, (float) 32L);
        int int19 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray4, (int) (short) 256, (double) 1590165504);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 256 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 0, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 57.0f + "'", float14 == 57.0f);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1107296256 + "'", int19 == 1107296256);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, (int) (byte) 0, (int) (byte) 1);
        int int17 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray4, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 51294);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 51294 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 1113849856L);
        int int15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, -56, -124, 78]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        long long17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        long long19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        int int21 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        long long23 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            short short25 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (short) 25600);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 25600 out of bounds for length 5");
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
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1590165504L + "'", long23 == 1590165504L);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, (float) 100L);
        long long14 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray4, (int) (short) 100, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1120403456L + "'", long14 == 1120403456L);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long14 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 13322 + "'", short12 == (short) 13322);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        float float8 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, (int) (short) 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) '4');
        int int13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            float float15 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, 6553600);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6553600 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 80, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-3.03064E38f) + "'", float8 == (-3.03064E38f));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        long long17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, 200, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 200 out of bounds for length 5");
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
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 4.6006E-41f);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (byte) 100, 1627389952);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 63, -128, 0, 0]");
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        long long15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, (float) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) 2305843009213693952L);
        // The following exception was thrown during execution in test generation
        try {
            double double23 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray5, 25600);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 25600 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, 94, 63]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 4284743681L + "'", long15 == 4284743681L);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        float float1 = org.apache.commons.io.EndianUtils.swapFloat((float) 655360);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.1582E-41f + "'", float1 == 1.1582E-41f);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        long long17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, (int) (short) 2612, 1.12894E-319d);
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
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) 25600);
        float float14 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, (float) 32L);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) '#', (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 0, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 57.0f + "'", float14 == 57.0f);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        short short19 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 1);
        int int21 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) (byte) 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 1.0f);
        java.lang.Class<?> wildcardClass25 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, -128, 63]");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) 25600);
        float float14 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, (float) 32L);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 0, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 57.0f + "'", float14 == 57.0f);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 4.6006E-41f);
        float float16 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1590165504, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1590165504 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 63, -128, 0, 0]");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.1777545E-38f + "'", float16 == 1.1777545E-38f);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(outputStream0, (float) 171180032);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(outputStream0, 1.1604E-41f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        // The following exception was thrown during execution in test generation
        try {
            long long16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 167772160);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 167772160 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 12, 66, 0]");
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(outputStream0, (float) 16803071L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        float float8 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, (int) (short) 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, 0, (short) 2560);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray4, (int) (byte) 10, (long) (short) 2612);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 10, 100, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-3.03064E38f) + "'", float8 == (-3.03064E38f));
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        long long1 = org.apache.commons.io.EndianUtils.swapLong((long) (short) 200);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-4035225266123964416L) + "'", long1 == (-4035225266123964416L));
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        float float8 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, (int) (short) 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) '4');
        int int13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray4, 256);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 256 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 80, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-3.03064E38f) + "'", float8 == (-3.03064E38f));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 0, (float) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 25600, Float.NaN);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 25600 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, -56, 66, 0]");
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        long long17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        int int19 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 12550144);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 12550144 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, -56, 94, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 13322 + "'", short12 == (short) 13322);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1590165504L + "'", long17 == 1590165504L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1590165504 + "'", int19 == 1590165504);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        short short19 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            short short21 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(outputStream0, (long) 65536);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) 2612);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 8404737, (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 8404737 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[52, 10, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 1, (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (byte) 1, 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray5, (int) '#', 2305843009213693952L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 100, 0, 0, 0]");
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray4, 13322);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13322 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, 1677721600);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 200, (float) (-10223615));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 200 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 0, 100]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        float float19 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray5, (int) (byte) -1, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + (-131072.0f) + "'", float19 == (-131072.0f));
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        int int11 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 0, (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray4, (int) (short) 200);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 200 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, -1, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 65535 + "'", int11 == 65535);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        int int11 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 0);
        long long13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 0, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1107296256L + "'", long13 == 1107296256L);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        long long1 = org.apache.commons.io.EndianUtils.swapLong((long) 12550144);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 36238803739869184L + "'", long1 == 36238803739869184L);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        short short19 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 16129, (short) -14336);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 16129 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        long long17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        long long19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        int int21 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        long long23 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (byte) 0);
        float float25 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long27 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray5, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
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
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1590165504L + "'", long23 == 1590165504L);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 7.2057594E18f + "'", float25 == 7.2057594E18f);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 12, 66, 0]");
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        long long17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        int int19 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            short short21 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, -56, 94, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 13322 + "'", short12 == (short) 13322);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1590165504L + "'", long17 == 1590165504L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1590165504 + "'", int19 == 1590165504);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        long long1 = org.apache.commons.io.EndianUtils.swapLong(10L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 720575940379279360L + "'", long1 == 720575940379279360L);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        long long15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, (float) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) 2305843009213693952L);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 171180032, (float) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, 94, 63]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 4284743681L + "'", long15 == 4284743681L);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(outputStream0, 1590165504L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        float float17 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) '#', (short) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, -56, 94, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 13322 + "'", short12 == (short) 13322);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 7.2057594E18f + "'", float17 == 7.2057594E18f);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(outputStream0, (float) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray0, 51200);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from byte/boolean array because \"data\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, 1677721600);
        // The following exception was thrown during execution in test generation
        try {
            float float17 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, 16129);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 16129 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 0, 100]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        int int11 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 0, (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, (int) (short) 0, 32);
        // The following exception was thrown during execution in test generation
        try {
            double double19 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray4, 65535);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 65535 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[32, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 65535 + "'", int11 == 65535);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        long long13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (-10223615));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, (-65536), (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -65536 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 1, 0, 100, -1]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 16737280L + "'", long13 == 16737280L);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            short short2 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray0, 167772160);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from byte/boolean array because \"data\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 655360);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 655360 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, -56, 66]");
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(outputStream0, 536870912);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        float float1 = org.apache.commons.io.EndianUtils.swapFloat(4.6017E-41f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 65536.0f + "'", float1 == 65536.0f);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 10);
        int int16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        short short18 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, 0.0f);
        java.lang.Class<?> wildcardClass22 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 25600 + "'", short18 == (short) 25600);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, 13322, (short) 256);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13322 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[10, 52, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(outputStream0, (float) 16129);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, (float) 100L);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray4, 65535);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 65535 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        float float1 = org.apache.commons.io.EndianUtils.swapFloat((float) 57217554317312L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.702239E-39f + "'", float1 == 3.702239E-39f);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 13322);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1107296256, 256);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, -56, 66]");
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        float float15 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 167772160, (short) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 167772160 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-3.03064E38f) + "'", float15 == (-3.03064E38f));
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 10);
        int int16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        short short18 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (-939524096));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -939524096 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 25600 + "'", short18 == (short) 25600);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, (double) (short) 25600);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (byte) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 256, (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 256 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 0, 0, 0]");
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) 25600);
        float float14 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, (float) 32L);
        // The following exception was thrown during execution in test generation
        try {
            long long19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 1113849856);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1113849856 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 0, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 57.0f + "'", float14 == 57.0f);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(outputStream0, 51294);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) (-1L));
        int int20 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 10, (short) 200);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, -128, -65, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 13322 + "'", short12 == (short) 13322);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 12550144 + "'", int20 == 12550144);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble((double) 16777216L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4198E-319d + "'", double1 == 1.4198E-319d);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        long long13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (-10223615));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) 'a', (float) 1107296256);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 1, 0, 100, -1]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 16737280L + "'", long13 == 16737280L);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 1113849856L);
        int int15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) (short) 2612);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2612 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, -56, -124, 78]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) 25600);
        float float14 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray4, (int) (short) 0);
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
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        long long17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        long long19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        int int21 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        short short23 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long25 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (-1));
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
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) 0 + "'", short23 == (short) 0);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        long long1 = org.apache.commons.io.EndianUtils.swapLong((-4035225266123964416L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 200L + "'", long1 == 200L);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        long long17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        int int19 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 0);
        java.lang.Class<?> wildcardClass20 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, -56, 94, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 13322 + "'", short12 == (short) 13322);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1590165504L + "'", long17 == 1590165504L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1590165504 + "'", int19 == 1590165504);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(outputStream0, (long) 12550144);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(outputStream0, 13322L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        int int11 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray4, (int) (short) 200, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 200 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 65535 + "'", int11 == 65535);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        int int10 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long12 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray5, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, 65536, (double) 9.229214E-39f);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 65536 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 13322 + "'", short12 == (short) 13322);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        long long17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, (int) (short) 256, (double) 2814749767106560L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 256 out of bounds for length 5");
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
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 4.6006E-41f);
        float float16 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        int int18 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 0);
        int int20 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        java.lang.Class<?> wildcardClass21 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 63, -128, 0, 0]");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.1777545E-38f + "'", float16 == 1.1777545E-38f);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8404737 + "'", int18 == 8404737);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 16129 + "'", int20 == 16129);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, 4.154167E-317d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 1, (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (byte) 1, 100);
        // The following exception was thrown during execution in test generation
        try {
            double double22 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray5, (int) (short) 25600);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 25600 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 100, 0, 0, 0]");
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) ' ', 1.8668E-41f);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, -56, 94, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 13322 + "'", short12 == (short) 13322);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        // The following exception was thrown during execution in test generation
        try {
            int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        long long17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        long long19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        int int21 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        long long23 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double25 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray5, 873070592);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 873070592 out of bounds for length 5");
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
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1590165504L + "'", long23 == 1590165504L);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        int int11 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 65535 + "'", int11 == 65535);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        int int11 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 0, (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, (int) (short) 0, 32);
        // The following exception was thrown during execution in test generation
        try {
            long long19 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray4, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[32, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 65535 + "'", int11 == 65535);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        long long17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        long long19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        int int21 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        long long23 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) (short) 100);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1590165504L + "'", long23 == 1590165504L);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, (int) (short) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[10, 52, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, (float) 100L);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, 10, (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        long long13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 1);
        short short15 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        java.lang.Class<?> wildcardClass16 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 16737280L + "'", long13 == 16737280L);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 1 + "'", short15 == (short) 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 10);
        int int16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        short short18 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            short short20 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 25600 + "'", short18 == (short) 25600);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(outputStream0, 4294967296L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        long long13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 1);
        int int15 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            float float17 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 16737280L + "'", long13 == 16737280L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10223615) + "'", int15 == (-10223615));
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, (double) 16803071L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, 1.3312E-319d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        short short19 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 1);
        int int21 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (short) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        long long1 = org.apache.commons.io.EndianUtils.swapLong((long) 25600);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 28147497671065600L + "'", long1 == 28147497671065600L);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
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
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray5, (int) (short) 25600, (long) 8404737);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 25600 out of bounds for length 5");
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
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        short short19 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 1);
        int int21 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray5, 256, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 256 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) 25600);
        // The following exception was thrown during execution in test generation
        try {
            float float14 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, 16777216);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 100, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        float float8 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, (int) (short) 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) '4');
        int int13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray4, 12550144, (long) 873070592);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 12550144 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 80, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-3.03064E38f) + "'", float8 == (-3.03064E38f));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) 25600);
        float float14 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, 0);
        long long16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray4, 1677721600, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1677721600 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 100, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 57.0f + "'", float14 == 57.0f);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1113849856L + "'", long16 == 1113849856L);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 4.6006E-41f);
        float float16 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        float float18 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long20 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 63, -128, 0, 0]");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.1777545E-38f + "'", float16 == 1.1777545E-38f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 1.1777545E-38f + "'", float18 == 1.1777545E-38f);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        int int11 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, 0, (short) 256);
        int int16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray4, (int) (short) 0, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 65535 + "'", int11 == 65535);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 256 + "'", int16 == 256);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 10);
        int int16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        short short18 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            double double23 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray5, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 25600 + "'", short18 == (short) 25600);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        long long1 = org.apache.commons.io.EndianUtils.swapLong((-281474976710656L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 65535L + "'", long1 == 65535L);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, (int) (byte) 0, (int) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) 1);
        // The following exception was thrown during execution in test generation
        try {
            float float20 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, (int) (short) 2560);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, -128, 63]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        long long17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        long long19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long21 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 97);
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
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, 6.9726E-41f);
        // The following exception was thrown during execution in test generation
        try {
            long long20 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 2612);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2612 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[94, -62, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 13322 + "'", short12 == (short) 13322);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        int int8 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 0);
        short short10 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, (int) (short) 1);
        long long12 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, (int) (byte) 0);
        int int14 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 1);
        // The following exception was thrown during execution in test generation
        try {
            float float16 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, 25600);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 100, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 25600 + "'", short10 == (short) 25600);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 4284743681L + "'", long12 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 25600 + "'", int14 == 25600);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 13322);
        // The following exception was thrown during execution in test generation
        try {
            short short22 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, -56, 66]");
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, (double) 4294967296L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(outputStream0, (long) 256);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from byte/boolean array because \"data\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        int int1 = org.apache.commons.io.EndianUtils.swapInteger((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 16777216 + "'", int1 == 16777216);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble((double) 4.7445E-41f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.34920744E-315d + "'", double1 == 5.34920744E-315d);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        long long15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, (float) 1);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (short) 1, (-65536));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, (int) (short) 0, (double) 72058143793741824L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, 0, 8]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 4284743681L + "'", long15 == 4284743681L);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        float float1 = org.apache.commons.io.EndianUtils.swapFloat(Float.NaN);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 6.9055E-41f + "'", float1 == 6.9055E-41f);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, (double) 66);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        float float1 = org.apache.commons.io.EndianUtils.swapFloat((float) (-65536));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.6197E-41f + "'", float1 == 4.6197E-41f);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, (int) (byte) 10, (double) 4.6197E-41f);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        int int8 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 0);
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 100, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-3.03064E38f) + "'", float10 == (-3.03064E38f));
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        long long17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        long long19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        int int21 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        long long23 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (byte) 0);
        float float25 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long27 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray5, 16803071);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1590165504L + "'", long23 == 1590165504L);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 7.2057594E18f + "'", float25 == 7.2057594E18f);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(outputStream0, 13322.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, 1677721600);
        // The following exception was thrown during execution in test generation
        try {
            long long17 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray4, (int) (short) 2612);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 0, 100]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 1113849856L);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 25600);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 25600 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, -56, -124, 78]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        short short13 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 2560, (float) 1120403456L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 1 + "'", short13 == (short) 1);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(outputStream0, 1677721600);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble((double) 2.346371E-38f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.77257858412E-312d + "'", double1 == 4.77257858412E-312d);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            long long11 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 13322);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13322 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 4.6006E-41f);
        float float16 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) (short) 200);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 200 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 63, -128, 0, 0]");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.1777545E-38f + "'", float16 == 1.1777545E-38f);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 10);
        int int16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        short short18 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 100, (float) 2814749767106560L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 25600 + "'", short18 == (short) 25600);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 10);
        int int16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 100, 1.161E-41f);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        int int8 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 0);
        short short10 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 100, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 25600 + "'", short10 == (short) 25600);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        float float8 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, (int) (short) 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) '4');
        // The following exception was thrown during execution in test generation
        try {
            long long13 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray4, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 80, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-3.03064E38f) + "'", float8 == (-3.03064E38f));
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        long long15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, (float) 1);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (short) 1, (-65536));
        // The following exception was thrown during execution in test generation
        try {
            double double23 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray5, 1677721600);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 0, -1, -1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 4284743681L + "'", long15 == 4284743681L);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        long long1 = org.apache.commons.io.EndianUtils.swapLong(36238803739869184L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 12550144L + "'", long1 == 12550144L);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        float float19 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 16803071, (short) 200);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 16803071 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + (-131072.0f) + "'", float19 == (-131072.0f));
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        long long13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (-65536), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 16737280L + "'", long13 == 16737280L);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        float float19 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            float float21 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 873070592);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + (-131072.0f) + "'", float19 == (-131072.0f));
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        long long1 = org.apache.commons.io.EndianUtils.swapLong(1677721600L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 429496729600L + "'", long1 == 429496729600L);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, (int) (byte) 0, (int) (byte) 1);
        int int17 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            short short19 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        int int8 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 0);
        short short10 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray4, (int) ' ', 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 100, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 25600 + "'", short10 == (short) 25600);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, (double) (-939524096));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        int int8 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 97, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 100, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        float float8 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, (int) (short) 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) '4');
        // The following exception was thrown during execution in test generation
        try {
            double double13 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray4, 200);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 80, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-3.03064E38f) + "'", float8 == (-3.03064E38f));
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        int int11 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 51200);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 51200 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 65535 + "'", int11 == 65535);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, 0);
        short short14 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 2560, 873070592);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 0 + "'", short14 == (short) 0);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        float float1 = org.apache.commons.io.EndianUtils.swapFloat((-131072.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.8E-43f + "'", float1 == 2.8E-43f);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        int int11 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, 0, (short) 256);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 536870912, (float) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 65535 + "'", int11 == 65535);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(outputStream0, (short) 200);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        int int11 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 0);
        long long13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray4, 65535, (double) 10995116277760L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 65535 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 0, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1107296256L + "'", long13 == 1107296256L);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(outputStream0, (int) (short) 2612);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 4.6006E-41f);
        float float16 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        float float18 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            float float20 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, (-939524096));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 63, -128, 0, 0]");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.1777545E-38f + "'", float16 == 1.1777545E-38f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 1.1777545E-38f + "'", float18 == 1.1777545E-38f);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 4.6006E-41f);
        float float16 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        int int18 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 0);
        int int20 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        long long22 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long24 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray5, 16777216);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 63, -128, 0, 0]");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.1777545E-38f + "'", float16 == 1.1777545E-38f);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8404737 + "'", int18 == 8404737);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 16129 + "'", int20 == 16129);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 32831L + "'", long22 == 32831L);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int10 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 256);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 256 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, 0, 0]");
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        float float1 = org.apache.commons.io.EndianUtils.swapFloat((-9.395241E8f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.4727E-41f + "'", float1 == 3.4727E-41f);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 4.6006E-41f);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 2560);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2560 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 63, -128, 0, 0]");
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        float float15 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray5, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-3.03064E38f) + "'", float15 == (-3.03064E38f));
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        long long15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, (float) 1);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (short) 1, (-65536));
        float float23 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 1107296256);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 0, -1, -1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 4284743681L + "'", long15 == 4284743681L);
        org.junit.Assert.assertTrue(Float.isNaN(float23));
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray0, 1627389952);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from byte/boolean array because \"data\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, (int) (byte) 0, (int) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray4, (int) (short) 13322, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13322 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, -128, 63]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            int int7 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, -1, 0, -1, -1]");
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        int int12 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 1);
        java.lang.Class<?> wildcardClass13 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, (float) 100L);
        long long14 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1120403456L + "'", long14 == 1120403456L);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble(1.3312E-319d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 200.0d + "'", double1 == 200.0d);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, (int) (byte) 0, (int) (byte) 1);
        int int17 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray4, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 65535);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 65535 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        float float1 = org.apache.commons.io.EndianUtils.swapFloat((float) 1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.6006E-41f + "'", float1 == 4.6006E-41f);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            float float13 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 536870912);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 0, 0, 0]");
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            int int20 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (-10223615));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -10223615 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, -128, -65, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 13322 + "'", short12 == (short) 13322);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble((double) 4.6028E-41f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8570559693E-314d + "'", double1 == 1.8570559693E-314d);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) 25600);
        float float14 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, (float) 32L);
        int int19 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray4, 171180032, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 171180032 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 0, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 57.0f + "'", float14 == 57.0f);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1107296256 + "'", int19 == 1107296256);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        long long1 = org.apache.commons.io.EndianUtils.swapLong(1113849856L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 110234630619136L + "'", long1 == 110234630619136L);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) 2612);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, (int) (short) 256, (double) 32.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 256 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[52, 10, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(outputStream0, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long14 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray5, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 13322 + "'", short12 == (short) 13322);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        long long15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, (float) 1);
        long long20 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long22 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 1677721600);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1677721600 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 0, -128, 63]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 4284743681L + "'", long15 == 4284743681L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 2147483649L + "'", long20 == 2147483649L);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        int int1 = org.apache.commons.io.EndianUtils.swapInteger((int) (short) -14336);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 13172735 + "'", int1 == 13172735);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        long long17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        int int19 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray5, 2612, (long) 1677721600);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2612 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, -56, 94, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 13322 + "'", short12 == (short) 13322);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1590165504L + "'", long17 == 1590165504L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1590165504 + "'", int19 == 1590165504);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        long long13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 1);
        short short15 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) -1, (short) 25600);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 16737280L + "'", long13 == 16737280L);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 1 + "'", short15 == (short) 1);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) 2612);
        // The following exception was thrown during execution in test generation
        try {
            float float18 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, (int) (short) -14336);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[52, 10, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, 1677721600);
        long long17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        java.lang.Class<?> wildcardClass18 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 0, 100]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1677721600L + "'", long17 == 1677721600L);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(outputStream0, 2.8E-43f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) 25600);
        long long14 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        long long16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 16129, 167772160);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 100, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1113849856L + "'", long14 == 1113849856L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1113849856L + "'", long16 == 1113849856L);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(outputStream0, (long) 655360);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(outputStream0, 2147483649L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, 5.09934032944E-312d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray0, (int) (byte) 100, (float) 720575940379279360L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray0, 16129);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from byte/boolean array because \"data\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, (double) 7.1878E-41f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray0, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 12, 66, 0]");
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 4.6006E-41f);
        float float16 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        int int18 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 0);
        int int20 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 63, -128, 0, 0]");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.1777545E-38f + "'", float16 == 1.1777545E-38f);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8404737 + "'", int18 == 8404737);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 16129 + "'", int20 == 16129);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray5, (int) (short) 13322);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 13322 + "'", short12 == (short) 13322);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) 25600);
        int int14 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray4, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 100, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1113849856 + "'", int14 == 1113849856);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray0, (int) (short) 2560);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        long long13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 1);
        int int15 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 51294);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 16737280L + "'", long13 == 16737280L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10223615) + "'", int15 == (-10223615));
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, 65535, (double) 1.1582E-41f);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 65535 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        int int12 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            float float14 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 200);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble((double) 4.6006E-41f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.856991211E-314d + "'", double1 == 1.856991211E-314d);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray5, 2560);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 13322 + "'", short12 == (short) 13322);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        int int11 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 0, (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray4, (int) (short) -1, (double) 171180032);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, -1, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 65535 + "'", int11 == 65535);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 10);
        int int16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        short short18 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double20 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray5, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 25600 + "'", short18 == (short) 25600);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, 0);
        int int14 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            float float16 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, 65536);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(outputStream0, (float) 171180032L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        // The following exception was thrown during execution in test generation
        try {
            long long11 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray4, 171180032);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 0, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 1113849856L);
        int int15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 2560);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2560 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, -56, -124, 78]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) 25600);
        float float14 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, (float) 32L);
        int int19 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            float float21 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, 655360);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 0, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 57.0f + "'", float14 == 57.0f);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1107296256 + "'", int19 == 1107296256);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray5, 10, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, 100, -1, 0]");
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        long long17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        long long19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        int int21 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        long long23 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (byte) 0);
        java.lang.Class<?> wildcardClass24 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, -56, 94, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 13322 + "'", short12 == (short) 13322);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1590165504L + "'", long17 == 1590165504L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1590165504L + "'", long19 == 1590165504L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1590165504L + "'", long23 == 1590165504L);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, 0);
        short short14 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, 0);
        float float16 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray4, 2560);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 0 + "'", short14 == (short) 0);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 4.6006E-41f);
        float float16 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        int int18 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 0);
        int int20 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 6553600, (float) 65536);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 63, -128, 0, 0]");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.1777545E-38f + "'", float16 == 1.1777545E-38f);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8404737 + "'", int18 == 8404737);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 16129 + "'", int20 == 16129);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(outputStream0, (float) 65535L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        int int1 = org.apache.commons.io.EndianUtils.swapInteger(97);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1627389952 + "'", int1 == 1627389952);
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        int int11 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 0);
        long long13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray4, 1107296256);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 0, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1107296256L + "'", long13 == 1107296256L);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, 32, (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        int int8 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 0);
        short short10 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, (int) (short) 1);
        long long12 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, (int) (byte) 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, (float) 13322);
        // The following exception was thrown during execution in test generation
        try {
            float float17 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 40, 80, 70]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 25600 + "'", short10 == (short) 25600);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 4284743681L + "'", long12 == 4284743681L);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        long long15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, (float) 1);
        long long20 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        short short22 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 13322, 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 0, -128, 63]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 4284743681L + "'", long15 == 4284743681L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 2147483649L + "'", long20 == 2147483649L);
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) 1 + "'", short22 == (short) 1);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        long long15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, (float) 1);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (short) 1, (-65536));
        float float23 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 65535, (float) 3749809639739359232L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 0, -1, -1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 4284743681L + "'", long15 == 4284743681L);
        org.junit.Assert.assertTrue(Float.isNaN(float23));
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 1, (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (byte) 1, 100);
        // The following exception was thrown during execution in test generation
        try {
            short short22 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 65536);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 65536 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 100, 0, 0, 0]");
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        // The following exception was thrown during execution in test generation
        try {
            float float11 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, (int) (short) 13322);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 0, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble(1.4199E-319d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.2057594037927936E16d + "'", double1 == 7.2057594037927936E16d);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, 3.143E-319d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, 6.9726E-41f);
        java.lang.Class<?> wildcardClass19 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[94, -62, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 13322 + "'", short12 == (short) 13322);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        long long15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, (float) 1);
        long long20 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        short short22 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 0, -128, 63]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 4284743681L + "'", long15 == 4284743681L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 2147483649L + "'", long20 == 2147483649L);
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) 1 + "'", short22 == (short) 1);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        float float8 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, (int) (short) 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, 0, (short) 2560);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray4, 1627389952);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 10, 100, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-3.03064E38f) + "'", float8 == (-3.03064E38f));
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(outputStream0, (float) (short) 200);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        int int11 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 0, (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (short) 1, (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            float float19 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, 1627389952);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 65535 + "'", int11 == 65535);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        int int1 = org.apache.commons.io.EndianUtils.swapInteger(8404737);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 20938752 + "'", int1 == 20938752);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        short short19 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 1);
        // The following exception was thrown during execution in test generation
        try {
            long long21 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray5, (-10223615));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(outputStream0, 256L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        long long17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        long long19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        int int21 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        short short23 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 97, (short) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) 0 + "'", short23 == (short) 0);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, (int) (byte) 0, (int) (byte) 1);
        int int17 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray4, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray4, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, 0);
        int int14 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            short short16 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, 51200);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 51200 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        float float1 = org.apache.commons.io.EndianUtils.swapFloat(4.6197E-41f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-65536.0f) + "'", float1 == (-65536.0f));
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(outputStream0, (long) 587202560);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) (short) 2612);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2612 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, -56, 94, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 13322 + "'", short12 == (short) 13322);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble((double) 1107296256L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.170863E-317d + "'", double1 == 4.170863E-317d);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) 25600);
        float float14 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, (float) 32L);
        int int19 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            float float21 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, 2560);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 0, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 57.0f + "'", float14 == 57.0f);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1107296256 + "'", int19 == 1107296256);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        float float1 = org.apache.commons.io.EndianUtils.swapFloat((float) 167772160);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.1587E-41f + "'", float1 == 1.1587E-41f);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, 3.3882004E-317d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 10);
        int int16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        short short18 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, 0.0f);
        int int23 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 0, 16777216);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 0, 1590165504);
        java.lang.Class<?> wildcardClass30 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, -56, 94, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 25600 + "'", short18 == (short) 25600);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(outputStream0, 28147497671065600L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        int int19 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long21 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray5, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-939524096) + "'", int19 == (-939524096));
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        int int8 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 0);
        short short10 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            float float12 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 100, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 25600 + "'", short10 == (short) 25600);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        float float8 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, (int) (short) 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) '4');
        int int13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 0);
        java.lang.Class<?> wildcardClass14 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 80, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-3.03064E38f) + "'", float8 == (-3.03064E38f));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        float float1 = org.apache.commons.io.EndianUtils.swapFloat(5.785736E-39f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 32831.0f + "'", float1 == 32831.0f);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble((double) 1.8414561E-38f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.085593124304E-312d + "'", double1 == 4.085593124304E-312d);
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        int int11 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 0, (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (short) 1, (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray4, 171180032, 1.41975E-319d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 171180032 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 65535 + "'", int11 == 65535);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        long long13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (byte) 100, 2560);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 16737280L + "'", long13 == 16737280L);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, 51200, (double) 4.6185E-41f);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 51200 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 12, 66, 0]");
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        float float1 = org.apache.commons.io.EndianUtils.swapFloat((float) 13172735);
        org.junit.Assert.assertTrue(Float.isNaN(float1));
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 4.6006E-41f);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, 51200, 5.34920744E-315d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 51200 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 63, -128, 0, 0]");
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        long long15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) 'a', (float) 72168644712333311L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 4284743681L + "'", long15 == 4284743681L);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) 25600);
        long long14 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 1107296256);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1107296256 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 100, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1113849856L + "'", long14 == 1113849856L);
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            short short20 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 872415232);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 872415232 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, -128, -65, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 13322 + "'", short12 == (short) 13322);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, 1677721600);
        // The following exception was thrown during execution in test generation
        try {
            long long17 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray4, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 0, 100]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        short short19 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 1);
        int int21 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) (byte) 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, 1677721600, (double) 72058143793741824L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1677721600 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, -128, 63]");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, (double) 8404737);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray4, 2560, (double) 6989586621679009792L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2560 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 0, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) 25600);
        float float14 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, (float) 32L);
        java.lang.Class<?> wildcardClass18 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 0, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 57.0f + "'", float14 == 57.0f);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 12, 66, 0]");
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        long long13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) (short) 256);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray5, 12550144);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, -128, 67, 0]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 16737280L + "'", long13 == 16737280L);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, 1677721600);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, 4.6185E-41f);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 256, (int) (short) -14336);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-65, -128, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        long long1 = org.apache.commons.io.EndianUtils.swapLong(32L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2305843009213693952L + "'", long1 == 2305843009213693952L);
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        long long15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, (float) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) 2305843009213693952L);
        // The following exception was thrown during execution in test generation
        try {
            short short23 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 655360);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 655360 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, 94, 63]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 4284743681L + "'", long15 == 4284743681L);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 10);
        int int16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        short short18 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, 0.0f);
        int int23 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 0, 16777216);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 171180032);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 25600 + "'", short18 == (short) 25600);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        long long13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 1);
        short short15 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            short short17 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 16737280L + "'", long13 == 16737280L);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 1 + "'", short15 == (short) 1);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        int int19 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 10, (float) 200L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-939524096) + "'", int19 == (-939524096));
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, (float) 100L);
        int int14 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, (int) (byte) 100, 6553600);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 51200 + "'", int14 == 51200);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        float float19 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double21 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray5, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + (-131072.0f) + "'", float19 == (-131072.0f));
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        float float15 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            float float17 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, (-939524096));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-3.03064E38f) + "'", float15 == (-3.03064E38f));
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        int int1 = org.apache.commons.io.EndianUtils.swapInteger((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 167772160 + "'", int1 == 167772160);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(outputStream0, (float) 51294);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray0, 16777216, (float) 1107296256L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 10);
        int int16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        short short18 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            double double23 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray5, 2560);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 25600 + "'", short18 == (short) 25600);
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        long long17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long19 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray5, 2560);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        int int8 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 0);
        short short10 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, (int) (short) 1);
        long long12 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray4, 873070592);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 100, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 25600 + "'", short10 == (short) 25600);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 4284743681L + "'", long12 == 4284743681L);
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            short short16 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (short) 200);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 200 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, 100, -1, 0]");
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            short short2 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray0, (int) (short) 200);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from byte/boolean array because \"data\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        int int8 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 0);
        short short10 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray4, (int) (short) 256, (long) 16803071);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 256 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 100, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 25600 + "'", short10 == (short) 25600);
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        float float17 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 200, (short) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 200 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, -56, 94, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 13322 + "'", short12 == (short) 13322);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 7.2057594E18f + "'", float17 == 7.2057594E18f);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        int int19 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            short short21 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-939524096) + "'", int19 == (-939524096));
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        long long13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) (short) 256);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray5, (-65536), (long) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -65536 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, -128, 67, 0]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 16737280L + "'", long13 == 16737280L);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 16803071);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 16803071 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) 2612);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 20938752, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[52, 10, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        long long1 = org.apache.commons.io.EndianUtils.swapLong(65536L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1099511627776L + "'", long1 == 1099511627776L);
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble(1.874767E-318d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.73070592E8d + "'", double1 == 8.73070592E8d);
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        int int11 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray4, 10, (double) 735212639168233472L);
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
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 1113849856L);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray5, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, -56, -124, 78]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, (double) 16803071);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, (float) 100L);
        float float14 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray4, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 100.0f + "'", float14 == 100.0f);
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray0, (int) (short) 13322);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble(4.154673E-317d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 66.0d + "'", double1 == 66.0d);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 1, (short) 13322);
        int int19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) (short) 1);
        java.lang.Class<?> wildcardClass20 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 10, 52, 66, 0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 13322 + "'", int19 == 13322);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        int int10 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray5, 1113849856);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 1113849856L);
        // The following exception was thrown during execution in test generation
        try {
            float float15 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 16129);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, -56, -124, 78]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble((double) (-43910092071895040L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.77444888683E-312d + "'", double1 == 4.77444888683E-312d);
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        int int10 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, 200, (double) 1.1587E-41f);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 200 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        int int11 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 171180032, (float) 416611827712L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 0, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 200, (float) 587202560);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 10);
        int int16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        short short18 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            float float20 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 6553600);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 25600 + "'", short18 == (short) 25600);
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long14 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        long long15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, (float) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, (-939524096), 2.7478E-319d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -939524096 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 0, -128, 63]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 4284743681L + "'", long15 == 4284743681L);
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 1, (short) 13322);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 32, (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 10, 52, 66, 0]");
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        short short19 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 1);
        java.lang.Class<?> wildcardClass20 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(outputStream0, 4.604E-41f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 10);
        int int16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        short short18 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, 0.0f);
        int int23 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 0, 16777216);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 25600, (int) (short) 2560);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 25600 + "'", short18 == (short) 25600);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        long long17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        long long19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long21 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray5, 51200);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 0, (float) (short) 100);
        short short16 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 65536L);
        // The following exception was thrown during execution in test generation
        try {
            float float21 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 872415232);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, -128, 71, 0]");
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) -14336 + "'", short16 == (short) -14336);
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        long long17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        long long19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        int int21 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        long long23 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (byte) 0);
        float float25 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            double double27 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray5, 1590165504);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1590165504L + "'", long23 == 1590165504L);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 7.2057594E18f + "'", float25 == 7.2057594E18f);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray5, (int) (short) 256, 12550144L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 256 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, -128, -65, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 13322 + "'", short12 == (short) 13322);
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        int int11 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 0, (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (short) 1, (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray4, 536870912, 2560L);
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
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        int int11 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 13172735, 8404737);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 0, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (-10223615));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -10223615 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, 0, 66]");
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        float float1 = org.apache.commons.io.EndianUtils.swapFloat((float) 65536L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.6017E-41f + "'", float1 == 4.6017E-41f);
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray4, 51294, (double) 2.8808E-41f);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 51294 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[10, 52, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 4.6006E-41f);
        float float16 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 0, 16777216);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, 1677721600, 8.1264E-320d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1677721600 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.1777545E-38f + "'", float16 == 1.1777545E-38f);
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 10);
        int int16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        short short18 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, 0.0f);
        int int23 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 0, 16777216);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 0, 1590165504);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, (int) (short) 13322, (double) 97.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13322 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, -56, 94, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 25600 + "'", short18 == (short) 25600);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (byte) 1, (short) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 65535, (short) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 65535 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, -1, -1, 0, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 4.6006E-41f);
        float float16 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 0, 16777216);
        // The following exception was thrown during execution in test generation
        try {
            long long21 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray5, 25600);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.1777545E-38f + "'", float16 == 1.1777545E-38f);
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 13172735, (short) 2612);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13172735 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, 0, 0]");
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) 25600);
        long long14 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray4, (-939524096), (double) 167772160);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -939524096 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 100, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1113849856L + "'", long14 == 1113849856L);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        short short19 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            float float21 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        long long12 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long14 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 2612);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 13322L + "'", long12 == 13322L);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        short short19 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray5, 200, 72058143793741824L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 200 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 1, (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (byte) 1, 100);
        // The following exception was thrown during execution in test generation
        try {
            float float22 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, (int) (short) 13322);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 100, 0, 0, 0]");
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        float float8 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, (-10223615), 1113849856);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 100, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-3.03064E38f) + "'", float8 == (-3.03064E38f));
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, (float) 100L);
        long long14 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            float float16 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, 655360);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1120403456L + "'", long14 == 1120403456L);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        // The following exception was thrown during execution in test generation
        try {
            int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (-939524096));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray5, (int) (short) 200);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, 100, -1, 0]");
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        float float15 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 51294, (int) (short) 2560);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-3.03064E38f) + "'", float15 == (-3.03064E38f));
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble((double) 2522015791327477760L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.168967E-317d + "'", double1 == 4.168967E-317d);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, (double) 2.8808E-41f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 10);
        int int16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        short short18 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, 0.0f);
        int int23 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, (int) (short) 200, 3.143E-319d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 200 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 25600 + "'", short18 == (short) 25600);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        long long1 = org.apache.commons.io.EndianUtils.swapLong((long) 2612);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3749809639739359232L + "'", long1 == 3749809639739359232L);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, 1677721600);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, 4.6185E-41f);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, (int) (short) 0, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            double double23 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray4, 16803071);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[97, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble((double) 3749809639739359232L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.874777E-318d + "'", double1 == 1.874777E-318d);
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, (float) 100L);
        float float14 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray4, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 100.0f + "'", float14 == 100.0f);
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        int int10 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) '4', (short) 2560);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 10);
        int int16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        short short18 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double20 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray5, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 25600 + "'", short18 == (short) 25600);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, (float) 100L);
        int int14 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray4, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray4, (int) (short) 2560);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1120403456 + "'", int14 == 1120403456);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray0, 171180032);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, (int) (byte) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray4, 0, (long) 873070592);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 10, 52]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) 25600);
        long long14 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            short short16 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 100, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1113849856L + "'", long14 == 1113849856L);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) 25600);
        long long14 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray4, 587202560, 5.09934032944E-312d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 587202560 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 100, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1113849856L + "'", long14 == 1113849856L);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray3, 536870912, (short) 256);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 536870912 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 10, 0]");
    }
}

