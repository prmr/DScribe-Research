import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest10 {

    public static boolean debug = false;

    @Test
    public void test5001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5001");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, 8.658487285112005E-39d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5002");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        long long10 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (-14336));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
    }

    @Test
    public void test5003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5003");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        float float8 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, (int) (short) 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) '4');
        float float13 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, 0);
        short short15 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, 1);
        // The following exception was thrown during execution in test generation
        try {
            short short17 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, 872415232);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 872415232 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 80, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-3.03064E38f) + "'", float8 == (-3.03064E38f));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 52.0f + "'", float13 == 52.0f);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 20480 + "'", short15 == (short) 20480);
    }

    @Test
    public void test5004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5004");
        long long1 = org.apache.commons.io.EndianUtils.swapLong(14636698788954112L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 13312L + "'", long1 == 13312L);
    }

    @Test
    public void test5005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5005");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(outputStream0, (float) (-2143354624L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5006");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5007");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 10, (byte) -1, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, 0, (short) 2560);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray4, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 10, -1, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4294904420L + "'", long6 == 4294904420L);
    }

    @Test
    public void test5008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5008");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        int int8 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 0);
        short short10 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, 16777216, (short) 52);
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
    public void test5009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5009");
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
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 32, (short) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 5");
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
    public void test5010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5010");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble(2.719097546584E-312d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.7857357501444134E-39d + "'", double1 == 5.7857357501444134E-39d);
    }

    @Test
    public void test5011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5011");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 1113849856L);
        short short15 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, 4.531E-41f);
        // The following exception was thrown during execution in test generation
        try {
            long long20 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 872415232);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[78, 126, 0, 0, 78]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 10 + "'", short15 == (short) 10);
    }

    @Test
    public void test5012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5012");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 1113849856L);
        short short15 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (short) 13322, (int) (short) 25600);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, -56, -124, 78]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 10 + "'", short15 == (short) 10);
    }

    @Test
    public void test5013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5013");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, (int) (byte) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 2560, (float) 1120403456);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test5014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5014");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (byte) 1, 1);
        short short13 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (-1.0f));
        int int18 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 536870912, (short) 25600);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 536870912 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, 0, -128, -65]");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 1 + "'", short13 == (short) 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test5015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5015");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        short short19 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 1);
        int int21 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) (byte) 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 1.0f);
        float float26 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long28 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray5, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, -128, 63]");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + (-0.0f) + "'", float26 == (-0.0f));
    }

    @Test
    public void test5016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5016");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 10);
        int int16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        short short18 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, 0.0f);
        int int23 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 0, 16777216);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (-10223606));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray5, 655360, (long) 13141070);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 655360 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 10, 0, 100, -1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 25600 + "'", short18 == (short) 25600);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test5017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5017");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 10);
        int int16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        short short18 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray5, 1113849856, (long) 13141070);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1113849856 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 25600 + "'", short18 == (short) 25600);
    }

    @Test
    public void test5018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5018");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(outputStream0, (int) (short) -16512);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5019");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (byte) 1, 1);
        short short13 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (-1.0f));
        int int18 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long20 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray5, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, 0, -128, -65]");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 1 + "'", short13 == (short) 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test5020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5020");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, (double) 5.7217554E13f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5021");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, (float) 100L);
        long long14 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray4, (int) (short) 100, (double) 4.604E-41f);
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
    public void test5022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5022");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        int int15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 1);
        short short17 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (-939510774));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -939510774 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25600 + "'", int15 == 25600);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 1 + "'", short17 == (short) 1);
    }

    @Test
    public void test5023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5023");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        int int10 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 10, 7.1873E-41f);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test5024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5024");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        long long13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 1);
        short short15 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            short short17 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 256);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 256 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 16737280L + "'", long13 == 16737280L);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 1 + "'", short15 == (short) 1);
    }

    @Test
    public void test5025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5025");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) 25600);
        float float14 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, 0);
        long long16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, 13322);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 20480, (float) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[10, 52, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 57.0f + "'", float14 == 57.0f);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1113849856L + "'", long16 == 1113849856L);
    }

    @Test
    public void test5026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5026");
        float float1 = org.apache.commons.io.EndianUtils.swapFloat((float) 8404737);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.508137E-38f + "'", float1 == 3.508137E-38f);
    }

    @Test
    public void test5027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5027");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        long long15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, (float) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long20 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 52);
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
    public void test5028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5028");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5029");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, 6.9726E-41f);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, 200, (double) (-32705L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 200 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[94, -62, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 13322 + "'", short12 == (short) 13322);
    }

    @Test
    public void test5030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5030");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        long long13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, 16129, 1.061629821E-314d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 16129 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
    }

    @Test
    public void test5031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5031");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        long long15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, (float) 1);
        long long20 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        short short22 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        float float24 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            float float26 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, (-16777215));
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
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 1.0f + "'", float24 == 1.0f);
    }

    @Test
    public void test5032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5032");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 10);
        int int16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        short short18 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, 0.0f);
        float float23 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            short short25 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 167772160);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 167772160 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 25600 + "'", short18 == (short) 25600);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.0f + "'", float23 == 0.0f);
    }

    @Test
    public void test5033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5033");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        int int15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 1);
        short short17 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (byte) 1, (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1342177280, (float) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25600 + "'", int15 == 25600);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 1 + "'", short17 == (short) 1);
    }

    @Test
    public void test5034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5034");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 1113849856L);
        short short15 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        short short17 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 200, (short) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 200 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, -56, -124, 78]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 10 + "'", short15 == (short) 10);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 10 + "'", short17 == (short) 10);
    }

    @Test
    public void test5035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5035");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray0, 8406784);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5036");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, 1677721600);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, 4.6185E-41f);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 0, (short) (byte) 100);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, 0, (short) 2612);
        // The following exception was thrown during execution in test generation
        try {
            float float26 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[52, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test5037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5037");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (byte) 0, (short) 13322);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 8406784, (int) (short) 52);
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
    public void test5038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5038");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(outputStream0, (float) 8406784);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5039");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(outputStream0, 16777471);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5040");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        float float8 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, (int) (short) 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) '4');
        int int13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray4, (int) (byte) 0, (double) 20905984);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-3.03064E38f) + "'", float8 == (-3.03064E38f));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5041");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 10);
        int int16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        short short18 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) (byte) 100);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 0, 10);
        // The following exception was thrown during execution in test generation
        try {
            short short26 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (short) 2612);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2612 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 25600 + "'", short18 == (short) 25600);
    }

    @Test
    public void test5042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5042");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        int int11 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 0, (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, (int) (short) 0, 32);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 536870912, 3.4716E-41f);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[32, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 65535 + "'", int11 == 65535);
    }

    @Test
    public void test5043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5043");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        float float8 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, (int) (short) 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) '4');
        int int13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 0);
        short short15 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 171180032);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 171180032 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 80, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-3.03064E38f) + "'", float8 == (-3.03064E38f));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 20480 + "'", short15 == (short) 20480);
    }

    @Test
    public void test5044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5044");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray0, (int) (short) -1, (double) (short) 256);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot store to byte/boolean array because \"data\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5045");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        long long15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, (float) 1);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (short) 1, (-65536));
        short short23 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (short) 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray5, 20938752, (long) (short) -16512);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 20938752 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, 0, -1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 4284743681L + "'", long15 == 4284743681L);
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) 1 + "'", short23 == (short) 1);
    }

    @Test
    public void test5046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5046");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, (int) (byte) 0, (int) (byte) 1);
        int int17 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray4, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray4, 13107200, (long) 1342177280);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13107200 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test5047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5047");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) 2612);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            short short21 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (short) -14336);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -14336 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
    }

    @Test
    public void test5048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5048");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, 0, (short) 200);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray4, (int) (short) -32577);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-56, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test5049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5049");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 13322);
        float float22 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, (int) (short) 1);
        int int24 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) (byte) 1);
        short short26 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (byte) 1);
        java.lang.Class<?> wildcardClass27 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 100.0004f + "'", float22 == 100.0004f);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertTrue("'" + short26 + "' != '" + (short) 52 + "'", short26 == (short) 52);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test5050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5050");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, (int) (byte) 0, (int) (byte) 1);
        int int17 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray4, (int) (byte) 0);
        short short19 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            short short21 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, 51294);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 51294 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
    }

    @Test
    public void test5051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5051");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray5, (int) (short) 16256, (long) 16803071);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 16256 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, -128, -65, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 13322 + "'", short12 == (short) 13322);
    }

    @Test
    public void test5052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5052");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        short short19 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 1);
        // The following exception was thrown during execution in test generation
        try {
            long long21 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray5, 8404737);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
    }

    @Test
    public void test5053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5053");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 1113849856L);
        short short15 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, 4.531E-41f);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (-2134900737), (float) 12550144L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[78, 126, 0, 0, 78]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 10 + "'", short15 == (short) 10);
    }

    @Test
    public void test5054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5054");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble((double) 9.2E-44f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.14455E-317d + "'", double1 == 4.14455E-317d);
    }

    @Test
    public void test5055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5055");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        long long19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 1);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 13322);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray5, 0, (long) (short) 20480);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 80, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1120403456L + "'", long19 == 1120403456L);
    }

    @Test
    public void test5056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5056");
        short short1 = org.apache.commons.io.EndianUtils.swapShort((short) 13312);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 52 + "'", short1 == (short) 52);
    }

    @Test
    public void test5057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5057");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        short short19 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 1);
        int int21 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) (byte) 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 1.0f);
        float float26 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long28 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray5, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, -128, 63]");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + (-0.0f) + "'", float26 == (-0.0f));
    }

    @Test
    public void test5058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5058");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        int int15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 1);
        short short17 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, (-10223606), (double) 97L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -10223606 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25600 + "'", int15 == 25600);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 1 + "'", short17 == (short) 1);
    }

    @Test
    public void test5059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5059");
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
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (-2143354624), (int) (short) 1);
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
    public void test5060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5060");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 1113849856L);
        short short15 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        int int17 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 587202560, (float) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, -56, -124, 78]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 10 + "'", short15 == (short) 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1317324800 + "'", int17 == 1317324800);
    }

    @Test
    public void test5061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5061");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(outputStream0, (float) (-2143354624));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5062");
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
        short short31 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long33 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray5, (int) (short) -14336);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, -56, 94, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 25600 + "'", short18 == (short) 25600);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + short31 + "' != '" + (short) -14336 + "'", short31 == (short) -14336);
    }

    @Test
    public void test5063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5063");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        long long17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        long long19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (short) 25600, 51266);
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
    public void test5064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5064");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        short short19 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 1);
        int int21 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) (byte) 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 1.0f);
        float float26 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        long long28 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 1);
        // The following exception was thrown during execution in test generation
        try {
            double double30 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray5, 8404737);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, -128, 63]");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + (-0.0f) + "'", float26 == (-0.0f));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1065353216L + "'", long28 == 1065353216L);
    }

    @Test
    public void test5065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5065");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        int int12 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray5, 1317324800);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
    }

    @Test
    public void test5066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5066");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(outputStream0, 200L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5067");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        int int8 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 0);
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, (-16777215), 16129);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test5068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5068");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        int int11 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 2560);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2560 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 65535 + "'", int11 == 65535);
    }

    @Test
    public void test5069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5069");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        long long17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        long long19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        int int21 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (short) 1, (int) (short) 100);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray5, (int) (short) -14336, (long) 171180232);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -14336 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 13322 + "'", short12 == (short) 13322);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1590165504L + "'", long17 == 1590165504L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1590165504L + "'", long19 == 1590165504L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test5070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5070");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(outputStream0, 1342177280);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5071");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        long long19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 1);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 13322);
        // The following exception was thrown during execution in test generation
        try {
            long long24 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray5, 1627389952);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1120403456L + "'", long19 == 1120403456L);
    }

    @Test
    public void test5072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5072");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 1, (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (byte) 1, 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, 1113849856, (double) 6829708834907357184L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1113849856 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 100, 0, 0, 0]");
    }

    @Test
    public void test5073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5073");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 10);
        int int16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 51294);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test5074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5074");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, 7.96058074E-315d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5075");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        short short19 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 1);
        int int21 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) (byte) 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 1.0f);
        float float26 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        long long28 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, 66, (double) 1.4E-43f);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 66 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, -128, 63]");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + (-0.0f) + "'", float26 == (-0.0f));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1065353216L + "'", long28 == 1065353216L);
    }

    @Test
    public void test5076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5076");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) 25600);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 655360);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 655360 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 100, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test5077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5077");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        int int8 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            short short10 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, 13322);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13322 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 100, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test5078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5078");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        int int8 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 0);
        short short10 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, (int) (short) 1);
        long long12 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, (int) (byte) 0);
        int int14 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 1);
        // The following exception was thrown during execution in test generation
        try {
            short short16 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, (int) (short) -14336);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -14336 out of bounds for length 4");
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
    public void test5079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5079");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        short short19 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 1);
        int int21 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) (byte) 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 1.0f);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) (byte) -1);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray5, 0, 3355443200L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, -56, 0]");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test5080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5080");
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
            long long25 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray5, 4685824);
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1590165504 + "'", int23 == 1590165504);
    }

    @Test
    public void test5081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5081");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        long long12 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 0);
        short short14 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 2560);
        int int19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 10, (float) (-16777215));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 10, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 13322L + "'", long12 == 13322L);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 13322 + "'", short14 == (short) 13322);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test5082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5082");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, 1677721600);
        int int17 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray4, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, (int) (short) 2612);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2612 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 0, 100]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1677721600 + "'", int17 == 1677721600);
    }

    @Test
    public void test5083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5083");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble((double) 4.6219E-41f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8576064137E-314d + "'", double1 == 1.8576064137E-314d);
    }

    @Test
    public void test5084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5084");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            float float2 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5085");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 1, (short) 13322);
        // The following exception was thrown during execution in test generation
        try {
            long long19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 1120403456);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 10, 52, 66, 0]");
    }

    @Test
    public void test5086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5086");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, (double) 7.1845E-41f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5087");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        long long13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 1);
        int int15 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 0);
        long long17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 1);
        java.lang.Class<?> wildcardClass18 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 16737280L + "'", long13 == 16737280L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10223615) + "'", int15 == (-10223615));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 16737280L + "'", long17 == 16737280L);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5088");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (byte) 0, (short) 13322);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 10);
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
    public void test5089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5089");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) 52);
        // The following exception was thrown during execution in test generation
        try {
            long long13 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray5, (int) (short) 2560);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[52, 0, 0, 0, 0]");
    }

    @Test
    public void test5090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5090");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 10);
        int int16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        short short18 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 25600 + "'", short18 == (short) 25600);
    }

    @Test
    public void test5091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5091");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        long long17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        int int19 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 0);
        float float21 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 100, 4.6219E-41f);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, -56, 94, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 13322 + "'", short12 == (short) 13322);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1590165504L + "'", long17 == 1590165504L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1590165504 + "'", int19 == 1590165504);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 8.704283E-39f + "'", float21 == 8.704283E-39f);
    }

    @Test
    public void test5092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5092");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, (double) 6.9703E-41f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5093");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        float float8 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, (int) (short) 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) '4');
        int int13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, (-14336));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test5094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5094");
        int int1 = org.apache.commons.io.EndianUtils.swapInteger(8406784);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4685824 + "'", int1 == 4685824);
    }

    @Test
    public void test5095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5095");
        float float1 = org.apache.commons.io.EndianUtils.swapFloat((float) 2612L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 5.890124E-39f + "'", float1 == 5.890124E-39f);
    }

    @Test
    public void test5096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5096");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 10);
        int int16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) (short) 0);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 0, 65536);
        // The following exception was thrown during execution in test generation
        try {
            float float24 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 655360);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test5097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5097");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        int int11 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, 0, (short) 256);
        int int16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long18 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray4, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test5098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5098");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 1113849856L);
        short short15 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        short short17 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, (-10223606), 2.74784E-319d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -10223606 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, -56, -124, 78]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 10 + "'", short15 == (short) 10);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 10 + "'", short17 == (short) 10);
    }

    @Test
    public void test5099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5099");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        int int12 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        float float14 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            short short16 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 167772160);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 167772160 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 13322 + "'", int12 == 13322);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 7.3E-44f + "'", float14 == 7.3E-44f);
    }

    @Test
    public void test5100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5100");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 0, 587202560);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 200, (short) 13312);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 200 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, 35, 0]");
    }

    @Test
    public void test5101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5101");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(outputStream0, (float) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5102");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray0, 80);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5103");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (byte) 1, 1);
        short short13 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 97, (float) (-939510774));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 1 + "'", short13 == (short) 1);
    }

    @Test
    public void test5104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5104");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 4.6006E-41f);
        float float16 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        float float18 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, (int) (short) 0);
        int int20 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 1099511627776L);
        short short25 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            short short27 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 12550144);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 12550144 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, -128, 83, 0]");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.1777545E-38f + "'", float16 == 1.1777545E-38f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 1.1777545E-38f + "'", float18 == 1.1777545E-38f);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32831 + "'", int20 == 32831);
        org.junit.Assert.assertTrue("'" + short25 + "' != '" + (short) 0 + "'", short25 == (short) 0);
    }

    @Test
    public void test5105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5105");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 4.6006E-41f);
        float float16 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        float float18 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, (int) (short) 0);
        int int20 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            short short22 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 655360);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 655360 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 63, -128, 0, 0]");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.1777545E-38f + "'", float16 == 1.1777545E-38f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 1.1777545E-38f + "'", float18 == 1.1777545E-38f);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32831 + "'", int20 == 32831);
    }

    @Test
    public void test5106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5106");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 4.6006E-41f);
        float float16 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        float float18 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, (int) (short) 0);
        float float20 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 63, -128, 0, 0]");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.1777545E-38f + "'", float16 == 1.1777545E-38f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 1.1777545E-38f + "'", float18 == 1.1777545E-38f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.1777545E-38f + "'", float20 == 1.1777545E-38f);
    }

    @Test
    public void test5107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5107");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 13322);
        short short22 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            float float24 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, (int) (short) -16512);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) 13322 + "'", short22 == (short) 13322);
    }

    @Test
    public void test5108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5108");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 10);
        int int16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        short short18 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, 0.0f);
        float float23 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long25 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray5, 2560);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 25600 + "'", short18 == (short) 25600);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.0f + "'", float23 == 0.0f);
    }

    @Test
    public void test5109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5109");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        long long15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, (float) 1);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (short) 1, (-65536));
        short short23 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (short) 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            float float28 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 1342177280);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, 0, -1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 4284743681L + "'", long15 == 4284743681L);
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) 1 + "'", short23 == (short) 1);
    }

    @Test
    public void test5110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5110");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, (double) 66.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5111");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        int int15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 1);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (byte) 1, (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) ' ', (float) 872415232);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25600 + "'", int15 == 25600);
    }

    @Test
    public void test5112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5112");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 1113849856L);
        short short15 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        short short17 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray5, 51200, (long) (-939524096));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 51200 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, -56, -124, 78]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 10 + "'", short15 == (short) 10);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 10 + "'", short17 == (short) 10);
    }

    @Test
    public void test5113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5113");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 13322);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray5, 65536, (long) (short) 2612);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 65536 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, -56, 66]");
    }

    @Test
    public void test5114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5114");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            short short13 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 0, 0, 0]");
    }

    @Test
    public void test5115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5115");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        long long17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        long long19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        int int21 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        long long23 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (byte) 0);
        int int25 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 171180232);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 171180232 out of bounds for length 5");
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1590165504 + "'", int25 == 1590165504);
    }

    @Test
    public void test5116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5116");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) (-1L));
        int int20 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long22 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 200);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test5117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5117");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        long long13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 1);
        int int15 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 0);
        long long17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double19 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray5, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 16737280L + "'", long13 == 16737280L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10223615) + "'", int15 == (-10223615));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 16737280L + "'", long17 == 16737280L);
    }

    @Test
    public void test5118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5118");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        float float8 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, (int) (short) 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) '4');
        int int13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 0);
        short short15 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray4, 13141070, (long) 16803071);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13141070 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 80, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-3.03064E38f) + "'", float8 == (-3.03064E38f));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 20480 + "'", short15 == (short) 20480);
    }

    @Test
    public void test5119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5119");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        short short19 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 100);
        short short24 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        int int26 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, (int) (short) 80, (double) 16737280);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 80 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
        org.junit.Assert.assertTrue("'" + short24 + "' != '" + (short) 100 + "'", short24 == (short) 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
    }

    @Test
    public void test5120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5120");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 4.6006E-41f);
        float float16 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        float float18 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, (int) (short) 0);
        int int20 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 2612);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 63, -128, 0, 0]");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.1777545E-38f + "'", float16 == 1.1777545E-38f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 1.1777545E-38f + "'", float18 == 1.1777545E-38f);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32831 + "'", int20 == 32831);
    }

    @Test
    public void test5121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5121");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 13322);
        short short22 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        int int24 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) (short) 1);
        int int26 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 0);
        java.lang.Class<?> wildcardClass27 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) 13322 + "'", short22 == (short) 13322);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-939510774) + "'", int26 == (-939510774));
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test5122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5122");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        int int11 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 0, (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, (int) (short) 0, 32);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray4, (int) (short) -32705, 220185793396736L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -32705 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[32, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 65535 + "'", int11 == 65535);
    }

    @Test
    public void test5123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5123");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        long long17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        long long19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        int int21 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        long long23 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (byte) 0);
        int int25 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1590165504, (float) 8437504);
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1590165504 + "'", int25 == 1590165504);
    }

    @Test
    public void test5124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5124");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        short short19 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
    }

    @Test
    public void test5125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5125");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        int int11 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, 0, (short) 256);
        int int16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray4, (int) '#', (long) 6553600);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 4");
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
    public void test5126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5126");
        long long1 = org.apache.commons.io.EndianUtils.swapLong((long) (-1040187392));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 837518622719L + "'", long1 == 837518622719L);
    }

    @Test
    public void test5127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5127");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        int int19 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        float float21 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long23 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (-10223615));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-939524096) + "'", int19 == (-939524096));
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + (-131072.0f) + "'", float21 == (-131072.0f));
    }

    @Test
    public void test5128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5128");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(outputStream0, (float) (short) -32705);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5129");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        long long13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 1);
        int int15 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 16737280L + "'", long13 == 16737280L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10223615) + "'", int15 == (-10223615));
    }

    @Test
    public void test5130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5130");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 4.6006E-41f);
        float float16 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        float float18 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, (int) (short) 0);
        int int20 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 1099511627776L);
        long long25 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            float float27 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 13107200);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, -128, 83, 0]");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.1777545E-38f + "'", float16 == 1.1777545E-38f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 1.1777545E-38f + "'", float18 == 1.1777545E-38f);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32831 + "'", int20 == 32831);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1400897536L + "'", long25 == 1400897536L);
    }

    @Test
    public void test5131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5131");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        int int15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 1);
        float float17 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            double double19 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray5, (-1040187392));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25600 + "'", int15 == 25600);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + (-3.03064E38f) + "'", float17 == (-3.03064E38f));
    }

    @Test
    public void test5132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5132");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 10);
        int int16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        short short18 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long23 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray5, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 10 + "'", short18 == (short) 10);
    }

    @Test
    public void test5133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5133");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        short short19 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (byte) 1);
        long long21 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double23 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray5, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1120403456L + "'", long21 == 1120403456L);
    }

    @Test
    public void test5134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5134");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray0, 1317324800);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5135");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        // The following exception was thrown during execution in test generation
        try {
            long long13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
    }

    @Test
    public void test5136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5136");
        long long1 = org.apache.commons.io.EndianUtils.swapLong((long) 1317324800);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 56440465884446720L + "'", long1 == 56440465884446720L);
    }

    @Test
    public void test5137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5137");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 10);
        int int16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        short short18 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) (byte) 100);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 0, 10);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 0, 20905984);
        // The following exception was thrown during execution in test generation
        try {
            double double29 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray5, (int) (short) 13312);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 63, 1, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 25600 + "'", short18 == (short) 25600);
    }

    @Test
    public void test5138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5138");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        long long13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 1);
        float float15 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 0, 167798015);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 25666, 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 100, 0, 10, 0]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 16737280L + "'", long13 == 16737280L);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-3.03064E38f) + "'", float15 == (-3.03064E38f));
    }

    @Test
    public void test5139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5139");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        int int8 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 0);
        short short10 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, (int) (short) 1);
        long long12 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, (int) (byte) 0);
        int int14 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 1);
        int int16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            float float18 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, 16803071);
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test5140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5140");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, (double) 5.1402E-41f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5141");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(outputStream0, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5142");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(outputStream0, (-4647433340469641217L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5143");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, (float) 100L);
        long long14 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        java.lang.Class<?> wildcardClass15 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1120403456L + "'", long14 == 1120403456L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5144");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 1, (float) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray5, 12550144, 2305843009213693952L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 12550144 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, 0, -128, -65]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 13322 + "'", short12 == (short) 13322);
    }

    @Test
    public void test5145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5145");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(outputStream0, 587202560L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5146");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) 25600);
        int int14 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray4, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, (int) (short) 1, 65536);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 0, 1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1113849856 + "'", int14 == 1113849856);
    }

    @Test
    public void test5147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5147");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, 1677721600);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray4, 536870912);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 0, 100]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test5148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5148");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, 1677721600);
        long long17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 10240, (-10223615));
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
    public void test5149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5149");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(outputStream0, (float) 56576470318841855L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5150");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 13322);
        short short22 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        int int24 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long26 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray5, 872415232);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) 13322 + "'", short22 == (short) 13322);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
    }

    @Test
    public void test5151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5151");
        long long1 = org.apache.commons.io.EndianUtils.swapLong((long) (-10223606));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 720686991053684735L + "'", long1 == 720686991053684735L);
    }

    @Test
    public void test5152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5152");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble((double) (short) -32577);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.372620977E-315d + "'", double1 == 5.372620977E-315d);
    }

    @Test
    public void test5153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5153");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (byte) 1, (short) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            long long15 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray5, 20905984);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, -1, -1, 0, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
    }

    @Test
    public void test5154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5154");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble(1.41975E-319d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 256.0d + "'", double1 == 256.0d);
    }

    @Test
    public void test5155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5155");
        long long1 = org.apache.commons.io.EndianUtils.swapLong((long) 35);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2522015791327477760L + "'", long1 == 2522015791327477760L);
    }

    @Test
    public void test5156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5156");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, 0);
        short short14 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, 1, (short) 13322);
        short short19 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray4, 8667658, (long) (short) 16256);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 8667658 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 10, 52, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 0 + "'", short14 == (short) 0);
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 2560 + "'", short19 == (short) 2560);
    }

    @Test
    public void test5157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5157");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        float float8 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, (int) (short) 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) '4');
        float float13 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray4, 80, 35L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 80 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 80, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-3.03064E38f) + "'", float8 == (-3.03064E38f));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 52.0f + "'", float13 == 52.0f);
    }

    @Test
    public void test5158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5158");
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
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 1.1576E-41f);
        short short30 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 1);
        // The following exception was thrown during execution in test generation
        try {
            double double32 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray5, (-16777215));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 69, 32, 0, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 13322 + "'", short12 == (short) 13322);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1590165504L + "'", long17 == 1590165504L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1590165504L + "'", long19 == 1590165504L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1590165504L + "'", long23 == 1590165504L);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 7.2057594E18f + "'", float25 == 7.2057594E18f);
        org.junit.Assert.assertTrue("'" + short30 + "' != '" + (short) 8261 + "'", short30 == (short) 8261);
    }

    @Test
    public void test5159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5159");
        float float1 = org.apache.commons.io.EndianUtils.swapFloat(1.4E-43f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9.444733E21f + "'", float1 == 9.444733E21f);
    }

    @Test
    public void test5160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5160");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 10);
        int int16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        short short18 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) (byte) 1);
        long long23 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (byte) 0);
        int int25 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            short short27 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 13322);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13322 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 10 + "'", short18 == (short) 10);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 4284743681L + "'", long23 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-10223615) + "'", int25 == (-10223615));
    }

    @Test
    public void test5161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5161");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 10);
        int int16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        short short18 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) (byte) 1);
        long long23 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (byte) 0);
        int int25 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 16129, (short) 80);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 16129 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 10 + "'", short18 == (short) 10);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 4284743681L + "'", long23 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-10223615) + "'", int25 == (-10223615));
    }

    @Test
    public void test5162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5162");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        long long15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, (float) 1);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (short) 1, (-65536));
        short short23 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double25 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray5, (int) (short) 13322);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 0, -1, -1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 4284743681L + "'", long15 == 4284743681L);
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) 1 + "'", short23 == (short) 1);
    }

    @Test
    public void test5163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5163");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 10, (byte) -1, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long8 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray4, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[100, 10, -1, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4294904420L + "'", long6 == 4294904420L);
    }

    @Test
    public void test5164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5164");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) (byte) 10);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, 4.6219E-41f);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, 13172735, (double) 4.6017E-41f);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13172735 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-41, -128, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
    }

    @Test
    public void test5165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5165");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(outputStream0, 4783948704174309376L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5166");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, (float) 100L);
        long long14 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        short short16 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 16803071);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 16803071 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1120403456L + "'", long14 == 1120403456L);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 0 + "'", short16 == (short) 0);
    }

    @Test
    public void test5167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5167");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) (byte) 10);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, 4.6219E-41f);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-41, -128, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
    }

    @Test
    public void test5168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5168");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 4.6006E-41f);
        float float16 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        float float18 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, (int) (short) 0);
        int int20 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            float float22 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 2560);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 63, -128, 0, 0]");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.1777545E-38f + "'", float16 == 1.1777545E-38f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 1.1777545E-38f + "'", float18 == 1.1777545E-38f);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32831 + "'", int20 == 32831);
    }

    @Test
    public void test5169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5169");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        long long12 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 0);
        short short14 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 2560);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (-1), 8404737);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 10, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 13322L + "'", long12 == 13322L);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 13322 + "'", short14 == (short) 13322);
    }

    @Test
    public void test5170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5170");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 10);
        int int16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        short short18 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) (byte) 100);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 0, 10);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 0, 20905984);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 63, 1, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 25600 + "'", short18 == (short) 25600);
    }

    @Test
    public void test5171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5171");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        int int10 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 256);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 256 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test5172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5172");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, 1677721600);
        int int17 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray4, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, 1627389952, (short) 256);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1627389952 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 0, 100]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1677721600 + "'", int17 == 1677721600);
    }

    @Test
    public void test5173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5173");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        long long19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 1);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 13322);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 13322, (short) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13322 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1120403456L + "'", long19 == 1120403456L);
    }

    @Test
    public void test5174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5174");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(outputStream0, 3.70225E-39f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5175");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        short short19 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 1);
        int int21 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            double double23 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray5, 167772160);
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
    public void test5176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5176");
        float float1 = org.apache.commons.io.EndianUtils.swapFloat((float) 144115183780888576L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.29E-43f + "'", float1 == 1.29E-43f);
    }

    @Test
    public void test5177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5177");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        long long17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        int int19 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 0);
        float float21 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 1);
        // The following exception was thrown during execution in test generation
        try {
            long long23 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray5, 1590165504);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, -56, 94, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 13322 + "'", short12 == (short) 13322);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1590165504L + "'", long17 == 1590165504L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1590165504 + "'", int19 == 1590165504);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 8.704283E-39f + "'", float21 == 8.704283E-39f);
    }

    @Test
    public void test5178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5178");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, (float) 100L);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, 0, (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, (-65536));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -65536 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, -1, -56, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test5179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5179");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 4.6006E-41f);
        float float16 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        float float18 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, (int) (short) 0);
        int int20 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 63, -128, 0, 0]");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.1777545E-38f + "'", float16 == 1.1777545E-38f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 1.1777545E-38f + "'", float18 == 1.1777545E-38f);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32831 + "'", int20 == 32831);
    }

    @Test
    public void test5180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5180");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, 0);
        short short14 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, 1, (short) 13322);
        short short19 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            double double21 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray4, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 10, 52, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 0 + "'", short14 == (short) 0);
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 2560 + "'", short19 == (short) 2560);
    }

    @Test
    public void test5181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5181");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 1, (short) 13322);
        int int19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 0, (int) (short) 10);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 1, 4.7445E-41f);
        int int27 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 0);
        java.lang.Class<?> wildcardClass28 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 66, -124, 0, 0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 13322 + "'", int19 == 13322);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 8667658 + "'", int27 == 8667658);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test5182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5182");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(outputStream0, 8.7241523E8f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5183");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, 1677721600);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (-65536));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, (-939524096), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, -1, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test5184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5184");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 1, (float) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 16777216, 2.4603495E-32f);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, 0, -128, -65]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 13322 + "'", short12 == (short) 13322);
    }

    @Test
    public void test5185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5185");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, (double) 110234630619136L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5186");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(outputStream0, (float) 13322);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5187");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 0, (float) (short) 100);
        short short16 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 65536L);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 1342177280);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (-2143354624));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, -96, 78]");
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) -14336 + "'", short16 == (short) -14336);
    }

    @Test
    public void test5188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5188");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        long long13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, (int) (short) 10, 200.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
    }

    @Test
    public void test5189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5189");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        long long13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) (short) 256);
        float float18 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            double double20 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray5, 1065353216);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, -128, 67, 0]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 16737280L + "'", long13 == 16737280L);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 256.0f + "'", float18 == 256.0f);
    }

    @Test
    public void test5190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5190");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        short short19 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 1);
        int int21 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) (byte) 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 1.0f);
        float float26 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, -128, 63]");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + (-0.0f) + "'", float26 == (-0.0f));
    }

    @Test
    public void test5191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5191");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray0, (int) (short) 2560, 51266);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5192");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        long long13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 1);
        short short15 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (-14336));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 16737280L + "'", long13 == 16737280L);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 1 + "'", short15 == (short) 1);
    }

    @Test
    public void test5193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5193");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        short short19 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 1);
        int int21 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) (byte) 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 1.0f);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) (byte) -1);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            float float32 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 1113849856);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 0, 0, -128, 63]");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test5194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5194");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 0, (float) (short) 100);
        short short16 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 65536L);
        int int21 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, 2612, (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2612 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, -128, 71, 0]");
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) -14336 + "'", short16 == (short) -14336);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4685824 + "'", int21 == 4685824);
    }

    @Test
    public void test5195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5195");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 1, (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (byte) 1, 100);
        short short22 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long24 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray5, (int) (short) -32577);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 100, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) 25600 + "'", short22 == (short) 25600);
    }

    @Test
    public void test5196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5196");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (byte) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 13322);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13322 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 0, 0, 0]");
    }

    @Test
    public void test5197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5197");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 4.6006E-41f);
        float float16 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        float float18 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, (int) (short) 0);
        float float20 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (-65536), (-1040187392));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 63, -128, 0, 0]");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.1777545E-38f + "'", float16 == 1.1777545E-38f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 1.1777545E-38f + "'", float18 == 1.1777545E-38f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.1777545E-38f + "'", float20 == 1.1777545E-38f);
    }

    @Test
    public void test5198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5198");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        long long17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        long long19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        int int21 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (short) 1, (int) (short) 100);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 0.0f);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (byte) 0, 194);
        // The following exception was thrown during execution in test generation
        try {
            float float32 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 1120403456);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-62, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 13322 + "'", short12 == (short) 13322);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1590165504L + "'", long17 == 1590165504L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1590165504L + "'", long19 == 1590165504L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test5199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5199");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, 1677721600);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray4, 6553600, (long) 1627389952);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6553600 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 0, 100]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test5200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5200");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, 1677721600);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, 4.6185E-41f);
        short short20 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray4, 200);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-65, -128, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) -32577 + "'", short20 == (short) -32577);
    }

    @Test
    public void test5201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5201");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(outputStream0, 2.8808E-41f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5202");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        long long17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            float float19 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 167798015);
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
    public void test5203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5203");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        long long15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, (float) 1);
        // The following exception was thrown during execution in test generation
        try {
            short short20 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (-10223606));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -10223606 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 0, -128, 63]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 4284743681L + "'", long15 == 4284743681L);
    }

    @Test
    public void test5204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5204");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray0, 20905984, (float) 12550144L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5205");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        long long13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (-10223615));
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 720686991053684735L);
        // The following exception was thrown during execution in test generation
        try {
            long long21 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 8406784);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[80, 6, 32, 93, -1]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 16737280L + "'", long13 == 16737280L);
    }

    @Test
    public void test5206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5206");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble(1.857001334E-314d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32831.0d + "'", double1 == 32831.0d);
    }

    @Test
    public void test5207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5207");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        float float8 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, (int) (short) 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, 0, (short) 2560);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (byte) 0, (float) 4294967296L);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 200, 1120403456);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, -128, 79]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-3.03064E38f) + "'", float8 == (-3.03064E38f));
    }

    @Test
    public void test5208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5208");
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
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, 80, (double) 11218454577152L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 80 out of bounds for length 5");
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
    public void test5209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5209");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, (int) (byte) 0, (int) (byte) 1);
        int int17 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray4, (int) (byte) 0);
        short short19 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray4, 32, (long) (-2134900737));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
    }

    @Test
    public void test5210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5210");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        int int8 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 0);
        short short10 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, (int) (short) 1);
        long long12 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, (int) (byte) 0);
        int int14 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 1);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray4, 0);
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
    public void test5211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5211");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        long long15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, (float) 1);
        long long20 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        short short22 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        float float24 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, (int) (short) 1);
        short short26 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        java.lang.Class<?> wildcardClass27 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 0, -128, 63]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 4284743681L + "'", long15 == 4284743681L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 2147483649L + "'", long20 == 2147483649L);
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) 1 + "'", short22 == (short) 1);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 1.0f + "'", float24 == 1.0f);
        org.junit.Assert.assertTrue("'" + short26 + "' != '" + (short) 1 + "'", short26 == (short) 1);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test5212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5212");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        float float8 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, (int) (short) 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, 0, (short) 2560);
        long long13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray4, (int) (short) -16512, 1.061629821E-314d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -16512 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 10, 100, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-3.03064E38f) + "'", float8 == (-3.03064E38f));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 4284746240L + "'", long13 == 4284746240L);
    }

    @Test
    public void test5213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5213");
        float float1 = org.apache.commons.io.EndianUtils.swapFloat((float) (-4647433340469641217L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.3372445E-38f + "'", float1 == 2.3372445E-38f);
    }

    @Test
    public void test5214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5214");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        int int14 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (byte) 1, (short) 16256);
        // The following exception was thrown during execution in test generation
        try {
            float float19 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, -128, 63, 0, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 13322 + "'", short12 == (short) 13322);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 13322 + "'", int14 == 13322);
    }

    @Test
    public void test5215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5215");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (byte) 1, 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 720575940379279360L);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (-10223606));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 32, 93, 0]");
    }

    @Test
    public void test5216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5216");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (byte) 1, (short) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            short short15 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (short) -32577);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -32577 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, -1, -1, 0, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
    }

    @Test
    public void test5217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5217");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        int int19 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, (int) (short) 2612, 1.591774622E-314d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2612 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-939524096) + "'", int19 == (-939524096));
    }

    @Test
    public void test5218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5218");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, 0);
        short short14 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, 1, (short) 13322);
        // The following exception was thrown during execution in test generation
        try {
            long long19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 66);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 10, 52, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 0 + "'", short14 == (short) 0);
    }

    @Test
    public void test5219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5219");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, (int) (byte) 0, (int) (byte) 1);
        int int17 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray4, 16129, (long) 1107296256);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 16129 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test5220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5220");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 1, (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (byte) 1, 100);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 0, 20938752);
        // The following exception was thrown during execution in test generation
        try {
            long long25 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray5, 167772160);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, -128, 63, 1, 0]");
    }

    @Test
    public void test5221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5221");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        long long13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 1);
        float float15 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, 536870912, 2.719097546584E-312d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 536870912 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 16737280L + "'", long13 == 16737280L);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-3.03064E38f) + "'", float15 == (-3.03064E38f));
    }

    @Test
    public void test5222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5222");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        long long17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        long long19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        int int21 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (short) 1, (int) (short) 100);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (-1), 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 13322 + "'", short12 == (short) 13322);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1590165504L + "'", long17 == 1590165504L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1590165504L + "'", long19 == 1590165504L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test5223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5223");
        int int1 = org.apache.commons.io.EndianUtils.swapInteger(8667658);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 172131328 + "'", int1 == 172131328);
    }

    @Test
    public void test5224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5224");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble((double) 69273527517184L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0651686326E-314d + "'", double1 == 1.0651686326E-314d);
    }

    @Test
    public void test5225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5225");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (-939510774), (short) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -939510774 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
    }

    @Test
    public void test5226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5226");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 1, (float) (byte) -1);
        long long17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 1);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 0);
        java.lang.Class<?> wildcardClass21 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, -128, -65]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 13322 + "'", short12 == (short) 13322);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 3212836864L + "'", long17 == 3212836864L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5227");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        int int14 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray5, (int) (short) 13312, (long) 20905984);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13312 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 13322 + "'", short12 == (short) 13322);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 13322 + "'", int14 == 13322);
    }

    @Test
    public void test5228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5228");
        byte[] byteArray0 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
    }

    @Test
    public void test5229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5229");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        int int11 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 0, (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            short short16 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, (int) (short) 13322);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13322 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, -1, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 65535 + "'", int11 == 65535);
    }

    @Test
    public void test5230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5230");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        short short19 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 1);
        int int21 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) (byte) 0);
        float float23 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, 200, (double) 1.8414561E-38f);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 200 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + (-131072.0f) + "'", float23 == (-131072.0f));
    }

    @Test
    public void test5231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5231");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (byte) 1, 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 720575940379279360L);
        // The following exception was thrown during execution in test generation
        try {
            short short16 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 80);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 80 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 32, 93, 0]");
    }

    @Test
    public void test5232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5232");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 13322);
        float float22 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, (int) (short) 1);
        int int24 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (-2143354624));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -2143354624 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 100.0004f + "'", float22 == 100.0004f);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
    }

    @Test
    public void test5233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5233");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 10);
        int int16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        short short18 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, 0.0f);
        int int23 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 0, 16777216);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (-10223606));
        // The following exception was thrown during execution in test generation
        try {
            double double31 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray5, 51266);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 10, 0, 100, -1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 25600 + "'", short18 == (short) 25600);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test5234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5234");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        long long17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        long long19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        int int21 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        long long23 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (byte) 0);
        int int25 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) -14336, (short) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -14336 out of bounds for length 5");
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1590165504 + "'", int25 == 1590165504);
    }

    @Test
    public void test5235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5235");
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
        short short31 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) -32705, (float) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, -56, 94, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 25600 + "'", short18 == (short) 25600);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + short31 + "' != '" + (short) -14336 + "'", short31 == (short) -14336);
    }

    @Test
    public void test5236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5236");
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
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, (-1040187392), 2.719097546584E-312d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1040187392 out of bounds for length 5");
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
    public void test5237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5237");
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
        long long31 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray5, (int) (short) 13312, (long) 65536);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13312 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, -56, 94, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 25600 + "'", short18 == (short) 25600);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1590165504L + "'", long31 == 1590165504L);
    }

    @Test
    public void test5238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5238");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        short short19 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (byte) 1);
        long long21 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 13322, (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13322 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1120403456L + "'", long21 == 1120403456L);
    }

    @Test
    public void test5239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5239");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        int int11 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 0, (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (short) 1, (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            long long19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 100);
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
    public void test5240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5240");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1677721600, (float) 36238803739869184L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 0, 0, 0]");
    }

    @Test
    public void test5241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5241");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, (double) 5.890135E-39f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5242");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(outputStream0, (short) 8261);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5243");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        float float8 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, (int) (short) 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) '4');
        int int13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 0);
        short short15 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 80, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-3.03064E38f) + "'", float8 == (-3.03064E38f));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 20480 + "'", short15 == (short) 20480);
    }

    @Test
    public void test5244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5244");
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
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 6553600, (float) (-2143354624L));
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1590165504 + "'", int23 == 1590165504);
    }

    @Test
    public void test5245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5245");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray0, 1065353216, (float) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5246");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, (float) 100L);
        int int14 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray4, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray4, 8404737, (long) 873070592);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 8404737 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1120403456 + "'", int14 == 1120403456);
    }

    @Test
    public void test5247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5247");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, 1677721600);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, 4.6185E-41f);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 0, (short) (byte) 100);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, 0, (short) 2612);
        // The following exception was thrown during execution in test generation
        try {
            double double26 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray4, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[52, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test5248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5248");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        long long10 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 80, (-10223615));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
    }

    @Test
    public void test5249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5249");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, (int) (byte) 0, (int) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long20 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, -128, 63]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test5250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5250");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, (double) 2.81474977E15f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5251");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, (double) 13107200);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5252");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble(5.372620977E-315d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-32577.0d) + "'", double1 == (-32577.0d));
    }

    @Test
    public void test5253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5253");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        long long17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        long long19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) (byte) 100);
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
    public void test5254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5254");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, (int) (byte) 0, (int) (byte) 1);
        int int17 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray4, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            short short19 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test5255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5255");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 0, (float) (short) 100);
        short short16 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 65536L);
        int int21 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 1);
        // The following exception was thrown during execution in test generation
        try {
            long long23 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 51200);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, -128, 71, 0]");
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) -14336 + "'", short16 == (short) -14336);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4685824 + "'", int21 == 4685824);
    }

    @Test
    public void test5256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5256");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, 1677721600);
        long long17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        short short19 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 1065353216, 8437504);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 0, 100]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1677721600L + "'", long17 == 1677721600L);
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
    }

    @Test
    public void test5257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5257");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        long long15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, (float) 1);
        long long20 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        short short22 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long24 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 1590165504);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 0, -128, 63]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 4284743681L + "'", long15 == 4284743681L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 2147483649L + "'", long20 == 2147483649L);
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) 0 + "'", short22 == (short) 0);
    }

    @Test
    public void test5258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5258");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 10, (byte) -1, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, 0, (short) 2560);
        // The following exception was thrown during execution in test generation
        try {
            long long11 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 10, -1, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4294904420L + "'", long6 == 4294904420L);
    }

    @Test
    public void test5259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5259");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 1, (float) (byte) -1);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long20 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 256);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, 0, -65]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 13322 + "'", short12 == (short) 13322);
    }

    @Test
    public void test5260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5260");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        long long13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 1);
        int int15 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 0);
        long long17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 1);
        float float19 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 52, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 16737280L + "'", long13 == 16737280L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10223615) + "'", int15 == (-10223615));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 16737280L + "'", long17 == 16737280L);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + (-3.03064E38f) + "'", float19 == (-3.03064E38f));
    }

    @Test
    public void test5261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5261");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        short short19 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 1);
        int int21 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) (byte) 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 1.0f);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) (byte) -1);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) (byte) 100);
        int int32 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 0, 0, -128, 63]");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
    }

    @Test
    public void test5262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5262");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        long long15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, (float) 1);
        long long20 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        short short22 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        float float24 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double26 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray5, 20938752);
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
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 1.0f + "'", float24 == 1.0f);
    }

    @Test
    public void test5263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5263");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(outputStream0, (float) 1065353216L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5264");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray0, (int) (short) 10, (float) (-939510774));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5265");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, 1.061533316E-314d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5266");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 1, (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (byte) 1, 100);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 0, 20938752);
        int int25 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (-939510774));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -939510774 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, -128, 63, 1, 0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 81792 + "'", int25 == 81792);
    }

    @Test
    public void test5267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5267");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, 1120403456, 7.785558E-317d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1120403456 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, 100, -1, 0]");
    }

    @Test
    public void test5268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5268");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        int int12 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, 2560, (double) 7.2168645E16f);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2560 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
    }

    @Test
    public void test5269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5269");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(outputStream0, 1.1096672E9f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5270");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 4.6006E-41f);
        float float16 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (byte) 1, (int) (short) 20480);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 32831, (short) 8261);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32831 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 80, 0, 0]");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.1777545E-38f + "'", float16 == 1.1777545E-38f);
    }

    @Test
    public void test5271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5271");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray0, 16737280);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from byte/boolean array because \"data\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5272");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        short short19 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 100);
        short short24 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (short) 20480, (int) (short) 13312);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
        org.junit.Assert.assertTrue("'" + short24 + "' != '" + (short) 100 + "'", short24 == (short) 100);
    }

    @Test
    public void test5273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5273");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (byte) 0, (short) 13322);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (short) 13312, 20905984);
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
    public void test5274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5274");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (byte) 1, 1);
        short short13 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            double double18 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray5, 8406784);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, 0, -128, -65]");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 1 + "'", short13 == (short) 1);
    }

    @Test
    public void test5275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5275");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        short short19 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 100);
        short short24 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        int int26 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, (int) (byte) 0, (double) 35.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
        org.junit.Assert.assertTrue("'" + short24 + "' != '" + (short) 100 + "'", short24 == (short) 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
    }

    @Test
    public void test5276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5276");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) (byte) 10);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, 4.6219E-41f);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) (short) 16256);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 16256 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-41, -128, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
    }

    @Test
    public void test5277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5277");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, 5.372620977E-315d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5278");
        int int1 = org.apache.commons.io.EndianUtils.swapInteger(20938752);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8404737 + "'", int1 == 8404737);
    }

    @Test
    public void test5279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5279");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        long long12 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 0);
        short short14 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 2560);
        // The following exception was thrown during execution in test generation
        try {
            float float19 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 13107200);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 10, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 13322L + "'", long12 == 13322L);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 13322 + "'", short14 == (short) 13322);
    }

    @Test
    public void test5280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5280");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 10);
        int int16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        short short18 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) (byte) 1);
        long long23 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 100, (float) 1677721600L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 10 + "'", short18 == (short) 10);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 4284743681L + "'", long23 == 4284743681L);
    }

    @Test
    public void test5281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5281");
        int int1 = org.apache.commons.io.EndianUtils.swapInteger(172131328);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8667658 + "'", int1 == 8667658);
    }

    @Test
    public void test5282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5282");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 4.6006E-41f);
        float float16 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        float float18 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, (int) (short) 0);
        int int20 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1342177280, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 63, -128, 0, 0]");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.1777545E-38f + "'", float16 == 1.1777545E-38f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 1.1777545E-38f + "'", float18 == 1.1777545E-38f);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32831 + "'", int20 == 32831);
    }

    @Test
    public void test5283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5283");
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
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 1.1576E-41f);
        // The following exception was thrown during execution in test generation
        try {
            float float30 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 587202560);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 69, 32, 0, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 13322 + "'", short12 == (short) 13322);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1590165504L + "'", long17 == 1590165504L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1590165504L + "'", long19 == 1590165504L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1590165504L + "'", long23 == 1590165504L);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 7.2057594E18f + "'", float25 == 7.2057594E18f);
    }

    @Test
    public void test5284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5284");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        long long14 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray5, 1677721600);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 13322 + "'", short12 == (short) 13322);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 52L + "'", long14 == 52L);
    }

    @Test
    public void test5285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5285");
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
            int int25 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (-16777215));
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
    public void test5286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5286");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) 25600);
        float float14 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, (float) 32L);
        // The following exception was thrown during execution in test generation
        try {
            short short19 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, 100);
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
    public void test5287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5287");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble(4.154167E-317d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.0d + "'", double1 == 57.0d);
    }

    @Test
    public void test5288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5288");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, 0.0f);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) (byte) -1);
        int int28 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        long long30 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 8406784, (short) 13312);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 8406784 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, -1, 0, 0, 66]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 65535 + "'", int28 == 65535);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 65535L + "'", long30 == 65535L);
    }

    @Test
    public void test5289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5289");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) 25600);
        float float14 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, 0);
        long long16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long18 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 587202560);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test5290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5290");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, 1677721600);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (-65536));
        // The following exception was thrown during execution in test generation
        try {
            long long20 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray4, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, -1, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test5291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5291");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, (double) 5.7529E-41f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5292");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(outputStream0, 8667658);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5293");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 1113849856L);
        long long15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 1);
        int int17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 1, (float) 873070592);
        // The following exception was thrown during execution in test generation
        try {
            long long22 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 80);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, 40, 80, 78]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1317324800L + "'", long15 == 1317324800L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 51200 + "'", int17 == 51200);
    }

    @Test
    public void test5294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5294");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, (double) (-4647433340469641217L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5295");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, 200.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5296");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        long long14 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 1);
        long long16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray5, (int) (byte) 1, (long) 16777216);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, 0, 0, 1]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 13322 + "'", short12 == (short) 13322);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 52L + "'", long14 == 52L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 52L + "'", long16 == 52L);
    }

    @Test
    public void test5297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5297");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 1113849856L);
        short short15 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            short short17 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 172131328);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 172131328 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, -56, -124, 78]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 10 + "'", short15 == (short) 10);
    }

    @Test
    public void test5298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5298");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, 3.396002743025E-312d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5299");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        int int11 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 0, (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (short) 1, (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            long long19 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray4, (int) (byte) 100);
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
    public void test5300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5300");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, (double) 16737280);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5301");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 0, (float) 16777216L);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1113849856, (float) 25600L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, -128, 75, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
    }

    @Test
    public void test5302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5302");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        // The following exception was thrown during execution in test generation
        try {
            long long16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 200);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 12, 66, 0]");
    }

    @Test
    public void test5303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5303");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        long long17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        long long19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        int int21 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (short) 1, (int) (short) 100);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 0.0f);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (byte) 0, 194);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 873070592, 167772160);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-62, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 13322 + "'", short12 == (short) 13322);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1590165504L + "'", long17 == 1590165504L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1590165504L + "'", long19 == 1590165504L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test5304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5304");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 1, (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (byte) 1, 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (-2143354624), 1.673728E7f);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 100, 0, 0, 0]");
    }

    @Test
    public void test5305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5305");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        int int8 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 0);
        short short10 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, (int) (short) 1);
        long long12 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, (int) (byte) 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, (float) 13322);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray4, (int) (short) 25600);
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
    public void test5306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5306");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) 25600);
        float float14 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, 0);
        long long16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long18 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray4, 1317324800);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test5307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5307");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(outputStream0, (long) (short) 8261);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5308");
        long long1 = org.apache.commons.io.EndianUtils.swapLong((long) 171180232);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-4035168048569647104L) + "'", long1 == (-4035168048569647104L));
    }

    @Test
    public void test5309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5309");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 1113849856L);
        short short15 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray5, 32831, 220306052481024L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32831 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, -56, -124, 78]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 10 + "'", short15 == (short) 10);
    }

    @Test
    public void test5310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5310");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        long long15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            short short17 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 4284743681L + "'", long15 == 4284743681L);
    }

    @Test
    public void test5311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5311");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) 25600);
        float float14 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, (int) ' ', (-16777215));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 100, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 57.0f + "'", float14 == 57.0f);
    }

    @Test
    public void test5312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5312");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        int int8 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 0);
        short short10 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, (int) (short) 1);
        int int12 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long14 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 655360);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 100, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 25600 + "'", short10 == (short) 25600);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25600 + "'", int12 == 25600);
    }

    @Test
    public void test5313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5313");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(outputStream0, 13107200);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5314");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        int int12 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 6553600, (short) 25600);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6553600 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
    }

    @Test
    public void test5315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5315");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, 1677721600);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, 4.6185E-41f);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 0, (short) (byte) 100);
        int int23 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray4, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double25 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray4, 171180232);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[100, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
    }

    @Test
    public void test5316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5316");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 10);
        int int16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        short short18 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (short) 1);
        int int20 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 1342177280);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 25600 + "'", short18 == (short) 25600);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-10223606) + "'", int20 == (-10223606));
    }

    @Test
    public void test5317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5317");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 10);
        int int16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        short short18 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double23 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray5, (int) (short) 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 10 + "'", short18 == (short) 10);
    }

    @Test
    public void test5318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5318");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        long long13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 1);
        int int15 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 0);
        long long17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 16129, (short) -32705);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 16129 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 16737280L + "'", long13 == 16737280L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10223615) + "'", int15 == (-10223615));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 16737280L + "'", long17 == 16737280L);
    }

    @Test
    public void test5319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5319");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        long long17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        int int19 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 16777216, (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 16777216 out of bounds for length 5");
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
    public void test5320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5320");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 1113849856L);
        long long15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            short short17 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, -56, -124, 78]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1317324800L + "'", long15 == 1317324800L);
    }

    @Test
    public void test5321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5321");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) 2612);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long21 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (-2134900737));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
    }

    @Test
    public void test5322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5322");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        int int19 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray5, 65535, (long) 1590165504);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 65535 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-939524096) + "'", int19 == (-939524096));
    }

    @Test
    public void test5323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5323");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(outputStream0, 351298260041727L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5324");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble((double) 6.9703E-41f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.593879769E-314d + "'", double1 == 1.593879769E-314d);
    }

    @Test
    public void test5325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5325");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        long long19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 1);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 13322);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, (-16777215), 3.396002743025E-312d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -16777215 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1120403456L + "'", long19 == 1120403456L);
    }

    @Test
    public void test5326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5326");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        long long17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        long long19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        int int21 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        short short23 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        short short25 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, 10, (double) 2.5928E-41f);
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
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) 0 + "'", short23 == (short) 0);
        org.junit.Assert.assertTrue("'" + short25 + "' != '" + (short) 0 + "'", short25 == (short) 0);
    }

    @Test
    public void test5327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5327");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) 2612);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) (short) -14336);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -14336 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[52, 10, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
    }

    @Test
    public void test5328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5328");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        float float8 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, (int) (short) 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, 0, (short) 2560);
        // The following exception was thrown during execution in test generation
        try {
            long long13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 16803071);
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
    public void test5329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5329");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble(1.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.03865E-319d + "'", double1 == 3.03865E-319d);
    }

    @Test
    public void test5330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5330");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 1, (float) (byte) -1);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            double double20 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray5, 25600);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, 0, -65]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 13322 + "'", short12 == (short) 13322);
    }

    @Test
    public void test5331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5331");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        long long15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, (float) 1);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (short) 1, (-65536));
        // The following exception was thrown during execution in test generation
        try {
            long long23 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray5, 1677721600);
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
    public void test5332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5332");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        long long15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, (float) 1);
        long long20 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        short short22 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            short short24 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 872415232);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 872415232 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 0, -128, 63]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 4284743681L + "'", long15 == 4284743681L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 2147483649L + "'", long20 == 2147483649L);
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) 0 + "'", short22 == (short) 0);
    }

    @Test
    public void test5333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5333");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        short short19 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 1);
        int int21 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) (byte) 0);
        float float23 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 194);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + (-131072.0f) + "'", float23 == (-131072.0f));
    }

    @Test
    public void test5334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5334");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) 25600);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) ' ', (float) (-10223606));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 100, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test5335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5335");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray0, 13322, (short) 13312);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot store to byte/boolean array because \"data\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5336");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 13322);
        float float22 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, (int) (short) 1);
        int int24 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) (byte) 1);
        short short26 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            float float28 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 25600);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 100.0004f + "'", float22 == 100.0004f);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertTrue("'" + short26 + "' != '" + (short) 52 + "'", short26 == (short) 52);
    }

    @Test
    public void test5337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5337");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 10);
        int int16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        short short18 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, 0.0f);
        float float23 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long25 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray5, (int) (short) -16512);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 25600 + "'", short18 == (short) 25600);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.0f + "'", float23 == 0.0f);
    }

    @Test
    public void test5338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5338");
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
            int int25 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 51200);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 51200 out of bounds for length 5");
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
    public void test5339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5339");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) 25600);
        long long14 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, (float) 56440465884446720L);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 25600, (float) 2612);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[78, -124, 72, 91]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1113849856L + "'", long14 == 1113849856L);
    }

    @Test
    public void test5340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5340");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        long long19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 1);
        int int21 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) (short) 0);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 8404737, (float) (-2143354624L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, 0, 66]");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1120403456L + "'", long19 == 1120403456L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test5341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5341");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble(3.47667858023255E-310d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.134900737E9d) + "'", double1 == (-2.134900737E9d));
    }

    @Test
    public void test5342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5342");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, 1677721600);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, 4.6185E-41f);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 0, (short) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray4, 52, (double) 13172735);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[100, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test5343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5343");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble((double) 80);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0656E-319d + "'", double1 == 1.0656E-319d);
    }

    @Test
    public void test5344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5344");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, (double) 4812096201845374976L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5345");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) 25600);
        float float14 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, (float) 32L);
        int int19 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray4, 13141070);
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
    public void test5346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5346");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) 25600);
        float float14 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, 0);
        long long16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, 872415232, (short) -32705);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 872415232 out of bounds for length 4");
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
    public void test5347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5347");
        byte[] byteArray1 = new byte[] { (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray1, 8667658);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 8667658 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[0]");
    }

    @Test
    public void test5348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5348");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) 25600);
        long long14 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            short short16 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, 100);
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
    public void test5349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5349");
        long long1 = org.apache.commons.io.EndianUtils.swapLong((long) (-14336));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 56576470318841855L + "'", long1 == 56576470318841855L);
    }

    @Test
    public void test5350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5350");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        long long17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        long long19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        int int21 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (short) 1, (int) (short) 100);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 0.0f);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (byte) 0, 194);
        // The following exception was thrown during execution in test generation
        try {
            double double32 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray5, 20905984);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-62, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 13322 + "'", short12 == (short) 13322);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1590165504L + "'", long17 == 1590165504L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1590165504L + "'", long19 == 1590165504L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test5351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5351");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, 0);
        short short14 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 16256, (float) (short) 0);
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
    public void test5352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5352");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        long long19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 1);
        int int21 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) (short) 0);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            float float26 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 256);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, 0, 66]");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1120403456L + "'", long19 == 1120403456L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test5353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5353");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        int int11 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 0);
        long long13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            short short15 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, 8667658);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 8667658 out of bounds for length 4");
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
    public void test5354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5354");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 4.6006E-41f);
        float float16 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        int int18 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 0);
        int int20 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        long long22 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 0, 66);
        // The following exception was thrown during execution in test generation
        try {
            long long27 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray5, 80);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[66, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.1777545E-38f + "'", float16 == 1.1777545E-38f);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8404737 + "'", int18 == 8404737);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 16129 + "'", int20 == 16129);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 32831L + "'", long22 == 32831L);
    }

    @Test
    public void test5355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5355");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        float float17 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray5, 32, 281474976710656L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 5");
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
    public void test5356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5356");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 0, (float) (short) 100);
        short short16 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 65536L);
        // The following exception was thrown during execution in test generation
        try {
            long long21 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray5, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, -128, 71, 0]");
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) -14336 + "'", short16 == (short) -14336);
    }

    @Test
    public void test5357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5357");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 1, (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (byte) 1, 100);
        short short22 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (byte) 0);
        java.lang.Class<?> wildcardClass23 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 100, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) 25600 + "'", short22 == (short) 25600);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5358");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 1113849856L);
        int int15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 35, 1.3173248E9f);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, -56, -124, 78]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test5359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5359");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 0, (float) 16777216L);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (-65536));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, -128, 75, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
    }

    @Test
    public void test5360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5360");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            double double10 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray5, 167772160);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, 0, 0]");
    }

    @Test
    public void test5361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5361");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, (int) (byte) 0, (int) (byte) 1);
        int int17 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray4, (int) (byte) 0);
        short short19 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray4, (int) (short) -14336, (double) 4.2949673E9f);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -14336 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
    }

    @Test
    public void test5362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5362");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(outputStream0, (long) 167798015);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5363");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        float float8 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, (int) (short) 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) '4');
        int int13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray4, (int) (short) 16256);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test5364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5364");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        short short19 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 1);
        int int21 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 52, (-2134900737));
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
    public void test5365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5365");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        long long15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, (float) 1);
        long long20 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        short short22 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        float float24 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            short short26 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 167798015);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 167798015 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 0, -128, 63]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 4284743681L + "'", long15 == 4284743681L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 2147483649L + "'", long20 == 2147483649L);
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) 1 + "'", short22 == (short) 1);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 1.0f + "'", float24 == 1.0f);
    }

    @Test
    public void test5366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5366");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, (double) 1.7540685E-38f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5367");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 1113849856L);
        long long15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 1);
        int int17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) (short) 1);
        int int19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 25666);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, -56, -124, 78]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1317324800L + "'", long15 == 1317324800L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 51200 + "'", int17 == 51200);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test5368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5368");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray0, (int) (short) -16512, (-16777215));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5369");
        float float1 = org.apache.commons.io.EndianUtils.swapFloat(2.81474977E14f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.604E-41f + "'", float1 == 4.604E-41f);
    }

    @Test
    public void test5370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5370");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 1, (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (byte) 1, 100);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 0, 20938752);
        int int25 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray5, 8406784, 36238803739869184L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 8406784 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, -128, 63, 1, 0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 81792 + "'", int25 == 81792);
    }

    @Test
    public void test5371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5371");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        float float8 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, (int) (short) 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) '4');
        int int13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, 0, (short) 52);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray4, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[52, 0, 80, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-3.03064E38f) + "'", float8 == (-3.03064E38f));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5372");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, (int) (byte) 0, (int) (byte) 1);
        int int17 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray4, 0);
        short short19 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, (int) (short) 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, 1, (short) -16512);
        // The following exception was thrown during execution in test generation
        try {
            short short24 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, 1120403456);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1120403456 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, -128, -65, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 1 + "'", short19 == (short) 1);
    }

    @Test
    public void test5373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5373");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray0, (int) '#', (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot store to byte/boolean array because \"data\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5374");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        long long13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 1);
        short short15 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long17 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray5, 8406784);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 16737280L + "'", long13 == 16737280L);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 1 + "'", short15 == (short) 1);
    }

    @Test
    public void test5375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5375");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        int int19 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long21 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 1113849856);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-939524096) + "'", int19 == (-939524096));
    }

    @Test
    public void test5376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5376");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 1, (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (byte) 1, 100);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 0, 20938752);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 32, (short) 256);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, -128, 63, 1, 0]");
    }

    @Test
    public void test5377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5377");
        long long1 = org.apache.commons.io.EndianUtils.swapLong((-4035168048569647104L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 171180232L + "'", long1 == 171180232L);
    }

    @Test
    public void test5378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5378");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, 1677721600);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (-65536));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (byte) -1, 4.11923E-40f);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, -1, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test5379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5379");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, (float) 100L);
        float float14 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 25666, (float) 51294);
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
    public void test5380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5380");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 1113849856L);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (short) 1, 10);
        long long18 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (byte) 1);
        java.lang.Class<?> wildcardClass19 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 10, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5381");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (byte) 1, 1);
        short short13 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            short short15 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (short) 80);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 80 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 1 + "'", short13 == (short) 1);
    }

    @Test
    public void test5382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5382");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, 1677721600);
        long long17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        short short19 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double21 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray4, 1107296256);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 0, 100]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1677721600L + "'", long17 == 1677721600L);
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
    }

    @Test
    public void test5383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5383");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 10);
        int int16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        short short18 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (short) 1);
        int int20 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) '4', (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 25600 + "'", short18 == (short) 25600);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-10223606) + "'", int20 == (-10223606));
    }

    @Test
    public void test5384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5384");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray0, 13141070);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from byte/boolean array because \"data\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5385");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        long long15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, (float) 1);
        long long20 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 25600);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test5386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5386");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (byte) 1, 1);
        short short13 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (-1.0f));
        int int18 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, 4685824, (double) 4.6185E-41f);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4685824 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, 0, -128, -65]");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 1 + "'", short13 == (short) 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test5387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5387");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, 0);
        short short14 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, 0);
        float float16 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            short short18 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, (-2134900737));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -2134900737 out of bounds for length 4");
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
    public void test5388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5388");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, 1.6777216E7d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5389");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, (int) (byte) 0, (int) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) 1);
        int int20 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray4, 0);
        short short22 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray4, 13172735, (double) (-4.46757083E18f));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13172735 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, -128, 63]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1065353216 + "'", int20 == 1065353216);
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) 0 + "'", short22 == (short) 0);
    }

    @Test
    public void test5390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5390");
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
        long long31 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long33 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray5, 6553600);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, -56, 94, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 25600 + "'", short18 == (short) 25600);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1590165504L + "'", long31 == 1590165504L);
    }

    @Test
    public void test5391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5391");
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
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 1.1576E-41f);
        short short30 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 1);
        // The following exception was thrown during execution in test generation
        try {
            short short32 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 1342177280);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1342177280 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 69, 32, 0, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 13322 + "'", short12 == (short) 13322);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1590165504L + "'", long17 == 1590165504L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1590165504L + "'", long19 == 1590165504L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1590165504L + "'", long23 == 1590165504L);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 7.2057594E18f + "'", float25 == 7.2057594E18f);
        org.junit.Assert.assertTrue("'" + short30 + "' != '" + (short) 8261 + "'", short30 == (short) 8261);
    }

    @Test
    public void test5392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5392");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        long long17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        long long19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        int int21 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        int int23 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (-939510774), (int) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 51200 + "'", int23 == 51200);
    }

    @Test
    public void test5393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5393");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble((double) (-61572651155456L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5898E-319d + "'", double1 == 2.5898E-319d);
    }

    @Test
    public void test5394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5394");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble((double) 25600.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7478E-319d + "'", double1 == 2.7478E-319d);
    }

    @Test
    public void test5395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5395");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        long long17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        long long19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        int int21 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (short) 1, (int) (short) 100);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray5, 4685824, 56440465884446720L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4685824 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 13322 + "'", short12 == (short) 13322);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1590165504L + "'", long17 == 1590165504L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1590165504L + "'", long19 == 1590165504L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test5396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5396");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble((double) (-14336));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5897E-319d + "'", double1 == 2.5897E-319d);
    }

    @Test
    public void test5397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5397");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, (int) (byte) 0, (int) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) 1);
        int int20 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray4, 0);
        short short22 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 80);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 80 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, -128, 63]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1065353216 + "'", int20 == 1065353216);
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) 0 + "'", short22 == (short) 0);
    }

    @Test
    public void test5398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5398");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        long long13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (-10223615));
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 720686991053684735L);
        java.lang.Class<?> wildcardClass20 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[80, 6, 32, 93, -1]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 16737280L + "'", long13 == 16737280L);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test5399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5399");
        int int1 = org.apache.commons.io.EndianUtils.swapInteger((int) (short) 13312);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3407872 + "'", int1 == 3407872);
    }

    @Test
    public void test5400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5400");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 0, (float) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) -32577, 3.702239E-39f);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, -56, 66, 0]");
    }

    @Test
    public void test5401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5401");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble((double) 7.1867E-41f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.591840013E-314d + "'", double1 == 1.591840013E-314d);
    }

    @Test
    public void test5402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5402");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (byte) 1, 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 720575940379279360L);
        // The following exception was thrown during execution in test generation
        try {
            short short16 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (short) 256);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 256 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 32, 93, 0]");
    }

    @Test
    public void test5403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5403");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        int int14 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (byte) 1, (short) 16256);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, 13107200, (double) 11218454577152L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13107200 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, -128, 63, 0, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 13322 + "'", short12 == (short) 13322);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 13322 + "'", int14 == 13322);
    }

    @Test
    public void test5404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5404");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (byte) 1, 1);
        short short13 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            long long18 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray5, (int) (short) 8261);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, 0, -128, -65]");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 1 + "'", short13 == (short) 1);
    }

    @Test
    public void test5405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5405");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 0, (float) (short) 100);
        short short16 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 65536L);
        // The following exception was thrown during execution in test generation
        try {
            double double21 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray5, 20938752);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, -128, 71, 0]");
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) -14336 + "'", short16 == (short) -14336);
    }

    @Test
    public void test5406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5406");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 10);
        int int16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        short short18 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) (byte) 100);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 0, 10);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 1113849856L);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (byte) 100, (short) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, -56, -124, 78, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 25600 + "'", short18 == (short) 25600);
    }

    @Test
    public void test5407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5407");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        int int8 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, 171180032, (short) 2560);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 171180032 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 100, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test5408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5408");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 10);
        int int16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        short short18 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double23 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray5, (int) (short) 2560);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 25600 + "'", short18 == (short) 25600);
    }

    @Test
    public void test5409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5409");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 2612);
        // The following exception was thrown during execution in test generation
        try {
            long long14 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray4, 20905984);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[52, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test5410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5410");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, 0.0f);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) (byte) -1);
        int int28 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 16737280, (float) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, -1, 0, 0, 66]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 65535 + "'", int28 == 65535);
    }

    @Test
    public void test5411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5411");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        long long17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        long long19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        int int21 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        short short23 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        short short25 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        short short27 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 1317324800);
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
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) 0 + "'", short23 == (short) 0);
        org.junit.Assert.assertTrue("'" + short25 + "' != '" + (short) 0 + "'", short25 == (short) 0);
        org.junit.Assert.assertTrue("'" + short27 + "' != '" + (short) 0 + "'", short27 == (short) 0);
    }

    @Test
    public void test5412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5412");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 0, (float) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (short) 13322, (int) (short) 13322);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, -56, 66, 0]");
    }

    @Test
    public void test5413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5413");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 10);
        int int16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            short short21 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 10240);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10240 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test5414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5414");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) 25600);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray4, 1107296256, (long) 81792);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1107296256 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 100, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test5415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5415");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, (int) (byte) 0, (int) (byte) 1);
        int int17 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 20938752);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 20938752 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test5416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5416");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 4.6006E-41f);
        float float16 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        float float18 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            short short20 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 20938752);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 20938752 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 63, -128, 0, 0]");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.1777545E-38f + "'", float16 == 1.1777545E-38f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 1.1777545E-38f + "'", float18 == 1.1777545E-38f);
    }

    @Test
    public void test5417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5417");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 10);
        int int16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        short short18 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) (byte) 1);
        long long23 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (byte) 0);
        int int25 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 66, (short) 80);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 66 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 10 + "'", short18 == (short) 10);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 4284743681L + "'", long23 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-10223615) + "'", int25 == (-10223615));
    }

    @Test
    public void test5418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5418");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(outputStream0, 167798015);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5419");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (byte) 1, 1);
        short short13 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long15 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray5, (int) (short) -32705);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 1 + "'", short13 == (short) 1);
    }

    @Test
    public void test5420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5420");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray0, (int) (short) 20480);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from byte/boolean array because \"data\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5421");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        int int8 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray4, 10240, (double) 51266L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10240 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 100, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test5422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5422");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 0, (float) (short) 100);
        short short16 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 65536L);
        int int21 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 16803071);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, -128, 71, 0]");
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) -14336 + "'", short16 == (short) -14336);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4685824 + "'", int21 == 4685824);
    }

    @Test
    public void test5423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5423");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (byte) 1, 1);
        short short13 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 172131328, (float) 1317324800);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 1 + "'", short13 == (short) 1);
    }

    @Test
    public void test5424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5424");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        int int8 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 0);
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray4, 1107296256, 52L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1107296256 out of bounds for length 4");
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
    public void test5425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5425");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        int int12 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        float float14 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, (int) (short) 1);
        java.lang.Class<?> wildcardClass15 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 13322 + "'", int12 == 13322);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 7.3E-44f + "'", float14 == 7.3E-44f);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5426");
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
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray5, 35, 2612L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 5");
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
    public void test5427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5427");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 13322);
        float float22 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray5, 1120403456, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1120403456 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 100.0004f + "'", float22 == 100.0004f);
    }

    @Test
    public void test5428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5428");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble((double) 150323855360L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.152777E-317d + "'", double1 == 4.152777E-317d);
    }

    @Test
    public void test5429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5429");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        long long17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        long long19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        int int21 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (short) 1, (int) (short) 100);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 167772160, 3.70225E-39f);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 13322 + "'", short12 == (short) 13322);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1590165504L + "'", long17 == 1590165504L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1590165504L + "'", long19 == 1590165504L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test5430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5430");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 1113849856L);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray5, 8437504, (long) 16906);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 8437504 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, -56, -124, 78]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
    }

    @Test
    public void test5431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5431");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) (-1L));
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (byte) 0, (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, 8404737, (double) 10995116277760L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 8404737 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, -128, -65, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 13322 + "'", short12 == (short) 13322);
    }

    @Test
    public void test5432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5432");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        short short13 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 65535);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 1 + "'", short13 == (short) 1);
    }

    @Test
    public void test5433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5433");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray4, 1342177280, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1342177280 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 0, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test5434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5434");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (byte) 1, (short) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, 8437504, (double) 1.157E-41f);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 8437504 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, -1, -1, 0, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
    }

    @Test
    public void test5435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5435");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(outputStream0, (float) (short) 16256);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5436");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        long long17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        long long19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        int int21 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (short) 1, (int) (short) 100);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 0.0f);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (byte) 0, 194);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 65535, 10240);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-62, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 13322 + "'", short12 == (short) 13322);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1590165504L + "'", long17 == 1590165504L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1590165504L + "'", long19 == 1590165504L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test5437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5437");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        int int15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 1);
        short short17 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        int int19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        int int21 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (byte) 0);
        java.lang.Class<?> wildcardClass22 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25600 + "'", int15 == 25600);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 1 + "'", short17 == (short) 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-10223615) + "'", int21 == (-10223615));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test5438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5438");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 1, (float) (byte) -1);
        long long17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 80);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 80 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, 0, -128, -65]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 13322 + "'", short12 == (short) 13322);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 3212836864L + "'", long17 == 3212836864L);
    }

    @Test
    public void test5439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5439");
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
        short short31 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 587202560);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 587202560 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, -56, 94, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 25600 + "'", short18 == (short) 25600);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + short31 + "' != '" + (short) -14336 + "'", short31 == (short) -14336);
    }

    @Test
    public void test5440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5440");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        int int11 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 0);
        long long13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray4, (-1040187392), (double) 200L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1040187392 out of bounds for length 4");
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
    public void test5441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5441");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        int int15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 1);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (byte) 1, (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            short short20 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25600 + "'", int15 == 25600);
    }

    @Test
    public void test5442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5442");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, (int) (byte) 0, (int) (byte) 1);
        int int17 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray4, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 172131328);
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
    public void test5443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5443");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, 0);
        java.lang.Class<?> wildcardClass13 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5444");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        float float8 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, (int) (short) 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) '4');
        int int13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 0);
        short short15 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, 1);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray4, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 80, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-3.03064E38f) + "'", float8 == (-3.03064E38f));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 20480 + "'", short15 == (short) 20480);
    }

    @Test
    public void test5445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5445");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        int int19 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        int int21 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (short) 8261, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-939524096) + "'", int19 == (-939524096));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test5446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5446");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 1113849856L);
        short short15 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long17 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray5, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, -56, -124, 78]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 10 + "'", short15 == (short) 10);
    }

    @Test
    public void test5447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5447");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 1113849856L);
        long long15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 1);
        int int17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) (short) 1);
        int int19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 200);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 200 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, -56, -124, 78]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1317324800L + "'", long15 == 1317324800L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 51200 + "'", int17 == 51200);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test5448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5448");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        long long17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        int int19 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 0);
        float float21 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray5, 8406784, 36238803739869184L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 8406784 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, -56, 94, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 13322 + "'", short12 == (short) 13322);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1590165504L + "'", long17 == 1590165504L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1590165504 + "'", int19 == 1590165504);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 8.704283E-39f + "'", float21 == 8.704283E-39f);
    }

    @Test
    public void test5449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5449");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble((double) 4.6012E-41f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.960256947E-315d + "'", double1 == 7.960256947E-315d);
    }

    @Test
    public void test5450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5450");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        long long17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        long long19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        int int21 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        int int23 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, (int) (short) 0, 3.189E-320d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[55, 25, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 13322 + "'", short12 == (short) 13322);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1590165504L + "'", long17 == 1590165504L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1590165504L + "'", long19 == 1590165504L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 51200 + "'", int23 == 51200);
    }

    @Test
    public void test5451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5451");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        int int14 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 0);
        long long16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 16777471, (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 16777471 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 13322 + "'", short12 == (short) 13322);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 13322 + "'", int14 == 13322);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 13322L + "'", long16 == 13322L);
    }

    @Test
    public void test5452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5452");
        int int1 = org.apache.commons.io.EndianUtils.swapInteger(16777471);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-16777215) + "'", int1 == (-16777215));
    }

    @Test
    public void test5453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5453");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        short short19 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (byte) 1);
        long long21 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 13141070, (float) 873070592);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1120403456L + "'", long21 == 1120403456L);
    }

    @Test
    public void test5454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5454");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, (int) (byte) 0, (int) (byte) 1);
        int int17 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray4, 0);
        short short19 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (-16777215), (float) 4685824);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 1 + "'", short19 == (short) 1);
    }

    @Test
    public void test5455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5455");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 4.6006E-41f);
        float float16 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        float float18 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, (int) (short) 0);
        int int20 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            float float22 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 1590165504);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 63, -128, 0, 0]");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.1777545E-38f + "'", float16 == 1.1777545E-38f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 1.1777545E-38f + "'", float18 == 1.1777545E-38f);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32831 + "'", int20 == 32831);
    }

    @Test
    public void test5456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5456");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 0, (int) (short) 13322);
        long long15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 1);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray5, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 52L + "'", long15 == 52L);
    }

    @Test
    public void test5457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5457");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        long long12 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 0);
        short short14 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 2560);
        int int19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 1);
        // The following exception was thrown during execution in test generation
        try {
            float float21 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 171180232);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 10, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 13322L + "'", long12 == 13322L);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 13322 + "'", short14 == (short) 13322);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test5458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5458");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        int int10 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, 1.181211E-38f);
        // The following exception was thrown during execution in test generation
        try {
            float float15 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, (int) (short) 20480);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[91, -97, -128, 0, 0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test5459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5459");
        int int1 = org.apache.commons.io.EndianUtils.swapInteger(16906);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 172097536 + "'", int1 == 172097536);
    }

    @Test
    public void test5460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5460");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, (double) 8437504);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5461");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, (int) (byte) 0, (int) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) 1);
        int int20 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray4, 0);
        short short22 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, 0);
        java.lang.Class<?> wildcardClass23 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, -128, 63]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1065353216 + "'", int20 == 1065353216);
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) 0 + "'", short22 == (short) 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5462");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(outputStream0, 65535L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5463");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        long long10 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 8404737);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
    }

    @Test
    public void test5464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5464");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        int int8 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 0);
        short short10 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, (int) (short) 1);
        int int12 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray4, (int) (byte) 0, (double) 3.702239E-39f);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 25600 + "'", short10 == (short) 25600);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25600 + "'", int12 == 25600);
    }

    @Test
    public void test5465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5465");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray0, (-1040187392), (short) 80);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot store to byte/boolean array because \"data\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5466");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, 1677721600);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, 4.6185E-41f);
        short short20 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            double double22 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray4, 65536);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-65, -128, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) -32577 + "'", short20 == (short) -32577);
    }

    @Test
    public void test5467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5467");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        int int15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 1);
        float float17 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (-10223615));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -10223615 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25600 + "'", int15 == 25600);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + (-3.03064E38f) + "'", float17 == (-3.03064E38f));
    }

    @Test
    public void test5468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5468");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        int int10 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) (byte) 1);
        float float12 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, 1317324800, (double) 65536);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1317324800 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.8668E-41f + "'", float12 == 1.8668E-41f);
    }

    @Test
    public void test5469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5469");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        short short19 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 100);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (byte) 0, (short) 2612);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 0);
        short short30 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 2560, (short) 80);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2560 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
        org.junit.Assert.assertTrue("'" + short30 + "' != '" + (short) 0 + "'", short30 == (short) 0);
    }

    @Test
    public void test5470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5470");
        float float1 = org.apache.commons.io.EndianUtils.swapFloat(2.4603495E-32f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.29490432E9f + "'", float1 == 4.29490432E9f);
    }

    @Test
    public void test5471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5471");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        long long19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 1);
        int int21 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, (-10223606), (double) 12550144L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -10223606 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1120403456L + "'", long19 == 1120403456L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test5472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5472");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 10);
        int int16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        short short18 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) (byte) 1);
        long long23 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            short short25 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 1107296256);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1107296256 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 10 + "'", short18 == (short) 10);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 4284743681L + "'", long23 == 4284743681L);
    }

    @Test
    public void test5473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5473");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 1, (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (byte) 1, 100);
        // The following exception was thrown during execution in test generation
        try {
            float float22 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 1107296256);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 100, 0, 0, 0]");
    }

    @Test
    public void test5474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5474");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (byte) 1, (short) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, 8667658, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 8667658 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, -1, -1, 0, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
    }

    @Test
    public void test5475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5475");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble((double) 4328448L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.251811E-317d + "'", double1 == 4.251811E-317d);
    }

    @Test
    public void test5476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5476");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        short short19 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 1);
        int int21 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) (byte) 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 1.0f);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            float float29 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, -1, 0, -128, 63]");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test5477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5477");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        long long12 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 20905984);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 20905984 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 13322L + "'", long12 == 13322L);
    }

    @Test
    public void test5478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5478");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        short short19 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 1);
        int int21 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 3407872, (float) 4685824);
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
    public void test5479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5479");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, 1677721600);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, 4.6185E-41f);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, (float) 873070592);
        int int23 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, (int) (byte) 0);
        java.lang.Class<?> wildcardClass24 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 40, 80, 78]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10240 + "'", int23 == 10240);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test5480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5480");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5481");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(outputStream0, 81792);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5482");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            long long18 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray5, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
    }

    @Test
    public void test5483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5483");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, 0.0f);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) (byte) -1);
        int int28 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        long long30 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long32 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (-65536));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, -1, 0, 0, 66]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 65535 + "'", int28 == 65535);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 65535L + "'", long30 == 65535L);
    }

    @Test
    public void test5484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5484");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) 25600);
        long long14 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray4, 32831);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 100, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1113849856L + "'", long14 == 1113849856L);
    }

    @Test
    public void test5485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5485");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 1, (float) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, (-16777215), 2.58984E-319d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -16777215 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, 0, -128, -65]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 13322 + "'", short12 == (short) 13322);
    }

    @Test
    public void test5486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5486");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 13322);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) -32705, (short) 16256);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -32705 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, -56, 66]");
    }

    @Test
    public void test5487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5487");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        int int15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 1);
        float float17 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25600 + "'", int15 == 25600);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + (-3.03064E38f) + "'", float17 == (-3.03064E38f));
    }

    @Test
    public void test5488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5488");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, (float) 100L);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, 0, (short) -1);
        int int17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 0);
        java.lang.Class<?> wildcardClass18 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, -1, -56, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 65535 + "'", int17 == 65535);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5489");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        long long10 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray5, (int) (short) 1, (long) 2612);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
    }

    @Test
    public void test5490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5490");
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
            long long24 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray5, 25666);
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
    public void test5491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5491");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 1, (short) 13322);
        // The following exception was thrown during execution in test generation
        try {
            double double19 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray5, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 10, 52, 66, 0]");
    }

    @Test
    public void test5492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5492");
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
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, 2612, (double) 28147497671065600L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2612 out of bounds for length 5");
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
    public void test5493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5493");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        int int11 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 0, (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (short) 1, (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 171180032, 16777216);
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
    public void test5494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5494");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(outputStream0, (long) 8667658);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5495");
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
            long long25 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray5, 20938752);
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1590165504 + "'", int23 == 1590165504);
    }

    @Test
    public void test5496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5496");
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
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 1.1576E-41f);
        short short30 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, 65536, (double) 4.6219E-41f);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 65536 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 69, 32, 0, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 13322 + "'", short12 == (short) 13322);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1590165504L + "'", long17 == 1590165504L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1590165504L + "'", long19 == 1590165504L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1590165504L + "'", long23 == 1590165504L);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 7.2057594E18f + "'", float25 == 7.2057594E18f);
        org.junit.Assert.assertTrue("'" + short30 + "' != '" + (short) 8261 + "'", short30 == (short) 8261);
    }

    @Test
    public void test5497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5497");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, 1677721600);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, 4.6185E-41f);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 0, (short) (byte) 100);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (short) 1, (short) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, (-14336), 172131328);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[100, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test5498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5498");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        short short19 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 100);
        short short24 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        float float26 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            float float28 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 13141070);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
        org.junit.Assert.assertTrue("'" + short24 + "' != '" + (short) 100 + "'", short24 == (short) 100);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + (-131073.56f) + "'", float26 == (-131073.56f));
    }

    @Test
    public void test5499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5499");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 0, (float) (short) 100);
        short short16 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 65536L);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 1342177280);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, 7.1839E-41f);
        // The following exception was thrown during execution in test generation
        try {
            long long27 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray5, 1199622144);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[66, -56, 0, 0, 78]");
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) -14336 + "'", short16 == (short) -14336);
    }

    @Test
    public void test5500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5500");
        int int1 = org.apache.commons.io.EndianUtils.swapInteger((-2134900737));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-16512) + "'", int1 == (-16512));
    }
}

