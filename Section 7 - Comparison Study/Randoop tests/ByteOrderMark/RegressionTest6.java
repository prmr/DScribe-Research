import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

    public static boolean debug = false;

    @Test
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
        org.apache.commons.io.ByteOrderMark byteOrderMark0 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        boolean boolean2 = byteOrderMark0.equals((java.lang.Object) (-1L));
        java.lang.String str3 = byteOrderMark0.getCharsetName();
        org.apache.commons.io.ByteOrderMark byteOrderMark4 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        int int6 = byteOrderMark4.get(0);
        java.lang.String str7 = byteOrderMark4.getCharsetName();
        byte[] byteArray8 = byteOrderMark4.getBytes();
        boolean boolean9 = byteOrderMark0.equals((java.lang.Object) byteOrderMark4);
        java.lang.Object obj10 = null;
        boolean boolean11 = byteOrderMark4.equals(obj10);
        int[] intArray19 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark20 = new org.apache.commons.io.ByteOrderMark("hi!", intArray19);
        org.apache.commons.io.ByteOrderMark byteOrderMark21 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray19);
        org.apache.commons.io.ByteOrderMark byteOrderMark22 = new org.apache.commons.io.ByteOrderMark("hi!", intArray19);
        org.apache.commons.io.ByteOrderMark byteOrderMark23 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray19);
        int int24 = byteOrderMark23.length();
        java.lang.String str25 = byteOrderMark23.toString();
        java.lang.String str26 = byteOrderMark23.getCharsetName();
        boolean boolean27 = byteOrderMark4.equals((java.lang.Object) byteOrderMark23);
        java.lang.String str28 = byteOrderMark23.getCharsetName();
        byte[] byteArray29 = byteOrderMark23.getBytes();
        // The following exception was thrown during execution in test generation
        try {
            int int31 = byteOrderMark23.get(187);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 187 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrderMark0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF-16LE" + "'", str3, "UTF-16LE");
        org.junit.Assert.assertNotNull(byteOrderMark4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 255 + "'", int6 == 255);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTF-16LE" + "'", str7, "UTF-16LE");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, -2]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "ByteOrderMark[ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]: 0xA,0x61,0x23]" + "'", str25, "ByteOrderMark[ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]: 0xA,0x61,0x23]");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]" + "'", str26, "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]" + "'", str28, "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[10, 97, 35]");
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        org.apache.commons.io.ByteOrderMark byteOrderMark0 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        int int2 = byteOrderMark0.get(0);
        boolean boolean4 = byteOrderMark0.equals((java.lang.Object) (short) 0);
        int[] intArray11 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark12 = new org.apache.commons.io.ByteOrderMark("hi!", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark13 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark14 = new org.apache.commons.io.ByteOrderMark("hi!", intArray11);
        boolean boolean15 = byteOrderMark0.equals((java.lang.Object) byteOrderMark14);
        int[] intArray23 = new int[] { (byte) 0, 10, (-1) };
        org.apache.commons.io.ByteOrderMark byteOrderMark24 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[hi!: 0xA,0x61,0x23]", intArray23);
        org.apache.commons.io.ByteOrderMark byteOrderMark25 = new org.apache.commons.io.ByteOrderMark("UTF-16BE", intArray23);
        org.apache.commons.io.ByteOrderMark byteOrderMark26 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[UTF-16BE: 0xFE,0xFF]: 0xA,0xFE,0x64]", intArray23);
        org.apache.commons.io.ByteOrderMark byteOrderMark27 = new org.apache.commons.io.ByteOrderMark("UTF-32LE", intArray23);
        boolean boolean28 = byteOrderMark14.equals((java.lang.Object) "UTF-32LE");
        org.junit.Assert.assertNotNull(byteOrderMark0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 255 + "'", int2 == 255);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        int[] intArray13 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark14 = new org.apache.commons.io.ByteOrderMark("hi!", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark16 = new org.apache.commons.io.ByteOrderMark("hi!", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark17 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark18 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[hi!: 0xA,0x61,0x23]", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark19 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xA,0x61,0x23]", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark20 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-8: 0xEF,0xBB,0xBF]", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark21 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[UTF-16BE: 0xFE,0xFF]: 0xA,0x61,0x23]", intArray13);
        int[] intArray33 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark34 = new org.apache.commons.io.ByteOrderMark("hi!", intArray33);
        org.apache.commons.io.ByteOrderMark byteOrderMark35 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray33);
        org.apache.commons.io.ByteOrderMark byteOrderMark36 = new org.apache.commons.io.ByteOrderMark("hi!", intArray33);
        org.apache.commons.io.ByteOrderMark byteOrderMark37 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray33);
        org.apache.commons.io.ByteOrderMark byteOrderMark38 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray33);
        org.apache.commons.io.ByteOrderMark byteOrderMark39 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray33);
        org.apache.commons.io.ByteOrderMark byteOrderMark40 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray33);
        org.apache.commons.io.ByteOrderMark byteOrderMark41 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16BE: 0xFE,0xFF]", intArray33);
        boolean boolean42 = byteOrderMark21.equals((java.lang.Object) intArray33);
        org.apache.commons.io.ByteOrderMark byteOrderMark43 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray33);
        org.apache.commons.io.ByteOrderMark byteOrderMark44 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray33);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        org.apache.commons.io.ByteOrderMark byteOrderMark2 = org.apache.commons.io.ByteOrderMark.UTF_32BE;
        byte[] byteArray3 = byteOrderMark2.getBytes();
        int[] intArray13 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark14 = new org.apache.commons.io.ByteOrderMark("hi!", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark16 = new org.apache.commons.io.ByteOrderMark("hi!", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark17 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark18 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[hi!: 0xA,0x61,0x23]", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark19 = new org.apache.commons.io.ByteOrderMark("hi!", intArray13);
        boolean boolean20 = byteOrderMark2.equals((java.lang.Object) intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark21 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark22 = new org.apache.commons.io.ByteOrderMark("UTF-8", intArray13);
        org.junit.Assert.assertNotNull(byteOrderMark2);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, -2, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        int[] intArray9 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark10 = new org.apache.commons.io.ByteOrderMark("hi!", intArray9);
        org.apache.commons.io.ByteOrderMark byteOrderMark11 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray9);
        org.apache.commons.io.ByteOrderMark byteOrderMark12 = new org.apache.commons.io.ByteOrderMark("hi!", intArray9);
        org.apache.commons.io.ByteOrderMark byteOrderMark13 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray9);
        byte[] byteArray14 = byteOrderMark13.getBytes();
        byte[] byteArray15 = byteOrderMark13.getBytes();
        org.apache.commons.io.ByteOrderMark byteOrderMark16 = org.apache.commons.io.ByteOrderMark.UTF_16BE;
        java.lang.Object obj17 = null;
        boolean boolean18 = byteOrderMark16.equals(obj17);
        int int19 = byteOrderMark16.length();
        boolean boolean21 = byteOrderMark16.equals((java.lang.Object) 0L);
        int int22 = byteOrderMark16.length();
        int int23 = byteOrderMark16.length();
        int[] intArray30 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark31 = new org.apache.commons.io.ByteOrderMark("hi!", intArray30);
        org.apache.commons.io.ByteOrderMark byteOrderMark32 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray30);
        org.apache.commons.io.ByteOrderMark byteOrderMark33 = new org.apache.commons.io.ByteOrderMark("hi!", intArray30);
        boolean boolean34 = byteOrderMark16.equals((java.lang.Object) intArray30);
        boolean boolean35 = byteOrderMark13.equals((java.lang.Object) intArray30);
        org.apache.commons.io.ByteOrderMark byteOrderMark36 = new org.apache.commons.io.ByteOrderMark("UTF-8", intArray30);
        org.apache.commons.io.ByteOrderMark byteOrderMark37 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray30);
        java.lang.String str38 = byteOrderMark37.toString();
        int int39 = byteOrderMark37.length();
        int int40 = byteOrderMark37.length();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(byteOrderMark16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "ByteOrderMark[UTF-32BE: 0xA,0x61,0x23]" + "'", str38, "ByteOrderMark[UTF-32BE: 0xA,0x61,0x23]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 3 + "'", int39 == 3);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 3 + "'", int40 == 3);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        int[] intArray7 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark8 = new org.apache.commons.io.ByteOrderMark("hi!", intArray7);
        org.apache.commons.io.ByteOrderMark byteOrderMark9 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray7);
        org.apache.commons.io.ByteOrderMark byteOrderMark10 = new org.apache.commons.io.ByteOrderMark("hi!", intArray7);
        org.apache.commons.io.ByteOrderMark byteOrderMark11 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray7);
        int int12 = byteOrderMark11.length();
        java.lang.String str13 = byteOrderMark11.getCharsetName();
        java.lang.String str14 = byteOrderMark11.getCharsetName();
        java.lang.String str15 = byteOrderMark11.getCharsetName();
        int[] intArray27 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark28 = new org.apache.commons.io.ByteOrderMark("hi!", intArray27);
        org.apache.commons.io.ByteOrderMark byteOrderMark29 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray27);
        org.apache.commons.io.ByteOrderMark byteOrderMark30 = new org.apache.commons.io.ByteOrderMark("hi!", intArray27);
        org.apache.commons.io.ByteOrderMark byteOrderMark31 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray27);
        org.apache.commons.io.ByteOrderMark byteOrderMark32 = new org.apache.commons.io.ByteOrderMark("UTF-16BE", intArray27);
        org.apache.commons.io.ByteOrderMark byteOrderMark33 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray27);
        org.apache.commons.io.ByteOrderMark byteOrderMark34 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16BE: 0xA,0x61,0x23]", intArray27);
        org.apache.commons.io.ByteOrderMark byteOrderMark35 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray27);
        java.lang.String str36 = byteOrderMark35.getCharsetName();
        boolean boolean37 = byteOrderMark11.equals((java.lang.Object) str36);
        byte[] byteArray38 = byteOrderMark11.getBytes();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]" + "'", str13, "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]" + "'", str14, "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]" + "'", str15, "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[10, 97, 35]");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]" + "'", str36, "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[10, 97, 35]");
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        org.apache.commons.io.ByteOrderMark byteOrderMark0 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        int int2 = byteOrderMark0.get(0);
        boolean boolean4 = byteOrderMark0.equals((java.lang.Object) (short) 0);
        byte[] byteArray5 = byteOrderMark0.getBytes();
        org.apache.commons.io.ByteOrderMark byteOrderMark7 = org.apache.commons.io.ByteOrderMark.UTF_32BE;
        byte[] byteArray8 = byteOrderMark7.getBytes();
        java.lang.String str9 = byteOrderMark7.getCharsetName();
        org.apache.commons.io.ByteOrderMark byteOrderMark10 = org.apache.commons.io.ByteOrderMark.UTF_8;
        int int12 = byteOrderMark10.get((int) (byte) 0);
        byte[] byteArray13 = byteOrderMark10.getBytes();
        byte[] byteArray14 = byteOrderMark10.getBytes();
        boolean boolean15 = byteOrderMark7.equals((java.lang.Object) byteOrderMark10);
        int[] intArray25 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark26 = new org.apache.commons.io.ByteOrderMark("hi!", intArray25);
        org.apache.commons.io.ByteOrderMark byteOrderMark27 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray25);
        org.apache.commons.io.ByteOrderMark byteOrderMark28 = new org.apache.commons.io.ByteOrderMark("hi!", intArray25);
        org.apache.commons.io.ByteOrderMark byteOrderMark29 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray25);
        org.apache.commons.io.ByteOrderMark byteOrderMark30 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray25);
        org.apache.commons.io.ByteOrderMark byteOrderMark31 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray25);
        boolean boolean32 = byteOrderMark7.equals((java.lang.Object) intArray25);
        org.apache.commons.io.ByteOrderMark byteOrderMark33 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray25);
        java.lang.String str34 = byteOrderMark33.toString();
        org.apache.commons.io.ByteOrderMark byteOrderMark35 = org.apache.commons.io.ByteOrderMark.UTF_32BE;
        java.lang.String str36 = byteOrderMark35.toString();
        boolean boolean38 = byteOrderMark35.equals((java.lang.Object) ' ');
        java.lang.String str39 = byteOrderMark35.toString();
        java.lang.String str40 = byteOrderMark35.getCharsetName();
        byte[] byteArray41 = byteOrderMark35.getBytes();
        boolean boolean42 = byteOrderMark33.equals((java.lang.Object) byteArray41);
        org.apache.commons.io.ByteOrderMark byteOrderMark43 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        boolean boolean45 = byteOrderMark43.equals((java.lang.Object) 1L);
        java.lang.String str46 = byteOrderMark43.getCharsetName();
        int int47 = byteOrderMark43.length();
        boolean boolean49 = byteOrderMark43.equals((java.lang.Object) (byte) -1);
        byte[] byteArray50 = byteOrderMark43.getBytes();
        java.lang.String str51 = byteOrderMark43.getCharsetName();
        java.lang.String str52 = byteOrderMark43.getCharsetName();
        java.lang.String str53 = byteOrderMark43.toString();
        boolean boolean54 = byteOrderMark33.equals((java.lang.Object) str53);
        boolean boolean55 = byteOrderMark0.equals((java.lang.Object) str53);
        org.junit.Assert.assertNotNull(byteOrderMark0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 255 + "'", int2 == 255);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, -2]");
        org.junit.Assert.assertNotNull(byteOrderMark7);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 0, -2, -1]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTF-32BE" + "'", str9, "UTF-32BE");
        org.junit.Assert.assertNotNull(byteOrderMark10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 239 + "'", int12 == 239);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-17, -69, -65]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[-17, -69, -65]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "ByteOrderMark[ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]: 0xA,0x61,0x23]" + "'", str34, "ByteOrderMark[ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]: 0xA,0x61,0x23]");
        org.junit.Assert.assertNotNull(byteOrderMark35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]" + "'", str36, "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]" + "'", str39, "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "UTF-32BE" + "'", str40, "UTF-32BE");
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[0, 0, -2, -1]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(byteOrderMark43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "UTF-16LE" + "'", str46, "UTF-16LE");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2 + "'", int47 == 2);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[-1, -2]");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "UTF-16LE" + "'", str51, "UTF-16LE");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "UTF-16LE" + "'", str52, "UTF-16LE");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "ByteOrderMark[UTF-16LE: 0xFF,0xFE]" + "'", str53, "ByteOrderMark[UTF-16LE: 0xFF,0xFE]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        org.apache.commons.io.ByteOrderMark byteOrderMark0 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        boolean boolean2 = byteOrderMark0.equals((java.lang.Object) 1L);
        java.lang.String str3 = byteOrderMark0.getCharsetName();
        org.apache.commons.io.ByteOrderMark byteOrderMark4 = org.apache.commons.io.ByteOrderMark.UTF_16BE;
        boolean boolean5 = byteOrderMark0.equals((java.lang.Object) byteOrderMark4);
        byte[] byteArray6 = byteOrderMark4.getBytes();
        int int7 = byteOrderMark4.length();
        int int8 = byteOrderMark4.length();
        int[] intArray20 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark21 = new org.apache.commons.io.ByteOrderMark("hi!", intArray20);
        org.apache.commons.io.ByteOrderMark byteOrderMark22 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray20);
        org.apache.commons.io.ByteOrderMark byteOrderMark23 = new org.apache.commons.io.ByteOrderMark("hi!", intArray20);
        org.apache.commons.io.ByteOrderMark byteOrderMark24 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray20);
        org.apache.commons.io.ByteOrderMark byteOrderMark25 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[hi!: 0xA,0x61,0x23]", intArray20);
        org.apache.commons.io.ByteOrderMark byteOrderMark26 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xA,0x61,0x23]", intArray20);
        org.apache.commons.io.ByteOrderMark byteOrderMark27 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-8: 0xEF,0xBB,0xBF]", intArray20);
        org.apache.commons.io.ByteOrderMark byteOrderMark28 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[UTF-16BE: 0xFE,0xFF]: 0xA,0x61,0x23]", intArray20);
        boolean boolean29 = byteOrderMark4.equals((java.lang.Object) "ByteOrderMark[ByteOrderMark[UTF-16BE: 0xFE,0xFF]: 0xA,0x61,0x23]");
        int int30 = byteOrderMark4.length();
        java.lang.String str31 = byteOrderMark4.getCharsetName();
        org.junit.Assert.assertNotNull(byteOrderMark0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF-16LE" + "'", str3, "UTF-16LE");
        org.junit.Assert.assertNotNull(byteOrderMark4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-2, -1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "UTF-16BE" + "'", str31, "UTF-16BE");
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        int[] intArray9 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark10 = new org.apache.commons.io.ByteOrderMark("hi!", intArray9);
        org.apache.commons.io.ByteOrderMark byteOrderMark11 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray9);
        org.apache.commons.io.ByteOrderMark byteOrderMark12 = new org.apache.commons.io.ByteOrderMark("hi!", intArray9);
        org.apache.commons.io.ByteOrderMark byteOrderMark13 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray9);
        org.apache.commons.io.ByteOrderMark byteOrderMark14 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray9);
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray9);
        int int16 = byteOrderMark15.length();
        java.lang.String str17 = byteOrderMark15.getCharsetName();
        byte[] byteArray18 = byteOrderMark15.getBytes();
        java.lang.String str19 = byteOrderMark15.toString();
        int[] intArray32 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark33 = new org.apache.commons.io.ByteOrderMark("hi!", intArray32);
        org.apache.commons.io.ByteOrderMark byteOrderMark34 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray32);
        org.apache.commons.io.ByteOrderMark byteOrderMark35 = new org.apache.commons.io.ByteOrderMark("hi!", intArray32);
        org.apache.commons.io.ByteOrderMark byteOrderMark36 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray32);
        org.apache.commons.io.ByteOrderMark byteOrderMark37 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray32);
        org.apache.commons.io.ByteOrderMark byteOrderMark38 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray32);
        org.apache.commons.io.ByteOrderMark byteOrderMark39 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[UTF-16LE: 0xFF,0xFE]: 0xA,0x61,0x23]", intArray32);
        org.apache.commons.io.ByteOrderMark byteOrderMark40 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[UTF-32BE: 0xA,0x61,0x23]: 0xA,0x61,0x23]", intArray32);
        org.apache.commons.io.ByteOrderMark byteOrderMark41 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]: 0xA,0x61,0x23]", intArray32);
        boolean boolean42 = byteOrderMark15.equals((java.lang.Object) byteOrderMark41);
        java.lang.String str43 = byteOrderMark15.getCharsetName();
        java.lang.String str44 = byteOrderMark15.toString();
        byte[] byteArray45 = byteOrderMark15.getBytes();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]" + "'", str17, "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[10, 97, 35]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ByteOrderMark[ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]: 0xA,0x61,0x23]" + "'", str19, "ByteOrderMark[ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]: 0xA,0x61,0x23]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]" + "'", str43, "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "ByteOrderMark[ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]: 0xA,0x61,0x23]" + "'", str44, "ByteOrderMark[ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]: 0xA,0x61,0x23]");
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[10, 97, 35]");
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        int[] intArray13 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark14 = new org.apache.commons.io.ByteOrderMark("hi!", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark16 = new org.apache.commons.io.ByteOrderMark("hi!", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark17 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark18 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[hi!: 0xA,0x61,0x23]", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark19 = new org.apache.commons.io.ByteOrderMark("hi!", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark20 = new org.apache.commons.io.ByteOrderMark("UTF-8", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark21 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-8: 0xA,0x61,0x23]", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark22 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[ByteOrderMark[hi!: 0xA,0x61,0x23]: 0x0,0xA,0xFF]: 0xA,0x61,0x23]", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark23 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[hi!: 0xFF,0x0,0xFE]", intArray13);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 97, 35]");
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        org.apache.commons.io.ByteOrderMark byteOrderMark1 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        boolean boolean3 = byteOrderMark1.equals((java.lang.Object) 1L);
        java.lang.String str4 = byteOrderMark1.getCharsetName();
        org.apache.commons.io.ByteOrderMark byteOrderMark5 = org.apache.commons.io.ByteOrderMark.UTF_16BE;
        boolean boolean6 = byteOrderMark1.equals((java.lang.Object) byteOrderMark5);
        byte[] byteArray7 = byteOrderMark5.getBytes();
        int int8 = byteOrderMark5.length();
        int int9 = byteOrderMark5.length();
        int[] intArray19 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark20 = new org.apache.commons.io.ByteOrderMark("hi!", intArray19);
        org.apache.commons.io.ByteOrderMark byteOrderMark21 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray19);
        org.apache.commons.io.ByteOrderMark byteOrderMark22 = new org.apache.commons.io.ByteOrderMark("hi!", intArray19);
        org.apache.commons.io.ByteOrderMark byteOrderMark23 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray19);
        org.apache.commons.io.ByteOrderMark byteOrderMark24 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[hi!: 0xA,0x61,0x23]", intArray19);
        org.apache.commons.io.ByteOrderMark byteOrderMark25 = new org.apache.commons.io.ByteOrderMark("hi!", intArray19);
        boolean boolean26 = byteOrderMark5.equals((java.lang.Object) intArray19);
        org.apache.commons.io.ByteOrderMark byteOrderMark27 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]: 0xA,0x61,0x23]: 0xA,0x61,0x23]", intArray19);
        java.lang.String str28 = byteOrderMark27.getCharsetName();
        java.lang.String str29 = byteOrderMark27.getCharsetName();
        org.junit.Assert.assertNotNull(byteOrderMark1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF-16LE" + "'", str4, "UTF-16LE");
        org.junit.Assert.assertNotNull(byteOrderMark5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-2, -1]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "ByteOrderMark[ByteOrderMark[ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]: 0xA,0x61,0x23]: 0xA,0x61,0x23]" + "'", str28, "ByteOrderMark[ByteOrderMark[ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]: 0xA,0x61,0x23]: 0xA,0x61,0x23]");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "ByteOrderMark[ByteOrderMark[ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]: 0xA,0x61,0x23]: 0xA,0x61,0x23]" + "'", str29, "ByteOrderMark[ByteOrderMark[ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]: 0xA,0x61,0x23]: 0xA,0x61,0x23]");
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        org.apache.commons.io.ByteOrderMark byteOrderMark0 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        int int2 = byteOrderMark0.get(0);
        int[] intArray7 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark8 = new org.apache.commons.io.ByteOrderMark("hi!", intArray7);
        int int9 = byteOrderMark8.length();
        java.lang.Class<?> wildcardClass10 = byteOrderMark8.getClass();
        boolean boolean11 = byteOrderMark0.equals((java.lang.Object) wildcardClass10);
        int int12 = byteOrderMark0.length();
        int int13 = byteOrderMark0.length();
        int int15 = byteOrderMark0.get(0);
        org.junit.Assert.assertNotNull(byteOrderMark0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 255 + "'", int2 == 255);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 255 + "'", int15 == 255);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        int[] intArray14 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("hi!", intArray14);
        org.apache.commons.io.ByteOrderMark byteOrderMark16 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray14);
        org.apache.commons.io.ByteOrderMark byteOrderMark17 = new org.apache.commons.io.ByteOrderMark("hi!", intArray14);
        org.apache.commons.io.ByteOrderMark byteOrderMark18 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray14);
        org.apache.commons.io.ByteOrderMark byteOrderMark19 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[hi!: 0xA,0x61,0x23]", intArray14);
        org.apache.commons.io.ByteOrderMark byteOrderMark20 = new org.apache.commons.io.ByteOrderMark("hi!", intArray14);
        org.apache.commons.io.ByteOrderMark byteOrderMark21 = new org.apache.commons.io.ByteOrderMark("UTF-8", intArray14);
        org.apache.commons.io.ByteOrderMark byteOrderMark22 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[UTF-16LE: 0xFF,0xFE]: 0xA,0x61,0x23]", intArray14);
        org.apache.commons.io.ByteOrderMark byteOrderMark23 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[hi!: 0xA,0x61,0x23]", intArray14);
        org.apache.commons.io.ByteOrderMark byteOrderMark24 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[ByteOrderMark[ByteOrderMark[UTF-8: 0xEF,0xBB,0xBF]: 0xA,0x61,0x23]: 0xA,0x61,0x23]: 0xA,0x61,0x23]", intArray14);
        org.apache.commons.io.ByteOrderMark byteOrderMark25 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-8: 0xEF,0xBB,0xBF]", intArray14);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[10, 97, 35]");
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        int[] intArray7 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark8 = new org.apache.commons.io.ByteOrderMark("hi!", intArray7);
        org.apache.commons.io.ByteOrderMark byteOrderMark9 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray7);
        org.apache.commons.io.ByteOrderMark byteOrderMark10 = new org.apache.commons.io.ByteOrderMark("hi!", intArray7);
        org.apache.commons.io.ByteOrderMark byteOrderMark11 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray7);
        int int12 = byteOrderMark11.length();
        int int14 = byteOrderMark11.get((int) (byte) 1);
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = org.apache.commons.io.ByteOrderMark.UTF_32BE;
        java.lang.String str16 = byteOrderMark15.toString();
        java.lang.String str17 = byteOrderMark15.toString();
        int int19 = byteOrderMark15.get(2);
        boolean boolean21 = byteOrderMark15.equals((java.lang.Object) (byte) 10);
        byte[] byteArray22 = byteOrderMark15.getBytes();
        byte[] byteArray23 = byteOrderMark15.getBytes();
        int int24 = byteOrderMark15.length();
        java.lang.String str25 = byteOrderMark15.getCharsetName();
        boolean boolean26 = byteOrderMark11.equals((java.lang.Object) str25);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertNotNull(byteOrderMark15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]" + "'", str16, "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]" + "'", str17, "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 254 + "'", int19 == 254);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[0, 0, -2, -1]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[0, 0, -2, -1]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "UTF-32BE" + "'", str25, "UTF-32BE");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        int[] intArray13 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark14 = new org.apache.commons.io.ByteOrderMark("hi!", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark16 = new org.apache.commons.io.ByteOrderMark("hi!", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark17 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark18 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]: 0xA,0x61,0x23]", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark19 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0xA,0x61,0x23]", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark20 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark21 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[UTF-16BE: 0xFE,0xFF]: 0xA,0xFE,0x64]", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark22 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[UTF-16BE: 0xFE,0xFF]: 0xA,0xFE,0x64]", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark23 = new org.apache.commons.io.ByteOrderMark("UTF-16BE", intArray13);
        int int24 = byteOrderMark23.length();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        int[] intArray11 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark12 = new org.apache.commons.io.ByteOrderMark("hi!", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark13 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark14 = new org.apache.commons.io.ByteOrderMark("hi!", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark16 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]: 0xA,0x61,0x23]", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark17 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[ByteOrderMark[UTF-16LE: 0xFF,0xFE]: 0xA,0x61,0x23]: 0xA,0x61,0x23]", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark18 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16BE: 0x0,0xA,0xFF]", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark19 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray11);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, 35]");
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        int[] intArray11 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark12 = new org.apache.commons.io.ByteOrderMark("hi!", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark13 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark14 = new org.apache.commons.io.ByteOrderMark("hi!", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark16 = new org.apache.commons.io.ByteOrderMark("UTF-16BE", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark17 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark18 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16BE: 0xFE,0xFF]", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark19 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[hi!: 0xFF,0x0,0xFE]", intArray11);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = byteOrderMark19.get(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, 35]");
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        int[] intArray11 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark12 = new org.apache.commons.io.ByteOrderMark("hi!", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark13 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark14 = new org.apache.commons.io.ByteOrderMark("hi!", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark16 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[hi!: 0xA,0x61,0x23]", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark17 = new org.apache.commons.io.ByteOrderMark("hi!", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark18 = new org.apache.commons.io.ByteOrderMark("UTF-8", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark19 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[UTF-16LE: 0xFF,0xFE]: 0xA,0x61,0x23]", intArray11);
        java.lang.String str20 = byteOrderMark19.toString();
        int int21 = byteOrderMark19.length();
        java.lang.String str22 = byteOrderMark19.toString();
        java.lang.Class<?> wildcardClass23 = byteOrderMark19.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, 35]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ByteOrderMark[ByteOrderMark[ByteOrderMark[UTF-16LE: 0xFF,0xFE]: 0xA,0x61,0x23]: 0xA,0x61,0x23]" + "'", str20, "ByteOrderMark[ByteOrderMark[ByteOrderMark[UTF-16LE: 0xFF,0xFE]: 0xA,0x61,0x23]: 0xA,0x61,0x23]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ByteOrderMark[ByteOrderMark[ByteOrderMark[UTF-16LE: 0xFF,0xFE]: 0xA,0x61,0x23]: 0xA,0x61,0x23]" + "'", str22, "ByteOrderMark[ByteOrderMark[ByteOrderMark[UTF-16LE: 0xFF,0xFE]: 0xA,0x61,0x23]: 0xA,0x61,0x23]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        int[] intArray11 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark12 = new org.apache.commons.io.ByteOrderMark("hi!", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark13 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark14 = new org.apache.commons.io.ByteOrderMark("hi!", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark16 = new org.apache.commons.io.ByteOrderMark("UTF-16BE", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark17 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark18 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16BE: 0xFE,0xFF]", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark19 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[UTF-16LE: 0xFF,0xFE]: 0xA,0x61,0x23]", intArray11);
        int int20 = byteOrderMark19.length();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        int[] intArray11 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark12 = new org.apache.commons.io.ByteOrderMark("hi!", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark13 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark14 = new org.apache.commons.io.ByteOrderMark("hi!", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark16 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[hi!: 0xA,0x61,0x23]", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark17 = new org.apache.commons.io.ByteOrderMark("hi!", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark18 = new org.apache.commons.io.ByteOrderMark("UTF-8", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark19 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[UTF-16LE: 0xFF,0xFE]: 0xA,0x61,0x23]", intArray11);
        java.lang.String str20 = byteOrderMark19.toString();
        byte[] byteArray21 = byteOrderMark19.getBytes();
        java.lang.String str22 = byteOrderMark19.toString();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, 35]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ByteOrderMark[ByteOrderMark[ByteOrderMark[UTF-16LE: 0xFF,0xFE]: 0xA,0x61,0x23]: 0xA,0x61,0x23]" + "'", str20, "ByteOrderMark[ByteOrderMark[ByteOrderMark[UTF-16LE: 0xFF,0xFE]: 0xA,0x61,0x23]: 0xA,0x61,0x23]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[10, 97, 35]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ByteOrderMark[ByteOrderMark[ByteOrderMark[UTF-16LE: 0xFF,0xFE]: 0xA,0x61,0x23]: 0xA,0x61,0x23]" + "'", str22, "ByteOrderMark[ByteOrderMark[ByteOrderMark[UTF-16LE: 0xFF,0xFE]: 0xA,0x61,0x23]: 0xA,0x61,0x23]");
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        int[] intArray8 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark9 = new org.apache.commons.io.ByteOrderMark("hi!", intArray8);
        org.apache.commons.io.ByteOrderMark byteOrderMark10 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray8);
        org.apache.commons.io.ByteOrderMark byteOrderMark11 = new org.apache.commons.io.ByteOrderMark("hi!", intArray8);
        org.apache.commons.io.ByteOrderMark byteOrderMark12 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray8);
        byte[] byteArray13 = byteOrderMark12.getBytes();
        byte[] byteArray14 = byteOrderMark12.getBytes();
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = org.apache.commons.io.ByteOrderMark.UTF_16BE;
        java.lang.Object obj16 = null;
        boolean boolean17 = byteOrderMark15.equals(obj16);
        int int18 = byteOrderMark15.length();
        boolean boolean20 = byteOrderMark15.equals((java.lang.Object) 0L);
        int int21 = byteOrderMark15.length();
        int int22 = byteOrderMark15.length();
        int[] intArray29 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark30 = new org.apache.commons.io.ByteOrderMark("hi!", intArray29);
        org.apache.commons.io.ByteOrderMark byteOrderMark31 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray29);
        org.apache.commons.io.ByteOrderMark byteOrderMark32 = new org.apache.commons.io.ByteOrderMark("hi!", intArray29);
        boolean boolean33 = byteOrderMark15.equals((java.lang.Object) intArray29);
        boolean boolean34 = byteOrderMark12.equals((java.lang.Object) intArray29);
        org.apache.commons.io.ByteOrderMark byteOrderMark35 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray29);
        byte[] byteArray36 = byteOrderMark35.getBytes();
        int int37 = byteOrderMark35.length();
        int int38 = byteOrderMark35.length();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(byteOrderMark15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 3 + "'", int37 == 3);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 3 + "'", int38 == 3);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        int[] intArray11 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark12 = new org.apache.commons.io.ByteOrderMark("hi!", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark13 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark14 = new org.apache.commons.io.ByteOrderMark("hi!", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark16 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[hi!: 0xA,0x61,0x23]", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark17 = new org.apache.commons.io.ByteOrderMark("hi!", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark18 = new org.apache.commons.io.ByteOrderMark("UTF-8", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark19 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[UTF-16LE: 0xFF,0xFE]: 0xA,0x61,0x23]", intArray11);
        java.lang.String str20 = byteOrderMark19.toString();
        int int21 = byteOrderMark19.length();
        java.lang.String str22 = byteOrderMark19.getCharsetName();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, 35]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ByteOrderMark[ByteOrderMark[ByteOrderMark[UTF-16LE: 0xFF,0xFE]: 0xA,0x61,0x23]: 0xA,0x61,0x23]" + "'", str20, "ByteOrderMark[ByteOrderMark[ByteOrderMark[UTF-16LE: 0xFF,0xFE]: 0xA,0x61,0x23]: 0xA,0x61,0x23]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ByteOrderMark[ByteOrderMark[UTF-16LE: 0xFF,0xFE]: 0xA,0x61,0x23]" + "'", str22, "ByteOrderMark[ByteOrderMark[UTF-16LE: 0xFF,0xFE]: 0xA,0x61,0x23]");
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        org.apache.commons.io.ByteOrderMark byteOrderMark0 = org.apache.commons.io.ByteOrderMark.UTF_16BE;
        java.lang.Object obj1 = null;
        boolean boolean2 = byteOrderMark0.equals(obj1);
        int int3 = byteOrderMark0.length();
        boolean boolean5 = byteOrderMark0.equals((java.lang.Object) 0L);
        int int6 = byteOrderMark0.length();
        boolean boolean8 = byteOrderMark0.equals((java.lang.Object) 3);
        java.lang.String str9 = byteOrderMark0.getCharsetName();
        java.lang.String str10 = byteOrderMark0.getCharsetName();
        java.lang.String str11 = byteOrderMark0.toString();
        int int12 = byteOrderMark0.length();
        java.lang.String str13 = byteOrderMark0.toString();
        org.junit.Assert.assertNotNull(byteOrderMark0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTF-16BE" + "'", str9, "UTF-16BE");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTF-16BE" + "'", str10, "UTF-16BE");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ByteOrderMark[UTF-16BE: 0xFE,0xFF]" + "'", str11, "ByteOrderMark[UTF-16BE: 0xFE,0xFF]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ByteOrderMark[UTF-16BE: 0xFE,0xFF]" + "'", str13, "ByteOrderMark[UTF-16BE: 0xFE,0xFF]");
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        int[] intArray10 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark11 = new org.apache.commons.io.ByteOrderMark("hi!", intArray10);
        org.apache.commons.io.ByteOrderMark byteOrderMark12 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray10);
        org.apache.commons.io.ByteOrderMark byteOrderMark13 = new org.apache.commons.io.ByteOrderMark("hi!", intArray10);
        org.apache.commons.io.ByteOrderMark byteOrderMark14 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray10);
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[hi!: 0xA,0x61,0x23]", intArray10);
        org.apache.commons.io.ByteOrderMark byteOrderMark16 = new org.apache.commons.io.ByteOrderMark("hi!", intArray10);
        org.apache.commons.io.ByteOrderMark byteOrderMark17 = new org.apache.commons.io.ByteOrderMark("UTF-8", intArray10);
        org.apache.commons.io.ByteOrderMark byteOrderMark18 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        int int20 = byteOrderMark18.get(0);
        byte[] byteArray21 = byteOrderMark18.getBytes();
        byte[] byteArray22 = byteOrderMark18.getBytes();
        java.lang.String str23 = byteOrderMark18.getCharsetName();
        java.lang.String str24 = byteOrderMark18.toString();
        int[] intArray30 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark31 = new org.apache.commons.io.ByteOrderMark("hi!", intArray30);
        org.apache.commons.io.ByteOrderMark byteOrderMark32 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[UTF-16LE: 0xFF,0xFE]: 0xA,0x61,0x23]", intArray30);
        int int33 = byteOrderMark32.length();
        boolean boolean34 = byteOrderMark18.equals((java.lang.Object) byteOrderMark32);
        byte[] byteArray35 = byteOrderMark18.getBytes();
        boolean boolean36 = byteOrderMark17.equals((java.lang.Object) byteOrderMark18);
        java.lang.String str37 = byteOrderMark18.getCharsetName();
        int int38 = byteOrderMark18.length();
        int[] intArray48 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark49 = new org.apache.commons.io.ByteOrderMark("hi!", intArray48);
        org.apache.commons.io.ByteOrderMark byteOrderMark50 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray48);
        org.apache.commons.io.ByteOrderMark byteOrderMark51 = new org.apache.commons.io.ByteOrderMark("hi!", intArray48);
        org.apache.commons.io.ByteOrderMark byteOrderMark52 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray48);
        byte[] byteArray53 = byteOrderMark52.getBytes();
        byte[] byteArray54 = byteOrderMark52.getBytes();
        org.apache.commons.io.ByteOrderMark byteOrderMark55 = org.apache.commons.io.ByteOrderMark.UTF_16BE;
        java.lang.Object obj56 = null;
        boolean boolean57 = byteOrderMark55.equals(obj56);
        int int58 = byteOrderMark55.length();
        boolean boolean60 = byteOrderMark55.equals((java.lang.Object) 0L);
        int int61 = byteOrderMark55.length();
        int int62 = byteOrderMark55.length();
        int[] intArray69 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark70 = new org.apache.commons.io.ByteOrderMark("hi!", intArray69);
        org.apache.commons.io.ByteOrderMark byteOrderMark71 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray69);
        org.apache.commons.io.ByteOrderMark byteOrderMark72 = new org.apache.commons.io.ByteOrderMark("hi!", intArray69);
        boolean boolean73 = byteOrderMark55.equals((java.lang.Object) intArray69);
        boolean boolean74 = byteOrderMark52.equals((java.lang.Object) intArray69);
        org.apache.commons.io.ByteOrderMark byteOrderMark75 = new org.apache.commons.io.ByteOrderMark("UTF-8", intArray69);
        org.apache.commons.io.ByteOrderMark byteOrderMark76 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray69);
        boolean boolean77 = byteOrderMark18.equals((java.lang.Object) byteOrderMark76);
        // The following exception was thrown during execution in test generation
        try {
            int int79 = byteOrderMark18.get(35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(byteOrderMark18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 255 + "'", int20 == 255);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[-1, -2]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[-1, -2]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "UTF-16LE" + "'", str23, "UTF-16LE");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "ByteOrderMark[UTF-16LE: 0xFF,0xFE]" + "'", str24, "ByteOrderMark[UTF-16LE: 0xFF,0xFE]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[-1, -2]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "UTF-16LE" + "'", str37, "UTF-16LE");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2 + "'", int38 == 2);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray54), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(byteOrderMark55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 2 + "'", int58 == 2);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 2 + "'", int61 == 2);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 2 + "'", int62 == 2);
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray69), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        int[] intArray6 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark7 = new org.apache.commons.io.ByteOrderMark("hi!", intArray6);
        org.apache.commons.io.ByteOrderMark byteOrderMark8 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray6);
        org.apache.commons.io.ByteOrderMark byteOrderMark9 = new org.apache.commons.io.ByteOrderMark("hi!", intArray6);
        java.lang.String str10 = byteOrderMark9.toString();
        java.lang.String str11 = byteOrderMark9.toString();
        boolean boolean13 = byteOrderMark9.equals((java.lang.Object) true);
        boolean boolean15 = byteOrderMark9.equals((java.lang.Object) "UTF-32BE");
        int[] intArray25 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark26 = new org.apache.commons.io.ByteOrderMark("hi!", intArray25);
        org.apache.commons.io.ByteOrderMark byteOrderMark27 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray25);
        org.apache.commons.io.ByteOrderMark byteOrderMark28 = new org.apache.commons.io.ByteOrderMark("hi!", intArray25);
        org.apache.commons.io.ByteOrderMark byteOrderMark29 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray25);
        org.apache.commons.io.ByteOrderMark byteOrderMark30 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray25);
        org.apache.commons.io.ByteOrderMark byteOrderMark31 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray25);
        boolean boolean32 = byteOrderMark9.equals((java.lang.Object) intArray25);
        byte[] byteArray33 = byteOrderMark9.getBytes();
        int int34 = byteOrderMark9.length();
        java.lang.String str35 = byteOrderMark9.toString();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 97, 35]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ByteOrderMark[hi!: 0xA,0x61,0x23]" + "'", str10, "ByteOrderMark[hi!: 0xA,0x61,0x23]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ByteOrderMark[hi!: 0xA,0x61,0x23]" + "'", str11, "ByteOrderMark[hi!: 0xA,0x61,0x23]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "ByteOrderMark[hi!: 0xA,0x61,0x23]" + "'", str35, "ByteOrderMark[hi!: 0xA,0x61,0x23]");
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        org.apache.commons.io.ByteOrderMark byteOrderMark0 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        int int2 = byteOrderMark0.get(0);
        int int3 = byteOrderMark0.length();
        java.lang.String str4 = byteOrderMark0.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = byteOrderMark0.get((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrderMark0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 255 + "'", int2 == 255);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ByteOrderMark[UTF-16LE: 0xFF,0xFE]" + "'", str4, "ByteOrderMark[UTF-16LE: 0xFF,0xFE]");
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        int[] intArray11 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark12 = new org.apache.commons.io.ByteOrderMark("hi!", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark13 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark14 = new org.apache.commons.io.ByteOrderMark("hi!", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark16 = new org.apache.commons.io.ByteOrderMark("UTF-16BE", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark17 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark18 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16BE: 0xFE,0xFF]", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark19 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[ByteOrderMark[UTF-8: 0xEF,0xBB,0xBF]: 0xA,0x61,0x23]: 0xA,0xFE,0x64]", intArray11);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, 35]");
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        int[] intArray7 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark8 = new org.apache.commons.io.ByteOrderMark("hi!", intArray7);
        org.apache.commons.io.ByteOrderMark byteOrderMark9 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray7);
        org.apache.commons.io.ByteOrderMark byteOrderMark10 = new org.apache.commons.io.ByteOrderMark("hi!", intArray7);
        org.apache.commons.io.ByteOrderMark byteOrderMark11 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray7);
        org.apache.commons.io.ByteOrderMark byteOrderMark12 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        boolean boolean14 = byteOrderMark12.equals((java.lang.Object) (-1L));
        java.lang.String str15 = byteOrderMark12.toString();
        java.lang.String str16 = byteOrderMark12.getCharsetName();
        boolean boolean17 = byteOrderMark11.equals((java.lang.Object) byteOrderMark12);
        java.lang.String str18 = byteOrderMark12.toString();
        java.lang.String str19 = byteOrderMark12.getCharsetName();
        java.lang.String str20 = byteOrderMark12.getCharsetName();
        java.lang.String str21 = byteOrderMark12.getCharsetName();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(byteOrderMark12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ByteOrderMark[UTF-16LE: 0xFF,0xFE]" + "'", str15, "ByteOrderMark[UTF-16LE: 0xFF,0xFE]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTF-16LE" + "'", str16, "UTF-16LE");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ByteOrderMark[UTF-16LE: 0xFF,0xFE]" + "'", str18, "ByteOrderMark[UTF-16LE: 0xFF,0xFE]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "UTF-16LE" + "'", str19, "UTF-16LE");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "UTF-16LE" + "'", str20, "UTF-16LE");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "UTF-16LE" + "'", str21, "UTF-16LE");
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        int[] intArray6 = new int[] { (byte) 0, 10, (-1) };
        org.apache.commons.io.ByteOrderMark byteOrderMark7 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[hi!: 0xA,0x61,0x23]", intArray6);
        org.apache.commons.io.ByteOrderMark byteOrderMark8 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[hi!: 0xA,0x61,0x23]", intArray6);
        org.apache.commons.io.ByteOrderMark byteOrderMark9 = new org.apache.commons.io.ByteOrderMark("UTF-8", intArray6);
        org.apache.commons.io.ByteOrderMark byteOrderMark10 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        int int12 = byteOrderMark10.get(0);
        byte[] byteArray13 = byteOrderMark10.getBytes();
        byte[] byteArray14 = byteOrderMark10.getBytes();
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        boolean boolean17 = byteOrderMark15.equals((java.lang.Object) 1L);
        java.lang.String str18 = byteOrderMark15.getCharsetName();
        boolean boolean19 = byteOrderMark10.equals((java.lang.Object) byteOrderMark15);
        byte[] byteArray20 = byteOrderMark10.getBytes();
        boolean boolean21 = byteOrderMark9.equals((java.lang.Object) byteOrderMark10);
        int int22 = byteOrderMark9.length();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 10, -1]");
        org.junit.Assert.assertNotNull(byteOrderMark10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 255 + "'", int12 == 255);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, -2]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[-1, -2]");
        org.junit.Assert.assertNotNull(byteOrderMark15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "UTF-16LE" + "'", str18, "UTF-16LE");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[-1, -2]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        org.apache.commons.io.ByteOrderMark byteOrderMark4 = org.apache.commons.io.ByteOrderMark.UTF_32BE;
        byte[] byteArray5 = byteOrderMark4.getBytes();
        java.lang.String str6 = byteOrderMark4.getCharsetName();
        org.apache.commons.io.ByteOrderMark byteOrderMark7 = org.apache.commons.io.ByteOrderMark.UTF_8;
        int int9 = byteOrderMark7.get((int) (byte) 0);
        byte[] byteArray10 = byteOrderMark7.getBytes();
        byte[] byteArray11 = byteOrderMark7.getBytes();
        boolean boolean12 = byteOrderMark4.equals((java.lang.Object) byteOrderMark7);
        int[] intArray22 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark23 = new org.apache.commons.io.ByteOrderMark("hi!", intArray22);
        org.apache.commons.io.ByteOrderMark byteOrderMark24 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray22);
        org.apache.commons.io.ByteOrderMark byteOrderMark25 = new org.apache.commons.io.ByteOrderMark("hi!", intArray22);
        org.apache.commons.io.ByteOrderMark byteOrderMark26 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray22);
        org.apache.commons.io.ByteOrderMark byteOrderMark27 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray22);
        org.apache.commons.io.ByteOrderMark byteOrderMark28 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray22);
        boolean boolean29 = byteOrderMark4.equals((java.lang.Object) intArray22);
        org.apache.commons.io.ByteOrderMark byteOrderMark30 = new org.apache.commons.io.ByteOrderMark("UTF-8", intArray22);
        org.apache.commons.io.ByteOrderMark byteOrderMark31 = new org.apache.commons.io.ByteOrderMark("hi!", intArray22);
        org.apache.commons.io.ByteOrderMark byteOrderMark32 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[UTF-16BE: 0xFE,0xFF]: 0xA,0x61,0x23]", intArray22);
        org.apache.commons.io.ByteOrderMark byteOrderMark33 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[UTF-16BE: 0xFE,0xFF]: 0xA,0xFE,0x64]", intArray22);
        java.lang.String str34 = byteOrderMark33.toString();
        org.apache.commons.io.ByteOrderMark byteOrderMark35 = org.apache.commons.io.ByteOrderMark.UTF_16BE;
        java.lang.Object obj36 = null;
        boolean boolean37 = byteOrderMark35.equals(obj36);
        int int38 = byteOrderMark35.length();
        boolean boolean40 = byteOrderMark35.equals((java.lang.Object) 0L);
        int int41 = byteOrderMark35.length();
        boolean boolean43 = byteOrderMark35.equals((java.lang.Object) 3);
        java.lang.String str44 = byteOrderMark35.getCharsetName();
        java.lang.String str45 = byteOrderMark35.getCharsetName();
        java.lang.String str46 = byteOrderMark35.toString();
        byte[] byteArray47 = byteOrderMark35.getBytes();
        org.apache.commons.io.ByteOrderMark byteOrderMark48 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        java.lang.String str49 = byteOrderMark48.getCharsetName();
        int int50 = byteOrderMark48.length();
        int int51 = byteOrderMark48.length();
        java.lang.String str52 = byteOrderMark48.getCharsetName();
        boolean boolean53 = byteOrderMark35.equals((java.lang.Object) str52);
        java.lang.String str54 = byteOrderMark35.toString();
        byte[] byteArray55 = byteOrderMark35.getBytes();
        java.lang.Object obj56 = null;
        boolean boolean57 = byteOrderMark35.equals(obj56);
        boolean boolean58 = byteOrderMark33.equals(obj56);
        org.junit.Assert.assertNotNull(byteOrderMark4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, -2, -1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF-32BE" + "'", str6, "UTF-32BE");
        org.junit.Assert.assertNotNull(byteOrderMark7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 239 + "'", int9 == 239);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-17, -69, -65]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-17, -69, -65]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "ByteOrderMark[ByteOrderMark[ByteOrderMark[UTF-16BE: 0xFE,0xFF]: 0xA,0xFE,0x64]: 0xA,0x61,0x23]" + "'", str34, "ByteOrderMark[ByteOrderMark[ByteOrderMark[UTF-16BE: 0xFE,0xFF]: 0xA,0xFE,0x64]: 0xA,0x61,0x23]");
        org.junit.Assert.assertNotNull(byteOrderMark35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2 + "'", int38 == 2);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2 + "'", int41 == 2);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "UTF-16BE" + "'", str44, "UTF-16BE");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "UTF-16BE" + "'", str45, "UTF-16BE");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "ByteOrderMark[UTF-16BE: 0xFE,0xFF]" + "'", str46, "ByteOrderMark[UTF-16BE: 0xFE,0xFF]");
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[-2, -1]");
        org.junit.Assert.assertNotNull(byteOrderMark48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "UTF-16LE" + "'", str49, "UTF-16LE");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 2 + "'", int50 == 2);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 2 + "'", int51 == 2);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "UTF-16LE" + "'", str52, "UTF-16LE");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "ByteOrderMark[UTF-16BE: 0xFE,0xFF]" + "'", str54, "ByteOrderMark[UTF-16BE: 0xFE,0xFF]");
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[-2, -1]");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        int[] intArray6 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark7 = new org.apache.commons.io.ByteOrderMark("hi!", intArray6);
        org.apache.commons.io.ByteOrderMark byteOrderMark8 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray6);
        org.apache.commons.io.ByteOrderMark byteOrderMark9 = new org.apache.commons.io.ByteOrderMark("hi!", intArray6);
        int int10 = byteOrderMark9.length();
        int[] intArray15 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark16 = new org.apache.commons.io.ByteOrderMark("hi!", intArray15);
        java.lang.String str17 = byteOrderMark16.getCharsetName();
        java.lang.Object obj18 = null;
        boolean boolean19 = byteOrderMark16.equals(obj18);
        boolean boolean20 = byteOrderMark9.equals(obj18);
        org.apache.commons.io.ByteOrderMark byteOrderMark21 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        boolean boolean23 = byteOrderMark21.equals((java.lang.Object) (-1L));
        java.lang.String str24 = byteOrderMark21.getCharsetName();
        java.lang.String str25 = byteOrderMark21.getCharsetName();
        java.lang.String str26 = byteOrderMark21.getCharsetName();
        boolean boolean27 = byteOrderMark9.equals((java.lang.Object) byteOrderMark21);
        org.apache.commons.io.ByteOrderMark byteOrderMark28 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        boolean boolean30 = byteOrderMark28.equals((java.lang.Object) 1L);
        java.lang.String str31 = byteOrderMark28.getCharsetName();
        int int32 = byteOrderMark28.length();
        boolean boolean34 = byteOrderMark28.equals((java.lang.Object) (-1.0f));
        java.lang.String str35 = byteOrderMark28.toString();
        boolean boolean36 = byteOrderMark21.equals((java.lang.Object) str35);
        int int37 = byteOrderMark21.length();
        int int38 = byteOrderMark21.length();
        java.lang.String str39 = byteOrderMark21.getCharsetName();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 97, 35]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(byteOrderMark21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "UTF-16LE" + "'", str24, "UTF-16LE");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "UTF-16LE" + "'", str25, "UTF-16LE");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "UTF-16LE" + "'", str26, "UTF-16LE");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(byteOrderMark28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "UTF-16LE" + "'", str31, "UTF-16LE");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "ByteOrderMark[UTF-16LE: 0xFF,0xFE]" + "'", str35, "ByteOrderMark[UTF-16LE: 0xFF,0xFE]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2 + "'", int37 == 2);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2 + "'", int38 == 2);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "UTF-16LE" + "'", str39, "UTF-16LE");
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        int[] intArray8 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark9 = new org.apache.commons.io.ByteOrderMark("hi!", intArray8);
        org.apache.commons.io.ByteOrderMark byteOrderMark10 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray8);
        org.apache.commons.io.ByteOrderMark byteOrderMark11 = new org.apache.commons.io.ByteOrderMark("hi!", intArray8);
        org.apache.commons.io.ByteOrderMark byteOrderMark12 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray8);
        byte[] byteArray13 = byteOrderMark12.getBytes();
        byte[] byteArray14 = byteOrderMark12.getBytes();
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = org.apache.commons.io.ByteOrderMark.UTF_16BE;
        java.lang.Object obj16 = null;
        boolean boolean17 = byteOrderMark15.equals(obj16);
        int int18 = byteOrderMark15.length();
        boolean boolean20 = byteOrderMark15.equals((java.lang.Object) 0L);
        int int21 = byteOrderMark15.length();
        int int22 = byteOrderMark15.length();
        int[] intArray29 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark30 = new org.apache.commons.io.ByteOrderMark("hi!", intArray29);
        org.apache.commons.io.ByteOrderMark byteOrderMark31 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray29);
        org.apache.commons.io.ByteOrderMark byteOrderMark32 = new org.apache.commons.io.ByteOrderMark("hi!", intArray29);
        boolean boolean33 = byteOrderMark15.equals((java.lang.Object) intArray29);
        boolean boolean34 = byteOrderMark12.equals((java.lang.Object) intArray29);
        org.apache.commons.io.ByteOrderMark byteOrderMark35 = new org.apache.commons.io.ByteOrderMark("UTF-8", intArray29);
        java.lang.String str36 = byteOrderMark35.toString();
        java.lang.String str37 = byteOrderMark35.getCharsetName();
        byte[] byteArray38 = byteOrderMark35.getBytes();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(byteOrderMark15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "ByteOrderMark[UTF-8: 0xA,0x61,0x23]" + "'", str36, "ByteOrderMark[UTF-8: 0xA,0x61,0x23]");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "UTF-8" + "'", str37, "UTF-8");
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[10, 97, 35]");
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        int[] intArray4 = new int[] { 10, 254, 100 };
        org.apache.commons.io.ByteOrderMark byteOrderMark5 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16BE: 0xFE,0xFF]", intArray4);
        int int7 = byteOrderMark5.get((int) (short) 1);
        int[] intArray19 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark20 = new org.apache.commons.io.ByteOrderMark("hi!", intArray19);
        org.apache.commons.io.ByteOrderMark byteOrderMark21 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray19);
        org.apache.commons.io.ByteOrderMark byteOrderMark22 = new org.apache.commons.io.ByteOrderMark("hi!", intArray19);
        org.apache.commons.io.ByteOrderMark byteOrderMark23 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray19);
        org.apache.commons.io.ByteOrderMark byteOrderMark24 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[hi!: 0xA,0x61,0x23]", intArray19);
        org.apache.commons.io.ByteOrderMark byteOrderMark25 = new org.apache.commons.io.ByteOrderMark("hi!", intArray19);
        org.apache.commons.io.ByteOrderMark byteOrderMark26 = new org.apache.commons.io.ByteOrderMark("UTF-8", intArray19);
        org.apache.commons.io.ByteOrderMark byteOrderMark27 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[UTF-16LE: 0xFF,0xFE]: 0xA,0x61,0x23]", intArray19);
        java.lang.String str28 = byteOrderMark27.toString();
        byte[] byteArray29 = byteOrderMark27.getBytes();
        boolean boolean30 = byteOrderMark5.equals((java.lang.Object) byteOrderMark27);
        org.apache.commons.io.ByteOrderMark byteOrderMark31 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        int int33 = byteOrderMark31.get(0);
        org.apache.commons.io.ByteOrderMark byteOrderMark34 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        boolean boolean36 = byteOrderMark34.equals((java.lang.Object) (-1L));
        java.lang.String str37 = byteOrderMark34.toString();
        byte[] byteArray38 = byteOrderMark34.getBytes();
        boolean boolean39 = byteOrderMark31.equals((java.lang.Object) byteOrderMark34);
        byte[] byteArray40 = byteOrderMark31.getBytes();
        java.lang.String str41 = byteOrderMark31.getCharsetName();
        org.apache.commons.io.ByteOrderMark byteOrderMark42 = org.apache.commons.io.ByteOrderMark.UTF_16BE;
        java.lang.Object obj43 = null;
        boolean boolean44 = byteOrderMark42.equals(obj43);
        int int45 = byteOrderMark42.length();
        boolean boolean47 = byteOrderMark42.equals((java.lang.Object) 0L);
        int int48 = byteOrderMark42.length();
        int int49 = byteOrderMark42.length();
        int[] intArray56 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark57 = new org.apache.commons.io.ByteOrderMark("hi!", intArray56);
        org.apache.commons.io.ByteOrderMark byteOrderMark58 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray56);
        org.apache.commons.io.ByteOrderMark byteOrderMark59 = new org.apache.commons.io.ByteOrderMark("hi!", intArray56);
        boolean boolean60 = byteOrderMark42.equals((java.lang.Object) intArray56);
        byte[] byteArray61 = byteOrderMark42.getBytes();
        int int62 = byteOrderMark42.length();
        java.lang.String str63 = byteOrderMark42.getCharsetName();
        boolean boolean65 = byteOrderMark42.equals((java.lang.Object) (byte) 10);
        java.lang.String str66 = byteOrderMark42.getCharsetName();
        java.lang.String str67 = byteOrderMark42.toString();
        boolean boolean68 = byteOrderMark31.equals((java.lang.Object) byteOrderMark42);
        java.lang.String str69 = byteOrderMark42.getCharsetName();
        boolean boolean70 = byteOrderMark27.equals((java.lang.Object) byteOrderMark42);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 254, 100]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 254 + "'", int7 == 254);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 97, 35]");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "ByteOrderMark[ByteOrderMark[ByteOrderMark[UTF-16LE: 0xFF,0xFE]: 0xA,0x61,0x23]: 0xA,0x61,0x23]" + "'", str28, "ByteOrderMark[ByteOrderMark[ByteOrderMark[UTF-16LE: 0xFF,0xFE]: 0xA,0x61,0x23]: 0xA,0x61,0x23]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(byteOrderMark31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 255 + "'", int33 == 255);
        org.junit.Assert.assertNotNull(byteOrderMark34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "ByteOrderMark[UTF-16LE: 0xFF,0xFE]" + "'", str37, "ByteOrderMark[UTF-16LE: 0xFF,0xFE]");
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[-1, -2]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[-1, -2]");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "UTF-16LE" + "'", str41, "UTF-16LE");
        org.junit.Assert.assertNotNull(byteOrderMark42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2 + "'", int45 == 2);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2 + "'", int48 == 2);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 2 + "'", int49 == 2);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[-2, -1]");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 2 + "'", int62 == 2);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "UTF-16BE" + "'", str63, "UTF-16BE");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "UTF-16BE" + "'", str66, "UTF-16BE");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "ByteOrderMark[UTF-16BE: 0xFE,0xFF]" + "'", str67, "ByteOrderMark[UTF-16BE: 0xFE,0xFF]");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "UTF-16BE" + "'", str69, "UTF-16BE");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        int[] intArray9 = new int[] { (byte) 0, 10, (-1) };
        org.apache.commons.io.ByteOrderMark byteOrderMark10 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[hi!: 0xA,0x61,0x23]", intArray9);
        org.apache.commons.io.ByteOrderMark byteOrderMark11 = new org.apache.commons.io.ByteOrderMark("UTF-16BE", intArray9);
        org.apache.commons.io.ByteOrderMark byteOrderMark12 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[UTF-16BE: 0xFE,0xFF]: 0xA,0xFE,0x64]", intArray9);
        org.apache.commons.io.ByteOrderMark byteOrderMark13 = new org.apache.commons.io.ByteOrderMark("UTF-32LE", intArray9);
        org.apache.commons.io.ByteOrderMark byteOrderMark14 = new org.apache.commons.io.ByteOrderMark("UTF-32LE", intArray9);
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16BE: 0xFE,0xFF]", intArray9);
        byte[] byteArray16 = byteOrderMark15.getBytes();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 10, -1]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[0, 10, -1]");
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        int[] intArray9 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark10 = new org.apache.commons.io.ByteOrderMark("hi!", intArray9);
        org.apache.commons.io.ByteOrderMark byteOrderMark11 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray9);
        org.apache.commons.io.ByteOrderMark byteOrderMark12 = new org.apache.commons.io.ByteOrderMark("hi!", intArray9);
        org.apache.commons.io.ByteOrderMark byteOrderMark13 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray9);
        org.apache.commons.io.ByteOrderMark byteOrderMark14 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray9);
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray9);
        int int16 = byteOrderMark15.length();
        org.apache.commons.io.ByteOrderMark byteOrderMark17 = org.apache.commons.io.ByteOrderMark.UTF_16BE;
        java.lang.Object obj18 = null;
        boolean boolean19 = byteOrderMark17.equals(obj18);
        byte[] byteArray20 = byteOrderMark17.getBytes();
        java.lang.String str21 = byteOrderMark17.toString();
        int int23 = byteOrderMark17.get((int) (byte) 0);
        boolean boolean24 = byteOrderMark15.equals((java.lang.Object) byteOrderMark17);
        java.lang.String str25 = byteOrderMark15.toString();
        java.lang.String str26 = byteOrderMark15.toString();
        java.lang.Class<?> wildcardClass27 = byteOrderMark15.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(byteOrderMark17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[-2, -1]");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ByteOrderMark[UTF-16BE: 0xFE,0xFF]" + "'", str21, "ByteOrderMark[UTF-16BE: 0xFE,0xFF]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 254 + "'", int23 == 254);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "ByteOrderMark[ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]: 0xA,0x61,0x23]" + "'", str25, "ByteOrderMark[ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]: 0xA,0x61,0x23]");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "ByteOrderMark[ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]: 0xA,0x61,0x23]" + "'", str26, "ByteOrderMark[ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]: 0xA,0x61,0x23]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        org.apache.commons.io.ByteOrderMark byteOrderMark0 = org.apache.commons.io.ByteOrderMark.UTF_32BE;
        byte[] byteArray1 = byteOrderMark0.getBytes();
        int int2 = byteOrderMark0.length();
        int int3 = byteOrderMark0.length();
        int[] intArray15 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark16 = new org.apache.commons.io.ByteOrderMark("hi!", intArray15);
        org.apache.commons.io.ByteOrderMark byteOrderMark17 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray15);
        org.apache.commons.io.ByteOrderMark byteOrderMark18 = new org.apache.commons.io.ByteOrderMark("hi!", intArray15);
        org.apache.commons.io.ByteOrderMark byteOrderMark19 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray15);
        org.apache.commons.io.ByteOrderMark byteOrderMark20 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray15);
        org.apache.commons.io.ByteOrderMark byteOrderMark21 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray15);
        org.apache.commons.io.ByteOrderMark byteOrderMark22 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray15);
        org.apache.commons.io.ByteOrderMark byteOrderMark23 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16BE: 0xFE,0xFF]", intArray15);
        boolean boolean24 = byteOrderMark0.equals((java.lang.Object) byteOrderMark23);
        java.lang.String str25 = byteOrderMark0.getCharsetName();
        org.apache.commons.io.ByteOrderMark byteOrderMark26 = org.apache.commons.io.ByteOrderMark.UTF_16BE;
        java.lang.Object obj27 = null;
        boolean boolean28 = byteOrderMark26.equals(obj27);
        int int29 = byteOrderMark26.length();
        java.lang.String str30 = byteOrderMark26.getCharsetName();
        byte[] byteArray31 = byteOrderMark26.getBytes();
        boolean boolean32 = byteOrderMark0.equals((java.lang.Object) byteOrderMark26);
        int int33 = byteOrderMark0.length();
        org.junit.Assert.assertNotNull(byteOrderMark0);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[0, 0, -2, -1]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "UTF-32BE" + "'", str25, "UTF-32BE");
        org.junit.Assert.assertNotNull(byteOrderMark26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "UTF-16BE" + "'", str30, "UTF-16BE");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[-2, -1]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 4 + "'", int33 == 4);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        org.apache.commons.io.ByteOrderMark byteOrderMark0 = org.apache.commons.io.ByteOrderMark.UTF_32BE;
        java.lang.String str1 = byteOrderMark0.toString();
        java.lang.String str2 = byteOrderMark0.toString();
        int int4 = byteOrderMark0.get(2);
        byte[] byteArray5 = byteOrderMark0.getBytes();
        org.apache.commons.io.ByteOrderMark byteOrderMark6 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        int int8 = byteOrderMark6.get(0);
        java.lang.String str9 = byteOrderMark6.getCharsetName();
        org.apache.commons.io.ByteOrderMark byteOrderMark10 = org.apache.commons.io.ByteOrderMark.UTF_16BE;
        java.lang.Object obj11 = null;
        boolean boolean12 = byteOrderMark10.equals(obj11);
        int int13 = byteOrderMark10.length();
        boolean boolean15 = byteOrderMark10.equals((java.lang.Object) 0L);
        int int16 = byteOrderMark10.length();
        boolean boolean17 = byteOrderMark6.equals((java.lang.Object) int16);
        boolean boolean18 = byteOrderMark0.equals((java.lang.Object) byteOrderMark6);
        byte[] byteArray19 = byteOrderMark0.getBytes();
        int[] intArray31 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark32 = new org.apache.commons.io.ByteOrderMark("hi!", intArray31);
        org.apache.commons.io.ByteOrderMark byteOrderMark33 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray31);
        org.apache.commons.io.ByteOrderMark byteOrderMark34 = new org.apache.commons.io.ByteOrderMark("hi!", intArray31);
        org.apache.commons.io.ByteOrderMark byteOrderMark35 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray31);
        org.apache.commons.io.ByteOrderMark byteOrderMark36 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[hi!: 0xA,0x61,0x23]", intArray31);
        org.apache.commons.io.ByteOrderMark byteOrderMark37 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xA,0x61,0x23]", intArray31);
        org.apache.commons.io.ByteOrderMark byteOrderMark38 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-8: 0xEF,0xBB,0xBF]", intArray31);
        org.apache.commons.io.ByteOrderMark byteOrderMark39 = new org.apache.commons.io.ByteOrderMark("hi!", intArray31);
        java.lang.String str40 = byteOrderMark39.getCharsetName();
        boolean boolean41 = byteOrderMark0.equals((java.lang.Object) str40);
        org.apache.commons.io.ByteOrderMark byteOrderMark42 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        boolean boolean44 = byteOrderMark42.equals((java.lang.Object) 1L);
        java.lang.String str45 = byteOrderMark42.getCharsetName();
        int int46 = byteOrderMark42.length();
        boolean boolean48 = byteOrderMark42.equals((java.lang.Object) (byte) -1);
        byte[] byteArray49 = byteOrderMark42.getBytes();
        java.lang.String str50 = byteOrderMark42.getCharsetName();
        byte[] byteArray51 = byteOrderMark42.getBytes();
        int int53 = byteOrderMark42.get((int) (short) 0);
        org.apache.commons.io.ByteOrderMark byteOrderMark54 = org.apache.commons.io.ByteOrderMark.UTF_32BE;
        byte[] byteArray55 = byteOrderMark54.getBytes();
        java.lang.String str56 = byteOrderMark54.getCharsetName();
        org.apache.commons.io.ByteOrderMark byteOrderMark57 = org.apache.commons.io.ByteOrderMark.UTF_8;
        int int59 = byteOrderMark57.get((int) (byte) 0);
        byte[] byteArray60 = byteOrderMark57.getBytes();
        byte[] byteArray61 = byteOrderMark57.getBytes();
        boolean boolean62 = byteOrderMark54.equals((java.lang.Object) byteOrderMark57);
        boolean boolean63 = byteOrderMark42.equals((java.lang.Object) byteOrderMark54);
        java.lang.String str64 = byteOrderMark54.getCharsetName();
        boolean boolean65 = byteOrderMark0.equals((java.lang.Object) str64);
        int int66 = byteOrderMark0.length();
        // The following exception was thrown during execution in test generation
        try {
            int int68 = byteOrderMark0.get((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrderMark0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]" + "'", str1, "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]" + "'", str2, "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 254 + "'", int4 == 254);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, -2, -1]");
        org.junit.Assert.assertNotNull(byteOrderMark6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 255 + "'", int8 == 255);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTF-16LE" + "'", str9, "UTF-16LE");
        org.junit.Assert.assertNotNull(byteOrderMark10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[0, 0, -2, -1]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[10, 97, 35]");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(byteOrderMark42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "UTF-16LE" + "'", str45, "UTF-16LE");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2 + "'", int46 == 2);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[-1, -2]");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "UTF-16LE" + "'", str50, "UTF-16LE");
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[-1, -2]");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 255 + "'", int53 == 255);
        org.junit.Assert.assertNotNull(byteOrderMark54);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[0, 0, -2, -1]");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "UTF-32BE" + "'", str56, "UTF-32BE");
        org.junit.Assert.assertNotNull(byteOrderMark57);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 239 + "'", int59 == 239);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray60), "[-17, -69, -65]");
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[-17, -69, -65]");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "UTF-32BE" + "'", str64, "UTF-32BE");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 4 + "'", int66 == 4);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        org.apache.commons.io.ByteOrderMark byteOrderMark0 = org.apache.commons.io.ByteOrderMark.UTF_16BE;
        java.lang.Object obj1 = null;
        boolean boolean2 = byteOrderMark0.equals(obj1);
        int int3 = byteOrderMark0.length();
        byte[] byteArray4 = byteOrderMark0.getBytes();
        java.lang.String str5 = byteOrderMark0.toString();
        org.apache.commons.io.ByteOrderMark byteOrderMark6 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        byte[] byteArray7 = byteOrderMark6.getBytes();
        int int8 = byteOrderMark6.length();
        java.lang.String str9 = byteOrderMark6.getCharsetName();
        byte[] byteArray10 = byteOrderMark6.getBytes();
        byte[] byteArray11 = byteOrderMark6.getBytes();
        boolean boolean12 = byteOrderMark0.equals((java.lang.Object) byteOrderMark6);
        int int14 = byteOrderMark0.get((int) (byte) 1);
        org.junit.Assert.assertNotNull(byteOrderMark0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-2, -1]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ByteOrderMark[UTF-16BE: 0xFE,0xFF]" + "'", str5, "ByteOrderMark[UTF-16BE: 0xFE,0xFF]");
        org.junit.Assert.assertNotNull(byteOrderMark6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -2]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTF-16LE" + "'", str9, "UTF-16LE");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-1, -2]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-1, -2]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 255 + "'", int14 == 255);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        org.apache.commons.io.ByteOrderMark byteOrderMark0 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        int int2 = byteOrderMark0.get(0);
        java.lang.String str3 = byteOrderMark0.getCharsetName();
        org.apache.commons.io.ByteOrderMark byteOrderMark4 = org.apache.commons.io.ByteOrderMark.UTF_16BE;
        java.lang.Object obj5 = null;
        boolean boolean6 = byteOrderMark4.equals(obj5);
        int int7 = byteOrderMark4.length();
        boolean boolean9 = byteOrderMark4.equals((java.lang.Object) 0L);
        int int10 = byteOrderMark4.length();
        boolean boolean11 = byteOrderMark0.equals((java.lang.Object) int10);
        int int13 = byteOrderMark0.get(0);
        java.lang.String str14 = byteOrderMark0.getCharsetName();
        java.lang.String str15 = byteOrderMark0.toString();
        java.lang.Class<?> wildcardClass16 = byteOrderMark0.getClass();
        org.junit.Assert.assertNotNull(byteOrderMark0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 255 + "'", int2 == 255);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF-16LE" + "'", str3, "UTF-16LE");
        org.junit.Assert.assertNotNull(byteOrderMark4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 255 + "'", int13 == 255);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTF-16LE" + "'", str14, "UTF-16LE");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ByteOrderMark[UTF-16LE: 0xFF,0xFE]" + "'", str15, "ByteOrderMark[UTF-16LE: 0xFF,0xFE]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        org.apache.commons.io.ByteOrderMark byteOrderMark0 = org.apache.commons.io.ByteOrderMark.UTF_16BE;
        java.lang.Object obj1 = null;
        boolean boolean2 = byteOrderMark0.equals(obj1);
        int int3 = byteOrderMark0.length();
        boolean boolean5 = byteOrderMark0.equals((java.lang.Object) 0L);
        byte[] byteArray6 = byteOrderMark0.getBytes();
        int[] intArray15 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark16 = new org.apache.commons.io.ByteOrderMark("hi!", intArray15);
        org.apache.commons.io.ByteOrderMark byteOrderMark17 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray15);
        org.apache.commons.io.ByteOrderMark byteOrderMark18 = new org.apache.commons.io.ByteOrderMark("hi!", intArray15);
        org.apache.commons.io.ByteOrderMark byteOrderMark19 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray15);
        org.apache.commons.io.ByteOrderMark byteOrderMark20 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray15);
        byte[] byteArray21 = byteOrderMark20.getBytes();
        int int22 = byteOrderMark20.length();
        java.lang.String str23 = byteOrderMark20.toString();
        int[] intArray29 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark30 = new org.apache.commons.io.ByteOrderMark("hi!", intArray29);
        org.apache.commons.io.ByteOrderMark byteOrderMark31 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray29);
        byte[] byteArray32 = byteOrderMark31.getBytes();
        boolean boolean33 = byteOrderMark20.equals((java.lang.Object) byteOrderMark31);
        boolean boolean34 = byteOrderMark0.equals((java.lang.Object) boolean33);
        byte[] byteArray35 = byteOrderMark0.getBytes();
        int int36 = byteOrderMark0.length();
        org.junit.Assert.assertNotNull(byteOrderMark0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-2, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "ByteOrderMark[UTF-32BE: 0xA,0x61,0x23]" + "'", str23, "ByteOrderMark[UTF-32BE: 0xA,0x61,0x23]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[-2, -1]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        int[] intArray12 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark13 = new org.apache.commons.io.ByteOrderMark("hi!", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark14 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("hi!", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark16 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark17 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark18 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark19 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark20 = new org.apache.commons.io.ByteOrderMark("UTF-16BE", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark21 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[UTF-8: 0xEF,0xBB,0xBF]: 0xA,0x61,0x23]", intArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = byteOrderMark21.get((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[10, 97, 35]");
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        org.apache.commons.io.ByteOrderMark byteOrderMark0 = org.apache.commons.io.ByteOrderMark.UTF_16BE;
        java.lang.Object obj1 = null;
        boolean boolean2 = byteOrderMark0.equals(obj1);
        int int3 = byteOrderMark0.length();
        boolean boolean5 = byteOrderMark0.equals((java.lang.Object) 0L);
        int int6 = byteOrderMark0.length();
        int int7 = byteOrderMark0.length();
        int[] intArray14 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("hi!", intArray14);
        org.apache.commons.io.ByteOrderMark byteOrderMark16 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray14);
        org.apache.commons.io.ByteOrderMark byteOrderMark17 = new org.apache.commons.io.ByteOrderMark("hi!", intArray14);
        boolean boolean18 = byteOrderMark0.equals((java.lang.Object) intArray14);
        int[] intArray26 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark27 = new org.apache.commons.io.ByteOrderMark("hi!", intArray26);
        org.apache.commons.io.ByteOrderMark byteOrderMark28 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray26);
        org.apache.commons.io.ByteOrderMark byteOrderMark29 = new org.apache.commons.io.ByteOrderMark("hi!", intArray26);
        org.apache.commons.io.ByteOrderMark byteOrderMark30 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray26);
        int int31 = byteOrderMark30.length();
        boolean boolean32 = byteOrderMark0.equals((java.lang.Object) byteOrderMark30);
        org.apache.commons.io.ByteOrderMark byteOrderMark33 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        int int35 = byteOrderMark33.get(0);
        boolean boolean37 = byteOrderMark33.equals((java.lang.Object) (short) 0);
        int[] intArray44 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark45 = new org.apache.commons.io.ByteOrderMark("hi!", intArray44);
        org.apache.commons.io.ByteOrderMark byteOrderMark46 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray44);
        org.apache.commons.io.ByteOrderMark byteOrderMark47 = new org.apache.commons.io.ByteOrderMark("hi!", intArray44);
        boolean boolean48 = byteOrderMark33.equals((java.lang.Object) byteOrderMark47);
        boolean boolean49 = byteOrderMark0.equals((java.lang.Object) byteOrderMark33);
        byte[] byteArray50 = byteOrderMark33.getBytes();
        org.apache.commons.io.ByteOrderMark byteOrderMark51 = org.apache.commons.io.ByteOrderMark.UTF_32BE;
        byte[] byteArray52 = byteOrderMark51.getBytes();
        java.lang.String str53 = byteOrderMark51.getCharsetName();
        org.apache.commons.io.ByteOrderMark byteOrderMark54 = org.apache.commons.io.ByteOrderMark.UTF_8;
        int int56 = byteOrderMark54.get((int) (byte) 0);
        byte[] byteArray57 = byteOrderMark54.getBytes();
        byte[] byteArray58 = byteOrderMark54.getBytes();
        boolean boolean59 = byteOrderMark51.equals((java.lang.Object) byteOrderMark54);
        org.apache.commons.io.ByteOrderMark byteOrderMark60 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        int int62 = byteOrderMark60.get(0);
        java.lang.String str63 = byteOrderMark60.getCharsetName();
        org.apache.commons.io.ByteOrderMark byteOrderMark64 = org.apache.commons.io.ByteOrderMark.UTF_16BE;
        java.lang.Object obj65 = null;
        boolean boolean66 = byteOrderMark64.equals(obj65);
        int int67 = byteOrderMark64.length();
        boolean boolean69 = byteOrderMark64.equals((java.lang.Object) 0L);
        int int70 = byteOrderMark64.length();
        boolean boolean71 = byteOrderMark60.equals((java.lang.Object) int70);
        int int73 = byteOrderMark60.get(0);
        boolean boolean74 = byteOrderMark51.equals((java.lang.Object) 0);
        org.apache.commons.io.ByteOrderMark byteOrderMark75 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        boolean boolean77 = byteOrderMark75.equals((java.lang.Object) (-1L));
        java.lang.String str78 = byteOrderMark75.toString();
        byte[] byteArray79 = byteOrderMark75.getBytes();
        java.lang.Class<?> wildcardClass80 = byteArray79.getClass();
        boolean boolean81 = byteOrderMark51.equals((java.lang.Object) wildcardClass80);
        boolean boolean82 = byteOrderMark33.equals((java.lang.Object) wildcardClass80);
        byte[] byteArray83 = byteOrderMark33.getBytes();
        org.junit.Assert.assertNotNull(byteOrderMark0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(byteOrderMark33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 255 + "'", int35 == 255);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[-1, -2]");
        org.junit.Assert.assertNotNull(byteOrderMark51);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[0, 0, -2, -1]");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "UTF-32BE" + "'", str53, "UTF-32BE");
        org.junit.Assert.assertNotNull(byteOrderMark54);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 239 + "'", int56 == 239);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[-17, -69, -65]");
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray58), "[-17, -69, -65]");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(byteOrderMark60);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 255 + "'", int62 == 255);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "UTF-16LE" + "'", str63, "UTF-16LE");
        org.junit.Assert.assertNotNull(byteOrderMark64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 2 + "'", int67 == 2);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 2 + "'", int70 == 2);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 255 + "'", int73 == 255);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(byteOrderMark75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "ByteOrderMark[UTF-16LE: 0xFF,0xFE]" + "'", str78, "ByteOrderMark[UTF-16LE: 0xFF,0xFE]");
        org.junit.Assert.assertNotNull(byteArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray79), "[-1, -2]");
        org.junit.Assert.assertNotNull(wildcardClass80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(byteArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray83), "[-1, -2]");
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        int[] intArray13 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark14 = new org.apache.commons.io.ByteOrderMark("hi!", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark16 = new org.apache.commons.io.ByteOrderMark("hi!", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark17 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark18 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[hi!: 0xA,0x61,0x23]", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark19 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xA,0x61,0x23]", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark20 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-8: 0xEF,0xBB,0xBF]", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark21 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[UTF-16BE: 0xFE,0xFF]: 0xA,0x61,0x23]", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark22 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark23 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark24 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        java.lang.Class<?> wildcardClass25 = byteOrderMark24.getClass();
        boolean boolean26 = byteOrderMark23.equals((java.lang.Object) byteOrderMark24);
        java.lang.String str27 = byteOrderMark23.toString();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(byteOrderMark24);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "ByteOrderMark[ByteOrderMark[UTF-16LE: 0xFF,0xFE]: 0xA,0x61,0x23]" + "'", str27, "ByteOrderMark[ByteOrderMark[UTF-16LE: 0xFF,0xFE]: 0xA,0x61,0x23]");
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        int[] intArray13 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark14 = new org.apache.commons.io.ByteOrderMark("hi!", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark16 = new org.apache.commons.io.ByteOrderMark("hi!", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark17 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark18 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[hi!: 0xA,0x61,0x23]", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark19 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xA,0x61,0x23]", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark20 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-8: 0xEF,0xBB,0xBF]", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark21 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[UTF-16BE: 0xFE,0xFF]: 0xA,0x61,0x23]", intArray13);
        int[] intArray33 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark34 = new org.apache.commons.io.ByteOrderMark("hi!", intArray33);
        org.apache.commons.io.ByteOrderMark byteOrderMark35 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray33);
        org.apache.commons.io.ByteOrderMark byteOrderMark36 = new org.apache.commons.io.ByteOrderMark("hi!", intArray33);
        org.apache.commons.io.ByteOrderMark byteOrderMark37 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray33);
        org.apache.commons.io.ByteOrderMark byteOrderMark38 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray33);
        org.apache.commons.io.ByteOrderMark byteOrderMark39 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray33);
        org.apache.commons.io.ByteOrderMark byteOrderMark40 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray33);
        org.apache.commons.io.ByteOrderMark byteOrderMark41 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16BE: 0xFE,0xFF]", intArray33);
        boolean boolean42 = byteOrderMark21.equals((java.lang.Object) intArray33);
        org.apache.commons.io.ByteOrderMark byteOrderMark43 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]: 0xA,0x61,0x23]: 0xA,0x61,0x23]", intArray33);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.ByteOrderMark byteOrderMark44 = new org.apache.commons.io.ByteOrderMark("", intArray33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No charsetName specified");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        org.apache.commons.io.ByteOrderMark byteOrderMark0 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        boolean boolean2 = byteOrderMark0.equals((java.lang.Object) 1L);
        java.lang.String str3 = byteOrderMark0.getCharsetName();
        org.apache.commons.io.ByteOrderMark byteOrderMark4 = org.apache.commons.io.ByteOrderMark.UTF_16BE;
        boolean boolean5 = byteOrderMark0.equals((java.lang.Object) byteOrderMark4);
        java.lang.String str6 = byteOrderMark0.toString();
        org.apache.commons.io.ByteOrderMark byteOrderMark7 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        boolean boolean9 = byteOrderMark7.equals((java.lang.Object) 1L);
        java.lang.String str10 = byteOrderMark7.getCharsetName();
        int int11 = byteOrderMark7.length();
        boolean boolean13 = byteOrderMark7.equals((java.lang.Object) (byte) -1);
        byte[] byteArray14 = byteOrderMark7.getBytes();
        java.lang.String str15 = byteOrderMark7.getCharsetName();
        java.lang.String str16 = byteOrderMark7.getCharsetName();
        java.lang.String str17 = byteOrderMark7.toString();
        java.lang.String str18 = byteOrderMark7.getCharsetName();
        byte[] byteArray19 = byteOrderMark7.getBytes();
        boolean boolean20 = byteOrderMark0.equals((java.lang.Object) byteArray19);
        org.junit.Assert.assertNotNull(byteOrderMark0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF-16LE" + "'", str3, "UTF-16LE");
        org.junit.Assert.assertNotNull(byteOrderMark4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ByteOrderMark[UTF-16LE: 0xFF,0xFE]" + "'", str6, "ByteOrderMark[UTF-16LE: 0xFF,0xFE]");
        org.junit.Assert.assertNotNull(byteOrderMark7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTF-16LE" + "'", str10, "UTF-16LE");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[-1, -2]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTF-16LE" + "'", str15, "UTF-16LE");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTF-16LE" + "'", str16, "UTF-16LE");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ByteOrderMark[UTF-16LE: 0xFF,0xFE]" + "'", str17, "ByteOrderMark[UTF-16LE: 0xFF,0xFE]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "UTF-16LE" + "'", str18, "UTF-16LE");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[-1, -2]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        int[] intArray12 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark13 = new org.apache.commons.io.ByteOrderMark("hi!", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark14 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("hi!", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark16 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark17 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[hi!: 0xA,0x61,0x23]", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark18 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xA,0x61,0x23]", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark19 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-8: 0xEF,0xBB,0xBF]", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark20 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[UTF-16BE: 0xFE,0xFF]: 0xA,0x61,0x23]", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark21 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray12);
        int int22 = byteOrderMark21.length();
        int int23 = byteOrderMark21.length();
        byte[] byteArray24 = byteOrderMark21.getBytes();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[10, 97, 35]");
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        int[] intArray11 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark12 = new org.apache.commons.io.ByteOrderMark("hi!", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark13 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark14 = new org.apache.commons.io.ByteOrderMark("hi!", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark16 = new org.apache.commons.io.ByteOrderMark("hi!", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark17 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[hi!: 0xA,0x61,0x23]", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark18 = new org.apache.commons.io.ByteOrderMark("UTF-8", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark19 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[UTF-8: 0xEF,0xBB,0xBF]: 0xA,0x61,0x23]", intArray11);
        int[] intArray29 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark30 = new org.apache.commons.io.ByteOrderMark("hi!", intArray29);
        org.apache.commons.io.ByteOrderMark byteOrderMark31 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray29);
        org.apache.commons.io.ByteOrderMark byteOrderMark32 = new org.apache.commons.io.ByteOrderMark("hi!", intArray29);
        org.apache.commons.io.ByteOrderMark byteOrderMark33 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray29);
        org.apache.commons.io.ByteOrderMark byteOrderMark34 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray29);
        org.apache.commons.io.ByteOrderMark byteOrderMark35 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray29);
        int int36 = byteOrderMark35.length();
        org.apache.commons.io.ByteOrderMark byteOrderMark37 = org.apache.commons.io.ByteOrderMark.UTF_16BE;
        java.lang.Object obj38 = null;
        boolean boolean39 = byteOrderMark37.equals(obj38);
        byte[] byteArray40 = byteOrderMark37.getBytes();
        java.lang.String str41 = byteOrderMark37.toString();
        int int43 = byteOrderMark37.get((int) (byte) 0);
        boolean boolean44 = byteOrderMark35.equals((java.lang.Object) byteOrderMark37);
        java.lang.String str45 = byteOrderMark35.toString();
        java.lang.String str46 = byteOrderMark35.toString();
        int int47 = byteOrderMark35.length();
        byte[] byteArray48 = byteOrderMark35.getBytes();
        boolean boolean49 = byteOrderMark19.equals((java.lang.Object) byteOrderMark35);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
        org.junit.Assert.assertNotNull(byteOrderMark37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[-2, -1]");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "ByteOrderMark[UTF-16BE: 0xFE,0xFF]" + "'", str41, "ByteOrderMark[UTF-16BE: 0xFE,0xFF]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 254 + "'", int43 == 254);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "ByteOrderMark[ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]: 0xA,0x61,0x23]" + "'", str45, "ByteOrderMark[ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]: 0xA,0x61,0x23]");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "ByteOrderMark[ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]: 0xA,0x61,0x23]" + "'", str46, "ByteOrderMark[ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]: 0xA,0x61,0x23]");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 3 + "'", int47 == 3);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        int[] intArray8 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark9 = new org.apache.commons.io.ByteOrderMark("hi!", intArray8);
        org.apache.commons.io.ByteOrderMark byteOrderMark10 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray8);
        org.apache.commons.io.ByteOrderMark byteOrderMark11 = new org.apache.commons.io.ByteOrderMark("hi!", intArray8);
        org.apache.commons.io.ByteOrderMark byteOrderMark12 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray8);
        byte[] byteArray13 = byteOrderMark12.getBytes();
        byte[] byteArray14 = byteOrderMark12.getBytes();
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = org.apache.commons.io.ByteOrderMark.UTF_16BE;
        java.lang.Object obj16 = null;
        boolean boolean17 = byteOrderMark15.equals(obj16);
        int int18 = byteOrderMark15.length();
        boolean boolean20 = byteOrderMark15.equals((java.lang.Object) 0L);
        int int21 = byteOrderMark15.length();
        int int22 = byteOrderMark15.length();
        int[] intArray29 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark30 = new org.apache.commons.io.ByteOrderMark("hi!", intArray29);
        org.apache.commons.io.ByteOrderMark byteOrderMark31 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray29);
        org.apache.commons.io.ByteOrderMark byteOrderMark32 = new org.apache.commons.io.ByteOrderMark("hi!", intArray29);
        boolean boolean33 = byteOrderMark15.equals((java.lang.Object) intArray29);
        boolean boolean34 = byteOrderMark12.equals((java.lang.Object) intArray29);
        org.apache.commons.io.ByteOrderMark byteOrderMark35 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray29);
        int int36 = byteOrderMark35.length();
        org.apache.commons.io.ByteOrderMark byteOrderMark37 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        boolean boolean39 = byteOrderMark37.equals((java.lang.Object) (-1L));
        java.lang.String str40 = byteOrderMark37.toString();
        byte[] byteArray41 = byteOrderMark37.getBytes();
        java.lang.String str42 = byteOrderMark37.getCharsetName();
        int int43 = byteOrderMark37.length();
        byte[] byteArray44 = byteOrderMark37.getBytes();
        boolean boolean45 = byteOrderMark35.equals((java.lang.Object) byteArray44);
        org.apache.commons.io.ByteOrderMark byteOrderMark46 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        boolean boolean48 = byteOrderMark46.equals((java.lang.Object) 1L);
        java.lang.String str49 = byteOrderMark46.getCharsetName();
        int int50 = byteOrderMark46.length();
        boolean boolean52 = byteOrderMark46.equals((java.lang.Object) (byte) -1);
        byte[] byteArray53 = byteOrderMark46.getBytes();
        java.lang.String str54 = byteOrderMark46.getCharsetName();
        java.lang.String str55 = byteOrderMark46.getCharsetName();
        int[] intArray63 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark64 = new org.apache.commons.io.ByteOrderMark("hi!", intArray63);
        org.apache.commons.io.ByteOrderMark byteOrderMark65 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray63);
        org.apache.commons.io.ByteOrderMark byteOrderMark66 = new org.apache.commons.io.ByteOrderMark("hi!", intArray63);
        org.apache.commons.io.ByteOrderMark byteOrderMark67 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray63);
        boolean boolean68 = byteOrderMark46.equals((java.lang.Object) byteOrderMark67);
        java.lang.String str69 = byteOrderMark67.getCharsetName();
        byte[] byteArray70 = byteOrderMark67.getBytes();
        java.lang.String str71 = byteOrderMark67.getCharsetName();
        int int72 = byteOrderMark67.length();
        boolean boolean73 = byteOrderMark35.equals((java.lang.Object) int72);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(byteOrderMark15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
        org.junit.Assert.assertNotNull(byteOrderMark37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "ByteOrderMark[UTF-16LE: 0xFF,0xFE]" + "'", str40, "ByteOrderMark[UTF-16LE: 0xFF,0xFE]");
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[-1, -2]");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "UTF-16LE" + "'", str42, "UTF-16LE");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[-1, -2]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(byteOrderMark46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "UTF-16LE" + "'", str49, "UTF-16LE");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 2 + "'", int50 == 2);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[-1, -2]");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "UTF-16LE" + "'", str54, "UTF-16LE");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "UTF-16LE" + "'", str55, "UTF-16LE");
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]" + "'", str69, "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]");
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray70), "[10, 97, 35]");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]" + "'", str71, "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 3 + "'", int72 == 3);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        int[] intArray12 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark13 = new org.apache.commons.io.ByteOrderMark("hi!", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark14 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("hi!", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark16 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark17 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[hi!: 0xA,0x61,0x23]", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark18 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xA,0x61,0x23]", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark19 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-8: 0xEF,0xBB,0xBF]", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark20 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[UTF-16BE: 0xFE,0xFF]: 0xA,0x61,0x23]", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark21 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray12);
        byte[] byteArray22 = byteOrderMark21.getBytes();
        org.apache.commons.io.ByteOrderMark byteOrderMark23 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        boolean boolean25 = byteOrderMark23.equals((java.lang.Object) (-1L));
        java.lang.String str26 = byteOrderMark23.toString();
        boolean boolean27 = byteOrderMark21.equals((java.lang.Object) byteOrderMark23);
        int[] intArray39 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark40 = new org.apache.commons.io.ByteOrderMark("hi!", intArray39);
        org.apache.commons.io.ByteOrderMark byteOrderMark41 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray39);
        org.apache.commons.io.ByteOrderMark byteOrderMark42 = new org.apache.commons.io.ByteOrderMark("hi!", intArray39);
        org.apache.commons.io.ByteOrderMark byteOrderMark43 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray39);
        org.apache.commons.io.ByteOrderMark byteOrderMark44 = new org.apache.commons.io.ByteOrderMark("UTF-16BE", intArray39);
        org.apache.commons.io.ByteOrderMark byteOrderMark45 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray39);
        org.apache.commons.io.ByteOrderMark byteOrderMark46 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16BE: 0xFE,0xFF]", intArray39);
        org.apache.commons.io.ByteOrderMark byteOrderMark47 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[UTF-16LE: 0xFF,0xFE]: 0xA,0x61,0x23]", intArray39);
        boolean boolean48 = byteOrderMark23.equals((java.lang.Object) "ByteOrderMark[ByteOrderMark[UTF-16LE: 0xFF,0xFE]: 0xA,0x61,0x23]");
        int int49 = byteOrderMark23.length();
        java.lang.String str50 = byteOrderMark23.getCharsetName();
        // The following exception was thrown during execution in test generation
        try {
            int int52 = byteOrderMark23.get((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(byteOrderMark23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "ByteOrderMark[UTF-16LE: 0xFF,0xFE]" + "'", str26, "ByteOrderMark[UTF-16LE: 0xFF,0xFE]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 2 + "'", int49 == 2);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "UTF-16LE" + "'", str50, "UTF-16LE");
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        int[] intArray13 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark14 = new org.apache.commons.io.ByteOrderMark("hi!", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark16 = new org.apache.commons.io.ByteOrderMark("hi!", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark17 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark18 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[hi!: 0xA,0x61,0x23]", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark19 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xA,0x61,0x23]", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark20 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-8: 0xEF,0xBB,0xBF]", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark21 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[UTF-16BE: 0xFE,0xFF]: 0xA,0x61,0x23]", intArray13);
        int[] intArray33 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark34 = new org.apache.commons.io.ByteOrderMark("hi!", intArray33);
        org.apache.commons.io.ByteOrderMark byteOrderMark35 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray33);
        org.apache.commons.io.ByteOrderMark byteOrderMark36 = new org.apache.commons.io.ByteOrderMark("hi!", intArray33);
        org.apache.commons.io.ByteOrderMark byteOrderMark37 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray33);
        org.apache.commons.io.ByteOrderMark byteOrderMark38 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray33);
        org.apache.commons.io.ByteOrderMark byteOrderMark39 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray33);
        org.apache.commons.io.ByteOrderMark byteOrderMark40 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray33);
        org.apache.commons.io.ByteOrderMark byteOrderMark41 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16BE: 0xFE,0xFF]", intArray33);
        boolean boolean42 = byteOrderMark21.equals((java.lang.Object) intArray33);
        org.apache.commons.io.ByteOrderMark byteOrderMark43 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray33);
        org.apache.commons.io.ByteOrderMark byteOrderMark44 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray33);
        // The following exception was thrown during execution in test generation
        try {
            int int46 = byteOrderMark44.get((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        int[] intArray11 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark12 = new org.apache.commons.io.ByteOrderMark("hi!", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark13 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark14 = new org.apache.commons.io.ByteOrderMark("hi!", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark16 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[hi!: 0xA,0x61,0x23]", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark17 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xA,0x61,0x23]", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark18 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-8: 0xEF,0xBB,0xBF]", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark19 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[UTF-16BE: 0xFE,0xFF]: 0xA,0x61,0x23]", intArray11);
        java.lang.String str20 = byteOrderMark19.getCharsetName();
        java.lang.Class<?> wildcardClass21 = byteOrderMark19.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, 35]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ByteOrderMark[ByteOrderMark[UTF-16BE: 0xFE,0xFF]: 0xA,0x61,0x23]" + "'", str20, "ByteOrderMark[ByteOrderMark[UTF-16BE: 0xFE,0xFF]: 0xA,0x61,0x23]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        org.apache.commons.io.ByteOrderMark byteOrderMark0 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        byte[] byteArray1 = byteOrderMark0.getBytes();
        int int2 = byteOrderMark0.length();
        java.lang.String str3 = byteOrderMark0.getCharsetName();
        java.lang.String str4 = byteOrderMark0.getCharsetName();
        int int6 = byteOrderMark0.get(1);
        int int7 = byteOrderMark0.length();
        org.junit.Assert.assertNotNull(byteOrderMark0);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1, -2]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF-16LE" + "'", str3, "UTF-16LE");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF-16LE" + "'", str4, "UTF-16LE");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 254 + "'", int6 == 254);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        int[] intArray9 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark10 = new org.apache.commons.io.ByteOrderMark("hi!", intArray9);
        org.apache.commons.io.ByteOrderMark byteOrderMark11 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray9);
        org.apache.commons.io.ByteOrderMark byteOrderMark12 = new org.apache.commons.io.ByteOrderMark("hi!", intArray9);
        org.apache.commons.io.ByteOrderMark byteOrderMark13 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray9);
        org.apache.commons.io.ByteOrderMark byteOrderMark14 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0xA,0x61,0x23]", intArray9);
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray9);
        int int16 = byteOrderMark15.length();
        java.lang.String str17 = byteOrderMark15.toString();
        byte[] byteArray18 = byteOrderMark15.getBytes();
        java.lang.String str19 = byteOrderMark15.toString();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ByteOrderMark[UTF-16LE: 0xA,0x61,0x23]" + "'", str17, "ByteOrderMark[UTF-16LE: 0xA,0x61,0x23]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[10, 97, 35]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ByteOrderMark[UTF-16LE: 0xA,0x61,0x23]" + "'", str19, "ByteOrderMark[UTF-16LE: 0xA,0x61,0x23]");
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        int[] intArray3 = new int[] { 255 };
        org.apache.commons.io.ByteOrderMark byteOrderMark4 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0xA,0x61,0x23]", intArray3);
        org.apache.commons.io.ByteOrderMark byteOrderMark5 = new org.apache.commons.io.ByteOrderMark("UTF-8", intArray3);
        byte[] byteArray6 = byteOrderMark5.getBytes();
        java.lang.String str7 = byteOrderMark5.toString();
        int int9 = byteOrderMark5.get((int) (byte) 0);
        java.lang.String str10 = byteOrderMark5.toString();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[255]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ByteOrderMark[UTF-8: 0xFF]" + "'", str7, "ByteOrderMark[UTF-8: 0xFF]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 255 + "'", int9 == 255);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ByteOrderMark[UTF-8: 0xFF]" + "'", str10, "ByteOrderMark[UTF-8: 0xFF]");
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        int[] intArray6 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark7 = new org.apache.commons.io.ByteOrderMark("hi!", intArray6);
        org.apache.commons.io.ByteOrderMark byteOrderMark8 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray6);
        org.apache.commons.io.ByteOrderMark byteOrderMark9 = new org.apache.commons.io.ByteOrderMark("hi!", intArray6);
        int int10 = byteOrderMark9.length();
        int[] intArray15 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark16 = new org.apache.commons.io.ByteOrderMark("hi!", intArray15);
        java.lang.String str17 = byteOrderMark16.getCharsetName();
        java.lang.Object obj18 = null;
        boolean boolean19 = byteOrderMark16.equals(obj18);
        boolean boolean20 = byteOrderMark9.equals(obj18);
        org.apache.commons.io.ByteOrderMark byteOrderMark21 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        boolean boolean23 = byteOrderMark21.equals((java.lang.Object) (-1L));
        java.lang.String str24 = byteOrderMark21.getCharsetName();
        java.lang.String str25 = byteOrderMark21.getCharsetName();
        java.lang.String str26 = byteOrderMark21.getCharsetName();
        boolean boolean27 = byteOrderMark9.equals((java.lang.Object) byteOrderMark21);
        org.apache.commons.io.ByteOrderMark byteOrderMark28 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        boolean boolean30 = byteOrderMark28.equals((java.lang.Object) 1L);
        java.lang.String str31 = byteOrderMark28.getCharsetName();
        int int32 = byteOrderMark28.length();
        boolean boolean34 = byteOrderMark28.equals((java.lang.Object) (-1.0f));
        java.lang.String str35 = byteOrderMark28.toString();
        boolean boolean36 = byteOrderMark21.equals((java.lang.Object) str35);
        int int37 = byteOrderMark21.length();
        int int38 = byteOrderMark21.length();
        java.lang.String str39 = byteOrderMark21.toString();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 97, 35]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(byteOrderMark21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "UTF-16LE" + "'", str24, "UTF-16LE");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "UTF-16LE" + "'", str25, "UTF-16LE");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "UTF-16LE" + "'", str26, "UTF-16LE");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(byteOrderMark28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "UTF-16LE" + "'", str31, "UTF-16LE");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "ByteOrderMark[UTF-16LE: 0xFF,0xFE]" + "'", str35, "ByteOrderMark[UTF-16LE: 0xFF,0xFE]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2 + "'", int37 == 2);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2 + "'", int38 == 2);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "ByteOrderMark[UTF-16LE: 0xFF,0xFE]" + "'", str39, "ByteOrderMark[UTF-16LE: 0xFF,0xFE]");
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        org.apache.commons.io.ByteOrderMark byteOrderMark0 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        int int2 = byteOrderMark0.get(0);
        boolean boolean4 = byteOrderMark0.equals((java.lang.Object) (short) 0);
        int[] intArray11 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark12 = new org.apache.commons.io.ByteOrderMark("hi!", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark13 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark14 = new org.apache.commons.io.ByteOrderMark("hi!", intArray11);
        boolean boolean15 = byteOrderMark0.equals((java.lang.Object) byteOrderMark14);
        byte[] byteArray16 = byteOrderMark0.getBytes();
        int int17 = byteOrderMark0.length();
        java.lang.String str18 = byteOrderMark0.getCharsetName();
        int int19 = byteOrderMark0.length();
        // The following exception was thrown during execution in test generation
        try {
            int int21 = byteOrderMark0.get((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrderMark0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 255 + "'", int2 == 255);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[-1, -2]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "UTF-16LE" + "'", str18, "UTF-16LE");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        int[] intArray13 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark14 = new org.apache.commons.io.ByteOrderMark("hi!", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark16 = new org.apache.commons.io.ByteOrderMark("hi!", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark17 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark18 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[hi!: 0xA,0x61,0x23]", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark19 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xA,0x61,0x23]", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark20 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-8: 0xEF,0xBB,0xBF]", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark21 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[UTF-16BE: 0xFE,0xFF]: 0xA,0x61,0x23]", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark22 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark23 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark24 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        java.lang.Class<?> wildcardClass25 = byteOrderMark24.getClass();
        boolean boolean26 = byteOrderMark23.equals((java.lang.Object) byteOrderMark24);
        java.lang.String str27 = byteOrderMark23.getCharsetName();
        int[] intArray39 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark40 = new org.apache.commons.io.ByteOrderMark("hi!", intArray39);
        org.apache.commons.io.ByteOrderMark byteOrderMark41 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray39);
        org.apache.commons.io.ByteOrderMark byteOrderMark42 = new org.apache.commons.io.ByteOrderMark("hi!", intArray39);
        org.apache.commons.io.ByteOrderMark byteOrderMark43 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray39);
        org.apache.commons.io.ByteOrderMark byteOrderMark44 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray39);
        org.apache.commons.io.ByteOrderMark byteOrderMark45 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray39);
        org.apache.commons.io.ByteOrderMark byteOrderMark46 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[UTF-16LE: 0xFF,0xFE]: 0xA,0x61,0x23]", intArray39);
        org.apache.commons.io.ByteOrderMark byteOrderMark47 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[UTF-32BE: 0xA,0x61,0x23]: 0xA,0x61,0x23]", intArray39);
        int[] intArray57 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark58 = new org.apache.commons.io.ByteOrderMark("hi!", intArray57);
        org.apache.commons.io.ByteOrderMark byteOrderMark59 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray57);
        org.apache.commons.io.ByteOrderMark byteOrderMark60 = new org.apache.commons.io.ByteOrderMark("hi!", intArray57);
        org.apache.commons.io.ByteOrderMark byteOrderMark61 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray57);
        org.apache.commons.io.ByteOrderMark byteOrderMark62 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[hi!: 0xA,0x61,0x23]", intArray57);
        org.apache.commons.io.ByteOrderMark byteOrderMark63 = new org.apache.commons.io.ByteOrderMark("hi!", intArray57);
        org.apache.commons.io.ByteOrderMark byteOrderMark64 = org.apache.commons.io.ByteOrderMark.UTF_16BE;
        java.lang.Object obj65 = null;
        boolean boolean66 = byteOrderMark64.equals(obj65);
        byte[] byteArray67 = byteOrderMark64.getBytes();
        boolean boolean68 = byteOrderMark63.equals((java.lang.Object) byteOrderMark64);
        int int69 = byteOrderMark63.length();
        java.lang.String str70 = byteOrderMark63.getCharsetName();
        java.lang.String str71 = byteOrderMark63.getCharsetName();
        boolean boolean72 = byteOrderMark47.equals((java.lang.Object) str71);
        java.lang.String str73 = byteOrderMark47.toString();
        boolean boolean74 = byteOrderMark23.equals((java.lang.Object) str73);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(byteOrderMark24);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "ByteOrderMark[UTF-16LE: 0xFF,0xFE]" + "'", str27, "ByteOrderMark[UTF-16LE: 0xFF,0xFE]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(byteOrderMark64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray67), "[-2, -1]");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 3 + "'", int69 == 3);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "ByteOrderMark[ByteOrderMark[ByteOrderMark[UTF-32BE: 0xA,0x61,0x23]: 0xA,0x61,0x23]: 0xA,0x61,0x23]" + "'", str73, "ByteOrderMark[ByteOrderMark[ByteOrderMark[UTF-32BE: 0xA,0x61,0x23]: 0xA,0x61,0x23]: 0xA,0x61,0x23]");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        int[] intArray12 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark13 = new org.apache.commons.io.ByteOrderMark("hi!", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark14 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("hi!", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark16 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark17 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[hi!: 0xA,0x61,0x23]", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark18 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xA,0x61,0x23]", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark19 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-8: 0xEF,0xBB,0xBF]", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark20 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[hi!: 0xFF,0x0,0xFE]", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark21 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16BE: 0xA,0x61,0x23]", intArray12);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[10, 97, 35]");
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        org.apache.commons.io.ByteOrderMark byteOrderMark0 = org.apache.commons.io.ByteOrderMark.UTF_32BE;
        java.lang.String str1 = byteOrderMark0.toString();
        java.lang.String str2 = byteOrderMark0.toString();
        java.lang.String str3 = byteOrderMark0.getCharsetName();
        int int4 = byteOrderMark0.length();
        int[] intArray13 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark14 = new org.apache.commons.io.ByteOrderMark("hi!", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark16 = new org.apache.commons.io.ByteOrderMark("hi!", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark17 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark18 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray13);
        int[] intArray26 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark27 = new org.apache.commons.io.ByteOrderMark("hi!", intArray26);
        org.apache.commons.io.ByteOrderMark byteOrderMark28 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray26);
        org.apache.commons.io.ByteOrderMark byteOrderMark29 = new org.apache.commons.io.ByteOrderMark("hi!", intArray26);
        org.apache.commons.io.ByteOrderMark byteOrderMark30 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray26);
        boolean boolean31 = byteOrderMark18.equals((java.lang.Object) "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]");
        java.lang.String str32 = byteOrderMark18.toString();
        java.lang.String str33 = byteOrderMark18.getCharsetName();
        java.lang.String str34 = byteOrderMark18.getCharsetName();
        java.lang.String str35 = byteOrderMark18.toString();
        boolean boolean36 = byteOrderMark0.equals((java.lang.Object) byteOrderMark18);
        int int37 = byteOrderMark0.length();
        org.junit.Assert.assertNotNull(byteOrderMark0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]" + "'", str1, "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]" + "'", str2, "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF-32BE" + "'", str3, "UTF-32BE");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "ByteOrderMark[UTF-32BE: 0xA,0x61,0x23]" + "'", str32, "ByteOrderMark[UTF-32BE: 0xA,0x61,0x23]");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "UTF-32BE" + "'", str33, "UTF-32BE");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "UTF-32BE" + "'", str34, "UTF-32BE");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "ByteOrderMark[UTF-32BE: 0xA,0x61,0x23]" + "'", str35, "ByteOrderMark[UTF-32BE: 0xA,0x61,0x23]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 4 + "'", int37 == 4);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        int[] intArray4 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark5 = new org.apache.commons.io.ByteOrderMark("hi!", intArray4);
        java.lang.String str6 = byteOrderMark5.getCharsetName();
        java.lang.Object obj7 = null;
        boolean boolean8 = byteOrderMark5.equals(obj7);
        int int9 = byteOrderMark5.length();
        byte[] byteArray10 = byteOrderMark5.getBytes();
        java.lang.String str11 = byteOrderMark5.toString();
        byte[] byteArray12 = byteOrderMark5.getBytes();
        java.lang.String str13 = byteOrderMark5.toString();
        org.apache.commons.io.ByteOrderMark byteOrderMark14 = org.apache.commons.io.ByteOrderMark.UTF_32BE;
        byte[] byteArray15 = byteOrderMark14.getBytes();
        int int16 = byteOrderMark14.length();
        int int17 = byteOrderMark14.length();
        int[] intArray29 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark30 = new org.apache.commons.io.ByteOrderMark("hi!", intArray29);
        org.apache.commons.io.ByteOrderMark byteOrderMark31 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray29);
        org.apache.commons.io.ByteOrderMark byteOrderMark32 = new org.apache.commons.io.ByteOrderMark("hi!", intArray29);
        org.apache.commons.io.ByteOrderMark byteOrderMark33 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray29);
        org.apache.commons.io.ByteOrderMark byteOrderMark34 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray29);
        org.apache.commons.io.ByteOrderMark byteOrderMark35 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray29);
        org.apache.commons.io.ByteOrderMark byteOrderMark36 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray29);
        org.apache.commons.io.ByteOrderMark byteOrderMark37 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16BE: 0xFE,0xFF]", intArray29);
        boolean boolean38 = byteOrderMark14.equals((java.lang.Object) byteOrderMark37);
        int int39 = byteOrderMark14.length();
        boolean boolean40 = byteOrderMark5.equals((java.lang.Object) int39);
        int int41 = byteOrderMark5.length();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 97, 35]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[10, 97, 35]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ByteOrderMark[hi!: 0xA,0x61,0x23]" + "'", str11, "ByteOrderMark[hi!: 0xA,0x61,0x23]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[10, 97, 35]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ByteOrderMark[hi!: 0xA,0x61,0x23]" + "'", str13, "ByteOrderMark[hi!: 0xA,0x61,0x23]");
        org.junit.Assert.assertNotNull(byteOrderMark14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[0, 0, -2, -1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 4 + "'", int39 == 4);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 3 + "'", int41 == 3);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        org.apache.commons.io.ByteOrderMark byteOrderMark0 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        boolean boolean2 = byteOrderMark0.equals((java.lang.Object) (-1L));
        java.lang.String str3 = byteOrderMark0.toString();
        int int4 = byteOrderMark0.length();
        int int5 = byteOrderMark0.length();
        java.lang.Class<?> wildcardClass6 = byteOrderMark0.getClass();
        org.junit.Assert.assertNotNull(byteOrderMark0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ByteOrderMark[UTF-16LE: 0xFF,0xFE]" + "'", str3, "ByteOrderMark[UTF-16LE: 0xFF,0xFE]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        org.apache.commons.io.ByteOrderMark byteOrderMark0 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        int int2 = byteOrderMark0.get(0);
        boolean boolean4 = byteOrderMark0.equals((java.lang.Object) (short) 0);
        int[] intArray11 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark12 = new org.apache.commons.io.ByteOrderMark("hi!", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark13 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark14 = new org.apache.commons.io.ByteOrderMark("hi!", intArray11);
        boolean boolean15 = byteOrderMark0.equals((java.lang.Object) byteOrderMark14);
        int[] intArray21 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark22 = new org.apache.commons.io.ByteOrderMark("hi!", intArray21);
        org.apache.commons.io.ByteOrderMark byteOrderMark23 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[ByteOrderMark[UTF-16LE: 0xFF,0xFE]: 0xA,0x61,0x23]: 0xA,0x61,0x23]", intArray21);
        boolean boolean24 = byteOrderMark14.equals((java.lang.Object) "ByteOrderMark[ByteOrderMark[ByteOrderMark[UTF-16LE: 0xFF,0xFE]: 0xA,0x61,0x23]: 0xA,0x61,0x23]");
        java.lang.String str25 = byteOrderMark14.toString();
        int int26 = byteOrderMark14.length();
        int[] intArray32 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark33 = new org.apache.commons.io.ByteOrderMark("hi!", intArray32);
        org.apache.commons.io.ByteOrderMark byteOrderMark34 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray32);
        byte[] byteArray35 = byteOrderMark34.getBytes();
        boolean boolean36 = byteOrderMark14.equals((java.lang.Object) byteArray35);
        int int37 = byteOrderMark14.length();
        org.junit.Assert.assertNotNull(byteOrderMark0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 255 + "'", int2 == 255);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "ByteOrderMark[hi!: 0xA,0x61,0x23]" + "'", str25, "ByteOrderMark[hi!: 0xA,0x61,0x23]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 3 + "'", int37 == 3);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        int[] intArray7 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark8 = new org.apache.commons.io.ByteOrderMark("hi!", intArray7);
        org.apache.commons.io.ByteOrderMark byteOrderMark9 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray7);
        org.apache.commons.io.ByteOrderMark byteOrderMark10 = new org.apache.commons.io.ByteOrderMark("hi!", intArray7);
        org.apache.commons.io.ByteOrderMark byteOrderMark11 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray7);
        int int12 = byteOrderMark11.length();
        int[] intArray22 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark23 = new org.apache.commons.io.ByteOrderMark("hi!", intArray22);
        org.apache.commons.io.ByteOrderMark byteOrderMark24 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray22);
        org.apache.commons.io.ByteOrderMark byteOrderMark25 = new org.apache.commons.io.ByteOrderMark("hi!", intArray22);
        org.apache.commons.io.ByteOrderMark byteOrderMark26 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray22);
        org.apache.commons.io.ByteOrderMark byteOrderMark27 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray22);
        org.apache.commons.io.ByteOrderMark byteOrderMark28 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray22);
        boolean boolean29 = byteOrderMark11.equals((java.lang.Object) byteOrderMark28);
        int[] intArray40 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark41 = new org.apache.commons.io.ByteOrderMark("hi!", intArray40);
        org.apache.commons.io.ByteOrderMark byteOrderMark42 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray40);
        org.apache.commons.io.ByteOrderMark byteOrderMark43 = new org.apache.commons.io.ByteOrderMark("hi!", intArray40);
        org.apache.commons.io.ByteOrderMark byteOrderMark44 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray40);
        org.apache.commons.io.ByteOrderMark byteOrderMark45 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray40);
        org.apache.commons.io.ByteOrderMark byteOrderMark46 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray40);
        org.apache.commons.io.ByteOrderMark byteOrderMark47 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray40);
        int[] intArray56 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark57 = new org.apache.commons.io.ByteOrderMark("hi!", intArray56);
        org.apache.commons.io.ByteOrderMark byteOrderMark58 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray56);
        org.apache.commons.io.ByteOrderMark byteOrderMark59 = new org.apache.commons.io.ByteOrderMark("hi!", intArray56);
        org.apache.commons.io.ByteOrderMark byteOrderMark60 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray56);
        org.apache.commons.io.ByteOrderMark byteOrderMark61 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray56);
        byte[] byteArray62 = byteOrderMark61.getBytes();
        java.lang.String str63 = byteOrderMark61.getCharsetName();
        boolean boolean64 = byteOrderMark47.equals((java.lang.Object) byteOrderMark61);
        int[] intArray69 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark70 = new org.apache.commons.io.ByteOrderMark("hi!", intArray69);
        java.lang.String str71 = byteOrderMark70.getCharsetName();
        java.lang.Object obj72 = null;
        boolean boolean73 = byteOrderMark70.equals(obj72);
        int int74 = byteOrderMark70.length();
        byte[] byteArray75 = byteOrderMark70.getBytes();
        java.lang.Class<?> wildcardClass76 = byteOrderMark70.getClass();
        boolean boolean77 = byteOrderMark61.equals((java.lang.Object) wildcardClass76);
        boolean boolean78 = byteOrderMark11.equals((java.lang.Object) byteOrderMark61);
        java.lang.String str79 = byteOrderMark61.toString();
        int int80 = byteOrderMark61.length();
        java.lang.String str81 = byteOrderMark61.getCharsetName();
        java.lang.String str82 = byteOrderMark61.toString();
        java.lang.Class<?> wildcardClass83 = byteOrderMark61.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray62), "[10, 97, 35]");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "UTF-32BE" + "'", str63, "UTF-32BE");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray69), "[10, 97, 35]");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 3 + "'", int74 == 3);
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray75), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(wildcardClass76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "ByteOrderMark[UTF-32BE: 0xA,0x61,0x23]" + "'", str79, "ByteOrderMark[UTF-32BE: 0xA,0x61,0x23]");
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 3 + "'", int80 == 3);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "UTF-32BE" + "'", str81, "UTF-32BE");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "ByteOrderMark[UTF-32BE: 0xA,0x61,0x23]" + "'", str82, "ByteOrderMark[UTF-32BE: 0xA,0x61,0x23]");
        org.junit.Assert.assertNotNull(wildcardClass83);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        org.apache.commons.io.ByteOrderMark byteOrderMark2 = org.apache.commons.io.ByteOrderMark.UTF_32BE;
        byte[] byteArray3 = byteOrderMark2.getBytes();
        java.lang.String str4 = byteOrderMark2.getCharsetName();
        org.apache.commons.io.ByteOrderMark byteOrderMark5 = org.apache.commons.io.ByteOrderMark.UTF_8;
        int int7 = byteOrderMark5.get((int) (byte) 0);
        byte[] byteArray8 = byteOrderMark5.getBytes();
        byte[] byteArray9 = byteOrderMark5.getBytes();
        boolean boolean10 = byteOrderMark2.equals((java.lang.Object) byteOrderMark5);
        boolean boolean12 = byteOrderMark5.equals((java.lang.Object) '\ufeff');
        int[] intArray24 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark25 = new org.apache.commons.io.ByteOrderMark("hi!", intArray24);
        org.apache.commons.io.ByteOrderMark byteOrderMark26 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray24);
        org.apache.commons.io.ByteOrderMark byteOrderMark27 = new org.apache.commons.io.ByteOrderMark("hi!", intArray24);
        org.apache.commons.io.ByteOrderMark byteOrderMark28 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray24);
        org.apache.commons.io.ByteOrderMark byteOrderMark29 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray24);
        org.apache.commons.io.ByteOrderMark byteOrderMark30 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray24);
        org.apache.commons.io.ByteOrderMark byteOrderMark31 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray24);
        org.apache.commons.io.ByteOrderMark byteOrderMark32 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0xA,0x61,0x23]", intArray24);
        boolean boolean33 = byteOrderMark5.equals((java.lang.Object) intArray24);
        org.apache.commons.io.ByteOrderMark byteOrderMark34 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xA,0x61,0x23]", intArray24);
        org.apache.commons.io.ByteOrderMark byteOrderMark35 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[UTF-16BE: 0xFE,0xFF]: 0xA,0xFE,0x64]", intArray24);
        org.junit.Assert.assertNotNull(byteOrderMark2);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, -2, -1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF-32BE" + "'", str4, "UTF-32BE");
        org.junit.Assert.assertNotNull(byteOrderMark5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 239 + "'", int7 == 239);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-17, -69, -65]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-17, -69, -65]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        int[] intArray1 = new int[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.ByteOrderMark byteOrderMark2 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[hi!: 0xA,0x61,0x23]: 0xA,0x61,0x23]", intArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No bytes specified");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        int[] intArray16 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark17 = new org.apache.commons.io.ByteOrderMark("hi!", intArray16);
        org.apache.commons.io.ByteOrderMark byteOrderMark18 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray16);
        org.apache.commons.io.ByteOrderMark byteOrderMark19 = new org.apache.commons.io.ByteOrderMark("hi!", intArray16);
        org.apache.commons.io.ByteOrderMark byteOrderMark20 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray16);
        org.apache.commons.io.ByteOrderMark byteOrderMark21 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray16);
        org.apache.commons.io.ByteOrderMark byteOrderMark22 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray16);
        org.apache.commons.io.ByteOrderMark byteOrderMark23 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[UTF-16LE: 0xFF,0xFE]: 0xA,0x61,0x23]", intArray16);
        org.apache.commons.io.ByteOrderMark byteOrderMark24 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[UTF-32BE: 0xA,0x61,0x23]: 0xA,0x61,0x23]", intArray16);
        org.apache.commons.io.ByteOrderMark byteOrderMark25 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[UTF-16BE: 0xFE,0xFF]: 0xA,0xFE,0x64]", intArray16);
        org.apache.commons.io.ByteOrderMark byteOrderMark26 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[UTF-16BE: 0xFE,0xFF]: 0xA,0x61,0x23]", intArray16);
        org.apache.commons.io.ByteOrderMark byteOrderMark27 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-8: 0xEF,0xBB,0xBF]", intArray16);
        org.apache.commons.io.ByteOrderMark byteOrderMark28 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray16);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.ByteOrderMark byteOrderMark29 = new org.apache.commons.io.ByteOrderMark("", intArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No charsetName specified");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[10, 97, 35]");
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        org.apache.commons.io.ByteOrderMark byteOrderMark0 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        boolean boolean2 = byteOrderMark0.equals((java.lang.Object) (-1L));
        java.lang.String str3 = byteOrderMark0.toString();
        java.lang.String str4 = byteOrderMark0.getCharsetName();
        java.lang.String str5 = byteOrderMark0.toString();
        byte[] byteArray6 = byteOrderMark0.getBytes();
        java.lang.String str7 = byteOrderMark0.getCharsetName();
        java.lang.String str8 = byteOrderMark0.toString();
        java.lang.Class<?> wildcardClass9 = byteOrderMark0.getClass();
        org.junit.Assert.assertNotNull(byteOrderMark0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ByteOrderMark[UTF-16LE: 0xFF,0xFE]" + "'", str3, "ByteOrderMark[UTF-16LE: 0xFF,0xFE]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF-16LE" + "'", str4, "UTF-16LE");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ByteOrderMark[UTF-16LE: 0xFF,0xFE]" + "'", str5, "ByteOrderMark[UTF-16LE: 0xFF,0xFE]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, -2]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTF-16LE" + "'", str7, "UTF-16LE");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ByteOrderMark[UTF-16LE: 0xFF,0xFE]" + "'", str8, "ByteOrderMark[UTF-16LE: 0xFF,0xFE]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        int[] intArray11 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark12 = new org.apache.commons.io.ByteOrderMark("hi!", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark13 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark14 = new org.apache.commons.io.ByteOrderMark("hi!", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark16 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[hi!: 0xA,0x61,0x23]", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark17 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark18 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark19 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]: 0xA,0x61,0x23]", intArray11);
        int int20 = byteOrderMark19.length();
        byte[] byteArray21 = byteOrderMark19.getBytes();
        int int22 = byteOrderMark19.length();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        org.apache.commons.io.ByteOrderMark byteOrderMark1 = org.apache.commons.io.ByteOrderMark.UTF_32BE;
        java.lang.String str2 = byteOrderMark1.toString();
        boolean boolean4 = byteOrderMark1.equals((java.lang.Object) ' ');
        boolean boolean6 = byteOrderMark1.equals((java.lang.Object) 3);
        java.lang.String str7 = byteOrderMark1.toString();
        int int8 = byteOrderMark1.length();
        int int9 = byteOrderMark1.length();
        java.lang.String str10 = byteOrderMark1.getCharsetName();
        byte[] byteArray11 = byteOrderMark1.getBytes();
        int[] intArray17 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark18 = new org.apache.commons.io.ByteOrderMark("hi!", intArray17);
        org.apache.commons.io.ByteOrderMark byteOrderMark19 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray17);
        boolean boolean20 = byteOrderMark1.equals((java.lang.Object) intArray17);
        org.apache.commons.io.ByteOrderMark byteOrderMark21 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16BE: 0xFE,0xFF]", intArray17);
        org.junit.Assert.assertNotNull(byteOrderMark1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]" + "'", str2, "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]" + "'", str7, "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTF-32BE" + "'", str10, "UTF-32BE");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[0, 0, -2, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        int[] intArray11 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark12 = new org.apache.commons.io.ByteOrderMark("hi!", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark13 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark14 = new org.apache.commons.io.ByteOrderMark("hi!", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark16 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]: 0xA,0x61,0x23]", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark17 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[ByteOrderMark[UTF-16LE: 0xFF,0xFE]: 0xA,0x61,0x23]: 0xA,0x61,0x23]", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark18 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[hi!: 0xA,0x61,0x23]", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark19 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[ByteOrderMark[ByteOrderMark[UTF-8: 0xEF,0xBB,0xBF]: 0xA,0x61,0x23]: 0xA,0x61,0x23]: 0xA,0x61,0x23]", intArray11);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, 35]");
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        org.apache.commons.io.ByteOrderMark byteOrderMark0 = org.apache.commons.io.ByteOrderMark.UTF_16BE;
        java.lang.Object obj1 = null;
        boolean boolean2 = byteOrderMark0.equals(obj1);
        int int3 = byteOrderMark0.length();
        boolean boolean5 = byteOrderMark0.equals((java.lang.Object) 0L);
        int int6 = byteOrderMark0.length();
        boolean boolean8 = byteOrderMark0.equals((java.lang.Object) 3);
        java.lang.String str9 = byteOrderMark0.getCharsetName();
        int int10 = byteOrderMark0.length();
        java.lang.String str11 = byteOrderMark0.getCharsetName();
        java.lang.String str12 = byteOrderMark0.toString();
        int int14 = byteOrderMark0.get((int) (byte) 0);
        java.lang.String str15 = byteOrderMark0.getCharsetName();
        org.junit.Assert.assertNotNull(byteOrderMark0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTF-16BE" + "'", str9, "UTF-16BE");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTF-16BE" + "'", str11, "UTF-16BE");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ByteOrderMark[UTF-16BE: 0xFE,0xFF]" + "'", str12, "ByteOrderMark[UTF-16BE: 0xFE,0xFF]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 254 + "'", int14 == 254);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTF-16BE" + "'", str15, "UTF-16BE");
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        int[] intArray7 = new int[] { (short) -1, (byte) 0, 254 };
        org.apache.commons.io.ByteOrderMark byteOrderMark8 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[hi!: 0xA,0x61,0x23]", intArray7);
        org.apache.commons.io.ByteOrderMark byteOrderMark9 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray7);
        org.apache.commons.io.ByteOrderMark byteOrderMark10 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]: 0xA,0x61,0x23]: 0xA,0x61,0x23]", intArray7);
        org.apache.commons.io.ByteOrderMark byteOrderMark11 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[hi!: 0xFF,0x0,0xFE]", intArray7);
        java.lang.String str12 = byteOrderMark11.toString();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 0, 254]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ByteOrderMark[ByteOrderMark[hi!: 0xFF,0x0,0xFE]: 0xFF,0x0,0xFE]" + "'", str12, "ByteOrderMark[ByteOrderMark[hi!: 0xFF,0x0,0xFE]: 0xFF,0x0,0xFE]");
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        int[] intArray4 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark5 = new org.apache.commons.io.ByteOrderMark("hi!", intArray4);
        java.lang.String str6 = byteOrderMark5.getCharsetName();
        java.lang.Object obj7 = null;
        boolean boolean8 = byteOrderMark5.equals(obj7);
        byte[] byteArray9 = byteOrderMark5.getBytes();
        byte[] byteArray10 = byteOrderMark5.getBytes();
        byte[] byteArray11 = byteOrderMark5.getBytes();
        org.apache.commons.io.ByteOrderMark byteOrderMark12 = org.apache.commons.io.ByteOrderMark.UTF_16BE;
        java.lang.Object obj13 = null;
        boolean boolean14 = byteOrderMark12.equals(obj13);
        int int15 = byteOrderMark12.length();
        boolean boolean17 = byteOrderMark12.equals((java.lang.Object) 0L);
        int int18 = byteOrderMark12.length();
        int int19 = byteOrderMark12.length();
        int[] intArray26 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark27 = new org.apache.commons.io.ByteOrderMark("hi!", intArray26);
        org.apache.commons.io.ByteOrderMark byteOrderMark28 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray26);
        org.apache.commons.io.ByteOrderMark byteOrderMark29 = new org.apache.commons.io.ByteOrderMark("hi!", intArray26);
        boolean boolean30 = byteOrderMark12.equals((java.lang.Object) intArray26);
        int[] intArray38 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark39 = new org.apache.commons.io.ByteOrderMark("hi!", intArray38);
        org.apache.commons.io.ByteOrderMark byteOrderMark40 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray38);
        org.apache.commons.io.ByteOrderMark byteOrderMark41 = new org.apache.commons.io.ByteOrderMark("hi!", intArray38);
        org.apache.commons.io.ByteOrderMark byteOrderMark42 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray38);
        int int43 = byteOrderMark42.length();
        boolean boolean44 = byteOrderMark12.equals((java.lang.Object) byteOrderMark42);
        org.apache.commons.io.ByteOrderMark byteOrderMark45 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        int int47 = byteOrderMark45.get(0);
        boolean boolean49 = byteOrderMark45.equals((java.lang.Object) (short) 0);
        int[] intArray56 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark57 = new org.apache.commons.io.ByteOrderMark("hi!", intArray56);
        org.apache.commons.io.ByteOrderMark byteOrderMark58 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray56);
        org.apache.commons.io.ByteOrderMark byteOrderMark59 = new org.apache.commons.io.ByteOrderMark("hi!", intArray56);
        boolean boolean60 = byteOrderMark45.equals((java.lang.Object) byteOrderMark59);
        boolean boolean61 = byteOrderMark12.equals((java.lang.Object) byteOrderMark45);
        byte[] byteArray62 = byteOrderMark45.getBytes();
        boolean boolean63 = byteOrderMark5.equals((java.lang.Object) byteArray62);
        int[] intArray73 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark74 = new org.apache.commons.io.ByteOrderMark("hi!", intArray73);
        org.apache.commons.io.ByteOrderMark byteOrderMark75 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray73);
        org.apache.commons.io.ByteOrderMark byteOrderMark76 = new org.apache.commons.io.ByteOrderMark("hi!", intArray73);
        org.apache.commons.io.ByteOrderMark byteOrderMark77 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray73);
        org.apache.commons.io.ByteOrderMark byteOrderMark78 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0xA,0x61,0x23]", intArray73);
        org.apache.commons.io.ByteOrderMark byteOrderMark79 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray73);
        boolean boolean80 = byteOrderMark5.equals((java.lang.Object) intArray73);
        java.lang.String str81 = byteOrderMark5.toString();
        int int82 = byteOrderMark5.length();
        int int83 = byteOrderMark5.length();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 97, 35]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(byteOrderMark12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 3 + "'", int43 == 3);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(byteOrderMark45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 255 + "'", int47 == 255);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray62), "[-1, -2]");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray73), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "ByteOrderMark[hi!: 0xA,0x61,0x23]" + "'", str81, "ByteOrderMark[hi!: 0xA,0x61,0x23]");
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 3 + "'", int82 == 3);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 3 + "'", int83 == 3);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        org.apache.commons.io.ByteOrderMark byteOrderMark0 = org.apache.commons.io.ByteOrderMark.UTF_16BE;
        java.lang.Object obj1 = null;
        boolean boolean2 = byteOrderMark0.equals(obj1);
        int int3 = byteOrderMark0.length();
        int int4 = byteOrderMark0.length();
        org.apache.commons.io.ByteOrderMark byteOrderMark5 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        byte[] byteArray6 = byteOrderMark5.getBytes();
        int int7 = byteOrderMark5.length();
        java.lang.String str8 = byteOrderMark5.getCharsetName();
        java.lang.String str9 = byteOrderMark5.getCharsetName();
        java.lang.String str10 = byteOrderMark5.getCharsetName();
        byte[] byteArray11 = byteOrderMark5.getBytes();
        boolean boolean12 = byteOrderMark0.equals((java.lang.Object) byteOrderMark5);
        java.lang.Object obj13 = null;
        boolean boolean14 = byteOrderMark5.equals(obj13);
        org.junit.Assert.assertNotNull(byteOrderMark0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(byteOrderMark5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, -2]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF-16LE" + "'", str8, "UTF-16LE");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTF-16LE" + "'", str9, "UTF-16LE");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTF-16LE" + "'", str10, "UTF-16LE");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-1, -2]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        org.apache.commons.io.ByteOrderMark byteOrderMark0 = org.apache.commons.io.ByteOrderMark.UTF_16BE;
        java.lang.Object obj1 = null;
        boolean boolean2 = byteOrderMark0.equals(obj1);
        int int3 = byteOrderMark0.length();
        byte[] byteArray4 = byteOrderMark0.getBytes();
        java.lang.String str5 = byteOrderMark0.toString();
        java.lang.String str6 = byteOrderMark0.getCharsetName();
        java.lang.String str7 = byteOrderMark0.getCharsetName();
        java.lang.Object obj8 = null;
        boolean boolean9 = byteOrderMark0.equals(obj8);
        java.lang.String str10 = byteOrderMark0.toString();
        org.junit.Assert.assertNotNull(byteOrderMark0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-2, -1]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ByteOrderMark[UTF-16BE: 0xFE,0xFF]" + "'", str5, "ByteOrderMark[UTF-16BE: 0xFE,0xFF]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF-16BE" + "'", str6, "UTF-16BE");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTF-16BE" + "'", str7, "UTF-16BE");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ByteOrderMark[UTF-16BE: 0xFE,0xFF]" + "'", str10, "ByteOrderMark[UTF-16BE: 0xFE,0xFF]");
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        int[] intArray11 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark12 = new org.apache.commons.io.ByteOrderMark("hi!", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark13 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark14 = new org.apache.commons.io.ByteOrderMark("hi!", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark16 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark17 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark18 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark19 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray11);
        int int20 = byteOrderMark19.length();
        byte[] byteArray21 = byteOrderMark19.getBytes();
        byte[] byteArray22 = byteOrderMark19.getBytes();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[10, 97, 35]");
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        int[] intArray7 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark8 = new org.apache.commons.io.ByteOrderMark("hi!", intArray7);
        org.apache.commons.io.ByteOrderMark byteOrderMark9 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray7);
        org.apache.commons.io.ByteOrderMark byteOrderMark10 = new org.apache.commons.io.ByteOrderMark("hi!", intArray7);
        org.apache.commons.io.ByteOrderMark byteOrderMark11 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray7);
        int int12 = byteOrderMark11.length();
        int[] intArray22 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark23 = new org.apache.commons.io.ByteOrderMark("hi!", intArray22);
        org.apache.commons.io.ByteOrderMark byteOrderMark24 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray22);
        org.apache.commons.io.ByteOrderMark byteOrderMark25 = new org.apache.commons.io.ByteOrderMark("hi!", intArray22);
        org.apache.commons.io.ByteOrderMark byteOrderMark26 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray22);
        org.apache.commons.io.ByteOrderMark byteOrderMark27 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray22);
        org.apache.commons.io.ByteOrderMark byteOrderMark28 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray22);
        boolean boolean29 = byteOrderMark11.equals((java.lang.Object) byteOrderMark28);
        java.lang.String str30 = byteOrderMark28.getCharsetName();
        byte[] byteArray31 = byteOrderMark28.getBytes();
        java.lang.String str32 = byteOrderMark28.getCharsetName();
        // The following exception was thrown during execution in test generation
        try {
            int int34 = byteOrderMark28.get((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "UTF-32BE" + "'", str30, "UTF-32BE");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[10, 97, 35]");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "UTF-32BE" + "'", str32, "UTF-32BE");
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        org.apache.commons.io.ByteOrderMark byteOrderMark0 = org.apache.commons.io.ByteOrderMark.UTF_16BE;
        java.lang.Object obj1 = null;
        boolean boolean2 = byteOrderMark0.equals(obj1);
        int int3 = byteOrderMark0.length();
        boolean boolean5 = byteOrderMark0.equals((java.lang.Object) 0L);
        int int6 = byteOrderMark0.length();
        boolean boolean8 = byteOrderMark0.equals((java.lang.Object) 3);
        java.lang.String str9 = byteOrderMark0.getCharsetName();
        java.lang.String str10 = byteOrderMark0.getCharsetName();
        java.lang.String str11 = byteOrderMark0.toString();
        byte[] byteArray12 = byteOrderMark0.getBytes();
        org.apache.commons.io.ByteOrderMark byteOrderMark13 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        java.lang.String str14 = byteOrderMark13.getCharsetName();
        int int15 = byteOrderMark13.length();
        int int16 = byteOrderMark13.length();
        java.lang.String str17 = byteOrderMark13.getCharsetName();
        boolean boolean18 = byteOrderMark0.equals((java.lang.Object) str17);
        java.lang.String str19 = byteOrderMark0.toString();
        java.lang.Object obj20 = null;
        boolean boolean21 = byteOrderMark0.equals(obj20);
        int[] intArray33 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark34 = new org.apache.commons.io.ByteOrderMark("hi!", intArray33);
        org.apache.commons.io.ByteOrderMark byteOrderMark35 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray33);
        org.apache.commons.io.ByteOrderMark byteOrderMark36 = new org.apache.commons.io.ByteOrderMark("hi!", intArray33);
        org.apache.commons.io.ByteOrderMark byteOrderMark37 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray33);
        org.apache.commons.io.ByteOrderMark byteOrderMark38 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray33);
        org.apache.commons.io.ByteOrderMark byteOrderMark39 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray33);
        org.apache.commons.io.ByteOrderMark byteOrderMark40 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray33);
        org.apache.commons.io.ByteOrderMark byteOrderMark41 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]: 0xA,0x61,0x23]", intArray33);
        boolean boolean42 = byteOrderMark0.equals((java.lang.Object) intArray33);
        org.apache.commons.io.ByteOrderMark byteOrderMark43 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        boolean boolean45 = byteOrderMark43.equals((java.lang.Object) (-1L));
        java.lang.String str46 = byteOrderMark43.getCharsetName();
        org.apache.commons.io.ByteOrderMark byteOrderMark47 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        int int49 = byteOrderMark47.get(0);
        java.lang.String str50 = byteOrderMark47.getCharsetName();
        byte[] byteArray51 = byteOrderMark47.getBytes();
        boolean boolean52 = byteOrderMark43.equals((java.lang.Object) byteOrderMark47);
        java.lang.Object obj53 = null;
        boolean boolean54 = byteOrderMark47.equals(obj53);
        int[] intArray61 = new int[] { (byte) 0, 10, (-1) };
        org.apache.commons.io.ByteOrderMark byteOrderMark62 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[hi!: 0xA,0x61,0x23]", intArray61);
        org.apache.commons.io.ByteOrderMark byteOrderMark63 = new org.apache.commons.io.ByteOrderMark("UTF-16BE", intArray61);
        org.apache.commons.io.ByteOrderMark byteOrderMark64 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[hi!: 0xA,0x61,0x23]", intArray61);
        boolean boolean65 = byteOrderMark47.equals((java.lang.Object) "ByteOrderMark[hi!: 0xA,0x61,0x23]");
        boolean boolean66 = byteOrderMark0.equals((java.lang.Object) byteOrderMark47);
        int int67 = byteOrderMark0.length();
        org.junit.Assert.assertNotNull(byteOrderMark0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTF-16BE" + "'", str9, "UTF-16BE");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTF-16BE" + "'", str10, "UTF-16BE");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ByteOrderMark[UTF-16BE: 0xFE,0xFF]" + "'", str11, "ByteOrderMark[UTF-16BE: 0xFE,0xFF]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[-2, -1]");
        org.junit.Assert.assertNotNull(byteOrderMark13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTF-16LE" + "'", str14, "UTF-16LE");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTF-16LE" + "'", str17, "UTF-16LE");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ByteOrderMark[UTF-16BE: 0xFE,0xFF]" + "'", str19, "ByteOrderMark[UTF-16BE: 0xFE,0xFF]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(byteOrderMark43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "UTF-16LE" + "'", str46, "UTF-16LE");
        org.junit.Assert.assertNotNull(byteOrderMark47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 255 + "'", int49 == 255);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "UTF-16LE" + "'", str50, "UTF-16LE");
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[-1, -2]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray61), "[0, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 2 + "'", int67 == 2);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        org.apache.commons.io.ByteOrderMark byteOrderMark0 = org.apache.commons.io.ByteOrderMark.UTF_32BE;
        byte[] byteArray1 = byteOrderMark0.getBytes();
        int int2 = byteOrderMark0.length();
        int int3 = byteOrderMark0.length();
        int[] intArray15 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark16 = new org.apache.commons.io.ByteOrderMark("hi!", intArray15);
        org.apache.commons.io.ByteOrderMark byteOrderMark17 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray15);
        org.apache.commons.io.ByteOrderMark byteOrderMark18 = new org.apache.commons.io.ByteOrderMark("hi!", intArray15);
        org.apache.commons.io.ByteOrderMark byteOrderMark19 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray15);
        org.apache.commons.io.ByteOrderMark byteOrderMark20 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray15);
        org.apache.commons.io.ByteOrderMark byteOrderMark21 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray15);
        org.apache.commons.io.ByteOrderMark byteOrderMark22 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray15);
        org.apache.commons.io.ByteOrderMark byteOrderMark23 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16BE: 0xFE,0xFF]", intArray15);
        boolean boolean24 = byteOrderMark0.equals((java.lang.Object) byteOrderMark23);
        int int26 = byteOrderMark23.get(2);
        org.junit.Assert.assertNotNull(byteOrderMark0);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[0, 0, -2, -1]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 35 + "'", int26 == 35);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        org.apache.commons.io.ByteOrderMark byteOrderMark0 = org.apache.commons.io.ByteOrderMark.UTF_16BE;
        java.lang.Object obj1 = null;
        boolean boolean2 = byteOrderMark0.equals(obj1);
        int int3 = byteOrderMark0.length();
        java.lang.String str4 = byteOrderMark0.getCharsetName();
        byte[] byteArray5 = byteOrderMark0.getBytes();
        java.lang.String str6 = byteOrderMark0.toString();
        org.apache.commons.io.ByteOrderMark byteOrderMark7 = org.apache.commons.io.ByteOrderMark.UTF_32BE;
        byte[] byteArray8 = byteOrderMark7.getBytes();
        java.lang.String str9 = byteOrderMark7.getCharsetName();
        org.apache.commons.io.ByteOrderMark byteOrderMark10 = org.apache.commons.io.ByteOrderMark.UTF_8;
        int int12 = byteOrderMark10.get((int) (byte) 0);
        byte[] byteArray13 = byteOrderMark10.getBytes();
        byte[] byteArray14 = byteOrderMark10.getBytes();
        boolean boolean15 = byteOrderMark7.equals((java.lang.Object) byteOrderMark10);
        org.apache.commons.io.ByteOrderMark byteOrderMark16 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        int int18 = byteOrderMark16.get(0);
        java.lang.String str19 = byteOrderMark16.getCharsetName();
        org.apache.commons.io.ByteOrderMark byteOrderMark20 = org.apache.commons.io.ByteOrderMark.UTF_16BE;
        java.lang.Object obj21 = null;
        boolean boolean22 = byteOrderMark20.equals(obj21);
        int int23 = byteOrderMark20.length();
        boolean boolean25 = byteOrderMark20.equals((java.lang.Object) 0L);
        int int26 = byteOrderMark20.length();
        boolean boolean27 = byteOrderMark16.equals((java.lang.Object) int26);
        int int29 = byteOrderMark16.get(0);
        boolean boolean30 = byteOrderMark7.equals((java.lang.Object) 0);
        org.apache.commons.io.ByteOrderMark byteOrderMark31 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        boolean boolean33 = byteOrderMark31.equals((java.lang.Object) (-1L));
        java.lang.String str34 = byteOrderMark31.toString();
        byte[] byteArray35 = byteOrderMark31.getBytes();
        java.lang.Class<?> wildcardClass36 = byteArray35.getClass();
        boolean boolean37 = byteOrderMark7.equals((java.lang.Object) wildcardClass36);
        boolean boolean38 = byteOrderMark0.equals((java.lang.Object) wildcardClass36);
        java.lang.String str39 = byteOrderMark0.getCharsetName();
        org.apache.commons.io.ByteOrderMark byteOrderMark40 = org.apache.commons.io.ByteOrderMark.UTF_32BE;
        byte[] byteArray41 = byteOrderMark40.getBytes();
        java.lang.String str42 = byteOrderMark40.getCharsetName();
        org.apache.commons.io.ByteOrderMark byteOrderMark43 = org.apache.commons.io.ByteOrderMark.UTF_8;
        int int45 = byteOrderMark43.get((int) (byte) 0);
        byte[] byteArray46 = byteOrderMark43.getBytes();
        byte[] byteArray47 = byteOrderMark43.getBytes();
        boolean boolean48 = byteOrderMark40.equals((java.lang.Object) byteOrderMark43);
        int[] intArray58 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark59 = new org.apache.commons.io.ByteOrderMark("hi!", intArray58);
        org.apache.commons.io.ByteOrderMark byteOrderMark60 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray58);
        org.apache.commons.io.ByteOrderMark byteOrderMark61 = new org.apache.commons.io.ByteOrderMark("hi!", intArray58);
        org.apache.commons.io.ByteOrderMark byteOrderMark62 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray58);
        org.apache.commons.io.ByteOrderMark byteOrderMark63 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray58);
        org.apache.commons.io.ByteOrderMark byteOrderMark64 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray58);
        boolean boolean65 = byteOrderMark40.equals((java.lang.Object) intArray58);
        org.apache.commons.io.ByteOrderMark byteOrderMark66 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        java.lang.String str67 = byteOrderMark66.getCharsetName();
        java.lang.Class<?> wildcardClass68 = byteOrderMark66.getClass();
        boolean boolean69 = byteOrderMark40.equals((java.lang.Object) wildcardClass68);
        int int70 = byteOrderMark40.length();
        int int71 = byteOrderMark40.length();
        boolean boolean72 = byteOrderMark0.equals((java.lang.Object) int71);
        org.junit.Assert.assertNotNull(byteOrderMark0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF-16BE" + "'", str4, "UTF-16BE");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-2, -1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ByteOrderMark[UTF-16BE: 0xFE,0xFF]" + "'", str6, "ByteOrderMark[UTF-16BE: 0xFE,0xFF]");
        org.junit.Assert.assertNotNull(byteOrderMark7);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 0, -2, -1]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTF-32BE" + "'", str9, "UTF-32BE");
        org.junit.Assert.assertNotNull(byteOrderMark10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 239 + "'", int12 == 239);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-17, -69, -65]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[-17, -69, -65]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteOrderMark16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 255 + "'", int18 == 255);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "UTF-16LE" + "'", str19, "UTF-16LE");
        org.junit.Assert.assertNotNull(byteOrderMark20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 255 + "'", int29 == 255);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(byteOrderMark31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "ByteOrderMark[UTF-16LE: 0xFF,0xFE]" + "'", str34, "ByteOrderMark[UTF-16LE: 0xFF,0xFE]");
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[-1, -2]");
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "UTF-16BE" + "'", str39, "UTF-16BE");
        org.junit.Assert.assertNotNull(byteOrderMark40);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[0, 0, -2, -1]");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "UTF-32BE" + "'", str42, "UTF-32BE");
        org.junit.Assert.assertNotNull(byteOrderMark43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 239 + "'", int45 == 239);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[-17, -69, -65]");
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[-17, -69, -65]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(byteOrderMark66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "UTF-16LE" + "'", str67, "UTF-16LE");
        org.junit.Assert.assertNotNull(wildcardClass68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 4 + "'", int70 == 4);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 4 + "'", int71 == 4);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        int[] intArray7 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark8 = new org.apache.commons.io.ByteOrderMark("hi!", intArray7);
        org.apache.commons.io.ByteOrderMark byteOrderMark9 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray7);
        org.apache.commons.io.ByteOrderMark byteOrderMark10 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray7);
        org.apache.commons.io.ByteOrderMark byteOrderMark11 = new org.apache.commons.io.ByteOrderMark("hi!", intArray7);
        int int13 = byteOrderMark11.get((int) (short) 1);
        java.lang.String str14 = byteOrderMark11.getCharsetName();
        byte[] byteArray15 = byteOrderMark11.getBytes();
        int[] intArray21 = new int[] { (byte) 0, 10, (-1) };
        org.apache.commons.io.ByteOrderMark byteOrderMark22 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[hi!: 0xA,0x61,0x23]", intArray21);
        org.apache.commons.io.ByteOrderMark byteOrderMark23 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0xA,0x61,0x23]", intArray21);
        byte[] byteArray24 = byteOrderMark23.getBytes();
        byte[] byteArray25 = byteOrderMark23.getBytes();
        boolean boolean26 = byteOrderMark11.equals((java.lang.Object) byteArray25);
        int int27 = byteOrderMark11.length();
        int[] intArray40 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark41 = new org.apache.commons.io.ByteOrderMark("hi!", intArray40);
        org.apache.commons.io.ByteOrderMark byteOrderMark42 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray40);
        org.apache.commons.io.ByteOrderMark byteOrderMark43 = new org.apache.commons.io.ByteOrderMark("hi!", intArray40);
        org.apache.commons.io.ByteOrderMark byteOrderMark44 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray40);
        org.apache.commons.io.ByteOrderMark byteOrderMark45 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray40);
        org.apache.commons.io.ByteOrderMark byteOrderMark46 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray40);
        org.apache.commons.io.ByteOrderMark byteOrderMark47 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray40);
        org.apache.commons.io.ByteOrderMark byteOrderMark48 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16BE: 0xFE,0xFF]", intArray40);
        org.apache.commons.io.ByteOrderMark byteOrderMark49 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-8: 0xEF,0xBB,0xBF]", intArray40);
        org.apache.commons.io.ByteOrderMark byteOrderMark50 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        boolean boolean52 = byteOrderMark50.equals((java.lang.Object) (-1L));
        java.lang.String str53 = byteOrderMark50.toString();
        byte[] byteArray54 = byteOrderMark50.getBytes();
        java.lang.String str55 = byteOrderMark50.getCharsetName();
        int int56 = byteOrderMark50.length();
        boolean boolean57 = byteOrderMark49.equals((java.lang.Object) byteOrderMark50);
        boolean boolean58 = byteOrderMark11.equals((java.lang.Object) byteOrderMark50);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 10, -1]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[0, 10, -1]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[0, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(byteOrderMark50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "ByteOrderMark[UTF-16LE: 0xFF,0xFE]" + "'", str53, "ByteOrderMark[UTF-16LE: 0xFF,0xFE]");
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray54), "[-1, -2]");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "UTF-16LE" + "'", str55, "UTF-16LE");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 2 + "'", int56 == 2);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        int[] intArray6 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark7 = new org.apache.commons.io.ByteOrderMark("hi!", intArray6);
        org.apache.commons.io.ByteOrderMark byteOrderMark8 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[UTF-16BE: 0xFE,0xFF]: 0xA,0x61,0x23]", intArray6);
        org.apache.commons.io.ByteOrderMark byteOrderMark9 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[hi!: 0xA,0x61,0x23]: 0xA,0x61,0x23]", intArray6);
        int int10 = byteOrderMark9.length();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        int[] intArray11 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark12 = new org.apache.commons.io.ByteOrderMark("hi!", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark13 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark14 = new org.apache.commons.io.ByteOrderMark("hi!", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark16 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[hi!: 0xA,0x61,0x23]", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark17 = new org.apache.commons.io.ByteOrderMark("hi!", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark18 = new org.apache.commons.io.ByteOrderMark("UTF-8", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark19 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-8: 0xA,0x61,0x23]", intArray11);
        java.lang.String str20 = byteOrderMark19.getCharsetName();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, 35]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ByteOrderMark[UTF-8: 0xA,0x61,0x23]" + "'", str20, "ByteOrderMark[UTF-8: 0xA,0x61,0x23]");
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        org.apache.commons.io.ByteOrderMark byteOrderMark1 = org.apache.commons.io.ByteOrderMark.UTF_32BE;
        byte[] byteArray2 = byteOrderMark1.getBytes();
        int[] intArray12 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark13 = new org.apache.commons.io.ByteOrderMark("hi!", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark14 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("hi!", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark16 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark17 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[hi!: 0xA,0x61,0x23]", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark18 = new org.apache.commons.io.ByteOrderMark("hi!", intArray12);
        boolean boolean19 = byteOrderMark1.equals((java.lang.Object) intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark20 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xA,0x61,0x23]", intArray12);
        java.lang.String str21 = byteOrderMark20.toString();
        java.lang.Class<?> wildcardClass22 = byteOrderMark20.getClass();
        org.junit.Assert.assertNotNull(byteOrderMark1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0, -2, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ByteOrderMark[ByteOrderMark[UTF-16LE: 0xA,0x61,0x23]: 0xA,0x61,0x23]" + "'", str21, "ByteOrderMark[ByteOrderMark[UTF-16LE: 0xA,0x61,0x23]: 0xA,0x61,0x23]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        org.apache.commons.io.ByteOrderMark byteOrderMark0 = org.apache.commons.io.ByteOrderMark.UTF_16BE;
        java.lang.Object obj1 = null;
        boolean boolean2 = byteOrderMark0.equals(obj1);
        int int3 = byteOrderMark0.length();
        boolean boolean5 = byteOrderMark0.equals((java.lang.Object) 0L);
        int int6 = byteOrderMark0.length();
        boolean boolean8 = byteOrderMark0.equals((java.lang.Object) 3);
        java.lang.String str9 = byteOrderMark0.getCharsetName();
        java.lang.String str10 = byteOrderMark0.getCharsetName();
        java.lang.String str11 = byteOrderMark0.getCharsetName();
        org.junit.Assert.assertNotNull(byteOrderMark0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTF-16BE" + "'", str9, "UTF-16BE");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTF-16BE" + "'", str10, "UTF-16BE");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTF-16BE" + "'", str11, "UTF-16BE");
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        org.apache.commons.io.ByteOrderMark byteOrderMark0 = org.apache.commons.io.ByteOrderMark.UTF_32BE;
        java.lang.String str1 = byteOrderMark0.toString();
        java.lang.String str2 = byteOrderMark0.toString();
        int[] intArray7 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark8 = new org.apache.commons.io.ByteOrderMark("hi!", intArray7);
        java.lang.String str9 = byteOrderMark8.getCharsetName();
        java.lang.Object obj10 = null;
        boolean boolean11 = byteOrderMark8.equals(obj10);
        byte[] byteArray12 = byteOrderMark8.getBytes();
        boolean boolean13 = byteOrderMark0.equals((java.lang.Object) byteArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = byteOrderMark0.get((int) '\ufeff');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 65279 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrderMark0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]" + "'", str1, "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]" + "'", str2, "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 97, 35]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        int[] intArray7 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark8 = new org.apache.commons.io.ByteOrderMark("hi!", intArray7);
        org.apache.commons.io.ByteOrderMark byteOrderMark9 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray7);
        org.apache.commons.io.ByteOrderMark byteOrderMark10 = new org.apache.commons.io.ByteOrderMark("hi!", intArray7);
        org.apache.commons.io.ByteOrderMark byteOrderMark11 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray7);
        org.apache.commons.io.ByteOrderMark byteOrderMark12 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        boolean boolean14 = byteOrderMark12.equals((java.lang.Object) (-1L));
        java.lang.String str15 = byteOrderMark12.toString();
        java.lang.String str16 = byteOrderMark12.getCharsetName();
        boolean boolean17 = byteOrderMark11.equals((java.lang.Object) byteOrderMark12);
        java.lang.String str18 = byteOrderMark12.toString();
        byte[] byteArray19 = byteOrderMark12.getBytes();
        java.lang.Class<?> wildcardClass20 = byteOrderMark12.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(byteOrderMark12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ByteOrderMark[UTF-16LE: 0xFF,0xFE]" + "'", str15, "ByteOrderMark[UTF-16LE: 0xFF,0xFE]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTF-16LE" + "'", str16, "UTF-16LE");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ByteOrderMark[UTF-16LE: 0xFF,0xFE]" + "'", str18, "ByteOrderMark[UTF-16LE: 0xFF,0xFE]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[-1, -2]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        int[] intArray11 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark12 = new org.apache.commons.io.ByteOrderMark("hi!", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark13 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark14 = new org.apache.commons.io.ByteOrderMark("hi!", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark16 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[hi!: 0xA,0x61,0x23]", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark17 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark18 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark19 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xA,0x61,0x23]", intArray11);
        java.lang.String str20 = byteOrderMark19.toString();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, 35]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ByteOrderMark[ByteOrderMark[UTF-16LE: 0xA,0x61,0x23]: 0xA,0x61,0x23]" + "'", str20, "ByteOrderMark[ByteOrderMark[UTF-16LE: 0xA,0x61,0x23]: 0xA,0x61,0x23]");
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        int[] intArray6 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark7 = new org.apache.commons.io.ByteOrderMark("hi!", intArray6);
        org.apache.commons.io.ByteOrderMark byteOrderMark8 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray6);
        org.apache.commons.io.ByteOrderMark byteOrderMark9 = new org.apache.commons.io.ByteOrderMark("hi!", intArray6);
        int int10 = byteOrderMark9.length();
        int[] intArray15 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark16 = new org.apache.commons.io.ByteOrderMark("hi!", intArray15);
        java.lang.String str17 = byteOrderMark16.getCharsetName();
        java.lang.Object obj18 = null;
        boolean boolean19 = byteOrderMark16.equals(obj18);
        boolean boolean20 = byteOrderMark9.equals(obj18);
        org.apache.commons.io.ByteOrderMark byteOrderMark21 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        boolean boolean23 = byteOrderMark21.equals((java.lang.Object) (-1L));
        java.lang.String str24 = byteOrderMark21.getCharsetName();
        java.lang.String str25 = byteOrderMark21.getCharsetName();
        java.lang.String str26 = byteOrderMark21.getCharsetName();
        boolean boolean27 = byteOrderMark9.equals((java.lang.Object) byteOrderMark21);
        org.apache.commons.io.ByteOrderMark byteOrderMark28 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        boolean boolean30 = byteOrderMark28.equals((java.lang.Object) 1L);
        java.lang.String str31 = byteOrderMark28.getCharsetName();
        int int32 = byteOrderMark28.length();
        boolean boolean34 = byteOrderMark28.equals((java.lang.Object) (-1.0f));
        java.lang.String str35 = byteOrderMark28.toString();
        boolean boolean36 = byteOrderMark21.equals((java.lang.Object) str35);
        java.lang.String str37 = byteOrderMark21.getCharsetName();
        java.lang.String str38 = byteOrderMark21.toString();
        int int40 = byteOrderMark21.get((int) (short) 1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 97, 35]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(byteOrderMark21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "UTF-16LE" + "'", str24, "UTF-16LE");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "UTF-16LE" + "'", str25, "UTF-16LE");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "UTF-16LE" + "'", str26, "UTF-16LE");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(byteOrderMark28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "UTF-16LE" + "'", str31, "UTF-16LE");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "ByteOrderMark[UTF-16LE: 0xFF,0xFE]" + "'", str35, "ByteOrderMark[UTF-16LE: 0xFF,0xFE]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "UTF-16LE" + "'", str37, "UTF-16LE");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "ByteOrderMark[UTF-16LE: 0xFF,0xFE]" + "'", str38, "ByteOrderMark[UTF-16LE: 0xFF,0xFE]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 254 + "'", int40 == 254);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        org.apache.commons.io.ByteOrderMark byteOrderMark0 = org.apache.commons.io.ByteOrderMark.UTF_32BE;
        byte[] byteArray1 = byteOrderMark0.getBytes();
        java.lang.String str2 = byteOrderMark0.getCharsetName();
        org.apache.commons.io.ByteOrderMark byteOrderMark3 = org.apache.commons.io.ByteOrderMark.UTF_8;
        int int5 = byteOrderMark3.get((int) (byte) 0);
        byte[] byteArray6 = byteOrderMark3.getBytes();
        byte[] byteArray7 = byteOrderMark3.getBytes();
        boolean boolean8 = byteOrderMark0.equals((java.lang.Object) byteOrderMark3);
        byte[] byteArray9 = byteOrderMark3.getBytes();
        java.lang.String str10 = byteOrderMark3.toString();
        java.lang.String str11 = byteOrderMark3.toString();
        java.lang.String str12 = byteOrderMark3.getCharsetName();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = byteOrderMark3.get(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrderMark0);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[0, 0, -2, -1]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTF-32BE" + "'", str2, "UTF-32BE");
        org.junit.Assert.assertNotNull(byteOrderMark3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 239 + "'", int5 == 239);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-17, -69, -65]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-17, -69, -65]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-17, -69, -65]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ByteOrderMark[UTF-8: 0xEF,0xBB,0xBF]" + "'", str10, "ByteOrderMark[UTF-8: 0xEF,0xBB,0xBF]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ByteOrderMark[UTF-8: 0xEF,0xBB,0xBF]" + "'", str11, "ByteOrderMark[UTF-8: 0xEF,0xBB,0xBF]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTF-8" + "'", str12, "UTF-8");
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        org.apache.commons.io.ByteOrderMark byteOrderMark0 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        byte[] byteArray1 = byteOrderMark0.getBytes();
        org.apache.commons.io.ByteOrderMark byteOrderMark2 = org.apache.commons.io.ByteOrderMark.UTF_32BE;
        byte[] byteArray3 = byteOrderMark2.getBytes();
        java.lang.String str4 = byteOrderMark2.getCharsetName();
        org.apache.commons.io.ByteOrderMark byteOrderMark5 = org.apache.commons.io.ByteOrderMark.UTF_8;
        int int7 = byteOrderMark5.get((int) (byte) 0);
        byte[] byteArray8 = byteOrderMark5.getBytes();
        byte[] byteArray9 = byteOrderMark5.getBytes();
        boolean boolean10 = byteOrderMark2.equals((java.lang.Object) byteOrderMark5);
        int[] intArray20 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark21 = new org.apache.commons.io.ByteOrderMark("hi!", intArray20);
        org.apache.commons.io.ByteOrderMark byteOrderMark22 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray20);
        org.apache.commons.io.ByteOrderMark byteOrderMark23 = new org.apache.commons.io.ByteOrderMark("hi!", intArray20);
        org.apache.commons.io.ByteOrderMark byteOrderMark24 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray20);
        org.apache.commons.io.ByteOrderMark byteOrderMark25 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray20);
        org.apache.commons.io.ByteOrderMark byteOrderMark26 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray20);
        boolean boolean27 = byteOrderMark2.equals((java.lang.Object) intArray20);
        org.apache.commons.io.ByteOrderMark byteOrderMark28 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        java.lang.String str29 = byteOrderMark28.getCharsetName();
        java.lang.Class<?> wildcardClass30 = byteOrderMark28.getClass();
        boolean boolean31 = byteOrderMark2.equals((java.lang.Object) wildcardClass30);
        int int32 = byteOrderMark2.length();
        int int33 = byteOrderMark2.length();
        java.lang.String str34 = byteOrderMark2.toString();
        byte[] byteArray35 = byteOrderMark2.getBytes();
        boolean boolean36 = byteOrderMark0.equals((java.lang.Object) byteOrderMark2);
        java.lang.String str37 = byteOrderMark2.toString();
        org.apache.commons.io.ByteOrderMark byteOrderMark38 = org.apache.commons.io.ByteOrderMark.UTF_32BE;
        byte[] byteArray39 = byteOrderMark38.getBytes();
        int int40 = byteOrderMark38.length();
        int[] intArray48 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark49 = new org.apache.commons.io.ByteOrderMark("hi!", intArray48);
        org.apache.commons.io.ByteOrderMark byteOrderMark50 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray48);
        org.apache.commons.io.ByteOrderMark byteOrderMark51 = new org.apache.commons.io.ByteOrderMark("hi!", intArray48);
        org.apache.commons.io.ByteOrderMark byteOrderMark52 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray48);
        java.lang.String str53 = byteOrderMark52.toString();
        int int54 = byteOrderMark52.length();
        boolean boolean55 = byteOrderMark38.equals((java.lang.Object) int54);
        java.lang.String str56 = byteOrderMark38.getCharsetName();
        java.lang.String str57 = byteOrderMark38.getCharsetName();
        boolean boolean58 = byteOrderMark2.equals((java.lang.Object) byteOrderMark38);
        org.junit.Assert.assertNotNull(byteOrderMark0);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1, -2]");
        org.junit.Assert.assertNotNull(byteOrderMark2);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, -2, -1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF-32BE" + "'", str4, "UTF-32BE");
        org.junit.Assert.assertNotNull(byteOrderMark5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 239 + "'", int7 == 239);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-17, -69, -65]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-17, -69, -65]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(byteOrderMark28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "UTF-16LE" + "'", str29, "UTF-16LE");
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 4 + "'", int32 == 4);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 4 + "'", int33 == 4);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]" + "'", str34, "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]");
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[0, 0, -2, -1]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]" + "'", str37, "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]");
        org.junit.Assert.assertNotNull(byteOrderMark38);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[0, 0, -2, -1]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 4 + "'", int40 == 4);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[10, 97, 35]");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "ByteOrderMark[ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]: 0xA,0x61,0x23]" + "'", str53, "ByteOrderMark[ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]: 0xA,0x61,0x23]");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 3 + "'", int54 == 3);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "UTF-32BE" + "'", str56, "UTF-32BE");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "UTF-32BE" + "'", str57, "UTF-32BE");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        org.apache.commons.io.ByteOrderMark byteOrderMark0 = org.apache.commons.io.ByteOrderMark.UTF_32BE;
        java.lang.String str1 = byteOrderMark0.toString();
        java.lang.String str2 = byteOrderMark0.toString();
        int int4 = byteOrderMark0.get(2);
        java.lang.String str5 = byteOrderMark0.toString();
        int int7 = byteOrderMark0.get(1);
        byte[] byteArray8 = byteOrderMark0.getBytes();
        java.lang.String str9 = byteOrderMark0.toString();
        byte[] byteArray10 = byteOrderMark0.getBytes();
        byte[] byteArray11 = byteOrderMark0.getBytes();
        org.junit.Assert.assertNotNull(byteOrderMark0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]" + "'", str1, "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]" + "'", str2, "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 254 + "'", int4 == 254);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]" + "'", str5, "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 0, -2, -1]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]" + "'", str9, "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[0, 0, -2, -1]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[0, 0, -2, -1]");
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        int[] intArray11 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark12 = new org.apache.commons.io.ByteOrderMark("hi!", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark13 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark14 = new org.apache.commons.io.ByteOrderMark("hi!", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark16 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]: 0xA,0x61,0x23]", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark17 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0xA,0x61,0x23]", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark18 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark19 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[ByteOrderMark[UTF-8: 0xEF,0xBB,0xBF]: 0xA,0x61,0x23]: 0xA,0x61,0x23]", intArray11);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = byteOrderMark19.get(97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, 35]");
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        org.apache.commons.io.ByteOrderMark byteOrderMark0 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        int int2 = byteOrderMark0.get(0);
        boolean boolean4 = byteOrderMark0.equals((java.lang.Object) (short) 0);
        org.apache.commons.io.ByteOrderMark byteOrderMark5 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        boolean boolean7 = byteOrderMark5.equals((java.lang.Object) 1L);
        java.lang.String str8 = byteOrderMark5.getCharsetName();
        int int9 = byteOrderMark5.length();
        boolean boolean11 = byteOrderMark5.equals((java.lang.Object) (byte) -1);
        byte[] byteArray12 = byteOrderMark5.getBytes();
        java.lang.String str13 = byteOrderMark5.getCharsetName();
        byte[] byteArray14 = byteOrderMark5.getBytes();
        int int16 = byteOrderMark5.get((int) (short) 0);
        org.apache.commons.io.ByteOrderMark byteOrderMark17 = org.apache.commons.io.ByteOrderMark.UTF_32BE;
        byte[] byteArray18 = byteOrderMark17.getBytes();
        java.lang.String str19 = byteOrderMark17.getCharsetName();
        org.apache.commons.io.ByteOrderMark byteOrderMark20 = org.apache.commons.io.ByteOrderMark.UTF_8;
        int int22 = byteOrderMark20.get((int) (byte) 0);
        byte[] byteArray23 = byteOrderMark20.getBytes();
        byte[] byteArray24 = byteOrderMark20.getBytes();
        boolean boolean25 = byteOrderMark17.equals((java.lang.Object) byteOrderMark20);
        boolean boolean26 = byteOrderMark5.equals((java.lang.Object) byteOrderMark17);
        boolean boolean27 = byteOrderMark0.equals((java.lang.Object) boolean26);
        byte[] byteArray28 = byteOrderMark0.getBytes();
        java.lang.String str29 = byteOrderMark0.getCharsetName();
        byte[] byteArray30 = byteOrderMark0.getBytes();
        org.junit.Assert.assertNotNull(byteOrderMark0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 255 + "'", int2 == 255);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteOrderMark5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF-16LE" + "'", str8, "UTF-16LE");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[-1, -2]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTF-16LE" + "'", str13, "UTF-16LE");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[-1, -2]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 255 + "'", int16 == 255);
        org.junit.Assert.assertNotNull(byteOrderMark17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0, 0, -2, -1]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "UTF-32BE" + "'", str19, "UTF-32BE");
        org.junit.Assert.assertNotNull(byteOrderMark20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 239 + "'", int22 == 239);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[-17, -69, -65]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[-17, -69, -65]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[-1, -2]");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "UTF-16LE" + "'", str29, "UTF-16LE");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[-1, -2]");
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        int[] intArray12 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark13 = new org.apache.commons.io.ByteOrderMark("hi!", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark14 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("hi!", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark16 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark17 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[hi!: 0xA,0x61,0x23]", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark18 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xA,0x61,0x23]", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark19 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-8: 0xEF,0xBB,0xBF]", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark20 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[UTF-16BE: 0xFE,0xFF]: 0xA,0x61,0x23]", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark21 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray12);
        byte[] byteArray22 = byteOrderMark21.getBytes();
        org.apache.commons.io.ByteOrderMark byteOrderMark23 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        boolean boolean25 = byteOrderMark23.equals((java.lang.Object) (-1L));
        java.lang.String str26 = byteOrderMark23.toString();
        boolean boolean27 = byteOrderMark21.equals((java.lang.Object) byteOrderMark23);
        java.lang.String str28 = byteOrderMark21.toString();
        java.lang.String str29 = byteOrderMark21.getCharsetName();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(byteOrderMark23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "ByteOrderMark[UTF-16LE: 0xFF,0xFE]" + "'", str26, "ByteOrderMark[UTF-16LE: 0xFF,0xFE]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "ByteOrderMark[ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]: 0xA,0x61,0x23]" + "'", str28, "ByteOrderMark[ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]: 0xA,0x61,0x23]");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]" + "'", str29, "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]");
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        int[] intArray5 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark6 = new org.apache.commons.io.ByteOrderMark("hi!", intArray5);
        org.apache.commons.io.ByteOrderMark byteOrderMark7 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[UTF-8: 0xEF,0xBB,0xBF]: 0xA,0x61,0x23]", intArray5);
        java.lang.String str8 = byteOrderMark7.toString();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 97, 35]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ByteOrderMark[ByteOrderMark[ByteOrderMark[UTF-8: 0xEF,0xBB,0xBF]: 0xA,0x61,0x23]: 0xA,0x61,0x23]" + "'", str8, "ByteOrderMark[ByteOrderMark[ByteOrderMark[UTF-8: 0xEF,0xBB,0xBF]: 0xA,0x61,0x23]: 0xA,0x61,0x23]");
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        int[] intArray13 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark14 = new org.apache.commons.io.ByteOrderMark("hi!", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark16 = new org.apache.commons.io.ByteOrderMark("hi!", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark17 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark18 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark19 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark20 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark21 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[UTF-8: 0xEF,0xBB,0xBF]: 0xA,0x61,0x23]", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark22 = new org.apache.commons.io.ByteOrderMark("UTF-8", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark23 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]: 0xA,0x61,0x23]", intArray13);
        byte[] byteArray24 = byteOrderMark23.getBytes();
        int int25 = byteOrderMark23.length();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        int[] intArray10 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark11 = new org.apache.commons.io.ByteOrderMark("hi!", intArray10);
        org.apache.commons.io.ByteOrderMark byteOrderMark12 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray10);
        org.apache.commons.io.ByteOrderMark byteOrderMark13 = new org.apache.commons.io.ByteOrderMark("hi!", intArray10);
        org.apache.commons.io.ByteOrderMark byteOrderMark14 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray10);
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("UTF-16BE", intArray10);
        org.apache.commons.io.ByteOrderMark byteOrderMark16 = new org.apache.commons.io.ByteOrderMark("UTF-16BE", intArray10);
        org.apache.commons.io.ByteOrderMark byteOrderMark17 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16BE: 0xFE,0xFF]", intArray10);
        java.lang.String str18 = byteOrderMark17.getCharsetName();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[10, 97, 35]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ByteOrderMark[UTF-16BE: 0xFE,0xFF]" + "'", str18, "ByteOrderMark[UTF-16BE: 0xFE,0xFF]");
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        int[] intArray12 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark13 = new org.apache.commons.io.ByteOrderMark("hi!", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark14 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("hi!", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark16 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark17 = new org.apache.commons.io.ByteOrderMark("UTF-16BE", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark18 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark19 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xA,0x61,0x23]", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark20 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xA,0x61,0x23]", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark21 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]: 0xFF]", intArray12);
        int int22 = byteOrderMark21.length();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        org.apache.commons.io.ByteOrderMark byteOrderMark0 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        boolean boolean2 = byteOrderMark0.equals((java.lang.Object) 1L);
        java.lang.String str3 = byteOrderMark0.getCharsetName();
        int int4 = byteOrderMark0.length();
        boolean boolean6 = byteOrderMark0.equals((java.lang.Object) (byte) -1);
        byte[] byteArray7 = byteOrderMark0.getBytes();
        java.lang.String str8 = byteOrderMark0.getCharsetName();
        byte[] byteArray9 = byteOrderMark0.getBytes();
        int int11 = byteOrderMark0.get((int) (short) 0);
        org.apache.commons.io.ByteOrderMark byteOrderMark12 = org.apache.commons.io.ByteOrderMark.UTF_8;
        boolean boolean13 = byteOrderMark0.equals((java.lang.Object) byteOrderMark12);
        byte[] byteArray14 = byteOrderMark0.getBytes();
        int[] intArray27 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark28 = new org.apache.commons.io.ByteOrderMark("hi!", intArray27);
        org.apache.commons.io.ByteOrderMark byteOrderMark29 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray27);
        org.apache.commons.io.ByteOrderMark byteOrderMark30 = new org.apache.commons.io.ByteOrderMark("hi!", intArray27);
        org.apache.commons.io.ByteOrderMark byteOrderMark31 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray27);
        org.apache.commons.io.ByteOrderMark byteOrderMark32 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray27);
        org.apache.commons.io.ByteOrderMark byteOrderMark33 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray27);
        org.apache.commons.io.ByteOrderMark byteOrderMark34 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray27);
        org.apache.commons.io.ByteOrderMark byteOrderMark35 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray27);
        org.apache.commons.io.ByteOrderMark byteOrderMark36 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray27);
        byte[] byteArray37 = byteOrderMark36.getBytes();
        boolean boolean38 = byteOrderMark0.equals((java.lang.Object) byteOrderMark36);
        // The following exception was thrown during execution in test generation
        try {
            int int40 = byteOrderMark36.get((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrderMark0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF-16LE" + "'", str3, "UTF-16LE");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -2]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF-16LE" + "'", str8, "UTF-16LE");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-1, -2]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 255 + "'", int11 == 255);
        org.junit.Assert.assertNotNull(byteOrderMark12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[-1, -2]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        int[] intArray16 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark17 = new org.apache.commons.io.ByteOrderMark("hi!", intArray16);
        org.apache.commons.io.ByteOrderMark byteOrderMark18 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray16);
        org.apache.commons.io.ByteOrderMark byteOrderMark19 = new org.apache.commons.io.ByteOrderMark("hi!", intArray16);
        org.apache.commons.io.ByteOrderMark byteOrderMark20 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray16);
        org.apache.commons.io.ByteOrderMark byteOrderMark21 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray16);
        org.apache.commons.io.ByteOrderMark byteOrderMark22 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray16);
        org.apache.commons.io.ByteOrderMark byteOrderMark23 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray16);
        org.apache.commons.io.ByteOrderMark byteOrderMark24 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]: 0xA,0x61,0x23]", intArray16);
        org.apache.commons.io.ByteOrderMark byteOrderMark25 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[UTF-32BE: 0xA,0x61,0x23]: 0xA,0x61,0x23]", intArray16);
        org.apache.commons.io.ByteOrderMark byteOrderMark26 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16BE: 0xFE,0xFF]", intArray16);
        org.apache.commons.io.ByteOrderMark byteOrderMark27 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[UTF-8: 0xEF,0xBB,0xBF]: 0xA,0x61,0x23]", intArray16);
        org.apache.commons.io.ByteOrderMark byteOrderMark28 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[UTF-8: 0xEF,0xBB,0xBF]: 0xA,0x61,0x23]", intArray16);
        org.apache.commons.io.ByteOrderMark byteOrderMark29 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray16);
        java.lang.Class<?> wildcardClass30 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        int[] intArray3 = new int[] { 255 };
        org.apache.commons.io.ByteOrderMark byteOrderMark4 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0xA,0x61,0x23]", intArray3);
        org.apache.commons.io.ByteOrderMark byteOrderMark5 = new org.apache.commons.io.ByteOrderMark("UTF-8", intArray3);
        java.lang.String str6 = byteOrderMark5.toString();
        int int7 = byteOrderMark5.length();
        int int8 = byteOrderMark5.length();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[255]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ByteOrderMark[UTF-8: 0xFF]" + "'", str6, "ByteOrderMark[UTF-8: 0xFF]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        int[] intArray15 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark16 = new org.apache.commons.io.ByteOrderMark("hi!", intArray15);
        org.apache.commons.io.ByteOrderMark byteOrderMark17 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray15);
        org.apache.commons.io.ByteOrderMark byteOrderMark18 = new org.apache.commons.io.ByteOrderMark("hi!", intArray15);
        org.apache.commons.io.ByteOrderMark byteOrderMark19 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray15);
        org.apache.commons.io.ByteOrderMark byteOrderMark20 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[hi!: 0xA,0x61,0x23]", intArray15);
        org.apache.commons.io.ByteOrderMark byteOrderMark21 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xA,0x61,0x23]", intArray15);
        org.apache.commons.io.ByteOrderMark byteOrderMark22 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-8: 0xEF,0xBB,0xBF]", intArray15);
        org.apache.commons.io.ByteOrderMark byteOrderMark23 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[UTF-16BE: 0xFE,0xFF]: 0xA,0x61,0x23]", intArray15);
        int[] intArray35 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark36 = new org.apache.commons.io.ByteOrderMark("hi!", intArray35);
        org.apache.commons.io.ByteOrderMark byteOrderMark37 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray35);
        org.apache.commons.io.ByteOrderMark byteOrderMark38 = new org.apache.commons.io.ByteOrderMark("hi!", intArray35);
        org.apache.commons.io.ByteOrderMark byteOrderMark39 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray35);
        org.apache.commons.io.ByteOrderMark byteOrderMark40 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray35);
        org.apache.commons.io.ByteOrderMark byteOrderMark41 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray35);
        org.apache.commons.io.ByteOrderMark byteOrderMark42 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray35);
        org.apache.commons.io.ByteOrderMark byteOrderMark43 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16BE: 0xFE,0xFF]", intArray35);
        boolean boolean44 = byteOrderMark23.equals((java.lang.Object) intArray35);
        org.apache.commons.io.ByteOrderMark byteOrderMark45 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]: 0xA,0x61,0x23]: 0xA,0x61,0x23]", intArray35);
        org.apache.commons.io.ByteOrderMark byteOrderMark46 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray35);
        org.apache.commons.io.ByteOrderMark byteOrderMark47 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[ByteOrderMark[ByteOrderMark[UTF-16LE: 0xFF,0xFE]: 0xA,0x61,0x23]: 0xA,0x61,0x23]: 0xA,0x61,0x23]", intArray35);
        org.apache.commons.io.ByteOrderMark byteOrderMark48 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[UTF-16LE: 0xA,0x61,0x23]: 0xFF]", intArray35);
        java.lang.String str49 = byteOrderMark48.getCharsetName();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "ByteOrderMark[ByteOrderMark[UTF-16LE: 0xA,0x61,0x23]: 0xFF]" + "'", str49, "ByteOrderMark[ByteOrderMark[UTF-16LE: 0xA,0x61,0x23]: 0xFF]");
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        org.apache.commons.io.ByteOrderMark byteOrderMark2 = org.apache.commons.io.ByteOrderMark.UTF_8;
        int int4 = byteOrderMark2.get((int) (byte) 0);
        int[] intArray14 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("hi!", intArray14);
        org.apache.commons.io.ByteOrderMark byteOrderMark16 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray14);
        org.apache.commons.io.ByteOrderMark byteOrderMark17 = new org.apache.commons.io.ByteOrderMark("hi!", intArray14);
        org.apache.commons.io.ByteOrderMark byteOrderMark18 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray14);
        org.apache.commons.io.ByteOrderMark byteOrderMark19 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray14);
        org.apache.commons.io.ByteOrderMark byteOrderMark20 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray14);
        int int21 = byteOrderMark20.length();
        boolean boolean22 = byteOrderMark2.equals((java.lang.Object) byteOrderMark20);
        int[] intArray32 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark33 = new org.apache.commons.io.ByteOrderMark("hi!", intArray32);
        org.apache.commons.io.ByteOrderMark byteOrderMark34 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray32);
        org.apache.commons.io.ByteOrderMark byteOrderMark35 = new org.apache.commons.io.ByteOrderMark("hi!", intArray32);
        org.apache.commons.io.ByteOrderMark byteOrderMark36 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray32);
        org.apache.commons.io.ByteOrderMark byteOrderMark37 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray32);
        org.apache.commons.io.ByteOrderMark byteOrderMark38 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray32);
        boolean boolean39 = byteOrderMark2.equals((java.lang.Object) intArray32);
        org.apache.commons.io.ByteOrderMark byteOrderMark40 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-8: 0xEF,0xBB,0xBF]", intArray32);
        org.apache.commons.io.ByteOrderMark byteOrderMark41 = new org.apache.commons.io.ByteOrderMark("hi!", intArray32);
        java.lang.String str42 = byteOrderMark41.getCharsetName();
        byte[] byteArray43 = byteOrderMark41.getBytes();
        org.junit.Assert.assertNotNull(byteOrderMark2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 239 + "'", int4 == 239);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[10, 97, 35]");
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        int[] intArray7 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark8 = new org.apache.commons.io.ByteOrderMark("hi!", intArray7);
        org.apache.commons.io.ByteOrderMark byteOrderMark9 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray7);
        org.apache.commons.io.ByteOrderMark byteOrderMark10 = new org.apache.commons.io.ByteOrderMark("hi!", intArray7);
        org.apache.commons.io.ByteOrderMark byteOrderMark11 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray7);
        int int12 = byteOrderMark11.length();
        int[] intArray22 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark23 = new org.apache.commons.io.ByteOrderMark("hi!", intArray22);
        org.apache.commons.io.ByteOrderMark byteOrderMark24 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray22);
        org.apache.commons.io.ByteOrderMark byteOrderMark25 = new org.apache.commons.io.ByteOrderMark("hi!", intArray22);
        org.apache.commons.io.ByteOrderMark byteOrderMark26 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray22);
        org.apache.commons.io.ByteOrderMark byteOrderMark27 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray22);
        org.apache.commons.io.ByteOrderMark byteOrderMark28 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray22);
        boolean boolean29 = byteOrderMark11.equals((java.lang.Object) byteOrderMark28);
        byte[] byteArray30 = byteOrderMark11.getBytes();
        int int31 = byteOrderMark11.length();
        int int32 = byteOrderMark11.length();
        byte[] byteArray33 = byteOrderMark11.getBytes();
        java.lang.Class<?> wildcardClass34 = byteOrderMark11.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        org.apache.commons.io.ByteOrderMark byteOrderMark0 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        boolean boolean2 = byteOrderMark0.equals((java.lang.Object) 1L);
        java.lang.String str3 = byteOrderMark0.getCharsetName();
        int int4 = byteOrderMark0.length();
        java.lang.String str5 = byteOrderMark0.getCharsetName();
        byte[] byteArray6 = byteOrderMark0.getBytes();
        org.apache.commons.io.ByteOrderMark byteOrderMark7 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        boolean boolean9 = byteOrderMark7.equals((java.lang.Object) (-1L));
        java.lang.String str10 = byteOrderMark7.getCharsetName();
        java.lang.String str11 = byteOrderMark7.getCharsetName();
        java.lang.String str12 = byteOrderMark7.getCharsetName();
        java.lang.String str13 = byteOrderMark7.getCharsetName();
        boolean boolean14 = byteOrderMark0.equals((java.lang.Object) str13);
        int[] intArray29 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark30 = new org.apache.commons.io.ByteOrderMark("hi!", intArray29);
        org.apache.commons.io.ByteOrderMark byteOrderMark31 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray29);
        org.apache.commons.io.ByteOrderMark byteOrderMark32 = new org.apache.commons.io.ByteOrderMark("hi!", intArray29);
        org.apache.commons.io.ByteOrderMark byteOrderMark33 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray29);
        org.apache.commons.io.ByteOrderMark byteOrderMark34 = new org.apache.commons.io.ByteOrderMark("hi!", intArray29);
        org.apache.commons.io.ByteOrderMark byteOrderMark35 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[hi!: 0xA,0x61,0x23]", intArray29);
        org.apache.commons.io.ByteOrderMark byteOrderMark36 = new org.apache.commons.io.ByteOrderMark("UTF-8", intArray29);
        org.apache.commons.io.ByteOrderMark byteOrderMark37 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]: 0xA,0x61,0x23]", intArray29);
        org.apache.commons.io.ByteOrderMark byteOrderMark38 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-8: 0xEF,0xBB,0xBF]", intArray29);
        org.apache.commons.io.ByteOrderMark byteOrderMark39 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0xA,0x61,0x23]", intArray29);
        org.apache.commons.io.ByteOrderMark byteOrderMark40 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[hi!: 0xA,0x61,0x23]: 0xA,0x61,0x23]", intArray29);
        int[] intArray52 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark53 = new org.apache.commons.io.ByteOrderMark("hi!", intArray52);
        org.apache.commons.io.ByteOrderMark byteOrderMark54 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray52);
        org.apache.commons.io.ByteOrderMark byteOrderMark55 = new org.apache.commons.io.ByteOrderMark("hi!", intArray52);
        org.apache.commons.io.ByteOrderMark byteOrderMark56 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray52);
        org.apache.commons.io.ByteOrderMark byteOrderMark57 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray52);
        org.apache.commons.io.ByteOrderMark byteOrderMark58 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray52);
        org.apache.commons.io.ByteOrderMark byteOrderMark59 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray52);
        org.apache.commons.io.ByteOrderMark byteOrderMark60 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray52);
        org.apache.commons.io.ByteOrderMark byteOrderMark61 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        boolean boolean63 = byteOrderMark61.equals((java.lang.Object) 1L);
        java.lang.String str64 = byteOrderMark61.getCharsetName();
        int int65 = byteOrderMark61.length();
        boolean boolean67 = byteOrderMark61.equals((java.lang.Object) (-1.0f));
        int int68 = byteOrderMark61.length();
        java.lang.String str69 = byteOrderMark61.toString();
        java.lang.Class<?> wildcardClass70 = byteOrderMark61.getClass();
        boolean boolean71 = byteOrderMark60.equals((java.lang.Object) byteOrderMark61);
        boolean boolean72 = byteOrderMark40.equals((java.lang.Object) byteOrderMark61);
        int int73 = byteOrderMark40.length();
        boolean boolean74 = byteOrderMark0.equals((java.lang.Object) int73);
        org.junit.Assert.assertNotNull(byteOrderMark0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF-16LE" + "'", str3, "UTF-16LE");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF-16LE" + "'", str5, "UTF-16LE");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, -2]");
        org.junit.Assert.assertNotNull(byteOrderMark7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTF-16LE" + "'", str10, "UTF-16LE");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTF-16LE" + "'", str11, "UTF-16LE");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTF-16LE" + "'", str12, "UTF-16LE");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTF-16LE" + "'", str13, "UTF-16LE");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(byteOrderMark61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "UTF-16LE" + "'", str64, "UTF-16LE");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 2 + "'", int65 == 2);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 2 + "'", int68 == 2);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "ByteOrderMark[UTF-16LE: 0xFF,0xFE]" + "'", str69, "ByteOrderMark[UTF-16LE: 0xFF,0xFE]");
        org.junit.Assert.assertNotNull(wildcardClass70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 3 + "'", int73 == 3);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        int[] intArray10 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark11 = new org.apache.commons.io.ByteOrderMark("hi!", intArray10);
        org.apache.commons.io.ByteOrderMark byteOrderMark12 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray10);
        org.apache.commons.io.ByteOrderMark byteOrderMark13 = new org.apache.commons.io.ByteOrderMark("hi!", intArray10);
        org.apache.commons.io.ByteOrderMark byteOrderMark14 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray10);
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("UTF-16BE", intArray10);
        java.lang.String str16 = byteOrderMark15.getCharsetName();
        java.lang.String str17 = byteOrderMark15.getCharsetName();
        int int18 = byteOrderMark15.length();
        int[] intArray31 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark32 = new org.apache.commons.io.ByteOrderMark("hi!", intArray31);
        org.apache.commons.io.ByteOrderMark byteOrderMark33 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray31);
        org.apache.commons.io.ByteOrderMark byteOrderMark34 = new org.apache.commons.io.ByteOrderMark("hi!", intArray31);
        org.apache.commons.io.ByteOrderMark byteOrderMark35 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray31);
        org.apache.commons.io.ByteOrderMark byteOrderMark36 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray31);
        org.apache.commons.io.ByteOrderMark byteOrderMark37 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray31);
        org.apache.commons.io.ByteOrderMark byteOrderMark38 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray31);
        org.apache.commons.io.ByteOrderMark byteOrderMark39 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16BE: 0xFE,0xFF]", intArray31);
        org.apache.commons.io.ByteOrderMark byteOrderMark40 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]: 0xA,0x61,0x23]", intArray31);
        boolean boolean41 = byteOrderMark15.equals((java.lang.Object) intArray31);
        org.apache.commons.io.ByteOrderMark byteOrderMark42 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-8: 0xA,0x61,0x23]", intArray31);
        org.apache.commons.io.ByteOrderMark byteOrderMark43 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[hi!: 0xFF,0x0,0xFE]", intArray31);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[10, 97, 35]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTF-16BE" + "'", str16, "UTF-16BE");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTF-16BE" + "'", str17, "UTF-16BE");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        int[] intArray7 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark8 = new org.apache.commons.io.ByteOrderMark("hi!", intArray7);
        org.apache.commons.io.ByteOrderMark byteOrderMark9 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray7);
        org.apache.commons.io.ByteOrderMark byteOrderMark10 = new org.apache.commons.io.ByteOrderMark("hi!", intArray7);
        org.apache.commons.io.ByteOrderMark byteOrderMark11 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray7);
        byte[] byteArray12 = byteOrderMark11.getBytes();
        byte[] byteArray13 = byteOrderMark11.getBytes();
        org.apache.commons.io.ByteOrderMark byteOrderMark14 = org.apache.commons.io.ByteOrderMark.UTF_16BE;
        java.lang.Object obj15 = null;
        boolean boolean16 = byteOrderMark14.equals(obj15);
        int int17 = byteOrderMark14.length();
        boolean boolean19 = byteOrderMark14.equals((java.lang.Object) 0L);
        int int20 = byteOrderMark14.length();
        int int21 = byteOrderMark14.length();
        int[] intArray28 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark29 = new org.apache.commons.io.ByteOrderMark("hi!", intArray28);
        org.apache.commons.io.ByteOrderMark byteOrderMark30 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray28);
        org.apache.commons.io.ByteOrderMark byteOrderMark31 = new org.apache.commons.io.ByteOrderMark("hi!", intArray28);
        boolean boolean32 = byteOrderMark14.equals((java.lang.Object) intArray28);
        boolean boolean33 = byteOrderMark11.equals((java.lang.Object) intArray28);
        java.lang.String str34 = byteOrderMark11.toString();
        java.lang.String str35 = byteOrderMark11.toString();
        java.lang.String str36 = byteOrderMark11.getCharsetName();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(byteOrderMark14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "ByteOrderMark[ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]: 0xA,0x61,0x23]" + "'", str34, "ByteOrderMark[ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]: 0xA,0x61,0x23]");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "ByteOrderMark[ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]: 0xA,0x61,0x23]" + "'", str35, "ByteOrderMark[ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]: 0xA,0x61,0x23]");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]" + "'", str36, "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]");
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        org.apache.commons.io.ByteOrderMark byteOrderMark0 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        boolean boolean2 = byteOrderMark0.equals((java.lang.Object) (-1L));
        int int3 = byteOrderMark0.length();
        int int4 = byteOrderMark0.length();
        int int5 = byteOrderMark0.length();
        org.junit.Assert.assertNotNull(byteOrderMark0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        org.apache.commons.io.ByteOrderMark byteOrderMark3 = org.apache.commons.io.ByteOrderMark.UTF_32BE;
        byte[] byteArray4 = byteOrderMark3.getBytes();
        int[] intArray14 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("hi!", intArray14);
        org.apache.commons.io.ByteOrderMark byteOrderMark16 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray14);
        org.apache.commons.io.ByteOrderMark byteOrderMark17 = new org.apache.commons.io.ByteOrderMark("hi!", intArray14);
        org.apache.commons.io.ByteOrderMark byteOrderMark18 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray14);
        org.apache.commons.io.ByteOrderMark byteOrderMark19 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[hi!: 0xA,0x61,0x23]", intArray14);
        org.apache.commons.io.ByteOrderMark byteOrderMark20 = new org.apache.commons.io.ByteOrderMark("hi!", intArray14);
        boolean boolean21 = byteOrderMark3.equals((java.lang.Object) intArray14);
        org.apache.commons.io.ByteOrderMark byteOrderMark22 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xA,0x61,0x23]", intArray14);
        org.apache.commons.io.ByteOrderMark byteOrderMark23 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16BE: 0xA,0x61,0x23]", intArray14);
        org.apache.commons.io.ByteOrderMark byteOrderMark24 = new org.apache.commons.io.ByteOrderMark("UTF-16BE", intArray14);
        int[] intArray34 = new int[] { (byte) 0, 10, (-1) };
        org.apache.commons.io.ByteOrderMark byteOrderMark35 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[hi!: 0xA,0x61,0x23]", intArray34);
        org.apache.commons.io.ByteOrderMark byteOrderMark36 = new org.apache.commons.io.ByteOrderMark("UTF-16BE", intArray34);
        org.apache.commons.io.ByteOrderMark byteOrderMark37 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[UTF-16BE: 0xFE,0xFF]: 0xA,0xFE,0x64]", intArray34);
        org.apache.commons.io.ByteOrderMark byteOrderMark38 = new org.apache.commons.io.ByteOrderMark("UTF-32LE", intArray34);
        org.apache.commons.io.ByteOrderMark byteOrderMark39 = new org.apache.commons.io.ByteOrderMark("UTF-32LE", intArray34);
        org.apache.commons.io.ByteOrderMark byteOrderMark40 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16BE: 0xFE,0xFF]", intArray34);
        boolean boolean41 = byteOrderMark24.equals((java.lang.Object) "ByteOrderMark[UTF-16BE: 0xFE,0xFF]");
        java.lang.Class<?> wildcardClass42 = byteOrderMark24.getClass();
        org.junit.Assert.assertNotNull(byteOrderMark3);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, -2, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[0, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        org.apache.commons.io.ByteOrderMark byteOrderMark0 = org.apache.commons.io.ByteOrderMark.UTF_32BE;
        int int1 = byteOrderMark0.length();
        boolean boolean3 = byteOrderMark0.equals((java.lang.Object) "UTF-32BE");
        byte[] byteArray4 = byteOrderMark0.getBytes();
        int[] intArray14 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("hi!", intArray14);
        org.apache.commons.io.ByteOrderMark byteOrderMark16 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray14);
        org.apache.commons.io.ByteOrderMark byteOrderMark17 = new org.apache.commons.io.ByteOrderMark("hi!", intArray14);
        org.apache.commons.io.ByteOrderMark byteOrderMark18 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray14);
        org.apache.commons.io.ByteOrderMark byteOrderMark19 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray14);
        org.apache.commons.io.ByteOrderMark byteOrderMark20 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray14);
        int int21 = byteOrderMark20.length();
        java.lang.String str22 = byteOrderMark20.getCharsetName();
        byte[] byteArray23 = byteOrderMark20.getBytes();
        java.lang.String str24 = byteOrderMark20.toString();
        boolean boolean25 = byteOrderMark0.equals((java.lang.Object) byteOrderMark20);
        java.lang.String str26 = byteOrderMark0.toString();
        int int28 = byteOrderMark0.get(0);
        org.junit.Assert.assertNotNull(byteOrderMark0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, -2, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]" + "'", str22, "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[10, 97, 35]");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "ByteOrderMark[ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]: 0xA,0x61,0x23]" + "'", str24, "ByteOrderMark[ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]: 0xA,0x61,0x23]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]" + "'", str26, "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        int[] intArray10 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark11 = new org.apache.commons.io.ByteOrderMark("hi!", intArray10);
        org.apache.commons.io.ByteOrderMark byteOrderMark12 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray10);
        org.apache.commons.io.ByteOrderMark byteOrderMark13 = new org.apache.commons.io.ByteOrderMark("hi!", intArray10);
        org.apache.commons.io.ByteOrderMark byteOrderMark14 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray10);
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray10);
        org.apache.commons.io.ByteOrderMark byteOrderMark16 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray10);
        org.apache.commons.io.ByteOrderMark byteOrderMark17 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray10);
        java.lang.String str18 = byteOrderMark17.getCharsetName();
        int int19 = byteOrderMark17.length();
        byte[] byteArray20 = byteOrderMark17.getBytes();
        int int22 = byteOrderMark17.get((int) (byte) 1);
        java.lang.String str23 = byteOrderMark17.getCharsetName();
        java.lang.String str24 = byteOrderMark17.toString();
        java.lang.String str25 = byteOrderMark17.toString();
        byte[] byteArray26 = byteOrderMark17.getBytes();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[10, 97, 35]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ByteOrderMark[UTF-16LE: 0xFF,0xFE]" + "'", str18, "ByteOrderMark[UTF-16LE: 0xFF,0xFE]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "ByteOrderMark[UTF-16LE: 0xFF,0xFE]" + "'", str23, "ByteOrderMark[UTF-16LE: 0xFF,0xFE]");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "ByteOrderMark[ByteOrderMark[UTF-16LE: 0xFF,0xFE]: 0xA,0x61,0x23]" + "'", str24, "ByteOrderMark[ByteOrderMark[UTF-16LE: 0xFF,0xFE]: 0xA,0x61,0x23]");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "ByteOrderMark[ByteOrderMark[UTF-16LE: 0xFF,0xFE]: 0xA,0x61,0x23]" + "'", str25, "ByteOrderMark[ByteOrderMark[UTF-16LE: 0xFF,0xFE]: 0xA,0x61,0x23]");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[10, 97, 35]");
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        int[] intArray10 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark11 = new org.apache.commons.io.ByteOrderMark("hi!", intArray10);
        org.apache.commons.io.ByteOrderMark byteOrderMark12 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray10);
        org.apache.commons.io.ByteOrderMark byteOrderMark13 = new org.apache.commons.io.ByteOrderMark("hi!", intArray10);
        org.apache.commons.io.ByteOrderMark byteOrderMark14 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray10);
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray10);
        org.apache.commons.io.ByteOrderMark byteOrderMark16 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0xA,0x61,0x23]", intArray10);
        org.apache.commons.io.ByteOrderMark byteOrderMark17 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[UTF-16BE: 0xFE,0xFF]: 0xA,0xFE,0x64]", intArray10);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[10, 97, 35]");
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        org.apache.commons.io.ByteOrderMark byteOrderMark0 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        boolean boolean2 = byteOrderMark0.equals((java.lang.Object) 1L);
        java.lang.String str3 = byteOrderMark0.getCharsetName();
        int int4 = byteOrderMark0.length();
        java.lang.String str5 = byteOrderMark0.getCharsetName();
        byte[] byteArray6 = byteOrderMark0.getBytes();
        org.apache.commons.io.ByteOrderMark byteOrderMark7 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        int int9 = byteOrderMark7.get(0);
        byte[] byteArray10 = byteOrderMark7.getBytes();
        byte[] byteArray11 = byteOrderMark7.getBytes();
        org.apache.commons.io.ByteOrderMark byteOrderMark12 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        boolean boolean14 = byteOrderMark12.equals((java.lang.Object) 1L);
        java.lang.String str15 = byteOrderMark12.getCharsetName();
        boolean boolean16 = byteOrderMark7.equals((java.lang.Object) byteOrderMark12);
        int int17 = byteOrderMark12.length();
        java.lang.String str18 = byteOrderMark12.toString();
        boolean boolean19 = byteOrderMark0.equals((java.lang.Object) str18);
        java.lang.String str20 = byteOrderMark0.getCharsetName();
        java.lang.String str21 = byteOrderMark0.getCharsetName();
        byte[] byteArray22 = byteOrderMark0.getBytes();
        org.junit.Assert.assertNotNull(byteOrderMark0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF-16LE" + "'", str3, "UTF-16LE");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF-16LE" + "'", str5, "UTF-16LE");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, -2]");
        org.junit.Assert.assertNotNull(byteOrderMark7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 255 + "'", int9 == 255);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-1, -2]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-1, -2]");
        org.junit.Assert.assertNotNull(byteOrderMark12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTF-16LE" + "'", str15, "UTF-16LE");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ByteOrderMark[UTF-16LE: 0xFF,0xFE]" + "'", str18, "ByteOrderMark[UTF-16LE: 0xFF,0xFE]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "UTF-16LE" + "'", str20, "UTF-16LE");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "UTF-16LE" + "'", str21, "UTF-16LE");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[-1, -2]");
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        org.apache.commons.io.ByteOrderMark byteOrderMark0 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        int int2 = byteOrderMark0.get(0);
        int int3 = byteOrderMark0.length();
        java.lang.String str4 = byteOrderMark0.getCharsetName();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = byteOrderMark0.get((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrderMark0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 255 + "'", int2 == 255);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF-16LE" + "'", str4, "UTF-16LE");
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        org.apache.commons.io.ByteOrderMark byteOrderMark0 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        boolean boolean2 = byteOrderMark0.equals((java.lang.Object) 1L);
        java.lang.String str3 = byteOrderMark0.getCharsetName();
        org.apache.commons.io.ByteOrderMark byteOrderMark4 = org.apache.commons.io.ByteOrderMark.UTF_16BE;
        boolean boolean5 = byteOrderMark0.equals((java.lang.Object) byteOrderMark4);
        byte[] byteArray6 = byteOrderMark4.getBytes();
        int int7 = byteOrderMark4.length();
        java.lang.String str8 = byteOrderMark4.getCharsetName();
        int int9 = byteOrderMark4.length();
        byte[] byteArray10 = byteOrderMark4.getBytes();
        int[] intArray21 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark22 = new org.apache.commons.io.ByteOrderMark("hi!", intArray21);
        org.apache.commons.io.ByteOrderMark byteOrderMark23 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray21);
        org.apache.commons.io.ByteOrderMark byteOrderMark24 = new org.apache.commons.io.ByteOrderMark("hi!", intArray21);
        org.apache.commons.io.ByteOrderMark byteOrderMark25 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray21);
        org.apache.commons.io.ByteOrderMark byteOrderMark26 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray21);
        org.apache.commons.io.ByteOrderMark byteOrderMark27 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray21);
        org.apache.commons.io.ByteOrderMark byteOrderMark28 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xA,0x61,0x23]", intArray21);
        java.lang.String str29 = byteOrderMark28.getCharsetName();
        java.lang.String str30 = byteOrderMark28.getCharsetName();
        int[] intArray40 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark41 = new org.apache.commons.io.ByteOrderMark("hi!", intArray40);
        org.apache.commons.io.ByteOrderMark byteOrderMark42 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray40);
        org.apache.commons.io.ByteOrderMark byteOrderMark43 = new org.apache.commons.io.ByteOrderMark("hi!", intArray40);
        org.apache.commons.io.ByteOrderMark byteOrderMark44 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray40);
        org.apache.commons.io.ByteOrderMark byteOrderMark45 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[hi!: 0xA,0x61,0x23]", intArray40);
        org.apache.commons.io.ByteOrderMark byteOrderMark46 = new org.apache.commons.io.ByteOrderMark("hi!", intArray40);
        boolean boolean47 = byteOrderMark28.equals((java.lang.Object) "hi!");
        org.apache.commons.io.ByteOrderMark byteOrderMark48 = org.apache.commons.io.ByteOrderMark.UTF_16BE;
        int int49 = byteOrderMark48.length();
        int int51 = byteOrderMark48.get((int) (short) 0);
        boolean boolean52 = byteOrderMark28.equals((java.lang.Object) byteOrderMark48);
        boolean boolean53 = byteOrderMark4.equals((java.lang.Object) byteOrderMark48);
        byte[] byteArray54 = byteOrderMark4.getBytes();
        org.junit.Assert.assertNotNull(byteOrderMark0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF-16LE" + "'", str3, "UTF-16LE");
        org.junit.Assert.assertNotNull(byteOrderMark4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-2, -1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF-16BE" + "'", str8, "UTF-16BE");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-2, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 97, 35]");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "ByteOrderMark[UTF-16LE: 0xA,0x61,0x23]" + "'", str29, "ByteOrderMark[UTF-16LE: 0xA,0x61,0x23]");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "ByteOrderMark[UTF-16LE: 0xA,0x61,0x23]" + "'", str30, "ByteOrderMark[UTF-16LE: 0xA,0x61,0x23]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(byteOrderMark48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 2 + "'", int49 == 2);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 254 + "'", int51 == 254);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray54), "[-2, -1]");
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        int[] intArray14 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("hi!", intArray14);
        org.apache.commons.io.ByteOrderMark byteOrderMark16 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray14);
        org.apache.commons.io.ByteOrderMark byteOrderMark17 = new org.apache.commons.io.ByteOrderMark("hi!", intArray14);
        org.apache.commons.io.ByteOrderMark byteOrderMark18 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray14);
        org.apache.commons.io.ByteOrderMark byteOrderMark19 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray14);
        org.apache.commons.io.ByteOrderMark byteOrderMark20 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray14);
        org.apache.commons.io.ByteOrderMark byteOrderMark21 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray14);
        org.apache.commons.io.ByteOrderMark byteOrderMark22 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[UTF-8: 0xEF,0xBB,0xBF]: 0xA,0x61,0x23]", intArray14);
        org.apache.commons.io.ByteOrderMark byteOrderMark23 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-8: 0xEF,0xBB,0xBF]", intArray14);
        org.apache.commons.io.ByteOrderMark byteOrderMark24 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[ByteOrderMark[UTF-16LE: 0xFF,0xFE]: 0xA,0x61,0x23]: 0xA,0x61,0x23]", intArray14);
        org.apache.commons.io.ByteOrderMark byteOrderMark25 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[UTF-8: 0xA,0x61,0x23]: 0xA,0x61,0x23]", intArray14);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[10, 97, 35]");
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        org.apache.commons.io.ByteOrderMark byteOrderMark0 = org.apache.commons.io.ByteOrderMark.UTF_32BE;
        byte[] byteArray1 = byteOrderMark0.getBytes();
        java.lang.String str2 = byteOrderMark0.getCharsetName();
        org.apache.commons.io.ByteOrderMark byteOrderMark3 = org.apache.commons.io.ByteOrderMark.UTF_8;
        int int5 = byteOrderMark3.get((int) (byte) 0);
        byte[] byteArray6 = byteOrderMark3.getBytes();
        byte[] byteArray7 = byteOrderMark3.getBytes();
        boolean boolean8 = byteOrderMark0.equals((java.lang.Object) byteOrderMark3);
        java.lang.String str9 = byteOrderMark3.toString();
        java.lang.String str10 = byteOrderMark3.toString();
        byte[] byteArray11 = byteOrderMark3.getBytes();
        org.junit.Assert.assertNotNull(byteOrderMark0);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[0, 0, -2, -1]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTF-32BE" + "'", str2, "UTF-32BE");
        org.junit.Assert.assertNotNull(byteOrderMark3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 239 + "'", int5 == 239);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-17, -69, -65]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-17, -69, -65]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ByteOrderMark[UTF-8: 0xEF,0xBB,0xBF]" + "'", str9, "ByteOrderMark[UTF-8: 0xEF,0xBB,0xBF]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ByteOrderMark[UTF-8: 0xEF,0xBB,0xBF]" + "'", str10, "ByteOrderMark[UTF-8: 0xEF,0xBB,0xBF]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-17, -69, -65]");
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        org.apache.commons.io.ByteOrderMark byteOrderMark0 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        boolean boolean2 = byteOrderMark0.equals((java.lang.Object) 1L);
        java.lang.String str3 = byteOrderMark0.getCharsetName();
        int int4 = byteOrderMark0.length();
        boolean boolean6 = byteOrderMark0.equals((java.lang.Object) (-1.0f));
        java.lang.String str7 = byteOrderMark0.toString();
        java.lang.String str8 = byteOrderMark0.getCharsetName();
        byte[] byteArray9 = byteOrderMark0.getBytes();
        org.junit.Assert.assertNotNull(byteOrderMark0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF-16LE" + "'", str3, "UTF-16LE");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ByteOrderMark[UTF-16LE: 0xFF,0xFE]" + "'", str7, "ByteOrderMark[UTF-16LE: 0xFF,0xFE]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF-16LE" + "'", str8, "UTF-16LE");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-1, -2]");
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        int[] intArray10 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark11 = new org.apache.commons.io.ByteOrderMark("hi!", intArray10);
        org.apache.commons.io.ByteOrderMark byteOrderMark12 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray10);
        org.apache.commons.io.ByteOrderMark byteOrderMark13 = new org.apache.commons.io.ByteOrderMark("hi!", intArray10);
        org.apache.commons.io.ByteOrderMark byteOrderMark14 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray10);
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[hi!: 0xA,0x61,0x23]", intArray10);
        org.apache.commons.io.ByteOrderMark byteOrderMark16 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-8: 0xEF,0xBB,0xBF]", intArray10);
        org.apache.commons.io.ByteOrderMark byteOrderMark17 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[UTF-8: 0xEF,0xBB,0xBF]: 0xA,0x61,0x23]", intArray10);
        int int18 = byteOrderMark17.length();
        int int20 = byteOrderMark17.get((int) (short) 0);
        int int21 = byteOrderMark17.length();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        org.apache.commons.io.ByteOrderMark byteOrderMark0 = org.apache.commons.io.ByteOrderMark.UTF_16BE;
        java.lang.Object obj1 = null;
        boolean boolean2 = byteOrderMark0.equals(obj1);
        int int3 = byteOrderMark0.length();
        java.lang.String str4 = byteOrderMark0.getCharsetName();
        byte[] byteArray5 = byteOrderMark0.getBytes();
        java.lang.String str6 = byteOrderMark0.getCharsetName();
        int int7 = byteOrderMark0.length();
        java.lang.String str8 = byteOrderMark0.toString();
        int[] intArray17 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark18 = new org.apache.commons.io.ByteOrderMark("hi!", intArray17);
        org.apache.commons.io.ByteOrderMark byteOrderMark19 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray17);
        org.apache.commons.io.ByteOrderMark byteOrderMark20 = new org.apache.commons.io.ByteOrderMark("hi!", intArray17);
        org.apache.commons.io.ByteOrderMark byteOrderMark21 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray17);
        org.apache.commons.io.ByteOrderMark byteOrderMark22 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray17);
        int[] intArray30 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark31 = new org.apache.commons.io.ByteOrderMark("hi!", intArray30);
        org.apache.commons.io.ByteOrderMark byteOrderMark32 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray30);
        org.apache.commons.io.ByteOrderMark byteOrderMark33 = new org.apache.commons.io.ByteOrderMark("hi!", intArray30);
        org.apache.commons.io.ByteOrderMark byteOrderMark34 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray30);
        boolean boolean35 = byteOrderMark22.equals((java.lang.Object) "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]");
        byte[] byteArray36 = byteOrderMark22.getBytes();
        boolean boolean37 = byteOrderMark0.equals((java.lang.Object) byteArray36);
        org.junit.Assert.assertNotNull(byteOrderMark0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF-16BE" + "'", str4, "UTF-16BE");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-2, -1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF-16BE" + "'", str6, "UTF-16BE");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ByteOrderMark[UTF-16BE: 0xFE,0xFF]" + "'", str8, "ByteOrderMark[UTF-16BE: 0xFE,0xFF]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        org.apache.commons.io.ByteOrderMark byteOrderMark0 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        boolean boolean2 = byteOrderMark0.equals((java.lang.Object) 1L);
        java.lang.String str3 = byteOrderMark0.getCharsetName();
        int int4 = byteOrderMark0.length();
        boolean boolean6 = byteOrderMark0.equals((java.lang.Object) (byte) -1);
        byte[] byteArray7 = byteOrderMark0.getBytes();
        java.lang.String str8 = byteOrderMark0.getCharsetName();
        java.lang.String str9 = byteOrderMark0.getCharsetName();
        java.lang.String str10 = byteOrderMark0.toString();
        int int11 = byteOrderMark0.length();
        int int13 = byteOrderMark0.get((int) (byte) 1);
        int[] intArray19 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark20 = new org.apache.commons.io.ByteOrderMark("hi!", intArray19);
        org.apache.commons.io.ByteOrderMark byteOrderMark21 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[UTF-16BE: 0xFE,0xFF]: 0xA,0x61,0x23]", intArray19);
        boolean boolean22 = byteOrderMark0.equals((java.lang.Object) "ByteOrderMark[ByteOrderMark[UTF-16BE: 0xFE,0xFF]: 0xA,0x61,0x23]");
        java.lang.String str23 = byteOrderMark0.toString();
        int int24 = byteOrderMark0.length();
        // The following exception was thrown during execution in test generation
        try {
            int int26 = byteOrderMark0.get((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrderMark0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF-16LE" + "'", str3, "UTF-16LE");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -2]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF-16LE" + "'", str8, "UTF-16LE");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTF-16LE" + "'", str9, "UTF-16LE");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ByteOrderMark[UTF-16LE: 0xFF,0xFE]" + "'", str10, "ByteOrderMark[UTF-16LE: 0xFF,0xFE]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 254 + "'", int13 == 254);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "ByteOrderMark[UTF-16LE: 0xFF,0xFE]" + "'", str23, "ByteOrderMark[UTF-16LE: 0xFF,0xFE]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        org.apache.commons.io.ByteOrderMark byteOrderMark0 = org.apache.commons.io.ByteOrderMark.UTF_16BE;
        java.lang.Object obj1 = null;
        boolean boolean2 = byteOrderMark0.equals(obj1);
        int int3 = byteOrderMark0.length();
        boolean boolean5 = byteOrderMark0.equals((java.lang.Object) 0L);
        int int6 = byteOrderMark0.length();
        int int7 = byteOrderMark0.length();
        int[] intArray14 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("hi!", intArray14);
        org.apache.commons.io.ByteOrderMark byteOrderMark16 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray14);
        org.apache.commons.io.ByteOrderMark byteOrderMark17 = new org.apache.commons.io.ByteOrderMark("hi!", intArray14);
        boolean boolean18 = byteOrderMark0.equals((java.lang.Object) intArray14);
        int[] intArray26 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark27 = new org.apache.commons.io.ByteOrderMark("hi!", intArray26);
        org.apache.commons.io.ByteOrderMark byteOrderMark28 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray26);
        org.apache.commons.io.ByteOrderMark byteOrderMark29 = new org.apache.commons.io.ByteOrderMark("hi!", intArray26);
        org.apache.commons.io.ByteOrderMark byteOrderMark30 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray26);
        int int31 = byteOrderMark30.length();
        boolean boolean32 = byteOrderMark0.equals((java.lang.Object) byteOrderMark30);
        org.apache.commons.io.ByteOrderMark byteOrderMark33 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        boolean boolean35 = byteOrderMark33.equals((java.lang.Object) 1L);
        java.lang.String str36 = byteOrderMark33.getCharsetName();
        int int37 = byteOrderMark33.length();
        boolean boolean39 = byteOrderMark33.equals((java.lang.Object) (byte) -1);
        byte[] byteArray40 = byteOrderMark33.getBytes();
        java.lang.String str41 = byteOrderMark33.getCharsetName();
        java.lang.String str42 = byteOrderMark33.getCharsetName();
        java.lang.String str43 = byteOrderMark33.toString();
        int int44 = byteOrderMark33.length();
        int int45 = byteOrderMark33.length();
        boolean boolean46 = byteOrderMark30.equals((java.lang.Object) byteOrderMark33);
        org.apache.commons.io.ByteOrderMark byteOrderMark47 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        boolean boolean49 = byteOrderMark47.equals((java.lang.Object) (-1L));
        java.lang.String str50 = byteOrderMark47.toString();
        byte[] byteArray51 = byteOrderMark47.getBytes();
        byte[] byteArray52 = byteOrderMark47.getBytes();
        byte[] byteArray53 = byteOrderMark47.getBytes();
        java.lang.String str54 = byteOrderMark47.getCharsetName();
        boolean boolean55 = byteOrderMark33.equals((java.lang.Object) byteOrderMark47);
        int int56 = byteOrderMark47.length();
        int int57 = byteOrderMark47.length();
        int int59 = byteOrderMark47.get(0);
        java.lang.Class<?> wildcardClass60 = byteOrderMark47.getClass();
        org.junit.Assert.assertNotNull(byteOrderMark0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(byteOrderMark33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "UTF-16LE" + "'", str36, "UTF-16LE");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2 + "'", int37 == 2);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[-1, -2]");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "UTF-16LE" + "'", str41, "UTF-16LE");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "UTF-16LE" + "'", str42, "UTF-16LE");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "ByteOrderMark[UTF-16LE: 0xFF,0xFE]" + "'", str43, "ByteOrderMark[UTF-16LE: 0xFF,0xFE]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2 + "'", int44 == 2);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2 + "'", int45 == 2);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(byteOrderMark47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "ByteOrderMark[UTF-16LE: 0xFF,0xFE]" + "'", str50, "ByteOrderMark[UTF-16LE: 0xFF,0xFE]");
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[-1, -2]");
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[-1, -2]");
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[-1, -2]");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "UTF-16LE" + "'", str54, "UTF-16LE");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 2 + "'", int56 == 2);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 2 + "'", int57 == 2);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 255 + "'", int59 == 255);
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        int[] intArray12 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark13 = new org.apache.commons.io.ByteOrderMark("hi!", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark14 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("hi!", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark16 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark17 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark18 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-8: 0xEF,0xBB,0xBF]", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark19 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[ByteOrderMark[UTF-16BE: 0xFE,0xFF]: 0xA,0x61,0x23]: 0xA,0x61,0x23]", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark20 = new org.apache.commons.io.ByteOrderMark("hi!", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark21 = new org.apache.commons.io.ByteOrderMark("hi!", intArray12);
        byte[] byteArray22 = byteOrderMark21.getBytes();
        byte[] byteArray23 = byteOrderMark21.getBytes();
        int[] intArray38 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark39 = new org.apache.commons.io.ByteOrderMark("hi!", intArray38);
        org.apache.commons.io.ByteOrderMark byteOrderMark40 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray38);
        org.apache.commons.io.ByteOrderMark byteOrderMark41 = new org.apache.commons.io.ByteOrderMark("hi!", intArray38);
        org.apache.commons.io.ByteOrderMark byteOrderMark42 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray38);
        org.apache.commons.io.ByteOrderMark byteOrderMark43 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[hi!: 0xA,0x61,0x23]", intArray38);
        org.apache.commons.io.ByteOrderMark byteOrderMark44 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray38);
        org.apache.commons.io.ByteOrderMark byteOrderMark45 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray38);
        org.apache.commons.io.ByteOrderMark byteOrderMark46 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[UTF-16BE: 0xFE,0xFF]: 0xA,0xFE,0x64]", intArray38);
        org.apache.commons.io.ByteOrderMark byteOrderMark47 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[hi!: 0xFF,0x0,0xFE]", intArray38);
        org.apache.commons.io.ByteOrderMark byteOrderMark48 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16BE: 0xFE,0xFF]", intArray38);
        org.apache.commons.io.ByteOrderMark byteOrderMark49 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[UTF-32BE: 0xA,0x61,0x23]: 0x0,0xA,0xFF]", intArray38);
        boolean boolean50 = byteOrderMark21.equals((java.lang.Object) intArray38);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        int[] intArray11 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark12 = new org.apache.commons.io.ByteOrderMark("hi!", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark13 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark14 = new org.apache.commons.io.ByteOrderMark("hi!", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark16 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[hi!: 0xA,0x61,0x23]", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark17 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-8: 0xEF,0xBB,0xBF]", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark18 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[UTF-8: 0xEF,0xBB,0xBF]: 0xA,0x61,0x23]", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark19 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[ByteOrderMark[ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]: 0xA,0x61,0x23]: 0xA,0x61,0x23]: 0xFF]", intArray11);
        int[] intArray25 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark26 = new org.apache.commons.io.ByteOrderMark("hi!", intArray25);
        org.apache.commons.io.ByteOrderMark byteOrderMark27 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray25);
        byte[] byteArray28 = byteOrderMark27.getBytes();
        java.lang.String str29 = byteOrderMark27.toString();
        boolean boolean30 = byteOrderMark19.equals((java.lang.Object) str29);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[10, 97, 35]");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "ByteOrderMark[UTF-16LE: 0xA,0x61,0x23]" + "'", str29, "ByteOrderMark[UTF-16LE: 0xA,0x61,0x23]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        int[] intArray12 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark13 = new org.apache.commons.io.ByteOrderMark("hi!", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark14 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("hi!", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark16 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark17 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark18 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark19 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark20 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark21 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[ByteOrderMark[hi!: 0xA,0x61,0x23]: 0x0,0xA,0xFF]: 0xA,0x61,0x23]", intArray12);
        java.lang.Class<?> wildcardClass22 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        int[] intArray5 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark6 = new org.apache.commons.io.ByteOrderMark("hi!", intArray5);
        org.apache.commons.io.ByteOrderMark byteOrderMark7 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray5);
        java.lang.String str8 = byteOrderMark7.getCharsetName();
        java.lang.String str9 = byteOrderMark7.getCharsetName();
        java.lang.String str10 = byteOrderMark7.getCharsetName();
        int int11 = byteOrderMark7.length();
        java.lang.String str12 = byteOrderMark7.getCharsetName();
        int int13 = byteOrderMark7.length();
        byte[] byteArray14 = byteOrderMark7.getBytes();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 97, 35]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF-16LE" + "'", str8, "UTF-16LE");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTF-16LE" + "'", str9, "UTF-16LE");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTF-16LE" + "'", str10, "UTF-16LE");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTF-16LE" + "'", str12, "UTF-16LE");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[10, 97, 35]");
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        int[] intArray10 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark11 = new org.apache.commons.io.ByteOrderMark("hi!", intArray10);
        org.apache.commons.io.ByteOrderMark byteOrderMark12 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray10);
        org.apache.commons.io.ByteOrderMark byteOrderMark13 = new org.apache.commons.io.ByteOrderMark("hi!", intArray10);
        org.apache.commons.io.ByteOrderMark byteOrderMark14 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray10);
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[hi!: 0xA,0x61,0x23]", intArray10);
        org.apache.commons.io.ByteOrderMark byteOrderMark16 = new org.apache.commons.io.ByteOrderMark("hi!", intArray10);
        org.apache.commons.io.ByteOrderMark byteOrderMark17 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[UTF-16LE: 0xFF,0xFE]: 0xA,0x61,0x23]", intArray10);
        java.lang.String str18 = byteOrderMark17.getCharsetName();
        byte[] byteArray19 = byteOrderMark17.getBytes();
        java.lang.Class<?> wildcardClass20 = byteArray19.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[10, 97, 35]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ByteOrderMark[ByteOrderMark[UTF-16LE: 0xFF,0xFE]: 0xA,0x61,0x23]" + "'", str18, "ByteOrderMark[ByteOrderMark[UTF-16LE: 0xFF,0xFE]: 0xA,0x61,0x23]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        int[] intArray8 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark9 = new org.apache.commons.io.ByteOrderMark("hi!", intArray8);
        org.apache.commons.io.ByteOrderMark byteOrderMark10 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray8);
        org.apache.commons.io.ByteOrderMark byteOrderMark11 = new org.apache.commons.io.ByteOrderMark("hi!", intArray8);
        org.apache.commons.io.ByteOrderMark byteOrderMark12 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray8);
        byte[] byteArray13 = byteOrderMark12.getBytes();
        byte[] byteArray14 = byteOrderMark12.getBytes();
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = org.apache.commons.io.ByteOrderMark.UTF_16BE;
        java.lang.Object obj16 = null;
        boolean boolean17 = byteOrderMark15.equals(obj16);
        int int18 = byteOrderMark15.length();
        boolean boolean20 = byteOrderMark15.equals((java.lang.Object) 0L);
        int int21 = byteOrderMark15.length();
        int int22 = byteOrderMark15.length();
        int[] intArray29 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark30 = new org.apache.commons.io.ByteOrderMark("hi!", intArray29);
        org.apache.commons.io.ByteOrderMark byteOrderMark31 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray29);
        org.apache.commons.io.ByteOrderMark byteOrderMark32 = new org.apache.commons.io.ByteOrderMark("hi!", intArray29);
        boolean boolean33 = byteOrderMark15.equals((java.lang.Object) intArray29);
        boolean boolean34 = byteOrderMark12.equals((java.lang.Object) intArray29);
        org.apache.commons.io.ByteOrderMark byteOrderMark35 = new org.apache.commons.io.ByteOrderMark("UTF-8", intArray29);
        java.lang.String str36 = byteOrderMark35.toString();
        java.lang.String str37 = byteOrderMark35.getCharsetName();
        org.apache.commons.io.ByteOrderMark byteOrderMark38 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        int int40 = byteOrderMark38.get(0);
        java.lang.String str41 = byteOrderMark38.getCharsetName();
        org.apache.commons.io.ByteOrderMark byteOrderMark42 = org.apache.commons.io.ByteOrderMark.UTF_16BE;
        java.lang.Object obj43 = null;
        boolean boolean44 = byteOrderMark42.equals(obj43);
        int int45 = byteOrderMark42.length();
        boolean boolean47 = byteOrderMark42.equals((java.lang.Object) 0L);
        int int48 = byteOrderMark42.length();
        boolean boolean49 = byteOrderMark38.equals((java.lang.Object) int48);
        org.apache.commons.io.ByteOrderMark byteOrderMark50 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        boolean boolean52 = byteOrderMark50.equals((java.lang.Object) 1L);
        java.lang.String str53 = byteOrderMark50.getCharsetName();
        int int54 = byteOrderMark50.length();
        boolean boolean56 = byteOrderMark50.equals((java.lang.Object) (byte) -1);
        byte[] byteArray57 = byteOrderMark50.getBytes();
        java.lang.String str58 = byteOrderMark50.getCharsetName();
        byte[] byteArray59 = byteOrderMark50.getBytes();
        boolean boolean60 = byteOrderMark38.equals((java.lang.Object) byteOrderMark50);
        byte[] byteArray61 = byteOrderMark50.getBytes();
        java.lang.Class<?> wildcardClass62 = byteArray61.getClass();
        boolean boolean63 = byteOrderMark35.equals((java.lang.Object) wildcardClass62);
        java.lang.String str64 = byteOrderMark35.getCharsetName();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(byteOrderMark15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "ByteOrderMark[UTF-8: 0xA,0x61,0x23]" + "'", str36, "ByteOrderMark[UTF-8: 0xA,0x61,0x23]");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "UTF-8" + "'", str37, "UTF-8");
        org.junit.Assert.assertNotNull(byteOrderMark38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 255 + "'", int40 == 255);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "UTF-16LE" + "'", str41, "UTF-16LE");
        org.junit.Assert.assertNotNull(byteOrderMark42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2 + "'", int45 == 2);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2 + "'", int48 == 2);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(byteOrderMark50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "UTF-16LE" + "'", str53, "UTF-16LE");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 2 + "'", int54 == 2);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[-1, -2]");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "UTF-16LE" + "'", str58, "UTF-16LE");
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray59), "[-1, -2]");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[-1, -2]");
        org.junit.Assert.assertNotNull(wildcardClass62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "UTF-8" + "'", str64, "UTF-8");
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        int[] intArray12 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark13 = new org.apache.commons.io.ByteOrderMark("hi!", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark14 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("hi!", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark16 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark17 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark18 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark19 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark20 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[UTF-8: 0xEF,0xBB,0xBF]: 0xA,0x61,0x23]", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark21 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0xFF,0x0,0xFE]", intArray12);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[10, 97, 35]");
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        int[] intArray14 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("hi!", intArray14);
        org.apache.commons.io.ByteOrderMark byteOrderMark16 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray14);
        org.apache.commons.io.ByteOrderMark byteOrderMark17 = new org.apache.commons.io.ByteOrderMark("hi!", intArray14);
        org.apache.commons.io.ByteOrderMark byteOrderMark18 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray14);
        org.apache.commons.io.ByteOrderMark byteOrderMark19 = new org.apache.commons.io.ByteOrderMark("hi!", intArray14);
        org.apache.commons.io.ByteOrderMark byteOrderMark20 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[hi!: 0xA,0x61,0x23]", intArray14);
        org.apache.commons.io.ByteOrderMark byteOrderMark21 = new org.apache.commons.io.ByteOrderMark("UTF-8", intArray14);
        org.apache.commons.io.ByteOrderMark byteOrderMark22 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]: 0xA,0x61,0x23]", intArray14);
        org.apache.commons.io.ByteOrderMark byteOrderMark23 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray14);
        org.apache.commons.io.ByteOrderMark byteOrderMark24 = new org.apache.commons.io.ByteOrderMark("UTF-8", intArray14);
        org.apache.commons.io.ByteOrderMark byteOrderMark25 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[UTF-32BE: 0xA,0x61,0x23]: 0xA,0x61,0x23]", intArray14);
        java.lang.Class<?> wildcardClass26 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        org.apache.commons.io.ByteOrderMark byteOrderMark0 = org.apache.commons.io.ByteOrderMark.UTF_32BE;
        java.lang.String str1 = byteOrderMark0.toString();
        java.lang.String str2 = byteOrderMark0.toString();
        int int4 = byteOrderMark0.get(2);
        boolean boolean6 = byteOrderMark0.equals((java.lang.Object) (byte) 10);
        byte[] byteArray7 = byteOrderMark0.getBytes();
        java.lang.String str8 = byteOrderMark0.getCharsetName();
        java.lang.String str9 = byteOrderMark0.toString();
        java.lang.String str10 = byteOrderMark0.getCharsetName();
        org.junit.Assert.assertNotNull(byteOrderMark0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]" + "'", str1, "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]" + "'", str2, "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 254 + "'", int4 == 254);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, -2, -1]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF-32BE" + "'", str8, "UTF-32BE");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]" + "'", str9, "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTF-32BE" + "'", str10, "UTF-32BE");
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        org.apache.commons.io.ByteOrderMark byteOrderMark0 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        boolean boolean2 = byteOrderMark0.equals((java.lang.Object) (-1L));
        java.lang.String str3 = byteOrderMark0.getCharsetName();
        byte[] byteArray4 = byteOrderMark0.getBytes();
        byte[] byteArray5 = byteOrderMark0.getBytes();
        org.junit.Assert.assertNotNull(byteOrderMark0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF-16LE" + "'", str3, "UTF-16LE");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, -2]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, -2]");
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        int[] intArray9 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark10 = new org.apache.commons.io.ByteOrderMark("hi!", intArray9);
        org.apache.commons.io.ByteOrderMark byteOrderMark11 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray9);
        org.apache.commons.io.ByteOrderMark byteOrderMark12 = new org.apache.commons.io.ByteOrderMark("hi!", intArray9);
        org.apache.commons.io.ByteOrderMark byteOrderMark13 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray9);
        org.apache.commons.io.ByteOrderMark byteOrderMark14 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray9);
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray9);
        int int16 = byteOrderMark15.length();
        java.lang.String str17 = byteOrderMark15.getCharsetName();
        org.apache.commons.io.ByteOrderMark byteOrderMark18 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        boolean boolean20 = byteOrderMark18.equals((java.lang.Object) 1L);
        java.lang.String str21 = byteOrderMark18.getCharsetName();
        org.apache.commons.io.ByteOrderMark byteOrderMark22 = org.apache.commons.io.ByteOrderMark.UTF_16BE;
        boolean boolean23 = byteOrderMark18.equals((java.lang.Object) byteOrderMark22);
        byte[] byteArray24 = byteOrderMark22.getBytes();
        boolean boolean25 = byteOrderMark15.equals((java.lang.Object) byteArray24);
        java.lang.String str26 = byteOrderMark15.toString();
        byte[] byteArray27 = byteOrderMark15.getBytes();
        int int29 = byteOrderMark15.get((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = byteOrderMark15.get((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]" + "'", str17, "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]");
        org.junit.Assert.assertNotNull(byteOrderMark18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "UTF-16LE" + "'", str21, "UTF-16LE");
        org.junit.Assert.assertNotNull(byteOrderMark22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[-2, -1]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "ByteOrderMark[ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]: 0xA,0x61,0x23]" + "'", str26, "ByteOrderMark[ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]: 0xA,0x61,0x23]");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 97 + "'", int29 == 97);
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        int[] intArray10 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark11 = new org.apache.commons.io.ByteOrderMark("hi!", intArray10);
        org.apache.commons.io.ByteOrderMark byteOrderMark12 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray10);
        org.apache.commons.io.ByteOrderMark byteOrderMark13 = new org.apache.commons.io.ByteOrderMark("hi!", intArray10);
        org.apache.commons.io.ByteOrderMark byteOrderMark14 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray10);
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray10);
        org.apache.commons.io.ByteOrderMark byteOrderMark16 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray10);
        org.apache.commons.io.ByteOrderMark byteOrderMark17 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray10);
        org.apache.commons.io.ByteOrderMark byteOrderMark18 = org.apache.commons.io.ByteOrderMark.UTF_32BE;
        byte[] byteArray19 = byteOrderMark18.getBytes();
        int int20 = byteOrderMark18.length();
        boolean boolean22 = byteOrderMark18.equals((java.lang.Object) "ByteOrderMark[ByteOrderMark[UTF-8: 0xEF,0xBB,0xBF]: 0xA,0x61,0x23]");
        java.lang.String str23 = byteOrderMark18.getCharsetName();
        java.lang.String str24 = byteOrderMark18.toString();
        int int25 = byteOrderMark18.length();
        byte[] byteArray26 = byteOrderMark18.getBytes();
        java.lang.Class<?> wildcardClass27 = byteArray26.getClass();
        boolean boolean28 = byteOrderMark17.equals((java.lang.Object) byteArray26);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(byteOrderMark18);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[0, 0, -2, -1]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "UTF-32BE" + "'", str23, "UTF-32BE");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]" + "'", str24, "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[0, 0, -2, -1]");
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        int[] intArray11 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark12 = new org.apache.commons.io.ByteOrderMark("hi!", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark13 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark14 = new org.apache.commons.io.ByteOrderMark("hi!", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray11);
        byte[] byteArray16 = byteOrderMark15.getBytes();
        byte[] byteArray17 = byteOrderMark15.getBytes();
        org.apache.commons.io.ByteOrderMark byteOrderMark18 = org.apache.commons.io.ByteOrderMark.UTF_16BE;
        java.lang.Object obj19 = null;
        boolean boolean20 = byteOrderMark18.equals(obj19);
        int int21 = byteOrderMark18.length();
        boolean boolean23 = byteOrderMark18.equals((java.lang.Object) 0L);
        int int24 = byteOrderMark18.length();
        int int25 = byteOrderMark18.length();
        int[] intArray32 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark33 = new org.apache.commons.io.ByteOrderMark("hi!", intArray32);
        org.apache.commons.io.ByteOrderMark byteOrderMark34 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray32);
        org.apache.commons.io.ByteOrderMark byteOrderMark35 = new org.apache.commons.io.ByteOrderMark("hi!", intArray32);
        boolean boolean36 = byteOrderMark18.equals((java.lang.Object) intArray32);
        boolean boolean37 = byteOrderMark15.equals((java.lang.Object) intArray32);
        org.apache.commons.io.ByteOrderMark byteOrderMark38 = new org.apache.commons.io.ByteOrderMark("UTF-8", intArray32);
        org.apache.commons.io.ByteOrderMark byteOrderMark39 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray32);
        org.apache.commons.io.ByteOrderMark byteOrderMark40 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[UTF-16LE: 0xFF,0xFE]: 0xA,0x61,0x23]", intArray32);
        org.apache.commons.io.ByteOrderMark byteOrderMark41 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]: 0xFF]", intArray32);
        int int42 = byteOrderMark41.length();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(byteOrderMark18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 3 + "'", int42 == 3);
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        org.apache.commons.io.ByteOrderMark byteOrderMark0 = org.apache.commons.io.ByteOrderMark.UTF_8;
        int int2 = byteOrderMark0.get((int) (byte) 0);
        int[] intArray12 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark13 = new org.apache.commons.io.ByteOrderMark("hi!", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark14 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("hi!", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark16 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark17 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark18 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray12);
        int int19 = byteOrderMark18.length();
        boolean boolean20 = byteOrderMark0.equals((java.lang.Object) byteOrderMark18);
        int int21 = byteOrderMark18.length();
        byte[] byteArray22 = byteOrderMark18.getBytes();
        org.junit.Assert.assertNotNull(byteOrderMark0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 239 + "'", int2 == 239);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[10, 97, 35]");
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        int[] intArray9 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark10 = new org.apache.commons.io.ByteOrderMark("hi!", intArray9);
        org.apache.commons.io.ByteOrderMark byteOrderMark11 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray9);
        org.apache.commons.io.ByteOrderMark byteOrderMark12 = new org.apache.commons.io.ByteOrderMark("hi!", intArray9);
        org.apache.commons.io.ByteOrderMark byteOrderMark13 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray9);
        org.apache.commons.io.ByteOrderMark byteOrderMark14 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray9);
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray9);
        java.lang.String str16 = byteOrderMark15.toString();
        java.lang.Class<?> wildcardClass17 = byteOrderMark15.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 97, 35]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ByteOrderMark[ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]: 0xA,0x61,0x23]" + "'", str16, "ByteOrderMark[ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]: 0xA,0x61,0x23]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        org.apache.commons.io.ByteOrderMark byteOrderMark0 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        boolean boolean2 = byteOrderMark0.equals((java.lang.Object) 1L);
        java.lang.String str3 = byteOrderMark0.getCharsetName();
        org.apache.commons.io.ByteOrderMark byteOrderMark4 = org.apache.commons.io.ByteOrderMark.UTF_16BE;
        java.lang.Object obj5 = null;
        boolean boolean6 = byteOrderMark4.equals(obj5);
        byte[] byteArray7 = byteOrderMark4.getBytes();
        java.lang.String str8 = byteOrderMark4.toString();
        int int9 = byteOrderMark4.length();
        int int10 = byteOrderMark4.length();
        boolean boolean11 = byteOrderMark0.equals((java.lang.Object) byteOrderMark4);
        java.lang.Class<?> wildcardClass12 = byteOrderMark0.getClass();
        org.junit.Assert.assertNotNull(byteOrderMark0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF-16LE" + "'", str3, "UTF-16LE");
        org.junit.Assert.assertNotNull(byteOrderMark4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-2, -1]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ByteOrderMark[UTF-16BE: 0xFE,0xFF]" + "'", str8, "ByteOrderMark[UTF-16BE: 0xFE,0xFF]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        org.apache.commons.io.ByteOrderMark byteOrderMark0 = org.apache.commons.io.ByteOrderMark.UTF_32BE;
        java.lang.String str1 = byteOrderMark0.toString();
        java.lang.String str2 = byteOrderMark0.toString();
        int int4 = byteOrderMark0.get(2);
        boolean boolean6 = byteOrderMark0.equals((java.lang.Object) (byte) 10);
        byte[] byteArray7 = byteOrderMark0.getBytes();
        int[] intArray17 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark18 = new org.apache.commons.io.ByteOrderMark("hi!", intArray17);
        org.apache.commons.io.ByteOrderMark byteOrderMark19 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray17);
        org.apache.commons.io.ByteOrderMark byteOrderMark20 = new org.apache.commons.io.ByteOrderMark("hi!", intArray17);
        org.apache.commons.io.ByteOrderMark byteOrderMark21 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray17);
        org.apache.commons.io.ByteOrderMark byteOrderMark22 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray17);
        org.apache.commons.io.ByteOrderMark byteOrderMark23 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray17);
        boolean boolean24 = byteOrderMark0.equals((java.lang.Object) byteOrderMark23);
        byte[] byteArray25 = byteOrderMark23.getBytes();
        java.lang.String str26 = byteOrderMark23.getCharsetName();
        int[] intArray31 = new int[] { 1, 35, 3 };
        org.apache.commons.io.ByteOrderMark byteOrderMark32 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-8: 0xFF]", intArray31);
        boolean boolean33 = byteOrderMark23.equals((java.lang.Object) "ByteOrderMark[UTF-8: 0xFF]");
        java.lang.Class<?> wildcardClass34 = byteOrderMark23.getClass();
        org.junit.Assert.assertNotNull(byteOrderMark0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]" + "'", str1, "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]" + "'", str2, "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 254 + "'", int4 == 254);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, -2, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[10, 97, 35]");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "UTF-32BE" + "'", str26, "UTF-32BE");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[1, 35, 3]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        int[] intArray6 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark7 = new org.apache.commons.io.ByteOrderMark("hi!", intArray6);
        org.apache.commons.io.ByteOrderMark byteOrderMark8 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray6);
        org.apache.commons.io.ByteOrderMark byteOrderMark9 = new org.apache.commons.io.ByteOrderMark("hi!", intArray6);
        java.lang.String str10 = byteOrderMark9.toString();
        java.lang.String str11 = byteOrderMark9.toString();
        boolean boolean13 = byteOrderMark9.equals((java.lang.Object) true);
        org.apache.commons.io.ByteOrderMark byteOrderMark14 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        boolean boolean16 = byteOrderMark14.equals((java.lang.Object) 1L);
        java.lang.String str17 = byteOrderMark14.getCharsetName();
        int int18 = byteOrderMark14.length();
        boolean boolean19 = byteOrderMark9.equals((java.lang.Object) byteOrderMark14);
        byte[] byteArray20 = byteOrderMark14.getBytes();
        int int21 = byteOrderMark14.length();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 97, 35]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ByteOrderMark[hi!: 0xA,0x61,0x23]" + "'", str10, "ByteOrderMark[hi!: 0xA,0x61,0x23]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ByteOrderMark[hi!: 0xA,0x61,0x23]" + "'", str11, "ByteOrderMark[hi!: 0xA,0x61,0x23]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteOrderMark14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTF-16LE" + "'", str17, "UTF-16LE");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[-1, -2]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        int[] intArray14 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("hi!", intArray14);
        org.apache.commons.io.ByteOrderMark byteOrderMark16 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray14);
        org.apache.commons.io.ByteOrderMark byteOrderMark17 = new org.apache.commons.io.ByteOrderMark("hi!", intArray14);
        org.apache.commons.io.ByteOrderMark byteOrderMark18 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray14);
        org.apache.commons.io.ByteOrderMark byteOrderMark19 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray14);
        org.apache.commons.io.ByteOrderMark byteOrderMark20 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray14);
        org.apache.commons.io.ByteOrderMark byteOrderMark21 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[UTF-16LE: 0xFF,0xFE]: 0xA,0x61,0x23]", intArray14);
        org.apache.commons.io.ByteOrderMark byteOrderMark22 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[UTF-32BE: 0xA,0x61,0x23]: 0xA,0x61,0x23]", intArray14);
        org.apache.commons.io.ByteOrderMark byteOrderMark23 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[UTF-16BE: 0xFE,0xFF]: 0xA,0xFE,0x64]", intArray14);
        org.apache.commons.io.ByteOrderMark byteOrderMark24 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[ByteOrderMark[UTF-16LE: 0xFF,0xFE]: 0xA,0x61,0x23]: 0xA,0x61,0x23]", intArray14);
        org.apache.commons.io.ByteOrderMark byteOrderMark25 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray14);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[10, 97, 35]");
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        int[] intArray10 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark11 = new org.apache.commons.io.ByteOrderMark("hi!", intArray10);
        org.apache.commons.io.ByteOrderMark byteOrderMark12 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray10);
        org.apache.commons.io.ByteOrderMark byteOrderMark13 = new org.apache.commons.io.ByteOrderMark("hi!", intArray10);
        org.apache.commons.io.ByteOrderMark byteOrderMark14 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray10);
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray10);
        org.apache.commons.io.ByteOrderMark byteOrderMark16 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[UTF-16LE: 0xFF,0xFE]: 0xA,0x61,0x23]", intArray10);
        org.apache.commons.io.ByteOrderMark byteOrderMark17 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[UTF-16LE: 0xA,0x61,0x23]: 0xA,0x61,0x23]", intArray10);
        int[] intArray25 = new int[] { (short) -1, (byte) 0, 254 };
        org.apache.commons.io.ByteOrderMark byteOrderMark26 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[hi!: 0xA,0x61,0x23]", intArray25);
        org.apache.commons.io.ByteOrderMark byteOrderMark27 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray25);
        org.apache.commons.io.ByteOrderMark byteOrderMark28 = new org.apache.commons.io.ByteOrderMark("hi!", intArray25);
        org.apache.commons.io.ByteOrderMark byteOrderMark29 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-8: 0xEF,0xBB,0xBF]", intArray25);
        boolean boolean30 = byteOrderMark17.equals((java.lang.Object) intArray25);
        int int31 = byteOrderMark17.length();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[-1, 0, 254]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        org.apache.commons.io.ByteOrderMark byteOrderMark0 = org.apache.commons.io.ByteOrderMark.UTF_8;
        int int2 = byteOrderMark0.get((int) (byte) 0);
        int[] intArray12 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark13 = new org.apache.commons.io.ByteOrderMark("hi!", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark14 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("hi!", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark16 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark17 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark18 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray12);
        int int19 = byteOrderMark18.length();
        boolean boolean20 = byteOrderMark0.equals((java.lang.Object) byteOrderMark18);
        int[] intArray30 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark31 = new org.apache.commons.io.ByteOrderMark("hi!", intArray30);
        org.apache.commons.io.ByteOrderMark byteOrderMark32 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray30);
        org.apache.commons.io.ByteOrderMark byteOrderMark33 = new org.apache.commons.io.ByteOrderMark("hi!", intArray30);
        org.apache.commons.io.ByteOrderMark byteOrderMark34 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray30);
        org.apache.commons.io.ByteOrderMark byteOrderMark35 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray30);
        org.apache.commons.io.ByteOrderMark byteOrderMark36 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray30);
        boolean boolean37 = byteOrderMark0.equals((java.lang.Object) intArray30);
        java.lang.String str38 = byteOrderMark0.toString();
        int int39 = byteOrderMark0.length();
        org.junit.Assert.assertNotNull(byteOrderMark0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 239 + "'", int2 == 239);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "ByteOrderMark[UTF-8: 0xEF,0xBB,0xBF]" + "'", str38, "ByteOrderMark[UTF-8: 0xEF,0xBB,0xBF]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 3 + "'", int39 == 3);
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        int[] intArray10 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark11 = new org.apache.commons.io.ByteOrderMark("hi!", intArray10);
        org.apache.commons.io.ByteOrderMark byteOrderMark12 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray10);
        org.apache.commons.io.ByteOrderMark byteOrderMark13 = new org.apache.commons.io.ByteOrderMark("hi!", intArray10);
        org.apache.commons.io.ByteOrderMark byteOrderMark14 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray10);
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray10);
        org.apache.commons.io.ByteOrderMark byteOrderMark16 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray10);
        org.apache.commons.io.ByteOrderMark byteOrderMark17 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray10);
        java.lang.String str18 = byteOrderMark17.getCharsetName();
        int int19 = byteOrderMark17.length();
        byte[] byteArray20 = byteOrderMark17.getBytes();
        int int22 = byteOrderMark17.get((int) (byte) 1);
        byte[] byteArray23 = byteOrderMark17.getBytes();
        int int24 = byteOrderMark17.length();
        java.lang.Class<?> wildcardClass25 = byteOrderMark17.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[10, 97, 35]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ByteOrderMark[UTF-16LE: 0xFF,0xFE]" + "'", str18, "ByteOrderMark[UTF-16LE: 0xFF,0xFE]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        org.apache.commons.io.ByteOrderMark byteOrderMark0 = org.apache.commons.io.ByteOrderMark.UTF_16BE;
        java.lang.Object obj1 = null;
        boolean boolean2 = byteOrderMark0.equals(obj1);
        int int3 = byteOrderMark0.length();
        boolean boolean5 = byteOrderMark0.equals((java.lang.Object) 0L);
        int int6 = byteOrderMark0.length();
        int int7 = byteOrderMark0.length();
        org.apache.commons.io.ByteOrderMark byteOrderMark8 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        boolean boolean10 = byteOrderMark8.equals((java.lang.Object) (-1L));
        java.lang.String str11 = byteOrderMark8.getCharsetName();
        org.apache.commons.io.ByteOrderMark byteOrderMark12 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        int int14 = byteOrderMark12.get(0);
        java.lang.String str15 = byteOrderMark12.getCharsetName();
        byte[] byteArray16 = byteOrderMark12.getBytes();
        boolean boolean17 = byteOrderMark8.equals((java.lang.Object) byteOrderMark12);
        boolean boolean18 = byteOrderMark0.equals((java.lang.Object) boolean17);
        java.lang.String str19 = byteOrderMark0.getCharsetName();
        boolean boolean21 = byteOrderMark0.equals((java.lang.Object) "ByteOrderMark[UTF-16LE: 0xA,0x61,0x23]");
        java.lang.String str22 = byteOrderMark0.getCharsetName();
        byte[] byteArray23 = byteOrderMark0.getBytes();
        java.lang.String str24 = byteOrderMark0.getCharsetName();
        org.junit.Assert.assertNotNull(byteOrderMark0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(byteOrderMark8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTF-16LE" + "'", str11, "UTF-16LE");
        org.junit.Assert.assertNotNull(byteOrderMark12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 255 + "'", int14 == 255);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTF-16LE" + "'", str15, "UTF-16LE");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[-1, -2]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "UTF-16BE" + "'", str19, "UTF-16BE");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "UTF-16BE" + "'", str22, "UTF-16BE");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[-2, -1]");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "UTF-16BE" + "'", str24, "UTF-16BE");
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        org.apache.commons.io.ByteOrderMark byteOrderMark0 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        int int2 = byteOrderMark0.get(0);
        int[] intArray7 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark8 = new org.apache.commons.io.ByteOrderMark("hi!", intArray7);
        int int9 = byteOrderMark8.length();
        java.lang.Class<?> wildcardClass10 = byteOrderMark8.getClass();
        boolean boolean11 = byteOrderMark0.equals((java.lang.Object) wildcardClass10);
        int int12 = byteOrderMark0.length();
        byte[] byteArray13 = byteOrderMark0.getBytes();
        int int15 = byteOrderMark0.get(0);
        int int16 = byteOrderMark0.length();
        org.junit.Assert.assertNotNull(byteOrderMark0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 255 + "'", int2 == 255);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, -2]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 255 + "'", int15 == 255);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        int[] intArray9 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark10 = new org.apache.commons.io.ByteOrderMark("hi!", intArray9);
        org.apache.commons.io.ByteOrderMark byteOrderMark11 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray9);
        org.apache.commons.io.ByteOrderMark byteOrderMark12 = new org.apache.commons.io.ByteOrderMark("hi!", intArray9);
        org.apache.commons.io.ByteOrderMark byteOrderMark13 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray9);
        org.apache.commons.io.ByteOrderMark byteOrderMark14 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray9);
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray9);
        int int16 = byteOrderMark15.length();
        java.lang.String str17 = byteOrderMark15.toString();
        byte[] byteArray18 = byteOrderMark15.getBytes();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ByteOrderMark[ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]: 0xA,0x61,0x23]" + "'", str17, "ByteOrderMark[ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]: 0xA,0x61,0x23]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[10, 97, 35]");
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        int[] intArray6 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark7 = new org.apache.commons.io.ByteOrderMark("hi!", intArray6);
        org.apache.commons.io.ByteOrderMark byteOrderMark8 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray6);
        org.apache.commons.io.ByteOrderMark byteOrderMark9 = new org.apache.commons.io.ByteOrderMark("hi!", intArray6);
        java.lang.String str10 = byteOrderMark9.toString();
        org.apache.commons.io.ByteOrderMark byteOrderMark11 = org.apache.commons.io.ByteOrderMark.UTF_8;
        int int13 = byteOrderMark11.get((int) (byte) 0);
        byte[] byteArray14 = byteOrderMark11.getBytes();
        boolean boolean15 = byteOrderMark9.equals((java.lang.Object) byteArray14);
        int int16 = byteOrderMark9.length();
        byte[] byteArray17 = byteOrderMark9.getBytes();
        java.lang.String str18 = byteOrderMark9.getCharsetName();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 97, 35]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ByteOrderMark[hi!: 0xA,0x61,0x23]" + "'", str10, "ByteOrderMark[hi!: 0xA,0x61,0x23]");
        org.junit.Assert.assertNotNull(byteOrderMark11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 239 + "'", int13 == 239);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[-17, -69, -65]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[10, 97, 35]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        org.apache.commons.io.ByteOrderMark byteOrderMark0 = org.apache.commons.io.ByteOrderMark.UTF_32BE;
        java.lang.String str1 = byteOrderMark0.toString();
        java.lang.String str2 = byteOrderMark0.toString();
        java.lang.String str3 = byteOrderMark0.getCharsetName();
        int int4 = byteOrderMark0.length();
        int int6 = byteOrderMark0.get((int) (short) 1);
        org.junit.Assert.assertNotNull(byteOrderMark0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]" + "'", str1, "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]" + "'", str2, "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF-32BE" + "'", str3, "UTF-32BE");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        org.apache.commons.io.ByteOrderMark byteOrderMark0 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        boolean boolean2 = byteOrderMark0.equals((java.lang.Object) 1L);
        java.lang.String str3 = byteOrderMark0.getCharsetName();
        int int4 = byteOrderMark0.length();
        java.lang.String str5 = byteOrderMark0.toString();
        java.lang.String str6 = byteOrderMark0.getCharsetName();
        java.lang.String str7 = byteOrderMark0.toString();
        int int9 = byteOrderMark0.get((int) (byte) 1);
        java.lang.String str10 = byteOrderMark0.toString();
        org.junit.Assert.assertNotNull(byteOrderMark0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF-16LE" + "'", str3, "UTF-16LE");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ByteOrderMark[UTF-16LE: 0xFF,0xFE]" + "'", str5, "ByteOrderMark[UTF-16LE: 0xFF,0xFE]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF-16LE" + "'", str6, "UTF-16LE");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ByteOrderMark[UTF-16LE: 0xFF,0xFE]" + "'", str7, "ByteOrderMark[UTF-16LE: 0xFF,0xFE]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 254 + "'", int9 == 254);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ByteOrderMark[UTF-16LE: 0xFF,0xFE]" + "'", str10, "ByteOrderMark[UTF-16LE: 0xFF,0xFE]");
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        int[] intArray12 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark13 = new org.apache.commons.io.ByteOrderMark("hi!", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark14 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("hi!", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark16 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark17 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark18 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark19 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xA,0x61,0x23]", intArray12);
        int[] intArray31 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark32 = new org.apache.commons.io.ByteOrderMark("hi!", intArray31);
        org.apache.commons.io.ByteOrderMark byteOrderMark33 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray31);
        org.apache.commons.io.ByteOrderMark byteOrderMark34 = new org.apache.commons.io.ByteOrderMark("hi!", intArray31);
        org.apache.commons.io.ByteOrderMark byteOrderMark35 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray31);
        org.apache.commons.io.ByteOrderMark byteOrderMark36 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray31);
        org.apache.commons.io.ByteOrderMark byteOrderMark37 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray31);
        org.apache.commons.io.ByteOrderMark byteOrderMark38 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray31);
        org.apache.commons.io.ByteOrderMark byteOrderMark39 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray31);
        boolean boolean40 = byteOrderMark19.equals((java.lang.Object) intArray31);
        org.apache.commons.io.ByteOrderMark byteOrderMark41 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[ByteOrderMark[ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]: 0xA,0x61,0x23]: 0xA,0x61,0x23]: 0xFF]", intArray31);
        org.apache.commons.io.ByteOrderMark byteOrderMark42 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[UTF-32BE: 0xA,0x61,0x23]: 0xA,0x61,0x23]", intArray31);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        int[] intArray13 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark14 = new org.apache.commons.io.ByteOrderMark("hi!", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark16 = new org.apache.commons.io.ByteOrderMark("hi!", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark17 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark18 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[hi!: 0xA,0x61,0x23]", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark19 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xA,0x61,0x23]", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark20 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-8: 0xEF,0xBB,0xBF]", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark21 = new org.apache.commons.io.ByteOrderMark("hi!", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark22 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark23 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]: 0xA,0x61,0x23]", intArray13);
        java.lang.Class<?> wildcardClass24 = byteOrderMark23.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        int[] intArray6 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark7 = new org.apache.commons.io.ByteOrderMark("hi!", intArray6);
        org.apache.commons.io.ByteOrderMark byteOrderMark8 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[ByteOrderMark[UTF-16LE: 0xFF,0xFE]: 0xA,0x61,0x23]: 0xA,0x61,0x23]", intArray6);
        org.apache.commons.io.ByteOrderMark byteOrderMark9 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[ByteOrderMark[ByteOrderMark[UTF-8: 0xEF,0xBB,0xBF]: 0xA,0x61,0x23]: 0xA,0x61,0x23]: 0xA,0x61,0x23]", intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 97, 35]");
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        int[] intArray9 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark10 = new org.apache.commons.io.ByteOrderMark("hi!", intArray9);
        org.apache.commons.io.ByteOrderMark byteOrderMark11 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray9);
        org.apache.commons.io.ByteOrderMark byteOrderMark12 = new org.apache.commons.io.ByteOrderMark("hi!", intArray9);
        org.apache.commons.io.ByteOrderMark byteOrderMark13 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray9);
        org.apache.commons.io.ByteOrderMark byteOrderMark14 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray9);
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[UTF-8: 0xEF,0xBB,0xBF]: 0xA,0x61,0x23]", intArray9);
        java.lang.Object obj16 = null;
        boolean boolean17 = byteOrderMark15.equals(obj16);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = byteOrderMark15.get((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
        org.apache.commons.io.ByteOrderMark byteOrderMark0 = org.apache.commons.io.ByteOrderMark.UTF_8;
        int int2 = byteOrderMark0.get((int) (byte) 0);
        int[] intArray12 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark13 = new org.apache.commons.io.ByteOrderMark("hi!", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark14 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("hi!", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark16 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark17 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark18 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray12);
        int int19 = byteOrderMark18.length();
        boolean boolean20 = byteOrderMark0.equals((java.lang.Object) byteOrderMark18);
        int[] intArray30 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark31 = new org.apache.commons.io.ByteOrderMark("hi!", intArray30);
        org.apache.commons.io.ByteOrderMark byteOrderMark32 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray30);
        org.apache.commons.io.ByteOrderMark byteOrderMark33 = new org.apache.commons.io.ByteOrderMark("hi!", intArray30);
        org.apache.commons.io.ByteOrderMark byteOrderMark34 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray30);
        org.apache.commons.io.ByteOrderMark byteOrderMark35 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray30);
        org.apache.commons.io.ByteOrderMark byteOrderMark36 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray30);
        int int37 = byteOrderMark36.length();
        boolean boolean38 = byteOrderMark18.equals((java.lang.Object) int37);
        byte[] byteArray39 = byteOrderMark18.getBytes();
        int int40 = byteOrderMark18.length();
        byte[] byteArray41 = byteOrderMark18.getBytes();
        java.lang.Class<?> wildcardClass42 = byteOrderMark18.getClass();
        org.junit.Assert.assertNotNull(byteOrderMark0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 239 + "'", int2 == 239);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 3 + "'", int37 == 3);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 3 + "'", int40 == 3);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        org.apache.commons.io.ByteOrderMark byteOrderMark0 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        byte[] byteArray1 = byteOrderMark0.getBytes();
        int int2 = byteOrderMark0.length();
        java.lang.String str3 = byteOrderMark0.getCharsetName();
        java.lang.String str4 = byteOrderMark0.getCharsetName();
        java.lang.String str5 = byteOrderMark0.getCharsetName();
        int int6 = byteOrderMark0.length();
        java.lang.String str7 = byteOrderMark0.getCharsetName();
        org.junit.Assert.assertNotNull(byteOrderMark0);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1, -2]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF-16LE" + "'", str3, "UTF-16LE");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF-16LE" + "'", str4, "UTF-16LE");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF-16LE" + "'", str5, "UTF-16LE");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTF-16LE" + "'", str7, "UTF-16LE");
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        int[] intArray6 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark7 = new org.apache.commons.io.ByteOrderMark("hi!", intArray6);
        org.apache.commons.io.ByteOrderMark byteOrderMark8 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray6);
        org.apache.commons.io.ByteOrderMark byteOrderMark9 = new org.apache.commons.io.ByteOrderMark("hi!", intArray6);
        java.lang.String str10 = byteOrderMark9.toString();
        java.lang.String str11 = byteOrderMark9.toString();
        boolean boolean13 = byteOrderMark9.equals((java.lang.Object) true);
        boolean boolean15 = byteOrderMark9.equals((java.lang.Object) "UTF-32BE");
        java.lang.String str16 = byteOrderMark9.getCharsetName();
        java.lang.String str17 = byteOrderMark9.getCharsetName();
        byte[] byteArray18 = byteOrderMark9.getBytes();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 97, 35]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ByteOrderMark[hi!: 0xA,0x61,0x23]" + "'", str10, "ByteOrderMark[hi!: 0xA,0x61,0x23]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ByteOrderMark[hi!: 0xA,0x61,0x23]" + "'", str11, "ByteOrderMark[hi!: 0xA,0x61,0x23]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[10, 97, 35]");
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        org.apache.commons.io.ByteOrderMark byteOrderMark0 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        boolean boolean2 = byteOrderMark0.equals((java.lang.Object) (-1L));
        java.lang.String str3 = byteOrderMark0.getCharsetName();
        org.apache.commons.io.ByteOrderMark byteOrderMark4 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        int int6 = byteOrderMark4.get(0);
        java.lang.String str7 = byteOrderMark4.getCharsetName();
        byte[] byteArray8 = byteOrderMark4.getBytes();
        boolean boolean9 = byteOrderMark0.equals((java.lang.Object) byteOrderMark4);
        java.lang.Object obj10 = null;
        boolean boolean11 = byteOrderMark4.equals(obj10);
        int[] intArray19 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark20 = new org.apache.commons.io.ByteOrderMark("hi!", intArray19);
        org.apache.commons.io.ByteOrderMark byteOrderMark21 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray19);
        org.apache.commons.io.ByteOrderMark byteOrderMark22 = new org.apache.commons.io.ByteOrderMark("hi!", intArray19);
        org.apache.commons.io.ByteOrderMark byteOrderMark23 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray19);
        int int24 = byteOrderMark23.length();
        java.lang.String str25 = byteOrderMark23.toString();
        java.lang.String str26 = byteOrderMark23.getCharsetName();
        boolean boolean27 = byteOrderMark4.equals((java.lang.Object) byteOrderMark23);
        java.lang.String str28 = byteOrderMark23.getCharsetName();
        int int29 = byteOrderMark23.length();
        java.lang.String str30 = byteOrderMark23.toString();
        org.junit.Assert.assertNotNull(byteOrderMark0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF-16LE" + "'", str3, "UTF-16LE");
        org.junit.Assert.assertNotNull(byteOrderMark4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 255 + "'", int6 == 255);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTF-16LE" + "'", str7, "UTF-16LE");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, -2]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "ByteOrderMark[ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]: 0xA,0x61,0x23]" + "'", str25, "ByteOrderMark[ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]: 0xA,0x61,0x23]");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]" + "'", str26, "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]" + "'", str28, "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "ByteOrderMark[ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]: 0xA,0x61,0x23]" + "'", str30, "ByteOrderMark[ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]: 0xA,0x61,0x23]");
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        org.apache.commons.io.ByteOrderMark byteOrderMark0 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        boolean boolean2 = byteOrderMark0.equals((java.lang.Object) 1L);
        java.lang.String str3 = byteOrderMark0.getCharsetName();
        int int4 = byteOrderMark0.length();
        boolean boolean6 = byteOrderMark0.equals((java.lang.Object) (-1.0f));
        int int7 = byteOrderMark0.length();
        boolean boolean9 = byteOrderMark0.equals((java.lang.Object) 100.0f);
        int[] intArray16 = new int[] { (byte) 0, 10, (-1) };
        org.apache.commons.io.ByteOrderMark byteOrderMark17 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[hi!: 0xA,0x61,0x23]", intArray16);
        org.apache.commons.io.ByteOrderMark byteOrderMark18 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[hi!: 0xA,0x61,0x23]", intArray16);
        org.apache.commons.io.ByteOrderMark byteOrderMark19 = new org.apache.commons.io.ByteOrderMark("UTF-8", intArray16);
        boolean boolean20 = byteOrderMark0.equals((java.lang.Object) byteOrderMark19);
        byte[] byteArray21 = byteOrderMark19.getBytes();
        int int23 = byteOrderMark19.get(0);
        org.junit.Assert.assertNotNull(byteOrderMark0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF-16LE" + "'", str3, "UTF-16LE");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[0, 10, -1]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        int[] intArray5 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark6 = new org.apache.commons.io.ByteOrderMark("hi!", intArray5);
        org.apache.commons.io.ByteOrderMark byteOrderMark7 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray5);
        int int8 = byteOrderMark7.length();
        java.lang.String str9 = byteOrderMark7.getCharsetName();
        int[] intArray15 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark16 = new org.apache.commons.io.ByteOrderMark("hi!", intArray15);
        org.apache.commons.io.ByteOrderMark byteOrderMark17 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray15);
        java.lang.String str18 = byteOrderMark17.getCharsetName();
        java.lang.Class<?> wildcardClass19 = byteOrderMark17.getClass();
        boolean boolean20 = byteOrderMark7.equals((java.lang.Object) byteOrderMark17);
        int[] intArray33 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark34 = new org.apache.commons.io.ByteOrderMark("hi!", intArray33);
        org.apache.commons.io.ByteOrderMark byteOrderMark35 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray33);
        org.apache.commons.io.ByteOrderMark byteOrderMark36 = new org.apache.commons.io.ByteOrderMark("hi!", intArray33);
        org.apache.commons.io.ByteOrderMark byteOrderMark37 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray33);
        org.apache.commons.io.ByteOrderMark byteOrderMark38 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray33);
        org.apache.commons.io.ByteOrderMark byteOrderMark39 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray33);
        org.apache.commons.io.ByteOrderMark byteOrderMark40 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray33);
        org.apache.commons.io.ByteOrderMark byteOrderMark41 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[UTF-8: 0xEF,0xBB,0xBF]: 0xA,0x61,0x23]", intArray33);
        org.apache.commons.io.ByteOrderMark byteOrderMark42 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-8: 0xEF,0xBB,0xBF]", intArray33);
        int int44 = byteOrderMark42.get((int) (short) 1);
        boolean boolean45 = byteOrderMark7.equals((java.lang.Object) (short) 1);
        byte[] byteArray46 = byteOrderMark7.getBytes();
        byte[] byteArray47 = byteOrderMark7.getBytes();
        java.lang.String str48 = byteOrderMark7.getCharsetName();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTF-16LE" + "'", str9, "UTF-16LE");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 97, 35]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "UTF-16LE" + "'", str18, "UTF-16LE");
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 97 + "'", int44 == 97);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[10, 97, 35]");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "UTF-16LE" + "'", str48, "UTF-16LE");
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        org.apache.commons.io.ByteOrderMark byteOrderMark0 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        boolean boolean2 = byteOrderMark0.equals((java.lang.Object) (-1L));
        java.lang.String str3 = byteOrderMark0.getCharsetName();
        java.lang.String str4 = byteOrderMark0.getCharsetName();
        java.lang.String str5 = byteOrderMark0.toString();
        org.apache.commons.io.ByteOrderMark byteOrderMark6 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        boolean boolean8 = byteOrderMark6.equals((java.lang.Object) 1L);
        java.lang.String str9 = byteOrderMark6.getCharsetName();
        org.apache.commons.io.ByteOrderMark byteOrderMark10 = org.apache.commons.io.ByteOrderMark.UTF_16BE;
        boolean boolean11 = byteOrderMark6.equals((java.lang.Object) byteOrderMark10);
        byte[] byteArray12 = byteOrderMark10.getBytes();
        int int13 = byteOrderMark10.length();
        java.lang.String str14 = byteOrderMark10.getCharsetName();
        java.lang.String str15 = byteOrderMark10.getCharsetName();
        byte[] byteArray16 = byteOrderMark10.getBytes();
        boolean boolean17 = byteOrderMark0.equals((java.lang.Object) byteArray16);
        byte[] byteArray18 = byteOrderMark0.getBytes();
        int int19 = byteOrderMark0.length();
        org.junit.Assert.assertNotNull(byteOrderMark0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF-16LE" + "'", str3, "UTF-16LE");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF-16LE" + "'", str4, "UTF-16LE");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ByteOrderMark[UTF-16LE: 0xFF,0xFE]" + "'", str5, "ByteOrderMark[UTF-16LE: 0xFF,0xFE]");
        org.junit.Assert.assertNotNull(byteOrderMark6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTF-16LE" + "'", str9, "UTF-16LE");
        org.junit.Assert.assertNotNull(byteOrderMark10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[-2, -1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTF-16BE" + "'", str14, "UTF-16BE");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTF-16BE" + "'", str15, "UTF-16BE");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[-2, -1]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[-1, -2]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        int[] intArray4 = new int[] { 239, (byte) 10 };
        org.apache.commons.io.ByteOrderMark byteOrderMark5 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray4);
        org.apache.commons.io.ByteOrderMark byteOrderMark6 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[hi!: 0xFF,0x0,0xFE]", intArray4);
        java.lang.String str7 = byteOrderMark6.getCharsetName();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[239, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ByteOrderMark[hi!: 0xFF,0x0,0xFE]" + "'", str7, "ByteOrderMark[hi!: 0xFF,0x0,0xFE]");
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        int[] intArray9 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark10 = new org.apache.commons.io.ByteOrderMark("hi!", intArray9);
        org.apache.commons.io.ByteOrderMark byteOrderMark11 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray9);
        org.apache.commons.io.ByteOrderMark byteOrderMark12 = new org.apache.commons.io.ByteOrderMark("hi!", intArray9);
        org.apache.commons.io.ByteOrderMark byteOrderMark13 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray9);
        org.apache.commons.io.ByteOrderMark byteOrderMark14 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray9);
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray9);
        int int16 = byteOrderMark15.length();
        org.apache.commons.io.ByteOrderMark byteOrderMark17 = org.apache.commons.io.ByteOrderMark.UTF_16BE;
        java.lang.Object obj18 = null;
        boolean boolean19 = byteOrderMark17.equals(obj18);
        byte[] byteArray20 = byteOrderMark17.getBytes();
        java.lang.String str21 = byteOrderMark17.toString();
        int int23 = byteOrderMark17.get((int) (byte) 0);
        boolean boolean24 = byteOrderMark15.equals((java.lang.Object) byteOrderMark17);
        java.lang.String str25 = byteOrderMark15.toString();
        java.lang.String str26 = byteOrderMark15.toString();
        int int27 = byteOrderMark15.length();
        org.apache.commons.io.ByteOrderMark byteOrderMark28 = org.apache.commons.io.ByteOrderMark.UTF_8;
        int int30 = byteOrderMark28.get((int) (byte) 0);
        byte[] byteArray31 = byteOrderMark28.getBytes();
        boolean boolean32 = byteOrderMark15.equals((java.lang.Object) byteOrderMark28);
        byte[] byteArray33 = byteOrderMark15.getBytes();
        java.lang.Class<?> wildcardClass34 = byteArray33.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(byteOrderMark17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[-2, -1]");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ByteOrderMark[UTF-16BE: 0xFE,0xFF]" + "'", str21, "ByteOrderMark[UTF-16BE: 0xFE,0xFF]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 254 + "'", int23 == 254);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "ByteOrderMark[ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]: 0xA,0x61,0x23]" + "'", str25, "ByteOrderMark[ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]: 0xA,0x61,0x23]");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "ByteOrderMark[ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]: 0xA,0x61,0x23]" + "'", str26, "ByteOrderMark[ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]: 0xA,0x61,0x23]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertNotNull(byteOrderMark28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 239 + "'", int30 == 239);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[-17, -69, -65]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        org.apache.commons.io.ByteOrderMark byteOrderMark0 = org.apache.commons.io.ByteOrderMark.UTF_16BE;
        java.lang.Object obj1 = null;
        boolean boolean2 = byteOrderMark0.equals(obj1);
        int int3 = byteOrderMark0.length();
        boolean boolean5 = byteOrderMark0.equals((java.lang.Object) 0L);
        int int6 = byteOrderMark0.length();
        int int7 = byteOrderMark0.length();
        int[] intArray14 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("hi!", intArray14);
        org.apache.commons.io.ByteOrderMark byteOrderMark16 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray14);
        org.apache.commons.io.ByteOrderMark byteOrderMark17 = new org.apache.commons.io.ByteOrderMark("hi!", intArray14);
        boolean boolean18 = byteOrderMark0.equals((java.lang.Object) intArray14);
        int[] intArray26 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark27 = new org.apache.commons.io.ByteOrderMark("hi!", intArray26);
        org.apache.commons.io.ByteOrderMark byteOrderMark28 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray26);
        org.apache.commons.io.ByteOrderMark byteOrderMark29 = new org.apache.commons.io.ByteOrderMark("hi!", intArray26);
        org.apache.commons.io.ByteOrderMark byteOrderMark30 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray26);
        int int31 = byteOrderMark30.length();
        boolean boolean32 = byteOrderMark0.equals((java.lang.Object) byteOrderMark30);
        org.apache.commons.io.ByteOrderMark byteOrderMark33 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        int int35 = byteOrderMark33.get(0);
        boolean boolean37 = byteOrderMark33.equals((java.lang.Object) (short) 0);
        int[] intArray44 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark45 = new org.apache.commons.io.ByteOrderMark("hi!", intArray44);
        org.apache.commons.io.ByteOrderMark byteOrderMark46 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray44);
        org.apache.commons.io.ByteOrderMark byteOrderMark47 = new org.apache.commons.io.ByteOrderMark("hi!", intArray44);
        boolean boolean48 = byteOrderMark33.equals((java.lang.Object) byteOrderMark47);
        boolean boolean49 = byteOrderMark0.equals((java.lang.Object) byteOrderMark33);
        byte[] byteArray50 = byteOrderMark33.getBytes();
        java.lang.Object obj51 = null;
        boolean boolean52 = byteOrderMark33.equals(obj51);
        int int53 = byteOrderMark33.length();
        org.junit.Assert.assertNotNull(byteOrderMark0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(byteOrderMark33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 255 + "'", int35 == 255);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[-1, -2]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 2 + "'", int53 == 2);
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        org.apache.commons.io.ByteOrderMark byteOrderMark0 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        boolean boolean2 = byteOrderMark0.equals((java.lang.Object) 1L);
        java.lang.String str3 = byteOrderMark0.getCharsetName();
        int int4 = byteOrderMark0.length();
        boolean boolean6 = byteOrderMark0.equals((java.lang.Object) (byte) -1);
        byte[] byteArray7 = byteOrderMark0.getBytes();
        java.lang.String str8 = byteOrderMark0.getCharsetName();
        java.lang.String str9 = byteOrderMark0.getCharsetName();
        java.lang.String str10 = byteOrderMark0.toString();
        java.lang.String str11 = byteOrderMark0.getCharsetName();
        byte[] byteArray12 = byteOrderMark0.getBytes();
        byte[] byteArray13 = byteOrderMark0.getBytes();
        org.junit.Assert.assertNotNull(byteOrderMark0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF-16LE" + "'", str3, "UTF-16LE");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -2]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF-16LE" + "'", str8, "UTF-16LE");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTF-16LE" + "'", str9, "UTF-16LE");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ByteOrderMark[UTF-16LE: 0xFF,0xFE]" + "'", str10, "ByteOrderMark[UTF-16LE: 0xFF,0xFE]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTF-16LE" + "'", str11, "UTF-16LE");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[-1, -2]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, -2]");
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        int[] intArray12 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark13 = new org.apache.commons.io.ByteOrderMark("hi!", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark14 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("hi!", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark16 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark17 = new org.apache.commons.io.ByteOrderMark("hi!", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark18 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[hi!: 0xA,0x61,0x23]", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark19 = new org.apache.commons.io.ByteOrderMark("UTF-8", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark20 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]: 0xA,0x61,0x23]", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark21 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray12);
        java.lang.String str22 = byteOrderMark21.toString();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[10, 97, 35]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ByteOrderMark[ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]: 0xA,0x61,0x23]" + "'", str22, "ByteOrderMark[ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]: 0xA,0x61,0x23]");
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        int[] intArray5 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark6 = new org.apache.commons.io.ByteOrderMark("hi!", intArray5);
        org.apache.commons.io.ByteOrderMark byteOrderMark7 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray5);
        java.lang.String str8 = byteOrderMark7.getCharsetName();
        org.apache.commons.io.ByteOrderMark byteOrderMark9 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        boolean boolean11 = byteOrderMark9.equals((java.lang.Object) 1L);
        java.lang.String str12 = byteOrderMark9.getCharsetName();
        int int13 = byteOrderMark9.length();
        java.lang.String str14 = byteOrderMark9.toString();
        java.lang.String str15 = byteOrderMark9.getCharsetName();
        int int16 = byteOrderMark9.length();
        java.lang.String str17 = byteOrderMark9.toString();
        java.lang.String str18 = byteOrderMark9.getCharsetName();
        java.lang.String str19 = byteOrderMark9.toString();
        int int20 = byteOrderMark9.length();
        boolean boolean21 = byteOrderMark7.equals((java.lang.Object) byteOrderMark9);
        java.lang.String str22 = byteOrderMark7.toString();
        java.lang.String str23 = byteOrderMark7.getCharsetName();
        java.lang.String str24 = byteOrderMark7.toString();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 97, 35]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF-16LE" + "'", str8, "UTF-16LE");
        org.junit.Assert.assertNotNull(byteOrderMark9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTF-16LE" + "'", str12, "UTF-16LE");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ByteOrderMark[UTF-16LE: 0xFF,0xFE]" + "'", str14, "ByteOrderMark[UTF-16LE: 0xFF,0xFE]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTF-16LE" + "'", str15, "UTF-16LE");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ByteOrderMark[UTF-16LE: 0xFF,0xFE]" + "'", str17, "ByteOrderMark[UTF-16LE: 0xFF,0xFE]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "UTF-16LE" + "'", str18, "UTF-16LE");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ByteOrderMark[UTF-16LE: 0xFF,0xFE]" + "'", str19, "ByteOrderMark[UTF-16LE: 0xFF,0xFE]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ByteOrderMark[UTF-16LE: 0xA,0x61,0x23]" + "'", str22, "ByteOrderMark[UTF-16LE: 0xA,0x61,0x23]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "UTF-16LE" + "'", str23, "UTF-16LE");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "ByteOrderMark[UTF-16LE: 0xA,0x61,0x23]" + "'", str24, "ByteOrderMark[UTF-16LE: 0xA,0x61,0x23]");
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        int[] intArray9 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark10 = new org.apache.commons.io.ByteOrderMark("hi!", intArray9);
        org.apache.commons.io.ByteOrderMark byteOrderMark11 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray9);
        org.apache.commons.io.ByteOrderMark byteOrderMark12 = new org.apache.commons.io.ByteOrderMark("hi!", intArray9);
        org.apache.commons.io.ByteOrderMark byteOrderMark13 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray9);
        org.apache.commons.io.ByteOrderMark byteOrderMark14 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray9);
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray9);
        int int16 = byteOrderMark15.length();
        java.lang.String str17 = byteOrderMark15.getCharsetName();
        byte[] byteArray18 = byteOrderMark15.getBytes();
        byte[] byteArray19 = byteOrderMark15.getBytes();
        java.lang.String str20 = byteOrderMark15.getCharsetName();
        java.lang.String str21 = byteOrderMark15.getCharsetName();
        java.lang.String str22 = byteOrderMark15.getCharsetName();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]" + "'", str17, "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[10, 97, 35]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]" + "'", str20, "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]" + "'", str21, "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]" + "'", str22, "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]");
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        int[] intArray5 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark6 = new org.apache.commons.io.ByteOrderMark("hi!", intArray5);
        org.apache.commons.io.ByteOrderMark byteOrderMark7 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray5);
        byte[] byteArray8 = byteOrderMark7.getBytes();
        java.lang.String str9 = byteOrderMark7.toString();
        int int10 = byteOrderMark7.length();
        java.lang.String str11 = byteOrderMark7.getCharsetName();
        int int13 = byteOrderMark7.get((int) (short) 0);
        java.lang.Class<?> wildcardClass14 = byteOrderMark7.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[10, 97, 35]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ByteOrderMark[UTF-16LE: 0xA,0x61,0x23]" + "'", str9, "ByteOrderMark[UTF-16LE: 0xA,0x61,0x23]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTF-16LE" + "'", str11, "UTF-16LE");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        org.apache.commons.io.ByteOrderMark byteOrderMark0 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        boolean boolean2 = byteOrderMark0.equals((java.lang.Object) 1L);
        java.lang.String str3 = byteOrderMark0.getCharsetName();
        org.apache.commons.io.ByteOrderMark byteOrderMark4 = org.apache.commons.io.ByteOrderMark.UTF_16BE;
        boolean boolean5 = byteOrderMark0.equals((java.lang.Object) byteOrderMark4);
        byte[] byteArray6 = byteOrderMark4.getBytes();
        int int7 = byteOrderMark4.length();
        org.apache.commons.io.ByteOrderMark byteOrderMark8 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        boolean boolean10 = byteOrderMark8.equals((java.lang.Object) 1L);
        java.lang.String str11 = byteOrderMark8.getCharsetName();
        int int12 = byteOrderMark8.length();
        boolean boolean14 = byteOrderMark8.equals((java.lang.Object) (byte) -1);
        byte[] byteArray15 = byteOrderMark8.getBytes();
        java.lang.String str16 = byteOrderMark8.getCharsetName();
        java.lang.String str17 = byteOrderMark8.getCharsetName();
        java.lang.String str18 = byteOrderMark8.getCharsetName();
        boolean boolean19 = byteOrderMark4.equals((java.lang.Object) byteOrderMark8);
        byte[] byteArray20 = byteOrderMark4.getBytes();
        org.apache.commons.io.ByteOrderMark byteOrderMark21 = org.apache.commons.io.ByteOrderMark.UTF_16BE;
        java.lang.Object obj22 = null;
        boolean boolean23 = byteOrderMark21.equals(obj22);
        int int24 = byteOrderMark21.length();
        boolean boolean26 = byteOrderMark21.equals((java.lang.Object) 0L);
        byte[] byteArray27 = byteOrderMark21.getBytes();
        boolean boolean28 = byteOrderMark4.equals((java.lang.Object) byteArray27);
        java.lang.Class<?> wildcardClass29 = byteArray27.getClass();
        org.junit.Assert.assertNotNull(byteOrderMark0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF-16LE" + "'", str3, "UTF-16LE");
        org.junit.Assert.assertNotNull(byteOrderMark4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-2, -1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(byteOrderMark8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTF-16LE" + "'", str11, "UTF-16LE");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[-1, -2]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTF-16LE" + "'", str16, "UTF-16LE");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTF-16LE" + "'", str17, "UTF-16LE");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "UTF-16LE" + "'", str18, "UTF-16LE");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[-2, -1]");
        org.junit.Assert.assertNotNull(byteOrderMark21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[-2, -1]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        org.apache.commons.io.ByteOrderMark byteOrderMark0 = org.apache.commons.io.ByteOrderMark.UTF_16BE;
        int int1 = byteOrderMark0.length();
        int int3 = byteOrderMark0.get((int) (short) 0);
        java.lang.String str4 = byteOrderMark0.toString();
        java.lang.String str5 = byteOrderMark0.toString();
        org.apache.commons.io.ByteOrderMark byteOrderMark6 = org.apache.commons.io.ByteOrderMark.UTF_16BE;
        java.lang.Object obj7 = null;
        boolean boolean8 = byteOrderMark6.equals(obj7);
        byte[] byteArray9 = byteOrderMark6.getBytes();
        java.lang.String str10 = byteOrderMark6.toString();
        java.lang.String str11 = byteOrderMark6.getCharsetName();
        java.lang.String str12 = byteOrderMark6.toString();
        byte[] byteArray13 = byteOrderMark6.getBytes();
        boolean boolean14 = byteOrderMark0.equals((java.lang.Object) byteOrderMark6);
        java.lang.String str15 = byteOrderMark0.toString();
        org.junit.Assert.assertNotNull(byteOrderMark0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 254 + "'", int3 == 254);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ByteOrderMark[UTF-16BE: 0xFE,0xFF]" + "'", str4, "ByteOrderMark[UTF-16BE: 0xFE,0xFF]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ByteOrderMark[UTF-16BE: 0xFE,0xFF]" + "'", str5, "ByteOrderMark[UTF-16BE: 0xFE,0xFF]");
        org.junit.Assert.assertNotNull(byteOrderMark6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-2, -1]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ByteOrderMark[UTF-16BE: 0xFE,0xFF]" + "'", str10, "ByteOrderMark[UTF-16BE: 0xFE,0xFF]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTF-16BE" + "'", str11, "UTF-16BE");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ByteOrderMark[UTF-16BE: 0xFE,0xFF]" + "'", str12, "ByteOrderMark[UTF-16BE: 0xFE,0xFF]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-2, -1]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ByteOrderMark[UTF-16BE: 0xFE,0xFF]" + "'", str15, "ByteOrderMark[UTF-16BE: 0xFE,0xFF]");
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        int[] intArray12 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark13 = new org.apache.commons.io.ByteOrderMark("hi!", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark14 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("hi!", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark16 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark17 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark18 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark19 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark20 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]: 0xA,0x61,0x23]", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark21 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray12);
        int int22 = byteOrderMark21.length();
        int int23 = byteOrderMark21.length();
        java.lang.Class<?> wildcardClass24 = byteOrderMark21.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        int[] intArray8 = new int[] { (short) -1, (byte) 0, 254 };
        org.apache.commons.io.ByteOrderMark byteOrderMark9 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[hi!: 0xA,0x61,0x23]", intArray8);
        org.apache.commons.io.ByteOrderMark byteOrderMark10 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray8);
        org.apache.commons.io.ByteOrderMark byteOrderMark11 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]: 0xA,0x61,0x23]: 0xA,0x61,0x23]", intArray8);
        org.apache.commons.io.ByteOrderMark byteOrderMark12 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[hi!: 0xA,0x61,0x23]: 0x0,0xA,0xFF]", intArray8);
        org.apache.commons.io.ByteOrderMark byteOrderMark13 = new org.apache.commons.io.ByteOrderMark("UTF-16BE", intArray8);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 0, 254]");
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        int[] intArray8 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark9 = new org.apache.commons.io.ByteOrderMark("hi!", intArray8);
        org.apache.commons.io.ByteOrderMark byteOrderMark10 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray8);
        org.apache.commons.io.ByteOrderMark byteOrderMark11 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-8: 0xEF,0xBB,0xBF]", intArray8);
        org.apache.commons.io.ByteOrderMark byteOrderMark12 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray8);
        org.apache.commons.io.ByteOrderMark byteOrderMark13 = new org.apache.commons.io.ByteOrderMark("UTF-8", intArray8);
        int int14 = byteOrderMark13.length();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        int[] intArray10 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark11 = new org.apache.commons.io.ByteOrderMark("hi!", intArray10);
        org.apache.commons.io.ByteOrderMark byteOrderMark12 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray10);
        org.apache.commons.io.ByteOrderMark byteOrderMark13 = new org.apache.commons.io.ByteOrderMark("hi!", intArray10);
        org.apache.commons.io.ByteOrderMark byteOrderMark14 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray10);
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[hi!: 0xA,0x61,0x23]", intArray10);
        org.apache.commons.io.ByteOrderMark byteOrderMark16 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray10);
        org.apache.commons.io.ByteOrderMark byteOrderMark17 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray10);
        java.lang.String str18 = byteOrderMark17.getCharsetName();
        int[] intArray26 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark27 = new org.apache.commons.io.ByteOrderMark("hi!", intArray26);
        org.apache.commons.io.ByteOrderMark byteOrderMark28 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray26);
        org.apache.commons.io.ByteOrderMark byteOrderMark29 = new org.apache.commons.io.ByteOrderMark("hi!", intArray26);
        org.apache.commons.io.ByteOrderMark byteOrderMark30 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray26);
        int int31 = byteOrderMark30.length();
        int[] intArray41 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark42 = new org.apache.commons.io.ByteOrderMark("hi!", intArray41);
        org.apache.commons.io.ByteOrderMark byteOrderMark43 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray41);
        org.apache.commons.io.ByteOrderMark byteOrderMark44 = new org.apache.commons.io.ByteOrderMark("hi!", intArray41);
        org.apache.commons.io.ByteOrderMark byteOrderMark45 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray41);
        org.apache.commons.io.ByteOrderMark byteOrderMark46 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray41);
        org.apache.commons.io.ByteOrderMark byteOrderMark47 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray41);
        boolean boolean48 = byteOrderMark30.equals((java.lang.Object) byteOrderMark47);
        java.lang.String str49 = byteOrderMark30.getCharsetName();
        int int51 = byteOrderMark30.get((int) (byte) 0);
        boolean boolean52 = byteOrderMark17.equals((java.lang.Object) int51);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[10, 97, 35]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ByteOrderMark[UTF-16LE: 0xFF,0xFE]" + "'", str18, "ByteOrderMark[UTF-16LE: 0xFF,0xFE]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]" + "'", str49, "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 10 + "'", int51 == 10);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        org.apache.commons.io.ByteOrderMark byteOrderMark0 = org.apache.commons.io.ByteOrderMark.UTF_8;
        int int2 = byteOrderMark0.get((int) (byte) 0);
        int[] intArray12 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark13 = new org.apache.commons.io.ByteOrderMark("hi!", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark14 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("hi!", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark16 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark17 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark18 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray12);
        int int19 = byteOrderMark18.length();
        boolean boolean20 = byteOrderMark0.equals((java.lang.Object) byteOrderMark18);
        java.lang.String str21 = byteOrderMark0.toString();
        java.lang.String str22 = byteOrderMark0.getCharsetName();
        java.lang.String str23 = byteOrderMark0.toString();
        org.junit.Assert.assertNotNull(byteOrderMark0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 239 + "'", int2 == 239);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ByteOrderMark[UTF-8: 0xEF,0xBB,0xBF]" + "'", str21, "ByteOrderMark[UTF-8: 0xEF,0xBB,0xBF]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "UTF-8" + "'", str22, "UTF-8");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "ByteOrderMark[UTF-8: 0xEF,0xBB,0xBF]" + "'", str23, "ByteOrderMark[UTF-8: 0xEF,0xBB,0xBF]");
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        org.apache.commons.io.ByteOrderMark byteOrderMark0 = org.apache.commons.io.ByteOrderMark.UTF_32BE;
        byte[] byteArray1 = byteOrderMark0.getBytes();
        java.lang.String str2 = byteOrderMark0.getCharsetName();
        org.apache.commons.io.ByteOrderMark byteOrderMark3 = org.apache.commons.io.ByteOrderMark.UTF_8;
        int int5 = byteOrderMark3.get((int) (byte) 0);
        byte[] byteArray6 = byteOrderMark3.getBytes();
        byte[] byteArray7 = byteOrderMark3.getBytes();
        boolean boolean8 = byteOrderMark0.equals((java.lang.Object) byteOrderMark3);
        int[] intArray18 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark19 = new org.apache.commons.io.ByteOrderMark("hi!", intArray18);
        org.apache.commons.io.ByteOrderMark byteOrderMark20 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray18);
        org.apache.commons.io.ByteOrderMark byteOrderMark21 = new org.apache.commons.io.ByteOrderMark("hi!", intArray18);
        org.apache.commons.io.ByteOrderMark byteOrderMark22 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray18);
        org.apache.commons.io.ByteOrderMark byteOrderMark23 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray18);
        org.apache.commons.io.ByteOrderMark byteOrderMark24 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray18);
        boolean boolean25 = byteOrderMark0.equals((java.lang.Object) intArray18);
        org.apache.commons.io.ByteOrderMark byteOrderMark26 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        java.lang.String str27 = byteOrderMark26.getCharsetName();
        java.lang.Class<?> wildcardClass28 = byteOrderMark26.getClass();
        boolean boolean29 = byteOrderMark0.equals((java.lang.Object) wildcardClass28);
        int int30 = byteOrderMark0.length();
        int int31 = byteOrderMark0.length();
        int[] intArray42 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark43 = new org.apache.commons.io.ByteOrderMark("hi!", intArray42);
        org.apache.commons.io.ByteOrderMark byteOrderMark44 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray42);
        org.apache.commons.io.ByteOrderMark byteOrderMark45 = new org.apache.commons.io.ByteOrderMark("hi!", intArray42);
        org.apache.commons.io.ByteOrderMark byteOrderMark46 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray42);
        org.apache.commons.io.ByteOrderMark byteOrderMark47 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[hi!: 0xA,0x61,0x23]", intArray42);
        org.apache.commons.io.ByteOrderMark byteOrderMark48 = new org.apache.commons.io.ByteOrderMark("hi!", intArray42);
        org.apache.commons.io.ByteOrderMark byteOrderMark49 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray42);
        boolean boolean50 = byteOrderMark0.equals((java.lang.Object) byteOrderMark49);
        java.lang.String str51 = byteOrderMark0.getCharsetName();
        int int52 = byteOrderMark0.length();
        org.junit.Assert.assertNotNull(byteOrderMark0);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[0, 0, -2, -1]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTF-32BE" + "'", str2, "UTF-32BE");
        org.junit.Assert.assertNotNull(byteOrderMark3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 239 + "'", int5 == 239);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-17, -69, -65]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-17, -69, -65]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(byteOrderMark26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "UTF-16LE" + "'", str27, "UTF-16LE");
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 4 + "'", int31 == 4);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "UTF-32BE" + "'", str51, "UTF-32BE");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 4 + "'", int52 == 4);
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        int[] intArray12 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark13 = new org.apache.commons.io.ByteOrderMark("hi!", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark14 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("hi!", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark16 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark17 = new org.apache.commons.io.ByteOrderMark("UTF-16BE", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark18 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark19 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16BE: 0xA,0x61,0x23]", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark20 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[UTF-16BE: 0xFE,0xFF]: 0xA,0x61,0x23]", intArray12);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.ByteOrderMark byteOrderMark21 = new org.apache.commons.io.ByteOrderMark("", intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No charsetName specified");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[10, 97, 35]");
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        org.apache.commons.io.ByteOrderMark byteOrderMark0 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        int int2 = byteOrderMark0.get(0);
        java.lang.String str3 = byteOrderMark0.getCharsetName();
        org.apache.commons.io.ByteOrderMark byteOrderMark4 = org.apache.commons.io.ByteOrderMark.UTF_16BE;
        java.lang.Object obj5 = null;
        boolean boolean6 = byteOrderMark4.equals(obj5);
        int int7 = byteOrderMark4.length();
        boolean boolean9 = byteOrderMark4.equals((java.lang.Object) 0L);
        int int10 = byteOrderMark4.length();
        boolean boolean11 = byteOrderMark0.equals((java.lang.Object) int10);
        int int13 = byteOrderMark0.get(0);
        java.lang.String str14 = byteOrderMark0.getCharsetName();
        int int15 = byteOrderMark0.length();
        org.junit.Assert.assertNotNull(byteOrderMark0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 255 + "'", int2 == 255);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF-16LE" + "'", str3, "UTF-16LE");
        org.junit.Assert.assertNotNull(byteOrderMark4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 255 + "'", int13 == 255);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTF-16LE" + "'", str14, "UTF-16LE");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        int[] intArray11 = new int[] { (byte) 0, 10, (-1) };
        org.apache.commons.io.ByteOrderMark byteOrderMark12 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[hi!: 0xA,0x61,0x23]", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark13 = new org.apache.commons.io.ByteOrderMark("UTF-16BE", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark14 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[UTF-16BE: 0xFE,0xFF]: 0xA,0xFE,0x64]", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("UTF-32LE", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark16 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[UTF-16BE: 0xFE,0xFF]: 0xA,0xFE,0x64]", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark17 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]: 0xA,0x61,0x23]: 0xA,0x61,0x23]", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark18 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]: 0xFF]", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark19 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[ByteOrderMark[ByteOrderMark[UTF-16LE: 0xFF,0xFE]: 0xA,0x61,0x23]: 0xA,0x61,0x23]: 0xA,0x61,0x23]", intArray11);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 10, -1]");
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        org.apache.commons.io.ByteOrderMark byteOrderMark0 = org.apache.commons.io.ByteOrderMark.UTF_32BE;
        java.lang.String str1 = byteOrderMark0.toString();
        java.lang.String str2 = byteOrderMark0.toString();
        int int4 = byteOrderMark0.get(2);
        boolean boolean6 = byteOrderMark0.equals((java.lang.Object) (byte) 10);
        byte[] byteArray7 = byteOrderMark0.getBytes();
        byte[] byteArray8 = byteOrderMark0.getBytes();
        int int9 = byteOrderMark0.length();
        java.lang.String str10 = byteOrderMark0.toString();
        org.junit.Assert.assertNotNull(byteOrderMark0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]" + "'", str1, "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]" + "'", str2, "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 254 + "'", int4 == 254);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, -2, -1]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 0, -2, -1]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]" + "'", str10, "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]");
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        int[] intArray10 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark11 = new org.apache.commons.io.ByteOrderMark("hi!", intArray10);
        org.apache.commons.io.ByteOrderMark byteOrderMark12 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray10);
        org.apache.commons.io.ByteOrderMark byteOrderMark13 = new org.apache.commons.io.ByteOrderMark("hi!", intArray10);
        org.apache.commons.io.ByteOrderMark byteOrderMark14 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray10);
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray10);
        org.apache.commons.io.ByteOrderMark byteOrderMark16 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray10);
        org.apache.commons.io.ByteOrderMark byteOrderMark17 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xA,0x61,0x23]", intArray10);
        org.apache.commons.io.ByteOrderMark byteOrderMark18 = org.apache.commons.io.ByteOrderMark.UTF_32BE;
        byte[] byteArray19 = byteOrderMark18.getBytes();
        int int20 = byteOrderMark18.length();
        boolean boolean22 = byteOrderMark18.equals((java.lang.Object) "ByteOrderMark[ByteOrderMark[UTF-8: 0xEF,0xBB,0xBF]: 0xA,0x61,0x23]");
        boolean boolean23 = byteOrderMark17.equals((java.lang.Object) byteOrderMark18);
        byte[] byteArray24 = byteOrderMark17.getBytes();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(byteOrderMark18);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[0, 0, -2, -1]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[10, 97, 35]");
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        org.apache.commons.io.ByteOrderMark byteOrderMark0 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        byte[] byteArray1 = byteOrderMark0.getBytes();
        int int2 = byteOrderMark0.length();
        java.lang.String str3 = byteOrderMark0.getCharsetName();
        java.lang.String str4 = byteOrderMark0.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = byteOrderMark0.get(35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrderMark0);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1, -2]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF-16LE" + "'", str3, "UTF-16LE");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ByteOrderMark[UTF-16LE: 0xFF,0xFE]" + "'", str4, "ByteOrderMark[UTF-16LE: 0xFF,0xFE]");
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        org.apache.commons.io.ByteOrderMark byteOrderMark0 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        boolean boolean2 = byteOrderMark0.equals((java.lang.Object) (-1L));
        java.lang.String str3 = byteOrderMark0.getCharsetName();
        boolean boolean5 = byteOrderMark0.equals((java.lang.Object) 4);
        org.junit.Assert.assertNotNull(byteOrderMark0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF-16LE" + "'", str3, "UTF-16LE");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
        org.apache.commons.io.ByteOrderMark byteOrderMark0 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        byte[] byteArray1 = byteOrderMark0.getBytes();
        int int2 = byteOrderMark0.length();
        java.lang.String str3 = byteOrderMark0.getCharsetName();
        byte[] byteArray4 = byteOrderMark0.getBytes();
        byte[] byteArray5 = byteOrderMark0.getBytes();
        org.apache.commons.io.ByteOrderMark byteOrderMark6 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        int int8 = byteOrderMark6.get(0);
        boolean boolean10 = byteOrderMark6.equals((java.lang.Object) (short) 0);
        int[] intArray17 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark18 = new org.apache.commons.io.ByteOrderMark("hi!", intArray17);
        org.apache.commons.io.ByteOrderMark byteOrderMark19 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray17);
        org.apache.commons.io.ByteOrderMark byteOrderMark20 = new org.apache.commons.io.ByteOrderMark("hi!", intArray17);
        boolean boolean21 = byteOrderMark6.equals((java.lang.Object) byteOrderMark20);
        int[] intArray27 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark28 = new org.apache.commons.io.ByteOrderMark("hi!", intArray27);
        org.apache.commons.io.ByteOrderMark byteOrderMark29 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[ByteOrderMark[UTF-16LE: 0xFF,0xFE]: 0xA,0x61,0x23]: 0xA,0x61,0x23]", intArray27);
        boolean boolean30 = byteOrderMark20.equals((java.lang.Object) "ByteOrderMark[ByteOrderMark[ByteOrderMark[UTF-16LE: 0xFF,0xFE]: 0xA,0x61,0x23]: 0xA,0x61,0x23]");
        java.lang.String str31 = byteOrderMark20.toString();
        int int32 = byteOrderMark20.length();
        int[] intArray38 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark39 = new org.apache.commons.io.ByteOrderMark("hi!", intArray38);
        org.apache.commons.io.ByteOrderMark byteOrderMark40 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray38);
        byte[] byteArray41 = byteOrderMark40.getBytes();
        boolean boolean42 = byteOrderMark20.equals((java.lang.Object) byteArray41);
        byte[] byteArray43 = byteOrderMark20.getBytes();
        boolean boolean44 = byteOrderMark0.equals((java.lang.Object) byteArray43);
        java.lang.String str45 = byteOrderMark0.getCharsetName();
        org.junit.Assert.assertNotNull(byteOrderMark0);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1, -2]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF-16LE" + "'", str3, "UTF-16LE");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, -2]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, -2]");
        org.junit.Assert.assertNotNull(byteOrderMark6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 255 + "'", int8 == 255);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "ByteOrderMark[hi!: 0xA,0x61,0x23]" + "'", str31, "ByteOrderMark[hi!: 0xA,0x61,0x23]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "UTF-16LE" + "'", str45, "UTF-16LE");
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        org.apache.commons.io.ByteOrderMark byteOrderMark0 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        boolean boolean2 = byteOrderMark0.equals((java.lang.Object) 1L);
        java.lang.String str3 = byteOrderMark0.getCharsetName();
        int int4 = byteOrderMark0.length();
        boolean boolean6 = byteOrderMark0.equals((java.lang.Object) (byte) -1);
        byte[] byteArray7 = byteOrderMark0.getBytes();
        java.lang.String str8 = byteOrderMark0.getCharsetName();
        java.lang.String str9 = byteOrderMark0.getCharsetName();
        java.lang.String str10 = byteOrderMark0.toString();
        int int11 = byteOrderMark0.length();
        int int13 = byteOrderMark0.get((int) (byte) 1);
        boolean boolean15 = byteOrderMark0.equals((java.lang.Object) "ByteOrderMark[UTF-16LE: 0xA,0x61,0x23]");
        byte[] byteArray16 = byteOrderMark0.getBytes();
        int[] intArray28 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark29 = new org.apache.commons.io.ByteOrderMark("hi!", intArray28);
        org.apache.commons.io.ByteOrderMark byteOrderMark30 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray28);
        org.apache.commons.io.ByteOrderMark byteOrderMark31 = new org.apache.commons.io.ByteOrderMark("hi!", intArray28);
        org.apache.commons.io.ByteOrderMark byteOrderMark32 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray28);
        org.apache.commons.io.ByteOrderMark byteOrderMark33 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray28);
        org.apache.commons.io.ByteOrderMark byteOrderMark34 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray28);
        org.apache.commons.io.ByteOrderMark byteOrderMark35 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray28);
        org.apache.commons.io.ByteOrderMark byteOrderMark36 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray28);
        int int37 = byteOrderMark36.length();
        java.lang.String str38 = byteOrderMark36.toString();
        boolean boolean39 = byteOrderMark0.equals((java.lang.Object) byteOrderMark36);
        byte[] byteArray40 = byteOrderMark36.getBytes();
        java.lang.String str41 = byteOrderMark36.getCharsetName();
        org.junit.Assert.assertNotNull(byteOrderMark0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF-16LE" + "'", str3, "UTF-16LE");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -2]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF-16LE" + "'", str8, "UTF-16LE");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTF-16LE" + "'", str9, "UTF-16LE");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ByteOrderMark[UTF-16LE: 0xFF,0xFE]" + "'", str10, "ByteOrderMark[UTF-16LE: 0xFF,0xFE]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 254 + "'", int13 == 254);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[-1, -2]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 3 + "'", int37 == 3);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "ByteOrderMark[ByteOrderMark[UTF-16LE: 0xFF,0xFE]: 0xA,0x61,0x23]" + "'", str38, "ByteOrderMark[ByteOrderMark[UTF-16LE: 0xFF,0xFE]: 0xA,0x61,0x23]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[10, 97, 35]");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "ByteOrderMark[UTF-16LE: 0xFF,0xFE]" + "'", str41, "ByteOrderMark[UTF-16LE: 0xFF,0xFE]");
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
        int[] intArray11 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark12 = new org.apache.commons.io.ByteOrderMark("hi!", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark13 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark14 = new org.apache.commons.io.ByteOrderMark("hi!", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark16 = new org.apache.commons.io.ByteOrderMark("UTF-16BE", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark17 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark18 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[hi!: 0xA,0x61,0x23]", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark19 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0xA,0x61,0x23]", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark20 = org.apache.commons.io.ByteOrderMark.UTF_32BE;
        byte[] byteArray21 = byteOrderMark20.getBytes();
        java.lang.String str22 = byteOrderMark20.getCharsetName();
        org.apache.commons.io.ByteOrderMark byteOrderMark23 = org.apache.commons.io.ByteOrderMark.UTF_8;
        int int25 = byteOrderMark23.get((int) (byte) 0);
        byte[] byteArray26 = byteOrderMark23.getBytes();
        byte[] byteArray27 = byteOrderMark23.getBytes();
        boolean boolean28 = byteOrderMark20.equals((java.lang.Object) byteOrderMark23);
        org.apache.commons.io.ByteOrderMark byteOrderMark29 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        int int31 = byteOrderMark29.get(0);
        java.lang.String str32 = byteOrderMark29.getCharsetName();
        org.apache.commons.io.ByteOrderMark byteOrderMark33 = org.apache.commons.io.ByteOrderMark.UTF_16BE;
        java.lang.Object obj34 = null;
        boolean boolean35 = byteOrderMark33.equals(obj34);
        int int36 = byteOrderMark33.length();
        boolean boolean38 = byteOrderMark33.equals((java.lang.Object) 0L);
        int int39 = byteOrderMark33.length();
        boolean boolean40 = byteOrderMark29.equals((java.lang.Object) int39);
        int int42 = byteOrderMark29.get(0);
        boolean boolean43 = byteOrderMark20.equals((java.lang.Object) 0);
        org.apache.commons.io.ByteOrderMark byteOrderMark44 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        boolean boolean46 = byteOrderMark44.equals((java.lang.Object) (-1L));
        java.lang.String str47 = byteOrderMark44.toString();
        byte[] byteArray48 = byteOrderMark44.getBytes();
        java.lang.Class<?> wildcardClass49 = byteArray48.getClass();
        boolean boolean50 = byteOrderMark20.equals((java.lang.Object) wildcardClass49);
        boolean boolean51 = byteOrderMark19.equals((java.lang.Object) byteOrderMark20);
        java.lang.String str52 = byteOrderMark19.getCharsetName();
        int[] intArray61 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark62 = new org.apache.commons.io.ByteOrderMark("hi!", intArray61);
        org.apache.commons.io.ByteOrderMark byteOrderMark63 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray61);
        org.apache.commons.io.ByteOrderMark byteOrderMark64 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-8: 0xEF,0xBB,0xBF]", intArray61);
        org.apache.commons.io.ByteOrderMark byteOrderMark65 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray61);
        org.apache.commons.io.ByteOrderMark byteOrderMark66 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]: 0xFF]", intArray61);
        boolean boolean67 = byteOrderMark19.equals((java.lang.Object) byteOrderMark66);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(byteOrderMark20);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[0, 0, -2, -1]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "UTF-32BE" + "'", str22, "UTF-32BE");
        org.junit.Assert.assertNotNull(byteOrderMark23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 239 + "'", int25 == 239);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[-17, -69, -65]");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[-17, -69, -65]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(byteOrderMark29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 255 + "'", int31 == 255);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "UTF-16LE" + "'", str32, "UTF-16LE");
        org.junit.Assert.assertNotNull(byteOrderMark33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2 + "'", int39 == 2);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 255 + "'", int42 == 255);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(byteOrderMark44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "ByteOrderMark[UTF-16LE: 0xFF,0xFE]" + "'", str47, "ByteOrderMark[UTF-16LE: 0xFF,0xFE]");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[-1, -2]");
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "ByteOrderMark[UTF-32BE: 0xA,0x61,0x23]" + "'", str52, "ByteOrderMark[UTF-32BE: 0xA,0x61,0x23]");
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray61), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        org.apache.commons.io.ByteOrderMark byteOrderMark0 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        boolean boolean2 = byteOrderMark0.equals((java.lang.Object) 1L);
        java.lang.String str3 = byteOrderMark0.getCharsetName();
        int int4 = byteOrderMark0.length();
        java.lang.String str5 = byteOrderMark0.toString();
        java.lang.String str6 = byteOrderMark0.toString();
        int int7 = byteOrderMark0.length();
        java.lang.String str8 = byteOrderMark0.getCharsetName();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = byteOrderMark0.get((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrderMark0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF-16LE" + "'", str3, "UTF-16LE");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ByteOrderMark[UTF-16LE: 0xFF,0xFE]" + "'", str5, "ByteOrderMark[UTF-16LE: 0xFF,0xFE]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ByteOrderMark[UTF-16LE: 0xFF,0xFE]" + "'", str6, "ByteOrderMark[UTF-16LE: 0xFF,0xFE]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF-16LE" + "'", str8, "UTF-16LE");
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        org.apache.commons.io.ByteOrderMark byteOrderMark0 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        int int2 = byteOrderMark0.get(0);
        boolean boolean4 = byteOrderMark0.equals((java.lang.Object) (short) 0);
        int[] intArray11 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark12 = new org.apache.commons.io.ByteOrderMark("hi!", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark13 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark14 = new org.apache.commons.io.ByteOrderMark("hi!", intArray11);
        boolean boolean15 = byteOrderMark0.equals((java.lang.Object) byteOrderMark14);
        java.lang.Class<?> wildcardClass16 = byteOrderMark14.getClass();
        org.junit.Assert.assertNotNull(byteOrderMark0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 255 + "'", int2 == 255);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        int[] intArray4 = new int[] { 255 };
        org.apache.commons.io.ByteOrderMark byteOrderMark5 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0xA,0x61,0x23]", intArray4);
        org.apache.commons.io.ByteOrderMark byteOrderMark6 = new org.apache.commons.io.ByteOrderMark("UTF-8", intArray4);
        org.apache.commons.io.ByteOrderMark byteOrderMark7 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0xA,0x61,0x23]", intArray4);
        java.lang.String str8 = byteOrderMark7.toString();
        java.lang.Object obj9 = null;
        boolean boolean10 = byteOrderMark7.equals(obj9);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[255]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ByteOrderMark[ByteOrderMark[UTF-32BE: 0xA,0x61,0x23]: 0xFF]" + "'", str8, "ByteOrderMark[ByteOrderMark[UTF-32BE: 0xA,0x61,0x23]: 0xFF]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
        org.apache.commons.io.ByteOrderMark byteOrderMark0 = org.apache.commons.io.ByteOrderMark.UTF_8;
        int int2 = byteOrderMark0.get((int) (byte) 0);
        int[] intArray12 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark13 = new org.apache.commons.io.ByteOrderMark("hi!", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark14 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("hi!", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark16 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark17 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark18 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray12);
        int int19 = byteOrderMark18.length();
        boolean boolean20 = byteOrderMark0.equals((java.lang.Object) byteOrderMark18);
        int[] intArray30 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark31 = new org.apache.commons.io.ByteOrderMark("hi!", intArray30);
        org.apache.commons.io.ByteOrderMark byteOrderMark32 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray30);
        org.apache.commons.io.ByteOrderMark byteOrderMark33 = new org.apache.commons.io.ByteOrderMark("hi!", intArray30);
        org.apache.commons.io.ByteOrderMark byteOrderMark34 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray30);
        org.apache.commons.io.ByteOrderMark byteOrderMark35 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray30);
        org.apache.commons.io.ByteOrderMark byteOrderMark36 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray30);
        int int37 = byteOrderMark36.length();
        boolean boolean38 = byteOrderMark18.equals((java.lang.Object) int37);
        byte[] byteArray39 = byteOrderMark18.getBytes();
        int int41 = byteOrderMark18.get(0);
        org.junit.Assert.assertNotNull(byteOrderMark0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 239 + "'", int2 == 239);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 3 + "'", int37 == 3);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
        int[] intArray12 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark13 = new org.apache.commons.io.ByteOrderMark("hi!", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark14 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("hi!", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark16 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark17 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark18 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark19 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[UTF-16LE: 0xFF,0xFE]: 0xA,0x61,0x23]", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark20 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0xA,0x61,0x23]", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark21 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32LE: 0xFF,0xFE,0x0,0x0]", intArray12);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[10, 97, 35]");
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
        org.apache.commons.io.ByteOrderMark byteOrderMark0 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        boolean boolean2 = byteOrderMark0.equals((java.lang.Object) 1L);
        java.lang.String str3 = byteOrderMark0.getCharsetName();
        int int4 = byteOrderMark0.length();
        boolean boolean6 = byteOrderMark0.equals((java.lang.Object) (-1.0f));
        java.lang.String str7 = byteOrderMark0.toString();
        byte[] byteArray8 = byteOrderMark0.getBytes();
        org.apache.commons.io.ByteOrderMark byteOrderMark9 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        int int11 = byteOrderMark9.get(0);
        byte[] byteArray12 = byteOrderMark9.getBytes();
        byte[] byteArray13 = byteOrderMark9.getBytes();
        org.apache.commons.io.ByteOrderMark byteOrderMark14 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        boolean boolean16 = byteOrderMark14.equals((java.lang.Object) 1L);
        java.lang.String str17 = byteOrderMark14.getCharsetName();
        boolean boolean18 = byteOrderMark9.equals((java.lang.Object) byteOrderMark14);
        int int19 = byteOrderMark14.length();
        java.lang.String str20 = byteOrderMark14.toString();
        boolean boolean21 = byteOrderMark0.equals((java.lang.Object) byteOrderMark14);
        org.junit.Assert.assertNotNull(byteOrderMark0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF-16LE" + "'", str3, "UTF-16LE");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ByteOrderMark[UTF-16LE: 0xFF,0xFE]" + "'", str7, "ByteOrderMark[UTF-16LE: 0xFF,0xFE]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, -2]");
        org.junit.Assert.assertNotNull(byteOrderMark9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 255 + "'", int11 == 255);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[-1, -2]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, -2]");
        org.junit.Assert.assertNotNull(byteOrderMark14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTF-16LE" + "'", str17, "UTF-16LE");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ByteOrderMark[UTF-16LE: 0xFF,0xFE]" + "'", str20, "ByteOrderMark[UTF-16LE: 0xFF,0xFE]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
        int[] intArray7 = new int[] { 10, 254, 100 };
        org.apache.commons.io.ByteOrderMark byteOrderMark8 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16BE: 0xFE,0xFF]", intArray7);
        org.apache.commons.io.ByteOrderMark byteOrderMark9 = new org.apache.commons.io.ByteOrderMark("UTF-32LE", intArray7);
        org.apache.commons.io.ByteOrderMark byteOrderMark10 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[ByteOrderMark[UTF-8: 0xEF,0xBB,0xBF]: 0xA,0x61,0x23]: 0xA,0x61,0x23]", intArray7);
        org.apache.commons.io.ByteOrderMark byteOrderMark11 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[UTF-32BE: 0xA,0x61,0x23]: 0xA,0x61,0x23]", intArray7);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 254, 100]");
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
        int[] intArray9 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark10 = new org.apache.commons.io.ByteOrderMark("hi!", intArray9);
        org.apache.commons.io.ByteOrderMark byteOrderMark11 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray9);
        org.apache.commons.io.ByteOrderMark byteOrderMark12 = new org.apache.commons.io.ByteOrderMark("hi!", intArray9);
        org.apache.commons.io.ByteOrderMark byteOrderMark13 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0xA,0x61,0x23]", intArray9);
        org.apache.commons.io.ByteOrderMark byteOrderMark14 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[ByteOrderMark[UTF-32BE: 0xA,0x61,0x23]: 0xA,0x61,0x23]: 0xA,0x61,0x23]", intArray9);
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[UTF-16LE: 0xA,0x61,0x23]: 0xA,0x61,0x23]", intArray9);
        int int16 = byteOrderMark15.length();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        int[] intArray9 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark10 = new org.apache.commons.io.ByteOrderMark("hi!", intArray9);
        org.apache.commons.io.ByteOrderMark byteOrderMark11 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray9);
        org.apache.commons.io.ByteOrderMark byteOrderMark12 = new org.apache.commons.io.ByteOrderMark("hi!", intArray9);
        org.apache.commons.io.ByteOrderMark byteOrderMark13 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray9);
        org.apache.commons.io.ByteOrderMark byteOrderMark14 = new org.apache.commons.io.ByteOrderMark("UTF-16BE", intArray9);
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray9);
        int int16 = byteOrderMark15.length();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
        org.apache.commons.io.ByteOrderMark byteOrderMark0 = org.apache.commons.io.ByteOrderMark.UTF_32BE;
        java.lang.String str1 = byteOrderMark0.toString();
        java.lang.String str2 = byteOrderMark0.toString();
        int int4 = byteOrderMark0.get(2);
        boolean boolean6 = byteOrderMark0.equals((java.lang.Object) (byte) 10);
        byte[] byteArray7 = byteOrderMark0.getBytes();
        int[] intArray17 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark18 = new org.apache.commons.io.ByteOrderMark("hi!", intArray17);
        org.apache.commons.io.ByteOrderMark byteOrderMark19 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray17);
        org.apache.commons.io.ByteOrderMark byteOrderMark20 = new org.apache.commons.io.ByteOrderMark("hi!", intArray17);
        org.apache.commons.io.ByteOrderMark byteOrderMark21 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray17);
        org.apache.commons.io.ByteOrderMark byteOrderMark22 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray17);
        org.apache.commons.io.ByteOrderMark byteOrderMark23 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray17);
        boolean boolean24 = byteOrderMark0.equals((java.lang.Object) byteOrderMark23);
        int int25 = byteOrderMark0.length();
        int[] intArray34 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark35 = new org.apache.commons.io.ByteOrderMark("hi!", intArray34);
        org.apache.commons.io.ByteOrderMark byteOrderMark36 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray34);
        org.apache.commons.io.ByteOrderMark byteOrderMark37 = new org.apache.commons.io.ByteOrderMark("hi!", intArray34);
        org.apache.commons.io.ByteOrderMark byteOrderMark38 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray34);
        org.apache.commons.io.ByteOrderMark byteOrderMark39 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[hi!: 0xA,0x61,0x23]", intArray34);
        java.lang.Class<?> wildcardClass40 = byteOrderMark39.getClass();
        boolean boolean41 = byteOrderMark0.equals((java.lang.Object) wildcardClass40);
        int int43 = byteOrderMark0.get(0);
        org.apache.commons.io.ByteOrderMark byteOrderMark44 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        boolean boolean46 = byteOrderMark44.equals((java.lang.Object) 1L);
        java.lang.String str47 = byteOrderMark44.getCharsetName();
        org.apache.commons.io.ByteOrderMark byteOrderMark48 = org.apache.commons.io.ByteOrderMark.UTF_16BE;
        boolean boolean49 = byteOrderMark44.equals((java.lang.Object) byteOrderMark48);
        boolean boolean51 = byteOrderMark48.equals((java.lang.Object) (short) -1);
        boolean boolean52 = byteOrderMark0.equals((java.lang.Object) boolean51);
        int int54 = byteOrderMark0.get((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int56 = byteOrderMark0.get((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrderMark0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]" + "'", str1, "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]" + "'", str2, "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 254 + "'", int4 == 254);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, -2, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(byteOrderMark44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "UTF-16LE" + "'", str47, "UTF-16LE");
        org.junit.Assert.assertNotNull(byteOrderMark48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        int[] intArray4 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark5 = new org.apache.commons.io.ByteOrderMark("hi!", intArray4);
        java.lang.String str6 = byteOrderMark5.getCharsetName();
        java.lang.Object obj7 = null;
        boolean boolean8 = byteOrderMark5.equals(obj7);
        byte[] byteArray9 = byteOrderMark5.getBytes();
        byte[] byteArray10 = byteOrderMark5.getBytes();
        byte[] byteArray11 = byteOrderMark5.getBytes();
        org.apache.commons.io.ByteOrderMark byteOrderMark12 = org.apache.commons.io.ByteOrderMark.UTF_16BE;
        java.lang.Object obj13 = null;
        boolean boolean14 = byteOrderMark12.equals(obj13);
        int int15 = byteOrderMark12.length();
        boolean boolean17 = byteOrderMark12.equals((java.lang.Object) 0L);
        int int18 = byteOrderMark12.length();
        int int19 = byteOrderMark12.length();
        int[] intArray26 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark27 = new org.apache.commons.io.ByteOrderMark("hi!", intArray26);
        org.apache.commons.io.ByteOrderMark byteOrderMark28 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray26);
        org.apache.commons.io.ByteOrderMark byteOrderMark29 = new org.apache.commons.io.ByteOrderMark("hi!", intArray26);
        boolean boolean30 = byteOrderMark12.equals((java.lang.Object) intArray26);
        int[] intArray38 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark39 = new org.apache.commons.io.ByteOrderMark("hi!", intArray38);
        org.apache.commons.io.ByteOrderMark byteOrderMark40 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray38);
        org.apache.commons.io.ByteOrderMark byteOrderMark41 = new org.apache.commons.io.ByteOrderMark("hi!", intArray38);
        org.apache.commons.io.ByteOrderMark byteOrderMark42 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray38);
        int int43 = byteOrderMark42.length();
        boolean boolean44 = byteOrderMark12.equals((java.lang.Object) byteOrderMark42);
        org.apache.commons.io.ByteOrderMark byteOrderMark45 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        int int47 = byteOrderMark45.get(0);
        boolean boolean49 = byteOrderMark45.equals((java.lang.Object) (short) 0);
        int[] intArray56 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark57 = new org.apache.commons.io.ByteOrderMark("hi!", intArray56);
        org.apache.commons.io.ByteOrderMark byteOrderMark58 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray56);
        org.apache.commons.io.ByteOrderMark byteOrderMark59 = new org.apache.commons.io.ByteOrderMark("hi!", intArray56);
        boolean boolean60 = byteOrderMark45.equals((java.lang.Object) byteOrderMark59);
        boolean boolean61 = byteOrderMark12.equals((java.lang.Object) byteOrderMark45);
        byte[] byteArray62 = byteOrderMark45.getBytes();
        boolean boolean63 = byteOrderMark5.equals((java.lang.Object) byteArray62);
        int[] intArray73 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark74 = new org.apache.commons.io.ByteOrderMark("hi!", intArray73);
        org.apache.commons.io.ByteOrderMark byteOrderMark75 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray73);
        org.apache.commons.io.ByteOrderMark byteOrderMark76 = new org.apache.commons.io.ByteOrderMark("hi!", intArray73);
        org.apache.commons.io.ByteOrderMark byteOrderMark77 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray73);
        org.apache.commons.io.ByteOrderMark byteOrderMark78 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0xA,0x61,0x23]", intArray73);
        org.apache.commons.io.ByteOrderMark byteOrderMark79 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray73);
        boolean boolean80 = byteOrderMark5.equals((java.lang.Object) intArray73);
        java.lang.String str81 = byteOrderMark5.toString();
        java.lang.String str82 = byteOrderMark5.getCharsetName();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 97, 35]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(byteOrderMark12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 3 + "'", int43 == 3);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(byteOrderMark45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 255 + "'", int47 == 255);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray62), "[-1, -2]");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray73), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "ByteOrderMark[hi!: 0xA,0x61,0x23]" + "'", str81, "ByteOrderMark[hi!: 0xA,0x61,0x23]");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "hi!" + "'", str82, "hi!");
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        org.apache.commons.io.ByteOrderMark byteOrderMark0 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        boolean boolean2 = byteOrderMark0.equals((java.lang.Object) 1L);
        java.lang.String str3 = byteOrderMark0.getCharsetName();
        org.apache.commons.io.ByteOrderMark byteOrderMark4 = org.apache.commons.io.ByteOrderMark.UTF_16BE;
        boolean boolean5 = byteOrderMark0.equals((java.lang.Object) byteOrderMark4);
        byte[] byteArray6 = byteOrderMark4.getBytes();
        int int7 = byteOrderMark4.length();
        int int8 = byteOrderMark4.length();
        int[] intArray20 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark21 = new org.apache.commons.io.ByteOrderMark("hi!", intArray20);
        org.apache.commons.io.ByteOrderMark byteOrderMark22 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray20);
        org.apache.commons.io.ByteOrderMark byteOrderMark23 = new org.apache.commons.io.ByteOrderMark("hi!", intArray20);
        org.apache.commons.io.ByteOrderMark byteOrderMark24 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray20);
        org.apache.commons.io.ByteOrderMark byteOrderMark25 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[hi!: 0xA,0x61,0x23]", intArray20);
        org.apache.commons.io.ByteOrderMark byteOrderMark26 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xA,0x61,0x23]", intArray20);
        org.apache.commons.io.ByteOrderMark byteOrderMark27 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-8: 0xEF,0xBB,0xBF]", intArray20);
        org.apache.commons.io.ByteOrderMark byteOrderMark28 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[UTF-16BE: 0xFE,0xFF]: 0xA,0x61,0x23]", intArray20);
        boolean boolean29 = byteOrderMark4.equals((java.lang.Object) "ByteOrderMark[ByteOrderMark[UTF-16BE: 0xFE,0xFF]: 0xA,0x61,0x23]");
        byte[] byteArray30 = byteOrderMark4.getBytes();
        java.lang.String str31 = byteOrderMark4.toString();
        boolean boolean33 = byteOrderMark4.equals((java.lang.Object) (-1));
        org.junit.Assert.assertNotNull(byteOrderMark0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF-16LE" + "'", str3, "UTF-16LE");
        org.junit.Assert.assertNotNull(byteOrderMark4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-2, -1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[-2, -1]");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "ByteOrderMark[UTF-16BE: 0xFE,0xFF]" + "'", str31, "ByteOrderMark[UTF-16BE: 0xFE,0xFF]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        org.apache.commons.io.ByteOrderMark byteOrderMark0 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        boolean boolean2 = byteOrderMark0.equals((java.lang.Object) (-1L));
        java.lang.String str3 = byteOrderMark0.getCharsetName();
        org.apache.commons.io.ByteOrderMark byteOrderMark4 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        int int6 = byteOrderMark4.get(0);
        java.lang.String str7 = byteOrderMark4.getCharsetName();
        byte[] byteArray8 = byteOrderMark4.getBytes();
        boolean boolean9 = byteOrderMark0.equals((java.lang.Object) byteOrderMark4);
        int[] intArray19 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark20 = new org.apache.commons.io.ByteOrderMark("hi!", intArray19);
        org.apache.commons.io.ByteOrderMark byteOrderMark21 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray19);
        org.apache.commons.io.ByteOrderMark byteOrderMark22 = new org.apache.commons.io.ByteOrderMark("hi!", intArray19);
        org.apache.commons.io.ByteOrderMark byteOrderMark23 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray19);
        org.apache.commons.io.ByteOrderMark byteOrderMark24 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray19);
        org.apache.commons.io.ByteOrderMark byteOrderMark25 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray19);
        int int26 = byteOrderMark25.length();
        org.apache.commons.io.ByteOrderMark byteOrderMark27 = org.apache.commons.io.ByteOrderMark.UTF_16BE;
        java.lang.Object obj28 = null;
        boolean boolean29 = byteOrderMark27.equals(obj28);
        byte[] byteArray30 = byteOrderMark27.getBytes();
        java.lang.String str31 = byteOrderMark27.toString();
        int int33 = byteOrderMark27.get((int) (byte) 0);
        boolean boolean34 = byteOrderMark25.equals((java.lang.Object) byteOrderMark27);
        java.lang.String str35 = byteOrderMark25.toString();
        java.lang.String str36 = byteOrderMark25.toString();
        org.apache.commons.io.ByteOrderMark byteOrderMark37 = org.apache.commons.io.ByteOrderMark.UTF_32BE;
        java.lang.String str38 = byteOrderMark37.toString();
        java.lang.String str39 = byteOrderMark37.toString();
        int int41 = byteOrderMark37.get(2);
        boolean boolean43 = byteOrderMark37.equals((java.lang.Object) (byte) 10);
        byte[] byteArray44 = byteOrderMark37.getBytes();
        boolean boolean45 = byteOrderMark25.equals((java.lang.Object) byteArray44);
        boolean boolean46 = byteOrderMark4.equals((java.lang.Object) byteOrderMark25);
        java.lang.Class<?> wildcardClass47 = byteOrderMark25.getClass();
        org.junit.Assert.assertNotNull(byteOrderMark0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF-16LE" + "'", str3, "UTF-16LE");
        org.junit.Assert.assertNotNull(byteOrderMark4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 255 + "'", int6 == 255);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTF-16LE" + "'", str7, "UTF-16LE");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, -2]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertNotNull(byteOrderMark27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[-2, -1]");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "ByteOrderMark[UTF-16BE: 0xFE,0xFF]" + "'", str31, "ByteOrderMark[UTF-16BE: 0xFE,0xFF]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 254 + "'", int33 == 254);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "ByteOrderMark[ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]: 0xA,0x61,0x23]" + "'", str35, "ByteOrderMark[ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]: 0xA,0x61,0x23]");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "ByteOrderMark[ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]: 0xA,0x61,0x23]" + "'", str36, "ByteOrderMark[ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]: 0xA,0x61,0x23]");
        org.junit.Assert.assertNotNull(byteOrderMark37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]" + "'", str38, "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]" + "'", str39, "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 254 + "'", int41 == 254);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[0, 0, -2, -1]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        org.apache.commons.io.ByteOrderMark byteOrderMark0 = org.apache.commons.io.ByteOrderMark.UTF_32BE;
        java.lang.String str1 = byteOrderMark0.toString();
        java.lang.String str2 = byteOrderMark0.toString();
        java.lang.String str3 = byteOrderMark0.getCharsetName();
        int int4 = byteOrderMark0.length();
        int[] intArray13 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark14 = new org.apache.commons.io.ByteOrderMark("hi!", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark16 = new org.apache.commons.io.ByteOrderMark("hi!", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark17 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark18 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray13);
        int[] intArray26 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark27 = new org.apache.commons.io.ByteOrderMark("hi!", intArray26);
        org.apache.commons.io.ByteOrderMark byteOrderMark28 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray26);
        org.apache.commons.io.ByteOrderMark byteOrderMark29 = new org.apache.commons.io.ByteOrderMark("hi!", intArray26);
        org.apache.commons.io.ByteOrderMark byteOrderMark30 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray26);
        boolean boolean31 = byteOrderMark18.equals((java.lang.Object) "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]");
        java.lang.String str32 = byteOrderMark18.toString();
        java.lang.String str33 = byteOrderMark18.getCharsetName();
        java.lang.String str34 = byteOrderMark18.getCharsetName();
        java.lang.String str35 = byteOrderMark18.toString();
        boolean boolean36 = byteOrderMark0.equals((java.lang.Object) byteOrderMark18);
        int[] intArray49 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark50 = new org.apache.commons.io.ByteOrderMark("hi!", intArray49);
        org.apache.commons.io.ByteOrderMark byteOrderMark51 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray49);
        org.apache.commons.io.ByteOrderMark byteOrderMark52 = new org.apache.commons.io.ByteOrderMark("hi!", intArray49);
        org.apache.commons.io.ByteOrderMark byteOrderMark53 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray49);
        org.apache.commons.io.ByteOrderMark byteOrderMark54 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[hi!: 0xA,0x61,0x23]", intArray49);
        org.apache.commons.io.ByteOrderMark byteOrderMark55 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xA,0x61,0x23]", intArray49);
        org.apache.commons.io.ByteOrderMark byteOrderMark56 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-8: 0xEF,0xBB,0xBF]", intArray49);
        org.apache.commons.io.ByteOrderMark byteOrderMark57 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[hi!: 0xA,0x61,0x23]", intArray49);
        org.apache.commons.io.ByteOrderMark byteOrderMark58 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[ByteOrderMark[UTF-16LE: 0xFF,0xFE]: 0xA,0x61,0x23]: 0xA,0x61,0x23]", intArray49);
        int int60 = byteOrderMark58.get((int) (short) 0);
        byte[] byteArray61 = byteOrderMark58.getBytes();
        boolean boolean62 = byteOrderMark18.equals((java.lang.Object) byteArray61);
        byte[] byteArray63 = byteOrderMark18.getBytes();
        org.junit.Assert.assertNotNull(byteOrderMark0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]" + "'", str1, "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]" + "'", str2, "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF-32BE" + "'", str3, "UTF-32BE");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "ByteOrderMark[UTF-32BE: 0xA,0x61,0x23]" + "'", str32, "ByteOrderMark[UTF-32BE: 0xA,0x61,0x23]");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "UTF-32BE" + "'", str33, "UTF-32BE");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "UTF-32BE" + "'", str34, "UTF-32BE");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "ByteOrderMark[UTF-32BE: 0xA,0x61,0x23]" + "'", str35, "ByteOrderMark[UTF-32BE: 0xA,0x61,0x23]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 10 + "'", int60 == 10);
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray63), "[10, 97, 35]");
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
        org.apache.commons.io.ByteOrderMark byteOrderMark0 = org.apache.commons.io.ByteOrderMark.UTF_32BE;
        byte[] byteArray1 = byteOrderMark0.getBytes();
        java.lang.String str2 = byteOrderMark0.getCharsetName();
        org.apache.commons.io.ByteOrderMark byteOrderMark3 = org.apache.commons.io.ByteOrderMark.UTF_8;
        int int5 = byteOrderMark3.get((int) (byte) 0);
        byte[] byteArray6 = byteOrderMark3.getBytes();
        byte[] byteArray7 = byteOrderMark3.getBytes();
        boolean boolean8 = byteOrderMark0.equals((java.lang.Object) byteOrderMark3);
        boolean boolean10 = byteOrderMark3.equals((java.lang.Object) '\ufeff');
        byte[] byteArray11 = byteOrderMark3.getBytes();
        java.lang.String str12 = byteOrderMark3.toString();
        int int14 = byteOrderMark3.get(2);
        org.junit.Assert.assertNotNull(byteOrderMark0);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[0, 0, -2, -1]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTF-32BE" + "'", str2, "UTF-32BE");
        org.junit.Assert.assertNotNull(byteOrderMark3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 239 + "'", int5 == 239);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-17, -69, -65]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-17, -69, -65]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-17, -69, -65]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ByteOrderMark[UTF-8: 0xEF,0xBB,0xBF]" + "'", str12, "ByteOrderMark[UTF-8: 0xEF,0xBB,0xBF]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 191 + "'", int14 == 191);
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
        int[] intArray14 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("hi!", intArray14);
        org.apache.commons.io.ByteOrderMark byteOrderMark16 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray14);
        org.apache.commons.io.ByteOrderMark byteOrderMark17 = new org.apache.commons.io.ByteOrderMark("hi!", intArray14);
        org.apache.commons.io.ByteOrderMark byteOrderMark18 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray14);
        org.apache.commons.io.ByteOrderMark byteOrderMark19 = new org.apache.commons.io.ByteOrderMark("hi!", intArray14);
        org.apache.commons.io.ByteOrderMark byteOrderMark20 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[hi!: 0xA,0x61,0x23]", intArray14);
        org.apache.commons.io.ByteOrderMark byteOrderMark21 = new org.apache.commons.io.ByteOrderMark("UTF-8", intArray14);
        org.apache.commons.io.ByteOrderMark byteOrderMark22 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]: 0xA,0x61,0x23]", intArray14);
        org.apache.commons.io.ByteOrderMark byteOrderMark23 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray14);
        org.apache.commons.io.ByteOrderMark byteOrderMark24 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-8: 0xEF,0xBB,0xBF]", intArray14);
        org.apache.commons.io.ByteOrderMark byteOrderMark25 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[UTF-16BE: 0xFE,0xFF]: 0xA,0xFE,0x64]", intArray14);
        int int26 = byteOrderMark25.length();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
        int[] intArray8 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark9 = new org.apache.commons.io.ByteOrderMark("hi!", intArray8);
        org.apache.commons.io.ByteOrderMark byteOrderMark10 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray8);
        org.apache.commons.io.ByteOrderMark byteOrderMark11 = new org.apache.commons.io.ByteOrderMark("hi!", intArray8);
        org.apache.commons.io.ByteOrderMark byteOrderMark12 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray8);
        org.apache.commons.io.ByteOrderMark byteOrderMark13 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray8);
        byte[] byteArray14 = byteOrderMark13.getBytes();
        int int15 = byteOrderMark13.length();
        java.lang.String str16 = byteOrderMark13.toString();
        java.lang.String str17 = byteOrderMark13.toString();
        byte[] byteArray18 = byteOrderMark13.getBytes();
        int[] intArray30 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark31 = new org.apache.commons.io.ByteOrderMark("hi!", intArray30);
        org.apache.commons.io.ByteOrderMark byteOrderMark32 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray30);
        org.apache.commons.io.ByteOrderMark byteOrderMark33 = new org.apache.commons.io.ByteOrderMark("hi!", intArray30);
        org.apache.commons.io.ByteOrderMark byteOrderMark34 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray30);
        org.apache.commons.io.ByteOrderMark byteOrderMark35 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[hi!: 0xA,0x61,0x23]", intArray30);
        org.apache.commons.io.ByteOrderMark byteOrderMark36 = new org.apache.commons.io.ByteOrderMark("hi!", intArray30);
        org.apache.commons.io.ByteOrderMark byteOrderMark37 = new org.apache.commons.io.ByteOrderMark("UTF-8", intArray30);
        org.apache.commons.io.ByteOrderMark byteOrderMark38 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0xA,0x61,0x23]", intArray30);
        java.lang.String str39 = byteOrderMark38.getCharsetName();
        int[] intArray45 = new int[] { (byte) 0, 10, (-1) };
        org.apache.commons.io.ByteOrderMark byteOrderMark46 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[hi!: 0xA,0x61,0x23]", intArray45);
        org.apache.commons.io.ByteOrderMark byteOrderMark47 = new org.apache.commons.io.ByteOrderMark("UTF-16BE", intArray45);
        boolean boolean48 = byteOrderMark38.equals((java.lang.Object) byteOrderMark47);
        boolean boolean49 = byteOrderMark13.equals((java.lang.Object) boolean48);
        byte[] byteArray50 = byteOrderMark13.getBytes();
        int[] intArray58 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark59 = new org.apache.commons.io.ByteOrderMark("hi!", intArray58);
        org.apache.commons.io.ByteOrderMark byteOrderMark60 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray58);
        org.apache.commons.io.ByteOrderMark byteOrderMark61 = new org.apache.commons.io.ByteOrderMark("hi!", intArray58);
        org.apache.commons.io.ByteOrderMark byteOrderMark62 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray58);
        java.lang.String str63 = byteOrderMark62.toString();
        int int64 = byteOrderMark62.length();
        int int65 = byteOrderMark62.length();
        java.lang.Class<?> wildcardClass66 = byteOrderMark62.getClass();
        boolean boolean67 = byteOrderMark13.equals((java.lang.Object) byteOrderMark62);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ByteOrderMark[UTF-32BE: 0xA,0x61,0x23]" + "'", str16, "ByteOrderMark[UTF-32BE: 0xA,0x61,0x23]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ByteOrderMark[UTF-32BE: 0xA,0x61,0x23]" + "'", str17, "ByteOrderMark[UTF-32BE: 0xA,0x61,0x23]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[10, 97, 35]");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "ByteOrderMark[UTF-32BE: 0xA,0x61,0x23]" + "'", str39, "ByteOrderMark[UTF-32BE: 0xA,0x61,0x23]");
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[0, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[10, 97, 35]");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "ByteOrderMark[ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]: 0xA,0x61,0x23]" + "'", str63, "ByteOrderMark[ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]: 0xA,0x61,0x23]");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 3 + "'", int64 == 3);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 3 + "'", int65 == 3);
        org.junit.Assert.assertNotNull(wildcardClass66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
        org.apache.commons.io.ByteOrderMark byteOrderMark0 = org.apache.commons.io.ByteOrderMark.UTF_16BE;
        java.lang.Object obj1 = null;
        boolean boolean2 = byteOrderMark0.equals(obj1);
        int int3 = byteOrderMark0.length();
        boolean boolean5 = byteOrderMark0.equals((java.lang.Object) 0L);
        int[] intArray14 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("hi!", intArray14);
        org.apache.commons.io.ByteOrderMark byteOrderMark16 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray14);
        org.apache.commons.io.ByteOrderMark byteOrderMark17 = new org.apache.commons.io.ByteOrderMark("hi!", intArray14);
        org.apache.commons.io.ByteOrderMark byteOrderMark18 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray14);
        org.apache.commons.io.ByteOrderMark byteOrderMark19 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray14);
        byte[] byteArray20 = byteOrderMark19.getBytes();
        boolean boolean21 = byteOrderMark0.equals((java.lang.Object) byteOrderMark19);
        org.apache.commons.io.ByteOrderMark byteOrderMark22 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        byte[] byteArray23 = byteOrderMark22.getBytes();
        org.apache.commons.io.ByteOrderMark byteOrderMark24 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        boolean boolean26 = byteOrderMark24.equals((java.lang.Object) 1L);
        java.lang.String str27 = byteOrderMark24.getCharsetName();
        org.apache.commons.io.ByteOrderMark byteOrderMark28 = org.apache.commons.io.ByteOrderMark.UTF_16BE;
        boolean boolean29 = byteOrderMark24.equals((java.lang.Object) byteOrderMark28);
        boolean boolean30 = byteOrderMark22.equals((java.lang.Object) byteOrderMark24);
        java.lang.Class<?> wildcardClass31 = byteOrderMark24.getClass();
        boolean boolean32 = byteOrderMark0.equals((java.lang.Object) wildcardClass31);
        int int33 = byteOrderMark0.length();
        byte[] byteArray34 = byteOrderMark0.getBytes();
        org.junit.Assert.assertNotNull(byteOrderMark0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(byteOrderMark22);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[-1, -2]");
        org.junit.Assert.assertNotNull(byteOrderMark24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "UTF-16LE" + "'", str27, "UTF-16LE");
        org.junit.Assert.assertNotNull(byteOrderMark28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[-2, -1]");
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
        int[] intArray13 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark14 = new org.apache.commons.io.ByteOrderMark("hi!", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark16 = new org.apache.commons.io.ByteOrderMark("hi!", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark17 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark18 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark19 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark20 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark21 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16BE: 0xFE,0xFF]", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark22 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]: 0xA,0x61,0x23]", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark23 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[UTF-8: 0xEF,0xBB,0xBF]: 0xA,0x61,0x23]", intArray13);
        byte[] byteArray24 = byteOrderMark23.getBytes();
        // The following exception was thrown during execution in test generation
        try {
            int int26 = byteOrderMark23.get(191);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 191 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[10, 97, 35]");
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
        int[] intArray11 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark12 = new org.apache.commons.io.ByteOrderMark("hi!", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark13 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark14 = new org.apache.commons.io.ByteOrderMark("hi!", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark16 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[hi!: 0xA,0x61,0x23]", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark17 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xA,0x61,0x23]", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark18 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-8: 0xEF,0xBB,0xBF]", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark19 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[hi!: 0xA,0x61,0x23]", intArray11);
        org.apache.commons.io.ByteOrderMark byteOrderMark20 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        java.lang.String str21 = byteOrderMark20.getCharsetName();
        int int22 = byteOrderMark20.length();
        java.lang.String str23 = byteOrderMark20.getCharsetName();
        int int24 = byteOrderMark20.length();
        int int26 = byteOrderMark20.get((int) (short) 0);
        java.lang.String str27 = byteOrderMark20.getCharsetName();
        boolean boolean28 = byteOrderMark19.equals((java.lang.Object) byteOrderMark20);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(byteOrderMark20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "UTF-16LE" + "'", str21, "UTF-16LE");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "UTF-16LE" + "'", str23, "UTF-16LE");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 255 + "'", int26 == 255);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "UTF-16LE" + "'", str27, "UTF-16LE");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
        int[] intArray16 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark17 = new org.apache.commons.io.ByteOrderMark("hi!", intArray16);
        org.apache.commons.io.ByteOrderMark byteOrderMark18 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray16);
        org.apache.commons.io.ByteOrderMark byteOrderMark19 = new org.apache.commons.io.ByteOrderMark("hi!", intArray16);
        org.apache.commons.io.ByteOrderMark byteOrderMark20 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray16);
        org.apache.commons.io.ByteOrderMark byteOrderMark21 = new org.apache.commons.io.ByteOrderMark("hi!", intArray16);
        org.apache.commons.io.ByteOrderMark byteOrderMark22 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[hi!: 0xA,0x61,0x23]", intArray16);
        org.apache.commons.io.ByteOrderMark byteOrderMark23 = new org.apache.commons.io.ByteOrderMark("UTF-8", intArray16);
        org.apache.commons.io.ByteOrderMark byteOrderMark24 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]: 0xA,0x61,0x23]", intArray16);
        org.apache.commons.io.ByteOrderMark byteOrderMark25 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray16);
        org.apache.commons.io.ByteOrderMark byteOrderMark26 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-8: 0xEF,0xBB,0xBF]", intArray16);
        org.apache.commons.io.ByteOrderMark byteOrderMark27 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[ByteOrderMark[ByteOrderMark[UTF-8: 0xEF,0xBB,0xBF]: 0xA,0x61,0x23]: 0xA,0x61,0x23]: 0xA,0x61,0x23]", intArray16);
        org.apache.commons.io.ByteOrderMark byteOrderMark28 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[ByteOrderMark[UTF-16BE: 0xFE,0xFF]: 0xA,0xFE,0x64]: 0xA,0x61,0x23]", intArray16);
        org.apache.commons.io.ByteOrderMark byteOrderMark29 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-8: 0xEF,0xBB,0xBF]", intArray16);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[10, 97, 35]");
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
        int[] intArray7 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark8 = new org.apache.commons.io.ByteOrderMark("hi!", intArray7);
        org.apache.commons.io.ByteOrderMark byteOrderMark9 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray7);
        org.apache.commons.io.ByteOrderMark byteOrderMark10 = new org.apache.commons.io.ByteOrderMark("hi!", intArray7);
        org.apache.commons.io.ByteOrderMark byteOrderMark11 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray7);
        java.lang.Object obj12 = null;
        boolean boolean13 = byteOrderMark11.equals(obj12);
        byte[] byteArray14 = byteOrderMark11.getBytes();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[10, 97, 35]");
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
        int[] intArray10 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark11 = new org.apache.commons.io.ByteOrderMark("hi!", intArray10);
        org.apache.commons.io.ByteOrderMark byteOrderMark12 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray10);
        org.apache.commons.io.ByteOrderMark byteOrderMark13 = new org.apache.commons.io.ByteOrderMark("hi!", intArray10);
        org.apache.commons.io.ByteOrderMark byteOrderMark14 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray10);
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[hi!: 0xA,0x61,0x23]", intArray10);
        org.apache.commons.io.ByteOrderMark byteOrderMark16 = new org.apache.commons.io.ByteOrderMark("hi!", intArray10);
        org.apache.commons.io.ByteOrderMark byteOrderMark17 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[UTF-16LE: 0xFF,0xFE]: 0xA,0x61,0x23]", intArray10);
        org.apache.commons.io.ByteOrderMark byteOrderMark18 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        byte[] byteArray19 = byteOrderMark18.getBytes();
        org.apache.commons.io.ByteOrderMark byteOrderMark20 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        boolean boolean22 = byteOrderMark20.equals((java.lang.Object) 1L);
        java.lang.String str23 = byteOrderMark20.getCharsetName();
        org.apache.commons.io.ByteOrderMark byteOrderMark24 = org.apache.commons.io.ByteOrderMark.UTF_16BE;
        boolean boolean25 = byteOrderMark20.equals((java.lang.Object) byteOrderMark24);
        boolean boolean26 = byteOrderMark18.equals((java.lang.Object) byteOrderMark20);
        byte[] byteArray27 = byteOrderMark18.getBytes();
        int[] intArray37 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark38 = new org.apache.commons.io.ByteOrderMark("hi!", intArray37);
        org.apache.commons.io.ByteOrderMark byteOrderMark39 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray37);
        org.apache.commons.io.ByteOrderMark byteOrderMark40 = new org.apache.commons.io.ByteOrderMark("hi!", intArray37);
        org.apache.commons.io.ByteOrderMark byteOrderMark41 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray37);
        org.apache.commons.io.ByteOrderMark byteOrderMark42 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray37);
        org.apache.commons.io.ByteOrderMark byteOrderMark43 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray37);
        int int44 = byteOrderMark43.length();
        java.lang.String str45 = byteOrderMark43.getCharsetName();
        org.apache.commons.io.ByteOrderMark byteOrderMark46 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        boolean boolean48 = byteOrderMark46.equals((java.lang.Object) 1L);
        java.lang.String str49 = byteOrderMark46.getCharsetName();
        org.apache.commons.io.ByteOrderMark byteOrderMark50 = org.apache.commons.io.ByteOrderMark.UTF_16BE;
        boolean boolean51 = byteOrderMark46.equals((java.lang.Object) byteOrderMark50);
        byte[] byteArray52 = byteOrderMark50.getBytes();
        boolean boolean53 = byteOrderMark43.equals((java.lang.Object) byteArray52);
        boolean boolean54 = byteOrderMark18.equals((java.lang.Object) byteArray52);
        boolean boolean55 = byteOrderMark17.equals((java.lang.Object) byteOrderMark18);
        java.lang.String str56 = byteOrderMark18.toString();
        int int57 = byteOrderMark18.length();
        java.lang.String str58 = byteOrderMark18.getCharsetName();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(byteOrderMark18);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[-1, -2]");
        org.junit.Assert.assertNotNull(byteOrderMark20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "UTF-16LE" + "'", str23, "UTF-16LE");
        org.junit.Assert.assertNotNull(byteOrderMark24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[-1, -2]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 3 + "'", int44 == 3);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]" + "'", str45, "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]");
        org.junit.Assert.assertNotNull(byteOrderMark46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "UTF-16LE" + "'", str49, "UTF-16LE");
        org.junit.Assert.assertNotNull(byteOrderMark50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[-2, -1]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "ByteOrderMark[UTF-16LE: 0xFF,0xFE]" + "'", str56, "ByteOrderMark[UTF-16LE: 0xFF,0xFE]");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 2 + "'", int57 == 2);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "UTF-16LE" + "'", str58, "UTF-16LE");
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
        org.apache.commons.io.ByteOrderMark byteOrderMark0 = org.apache.commons.io.ByteOrderMark.UTF_8;
        int int2 = byteOrderMark0.get((int) (byte) 0);
        int int3 = byteOrderMark0.length();
        org.apache.commons.io.ByteOrderMark byteOrderMark4 = org.apache.commons.io.ByteOrderMark.UTF_32BE;
        byte[] byteArray5 = byteOrderMark4.getBytes();
        java.lang.String str6 = byteOrderMark4.getCharsetName();
        org.apache.commons.io.ByteOrderMark byteOrderMark7 = org.apache.commons.io.ByteOrderMark.UTF_8;
        int int9 = byteOrderMark7.get((int) (byte) 0);
        byte[] byteArray10 = byteOrderMark7.getBytes();
        byte[] byteArray11 = byteOrderMark7.getBytes();
        boolean boolean12 = byteOrderMark4.equals((java.lang.Object) byteOrderMark7);
        org.apache.commons.io.ByteOrderMark byteOrderMark13 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        int int15 = byteOrderMark13.get(0);
        java.lang.String str16 = byteOrderMark13.getCharsetName();
        org.apache.commons.io.ByteOrderMark byteOrderMark17 = org.apache.commons.io.ByteOrderMark.UTF_16BE;
        java.lang.Object obj18 = null;
        boolean boolean19 = byteOrderMark17.equals(obj18);
        int int20 = byteOrderMark17.length();
        boolean boolean22 = byteOrderMark17.equals((java.lang.Object) 0L);
        int int23 = byteOrderMark17.length();
        boolean boolean24 = byteOrderMark13.equals((java.lang.Object) int23);
        int int26 = byteOrderMark13.get(0);
        boolean boolean27 = byteOrderMark4.equals((java.lang.Object) 0);
        org.apache.commons.io.ByteOrderMark byteOrderMark28 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        boolean boolean30 = byteOrderMark28.equals((java.lang.Object) (-1L));
        java.lang.String str31 = byteOrderMark28.toString();
        byte[] byteArray32 = byteOrderMark28.getBytes();
        java.lang.Class<?> wildcardClass33 = byteArray32.getClass();
        boolean boolean34 = byteOrderMark4.equals((java.lang.Object) wildcardClass33);
        int int35 = byteOrderMark4.length();
        java.lang.String str36 = byteOrderMark4.getCharsetName();
        boolean boolean37 = byteOrderMark0.equals((java.lang.Object) byteOrderMark4);
        int int39 = byteOrderMark4.get(0);
        byte[] byteArray40 = byteOrderMark4.getBytes();
        org.junit.Assert.assertNotNull(byteOrderMark0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 239 + "'", int2 == 239);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(byteOrderMark4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, -2, -1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF-32BE" + "'", str6, "UTF-32BE");
        org.junit.Assert.assertNotNull(byteOrderMark7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 239 + "'", int9 == 239);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-17, -69, -65]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-17, -69, -65]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteOrderMark13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 255 + "'", int15 == 255);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTF-16LE" + "'", str16, "UTF-16LE");
        org.junit.Assert.assertNotNull(byteOrderMark17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 255 + "'", int26 == 255);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(byteOrderMark28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "ByteOrderMark[UTF-16LE: 0xFF,0xFE]" + "'", str31, "ByteOrderMark[UTF-16LE: 0xFF,0xFE]");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[-1, -2]");
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 4 + "'", int35 == 4);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "UTF-32BE" + "'", str36, "UTF-32BE");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[0, 0, -2, -1]");
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
        int[] intArray7 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark8 = new org.apache.commons.io.ByteOrderMark("hi!", intArray7);
        org.apache.commons.io.ByteOrderMark byteOrderMark9 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray7);
        org.apache.commons.io.ByteOrderMark byteOrderMark10 = new org.apache.commons.io.ByteOrderMark("hi!", intArray7);
        java.lang.String str11 = byteOrderMark10.toString();
        java.lang.String str12 = byteOrderMark10.toString();
        boolean boolean14 = byteOrderMark10.equals((java.lang.Object) true);
        boolean boolean16 = byteOrderMark10.equals((java.lang.Object) "UTF-32BE");
        int[] intArray26 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark27 = new org.apache.commons.io.ByteOrderMark("hi!", intArray26);
        org.apache.commons.io.ByteOrderMark byteOrderMark28 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray26);
        org.apache.commons.io.ByteOrderMark byteOrderMark29 = new org.apache.commons.io.ByteOrderMark("hi!", intArray26);
        org.apache.commons.io.ByteOrderMark byteOrderMark30 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray26);
        org.apache.commons.io.ByteOrderMark byteOrderMark31 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray26);
        org.apache.commons.io.ByteOrderMark byteOrderMark32 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray26);
        boolean boolean33 = byteOrderMark10.equals((java.lang.Object) intArray26);
        org.apache.commons.io.ByteOrderMark byteOrderMark34 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[ByteOrderMark[ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]: 0xA,0x61,0x23]: 0xA,0x61,0x23]: 0xFF]", intArray26);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 97, 35]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ByteOrderMark[hi!: 0xA,0x61,0x23]" + "'", str11, "ByteOrderMark[hi!: 0xA,0x61,0x23]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ByteOrderMark[hi!: 0xA,0x61,0x23]" + "'", str12, "ByteOrderMark[hi!: 0xA,0x61,0x23]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
        int[] intArray12 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark13 = new org.apache.commons.io.ByteOrderMark("hi!", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark14 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("hi!", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark16 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark17 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark18 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark19 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[UTF-16LE: 0xFF,0xFE]: 0xA,0x61,0x23]", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark20 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[UTF-32BE: 0xA,0x61,0x23]: 0xA,0x61,0x23]", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark21 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[UTF-16BE: 0xFE,0xFF]: 0xA,0xFE,0x64]", intArray12);
        int int22 = byteOrderMark21.length();
        java.lang.String str23 = byteOrderMark21.toString();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "ByteOrderMark[ByteOrderMark[ByteOrderMark[UTF-16BE: 0xFE,0xFF]: 0xA,0xFE,0x64]: 0xA,0x61,0x23]" + "'", str23, "ByteOrderMark[ByteOrderMark[ByteOrderMark[UTF-16BE: 0xFE,0xFF]: 0xA,0xFE,0x64]: 0xA,0x61,0x23]");
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
        int[] intArray13 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark14 = new org.apache.commons.io.ByteOrderMark("hi!", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark16 = new org.apache.commons.io.ByteOrderMark("hi!", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark17 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark18 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark19 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark20 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xA,0x61,0x23]", intArray13);
        int[] intArray32 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark33 = new org.apache.commons.io.ByteOrderMark("hi!", intArray32);
        org.apache.commons.io.ByteOrderMark byteOrderMark34 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray32);
        org.apache.commons.io.ByteOrderMark byteOrderMark35 = new org.apache.commons.io.ByteOrderMark("hi!", intArray32);
        org.apache.commons.io.ByteOrderMark byteOrderMark36 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray32);
        org.apache.commons.io.ByteOrderMark byteOrderMark37 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray32);
        org.apache.commons.io.ByteOrderMark byteOrderMark38 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray32);
        org.apache.commons.io.ByteOrderMark byteOrderMark39 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray32);
        org.apache.commons.io.ByteOrderMark byteOrderMark40 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray32);
        boolean boolean41 = byteOrderMark20.equals((java.lang.Object) intArray32);
        org.apache.commons.io.ByteOrderMark byteOrderMark42 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[ByteOrderMark[ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]: 0xA,0x61,0x23]: 0xA,0x61,0x23]: 0xFF]", intArray32);
        org.apache.commons.io.ByteOrderMark byteOrderMark43 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[ByteOrderMark[ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]: 0xA,0x61,0x23]: 0xA,0x61,0x23]: 0xFF]", intArray32);
        org.apache.commons.io.ByteOrderMark byteOrderMark44 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[ByteOrderMark[UTF-8: 0xEF,0xBB,0xBF]: 0xA,0x61,0x23]: 0xA,0xFE,0x64]", intArray32);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
        org.apache.commons.io.ByteOrderMark byteOrderMark0 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        boolean boolean2 = byteOrderMark0.equals((java.lang.Object) 1L);
        java.lang.String str3 = byteOrderMark0.getCharsetName();
        int int4 = byteOrderMark0.length();
        java.lang.String str5 = byteOrderMark0.toString();
        java.lang.String str6 = byteOrderMark0.getCharsetName();
        int int7 = byteOrderMark0.length();
        java.lang.String str8 = byteOrderMark0.toString();
        java.lang.String str9 = byteOrderMark0.getCharsetName();
        java.lang.String str10 = byteOrderMark0.toString();
        int int11 = byteOrderMark0.length();
        int int13 = byteOrderMark0.get(0);
        java.lang.String str14 = byteOrderMark0.getCharsetName();
        byte[] byteArray15 = byteOrderMark0.getBytes();
        org.junit.Assert.assertNotNull(byteOrderMark0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF-16LE" + "'", str3, "UTF-16LE");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ByteOrderMark[UTF-16LE: 0xFF,0xFE]" + "'", str5, "ByteOrderMark[UTF-16LE: 0xFF,0xFE]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF-16LE" + "'", str6, "UTF-16LE");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ByteOrderMark[UTF-16LE: 0xFF,0xFE]" + "'", str8, "ByteOrderMark[UTF-16LE: 0xFF,0xFE]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTF-16LE" + "'", str9, "UTF-16LE");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ByteOrderMark[UTF-16LE: 0xFF,0xFE]" + "'", str10, "ByteOrderMark[UTF-16LE: 0xFF,0xFE]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 255 + "'", int13 == 255);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTF-16LE" + "'", str14, "UTF-16LE");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[-1, -2]");
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
        org.apache.commons.io.ByteOrderMark byteOrderMark0 = org.apache.commons.io.ByteOrderMark.UTF_16BE;
        java.lang.Object obj1 = null;
        boolean boolean2 = byteOrderMark0.equals(obj1);
        int int3 = byteOrderMark0.length();
        int int4 = byteOrderMark0.length();
        org.apache.commons.io.ByteOrderMark byteOrderMark5 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        byte[] byteArray6 = byteOrderMark5.getBytes();
        int int7 = byteOrderMark5.length();
        java.lang.String str8 = byteOrderMark5.getCharsetName();
        java.lang.String str9 = byteOrderMark5.getCharsetName();
        java.lang.String str10 = byteOrderMark5.getCharsetName();
        byte[] byteArray11 = byteOrderMark5.getBytes();
        boolean boolean12 = byteOrderMark0.equals((java.lang.Object) byteOrderMark5);
        int[] intArray24 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark25 = new org.apache.commons.io.ByteOrderMark("hi!", intArray24);
        org.apache.commons.io.ByteOrderMark byteOrderMark26 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray24);
        org.apache.commons.io.ByteOrderMark byteOrderMark27 = new org.apache.commons.io.ByteOrderMark("hi!", intArray24);
        org.apache.commons.io.ByteOrderMark byteOrderMark28 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray24);
        org.apache.commons.io.ByteOrderMark byteOrderMark29 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray24);
        org.apache.commons.io.ByteOrderMark byteOrderMark30 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray24);
        org.apache.commons.io.ByteOrderMark byteOrderMark31 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray24);
        org.apache.commons.io.ByteOrderMark byteOrderMark32 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0xA,0x61,0x23]", intArray24);
        int int33 = byteOrderMark32.length();
        int int34 = byteOrderMark32.length();
        boolean boolean35 = byteOrderMark0.equals((java.lang.Object) byteOrderMark32);
        org.junit.Assert.assertNotNull(byteOrderMark0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(byteOrderMark5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, -2]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF-16LE" + "'", str8, "UTF-16LE");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTF-16LE" + "'", str9, "UTF-16LE");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTF-16LE" + "'", str10, "UTF-16LE");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-1, -2]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
        int[] intArray9 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark10 = new org.apache.commons.io.ByteOrderMark("hi!", intArray9);
        org.apache.commons.io.ByteOrderMark byteOrderMark11 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray9);
        org.apache.commons.io.ByteOrderMark byteOrderMark12 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray9);
        org.apache.commons.io.ByteOrderMark byteOrderMark13 = new org.apache.commons.io.ByteOrderMark("hi!", intArray9);
        org.apache.commons.io.ByteOrderMark byteOrderMark14 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray9);
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-8: 0xA,0x61,0x23]", intArray9);
        java.lang.String str16 = byteOrderMark15.getCharsetName();
        org.apache.commons.io.ByteOrderMark byteOrderMark17 = org.apache.commons.io.ByteOrderMark.UTF_16BE;
        java.lang.Object obj18 = null;
        boolean boolean19 = byteOrderMark17.equals(obj18);
        byte[] byteArray20 = byteOrderMark17.getBytes();
        java.lang.String str21 = byteOrderMark17.toString();
        java.lang.String str22 = byteOrderMark17.getCharsetName();
        int int24 = byteOrderMark17.get(0);
        java.lang.String str25 = byteOrderMark17.toString();
        int int26 = byteOrderMark17.length();
        byte[] byteArray27 = byteOrderMark17.getBytes();
        boolean boolean28 = byteOrderMark15.equals((java.lang.Object) byteArray27);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 97, 35]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ByteOrderMark[UTF-8: 0xA,0x61,0x23]" + "'", str16, "ByteOrderMark[UTF-8: 0xA,0x61,0x23]");
        org.junit.Assert.assertNotNull(byteOrderMark17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[-2, -1]");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ByteOrderMark[UTF-16BE: 0xFE,0xFF]" + "'", str21, "ByteOrderMark[UTF-16BE: 0xFE,0xFF]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "UTF-16BE" + "'", str22, "UTF-16BE");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 254 + "'", int24 == 254);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "ByteOrderMark[UTF-16BE: 0xFE,0xFF]" + "'", str25, "ByteOrderMark[UTF-16BE: 0xFE,0xFF]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[-2, -1]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
        int[] intArray7 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark8 = new org.apache.commons.io.ByteOrderMark("hi!", intArray7);
        org.apache.commons.io.ByteOrderMark byteOrderMark9 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray7);
        org.apache.commons.io.ByteOrderMark byteOrderMark10 = new org.apache.commons.io.ByteOrderMark("hi!", intArray7);
        org.apache.commons.io.ByteOrderMark byteOrderMark11 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray7);
        byte[] byteArray12 = byteOrderMark11.getBytes();
        java.lang.String str13 = byteOrderMark11.getCharsetName();
        int int14 = byteOrderMark11.length();
        java.lang.Class<?> wildcardClass15 = byteOrderMark11.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[10, 97, 35]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]" + "'", str13, "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
        int[] intArray6 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark7 = new org.apache.commons.io.ByteOrderMark("hi!", intArray6);
        org.apache.commons.io.ByteOrderMark byteOrderMark8 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray6);
        org.apache.commons.io.ByteOrderMark byteOrderMark9 = new org.apache.commons.io.ByteOrderMark("hi!", intArray6);
        java.lang.String str10 = byteOrderMark9.toString();
        java.lang.String str11 = byteOrderMark9.getCharsetName();
        byte[] byteArray12 = byteOrderMark9.getBytes();
        java.lang.Object obj13 = null;
        boolean boolean14 = byteOrderMark9.equals(obj13);
        java.lang.String str15 = byteOrderMark9.getCharsetName();
        java.lang.String str16 = byteOrderMark9.toString();
        int int17 = byteOrderMark9.length();
        org.apache.commons.io.ByteOrderMark byteOrderMark18 = org.apache.commons.io.ByteOrderMark.UTF_32BE;
        java.lang.String str19 = byteOrderMark18.toString();
        java.lang.String str20 = byteOrderMark18.toString();
        int int22 = byteOrderMark18.get(2);
        boolean boolean24 = byteOrderMark18.equals((java.lang.Object) (byte) 10);
        byte[] byteArray25 = byteOrderMark18.getBytes();
        int[] intArray35 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark36 = new org.apache.commons.io.ByteOrderMark("hi!", intArray35);
        org.apache.commons.io.ByteOrderMark byteOrderMark37 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray35);
        org.apache.commons.io.ByteOrderMark byteOrderMark38 = new org.apache.commons.io.ByteOrderMark("hi!", intArray35);
        org.apache.commons.io.ByteOrderMark byteOrderMark39 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray35);
        org.apache.commons.io.ByteOrderMark byteOrderMark40 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray35);
        org.apache.commons.io.ByteOrderMark byteOrderMark41 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray35);
        boolean boolean42 = byteOrderMark18.equals((java.lang.Object) byteOrderMark41);
        int int43 = byteOrderMark18.length();
        byte[] byteArray44 = byteOrderMark18.getBytes();
        java.lang.String str45 = byteOrderMark18.toString();
        java.lang.String str46 = byteOrderMark18.getCharsetName();
        int int47 = byteOrderMark18.length();
        boolean boolean48 = byteOrderMark9.equals((java.lang.Object) byteOrderMark18);
        int int49 = byteOrderMark18.length();
        java.lang.String str50 = byteOrderMark18.getCharsetName();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 97, 35]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ByteOrderMark[hi!: 0xA,0x61,0x23]" + "'", str10, "ByteOrderMark[hi!: 0xA,0x61,0x23]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ByteOrderMark[hi!: 0xA,0x61,0x23]" + "'", str16, "ByteOrderMark[hi!: 0xA,0x61,0x23]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(byteOrderMark18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]" + "'", str19, "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]" + "'", str20, "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 254 + "'", int22 == 254);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[0, 0, -2, -1]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 4 + "'", int43 == 4);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[0, 0, -2, -1]");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]" + "'", str45, "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "UTF-32BE" + "'", str46, "UTF-32BE");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 4 + "'", int47 == 4);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 4 + "'", int49 == 4);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "UTF-32BE" + "'", str50, "UTF-32BE");
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
        int[] intArray10 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark11 = new org.apache.commons.io.ByteOrderMark("hi!", intArray10);
        org.apache.commons.io.ByteOrderMark byteOrderMark12 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray10);
        org.apache.commons.io.ByteOrderMark byteOrderMark13 = new org.apache.commons.io.ByteOrderMark("hi!", intArray10);
        org.apache.commons.io.ByteOrderMark byteOrderMark14 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray10);
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-8: 0xEF,0xBB,0xBF]", intArray10);
        org.apache.commons.io.ByteOrderMark byteOrderMark16 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray10);
        org.apache.commons.io.ByteOrderMark byteOrderMark17 = new org.apache.commons.io.ByteOrderMark("UTF-16BE", intArray10);
        org.apache.commons.io.ByteOrderMark byteOrderMark18 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        byte[] byteArray19 = byteOrderMark18.getBytes();
        java.lang.String str20 = byteOrderMark18.toString();
        int[] intArray30 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark31 = new org.apache.commons.io.ByteOrderMark("hi!", intArray30);
        org.apache.commons.io.ByteOrderMark byteOrderMark32 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray30);
        org.apache.commons.io.ByteOrderMark byteOrderMark33 = new org.apache.commons.io.ByteOrderMark("hi!", intArray30);
        org.apache.commons.io.ByteOrderMark byteOrderMark34 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray30);
        org.apache.commons.io.ByteOrderMark byteOrderMark35 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[hi!: 0xA,0x61,0x23]", intArray30);
        org.apache.commons.io.ByteOrderMark byteOrderMark36 = new org.apache.commons.io.ByteOrderMark("hi!", intArray30);
        boolean boolean37 = byteOrderMark18.equals((java.lang.Object) intArray30);
        boolean boolean38 = byteOrderMark17.equals((java.lang.Object) byteOrderMark18);
        org.apache.commons.io.ByteOrderMark byteOrderMark39 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        boolean boolean41 = byteOrderMark39.equals((java.lang.Object) (-1L));
        java.lang.String str42 = byteOrderMark39.toString();
        byte[] byteArray43 = byteOrderMark39.getBytes();
        byte[] byteArray44 = byteOrderMark39.getBytes();
        java.lang.String str45 = byteOrderMark39.getCharsetName();
        int[] intArray50 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark51 = new org.apache.commons.io.ByteOrderMark("hi!", intArray50);
        boolean boolean52 = byteOrderMark39.equals((java.lang.Object) "hi!");
        java.lang.String str53 = byteOrderMark39.toString();
        boolean boolean54 = byteOrderMark18.equals((java.lang.Object) byteOrderMark39);
        int int55 = byteOrderMark18.length();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(byteOrderMark18);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[-1, -2]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ByteOrderMark[UTF-16LE: 0xFF,0xFE]" + "'", str20, "ByteOrderMark[UTF-16LE: 0xFF,0xFE]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(byteOrderMark39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "ByteOrderMark[UTF-16LE: 0xFF,0xFE]" + "'", str42, "ByteOrderMark[UTF-16LE: 0xFF,0xFE]");
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[-1, -2]");
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[-1, -2]");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "UTF-16LE" + "'", str45, "UTF-16LE");
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "ByteOrderMark[UTF-16LE: 0xFF,0xFE]" + "'", str53, "ByteOrderMark[UTF-16LE: 0xFF,0xFE]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 2 + "'", int55 == 2);
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
        org.apache.commons.io.ByteOrderMark byteOrderMark0 = org.apache.commons.io.ByteOrderMark.UTF_32BE;
        byte[] byteArray1 = byteOrderMark0.getBytes();
        int int2 = byteOrderMark0.length();
        boolean boolean4 = byteOrderMark0.equals((java.lang.Object) "ByteOrderMark[ByteOrderMark[UTF-8: 0xEF,0xBB,0xBF]: 0xA,0x61,0x23]");
        java.lang.String str5 = byteOrderMark0.getCharsetName();
        int int6 = byteOrderMark0.length();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = byteOrderMark0.get(254);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 254 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrderMark0);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[0, 0, -2, -1]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF-32BE" + "'", str5, "UTF-32BE");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
        org.apache.commons.io.ByteOrderMark byteOrderMark1 = org.apache.commons.io.ByteOrderMark.UTF_8;
        int int3 = byteOrderMark1.get((int) (byte) 0);
        int[] intArray13 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark14 = new org.apache.commons.io.ByteOrderMark("hi!", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark16 = new org.apache.commons.io.ByteOrderMark("hi!", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark17 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark18 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark19 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray13);
        int int20 = byteOrderMark19.length();
        boolean boolean21 = byteOrderMark1.equals((java.lang.Object) byteOrderMark19);
        int[] intArray31 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark32 = new org.apache.commons.io.ByteOrderMark("hi!", intArray31);
        org.apache.commons.io.ByteOrderMark byteOrderMark33 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray31);
        org.apache.commons.io.ByteOrderMark byteOrderMark34 = new org.apache.commons.io.ByteOrderMark("hi!", intArray31);
        org.apache.commons.io.ByteOrderMark byteOrderMark35 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray31);
        org.apache.commons.io.ByteOrderMark byteOrderMark36 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray31);
        org.apache.commons.io.ByteOrderMark byteOrderMark37 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray31);
        boolean boolean38 = byteOrderMark1.equals((java.lang.Object) intArray31);
        org.apache.commons.io.ByteOrderMark byteOrderMark39 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[hi!: 0xA,0x61,0x23]", intArray31);
        byte[] byteArray40 = byteOrderMark39.getBytes();
        int int41 = byteOrderMark39.length();
        java.lang.String str42 = byteOrderMark39.toString();
        org.junit.Assert.assertNotNull(byteOrderMark1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 239 + "'", int3 == 239);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 3 + "'", int41 == 3);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "ByteOrderMark[ByteOrderMark[hi!: 0xA,0x61,0x23]: 0xA,0x61,0x23]" + "'", str42, "ByteOrderMark[ByteOrderMark[hi!: 0xA,0x61,0x23]: 0xA,0x61,0x23]");
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
        int[] intArray8 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark9 = new org.apache.commons.io.ByteOrderMark("hi!", intArray8);
        org.apache.commons.io.ByteOrderMark byteOrderMark10 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray8);
        org.apache.commons.io.ByteOrderMark byteOrderMark11 = new org.apache.commons.io.ByteOrderMark("hi!", intArray8);
        org.apache.commons.io.ByteOrderMark byteOrderMark12 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray8);
        byte[] byteArray13 = byteOrderMark12.getBytes();
        byte[] byteArray14 = byteOrderMark12.getBytes();
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = org.apache.commons.io.ByteOrderMark.UTF_16BE;
        java.lang.Object obj16 = null;
        boolean boolean17 = byteOrderMark15.equals(obj16);
        int int18 = byteOrderMark15.length();
        boolean boolean20 = byteOrderMark15.equals((java.lang.Object) 0L);
        int int21 = byteOrderMark15.length();
        int int22 = byteOrderMark15.length();
        int[] intArray29 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark30 = new org.apache.commons.io.ByteOrderMark("hi!", intArray29);
        org.apache.commons.io.ByteOrderMark byteOrderMark31 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray29);
        org.apache.commons.io.ByteOrderMark byteOrderMark32 = new org.apache.commons.io.ByteOrderMark("hi!", intArray29);
        boolean boolean33 = byteOrderMark15.equals((java.lang.Object) intArray29);
        boolean boolean34 = byteOrderMark12.equals((java.lang.Object) intArray29);
        org.apache.commons.io.ByteOrderMark byteOrderMark35 = new org.apache.commons.io.ByteOrderMark("UTF-8", intArray29);
        java.lang.String str36 = byteOrderMark35.toString();
        java.lang.String str37 = byteOrderMark35.getCharsetName();
        java.lang.Class<?> wildcardClass38 = byteOrderMark35.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(byteOrderMark15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "ByteOrderMark[UTF-8: 0xA,0x61,0x23]" + "'", str36, "ByteOrderMark[UTF-8: 0xA,0x61,0x23]");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "UTF-8" + "'", str37, "UTF-8");
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
        org.apache.commons.io.ByteOrderMark byteOrderMark1 = org.apache.commons.io.ByteOrderMark.UTF_8;
        int int3 = byteOrderMark1.get((int) (byte) 0);
        int[] intArray13 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark14 = new org.apache.commons.io.ByteOrderMark("hi!", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark16 = new org.apache.commons.io.ByteOrderMark("hi!", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark17 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark18 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray13);
        org.apache.commons.io.ByteOrderMark byteOrderMark19 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray13);
        int int20 = byteOrderMark19.length();
        boolean boolean21 = byteOrderMark1.equals((java.lang.Object) byteOrderMark19);
        int[] intArray31 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark32 = new org.apache.commons.io.ByteOrderMark("hi!", intArray31);
        org.apache.commons.io.ByteOrderMark byteOrderMark33 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray31);
        org.apache.commons.io.ByteOrderMark byteOrderMark34 = new org.apache.commons.io.ByteOrderMark("hi!", intArray31);
        org.apache.commons.io.ByteOrderMark byteOrderMark35 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray31);
        org.apache.commons.io.ByteOrderMark byteOrderMark36 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray31);
        org.apache.commons.io.ByteOrderMark byteOrderMark37 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray31);
        boolean boolean38 = byteOrderMark1.equals((java.lang.Object) intArray31);
        org.apache.commons.io.ByteOrderMark byteOrderMark39 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[hi!: 0xA,0x61,0x23]", intArray31);
        org.apache.commons.io.ByteOrderMark byteOrderMark40 = org.apache.commons.io.ByteOrderMark.UTF_32BE;
        java.lang.String str41 = byteOrderMark40.toString();
        java.lang.String str42 = byteOrderMark40.toString();
        int int44 = byteOrderMark40.get(2);
        boolean boolean46 = byteOrderMark40.equals((java.lang.Object) (byte) 10);
        byte[] byteArray47 = byteOrderMark40.getBytes();
        int[] intArray57 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark58 = new org.apache.commons.io.ByteOrderMark("hi!", intArray57);
        org.apache.commons.io.ByteOrderMark byteOrderMark59 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray57);
        org.apache.commons.io.ByteOrderMark byteOrderMark60 = new org.apache.commons.io.ByteOrderMark("hi!", intArray57);
        org.apache.commons.io.ByteOrderMark byteOrderMark61 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray57);
        org.apache.commons.io.ByteOrderMark byteOrderMark62 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray57);
        org.apache.commons.io.ByteOrderMark byteOrderMark63 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray57);
        boolean boolean64 = byteOrderMark40.equals((java.lang.Object) byteOrderMark63);
        int int65 = byteOrderMark40.length();
        java.lang.String str66 = byteOrderMark40.getCharsetName();
        java.lang.String str67 = byteOrderMark40.toString();
        boolean boolean68 = byteOrderMark39.equals((java.lang.Object) byteOrderMark40);
        int int69 = byteOrderMark40.length();
        int[] intArray76 = new int[] { (short) -1, (byte) 0, 254 };
        org.apache.commons.io.ByteOrderMark byteOrderMark77 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[hi!: 0xA,0x61,0x23]", intArray76);
        org.apache.commons.io.ByteOrderMark byteOrderMark78 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray76);
        org.apache.commons.io.ByteOrderMark byteOrderMark79 = new org.apache.commons.io.ByteOrderMark("hi!", intArray76);
        java.lang.String str80 = byteOrderMark79.toString();
        boolean boolean81 = byteOrderMark40.equals((java.lang.Object) str80);
        byte[] byteArray82 = byteOrderMark40.getBytes();
        org.junit.Assert.assertNotNull(byteOrderMark1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 239 + "'", int3 == 239);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(byteOrderMark40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]" + "'", str41, "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]" + "'", str42, "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 254 + "'", int44 == 254);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[0, 0, -2, -1]");
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 4 + "'", int65 == 4);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "UTF-32BE" + "'", str66, "UTF-32BE");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]" + "'", str67, "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 4 + "'", int69 == 4);
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray76), "[-1, 0, 254]");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "ByteOrderMark[hi!: 0xFF,0x0,0xFE]" + "'", str80, "ByteOrderMark[hi!: 0xFF,0x0,0xFE]");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(byteArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray82), "[0, 0, -2, -1]");
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
        org.apache.commons.io.ByteOrderMark byteOrderMark0 = org.apache.commons.io.ByteOrderMark.UTF_32BE;
        java.lang.String str1 = byteOrderMark0.toString();
        java.lang.String str2 = byteOrderMark0.toString();
        int int4 = byteOrderMark0.get(2);
        boolean boolean6 = byteOrderMark0.equals((java.lang.Object) (byte) 10);
        byte[] byteArray7 = byteOrderMark0.getBytes();
        int[] intArray17 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark18 = new org.apache.commons.io.ByteOrderMark("hi!", intArray17);
        org.apache.commons.io.ByteOrderMark byteOrderMark19 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray17);
        org.apache.commons.io.ByteOrderMark byteOrderMark20 = new org.apache.commons.io.ByteOrderMark("hi!", intArray17);
        org.apache.commons.io.ByteOrderMark byteOrderMark21 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray17);
        org.apache.commons.io.ByteOrderMark byteOrderMark22 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray17);
        org.apache.commons.io.ByteOrderMark byteOrderMark23 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray17);
        boolean boolean24 = byteOrderMark0.equals((java.lang.Object) byteOrderMark23);
        byte[] byteArray25 = byteOrderMark23.getBytes();
        java.lang.String str26 = byteOrderMark23.getCharsetName();
        java.lang.String str27 = byteOrderMark23.toString();
        org.junit.Assert.assertNotNull(byteOrderMark0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]" + "'", str1, "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]" + "'", str2, "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 254 + "'", int4 == 254);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, -2, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[10, 97, 35]");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "UTF-32BE" + "'", str26, "UTF-32BE");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "ByteOrderMark[UTF-32BE: 0xA,0x61,0x23]" + "'", str27, "ByteOrderMark[UTF-32BE: 0xA,0x61,0x23]");
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
        org.apache.commons.io.ByteOrderMark byteOrderMark0 = org.apache.commons.io.ByteOrderMark.UTF_16BE;
        java.lang.Object obj1 = null;
        boolean boolean2 = byteOrderMark0.equals(obj1);
        int int3 = byteOrderMark0.length();
        boolean boolean5 = byteOrderMark0.equals((java.lang.Object) 0L);
        byte[] byteArray6 = byteOrderMark0.getBytes();
        java.lang.String str7 = byteOrderMark0.getCharsetName();
        org.junit.Assert.assertNotNull(byteOrderMark0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-2, -1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTF-16BE" + "'", str7, "UTF-16BE");
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
        int[] intArray6 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark7 = new org.apache.commons.io.ByteOrderMark("hi!", intArray6);
        org.apache.commons.io.ByteOrderMark byteOrderMark8 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray6);
        org.apache.commons.io.ByteOrderMark byteOrderMark9 = new org.apache.commons.io.ByteOrderMark("hi!", intArray6);
        java.lang.String str10 = byteOrderMark9.toString();
        java.lang.String str11 = byteOrderMark9.toString();
        boolean boolean13 = byteOrderMark9.equals((java.lang.Object) true);
        org.apache.commons.io.ByteOrderMark byteOrderMark14 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        boolean boolean16 = byteOrderMark14.equals((java.lang.Object) 1L);
        java.lang.String str17 = byteOrderMark14.getCharsetName();
        int int18 = byteOrderMark14.length();
        boolean boolean19 = byteOrderMark9.equals((java.lang.Object) byteOrderMark14);
        byte[] byteArray20 = byteOrderMark14.getBytes();
        // The following exception was thrown during execution in test generation
        try {
            int int22 = byteOrderMark14.get((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 97, 35]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ByteOrderMark[hi!: 0xA,0x61,0x23]" + "'", str10, "ByteOrderMark[hi!: 0xA,0x61,0x23]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ByteOrderMark[hi!: 0xA,0x61,0x23]" + "'", str11, "ByteOrderMark[hi!: 0xA,0x61,0x23]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteOrderMark14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTF-16LE" + "'", str17, "UTF-16LE");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[-1, -2]");
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
        int[] intArray7 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark8 = new org.apache.commons.io.ByteOrderMark("hi!", intArray7);
        org.apache.commons.io.ByteOrderMark byteOrderMark9 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray7);
        org.apache.commons.io.ByteOrderMark byteOrderMark10 = new org.apache.commons.io.ByteOrderMark("hi!", intArray7);
        org.apache.commons.io.ByteOrderMark byteOrderMark11 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray7);
        int int12 = byteOrderMark11.length();
        int[] intArray22 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark23 = new org.apache.commons.io.ByteOrderMark("hi!", intArray22);
        org.apache.commons.io.ByteOrderMark byteOrderMark24 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray22);
        org.apache.commons.io.ByteOrderMark byteOrderMark25 = new org.apache.commons.io.ByteOrderMark("hi!", intArray22);
        org.apache.commons.io.ByteOrderMark byteOrderMark26 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray22);
        org.apache.commons.io.ByteOrderMark byteOrderMark27 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray22);
        org.apache.commons.io.ByteOrderMark byteOrderMark28 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray22);
        boolean boolean29 = byteOrderMark11.equals((java.lang.Object) byteOrderMark28);
        byte[] byteArray30 = byteOrderMark11.getBytes();
        int int31 = byteOrderMark11.length();
        // The following exception was thrown during execution in test generation
        try {
            int int33 = byteOrderMark11.get((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
        org.apache.commons.io.ByteOrderMark byteOrderMark0 = org.apache.commons.io.ByteOrderMark.UTF_16BE;
        java.lang.Object obj1 = null;
        boolean boolean2 = byteOrderMark0.equals(obj1);
        byte[] byteArray3 = byteOrderMark0.getBytes();
        java.lang.String str4 = byteOrderMark0.toString();
        java.lang.String str5 = byteOrderMark0.getCharsetName();
        java.lang.String str6 = byteOrderMark0.toString();
        int[] intArray16 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark17 = new org.apache.commons.io.ByteOrderMark("hi!", intArray16);
        org.apache.commons.io.ByteOrderMark byteOrderMark18 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray16);
        org.apache.commons.io.ByteOrderMark byteOrderMark19 = new org.apache.commons.io.ByteOrderMark("hi!", intArray16);
        org.apache.commons.io.ByteOrderMark byteOrderMark20 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray16);
        org.apache.commons.io.ByteOrderMark byteOrderMark21 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[hi!: 0xA,0x61,0x23]", intArray16);
        org.apache.commons.io.ByteOrderMark byteOrderMark22 = new org.apache.commons.io.ByteOrderMark("hi!", intArray16);
        boolean boolean23 = byteOrderMark0.equals((java.lang.Object) intArray16);
        org.apache.commons.io.ByteOrderMark byteOrderMark24 = org.apache.commons.io.ByteOrderMark.UTF_8;
        int int26 = byteOrderMark24.get((int) (byte) 0);
        byte[] byteArray27 = byteOrderMark24.getBytes();
        boolean boolean28 = byteOrderMark0.equals((java.lang.Object) byteArray27);
        org.junit.Assert.assertNotNull(byteOrderMark0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-2, -1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ByteOrderMark[UTF-16BE: 0xFE,0xFF]" + "'", str4, "ByteOrderMark[UTF-16BE: 0xFE,0xFF]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF-16BE" + "'", str5, "UTF-16BE");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ByteOrderMark[UTF-16BE: 0xFE,0xFF]" + "'", str6, "ByteOrderMark[UTF-16BE: 0xFE,0xFF]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(byteOrderMark24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 239 + "'", int26 == 239);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[-17, -69, -65]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
        int[] intArray7 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark8 = new org.apache.commons.io.ByteOrderMark("hi!", intArray7);
        org.apache.commons.io.ByteOrderMark byteOrderMark9 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray7);
        org.apache.commons.io.ByteOrderMark byteOrderMark10 = new org.apache.commons.io.ByteOrderMark("hi!", intArray7);
        org.apache.commons.io.ByteOrderMark byteOrderMark11 = new org.apache.commons.io.ByteOrderMark("hi!", intArray7);
        int[] intArray17 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark18 = new org.apache.commons.io.ByteOrderMark("hi!", intArray17);
        org.apache.commons.io.ByteOrderMark byteOrderMark19 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray17);
        java.lang.String str20 = byteOrderMark19.getCharsetName();
        java.lang.String str21 = byteOrderMark19.getCharsetName();
        java.lang.String str22 = byteOrderMark19.getCharsetName();
        java.lang.String str23 = byteOrderMark19.toString();
        boolean boolean24 = byteOrderMark11.equals((java.lang.Object) byteOrderMark19);
        int int25 = byteOrderMark19.length();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 97, 35]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "UTF-16LE" + "'", str20, "UTF-16LE");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "UTF-16LE" + "'", str21, "UTF-16LE");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "UTF-16LE" + "'", str22, "UTF-16LE");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "ByteOrderMark[UTF-16LE: 0xA,0x61,0x23]" + "'", str23, "ByteOrderMark[UTF-16LE: 0xA,0x61,0x23]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
        int[] intArray8 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark9 = new org.apache.commons.io.ByteOrderMark("hi!", intArray8);
        org.apache.commons.io.ByteOrderMark byteOrderMark10 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray8);
        org.apache.commons.io.ByteOrderMark byteOrderMark11 = new org.apache.commons.io.ByteOrderMark("hi!", intArray8);
        org.apache.commons.io.ByteOrderMark byteOrderMark12 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray8);
        byte[] byteArray13 = byteOrderMark12.getBytes();
        byte[] byteArray14 = byteOrderMark12.getBytes();
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = org.apache.commons.io.ByteOrderMark.UTF_16BE;
        java.lang.Object obj16 = null;
        boolean boolean17 = byteOrderMark15.equals(obj16);
        int int18 = byteOrderMark15.length();
        boolean boolean20 = byteOrderMark15.equals((java.lang.Object) 0L);
        int int21 = byteOrderMark15.length();
        int int22 = byteOrderMark15.length();
        int[] intArray29 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark30 = new org.apache.commons.io.ByteOrderMark("hi!", intArray29);
        org.apache.commons.io.ByteOrderMark byteOrderMark31 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray29);
        org.apache.commons.io.ByteOrderMark byteOrderMark32 = new org.apache.commons.io.ByteOrderMark("hi!", intArray29);
        boolean boolean33 = byteOrderMark15.equals((java.lang.Object) intArray29);
        boolean boolean34 = byteOrderMark12.equals((java.lang.Object) intArray29);
        org.apache.commons.io.ByteOrderMark byteOrderMark35 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray29);
        int int36 = byteOrderMark35.length();
        org.apache.commons.io.ByteOrderMark byteOrderMark37 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        boolean boolean39 = byteOrderMark37.equals((java.lang.Object) (-1L));
        java.lang.String str40 = byteOrderMark37.toString();
        byte[] byteArray41 = byteOrderMark37.getBytes();
        java.lang.String str42 = byteOrderMark37.getCharsetName();
        int int43 = byteOrderMark37.length();
        byte[] byteArray44 = byteOrderMark37.getBytes();
        boolean boolean45 = byteOrderMark35.equals((java.lang.Object) byteArray44);
        java.lang.String str46 = byteOrderMark35.getCharsetName();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(byteOrderMark15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
        org.junit.Assert.assertNotNull(byteOrderMark37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "ByteOrderMark[UTF-16LE: 0xFF,0xFE]" + "'", str40, "ByteOrderMark[UTF-16LE: 0xFF,0xFE]");
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[-1, -2]");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "UTF-16LE" + "'", str42, "UTF-16LE");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[-1, -2]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "ByteOrderMark[UTF-16LE: 0xFF,0xFE]" + "'", str46, "ByteOrderMark[UTF-16LE: 0xFF,0xFE]");
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
        int[] intArray10 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark11 = new org.apache.commons.io.ByteOrderMark("hi!", intArray10);
        org.apache.commons.io.ByteOrderMark byteOrderMark12 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray10);
        org.apache.commons.io.ByteOrderMark byteOrderMark13 = new org.apache.commons.io.ByteOrderMark("hi!", intArray10);
        org.apache.commons.io.ByteOrderMark byteOrderMark14 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray10);
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[hi!: 0xA,0x61,0x23]", intArray10);
        org.apache.commons.io.ByteOrderMark byteOrderMark16 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xA,0x61,0x23]", intArray10);
        org.apache.commons.io.ByteOrderMark byteOrderMark17 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-8: 0xEF,0xBB,0xBF]", intArray10);
        byte[] byteArray18 = byteOrderMark17.getBytes();
        int[] intArray26 = new int[] { (byte) 0, 10, (-1) };
        org.apache.commons.io.ByteOrderMark byteOrderMark27 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[hi!: 0xA,0x61,0x23]", intArray26);
        org.apache.commons.io.ByteOrderMark byteOrderMark28 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0xA,0x61,0x23]", intArray26);
        org.apache.commons.io.ByteOrderMark byteOrderMark29 = new org.apache.commons.io.ByteOrderMark("UTF-16BE", intArray26);
        org.apache.commons.io.ByteOrderMark byteOrderMark30 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[ByteOrderMark[UTF-16BE: 0xFE,0xFF]: 0xA,0xFE,0x64]: 0xA,0x61,0x23]", intArray26);
        boolean boolean31 = byteOrderMark17.equals((java.lang.Object) intArray26);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[0, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
        int[] intArray12 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark13 = new org.apache.commons.io.ByteOrderMark("hi!", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark14 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("hi!", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark16 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark17 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[hi!: 0xA,0x61,0x23]", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark18 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xA,0x61,0x23]", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark19 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-8: 0xEF,0xBB,0xBF]", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark20 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[hi!: 0xA,0x61,0x23]", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark21 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[ByteOrderMark[UTF-16LE: 0xFF,0xFE]: 0xA,0x61,0x23]: 0xA,0x61,0x23]", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark22 = org.apache.commons.io.ByteOrderMark.UTF_32BE;
        java.lang.String str23 = byteOrderMark22.toString();
        java.lang.String str24 = byteOrderMark22.toString();
        int int26 = byteOrderMark22.get(2);
        boolean boolean28 = byteOrderMark22.equals((java.lang.Object) (byte) 10);
        byte[] byteArray29 = byteOrderMark22.getBytes();
        boolean boolean30 = byteOrderMark21.equals((java.lang.Object) byteOrderMark22);
        java.lang.String str31 = byteOrderMark21.toString();
        java.lang.Class<?> wildcardClass32 = byteOrderMark21.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(byteOrderMark22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]" + "'", str23, "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]" + "'", str24, "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 254 + "'", int26 == 254);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[0, 0, -2, -1]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "ByteOrderMark[ByteOrderMark[ByteOrderMark[ByteOrderMark[UTF-16LE: 0xFF,0xFE]: 0xA,0x61,0x23]: 0xA,0x61,0x23]: 0xA,0x61,0x23]" + "'", str31, "ByteOrderMark[ByteOrderMark[ByteOrderMark[ByteOrderMark[UTF-16LE: 0xFF,0xFE]: 0xA,0x61,0x23]: 0xA,0x61,0x23]: 0xA,0x61,0x23]");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
        org.apache.commons.io.ByteOrderMark byteOrderMark0 = org.apache.commons.io.ByteOrderMark.UTF_16BE;
        java.lang.Object obj1 = null;
        boolean boolean2 = byteOrderMark0.equals(obj1);
        int int3 = byteOrderMark0.length();
        boolean boolean5 = byteOrderMark0.equals((java.lang.Object) 0L);
        int int6 = byteOrderMark0.length();
        int int7 = byteOrderMark0.length();
        int[] intArray14 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("hi!", intArray14);
        org.apache.commons.io.ByteOrderMark byteOrderMark16 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray14);
        org.apache.commons.io.ByteOrderMark byteOrderMark17 = new org.apache.commons.io.ByteOrderMark("hi!", intArray14);
        boolean boolean18 = byteOrderMark0.equals((java.lang.Object) intArray14);
        byte[] byteArray19 = byteOrderMark0.getBytes();
        int int20 = byteOrderMark0.length();
        java.lang.String str21 = byteOrderMark0.getCharsetName();
        boolean boolean23 = byteOrderMark0.equals((java.lang.Object) (byte) 10);
        java.lang.String str24 = byteOrderMark0.toString();
        org.junit.Assert.assertNotNull(byteOrderMark0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[-2, -1]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "UTF-16BE" + "'", str21, "UTF-16BE");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "ByteOrderMark[UTF-16BE: 0xFE,0xFF]" + "'", str24, "ByteOrderMark[UTF-16BE: 0xFE,0xFF]");
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
        int[] intArray12 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark13 = new org.apache.commons.io.ByteOrderMark("hi!", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark14 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("hi!", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark16 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark17 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[hi!: 0xA,0x61,0x23]", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark18 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-8: 0xEF,0xBB,0xBF]", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark19 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xA,0x61,0x23]", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark20 = new org.apache.commons.io.ByteOrderMark("UTF-8", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark21 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0xA,0x61,0x23]", intArray12);
        byte[] byteArray22 = byteOrderMark21.getBytes();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[10, 97, 35]");
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
        int[] intArray9 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark10 = new org.apache.commons.io.ByteOrderMark("hi!", intArray9);
        org.apache.commons.io.ByteOrderMark byteOrderMark11 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray9);
        org.apache.commons.io.ByteOrderMark byteOrderMark12 = new org.apache.commons.io.ByteOrderMark("hi!", intArray9);
        org.apache.commons.io.ByteOrderMark byteOrderMark13 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray9);
        org.apache.commons.io.ByteOrderMark byteOrderMark14 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[hi!: 0xA,0x61,0x23]", intArray9);
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-8: 0xEF,0xBB,0xBF]", intArray9);
        int int17 = byteOrderMark15.get(2);
        java.lang.String str18 = byteOrderMark15.getCharsetName();
        int[] intArray30 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark31 = new org.apache.commons.io.ByteOrderMark("hi!", intArray30);
        org.apache.commons.io.ByteOrderMark byteOrderMark32 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray30);
        org.apache.commons.io.ByteOrderMark byteOrderMark33 = new org.apache.commons.io.ByteOrderMark("hi!", intArray30);
        org.apache.commons.io.ByteOrderMark byteOrderMark34 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray30);
        org.apache.commons.io.ByteOrderMark byteOrderMark35 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[hi!: 0xA,0x61,0x23]", intArray30);
        org.apache.commons.io.ByteOrderMark byteOrderMark36 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xA,0x61,0x23]", intArray30);
        org.apache.commons.io.ByteOrderMark byteOrderMark37 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-8: 0xEF,0xBB,0xBF]", intArray30);
        org.apache.commons.io.ByteOrderMark byteOrderMark38 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[UTF-16BE: 0xFE,0xFF]: 0xA,0x61,0x23]", intArray30);
        int[] intArray50 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark51 = new org.apache.commons.io.ByteOrderMark("hi!", intArray50);
        org.apache.commons.io.ByteOrderMark byteOrderMark52 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray50);
        org.apache.commons.io.ByteOrderMark byteOrderMark53 = new org.apache.commons.io.ByteOrderMark("hi!", intArray50);
        org.apache.commons.io.ByteOrderMark byteOrderMark54 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray50);
        org.apache.commons.io.ByteOrderMark byteOrderMark55 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray50);
        org.apache.commons.io.ByteOrderMark byteOrderMark56 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray50);
        org.apache.commons.io.ByteOrderMark byteOrderMark57 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray50);
        org.apache.commons.io.ByteOrderMark byteOrderMark58 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16BE: 0xFE,0xFF]", intArray50);
        boolean boolean59 = byteOrderMark38.equals((java.lang.Object) intArray50);
        int int60 = byteOrderMark38.length();
        java.lang.String str61 = byteOrderMark38.getCharsetName();
        boolean boolean62 = byteOrderMark15.equals((java.lang.Object) byteOrderMark38);
        org.apache.commons.io.ByteOrderMark byteOrderMark63 = org.apache.commons.io.ByteOrderMark.UTF_16BE;
        java.lang.Object obj64 = null;
        boolean boolean65 = byteOrderMark63.equals(obj64);
        byte[] byteArray66 = byteOrderMark63.getBytes();
        java.lang.String str67 = byteOrderMark63.toString();
        java.lang.String str68 = byteOrderMark63.getCharsetName();
        java.lang.String str69 = byteOrderMark63.toString();
        byte[] byteArray70 = byteOrderMark63.getBytes();
        boolean boolean71 = byteOrderMark15.equals((java.lang.Object) byteOrderMark63);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ByteOrderMark[UTF-8: 0xEF,0xBB,0xBF]" + "'", str18, "ByteOrderMark[UTF-8: 0xEF,0xBB,0xBF]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 3 + "'", int60 == 3);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "ByteOrderMark[ByteOrderMark[UTF-16BE: 0xFE,0xFF]: 0xA,0x61,0x23]" + "'", str61, "ByteOrderMark[ByteOrderMark[UTF-16BE: 0xFE,0xFF]: 0xA,0x61,0x23]");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(byteOrderMark63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray66), "[-2, -1]");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "ByteOrderMark[UTF-16BE: 0xFE,0xFF]" + "'", str67, "ByteOrderMark[UTF-16BE: 0xFE,0xFF]");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "UTF-16BE" + "'", str68, "UTF-16BE");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "ByteOrderMark[UTF-16BE: 0xFE,0xFF]" + "'", str69, "ByteOrderMark[UTF-16BE: 0xFE,0xFF]");
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray70), "[-2, -1]");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
        org.apache.commons.io.ByteOrderMark byteOrderMark0 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        boolean boolean2 = byteOrderMark0.equals((java.lang.Object) 1L);
        java.lang.String str3 = byteOrderMark0.getCharsetName();
        int int4 = byteOrderMark0.length();
        boolean boolean6 = byteOrderMark0.equals((java.lang.Object) (byte) -1);
        byte[] byteArray7 = byteOrderMark0.getBytes();
        java.lang.String str8 = byteOrderMark0.getCharsetName();
        java.lang.String str9 = byteOrderMark0.getCharsetName();
        int[] intArray17 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark18 = new org.apache.commons.io.ByteOrderMark("hi!", intArray17);
        org.apache.commons.io.ByteOrderMark byteOrderMark19 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray17);
        org.apache.commons.io.ByteOrderMark byteOrderMark20 = new org.apache.commons.io.ByteOrderMark("hi!", intArray17);
        org.apache.commons.io.ByteOrderMark byteOrderMark21 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray17);
        boolean boolean22 = byteOrderMark0.equals((java.lang.Object) byteOrderMark21);
        java.lang.String str23 = byteOrderMark0.getCharsetName();
        org.junit.Assert.assertNotNull(byteOrderMark0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF-16LE" + "'", str3, "UTF-16LE");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -2]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF-16LE" + "'", str8, "UTF-16LE");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTF-16LE" + "'", str9, "UTF-16LE");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "UTF-16LE" + "'", str23, "UTF-16LE");
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
        int[] intArray5 = new int[] { (short) -1, (byte) 0, 254 };
        org.apache.commons.io.ByteOrderMark byteOrderMark6 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[hi!: 0xA,0x61,0x23]", intArray5);
        org.apache.commons.io.ByteOrderMark byteOrderMark7 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-8: 0xEF,0xBB,0xBF]", intArray5);
        java.lang.String str8 = byteOrderMark7.getCharsetName();
        java.lang.String str9 = byteOrderMark7.toString();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 0, 254]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ByteOrderMark[UTF-8: 0xEF,0xBB,0xBF]" + "'", str8, "ByteOrderMark[UTF-8: 0xEF,0xBB,0xBF]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ByteOrderMark[ByteOrderMark[UTF-8: 0xEF,0xBB,0xBF]: 0xFF,0x0,0xFE]" + "'", str9, "ByteOrderMark[ByteOrderMark[UTF-8: 0xEF,0xBB,0xBF]: 0xFF,0x0,0xFE]");
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
        int[] intArray10 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark11 = new org.apache.commons.io.ByteOrderMark("hi!", intArray10);
        org.apache.commons.io.ByteOrderMark byteOrderMark12 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray10);
        org.apache.commons.io.ByteOrderMark byteOrderMark13 = new org.apache.commons.io.ByteOrderMark("hi!", intArray10);
        org.apache.commons.io.ByteOrderMark byteOrderMark14 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray10);
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray10);
        org.apache.commons.io.ByteOrderMark byteOrderMark16 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray10);
        org.apache.commons.io.ByteOrderMark byteOrderMark17 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray10);
        java.lang.String str18 = byteOrderMark17.getCharsetName();
        int int19 = byteOrderMark17.length();
        int int20 = byteOrderMark17.length();
        java.lang.Object obj21 = null;
        boolean boolean22 = byteOrderMark17.equals(obj21);
        java.lang.String str23 = byteOrderMark17.toString();
        int[] intArray37 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark38 = new org.apache.commons.io.ByteOrderMark("hi!", intArray37);
        org.apache.commons.io.ByteOrderMark byteOrderMark39 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray37);
        org.apache.commons.io.ByteOrderMark byteOrderMark40 = new org.apache.commons.io.ByteOrderMark("hi!", intArray37);
        org.apache.commons.io.ByteOrderMark byteOrderMark41 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray37);
        org.apache.commons.io.ByteOrderMark byteOrderMark42 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray37);
        org.apache.commons.io.ByteOrderMark byteOrderMark43 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray37);
        org.apache.commons.io.ByteOrderMark byteOrderMark44 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray37);
        org.apache.commons.io.ByteOrderMark byteOrderMark45 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[UTF-8: 0xEF,0xBB,0xBF]: 0xA,0x61,0x23]", intArray37);
        org.apache.commons.io.ByteOrderMark byteOrderMark46 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-8: 0xEF,0xBB,0xBF]", intArray37);
        org.apache.commons.io.ByteOrderMark byteOrderMark47 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[ByteOrderMark[UTF-16LE: 0xFF,0xFE]: 0xA,0x61,0x23]: 0xA,0x61,0x23]", intArray37);
        boolean boolean48 = byteOrderMark17.equals((java.lang.Object) intArray37);
        java.lang.Class<?> wildcardClass49 = intArray37.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[10, 97, 35]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ByteOrderMark[UTF-16LE: 0xFF,0xFE]" + "'", str18, "ByteOrderMark[UTF-16LE: 0xFF,0xFE]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "ByteOrderMark[ByteOrderMark[UTF-16LE: 0xFF,0xFE]: 0xA,0x61,0x23]" + "'", str23, "ByteOrderMark[ByteOrderMark[UTF-16LE: 0xFF,0xFE]: 0xA,0x61,0x23]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
        int[] intArray9 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark10 = new org.apache.commons.io.ByteOrderMark("hi!", intArray9);
        org.apache.commons.io.ByteOrderMark byteOrderMark11 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray9);
        org.apache.commons.io.ByteOrderMark byteOrderMark12 = new org.apache.commons.io.ByteOrderMark("hi!", intArray9);
        org.apache.commons.io.ByteOrderMark byteOrderMark13 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray9);
        org.apache.commons.io.ByteOrderMark byteOrderMark14 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]: 0xA,0x61,0x23]", intArray9);
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[ByteOrderMark[UTF-16LE: 0xFF,0xFE]: 0xA,0x61,0x23]: 0xA,0x61,0x23]", intArray9);
        java.lang.String str16 = byteOrderMark15.getCharsetName();
        java.lang.String str17 = byteOrderMark15.toString();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 97, 35]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ByteOrderMark[ByteOrderMark[ByteOrderMark[UTF-16LE: 0xFF,0xFE]: 0xA,0x61,0x23]: 0xA,0x61,0x23]" + "'", str16, "ByteOrderMark[ByteOrderMark[ByteOrderMark[UTF-16LE: 0xFF,0xFE]: 0xA,0x61,0x23]: 0xA,0x61,0x23]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ByteOrderMark[ByteOrderMark[ByteOrderMark[ByteOrderMark[UTF-16LE: 0xFF,0xFE]: 0xA,0x61,0x23]: 0xA,0x61,0x23]: 0xA,0x61,0x23]" + "'", str17, "ByteOrderMark[ByteOrderMark[ByteOrderMark[ByteOrderMark[UTF-16LE: 0xFF,0xFE]: 0xA,0x61,0x23]: 0xA,0x61,0x23]: 0xA,0x61,0x23]");
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
        org.apache.commons.io.ByteOrderMark byteOrderMark0 = org.apache.commons.io.ByteOrderMark.UTF_16BE;
        java.lang.Object obj1 = null;
        boolean boolean2 = byteOrderMark0.equals(obj1);
        int int3 = byteOrderMark0.length();
        boolean boolean5 = byteOrderMark0.equals((java.lang.Object) 0L);
        int[] intArray14 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("hi!", intArray14);
        org.apache.commons.io.ByteOrderMark byteOrderMark16 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray14);
        org.apache.commons.io.ByteOrderMark byteOrderMark17 = new org.apache.commons.io.ByteOrderMark("hi!", intArray14);
        org.apache.commons.io.ByteOrderMark byteOrderMark18 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray14);
        org.apache.commons.io.ByteOrderMark byteOrderMark19 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray14);
        byte[] byteArray20 = byteOrderMark19.getBytes();
        boolean boolean21 = byteOrderMark0.equals((java.lang.Object) byteOrderMark19);
        byte[] byteArray22 = byteOrderMark19.getBytes();
        java.lang.String str23 = byteOrderMark19.getCharsetName();
        int int24 = byteOrderMark19.length();
        org.junit.Assert.assertNotNull(byteOrderMark0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[10, 97, 35]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "UTF-32BE" + "'", str23, "UTF-32BE");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
        int[] intArray6 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark7 = new org.apache.commons.io.ByteOrderMark("hi!", intArray6);
        org.apache.commons.io.ByteOrderMark byteOrderMark8 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray6);
        org.apache.commons.io.ByteOrderMark byteOrderMark9 = new org.apache.commons.io.ByteOrderMark("hi!", intArray6);
        java.lang.String str10 = byteOrderMark9.toString();
        java.lang.String str11 = byteOrderMark9.getCharsetName();
        byte[] byteArray12 = byteOrderMark9.getBytes();
        java.lang.Object obj13 = null;
        boolean boolean14 = byteOrderMark9.equals(obj13);
        java.lang.String str15 = byteOrderMark9.getCharsetName();
        java.lang.String str16 = byteOrderMark9.toString();
        int int17 = byteOrderMark9.length();
        org.apache.commons.io.ByteOrderMark byteOrderMark18 = org.apache.commons.io.ByteOrderMark.UTF_32BE;
        java.lang.String str19 = byteOrderMark18.toString();
        java.lang.String str20 = byteOrderMark18.toString();
        int int22 = byteOrderMark18.get(2);
        boolean boolean24 = byteOrderMark18.equals((java.lang.Object) (byte) 10);
        byte[] byteArray25 = byteOrderMark18.getBytes();
        int[] intArray35 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark36 = new org.apache.commons.io.ByteOrderMark("hi!", intArray35);
        org.apache.commons.io.ByteOrderMark byteOrderMark37 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray35);
        org.apache.commons.io.ByteOrderMark byteOrderMark38 = new org.apache.commons.io.ByteOrderMark("hi!", intArray35);
        org.apache.commons.io.ByteOrderMark byteOrderMark39 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray35);
        org.apache.commons.io.ByteOrderMark byteOrderMark40 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray35);
        org.apache.commons.io.ByteOrderMark byteOrderMark41 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray35);
        boolean boolean42 = byteOrderMark18.equals((java.lang.Object) byteOrderMark41);
        int int43 = byteOrderMark18.length();
        byte[] byteArray44 = byteOrderMark18.getBytes();
        java.lang.String str45 = byteOrderMark18.toString();
        java.lang.String str46 = byteOrderMark18.getCharsetName();
        int int47 = byteOrderMark18.length();
        boolean boolean48 = byteOrderMark9.equals((java.lang.Object) byteOrderMark18);
        // The following exception was thrown during execution in test generation
        try {
            int int50 = byteOrderMark18.get(4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 97, 35]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ByteOrderMark[hi!: 0xA,0x61,0x23]" + "'", str10, "ByteOrderMark[hi!: 0xA,0x61,0x23]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ByteOrderMark[hi!: 0xA,0x61,0x23]" + "'", str16, "ByteOrderMark[hi!: 0xA,0x61,0x23]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(byteOrderMark18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]" + "'", str19, "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]" + "'", str20, "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 254 + "'", int22 == 254);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[0, 0, -2, -1]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 4 + "'", int43 == 4);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[0, 0, -2, -1]");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]" + "'", str45, "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "UTF-32BE" + "'", str46, "UTF-32BE");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 4 + "'", int47 == 4);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
        int[] intArray6 = new int[] { 10, 254, 100 };
        org.apache.commons.io.ByteOrderMark byteOrderMark7 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16BE: 0xFE,0xFF]", intArray6);
        org.apache.commons.io.ByteOrderMark byteOrderMark8 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[UTF-8: 0xEF,0xBB,0xBF]: 0xA,0x61,0x23]", intArray6);
        org.apache.commons.io.ByteOrderMark byteOrderMark9 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray6);
        java.lang.Class<?> wildcardClass10 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 254, 100]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
        int[] intArray12 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark13 = new org.apache.commons.io.ByteOrderMark("hi!", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark14 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark15 = new org.apache.commons.io.ByteOrderMark("hi!", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark16 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark17 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark18 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-8: 0xEF,0xBB,0xBF]", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark19 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[ByteOrderMark[UTF-16BE: 0xFE,0xFF]: 0xA,0x61,0x23]: 0xA,0x61,0x23]", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark20 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]", intArray12);
        org.apache.commons.io.ByteOrderMark byteOrderMark21 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[ByteOrderMark[ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]: 0xA,0x61,0x23]: 0xA,0x61,0x23]: 0xA,0x61,0x23]", intArray12);
        java.lang.String str22 = byteOrderMark21.getCharsetName();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[10, 97, 35]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ByteOrderMark[ByteOrderMark[ByteOrderMark[ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]: 0xA,0x61,0x23]: 0xA,0x61,0x23]: 0xA,0x61,0x23]" + "'", str22, "ByteOrderMark[ByteOrderMark[ByteOrderMark[ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]: 0xA,0x61,0x23]: 0xA,0x61,0x23]: 0xA,0x61,0x23]");
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
        int[] intArray5 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark6 = new org.apache.commons.io.ByteOrderMark("hi!", intArray5);
        org.apache.commons.io.ByteOrderMark byteOrderMark7 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[ByteOrderMark[UTF-16LE: 0xFF,0xFE]: 0xA,0x61,0x23]: 0xA,0x61,0x23]", intArray5);
        byte[] byteArray8 = byteOrderMark7.getBytes();
        byte[] byteArray9 = byteOrderMark7.getBytes();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[10, 97, 35]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, 97, 35]");
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
        org.apache.commons.io.ByteOrderMark byteOrderMark0 = org.apache.commons.io.ByteOrderMark.UTF_16LE;
        boolean boolean2 = byteOrderMark0.equals((java.lang.Object) 1L);
        java.lang.String str3 = byteOrderMark0.getCharsetName();
        org.apache.commons.io.ByteOrderMark byteOrderMark4 = org.apache.commons.io.ByteOrderMark.UTF_16BE;
        boolean boolean5 = byteOrderMark0.equals((java.lang.Object) byteOrderMark4);
        byte[] byteArray6 = byteOrderMark4.getBytes();
        int int7 = byteOrderMark4.length();
        java.lang.String str8 = byteOrderMark4.getCharsetName();
        java.lang.String str9 = byteOrderMark4.getCharsetName();
        byte[] byteArray10 = byteOrderMark4.getBytes();
        java.lang.String str11 = byteOrderMark4.getCharsetName();
        org.junit.Assert.assertNotNull(byteOrderMark0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF-16LE" + "'", str3, "UTF-16LE");
        org.junit.Assert.assertNotNull(byteOrderMark4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-2, -1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF-16BE" + "'", str8, "UTF-16BE");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTF-16BE" + "'", str9, "UTF-16BE");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-2, -1]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTF-16BE" + "'", str11, "UTF-16BE");
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
        int[] intArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.ByteOrderMark byteOrderMark2 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[ByteOrderMark[ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]: 0xFF]: 0xA,0x61,0x23]", intArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No bytes specified");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
        int[] intArray6 = new int[] { (byte) 0, 10, (-1) };
        org.apache.commons.io.ByteOrderMark byteOrderMark7 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[hi!: 0xA,0x61,0x23]", intArray6);
        org.apache.commons.io.ByteOrderMark byteOrderMark8 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[hi!: 0xA,0x61,0x23]", intArray6);
        org.apache.commons.io.ByteOrderMark byteOrderMark9 = new org.apache.commons.io.ByteOrderMark("UTF-8", intArray6);
        java.lang.String str10 = byteOrderMark9.getCharsetName();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 10, -1]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTF-8" + "'", str10, "UTF-8");
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
        int[] intArray5 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark6 = new org.apache.commons.io.ByteOrderMark("hi!", intArray5);
        org.apache.commons.io.ByteOrderMark byteOrderMark7 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray5);
        java.lang.Object obj8 = null;
        boolean boolean9 = byteOrderMark7.equals(obj8);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
        org.apache.commons.io.ByteOrderMark byteOrderMark0 = org.apache.commons.io.ByteOrderMark.UTF_32BE;
        java.lang.String str1 = byteOrderMark0.toString();
        java.lang.String str2 = byteOrderMark0.toString();
        int int4 = byteOrderMark0.get(2);
        boolean boolean6 = byteOrderMark0.equals((java.lang.Object) (byte) 10);
        byte[] byteArray7 = byteOrderMark0.getBytes();
        int[] intArray17 = new int[] { 10, 'a', '#' };
        org.apache.commons.io.ByteOrderMark byteOrderMark18 = new org.apache.commons.io.ByteOrderMark("hi!", intArray17);
        org.apache.commons.io.ByteOrderMark byteOrderMark19 = new org.apache.commons.io.ByteOrderMark("UTF-16LE", intArray17);
        org.apache.commons.io.ByteOrderMark byteOrderMark20 = new org.apache.commons.io.ByteOrderMark("hi!", intArray17);
        org.apache.commons.io.ByteOrderMark byteOrderMark21 = new org.apache.commons.io.ByteOrderMark("ByteOrderMark[UTF-16LE: 0xFF,0xFE]", intArray17);
        org.apache.commons.io.ByteOrderMark byteOrderMark22 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray17);
        org.apache.commons.io.ByteOrderMark byteOrderMark23 = new org.apache.commons.io.ByteOrderMark("UTF-32BE", intArray17);
        boolean boolean24 = byteOrderMark0.equals((java.lang.Object) byteOrderMark23);
        int int25 = byteOrderMark0.length();
        byte[] byteArray26 = byteOrderMark0.getBytes();
        java.lang.String str27 = byteOrderMark0.toString();
        int int28 = byteOrderMark0.length();
        int int29 = byteOrderMark0.length();
        org.junit.Assert.assertNotNull(byteOrderMark0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]" + "'", str1, "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]" + "'", str2, "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 254 + "'", int4 == 254);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, -2, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 97, 35]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[0, 0, -2, -1]");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]" + "'", str27, "ByteOrderMark[UTF-32BE: 0x0,0x0,0xFE,0xFF]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 4 + "'", int29 == 4);
    }
}

