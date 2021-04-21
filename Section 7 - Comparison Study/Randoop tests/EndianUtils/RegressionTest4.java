import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
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
            float float31 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 66);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        float float1 = org.apache.commons.io.EndianUtils.swapFloat((float) 10);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.157E-41f + "'", float1 == 1.157E-41f);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        float float1 = org.apache.commons.io.EndianUtils.swapFloat((float) (short) 256);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.6012E-41f + "'", float1 == 4.6012E-41f);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray5, 16129);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, 100, -1, 0]");
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble(4.77444888682E-312d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0223615E7d) + "'", double1 == (-1.0223615E7d));
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        float float15 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 13322);
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
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, (float) 100L);
        float float14 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 1, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 97, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 100.0f + "'", float14 == 100.0f);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        int int19 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long21 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 1677721600);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-939524096) + "'", int19 == (-939524096));
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        int int11 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 0);
        long long13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray4, 1113849856);
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
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 65535);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 65535 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, -56, 94, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 13322 + "'", short12 == (short) 13322);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        int int10 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 13172735, (short) 13322);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13172735 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            float float2 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray0, 167772160);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, 1677721600);
        // The following exception was thrown during execution in test generation
        try {
            float float17 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 0, 100]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 10);
        int int16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        short short18 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray5, 10, (long) (byte) 10);
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
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 1, (short) 13322);
        int int19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 1627389952);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 10, 52, 66, 0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 13322 + "'", int19 == 13322);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(outputStream0, (float) 1113849856);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, (double) 587202560);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        short short19 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 1);
        // The following exception was thrown during execution in test generation
        try {
            float float21 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 51294);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        float float8 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, (int) (short) 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) '4');
        int int13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 0);
        short short15 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, 16777216, (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 16777216 out of bounds for length 4");
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
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 1113849856L);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 2560, (int) (short) 2560);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, -56, -124, 78]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, (float) 100L);
        float float14 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray4, 100, (double) 20938752);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 100.0f + "'", float14 == 100.0f);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) 25600);
        float float14 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, (int) (short) 100);
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
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        int int11 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray4, 65536, (double) 52L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 65536 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 65535 + "'", int11 == 65535);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        float float8 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, (int) (short) 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) '4');
        int int13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 0);
        short short15 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, 1);
        // The following exception was thrown during execution in test generation
        try {
            float float17 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, 10);
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
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble((double) 97);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0834234E-317d + "'", double1 == 2.0834234E-317d);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble((double) 1627389952);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0996135E-317d + "'", double1 == 2.0996135E-317d);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(outputStream0, (float) 2522015791327477760L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        int int19 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        float float21 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long23 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray5, 51294);
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
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 0, (int) (short) 13322);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray5, 2612, (long) 655360);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2612 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 1, (float) (byte) -1);
        java.lang.Class<?> wildcardClass16 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, 0, -128, -65]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 13322 + "'", short12 == (short) 13322);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble(4.152776E-317d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.0d + "'", double1 == 35.0d);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, 0);
        int int14 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray4, (int) (byte) 1, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        // The following exception was thrown during execution in test generation
        try {
            long long13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        int int15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, 8404737, (double) (-939524096));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 8404737 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25600 + "'", int15 == 25600);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        int int11 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, 0, (short) 256);
        int int16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long18 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 872415232);
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
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        int int11 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray4, 8404737);
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
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(outputStream0, (-65536.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
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
            long long25 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 2612);
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
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (byte) -1, (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, 0, 0]");
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        long long17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) '#', (int) (short) 2612);
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
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray0, 25600);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from byte/boolean array because \"data\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        float float8 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, (int) (short) 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) '4');
        // The following exception was thrown during execution in test generation
        try {
            short short13 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, 171180032);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 171180032 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 80, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-3.03064E38f) + "'", float8 == (-3.03064E38f));
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 10);
        int int16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        short short18 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (short) 1);
        java.lang.Class<?> wildcardClass19 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 25600 + "'", short18 == (short) 25600);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, (float) 100L);
        int int14 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 167772160);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 167772160 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 51200 + "'", int14 == 51200);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) 25600);
        long long14 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, (int) (short) 10, (int) (short) -1);
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
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, 0);
        short short14 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, (int) '4');
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
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 4.6006E-41f);
        float float16 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        int int18 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 0);
        int int20 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long22 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray5, 873070592);
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
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) 25600);
        long long14 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray4, 200);
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
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        float float17 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 8404737);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) 25600);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (short) -1, (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 100, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 10);
        int int16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        short short18 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            short short23 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 25600 + "'", short18 == (short) 25600);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        float float1 = org.apache.commons.io.EndianUtils.swapFloat(13322.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.702217E-39f + "'", float1 == 3.702217E-39f);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 10);
        int int16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        short short18 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, 2612, (double) 200L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2612 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 25600 + "'", short18 == (short) 25600);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble((double) (-4035225266123964416L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.58984E-319d + "'", double1 == 2.58984E-319d);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, (int) (byte) 0, (int) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long20 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray4, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, -128, 63]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 10);
        int int16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        short short18 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (-939524096), (int) '4');
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
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) '#', (short) 2612);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 100, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            float float15 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 200);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) 25600);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray4, 655360);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 100, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 1, (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (byte) 1, 100);
        int int22 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, 873070592, (double) 1.1582E-41f);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 873070592 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 100, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 25600 + "'", int22 == 25600);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        long long13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 200, 1107296256);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 16737280L + "'", long13 == 16737280L);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        byte[] byteArray2 = new byte[] { (byte) 100, (byte) 100 };
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray2, (int) (short) 0, (short) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray2, (int) (short) 1, 7205759403792793600L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0]");
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        // The following exception was thrown during execution in test generation
        try {
            short short13 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 872415232);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 872415232 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray0, 65535, 1.85702359E-314d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot store to byte/boolean array because \"data\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, (double) 4.6034E-41f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, (int) (short) 200, 66);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, (float) 100L);
        // The following exception was thrown during execution in test generation
        try {
            short short14 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, 873070592);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 873070592 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble((double) 4.6185E-41f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8575092765E-314d + "'", double1 == 1.8575092765E-314d);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long14 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray5, 587202560);
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
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        short short19 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 1);
        int int21 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            short short23 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(outputStream0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble((double) 1.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.03865E-319d + "'", double1 == 3.03865E-319d);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        long long1 = org.apache.commons.io.EndianUtils.swapLong(720575940379279360L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10L + "'", long1 == 10L);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        short short19 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 1);
        // The following exception was thrown during execution in test generation
        try {
            long long21 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble((double) 72058143793741824L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.63265674E-316d + "'", double1 == 6.63265674E-316d);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, 1677721600);
        java.lang.Class<?> wildcardClass16 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 0, 100]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        // The following exception was thrown during execution in test generation
        try {
            double double11 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray4, 587202560);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 0, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 0, (int) (short) 13322);
        // The following exception was thrown during execution in test generation
        try {
            float float15 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, 0);
        short short14 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray4, 587202560);
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
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble((double) 16129);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0651686317E-314d + "'", double1 == 1.0651686317E-314d);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 4.6006E-41f);
        float float16 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        float float18 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, (int) (short) 0);
        java.lang.Class<?> wildcardClass19 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 63, -128, 0, 0]");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.1777545E-38f + "'", float16 == 1.1777545E-38f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 1.1777545E-38f + "'", float18 == 1.1777545E-38f);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble((double) 4.6034E-41f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.96090453E-315d + "'", double1 == 7.96090453E-315d);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        long long1 = org.apache.commons.io.EndianUtils.swapLong(28147497671065600L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 25600L + "'", long1 == 25600L);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        int int19 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        float float21 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 256, (int) '4');
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
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 1, (float) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray5, 0);
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
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) (-1L));
        int int20 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (byte) 1);
        java.lang.Class<?> wildcardClass21 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, -128, -65, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 13322 + "'", short12 == (short) 13322);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 12550144 + "'", int20 == 12550144);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
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
            long long26 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray5, (int) (short) 10);
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
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        int int11 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 0, (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (short) 1, (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 587202560);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 587202560 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 65535 + "'", int11 == 65535);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (byte) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray5, 100, (long) 51294);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 0, 0, 0]");
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble((double) 16803071L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.09934032943E-312d + "'", double1 == 5.09934032943E-312d);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            short short6 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, (int) (short) 13322);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13322 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[10, 100, 0, 1]");
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        long long17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        long long19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 13322, (-10223615));
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
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 10);
        int int16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        short short18 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (-1));
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
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 4.6006E-41f);
        float float16 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 0, 16777216);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (byte) 1, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray5, 16777216, (long) 1677721600);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 16777216 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 97, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.1777545E-38f + "'", float16 == 1.1777545E-38f);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 1113849856L);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 51200, 256);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, -56, -124, 78]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble(3.0388E-319d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.81474976710656E14d + "'", double1 == 2.81474976710656E14d);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
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
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 100, (float) (-43910092071895040L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, 1.8570559693E-314d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        float float1 = org.apache.commons.io.EndianUtils.swapFloat((float) '#');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.397E-42f + "'", float1 == 4.397E-42f);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 10);
        int int16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        short short18 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, 0.0f);
        int int23 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        java.lang.Class<?> wildcardClass24 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 25600 + "'", short18 == (short) 25600);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, (double) Float.NaN);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) (-1L));
        int int20 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            float float22 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 587202560);
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
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, 52, (double) 2522015791327477760L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, 100, -1, 0]");
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        int int19 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        int int21 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long23 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray5, 51200);
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
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        float float12 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long14 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray5, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.8668E-41f + "'", float12 == 1.8668E-41f);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from byte/boolean array because \"data\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        int int8 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 0);
        short short10 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, (int) (short) 1);
        long long12 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, (int) (byte) 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, (float) 13322);
        // The following exception was thrown during execution in test generation
        try {
            long long17 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray4, 12550144);
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
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
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
            long long28 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray5, (-1));
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
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        long long13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (byte) -1, (short) 25600);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 16737280L + "'", long13 == 16737280L);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        long long13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 1);
        int int15 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 171180032, (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 171180032 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 16737280L + "'", long13 == 16737280L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10223615) + "'", int15 == (-10223615));
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(outputStream0, 281474976710655L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        short short19 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, 167772160, (double) 1677721600);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 167772160 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, 0);
        short short14 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            short short16 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, 167772160);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 167772160 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 0 + "'", short14 == (short) 0);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) 25600);
        long long14 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray4, (-10223615), (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -10223615 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 100, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1113849856L + "'", long14 == 1113849856L);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        int int12 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 171180032, 0);
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
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
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
            long long25 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray5, 10);
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
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        int int8 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 0);
        short short10 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray4, 1);
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
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        float float8 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, (int) (short) 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, 0, (short) 2560);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray4, (int) (short) 10, (double) 1.161E-41f);
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
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
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
            long long24 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray5, 167772160);
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
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        float float1 = org.apache.commons.io.EndianUtils.swapFloat((float) (short) 10);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.157E-41f + "'", float1 == 1.157E-41f);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        int int11 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 0, (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, (int) (short) 0, 32);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 1120403456, 12550144);
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
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 4.6006E-41f);
        float float16 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) ' ', 13322.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 63, -128, 0, 0]");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.1777545E-38f + "'", float16 == 1.1777545E-38f);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) 25600);
        long long14 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray4, 0);
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
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        long long17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        long long19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long21 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray5, 256);
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
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        float float1 = org.apache.commons.io.EndianUtils.swapFloat(8.658487E-39f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.20306052E14f + "'", float1 == 2.20306052E14f);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(outputStream0, (long) 51294);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        int int8 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 0);
        short short10 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, (int) (short) 1);
        long long12 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            short short14 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, 6553600);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6553600 out of bounds for length 4");
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
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (short) 13322, 536870912);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, 0, 0]");
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        long long12 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray5, (int) (byte) -1);
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
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(outputStream0, (float) 8404737);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        int int11 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long13 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray4, 1590165504);
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
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        float float1 = org.apache.commons.io.EndianUtils.swapFloat((float) 28147497671065600L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 7.1873E-41f + "'", float1 == 7.1873E-41f);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        long long13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 171180032, 57.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 16737280L + "'", long13 == 16737280L);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        short short19 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 12550144);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 12550144 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, 1.857001334E-314d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        int int8 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 0);
        short short10 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, (int) (short) 1);
        long long12 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, (int) (byte) 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, (float) 13322);
        // The following exception was thrown during execution in test generation
        try {
            short short17 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 4");
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
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        float float1 = org.apache.commons.io.EndianUtils.swapFloat((float) 1120403456);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.3272132E-38f + "'", float1 == 1.3272132E-38f);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        int int8 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 0);
        short short10 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, (int) (short) 1);
        long long12 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, (int) (byte) 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, (float) 13322);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray4, 2612, (long) 872415232);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2612 out of bounds for length 4");
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
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray0, 655360, (double) 3.5966E-41f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot store to byte/boolean array because \"data\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        float float15 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 12550144);
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
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        float float8 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, (int) (short) 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, (int) (byte) 10, (int) (short) 200);
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
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble((double) 2.8808E-41f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.061629821E-314d + "'", double1 == 1.061629821E-314d);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, (float) 100L);
        float float14 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, 0);
        java.lang.Class<?> wildcardClass15 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 100.0f + "'", float14 == 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 4.6006E-41f);
        float float16 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            float float18 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 200);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 63, -128, 0, 0]");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.1777545E-38f + "'", float16 == 1.1777545E-38f);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, 0.0f);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 97, (short) 20480);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, -1, 0, 0, 66]");
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 4.6006E-41f);
        float float16 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 0, 16777216);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (byte) 1, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 16777216, (int) (short) 2560);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 97, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.1777545E-38f + "'", float16 == 1.1777545E-38f);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, (double) 283467841536L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, (int) (byte) 0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass16 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 10);
        int int16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        short short18 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 52);
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
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        long long11 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (short) -14336, (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -14336 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 4294967041L + "'", long11 == 4294967041L);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 2612);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[52, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        int int15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 1);
        short short17 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 13322, (float) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(outputStream0, (short) 20480);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) 25600);
        long long14 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        long long16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            short short18 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, 873070592);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 873070592 out of bounds for length 4");
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
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        float float1 = org.apache.commons.io.EndianUtils.swapFloat(4.7445E-41f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 66.0f + "'", float1 == 66.0f);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble(5.790703E-317d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.590165504E9d + "'", double1 == 1.590165504E9d);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, 2.43164E-319d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble((double) (short) 2560);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.07745E-319d + "'", double1 == 2.07745E-319d);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        float float1 = org.apache.commons.io.EndianUtils.swapFloat(32831.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 5.785736E-39f + "'", float1 == 5.785736E-39f);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        int int15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 1);
        short short17 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        java.lang.Class<?> wildcardClass18 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25600 + "'", int15 == 25600);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 1 + "'", short17 == (short) 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        short short19 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 1);
        int int21 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) (byte) 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 1.0f);
        float float26 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        java.lang.Class<?> wildcardClass27 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, -128, 63]");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + (-0.0f) + "'", float26 == (-0.0f));
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, 6553600, (short) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6553600 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 10);
        int int16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        short short18 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) (byte) 100);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 0, 10);
        java.lang.Class<?> wildcardClass25 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 25600 + "'", short18 == (short) 25600);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        long long13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 1);
        short short15 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 6553600);
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
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(outputStream0, (short) -14336);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        int int8 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 0);
        short short10 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, (int) (short) 1);
        long long12 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, (int) (byte) 0);
        int int14 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray4, 16803071, (double) 66.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 16803071 out of bounds for length 4");
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
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        int int1 = org.apache.commons.io.EndianUtils.swapInteger(12550144);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8437504 + "'", int1 == 8437504);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 1, (float) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            long long17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 200);
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
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray5, (int) (byte) 0, 110234630619136L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, 0, 66]");
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        float float1 = org.apache.commons.io.EndianUtils.swapFloat(1.1604E-41f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.81474977E15f + "'", float1 == 2.81474977E15f);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, 0);
        short short14 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, 0);
        long long16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long18 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray4, (int) (short) 200);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble((double) (short) 2612);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.3881994E-317d + "'", double1 == 3.3881994E-317d);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 4.6006E-41f);
        float float16 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        float float18 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 1113849856, (short) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1113849856 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 63, -128, 0, 0]");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.1777545E-38f + "'", float16 == 1.1777545E-38f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 1.1777545E-38f + "'", float18 == 1.1777545E-38f);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray5, 8404737, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 8404737 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, -128, -65, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 13322 + "'", short12 == (short) 13322);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 0, (float) (short) 100);
        short short16 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 1);
        // The following exception was thrown during execution in test generation
        try {
            long long18 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 25600);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, -56, 66, 0]");
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) -14336 + "'", short16 == (short) -14336);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        int int8 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 0);
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray4, (-1));
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
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        short short19 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 1);
        int int21 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 10);
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
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        int int11 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, 0, (short) 256);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 1677721600);
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
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (byte) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, (int) (short) 2612, 1.0651686317E-314d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2612 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 0, 0, 0]");
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            long long10 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, 0, 0]");
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        long long15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, (float) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long20 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 1120403456);
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
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        short short1 = org.apache.commons.io.EndianUtils.swapShort((short) 20480);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 80 + "'", short1 == (short) 80);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, (float) 100L);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray4, 12550144);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 4.6006E-41f);
        float float16 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 872415232, (short) -14336);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 872415232 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 63, -128, 0, 0]");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.1777545E-38f + "'", float16 == 1.1777545E-38f);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        int int8 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 0);
        short short10 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray4, (-939524096));
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
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, (double) 4.397E-42f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        short short19 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 1);
        int int21 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray5, (int) (short) -1, 65536L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        long long1 = org.apache.commons.io.EndianUtils.swapLong(110234630619136L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1113849856L + "'", long1 == 1113849856L);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble(2.95016E-319d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 51200.0d + "'", double1 == 51200.0d);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 0, (float) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, -56, 66, 0]");
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        float float1 = org.apache.commons.io.EndianUtils.swapFloat((float) 1317324800L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-2.713967E-29f) + "'", float1 == (-2.713967E-29f));
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        float float17 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            float float19 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 200);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        short short19 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double21 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray5, 51294);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        long long1 = org.apache.commons.io.EndianUtils.swapLong(2522015791327477760L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 35L + "'", long1 == 35L);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 1113849856L);
        int int15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 171180032);
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
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        long long1 = org.apache.commons.io.EndianUtils.swapLong(65535L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-281474976710656L) + "'", long1 == (-281474976710656L));
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        long long13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) (short) 256);
        java.lang.Class<?> wildcardClass17 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, -128, 67, 0]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 16737280L + "'", long13 == 16737280L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        long long13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 1);
        int int15 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 0);
        java.lang.Class<?> wildcardClass16 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 16737280L + "'", long13 == 16737280L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10223615) + "'", int15 == (-10223615));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(outputStream0, (float) (-281474976710656L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, 0);
        short short14 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, 0);
        float float16 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            float float18 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, 97);
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
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray0, (int) (short) 2612, 200);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, 1677721600);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, 4.6185E-41f);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray4, 20938752, (long) 587202560);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 20938752 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-65, -128, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        long long13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 1);
        float float15 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, (int) (short) -14336, (double) (-10223615));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -14336 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 16737280L + "'", long13 == 16737280L);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-3.03064E38f) + "'", float15 == (-3.03064E38f));
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(outputStream0, 1107296256);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        long long15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, (float) 1);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (short) 1, (-65536));
        short short23 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (short) 0);
        java.lang.Class<?> wildcardClass24 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 0, -1, -1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 4284743681L + "'", long15 == 4284743681L);
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) 1 + "'", short23 == (short) 1);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) (-1L));
        int int20 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (-65536), (short) 20480);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -65536 out of bounds for length 5");
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
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) 25600);
        float float14 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, (float) 32L);
        int int19 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray4, (int) (short) 2560, (double) 8.658487E-39f);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2560 out of bounds for length 4");
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
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, 1677721600);
        // The following exception was thrown during execution in test generation
        try {
            long long17 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray4, (int) (short) -14336);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 0, 100]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 4.6006E-41f);
        float float16 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        int int18 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 0);
        int int20 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 1590165504);
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
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        int int11 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, 0, (short) 256);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray4, (int) (short) 13322);
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
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 1, (short) 13322);
        // The following exception was thrown during execution in test generation
        try {
            float float19 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 16129);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 10, 52, 66, 0]");
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        int int8 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 0);
        short short10 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray4, 1120403456);
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
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(outputStream0, 72168644712333311L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        float float1 = org.apache.commons.io.EndianUtils.swapFloat(4.6012E-41f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 256.0f + "'", float1 == 256.0f);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(outputStream0, 16803071L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, (int) (short) 13322, 2.0834234E-317d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13322 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, 0, 66]");
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble((double) 36238803739869184L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8575032113E-314d + "'", double1 == 1.8575032113E-314d);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        float float19 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long21 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray5, 65535);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + (-131072.0f) + "'", float19 == (-131072.0f));
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        short short13 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 16129, 6553600);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 1 + "'", short13 == (short) 1);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        long long13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            float float15 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 16737280L + "'", long13 == 16737280L);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 1, (float) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            long long17 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray5, 8404737);
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
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
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
            int int26 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, -128, 63]");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) 25600);
        long long14 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        long long16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        java.lang.Class<?> wildcardClass17 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 100, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1113849856L + "'", long14 == 1113849856L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1113849856L + "'", long16 == 1113849856L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
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
            int int26 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) (short) 13322);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13322 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
        org.junit.Assert.assertTrue("'" + short24 + "' != '" + (short) 100 + "'", short24 == (short) 100);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, 6.9726E-41f);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 256, (float) 11218454577152L);
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
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        long long15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, (float) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 0, -128, 63]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 4284743681L + "'", long15 == 4284743681L);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(outputStream0, (float) (-43910092071895040L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray5, 0, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, -1, -1, -1, -1]");
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            short short10 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 1113849856);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1113849856 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, 0, 0]");
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(outputStream0, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) 25600);
        long long14 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray4, (int) (byte) 10, (double) 8.666685E-33f);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 100, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1113849856L + "'", long14 == 1113849856L);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, 2.0776E-319d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray4, 171180032);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        long long13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 1);
        int int15 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, 51294, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 51294 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 16737280L + "'", long13 == 16737280L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10223615) + "'", int15 == (-10223615));
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        long long13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 1);
        float float15 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 167772160);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 16737280L + "'", long13 == 16737280L);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-3.03064E38f) + "'", float15 == (-3.03064E38f));
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            float float2 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray0, 256);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray4, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 51200);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 0, 0, 0]");
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, 0.0f);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (-939524096), (short) 200);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -939524096 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, -1, 0, 0, 66]");
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        int int11 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, 0, (short) 256);
        int int16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            float float18 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, (int) (byte) 100);
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
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        float float1 = org.apache.commons.io.EndianUtils.swapFloat(2.8E-43f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-131072.0f) + "'", float1 == (-131072.0f));
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble(3.3881994E-317d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2612.0d + "'", double1 == 2612.0d);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (byte) 1, 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 720575940379279360L);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) (short) 256);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 256 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 32, 93, 0]");
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble((double) 32831.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.857001334E-314d + "'", double1 == 1.857001334E-314d);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        float float1 = org.apache.commons.io.EndianUtils.swapFloat((float) (short) 2612);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 5.890124E-39f + "'", float1 == 5.890124E-39f);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, (double) 10995116277760L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
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
            float float25 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 16777216);
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
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
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
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 536870912, (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 536870912 out of bounds for length 5");
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
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (byte) 1, 1);
        short short13 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 1 + "'", short13 == (short) 1);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(outputStream0, 2.81474977E14f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        long long12 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            float float14 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 2612);
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
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, 0);
        short short14 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, 0);
        long long16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray4, 1677721600);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 4.6006E-41f);
        float float16 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        float float18 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, (int) (short) 0);
        int int20 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 100, 32.0f);
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
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 4.6006E-41f);
        float float16 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        int int18 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 0);
        int int20 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long22 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 1677721600);
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
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, (float) 100L);
        float float14 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray4, 0);
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
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 1, (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (byte) 1, 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (byte) -1, (int) (short) 13322);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 100, 0, 0, 0]");
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, (double) 167772160);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(outputStream0, 16129);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, (float) 100L);
        float float14 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray4, (int) (short) 13322);
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
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        short short19 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 1);
        int int21 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (-65536));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -65536 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
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
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 167772160, (int) (byte) 0);
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
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 2612);
        // The following exception was thrown during execution in test generation
        try {
            long long14 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray4, 66);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[52, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 1, (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (byte) 1, 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray5, (int) (byte) -1, (long) 872415232);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 100, 0, 0, 0]");
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, 1, (short) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            float float17 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, 1107296256);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[10, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            float float2 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray0, 51200, (short) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot store to byte/boolean array because \"data\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray3, (int) (short) 256, (short) 200);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 256 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, -1, 1]");
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        short short19 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 1);
        int int21 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray5, 1113849856, 16803071L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1113849856 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble(7.96090453E-315d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.603405585153457E-41d + "'", double1 == 4.603405585153457E-41d);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        float float1 = org.apache.commons.io.EndianUtils.swapFloat((float) 51200);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.5928E-41f + "'", float1 == 2.5928E-41f);
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(outputStream0, 1317324800L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        short short19 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 1);
        int int21 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 16777216);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 16777216 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        int int1 = org.apache.commons.io.EndianUtils.swapInteger((int) (short) 80);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1342177280 + "'", int1 == 1342177280);
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        float float8 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 32, 1.1582E-41f);
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
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        float float1 = org.apache.commons.io.EndianUtils.swapFloat(4.6028E-41f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.2949673E9f + "'", float1 == 4.2949673E9f);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(outputStream0, (float) 32831L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        byte[] byteArray2 = new byte[] { (byte) 100, (byte) 100 };
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray2, (int) (short) 0, (short) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray2, 13322, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0]");
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, 2.07745E-319d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, 6.9726E-41f);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 25600, (short) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 25600 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[94, -62, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 13322 + "'", short12 == (short) 13322);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, (float) 100L);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        int int11 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 0, (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, (int) (short) 0, 32);
        // The following exception was thrown during execution in test generation
        try {
            short short19 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[32, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 65535 + "'", int11 == 65535);
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, 1677721600);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, 4.6185E-41f);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 0, (short) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            float float23 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, (-10223615));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[100, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 16777216, (float) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, 0, 66]");
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(outputStream0, (long) 1627389952);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble(3.03865E-319d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 4.6006E-41f);
        float float16 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        float float18 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, (int) (byte) 1, (double) 7.1839E-41f);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.1777545E-38f + "'", float16 == 1.1777545E-38f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 1.1777545E-38f + "'", float18 == 1.1777545E-38f);
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
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
            float float26 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, (int) (short) -14336);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, -128, 63]");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, (double) 6553600);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        float float17 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 97, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, (double) (short) 13322);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, 1677721600);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, 4.6185E-41f);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 0, (short) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 25600, (float) 281474976710656L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[100, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 4.6006E-41f);
        float float16 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 0, 16777216);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 256, (short) 80);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 256 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.1777545E-38f + "'", float16 == 1.1777545E-38f);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(outputStream0, 16803071);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, (float) 100L);
        float float14 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            short short16 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, 8404737);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 8404737 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 100.0f + "'", float14 == 100.0f);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
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
            long long25 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray5, 587202560);
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
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        float float1 = org.apache.commons.io.EndianUtils.swapFloat((float) 12550144L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.1777649E-38f + "'", float1 == 1.1777649E-38f);
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(outputStream0, 72058143793741824L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, 25600, (short) 200);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 25600 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[10, 52, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long15 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray5, 167772160);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 4.6006E-41f);
        float float16 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        int int18 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            short short20 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 256);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 256 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 63, -128, 0, 0]");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.1777545E-38f + "'", float16 == 1.1777545E-38f);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8404737 + "'", int18 == 8404737);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
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
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (short) 25600, (int) (short) 80);
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
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        short short19 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 1);
        // The following exception was thrown during execution in test generation
        try {
            long long21 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 1590165504);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
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
            short short27 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (short) 10);
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
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1590165504L + "'", long23 == 1590165504L);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 7.2057594E18f + "'", float25 == 7.2057594E18f);
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        int int11 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            short short13 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, 65536);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 65536 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 65535 + "'", int11 == 65535);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
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
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 256, (float) 10);
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
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, (double) 32.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
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
            double double25 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray5, 8404737);
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
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        int int8 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 0);
        short short10 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, (int) (short) 1);
        long long12 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, (int) (byte) 0);
        int int14 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 1);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray4, (int) (short) 0);
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
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        int int11 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 0, (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, (int) (short) 0, 32);
        java.lang.Class<?> wildcardClass18 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[32, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 65535 + "'", int11 == 65535);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        int int11 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray4, (-939524096));
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
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble((double) 13322L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.87476E-318d + "'", double1 == 1.87476E-318d);
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, 1677721600);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, 4.6185E-41f);
        // The following exception was thrown during execution in test generation
        try {
            long long20 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 51200);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-65, -128, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, (int) (byte) 0, (int) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray4, 873070592, 12550144L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 873070592 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, -128, 63]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        int int1 = org.apache.commons.io.EndianUtils.swapInteger(66);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1107296256 + "'", int1 == 1107296256);
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        int int19 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        float float21 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) 'a', (int) (byte) 1);
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
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        int int19 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        int int21 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long23 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray5, 2612);
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
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 2612);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, (int) (short) 2560);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2560 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[52, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 65535);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, 0, 66]");
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        int int11 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, 0, (short) 256);
        int int16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray4, 25600, (double) 256L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 25600 out of bounds for length 4");
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
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble((double) (-9.395241E8f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.58974E-319d + "'", double1 == 2.58974E-319d);
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        long long15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, (float) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) 2305843009213693952L);
        java.lang.Class<?> wildcardClass22 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, 94, 63]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 4284743681L + "'", long15 == 4284743681L);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        short short19 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 100);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (byte) 0, (short) 2612);
        // The following exception was thrown during execution in test generation
        try {
            float float27 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, (-65536));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[52, 10, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, (double) (short) 20480);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
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
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray5, 10, 65535L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
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
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
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
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 16129, (-10223615));
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
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 4.6006E-41f);
        float float16 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        int int18 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 0);
        int int20 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            short short22 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 13322);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13322 out of bounds for length 5");
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
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(outputStream0, 6989586621679009792L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 0, (float) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (-65536));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, -56, 66, 0]");
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        long long13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (-10223615));
        java.lang.Class<?> wildcardClass17 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 1, 0, 100, -1]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 16737280L + "'", long13 == 16737280L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(outputStream0, (float) (-10223615));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
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
            short short26 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 51200);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 51200 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
        org.junit.Assert.assertTrue("'" + short24 + "' != '" + (short) 100 + "'", short24 == (short) 100);
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        long long12 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 0);
        java.lang.Class<?> wildcardClass13 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 13322L + "'", long12 == 13322L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 1113849856L);
        int int15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 10, (float) (-43910092071895040L));
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
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
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
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (short) 2560, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
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
            int int26 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 167772160);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 167772160 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 25600 + "'", short18 == (short) 25600);
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, 1677721600);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 536870912, 873070592);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 0, 100]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 10);
        int int16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        short short18 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            short short20 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 8404737);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 8404737 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 25600 + "'", short18 == (short) 25600);
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        long long13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (-10223615));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 8437504, (short) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 8437504 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 1, 0, 100, -1]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 16737280L + "'", long13 == 16737280L);
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        byte[] byteArray2 = new byte[] { (byte) 100, (byte) 100 };
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray2, (int) (short) 0, (short) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long7 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray2, 655360);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0]");
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, 0);
        short short14 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, 0);
        long long16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray4, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 0, (float) (short) 100);
        short short16 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 1);
        // The following exception was thrown during execution in test generation
        try {
            long long18 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray5, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, -56, 66, 0]");
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) -14336 + "'", short16 == (short) -14336);
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        // The following exception was thrown during execution in test generation
        try {
            int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 8437504);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble(1.590165504E9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.790703E-317d + "'", double1 == 5.790703E-317d);
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        long long13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 1);
        float float15 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 1107296256);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 16737280L + "'", long13 == 16737280L);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-3.03064E38f) + "'", float15 == (-3.03064E38f));
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        long long13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, (int) (byte) 0, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 16737280L + "'", long13 == 16737280L);
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        int int8 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 0);
        short short10 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, (int) (short) 1);
        long long12 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 10, 3.4727E-41f);
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
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 4.6006E-41f);
        float float16 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        float float18 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, (int) (short) 0);
        int int20 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long22 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 16803071);
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
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 4.6006E-41f);
        float float16 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        int int18 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 0);
        int int20 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        int int22 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            short short24 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 1120403456);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1120403456 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 63, -128, 0, 0]");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.1777545E-38f + "'", float16 == 1.1777545E-38f);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8404737 + "'", int18 == 8404737);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 16129 + "'", int20 == 16129);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 8404737 + "'", int22 == 8404737);
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(outputStream0, 1120403456);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble((double) 1.1587E-41f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.062242494E-314d + "'", double1 == 1.062242494E-314d);
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, (int) (byte) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            short short17 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, 167772160);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 167772160 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
        byte[] byteArray0 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray0, 256);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 1, (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (byte) 1, 100);
        // The following exception was thrown during execution in test generation
        try {
            short short22 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 873070592);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 873070592 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 100, 0, 0, 0]");
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 4.6006E-41f);
        float float16 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 0, 16777216);
        // The following exception was thrown during execution in test generation
        try {
            long long21 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray5, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.1777545E-38f + "'", float16 == 1.1777545E-38f);
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, (double) 100.0004f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, 1, (short) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            short short17 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[10, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, 6.9726E-41f);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 2560, (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2560 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[94, -62, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 13322 + "'", short12 == (short) 13322);
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble((double) 1342177280);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6846E-319d + "'", double1 == 2.6846E-319d);
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
        float float1 = org.apache.commons.io.EndianUtils.swapFloat((float) 35L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.397E-42f + "'", float1 == 4.397E-42f);
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        short short13 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            float float15 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 536870912);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 1 + "'", short13 == (short) 1);
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        long long17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        long long19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            double double21 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray5, (int) (short) 20480);
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
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
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
            double double26 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray5, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 25600 + "'", short18 == (short) 25600);
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        float float12 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long14 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray5, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.8668E-41f + "'", float12 == 1.8668E-41f);
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, (double) (-65536.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        short short19 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1120403456, (int) (short) 2612);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
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
            int int26 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 12550144);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 25600 + "'", short18 == (short) 25600);
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(outputStream0, (int) (short) 200);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, 1677721600);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, 4.6185E-41f);
        // The following exception was thrown during execution in test generation
        try {
            long long20 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray4, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-65, -128, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        int int8 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 0);
        short short10 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, (int) (short) 1);
        long long12 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, (int) (byte) 0);
        int int14 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 1);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray4, 16129);
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
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray0, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, 0, (double) 4.6017E-41f);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, 0, -32]");
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(outputStream0, (float) 1317324800L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
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
            short short27 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 16803071);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 16803071 out of bounds for length 5");
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
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) 25600);
        float float14 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, (float) 32L);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, 1627389952, (short) 13322);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1627389952 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 0, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 57.0f + "'", float14 == 57.0f);
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
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
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, 1590165504, (double) 1113849856L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1590165504 out of bounds for length 5");
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
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        // The following exception was thrown during execution in test generation
        try {
            int int13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 12550144);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 12550144 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(outputStream0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 1, (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (byte) 1, 100);
        int int22 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            double double24 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray5, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 100, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 25600 + "'", int22 == 25600);
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray0, 872415232, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot store to byte/boolean array because \"data\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
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
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, (int) (short) 25600, 1.0d);
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
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 7.2057594E18f + "'", float25 == 7.2057594E18f);
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
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
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (-939524096), (short) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -939524096 out of bounds for length 5");
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
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) 25600);
        int int14 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray4, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 51200);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 100, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1113849856 + "'", int14 == 1113849856);
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
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
            int int31 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 13322);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
        byte[] byteArray2 = new byte[] { (byte) 100, (byte) 100 };
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray2, (int) (short) 0, (short) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray2, (int) (short) 2560, (double) 72057594037927936L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2560 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0]");
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        int int8 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long10 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 2560);
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
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        int int11 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 65535, 1.09951163E12f);
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
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
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
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 66, 0);
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
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 10);
        int int16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray5, 171180032, 72057594037927936L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 171180032 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
        short short1 = org.apache.commons.io.EndianUtils.swapShort((short) 80);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 20480 + "'", short1 == (short) 20480);
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) 25600);
        long long14 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        long long16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long18 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray4, 25600);
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
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        float float19 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 100, (float) (short) 80);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + (-131072.0f) + "'", float19 == (-131072.0f));
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 1113849856L);
        // The following exception was thrown during execution in test generation
        try {
            short short15 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, -56, -124, 78]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (byte) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (-10223615), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 0, 0, 0]");
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, (double) 281474976710656L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        int int19 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (-1), (-939524096));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-939524096) + "'", int19 == (-939524096));
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, (float) 100L);
        int int14 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray4, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray4, 10);
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
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, (float) 100L);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray4, 873070592);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 1113849856L);
        long long15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, 1342177280, (double) (short) 20480);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1342177280 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, -56, -124, 78]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1317324800L + "'", long15 == 1317324800L);
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
        long long1 = org.apache.commons.io.EndianUtils.swapLong((long) 16129);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 89790517570699264L + "'", long1 == 89790517570699264L);
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        int int8 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray4, (int) (short) 200);
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
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        long long12 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 0);
        short short14 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        java.lang.Class<?> wildcardClass15 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 13322L + "'", long12 == 13322L);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 13322 + "'", short14 == (short) 13322);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, 6.9726E-41f);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 8404737);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 8404737 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[94, -62, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 13322 + "'", short12 == (short) 13322);
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, (double) 6.9726E-41f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
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
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 51200, 171180032);
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
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (byte) 1, (short) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray5, 587202560, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 587202560 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, -1, -1, 0, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        long long15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, (float) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) 2305843009213693952L);
        // The following exception was thrown during execution in test generation
        try {
            short short23 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 65535);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 65535 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, 94, 63]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 4284743681L + "'", long15 == 4284743681L);
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(outputStream0, 35L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
        long long1 = org.apache.commons.io.EndianUtils.swapLong(6989586621679009792L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 97L + "'", long1 == 97L);
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray5, 12550144, (long) (short) 256);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 12550144 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 13322 + "'", short12 == (short) 13322);
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        int int8 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 0);
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long12 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray4, 6553600);
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
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long13 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray5, 873070592);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 0, 0, 0]");
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        int int19 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        float float21 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray5, (int) (short) -1, (long) (-65536));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-939524096) + "'", int19 == (-939524096));
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + (-131072.0f) + "'", float21 == (-131072.0f));
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        int int11 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, 0, (short) 256);
        int int16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (byte) 10, 1.1587E-41f);
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
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            float float8 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 100, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        short short19 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 1);
        int int21 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long23 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 1677721600);
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
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble((double) (-131072.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.54E-322d + "'", double1 == 9.54E-322d);
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 4.6006E-41f);
        float float16 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        float float18 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, (int) (short) 0);
        float float20 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (byte) 100, (short) 200);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
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
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (byte) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            long long13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 65535);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 0, 0, 0]");
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) 25600);
        long long14 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray4, 587202560);
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
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
        int int1 = org.apache.commons.io.EndianUtils.swapInteger(32831);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1065353216 + "'", int1 == 1065353216);
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        int int11 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 0, (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, (int) (short) 0, 32);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 52);
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
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble((double) 35L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.152776E-317d + "'", double1 == 4.152776E-317d);
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        int int8 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 0);
        short short10 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray4, (int) (byte) -1);
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
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        long long15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, (float) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) 2305843009213693952L);
        // The following exception was thrown during execution in test generation
        try {
            long long23 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 13322);
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
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        long long17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        long long19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        int int21 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        int int23 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (byte) 1, (short) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double28 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray5, 8437504);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 1, 0, 94, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 13322 + "'", short12 == (short) 13322);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1590165504L + "'", long17 == 1590165504L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1590165504L + "'", long19 == 1590165504L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1590165504 + "'", int23 == 1590165504);
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
        long long1 = org.apache.commons.io.EndianUtils.swapLong((long) 51294);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 6829708834907357184L + "'", long1 == 6829708834907357184L);
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
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
            long long25 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray5, 66);
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
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, (float) 100L);
        int int14 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray4, 97);
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
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, 6.9726E-41f);
        // The following exception was thrown during execution in test generation
        try {
            float float20 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, (int) (short) 100);
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
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(outputStream0, 32.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        long long17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 200);
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
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 16803071, (float) 32831L);
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
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, 0);
        int int14 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 16129);
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
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 1, (short) 13322);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 25600, (short) 2560);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 25600 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 10, 52, 66, 0]");
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, (double) 1677721600);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        short short19 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long21 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray5, 16803071);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(outputStream0, 1120403456L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, 1, (short) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 1590165504, (float) 2305843009213693952L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[10, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(outputStream0, (long) 1065353216);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(outputStream0, (short) 80);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        // The following exception was thrown during execution in test generation
        try {
            float float14 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, 167772160);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[10, 52, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, (double) 2814749767106560L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, (float) 100L);
        int int14 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, (int) (short) 1);
        java.lang.Class<?> wildcardClass15 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 51200 + "'", int14 == 51200);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        long long13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) (short) 256);
        // The following exception was thrown during execution in test generation
        try {
            float float18 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 32831);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, -128, 67, 0]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 16737280L + "'", long13 == 16737280L);
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        int int11 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 0, (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray4, 1120403456);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, -1, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 65535 + "'", int11 == 65535);
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
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
            short short25 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 16803071);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 16803071 out of bounds for length 5");
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
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        int int15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1120403456, 4.6017E-41f);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25600 + "'", int15 == 25600);
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (byte) 1, 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 720575940379279360L);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 2560);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 32, 93, 0]");
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(outputStream0, (float) 1065353216);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
        byte[] byteArray2 = new byte[] { (byte) 100, (byte) 100 };
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray2, (int) (short) 0, (short) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray2, 1677721600, (float) 283467841536L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0]");
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, 1677721600);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, 4.6185E-41f);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, (int) (short) 0, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray4, 13172735, 11218454577152L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13172735 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[97, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        long long15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, (float) 1);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 0, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, 1590165504, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1590165504 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[97, 0, 0, 0, 63]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 4284743681L + "'", long15 == 4284743681L);
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        long long11 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            short short13 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, 8437504);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 8437504 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 4294967041L + "'", long11 == 4294967041L);
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        int int11 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            short short13 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, (-10223615));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -10223615 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 65535 + "'", int11 == 65535);
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(outputStream0, (int) (short) 20480);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, 1677721600);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, 4.6185E-41f);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 13172735, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-65, -128, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 4.6006E-41f);
        float float16 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 0, 16777216);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (byte) 1, (int) 'a');
        java.lang.Class<?> wildcardClass23 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 97, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.1777545E-38f + "'", float16 == 1.1777545E-38f);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        float float8 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, (int) (short) 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, 0, (short) 2560);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray4, 65536);
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
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 1113849856L);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 16777216);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, -56, -124, 78]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        long long17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            double double19 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray5, 97);
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
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        short short13 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, 0, 1.0651686317E-314d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[64, -49, -128, -128, 0]");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 1 + "'", short13 == (short) 1);
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, 0);
        short short14 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 256, 1.8414561E-38f);
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
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray0, (int) (short) 2612);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, 1.8650332446E-314d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) 2612);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray5, 12550144);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[52, 10, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 1, (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (byte) 1, 100);
        // The following exception was thrown during execution in test generation
        try {
            long long22 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 100, 0, 0, 0]");
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 1113849856L);
        long long15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 256, (float) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, -56, -124, 78]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1317324800L + "'", long15 == 1317324800L);
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        long long15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, (float) 1);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 0, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int23 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 8404737);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 8404737 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[97, 0, 0, 0, 63]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 4284743681L + "'", long15 == 4284743681L);
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 1, (float) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            float float17 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 1065353216);
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
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, 1677721600);
        // The following exception was thrown during execution in test generation
        try {
            long long17 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray4, 66);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 0, 100]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        float float15 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        java.lang.Class<?> wildcardClass16 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-3.03064E38f) + "'", float15 == (-3.03064E38f));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 4.6006E-41f);
        float float16 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        int int18 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long20 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray5, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 63, -128, 0, 0]");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.1777545E-38f + "'", float16 == 1.1777545E-38f);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8404737 + "'", int18 == 8404737);
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
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
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 587202560, 1590165504);
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
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 4.6006E-41f);
        float float16 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        int int18 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 0);
        int int20 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            double double22 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray5, 13322);
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
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
        long long1 = org.apache.commons.io.EndianUtils.swapLong((long) 194);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-4467570830351532032L) + "'", long1 == (-4467570830351532032L));
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (byte) 1, 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 720575940379279360L);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray5, 587202560);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 32, 93, 0]");
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        int int11 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 0, (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (short) 1, (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            float float19 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, (int) (short) 20480);
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
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
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
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) ' ', (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
        org.junit.Assert.assertTrue("'" + short24 + "' != '" + (short) 100 + "'", short24 == (short) 100);
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 1, (short) 13322);
        int int19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 0, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) (short) 25600);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 25600 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 13322 + "'", int19 == 13322);
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (byte) 1, (short) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray5, 51200);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, -1, -1, 0, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        float float19 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, 171180032, (double) (-65536));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 171180032 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + (-131072.0f) + "'", float19 == (-131072.0f));
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        int int19 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        int int21 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long23 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 2612);
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
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) 25600);
        float float14 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, 10, (short) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 100, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 57.0f + "'", float14 == 57.0f);
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            short short16 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, 100, -1, 0]");
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 4.6006E-41f);
        float float16 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        int int18 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 0);
        int int20 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (-65536), 2612);
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
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, 1677721600);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (-65536));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray4, 1120403456, (long) 16129);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1120403456 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, -1, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(outputStream0, 5.890124E-39f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray0, 194);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(outputStream0, 32831);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(outputStream0, 281474976710656L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray0, (-939524096), (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot store to byte/boolean array because \"data\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray4, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 100, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) 25600);
        float float14 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, (float) 32L);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray4, 872415232);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 0, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 57.0f + "'", float14 == 57.0f);
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, 1677721600);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (-65536));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray4, 171180032, (long) 1590165504);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 171180032 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, -1, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        float float15 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 8404737, (float) 3749809639739359232L);
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
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            short short2 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray0, 1677721600);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from byte/boolean array because \"data\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(outputStream0, 1.1777649E-38f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
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
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 200, (float) 1113849856);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, -1, 0, -128, 63]");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }
}

