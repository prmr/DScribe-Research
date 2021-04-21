import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest11 {

    public static boolean debug = false;

    @Test
    public void test5501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5501");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble((double) (-4.637798E-39f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.719242597934E-312d + "'", double1 == 2.719242597934E-312d);
    }

    @Test
    public void test5502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5502");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, (int) (byte) 0, (int) (byte) 1);
        int int17 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray4, (int) (byte) 0);
        int int19 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long21 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray4, 1107296256);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test5503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5503");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 13322);
        float float22 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double24 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray5, 51200);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 100.0004f + "'", float22 == 100.0004f);
    }

    @Test
    public void test5504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5504");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5505");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 6553600, 873070592);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 12, 66, 0]");
    }

    @Test
    public void test5506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5506");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray0, 8437504);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from byte/boolean array because \"data\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5507");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 100, (float) 6829708834907357184L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
    }

    @Test
    public void test5508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5508");
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
            double double26 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray5, 25600);
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
    public void test5509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5509");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) 2612);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (-16512));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[52, 10, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
    }

    @Test
    public void test5510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5510");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        float float8 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long10 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray4, 32831);
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
    public void test5511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5511");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 0, (float) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1677721600, 81792);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, -56, 66, 0]");
    }

    @Test
    public void test5512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5512");
        float float1 = org.apache.commons.io.EndianUtils.swapFloat(1.67798016E8f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9.0010552E9f + "'", float1 == 9.0010552E9f);
    }

    @Test
    public void test5513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5513");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 4.6006E-41f);
        float float16 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        int int18 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 0);
        int int20 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long22 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray5, 171180032);
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
    public void test5514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5514");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(outputStream0, (float) 1199622144);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5515");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(outputStream0, (float) 4783948704174309376L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5516");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, (double) 351298260041727L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5517");
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
            long long30 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (byte) 100);
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
    public void test5518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5518");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble((double) (-0.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.32E-322d + "'", double1 == 6.32E-322d);
    }

    @Test
    public void test5519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5519");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        float float12 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short14 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 51294, (-2143354624));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.8668E-41f + "'", float12 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 13322 + "'", short14 == (short) 13322);
    }

    @Test
    public void test5520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5520");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble((double) 141557827108864L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8575194004E-314d + "'", double1 == 1.8575194004E-314d);
    }

    @Test
    public void test5521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5521");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        long long15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, (float) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray5, 167772160, 110234630619136L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 167772160 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 0, -128, 63]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 4284743681L + "'", long15 == 4284743681L);
    }

    @Test
    public void test5522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5522");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        int int10 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) (byte) 1);
        float float12 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (short) 25600, (-10223615));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.8668E-41f + "'", float12 == 1.8668E-41f);
    }

    @Test
    public void test5523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5523");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 66, (short) 80);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 66 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 0, 0, 0]");
    }

    @Test
    public void test5524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5524");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, 7.960256947E-315d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5525");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, (int) (byte) 0, (int) (byte) 1);
        int int17 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 3407872);
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
    public void test5526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5526");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 1113849856L);
        int int15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long17 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray5, 655360);
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
    public void test5527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5527");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 1, (float) (byte) -1);
        long long17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 1);
        // The following exception was thrown during execution in test generation
        try {
            double double19 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray5, 873070592);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test5528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5528");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, (float) 100L);
        long long14 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        float float16 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray4, 13107200);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1120403456L + "'", long14 == 1120403456L);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 100.0f + "'", float16 == 100.0f);
    }

    @Test
    public void test5529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5529");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        float float8 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, (int) (byte) 100);
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
    public void test5530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5530");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        long long15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, (float) 1);
        long long20 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        short short22 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (byte) 1);
        java.lang.Class<?> wildcardClass23 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 0, -128, 63]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 4284743681L + "'", long15 == 4284743681L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 2147483649L + "'", long20 == 2147483649L);
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) 0 + "'", short22 == (short) 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5531");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (byte) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            long long13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 80);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 0, 0, 0]");
    }

    @Test
    public void test5532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5532");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        int int15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 16777471);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 16777471 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25600 + "'", int15 == 25600);
    }

    @Test
    public void test5533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5533");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long14 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 8404737);
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
    public void test5534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5534");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        float float8 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray4, 873070592, (long) 80);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 873070592 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 100, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-3.03064E38f) + "'", float8 == (-3.03064E38f));
    }

    @Test
    public void test5535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5535");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(outputStream0, (long) (-2143354624));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5536");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 10, (byte) -1, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, 0, (short) 2560);
        // The following exception was thrown during execution in test generation
        try {
            long long11 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray4, 873070592);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 10, -1, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4294904420L + "'", long6 == 4294904420L);
    }

    @Test
    public void test5537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5537");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble(2.03793453199E-312d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7540684863561146E-38d + "'", double1 == 1.7540684863561146E-38d);
    }

    @Test
    public void test5538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5538");
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
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray5, 2560, (long) 6553600);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2560 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 63, 1, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 25600 + "'", short18 == (short) 25600);
    }

    @Test
    public void test5539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5539");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 4.6006E-41f);
        float float16 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (byte) 1, (int) (short) 20480);
        // The following exception was thrown during execution in test generation
        try {
            float float21 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, (-10223615));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 80, 0, 0]");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.1777545E-38f + "'", float16 == 1.1777545E-38f);
    }

    @Test
    public void test5540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5540");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble(1.8575092765E-314d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.618539608568165E-41d + "'", double1 == 4.618539608568165E-41d);
    }

    @Test
    public void test5541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5541");
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
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, 0, (double) 655360.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 10 + "'", short18 == (short) 10);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 4284743681L + "'", long23 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-10223615) + "'", int25 == (-10223615));
    }

    @Test
    public void test5542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5542");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) 25600);
        long long14 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        long long16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, 0, (short) -32705);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray4, 65536, 7205759403792793600L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 65536 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[63, -128, 100, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1113849856L + "'", long14 == 1113849856L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1113849856L + "'", long16 == 1113849856L);
    }

    @Test
    public void test5543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5543");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        int int10 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, 1.181211E-38f);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 873070592, 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[91, -97, -128, 0, 0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test5544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5544");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, 0);
        short short14 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray4, 0, 4.77444888683E-312d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-61, 99, 127, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 0 + "'", short14 == (short) 0);
    }

    @Test
    public void test5545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5545");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 10);
        int int16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        short short18 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (short) 1);
        int int20 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, 16803071, 3.47667858023255E-310d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 16803071 out of bounds for length 5");
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
    public void test5546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5546");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        int int15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 1);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (byte) 1, (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 100);
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
    public void test5547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5547");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        long long17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        long long19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        int int21 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        long long23 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (byte) 0);
        int int25 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 8667658, 587202560);
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test5548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5548");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble((double) 2147483649L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.73833895479513E-310d + "'", double1 == 1.73833895479513E-310d);
    }

    @Test
    public void test5549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5549");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, 2.95016E-319d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5550");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 10);
        int int16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        short short18 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double23 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray5, 0);
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
    public void test5551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5551");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 4.6006E-41f);
        float float16 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        int int18 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, 167798015, 100.00039672851562d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 167798015 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 63, -128, 0, 0]");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.1777545E-38f + "'", float16 == 1.1777545E-38f);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8404737 + "'", int18 == 8404737);
    }

    @Test
    public void test5552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5552");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 4.6006E-41f);
        float float16 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        float float18 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, (int) (short) 0);
        int int20 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 1099511627776L);
        // The following exception was thrown during execution in test generation
        try {
            float float25 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, (-10223615));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, -128, 83, 0]");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.1777545E-38f + "'", float16 == 1.1777545E-38f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 1.1777545E-38f + "'", float18 == 1.1777545E-38f);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32831 + "'", int20 == 32831);
    }

    @Test
    public void test5553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5553");
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
            long long26 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray4, 1107296256);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[100, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test5554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5554");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(outputStream0, (float) 6829708834907357184L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5555");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble((double) 89790517570699264L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.785559E-317d + "'", double1 == 7.785559E-317d);
    }

    @Test
    public void test5556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5556");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        float float8 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, (int) (short) 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) '4');
        int int13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 0);
        short short15 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, 3407872, (short) 13322);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3407872 out of bounds for length 4");
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
    public void test5557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5557");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(outputStream0, (float) 351298260041727L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5558");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 4.6006E-41f);
        float float16 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        float float18 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, (int) (short) 0);
        int int20 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, 16777471, (double) 2.3372445E-38f);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 16777471 out of bounds for length 5");
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
    public void test5559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5559");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        long long15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, (float) 1);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (short) 1, (-65536));
        short short23 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (short) 0);
        int int25 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 6553600);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 0, -1, -1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 4284743681L + "'", long15 == 4284743681L);
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) 1 + "'", short23 == (short) 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-16777215) + "'", int25 == (-16777215));
    }

    @Test
    public void test5560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5560");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) (-1L));
        int int20 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (byte) 1);
        short short22 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, -128, -65, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 13322 + "'", short12 == (short) 13322);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 12550144 + "'", int20 == 12550144);
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) 0 + "'", short22 == (short) 0);
    }

    @Test
    public void test5561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5561");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 1, (short) 13322);
        int int19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) (short) 1);
        float float21 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) -1, (float) 416611827712L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 13322 + "'", int19 == 13322);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 45.009766f + "'", float21 == 45.009766f);
    }

    @Test
    public void test5562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5562");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) 25600);
        float float14 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, (float) 32L);
        int int19 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray4, (int) (short) 2612, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2612 out of bounds for length 4");
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
    public void test5563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5563");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        long long17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        long long19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        int int21 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        java.lang.Class<?> wildcardClass22 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, -56, 94, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 13322 + "'", short12 == (short) 13322);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1590165504L + "'", long17 == 1590165504L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1590165504L + "'", long19 == 1590165504L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test5564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5564");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 256);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 0, 0, 0]");
    }

    @Test
    public void test5565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5565");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        float float12 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short14 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.8668E-41f + "'", float12 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 13322 + "'", short14 == (short) 13322);
    }

    @Test
    public void test5566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5566");
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
            double double26 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray5, (int) (short) -32577);
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
    public void test5567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5567");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, 1677721600);
        long long17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        short short19 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray4, 872415232);
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
    public void test5568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5568");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (byte) 1, 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 720575940379279360L);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray5, (int) (short) -32705);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 32, 93, 0]");
    }

    @Test
    public void test5569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5569");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 4.6006E-41f);
        float float16 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (byte) 1, (int) (short) 20480);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (-2134900737), (short) 8261);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -2134900737 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 80, 0, 0]");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.1777545E-38f + "'", float16 == 1.1777545E-38f);
    }

    @Test
    public void test5570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5570");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        float float8 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, (int) (short) 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) '4');
        float float13 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            float float15 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, 16777471);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test5571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5571");
        long long1 = org.apache.commons.io.EndianUtils.swapLong((long) 536870912);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 137438953472L + "'", long1 == 137438953472L);
    }

    @Test
    public void test5572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5572");
        float float1 = org.apache.commons.io.EndianUtils.swapFloat((float) 13172735L);
        org.junit.Assert.assertTrue(Float.isNaN(float1));
    }

    @Test
    public void test5573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5573");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        int int10 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, 1.181211E-38f);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray5, 65535, (-72057589742960640L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 65535 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[91, -97, -128, 0, 0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test5574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5574");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) 25600);
        long long14 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            float float16 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, (int) (byte) 1);
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
    public void test5575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5575");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) 25600);
        float float14 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, 0);
        long long16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, 13322);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (-1082130432), (short) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1082130432 out of bounds for length 4");
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
    public void test5576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5576");
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
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray5, (int) (short) 1, 72057594037927936L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
        org.junit.Assert.assertTrue("'" + short30 + "' != '" + (short) 0 + "'", short30 == (short) 0);
    }

    @Test
    public void test5577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5577");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        float float12 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long14 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 20480);
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
    public void test5578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5578");
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
            int int29 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 13322);
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
    public void test5579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5579");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        long long13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (-10223615));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 10, (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 1, 0, 100, -1]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 16737280L + "'", long13 == 16737280L);
    }

    @Test
    public void test5580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5580");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray0, 0, (short) -14336);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot store to byte/boolean array because \"data\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5581");
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
            double double32 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray5, (int) (short) 13312);
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
    public void test5582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5582");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        float float8 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, (int) (short) 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, 0, (short) 2560);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (byte) 0, (float) 4294967296L);
        // The following exception was thrown during execution in test generation
        try {
            float float16 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, 171180032);
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
    public void test5583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5583");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 0, (-10223615));
        // The following exception was thrown during execution in test generation
        try {
            int int18 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 587202560);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
    }

    @Test
    public void test5584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5584");
        long long1 = org.apache.commons.io.EndianUtils.swapLong(72058143793741824L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2147483649L + "'", long1 == 2147483649L);
    }

    @Test
    public void test5585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5585");
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
            double double31 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray5, 1342177280);
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
    public void test5586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5586");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        int int14 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (byte) 1, (short) 16256);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray5, 100, 351298260041727L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
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
    public void test5587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5587");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 1, (float) (byte) -1);
        long long17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 6553600);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6553600 out of bounds for length 5");
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
    public void test5588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5588");
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
            int int29 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 171180232);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, -56, -124, 78, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 25600 + "'", short18 == (short) 25600);
    }

    @Test
    public void test5589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5589");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, 1677721600);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (-65536));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray4, 13141070, (double) 6553600);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13141070 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, -1, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test5590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5590");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        long long13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 1);
        float float15 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 8406784);
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
    public void test5591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5591");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 1, (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (byte) 1, 100);
        int int22 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, (int) ' ', 1.41985E-319d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 100, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 25600 + "'", int22 == 25600);
    }

    @Test
    public void test5592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5592");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 4.6006E-41f);
        float float16 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        float float18 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, (int) (short) 0);
        float float20 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 10);
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
    public void test5593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5593");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (byte) 1, 1);
        short short13 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            int int18 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 1342177280);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1342177280 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, 0, -128, -65]");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 1 + "'", short13 == (short) 1);
    }

    @Test
    public void test5594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5594");
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
            int int27 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 25666);
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
    public void test5595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5595");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble((double) 1199622144);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.21731685E-315d + "'", double1 == 4.21731685E-315d);
    }

    @Test
    public void test5596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5596");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 1, (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (byte) 1, 100);
        int int22 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (-2134900737), (float) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 100, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 25600 + "'", int22 == 25600);
    }

    @Test
    public void test5597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5597");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        float float8 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, (int) (short) 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) '4');
        float float13 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long15 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray4, 587202560);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test5598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5598");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, (float) 100L);
        long long14 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, (-1082130432));
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
    public void test5599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5599");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        long long19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 1);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 13322);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 8406784);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 8406784 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1120403456L + "'", long19 == 1120403456L);
    }

    @Test
    public void test5600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5600");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) 2612);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            short short21 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 171180232);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 171180232 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
    }

    @Test
    public void test5601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5601");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 10, (byte) -1, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray4, (int) (short) 13312);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[100, 10, -1, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4294904420L + "'", long6 == 4294904420L);
    }

    @Test
    public void test5602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5602");
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
            float float24 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, 32831);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test5603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5603");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 0, (float) (short) 100);
        short short16 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 65536L);
        int int21 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 1);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) -14336);
        int int26 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long28 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) -32577);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, -56, -128, 71, 0]");
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) -14336 + "'", short16 == (short) -14336);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4685824 + "'", int21 == 4685824);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1199622144 + "'", int26 == 1199622144);
    }

    @Test
    public void test5604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5604");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble((double) 4294967041L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.78608385704366E-310d + "'", double1 == 1.78608385704366E-310d);
    }

    @Test
    public void test5605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5605");
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
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, 25666, 1.0656E-319d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 25666 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, 0, 66]");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1120403456L + "'", long19 == 1120403456L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test5606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5606");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble((double) 1.4E-43f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1655E-320d + "'", double1 == 1.1655E-320d);
    }

    @Test
    public void test5607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5607");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        int int15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 1);
        float float17 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        int int19 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 10240, (short) 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10240 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25600 + "'", int15 == 25600);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + (-3.03064E38f) + "'", float17 == (-3.03064E38f));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 16737280 + "'", int19 == 16737280);
    }

    @Test
    public void test5608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5608");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        float float15 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, (int) (short) 2612, (double) 200L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2612 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-3.03064E38f) + "'", float15 == (-3.03064E38f));
    }

    @Test
    public void test5609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5609");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, (double) 4.6185E-41f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5610");
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
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 32831, (int) (short) 20480);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[100, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test5611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5611");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        float float8 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, (int) (short) 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) '4');
        int int13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, 0, (short) 52);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray4, 16129, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 16129 out of bounds for length 4");
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
    public void test5612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5612");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(outputStream0, (float) 256L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5613");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (-16512));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -16512 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
    }

    @Test
    public void test5614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5614");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 13322);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 80, 5.785736E-39f);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, -56, 66]");
    }

    @Test
    public void test5615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5615");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        int int19 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        float float21 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 16256, 2.83467842E11f);
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
    public void test5616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5616");
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
            float float27 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 13172735);
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
    public void test5617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5617");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        long long10 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray5, (int) (short) 13322, (long) 51266);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13322 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
    }

    @Test
    public void test5618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5618");
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
            short short25 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 172097536);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 172097536 out of bounds for length 5");
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
    public void test5619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5619");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 1113849856L);
        long long15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 1);
        int int17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 1, (float) 873070592);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray5, 172097536, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 172097536 out of bounds for length 5");
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
    public void test5620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5620");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 13322);
        short short22 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        int int24 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) (short) 1);
        int int26 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 194);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) 13322 + "'", short22 == (short) 13322);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-939510774) + "'", int26 == (-939510774));
    }

    @Test
    public void test5621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5621");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        int int15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 1);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            short short20 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (short) 8261);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 8261 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25600 + "'", int15 == 25600);
    }

    @Test
    public void test5622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5622");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
    }

    @Test
    public void test5623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5623");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 1113849856L);
        int int15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        int int17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (short) -32577, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, -56, -124, 78]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test5624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5624");
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
            long long26 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray4, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[52, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test5625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5625");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, 1677721600);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (-65536));
        // The following exception was thrown during execution in test generation
        try {
            double double20 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray4, 13107200);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, -1, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test5626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5626");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        short short19 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 1);
        // The following exception was thrown during execution in test generation
        try {
            double double21 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray5, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
    }

    @Test
    public void test5627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5627");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 10);
        int int16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, 25600.0f);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) -32705);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, -56, 70, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test5628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5628");
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
            long long34 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 20480);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test5629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5629");
        float float1 = org.apache.commons.io.EndianUtils.swapFloat(3.5966E-41f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 57.0f + "'", float1 == 57.0f);
    }

    @Test
    public void test5630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5630");
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
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray5, (-10223606), 72168640417366016L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -10223606 out of bounds for length 5");
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
    public void test5631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5631");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        long long19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 1);
        int int21 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long23 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 1120403456);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1120403456L + "'", long19 == 1120403456L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test5632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5632");
        float float1 = org.apache.commons.io.EndianUtils.swapFloat(5.890124E-39f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2612.0f + "'", float1 == 2612.0f);
    }

    @Test
    public void test5633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5633");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 10);
        int int16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        short short18 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            long long23 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 1677721600);
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
    public void test5634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5634");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) 25600);
        // The following exception was thrown during execution in test generation
        try {
            short short14 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 100, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test5635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5635");
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
            float float28 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 172097536);
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
    public void test5636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5636");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 0, (int) (short) 13322);
        long long15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 1);
        // The following exception was thrown during execution in test generation
        try {
            long long17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 587202560);
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
    public void test5637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5637");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, 1677721600);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (-65536));
        // The following exception was thrown during execution in test generation
        try {
            float float20 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, 13322);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, -1, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test5638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5638");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(outputStream0, (float) 14636698788954112L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5639");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray0, 81792);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5640");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        long long13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 1);
        int int15 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 0);
        long long17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long19 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray5, 6553600);
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
    public void test5641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5641");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 1113849856L);
        int int15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        int int17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, 13107200, 1.099511627776E12d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13107200 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, -56, -124, 78]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test5642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5642");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, (int) (byte) 0, (int) (byte) 1);
        int int17 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray4, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray4, 171180032, 16129L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 171180032 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test5643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5643");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        long long12 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 0);
        short short14 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 25600, (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 25600 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 13322L + "'", long12 == 13322L);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 13322 + "'", short14 == (short) 13322);
    }

    @Test
    public void test5644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5644");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray0, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5645");
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
            long long33 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) '#');
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
    public void test5646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5646");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 1, (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (byte) 1, 100);
        int int22 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            float float24 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, (-10223615));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 100, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 25600 + "'", int22 == 25600);
    }

    @Test
    public void test5647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5647");
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
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray5, 0, 16737280L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 100, -1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 4284743681L + "'", long15 == 4284743681L);
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) 1 + "'", short23 == (short) 1);
    }

    @Test
    public void test5648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5648");
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
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 32831, (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32831 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, -128, 63, 1, 0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 81792 + "'", int25 == 81792);
    }

    @Test
    public void test5649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5649");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        long long12 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 0);
        short short14 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        long long16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) 97);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (-10223606), 8437504);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, -62, 66, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 13322L + "'", long12 == 13322L);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 13322 + "'", short14 == (short) 13322);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 13322L + "'", long16 == 13322L);
    }

    @Test
    public void test5650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5650");
        float float1 = org.apache.commons.io.EndianUtils.swapFloat((float) 36238803739869184L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.7540707E-38f + "'", float1 == 1.7540707E-38f);
    }

    @Test
    public void test5651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5651");
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
            int int25 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 6553600);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6553600 out of bounds for length 5");
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
    public void test5652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5652");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 1, (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (byte) 1, 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 25600, (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 25600 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 100, 0, 0, 0]");
    }

    @Test
    public void test5653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5653");
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
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray4, 100, (double) (-14336));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 4");
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
    public void test5654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5654");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, (double) 4783948704174309376L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5655");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble(4.600602988224807E-41d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.856991211E-314d + "'", double1 == 1.856991211E-314d);
    }

    @Test
    public void test5656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5656");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 10);
        int int16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        short short18 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 171180032);
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
    public void test5657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5657");
        float float1 = org.apache.commons.io.EndianUtils.swapFloat((float) (-10223615));
        org.junit.Assert.assertTrue(Float.isNaN(float1));
    }

    @Test
    public void test5658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5658");
        float float1 = org.apache.commons.io.EndianUtils.swapFloat((float) 837518622719L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.4151E-41f + "'", float1 == 2.4151E-41f);
    }

    @Test
    public void test5659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5659");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray5, 16803071, (long) 16777471);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 16803071 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, -56, 94, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 13322 + "'", short12 == (short) 13322);
    }

    @Test
    public void test5660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5660");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble(4.585E-320d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test5661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5661");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble(1.591882516E-314d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.20306052481024E14d + "'", double1 == 2.20306052481024E14d);
    }

    @Test
    public void test5662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5662");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        long long13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) (short) 256);
        float float18 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        java.lang.Class<?> wildcardClass19 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, -128, 67, 0]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 16737280L + "'", long13 == 16737280L);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 256.0f + "'", float18 == 256.0f);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5663");
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
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 20905984, 172097536);
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
    public void test5664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5664");
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
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 2560, (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2560 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 100.0004f + "'", float22 == 100.0004f);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
    }

    @Test
    public void test5665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5665");
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
            int int24 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 1113849856);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test5666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5666");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, (double) 1.181211E-38f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5667");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        float float8 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, (int) (short) 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) '4');
        float float13 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray4, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test5668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5668");
        long long1 = org.apache.commons.io.EndianUtils.swapLong(1627389952L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 416611827712L + "'", long1 == 416611827712L);
    }

    @Test
    public void test5669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5669");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        long long12 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 80);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 80 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 13322L + "'", long12 == 13322L);
    }

    @Test
    public void test5670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5670");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 1, (float) (byte) -1);
        long long17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 1);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, 65536, 1.8650332446E-314d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 65536 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, -128, -65]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 13322 + "'", short12 == (short) 13322);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 3212836864L + "'", long17 == 3212836864L);
    }

    @Test
    public void test5671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5671");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, (int) (byte) 0, (int) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) 1);
        // The following exception was thrown during execution in test generation
        try {
            float float20 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, 13141070);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, -128, 63]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test5672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5672");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 4.6006E-41f);
        float float16 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        float float18 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, (int) (short) 0);
        int int20 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, 0, (double) (short) 13322);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.1777545E-38f + "'", float16 == 1.1777545E-38f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 1.1777545E-38f + "'", float18 == 1.1777545E-38f);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32831 + "'", int20 == 32831);
    }

    @Test
    public void test5673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5673");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray2, 13172735);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
    }

    @Test
    public void test5674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5674");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 1113849856L);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray5, 0, (long) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[32, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
    }

    @Test
    public void test5675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5675");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 1113849856L);
        long long15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 1);
        int int17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) (short) 1);
        int int19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1627389952, (float) 144115183780888576L);
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
    public void test5676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5676");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) 25600);
        long long14 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, 35, (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 100, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1113849856L + "'", long14 == 1113849856L);
    }

    @Test
    public void test5677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5677");
        float float1 = org.apache.commons.io.EndianUtils.swapFloat((float) 223338299392L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.8813E-41f + "'", float1 == 2.8813E-41f);
    }

    @Test
    public void test5678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5678");
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
            int int27 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 1627389952);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, -128, 63, 1, 0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 81792 + "'", int25 == 81792);
    }

    @Test
    public void test5679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5679");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 1113849856L);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 1590165504);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1590165504 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, -56, -124, 78]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
    }

    @Test
    public void test5680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5680");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        long long14 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 1);
        long long16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, 16777216, (double) 52L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 16777216 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 13322 + "'", short12 == (short) 13322);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 52L + "'", long14 == 52L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 52L + "'", long16 == 52L);
    }

    @Test
    public void test5681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5681");
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
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, 200, 2.74784E-319d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 200 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
        org.junit.Assert.assertTrue("'" + short30 + "' != '" + (short) 0 + "'", short30 == (short) 0);
    }

    @Test
    public void test5682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5682");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, (double) 6.0018E-41f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5683");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        float float8 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, (int) (short) 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) '4');
        float float13 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, 0);
        short short15 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 1627389952);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1627389952 out of bounds for length 4");
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
    public void test5684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5684");
        int int1 = org.apache.commons.io.EndianUtils.swapInteger(1112539136);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 20546 + "'", int1 == 20546);
    }

    @Test
    public void test5685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5685");
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
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (byte) 0, (short) 16256);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 16777216, (short) -32577);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 16777216 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-128, 63, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 13322 + "'", short12 == (short) 13322);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1590165504L + "'", long17 == 1590165504L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1590165504L + "'", long19 == 1590165504L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test5686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5686");
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
            long long26 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray5, (-14336));
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
    public void test5687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5687");
        long long1 = org.apache.commons.io.EndianUtils.swapLong(16737280L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 28427873136148480L + "'", long1 == 28427873136148480L);
    }

    @Test
    public void test5688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5688");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        // The following exception was thrown during execution in test generation
        try {
            short short14 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, 171180232);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 171180232 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[10, 52, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test5689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5689");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray0, 32831);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5690");
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
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 1627389952, (short) 25600);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1627389952 out of bounds for length 5");
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
    public void test5691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5691");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 1113849856L);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray5, 65535);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, -56, -124, 78]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
    }

    @Test
    public void test5692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5692");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        long long12 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 0);
        short short14 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        long long16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) 97);
        // The following exception was thrown during execution in test generation
        try {
            long long21 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) -16512);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, -62, 66, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 13322L + "'", long12 == 13322L);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 13322 + "'", short14 == (short) 13322);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 13322L + "'", long16 == 13322L);
    }

    @Test
    public void test5693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5693");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, 1677721600);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, 4.6185E-41f);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 0, (short) (byte) 100);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, (float) (-10223615));
        // The following exception was thrown during execution in test generation
        try {
            int int26 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray4, 20938752);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, -1, 27, -53]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test5694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5694");
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
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 536870912, 57.0f);
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
    public void test5695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5695");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 0, 587202560);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray5, 20938752, 416611827712L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 20938752 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, 35, 0]");
    }

    @Test
    public void test5696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5696");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, (int) (byte) 0, (int) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray4, 51294);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, -128, 63]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test5697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5697");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        short short19 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray5, 25600, 35L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 25600 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
    }

    @Test
    public void test5698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5698");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble(2.0834234E-317d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.0d + "'", double1 == 97.0d);
    }

    @Test
    public void test5699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5699");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, 1677721600);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (-65536));
        // The following exception was thrown during execution in test generation
        try {
            long long20 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray4, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, -1, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test5700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5700");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, 1677721600);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, 4.6185E-41f);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, (float) 873070592);
        int int23 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 1590165504, (float) 2560L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 40, 80, 78]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10240 + "'", int23 == 10240);
    }

    @Test
    public void test5701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5701");
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
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (byte) 0, (short) 16256);
        // The following exception was thrown during execution in test generation
        try {
            double double35 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray5, 16906);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-128, 63, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 13322 + "'", short12 == (short) 13322);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1590165504L + "'", long17 == 1590165504L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1590165504L + "'", long19 == 1590165504L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test5702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5702");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 4.6006E-41f);
        float float16 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (byte) 1, (int) (short) 20480);
        java.lang.Class<?> wildcardClass20 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 80, 0, 0]");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.1777545E-38f + "'", float16 == 1.1777545E-38f);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test5703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5703");
        long long1 = org.apache.commons.io.EndianUtils.swapLong((long) (-939510774));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 735213502456659967L + "'", long1 == 735213502456659967L);
    }

    @Test
    public void test5704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5704");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        short short19 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 1);
        int int21 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) (byte) 0);
        float float23 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short25 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 35, 16129);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + (-131072.0f) + "'", float23 == (-131072.0f));
        org.junit.Assert.assertTrue("'" + short25 + "' != '" + (short) 0 + "'", short25 == (short) 0);
    }

    @Test
    public void test5705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5705");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 16803071, 9.22922E-39f);
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
        org.junit.Assert.assertTrue("'" + short26 + "' != '" + (short) 1 + "'", short26 == (short) 1);
    }

    @Test
    public void test5706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5706");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 10);
        int int16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) (short) 0);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 0, 65536);
        // The following exception was thrown during execution in test generation
        try {
            short short24 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 51200);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 51200 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test5707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5707");
        float float1 = org.apache.commons.io.EndianUtils.swapFloat(1.2550144E7f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.1777649E-38f + "'", float1 == 1.1777649E-38f);
    }

    @Test
    public void test5708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5708");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        int int8 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 0);
        short short10 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, (int) (short) 1);
        long long12 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, (int) (byte) 0);
        int int14 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 20938752);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 20938752 out of bounds for length 4");
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
    public void test5709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5709");
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
            double double26 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray5, 2612);
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
    public void test5710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5710");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray0, (int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5711");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) (-1L));
        int int20 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (-10223615), (short) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -10223615 out of bounds for length 5");
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
    public void test5712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5712");
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
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, 0, 2.719242597934E-312d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-73, -7, 64, 37, -128]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 13322 + "'", short12 == (short) 13322);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1590165504L + "'", long17 == 1590165504L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1590165504L + "'", long19 == 1590165504L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1590165504L + "'", long23 == 1590165504L);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 7.2057594E18f + "'", float25 == 7.2057594E18f);
    }

    @Test
    public void test5713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5713");
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
            double double26 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray5, (-1082130432));
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
    public void test5714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5714");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 1, (short) 13322);
        int int19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 0, (int) (short) 10);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 1, 4.7445E-41f);
        int int27 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray5, (-16512), 69273527517184L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -16512 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 66, -124, 0, 0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 13322 + "'", int19 == 13322);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 16906 + "'", int27 == 16906);
    }

    @Test
    public void test5715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5715");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        long long15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, (float) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double20 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray5, (int) '4');
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
    public void test5716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5716");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray0, 25666, 51200);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5717");
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
            float float28 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, (-16777215));
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
    public void test5718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5718");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        float float8 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, (int) (short) 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) '4');
        float float13 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, 0);
        short short15 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, 1);
        // The following exception was thrown during execution in test generation
        try {
            long long17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 16777216);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test5719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5719");
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
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) -32577, (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -32577 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[66, -56, 0, 0, 78]");
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) -14336 + "'", short16 == (short) -14336);
    }

    @Test
    public void test5720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5720");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        int int8 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 0);
        short short10 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, (int) (short) 1);
        long long12 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            float float14 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, (int) (short) 16256);
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
    public void test5721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5721");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 1113849856L);
        int int15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 32, 100);
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
    public void test5722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5722");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 1113849856L);
        int int15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        int int17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double19 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray5, 8437504);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, -56, -124, 78]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test5723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5723");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (byte) 1, 1);
        short short13 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, 0, 4.77444888682E-312d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-63, 99, 127, -1, -32]");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 1 + "'", short13 == (short) 1);
    }

    @Test
    public void test5724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5724");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(outputStream0, 20546);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5725");
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
            long long23 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 167772160);
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
    public void test5726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5726");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            float float18 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, (int) (short) -14336);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
    }

    @Test
    public void test5727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5727");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 1113849856L);
        int int15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 200, (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 200 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, -56, -124, 78]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test5728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5728");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 1, (short) 13322);
        int int19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 0, (int) (short) 10);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 1, 4.7445E-41f);
        int int27 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 51200);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 66, -124, 0, 0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 13322 + "'", int19 == 13322);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 16906 + "'", int27 == 16906);
    }

    @Test
    public void test5729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5729");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        int int8 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 0);
        short short10 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, (int) (short) 1);
        long long12 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, (int) (byte) 0);
        int int14 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 1);
        // The following exception was thrown during execution in test generation
        try {
            float float16 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, (int) (short) -14336);
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
    public void test5730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5730");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) (byte) 10);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, 4.6219E-41f);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 8667658);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 8667658 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-41, -128, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
    }

    @Test
    public void test5731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5731");
        long long1 = org.apache.commons.io.EndianUtils.swapLong((long) 8667658);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 739298424377049088L + "'", long1 == 739298424377049088L);
    }

    @Test
    public void test5732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5732");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, 1677721600);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, 4.6185E-41f);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, (int) (short) 0, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int23 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray4, 65535);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[97, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test5733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5733");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 1113849856L);
        short short15 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            short short17 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 1107296256);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1107296256 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, -56, -124, 78]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 10 + "'", short15 == (short) 10);
    }

    @Test
    public void test5734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5734");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        long long15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, (float) 1);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (short) 1, (-65536));
        float float23 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, (int) (byte) 0);
        java.lang.Class<?> wildcardClass24 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 0, -1, -1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 4284743681L + "'", long15 == 4284743681L);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + (-1.701412E38f) + "'", float23 == (-1.701412E38f));
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test5735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5735");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        float float8 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, (int) (short) 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, 0, (short) 2560);
        // The following exception was thrown during execution in test generation
        try {
            float float13 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, (int) (short) -16512);
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
    public void test5736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5736");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray0, 3407872);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5737");
        long long1 = org.apache.commons.io.EndianUtils.swapLong((long) (short) -16512);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-9169328841326329857L) + "'", long1 == (-9169328841326329857L));
    }

    @Test
    public void test5738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5738");
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
            double double24 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray4, 1107296256);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test5739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5739");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble(4.9803403E-317d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.113849856E9d + "'", double1 == 1.113849856E9d);
    }

    @Test
    public void test5740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5740");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        long long15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, (float) 1);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (short) 1, (-65536));
        short short23 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (short) 0);
        int int25 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 16777471);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 0, -1, -1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 4284743681L + "'", long15 == 4284743681L);
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) 1 + "'", short23 == (short) 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-16777215) + "'", int25 == (-16777215));
    }

    @Test
    public void test5741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5741");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 51294, (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 51294 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
    }

    @Test
    public void test5742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5742");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long14 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) -1);
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
    public void test5743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5743");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        int int19 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        float float21 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, (int) (byte) 0);
        long long23 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            double double25 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray5, 8667658);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-939524096) + "'", int19 == (-939524096));
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + (-131072.0f) + "'", float21 == (-131072.0f));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 3355443200L + "'", long23 == 3355443200L);
    }

    @Test
    public void test5744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5744");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(outputStream0, 14636698788954112L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5745");
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
            long long25 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray4, 171180232);
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
    public void test5746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5746");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        long long14 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray5, 16777216);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 13322 + "'", short12 == (short) 13322);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 13322L + "'", long14 == 13322L);
    }

    @Test
    public void test5747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5747");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray0, (int) (short) 2560, 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5748");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 0, (int) (short) 13322);
        long long15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 1);
        // The following exception was thrown during execution in test generation
        try {
            long long17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 51294);
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
    public void test5749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5749");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 10);
        int int16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        short short18 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 32, (short) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 25600 + "'", short18 == (short) 25600);
    }

    @Test
    public void test5750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5750");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        long long13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 8667658);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 8667658 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
    }

    @Test
    public void test5751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5751");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 1, (short) 13322);
        int int19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 0, (int) (short) 10);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 1, 4.7445E-41f);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 200, (float) 1112539136);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 66, -124, 0, 0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 13322 + "'", int19 == 13322);
    }

    @Test
    public void test5752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5752");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(outputStream0, (float) 51266);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5753");
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
            float float26 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, (int) 'a');
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
    public void test5754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5754");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        long long19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 1);
        int int21 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) (short) 0);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (byte) 0, 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (-14336), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, 0, 0, 66]");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1120403456L + "'", long19 == 1120403456L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test5755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5755");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) 2612);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray5, (-10223615), (long) 20905984);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -10223615 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
    }

    @Test
    public void test5756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5756");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, 0, (double) 2.20306052E14f);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, 0, -64]");
    }

    @Test
    public void test5757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5757");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        int int11 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 0);
        long long13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray4, 16906);
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
    public void test5758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5758");
        short short1 = org.apache.commons.io.EndianUtils.swapShort((short) 8261);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 17696 + "'", short1 == (short) 17696);
    }

    @Test
    public void test5759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5759");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        long long14 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 194, (float) (short) 0);
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
    public void test5760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5760");
        float float1 = org.apache.commons.io.EndianUtils.swapFloat((float) (-9205639113322004480L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.2030402E-38f + "'", float1 == 1.2030402E-38f);
    }

    @Test
    public void test5761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5761");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, (float) 100L);
        int int14 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray4, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 1590165504);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1590165504 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1120403456 + "'", int14 == 1120403456);
    }

    @Test
    public void test5762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5762");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, (double) 13322L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5763");
        float float1 = org.apache.commons.io.EndianUtils.swapFloat(2.8813E-41f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.23338299E11f + "'", float1 == 2.23338299E11f);
    }

    @Test
    public void test5764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5764");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) 25600);
        float float14 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, (float) 32L);
        // The following exception was thrown during execution in test generation
        try {
            long long19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 8667658);
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
    public void test5765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5765");
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
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 167798015, 1.6777216E9f);
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
    public void test5766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5766");
        int int1 = org.apache.commons.io.EndianUtils.swapInteger(171180232);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-939510774) + "'", int1 == (-939510774));
    }

    @Test
    public void test5767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5767");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 10, (byte) -1, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray4, (-10223615), (long) 1590165504);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -10223615 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[100, 10, -1, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4294904420L + "'", long6 == 4294904420L);
    }

    @Test
    public void test5768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5768");
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
            long long27 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 65535);
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
    public void test5769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5769");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, 0);
        short short14 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            short short16 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, 16906);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 16906 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 0 + "'", short14 == (short) 0);
    }

    @Test
    public void test5770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5770");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 1, (short) 13322);
        // The following exception was thrown during execution in test generation
        try {
            short short19 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 10, 52, 66, 0]");
    }

    @Test
    public void test5771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5771");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        int int11 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 0, (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, (int) (short) 0, 32);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, (int) (short) -32577);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -32577 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[32, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 65535 + "'", int11 == 65535);
    }

    @Test
    public void test5772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5772");
        int int1 = org.apache.commons.io.EndianUtils.swapInteger(20546);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1112539136 + "'", int1 == 1112539136);
    }

    @Test
    public void test5773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5773");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray0, 1342177280, (double) (short) 17696);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot store to byte/boolean array because \"data\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5774");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray0, 65536);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5775");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        int int11 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 0, (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray4, (int) (short) 52);
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
    public void test5776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5776");
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
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 20480, (float) 3746994889972252672L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, -1, 0, 0, 66]");
    }

    @Test
    public void test5777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5777");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, (float) 100L);
        int int14 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray4, 10240);
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
    public void test5778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5778");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, 1677721600);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, 4.6185E-41f);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, (int) (short) 0, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int23 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 872415232);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 872415232 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[97, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test5779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5779");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        short short19 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            long long24 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray5, 200);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
    }

    @Test
    public void test5780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5780");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        short short19 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray5, (int) (byte) 0, 10995116277760L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
    }

    @Test
    public void test5781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5781");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, 0);
        short short14 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, 0);
        long long16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            float float18 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, 51200);
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
    public void test5782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5782");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, 1677721600);
        long long17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray4, (-16777215));
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
    public void test5783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5783");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        int int15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 1);
        float float17 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        int int19 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            short short21 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 1677721600);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1677721600 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25600 + "'", int15 == 25600);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + (-3.03064E38f) + "'", float17 == (-3.03064E38f));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 16737280 + "'", int19 == 16737280);
    }

    @Test
    public void test5784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5784");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        long long12 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 0);
        short short14 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 2560);
        int int19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, (int) (short) 8261, 2.03793453199E-312d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 8261 out of bounds for length 5");
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
    public void test5785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5785");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 1, (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (byte) 1, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 100, 0, 0, 0]");
    }

    @Test
    public void test5786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5786");
        float float1 = org.apache.commons.io.EndianUtils.swapFloat((float) 141008071294976L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 5.785758E-39f + "'", float1 == 5.785758E-39f);
    }

    @Test
    public void test5787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5787");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 10);
        int int16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        short short18 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            short short20 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 1199622144);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1199622144 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 25600 + "'", short18 == (short) 25600);
    }

    @Test
    public void test5788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5788");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        int int15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 1);
        short short17 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            float float19 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 80);
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
    public void test5789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5789");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        int int10 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray5, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test5790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5790");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, 1.78608385704366E-310d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5791");
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
            long long24 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray5, 20546);
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
    public void test5792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5792");
        long long1 = org.apache.commons.io.EndianUtils.swapLong((long) (-16777215));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 72058693549555711L + "'", long1 == 72058693549555711L);
    }

    @Test
    public void test5793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5793");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(outputStream0, (float) (short) 20480);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5794");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, (float) 100L);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray4, 872415232);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test5795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5795");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, (double) 172097536);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5796");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 10);
        int int16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        short short18 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            long long23 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray5, (int) (short) -32577);
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
    public void test5797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5797");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        long long17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        long long19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        float float21 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            double double23 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray5, 20546);
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
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 7.2057594E18f + "'", float21 == 7.2057594E18f);
    }

    @Test
    public void test5798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5798");
        short short1 = org.apache.commons.io.EndianUtils.swapShort((short) 17696);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 8261 + "'", short1 == (short) 8261);
    }

    @Test
    public void test5799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5799");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, (float) 100L);
        long long14 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, 0, (short) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long19 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray4, 16737280);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1120403456L + "'", long14 == 1120403456L);
    }

    @Test
    public void test5800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5800");
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
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (byte) 0, (short) 16256);
        float float35 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-128, 63, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 13322 + "'", short12 == (short) 13322);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1590165504L + "'", long17 == 1590165504L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1590165504L + "'", long19 == 1590165504L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 8.8E-44f + "'", float35 == 8.8E-44f);
    }

    @Test
    public void test5801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5801");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        short short19 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray5, 51266, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 51266 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
    }

    @Test
    public void test5802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5802");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, 7.96090453E-315d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5803");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 10);
        int int16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        short short18 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long23 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 536870912);
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
    public void test5804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5804");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        long long17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        long long19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        float float21 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            short short23 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 873070592);
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
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 7.2057594E18f + "'", float21 == 7.2057594E18f);
    }

    @Test
    public void test5805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5805");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        int int15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 1);
        short short17 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) (short) 25600);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 25600 out of bounds for length 5");
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
    public void test5806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5806");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) 25600);
        long long14 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        long long16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, 0, (short) -32705);
        // The following exception was thrown during execution in test generation
        try {
            float float21 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, 4685824);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[63, -128, 100, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1113849856L + "'", long14 == 1113849856L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1113849856L + "'", long16 == 1113849856L);
    }

    @Test
    public void test5807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5807");
        float float1 = org.apache.commons.io.EndianUtils.swapFloat(5.7529E-41f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 5.7646075E18f + "'", float1 == 5.7646075E18f);
    }

    @Test
    public void test5808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5808");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(outputStream0, (long) 4685824);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5809");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, (double) (short) 80);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5810");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 0, (float) (short) 100);
        short short16 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 65536L);
        int int21 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 1);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) -14336);
        int int26 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long28 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 200);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, -56, -128, 71, 0]");
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) -14336 + "'", short16 == (short) -14336);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4685824 + "'", int21 == 4685824);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1199622144 + "'", int26 == 1199622144);
    }

    @Test
    public void test5811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5811");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(outputStream0, 2.5928E-41f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5812");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 4.6006E-41f);
        float float16 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        int int18 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 0);
        int int20 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray5, 1199622144, 720686991053684735L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1199622144 out of bounds for length 5");
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
    public void test5813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5813");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) 25600);
        float float14 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 100, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 57.0f + "'", float14 == 57.0f);
    }

    @Test
    public void test5814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5814");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 4.6006E-41f);
        float float16 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (byte) 1, (int) (short) 20480);
        // The following exception was thrown during execution in test generation
        try {
            long long21 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 80, 0, 0]");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.1777545E-38f + "'", float16 == 1.1777545E-38f);
    }

    @Test
    public void test5815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5815");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (short) 8261, (int) (short) -32705);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, 0, 0]");
    }

    @Test
    public void test5816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5816");
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
            short short26 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 872415232);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 872415232 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 25600 + "'", short18 == (short) 25600);
    }

    @Test
    public void test5817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5817");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        float float8 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, (int) (short) 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) '4');
        int int13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 0);
        short short15 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, 1);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 8261);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray4, 13322);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[69, 32, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-3.03064E38f) + "'", float8 == (-3.03064E38f));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 20480 + "'", short15 == (short) 20480);
    }

    @Test
    public void test5818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5818");
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
            short short34 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 1342177280);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1342177280 out of bounds for length 5");
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
    public void test5819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5819");
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
        // The following exception was thrown during execution in test generation
        try {
            double double28 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray5, 167772160);
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
        org.junit.Assert.assertTrue("'" + short26 + "' != '" + (short) 1 + "'", short26 == (short) 1);
    }

    @Test
    public void test5820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5820");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 1, (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (byte) 1, 100);
        // The following exception was thrown during execution in test generation
        try {
            float float22 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 100, 0, 0, 0]");
    }

    @Test
    public void test5821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5821");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray0, (int) (short) 13322, (short) 20480);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot store to byte/boolean array because \"data\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5822");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, 0);
        short short14 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, 0, (short) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray4, (int) (short) 13322, (long) 10240);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13322 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[100, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 0 + "'", short14 == (short) 0);
    }

    @Test
    public void test5823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5823");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        short short19 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 100);
        short short24 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        int int26 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        int int28 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (short) 2612, 1112539136);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
        org.junit.Assert.assertTrue("'" + short24 + "' != '" + (short) 100 + "'", short24 == (short) 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test5824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5824");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, (int) (byte) 0, (double) (short) 13322);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
    }

    @Test
    public void test5825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5825");
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
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray5, 1113849856, 72058143793741824L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1113849856 out of bounds for length 5");
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
    public void test5826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5826");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(outputStream0, 137438953472L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5827");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(outputStream0, 45.009766f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5828");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        long long15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, (float) 1);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (short) 1, (-65536));
        float float23 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1317324800, (float) 3355443200L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 0, -1, -1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 4284743681L + "'", long15 == 4284743681L);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + (-1.701412E38f) + "'", float23 == (-1.701412E38f));
    }

    @Test
    public void test5829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5829");
        long long1 = org.apache.commons.io.EndianUtils.swapLong(72168644712333311L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-10223615L) + "'", long1 == (-10223615L));
    }

    @Test
    public void test5830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5830");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 13322);
        float float22 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long24 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray5, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 100.0004f + "'", float22 == 100.0004f);
    }

    @Test
    public void test5831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5831");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        float float8 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, (int) (short) 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) '4');
        int int13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 0);
        short short15 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, 1);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 8261);
        // The following exception was thrown during execution in test generation
        try {
            short short20 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, 536870912);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 536870912 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[69, 32, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-3.03064E38f) + "'", float8 == (-3.03064E38f));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 20480 + "'", short15 == (short) 20480);
    }

    @Test
    public void test5832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5832");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 0, (int) (short) 13322);
        long long15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 20546, (short) 2560);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 20546 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 52L + "'", long15 == 52L);
    }

    @Test
    public void test5833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5833");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        short short19 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 1);
        int int21 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) (byte) 0);
        float float23 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        java.lang.Class<?> wildcardClass24 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + (-131072.0f) + "'", float23 == (-131072.0f));
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test5834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5834");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        long long13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 1);
        float float15 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 171180232, (short) 13322);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 171180232 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 16737280L + "'", long13 == 16737280L);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-3.03064E38f) + "'", float15 == (-3.03064E38f));
    }

    @Test
    public void test5835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5835");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(outputStream0, 4.29490432E9f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5836");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            double double20 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray5, 873070592);
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
    public void test5837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5837");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        short short19 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 1);
        int int21 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) (byte) 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 1.0f);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) (byte) -1);
        long long29 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) (short) 25600);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 25600 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, -1, 0, -128, 63]");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 2147549183L + "'", long29 == 2147549183L);
    }

    @Test
    public void test5838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5838");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(outputStream0, (float) (-32705L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5839");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) 25600);
        float float14 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, 0);
        long long16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, 13322);
        // The following exception was thrown during execution in test generation
        try {
            long long21 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray4, 0);
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
    public void test5840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5840");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 4.6006E-41f);
        float float16 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        float float18 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, (int) (short) 0);
        int int20 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 1);
        java.lang.Class<?> wildcardClass21 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 63, -128, 0, 0]");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.1777545E-38f + "'", float16 == 1.1777545E-38f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 1.1777545E-38f + "'", float18 == 1.1777545E-38f);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32831 + "'", int20 == 32831);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5841");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) 25600);
        int int14 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray4, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray4, (int) (byte) 10);
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
    public void test5842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5842");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        long long15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, (float) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long20 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 16777471);
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
    public void test5843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5843");
        float float1 = org.apache.commons.io.EndianUtils.swapFloat(5.890146E-39f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.12184546E13f + "'", float1 == 1.12184546E13f);
    }

    @Test
    public void test5844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5844");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(outputStream0, (float) 1112539136);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5845");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) 25600);
        // The following exception was thrown during execution in test generation
        try {
            long long14 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 167798015);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 100, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test5846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5846");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(outputStream0, (short) -32768);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5847");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            short short2 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray0, 16777471);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from byte/boolean array because \"data\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5848");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, 1677721600);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, 4.6185E-41f);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, (int) (short) 0, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 1199622144, 587202560);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[97, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test5849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5849");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble((double) 223338299392L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.392E-320d + "'", double1 == 9.392E-320d);
    }

    @Test
    public void test5850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5850");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, (float) 100L);
        long long14 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        float float16 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long18 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, (-10223615));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1120403456L + "'", long14 == 1120403456L);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 100.0f + "'", float16 == 100.0f);
    }

    @Test
    public void test5851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5851");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        int int11 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            float float13 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, 167798015);
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
    public void test5852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5852");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        long long13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 1);
        int int15 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 0);
        long long17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 1);
        float float19 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 2612, (short) 25600);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2612 out of bounds for length 5");
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
    public void test5853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5853");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 1, (short) 13322);
        int int19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long21 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray5, 51200);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 10, 52, 66, 0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 13322 + "'", int19 == 13322);
    }

    @Test
    public void test5854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5854");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 0, (float) (short) 100);
        short short16 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 13312, 2.4603495E-32f);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, -56, 66, 0]");
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) -14336 + "'", short16 == (short) -14336);
    }

    @Test
    public void test5855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5855");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        int int19 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        float float21 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, (int) (byte) 0);
        long long23 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 1);
        // The following exception was thrown during execution in test generation
        try {
            long long25 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 13172735);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-939524096) + "'", int19 == (-939524096));
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + (-131072.0f) + "'", float21 == (-131072.0f));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1120403456L + "'", long23 == 1120403456L);
    }

    @Test
    public void test5856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5856");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 1113849856L);
        short short15 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        short short17 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, (-939524096), 5.790703E-317d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -939524096 out of bounds for length 5");
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
    public void test5857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5857");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray0, 1113849856);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5858");
        float float1 = org.apache.commons.io.EndianUtils.swapFloat((float) 416611827712L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 6.9709E-41f + "'", float1 == 6.9709E-41f);
    }

    @Test
    public void test5859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5859");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        int int15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 1);
        float float17 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        int int19 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray5, 256, 28427873136148480L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 256 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25600 + "'", int15 == 25600);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + (-3.03064E38f) + "'", float17 == (-3.03064E38f));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 16737280 + "'", int19 == 16737280);
    }

    @Test
    public void test5860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5860");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (byte) 1, (short) (byte) -1);
        long long15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, (int) (short) 200, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 200 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, -1, -1, 0, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 16776970L + "'", long15 == 16776970L);
    }

    @Test
    public void test5861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5861");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 172131328, (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 172131328 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 13322 + "'", short12 == (short) 13322);
    }

    @Test
    public void test5862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5862");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, 4.618539608568165E-41d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5863");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(outputStream0, 1.8414561E-38f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5864");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble(65535.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8650332446E-314d + "'", double1 == 1.8650332446E-314d);
    }

    @Test
    public void test5865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5865");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        int int8 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 0);
        short short10 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long12 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray4, 20938752);
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
    public void test5866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5866");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, 6.9726E-41f);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, (int) (byte) -1, (double) 3.70225E-39f);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[94, -62, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 13322 + "'", short12 == (short) 13322);
    }

    @Test
    public void test5867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5867");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 1, (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (byte) 1, 100);
        short short22 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, (int) (byte) 0, (double) 351298260041727L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-16, -1, -1, -1, 15]");
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) 25600 + "'", short22 == (short) 25600);
    }

    @Test
    public void test5868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5868");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        short short19 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 1);
        int int21 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) (byte) 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 1.0f);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) (byte) -1);
        long long29 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 16906);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 16906 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, -1, 0, -128, 63]");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 2147549183L + "'", long29 == 2147549183L);
    }

    @Test
    public void test5869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5869");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble((double) 1.673728E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0686534313E-314d + "'", double1 == 1.0686534313E-314d);
    }

    @Test
    public void test5870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5870");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        long long13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 1);
        int int15 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 0);
        long long17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 10, (float) 16777216L);
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
    public void test5871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5871");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 4.6006E-41f);
        float float16 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        float float18 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, (int) (short) 0);
        float float20 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 194);
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
    public void test5872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5872");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        int int15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 1);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (byte) 1, (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 16777216);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (short) -32768, 1627389952);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, -128, 75, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25600 + "'", int15 == 25600);
    }

    @Test
    public void test5873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5873");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, (float) 100L);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, 0, (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            float float17 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, (int) (short) 20480);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, -1, -56, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test5874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5874");
        long long1 = org.apache.commons.io.EndianUtils.swapLong((long) (short) 17696);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2325264782606729216L + "'", long1 == 2325264782606729216L);
    }

    @Test
    public void test5875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5875");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) 25600);
        float float14 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, 0);
        long long16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, 13322);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) 'a', (short) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 4");
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
    public void test5876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5876");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        int int11 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 0, (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            short short16 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, 20546);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 20546 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, -1, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 65535 + "'", int11 == 65535);
    }

    @Test
    public void test5877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5877");
        short short1 = org.apache.commons.io.EndianUtils.swapShort((short) -32768);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 128 + "'", short1 == (short) 128);
    }

    @Test
    public void test5878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5878");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray0, 2612, (short) 13322);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot store to byte/boolean array because \"data\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5879");
        long long1 = org.apache.commons.io.EndianUtils.swapLong(3355443200L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 858993459200L + "'", long1 == 858993459200L);
    }

    @Test
    public void test5880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5880");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 1113849856L);
        int int15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1677721600, (-1));
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
    public void test5881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5881");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 4.6006E-41f);
        float float16 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (byte) 1, (int) (short) 20480);
        // The following exception was thrown during execution in test generation
        try {
            long long21 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray5, 587202560);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 80, 0, 0]");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.1777545E-38f + "'", float16 == 1.1777545E-38f);
    }

    @Test
    public void test5882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5882");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(outputStream0, (float) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5883");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        long long13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (-10223615));
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 720686991053684735L);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, (int) (short) 0, 7.785559E-317d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[67, 115, -16, 0, 0]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 16737280L + "'", long13 == 16737280L);
    }

    @Test
    public void test5884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5884");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble((double) 2.8813E-41f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0616622E-314d + "'", double1 == 1.0616622E-314d);
    }

    @Test
    public void test5885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5885");
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
        // The following exception was thrown during execution in test generation
        try {
            double double28 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray5, (int) ' ');
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
        org.junit.Assert.assertTrue("'" + short26 + "' != '" + (short) 1 + "'", short26 == (short) 1);
    }

    @Test
    public void test5886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5886");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(outputStream0, (float) (short) -32768);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5887");
        float float1 = org.apache.commons.io.EndianUtils.swapFloat((float) 141557827108864L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.7540702E-38f + "'", float1 == 1.7540702E-38f);
    }

    @Test
    public void test5888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5888");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(outputStream0, (float) 13172735L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5889");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 13322);
        float float22 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (-1082130432));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 100.0004f + "'", float22 == 100.0004f);
    }

    @Test
    public void test5890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5890");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        int int15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 1);
        short short17 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            float float19 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 167772160);
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
    public void test5891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5891");
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
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray5, (int) (short) 100, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
        org.junit.Assert.assertTrue("'" + short24 + "' != '" + (short) 100 + "'", short24 == (short) 100);
    }

    @Test
    public void test5892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5892");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble((double) 1.203001E-38f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.092167038785E-312d + "'", double1 == 4.092167038785E-312d);
    }

    @Test
    public void test5893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5893");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        long long13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (-10223615));
        // The following exception was thrown during execution in test generation
        try {
            long long18 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (-10223615));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 1, 0, 100, -1]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 16737280L + "'", long13 == 16737280L);
    }

    @Test
    public void test5894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5894");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        int int11 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, 0, (short) 256);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 587202560, (-65536));
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
    public void test5895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5895");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 10);
        int int16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        short short18 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            short short20 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 167772160);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 167772160 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 25600 + "'", short18 == (short) 25600);
    }

    @Test
    public void test5896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5896");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        long long12 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 0);
        short short14 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, 167798015, 7.785558E-317d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 167798015 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 13322L + "'", long12 == 13322L);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 13322 + "'", short14 == (short) 13322);
    }

    @Test
    public void test5897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5897");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 13322);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (-1082130432), 1.6777216E8f);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, -56, 66]");
    }

    @Test
    public void test5898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5898");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 1113849856L);
        long long15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 1);
        int int17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long19 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray5, 13172735);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, -56, -124, 78]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1317324800L + "'", long15 == 1317324800L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 51200 + "'", int17 == 51200);
    }

    @Test
    public void test5899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5899");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 1113849856L);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (byte) -1, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, -56, -124, 78]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
    }

    @Test
    public void test5900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5900");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        long long15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, (float) 1);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (short) 1, (-65536));
        short short23 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (short) 0);
        int int25 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 25600);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 0, -1, -1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 4284743681L + "'", long15 == 4284743681L);
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) 1 + "'", short23 == (short) 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-16777215) + "'", int25 == (-16777215));
    }

    @Test
    public void test5901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5901");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 1, (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (byte) 1, 100);
        short short22 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long24 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 51266);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 100, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) 25600 + "'", short22 == (short) 25600);
    }

    @Test
    public void test5902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5902");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, 1.6803071E7d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5903");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        float float8 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (-16512), (short) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -16512 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 100, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-3.03064E38f) + "'", float8 == (-3.03064E38f));
    }

    @Test
    public void test5904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5904");
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
            double double30 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray5, 1199622144);
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
    public void test5905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5905");
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
            int int30 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 51294);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 51294 out of bounds for length 5");
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
    public void test5906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5906");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        long long15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, (float) 1);
        long long20 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        short short22 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        float float24 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, (int) (short) 1);
        java.lang.Class<?> wildcardClass25 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 0, -128, 63]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 4284743681L + "'", long15 == 4284743681L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 2147483649L + "'", long20 == 2147483649L);
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) 1 + "'", short22 == (short) 1);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 1.0f + "'", float24 == 1.0f);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5907");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble((double) 110234630619136L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.06154344E-314d + "'", double1 == 1.06154344E-314d);
    }

    @Test
    public void test5908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5908");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        int int11 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 0);
        long long13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray4, 8437504, (double) 4.6197E-41f);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 8437504 out of bounds for length 4");
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
    public void test5909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5909");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(outputStream0, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5910");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 1, (short) 13322);
        int int19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double21 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray5, 20938752);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 10, 52, 66, 0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 13322 + "'", int19 == 13322);
    }

    @Test
    public void test5911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5911");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, 2.74784E-319d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5912");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        float float8 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) -1, (short) 16256);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 100, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-3.03064E38f) + "'", float8 == (-3.03064E38f));
    }

    @Test
    public void test5913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5913");
        long long1 = org.apache.commons.io.EndianUtils.swapLong((long) (-939524096));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 863288426495L + "'", long1 == 863288426495L);
    }

    @Test
    public void test5914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5914");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 0, (float) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray5, 1107296256);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, -56, 66, 0]");
    }

    @Test
    public void test5915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5915");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble((double) 5.890135E-39f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.375569784005E-312d + "'", double1 == 1.375569784005E-312d);
    }

    @Test
    public void test5916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5916");
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
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 587202560, (float) 429496729600L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test5917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5917");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 4.6006E-41f);
        float float16 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (byte) 1, (int) (short) 20480);
        // The following exception was thrown during execution in test generation
        try {
            long long21 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 80, 0, 0]");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.1777545E-38f + "'", float16 == 1.1777545E-38f);
    }

    @Test
    public void test5918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5918");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 0, 587202560);
        int int16 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 13107200);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, 35, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 587202560 + "'", int16 == 587202560);
    }

    @Test
    public void test5919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5919");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        long long16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (-1082130432));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1082130432 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 12, 66, 0]");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 4328448L + "'", long16 == 4328448L);
    }

    @Test
    public void test5920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5920");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        long long15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, (float) 1);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (short) 1, (-65536));
        short short23 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (short) 0);
        int int25 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long27 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray5, 2612);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 0, -1, -1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 4284743681L + "'", long15 == 4284743681L);
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) 1 + "'", short23 == (short) 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-16777215) + "'", int25 == (-16777215));
    }

    @Test
    public void test5921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5921");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, 1677721600);
        int int17 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray4, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 8437504);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 0, 100]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1677721600 + "'", int17 == 1677721600);
    }

    @Test
    public void test5922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5922");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble(1.87477E-318d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.7217554317312E13d + "'", double1 == 5.7217554317312E13d);
    }

    @Test
    public void test5923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5923");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, 1677721600);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, 4.6185E-41f);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 0, (short) (byte) 100);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, (float) (-10223615));
        // The following exception was thrown during execution in test generation
        try {
            long long26 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, -1, 27, -53]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test5924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5924");
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
            double double32 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray5, 81792);
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
    public void test5925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5925");
        float float1 = org.apache.commons.io.EndianUtils.swapFloat((float) (-2143354624));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-8.639931E37f) + "'", float1 == (-8.639931E37f));
    }

    @Test
    public void test5926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5926");
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
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, (-10223606), (double) 281474976710655L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -10223606 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, 0, 66]");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1120403456L + "'", long19 == 1120403456L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test5927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5927");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5928");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        long long12 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 0);
        short short14 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        long long16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) 97);
        // The following exception was thrown during execution in test generation
        try {
            double double21 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray5, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, -62, 66, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 13322L + "'", long12 == 13322L);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 13322 + "'", short14 == (short) 13322);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 13322L + "'", long16 == 13322L);
    }

    @Test
    public void test5929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5929");
        float float1 = org.apache.commons.io.EndianUtils.swapFloat((float) 2522015791327477760L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.437E-42f + "'", float1 == 4.437E-42f);
    }

    @Test
    public void test5930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5930");
        long long1 = org.apache.commons.io.EndianUtils.swapLong((long) (short) 20480);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 22517998136852480L + "'", long1 == 22517998136852480L);
    }

    @Test
    public void test5931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5931");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(outputStream0, 171180232);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5932");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 0, 587202560);
        int int16 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 66);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 66 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, 35, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 587202560 + "'", int16 == 587202560);
    }

    @Test
    public void test5933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5933");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        int int15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 1);
        short short17 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (short) 25600, (int) (short) 16256);
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
    public void test5934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5934");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, (float) 100L);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, 0, (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 1199622144, 13107200);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, -1, -56, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test5935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5935");
        long long1 = org.apache.commons.io.EndianUtils.swapLong((long) 172097536);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 72610717106176L + "'", long1 == 72610717106176L);
    }

    @Test
    public void test5936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5936");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(outputStream0, (short) 17696);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5937");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        long long16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, (int) (short) -32705, 8.73070592E8d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -32705 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 12, 66, 0]");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 4328448L + "'", long16 == 4328448L);
    }

    @Test
    public void test5938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5938");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, 1677721600);
        long long17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 1, 57.0f);
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
    public void test5939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5939");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        long long13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 1);
        int int15 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 0);
        short short17 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) (short) 13322);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13322 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 16737280L + "'", long13 == 16737280L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10223615) + "'", int15 == (-10223615));
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 25600 + "'", short17 == (short) 25600);
    }

    @Test
    public void test5940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5940");
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
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray5, 171180232, 2305843009213693952L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 171180232 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[52, 10, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
    }

    @Test
    public void test5941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5941");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble((double) 8.7241523E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5581E-319d + "'", double1 == 2.5581E-319d);
    }

    @Test
    public void test5942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5942");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 1113849856L);
        long long15 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 1);
        int int17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) (short) 1);
        int int19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        java.lang.Class<?> wildcardClass20 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, -56, -124, 78]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1317324800L + "'", long15 == 1317324800L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 51200 + "'", int17 == 51200);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test5943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5943");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        int int8 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long10 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray4, 2560);
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
    public void test5944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5944");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short12 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (float) 7205759403792793600L);
        // The following exception was thrown during execution in test generation
        try {
            short short17 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 16129);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 16129 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, -56, 94, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 13322 + "'", short12 == (short) 13322);
    }

    @Test
    public void test5945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5945");
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
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 3407872, (float) (-16512));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 100.0004f + "'", float22 == 100.0004f);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
    }

    @Test
    public void test5946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5946");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 4.6006E-41f);
        float float16 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        float float18 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, (int) (short) 0);
        int int20 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray5, (int) (short) 13312, 7208855624241643520L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13312 out of bounds for length 5");
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
    public void test5947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5947");
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
            double double28 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray5, (-1082130432));
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
    public void test5948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5948");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray0, 13322, 1.7540707E-38f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5949");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        long long10 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (-2134900737));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -2134900737 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
    }

    @Test
    public void test5950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5950");
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
            short short33 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (short) 200);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 200 out of bounds for length 5");
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
    public void test5951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5951");
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
            int int27 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) -32768);
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
    public void test5952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5952");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        int int13 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, (int) (short) 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) 2612);
        // The following exception was thrown during execution in test generation
        try {
            long long18 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray5, 13141070);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[52, 10, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10223615) + "'", int13 == (-10223615));
    }

    @Test
    public void test5953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5953");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble((double) (-72057589742960640L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.77449034724E-312d + "'", double1 == 4.77449034724E-312d);
    }

    @Test
    public void test5954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5954");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) '4', 5.7646075E18f);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, 100, -1, 0]");
    }

    @Test
    public void test5955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5955");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        int int8 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 0);
        short short10 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, (int) (short) 1);
        long long12 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, (int) (byte) 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 0, (float) 13322);
        int int17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 20938752);
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10240 + "'", int17 == 10240);
    }

    @Test
    public void test5956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5956");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble((double) 1.6777216E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.74784E-319d + "'", double1 == 2.74784E-319d);
    }

    @Test
    public void test5957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5957");
        float float1 = org.apache.commons.io.EndianUtils.swapFloat((float) 256);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.6012E-41f + "'", float1 == 4.6012E-41f);
    }

    @Test
    public void test5958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5958");
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
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 8404737, (short) 2612);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 8404737 out of bounds for length 5");
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
    public void test5959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5959");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, 1677721600);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, (-1), (int) (short) 256);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 0, 100]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }

    @Test
    public void test5960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5960");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(outputStream0, (-4467570830351532032L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5961");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) 25600);
        long long14 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        long long16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, 0, (short) -32705);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray4, 32831);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[63, -128, 100, 66]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1113849856L + "'", long14 == 1113849856L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1113849856L + "'", long16 == 1113849856L);
    }

    @Test
    public void test5962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5962");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 10, (byte) -1, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, 0, (short) 2560);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 200, (float) 16737280);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 10, -1, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4294904420L + "'", long6 == 4294904420L);
    }

    @Test
    public void test5963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5963");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(outputStream0, (long) 171180232);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5964");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 4.6006E-41f);
        float float16 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        float float18 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, (int) (short) 0);
        int int20 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 1);
        short short22 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long24 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 16777471);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 63, -128, 0, 0]");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.1777545E-38f + "'", float16 == 1.1777545E-38f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 1.1777545E-38f + "'", float18 == 1.1777545E-38f);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32831 + "'", int20 == 32831);
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) -32705 + "'", short22 == (short) -32705);
    }

    @Test
    public void test5965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5965");
        long long1 = org.apache.commons.io.EndianUtils.swapLong((-72057589742960640L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 16777471L + "'", long1 == 16777471L);
    }

    @Test
    public void test5966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5966");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 13322);
        float float22 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            short short24 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (-2143354624));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -2143354624 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 100.0004f + "'", float22 == 100.0004f);
    }

    @Test
    public void test5967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5967");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(outputStream0, 10240);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5968");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) (byte) -1);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 2612);
        float float14 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray4, 65535);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 65535 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[52, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 3.66E-42f + "'", float14 == 3.66E-42f);
    }

    @Test
    public void test5969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5969");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(outputStream0, (float) 220306052481024L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5970");
        float float1 = org.apache.commons.io.EndianUtils.swapFloat((float) (-4035225266123964416L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.475E-41f + "'", float1 == 3.475E-41f);
    }

    @Test
    public void test5971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5971");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(outputStream0, (long) (-939510774));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5972");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 10);
        int int16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, 167772160, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 167772160 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, 100, -1, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test5973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5973");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, (int) (byte) 1, (short) 25600);
        float float14 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray4, 0);
        long long16 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, 13322);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, 3407872, (float) (-16777215));
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
    public void test5974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5974");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, (int) (byte) 0, (int) (byte) 1);
        int int17 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray4, (int) (byte) 0);
        short short19 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray4, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(byteArray4, 1107296256, (long) 51294);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1107296256 out of bounds for length 4");
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
    public void test5975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5975");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, (int) (byte) 0, (int) (byte) 1);
        int int17 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, (-1082130432));
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
    public void test5976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5976");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        // The following exception was thrown during execution in test generation
        try {
            long long19 = org.apache.commons.io.EndianUtils.readSwappedLong(byteArray5, 1677721600);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, -56, 66]");
    }

    @Test
    public void test5977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5977");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray0, 32831, 45.009766f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5978");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        int int12 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, (-65536), 2.91442664E-315d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -65536 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 52, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.8668E-41f + "'", float10 == 1.8668E-41f);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 13322 + "'", int12 == 13322);
    }

    @Test
    public void test5979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5979");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble((double) 2.4603495E-32f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.772661555533E-312d + "'", double1 == 4.772661555533E-312d);
    }

    @Test
    public void test5980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5980");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray0, 200);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5981");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedLong(outputStream0, (long) (-1040187392));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5982");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (byte) 1, 1);
        short short13 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (short) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (-1.0f));
        int int18 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, (int) (byte) 100, (double) 2305843009213693952L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, 0, -128, -65]");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 1 + "'", short13 == (short) 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test5983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5983");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 1, (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (byte) 1, 100);
        int int22 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 536870912, (short) -32768);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 536870912 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 100, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 25600 + "'", int22 == 25600);
    }

    @Test
    public void test5984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5984");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5985");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        short short19 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 1);
        int int21 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) (byte) 0);
        float float23 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        short short25 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            short short27 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (short) 20480);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 20480 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + (-131072.0f) + "'", float23 == (-131072.0f));
        org.junit.Assert.assertTrue("'" + short25 + "' != '" + (short) 0 + "'", short25 == (short) 0);
    }

    @Test
    public void test5986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5986");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, 0.0f);
        int int25 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, 0, (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 1120403456);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, 0, 0, 66]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test5987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5987");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (short) 1, 4.6006E-41f);
        float float16 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        int int18 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 0);
        int int20 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (byte) 10, 13107200);
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
    public void test5988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5988");
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
            long long24 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 1317324800);
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
    public void test5989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5989");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        short short19 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (byte) 1);
        long long21 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 536870912);
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
    public void test5990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5990");
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
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, (int) (short) 100, 1065353216);
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
    public void test5991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5991");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            float float2 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray0, (int) (short) 2560);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5992");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble((double) 3.702239E-39f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.577550325E-315d + "'", double1 == 3.577550325E-315d);
    }

    @Test
    public void test5993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5993");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 655360, 81792);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, -56, 66]");
    }

    @Test
    public void test5994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5994");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        float float10 = org.apache.commons.io.EndianUtils.readSwappedFloat(byteArray5, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 1113849856L);
        short short15 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, 0);
        short short17 = org.apache.commons.io.EndianUtils.readSwappedShort(byteArray5, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(byteArray5, 2560, 65536.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2560 out of bounds for length 5");
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
    public void test5995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5995");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray5, (int) (short) 0, (short) (byte) 1);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, (int) (byte) 0, (float) '#');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 1, (float) 100);
        long long19 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, 1);
        int int21 = org.apache.commons.io.EndianUtils.readSwappedUnsignedShort(byteArray5, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long23 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 200);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, -56, 66]");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1120403456L + "'", long19 == 1120403456L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test5996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5996");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray5, 1, (int) '4');
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray5, 0, (-3.03064E38f));
        long long13 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 1);
        int int15 = org.apache.commons.io.EndianUtils.readSwappedInteger(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long17 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray5, (int) (short) 52);
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
    public void test5997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5997");
        double double1 = org.apache.commons.io.EndianUtils.swapDouble(4.079532010483E-312d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.143354624E9d) + "'", double1 == (-2.143354624E9d));
    }

    @Test
    public void test5998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5998");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.EndianUtils.writeSwappedDouble(outputStream0, (-9.39510774E8d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.OutputStream.write(int)\" because \"output\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5999");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray0, (-14336));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test6000");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        long long6 = org.apache.commons.io.EndianUtils.readSwappedUnsignedInteger(byteArray4, 0);
        org.apache.commons.io.EndianUtils.writeSwappedFloat(byteArray4, (int) (short) 0, (float) ' ');
        org.apache.commons.io.EndianUtils.writeSwappedInteger(byteArray4, 0, (int) (short) 13322);
        org.apache.commons.io.EndianUtils.writeSwappedShort(byteArray4, 1, (short) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = org.apache.commons.io.EndianUtils.readSwappedDouble(byteArray4, 194);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[10, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4284743681L + "'", long6 == 4284743681L);
    }
}

