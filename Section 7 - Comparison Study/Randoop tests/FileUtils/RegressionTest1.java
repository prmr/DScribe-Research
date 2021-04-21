import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.jupiter.api.Disabled;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test501");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.FileUtils.write(file0, (java.lang.CharSequence) "52 bytes", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.File.exists()\" because \"file\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    @Disabled
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = false; // flaky: org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file14 = org.apache.commons.io.FileUtils.getFile(strArray13);
        boolean boolean16 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file7, file14, "");
        org.apache.commons.io.LineIterator lineIterator17 = null; // flaky: org.apache.commons.io.FileUtils.lineIterator(file7);
        org.apache.commons.io.FileUtils.writeStringToFile(file7, "C:\\Users\\Mathieu\\AppData\\Local\\Temp\\", false);
        java.nio.charset.Charset charset22 = null;
        org.apache.commons.io.FileUtils.write(file7, (java.lang.CharSequence) "", charset22, true);
        org.apache.commons.io.FileUtils.touch(file7);
        java.nio.charset.Charset charset27 = null;
        org.apache.commons.io.FileUtils.write(file7, (java.lang.CharSequence) "1 GB1048576 EB1 GBC:\\Users\\Mathieu\\AppData\\Local\\Temp\\1 GBC:\\Users\\Mathieu1 GB1 GB1048576 EB1 GB", charset27);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.FileUtils.writeStringToFile(file7, "1048576 EB", "52 bytes", true);
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: 52 bytes");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky:         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(file14);
        org.junit.Assert.assertEquals(file14.getParent(), "hi!");
        org.junit.Assert.assertEquals(file14.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
// flaky:         org.junit.Assert.assertNotNull(lineIterator17);
    }

    @Test
    @Disabled
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = false; // flaky: org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        org.apache.commons.io.LineIterator lineIterator11 = null; // flaky: org.apache.commons.io.FileUtils.lineIterator(file7);
        boolean boolean12 = org.apache.commons.io.FileUtils.deleteQuietly(file7);
        org.apache.commons.io.FileUtils.writeStringToFile(file7, "");
        org.apache.commons.io.FileUtils.forceMkdirParent(file7);
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file19 = org.apache.commons.io.FileUtils.getFile(strArray18);
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file23 = org.apache.commons.io.FileUtils.getFile(strArray22);
        boolean boolean24 = org.apache.commons.io.FileUtils.isFileOlder(file19, file23);
        boolean boolean26 = org.apache.commons.io.FileUtils.waitFor(file23, (int) '4');
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file30 = org.apache.commons.io.FileUtils.getFile(strArray29);
        boolean boolean32 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file23, file30, "");
        boolean boolean34 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file7, file23, "hi!");
        java.io.File file35 = org.apache.commons.io.FileUtils.getTempDirectory();
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file39 = org.apache.commons.io.FileUtils.getFile(strArray38);
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file43 = org.apache.commons.io.FileUtils.getFile(strArray42);
        boolean boolean44 = org.apache.commons.io.FileUtils.isFileOlder(file39, file43);
        boolean boolean46 = org.apache.commons.io.FileUtils.waitFor(file43, (int) '4');
        org.apache.commons.io.LineIterator lineIterator47 = org.apache.commons.io.FileUtils.lineIterator(file43);
        boolean boolean49 = org.apache.commons.io.FileUtils.isFileOlder(file43, (-1L));
        java.nio.charset.Charset charset50 = null;
        java.lang.String str51 = org.apache.commons.io.FileUtils.readFileToString(file43, charset50);
        java.io.FileOutputStream fileOutputStream53 = org.apache.commons.io.FileUtils.openOutputStream(file43, false);
        java.io.FileOutputStream fileOutputStream55 = org.apache.commons.io.FileUtils.openOutputStream(file43, true);
        boolean boolean56 = org.apache.commons.io.FileUtils.isFileOlder(file35, file43);
        java.lang.String[] strArray63 = new java.lang.String[] { "C:\\Users\\Mathieu", "C:\\Users\\Mathieu", "", "1 GB", "hi!", "" };
        java.util.Iterator<java.io.File> fileItor65 = org.apache.commons.io.FileUtils.iterateFiles(file35, strArray63, true);
        java.io.File file66 = org.apache.commons.io.FileUtils.getFile(strArray63);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.io.File> fileCollection68 = org.apache.commons.io.FileUtils.listFiles(file7, strArray63, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'directory' is not a directory: hi!\\hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky:         org.junit.Assert.assertNotNull(lineIterator11);
// flaky:         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(file19);
        org.junit.Assert.assertEquals(file19.getParent(), "hi!");
        org.junit.Assert.assertEquals(file19.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(file23);
        org.junit.Assert.assertEquals(file23.getParent(), "hi!");
        org.junit.Assert.assertEquals(file23.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(file30);
        org.junit.Assert.assertEquals(file30.getParent(), "hi!");
        org.junit.Assert.assertEquals(file30.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(file35);
        org.junit.Assert.assertEquals(file35.getParent(), "C:\\Users\\Mathieu\\AppData\\Local");
        org.junit.Assert.assertEquals(file35.toString(), "C:\\Users\\Mathieu\\AppData\\Local\\Temp");
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(file39);
        org.junit.Assert.assertEquals(file39.getParent(), "hi!");
        org.junit.Assert.assertEquals(file39.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(file43);
        org.junit.Assert.assertEquals(file43.getParent(), "hi!");
        org.junit.Assert.assertEquals(file43.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(lineIterator47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(fileOutputStream53);
        org.junit.Assert.assertNotNull(fileOutputStream55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertNotNull(fileItor65);
        org.junit.Assert.assertNotNull(file66);
        org.junit.Assert.assertEquals(file66.getParent(), "C:\\Users\\Mathieu\\C:\\Users\\Mathieu\\1 GB");
        org.junit.Assert.assertEquals(file66.toString(), "C:\\Users\\Mathieu\\C:\\Users\\Mathieu\\1 GB\\hi!");
    }

    @Test
    @Disabled
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.io.File file5 = org.apache.commons.io.FileUtils.getFile(strArray4);
        java.io.File file6 = org.apache.commons.io.FileUtils.getFile(file3, strArray4);
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file10 = org.apache.commons.io.FileUtils.getFile(strArray9);
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file14 = org.apache.commons.io.FileUtils.getFile(strArray13);
        boolean boolean15 = false; // flaky: org.apache.commons.io.FileUtils.isFileOlder(file10, file14);
        boolean boolean17 = org.apache.commons.io.FileUtils.waitFor(file14, (int) '4');
        org.apache.commons.io.LineIterator lineIterator18 = null; // flaky: org.apache.commons.io.FileUtils.lineIterator(file14);
        boolean boolean20 = org.apache.commons.io.FileUtils.isFileOlder(file14, (-1L));
        java.io.FileOutputStream fileOutputStream22 = org.apache.commons.io.FileUtils.openOutputStream(file14, false);
        long long23 = org.apache.commons.io.FileUtils.copyFile(file3, (java.io.OutputStream) fileOutputStream22);
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file27 = org.apache.commons.io.FileUtils.getFile(strArray26);
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file31 = org.apache.commons.io.FileUtils.getFile(strArray30);
        boolean boolean32 = org.apache.commons.io.FileUtils.isFileOlder(file27, file31);
        boolean boolean34 = org.apache.commons.io.FileUtils.waitFor(file31, (int) '4');
        org.apache.commons.io.LineIterator lineIterator35 = org.apache.commons.io.FileUtils.lineIterator(file31);
        boolean boolean37 = org.apache.commons.io.FileUtils.isFileOlder(file31, (-1L));
        java.nio.charset.Charset charset38 = null;
        java.lang.String str39 = org.apache.commons.io.FileUtils.readFileToString(file31, charset38);
        java.io.FileOutputStream fileOutputStream41 = org.apache.commons.io.FileUtils.openOutputStream(file31, false);
        java.util.zip.Checksum checksum42 = null;
        java.util.zip.Checksum checksum43 = org.apache.commons.io.FileUtils.checksum(file31, checksum42);
        java.io.FileFilter fileFilter44 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.FileUtils.copyDirectory(file3, file31, fileFilter44, false);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Source 'hi!\\hi!' exists but is not a directory");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(file5);
        org.junit.Assert.assertNotNull(file6);
        org.junit.Assert.assertEquals(file6.getParent(), "hi!");
        org.junit.Assert.assertEquals(file6.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(file10);
        org.junit.Assert.assertEquals(file10.getParent(), "hi!");
        org.junit.Assert.assertEquals(file10.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(file14);
        org.junit.Assert.assertEquals(file14.getParent(), "hi!");
        org.junit.Assert.assertEquals(file14.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
// flaky:         org.junit.Assert.assertNotNull(lineIterator18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(fileOutputStream22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(file27);
        org.junit.Assert.assertEquals(file27.getParent(), "hi!");
        org.junit.Assert.assertEquals(file27.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(file31);
        org.junit.Assert.assertEquals(file31.getParent(), "hi!");
        org.junit.Assert.assertEquals(file31.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(lineIterator35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(fileOutputStream41);
        org.junit.Assert.assertNull(checksum43);
    }

    @Test
    @Disabled
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = false; // flaky: org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        org.apache.commons.io.LineIterator lineIterator11 = null; // flaky: org.apache.commons.io.FileUtils.lineIterator(file7);
        boolean boolean13 = org.apache.commons.io.FileUtils.isFileOlder(file7, (-1L));
        long long14 = org.apache.commons.io.FileUtils.sizeOf(file7);
        java.io.File file15 = org.apache.commons.io.FileUtils.getUserDirectory();
        org.apache.commons.io.FileUtils.copyFileToDirectory(file7, file15, true);
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file21 = org.apache.commons.io.FileUtils.getFile(strArray20);
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file25 = org.apache.commons.io.FileUtils.getFile(strArray24);
        boolean boolean26 = org.apache.commons.io.FileUtils.isFileOlder(file21, file25);
        boolean boolean27 = org.apache.commons.io.FileUtils.deleteQuietly(file25);
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file31 = org.apache.commons.io.FileUtils.getFile(strArray30);
        java.lang.String[] strArray34 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file35 = org.apache.commons.io.FileUtils.getFile(strArray34);
        boolean boolean36 = org.apache.commons.io.FileUtils.isFileOlder(file31, file35);
        boolean boolean38 = org.apache.commons.io.FileUtils.waitFor(file35, (int) '4');
        java.lang.String[] strArray41 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file42 = org.apache.commons.io.FileUtils.getFile(strArray41);
        boolean boolean44 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file35, file42, "");
        org.apache.commons.io.LineIterator lineIterator45 = org.apache.commons.io.FileUtils.lineIterator(file35);
        org.apache.commons.io.FileUtils.writeStringToFile(file35, "C:\\Users\\Mathieu\\AppData\\Local\\Temp\\", false);
        java.nio.charset.Charset charset50 = null;
        org.apache.commons.io.FileUtils.write(file35, (java.lang.CharSequence) "", charset50, true);
        boolean boolean54 = org.apache.commons.io.FileUtils.waitFor(file35, 0);
        boolean boolean55 = org.apache.commons.io.FileUtils.isFileOlder(file25, file35);
        boolean boolean57 = org.apache.commons.io.FileUtils.isFileOlder(file25, 1024L);
        java.util.List<java.lang.String> strList58 = org.apache.commons.io.FileUtils.readLines(file25);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.FileUtils.writeLines(file15, (java.util.Collection<java.lang.String>) strList58, true);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: File 'C:\\Users\\Mathieu' exists but is a directory");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky:         org.junit.Assert.assertNotNull(lineIterator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(file15);
        org.junit.Assert.assertEquals(file15.getParent(), "C:\\Users");
        org.junit.Assert.assertEquals(file15.toString(), "C:\\Users\\Mathieu");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(file21);
        org.junit.Assert.assertEquals(file21.getParent(), "hi!");
        org.junit.Assert.assertEquals(file21.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(file25);
        org.junit.Assert.assertEquals(file25.getParent(), "hi!");
        org.junit.Assert.assertEquals(file25.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(file31);
        org.junit.Assert.assertEquals(file31.getParent(), "hi!");
        org.junit.Assert.assertEquals(file31.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(file35);
        org.junit.Assert.assertEquals(file35.getParent(), "hi!");
        org.junit.Assert.assertEquals(file35.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(file42);
        org.junit.Assert.assertEquals(file42.getParent(), "hi!");
        org.junit.Assert.assertEquals(file42.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(lineIterator45);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(strList58);
    }

    @Test
    @Disabled
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = false; // flaky: org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        java.lang.String str9 = null; // flaky: org.apache.commons.io.FileUtils.readFileToString(file3);
        org.apache.commons.io.FileUtils.writeStringToFile(file3, "", false);
        boolean boolean14 = org.apache.commons.io.FileUtils.isFileNewer(file3, 0L);
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file18 = org.apache.commons.io.FileUtils.getFile(strArray17);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file22 = org.apache.commons.io.FileUtils.getFile(strArray21);
        boolean boolean23 = org.apache.commons.io.FileUtils.isFileOlder(file18, file22);
        boolean boolean25 = org.apache.commons.io.FileUtils.waitFor(file22, (int) '4');
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file29 = org.apache.commons.io.FileUtils.getFile(strArray28);
        boolean boolean31 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file22, file29, "");
        org.apache.commons.io.LineIterator lineIterator32 = org.apache.commons.io.FileUtils.lineIterator(file22);
        org.apache.commons.io.FileUtils.writeStringToFile(file22, "C:\\Users\\Mathieu\\AppData\\Local\\Temp\\", false);
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file39 = org.apache.commons.io.FileUtils.getFile(strArray38);
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file43 = org.apache.commons.io.FileUtils.getFile(strArray42);
        boolean boolean44 = org.apache.commons.io.FileUtils.isFileOlder(file39, file43);
        java.lang.String str45 = org.apache.commons.io.FileUtils.readFileToString(file39);
        java.lang.String[] strArray48 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file49 = org.apache.commons.io.FileUtils.getFile(strArray48);
        java.io.File file50 = org.apache.commons.io.FileUtils.getFile(file39, strArray48);
        boolean boolean52 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file22, file50, "-1 bytes");
        java.io.FileOutputStream fileOutputStream53 = org.apache.commons.io.FileUtils.openOutputStream(file22);
        long long54 = org.apache.commons.io.FileUtils.copyFile(file3, (java.io.OutputStream) fileOutputStream53);
        java.nio.charset.Charset charset55 = null;
        java.lang.String str56 = org.apache.commons.io.FileUtils.readFileToString(file3, charset55);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1 bytes" + "'", str9, "-1 bytes");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(file18);
        org.junit.Assert.assertEquals(file18.getParent(), "hi!");
        org.junit.Assert.assertEquals(file18.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(file22);
        org.junit.Assert.assertEquals(file22.getParent(), "hi!");
        org.junit.Assert.assertEquals(file22.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(file29);
        org.junit.Assert.assertEquals(file29.getParent(), "hi!");
        org.junit.Assert.assertEquals(file29.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(lineIterator32);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(file39);
        org.junit.Assert.assertEquals(file39.getParent(), "hi!");
        org.junit.Assert.assertEquals(file39.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(file43);
        org.junit.Assert.assertEquals(file43.getParent(), "hi!");
        org.junit.Assert.assertEquals(file43.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "C:\\Users\\Mathieu\\AppData\\Local\\Temp\\" + "'", str45, "C:\\Users\\Mathieu\\AppData\\Local\\Temp\\");
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(file49);
        org.junit.Assert.assertEquals(file49.getParent(), "hi!");
        org.junit.Assert.assertEquals(file49.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(file50);
        org.junit.Assert.assertEquals(file50.getParent(), "hi!\\hi!\\hi!");
        org.junit.Assert.assertEquals(file50.toString(), "hi!\\hi!\\hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(fileOutputStream53);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
    }

    @Test
    @Disabled
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = false; // flaky: org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean9 = org.apache.commons.io.FileUtils.deleteQuietly(file7);
        java.nio.charset.Charset charset11 = null;
        org.apache.commons.io.FileUtils.write(file7, (java.lang.CharSequence) "", charset11, true);
        org.apache.commons.io.FileUtils.writeStringToFile(file7, "52 bytes");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    @Disabled
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = false; // flaky: org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        org.apache.commons.io.LineIterator lineIterator11 = org.apache.commons.io.FileUtils.lineIterator(file7);
        boolean boolean13 = org.apache.commons.io.FileUtils.isFileOlder(file7, (-1L));
        long long14 = org.apache.commons.io.FileUtils.sizeOf(file7);
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file18 = org.apache.commons.io.FileUtils.getFile(strArray17);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file22 = org.apache.commons.io.FileUtils.getFile(strArray21);
        boolean boolean23 = org.apache.commons.io.FileUtils.isFileOlder(file18, file22);
        boolean boolean25 = org.apache.commons.io.FileUtils.waitFor(file22, (int) '4');
        org.apache.commons.io.LineIterator lineIterator26 = org.apache.commons.io.FileUtils.lineIterator(file22);
        boolean boolean27 = org.apache.commons.io.FileUtils.deleteQuietly(file22);
        org.apache.commons.io.FileUtils.writeStringToFile(file22, "");
        java.lang.String[] strArray32 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file33 = org.apache.commons.io.FileUtils.getFile(strArray32);
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file37 = org.apache.commons.io.FileUtils.getFile(strArray36);
        boolean boolean38 = org.apache.commons.io.FileUtils.isFileOlder(file33, file37);
        boolean boolean40 = org.apache.commons.io.FileUtils.waitFor(file37, (int) '4');
        java.lang.String[] strArray43 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file44 = org.apache.commons.io.FileUtils.getFile(strArray43);
        boolean boolean46 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file37, file44, "");
        boolean boolean47 = org.apache.commons.io.FileUtils.isFileNewer(file22, file37);
        java.io.FileOutputStream fileOutputStream48 = org.apache.commons.io.FileUtils.openOutputStream(file22);
        java.math.BigInteger bigInteger49 = org.apache.commons.io.FileUtils.sizeOfAsBigInteger(file22);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.FileUtils.copyDirectoryToDirectory(file7, file22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Source 'hi!\\hi!' is not a directory");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lineIterator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 8L + "'", long14 == 8L);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(file18);
        org.junit.Assert.assertEquals(file18.getParent(), "hi!");
        org.junit.Assert.assertEquals(file18.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(file22);
        org.junit.Assert.assertEquals(file22.getParent(), "hi!");
        org.junit.Assert.assertEquals(file22.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(lineIterator26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(file33);
        org.junit.Assert.assertEquals(file33.getParent(), "hi!");
        org.junit.Assert.assertEquals(file33.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(file37);
        org.junit.Assert.assertEquals(file37.getParent(), "hi!");
        org.junit.Assert.assertEquals(file37.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(file44);
        org.junit.Assert.assertEquals(file44.getParent(), "hi!");
        org.junit.Assert.assertEquals(file44.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(fileOutputStream48);
        org.junit.Assert.assertNotNull(bigInteger49);
    }

    @Test
    @Disabled
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = false; // flaky: org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file14 = org.apache.commons.io.FileUtils.getFile(strArray13);
        boolean boolean16 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file7, file14, "");
        org.apache.commons.io.LineIterator lineIterator17 = org.apache.commons.io.FileUtils.lineIterator(file7);
        org.apache.commons.io.FileUtils.writeStringToFile(file7, "C:\\Users\\Mathieu\\AppData\\Local\\Temp\\", false);
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file24 = org.apache.commons.io.FileUtils.getFile(strArray23);
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file28 = org.apache.commons.io.FileUtils.getFile(strArray27);
        boolean boolean29 = org.apache.commons.io.FileUtils.isFileOlder(file24, file28);
        java.lang.String str30 = org.apache.commons.io.FileUtils.readFileToString(file24);
        java.lang.String[] strArray33 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file34 = org.apache.commons.io.FileUtils.getFile(strArray33);
        java.io.File file35 = org.apache.commons.io.FileUtils.getFile(file24, strArray33);
        boolean boolean37 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file7, file35, "-1 bytes");
        java.lang.String[] strArray40 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file41 = org.apache.commons.io.FileUtils.getFile(strArray40);
        java.lang.String[] strArray44 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file45 = org.apache.commons.io.FileUtils.getFile(strArray44);
        boolean boolean46 = org.apache.commons.io.FileUtils.isFileOlder(file41, file45);
        boolean boolean48 = org.apache.commons.io.FileUtils.waitFor(file45, (int) '4');
        org.apache.commons.io.LineIterator lineIterator49 = org.apache.commons.io.FileUtils.lineIterator(file45);
        boolean boolean50 = org.apache.commons.io.FileUtils.deleteQuietly(file45);
        org.apache.commons.io.FileUtils.write(file45, (java.lang.CharSequence) "hi!");
        java.nio.charset.Charset charset54 = null;
        org.apache.commons.io.FileUtils.write(file45, (java.lang.CharSequence) "", charset54, true);
        java.nio.charset.Charset charset58 = null;
        org.apache.commons.io.FileUtils.writeStringToFile(file45, "", charset58, false);
        long long61 = org.apache.commons.io.FileUtils.sizeOf(file45);
        org.apache.commons.io.FileUtils.writeStringToFile(file45, "");
        java.nio.charset.Charset charset64 = null;
        java.util.List<java.lang.String> strList65 = org.apache.commons.io.FileUtils.readLines(file45, charset64);
        org.apache.commons.io.FileUtils.writeLines(file7, (java.util.Collection<java.lang.String>) strList65, "32 bytes");
        java.io.File file68 = org.apache.commons.io.FileUtils.getTempDirectory();
        java.lang.String[] strArray71 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file72 = org.apache.commons.io.FileUtils.getFile(strArray71);
        java.lang.String[] strArray75 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file76 = org.apache.commons.io.FileUtils.getFile(strArray75);
        boolean boolean77 = org.apache.commons.io.FileUtils.isFileOlder(file72, file76);
        boolean boolean79 = org.apache.commons.io.FileUtils.waitFor(file76, (int) '4');
        org.apache.commons.io.LineIterator lineIterator80 = org.apache.commons.io.FileUtils.lineIterator(file76);
        boolean boolean82 = org.apache.commons.io.FileUtils.isFileOlder(file76, (-1L));
        java.nio.charset.Charset charset83 = null;
        java.lang.String str84 = org.apache.commons.io.FileUtils.readFileToString(file76, charset83);
        java.io.FileOutputStream fileOutputStream86 = org.apache.commons.io.FileUtils.openOutputStream(file76, false);
        java.io.FileOutputStream fileOutputStream88 = org.apache.commons.io.FileUtils.openOutputStream(file76, true);
        boolean boolean89 = org.apache.commons.io.FileUtils.isFileOlder(file68, file76);
        java.lang.String[] strArray96 = new java.lang.String[] { "C:\\Users\\Mathieu", "C:\\Users\\Mathieu", "", "1 GB", "hi!", "" };
        java.util.Iterator<java.io.File> fileItor98 = org.apache.commons.io.FileUtils.iterateFiles(file68, strArray96, true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.FileUtils.copyDirectoryToDirectory(file7, file68);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Source 'hi!\\hi!' is not a directory");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(file14);
        org.junit.Assert.assertEquals(file14.getParent(), "hi!");
        org.junit.Assert.assertEquals(file14.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(lineIterator17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(file24);
        org.junit.Assert.assertEquals(file24.getParent(), "hi!");
        org.junit.Assert.assertEquals(file24.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(file28);
        org.junit.Assert.assertEquals(file28.getParent(), "hi!");
        org.junit.Assert.assertEquals(file28.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "C:\\Users\\Mathieu\\AppData\\Local\\Temp\\" + "'", str30, "C:\\Users\\Mathieu\\AppData\\Local\\Temp\\");
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(file34);
        org.junit.Assert.assertEquals(file34.getParent(), "hi!");
        org.junit.Assert.assertEquals(file34.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(file35);
        org.junit.Assert.assertEquals(file35.getParent(), "hi!\\hi!\\hi!");
        org.junit.Assert.assertEquals(file35.toString(), "hi!\\hi!\\hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(file41);
        org.junit.Assert.assertEquals(file41.getParent(), "hi!");
        org.junit.Assert.assertEquals(file41.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(file45);
        org.junit.Assert.assertEquals(file45.getParent(), "hi!");
        org.junit.Assert.assertEquals(file45.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(lineIterator49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
        org.junit.Assert.assertNotNull(strList65);
        org.junit.Assert.assertNotNull(file68);
        org.junit.Assert.assertEquals(file68.getParent(), "C:\\Users\\Mathieu\\AppData\\Local");
        org.junit.Assert.assertEquals(file68.toString(), "C:\\Users\\Mathieu\\AppData\\Local\\Temp");
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertNotNull(file72);
        org.junit.Assert.assertEquals(file72.getParent(), "hi!");
        org.junit.Assert.assertEquals(file72.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertNotNull(file76);
        org.junit.Assert.assertEquals(file76.getParent(), "hi!");
        org.junit.Assert.assertEquals(file76.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(lineIterator80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertNotNull(fileOutputStream86);
        org.junit.Assert.assertNotNull(fileOutputStream88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(strArray96);
        org.junit.Assert.assertNotNull(fileItor98);
    }

    @Test
    @Disabled
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = false; // flaky: org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        org.apache.commons.io.LineIterator lineIterator11 = org.apache.commons.io.FileUtils.lineIterator(file7);
        boolean boolean12 = org.apache.commons.io.FileUtils.deleteQuietly(file7);
        java.io.FileOutputStream fileOutputStream13 = org.apache.commons.io.FileUtils.openOutputStream(file7);
        java.io.FileInputStream fileInputStream14 = org.apache.commons.io.FileUtils.openInputStream(file7);
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file18 = org.apache.commons.io.FileUtils.getFile(strArray17);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file22 = org.apache.commons.io.FileUtils.getFile(strArray21);
        boolean boolean23 = org.apache.commons.io.FileUtils.isFileOlder(file18, file22);
        boolean boolean25 = org.apache.commons.io.FileUtils.waitFor(file22, (int) '4');
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file29 = org.apache.commons.io.FileUtils.getFile(strArray28);
        boolean boolean31 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file22, file29, "");
        org.apache.commons.io.LineIterator lineIterator32 = org.apache.commons.io.FileUtils.lineIterator(file22);
        org.apache.commons.io.FileUtils.writeStringToFile(file22, "C:\\Users\\Mathieu\\AppData\\Local\\Temp\\", false);
        java.nio.charset.Charset charset37 = null;
        org.apache.commons.io.FileUtils.write(file22, (java.lang.CharSequence) "", charset37, true);
        org.apache.commons.io.FileUtils.touch(file22);
        java.nio.charset.Charset charset42 = null;
        org.apache.commons.io.FileUtils.write(file22, (java.lang.CharSequence) "1 GB1048576 EB1 GBC:\\Users\\Mathieu\\AppData\\Local\\Temp\\1 GBC:\\Users\\Mathieu1 GB1 GB1048576 EB1 GB", charset42);
        org.apache.commons.io.FileUtils.copyInputStreamToFile((java.io.InputStream) fileInputStream14, file22);
        java.io.File file45 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.FileUtils.copyInputStreamToFile((java.io.InputStream) fileInputStream14, file45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.File.exists()\" because \"file\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lineIterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(fileOutputStream13);
        org.junit.Assert.assertNotNull(fileInputStream14);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(file18);
        org.junit.Assert.assertEquals(file18.getParent(), "hi!");
        org.junit.Assert.assertEquals(file18.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(file22);
        org.junit.Assert.assertEquals(file22.getParent(), "hi!");
        org.junit.Assert.assertEquals(file22.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(file29);
        org.junit.Assert.assertEquals(file29.getParent(), "hi!");
        org.junit.Assert.assertEquals(file29.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(lineIterator32);
    }

    @Test
    @Disabled
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        java.io.File file0 = null;
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file4 = org.apache.commons.io.FileUtils.getFile(strArray3);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file8 = org.apache.commons.io.FileUtils.getFile(strArray7);
        boolean boolean9 = false; // flaky: org.apache.commons.io.FileUtils.isFileOlder(file4, file8);
        boolean boolean11 = org.apache.commons.io.FileUtils.waitFor(file8, (int) '4');
        org.apache.commons.io.LineIterator lineIterator12 = org.apache.commons.io.FileUtils.lineIterator(file8);
        boolean boolean13 = org.apache.commons.io.FileUtils.deleteQuietly(file8);
        org.apache.commons.io.FileUtils.write(file8, (java.lang.CharSequence) "hi!");
        java.nio.charset.Charset charset17 = null;
        org.apache.commons.io.FileUtils.write(file8, (java.lang.CharSequence) "", charset17, true);
        byte[] byteArray20 = org.apache.commons.io.FileUtils.readFileToByteArray(file8);
        boolean boolean22 = org.apache.commons.io.FileUtils.waitFor(file8, (int) 'a');
        boolean boolean24 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file0, file8, "-1 bytes");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(file4);
        org.junit.Assert.assertEquals(file4.getParent(), "hi!");
        org.junit.Assert.assertEquals(file4.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(file8);
        org.junit.Assert.assertEquals(file8.getParent(), "hi!");
        org.junit.Assert.assertEquals(file8.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(lineIterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[104, 105, 33]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    @Disabled
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = false; // flaky: org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        org.apache.commons.io.LineIterator lineIterator11 = org.apache.commons.io.FileUtils.lineIterator(file7);
        boolean boolean12 = org.apache.commons.io.FileUtils.deleteQuietly(file7);
        org.apache.commons.io.FileUtils.write(file7, (java.lang.CharSequence) "hi!");
        java.nio.charset.Charset charset16 = null;
        org.apache.commons.io.FileUtils.write(file7, (java.lang.CharSequence) "", charset16, true);
        java.nio.charset.Charset charset20 = null;
        org.apache.commons.io.FileUtils.writeStringToFile(file7, "", charset20, false);
        long long23 = org.apache.commons.io.FileUtils.sizeOf(file7);
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file27 = org.apache.commons.io.FileUtils.getFile(strArray26);
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file31 = org.apache.commons.io.FileUtils.getFile(strArray30);
        boolean boolean32 = org.apache.commons.io.FileUtils.isFileOlder(file27, file31);
        boolean boolean34 = org.apache.commons.io.FileUtils.waitFor(file31, (int) '4');
        org.apache.commons.io.LineIterator lineIterator35 = org.apache.commons.io.FileUtils.lineIterator(file31);
        boolean boolean36 = org.apache.commons.io.FileUtils.deleteQuietly(file31);
        org.apache.commons.io.FileUtils.write(file31, (java.lang.CharSequence) "hi!");
        java.nio.charset.Charset charset40 = null;
        org.apache.commons.io.FileUtils.write(file31, (java.lang.CharSequence) "", charset40, true);
        java.nio.charset.Charset charset44 = null;
        org.apache.commons.io.FileUtils.writeStringToFile(file31, "", charset44, false);
        long long47 = org.apache.commons.io.FileUtils.sizeOf(file31);
        org.apache.commons.io.FileUtils.writeStringToFile(file31, "");
        boolean boolean51 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file7, file31, "hi!");
        org.apache.commons.io.FileUtils.writeStringToFile(file31, "", true);
        java.lang.String[] strArray57 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file58 = org.apache.commons.io.FileUtils.getFile(strArray57);
        java.lang.String[] strArray61 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file62 = org.apache.commons.io.FileUtils.getFile(strArray61);
        boolean boolean63 = org.apache.commons.io.FileUtils.isFileOlder(file58, file62);
        boolean boolean65 = org.apache.commons.io.FileUtils.waitFor(file62, (int) '4');
        org.apache.commons.io.LineIterator lineIterator66 = org.apache.commons.io.FileUtils.lineIterator(file62);
        boolean boolean68 = org.apache.commons.io.FileUtils.isFileOlder(file62, (-1L));
        byte[] byteArray69 = new byte[] {};
        org.apache.commons.io.FileUtils.writeByteArrayToFile(file62, byteArray69);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.FileUtils.moveToDirectory(file31, file62, true);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Destination 'hi!\\hi!' is not a directory");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lineIterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(file27);
        org.junit.Assert.assertEquals(file27.getParent(), "hi!");
        org.junit.Assert.assertEquals(file27.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(file31);
        org.junit.Assert.assertEquals(file31.getParent(), "hi!");
        org.junit.Assert.assertEquals(file31.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(lineIterator35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertNotNull(file58);
        org.junit.Assert.assertEquals(file58.getParent(), "hi!");
        org.junit.Assert.assertEquals(file58.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertNotNull(file62);
        org.junit.Assert.assertEquals(file62.getParent(), "hi!");
        org.junit.Assert.assertEquals(file62.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(lineIterator66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray69), "[]");
    }

    @Test
    @Disabled
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = false; // flaky: org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        org.apache.commons.io.LineIterator lineIterator11 = org.apache.commons.io.FileUtils.lineIterator(file7);
        boolean boolean13 = org.apache.commons.io.FileUtils.isFileOlder(file7, (-1L));
        java.nio.charset.Charset charset14 = null;
        java.lang.String str15 = org.apache.commons.io.FileUtils.readFileToString(file7, charset14);
        org.apache.commons.io.FileUtils.writeStringToFile(file7, "hi!", true);
        org.apache.commons.io.FileUtils.write(file7, (java.lang.CharSequence) "\000\000d\001", true);
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file25 = org.apache.commons.io.FileUtils.getFile(strArray24);
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file29 = org.apache.commons.io.FileUtils.getFile(strArray28);
        boolean boolean30 = org.apache.commons.io.FileUtils.isFileOlder(file25, file29);
        boolean boolean32 = org.apache.commons.io.FileUtils.waitFor(file29, (int) '4');
        org.apache.commons.io.LineIterator lineIterator33 = org.apache.commons.io.FileUtils.lineIterator(file29);
        boolean boolean34 = org.apache.commons.io.FileUtils.deleteQuietly(file29);
        org.apache.commons.io.FileUtils.write(file29, (java.lang.CharSequence) "hi!");
        java.nio.charset.Charset charset38 = null;
        org.apache.commons.io.FileUtils.write(file29, (java.lang.CharSequence) "", charset38, true);
        java.nio.charset.Charset charset42 = null;
        org.apache.commons.io.FileUtils.writeStringToFile(file29, "", charset42, false);
        long long45 = org.apache.commons.io.FileUtils.sizeOf(file29);
        org.apache.commons.io.FileUtils.writeStringToFile(file29, "");
        java.nio.charset.Charset charset48 = null;
        java.util.List<java.lang.String> strList49 = org.apache.commons.io.FileUtils.readLines(file29, charset48);
        org.apache.commons.io.FileUtils.writeLines(file7, (java.util.Collection<java.lang.String>) strList49, "52 bytes");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lineIterator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(file25);
        org.junit.Assert.assertEquals(file25.getParent(), "hi!");
        org.junit.Assert.assertEquals(file25.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(file29);
        org.junit.Assert.assertEquals(file29.getParent(), "hi!");
        org.junit.Assert.assertEquals(file29.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(lineIterator33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertNotNull(strList49);
    }

    @Test
    @Disabled
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = false; // flaky: org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean9 = org.apache.commons.io.FileUtils.deleteQuietly(file7);
        boolean boolean11 = org.apache.commons.io.FileUtils.isFileNewer(file7, 0L);
        java.nio.charset.Charset charset12 = null;
        java.util.List<java.lang.String> strList13 = org.apache.commons.io.FileUtils.readLines(file7, charset12);
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file17 = org.apache.commons.io.FileUtils.getFile(strArray16);
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file21 = org.apache.commons.io.FileUtils.getFile(strArray20);
        boolean boolean22 = org.apache.commons.io.FileUtils.isFileOlder(file17, file21);
        java.lang.String str23 = org.apache.commons.io.FileUtils.readFileToString(file17);
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file27 = org.apache.commons.io.FileUtils.getFile(strArray26);
        java.io.File file28 = org.apache.commons.io.FileUtils.getFile(file17, strArray26);
        java.io.File file29 = org.apache.commons.io.FileUtils.getFile(file7, strArray26);
        boolean boolean30 = org.apache.commons.io.FileUtils.deleteQuietly(file29);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(file17);
        org.junit.Assert.assertEquals(file17.getParent(), "hi!");
        org.junit.Assert.assertEquals(file17.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(file21);
        org.junit.Assert.assertEquals(file21.getParent(), "hi!");
        org.junit.Assert.assertEquals(file21.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(file27);
        org.junit.Assert.assertEquals(file27.getParent(), "hi!");
        org.junit.Assert.assertEquals(file27.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(file28);
        org.junit.Assert.assertEquals(file28.getParent(), "hi!\\hi!\\hi!");
        org.junit.Assert.assertEquals(file28.toString(), "hi!\\hi!\\hi!\\hi!");
        org.junit.Assert.assertNotNull(file29);
        org.junit.Assert.assertEquals(file29.getParent(), "hi!\\hi!\\hi!");
        org.junit.Assert.assertEquals(file29.toString(), "hi!\\hi!\\hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    @Disabled
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = false; // flaky: org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean9 = org.apache.commons.io.FileUtils.deleteQuietly(file7);
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file13 = org.apache.commons.io.FileUtils.getFile(strArray12);
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file17 = org.apache.commons.io.FileUtils.getFile(strArray16);
        boolean boolean18 = org.apache.commons.io.FileUtils.isFileOlder(file13, file17);
        boolean boolean20 = org.apache.commons.io.FileUtils.waitFor(file17, (int) '4');
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file24 = org.apache.commons.io.FileUtils.getFile(strArray23);
        boolean boolean26 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file17, file24, "");
        org.apache.commons.io.LineIterator lineIterator27 = org.apache.commons.io.FileUtils.lineIterator(file17);
        org.apache.commons.io.FileUtils.writeStringToFile(file17, "C:\\Users\\Mathieu\\AppData\\Local\\Temp\\", false);
        java.nio.charset.Charset charset32 = null;
        org.apache.commons.io.FileUtils.write(file17, (java.lang.CharSequence) "", charset32, true);
        boolean boolean36 = org.apache.commons.io.FileUtils.waitFor(file17, 0);
        boolean boolean37 = org.apache.commons.io.FileUtils.isFileOlder(file7, file17);
        java.lang.Class<?> wildcardClass38 = file7.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(file13);
        org.junit.Assert.assertEquals(file13.getParent(), "hi!");
        org.junit.Assert.assertEquals(file13.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(file17);
        org.junit.Assert.assertEquals(file17.getParent(), "hi!");
        org.junit.Assert.assertEquals(file17.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(file24);
        org.junit.Assert.assertEquals(file24.getParent(), "hi!");
        org.junit.Assert.assertEquals(file24.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(lineIterator27);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    @Disabled
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        java.net.URL uRL0 = null;
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file4 = org.apache.commons.io.FileUtils.getFile(strArray3);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file8 = org.apache.commons.io.FileUtils.getFile(strArray7);
        boolean boolean9 = false; // flaky: org.apache.commons.io.FileUtils.isFileOlder(file4, file8);
        boolean boolean11 = org.apache.commons.io.FileUtils.waitFor(file8, (int) '4');
        org.apache.commons.io.LineIterator lineIterator12 = org.apache.commons.io.FileUtils.lineIterator(file8);
        boolean boolean13 = org.apache.commons.io.FileUtils.deleteQuietly(file8);
        org.apache.commons.io.FileUtils.write(file8, (java.lang.CharSequence) "hi!");
        java.nio.charset.Charset charset17 = null;
        org.apache.commons.io.FileUtils.write(file8, (java.lang.CharSequence) "", charset17, true);
        java.nio.charset.Charset charset21 = null;
        org.apache.commons.io.FileUtils.writeStringToFile(file8, "", charset21, false);
        long long24 = org.apache.commons.io.FileUtils.sizeOf(file8);
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file28 = org.apache.commons.io.FileUtils.getFile(strArray27);
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file32 = org.apache.commons.io.FileUtils.getFile(strArray31);
        boolean boolean33 = org.apache.commons.io.FileUtils.isFileOlder(file28, file32);
        boolean boolean35 = org.apache.commons.io.FileUtils.waitFor(file32, (int) '4');
        org.apache.commons.io.LineIterator lineIterator36 = org.apache.commons.io.FileUtils.lineIterator(file32);
        boolean boolean37 = org.apache.commons.io.FileUtils.deleteQuietly(file32);
        org.apache.commons.io.FileUtils.write(file32, (java.lang.CharSequence) "hi!");
        java.nio.charset.Charset charset41 = null;
        org.apache.commons.io.FileUtils.write(file32, (java.lang.CharSequence) "", charset41, true);
        java.nio.charset.Charset charset45 = null;
        org.apache.commons.io.FileUtils.writeStringToFile(file32, "", charset45, false);
        long long48 = org.apache.commons.io.FileUtils.sizeOf(file32);
        org.apache.commons.io.FileUtils.writeStringToFile(file32, "");
        boolean boolean52 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file8, file32, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.FileUtils.copyURLToFile(uRL0, file8, (int) (byte) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.net.URL.openConnection()\" because \"source\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(file4);
        org.junit.Assert.assertEquals(file4.getParent(), "hi!");
        org.junit.Assert.assertEquals(file4.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(file8);
        org.junit.Assert.assertEquals(file8.getParent(), "hi!");
        org.junit.Assert.assertEquals(file8.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(lineIterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(file28);
        org.junit.Assert.assertEquals(file28.getParent(), "hi!");
        org.junit.Assert.assertEquals(file28.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(file32);
        org.junit.Assert.assertEquals(file32.getParent(), "hi!");
        org.junit.Assert.assertEquals(file32.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(lineIterator36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    }

    @Test
    @Disabled
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        java.io.File file0 = org.apache.commons.io.FileUtils.getTempDirectory();
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file4 = org.apache.commons.io.FileUtils.getFile(strArray3);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file8 = org.apache.commons.io.FileUtils.getFile(strArray7);
        boolean boolean9 = false; // flaky: org.apache.commons.io.FileUtils.isFileOlder(file4, file8);
        boolean boolean11 = org.apache.commons.io.FileUtils.waitFor(file8, (int) '4');
        org.apache.commons.io.LineIterator lineIterator12 = org.apache.commons.io.FileUtils.lineIterator(file8);
        boolean boolean14 = org.apache.commons.io.FileUtils.isFileOlder(file8, (-1L));
        java.nio.charset.Charset charset15 = null;
        java.lang.String str16 = org.apache.commons.io.FileUtils.readFileToString(file8, charset15);
        java.io.FileOutputStream fileOutputStream18 = org.apache.commons.io.FileUtils.openOutputStream(file8, false);
        java.io.FileOutputStream fileOutputStream20 = org.apache.commons.io.FileUtils.openOutputStream(file8, true);
        boolean boolean21 = org.apache.commons.io.FileUtils.isFileOlder(file0, file8);
        java.io.FileInputStream fileInputStream22 = org.apache.commons.io.FileUtils.openInputStream(file8);
        org.apache.commons.io.filefilter.IOFileFilter iOFileFilter23 = null;
        org.apache.commons.io.filefilter.IOFileFilter iOFileFilter24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<java.io.File> fileItor25 = org.apache.commons.io.FileUtils.iterateFiles(file8, iOFileFilter23, iOFileFilter24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'directory' is not a directory: hi!\\hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(file0);
        org.junit.Assert.assertEquals(file0.getParent(), "C:\\Users\\Mathieu\\AppData\\Local");
        org.junit.Assert.assertEquals(file0.toString(), "C:\\Users\\Mathieu\\AppData\\Local\\Temp");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(file4);
        org.junit.Assert.assertEquals(file4.getParent(), "hi!");
        org.junit.Assert.assertEquals(file4.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(file8);
        org.junit.Assert.assertEquals(file8.getParent(), "hi!");
        org.junit.Assert.assertEquals(file8.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(lineIterator12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(fileOutputStream18);
        org.junit.Assert.assertNotNull(fileOutputStream20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(fileInputStream22);
    }

    @Test
    @Disabled
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        java.net.URL uRL0 = null;
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file4 = org.apache.commons.io.FileUtils.getFile(strArray3);
        java.lang.String[] strArray5 = new java.lang.String[] {};
        java.io.File file6 = org.apache.commons.io.FileUtils.getFile(strArray5);
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(file4, strArray5);
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file11 = org.apache.commons.io.FileUtils.getFile(strArray10);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file15 = org.apache.commons.io.FileUtils.getFile(strArray14);
        boolean boolean16 = false; // flaky: org.apache.commons.io.FileUtils.isFileOlder(file11, file15);
        boolean boolean18 = org.apache.commons.io.FileUtils.waitFor(file15, (int) '4');
        org.apache.commons.io.LineIterator lineIterator19 = org.apache.commons.io.FileUtils.lineIterator(file15);
        boolean boolean21 = org.apache.commons.io.FileUtils.isFileOlder(file15, (-1L));
        java.io.FileOutputStream fileOutputStream23 = org.apache.commons.io.FileUtils.openOutputStream(file15, false);
        long long24 = org.apache.commons.io.FileUtils.copyFile(file4, (java.io.OutputStream) fileOutputStream23);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.FileUtils.copyURLToFile(uRL0, file4, 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.net.URL.openConnection()\" because \"source\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(file4);
        org.junit.Assert.assertEquals(file4.getParent(), "hi!");
        org.junit.Assert.assertEquals(file4.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNull(file6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(file11);
        org.junit.Assert.assertEquals(file11.getParent(), "hi!");
        org.junit.Assert.assertEquals(file11.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(file15);
        org.junit.Assert.assertEquals(file15.getParent(), "hi!");
        org.junit.Assert.assertEquals(file15.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(lineIterator19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(fileOutputStream23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    @Disabled
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        java.io.File file0 = null;
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file4 = org.apache.commons.io.FileUtils.getFile(strArray3);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file8 = org.apache.commons.io.FileUtils.getFile(strArray7);
        boolean boolean9 = false; // flaky: org.apache.commons.io.FileUtils.isFileOlder(file4, file8);
        boolean boolean11 = org.apache.commons.io.FileUtils.waitFor(file8, (int) '4');
        org.apache.commons.io.LineIterator lineIterator12 = org.apache.commons.io.FileUtils.lineIterator(file8);
        boolean boolean14 = org.apache.commons.io.FileUtils.isFileOlder(file8, (-1L));
        java.nio.charset.Charset charset15 = null;
        java.lang.String str16 = org.apache.commons.io.FileUtils.readFileToString(file8, charset15);
        java.io.FileOutputStream fileOutputStream18 = org.apache.commons.io.FileUtils.openOutputStream(file8, false);
        org.apache.commons.io.LineIterator lineIterator19 = org.apache.commons.io.FileUtils.lineIterator(file8);
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file23 = org.apache.commons.io.FileUtils.getFile(strArray22);
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file27 = org.apache.commons.io.FileUtils.getFile(strArray26);
        boolean boolean28 = org.apache.commons.io.FileUtils.isFileOlder(file23, file27);
        boolean boolean30 = org.apache.commons.io.FileUtils.waitFor(file27, (int) '4');
        org.apache.commons.io.LineIterator lineIterator31 = org.apache.commons.io.FileUtils.lineIterator(file27);
        boolean boolean32 = org.apache.commons.io.FileUtils.deleteQuietly(file27);
        org.apache.commons.io.FileUtils.writeStringToFile(file27, "");
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file38 = org.apache.commons.io.FileUtils.getFile(strArray37);
        java.lang.String[] strArray41 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file42 = org.apache.commons.io.FileUtils.getFile(strArray41);
        boolean boolean43 = org.apache.commons.io.FileUtils.isFileOlder(file38, file42);
        boolean boolean45 = org.apache.commons.io.FileUtils.waitFor(file42, (int) '4');
        java.lang.String[] strArray48 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file49 = org.apache.commons.io.FileUtils.getFile(strArray48);
        boolean boolean51 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file42, file49, "");
        boolean boolean52 = org.apache.commons.io.FileUtils.isFileNewer(file27, file42);
        boolean boolean53 = org.apache.commons.io.FileUtils.contentEquals(file8, file27);
        boolean boolean54 = org.apache.commons.io.FileUtils.contentEquals(file0, file8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str56 = org.apache.commons.io.FileUtils.readFileToString(file0, "-1 bytes");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: -1 bytes");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(file4);
        org.junit.Assert.assertEquals(file4.getParent(), "hi!");
        org.junit.Assert.assertEquals(file4.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(file8);
        org.junit.Assert.assertEquals(file8.getParent(), "hi!");
        org.junit.Assert.assertEquals(file8.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(lineIterator12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(fileOutputStream18);
        org.junit.Assert.assertNotNull(lineIterator19);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(file23);
        org.junit.Assert.assertEquals(file23.getParent(), "hi!");
        org.junit.Assert.assertEquals(file23.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(file27);
        org.junit.Assert.assertEquals(file27.getParent(), "hi!");
        org.junit.Assert.assertEquals(file27.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(lineIterator31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(file38);
        org.junit.Assert.assertEquals(file38.getParent(), "hi!");
        org.junit.Assert.assertEquals(file38.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(file42);
        org.junit.Assert.assertEquals(file42.getParent(), "hi!");
        org.junit.Assert.assertEquals(file42.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(file49);
        org.junit.Assert.assertEquals(file49.getParent(), "hi!");
        org.junit.Assert.assertEquals(file49.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    @Disabled
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = false; // flaky: org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        org.apache.commons.io.LineIterator lineIterator11 = org.apache.commons.io.FileUtils.lineIterator(file7);
        boolean boolean12 = org.apache.commons.io.FileUtils.deleteQuietly(file7);
        org.apache.commons.io.FileUtils.writeStringToFile(file7, "");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file18 = org.apache.commons.io.FileUtils.getFile(strArray17);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file22 = org.apache.commons.io.FileUtils.getFile(strArray21);
        boolean boolean23 = org.apache.commons.io.FileUtils.isFileOlder(file18, file22);
        boolean boolean25 = org.apache.commons.io.FileUtils.waitFor(file22, (int) '4');
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file29 = org.apache.commons.io.FileUtils.getFile(strArray28);
        boolean boolean31 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file22, file29, "");
        boolean boolean32 = org.apache.commons.io.FileUtils.isFileNewer(file7, file22);
        java.io.FileOutputStream fileOutputStream33 = org.apache.commons.io.FileUtils.openOutputStream(file7);
        java.math.BigInteger bigInteger34 = org.apache.commons.io.FileUtils.sizeOfAsBigInteger(file7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.FileUtils.cleanDirectory(file7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!\\hi! is not a directory");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lineIterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(file18);
        org.junit.Assert.assertEquals(file18.getParent(), "hi!");
        org.junit.Assert.assertEquals(file18.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(file22);
        org.junit.Assert.assertEquals(file22.getParent(), "hi!");
        org.junit.Assert.assertEquals(file22.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(file29);
        org.junit.Assert.assertEquals(file29.getParent(), "hi!");
        org.junit.Assert.assertEquals(file29.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(fileOutputStream33);
        org.junit.Assert.assertNotNull(bigInteger34);
    }

    @Test
    @Disabled
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = false; // flaky: org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file14 = org.apache.commons.io.FileUtils.getFile(strArray13);
        boolean boolean16 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file7, file14, "");
        org.apache.commons.io.FileUtils.writeStringToFile(file7, "", false);
        org.apache.commons.io.FileUtils.forceDeleteOnExit(file7);
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file24 = org.apache.commons.io.FileUtils.getFile(strArray23);
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file28 = org.apache.commons.io.FileUtils.getFile(strArray27);
        boolean boolean29 = org.apache.commons.io.FileUtils.isFileOlder(file24, file28);
        boolean boolean31 = org.apache.commons.io.FileUtils.waitFor(file28, (int) '4');
        java.lang.String[] strArray34 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file35 = org.apache.commons.io.FileUtils.getFile(strArray34);
        boolean boolean37 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file28, file35, "");
        org.apache.commons.io.LineIterator lineIterator38 = org.apache.commons.io.FileUtils.lineIterator(file28);
        org.apache.commons.io.FileUtils.writeStringToFile(file28, "C:\\Users\\Mathieu\\AppData\\Local\\Temp\\", false);
        java.lang.String[] strArray44 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file45 = org.apache.commons.io.FileUtils.getFile(strArray44);
        java.lang.String[] strArray48 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file49 = org.apache.commons.io.FileUtils.getFile(strArray48);
        boolean boolean50 = org.apache.commons.io.FileUtils.isFileOlder(file45, file49);
        java.lang.String str51 = org.apache.commons.io.FileUtils.readFileToString(file45);
        java.lang.String[] strArray54 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file55 = org.apache.commons.io.FileUtils.getFile(strArray54);
        java.io.File file56 = org.apache.commons.io.FileUtils.getFile(file45, strArray54);
        boolean boolean58 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file28, file56, "-1 bytes");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.FileUtils.moveFile(file7, file56);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Destination 'hi!\\hi!\\hi!' directory cannot be created");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(file14);
        org.junit.Assert.assertEquals(file14.getParent(), "hi!");
        org.junit.Assert.assertEquals(file14.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(file24);
        org.junit.Assert.assertEquals(file24.getParent(), "hi!");
        org.junit.Assert.assertEquals(file24.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(file28);
        org.junit.Assert.assertEquals(file28.getParent(), "hi!");
        org.junit.Assert.assertEquals(file28.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(file35);
        org.junit.Assert.assertEquals(file35.getParent(), "hi!");
        org.junit.Assert.assertEquals(file35.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(lineIterator38);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(file45);
        org.junit.Assert.assertEquals(file45.getParent(), "hi!");
        org.junit.Assert.assertEquals(file45.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(file49);
        org.junit.Assert.assertEquals(file49.getParent(), "hi!");
        org.junit.Assert.assertEquals(file49.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "C:\\Users\\Mathieu\\AppData\\Local\\Temp\\" + "'", str51, "C:\\Users\\Mathieu\\AppData\\Local\\Temp\\");
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertNotNull(file55);
        org.junit.Assert.assertEquals(file55.getParent(), "hi!");
        org.junit.Assert.assertEquals(file55.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(file56);
        org.junit.Assert.assertEquals(file56.getParent(), "hi!\\hi!\\hi!");
        org.junit.Assert.assertEquals(file56.toString(), "hi!\\hi!\\hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    @Disabled
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.io.File file4 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.math.BigInteger bigInteger5 = null; // flaky: org.apache.commons.io.FileUtils.sizeOfAsBigInteger(file4);
        java.nio.charset.Charset charset6 = null;
        java.util.List<java.lang.String> strList7 = org.apache.commons.io.FileUtils.readLines(file4, charset6);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(file4);
        org.junit.Assert.assertEquals(file4.getParent(), "hi!");
        org.junit.Assert.assertEquals(file4.toString(), "hi!\\hi!");
// flaky:         org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    @Disabled
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.io.File file5 = org.apache.commons.io.FileUtils.getFile(strArray4);
        java.io.File file6 = org.apache.commons.io.FileUtils.getFile(file3, strArray4);
        java.util.zip.Checksum checksum7 = null;
        java.util.zip.Checksum checksum8 = null; // flaky: org.apache.commons.io.FileUtils.checksum(file3, checksum7);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(file5);
        org.junit.Assert.assertNotNull(file6);
        org.junit.Assert.assertEquals(file6.getParent(), "hi!");
        org.junit.Assert.assertEquals(file6.toString(), "hi!\\hi!");
        org.junit.Assert.assertNull(checksum8);
    }

    @Test
    @Disabled
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = false; // flaky: org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file14 = org.apache.commons.io.FileUtils.getFile(strArray13);
        boolean boolean16 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file7, file14, "");
        java.io.FileOutputStream fileOutputStream18 = org.apache.commons.io.FileUtils.openOutputStream(file7, false);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file22 = org.apache.commons.io.FileUtils.getFile(strArray21);
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file26 = org.apache.commons.io.FileUtils.getFile(strArray25);
        boolean boolean27 = org.apache.commons.io.FileUtils.isFileOlder(file22, file26);
        boolean boolean29 = org.apache.commons.io.FileUtils.waitFor(file26, (int) '4');
        org.apache.commons.io.LineIterator lineIterator30 = org.apache.commons.io.FileUtils.lineIterator(file26);
        boolean boolean31 = org.apache.commons.io.FileUtils.deleteQuietly(file26);
        org.apache.commons.io.FileUtils.write(file26, (java.lang.CharSequence) "hi!");
        java.nio.charset.Charset charset35 = null;
        org.apache.commons.io.FileUtils.write(file26, (java.lang.CharSequence) "", charset35, true);
        java.nio.charset.Charset charset39 = null;
        org.apache.commons.io.FileUtils.writeStringToFile(file26, "", charset39, false);
        long long42 = org.apache.commons.io.FileUtils.sizeOf(file26);
        java.lang.String[] strArray45 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file46 = org.apache.commons.io.FileUtils.getFile(strArray45);
        java.lang.String[] strArray49 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file50 = org.apache.commons.io.FileUtils.getFile(strArray49);
        boolean boolean51 = org.apache.commons.io.FileUtils.isFileOlder(file46, file50);
        boolean boolean53 = org.apache.commons.io.FileUtils.waitFor(file50, (int) '4');
        org.apache.commons.io.LineIterator lineIterator54 = org.apache.commons.io.FileUtils.lineIterator(file50);
        boolean boolean55 = org.apache.commons.io.FileUtils.deleteQuietly(file50);
        org.apache.commons.io.FileUtils.write(file50, (java.lang.CharSequence) "hi!");
        java.nio.charset.Charset charset59 = null;
        org.apache.commons.io.FileUtils.write(file50, (java.lang.CharSequence) "", charset59, true);
        java.nio.charset.Charset charset63 = null;
        org.apache.commons.io.FileUtils.writeStringToFile(file50, "", charset63, false);
        long long66 = org.apache.commons.io.FileUtils.sizeOf(file50);
        org.apache.commons.io.FileUtils.writeStringToFile(file50, "");
        boolean boolean70 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file26, file50, "hi!");
        boolean boolean72 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file7, file50, "-1 bytes");
        boolean boolean74 = org.apache.commons.io.FileUtils.waitFor(file7, 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.FileUtils.writeStringToFile(file7, "1 GB", "");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(file14);
        org.junit.Assert.assertEquals(file14.getParent(), "hi!");
        org.junit.Assert.assertEquals(file14.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(fileOutputStream18);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(file22);
        org.junit.Assert.assertEquals(file22.getParent(), "hi!");
        org.junit.Assert.assertEquals(file22.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(file26);
        org.junit.Assert.assertEquals(file26.getParent(), "hi!");
        org.junit.Assert.assertEquals(file26.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(lineIterator30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(file46);
        org.junit.Assert.assertEquals(file46.getParent(), "hi!");
        org.junit.Assert.assertEquals(file46.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(file50);
        org.junit.Assert.assertEquals(file50.getParent(), "hi!");
        org.junit.Assert.assertEquals(file50.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(lineIterator54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 0L + "'", long66 == 0L);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
    }

    @Test
    @Disabled
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = false; // flaky: org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        java.lang.String str9 = org.apache.commons.io.FileUtils.readFileToString(file3);
        boolean boolean10 = org.apache.commons.io.FileUtils.isSymlink(file3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList12 = org.apache.commons.io.FileUtils.readLines(file3, "-1 bytes1 GB1048576 EB1 GBC:\\Users\\Mathieu\\AppData\\Local\\Temp\\1 GBC:\\Users\\Mathieu1 GB1 GB1048576 EB1 GB");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: -1 bytes1 GB1048576 EB1 GBC:\\Users\\Mathieu\\AppData\\Local\\Temp\\1 GBC:\\Users\\Mathieu1 GB1 GB1048576 EB1 GB");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    @Disabled
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = false; // flaky: org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        org.apache.commons.io.LineIterator lineIterator11 = org.apache.commons.io.FileUtils.lineIterator(file7);
        boolean boolean13 = org.apache.commons.io.FileUtils.isFileOlder(file7, (-1L));
        long long14 = org.apache.commons.io.FileUtils.sizeOf(file7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.FileUtils.writeStringToFile(file7, "32 bytes", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lineIterator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    @Disabled
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = false; // flaky: org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        org.apache.commons.io.LineIterator lineIterator11 = org.apache.commons.io.FileUtils.lineIterator(file7);
        boolean boolean12 = org.apache.commons.io.FileUtils.deleteQuietly(file7);
        org.apache.commons.io.FileUtils.write(file7, (java.lang.CharSequence) "hi!");
        java.nio.charset.Charset charset16 = null;
        org.apache.commons.io.FileUtils.write(file7, (java.lang.CharSequence) "", charset16, true);
        java.nio.charset.Charset charset20 = null;
        org.apache.commons.io.FileUtils.writeStringToFile(file7, "", charset20, false);
        long long23 = org.apache.commons.io.FileUtils.sizeOf(file7);
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file27 = org.apache.commons.io.FileUtils.getFile(strArray26);
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file31 = org.apache.commons.io.FileUtils.getFile(strArray30);
        boolean boolean32 = org.apache.commons.io.FileUtils.isFileOlder(file27, file31);
        boolean boolean34 = org.apache.commons.io.FileUtils.waitFor(file31, (int) '4');
        org.apache.commons.io.LineIterator lineIterator35 = org.apache.commons.io.FileUtils.lineIterator(file31);
        boolean boolean36 = org.apache.commons.io.FileUtils.deleteQuietly(file31);
        org.apache.commons.io.FileUtils.write(file31, (java.lang.CharSequence) "hi!");
        java.nio.charset.Charset charset40 = null;
        org.apache.commons.io.FileUtils.write(file31, (java.lang.CharSequence) "", charset40, true);
        java.nio.charset.Charset charset44 = null;
        org.apache.commons.io.FileUtils.writeStringToFile(file31, "", charset44, false);
        long long47 = org.apache.commons.io.FileUtils.sizeOf(file31);
        org.apache.commons.io.FileUtils.writeStringToFile(file31, "");
        boolean boolean51 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file7, file31, "hi!");
        java.io.FileInputStream fileInputStream52 = org.apache.commons.io.FileUtils.openInputStream(file7);
        java.io.FileOutputStream fileOutputStream53 = org.apache.commons.io.FileUtils.openOutputStream(file7);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lineIterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(file27);
        org.junit.Assert.assertEquals(file27.getParent(), "hi!");
        org.junit.Assert.assertEquals(file27.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(file31);
        org.junit.Assert.assertEquals(file31.getParent(), "hi!");
        org.junit.Assert.assertEquals(file31.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(lineIterator35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(fileInputStream52);
        org.junit.Assert.assertNotNull(fileOutputStream53);
    }

    @Test
    @Disabled
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = false; // flaky: org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file14 = org.apache.commons.io.FileUtils.getFile(strArray13);
        boolean boolean16 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file7, file14, "");
        boolean boolean18 = org.apache.commons.io.FileUtils.waitFor(file14, (int) (byte) 0);
        org.apache.commons.io.FileUtils.writeStringToFile(file14, "hi!\000\000d\001", false);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(file14);
        org.junit.Assert.assertEquals(file14.getParent(), "hi!");
        org.junit.Assert.assertEquals(file14.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    @Disabled
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = false; // flaky: org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file14 = org.apache.commons.io.FileUtils.getFile(strArray13);
        boolean boolean16 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file7, file14, "");
        java.io.FileOutputStream fileOutputStream18 = org.apache.commons.io.FileUtils.openOutputStream(file7, false);
        java.util.zip.Checksum checksum19 = null;
        java.util.zip.Checksum checksum20 = org.apache.commons.io.FileUtils.checksum(file7, checksum19);
        java.util.Date date21 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = org.apache.commons.io.FileUtils.isFileOlder(file7, date21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No specified date");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(file14);
        org.junit.Assert.assertEquals(file14.getParent(), "hi!");
        org.junit.Assert.assertEquals(file14.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(fileOutputStream18);
        org.junit.Assert.assertNull(checksum20);
    }

    @Test
    @Disabled
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = false; // flaky: org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean9 = org.apache.commons.io.FileUtils.deleteQuietly(file7);
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file13 = org.apache.commons.io.FileUtils.getFile(strArray12);
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file17 = org.apache.commons.io.FileUtils.getFile(strArray16);
        boolean boolean18 = org.apache.commons.io.FileUtils.isFileOlder(file13, file17);
        boolean boolean20 = org.apache.commons.io.FileUtils.waitFor(file17, (int) '4');
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file24 = org.apache.commons.io.FileUtils.getFile(strArray23);
        boolean boolean26 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file17, file24, "");
        org.apache.commons.io.LineIterator lineIterator27 = org.apache.commons.io.FileUtils.lineIterator(file17);
        org.apache.commons.io.FileUtils.writeStringToFile(file17, "C:\\Users\\Mathieu\\AppData\\Local\\Temp\\", false);
        java.nio.charset.Charset charset32 = null;
        org.apache.commons.io.FileUtils.write(file17, (java.lang.CharSequence) "", charset32, true);
        boolean boolean36 = org.apache.commons.io.FileUtils.waitFor(file17, 0);
        boolean boolean37 = org.apache.commons.io.FileUtils.isFileOlder(file7, file17);
        boolean boolean39 = org.apache.commons.io.FileUtils.isFileOlder(file7, 1024L);
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file43 = org.apache.commons.io.FileUtils.getFile(strArray42);
        java.lang.String[] strArray46 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file47 = org.apache.commons.io.FileUtils.getFile(strArray46);
        boolean boolean48 = org.apache.commons.io.FileUtils.isFileOlder(file43, file47);
        java.lang.String[] strArray51 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file52 = org.apache.commons.io.FileUtils.getFile(strArray51);
        java.lang.String[] strArray55 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file56 = org.apache.commons.io.FileUtils.getFile(strArray55);
        boolean boolean57 = org.apache.commons.io.FileUtils.isFileOlder(file52, file56);
        boolean boolean59 = org.apache.commons.io.FileUtils.waitFor(file56, (int) '4');
        java.lang.String[] strArray62 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file63 = org.apache.commons.io.FileUtils.getFile(strArray62);
        boolean boolean65 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file56, file63, "");
        org.apache.commons.io.LineIterator lineIterator66 = org.apache.commons.io.FileUtils.lineIterator(file56);
        org.apache.commons.io.FileUtils.writeStringToFile(file56, "C:\\Users\\Mathieu\\AppData\\Local\\Temp\\", false);
        java.nio.charset.Charset charset71 = null;
        org.apache.commons.io.FileUtils.write(file56, (java.lang.CharSequence) "", charset71, true);
        boolean boolean75 = org.apache.commons.io.FileUtils.waitFor(file56, 0);
        java.nio.charset.Charset charset76 = null;
        java.lang.String str77 = org.apache.commons.io.FileUtils.readFileToString(file56, charset76);
        long long78 = org.apache.commons.io.FileUtils.checksumCRC32(file56);
        boolean boolean79 = org.apache.commons.io.FileUtils.isFileOlder(file43, file56);
        boolean boolean80 = org.apache.commons.io.FileUtils.isFileNewer(file7, file43);
        java.lang.String[] strArray84 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file85 = org.apache.commons.io.FileUtils.getFile(strArray84);
        java.lang.String[] strArray88 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file89 = org.apache.commons.io.FileUtils.getFile(strArray88);
        boolean boolean90 = org.apache.commons.io.FileUtils.isFileOlder(file85, file89);
        boolean boolean91 = org.apache.commons.io.FileUtils.deleteQuietly(file89);
        boolean boolean93 = org.apache.commons.io.FileUtils.isFileNewer(file89, 0L);
        java.nio.charset.Charset charset94 = null;
        java.util.List<java.lang.String> strList95 = org.apache.commons.io.FileUtils.readLines(file89, charset94);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.FileUtils.writeLines(file7, "1048576 EB", (java.util.Collection<java.lang.String>) strList95, "C:\\Users\\Mathieu\\AppData\\Local\\Temp\\\r\n\r\n", true);
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: 1048576 EB");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(file13);
        org.junit.Assert.assertEquals(file13.getParent(), "hi!");
        org.junit.Assert.assertEquals(file13.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(file17);
        org.junit.Assert.assertEquals(file17.getParent(), "hi!");
        org.junit.Assert.assertEquals(file17.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(file24);
        org.junit.Assert.assertEquals(file24.getParent(), "hi!");
        org.junit.Assert.assertEquals(file24.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(lineIterator27);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(file43);
        org.junit.Assert.assertEquals(file43.getParent(), "hi!");
        org.junit.Assert.assertEquals(file43.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(file47);
        org.junit.Assert.assertEquals(file47.getParent(), "hi!");
        org.junit.Assert.assertEquals(file47.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(file52);
        org.junit.Assert.assertEquals(file52.getParent(), "hi!");
        org.junit.Assert.assertEquals(file52.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(file56);
        org.junit.Assert.assertEquals(file56.getParent(), "hi!");
        org.junit.Assert.assertEquals(file56.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertNotNull(file63);
        org.junit.Assert.assertEquals(file63.getParent(), "hi!");
        org.junit.Assert.assertEquals(file63.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(lineIterator66);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "C:\\Users\\Mathieu\\AppData\\Local\\Temp\\" + "'", str77, "C:\\Users\\Mathieu\\AppData\\Local\\Temp\\");
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 4154702209L + "'", long78 == 4154702209L);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertNotNull(file85);
        org.junit.Assert.assertEquals(file85.getParent(), "hi!");
        org.junit.Assert.assertEquals(file85.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray88);
        org.junit.Assert.assertNotNull(file89);
        org.junit.Assert.assertEquals(file89.getParent(), "hi!");
        org.junit.Assert.assertEquals(file89.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertNotNull(strList95);
    }

    @Test
    @Disabled
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.io.File file5 = org.apache.commons.io.FileUtils.getFile(strArray4);
        java.io.File file6 = org.apache.commons.io.FileUtils.getFile(file3, strArray4);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileNewer(file3, (-1L));
        java.nio.charset.Charset charset10 = null;
        org.apache.commons.io.FileUtils.write(file3, (java.lang.CharSequence) "-1 bytes1 GB1048576 EB1 GBC:\\Users\\Mathieu\\AppData\\Local\\Temp\\1 GBC:\\Users\\Mathieu1 GB1 GB1048576 EB1 GB", charset10, true);
        org.apache.commons.io.filefilter.IOFileFilter iOFileFilter13 = null;
        org.apache.commons.io.filefilter.IOFileFilter iOFileFilter14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.io.File> fileCollection15 = org.apache.commons.io.FileUtils.listFilesAndDirs(file3, iOFileFilter13, iOFileFilter14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'directory' is not a directory: hi!\\hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(file5);
        org.junit.Assert.assertNotNull(file6);
        org.junit.Assert.assertEquals(file6.getParent(), "hi!");
        org.junit.Assert.assertEquals(file6.toString(), "hi!\\hi!");
// flaky:         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file14 = org.apache.commons.io.FileUtils.getFile(strArray13);
        boolean boolean16 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file7, file14, "");
        org.apache.commons.io.LineIterator lineIterator17 = org.apache.commons.io.FileUtils.lineIterator(file7);
        org.apache.commons.io.FileUtils.writeStringToFile(file7, "C:\\Users\\Mathieu\\AppData\\Local\\Temp\\", false);
        boolean boolean22 = org.apache.commons.io.FileUtils.isFileOlder(file7, (long) (short) 0);
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file26 = org.apache.commons.io.FileUtils.getFile(strArray25);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file30 = org.apache.commons.io.FileUtils.getFile(strArray29);
        boolean boolean31 = org.apache.commons.io.FileUtils.isFileOlder(file26, file30);
        boolean boolean33 = org.apache.commons.io.FileUtils.waitFor(file30, (int) '4');
        org.apache.commons.io.LineIterator lineIterator34 = org.apache.commons.io.FileUtils.lineIterator(file30);
        boolean boolean35 = org.apache.commons.io.FileUtils.deleteQuietly(file30);
        org.apache.commons.io.FileUtils.writeStringToFile(file30, "");
        java.lang.String[] strArray40 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file41 = org.apache.commons.io.FileUtils.getFile(strArray40);
        java.lang.String[] strArray44 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file45 = org.apache.commons.io.FileUtils.getFile(strArray44);
        boolean boolean46 = org.apache.commons.io.FileUtils.isFileOlder(file41, file45);
        boolean boolean48 = org.apache.commons.io.FileUtils.waitFor(file45, (int) '4');
        java.lang.String[] strArray51 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file52 = org.apache.commons.io.FileUtils.getFile(strArray51);
        boolean boolean54 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file45, file52, "");
        boolean boolean55 = org.apache.commons.io.FileUtils.isFileNewer(file30, file45);
        java.io.FileOutputStream fileOutputStream56 = org.apache.commons.io.FileUtils.openOutputStream(file30);
        long long57 = org.apache.commons.io.FileUtils.copyFile(file7, (java.io.OutputStream) fileOutputStream56);
        java.lang.String[] strArray60 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file61 = org.apache.commons.io.FileUtils.getFile(strArray60);
        java.lang.String[] strArray64 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file65 = org.apache.commons.io.FileUtils.getFile(strArray64);
        boolean boolean66 = org.apache.commons.io.FileUtils.isFileOlder(file61, file65);
        boolean boolean68 = org.apache.commons.io.FileUtils.waitFor(file65, (int) '4');
        org.apache.commons.io.LineIterator lineIterator69 = org.apache.commons.io.FileUtils.lineIterator(file65);
        boolean boolean71 = org.apache.commons.io.FileUtils.isFileOlder(file65, (-1L));
        long long72 = org.apache.commons.io.FileUtils.sizeOf(file65);
        java.io.File file73 = org.apache.commons.io.FileUtils.getUserDirectory();
        org.apache.commons.io.FileUtils.copyFileToDirectory(file65, file73, true);
        org.apache.commons.io.FileUtils.write(file65, (java.lang.CharSequence) "hi!", true);
        byte[] byteArray79 = org.apache.commons.io.FileUtils.readFileToByteArray(file65);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.FileUtils.writeByteArrayToFile(file7, byteArray79, (int) (byte) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(file14);
        org.junit.Assert.assertEquals(file14.getParent(), "hi!");
        org.junit.Assert.assertEquals(file14.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(lineIterator17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(file26);
        org.junit.Assert.assertEquals(file26.getParent(), "hi!");
        org.junit.Assert.assertEquals(file26.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(file30);
        org.junit.Assert.assertEquals(file30.getParent(), "hi!");
        org.junit.Assert.assertEquals(file30.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(lineIterator34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(file41);
        org.junit.Assert.assertEquals(file41.getParent(), "hi!");
        org.junit.Assert.assertEquals(file41.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(file45);
        org.junit.Assert.assertEquals(file45.getParent(), "hi!");
        org.junit.Assert.assertEquals(file45.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(file52);
        org.junit.Assert.assertEquals(file52.getParent(), "hi!");
        org.junit.Assert.assertEquals(file52.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(fileOutputStream56);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertNotNull(file61);
        org.junit.Assert.assertEquals(file61.getParent(), "hi!");
        org.junit.Assert.assertEquals(file61.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertNotNull(file65);
        org.junit.Assert.assertEquals(file65.getParent(), "hi!");
        org.junit.Assert.assertEquals(file65.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(lineIterator69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 0L + "'", long72 == 0L);
        org.junit.Assert.assertNotNull(file73);
        org.junit.Assert.assertEquals(file73.getParent(), "C:\\Users");
        org.junit.Assert.assertEquals(file73.toString(), "C:\\Users\\Mathieu");
        org.junit.Assert.assertNotNull(byteArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray79), "[104, 105, 33]");
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        org.apache.commons.io.LineIterator lineIterator11 = org.apache.commons.io.FileUtils.lineIterator(file7);
        boolean boolean12 = org.apache.commons.io.FileUtils.deleteQuietly(file7);
        java.io.FileOutputStream fileOutputStream13 = org.apache.commons.io.FileUtils.openOutputStream(file7);
        java.io.FileInputStream fileInputStream14 = org.apache.commons.io.FileUtils.openInputStream(file7);
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file18 = org.apache.commons.io.FileUtils.getFile(strArray17);
        org.apache.commons.io.FileUtils.copyToFile((java.io.InputStream) fileInputStream14, file18);
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file23 = org.apache.commons.io.FileUtils.getFile(strArray22);
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file27 = org.apache.commons.io.FileUtils.getFile(strArray26);
        boolean boolean28 = org.apache.commons.io.FileUtils.isFileOlder(file23, file27);
        boolean boolean30 = org.apache.commons.io.FileUtils.waitFor(file27, (int) '4');
        org.apache.commons.io.LineIterator lineIterator31 = org.apache.commons.io.FileUtils.lineIterator(file27);
        boolean boolean33 = org.apache.commons.io.FileUtils.isFileOlder(file27, (-1L));
        long long34 = org.apache.commons.io.FileUtils.sizeOf(file27);
        java.io.File file35 = org.apache.commons.io.FileUtils.getUserDirectory();
        org.apache.commons.io.FileUtils.copyFileToDirectory(file27, file35, true);
        org.apache.commons.io.FileUtils.write(file27, (java.lang.CharSequence) "hi!", true);
        org.apache.commons.io.FileUtils.copyInputStreamToFile((java.io.InputStream) fileInputStream14, file27);
        java.lang.String[] strArray45 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file46 = org.apache.commons.io.FileUtils.getFile(strArray45);
        java.lang.String[] strArray49 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file50 = org.apache.commons.io.FileUtils.getFile(strArray49);
        boolean boolean51 = org.apache.commons.io.FileUtils.isFileOlder(file46, file50);
        java.lang.String str52 = org.apache.commons.io.FileUtils.readFileToString(file46);
        java.nio.charset.Charset charset53 = null;
        java.lang.String str54 = org.apache.commons.io.FileUtils.readFileToString(file46, charset53);
        java.math.BigInteger bigInteger55 = org.apache.commons.io.FileUtils.sizeOfAsBigInteger(file46);
        java.nio.charset.Charset charset56 = null;
        java.util.List<java.lang.String> strList57 = org.apache.commons.io.FileUtils.readLines(file46, charset56);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.FileUtils.writeLines(file27, "1 PB", (java.util.Collection<java.lang.String>) strList57);
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: 1 PB");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lineIterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(fileOutputStream13);
        org.junit.Assert.assertNotNull(fileInputStream14);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(file18);
        org.junit.Assert.assertEquals(file18.getParent(), "hi!");
        org.junit.Assert.assertEquals(file18.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(file23);
        org.junit.Assert.assertEquals(file23.getParent(), "hi!");
        org.junit.Assert.assertEquals(file23.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(file27);
        org.junit.Assert.assertEquals(file27.getParent(), "hi!");
        org.junit.Assert.assertEquals(file27.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(lineIterator31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(file35);
        org.junit.Assert.assertEquals(file35.getParent(), "C:\\Users");
        org.junit.Assert.assertEquals(file35.toString(), "C:\\Users\\Mathieu");
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(file46);
        org.junit.Assert.assertEquals(file46.getParent(), "hi!");
        org.junit.Assert.assertEquals(file46.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(file50);
        org.junit.Assert.assertEquals(file50.getParent(), "hi!");
        org.junit.Assert.assertEquals(file50.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(bigInteger55);
        org.junit.Assert.assertNotNull(strList57);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        org.apache.commons.io.LineIterator lineIterator11 = org.apache.commons.io.FileUtils.lineIterator(file7);
        boolean boolean12 = org.apache.commons.io.FileUtils.deleteQuietly(file7);
        org.apache.commons.io.FileUtils.write(file7, (java.lang.CharSequence) "hi!");
        java.nio.charset.Charset charset16 = null;
        org.apache.commons.io.FileUtils.write(file7, (java.lang.CharSequence) "", charset16, true);
        byte[] byteArray19 = org.apache.commons.io.FileUtils.readFileToByteArray(file7);
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file23 = org.apache.commons.io.FileUtils.getFile(strArray22);
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file27 = org.apache.commons.io.FileUtils.getFile(strArray26);
        boolean boolean28 = org.apache.commons.io.FileUtils.isFileOlder(file23, file27);
        boolean boolean30 = org.apache.commons.io.FileUtils.waitFor(file27, (int) '4');
        org.apache.commons.io.LineIterator lineIterator31 = org.apache.commons.io.FileUtils.lineIterator(file27);
        boolean boolean32 = org.apache.commons.io.FileUtils.deleteQuietly(file27);
        org.apache.commons.io.FileUtils.write(file27, (java.lang.CharSequence) "hi!");
        java.nio.charset.Charset charset36 = null;
        org.apache.commons.io.FileUtils.write(file27, (java.lang.CharSequence) "", charset36, true);
        java.nio.charset.Charset charset40 = null;
        org.apache.commons.io.FileUtils.writeStringToFile(file27, "", charset40, false);
        boolean boolean43 = org.apache.commons.io.FileUtils.isFileNewer(file7, file27);
        java.lang.String[] strArray46 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file47 = org.apache.commons.io.FileUtils.getFile(strArray46);
        java.lang.String[] strArray50 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file51 = org.apache.commons.io.FileUtils.getFile(strArray50);
        boolean boolean52 = org.apache.commons.io.FileUtils.isFileOlder(file47, file51);
        boolean boolean54 = org.apache.commons.io.FileUtils.waitFor(file51, (int) '4');
        org.apache.commons.io.LineIterator lineIterator55 = org.apache.commons.io.FileUtils.lineIterator(file51);
        boolean boolean56 = org.apache.commons.io.FileUtils.deleteQuietly(file51);
        org.apache.commons.io.FileUtils.write(file51, (java.lang.CharSequence) "hi!");
        java.nio.charset.Charset charset60 = null;
        org.apache.commons.io.FileUtils.write(file51, (java.lang.CharSequence) "", charset60, true);
        byte[] byteArray63 = org.apache.commons.io.FileUtils.readFileToByteArray(file51);
        org.apache.commons.io.FileUtils.writeByteArrayToFile(file7, byteArray63);
        java.lang.String[] strArray67 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file68 = org.apache.commons.io.FileUtils.getFile(strArray67);
        java.lang.String[] strArray71 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file72 = org.apache.commons.io.FileUtils.getFile(strArray71);
        boolean boolean73 = org.apache.commons.io.FileUtils.isFileOlder(file68, file72);
        boolean boolean75 = org.apache.commons.io.FileUtils.waitFor(file72, (int) '4');
        org.apache.commons.io.LineIterator lineIterator76 = org.apache.commons.io.FileUtils.lineIterator(file72);
        boolean boolean77 = org.apache.commons.io.FileUtils.deleteQuietly(file72);
        boolean boolean78 = org.apache.commons.io.FileUtils.isFileNewer(file7, file72);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.FileUtils.forceMkdir(file72);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: File hi!\\hi! exists and is not a directory. Unable to create directory.");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lineIterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[104, 105, 33]");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(file23);
        org.junit.Assert.assertEquals(file23.getParent(), "hi!");
        org.junit.Assert.assertEquals(file23.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(file27);
        org.junit.Assert.assertEquals(file27.getParent(), "hi!");
        org.junit.Assert.assertEquals(file27.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(lineIterator31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(file47);
        org.junit.Assert.assertEquals(file47.getParent(), "hi!");
        org.junit.Assert.assertEquals(file47.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(file51);
        org.junit.Assert.assertEquals(file51.getParent(), "hi!");
        org.junit.Assert.assertEquals(file51.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(lineIterator55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray63), "[104, 105, 33]");
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertNotNull(file68);
        org.junit.Assert.assertEquals(file68.getParent(), "hi!");
        org.junit.Assert.assertEquals(file68.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertNotNull(file72);
        org.junit.Assert.assertEquals(file72.getParent(), "hi!");
        org.junit.Assert.assertEquals(file72.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(lineIterator76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file11 = org.apache.commons.io.FileUtils.getFile(strArray10);
        boolean boolean12 = org.apache.commons.io.FileUtils.isFileOlder(file7, file11);
        boolean boolean14 = org.apache.commons.io.FileUtils.waitFor(file11, (int) '4');
        org.apache.commons.io.LineIterator lineIterator15 = org.apache.commons.io.FileUtils.lineIterator(file11);
        boolean boolean16 = org.apache.commons.io.FileUtils.deleteQuietly(file11);
        org.apache.commons.io.FileUtils.write(file11, (java.lang.CharSequence) "hi!");
        java.nio.charset.Charset charset20 = null;
        org.apache.commons.io.FileUtils.write(file11, (java.lang.CharSequence) "", charset20, true);
        boolean boolean23 = org.apache.commons.io.FileUtils.contentEquals(file3, file11);
        org.apache.commons.io.filefilter.IOFileFilter iOFileFilter24 = null;
        org.apache.commons.io.filefilter.IOFileFilter iOFileFilter25 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<java.io.File> fileItor26 = org.apache.commons.io.FileUtils.iterateFiles(file3, iOFileFilter24, iOFileFilter25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'directory' is not a directory: hi!\\hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(file11);
        org.junit.Assert.assertEquals(file11.getParent(), "hi!");
        org.junit.Assert.assertEquals(file11.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(lineIterator15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        org.apache.commons.io.LineIterator lineIterator11 = org.apache.commons.io.FileUtils.lineIterator(file7);
        boolean boolean12 = org.apache.commons.io.FileUtils.deleteQuietly(file7);
        org.apache.commons.io.FileUtils.write(file7, (java.lang.CharSequence) "hi!");
        java.nio.charset.Charset charset16 = null;
        org.apache.commons.io.FileUtils.write(file7, (java.lang.CharSequence) "", charset16, true);
        java.nio.charset.Charset charset20 = null;
        org.apache.commons.io.FileUtils.writeStringToFile(file7, "", charset20, false);
        long long23 = org.apache.commons.io.FileUtils.sizeOf(file7);
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file27 = org.apache.commons.io.FileUtils.getFile(strArray26);
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file31 = org.apache.commons.io.FileUtils.getFile(strArray30);
        boolean boolean32 = org.apache.commons.io.FileUtils.isFileOlder(file27, file31);
        boolean boolean34 = org.apache.commons.io.FileUtils.waitFor(file31, (int) '4');
        org.apache.commons.io.LineIterator lineIterator35 = org.apache.commons.io.FileUtils.lineIterator(file31);
        boolean boolean36 = org.apache.commons.io.FileUtils.deleteQuietly(file31);
        org.apache.commons.io.FileUtils.write(file31, (java.lang.CharSequence) "hi!");
        java.nio.charset.Charset charset40 = null;
        org.apache.commons.io.FileUtils.write(file31, (java.lang.CharSequence) "", charset40, true);
        java.nio.charset.Charset charset44 = null;
        org.apache.commons.io.FileUtils.writeStringToFile(file31, "", charset44, false);
        long long47 = org.apache.commons.io.FileUtils.sizeOf(file31);
        org.apache.commons.io.FileUtils.writeStringToFile(file31, "");
        boolean boolean51 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file7, file31, "hi!");
        java.io.FileInputStream fileInputStream52 = org.apache.commons.io.FileUtils.openInputStream(file7);
        java.lang.String[] strArray55 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file56 = org.apache.commons.io.FileUtils.getFile(strArray55);
        java.lang.String[] strArray59 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file60 = org.apache.commons.io.FileUtils.getFile(strArray59);
        boolean boolean61 = org.apache.commons.io.FileUtils.isFileOlder(file56, file60);
        boolean boolean63 = org.apache.commons.io.FileUtils.waitFor(file60, (int) '4');
        org.apache.commons.io.LineIterator lineIterator64 = org.apache.commons.io.FileUtils.lineIterator(file60);
        boolean boolean65 = org.apache.commons.io.FileUtils.deleteQuietly(file60);
        org.apache.commons.io.FileUtils.write(file60, (java.lang.CharSequence) "hi!");
        java.nio.charset.Charset charset69 = null;
        org.apache.commons.io.FileUtils.write(file60, (java.lang.CharSequence) "", charset69, true);
        byte[] byteArray72 = org.apache.commons.io.FileUtils.readFileToByteArray(file60);
        boolean boolean74 = org.apache.commons.io.FileUtils.waitFor(file60, (int) 'a');
        org.apache.commons.io.FileUtils.copyInputStreamToFile((java.io.InputStream) fileInputStream52, file60);
        java.nio.charset.Charset charset77 = null;
        org.apache.commons.io.FileUtils.write(file60, (java.lang.CharSequence) "\000\000d\001", charset77, false);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lineIterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(file27);
        org.junit.Assert.assertEquals(file27.getParent(), "hi!");
        org.junit.Assert.assertEquals(file27.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(file31);
        org.junit.Assert.assertEquals(file31.getParent(), "hi!");
        org.junit.Assert.assertEquals(file31.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(lineIterator35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(fileInputStream52);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(file56);
        org.junit.Assert.assertEquals(file56.getParent(), "hi!");
        org.junit.Assert.assertEquals(file56.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertNotNull(file60);
        org.junit.Assert.assertEquals(file60.getParent(), "hi!");
        org.junit.Assert.assertEquals(file60.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(lineIterator64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[104, 105, 33]");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        java.lang.String str9 = org.apache.commons.io.FileUtils.readFileToString(file3);
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file13 = org.apache.commons.io.FileUtils.getFile(strArray12);
        java.io.File file14 = org.apache.commons.io.FileUtils.getFile(file3, strArray12);
        java.util.Date date15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = org.apache.commons.io.FileUtils.isFileNewer(file14, date15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No specified date");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\000d\001" + "'", str9, "\000\000d\001");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(file13);
        org.junit.Assert.assertEquals(file13.getParent(), "hi!");
        org.junit.Assert.assertEquals(file13.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(file14);
        org.junit.Assert.assertEquals(file14.getParent(), "hi!\\hi!\\hi!");
        org.junit.Assert.assertEquals(file14.toString(), "hi!\\hi!\\hi!\\hi!");
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        org.apache.commons.io.LineIterator lineIterator11 = org.apache.commons.io.FileUtils.lineIterator(file7);
        boolean boolean12 = org.apache.commons.io.FileUtils.deleteQuietly(file7);
        org.apache.commons.io.FileUtils.writeStringToFile(file7, "");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file18 = org.apache.commons.io.FileUtils.getFile(strArray17);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file22 = org.apache.commons.io.FileUtils.getFile(strArray21);
        boolean boolean23 = org.apache.commons.io.FileUtils.isFileOlder(file18, file22);
        boolean boolean25 = org.apache.commons.io.FileUtils.waitFor(file22, (int) '4');
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file29 = org.apache.commons.io.FileUtils.getFile(strArray28);
        boolean boolean31 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file22, file29, "");
        boolean boolean32 = org.apache.commons.io.FileUtils.isFileNewer(file7, file22);
        java.io.File file33 = null;
        boolean boolean34 = org.apache.commons.io.FileUtils.contentEquals(file22, file33);
        org.apache.commons.io.FileUtils.touch(file22);
        java.lang.String str36 = org.apache.commons.io.FileUtils.readFileToString(file22);
        org.apache.commons.io.FileUtils.forceMkdirParent(file22);
        java.lang.String[] strArray40 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file41 = org.apache.commons.io.FileUtils.getFile(strArray40);
        java.lang.String[] strArray44 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file45 = org.apache.commons.io.FileUtils.getFile(strArray44);
        boolean boolean46 = org.apache.commons.io.FileUtils.isFileOlder(file41, file45);
        boolean boolean48 = org.apache.commons.io.FileUtils.waitFor(file45, (int) '4');
        java.lang.String[] strArray51 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file52 = org.apache.commons.io.FileUtils.getFile(strArray51);
        boolean boolean54 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file45, file52, "");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.FileUtils.moveDirectoryToDirectory(file22, file52, false);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Destination 'hi!\\hi!' is not a directory");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lineIterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(file18);
        org.junit.Assert.assertEquals(file18.getParent(), "hi!");
        org.junit.Assert.assertEquals(file18.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(file22);
        org.junit.Assert.assertEquals(file22.getParent(), "hi!");
        org.junit.Assert.assertEquals(file22.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(file29);
        org.junit.Assert.assertEquals(file29.getParent(), "hi!");
        org.junit.Assert.assertEquals(file29.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(file41);
        org.junit.Assert.assertEquals(file41.getParent(), "hi!");
        org.junit.Assert.assertEquals(file41.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(file45);
        org.junit.Assert.assertEquals(file45.getParent(), "hi!");
        org.junit.Assert.assertEquals(file45.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(file52);
        org.junit.Assert.assertEquals(file52.getParent(), "hi!");
        org.junit.Assert.assertEquals(file52.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.FileUtils.write(file0, (java.lang.CharSequence) "32 bytes", "C:\\Users\\Mathieu\\AppData\\Local\\Temp\\\r\n\r\n");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: C:\\Users\\Mathieu\\AppData\\Local\\Temp\\????");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        java.lang.Iterable<java.io.File> fileIterable0 = null;
        java.io.File file1 = org.apache.commons.io.FileUtils.getTempDirectory();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file5 = org.apache.commons.io.FileUtils.getFile(strArray4);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file9 = org.apache.commons.io.FileUtils.getFile(strArray8);
        boolean boolean10 = org.apache.commons.io.FileUtils.isFileOlder(file5, file9);
        boolean boolean12 = org.apache.commons.io.FileUtils.waitFor(file9, (int) '4');
        org.apache.commons.io.LineIterator lineIterator13 = org.apache.commons.io.FileUtils.lineIterator(file9);
        boolean boolean15 = org.apache.commons.io.FileUtils.isFileOlder(file9, (-1L));
        java.nio.charset.Charset charset16 = null;
        java.lang.String str17 = org.apache.commons.io.FileUtils.readFileToString(file9, charset16);
        java.io.FileOutputStream fileOutputStream19 = org.apache.commons.io.FileUtils.openOutputStream(file9, false);
        java.io.FileOutputStream fileOutputStream21 = org.apache.commons.io.FileUtils.openOutputStream(file9, true);
        boolean boolean22 = org.apache.commons.io.FileUtils.isFileOlder(file1, file9);
        java.io.FileInputStream fileInputStream23 = org.apache.commons.io.FileUtils.openInputStream(file9);
        java.lang.String[] strArray24 = new java.lang.String[] {};
        java.io.File file25 = org.apache.commons.io.FileUtils.getFile(strArray24);
        java.io.File file26 = org.apache.commons.io.FileUtils.getFile(strArray24);
        java.io.File file27 = org.apache.commons.io.FileUtils.getFile(strArray24);
        java.io.File file28 = org.apache.commons.io.FileUtils.getFile(file9, strArray24);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.FileUtils.copyToDirectory(fileIterable0, file9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: sourceIterable");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(file1);
        org.junit.Assert.assertEquals(file1.getParent(), "C:\\Users\\Mathieu\\AppData\\Local");
        org.junit.Assert.assertEquals(file1.toString(), "C:\\Users\\Mathieu\\AppData\\Local\\Temp");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(file5);
        org.junit.Assert.assertEquals(file5.getParent(), "hi!");
        org.junit.Assert.assertEquals(file5.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(file9);
        org.junit.Assert.assertEquals(file9.getParent(), "hi!");
        org.junit.Assert.assertEquals(file9.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(lineIterator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(fileOutputStream19);
        org.junit.Assert.assertNotNull(fileOutputStream21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(fileInputStream23);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNull(file25);
        org.junit.Assert.assertNull(file26);
        org.junit.Assert.assertNull(file27);
        org.junit.Assert.assertNotNull(file28);
        org.junit.Assert.assertEquals(file28.getParent(), "hi!");
        org.junit.Assert.assertEquals(file28.toString(), "hi!\\hi!");
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        java.io.File file0 = org.apache.commons.io.FileUtils.getTempDirectory();
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file4 = org.apache.commons.io.FileUtils.getFile(strArray3);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file8 = org.apache.commons.io.FileUtils.getFile(strArray7);
        boolean boolean9 = org.apache.commons.io.FileUtils.isFileOlder(file4, file8);
        boolean boolean11 = org.apache.commons.io.FileUtils.waitFor(file8, (int) '4');
        org.apache.commons.io.LineIterator lineIterator12 = org.apache.commons.io.FileUtils.lineIterator(file8);
        boolean boolean14 = org.apache.commons.io.FileUtils.isFileOlder(file8, (-1L));
        java.nio.charset.Charset charset15 = null;
        java.lang.String str16 = org.apache.commons.io.FileUtils.readFileToString(file8, charset15);
        java.io.FileOutputStream fileOutputStream18 = org.apache.commons.io.FileUtils.openOutputStream(file8, false);
        java.io.FileOutputStream fileOutputStream20 = org.apache.commons.io.FileUtils.openOutputStream(file8, true);
        boolean boolean21 = org.apache.commons.io.FileUtils.isFileOlder(file0, file8);
        java.io.FileInputStream fileInputStream22 = org.apache.commons.io.FileUtils.openInputStream(file8);
        java.lang.String[] strArray23 = new java.lang.String[] {};
        java.io.File file24 = org.apache.commons.io.FileUtils.getFile(strArray23);
        java.io.File file25 = org.apache.commons.io.FileUtils.getFile(strArray23);
        java.io.File file26 = org.apache.commons.io.FileUtils.getFile(strArray23);
        java.io.File file27 = org.apache.commons.io.FileUtils.getFile(file8, strArray23);
        org.apache.commons.io.FileUtils.writeStringToFile(file27, "", true);
        org.junit.Assert.assertNotNull(file0);
        org.junit.Assert.assertEquals(file0.getParent(), "C:\\Users\\Mathieu\\AppData\\Local");
        org.junit.Assert.assertEquals(file0.toString(), "C:\\Users\\Mathieu\\AppData\\Local\\Temp");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(file4);
        org.junit.Assert.assertEquals(file4.getParent(), "hi!");
        org.junit.Assert.assertEquals(file4.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(file8);
        org.junit.Assert.assertEquals(file8.getParent(), "hi!");
        org.junit.Assert.assertEquals(file8.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(lineIterator12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(fileOutputStream18);
        org.junit.Assert.assertNotNull(fileOutputStream20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(fileInputStream22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNull(file24);
        org.junit.Assert.assertNull(file25);
        org.junit.Assert.assertNull(file26);
        org.junit.Assert.assertNotNull(file27);
        org.junit.Assert.assertEquals(file27.getParent(), "hi!");
        org.junit.Assert.assertEquals(file27.toString(), "hi!\\hi!");
    }

    @Test
    @Disabled
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String str4 = org.apache.commons.io.FileUtils.readFileToString(file3);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file8 = org.apache.commons.io.FileUtils.getFile(strArray7);
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file12 = org.apache.commons.io.FileUtils.getFile(strArray11);
        boolean boolean13 = org.apache.commons.io.FileUtils.isFileOlder(file8, file12);
        boolean boolean15 = org.apache.commons.io.FileUtils.waitFor(file12, (int) '4');
        org.apache.commons.io.LineIterator lineIterator16 = org.apache.commons.io.FileUtils.lineIterator(file12);
        boolean boolean17 = org.apache.commons.io.FileUtils.deleteQuietly(file12);
        org.apache.commons.io.FileUtils.writeStringToFile(file12, "");
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file23 = org.apache.commons.io.FileUtils.getFile(strArray22);
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file27 = org.apache.commons.io.FileUtils.getFile(strArray26);
        boolean boolean28 = org.apache.commons.io.FileUtils.isFileOlder(file23, file27);
        boolean boolean30 = org.apache.commons.io.FileUtils.waitFor(file27, (int) '4');
        java.lang.String[] strArray33 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file34 = org.apache.commons.io.FileUtils.getFile(strArray33);
        boolean boolean36 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file27, file34, "");
        java.io.FileOutputStream fileOutputStream38 = org.apache.commons.io.FileUtils.openOutputStream(file27, false);
        java.lang.String[] strArray45 = new java.lang.String[] { "", "1048576 EB", "C:\\Users\\Mathieu\\AppData\\Local\\Temp\\", "C:\\Users\\Mathieu", "", "1048576 EB" };
        java.util.ArrayList<java.lang.String> strList46 = new java.util.ArrayList<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList46, strArray45);
        org.apache.commons.io.FileUtils.writeLines(file27, (java.util.Collection<java.lang.String>) strList46, "1 GB", false);
        org.apache.commons.io.FileUtils.writeLines(file12, (java.util.Collection<java.lang.String>) strList46, true);
        long long53 = org.apache.commons.io.FileUtils.sizeOf(file12);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.FileUtils.moveDirectoryToDirectory(file3, file12, false);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Destination 'hi!\\hi!' is not a directory");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "C:\\Users\\Mathieu\\AppData\\Local\\Temp\\" + "'", str4, "C:\\Users\\Mathieu\\AppData\\Local\\Temp\\");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(file8);
        org.junit.Assert.assertEquals(file8.getParent(), "hi!");
        org.junit.Assert.assertEquals(file8.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(file12);
        org.junit.Assert.assertEquals(file12.getParent(), "hi!");
        org.junit.Assert.assertEquals(file12.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(lineIterator16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(file23);
        org.junit.Assert.assertEquals(file23.getParent(), "hi!");
        org.junit.Assert.assertEquals(file23.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(file27);
        org.junit.Assert.assertEquals(file27.getParent(), "hi!");
        org.junit.Assert.assertEquals(file27.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(file34);
        org.junit.Assert.assertEquals(file34.getParent(), "hi!");
        org.junit.Assert.assertEquals(file34.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(fileOutputStream38);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 180L + "'", long53 == 180L);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        java.io.File file0 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file5 = org.apache.commons.io.FileUtils.getFile(strArray4);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file9 = org.apache.commons.io.FileUtils.getFile(strArray8);
        boolean boolean10 = org.apache.commons.io.FileUtils.isFileOlder(file5, file9);
        boolean boolean11 = org.apache.commons.io.FileUtils.deleteQuietly(file9);
        boolean boolean13 = org.apache.commons.io.FileUtils.isFileNewer(file9, 0L);
        java.nio.charset.Charset charset14 = null;
        java.util.List<java.lang.String> strList15 = org.apache.commons.io.FileUtils.readLines(file9, charset14);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.FileUtils.writeLines(file0, "C:\\Users\\Mathieu", (java.util.Collection<java.lang.String>) strList15, "1 GB");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.File.exists()\" because \"file\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(file5);
        org.junit.Assert.assertEquals(file5.getParent(), "hi!");
        org.junit.Assert.assertEquals(file5.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(file9);
        org.junit.Assert.assertEquals(file9.getParent(), "hi!");
        org.junit.Assert.assertEquals(file9.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        java.io.File file0 = org.apache.commons.io.FileUtils.getUserDirectory();
        org.apache.commons.io.FileUtils.touch(file0);
        java.math.BigInteger bigInteger2 = org.apache.commons.io.FileUtils.sizeOfDirectoryAsBigInteger(file0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.FileUtils.deleteDirectory(file0);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Unable to delete file: C:\\Users\\Mathieu\\Searches");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(file0);
        org.junit.Assert.assertEquals(file0.getParent(), "C:\\Users");
        org.junit.Assert.assertEquals(file0.toString(), "C:\\Users\\Mathieu");
        org.junit.Assert.assertNotNull(bigInteger2);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        org.apache.commons.io.LineIterator lineIterator11 = org.apache.commons.io.FileUtils.lineIterator(file7);
        boolean boolean13 = org.apache.commons.io.FileUtils.isFileOlder(file7, (-1L));
        long long14 = org.apache.commons.io.FileUtils.sizeOf(file7);
        java.io.File file15 = org.apache.commons.io.FileUtils.getUserDirectory();
        org.apache.commons.io.FileUtils.copyFileToDirectory(file7, file15, true);
        org.apache.commons.io.FileUtils.write(file7, (java.lang.CharSequence) "hi!", true);
        byte[] byteArray21 = org.apache.commons.io.FileUtils.readFileToByteArray(file7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.FileUtils.forceMkdir(file7);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: File hi!\\hi! exists and is not a directory. Unable to create directory.");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lineIterator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 180L + "'", long14 == 180L);
        org.junit.Assert.assertNotNull(file15);
        org.junit.Assert.assertEquals(file15.getParent(), "C:\\Users");
        org.junit.Assert.assertEquals(file15.toString(), "C:\\Users\\Mathieu");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[49, 32, 71, 66, 49, 48, 52, 56, 53, 55, 54, 32, 69, 66, 49, 32, 71, 66, 67, 58, 92, 85, 115, 101, 114, 115, 92, 77, 97, 116, 104, 105, 101, 117, 92, 65, 112, 112, 68, 97, 116, 97, 92, 76, 111, 99, 97, 108, 92, 84, 101, 109, 112, 92, 49, 32, 71, 66, 67, 58, 92, 85, 115, 101, 114, 115, 92, 77, 97, 116, 104, 105, 101, 117, 49, 32, 71, 66, 49, 32, 71, 66, 49, 48, 52, 56, 53, 55, 54, 32, 69, 66, 49, 32, 71, 66, 13, 10, 49, 48, 52, 56, 53, 55, 54, 32, 69, 66, 13, 10, 67, 58, 92, 85, 115, 101, 114, 115, 92, 77, 97, 116, 104, 105, 101, 117, 92, 65, 112, 112, 68, 97, 116, 97, 92, 76, 111, 99, 97, 108, 92, 84, 101, 109, 112, 92, 13, 10, 67, 58, 92, 85, 115, 101, 114, 115, 92, 77, 97, 116, 104, 105, 101, 117, 13, 10, 13, 10, 49, 48, 52, 56, 53, 55, 54, 32, 69, 66, 13, 10, 104, 105, 33]");
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        java.io.File file0 = org.apache.commons.io.FileUtils.getTempDirectory();
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file4 = org.apache.commons.io.FileUtils.getFile(strArray3);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file8 = org.apache.commons.io.FileUtils.getFile(strArray7);
        boolean boolean9 = org.apache.commons.io.FileUtils.isFileOlder(file4, file8);
        boolean boolean11 = org.apache.commons.io.FileUtils.waitFor(file8, (int) '4');
        org.apache.commons.io.LineIterator lineIterator12 = org.apache.commons.io.FileUtils.lineIterator(file8);
        boolean boolean14 = org.apache.commons.io.FileUtils.isFileOlder(file8, (-1L));
        java.nio.charset.Charset charset15 = null;
        java.lang.String str16 = org.apache.commons.io.FileUtils.readFileToString(file8, charset15);
        java.io.FileOutputStream fileOutputStream18 = org.apache.commons.io.FileUtils.openOutputStream(file8, false);
        java.io.FileOutputStream fileOutputStream20 = org.apache.commons.io.FileUtils.openOutputStream(file8, true);
        boolean boolean21 = org.apache.commons.io.FileUtils.isFileOlder(file0, file8);
        java.io.FileInputStream fileInputStream22 = org.apache.commons.io.FileUtils.openInputStream(file8);
        java.lang.String[] strArray23 = new java.lang.String[] {};
        java.io.File file24 = org.apache.commons.io.FileUtils.getFile(strArray23);
        java.io.File file25 = org.apache.commons.io.FileUtils.getFile(strArray23);
        java.io.File file26 = org.apache.commons.io.FileUtils.getFile(strArray23);
        java.io.File file27 = org.apache.commons.io.FileUtils.getFile(file8, strArray23);
        java.nio.charset.Charset charset29 = null;
        org.apache.commons.io.FileUtils.write(file27, (java.lang.CharSequence) "35 bytes", charset29, false);
        org.junit.Assert.assertNotNull(file0);
        org.junit.Assert.assertEquals(file0.getParent(), "C:\\Users\\Mathieu\\AppData\\Local");
        org.junit.Assert.assertEquals(file0.toString(), "C:\\Users\\Mathieu\\AppData\\Local\\Temp");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(file4);
        org.junit.Assert.assertEquals(file4.getParent(), "hi!");
        org.junit.Assert.assertEquals(file4.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(file8);
        org.junit.Assert.assertEquals(file8.getParent(), "hi!");
        org.junit.Assert.assertEquals(file8.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(lineIterator12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1 GB1048576 EB1 GBC:\\Users\\Mathieu\\AppData\\Local\\Temp\\1 GBC:\\Users\\Mathieu1 GB1 GB1048576 EB1 GB\r\n1048576 EB\r\nC:\\Users\\Mathieu\\AppData\\Local\\Temp\\\r\nC:\\Users\\Mathieu\r\n\r\n1048576 EB\r\nhi!" + "'", str16, "1 GB1048576 EB1 GBC:\\Users\\Mathieu\\AppData\\Local\\Temp\\1 GBC:\\Users\\Mathieu1 GB1 GB1048576 EB1 GB\r\n1048576 EB\r\nC:\\Users\\Mathieu\\AppData\\Local\\Temp\\\r\nC:\\Users\\Mathieu\r\n\r\n1048576 EB\r\nhi!");
        org.junit.Assert.assertNotNull(fileOutputStream18);
        org.junit.Assert.assertNotNull(fileOutputStream20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(fileInputStream22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNull(file24);
        org.junit.Assert.assertNull(file25);
        org.junit.Assert.assertNull(file26);
        org.junit.Assert.assertNotNull(file27);
        org.junit.Assert.assertEquals(file27.getParent(), "hi!");
        org.junit.Assert.assertEquals(file27.toString(), "hi!\\hi!");
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean9 = org.apache.commons.io.FileUtils.deleteQuietly(file7);
        boolean boolean11 = org.apache.commons.io.FileUtils.isFileNewer(file7, 0L);
        java.nio.charset.Charset charset12 = null;
        java.util.List<java.lang.String> strList13 = org.apache.commons.io.FileUtils.readLines(file7, charset12);
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file17 = org.apache.commons.io.FileUtils.getFile(strArray16);
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file21 = org.apache.commons.io.FileUtils.getFile(strArray20);
        boolean boolean22 = org.apache.commons.io.FileUtils.isFileOlder(file17, file21);
        java.lang.String str23 = org.apache.commons.io.FileUtils.readFileToString(file17);
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file27 = org.apache.commons.io.FileUtils.getFile(strArray26);
        java.io.File file28 = org.apache.commons.io.FileUtils.getFile(file17, strArray26);
        java.io.File file29 = org.apache.commons.io.FileUtils.getFile(file7, strArray26);
        org.apache.commons.io.filefilter.IOFileFilter iOFileFilter30 = null;
        org.apache.commons.io.filefilter.IOFileFilter iOFileFilter31 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.io.File> fileCollection32 = org.apache.commons.io.FileUtils.listFilesAndDirs(file7, iOFileFilter30, iOFileFilter31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'directory' is not a directory: hi!\\hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(file17);
        org.junit.Assert.assertEquals(file17.getParent(), "hi!");
        org.junit.Assert.assertEquals(file17.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(file21);
        org.junit.Assert.assertEquals(file21.getParent(), "hi!");
        org.junit.Assert.assertEquals(file21.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "35 bytes" + "'", str23, "35 bytes");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(file27);
        org.junit.Assert.assertEquals(file27.getParent(), "hi!");
        org.junit.Assert.assertEquals(file27.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(file28);
        org.junit.Assert.assertEquals(file28.getParent(), "hi!\\hi!\\hi!");
        org.junit.Assert.assertEquals(file28.toString(), "hi!\\hi!\\hi!\\hi!");
        org.junit.Assert.assertNotNull(file29);
        org.junit.Assert.assertEquals(file29.getParent(), "hi!\\hi!\\hi!");
        org.junit.Assert.assertEquals(file29.toString(), "hi!\\hi!\\hi!\\hi!");
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        org.apache.commons.io.LineIterator lineIterator11 = org.apache.commons.io.FileUtils.lineIterator(file7);
        boolean boolean12 = org.apache.commons.io.FileUtils.deleteQuietly(file7);
        org.apache.commons.io.FileUtils.write(file7, (java.lang.CharSequence) "hi!");
        org.apache.commons.io.FileUtils.write(file7, (java.lang.CharSequence) "-1 bytes", false);
        byte[] byteArray18 = org.apache.commons.io.FileUtils.readFileToByteArray(file7);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file22 = org.apache.commons.io.FileUtils.getFile(strArray21);
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file26 = org.apache.commons.io.FileUtils.getFile(strArray25);
        boolean boolean27 = org.apache.commons.io.FileUtils.isFileOlder(file22, file26);
        boolean boolean29 = org.apache.commons.io.FileUtils.waitFor(file26, (int) '4');
        org.apache.commons.io.LineIterator lineIterator30 = org.apache.commons.io.FileUtils.lineIterator(file26);
        boolean boolean31 = org.apache.commons.io.FileUtils.deleteQuietly(file26);
        org.apache.commons.io.FileUtils.writeStringToFile(file26, "");
        org.apache.commons.io.FileUtils.forceMkdirParent(file26);
        boolean boolean36 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file7, file26, "C:\\Users\\Mathieu\\AppData\\Local\\Temp\\");
        java.nio.charset.Charset charset38 = null;
        org.apache.commons.io.FileUtils.writeStringToFile(file26, "1 GB1048576 EB1 GBC:\\Users\\Mathieu\\AppData\\Local\\Temp\\1 GBC:\\Users\\Mathieu1 GB1 GB1048576 EB1 GB", charset38);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lineIterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[45, 49, 32, 98, 121, 116, 101, 115]");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(file22);
        org.junit.Assert.assertEquals(file22.getParent(), "hi!");
        org.junit.Assert.assertEquals(file22.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(file26);
        org.junit.Assert.assertEquals(file26.getParent(), "hi!");
        org.junit.Assert.assertEquals(file26.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(lineIterator30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        org.apache.commons.io.LineIterator lineIterator11 = org.apache.commons.io.FileUtils.lineIterator(file7);
        boolean boolean12 = org.apache.commons.io.FileUtils.deleteQuietly(file7);
        java.io.FileOutputStream fileOutputStream13 = org.apache.commons.io.FileUtils.openOutputStream(file7);
        java.io.FileInputStream fileInputStream14 = org.apache.commons.io.FileUtils.openInputStream(file7);
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file18 = org.apache.commons.io.FileUtils.getFile(strArray17);
        org.apache.commons.io.FileUtils.copyToFile((java.io.InputStream) fileInputStream14, file18);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger20 = org.apache.commons.io.FileUtils.sizeOfDirectoryAsBigInteger(file18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!\\hi! is not a directory");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lineIterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(fileOutputStream13);
        org.junit.Assert.assertNotNull(fileInputStream14);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(file18);
        org.junit.Assert.assertEquals(file18.getParent(), "hi!");
        org.junit.Assert.assertEquals(file18.toString(), "hi!\\hi!");
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        java.math.BigInteger bigInteger9 = org.apache.commons.io.FileUtils.sizeOfAsBigInteger(file7);
        java.io.File file10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.FileUtils.moveDirectoryToDirectory(file7, file10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: destination");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(bigInteger9);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        org.apache.commons.io.LineIterator lineIterator11 = org.apache.commons.io.FileUtils.lineIterator(file7);
        boolean boolean12 = org.apache.commons.io.FileUtils.deleteQuietly(file7);
        org.apache.commons.io.FileUtils.write(file7, (java.lang.CharSequence) "hi!");
        java.nio.charset.Charset charset16 = null;
        org.apache.commons.io.FileUtils.write(file7, (java.lang.CharSequence) "", charset16, true);
        byte[] byteArray19 = org.apache.commons.io.FileUtils.readFileToByteArray(file7);
        boolean boolean21 = org.apache.commons.io.FileUtils.waitFor(file7, (int) 'a');
        org.apache.commons.io.LineIterator lineIterator22 = org.apache.commons.io.FileUtils.lineIterator(file7);
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file26 = org.apache.commons.io.FileUtils.getFile(strArray25);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file30 = org.apache.commons.io.FileUtils.getFile(strArray29);
        boolean boolean31 = org.apache.commons.io.FileUtils.isFileOlder(file26, file30);
        boolean boolean33 = org.apache.commons.io.FileUtils.waitFor(file30, (int) '4');
        org.apache.commons.io.LineIterator lineIterator34 = org.apache.commons.io.FileUtils.lineIterator(file30);
        boolean boolean35 = org.apache.commons.io.FileUtils.deleteQuietly(file30);
        java.io.FileOutputStream fileOutputStream36 = org.apache.commons.io.FileUtils.openOutputStream(file30);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.FileUtils.copyFile(file7, file30);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Source 'hi!\\hi!' and destination 'hi!\\hi!' are the same");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lineIterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[104, 105, 33]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(lineIterator22);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(file26);
        org.junit.Assert.assertEquals(file26.getParent(), "hi!");
        org.junit.Assert.assertEquals(file26.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(file30);
        org.junit.Assert.assertEquals(file30.getParent(), "hi!");
        org.junit.Assert.assertEquals(file30.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(lineIterator34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(fileOutputStream36);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        org.apache.commons.io.LineIterator lineIterator11 = org.apache.commons.io.FileUtils.lineIterator(file7);
        boolean boolean13 = org.apache.commons.io.FileUtils.isFileOlder(file7, (-1L));
        java.nio.charset.Charset charset14 = null;
        java.lang.String str15 = org.apache.commons.io.FileUtils.readFileToString(file7, charset14);
        java.io.FileOutputStream fileOutputStream17 = org.apache.commons.io.FileUtils.openOutputStream(file7, false);
        org.apache.commons.io.LineIterator lineIterator18 = org.apache.commons.io.FileUtils.lineIterator(file7);
        org.apache.commons.io.LineIterator lineIterator19 = org.apache.commons.io.FileUtils.lineIterator(file7);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lineIterator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(fileOutputStream17);
        org.junit.Assert.assertNotNull(lineIterator18);
        org.junit.Assert.assertNotNull(lineIterator19);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        org.apache.commons.io.LineIterator lineIterator11 = org.apache.commons.io.FileUtils.lineIterator(file7);
        boolean boolean13 = org.apache.commons.io.FileUtils.isFileOlder(file7, (-1L));
        java.nio.charset.Charset charset14 = null;
        java.lang.String str15 = org.apache.commons.io.FileUtils.readFileToString(file7, charset14);
        java.io.FileOutputStream fileOutputStream17 = org.apache.commons.io.FileUtils.openOutputStream(file7, false);
        org.apache.commons.io.LineIterator lineIterator18 = org.apache.commons.io.FileUtils.lineIterator(file7);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file22 = org.apache.commons.io.FileUtils.getFile(strArray21);
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file26 = org.apache.commons.io.FileUtils.getFile(strArray25);
        boolean boolean27 = org.apache.commons.io.FileUtils.isFileOlder(file22, file26);
        boolean boolean29 = org.apache.commons.io.FileUtils.waitFor(file26, (int) '4');
        org.apache.commons.io.LineIterator lineIterator30 = org.apache.commons.io.FileUtils.lineIterator(file26);
        boolean boolean31 = org.apache.commons.io.FileUtils.deleteQuietly(file26);
        org.apache.commons.io.FileUtils.writeStringToFile(file26, "");
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file37 = org.apache.commons.io.FileUtils.getFile(strArray36);
        java.lang.String[] strArray40 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file41 = org.apache.commons.io.FileUtils.getFile(strArray40);
        boolean boolean42 = org.apache.commons.io.FileUtils.isFileOlder(file37, file41);
        boolean boolean44 = org.apache.commons.io.FileUtils.waitFor(file41, (int) '4');
        java.lang.String[] strArray47 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file48 = org.apache.commons.io.FileUtils.getFile(strArray47);
        boolean boolean50 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file41, file48, "");
        boolean boolean51 = org.apache.commons.io.FileUtils.isFileNewer(file26, file41);
        boolean boolean52 = org.apache.commons.io.FileUtils.contentEquals(file7, file26);
        java.math.BigInteger bigInteger53 = org.apache.commons.io.FileUtils.sizeOfAsBigInteger(file7);
        java.lang.String[] strArray56 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file57 = org.apache.commons.io.FileUtils.getFile(strArray56);
        java.lang.String[] strArray60 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file61 = org.apache.commons.io.FileUtils.getFile(strArray60);
        boolean boolean62 = org.apache.commons.io.FileUtils.isFileOlder(file57, file61);
        boolean boolean64 = org.apache.commons.io.FileUtils.waitFor(file61, (int) '4');
        java.lang.String[] strArray67 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file68 = org.apache.commons.io.FileUtils.getFile(strArray67);
        boolean boolean70 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file61, file68, "");
        boolean boolean71 = org.apache.commons.io.FileUtils.contentEquals(file7, file61);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lineIterator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(fileOutputStream17);
        org.junit.Assert.assertNotNull(lineIterator18);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(file22);
        org.junit.Assert.assertEquals(file22.getParent(), "hi!");
        org.junit.Assert.assertEquals(file22.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(file26);
        org.junit.Assert.assertEquals(file26.getParent(), "hi!");
        org.junit.Assert.assertEquals(file26.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(lineIterator30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(file37);
        org.junit.Assert.assertEquals(file37.getParent(), "hi!");
        org.junit.Assert.assertEquals(file37.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(file41);
        org.junit.Assert.assertEquals(file41.getParent(), "hi!");
        org.junit.Assert.assertEquals(file41.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(file48);
        org.junit.Assert.assertEquals(file48.getParent(), "hi!");
        org.junit.Assert.assertEquals(file48.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(bigInteger53);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertNotNull(file57);
        org.junit.Assert.assertEquals(file57.getParent(), "hi!");
        org.junit.Assert.assertEquals(file57.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertNotNull(file61);
        org.junit.Assert.assertEquals(file61.getParent(), "hi!");
        org.junit.Assert.assertEquals(file61.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertNotNull(file68);
        org.junit.Assert.assertEquals(file68.getParent(), "hi!");
        org.junit.Assert.assertEquals(file68.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        java.lang.String str9 = org.apache.commons.io.FileUtils.readFileToString(file3);
        org.apache.commons.io.FileUtils.writeStringToFile(file3, "", false);
        boolean boolean14 = org.apache.commons.io.FileUtils.isFileNewer(file3, 0L);
        java.math.BigInteger bigInteger15 = org.apache.commons.io.FileUtils.sizeOfAsBigInteger(file3);
        java.lang.String str16 = org.apache.commons.io.FileUtils.byteCountToDisplaySize(bigInteger15);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(bigInteger15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0 bytes" + "'", str16, "0 bytes");
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        org.apache.commons.io.LineIterator lineIterator11 = org.apache.commons.io.FileUtils.lineIterator(file7);
        boolean boolean12 = org.apache.commons.io.FileUtils.deleteQuietly(file7);
        java.io.FileOutputStream fileOutputStream13 = org.apache.commons.io.FileUtils.openOutputStream(file7);
        java.io.FileInputStream fileInputStream14 = org.apache.commons.io.FileUtils.openInputStream(file7);
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file18 = org.apache.commons.io.FileUtils.getFile(strArray17);
        org.apache.commons.io.FileUtils.copyToFile((java.io.InputStream) fileInputStream14, file18);
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file23 = org.apache.commons.io.FileUtils.getFile(strArray22);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.FileUtils.copyDirectory(file18, file23);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Source 'hi!\\hi!' exists but is not a directory");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lineIterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(fileOutputStream13);
        org.junit.Assert.assertNotNull(fileInputStream14);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(file18);
        org.junit.Assert.assertEquals(file18.getParent(), "hi!");
        org.junit.Assert.assertEquals(file18.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(file23);
        org.junit.Assert.assertEquals(file23.getParent(), "hi!");
        org.junit.Assert.assertEquals(file23.toString(), "hi!\\hi!");
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        org.apache.commons.io.LineIterator lineIterator11 = org.apache.commons.io.FileUtils.lineIterator(file7);
        boolean boolean12 = org.apache.commons.io.FileUtils.deleteQuietly(file7);
        org.apache.commons.io.FileUtils.write(file7, (java.lang.CharSequence) "hi!");
        java.nio.charset.Charset charset16 = null;
        org.apache.commons.io.FileUtils.write(file7, (java.lang.CharSequence) "", charset16, true);
        byte[] byteArray19 = org.apache.commons.io.FileUtils.readFileToByteArray(file7);
        boolean boolean21 = org.apache.commons.io.FileUtils.waitFor(file7, (int) 'a');
        byte[] byteArray22 = org.apache.commons.io.FileUtils.readFileToByteArray(file7);
        java.nio.charset.Charset charset24 = null;
        org.apache.commons.io.FileUtils.write(file7, (java.lang.CharSequence) "-1 bytes", charset24);
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file29 = org.apache.commons.io.FileUtils.getFile(strArray28);
        java.lang.String[] strArray32 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file33 = org.apache.commons.io.FileUtils.getFile(strArray32);
        boolean boolean34 = org.apache.commons.io.FileUtils.isFileOlder(file29, file33);
        boolean boolean36 = org.apache.commons.io.FileUtils.waitFor(file33, (int) '4');
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file40 = org.apache.commons.io.FileUtils.getFile(strArray39);
        boolean boolean42 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file33, file40, "");
        org.apache.commons.io.LineIterator lineIterator43 = org.apache.commons.io.FileUtils.lineIterator(file33);
        org.apache.commons.io.FileUtils.writeStringToFile(file33, "C:\\Users\\Mathieu\\AppData\\Local\\Temp\\", false);
        java.nio.charset.Charset charset48 = null;
        org.apache.commons.io.FileUtils.write(file33, (java.lang.CharSequence) "", charset48, true);
        boolean boolean52 = org.apache.commons.io.FileUtils.waitFor(file33, 0);
        org.apache.commons.io.FileUtils.writeStringToFile(file33, "C:\\Users\\Mathieu\\AppData\\Local\\Temp\\");
        byte[] byteArray55 = org.apache.commons.io.FileUtils.readFileToByteArray(file33);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.FileUtils.moveFileToDirectory(file7, file33, true);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Destination 'hi!\\hi!' is not a directory");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lineIterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[104, 105, 33]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[104, 105, 33]");
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(file29);
        org.junit.Assert.assertEquals(file29.getParent(), "hi!");
        org.junit.Assert.assertEquals(file29.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(file33);
        org.junit.Assert.assertEquals(file33.getParent(), "hi!");
        org.junit.Assert.assertEquals(file33.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(file40);
        org.junit.Assert.assertEquals(file40.getParent(), "hi!");
        org.junit.Assert.assertEquals(file40.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(lineIterator43);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[67, 58, 92, 85, 115, 101, 114, 115, 92, 77, 97, 116, 104, 105, 101, 117, 92, 65, 112, 112, 68, 97, 116, 97, 92, 76, 111, 99, 97, 108, 92, 84, 101, 109, 112, 92]");
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        org.apache.commons.io.LineIterator lineIterator11 = org.apache.commons.io.FileUtils.lineIterator(file7);
        boolean boolean12 = org.apache.commons.io.FileUtils.deleteQuietly(file7);
        org.apache.commons.io.FileUtils.write(file7, (java.lang.CharSequence) "hi!");
        java.nio.charset.Charset charset16 = null;
        org.apache.commons.io.FileUtils.write(file7, (java.lang.CharSequence) "", charset16, true);
        byte[] byteArray19 = org.apache.commons.io.FileUtils.readFileToByteArray(file7);
        boolean boolean21 = org.apache.commons.io.FileUtils.waitFor(file7, (int) 'a');
        byte[] byteArray22 = org.apache.commons.io.FileUtils.readFileToByteArray(file7);
        java.io.FileInputStream fileInputStream23 = org.apache.commons.io.FileUtils.openInputStream(file7);
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file27 = org.apache.commons.io.FileUtils.getFile(strArray26);
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file31 = org.apache.commons.io.FileUtils.getFile(strArray30);
        boolean boolean32 = org.apache.commons.io.FileUtils.isFileOlder(file27, file31);
        boolean boolean34 = org.apache.commons.io.FileUtils.waitFor(file31, (int) '4');
        org.apache.commons.io.LineIterator lineIterator35 = org.apache.commons.io.FileUtils.lineIterator(file31);
        boolean boolean36 = org.apache.commons.io.FileUtils.deleteQuietly(file31);
        org.apache.commons.io.FileUtils.write(file31, (java.lang.CharSequence) "hi!");
        java.nio.charset.Charset charset40 = null;
        org.apache.commons.io.FileUtils.write(file31, (java.lang.CharSequence) "", charset40, true);
        byte[] byteArray43 = org.apache.commons.io.FileUtils.readFileToByteArray(file31);
        java.lang.String[] strArray46 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file47 = org.apache.commons.io.FileUtils.getFile(strArray46);
        java.lang.String[] strArray50 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file51 = org.apache.commons.io.FileUtils.getFile(strArray50);
        boolean boolean52 = org.apache.commons.io.FileUtils.isFileOlder(file47, file51);
        boolean boolean54 = org.apache.commons.io.FileUtils.waitFor(file51, (int) '4');
        org.apache.commons.io.LineIterator lineIterator55 = org.apache.commons.io.FileUtils.lineIterator(file51);
        boolean boolean56 = org.apache.commons.io.FileUtils.deleteQuietly(file51);
        org.apache.commons.io.FileUtils.write(file51, (java.lang.CharSequence) "hi!");
        java.nio.charset.Charset charset60 = null;
        org.apache.commons.io.FileUtils.write(file51, (java.lang.CharSequence) "", charset60, true);
        java.nio.charset.Charset charset64 = null;
        org.apache.commons.io.FileUtils.writeStringToFile(file51, "", charset64, false);
        boolean boolean67 = org.apache.commons.io.FileUtils.isFileNewer(file31, file51);
        java.nio.charset.Charset charset69 = null;
        org.apache.commons.io.FileUtils.write(file31, (java.lang.CharSequence) "-1 bytes", charset69);
        long long71 = org.apache.commons.io.FileUtils.checksumCRC32(file31);
        java.io.FileOutputStream fileOutputStream72 = org.apache.commons.io.FileUtils.openOutputStream(file31);
        org.apache.commons.io.FileUtils.copyInputStreamToFile((java.io.InputStream) fileInputStream23, file31);
        boolean boolean74 = org.apache.commons.io.FileUtils.deleteQuietly(file31);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lineIterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[104, 105, 33]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[104, 105, 33]");
        org.junit.Assert.assertNotNull(fileInputStream23);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(file27);
        org.junit.Assert.assertEquals(file27.getParent(), "hi!");
        org.junit.Assert.assertEquals(file27.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(file31);
        org.junit.Assert.assertEquals(file31.getParent(), "hi!");
        org.junit.Assert.assertEquals(file31.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(lineIterator35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[104, 105, 33]");
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(file47);
        org.junit.Assert.assertEquals(file47.getParent(), "hi!");
        org.junit.Assert.assertEquals(file47.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(file51);
        org.junit.Assert.assertEquals(file51.getParent(), "hi!");
        org.junit.Assert.assertEquals(file51.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(lineIterator55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 2035464173L + "'", long71 == 2035464173L);
        org.junit.Assert.assertNotNull(fileOutputStream72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        org.apache.commons.io.LineIterator lineIterator11 = org.apache.commons.io.FileUtils.lineIterator(file7);
        boolean boolean12 = org.apache.commons.io.FileUtils.deleteQuietly(file7);
        org.apache.commons.io.FileUtils.writeStringToFile(file7, "");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file18 = org.apache.commons.io.FileUtils.getFile(strArray17);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file22 = org.apache.commons.io.FileUtils.getFile(strArray21);
        boolean boolean23 = org.apache.commons.io.FileUtils.isFileOlder(file18, file22);
        boolean boolean25 = org.apache.commons.io.FileUtils.waitFor(file22, (int) '4');
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file29 = org.apache.commons.io.FileUtils.getFile(strArray28);
        boolean boolean31 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file22, file29, "");
        boolean boolean32 = org.apache.commons.io.FileUtils.isFileNewer(file7, file22);
        java.io.FileOutputStream fileOutputStream33 = org.apache.commons.io.FileUtils.openOutputStream(file7);
        java.math.BigInteger bigInteger34 = org.apache.commons.io.FileUtils.sizeOfAsBigInteger(file7);
        java.io.FileOutputStream fileOutputStream35 = org.apache.commons.io.FileUtils.openOutputStream(file7);
        boolean boolean37 = org.apache.commons.io.FileUtils.isFileOlder(file7, 4154702209L);
        java.lang.String[] strArray41 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file42 = org.apache.commons.io.FileUtils.getFile(strArray41);
        java.lang.String[] strArray45 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file46 = org.apache.commons.io.FileUtils.getFile(strArray45);
        boolean boolean47 = org.apache.commons.io.FileUtils.isFileOlder(file42, file46);
        boolean boolean49 = org.apache.commons.io.FileUtils.waitFor(file46, (int) '4');
        org.apache.commons.io.LineIterator lineIterator50 = org.apache.commons.io.FileUtils.lineIterator(file46);
        boolean boolean51 = org.apache.commons.io.FileUtils.deleteQuietly(file46);
        org.apache.commons.io.FileUtils.forceDeleteOnExit(file46);
        java.math.BigInteger bigInteger53 = org.apache.commons.io.FileUtils.sizeOfAsBigInteger(file46);
        java.lang.String[] strArray65 = new java.lang.String[] { "", "100 bytes", "52 bytes", "1048576 EB", "hi!", "hi!", "-1 bytes", "", "C:\\Users\\Mathieu\\AppData\\Local\\Temp\\", "1 PB", "1 PB" };
        java.util.ArrayList<java.lang.String> strList66 = new java.util.ArrayList<java.lang.String>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList66, strArray65);
        org.apache.commons.io.FileUtils.writeLines(file46, (java.util.Collection<java.lang.String>) strList66, true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.FileUtils.writeLines(file7, "hi!", (java.util.Collection<java.lang.String>) strList66, "-1 bytes1 GB1048576 EB1 GBC:\\Users\\Mathieu\\AppData\\Local\\Temp\\1 GBC:\\Users\\Mathieu1 GB1 GB1048576 EB1 GB", false);
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lineIterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(file18);
        org.junit.Assert.assertEquals(file18.getParent(), "hi!");
        org.junit.Assert.assertEquals(file18.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(file22);
        org.junit.Assert.assertEquals(file22.getParent(), "hi!");
        org.junit.Assert.assertEquals(file22.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(file29);
        org.junit.Assert.assertEquals(file29.getParent(), "hi!");
        org.junit.Assert.assertEquals(file29.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(fileOutputStream33);
        org.junit.Assert.assertNotNull(bigInteger34);
        org.junit.Assert.assertNotNull(fileOutputStream35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(file42);
        org.junit.Assert.assertEquals(file42.getParent(), "hi!");
        org.junit.Assert.assertEquals(file42.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(file46);
        org.junit.Assert.assertEquals(file46.getParent(), "hi!");
        org.junit.Assert.assertEquals(file46.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(lineIterator50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(bigInteger53);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean9 = org.apache.commons.io.FileUtils.deleteQuietly(file7);
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file13 = org.apache.commons.io.FileUtils.getFile(strArray12);
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file17 = org.apache.commons.io.FileUtils.getFile(strArray16);
        boolean boolean18 = org.apache.commons.io.FileUtils.isFileOlder(file13, file17);
        boolean boolean20 = org.apache.commons.io.FileUtils.waitFor(file17, (int) '4');
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file24 = org.apache.commons.io.FileUtils.getFile(strArray23);
        boolean boolean26 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file17, file24, "");
        org.apache.commons.io.LineIterator lineIterator27 = org.apache.commons.io.FileUtils.lineIterator(file17);
        org.apache.commons.io.FileUtils.writeStringToFile(file17, "C:\\Users\\Mathieu\\AppData\\Local\\Temp\\", false);
        java.nio.charset.Charset charset32 = null;
        org.apache.commons.io.FileUtils.write(file17, (java.lang.CharSequence) "", charset32, true);
        boolean boolean36 = org.apache.commons.io.FileUtils.waitFor(file17, 0);
        boolean boolean37 = org.apache.commons.io.FileUtils.isFileOlder(file7, file17);
        java.lang.String[] strArray40 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file41 = org.apache.commons.io.FileUtils.getFile(strArray40);
        java.lang.String[] strArray44 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file45 = org.apache.commons.io.FileUtils.getFile(strArray44);
        boolean boolean46 = org.apache.commons.io.FileUtils.isFileOlder(file41, file45);
        boolean boolean48 = org.apache.commons.io.FileUtils.waitFor(file45, (int) '4');
        org.apache.commons.io.LineIterator lineIterator49 = org.apache.commons.io.FileUtils.lineIterator(file45);
        boolean boolean50 = org.apache.commons.io.FileUtils.deleteQuietly(file45);
        org.apache.commons.io.FileUtils.write(file45, (java.lang.CharSequence) "hi!");
        java.nio.charset.Charset charset54 = null;
        org.apache.commons.io.FileUtils.write(file45, (java.lang.CharSequence) "", charset54, true);
        java.nio.charset.Charset charset58 = null;
        org.apache.commons.io.FileUtils.writeStringToFile(file45, "", charset58, false);
        java.io.FileOutputStream fileOutputStream61 = org.apache.commons.io.FileUtils.openOutputStream(file45);
        long long62 = org.apache.commons.io.FileUtils.copyFile(file7, (java.io.OutputStream) fileOutputStream61);
        byte[] byteArray67 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 1 };
        org.apache.commons.io.FileUtils.writeByteArrayToFile(file7, byteArray67);
        java.lang.String[] strArray71 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file72 = org.apache.commons.io.FileUtils.getFile(strArray71);
        java.lang.String[] strArray75 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file76 = org.apache.commons.io.FileUtils.getFile(strArray75);
        boolean boolean77 = org.apache.commons.io.FileUtils.isFileOlder(file72, file76);
        boolean boolean79 = org.apache.commons.io.FileUtils.waitFor(file76, (int) '4');
        org.apache.commons.io.LineIterator lineIterator80 = org.apache.commons.io.FileUtils.lineIterator(file76);
        boolean boolean81 = org.apache.commons.io.FileUtils.deleteQuietly(file76);
        org.apache.commons.io.FileUtils.write(file76, (java.lang.CharSequence) "hi!");
        java.nio.charset.Charset charset85 = null;
        org.apache.commons.io.FileUtils.write(file76, (java.lang.CharSequence) "", charset85, true);
        byte[] byteArray88 = org.apache.commons.io.FileUtils.readFileToByteArray(file76);
        boolean boolean90 = org.apache.commons.io.FileUtils.waitFor(file76, (int) 'a');
        byte[] byteArray91 = org.apache.commons.io.FileUtils.readFileToByteArray(file76);
        org.apache.commons.io.FileUtils.writeByteArrayToFile(file7, byteArray91);
        java.nio.charset.Charset charset94 = null;
        org.apache.commons.io.FileUtils.write(file7, (java.lang.CharSequence) "1 GB1048576 EB1 GBC:\\Users\\Mathieu\\AppData\\Local\\Temp\\1 GBC:\\Users\\Mathieu1 GB1 GB1048576 EB1 GB\r\n1048576 EB\r\nC:\\Users\\Mathieu\\AppData\\Local\\Temp\\\r\nC:\\Users\\Mathieu\r\n\r\n1048576 EB\r\nhi!", charset94, false);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(file13);
        org.junit.Assert.assertEquals(file13.getParent(), "hi!");
        org.junit.Assert.assertEquals(file13.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(file17);
        org.junit.Assert.assertEquals(file17.getParent(), "hi!");
        org.junit.Assert.assertEquals(file17.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(file24);
        org.junit.Assert.assertEquals(file24.getParent(), "hi!");
        org.junit.Assert.assertEquals(file24.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(lineIterator27);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(file41);
        org.junit.Assert.assertEquals(file41.getParent(), "hi!");
        org.junit.Assert.assertEquals(file41.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(file45);
        org.junit.Assert.assertEquals(file45.getParent(), "hi!");
        org.junit.Assert.assertEquals(file45.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(lineIterator49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(fileOutputStream61);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 0L + "'", long62 == 0L);
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray67), "[0, 0, 100, 1]");
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertNotNull(file72);
        org.junit.Assert.assertEquals(file72.getParent(), "hi!");
        org.junit.Assert.assertEquals(file72.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertNotNull(file76);
        org.junit.Assert.assertEquals(file76.getParent(), "hi!");
        org.junit.Assert.assertEquals(file76.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(lineIterator80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(byteArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray88), "[104, 105, 33]");
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertNotNull(byteArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray91), "[104, 105, 33]");
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        org.apache.commons.io.LineIterator lineIterator11 = org.apache.commons.io.FileUtils.lineIterator(file7);
        boolean boolean13 = org.apache.commons.io.FileUtils.isFileOlder(file7, (-1L));
        java.nio.charset.Charset charset14 = null;
        java.lang.String str15 = org.apache.commons.io.FileUtils.readFileToString(file7, charset14);
        java.io.FileOutputStream fileOutputStream17 = org.apache.commons.io.FileUtils.openOutputStream(file7, false);
        org.apache.commons.io.LineIterator lineIterator18 = org.apache.commons.io.FileUtils.lineIterator(file7);
        org.apache.commons.io.FileUtils.writeStringToFile(file7, "-1 bytes", false);
        java.nio.charset.Charset charset23 = null;
        org.apache.commons.io.FileUtils.write(file7, (java.lang.CharSequence) "32 bytes", charset23);
        org.apache.commons.io.FileUtils.writeStringToFile(file7, "C:\\Users\\Mathieu", false);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lineIterator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1 GB1048576 EB1 GBC:\\Users\\Mathieu\\AppData\\Local\\Temp\\1 GBC:\\Users\\Mathieu1 GB1 GB1048576 EB1 GB\r\n1048576 EB\r\nC:\\Users\\Mathieu\\AppData\\Local\\Temp\\\r\nC:\\Users\\Mathieu\r\n\r\n1048576 EB\r\nhi!" + "'", str15, "1 GB1048576 EB1 GBC:\\Users\\Mathieu\\AppData\\Local\\Temp\\1 GBC:\\Users\\Mathieu1 GB1 GB1048576 EB1 GB\r\n1048576 EB\r\nC:\\Users\\Mathieu\\AppData\\Local\\Temp\\\r\nC:\\Users\\Mathieu\r\n\r\n1048576 EB\r\nhi!");
        org.junit.Assert.assertNotNull(fileOutputStream17);
        org.junit.Assert.assertNotNull(lineIterator18);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean9 = org.apache.commons.io.FileUtils.deleteQuietly(file7);
        boolean boolean11 = org.apache.commons.io.FileUtils.isFileNewer(file7, 0L);
        java.nio.charset.Charset charset12 = null;
        java.util.List<java.lang.String> strList13 = org.apache.commons.io.FileUtils.readLines(file7, charset12);
        java.nio.charset.Charset charset15 = null;
        org.apache.commons.io.FileUtils.writeStringToFile(file7, "52 bytes", charset15, true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.FileUtils.deleteDirectory(file7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!\\hi! is not a directory");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        org.apache.commons.io.LineIterator lineIterator11 = org.apache.commons.io.FileUtils.lineIterator(file7);
        boolean boolean13 = org.apache.commons.io.FileUtils.isFileOlder(file7, (-1L));
        java.io.FileOutputStream fileOutputStream15 = org.apache.commons.io.FileUtils.openOutputStream(file7, false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.FileUtils.cleanDirectory(file7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!\\hi! is not a directory");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lineIterator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(fileOutputStream15);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        org.apache.commons.io.LineIterator lineIterator11 = org.apache.commons.io.FileUtils.lineIterator(file7);
        boolean boolean12 = org.apache.commons.io.FileUtils.deleteQuietly(file7);
        org.apache.commons.io.FileUtils.writeStringToFile(file7, "");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file18 = org.apache.commons.io.FileUtils.getFile(strArray17);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file22 = org.apache.commons.io.FileUtils.getFile(strArray21);
        boolean boolean23 = org.apache.commons.io.FileUtils.isFileOlder(file18, file22);
        boolean boolean25 = org.apache.commons.io.FileUtils.waitFor(file22, (int) '4');
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file29 = org.apache.commons.io.FileUtils.getFile(strArray28);
        boolean boolean31 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file22, file29, "");
        boolean boolean32 = org.apache.commons.io.FileUtils.isFileNewer(file7, file22);
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file36 = org.apache.commons.io.FileUtils.getFile(strArray35);
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file40 = org.apache.commons.io.FileUtils.getFile(strArray39);
        boolean boolean41 = org.apache.commons.io.FileUtils.isFileOlder(file36, file40);
        boolean boolean42 = org.apache.commons.io.FileUtils.deleteQuietly(file40);
        java.lang.String[] strArray45 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file46 = org.apache.commons.io.FileUtils.getFile(strArray45);
        java.lang.String[] strArray49 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file50 = org.apache.commons.io.FileUtils.getFile(strArray49);
        boolean boolean51 = org.apache.commons.io.FileUtils.isFileOlder(file46, file50);
        boolean boolean53 = org.apache.commons.io.FileUtils.waitFor(file50, (int) '4');
        java.lang.String[] strArray56 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file57 = org.apache.commons.io.FileUtils.getFile(strArray56);
        boolean boolean59 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file50, file57, "");
        org.apache.commons.io.LineIterator lineIterator60 = org.apache.commons.io.FileUtils.lineIterator(file50);
        org.apache.commons.io.FileUtils.writeStringToFile(file50, "C:\\Users\\Mathieu\\AppData\\Local\\Temp\\", false);
        java.nio.charset.Charset charset65 = null;
        org.apache.commons.io.FileUtils.write(file50, (java.lang.CharSequence) "", charset65, true);
        boolean boolean69 = org.apache.commons.io.FileUtils.waitFor(file50, 0);
        boolean boolean70 = org.apache.commons.io.FileUtils.isFileOlder(file40, file50);
        java.lang.String[] strArray73 = new java.lang.String[] { "C:\\Users\\Mathieu\\AppData\\Local\\Temp\\", "" };
        java.util.ArrayList<java.lang.String> strList74 = new java.util.ArrayList<java.lang.String>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList74, strArray73);
        org.apache.commons.io.FileUtils.writeLines(file40, (java.util.Collection<java.lang.String>) strList74);
        org.apache.commons.io.FileUtils.writeLines(file7, (java.util.Collection<java.lang.String>) strList74);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.LineIterator lineIterator79 = org.apache.commons.io.FileUtils.lineIterator(file7, "\000\000d\001");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ??d?");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lineIterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(file18);
        org.junit.Assert.assertEquals(file18.getParent(), "hi!");
        org.junit.Assert.assertEquals(file18.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(file22);
        org.junit.Assert.assertEquals(file22.getParent(), "hi!");
        org.junit.Assert.assertEquals(file22.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(file29);
        org.junit.Assert.assertEquals(file29.getParent(), "hi!");
        org.junit.Assert.assertEquals(file29.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(file36);
        org.junit.Assert.assertEquals(file36.getParent(), "hi!");
        org.junit.Assert.assertEquals(file36.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(file40);
        org.junit.Assert.assertEquals(file40.getParent(), "hi!");
        org.junit.Assert.assertEquals(file40.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(file46);
        org.junit.Assert.assertEquals(file46.getParent(), "hi!");
        org.junit.Assert.assertEquals(file46.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(file50);
        org.junit.Assert.assertEquals(file50.getParent(), "hi!");
        org.junit.Assert.assertEquals(file50.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertNotNull(file57);
        org.junit.Assert.assertEquals(file57.getParent(), "hi!");
        org.junit.Assert.assertEquals(file57.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(lineIterator60);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file14 = org.apache.commons.io.FileUtils.getFile(strArray13);
        boolean boolean16 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file7, file14, "");
        java.io.FileInputStream fileInputStream17 = org.apache.commons.io.FileUtils.openInputStream(file14);
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file21 = org.apache.commons.io.FileUtils.getFile(strArray20);
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file25 = org.apache.commons.io.FileUtils.getFile(strArray24);
        boolean boolean26 = org.apache.commons.io.FileUtils.isFileOlder(file21, file25);
        boolean boolean28 = org.apache.commons.io.FileUtils.waitFor(file25, (int) '4');
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file32 = org.apache.commons.io.FileUtils.getFile(strArray31);
        boolean boolean34 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file25, file32, "");
        org.apache.commons.io.LineIterator lineIterator35 = org.apache.commons.io.FileUtils.lineIterator(file25);
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file39 = org.apache.commons.io.FileUtils.getFile(strArray38);
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file43 = org.apache.commons.io.FileUtils.getFile(strArray42);
        boolean boolean44 = org.apache.commons.io.FileUtils.isFileOlder(file39, file43);
        boolean boolean46 = org.apache.commons.io.FileUtils.waitFor(file43, (int) '4');
        org.apache.commons.io.LineIterator lineIterator47 = org.apache.commons.io.FileUtils.lineIterator(file43);
        boolean boolean48 = org.apache.commons.io.FileUtils.deleteQuietly(file43);
        org.apache.commons.io.FileUtils.write(file43, (java.lang.CharSequence) "hi!");
        java.nio.charset.Charset charset52 = null;
        org.apache.commons.io.FileUtils.write(file43, (java.lang.CharSequence) "", charset52, true);
        java.nio.charset.Charset charset56 = null;
        org.apache.commons.io.FileUtils.writeStringToFile(file43, "", charset56, false);
        long long59 = org.apache.commons.io.FileUtils.sizeOf(file43);
        org.apache.commons.io.FileUtils.writeStringToFile(file43, "");
        java.nio.charset.Charset charset62 = null;
        java.util.List<java.lang.String> strList63 = org.apache.commons.io.FileUtils.readLines(file43, charset62);
        org.apache.commons.io.FileUtils.writeLines(file25, (java.util.Collection<java.lang.String>) strList63);
        org.apache.commons.io.FileUtils.copyToFile((java.io.InputStream) fileInputStream17, file25);
        java.lang.String[] strArray68 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file69 = org.apache.commons.io.FileUtils.getFile(strArray68);
        java.lang.String[] strArray72 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file73 = org.apache.commons.io.FileUtils.getFile(strArray72);
        boolean boolean74 = org.apache.commons.io.FileUtils.isFileOlder(file69, file73);
        boolean boolean76 = org.apache.commons.io.FileUtils.waitFor(file73, (int) '4');
        java.lang.String[] strArray79 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file80 = org.apache.commons.io.FileUtils.getFile(strArray79);
        boolean boolean82 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file73, file80, "");
        org.apache.commons.io.LineIterator lineIterator83 = org.apache.commons.io.FileUtils.lineIterator(file73);
        org.apache.commons.io.FileUtils.copyInputStreamToFile((java.io.InputStream) fileInputStream17, file73);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(file14);
        org.junit.Assert.assertEquals(file14.getParent(), "hi!");
        org.junit.Assert.assertEquals(file14.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(fileInputStream17);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(file21);
        org.junit.Assert.assertEquals(file21.getParent(), "hi!");
        org.junit.Assert.assertEquals(file21.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(file25);
        org.junit.Assert.assertEquals(file25.getParent(), "hi!");
        org.junit.Assert.assertEquals(file25.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(file32);
        org.junit.Assert.assertEquals(file32.getParent(), "hi!");
        org.junit.Assert.assertEquals(file32.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(lineIterator35);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(file39);
        org.junit.Assert.assertEquals(file39.getParent(), "hi!");
        org.junit.Assert.assertEquals(file39.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(file43);
        org.junit.Assert.assertEquals(file43.getParent(), "hi!");
        org.junit.Assert.assertEquals(file43.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(lineIterator47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
        org.junit.Assert.assertNotNull(strList63);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(file69);
        org.junit.Assert.assertEquals(file69.getParent(), "hi!");
        org.junit.Assert.assertEquals(file69.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertNotNull(file73);
        org.junit.Assert.assertEquals(file73.getParent(), "hi!");
        org.junit.Assert.assertEquals(file73.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertNotNull(file80);
        org.junit.Assert.assertEquals(file80.getParent(), "hi!");
        org.junit.Assert.assertEquals(file80.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(lineIterator83);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file14 = org.apache.commons.io.FileUtils.getFile(strArray13);
        boolean boolean16 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file7, file14, "");
        org.apache.commons.io.LineIterator lineIterator17 = org.apache.commons.io.FileUtils.lineIterator(file7);
        java.lang.CharSequence charSequence18 = null;
        java.nio.charset.Charset charset19 = null;
        org.apache.commons.io.FileUtils.write(file7, charSequence18, charset19, true);
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file25 = org.apache.commons.io.FileUtils.getFile(strArray24);
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file29 = org.apache.commons.io.FileUtils.getFile(strArray28);
        boolean boolean30 = org.apache.commons.io.FileUtils.isFileOlder(file25, file29);
        boolean boolean32 = org.apache.commons.io.FileUtils.waitFor(file29, (int) '4');
        org.apache.commons.io.LineIterator lineIterator33 = org.apache.commons.io.FileUtils.lineIterator(file29);
        boolean boolean34 = org.apache.commons.io.FileUtils.deleteQuietly(file29);
        org.apache.commons.io.FileUtils.writeStringToFile(file29, "");
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file40 = org.apache.commons.io.FileUtils.getFile(strArray39);
        java.lang.String[] strArray43 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file44 = org.apache.commons.io.FileUtils.getFile(strArray43);
        boolean boolean45 = org.apache.commons.io.FileUtils.isFileOlder(file40, file44);
        boolean boolean47 = org.apache.commons.io.FileUtils.waitFor(file44, (int) '4');
        java.lang.String[] strArray50 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file51 = org.apache.commons.io.FileUtils.getFile(strArray50);
        boolean boolean53 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file44, file51, "");
        java.io.FileOutputStream fileOutputStream55 = org.apache.commons.io.FileUtils.openOutputStream(file44, false);
        java.lang.String[] strArray62 = new java.lang.String[] { "", "1048576 EB", "C:\\Users\\Mathieu\\AppData\\Local\\Temp\\", "C:\\Users\\Mathieu", "", "1048576 EB" };
        java.util.ArrayList<java.lang.String> strList63 = new java.util.ArrayList<java.lang.String>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList63, strArray62);
        org.apache.commons.io.FileUtils.writeLines(file44, (java.util.Collection<java.lang.String>) strList63, "1 GB", false);
        org.apache.commons.io.FileUtils.writeLines(file29, (java.util.Collection<java.lang.String>) strList63, true);
        java.io.FileFilter fileFilter70 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.FileUtils.copyDirectory(file7, file29, fileFilter70);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Source 'hi!\\hi!' exists but is not a directory");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(file14);
        org.junit.Assert.assertEquals(file14.getParent(), "hi!");
        org.junit.Assert.assertEquals(file14.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(lineIterator17);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(file25);
        org.junit.Assert.assertEquals(file25.getParent(), "hi!");
        org.junit.Assert.assertEquals(file25.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(file29);
        org.junit.Assert.assertEquals(file29.getParent(), "hi!");
        org.junit.Assert.assertEquals(file29.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(lineIterator33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(file40);
        org.junit.Assert.assertEquals(file40.getParent(), "hi!");
        org.junit.Assert.assertEquals(file40.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(file44);
        org.junit.Assert.assertEquals(file44.getParent(), "hi!");
        org.junit.Assert.assertEquals(file44.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(file51);
        org.junit.Assert.assertEquals(file51.getParent(), "hi!");
        org.junit.Assert.assertEquals(file51.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(fileOutputStream55);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        org.apache.commons.io.LineIterator lineIterator11 = org.apache.commons.io.FileUtils.lineIterator(file7);
        boolean boolean12 = org.apache.commons.io.FileUtils.deleteQuietly(file7);
        java.io.FileOutputStream fileOutputStream13 = org.apache.commons.io.FileUtils.openOutputStream(file7);
        java.io.FileInputStream fileInputStream14 = org.apache.commons.io.FileUtils.openInputStream(file7);
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file18 = org.apache.commons.io.FileUtils.getFile(strArray17);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file22 = org.apache.commons.io.FileUtils.getFile(strArray21);
        boolean boolean23 = org.apache.commons.io.FileUtils.isFileOlder(file18, file22);
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file27 = org.apache.commons.io.FileUtils.getFile(strArray26);
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file31 = org.apache.commons.io.FileUtils.getFile(strArray30);
        boolean boolean32 = org.apache.commons.io.FileUtils.isFileOlder(file27, file31);
        boolean boolean34 = org.apache.commons.io.FileUtils.waitFor(file31, (int) '4');
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file38 = org.apache.commons.io.FileUtils.getFile(strArray37);
        boolean boolean40 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file31, file38, "");
        org.apache.commons.io.LineIterator lineIterator41 = org.apache.commons.io.FileUtils.lineIterator(file31);
        org.apache.commons.io.FileUtils.writeStringToFile(file31, "C:\\Users\\Mathieu\\AppData\\Local\\Temp\\", false);
        java.nio.charset.Charset charset46 = null;
        org.apache.commons.io.FileUtils.write(file31, (java.lang.CharSequence) "", charset46, true);
        boolean boolean50 = org.apache.commons.io.FileUtils.waitFor(file31, 0);
        java.nio.charset.Charset charset51 = null;
        java.lang.String str52 = org.apache.commons.io.FileUtils.readFileToString(file31, charset51);
        long long53 = org.apache.commons.io.FileUtils.checksumCRC32(file31);
        boolean boolean54 = org.apache.commons.io.FileUtils.isFileOlder(file18, file31);
        org.apache.commons.io.FileUtils.copyToFile((java.io.InputStream) fileInputStream14, file18);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lineIterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(fileOutputStream13);
        org.junit.Assert.assertNotNull(fileInputStream14);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(file18);
        org.junit.Assert.assertEquals(file18.getParent(), "hi!");
        org.junit.Assert.assertEquals(file18.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(file22);
        org.junit.Assert.assertEquals(file22.getParent(), "hi!");
        org.junit.Assert.assertEquals(file22.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(file27);
        org.junit.Assert.assertEquals(file27.getParent(), "hi!");
        org.junit.Assert.assertEquals(file27.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(file31);
        org.junit.Assert.assertEquals(file31.getParent(), "hi!");
        org.junit.Assert.assertEquals(file31.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(file38);
        org.junit.Assert.assertEquals(file38.getParent(), "hi!");
        org.junit.Assert.assertEquals(file38.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(lineIterator41);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "C:\\Users\\Mathieu\\AppData\\Local\\Temp\\" + "'", str52, "C:\\Users\\Mathieu\\AppData\\Local\\Temp\\");
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 4154702209L + "'", long53 == 4154702209L);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        org.apache.commons.io.LineIterator lineIterator11 = org.apache.commons.io.FileUtils.lineIterator(file7);
        boolean boolean13 = org.apache.commons.io.FileUtils.isFileOlder(file7, (-1L));
        java.nio.charset.Charset charset14 = null;
        java.lang.String str15 = org.apache.commons.io.FileUtils.readFileToString(file7, charset14);
        org.apache.commons.io.FileUtils.writeStringToFile(file7, "hi!", true);
        org.apache.commons.io.FileUtils.write(file7, (java.lang.CharSequence) "\000\000d\001", true);
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file25 = org.apache.commons.io.FileUtils.getFile(strArray24);
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file29 = org.apache.commons.io.FileUtils.getFile(strArray28);
        boolean boolean30 = org.apache.commons.io.FileUtils.isFileOlder(file25, file29);
        boolean boolean31 = org.apache.commons.io.FileUtils.deleteQuietly(file29);
        java.lang.String[] strArray34 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file35 = org.apache.commons.io.FileUtils.getFile(strArray34);
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file39 = org.apache.commons.io.FileUtils.getFile(strArray38);
        boolean boolean40 = org.apache.commons.io.FileUtils.isFileOlder(file35, file39);
        boolean boolean42 = org.apache.commons.io.FileUtils.waitFor(file39, (int) '4');
        java.lang.String[] strArray45 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file46 = org.apache.commons.io.FileUtils.getFile(strArray45);
        boolean boolean48 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file39, file46, "");
        org.apache.commons.io.LineIterator lineIterator49 = org.apache.commons.io.FileUtils.lineIterator(file39);
        org.apache.commons.io.FileUtils.writeStringToFile(file39, "C:\\Users\\Mathieu\\AppData\\Local\\Temp\\", false);
        java.nio.charset.Charset charset54 = null;
        org.apache.commons.io.FileUtils.write(file39, (java.lang.CharSequence) "", charset54, true);
        boolean boolean58 = org.apache.commons.io.FileUtils.waitFor(file39, 0);
        boolean boolean59 = org.apache.commons.io.FileUtils.isFileOlder(file29, file39);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.FileUtils.copyDirectory(file7, file39);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Source 'hi!\\hi!' exists but is not a directory");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lineIterator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(file25);
        org.junit.Assert.assertEquals(file25.getParent(), "hi!");
        org.junit.Assert.assertEquals(file25.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(file29);
        org.junit.Assert.assertEquals(file29.getParent(), "hi!");
        org.junit.Assert.assertEquals(file29.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(file35);
        org.junit.Assert.assertEquals(file35.getParent(), "hi!");
        org.junit.Assert.assertEquals(file35.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(file39);
        org.junit.Assert.assertEquals(file39.getParent(), "hi!");
        org.junit.Assert.assertEquals(file39.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(file46);
        org.junit.Assert.assertEquals(file46.getParent(), "hi!");
        org.junit.Assert.assertEquals(file46.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(lineIterator49);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file14 = org.apache.commons.io.FileUtils.getFile(strArray13);
        boolean boolean16 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file7, file14, "");
        org.apache.commons.io.FileUtils.writeStringToFile(file7, "", false);
        java.nio.charset.Charset charset21 = null;
        org.apache.commons.io.FileUtils.write(file7, (java.lang.CharSequence) "C:\\Users\\Mathieu", charset21);
        java.util.Date date23 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = org.apache.commons.io.FileUtils.isFileOlder(file7, date23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No specified date");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(file14);
        org.junit.Assert.assertEquals(file14.getParent(), "hi!");
        org.junit.Assert.assertEquals(file14.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    @Disabled
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        org.apache.commons.io.LineIterator lineIterator11 = org.apache.commons.io.FileUtils.lineIterator(file7);
        boolean boolean13 = org.apache.commons.io.FileUtils.isFileOlder(file7, (-1L));
        java.nio.charset.Charset charset14 = null;
        java.lang.String str15 = org.apache.commons.io.FileUtils.readFileToString(file7, charset14);
        java.io.FileOutputStream fileOutputStream17 = org.apache.commons.io.FileUtils.openOutputStream(file7, false);
        org.apache.commons.io.LineIterator lineIterator18 = org.apache.commons.io.FileUtils.lineIterator(file7);
        org.apache.commons.io.FileUtils.writeStringToFile(file7, "-1 bytes", false);
        java.nio.charset.Charset charset23 = null;
        org.apache.commons.io.FileUtils.write(file7, (java.lang.CharSequence) "32 bytes", charset23);
        long long25 = org.apache.commons.io.FileUtils.checksumCRC32(file7);
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file29 = org.apache.commons.io.FileUtils.getFile(strArray28);
        java.lang.String[] strArray32 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file33 = org.apache.commons.io.FileUtils.getFile(strArray32);
        boolean boolean34 = org.apache.commons.io.FileUtils.isFileOlder(file29, file33);
        boolean boolean36 = org.apache.commons.io.FileUtils.waitFor(file33, (int) '4');
        org.apache.commons.io.LineIterator lineIterator37 = org.apache.commons.io.FileUtils.lineIterator(file33);
        boolean boolean39 = org.apache.commons.io.FileUtils.isFileOlder(file33, (-1L));
        java.nio.charset.Charset charset40 = null;
        java.lang.String str41 = org.apache.commons.io.FileUtils.readFileToString(file33, charset40);
        java.io.FileOutputStream fileOutputStream43 = org.apache.commons.io.FileUtils.openOutputStream(file33, false);
        boolean boolean44 = org.apache.commons.io.FileUtils.isFileOlder(file7, file33);
        boolean boolean45 = org.apache.commons.io.FileUtils.isSymlink(file7);
        java.util.Date date46 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean47 = org.apache.commons.io.FileUtils.isFileNewer(file7, date46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No specified date");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lineIterator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1 bytes" + "'", str15, "-1 bytes");
        org.junit.Assert.assertNotNull(fileOutputStream17);
        org.junit.Assert.assertNotNull(lineIterator18);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 562794089L + "'", long25 == 562794089L);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(file29);
        org.junit.Assert.assertEquals(file29.getParent(), "hi!");
        org.junit.Assert.assertEquals(file29.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(file33);
        org.junit.Assert.assertEquals(file33.getParent(), "hi!");
        org.junit.Assert.assertEquals(file33.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(lineIterator37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "32 bytes" + "'", str41, "32 bytes");
        org.junit.Assert.assertNotNull(fileOutputStream43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        org.apache.commons.io.LineIterator lineIterator11 = org.apache.commons.io.FileUtils.lineIterator(file7);
        boolean boolean12 = org.apache.commons.io.FileUtils.deleteQuietly(file7);
        org.apache.commons.io.FileUtils.forceDeleteOnExit(file7);
        java.math.BigInteger bigInteger14 = org.apache.commons.io.FileUtils.sizeOfAsBigInteger(file7);
        java.lang.String[] strArray26 = new java.lang.String[] { "", "100 bytes", "52 bytes", "1048576 EB", "hi!", "hi!", "-1 bytes", "", "C:\\Users\\Mathieu\\AppData\\Local\\Temp\\", "1 PB", "1 PB" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        org.apache.commons.io.FileUtils.writeLines(file7, (java.util.Collection<java.lang.String>) strList27, true);
        org.apache.commons.io.FileUtils.touch(file7);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lineIterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        org.apache.commons.io.LineIterator lineIterator11 = org.apache.commons.io.FileUtils.lineIterator(file7);
        boolean boolean12 = org.apache.commons.io.FileUtils.deleteQuietly(file7);
        java.io.FileOutputStream fileOutputStream13 = org.apache.commons.io.FileUtils.openOutputStream(file7);
        java.io.FileInputStream fileInputStream14 = org.apache.commons.io.FileUtils.openInputStream(file7);
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file18 = org.apache.commons.io.FileUtils.getFile(strArray17);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file22 = org.apache.commons.io.FileUtils.getFile(strArray21);
        boolean boolean23 = org.apache.commons.io.FileUtils.isFileOlder(file18, file22);
        boolean boolean25 = org.apache.commons.io.FileUtils.waitFor(file22, (int) '4');
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file29 = org.apache.commons.io.FileUtils.getFile(strArray28);
        boolean boolean31 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file22, file29, "");
        org.apache.commons.io.LineIterator lineIterator32 = org.apache.commons.io.FileUtils.lineIterator(file22);
        org.apache.commons.io.LineIterator lineIterator33 = org.apache.commons.io.FileUtils.lineIterator(file22);
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file37 = org.apache.commons.io.FileUtils.getFile(strArray36);
        java.lang.String[] strArray40 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file41 = org.apache.commons.io.FileUtils.getFile(strArray40);
        boolean boolean42 = org.apache.commons.io.FileUtils.isFileOlder(file37, file41);
        boolean boolean44 = org.apache.commons.io.FileUtils.waitFor(file41, (int) '4');
        org.apache.commons.io.LineIterator lineIterator45 = org.apache.commons.io.FileUtils.lineIterator(file41);
        boolean boolean47 = org.apache.commons.io.FileUtils.isFileOlder(file41, (-1L));
        java.nio.charset.Charset charset48 = null;
        java.lang.String str49 = org.apache.commons.io.FileUtils.readFileToString(file41, charset48);
        java.lang.String[] strArray52 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file53 = org.apache.commons.io.FileUtils.getFile(strArray52);
        java.lang.String[] strArray56 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file57 = org.apache.commons.io.FileUtils.getFile(strArray56);
        boolean boolean58 = org.apache.commons.io.FileUtils.isFileOlder(file53, file57);
        boolean boolean60 = org.apache.commons.io.FileUtils.waitFor(file57, (int) '4');
        org.apache.commons.io.LineIterator lineIterator61 = org.apache.commons.io.FileUtils.lineIterator(file57);
        boolean boolean62 = org.apache.commons.io.FileUtils.deleteQuietly(file57);
        org.apache.commons.io.FileUtils.write(file57, (java.lang.CharSequence) "hi!");
        java.nio.charset.Charset charset66 = null;
        org.apache.commons.io.FileUtils.write(file57, (java.lang.CharSequence) "", charset66, true);
        java.nio.charset.Charset charset70 = null;
        org.apache.commons.io.FileUtils.writeStringToFile(file57, "", charset70, false);
        long long73 = org.apache.commons.io.FileUtils.sizeOf(file57);
        org.apache.commons.io.FileUtils.writeStringToFile(file57, "");
        java.nio.charset.Charset charset76 = null;
        java.util.List<java.lang.String> strList77 = org.apache.commons.io.FileUtils.readLines(file57, charset76);
        org.apache.commons.io.FileUtils.writeLines(file41, (java.util.Collection<java.lang.String>) strList77, "hi!");
        boolean boolean80 = org.apache.commons.io.FileUtils.isFileOlder(file22, file41);
        org.apache.commons.io.FileUtils.copyToFile((java.io.InputStream) fileInputStream14, file22);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lineIterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(fileOutputStream13);
        org.junit.Assert.assertNotNull(fileInputStream14);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(file18);
        org.junit.Assert.assertEquals(file18.getParent(), "hi!");
        org.junit.Assert.assertEquals(file18.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(file22);
        org.junit.Assert.assertEquals(file22.getParent(), "hi!");
        org.junit.Assert.assertEquals(file22.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(file29);
        org.junit.Assert.assertEquals(file29.getParent(), "hi!");
        org.junit.Assert.assertEquals(file29.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(lineIterator32);
        org.junit.Assert.assertNotNull(lineIterator33);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(file37);
        org.junit.Assert.assertEquals(file37.getParent(), "hi!");
        org.junit.Assert.assertEquals(file37.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(file41);
        org.junit.Assert.assertEquals(file41.getParent(), "hi!");
        org.junit.Assert.assertEquals(file41.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(lineIterator45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(file53);
        org.junit.Assert.assertEquals(file53.getParent(), "hi!");
        org.junit.Assert.assertEquals(file53.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertNotNull(file57);
        org.junit.Assert.assertEquals(file57.getParent(), "hi!");
        org.junit.Assert.assertEquals(file57.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(lineIterator61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 0L + "'", long73 == 0L);
        org.junit.Assert.assertNotNull(strList77);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.commons.io.FileUtils.checksumCRC32(file0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.File.isDirectory()\" because \"file\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        org.apache.commons.io.LineIterator lineIterator11 = org.apache.commons.io.FileUtils.lineIterator(file7);
        boolean boolean12 = org.apache.commons.io.FileUtils.deleteQuietly(file7);
        org.apache.commons.io.FileUtils.forceDeleteOnExit(file7);
        java.math.BigInteger bigInteger14 = org.apache.commons.io.FileUtils.sizeOfAsBigInteger(file7);
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file18 = org.apache.commons.io.FileUtils.getFile(strArray17);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file22 = org.apache.commons.io.FileUtils.getFile(strArray21);
        boolean boolean23 = org.apache.commons.io.FileUtils.isFileOlder(file18, file22);
        boolean boolean25 = org.apache.commons.io.FileUtils.waitFor(file22, (int) '4');
        org.apache.commons.io.LineIterator lineIterator26 = org.apache.commons.io.FileUtils.lineIterator(file22);
        boolean boolean27 = org.apache.commons.io.FileUtils.deleteQuietly(file22);
        org.apache.commons.io.FileUtils.write(file22, (java.lang.CharSequence) "hi!");
        java.nio.charset.Charset charset31 = null;
        org.apache.commons.io.FileUtils.write(file22, (java.lang.CharSequence) "", charset31, true);
        byte[] byteArray34 = org.apache.commons.io.FileUtils.readFileToByteArray(file22);
        boolean boolean36 = org.apache.commons.io.FileUtils.waitFor(file22, (int) 'a');
        byte[] byteArray37 = org.apache.commons.io.FileUtils.readFileToByteArray(file22);
        java.nio.charset.Charset charset39 = null;
        org.apache.commons.io.FileUtils.write(file22, (java.lang.CharSequence) "-1 bytes", charset39);
        java.nio.charset.Charset charset41 = null;
        java.lang.String str42 = org.apache.commons.io.FileUtils.readFileToString(file22, charset41);
        boolean boolean43 = org.apache.commons.io.FileUtils.contentEquals(file7, file22);
        java.lang.String[] strArray46 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file47 = org.apache.commons.io.FileUtils.getFile(strArray46);
        java.lang.String[] strArray50 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file51 = org.apache.commons.io.FileUtils.getFile(strArray50);
        boolean boolean52 = org.apache.commons.io.FileUtils.isFileOlder(file47, file51);
        boolean boolean53 = org.apache.commons.io.FileUtils.deleteQuietly(file51);
        boolean boolean55 = org.apache.commons.io.FileUtils.isFileNewer(file51, 0L);
        java.nio.charset.Charset charset56 = null;
        java.util.List<java.lang.String> strList57 = org.apache.commons.io.FileUtils.readLines(file51, charset56);
        java.nio.charset.Charset charset59 = null;
        org.apache.commons.io.FileUtils.writeStringToFile(file51, "52 bytes", charset59, true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.FileUtils.copyFileToDirectory(file7, file51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Destination 'hi!\\hi!' is not a directory");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lineIterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(file18);
        org.junit.Assert.assertEquals(file18.getParent(), "hi!");
        org.junit.Assert.assertEquals(file18.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(file22);
        org.junit.Assert.assertEquals(file22.getParent(), "hi!");
        org.junit.Assert.assertEquals(file22.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(lineIterator26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[104, 105, 33]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[104, 105, 33]");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "-1 bytes" + "'", str42, "-1 bytes");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(file47);
        org.junit.Assert.assertEquals(file47.getParent(), "hi!");
        org.junit.Assert.assertEquals(file47.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(file51);
        org.junit.Assert.assertEquals(file51.getParent(), "hi!");
        org.junit.Assert.assertEquals(file51.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(strList57);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        org.apache.commons.io.LineIterator lineIterator11 = org.apache.commons.io.FileUtils.lineIterator(file7);
        boolean boolean12 = org.apache.commons.io.FileUtils.deleteQuietly(file7);
        java.io.FileOutputStream fileOutputStream13 = org.apache.commons.io.FileUtils.openOutputStream(file7);
        java.io.FileInputStream fileInputStream14 = org.apache.commons.io.FileUtils.openInputStream(file7);
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file18 = org.apache.commons.io.FileUtils.getFile(strArray17);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file22 = org.apache.commons.io.FileUtils.getFile(strArray21);
        boolean boolean23 = org.apache.commons.io.FileUtils.isFileOlder(file18, file22);
        boolean boolean25 = org.apache.commons.io.FileUtils.waitFor(file22, (int) '4');
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file29 = org.apache.commons.io.FileUtils.getFile(strArray28);
        boolean boolean31 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file22, file29, "");
        org.apache.commons.io.LineIterator lineIterator32 = org.apache.commons.io.FileUtils.lineIterator(file22);
        org.apache.commons.io.FileUtils.writeStringToFile(file22, "C:\\Users\\Mathieu\\AppData\\Local\\Temp\\", false);
        java.nio.charset.Charset charset37 = null;
        org.apache.commons.io.FileUtils.write(file22, (java.lang.CharSequence) "", charset37, true);
        org.apache.commons.io.FileUtils.touch(file22);
        java.nio.charset.Charset charset42 = null;
        org.apache.commons.io.FileUtils.write(file22, (java.lang.CharSequence) "1 GB1048576 EB1 GBC:\\Users\\Mathieu\\AppData\\Local\\Temp\\1 GBC:\\Users\\Mathieu1 GB1 GB1048576 EB1 GB", charset42);
        org.apache.commons.io.FileUtils.copyInputStreamToFile((java.io.InputStream) fileInputStream14, file22);
        org.apache.commons.io.FileUtils.forceDeleteOnExit(file22);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str47 = org.apache.commons.io.FileUtils.readFileToString(file22, "1048576 EB");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: 1048576 EB");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lineIterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(fileOutputStream13);
        org.junit.Assert.assertNotNull(fileInputStream14);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(file18);
        org.junit.Assert.assertEquals(file18.getParent(), "hi!");
        org.junit.Assert.assertEquals(file18.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(file22);
        org.junit.Assert.assertEquals(file22.getParent(), "hi!");
        org.junit.Assert.assertEquals(file22.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(file29);
        org.junit.Assert.assertEquals(file29.getParent(), "hi!");
        org.junit.Assert.assertEquals(file29.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(lineIterator32);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
        java.lang.Iterable<java.io.File> fileIterable0 = null;
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file4 = org.apache.commons.io.FileUtils.getFile(strArray3);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file8 = org.apache.commons.io.FileUtils.getFile(strArray7);
        boolean boolean9 = org.apache.commons.io.FileUtils.isFileOlder(file4, file8);
        boolean boolean11 = org.apache.commons.io.FileUtils.waitFor(file8, (int) '4');
        org.apache.commons.io.LineIterator lineIterator12 = org.apache.commons.io.FileUtils.lineIterator(file8);
        boolean boolean14 = org.apache.commons.io.FileUtils.isFileOlder(file8, (-1L));
        java.nio.charset.Charset charset15 = null;
        java.lang.String str16 = org.apache.commons.io.FileUtils.readFileToString(file8, charset15);
        java.io.FileOutputStream fileOutputStream18 = org.apache.commons.io.FileUtils.openOutputStream(file8, false);
        org.apache.commons.io.LineIterator lineIterator19 = org.apache.commons.io.FileUtils.lineIterator(file8);
        org.apache.commons.io.FileUtils.writeStringToFile(file8, "-1 bytes", false);
        java.nio.charset.Charset charset24 = null;
        org.apache.commons.io.FileUtils.write(file8, (java.lang.CharSequence) "32 bytes", charset24);
        org.apache.commons.io.FileUtils.write(file8, (java.lang.CharSequence) "C:\\Users\\Mathieu\\AppData\\Local\\Temp\\", false);
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file32 = org.apache.commons.io.FileUtils.getFile(strArray31);
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file36 = org.apache.commons.io.FileUtils.getFile(strArray35);
        boolean boolean37 = org.apache.commons.io.FileUtils.isFileOlder(file32, file36);
        boolean boolean39 = org.apache.commons.io.FileUtils.waitFor(file36, (int) '4');
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file43 = org.apache.commons.io.FileUtils.getFile(strArray42);
        boolean boolean45 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file36, file43, "");
        org.apache.commons.io.LineIterator lineIterator46 = org.apache.commons.io.FileUtils.lineIterator(file36);
        java.lang.String[] strArray49 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file50 = org.apache.commons.io.FileUtils.getFile(strArray49);
        java.lang.String[] strArray53 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file54 = org.apache.commons.io.FileUtils.getFile(strArray53);
        boolean boolean55 = org.apache.commons.io.FileUtils.isFileOlder(file50, file54);
        boolean boolean57 = org.apache.commons.io.FileUtils.waitFor(file54, (int) '4');
        org.apache.commons.io.LineIterator lineIterator58 = org.apache.commons.io.FileUtils.lineIterator(file54);
        boolean boolean59 = org.apache.commons.io.FileUtils.deleteQuietly(file54);
        org.apache.commons.io.FileUtils.write(file54, (java.lang.CharSequence) "hi!");
        java.nio.charset.Charset charset63 = null;
        org.apache.commons.io.FileUtils.write(file54, (java.lang.CharSequence) "", charset63, true);
        java.nio.charset.Charset charset67 = null;
        org.apache.commons.io.FileUtils.writeStringToFile(file54, "", charset67, false);
        long long70 = org.apache.commons.io.FileUtils.sizeOf(file54);
        org.apache.commons.io.FileUtils.writeStringToFile(file54, "");
        java.nio.charset.Charset charset73 = null;
        java.util.List<java.lang.String> strList74 = org.apache.commons.io.FileUtils.readLines(file54, charset73);
        org.apache.commons.io.FileUtils.writeLines(file36, (java.util.Collection<java.lang.String>) strList74);
        org.apache.commons.io.FileUtils.writeLines(file8, (java.util.Collection<java.lang.String>) strList74, true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.FileUtils.copyToDirectory(fileIterable0, file8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: sourceIterable");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(file4);
        org.junit.Assert.assertEquals(file4.getParent(), "hi!");
        org.junit.Assert.assertEquals(file4.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(file8);
        org.junit.Assert.assertEquals(file8.getParent(), "hi!");
        org.junit.Assert.assertEquals(file8.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(lineIterator12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(fileOutputStream18);
        org.junit.Assert.assertNotNull(lineIterator19);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(file32);
        org.junit.Assert.assertEquals(file32.getParent(), "hi!");
        org.junit.Assert.assertEquals(file32.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(file36);
        org.junit.Assert.assertEquals(file36.getParent(), "hi!");
        org.junit.Assert.assertEquals(file36.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(file43);
        org.junit.Assert.assertEquals(file43.getParent(), "hi!");
        org.junit.Assert.assertEquals(file43.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(lineIterator46);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(file50);
        org.junit.Assert.assertEquals(file50.getParent(), "hi!");
        org.junit.Assert.assertEquals(file50.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(file54);
        org.junit.Assert.assertEquals(file54.getParent(), "hi!");
        org.junit.Assert.assertEquals(file54.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(lineIterator58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 0L + "'", long70 == 0L);
        org.junit.Assert.assertNotNull(strList74);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String str4 = org.apache.commons.io.FileUtils.readFileToString(file3);
        boolean boolean5 = org.apache.commons.io.FileUtils.deleteQuietly(file3);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        org.apache.commons.io.LineIterator lineIterator11 = org.apache.commons.io.FileUtils.lineIterator(file7);
        boolean boolean12 = org.apache.commons.io.FileUtils.deleteQuietly(file7);
        org.apache.commons.io.FileUtils.write(file7, (java.lang.CharSequence) "hi!");
        org.apache.commons.io.FileUtils.writeStringToFile(file7, "35 bytes", false);
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file21 = org.apache.commons.io.FileUtils.getFile(strArray20);
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file25 = org.apache.commons.io.FileUtils.getFile(strArray24);
        boolean boolean26 = org.apache.commons.io.FileUtils.isFileOlder(file21, file25);
        boolean boolean28 = org.apache.commons.io.FileUtils.waitFor(file25, (int) '4');
        org.apache.commons.io.LineIterator lineIterator29 = org.apache.commons.io.FileUtils.lineIterator(file25);
        boolean boolean30 = org.apache.commons.io.FileUtils.deleteQuietly(file25);
        org.apache.commons.io.FileUtils.write(file25, (java.lang.CharSequence) "hi!");
        java.nio.charset.Charset charset34 = null;
        org.apache.commons.io.FileUtils.write(file25, (java.lang.CharSequence) "", charset34, true);
        java.nio.charset.Charset charset38 = null;
        org.apache.commons.io.FileUtils.writeStringToFile(file25, "", charset38, false);
        java.lang.String[] strArray43 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file44 = org.apache.commons.io.FileUtils.getFile(strArray43);
        java.lang.String[] strArray47 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file48 = org.apache.commons.io.FileUtils.getFile(strArray47);
        boolean boolean49 = org.apache.commons.io.FileUtils.isFileOlder(file44, file48);
        boolean boolean51 = org.apache.commons.io.FileUtils.waitFor(file48, (int) '4');
        org.apache.commons.io.LineIterator lineIterator52 = org.apache.commons.io.FileUtils.lineIterator(file48);
        boolean boolean53 = org.apache.commons.io.FileUtils.deleteQuietly(file48);
        org.apache.commons.io.FileUtils.write(file48, (java.lang.CharSequence) "hi!");
        java.nio.charset.Charset charset57 = null;
        org.apache.commons.io.FileUtils.write(file48, (java.lang.CharSequence) "", charset57, true);
        byte[] byteArray60 = org.apache.commons.io.FileUtils.readFileToByteArray(file48);
        boolean boolean62 = org.apache.commons.io.FileUtils.waitFor(file48, (int) 'a');
        byte[] byteArray63 = org.apache.commons.io.FileUtils.readFileToByteArray(file48);
        org.apache.commons.io.FileUtils.writeByteArrayToFile(file25, byteArray63);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.FileUtils.writeByteArrayToFile(file7, byteArray63, (int) (byte) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lineIterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(file21);
        org.junit.Assert.assertEquals(file21.getParent(), "hi!");
        org.junit.Assert.assertEquals(file21.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(file25);
        org.junit.Assert.assertEquals(file25.getParent(), "hi!");
        org.junit.Assert.assertEquals(file25.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(lineIterator29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(file44);
        org.junit.Assert.assertEquals(file44.getParent(), "hi!");
        org.junit.Assert.assertEquals(file44.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(file48);
        org.junit.Assert.assertEquals(file48.getParent(), "hi!");
        org.junit.Assert.assertEquals(file48.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(lineIterator52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray60), "[104, 105, 33]");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray63), "[104, 105, 33]");
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file14 = org.apache.commons.io.FileUtils.getFile(strArray13);
        boolean boolean16 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file7, file14, "");
        org.apache.commons.io.LineIterator lineIterator17 = org.apache.commons.io.FileUtils.lineIterator(file7);
        org.apache.commons.io.FileUtils.writeStringToFile(file7, "C:\\Users\\Mathieu\\AppData\\Local\\Temp\\", false);
        java.nio.charset.Charset charset22 = null;
        org.apache.commons.io.FileUtils.write(file7, (java.lang.CharSequence) "", charset22, true);
        boolean boolean26 = org.apache.commons.io.FileUtils.waitFor(file7, 0);
        java.nio.charset.Charset charset27 = null;
        java.lang.String str28 = org.apache.commons.io.FileUtils.readFileToString(file7, charset27);
        long long29 = org.apache.commons.io.FileUtils.checksumCRC32(file7);
        java.lang.String[] strArray32 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file33 = org.apache.commons.io.FileUtils.getFile(strArray32);
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file37 = org.apache.commons.io.FileUtils.getFile(strArray36);
        boolean boolean38 = org.apache.commons.io.FileUtils.isFileOlder(file33, file37);
        boolean boolean40 = org.apache.commons.io.FileUtils.waitFor(file37, (int) '4');
        org.apache.commons.io.LineIterator lineIterator41 = org.apache.commons.io.FileUtils.lineIterator(file37);
        boolean boolean42 = org.apache.commons.io.FileUtils.deleteQuietly(file37);
        org.apache.commons.io.FileUtils.write(file37, (java.lang.CharSequence) "hi!");
        java.nio.charset.Charset charset46 = null;
        org.apache.commons.io.FileUtils.write(file37, (java.lang.CharSequence) "", charset46, true);
        byte[] byteArray49 = org.apache.commons.io.FileUtils.readFileToByteArray(file37);
        java.lang.String[] strArray52 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file53 = org.apache.commons.io.FileUtils.getFile(strArray52);
        java.lang.String[] strArray56 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file57 = org.apache.commons.io.FileUtils.getFile(strArray56);
        boolean boolean58 = org.apache.commons.io.FileUtils.isFileOlder(file53, file57);
        boolean boolean60 = org.apache.commons.io.FileUtils.waitFor(file57, (int) '4');
        org.apache.commons.io.LineIterator lineIterator61 = org.apache.commons.io.FileUtils.lineIterator(file57);
        boolean boolean62 = org.apache.commons.io.FileUtils.deleteQuietly(file57);
        org.apache.commons.io.FileUtils.write(file57, (java.lang.CharSequence) "hi!");
        java.nio.charset.Charset charset66 = null;
        org.apache.commons.io.FileUtils.write(file57, (java.lang.CharSequence) "", charset66, true);
        java.nio.charset.Charset charset70 = null;
        org.apache.commons.io.FileUtils.writeStringToFile(file57, "", charset70, false);
        boolean boolean73 = org.apache.commons.io.FileUtils.isFileNewer(file37, file57);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.FileUtils.copyFile(file7, file57);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Source 'hi!\\hi!' and destination 'hi!\\hi!' are the same");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(file14);
        org.junit.Assert.assertEquals(file14.getParent(), "hi!");
        org.junit.Assert.assertEquals(file14.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(lineIterator17);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "C:\\Users\\Mathieu\\AppData\\Local\\Temp\\" + "'", str28, "C:\\Users\\Mathieu\\AppData\\Local\\Temp\\");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 4154702209L + "'", long29 == 4154702209L);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(file33);
        org.junit.Assert.assertEquals(file33.getParent(), "hi!");
        org.junit.Assert.assertEquals(file33.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(file37);
        org.junit.Assert.assertEquals(file37.getParent(), "hi!");
        org.junit.Assert.assertEquals(file37.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(lineIterator41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[104, 105, 33]");
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(file53);
        org.junit.Assert.assertEquals(file53.getParent(), "hi!");
        org.junit.Assert.assertEquals(file53.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertNotNull(file57);
        org.junit.Assert.assertEquals(file57.getParent(), "hi!");
        org.junit.Assert.assertEquals(file57.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(lineIterator61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        org.apache.commons.io.LineIterator lineIterator11 = org.apache.commons.io.FileUtils.lineIterator(file7);
        boolean boolean12 = org.apache.commons.io.FileUtils.deleteQuietly(file7);
        org.apache.commons.io.FileUtils.writeStringToFile(file7, "");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file18 = org.apache.commons.io.FileUtils.getFile(strArray17);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file22 = org.apache.commons.io.FileUtils.getFile(strArray21);
        boolean boolean23 = org.apache.commons.io.FileUtils.isFileOlder(file18, file22);
        boolean boolean25 = org.apache.commons.io.FileUtils.waitFor(file22, (int) '4');
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file29 = org.apache.commons.io.FileUtils.getFile(strArray28);
        boolean boolean31 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file22, file29, "");
        java.io.FileOutputStream fileOutputStream33 = org.apache.commons.io.FileUtils.openOutputStream(file22, false);
        java.lang.String[] strArray40 = new java.lang.String[] { "", "1048576 EB", "C:\\Users\\Mathieu\\AppData\\Local\\Temp\\", "C:\\Users\\Mathieu", "", "1048576 EB" };
        java.util.ArrayList<java.lang.String> strList41 = new java.util.ArrayList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        org.apache.commons.io.FileUtils.writeLines(file22, (java.util.Collection<java.lang.String>) strList41, "1 GB", false);
        org.apache.commons.io.FileUtils.writeLines(file7, (java.util.Collection<java.lang.String>) strList41, true);
        // The following exception was thrown during execution in test generation
        try {
            long long48 = org.apache.commons.io.FileUtils.sizeOfDirectory(file7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!\\hi! is not a directory");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lineIterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(file18);
        org.junit.Assert.assertEquals(file18.getParent(), "hi!");
        org.junit.Assert.assertEquals(file18.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(file22);
        org.junit.Assert.assertEquals(file22.getParent(), "hi!");
        org.junit.Assert.assertEquals(file22.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(file29);
        org.junit.Assert.assertEquals(file29.getParent(), "hi!");
        org.junit.Assert.assertEquals(file29.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(fileOutputStream33);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
        java.lang.String str1 = org.apache.commons.io.FileUtils.byteCountToDisplaySize(0L);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0 bytes" + "'", str1, "0 bytes");
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        org.apache.commons.io.LineIterator lineIterator11 = org.apache.commons.io.FileUtils.lineIterator(file7);
        boolean boolean13 = org.apache.commons.io.FileUtils.isFileOlder(file7, (-1L));
        java.io.FileOutputStream fileOutputStream15 = org.apache.commons.io.FileUtils.openOutputStream(file7, false);
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file19 = org.apache.commons.io.FileUtils.getFile(strArray18);
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file23 = org.apache.commons.io.FileUtils.getFile(strArray22);
        boolean boolean24 = org.apache.commons.io.FileUtils.isFileOlder(file19, file23);
        boolean boolean26 = org.apache.commons.io.FileUtils.waitFor(file23, (int) '4');
        org.apache.commons.io.LineIterator lineIterator27 = org.apache.commons.io.FileUtils.lineIterator(file23);
        boolean boolean28 = org.apache.commons.io.FileUtils.deleteQuietly(file23);
        org.apache.commons.io.FileUtils.writeStringToFile(file23, "");
        java.lang.String[] strArray33 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file34 = org.apache.commons.io.FileUtils.getFile(strArray33);
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file38 = org.apache.commons.io.FileUtils.getFile(strArray37);
        boolean boolean39 = org.apache.commons.io.FileUtils.isFileOlder(file34, file38);
        boolean boolean41 = org.apache.commons.io.FileUtils.waitFor(file38, (int) '4');
        java.lang.String[] strArray44 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file45 = org.apache.commons.io.FileUtils.getFile(strArray44);
        boolean boolean47 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file38, file45, "");
        boolean boolean48 = org.apache.commons.io.FileUtils.isFileNewer(file23, file38);
        java.io.File file49 = null;
        boolean boolean50 = org.apache.commons.io.FileUtils.contentEquals(file38, file49);
        org.apache.commons.io.FileUtils.touch(file38);
        java.lang.String str52 = org.apache.commons.io.FileUtils.readFileToString(file38);
        boolean boolean53 = org.apache.commons.io.FileUtils.isFileOlder(file7, file38);
        java.io.File file54 = org.apache.commons.io.FileUtils.getUserDirectory();
        org.apache.commons.io.FileUtils.touch(file54);
        java.math.BigInteger bigInteger56 = org.apache.commons.io.FileUtils.sizeOfDirectoryAsBigInteger(file54);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.FileUtils.copyDirectory(file38, file54, true);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Source 'hi!\\hi!' exists but is not a directory");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lineIterator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(fileOutputStream15);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(file19);
        org.junit.Assert.assertEquals(file19.getParent(), "hi!");
        org.junit.Assert.assertEquals(file19.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(file23);
        org.junit.Assert.assertEquals(file23.getParent(), "hi!");
        org.junit.Assert.assertEquals(file23.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(lineIterator27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(file34);
        org.junit.Assert.assertEquals(file34.getParent(), "hi!");
        org.junit.Assert.assertEquals(file34.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(file38);
        org.junit.Assert.assertEquals(file38.getParent(), "hi!");
        org.junit.Assert.assertEquals(file38.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(file45);
        org.junit.Assert.assertEquals(file45.getParent(), "hi!");
        org.junit.Assert.assertEquals(file45.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(file54);
        org.junit.Assert.assertEquals(file54.getParent(), "C:\\Users");
        org.junit.Assert.assertEquals(file54.toString(), "C:\\Users\\Mathieu");
        org.junit.Assert.assertNotNull(bigInteger56);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file14 = org.apache.commons.io.FileUtils.getFile(strArray13);
        boolean boolean16 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file7, file14, "");
        org.apache.commons.io.LineIterator lineIterator17 = org.apache.commons.io.FileUtils.lineIterator(file7);
        org.apache.commons.io.FileUtils.writeStringToFile(file7, "C:\\Users\\Mathieu\\AppData\\Local\\Temp\\", false);
        java.nio.charset.Charset charset22 = null;
        org.apache.commons.io.FileUtils.write(file7, (java.lang.CharSequence) "", charset22, true);
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file28 = org.apache.commons.io.FileUtils.getFile(strArray27);
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file32 = org.apache.commons.io.FileUtils.getFile(strArray31);
        boolean boolean33 = org.apache.commons.io.FileUtils.isFileOlder(file28, file32);
        boolean boolean35 = org.apache.commons.io.FileUtils.waitFor(file32, (int) '4');
        org.apache.commons.io.LineIterator lineIterator36 = org.apache.commons.io.FileUtils.lineIterator(file32);
        boolean boolean37 = org.apache.commons.io.FileUtils.deleteQuietly(file32);
        org.apache.commons.io.FileUtils.write(file32, (java.lang.CharSequence) "hi!");
        java.nio.charset.Charset charset41 = null;
        org.apache.commons.io.FileUtils.write(file32, (java.lang.CharSequence) "", charset41, true);
        byte[] byteArray44 = org.apache.commons.io.FileUtils.readFileToByteArray(file32);
        org.apache.commons.io.FileUtils.writeByteArrayToFile(file7, byteArray44);
        java.nio.charset.Charset charset47 = null;
        org.apache.commons.io.FileUtils.write(file7, (java.lang.CharSequence) "", charset47);
        java.lang.String[] strArray51 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file52 = org.apache.commons.io.FileUtils.getFile(strArray51);
        java.lang.String[] strArray55 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file56 = org.apache.commons.io.FileUtils.getFile(strArray55);
        boolean boolean57 = org.apache.commons.io.FileUtils.isFileOlder(file52, file56);
        boolean boolean59 = org.apache.commons.io.FileUtils.waitFor(file56, (int) '4');
        org.apache.commons.io.LineIterator lineIterator60 = org.apache.commons.io.FileUtils.lineIterator(file56);
        boolean boolean61 = org.apache.commons.io.FileUtils.deleteQuietly(file56);
        org.apache.commons.io.FileUtils.write(file56, (java.lang.CharSequence) "hi!");
        java.nio.charset.Charset charset65 = null;
        org.apache.commons.io.FileUtils.write(file56, (java.lang.CharSequence) "", charset65, true);
        java.nio.charset.Charset charset69 = null;
        org.apache.commons.io.FileUtils.writeStringToFile(file56, "", charset69, false);
        long long72 = org.apache.commons.io.FileUtils.sizeOf(file56);
        org.apache.commons.io.FileUtils.writeStringToFile(file56, "");
        java.nio.charset.Charset charset75 = null;
        java.util.List<java.lang.String> strList76 = org.apache.commons.io.FileUtils.readLines(file56, charset75);
        org.apache.commons.io.FileUtils.writeLines(file7, (java.util.Collection<java.lang.String>) strList76, "hi!");
        java.nio.charset.Charset charset80 = null;
        org.apache.commons.io.FileUtils.write(file7, (java.lang.CharSequence) "32 bytes", charset80);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(file14);
        org.junit.Assert.assertEquals(file14.getParent(), "hi!");
        org.junit.Assert.assertEquals(file14.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(lineIterator17);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(file28);
        org.junit.Assert.assertEquals(file28.getParent(), "hi!");
        org.junit.Assert.assertEquals(file28.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(file32);
        org.junit.Assert.assertEquals(file32.getParent(), "hi!");
        org.junit.Assert.assertEquals(file32.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(lineIterator36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[104, 105, 33]");
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(file52);
        org.junit.Assert.assertEquals(file52.getParent(), "hi!");
        org.junit.Assert.assertEquals(file52.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(file56);
        org.junit.Assert.assertEquals(file56.getParent(), "hi!");
        org.junit.Assert.assertEquals(file56.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(lineIterator60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 0L + "'", long72 == 0L);
        org.junit.Assert.assertNotNull(strList76);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        org.apache.commons.io.LineIterator lineIterator11 = org.apache.commons.io.FileUtils.lineIterator(file7);
        boolean boolean13 = org.apache.commons.io.FileUtils.isFileOlder(file7, (-1L));
        long long14 = org.apache.commons.io.FileUtils.sizeOf(file7);
        java.io.File file15 = org.apache.commons.io.FileUtils.getUserDirectory();
        org.apache.commons.io.FileUtils.copyFileToDirectory(file7, file15, true);
        org.apache.commons.io.FileUtils.write(file7, (java.lang.CharSequence) "hi!", true);
        java.nio.charset.Charset charset22 = null;
        org.apache.commons.io.FileUtils.writeStringToFile(file7, "", charset22, false);
        byte[] byteArray25 = org.apache.commons.io.FileUtils.readFileToByteArray(file7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.FileUtils.forceMkdir(file7);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: File hi!\\hi! exists and is not a directory. Unable to create directory.");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lineIterator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 8L + "'", long14 == 8L);
        org.junit.Assert.assertNotNull(file15);
        org.junit.Assert.assertEquals(file15.getParent(), "C:\\Users");
        org.junit.Assert.assertEquals(file15.toString(), "C:\\Users\\Mathieu");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[]");
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
        java.io.File file0 = null;
        java.lang.String[] strArray1 = new java.lang.String[] {};
        java.io.File file2 = org.apache.commons.io.FileUtils.getFile(strArray1);
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<java.io.File> fileItor5 = org.apache.commons.io.FileUtils.iterateFiles(file0, strArray1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.File.isDirectory()\" because \"directory\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNull(file3);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        org.apache.commons.io.LineIterator lineIterator11 = org.apache.commons.io.FileUtils.lineIterator(file7);
        boolean boolean12 = org.apache.commons.io.FileUtils.deleteQuietly(file7);
        org.apache.commons.io.FileUtils.forceDeleteOnExit(file7);
        java.math.BigInteger bigInteger14 = org.apache.commons.io.FileUtils.sizeOfAsBigInteger(file7);
        java.lang.String[] strArray26 = new java.lang.String[] { "", "100 bytes", "52 bytes", "1048576 EB", "hi!", "hi!", "-1 bytes", "", "C:\\Users\\Mathieu\\AppData\\Local\\Temp\\", "1 PB", "1 PB" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        org.apache.commons.io.FileUtils.writeLines(file7, (java.util.Collection<java.lang.String>) strList27, true);
        java.lang.String[] strArray31 = new java.lang.String[] {};
        java.io.File file32 = org.apache.commons.io.FileUtils.getFile(strArray31);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<java.io.File> fileItor34 = org.apache.commons.io.FileUtils.iterateFiles(file7, strArray31, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'directory' is not a directory: hi!\\hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lineIterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNull(file32);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean9 = org.apache.commons.io.FileUtils.deleteQuietly(file7);
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file13 = org.apache.commons.io.FileUtils.getFile(strArray12);
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file17 = org.apache.commons.io.FileUtils.getFile(strArray16);
        boolean boolean18 = org.apache.commons.io.FileUtils.isFileOlder(file13, file17);
        boolean boolean20 = org.apache.commons.io.FileUtils.waitFor(file17, (int) '4');
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file24 = org.apache.commons.io.FileUtils.getFile(strArray23);
        boolean boolean26 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file17, file24, "");
        org.apache.commons.io.LineIterator lineIterator27 = org.apache.commons.io.FileUtils.lineIterator(file17);
        org.apache.commons.io.FileUtils.writeStringToFile(file17, "C:\\Users\\Mathieu\\AppData\\Local\\Temp\\", false);
        java.nio.charset.Charset charset32 = null;
        org.apache.commons.io.FileUtils.write(file17, (java.lang.CharSequence) "", charset32, true);
        boolean boolean36 = org.apache.commons.io.FileUtils.waitFor(file17, 0);
        boolean boolean37 = org.apache.commons.io.FileUtils.isFileOlder(file7, file17);
        boolean boolean39 = org.apache.commons.io.FileUtils.isFileOlder(file7, 1024L);
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file43 = org.apache.commons.io.FileUtils.getFile(strArray42);
        java.lang.String[] strArray46 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file47 = org.apache.commons.io.FileUtils.getFile(strArray46);
        boolean boolean48 = org.apache.commons.io.FileUtils.isFileOlder(file43, file47);
        java.lang.String[] strArray51 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file52 = org.apache.commons.io.FileUtils.getFile(strArray51);
        java.lang.String[] strArray55 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file56 = org.apache.commons.io.FileUtils.getFile(strArray55);
        boolean boolean57 = org.apache.commons.io.FileUtils.isFileOlder(file52, file56);
        boolean boolean59 = org.apache.commons.io.FileUtils.waitFor(file56, (int) '4');
        java.lang.String[] strArray62 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file63 = org.apache.commons.io.FileUtils.getFile(strArray62);
        boolean boolean65 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file56, file63, "");
        org.apache.commons.io.LineIterator lineIterator66 = org.apache.commons.io.FileUtils.lineIterator(file56);
        org.apache.commons.io.FileUtils.writeStringToFile(file56, "C:\\Users\\Mathieu\\AppData\\Local\\Temp\\", false);
        java.nio.charset.Charset charset71 = null;
        org.apache.commons.io.FileUtils.write(file56, (java.lang.CharSequence) "", charset71, true);
        boolean boolean75 = org.apache.commons.io.FileUtils.waitFor(file56, 0);
        java.nio.charset.Charset charset76 = null;
        java.lang.String str77 = org.apache.commons.io.FileUtils.readFileToString(file56, charset76);
        long long78 = org.apache.commons.io.FileUtils.checksumCRC32(file56);
        boolean boolean79 = org.apache.commons.io.FileUtils.isFileOlder(file43, file56);
        boolean boolean80 = org.apache.commons.io.FileUtils.isFileNewer(file7, file43);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.FileUtils.cleanDirectory(file7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!\\hi! is not a directory");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(file13);
        org.junit.Assert.assertEquals(file13.getParent(), "hi!");
        org.junit.Assert.assertEquals(file13.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(file17);
        org.junit.Assert.assertEquals(file17.getParent(), "hi!");
        org.junit.Assert.assertEquals(file17.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(file24);
        org.junit.Assert.assertEquals(file24.getParent(), "hi!");
        org.junit.Assert.assertEquals(file24.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(lineIterator27);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(file43);
        org.junit.Assert.assertEquals(file43.getParent(), "hi!");
        org.junit.Assert.assertEquals(file43.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(file47);
        org.junit.Assert.assertEquals(file47.getParent(), "hi!");
        org.junit.Assert.assertEquals(file47.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(file52);
        org.junit.Assert.assertEquals(file52.getParent(), "hi!");
        org.junit.Assert.assertEquals(file52.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(file56);
        org.junit.Assert.assertEquals(file56.getParent(), "hi!");
        org.junit.Assert.assertEquals(file56.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertNotNull(file63);
        org.junit.Assert.assertEquals(file63.getParent(), "hi!");
        org.junit.Assert.assertEquals(file63.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(lineIterator66);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "C:\\Users\\Mathieu\\AppData\\Local\\Temp\\" + "'", str77, "C:\\Users\\Mathieu\\AppData\\Local\\Temp\\");
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 4154702209L + "'", long78 == 4154702209L);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file14 = org.apache.commons.io.FileUtils.getFile(strArray13);
        boolean boolean16 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file7, file14, "");
        org.apache.commons.io.LineIterator lineIterator17 = org.apache.commons.io.FileUtils.lineIterator(file7);
        org.apache.commons.io.FileUtils.writeStringToFile(file7, "C:\\Users\\Mathieu\\AppData\\Local\\Temp\\", false);
        java.nio.charset.Charset charset22 = null;
        org.apache.commons.io.FileUtils.write(file7, (java.lang.CharSequence) "", charset22, true);
        org.apache.commons.io.FileUtils.touch(file7);
        java.nio.charset.Charset charset27 = null;
        org.apache.commons.io.FileUtils.write(file7, (java.lang.CharSequence) "1 GB1048576 EB1 GBC:\\Users\\Mathieu\\AppData\\Local\\Temp\\1 GBC:\\Users\\Mathieu1 GB1 GB1048576 EB1 GB", charset27);
        java.io.File file29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.FileUtils.copyDirectory(file7, file29, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: target");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(file14);
        org.junit.Assert.assertEquals(file14.getParent(), "hi!");
        org.junit.Assert.assertEquals(file14.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(lineIterator17);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file14 = org.apache.commons.io.FileUtils.getFile(strArray13);
        boolean boolean16 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file7, file14, "");
        java.io.FileOutputStream fileOutputStream18 = org.apache.commons.io.FileUtils.openOutputStream(file7, false);
        java.util.zip.Checksum checksum19 = null;
        java.util.zip.Checksum checksum20 = org.apache.commons.io.FileUtils.checksum(file7, checksum19);
        java.nio.charset.Charset charset22 = null;
        org.apache.commons.io.FileUtils.write(file7, (java.lang.CharSequence) "hi!", charset22);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.LineIterator lineIterator25 = org.apache.commons.io.FileUtils.lineIterator(file7, "\000\000d\001");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ??d?");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(file14);
        org.junit.Assert.assertEquals(file14.getParent(), "hi!");
        org.junit.Assert.assertEquals(file14.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(fileOutputStream18);
        org.junit.Assert.assertNull(checksum20);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        org.apache.commons.io.LineIterator lineIterator11 = org.apache.commons.io.FileUtils.lineIterator(file7);
        boolean boolean12 = org.apache.commons.io.FileUtils.deleteQuietly(file7);
        java.io.FileOutputStream fileOutputStream13 = org.apache.commons.io.FileUtils.openOutputStream(file7);
        java.math.BigInteger bigInteger14 = org.apache.commons.io.FileUtils.sizeOfAsBigInteger(file7);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lineIterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(fileOutputStream13);
        org.junit.Assert.assertNotNull(bigInteger14);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file14 = org.apache.commons.io.FileUtils.getFile(strArray13);
        boolean boolean16 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file7, file14, "");
        org.apache.commons.io.LineIterator lineIterator17 = org.apache.commons.io.FileUtils.lineIterator(file7);
        org.apache.commons.io.FileUtils.writeStringToFile(file7, "C:\\Users\\Mathieu\\AppData\\Local\\Temp\\", false);
        java.nio.charset.Charset charset22 = null;
        org.apache.commons.io.FileUtils.write(file7, (java.lang.CharSequence) "", charset22, true);
        org.apache.commons.io.FileUtils.touch(file7);
        java.lang.String[] strArray28 = new java.lang.String[] { "0 bytes", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.io.File> fileCollection30 = org.apache.commons.io.FileUtils.listFiles(file7, strArray28, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'directory' is not a directory: hi!\\hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(file14);
        org.junit.Assert.assertEquals(file14.getParent(), "hi!");
        org.junit.Assert.assertEquals(file14.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(lineIterator17);
        org.junit.Assert.assertNotNull(strArray28);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
        java.io.InputStream inputStream0 = null;
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file4 = org.apache.commons.io.FileUtils.getFile(strArray3);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file8 = org.apache.commons.io.FileUtils.getFile(strArray7);
        boolean boolean9 = org.apache.commons.io.FileUtils.isFileOlder(file4, file8);
        boolean boolean11 = org.apache.commons.io.FileUtils.waitFor(file8, (int) '4');
        org.apache.commons.io.LineIterator lineIterator12 = org.apache.commons.io.FileUtils.lineIterator(file8);
        boolean boolean13 = org.apache.commons.io.FileUtils.deleteQuietly(file8);
        org.apache.commons.io.FileUtils.write(file8, (java.lang.CharSequence) "hi!");
        java.nio.charset.Charset charset17 = null;
        org.apache.commons.io.FileUtils.write(file8, (java.lang.CharSequence) "", charset17, true);
        java.nio.charset.Charset charset21 = null;
        org.apache.commons.io.FileUtils.writeStringToFile(file8, "", charset21, false);
        long long24 = org.apache.commons.io.FileUtils.sizeOf(file8);
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file28 = org.apache.commons.io.FileUtils.getFile(strArray27);
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file32 = org.apache.commons.io.FileUtils.getFile(strArray31);
        boolean boolean33 = org.apache.commons.io.FileUtils.isFileOlder(file28, file32);
        boolean boolean35 = org.apache.commons.io.FileUtils.waitFor(file32, (int) '4');
        org.apache.commons.io.LineIterator lineIterator36 = org.apache.commons.io.FileUtils.lineIterator(file32);
        boolean boolean37 = org.apache.commons.io.FileUtils.deleteQuietly(file32);
        org.apache.commons.io.FileUtils.write(file32, (java.lang.CharSequence) "hi!");
        java.nio.charset.Charset charset41 = null;
        org.apache.commons.io.FileUtils.write(file32, (java.lang.CharSequence) "", charset41, true);
        java.nio.charset.Charset charset45 = null;
        org.apache.commons.io.FileUtils.writeStringToFile(file32, "", charset45, false);
        long long48 = org.apache.commons.io.FileUtils.sizeOf(file32);
        org.apache.commons.io.FileUtils.writeStringToFile(file32, "");
        boolean boolean52 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file8, file32, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.FileUtils.copyToFile(inputStream0, file8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(file4);
        org.junit.Assert.assertEquals(file4.getParent(), "hi!");
        org.junit.Assert.assertEquals(file4.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(file8);
        org.junit.Assert.assertEquals(file8.getParent(), "hi!");
        org.junit.Assert.assertEquals(file8.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(lineIterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(file28);
        org.junit.Assert.assertEquals(file28.getParent(), "hi!");
        org.junit.Assert.assertEquals(file28.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(file32);
        org.junit.Assert.assertEquals(file32.getParent(), "hi!");
        org.junit.Assert.assertEquals(file32.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(lineIterator36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test592");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file14 = org.apache.commons.io.FileUtils.getFile(strArray13);
        boolean boolean16 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file7, file14, "");
        java.io.FileOutputStream fileOutputStream18 = org.apache.commons.io.FileUtils.openOutputStream(file7, false);
        org.apache.commons.io.filefilter.IOFileFilter iOFileFilter19 = null;
        org.apache.commons.io.filefilter.IOFileFilter iOFileFilter20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.io.File> fileCollection21 = org.apache.commons.io.FileUtils.listFiles(file7, iOFileFilter19, iOFileFilter20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'directory' is not a directory: hi!\\hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(file14);
        org.junit.Assert.assertEquals(file14.getParent(), "hi!");
        org.junit.Assert.assertEquals(file14.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(fileOutputStream18);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test593");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        org.apache.commons.io.LineIterator lineIterator11 = org.apache.commons.io.FileUtils.lineIterator(file7);
        boolean boolean13 = org.apache.commons.io.FileUtils.isFileOlder(file7, (-1L));
        java.nio.charset.Charset charset14 = null;
        java.lang.String str15 = org.apache.commons.io.FileUtils.readFileToString(file7, charset14);
        java.io.FileOutputStream fileOutputStream17 = org.apache.commons.io.FileUtils.openOutputStream(file7, false);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file22 = org.apache.commons.io.FileUtils.getFile(strArray21);
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file26 = org.apache.commons.io.FileUtils.getFile(strArray25);
        boolean boolean27 = org.apache.commons.io.FileUtils.isFileOlder(file22, file26);
        boolean boolean29 = org.apache.commons.io.FileUtils.waitFor(file26, (int) '4');
        org.apache.commons.io.LineIterator lineIterator30 = org.apache.commons.io.FileUtils.lineIterator(file26);
        boolean boolean31 = org.apache.commons.io.FileUtils.deleteQuietly(file26);
        org.apache.commons.io.FileUtils.write(file26, (java.lang.CharSequence) "hi!");
        java.nio.charset.Charset charset35 = null;
        org.apache.commons.io.FileUtils.write(file26, (java.lang.CharSequence) "", charset35, true);
        java.nio.charset.Charset charset39 = null;
        org.apache.commons.io.FileUtils.writeStringToFile(file26, "", charset39, false);
        java.lang.String[] strArray44 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file45 = org.apache.commons.io.FileUtils.getFile(strArray44);
        java.lang.String[] strArray48 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file49 = org.apache.commons.io.FileUtils.getFile(strArray48);
        boolean boolean50 = org.apache.commons.io.FileUtils.isFileOlder(file45, file49);
        boolean boolean52 = org.apache.commons.io.FileUtils.waitFor(file49, (int) '4');
        org.apache.commons.io.LineIterator lineIterator53 = org.apache.commons.io.FileUtils.lineIterator(file49);
        boolean boolean54 = org.apache.commons.io.FileUtils.deleteQuietly(file49);
        org.apache.commons.io.FileUtils.write(file49, (java.lang.CharSequence) "hi!");
        java.nio.charset.Charset charset58 = null;
        org.apache.commons.io.FileUtils.write(file49, (java.lang.CharSequence) "", charset58, true);
        byte[] byteArray61 = org.apache.commons.io.FileUtils.readFileToByteArray(file49);
        boolean boolean63 = org.apache.commons.io.FileUtils.waitFor(file49, (int) 'a');
        byte[] byteArray64 = org.apache.commons.io.FileUtils.readFileToByteArray(file49);
        org.apache.commons.io.FileUtils.writeByteArrayToFile(file26, byteArray64);
        java.lang.String[] strArray68 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file69 = org.apache.commons.io.FileUtils.getFile(strArray68);
        java.lang.String[] strArray72 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file73 = org.apache.commons.io.FileUtils.getFile(strArray72);
        boolean boolean74 = org.apache.commons.io.FileUtils.isFileOlder(file69, file73);
        boolean boolean76 = org.apache.commons.io.FileUtils.waitFor(file73, (int) '4');
        org.apache.commons.io.LineIterator lineIterator77 = org.apache.commons.io.FileUtils.lineIterator(file73);
        boolean boolean78 = org.apache.commons.io.FileUtils.deleteQuietly(file73);
        org.apache.commons.io.FileUtils.write(file73, (java.lang.CharSequence) "hi!");
        java.nio.charset.Charset charset82 = null;
        org.apache.commons.io.FileUtils.write(file73, (java.lang.CharSequence) "", charset82, true);
        java.nio.charset.Charset charset86 = null;
        org.apache.commons.io.FileUtils.writeStringToFile(file73, "", charset86, false);
        long long89 = org.apache.commons.io.FileUtils.sizeOf(file73);
        org.apache.commons.io.FileUtils.writeStringToFile(file73, "");
        java.nio.charset.Charset charset92 = null;
        java.util.List<java.lang.String> strList93 = org.apache.commons.io.FileUtils.readLines(file73, charset92);
        org.apache.commons.io.FileUtils.writeLines(file26, (java.util.Collection<java.lang.String>) strList93, "32 bytes");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.FileUtils.writeLines(file7, "0 bytes", (java.util.Collection<java.lang.String>) strList93, true);
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: 0 bytes");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lineIterator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(fileOutputStream17);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(file22);
        org.junit.Assert.assertEquals(file22.getParent(), "hi!");
        org.junit.Assert.assertEquals(file22.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(file26);
        org.junit.Assert.assertEquals(file26.getParent(), "hi!");
        org.junit.Assert.assertEquals(file26.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(lineIterator30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(file45);
        org.junit.Assert.assertEquals(file45.getParent(), "hi!");
        org.junit.Assert.assertEquals(file45.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(file49);
        org.junit.Assert.assertEquals(file49.getParent(), "hi!");
        org.junit.Assert.assertEquals(file49.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(lineIterator53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[104, 105, 33]");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray64), "[104, 105, 33]");
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(file69);
        org.junit.Assert.assertEquals(file69.getParent(), "hi!");
        org.junit.Assert.assertEquals(file69.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertNotNull(file73);
        org.junit.Assert.assertEquals(file73.getParent(), "hi!");
        org.junit.Assert.assertEquals(file73.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(lineIterator77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + long89 + "' != '" + 0L + "'", long89 == 0L);
        org.junit.Assert.assertNotNull(strList93);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test594");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        org.apache.commons.io.LineIterator lineIterator11 = org.apache.commons.io.FileUtils.lineIterator(file7);
        boolean boolean12 = org.apache.commons.io.FileUtils.deleteQuietly(file7);
        org.apache.commons.io.FileUtils.write(file7, (java.lang.CharSequence) "hi!");
        java.nio.charset.Charset charset16 = null;
        org.apache.commons.io.FileUtils.write(file7, (java.lang.CharSequence) "", charset16, true);
        java.nio.charset.Charset charset20 = null;
        org.apache.commons.io.FileUtils.writeStringToFile(file7, "", charset20, false);
        java.io.FileOutputStream fileOutputStream23 = org.apache.commons.io.FileUtils.openOutputStream(file7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.FileUtils.write(file7, (java.lang.CharSequence) "1048576 EB", "1 GB");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: 1 GB");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lineIterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(fileOutputStream23);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test595");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        org.apache.commons.io.LineIterator lineIterator11 = org.apache.commons.io.FileUtils.lineIterator(file7);
        boolean boolean13 = org.apache.commons.io.FileUtils.isFileOlder(file7, (-1L));
        java.nio.charset.Charset charset14 = null;
        java.lang.String str15 = org.apache.commons.io.FileUtils.readFileToString(file7, charset14);
        java.io.FileOutputStream fileOutputStream17 = org.apache.commons.io.FileUtils.openOutputStream(file7, false);
        org.apache.commons.io.LineIterator lineIterator18 = org.apache.commons.io.FileUtils.lineIterator(file7);
        org.apache.commons.io.FileUtils.writeStringToFile(file7, "-1 bytes", false);
        java.nio.charset.Charset charset23 = null;
        org.apache.commons.io.FileUtils.write(file7, (java.lang.CharSequence) "32 bytes", charset23);
        long long25 = org.apache.commons.io.FileUtils.checksumCRC32(file7);
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file29 = org.apache.commons.io.FileUtils.getFile(strArray28);
        java.lang.String[] strArray32 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file33 = org.apache.commons.io.FileUtils.getFile(strArray32);
        boolean boolean34 = org.apache.commons.io.FileUtils.isFileOlder(file29, file33);
        boolean boolean36 = org.apache.commons.io.FileUtils.waitFor(file33, (int) '4');
        org.apache.commons.io.LineIterator lineIterator37 = org.apache.commons.io.FileUtils.lineIterator(file33);
        boolean boolean39 = org.apache.commons.io.FileUtils.isFileOlder(file33, (-1L));
        java.nio.charset.Charset charset40 = null;
        java.lang.String str41 = org.apache.commons.io.FileUtils.readFileToString(file33, charset40);
        java.io.FileOutputStream fileOutputStream43 = org.apache.commons.io.FileUtils.openOutputStream(file33, false);
        boolean boolean44 = org.apache.commons.io.FileUtils.isFileOlder(file7, file33);
        org.apache.commons.io.FileUtils.forceDeleteOnExit(file33);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lineIterator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(fileOutputStream17);
        org.junit.Assert.assertNotNull(lineIterator18);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 562794089L + "'", long25 == 562794089L);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(file29);
        org.junit.Assert.assertEquals(file29.getParent(), "hi!");
        org.junit.Assert.assertEquals(file29.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(file33);
        org.junit.Assert.assertEquals(file33.getParent(), "hi!");
        org.junit.Assert.assertEquals(file33.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(lineIterator37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "32 bytes" + "'", str41, "32 bytes");
        org.junit.Assert.assertNotNull(fileOutputStream43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test596");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.FileUtils.writeStringToFile(file0, "0 bytes", "hi!\000\000d\001");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!??d?");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test597");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        java.lang.String str9 = org.apache.commons.io.FileUtils.readFileToString(file3);
        org.apache.commons.io.FileUtils.writeStringToFile(file3, "", false);
        long long13 = org.apache.commons.io.FileUtils.sizeOf(file3);
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file17 = org.apache.commons.io.FileUtils.getFile(strArray16);
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file21 = org.apache.commons.io.FileUtils.getFile(strArray20);
        boolean boolean22 = org.apache.commons.io.FileUtils.isFileOlder(file17, file21);
        boolean boolean24 = org.apache.commons.io.FileUtils.waitFor(file21, (int) '4');
        org.apache.commons.io.LineIterator lineIterator25 = org.apache.commons.io.FileUtils.lineIterator(file21);
        boolean boolean26 = org.apache.commons.io.FileUtils.deleteQuietly(file21);
        org.apache.commons.io.FileUtils.write(file21, (java.lang.CharSequence) "hi!");
        java.nio.charset.Charset charset30 = null;
        org.apache.commons.io.FileUtils.write(file21, (java.lang.CharSequence) "", charset30, true);
        java.nio.charset.Charset charset34 = null;
        org.apache.commons.io.FileUtils.writeStringToFile(file21, "", charset34, false);
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file40 = org.apache.commons.io.FileUtils.getFile(strArray39);
        java.lang.String[] strArray43 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file44 = org.apache.commons.io.FileUtils.getFile(strArray43);
        boolean boolean45 = org.apache.commons.io.FileUtils.isFileOlder(file40, file44);
        boolean boolean47 = org.apache.commons.io.FileUtils.waitFor(file44, (int) '4');
        java.lang.String[] strArray50 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file51 = org.apache.commons.io.FileUtils.getFile(strArray50);
        boolean boolean53 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file44, file51, "");
        java.io.FileOutputStream fileOutputStream55 = org.apache.commons.io.FileUtils.openOutputStream(file44, false);
        java.lang.String[] strArray62 = new java.lang.String[] { "", "1048576 EB", "C:\\Users\\Mathieu\\AppData\\Local\\Temp\\", "C:\\Users\\Mathieu", "", "1048576 EB" };
        java.util.ArrayList<java.lang.String> strList63 = new java.util.ArrayList<java.lang.String>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList63, strArray62);
        org.apache.commons.io.FileUtils.writeLines(file44, (java.util.Collection<java.lang.String>) strList63, "1 GB", false);
        org.apache.commons.io.FileUtils.writeLines(file21, (java.util.Collection<java.lang.String>) strList63, "35 bytes");
        java.lang.String[] strArray72 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file73 = org.apache.commons.io.FileUtils.getFile(strArray72);
        java.lang.String[] strArray76 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file77 = org.apache.commons.io.FileUtils.getFile(strArray76);
        boolean boolean78 = org.apache.commons.io.FileUtils.isFileOlder(file73, file77);
        boolean boolean80 = org.apache.commons.io.FileUtils.waitFor(file77, (int) '4');
        java.lang.String[] strArray83 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file84 = org.apache.commons.io.FileUtils.getFile(strArray83);
        boolean boolean86 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file77, file84, "");
        org.apache.commons.io.FileUtils.writeStringToFile(file77, "", false);
        org.apache.commons.io.FileUtils.forceDeleteOnExit(file77);
        boolean boolean91 = org.apache.commons.io.FileUtils.isFileOlder(file21, file77);
        boolean boolean93 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file3, file21, "35 bytes");
        long long94 = org.apache.commons.io.FileUtils.sizeOf(file3);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(file17);
        org.junit.Assert.assertEquals(file17.getParent(), "hi!");
        org.junit.Assert.assertEquals(file17.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(file21);
        org.junit.Assert.assertEquals(file21.getParent(), "hi!");
        org.junit.Assert.assertEquals(file21.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(lineIterator25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(file40);
        org.junit.Assert.assertEquals(file40.getParent(), "hi!");
        org.junit.Assert.assertEquals(file40.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(file44);
        org.junit.Assert.assertEquals(file44.getParent(), "hi!");
        org.junit.Assert.assertEquals(file44.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(file51);
        org.junit.Assert.assertEquals(file51.getParent(), "hi!");
        org.junit.Assert.assertEquals(file51.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(fileOutputStream55);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertNotNull(file73);
        org.junit.Assert.assertEquals(file73.getParent(), "hi!");
        org.junit.Assert.assertEquals(file73.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertNotNull(file77);
        org.junit.Assert.assertEquals(file77.getParent(), "hi!");
        org.junit.Assert.assertEquals(file77.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertNotNull(file84);
        org.junit.Assert.assertEquals(file84.getParent(), "hi!");
        org.junit.Assert.assertEquals(file84.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertTrue("'" + long94 + "' != '" + 0L + "'", long94 == 0L);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test598");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        org.apache.commons.io.LineIterator lineIterator11 = org.apache.commons.io.FileUtils.lineIterator(file7);
        boolean boolean12 = org.apache.commons.io.FileUtils.deleteQuietly(file7);
        org.apache.commons.io.FileUtils.write(file7, (java.lang.CharSequence) "hi!");
        long long15 = org.apache.commons.io.FileUtils.sizeOf(file7);
        java.io.FileOutputStream fileOutputStream16 = org.apache.commons.io.FileUtils.openOutputStream(file7);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lineIterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 3L + "'", long15 == 3L);
        org.junit.Assert.assertNotNull(fileOutputStream16);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test599");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        org.apache.commons.io.LineIterator lineIterator11 = org.apache.commons.io.FileUtils.lineIterator(file7);
        boolean boolean12 = org.apache.commons.io.FileUtils.deleteQuietly(file7);
        org.apache.commons.io.FileUtils.write(file7, (java.lang.CharSequence) "hi!");
        java.nio.charset.Charset charset16 = null;
        org.apache.commons.io.FileUtils.write(file7, (java.lang.CharSequence) "", charset16, true);
        byte[] byteArray19 = org.apache.commons.io.FileUtils.readFileToByteArray(file7);
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file23 = org.apache.commons.io.FileUtils.getFile(strArray22);
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file27 = org.apache.commons.io.FileUtils.getFile(strArray26);
        boolean boolean28 = org.apache.commons.io.FileUtils.isFileOlder(file23, file27);
        boolean boolean30 = org.apache.commons.io.FileUtils.waitFor(file27, (int) '4');
        org.apache.commons.io.LineIterator lineIterator31 = org.apache.commons.io.FileUtils.lineIterator(file27);
        boolean boolean32 = org.apache.commons.io.FileUtils.deleteQuietly(file27);
        org.apache.commons.io.FileUtils.write(file27, (java.lang.CharSequence) "hi!");
        java.nio.charset.Charset charset36 = null;
        org.apache.commons.io.FileUtils.write(file27, (java.lang.CharSequence) "", charset36, true);
        java.nio.charset.Charset charset40 = null;
        org.apache.commons.io.FileUtils.writeStringToFile(file27, "", charset40, false);
        boolean boolean43 = org.apache.commons.io.FileUtils.isFileNewer(file7, file27);
        java.nio.charset.Charset charset45 = null;
        org.apache.commons.io.FileUtils.write(file7, (java.lang.CharSequence) "-1 bytes", charset45);
        org.apache.commons.io.FileUtils.touch(file7);
        java.lang.String[] strArray51 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file52 = org.apache.commons.io.FileUtils.getFile(strArray51);
        java.lang.String[] strArray55 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file56 = org.apache.commons.io.FileUtils.getFile(strArray55);
        boolean boolean57 = org.apache.commons.io.FileUtils.isFileOlder(file52, file56);
        boolean boolean59 = org.apache.commons.io.FileUtils.waitFor(file56, (int) '4');
        java.lang.String[] strArray62 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file63 = org.apache.commons.io.FileUtils.getFile(strArray62);
        boolean boolean65 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file56, file63, "");
        org.apache.commons.io.LineIterator lineIterator66 = org.apache.commons.io.FileUtils.lineIterator(file56);
        java.lang.String[] strArray69 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file70 = org.apache.commons.io.FileUtils.getFile(strArray69);
        java.lang.String[] strArray73 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file74 = org.apache.commons.io.FileUtils.getFile(strArray73);
        boolean boolean75 = org.apache.commons.io.FileUtils.isFileOlder(file70, file74);
        boolean boolean77 = org.apache.commons.io.FileUtils.waitFor(file74, (int) '4');
        org.apache.commons.io.LineIterator lineIterator78 = org.apache.commons.io.FileUtils.lineIterator(file74);
        boolean boolean79 = org.apache.commons.io.FileUtils.deleteQuietly(file74);
        org.apache.commons.io.FileUtils.write(file74, (java.lang.CharSequence) "hi!");
        java.nio.charset.Charset charset83 = null;
        org.apache.commons.io.FileUtils.write(file74, (java.lang.CharSequence) "", charset83, true);
        java.nio.charset.Charset charset87 = null;
        org.apache.commons.io.FileUtils.writeStringToFile(file74, "", charset87, false);
        long long90 = org.apache.commons.io.FileUtils.sizeOf(file74);
        org.apache.commons.io.FileUtils.writeStringToFile(file74, "");
        java.nio.charset.Charset charset93 = null;
        java.util.List<java.lang.String> strList94 = org.apache.commons.io.FileUtils.readLines(file74, charset93);
        org.apache.commons.io.FileUtils.writeLines(file56, (java.util.Collection<java.lang.String>) strList94);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.FileUtils.writeLines(file7, "", (java.util.Collection<java.lang.String>) strList94, true);
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lineIterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[104, 105, 33]");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(file23);
        org.junit.Assert.assertEquals(file23.getParent(), "hi!");
        org.junit.Assert.assertEquals(file23.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(file27);
        org.junit.Assert.assertEquals(file27.getParent(), "hi!");
        org.junit.Assert.assertEquals(file27.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(lineIterator31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(file52);
        org.junit.Assert.assertEquals(file52.getParent(), "hi!");
        org.junit.Assert.assertEquals(file52.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(file56);
        org.junit.Assert.assertEquals(file56.getParent(), "hi!");
        org.junit.Assert.assertEquals(file56.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertNotNull(file63);
        org.junit.Assert.assertEquals(file63.getParent(), "hi!");
        org.junit.Assert.assertEquals(file63.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(lineIterator66);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertNotNull(file70);
        org.junit.Assert.assertEquals(file70.getParent(), "hi!");
        org.junit.Assert.assertEquals(file70.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertNotNull(file74);
        org.junit.Assert.assertEquals(file74.getParent(), "hi!");
        org.junit.Assert.assertEquals(file74.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(lineIterator78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + long90 + "' != '" + 0L + "'", long90 == 0L);
        org.junit.Assert.assertNotNull(strList94);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test600");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        org.apache.commons.io.LineIterator lineIterator11 = org.apache.commons.io.FileUtils.lineIterator(file7);
        long long12 = org.apache.commons.io.FileUtils.checksumCRC32(file7);
        org.apache.commons.io.FileUtils.writeStringToFile(file7, "1 GB", true);
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file20 = org.apache.commons.io.FileUtils.getFile(strArray19);
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file24 = org.apache.commons.io.FileUtils.getFile(strArray23);
        boolean boolean25 = org.apache.commons.io.FileUtils.isFileOlder(file20, file24);
        boolean boolean27 = org.apache.commons.io.FileUtils.waitFor(file24, (int) '4');
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file31 = org.apache.commons.io.FileUtils.getFile(strArray30);
        boolean boolean33 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file24, file31, "");
        java.io.FileOutputStream fileOutputStream35 = org.apache.commons.io.FileUtils.openOutputStream(file24, false);
        java.lang.String[] strArray42 = new java.lang.String[] { "", "1048576 EB", "C:\\Users\\Mathieu\\AppData\\Local\\Temp\\", "C:\\Users\\Mathieu", "", "1048576 EB" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        org.apache.commons.io.FileUtils.writeLines(file24, (java.util.Collection<java.lang.String>) strList43, "1 GB", false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.FileUtils.writeLines(file7, "\000\000d\001", (java.util.Collection<java.lang.String>) strList43, "", false);
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ??d?");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lineIterator11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(file20);
        org.junit.Assert.assertEquals(file20.getParent(), "hi!");
        org.junit.Assert.assertEquals(file20.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(file24);
        org.junit.Assert.assertEquals(file24.getParent(), "hi!");
        org.junit.Assert.assertEquals(file24.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(file31);
        org.junit.Assert.assertEquals(file31.getParent(), "hi!");
        org.junit.Assert.assertEquals(file31.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(fileOutputStream35);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test601");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        org.apache.commons.io.LineIterator lineIterator11 = org.apache.commons.io.FileUtils.lineIterator(file7);
        boolean boolean13 = org.apache.commons.io.FileUtils.isFileOlder(file7, (-1L));
        long long14 = org.apache.commons.io.FileUtils.sizeOf(file7);
        java.io.File file15 = org.apache.commons.io.FileUtils.getUserDirectory();
        org.apache.commons.io.FileUtils.copyFileToDirectory(file7, file15, true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.FileUtils.writeStringToFile(file7, "C:\\Users\\Mathieu\\AppData\\Local\\Temp\\\r\n\r\n", "-1 bytes", true);
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: -1 bytes");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lineIterator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(file15);
        org.junit.Assert.assertEquals(file15.getParent(), "C:\\Users");
        org.junit.Assert.assertEquals(file15.toString(), "C:\\Users\\Mathieu");
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test602");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        org.apache.commons.io.LineIterator lineIterator11 = org.apache.commons.io.FileUtils.lineIterator(file7);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file15 = org.apache.commons.io.FileUtils.getFile(strArray14);
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file19 = org.apache.commons.io.FileUtils.getFile(strArray18);
        boolean boolean20 = org.apache.commons.io.FileUtils.isFileOlder(file15, file19);
        boolean boolean22 = org.apache.commons.io.FileUtils.waitFor(file19, (int) '4');
        org.apache.commons.io.LineIterator lineIterator23 = org.apache.commons.io.FileUtils.lineIterator(file19);
        boolean boolean24 = org.apache.commons.io.FileUtils.deleteQuietly(file19);
        org.apache.commons.io.FileUtils.write(file19, (java.lang.CharSequence) "hi!");
        java.nio.charset.Charset charset28 = null;
        org.apache.commons.io.FileUtils.write(file19, (java.lang.CharSequence) "", charset28, true);
        byte[] byteArray31 = org.apache.commons.io.FileUtils.readFileToByteArray(file19);
        boolean boolean33 = org.apache.commons.io.FileUtils.waitFor(file19, (int) 'a');
        byte[] byteArray34 = org.apache.commons.io.FileUtils.readFileToByteArray(file19);
        org.apache.commons.io.FileUtils.writeByteArrayToFile(file7, byteArray34);
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file39 = org.apache.commons.io.FileUtils.getFile(strArray38);
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file43 = org.apache.commons.io.FileUtils.getFile(strArray42);
        boolean boolean44 = org.apache.commons.io.FileUtils.isFileOlder(file39, file43);
        boolean boolean46 = org.apache.commons.io.FileUtils.waitFor(file43, (int) '4');
        org.apache.commons.io.LineIterator lineIterator47 = org.apache.commons.io.FileUtils.lineIterator(file43);
        boolean boolean48 = org.apache.commons.io.FileUtils.deleteQuietly(file43);
        org.apache.commons.io.FileUtils.write(file43, (java.lang.CharSequence) "hi!");
        java.nio.charset.Charset charset52 = null;
        org.apache.commons.io.FileUtils.write(file43, (java.lang.CharSequence) "", charset52, true);
        java.nio.charset.Charset charset56 = null;
        org.apache.commons.io.FileUtils.writeStringToFile(file43, "", charset56, false);
        long long59 = org.apache.commons.io.FileUtils.sizeOf(file43);
        java.lang.String[] strArray62 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file63 = org.apache.commons.io.FileUtils.getFile(strArray62);
        java.lang.String[] strArray66 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file67 = org.apache.commons.io.FileUtils.getFile(strArray66);
        boolean boolean68 = org.apache.commons.io.FileUtils.isFileOlder(file63, file67);
        boolean boolean70 = org.apache.commons.io.FileUtils.waitFor(file67, (int) '4');
        org.apache.commons.io.LineIterator lineIterator71 = org.apache.commons.io.FileUtils.lineIterator(file67);
        boolean boolean72 = org.apache.commons.io.FileUtils.deleteQuietly(file67);
        org.apache.commons.io.FileUtils.write(file67, (java.lang.CharSequence) "hi!");
        java.nio.charset.Charset charset76 = null;
        org.apache.commons.io.FileUtils.write(file67, (java.lang.CharSequence) "", charset76, true);
        java.nio.charset.Charset charset80 = null;
        org.apache.commons.io.FileUtils.writeStringToFile(file67, "", charset80, false);
        long long83 = org.apache.commons.io.FileUtils.sizeOf(file67);
        org.apache.commons.io.FileUtils.writeStringToFile(file67, "");
        boolean boolean87 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file43, file67, "hi!");
        boolean boolean89 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file7, file43, "100 bytes");
        org.apache.commons.io.FileUtils.write(file43, (java.lang.CharSequence) "hi!\000\000d\001");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lineIterator11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(file15);
        org.junit.Assert.assertEquals(file15.getParent(), "hi!");
        org.junit.Assert.assertEquals(file15.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(file19);
        org.junit.Assert.assertEquals(file19.getParent(), "hi!");
        org.junit.Assert.assertEquals(file19.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(lineIterator23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[104, 105, 33]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[104, 105, 33]");
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(file39);
        org.junit.Assert.assertEquals(file39.getParent(), "hi!");
        org.junit.Assert.assertEquals(file39.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(file43);
        org.junit.Assert.assertEquals(file43.getParent(), "hi!");
        org.junit.Assert.assertEquals(file43.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(lineIterator47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertNotNull(file63);
        org.junit.Assert.assertEquals(file63.getParent(), "hi!");
        org.junit.Assert.assertEquals(file63.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertNotNull(file67);
        org.junit.Assert.assertEquals(file67.getParent(), "hi!");
        org.junit.Assert.assertEquals(file67.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(lineIterator71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + 0L + "'", long83 == 0L);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test603");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file14 = org.apache.commons.io.FileUtils.getFile(strArray13);
        boolean boolean16 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file7, file14, "");
        boolean boolean18 = org.apache.commons.io.FileUtils.isFileNewer(file7, 0L);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(file14);
        org.junit.Assert.assertEquals(file14.getParent(), "hi!");
        org.junit.Assert.assertEquals(file14.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test604");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        java.lang.String str9 = org.apache.commons.io.FileUtils.readFileToString(file3);
        org.apache.commons.io.FileUtils.writeStringToFile(file3, "", false);
        boolean boolean14 = org.apache.commons.io.FileUtils.isFileNewer(file3, 0L);
        java.math.BigInteger bigInteger15 = org.apache.commons.io.FileUtils.sizeOfAsBigInteger(file3);
        org.apache.commons.io.LineIterator lineIterator16 = org.apache.commons.io.FileUtils.lineIterator(file3);
        java.math.BigInteger bigInteger17 = org.apache.commons.io.FileUtils.sizeOfAsBigInteger(file3);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!\000\000d\001" + "'", str9, "hi!\000\000d\001");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(bigInteger15);
        org.junit.Assert.assertNotNull(lineIterator16);
        org.junit.Assert.assertNotNull(bigInteger17);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test605");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file14 = org.apache.commons.io.FileUtils.getFile(strArray13);
        boolean boolean16 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file7, file14, "");
        org.apache.commons.io.LineIterator lineIterator17 = org.apache.commons.io.FileUtils.lineIterator(file7);
        org.apache.commons.io.FileUtils.writeStringToFile(file7, "C:\\Users\\Mathieu\\AppData\\Local\\Temp\\", false);
        java.nio.charset.Charset charset22 = null;
        org.apache.commons.io.FileUtils.write(file7, (java.lang.CharSequence) "", charset22, true);
        boolean boolean26 = org.apache.commons.io.FileUtils.waitFor(file7, 0);
        java.nio.charset.Charset charset27 = null;
        java.lang.String str28 = org.apache.commons.io.FileUtils.readFileToString(file7, charset27);
        long long29 = org.apache.commons.io.FileUtils.checksumCRC32(file7);
        long long30 = org.apache.commons.io.FileUtils.sizeOf(file7);
        org.apache.commons.io.FileUtils.writeStringToFile(file7, "-1 bytes1 GB1048576 EB1 GBC:\\Users\\Mathieu\\AppData\\Local\\Temp\\1 GBC:\\Users\\Mathieu1 GB1 GB1048576 EB1 GB", true);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(file14);
        org.junit.Assert.assertEquals(file14.getParent(), "hi!");
        org.junit.Assert.assertEquals(file14.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(lineIterator17);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "C:\\Users\\Mathieu\\AppData\\Local\\Temp\\" + "'", str28, "C:\\Users\\Mathieu\\AppData\\Local\\Temp\\");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 4154702209L + "'", long29 == 4154702209L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 36L + "'", long30 == 36L);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test606");
        java.math.BigInteger bigInteger0 = org.apache.commons.io.FileUtils.ONE_TB_BI;
        java.lang.String str1 = org.apache.commons.io.FileUtils.byteCountToDisplaySize(bigInteger0);
        org.junit.Assert.assertNotNull(bigInteger0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 TB" + "'", str1, "1 TB");
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test607");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        org.apache.commons.io.LineIterator lineIterator11 = org.apache.commons.io.FileUtils.lineIterator(file7);
        boolean boolean12 = org.apache.commons.io.FileUtils.deleteQuietly(file7);
        org.apache.commons.io.FileUtils.writeStringToFile(file7, "");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file18 = org.apache.commons.io.FileUtils.getFile(strArray17);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file22 = org.apache.commons.io.FileUtils.getFile(strArray21);
        boolean boolean23 = org.apache.commons.io.FileUtils.isFileOlder(file18, file22);
        boolean boolean25 = org.apache.commons.io.FileUtils.waitFor(file22, (int) '4');
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file29 = org.apache.commons.io.FileUtils.getFile(strArray28);
        boolean boolean31 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file22, file29, "");
        boolean boolean32 = org.apache.commons.io.FileUtils.isFileNewer(file7, file22);
        java.io.File file33 = null;
        boolean boolean34 = org.apache.commons.io.FileUtils.contentEquals(file22, file33);
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file38 = org.apache.commons.io.FileUtils.getFile(strArray37);
        java.lang.String[] strArray41 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file42 = org.apache.commons.io.FileUtils.getFile(strArray41);
        boolean boolean43 = org.apache.commons.io.FileUtils.isFileOlder(file38, file42);
        boolean boolean45 = org.apache.commons.io.FileUtils.waitFor(file42, (int) '4');
        org.apache.commons.io.LineIterator lineIterator46 = org.apache.commons.io.FileUtils.lineIterator(file42);
        boolean boolean47 = org.apache.commons.io.FileUtils.deleteQuietly(file42);
        org.apache.commons.io.FileUtils.writeStringToFile(file42, "");
        java.lang.String[] strArray52 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file53 = org.apache.commons.io.FileUtils.getFile(strArray52);
        java.lang.String[] strArray56 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file57 = org.apache.commons.io.FileUtils.getFile(strArray56);
        boolean boolean58 = org.apache.commons.io.FileUtils.isFileOlder(file53, file57);
        boolean boolean60 = org.apache.commons.io.FileUtils.waitFor(file57, (int) '4');
        java.lang.String[] strArray63 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file64 = org.apache.commons.io.FileUtils.getFile(strArray63);
        boolean boolean66 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file57, file64, "");
        boolean boolean67 = org.apache.commons.io.FileUtils.isFileNewer(file42, file57);
        boolean boolean68 = org.apache.commons.io.FileUtils.isSymlink(file42);
        org.apache.commons.io.FileUtils.writeStringToFile(file42, "C:\\Users\\Mathieu\\AppData\\Local\\Temp\\", true);
        java.lang.String[] strArray74 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file75 = org.apache.commons.io.FileUtils.getFile(strArray74);
        java.lang.String[] strArray78 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file79 = org.apache.commons.io.FileUtils.getFile(strArray78);
        boolean boolean80 = org.apache.commons.io.FileUtils.isFileOlder(file75, file79);
        boolean boolean82 = org.apache.commons.io.FileUtils.waitFor(file79, (int) '4');
        org.apache.commons.io.LineIterator lineIterator83 = org.apache.commons.io.FileUtils.lineIterator(file79);
        boolean boolean85 = org.apache.commons.io.FileUtils.isFileOlder(file79, (-1L));
        byte[] byteArray86 = new byte[] {};
        org.apache.commons.io.FileUtils.writeByteArrayToFile(file79, byteArray86);
        org.apache.commons.io.FileUtils.writeByteArrayToFile(file42, byteArray86);
        boolean boolean90 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file22, file42, "1048576 EB");
        boolean boolean91 = org.apache.commons.io.FileUtils.deleteQuietly(file22);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lineIterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(file18);
        org.junit.Assert.assertEquals(file18.getParent(), "hi!");
        org.junit.Assert.assertEquals(file18.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(file22);
        org.junit.Assert.assertEquals(file22.getParent(), "hi!");
        org.junit.Assert.assertEquals(file22.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(file29);
        org.junit.Assert.assertEquals(file29.getParent(), "hi!");
        org.junit.Assert.assertEquals(file29.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(file38);
        org.junit.Assert.assertEquals(file38.getParent(), "hi!");
        org.junit.Assert.assertEquals(file38.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(file42);
        org.junit.Assert.assertEquals(file42.getParent(), "hi!");
        org.junit.Assert.assertEquals(file42.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(lineIterator46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(file53);
        org.junit.Assert.assertEquals(file53.getParent(), "hi!");
        org.junit.Assert.assertEquals(file53.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertNotNull(file57);
        org.junit.Assert.assertEquals(file57.getParent(), "hi!");
        org.junit.Assert.assertEquals(file57.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertNotNull(file64);
        org.junit.Assert.assertEquals(file64.getParent(), "hi!");
        org.junit.Assert.assertEquals(file64.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertNotNull(file75);
        org.junit.Assert.assertEquals(file75.getParent(), "hi!");
        org.junit.Assert.assertEquals(file75.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertNotNull(file79);
        org.junit.Assert.assertEquals(file79.getParent(), "hi!");
        org.junit.Assert.assertEquals(file79.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(lineIterator83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(byteArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray86), "[]");
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test608");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        long long9 = org.apache.commons.io.FileUtils.sizeOf(file7);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test609");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.FileUtils.write(file0, (java.lang.CharSequence) "C:\\Users\\Mathieu\\AppData\\Local\\Temp\\\r\n\r\n", "1 GB1048576 EB1 GBC:\\Users\\Mathieu\\AppData\\Local\\Temp\\1 GBC:\\Users\\Mathieu1 GB1 GB1048576 EB1 GB\r\n1048576 EB\r\nC:\\Users\\Mathieu\\AppData\\Local\\Temp\\\r\nC:\\Users\\Mathieu\r\n\r\n1048576 EB\r\nhi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: 1 GB1048576 EB1 GBC:\\Users\\Mathieu\\AppData\\Local\\Temp\\1 GBC:\\Users\\Mathieu1 GB1 GB1048576 EB1 GB??1048576 EB??C:\\Users\\Mathieu\\AppData\\Local\\Temp\\??C:\\Users\\Mathieu????1048576 EB??hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test610");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        java.lang.String str9 = org.apache.commons.io.FileUtils.readFileToString(file3);
        org.apache.commons.io.FileUtils.writeStringToFile(file3, "", false);
        boolean boolean14 = org.apache.commons.io.FileUtils.isFileNewer(file3, 0L);
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file18 = org.apache.commons.io.FileUtils.getFile(strArray17);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file22 = org.apache.commons.io.FileUtils.getFile(strArray21);
        boolean boolean23 = org.apache.commons.io.FileUtils.isFileOlder(file18, file22);
        boolean boolean25 = org.apache.commons.io.FileUtils.waitFor(file22, (int) '4');
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file29 = org.apache.commons.io.FileUtils.getFile(strArray28);
        boolean boolean31 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file22, file29, "");
        org.apache.commons.io.LineIterator lineIterator32 = org.apache.commons.io.FileUtils.lineIterator(file22);
        org.apache.commons.io.FileUtils.writeStringToFile(file22, "C:\\Users\\Mathieu\\AppData\\Local\\Temp\\", false);
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file39 = org.apache.commons.io.FileUtils.getFile(strArray38);
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file43 = org.apache.commons.io.FileUtils.getFile(strArray42);
        boolean boolean44 = org.apache.commons.io.FileUtils.isFileOlder(file39, file43);
        java.lang.String str45 = org.apache.commons.io.FileUtils.readFileToString(file39);
        java.lang.String[] strArray48 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file49 = org.apache.commons.io.FileUtils.getFile(strArray48);
        java.io.File file50 = org.apache.commons.io.FileUtils.getFile(file39, strArray48);
        boolean boolean52 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file22, file50, "-1 bytes");
        java.io.FileOutputStream fileOutputStream53 = org.apache.commons.io.FileUtils.openOutputStream(file22);
        long long54 = org.apache.commons.io.FileUtils.copyFile(file3, (java.io.OutputStream) fileOutputStream53);
        java.lang.String[] strArray57 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file58 = org.apache.commons.io.FileUtils.getFile(strArray57);
        java.lang.String[] strArray61 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file62 = org.apache.commons.io.FileUtils.getFile(strArray61);
        boolean boolean63 = org.apache.commons.io.FileUtils.isFileOlder(file58, file62);
        boolean boolean65 = org.apache.commons.io.FileUtils.waitFor(file62, (int) '4');
        org.apache.commons.io.LineIterator lineIterator66 = org.apache.commons.io.FileUtils.lineIterator(file62);
        boolean boolean68 = org.apache.commons.io.FileUtils.isFileOlder(file62, (-1L));
        java.io.FileOutputStream fileOutputStream70 = org.apache.commons.io.FileUtils.openOutputStream(file62, false);
        long long71 = org.apache.commons.io.FileUtils.copyFile(file3, (java.io.OutputStream) fileOutputStream70);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(file18);
        org.junit.Assert.assertEquals(file18.getParent(), "hi!");
        org.junit.Assert.assertEquals(file18.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(file22);
        org.junit.Assert.assertEquals(file22.getParent(), "hi!");
        org.junit.Assert.assertEquals(file22.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(file29);
        org.junit.Assert.assertEquals(file29.getParent(), "hi!");
        org.junit.Assert.assertEquals(file29.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(lineIterator32);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(file39);
        org.junit.Assert.assertEquals(file39.getParent(), "hi!");
        org.junit.Assert.assertEquals(file39.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(file43);
        org.junit.Assert.assertEquals(file43.getParent(), "hi!");
        org.junit.Assert.assertEquals(file43.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "C:\\Users\\Mathieu\\AppData\\Local\\Temp\\" + "'", str45, "C:\\Users\\Mathieu\\AppData\\Local\\Temp\\");
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(file49);
        org.junit.Assert.assertEquals(file49.getParent(), "hi!");
        org.junit.Assert.assertEquals(file49.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(file50);
        org.junit.Assert.assertEquals(file50.getParent(), "hi!\\hi!\\hi!");
        org.junit.Assert.assertEquals(file50.toString(), "hi!\\hi!\\hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(fileOutputStream53);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertNotNull(file58);
        org.junit.Assert.assertEquals(file58.getParent(), "hi!");
        org.junit.Assert.assertEquals(file58.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertNotNull(file62);
        org.junit.Assert.assertEquals(file62.getParent(), "hi!");
        org.junit.Assert.assertEquals(file62.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(lineIterator66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(fileOutputStream70);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 0L + "'", long71 == 0L);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test611");
        java.net.URL uRL0 = null;
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file4 = org.apache.commons.io.FileUtils.getFile(strArray3);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file8 = org.apache.commons.io.FileUtils.getFile(strArray7);
        boolean boolean9 = org.apache.commons.io.FileUtils.isFileOlder(file4, file8);
        java.lang.String str10 = org.apache.commons.io.FileUtils.readFileToString(file4);
        java.util.Collection<java.lang.String> strCollection11 = null;
        org.apache.commons.io.FileUtils.writeLines(file4, strCollection11, false);
        boolean boolean14 = org.apache.commons.io.FileUtils.isSymlink(file4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.FileUtils.copyURLToFile(uRL0, file4, (int) (short) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.net.URL.openConnection()\" because \"source\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(file4);
        org.junit.Assert.assertEquals(file4.getParent(), "hi!");
        org.junit.Assert.assertEquals(file4.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(file8);
        org.junit.Assert.assertEquals(file8.getParent(), "hi!");
        org.junit.Assert.assertEquals(file8.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test612");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        org.apache.commons.io.LineIterator lineIterator11 = org.apache.commons.io.FileUtils.lineIterator(file7);
        boolean boolean13 = org.apache.commons.io.FileUtils.isFileOlder(file7, (-1L));
        java.nio.charset.Charset charset14 = null;
        java.lang.String str15 = org.apache.commons.io.FileUtils.readFileToString(file7, charset14);
        org.apache.commons.io.FileUtils.writeStringToFile(file7, "hi!", true);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file22 = org.apache.commons.io.FileUtils.getFile(strArray21);
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file26 = org.apache.commons.io.FileUtils.getFile(strArray25);
        boolean boolean27 = org.apache.commons.io.FileUtils.isFileOlder(file22, file26);
        boolean boolean29 = org.apache.commons.io.FileUtils.waitFor(file26, (int) '4');
        org.apache.commons.io.LineIterator lineIterator30 = org.apache.commons.io.FileUtils.lineIterator(file26);
        boolean boolean31 = org.apache.commons.io.FileUtils.deleteQuietly(file26);
        org.apache.commons.io.FileUtils.writeStringToFile(file26, "");
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file37 = org.apache.commons.io.FileUtils.getFile(strArray36);
        java.lang.String[] strArray40 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file41 = org.apache.commons.io.FileUtils.getFile(strArray40);
        boolean boolean42 = org.apache.commons.io.FileUtils.isFileOlder(file37, file41);
        boolean boolean44 = org.apache.commons.io.FileUtils.waitFor(file41, (int) '4');
        java.lang.String[] strArray47 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file48 = org.apache.commons.io.FileUtils.getFile(strArray47);
        boolean boolean50 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file41, file48, "");
        boolean boolean51 = org.apache.commons.io.FileUtils.isFileNewer(file26, file41);
        boolean boolean52 = org.apache.commons.io.FileUtils.isSymlink(file26);
        boolean boolean53 = org.apache.commons.io.FileUtils.isFileOlder(file7, file26);
        java.lang.String[] strArray56 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file57 = org.apache.commons.io.FileUtils.getFile(strArray56);
        java.lang.String[] strArray60 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file61 = org.apache.commons.io.FileUtils.getFile(strArray60);
        boolean boolean62 = org.apache.commons.io.FileUtils.isFileOlder(file57, file61);
        boolean boolean64 = org.apache.commons.io.FileUtils.waitFor(file61, (int) '4');
        org.apache.commons.io.LineIterator lineIterator65 = org.apache.commons.io.FileUtils.lineIterator(file61);
        boolean boolean66 = org.apache.commons.io.FileUtils.deleteQuietly(file61);
        org.apache.commons.io.FileUtils.writeStringToFile(file61, "");
        java.lang.String[] strArray71 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file72 = org.apache.commons.io.FileUtils.getFile(strArray71);
        java.lang.String[] strArray75 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file76 = org.apache.commons.io.FileUtils.getFile(strArray75);
        boolean boolean77 = org.apache.commons.io.FileUtils.isFileOlder(file72, file76);
        boolean boolean79 = org.apache.commons.io.FileUtils.waitFor(file76, (int) '4');
        java.lang.String[] strArray82 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file83 = org.apache.commons.io.FileUtils.getFile(strArray82);
        boolean boolean85 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file76, file83, "");
        boolean boolean86 = org.apache.commons.io.FileUtils.isFileNewer(file61, file76);
        boolean boolean87 = org.apache.commons.io.FileUtils.isSymlink(file61);
        org.apache.commons.io.FileUtils.writeStringToFile(file61, "C:\\Users\\Mathieu\\AppData\\Local\\Temp\\", true);
        java.lang.String str91 = org.apache.commons.io.FileUtils.readFileToString(file61);
        boolean boolean92 = org.apache.commons.io.FileUtils.isFileOlder(file7, file61);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lineIterator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(file22);
        org.junit.Assert.assertEquals(file22.getParent(), "hi!");
        org.junit.Assert.assertEquals(file22.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(file26);
        org.junit.Assert.assertEquals(file26.getParent(), "hi!");
        org.junit.Assert.assertEquals(file26.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(lineIterator30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(file37);
        org.junit.Assert.assertEquals(file37.getParent(), "hi!");
        org.junit.Assert.assertEquals(file37.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(file41);
        org.junit.Assert.assertEquals(file41.getParent(), "hi!");
        org.junit.Assert.assertEquals(file41.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(file48);
        org.junit.Assert.assertEquals(file48.getParent(), "hi!");
        org.junit.Assert.assertEquals(file48.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertNotNull(file57);
        org.junit.Assert.assertEquals(file57.getParent(), "hi!");
        org.junit.Assert.assertEquals(file57.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertNotNull(file61);
        org.junit.Assert.assertEquals(file61.getParent(), "hi!");
        org.junit.Assert.assertEquals(file61.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(lineIterator65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertNotNull(file72);
        org.junit.Assert.assertEquals(file72.getParent(), "hi!");
        org.junit.Assert.assertEquals(file72.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertNotNull(file76);
        org.junit.Assert.assertEquals(file76.getParent(), "hi!");
        org.junit.Assert.assertEquals(file76.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertNotNull(file83);
        org.junit.Assert.assertEquals(file83.getParent(), "hi!");
        org.junit.Assert.assertEquals(file83.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "C:\\Users\\Mathieu\\AppData\\Local\\Temp\\" + "'", str91, "C:\\Users\\Mathieu\\AppData\\Local\\Temp\\");
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test613");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        org.apache.commons.io.LineIterator lineIterator11 = org.apache.commons.io.FileUtils.lineIterator(file7);
        boolean boolean12 = org.apache.commons.io.FileUtils.deleteQuietly(file7);
        java.io.FileOutputStream fileOutputStream13 = org.apache.commons.io.FileUtils.openOutputStream(file7);
        java.io.FileInputStream fileInputStream14 = org.apache.commons.io.FileUtils.openInputStream(file7);
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file18 = org.apache.commons.io.FileUtils.getFile(strArray17);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file22 = org.apache.commons.io.FileUtils.getFile(strArray21);
        boolean boolean23 = org.apache.commons.io.FileUtils.isFileOlder(file18, file22);
        boolean boolean25 = org.apache.commons.io.FileUtils.waitFor(file22, (int) '4');
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file29 = org.apache.commons.io.FileUtils.getFile(strArray28);
        boolean boolean31 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file22, file29, "");
        org.apache.commons.io.LineIterator lineIterator32 = org.apache.commons.io.FileUtils.lineIterator(file22);
        org.apache.commons.io.FileUtils.writeStringToFile(file22, "C:\\Users\\Mathieu\\AppData\\Local\\Temp\\", false);
        java.nio.charset.Charset charset37 = null;
        org.apache.commons.io.FileUtils.write(file22, (java.lang.CharSequence) "", charset37, true);
        org.apache.commons.io.FileUtils.touch(file22);
        java.nio.charset.Charset charset42 = null;
        org.apache.commons.io.FileUtils.write(file22, (java.lang.CharSequence) "1 GB1048576 EB1 GBC:\\Users\\Mathieu\\AppData\\Local\\Temp\\1 GBC:\\Users\\Mathieu1 GB1 GB1048576 EB1 GB", charset42);
        org.apache.commons.io.FileUtils.copyInputStreamToFile((java.io.InputStream) fileInputStream14, file22);
        org.apache.commons.io.FileUtils.forceDeleteOnExit(file22);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.FileUtils.forceMkdir(file22);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: File hi!\\hi! exists and is not a directory. Unable to create directory.");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lineIterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(fileOutputStream13);
        org.junit.Assert.assertNotNull(fileInputStream14);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(file18);
        org.junit.Assert.assertEquals(file18.getParent(), "hi!");
        org.junit.Assert.assertEquals(file18.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(file22);
        org.junit.Assert.assertEquals(file22.getParent(), "hi!");
        org.junit.Assert.assertEquals(file22.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(file29);
        org.junit.Assert.assertEquals(file29.getParent(), "hi!");
        org.junit.Assert.assertEquals(file29.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(lineIterator32);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test614");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        org.apache.commons.io.LineIterator lineIterator11 = org.apache.commons.io.FileUtils.lineIterator(file7);
        boolean boolean12 = org.apache.commons.io.FileUtils.deleteQuietly(file7);
        org.apache.commons.io.FileUtils.writeStringToFile(file7, "");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file18 = org.apache.commons.io.FileUtils.getFile(strArray17);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file22 = org.apache.commons.io.FileUtils.getFile(strArray21);
        boolean boolean23 = org.apache.commons.io.FileUtils.isFileOlder(file18, file22);
        boolean boolean25 = org.apache.commons.io.FileUtils.waitFor(file22, (int) '4');
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file29 = org.apache.commons.io.FileUtils.getFile(strArray28);
        boolean boolean31 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file22, file29, "");
        boolean boolean32 = org.apache.commons.io.FileUtils.isFileNewer(file7, file22);
        java.io.FileOutputStream fileOutputStream33 = org.apache.commons.io.FileUtils.openOutputStream(file7);
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file37 = org.apache.commons.io.FileUtils.getFile(strArray36);
        java.lang.String[] strArray40 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file41 = org.apache.commons.io.FileUtils.getFile(strArray40);
        boolean boolean42 = org.apache.commons.io.FileUtils.isFileOlder(file37, file41);
        boolean boolean44 = org.apache.commons.io.FileUtils.waitFor(file41, (int) '4');
        org.apache.commons.io.LineIterator lineIterator45 = org.apache.commons.io.FileUtils.lineIterator(file41);
        boolean boolean46 = org.apache.commons.io.FileUtils.deleteQuietly(file41);
        org.apache.commons.io.FileUtils.write(file41, (java.lang.CharSequence) "hi!");
        java.nio.charset.Charset charset50 = null;
        org.apache.commons.io.FileUtils.write(file41, (java.lang.CharSequence) "", charset50, true);
        java.nio.charset.Charset charset53 = null;
        java.lang.String str54 = org.apache.commons.io.FileUtils.readFileToString(file41, charset53);
        boolean boolean55 = org.apache.commons.io.FileUtils.contentEquals(file7, file41);
        java.lang.String[] strArray58 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file59 = org.apache.commons.io.FileUtils.getFile(strArray58);
        java.io.File file60 = org.apache.commons.io.FileUtils.getFile(file7, strArray58);
        org.apache.commons.io.LineIterator lineIterator61 = org.apache.commons.io.FileUtils.lineIterator(file7);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lineIterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(file18);
        org.junit.Assert.assertEquals(file18.getParent(), "hi!");
        org.junit.Assert.assertEquals(file18.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(file22);
        org.junit.Assert.assertEquals(file22.getParent(), "hi!");
        org.junit.Assert.assertEquals(file22.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(file29);
        org.junit.Assert.assertEquals(file29.getParent(), "hi!");
        org.junit.Assert.assertEquals(file29.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(fileOutputStream33);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(file37);
        org.junit.Assert.assertEquals(file37.getParent(), "hi!");
        org.junit.Assert.assertEquals(file37.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(file41);
        org.junit.Assert.assertEquals(file41.getParent(), "hi!");
        org.junit.Assert.assertEquals(file41.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(lineIterator45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertNotNull(file59);
        org.junit.Assert.assertEquals(file59.getParent(), "hi!");
        org.junit.Assert.assertEquals(file59.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(file60);
        org.junit.Assert.assertEquals(file60.getParent(), "hi!\\hi!\\hi!");
        org.junit.Assert.assertEquals(file60.toString(), "hi!\\hi!\\hi!\\hi!");
        org.junit.Assert.assertNotNull(lineIterator61);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test615");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        org.apache.commons.io.LineIterator lineIterator11 = org.apache.commons.io.FileUtils.lineIterator(file7);
        boolean boolean13 = org.apache.commons.io.FileUtils.isFileOlder(file7, (-1L));
        java.nio.charset.Charset charset14 = null;
        java.lang.String str15 = org.apache.commons.io.FileUtils.readFileToString(file7, charset14);
        java.io.FileOutputStream fileOutputStream17 = org.apache.commons.io.FileUtils.openOutputStream(file7, false);
        org.apache.commons.io.LineIterator lineIterator18 = org.apache.commons.io.FileUtils.lineIterator(file7);
        org.apache.commons.io.FileUtils.writeStringToFile(file7, "-1 bytes", false);
        java.io.FileOutputStream fileOutputStream22 = org.apache.commons.io.FileUtils.openOutputStream(file7);
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file26 = org.apache.commons.io.FileUtils.getFile(strArray25);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file30 = org.apache.commons.io.FileUtils.getFile(strArray29);
        boolean boolean31 = org.apache.commons.io.FileUtils.isFileOlder(file26, file30);
        boolean boolean33 = org.apache.commons.io.FileUtils.waitFor(file30, (int) '4');
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file37 = org.apache.commons.io.FileUtils.getFile(strArray36);
        boolean boolean39 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file30, file37, "");
        org.apache.commons.io.FileUtils.writeStringToFile(file30, "", false);
        org.apache.commons.io.FileUtils.forceDeleteOnExit(file30);
        boolean boolean44 = org.apache.commons.io.FileUtils.isFileOlder(file7, file30);
        java.lang.String[] strArray47 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file48 = org.apache.commons.io.FileUtils.getFile(strArray47);
        java.lang.String[] strArray51 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file52 = org.apache.commons.io.FileUtils.getFile(strArray51);
        boolean boolean53 = org.apache.commons.io.FileUtils.isFileOlder(file48, file52);
        boolean boolean55 = org.apache.commons.io.FileUtils.waitFor(file52, (int) '4');
        org.apache.commons.io.LineIterator lineIterator56 = org.apache.commons.io.FileUtils.lineIterator(file52);
        boolean boolean57 = org.apache.commons.io.FileUtils.deleteQuietly(file52);
        org.apache.commons.io.FileUtils.write(file52, (java.lang.CharSequence) "hi!");
        java.nio.charset.Charset charset61 = null;
        org.apache.commons.io.FileUtils.write(file52, (java.lang.CharSequence) "", charset61, true);
        byte[] byteArray64 = org.apache.commons.io.FileUtils.readFileToByteArray(file52);
        boolean boolean66 = org.apache.commons.io.FileUtils.waitFor(file52, (int) 'a');
        byte[] byteArray67 = org.apache.commons.io.FileUtils.readFileToByteArray(file52);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.FileUtils.writeByteArrayToFile(file7, byteArray67, 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lineIterator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(fileOutputStream17);
        org.junit.Assert.assertNotNull(lineIterator18);
        org.junit.Assert.assertNotNull(fileOutputStream22);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(file26);
        org.junit.Assert.assertEquals(file26.getParent(), "hi!");
        org.junit.Assert.assertEquals(file26.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(file30);
        org.junit.Assert.assertEquals(file30.getParent(), "hi!");
        org.junit.Assert.assertEquals(file30.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(file37);
        org.junit.Assert.assertEquals(file37.getParent(), "hi!");
        org.junit.Assert.assertEquals(file37.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(file48);
        org.junit.Assert.assertEquals(file48.getParent(), "hi!");
        org.junit.Assert.assertEquals(file48.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(file52);
        org.junit.Assert.assertEquals(file52.getParent(), "hi!");
        org.junit.Assert.assertEquals(file52.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(lineIterator56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray64), "[104, 105, 33]");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray67), "[104, 105, 33]");
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test616");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        boolean boolean5 = org.apache.commons.io.FileUtils.waitFor(file3, 100);
        java.nio.charset.Charset charset7 = null;
        org.apache.commons.io.FileUtils.write(file3, (java.lang.CharSequence) "35 bytes", charset7);
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file12 = org.apache.commons.io.FileUtils.getFile(strArray11);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file16 = org.apache.commons.io.FileUtils.getFile(strArray15);
        boolean boolean17 = org.apache.commons.io.FileUtils.isFileOlder(file12, file16);
        boolean boolean19 = org.apache.commons.io.FileUtils.waitFor(file16, (int) '4');
        org.apache.commons.io.LineIterator lineIterator20 = org.apache.commons.io.FileUtils.lineIterator(file16);
        boolean boolean21 = org.apache.commons.io.FileUtils.deleteQuietly(file16);
        org.apache.commons.io.FileUtils.write(file16, (java.lang.CharSequence) "hi!");
        org.apache.commons.io.FileUtils.write(file16, (java.lang.CharSequence) "-1 bytes", false);
        byte[] byteArray27 = org.apache.commons.io.FileUtils.readFileToByteArray(file16);
        org.apache.commons.io.FileUtils.writeByteArrayToFile(file3, byteArray27, true);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(file12);
        org.junit.Assert.assertEquals(file12.getParent(), "hi!");
        org.junit.Assert.assertEquals(file12.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(file16);
        org.junit.Assert.assertEquals(file16.getParent(), "hi!");
        org.junit.Assert.assertEquals(file16.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(lineIterator20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[45, 49, 32, 98, 121, 116, 101, 115]");
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test617");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        java.nio.charset.Charset charset11 = null;
        java.lang.String str12 = org.apache.commons.io.FileUtils.readFileToString(file7, charset11);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.FileUtils.writeStringToFile(file7, "35 bytes", "35 bytes", true);
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: 35 bytes");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1 bytes-1 bytes" + "'", str12, "-1 bytes-1 bytes");
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test618");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        org.apache.commons.io.LineIterator lineIterator11 = org.apache.commons.io.FileUtils.lineIterator(file7);
        boolean boolean13 = org.apache.commons.io.FileUtils.isFileOlder(file7, (-1L));
        long long14 = org.apache.commons.io.FileUtils.sizeOf(file7);
        java.io.File file15 = org.apache.commons.io.FileUtils.getUserDirectory();
        org.apache.commons.io.FileUtils.copyFileToDirectory(file7, file15, true);
        org.apache.commons.io.FileUtils.write(file7, (java.lang.CharSequence) "hi!", true);
        org.apache.commons.io.filefilter.IOFileFilter iOFileFilter21 = null;
        org.apache.commons.io.filefilter.IOFileFilter iOFileFilter22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<java.io.File> fileItor23 = org.apache.commons.io.FileUtils.iterateFilesAndDirs(file7, iOFileFilter21, iOFileFilter22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'directory' is not a directory: hi!\\hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lineIterator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 16L + "'", long14 == 16L);
        org.junit.Assert.assertNotNull(file15);
        org.junit.Assert.assertEquals(file15.getParent(), "C:\\Users");
        org.junit.Assert.assertEquals(file15.toString(), "C:\\Users\\Mathieu");
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test619");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        org.apache.commons.io.LineIterator lineIterator11 = org.apache.commons.io.FileUtils.lineIterator(file7);
        boolean boolean12 = org.apache.commons.io.FileUtils.deleteQuietly(file7);
        org.apache.commons.io.FileUtils.write(file7, (java.lang.CharSequence) "hi!");
        java.nio.charset.Charset charset16 = null;
        org.apache.commons.io.FileUtils.write(file7, (java.lang.CharSequence) "", charset16, true);
        byte[] byteArray19 = org.apache.commons.io.FileUtils.readFileToByteArray(file7);
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file23 = org.apache.commons.io.FileUtils.getFile(strArray22);
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file27 = org.apache.commons.io.FileUtils.getFile(strArray26);
        boolean boolean28 = org.apache.commons.io.FileUtils.isFileOlder(file23, file27);
        boolean boolean30 = org.apache.commons.io.FileUtils.waitFor(file27, (int) '4');
        boolean boolean31 = org.apache.commons.io.FileUtils.isFileOlder(file7, file27);
        java.lang.String[] strArray34 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file35 = org.apache.commons.io.FileUtils.getFile(strArray34);
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file39 = org.apache.commons.io.FileUtils.getFile(strArray38);
        boolean boolean40 = org.apache.commons.io.FileUtils.isFileOlder(file35, file39);
        boolean boolean42 = org.apache.commons.io.FileUtils.waitFor(file39, (int) '4');
        org.apache.commons.io.LineIterator lineIterator43 = org.apache.commons.io.FileUtils.lineIterator(file39);
        boolean boolean44 = org.apache.commons.io.FileUtils.deleteQuietly(file39);
        org.apache.commons.io.FileUtils.write(file39, (java.lang.CharSequence) "hi!");
        long long47 = org.apache.commons.io.FileUtils.sizeOf(file39);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.FileUtils.moveToDirectory(file7, file39, true);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Destination 'hi!\\hi!' is not a directory");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lineIterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[104, 105, 33]");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(file23);
        org.junit.Assert.assertEquals(file23.getParent(), "hi!");
        org.junit.Assert.assertEquals(file23.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(file27);
        org.junit.Assert.assertEquals(file27.getParent(), "hi!");
        org.junit.Assert.assertEquals(file27.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(file35);
        org.junit.Assert.assertEquals(file35.getParent(), "hi!");
        org.junit.Assert.assertEquals(file35.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(file39);
        org.junit.Assert.assertEquals(file39.getParent(), "hi!");
        org.junit.Assert.assertEquals(file39.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(lineIterator43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 3L + "'", long47 == 3L);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test620");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean9 = org.apache.commons.io.FileUtils.deleteQuietly(file7);
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file13 = org.apache.commons.io.FileUtils.getFile(strArray12);
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file17 = org.apache.commons.io.FileUtils.getFile(strArray16);
        boolean boolean18 = org.apache.commons.io.FileUtils.isFileOlder(file13, file17);
        boolean boolean20 = org.apache.commons.io.FileUtils.waitFor(file17, (int) '4');
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file24 = org.apache.commons.io.FileUtils.getFile(strArray23);
        boolean boolean26 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file17, file24, "");
        org.apache.commons.io.LineIterator lineIterator27 = org.apache.commons.io.FileUtils.lineIterator(file17);
        org.apache.commons.io.FileUtils.writeStringToFile(file17, "C:\\Users\\Mathieu\\AppData\\Local\\Temp\\", false);
        java.nio.charset.Charset charset32 = null;
        org.apache.commons.io.FileUtils.write(file17, (java.lang.CharSequence) "", charset32, true);
        boolean boolean36 = org.apache.commons.io.FileUtils.waitFor(file17, 0);
        boolean boolean37 = org.apache.commons.io.FileUtils.isFileOlder(file7, file17);
        boolean boolean39 = org.apache.commons.io.FileUtils.waitFor(file17, (int) (short) 100);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(file13);
        org.junit.Assert.assertEquals(file13.getParent(), "hi!");
        org.junit.Assert.assertEquals(file13.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(file17);
        org.junit.Assert.assertEquals(file17.getParent(), "hi!");
        org.junit.Assert.assertEquals(file17.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(file24);
        org.junit.Assert.assertEquals(file24.getParent(), "hi!");
        org.junit.Assert.assertEquals(file24.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(lineIterator27);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test621");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        org.apache.commons.io.LineIterator lineIterator11 = org.apache.commons.io.FileUtils.lineIterator(file7);
        boolean boolean12 = org.apache.commons.io.FileUtils.deleteQuietly(file7);
        org.apache.commons.io.FileUtils.write(file7, (java.lang.CharSequence) "hi!");
        java.nio.charset.Charset charset16 = null;
        org.apache.commons.io.FileUtils.write(file7, (java.lang.CharSequence) "", charset16, true);
        byte[] byteArray19 = org.apache.commons.io.FileUtils.readFileToByteArray(file7);
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file23 = org.apache.commons.io.FileUtils.getFile(strArray22);
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file27 = org.apache.commons.io.FileUtils.getFile(strArray26);
        boolean boolean28 = org.apache.commons.io.FileUtils.isFileOlder(file23, file27);
        boolean boolean30 = org.apache.commons.io.FileUtils.waitFor(file27, (int) '4');
        org.apache.commons.io.LineIterator lineIterator31 = org.apache.commons.io.FileUtils.lineIterator(file27);
        boolean boolean32 = org.apache.commons.io.FileUtils.deleteQuietly(file27);
        org.apache.commons.io.FileUtils.write(file27, (java.lang.CharSequence) "hi!");
        java.nio.charset.Charset charset36 = null;
        org.apache.commons.io.FileUtils.write(file27, (java.lang.CharSequence) "", charset36, true);
        java.nio.charset.Charset charset40 = null;
        org.apache.commons.io.FileUtils.writeStringToFile(file27, "", charset40, false);
        boolean boolean43 = org.apache.commons.io.FileUtils.isFileNewer(file7, file27);
        java.lang.String[] strArray46 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file47 = org.apache.commons.io.FileUtils.getFile(strArray46);
        java.lang.String[] strArray50 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file51 = org.apache.commons.io.FileUtils.getFile(strArray50);
        boolean boolean52 = org.apache.commons.io.FileUtils.isFileOlder(file47, file51);
        boolean boolean54 = org.apache.commons.io.FileUtils.waitFor(file51, (int) '4');
        org.apache.commons.io.LineIterator lineIterator55 = org.apache.commons.io.FileUtils.lineIterator(file51);
        boolean boolean56 = org.apache.commons.io.FileUtils.deleteQuietly(file51);
        org.apache.commons.io.FileUtils.write(file51, (java.lang.CharSequence) "hi!");
        java.nio.charset.Charset charset60 = null;
        org.apache.commons.io.FileUtils.write(file51, (java.lang.CharSequence) "", charset60, true);
        byte[] byteArray63 = org.apache.commons.io.FileUtils.readFileToByteArray(file51);
        org.apache.commons.io.FileUtils.writeByteArrayToFile(file7, byteArray63);
        java.lang.String[] strArray67 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file68 = org.apache.commons.io.FileUtils.getFile(strArray67);
        java.lang.String[] strArray71 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file72 = org.apache.commons.io.FileUtils.getFile(strArray71);
        boolean boolean73 = org.apache.commons.io.FileUtils.isFileOlder(file68, file72);
        boolean boolean75 = org.apache.commons.io.FileUtils.waitFor(file72, (int) '4');
        org.apache.commons.io.LineIterator lineIterator76 = org.apache.commons.io.FileUtils.lineIterator(file72);
        boolean boolean77 = org.apache.commons.io.FileUtils.deleteQuietly(file72);
        boolean boolean78 = org.apache.commons.io.FileUtils.isFileNewer(file7, file72);
        java.lang.String[] strArray81 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file82 = org.apache.commons.io.FileUtils.getFile(strArray81);
        java.lang.String[] strArray85 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file86 = org.apache.commons.io.FileUtils.getFile(strArray85);
        boolean boolean87 = org.apache.commons.io.FileUtils.isFileOlder(file82, file86);
        java.lang.String str88 = org.apache.commons.io.FileUtils.readFileToString(file82);
        org.apache.commons.io.FileUtils.writeStringToFile(file82, "", false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.FileUtils.copyDirectoryToDirectory(file72, file82);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Source 'hi!\\hi!' is not a directory");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lineIterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[104, 105, 33]");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(file23);
        org.junit.Assert.assertEquals(file23.getParent(), "hi!");
        org.junit.Assert.assertEquals(file23.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(file27);
        org.junit.Assert.assertEquals(file27.getParent(), "hi!");
        org.junit.Assert.assertEquals(file27.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(lineIterator31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(file47);
        org.junit.Assert.assertEquals(file47.getParent(), "hi!");
        org.junit.Assert.assertEquals(file47.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(file51);
        org.junit.Assert.assertEquals(file51.getParent(), "hi!");
        org.junit.Assert.assertEquals(file51.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(lineIterator55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray63), "[104, 105, 33]");
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertNotNull(file68);
        org.junit.Assert.assertEquals(file68.getParent(), "hi!");
        org.junit.Assert.assertEquals(file68.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertNotNull(file72);
        org.junit.Assert.assertEquals(file72.getParent(), "hi!");
        org.junit.Assert.assertEquals(file72.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(lineIterator76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertNotNull(file82);
        org.junit.Assert.assertEquals(file82.getParent(), "hi!");
        org.junit.Assert.assertEquals(file82.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray85);
        org.junit.Assert.assertNotNull(file86);
        org.junit.Assert.assertEquals(file86.getParent(), "hi!");
        org.junit.Assert.assertEquals(file86.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "hi!" + "'", str88, "hi!");
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test622");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file14 = org.apache.commons.io.FileUtils.getFile(strArray13);
        boolean boolean16 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file7, file14, "");
        org.apache.commons.io.FileUtils.writeStringToFile(file7, "", false);
        org.apache.commons.io.FileUtils.forceDeleteOnExit(file7);
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file24 = org.apache.commons.io.FileUtils.getFile(strArray23);
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file28 = org.apache.commons.io.FileUtils.getFile(strArray27);
        boolean boolean29 = org.apache.commons.io.FileUtils.isFileOlder(file24, file28);
        boolean boolean31 = org.apache.commons.io.FileUtils.waitFor(file28, (int) '4');
        java.lang.String[] strArray34 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file35 = org.apache.commons.io.FileUtils.getFile(strArray34);
        boolean boolean37 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file28, file35, "");
        java.io.FileOutputStream fileOutputStream39 = org.apache.commons.io.FileUtils.openOutputStream(file28, false);
        java.lang.String[] strArray46 = new java.lang.String[] { "", "1048576 EB", "C:\\Users\\Mathieu\\AppData\\Local\\Temp\\", "C:\\Users\\Mathieu", "", "1048576 EB" };
        java.util.ArrayList<java.lang.String> strList47 = new java.util.ArrayList<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList47, strArray46);
        org.apache.commons.io.FileUtils.writeLines(file28, (java.util.Collection<java.lang.String>) strList47, "1 GB", false);
        org.apache.commons.io.FileUtils.writeLines(file7, (java.util.Collection<java.lang.String>) strList47, "");
        java.util.List<java.lang.String> strList54 = org.apache.commons.io.FileUtils.readLines(file7);
        java.lang.String[] strArray57 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file58 = org.apache.commons.io.FileUtils.getFile(strArray57);
        java.lang.String[] strArray61 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file62 = org.apache.commons.io.FileUtils.getFile(strArray61);
        boolean boolean63 = org.apache.commons.io.FileUtils.isFileOlder(file58, file62);
        boolean boolean64 = org.apache.commons.io.FileUtils.deleteQuietly(file62);
        java.nio.charset.Charset charset66 = null;
        org.apache.commons.io.FileUtils.write(file62, (java.lang.CharSequence) "", charset66, true);
        boolean boolean70 = org.apache.commons.io.FileUtils.isFileNewer(file62, 2035464173L);
        boolean boolean71 = org.apache.commons.io.FileUtils.contentEquals(file7, file62);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(file14);
        org.junit.Assert.assertEquals(file14.getParent(), "hi!");
        org.junit.Assert.assertEquals(file14.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(file24);
        org.junit.Assert.assertEquals(file24.getParent(), "hi!");
        org.junit.Assert.assertEquals(file24.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(file28);
        org.junit.Assert.assertEquals(file28.getParent(), "hi!");
        org.junit.Assert.assertEquals(file28.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(file35);
        org.junit.Assert.assertEquals(file35.getParent(), "hi!");
        org.junit.Assert.assertEquals(file35.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(fileOutputStream39);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(strList54);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertNotNull(file58);
        org.junit.Assert.assertEquals(file58.getParent(), "hi!");
        org.junit.Assert.assertEquals(file58.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertNotNull(file62);
        org.junit.Assert.assertEquals(file62.getParent(), "hi!");
        org.junit.Assert.assertEquals(file62.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test623");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        org.apache.commons.io.LineIterator lineIterator11 = org.apache.commons.io.FileUtils.lineIterator(file7);
        boolean boolean13 = org.apache.commons.io.FileUtils.isFileOlder(file7, (-1L));
        java.nio.charset.Charset charset14 = null;
        java.lang.String str15 = org.apache.commons.io.FileUtils.readFileToString(file7, charset14);
        java.io.FileOutputStream fileOutputStream17 = org.apache.commons.io.FileUtils.openOutputStream(file7, false);
        org.apache.commons.io.LineIterator lineIterator18 = org.apache.commons.io.FileUtils.lineIterator(file7);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file22 = org.apache.commons.io.FileUtils.getFile(strArray21);
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file26 = org.apache.commons.io.FileUtils.getFile(strArray25);
        boolean boolean27 = org.apache.commons.io.FileUtils.isFileOlder(file22, file26);
        boolean boolean29 = org.apache.commons.io.FileUtils.waitFor(file26, (int) '4');
        java.lang.String[] strArray32 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file33 = org.apache.commons.io.FileUtils.getFile(strArray32);
        boolean boolean35 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file26, file33, "");
        org.apache.commons.io.LineIterator lineIterator36 = org.apache.commons.io.FileUtils.lineIterator(file26);
        org.apache.commons.io.FileUtils.writeStringToFile(file26, "C:\\Users\\Mathieu\\AppData\\Local\\Temp\\", false);
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file43 = org.apache.commons.io.FileUtils.getFile(strArray42);
        java.lang.String[] strArray46 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file47 = org.apache.commons.io.FileUtils.getFile(strArray46);
        boolean boolean48 = org.apache.commons.io.FileUtils.isFileOlder(file43, file47);
        java.lang.String str49 = org.apache.commons.io.FileUtils.readFileToString(file43);
        java.lang.String[] strArray52 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file53 = org.apache.commons.io.FileUtils.getFile(strArray52);
        java.io.File file54 = org.apache.commons.io.FileUtils.getFile(file43, strArray52);
        boolean boolean56 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file26, file54, "-1 bytes");
        java.nio.charset.Charset charset58 = null;
        org.apache.commons.io.FileUtils.write(file26, (java.lang.CharSequence) "1048576 EB", charset58);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.FileUtils.copyFileToDirectory(file7, file26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Destination 'hi!\\hi!' is not a directory");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lineIterator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1048576 EBC:\\Users\\Mathieu\\AppData\\Local\\Temp\\C:\\Users\\Mathieu1048576 EB" + "'", str15, "1048576 EBC:\\Users\\Mathieu\\AppData\\Local\\Temp\\C:\\Users\\Mathieu1048576 EB");
        org.junit.Assert.assertNotNull(fileOutputStream17);
        org.junit.Assert.assertNotNull(lineIterator18);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(file22);
        org.junit.Assert.assertEquals(file22.getParent(), "hi!");
        org.junit.Assert.assertEquals(file22.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(file26);
        org.junit.Assert.assertEquals(file26.getParent(), "hi!");
        org.junit.Assert.assertEquals(file26.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(file33);
        org.junit.Assert.assertEquals(file33.getParent(), "hi!");
        org.junit.Assert.assertEquals(file33.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(lineIterator36);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(file43);
        org.junit.Assert.assertEquals(file43.getParent(), "hi!");
        org.junit.Assert.assertEquals(file43.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(file47);
        org.junit.Assert.assertEquals(file47.getParent(), "hi!");
        org.junit.Assert.assertEquals(file47.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "C:\\Users\\Mathieu\\AppData\\Local\\Temp\\" + "'", str49, "C:\\Users\\Mathieu\\AppData\\Local\\Temp\\");
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(file53);
        org.junit.Assert.assertEquals(file53.getParent(), "hi!");
        org.junit.Assert.assertEquals(file53.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(file54);
        org.junit.Assert.assertEquals(file54.getParent(), "hi!\\hi!\\hi!");
        org.junit.Assert.assertEquals(file54.toString(), "hi!\\hi!\\hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test624");
        java.io.File file0 = org.apache.commons.io.FileUtils.getTempDirectory();
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file4 = org.apache.commons.io.FileUtils.getFile(strArray3);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file8 = org.apache.commons.io.FileUtils.getFile(strArray7);
        boolean boolean9 = org.apache.commons.io.FileUtils.isFileOlder(file4, file8);
        boolean boolean11 = org.apache.commons.io.FileUtils.waitFor(file8, (int) '4');
        org.apache.commons.io.LineIterator lineIterator12 = org.apache.commons.io.FileUtils.lineIterator(file8);
        boolean boolean14 = org.apache.commons.io.FileUtils.isFileOlder(file8, (-1L));
        java.nio.charset.Charset charset15 = null;
        java.lang.String str16 = org.apache.commons.io.FileUtils.readFileToString(file8, charset15);
        java.io.FileOutputStream fileOutputStream18 = org.apache.commons.io.FileUtils.openOutputStream(file8, false);
        java.io.FileOutputStream fileOutputStream20 = org.apache.commons.io.FileUtils.openOutputStream(file8, true);
        boolean boolean21 = org.apache.commons.io.FileUtils.isFileOlder(file0, file8);
        java.lang.String[] strArray28 = new java.lang.String[] { "C:\\Users\\Mathieu", "C:\\Users\\Mathieu", "", "1 GB", "hi!", "" };
        java.util.Iterator<java.io.File> fileItor30 = org.apache.commons.io.FileUtils.iterateFiles(file0, strArray28, true);
        java.io.File file31 = org.apache.commons.io.FileUtils.getFile(strArray28);
        java.io.File file32 = org.apache.commons.io.FileUtils.getFile(strArray28);
        org.junit.Assert.assertNotNull(file0);
        org.junit.Assert.assertEquals(file0.getParent(), "C:\\Users\\Mathieu\\AppData\\Local");
        org.junit.Assert.assertEquals(file0.toString(), "C:\\Users\\Mathieu\\AppData\\Local\\Temp");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(file4);
        org.junit.Assert.assertEquals(file4.getParent(), "hi!");
        org.junit.Assert.assertEquals(file4.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(file8);
        org.junit.Assert.assertEquals(file8.getParent(), "hi!");
        org.junit.Assert.assertEquals(file8.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(lineIterator12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1048576 EB" + "'", str16, "1048576 EB");
        org.junit.Assert.assertNotNull(fileOutputStream18);
        org.junit.Assert.assertNotNull(fileOutputStream20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(fileItor30);
        org.junit.Assert.assertNotNull(file31);
        org.junit.Assert.assertEquals(file31.getParent(), "C:\\Users\\Mathieu\\C:\\Users\\Mathieu\\1 GB");
        org.junit.Assert.assertEquals(file31.toString(), "C:\\Users\\Mathieu\\C:\\Users\\Mathieu\\1 GB\\hi!");
        org.junit.Assert.assertNotNull(file32);
        org.junit.Assert.assertEquals(file32.getParent(), "C:\\Users\\Mathieu\\C:\\Users\\Mathieu\\1 GB");
        org.junit.Assert.assertEquals(file32.toString(), "C:\\Users\\Mathieu\\C:\\Users\\Mathieu\\1 GB\\hi!");
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test625");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean9 = org.apache.commons.io.FileUtils.deleteQuietly(file7);
        java.nio.charset.Charset charset11 = null;
        org.apache.commons.io.FileUtils.write(file7, (java.lang.CharSequence) "", charset11, true);
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file17 = org.apache.commons.io.FileUtils.getFile(strArray16);
        java.io.File file18 = org.apache.commons.io.FileUtils.getFile(strArray16);
        java.io.File file19 = org.apache.commons.io.FileUtils.getFile(file7, strArray16);
        java.io.File file20 = org.apache.commons.io.FileUtils.getFile(strArray16);
        java.io.File file21 = org.apache.commons.io.FileUtils.getFile(strArray16);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(file17);
        org.junit.Assert.assertEquals(file17.getParent(), "hi!");
        org.junit.Assert.assertEquals(file17.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(file18);
        org.junit.Assert.assertEquals(file18.getParent(), "hi!");
        org.junit.Assert.assertEquals(file18.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(file19);
        org.junit.Assert.assertEquals(file19.getParent(), "hi!\\hi!\\hi!");
        org.junit.Assert.assertEquals(file19.toString(), "hi!\\hi!\\hi!\\hi!");
        org.junit.Assert.assertNotNull(file20);
        org.junit.Assert.assertEquals(file20.getParent(), "hi!");
        org.junit.Assert.assertEquals(file20.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(file21);
        org.junit.Assert.assertEquals(file21.getParent(), "hi!");
        org.junit.Assert.assertEquals(file21.toString(), "hi!\\hi!");
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test626");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file14 = org.apache.commons.io.FileUtils.getFile(strArray13);
        boolean boolean16 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file7, file14, "");
        java.io.FileInputStream fileInputStream17 = org.apache.commons.io.FileUtils.openInputStream(file14);
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file21 = org.apache.commons.io.FileUtils.getFile(strArray20);
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file25 = org.apache.commons.io.FileUtils.getFile(strArray24);
        boolean boolean26 = org.apache.commons.io.FileUtils.isFileOlder(file21, file25);
        boolean boolean27 = org.apache.commons.io.FileUtils.deleteQuietly(file25);
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file31 = org.apache.commons.io.FileUtils.getFile(strArray30);
        java.lang.String[] strArray34 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file35 = org.apache.commons.io.FileUtils.getFile(strArray34);
        boolean boolean36 = org.apache.commons.io.FileUtils.isFileOlder(file31, file35);
        boolean boolean38 = org.apache.commons.io.FileUtils.waitFor(file35, (int) '4');
        java.lang.String[] strArray41 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file42 = org.apache.commons.io.FileUtils.getFile(strArray41);
        boolean boolean44 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file35, file42, "");
        org.apache.commons.io.LineIterator lineIterator45 = org.apache.commons.io.FileUtils.lineIterator(file35);
        org.apache.commons.io.FileUtils.writeStringToFile(file35, "C:\\Users\\Mathieu\\AppData\\Local\\Temp\\", false);
        java.nio.charset.Charset charset50 = null;
        org.apache.commons.io.FileUtils.write(file35, (java.lang.CharSequence) "", charset50, true);
        boolean boolean54 = org.apache.commons.io.FileUtils.waitFor(file35, 0);
        boolean boolean55 = org.apache.commons.io.FileUtils.isFileOlder(file25, file35);
        java.lang.String[] strArray58 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file59 = org.apache.commons.io.FileUtils.getFile(strArray58);
        java.lang.String[] strArray62 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file63 = org.apache.commons.io.FileUtils.getFile(strArray62);
        boolean boolean64 = org.apache.commons.io.FileUtils.isFileOlder(file59, file63);
        boolean boolean66 = org.apache.commons.io.FileUtils.waitFor(file63, (int) '4');
        org.apache.commons.io.LineIterator lineIterator67 = org.apache.commons.io.FileUtils.lineIterator(file63);
        boolean boolean68 = org.apache.commons.io.FileUtils.deleteQuietly(file63);
        org.apache.commons.io.FileUtils.write(file63, (java.lang.CharSequence) "hi!");
        java.nio.charset.Charset charset72 = null;
        org.apache.commons.io.FileUtils.write(file63, (java.lang.CharSequence) "", charset72, true);
        java.nio.charset.Charset charset76 = null;
        org.apache.commons.io.FileUtils.writeStringToFile(file63, "", charset76, false);
        java.io.FileOutputStream fileOutputStream79 = org.apache.commons.io.FileUtils.openOutputStream(file63);
        long long80 = org.apache.commons.io.FileUtils.copyFile(file25, (java.io.OutputStream) fileOutputStream79);
        boolean boolean82 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file14, file25, "-1 bytes");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.FileUtils.cleanDirectory(file14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!\\hi! is not a directory");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(file14);
        org.junit.Assert.assertEquals(file14.getParent(), "hi!");
        org.junit.Assert.assertEquals(file14.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(fileInputStream17);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(file21);
        org.junit.Assert.assertEquals(file21.getParent(), "hi!");
        org.junit.Assert.assertEquals(file21.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(file25);
        org.junit.Assert.assertEquals(file25.getParent(), "hi!");
        org.junit.Assert.assertEquals(file25.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(file31);
        org.junit.Assert.assertEquals(file31.getParent(), "hi!");
        org.junit.Assert.assertEquals(file31.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(file35);
        org.junit.Assert.assertEquals(file35.getParent(), "hi!");
        org.junit.Assert.assertEquals(file35.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(file42);
        org.junit.Assert.assertEquals(file42.getParent(), "hi!");
        org.junit.Assert.assertEquals(file42.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(lineIterator45);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertNotNull(file59);
        org.junit.Assert.assertEquals(file59.getParent(), "hi!");
        org.junit.Assert.assertEquals(file59.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertNotNull(file63);
        org.junit.Assert.assertEquals(file63.getParent(), "hi!");
        org.junit.Assert.assertEquals(file63.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(lineIterator67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(fileOutputStream79);
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 0L + "'", long80 == 0L);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test627");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        org.apache.commons.io.LineIterator lineIterator11 = org.apache.commons.io.FileUtils.lineIterator(file7);
        boolean boolean13 = org.apache.commons.io.FileUtils.isFileOlder(file7, (-1L));
        long long14 = org.apache.commons.io.FileUtils.sizeOf(file7);
        org.apache.commons.io.FileUtils.touch(file7);
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file19 = org.apache.commons.io.FileUtils.getFile(strArray18);
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file23 = org.apache.commons.io.FileUtils.getFile(strArray22);
        boolean boolean24 = org.apache.commons.io.FileUtils.isFileOlder(file19, file23);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.FileUtils.copyFileToDirectory(file7, file19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Destination 'hi!\\hi!' is not a directory");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lineIterator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(file19);
        org.junit.Assert.assertEquals(file19.getParent(), "hi!");
        org.junit.Assert.assertEquals(file19.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(file23);
        org.junit.Assert.assertEquals(file23.getParent(), "hi!");
        org.junit.Assert.assertEquals(file23.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test628");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.io.File file5 = org.apache.commons.io.FileUtils.getFile(strArray4);
        java.io.File file6 = org.apache.commons.io.FileUtils.getFile(file3, strArray4);
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray4);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(file5);
        org.junit.Assert.assertNotNull(file6);
        org.junit.Assert.assertEquals(file6.getParent(), "hi!");
        org.junit.Assert.assertEquals(file6.toString(), "hi!\\hi!");
        org.junit.Assert.assertNull(file7);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test629");
        java.lang.String str1 = org.apache.commons.io.FileUtils.byteCountToDisplaySize(180L);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "180 bytes" + "'", str1, "180 bytes");
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test630");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        org.apache.commons.io.LineIterator lineIterator11 = org.apache.commons.io.FileUtils.lineIterator(file7);
        boolean boolean12 = org.apache.commons.io.FileUtils.deleteQuietly(file7);
        org.apache.commons.io.FileUtils.writeStringToFile(file7, "");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file18 = org.apache.commons.io.FileUtils.getFile(strArray17);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file22 = org.apache.commons.io.FileUtils.getFile(strArray21);
        boolean boolean23 = org.apache.commons.io.FileUtils.isFileOlder(file18, file22);
        boolean boolean25 = org.apache.commons.io.FileUtils.waitFor(file22, (int) '4');
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file29 = org.apache.commons.io.FileUtils.getFile(strArray28);
        boolean boolean31 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file22, file29, "");
        boolean boolean32 = org.apache.commons.io.FileUtils.isFileNewer(file7, file22);
        boolean boolean33 = org.apache.commons.io.FileUtils.isSymlink(file7);
        org.apache.commons.io.FileUtils.writeStringToFile(file7, "C:\\Users\\Mathieu\\AppData\\Local\\Temp\\", true);
        java.lang.String str37 = org.apache.commons.io.FileUtils.readFileToString(file7);
        boolean boolean39 = org.apache.commons.io.FileUtils.isFileOlder(file7, 1152921504606846976L);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lineIterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(file18);
        org.junit.Assert.assertEquals(file18.getParent(), "hi!");
        org.junit.Assert.assertEquals(file18.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(file22);
        org.junit.Assert.assertEquals(file22.getParent(), "hi!");
        org.junit.Assert.assertEquals(file22.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(file29);
        org.junit.Assert.assertEquals(file29.getParent(), "hi!");
        org.junit.Assert.assertEquals(file29.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "C:\\Users\\Mathieu\\AppData\\Local\\Temp\\" + "'", str37, "C:\\Users\\Mathieu\\AppData\\Local\\Temp\\");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    @Disabled
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test631");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        java.lang.String str9 = org.apache.commons.io.FileUtils.readFileToString(file3);
        java.nio.charset.Charset charset10 = null;
        java.lang.String str11 = org.apache.commons.io.FileUtils.readFileToString(file3, charset10);
        java.math.BigInteger bigInteger12 = org.apache.commons.io.FileUtils.sizeOfAsBigInteger(file3);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file16 = org.apache.commons.io.FileUtils.getFile(strArray15);
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file20 = org.apache.commons.io.FileUtils.getFile(strArray19);
        boolean boolean21 = org.apache.commons.io.FileUtils.isFileOlder(file16, file20);
        java.lang.String str22 = org.apache.commons.io.FileUtils.readFileToString(file16);
        org.apache.commons.io.FileUtils.writeStringToFile(file16, "", false);
        boolean boolean27 = org.apache.commons.io.FileUtils.isFileNewer(file16, 0L);
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file31 = org.apache.commons.io.FileUtils.getFile(strArray30);
        java.lang.String[] strArray34 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file35 = org.apache.commons.io.FileUtils.getFile(strArray34);
        boolean boolean36 = org.apache.commons.io.FileUtils.isFileOlder(file31, file35);
        boolean boolean38 = org.apache.commons.io.FileUtils.waitFor(file35, (int) '4');
        java.lang.String[] strArray41 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file42 = org.apache.commons.io.FileUtils.getFile(strArray41);
        boolean boolean44 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file35, file42, "");
        org.apache.commons.io.LineIterator lineIterator45 = org.apache.commons.io.FileUtils.lineIterator(file35);
        org.apache.commons.io.FileUtils.writeStringToFile(file35, "C:\\Users\\Mathieu\\AppData\\Local\\Temp\\", false);
        java.lang.String[] strArray51 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file52 = org.apache.commons.io.FileUtils.getFile(strArray51);
        java.lang.String[] strArray55 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file56 = org.apache.commons.io.FileUtils.getFile(strArray55);
        boolean boolean57 = org.apache.commons.io.FileUtils.isFileOlder(file52, file56);
        java.lang.String str58 = org.apache.commons.io.FileUtils.readFileToString(file52);
        java.lang.String[] strArray61 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file62 = org.apache.commons.io.FileUtils.getFile(strArray61);
        java.io.File file63 = org.apache.commons.io.FileUtils.getFile(file52, strArray61);
        boolean boolean65 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file35, file63, "-1 bytes");
        java.io.FileOutputStream fileOutputStream66 = org.apache.commons.io.FileUtils.openOutputStream(file35);
        long long67 = org.apache.commons.io.FileUtils.copyFile(file16, (java.io.OutputStream) fileOutputStream66);
        long long68 = org.apache.commons.io.FileUtils.copyFile(file3, (java.io.OutputStream) fileOutputStream66);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(bigInteger12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(file16);
        org.junit.Assert.assertEquals(file16.getParent(), "hi!");
        org.junit.Assert.assertEquals(file16.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(file20);
        org.junit.Assert.assertEquals(file20.getParent(), "hi!");
        org.junit.Assert.assertEquals(file20.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(file31);
        org.junit.Assert.assertEquals(file31.getParent(), "hi!");
        org.junit.Assert.assertEquals(file31.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(file35);
        org.junit.Assert.assertEquals(file35.getParent(), "hi!");
        org.junit.Assert.assertEquals(file35.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(file42);
        org.junit.Assert.assertEquals(file42.getParent(), "hi!");
        org.junit.Assert.assertEquals(file42.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(lineIterator45);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(file52);
        org.junit.Assert.assertEquals(file52.getParent(), "hi!");
        org.junit.Assert.assertEquals(file52.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(file56);
        org.junit.Assert.assertEquals(file56.getParent(), "hi!");
        org.junit.Assert.assertEquals(file56.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "C:\\Users\\Mathieu\\AppData\\Local\\Temp\\" + "'", str58, "C:\\Users\\Mathieu\\AppData\\Local\\Temp\\");
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertNotNull(file62);
        org.junit.Assert.assertEquals(file62.getParent(), "hi!");
        org.junit.Assert.assertEquals(file62.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(file63);
        org.junit.Assert.assertEquals(file63.getParent(), "hi!\\hi!\\hi!");
        org.junit.Assert.assertEquals(file63.toString(), "hi!\\hi!\\hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(fileOutputStream66);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 0L + "'", long67 == 0L);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 0L + "'", long68 == 0L);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test632");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        org.apache.commons.io.LineIterator lineIterator11 = org.apache.commons.io.FileUtils.lineIterator(file7);
        boolean boolean13 = org.apache.commons.io.FileUtils.isFileOlder(file7, (-1L));
        java.nio.charset.Charset charset14 = null;
        java.lang.String str15 = org.apache.commons.io.FileUtils.readFileToString(file7, charset14);
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file19 = org.apache.commons.io.FileUtils.getFile(strArray18);
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file23 = org.apache.commons.io.FileUtils.getFile(strArray22);
        boolean boolean24 = org.apache.commons.io.FileUtils.isFileOlder(file19, file23);
        boolean boolean26 = org.apache.commons.io.FileUtils.waitFor(file23, (int) '4');
        org.apache.commons.io.LineIterator lineIterator27 = org.apache.commons.io.FileUtils.lineIterator(file23);
        boolean boolean28 = org.apache.commons.io.FileUtils.deleteQuietly(file23);
        org.apache.commons.io.FileUtils.write(file23, (java.lang.CharSequence) "hi!");
        java.nio.charset.Charset charset32 = null;
        org.apache.commons.io.FileUtils.write(file23, (java.lang.CharSequence) "", charset32, true);
        java.nio.charset.Charset charset36 = null;
        org.apache.commons.io.FileUtils.writeStringToFile(file23, "", charset36, false);
        long long39 = org.apache.commons.io.FileUtils.sizeOf(file23);
        org.apache.commons.io.FileUtils.writeStringToFile(file23, "");
        java.nio.charset.Charset charset42 = null;
        java.util.List<java.lang.String> strList43 = org.apache.commons.io.FileUtils.readLines(file23, charset42);
        org.apache.commons.io.FileUtils.writeLines(file7, (java.util.Collection<java.lang.String>) strList43, "hi!");
        org.apache.commons.io.FileUtils.forceDeleteOnExit(file7);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lineIterator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(file19);
        org.junit.Assert.assertEquals(file19.getParent(), "hi!");
        org.junit.Assert.assertEquals(file19.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(file23);
        org.junit.Assert.assertEquals(file23.getParent(), "hi!");
        org.junit.Assert.assertEquals(file23.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(lineIterator27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertNotNull(strList43);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test633");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        org.apache.commons.io.LineIterator lineIterator11 = org.apache.commons.io.FileUtils.lineIterator(file7);
        boolean boolean12 = org.apache.commons.io.FileUtils.deleteQuietly(file7);
        org.apache.commons.io.FileUtils.writeStringToFile(file7, "");
        org.apache.commons.io.FileUtils.forceMkdirParent(file7);
        java.nio.charset.Charset charset16 = null;
        java.lang.String str17 = org.apache.commons.io.FileUtils.readFileToString(file7, charset16);
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file21 = org.apache.commons.io.FileUtils.getFile(strArray20);
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file25 = org.apache.commons.io.FileUtils.getFile(strArray24);
        boolean boolean26 = org.apache.commons.io.FileUtils.isFileOlder(file21, file25);
        boolean boolean28 = org.apache.commons.io.FileUtils.waitFor(file25, (int) '4');
        org.apache.commons.io.LineIterator lineIterator29 = org.apache.commons.io.FileUtils.lineIterator(file25);
        boolean boolean30 = org.apache.commons.io.FileUtils.deleteQuietly(file25);
        org.apache.commons.io.FileUtils.write(file25, (java.lang.CharSequence) "hi!");
        org.apache.commons.io.FileUtils.write(file25, (java.lang.CharSequence) "1 GB1048576 EB1 GBC:\\Users\\Mathieu\\AppData\\Local\\Temp\\1 GBC:\\Users\\Mathieu1 GB1 GB1048576 EB1 GB", true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean36 = org.apache.commons.io.FileUtils.directoryContains(file7, file25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Not a directory: hi!\\hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lineIterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(file21);
        org.junit.Assert.assertEquals(file21.getParent(), "hi!");
        org.junit.Assert.assertEquals(file21.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(file25);
        org.junit.Assert.assertEquals(file25.getParent(), "hi!");
        org.junit.Assert.assertEquals(file25.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(lineIterator29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test634");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        org.apache.commons.io.LineIterator lineIterator11 = org.apache.commons.io.FileUtils.lineIterator(file7);
        boolean boolean12 = org.apache.commons.io.FileUtils.deleteQuietly(file7);
        org.apache.commons.io.FileUtils.write(file7, (java.lang.CharSequence) "hi!");
        java.nio.charset.Charset charset16 = null;
        org.apache.commons.io.FileUtils.write(file7, (java.lang.CharSequence) "", charset16, true);
        java.nio.charset.Charset charset20 = null;
        org.apache.commons.io.FileUtils.writeStringToFile(file7, "", charset20, false);
        long long23 = org.apache.commons.io.FileUtils.sizeOf(file7);
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file27 = org.apache.commons.io.FileUtils.getFile(strArray26);
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file31 = org.apache.commons.io.FileUtils.getFile(strArray30);
        boolean boolean32 = org.apache.commons.io.FileUtils.isFileOlder(file27, file31);
        boolean boolean34 = org.apache.commons.io.FileUtils.waitFor(file31, (int) '4');
        org.apache.commons.io.LineIterator lineIterator35 = org.apache.commons.io.FileUtils.lineIterator(file31);
        boolean boolean36 = org.apache.commons.io.FileUtils.deleteQuietly(file31);
        org.apache.commons.io.FileUtils.write(file31, (java.lang.CharSequence) "hi!");
        java.nio.charset.Charset charset40 = null;
        org.apache.commons.io.FileUtils.write(file31, (java.lang.CharSequence) "", charset40, true);
        java.nio.charset.Charset charset44 = null;
        org.apache.commons.io.FileUtils.writeStringToFile(file31, "", charset44, false);
        long long47 = org.apache.commons.io.FileUtils.sizeOf(file31);
        org.apache.commons.io.FileUtils.writeStringToFile(file31, "");
        boolean boolean51 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file7, file31, "hi!");
        java.lang.String[] strArray54 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file55 = org.apache.commons.io.FileUtils.getFile(strArray54);
        java.lang.String[] strArray56 = new java.lang.String[] {};
        java.io.File file57 = org.apache.commons.io.FileUtils.getFile(strArray56);
        java.io.File file58 = org.apache.commons.io.FileUtils.getFile(file55, strArray56);
        java.lang.String[] strArray61 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file62 = org.apache.commons.io.FileUtils.getFile(strArray61);
        java.lang.String[] strArray65 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file66 = org.apache.commons.io.FileUtils.getFile(strArray65);
        boolean boolean67 = org.apache.commons.io.FileUtils.isFileOlder(file62, file66);
        boolean boolean69 = org.apache.commons.io.FileUtils.waitFor(file66, (int) '4');
        org.apache.commons.io.LineIterator lineIterator70 = org.apache.commons.io.FileUtils.lineIterator(file66);
        boolean boolean72 = org.apache.commons.io.FileUtils.isFileOlder(file66, (-1L));
        java.io.FileOutputStream fileOutputStream74 = org.apache.commons.io.FileUtils.openOutputStream(file66, false);
        long long75 = org.apache.commons.io.FileUtils.copyFile(file55, (java.io.OutputStream) fileOutputStream74);
        boolean boolean76 = org.apache.commons.io.FileUtils.isFileOlder(file7, file55);
        java.util.zip.Checksum checksum77 = null;
        java.util.zip.Checksum checksum78 = org.apache.commons.io.FileUtils.checksum(file7, checksum77);
        java.math.BigInteger bigInteger79 = org.apache.commons.io.FileUtils.sizeOfAsBigInteger(file7);
        java.io.File file80 = null;
        java.io.FileFilter fileFilter81 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.FileUtils.copyDirectory(file7, file80, fileFilter81, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: target");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lineIterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(file27);
        org.junit.Assert.assertEquals(file27.getParent(), "hi!");
        org.junit.Assert.assertEquals(file27.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(file31);
        org.junit.Assert.assertEquals(file31.getParent(), "hi!");
        org.junit.Assert.assertEquals(file31.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(lineIterator35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertNotNull(file55);
        org.junit.Assert.assertEquals(file55.getParent(), "hi!");
        org.junit.Assert.assertEquals(file55.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertNull(file57);
        org.junit.Assert.assertNotNull(file58);
        org.junit.Assert.assertEquals(file58.getParent(), "hi!");
        org.junit.Assert.assertEquals(file58.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertNotNull(file62);
        org.junit.Assert.assertEquals(file62.getParent(), "hi!");
        org.junit.Assert.assertEquals(file62.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertNotNull(file66);
        org.junit.Assert.assertEquals(file66.getParent(), "hi!");
        org.junit.Assert.assertEquals(file66.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(lineIterator70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(fileOutputStream74);
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 0L + "'", long75 == 0L);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNull(checksum78);
        org.junit.Assert.assertNotNull(bigInteger79);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test635");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        org.apache.commons.io.LineIterator lineIterator11 = org.apache.commons.io.FileUtils.lineIterator(file7);
        boolean boolean12 = org.apache.commons.io.FileUtils.deleteQuietly(file7);
        java.io.FileOutputStream fileOutputStream13 = org.apache.commons.io.FileUtils.openOutputStream(file7);
        java.io.FileInputStream fileInputStream14 = org.apache.commons.io.FileUtils.openInputStream(file7);
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file18 = org.apache.commons.io.FileUtils.getFile(strArray17);
        org.apache.commons.io.FileUtils.copyToFile((java.io.InputStream) fileInputStream14, file18);
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file23 = org.apache.commons.io.FileUtils.getFile(strArray22);
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file27 = org.apache.commons.io.FileUtils.getFile(strArray26);
        boolean boolean28 = org.apache.commons.io.FileUtils.isFileOlder(file23, file27);
        boolean boolean30 = org.apache.commons.io.FileUtils.waitFor(file27, (int) '4');
        org.apache.commons.io.LineIterator lineIterator31 = org.apache.commons.io.FileUtils.lineIterator(file27);
        boolean boolean32 = org.apache.commons.io.FileUtils.deleteQuietly(file27);
        org.apache.commons.io.FileUtils.write(file27, (java.lang.CharSequence) "hi!");
        java.nio.charset.Charset charset36 = null;
        org.apache.commons.io.FileUtils.write(file27, (java.lang.CharSequence) "", charset36, true);
        java.nio.charset.Charset charset40 = null;
        org.apache.commons.io.FileUtils.writeStringToFile(file27, "", charset40, false);
        long long43 = org.apache.commons.io.FileUtils.sizeOf(file27);
        org.apache.commons.io.FileUtils.writeStringToFile(file27, "");
        java.nio.charset.Charset charset46 = null;
        java.util.List<java.lang.String> strList47 = org.apache.commons.io.FileUtils.readLines(file27, charset46);
        org.apache.commons.io.FileUtils.writeLines(file18, (java.util.Collection<java.lang.String>) strList47, "hi!\000\000d\001");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lineIterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(fileOutputStream13);
        org.junit.Assert.assertNotNull(fileInputStream14);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(file18);
        org.junit.Assert.assertEquals(file18.getParent(), "hi!");
        org.junit.Assert.assertEquals(file18.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(file23);
        org.junit.Assert.assertEquals(file23.getParent(), "hi!");
        org.junit.Assert.assertEquals(file23.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(file27);
        org.junit.Assert.assertEquals(file27.getParent(), "hi!");
        org.junit.Assert.assertEquals(file27.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(lineIterator31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertNotNull(strList47);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test636");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file14 = org.apache.commons.io.FileUtils.getFile(strArray13);
        boolean boolean16 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file7, file14, "");
        org.apache.commons.io.LineIterator lineIterator17 = org.apache.commons.io.FileUtils.lineIterator(file7);
        org.apache.commons.io.FileUtils.writeStringToFile(file7, "C:\\Users\\Mathieu\\AppData\\Local\\Temp\\", false);
        java.nio.charset.Charset charset22 = null;
        org.apache.commons.io.FileUtils.write(file7, (java.lang.CharSequence) "", charset22, true);
        org.apache.commons.io.FileUtils.touch(file7);
        // The following exception was thrown during execution in test generation
        try {
            long long26 = org.apache.commons.io.FileUtils.sizeOfDirectory(file7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!\\hi! is not a directory");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(file14);
        org.junit.Assert.assertEquals(file14.getParent(), "hi!");
        org.junit.Assert.assertEquals(file14.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(lineIterator17);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test637");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        java.nio.charset.Charset charset11 = null;
        java.lang.String str12 = org.apache.commons.io.FileUtils.readFileToString(file7, charset11);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file16 = org.apache.commons.io.FileUtils.getFile(strArray15);
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file20 = org.apache.commons.io.FileUtils.getFile(strArray19);
        boolean boolean21 = org.apache.commons.io.FileUtils.isFileOlder(file16, file20);
        boolean boolean23 = org.apache.commons.io.FileUtils.waitFor(file20, (int) '4');
        org.apache.commons.io.LineIterator lineIterator24 = org.apache.commons.io.FileUtils.lineIterator(file20);
        boolean boolean25 = org.apache.commons.io.FileUtils.deleteQuietly(file20);
        org.apache.commons.io.FileUtils.writeStringToFile(file20, "");
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file31 = org.apache.commons.io.FileUtils.getFile(strArray30);
        java.lang.String[] strArray34 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file35 = org.apache.commons.io.FileUtils.getFile(strArray34);
        boolean boolean36 = org.apache.commons.io.FileUtils.isFileOlder(file31, file35);
        boolean boolean38 = org.apache.commons.io.FileUtils.waitFor(file35, (int) '4');
        java.lang.String[] strArray41 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file42 = org.apache.commons.io.FileUtils.getFile(strArray41);
        boolean boolean44 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file35, file42, "");
        boolean boolean45 = org.apache.commons.io.FileUtils.isFileNewer(file20, file35);
        java.io.File file46 = null;
        boolean boolean47 = org.apache.commons.io.FileUtils.contentEquals(file35, file46);
        org.apache.commons.io.FileUtils.touch(file35);
        java.lang.String str49 = org.apache.commons.io.FileUtils.readFileToString(file35);
        org.apache.commons.io.FileUtils.forceMkdirParent(file35);
        org.apache.commons.io.FileUtils.forceMkdirParent(file35);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.FileUtils.moveToDirectory(file7, file35, true);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Destination 'hi!\\hi!' is not a directory");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "C:\\Users\\Mathieu\\AppData\\Local\\Temp\\" + "'", str12, "C:\\Users\\Mathieu\\AppData\\Local\\Temp\\");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(file16);
        org.junit.Assert.assertEquals(file16.getParent(), "hi!");
        org.junit.Assert.assertEquals(file16.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(file20);
        org.junit.Assert.assertEquals(file20.getParent(), "hi!");
        org.junit.Assert.assertEquals(file20.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(lineIterator24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(file31);
        org.junit.Assert.assertEquals(file31.getParent(), "hi!");
        org.junit.Assert.assertEquals(file31.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(file35);
        org.junit.Assert.assertEquals(file35.getParent(), "hi!");
        org.junit.Assert.assertEquals(file35.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(file42);
        org.junit.Assert.assertEquals(file42.getParent(), "hi!");
        org.junit.Assert.assertEquals(file42.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test638");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        org.apache.commons.io.LineIterator lineIterator11 = org.apache.commons.io.FileUtils.lineIterator(file7);
        boolean boolean13 = org.apache.commons.io.FileUtils.isFileOlder(file7, (-1L));
        java.nio.charset.Charset charset14 = null;
        java.lang.String str15 = org.apache.commons.io.FileUtils.readFileToString(file7, charset14);
        java.io.FileOutputStream fileOutputStream17 = org.apache.commons.io.FileUtils.openOutputStream(file7, false);
        org.apache.commons.io.LineIterator lineIterator18 = org.apache.commons.io.FileUtils.lineIterator(file7);
        org.apache.commons.io.FileUtils.writeStringToFile(file7, "-1 bytes", false);
        java.nio.charset.Charset charset23 = null;
        org.apache.commons.io.FileUtils.write(file7, (java.lang.CharSequence) "32 bytes", charset23);
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file28 = org.apache.commons.io.FileUtils.getFile(strArray27);
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file32 = org.apache.commons.io.FileUtils.getFile(strArray31);
        boolean boolean33 = org.apache.commons.io.FileUtils.isFileOlder(file28, file32);
        boolean boolean35 = org.apache.commons.io.FileUtils.waitFor(file32, (int) '4');
        org.apache.commons.io.LineIterator lineIterator36 = org.apache.commons.io.FileUtils.lineIterator(file32);
        boolean boolean37 = org.apache.commons.io.FileUtils.deleteQuietly(file32);
        org.apache.commons.io.FileUtils.write(file32, (java.lang.CharSequence) "hi!");
        java.nio.charset.Charset charset41 = null;
        org.apache.commons.io.FileUtils.write(file32, (java.lang.CharSequence) "", charset41, true);
        java.nio.charset.Charset charset45 = null;
        org.apache.commons.io.FileUtils.writeStringToFile(file32, "", charset45, false);
        long long48 = org.apache.commons.io.FileUtils.sizeOf(file32);
        org.apache.commons.io.FileUtils.writeStringToFile(file32, "");
        java.nio.charset.Charset charset51 = null;
        java.util.List<java.lang.String> strList52 = org.apache.commons.io.FileUtils.readLines(file32, charset51);
        boolean boolean54 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file7, file32, "100 bytes");
        boolean boolean55 = org.apache.commons.io.FileUtils.deleteQuietly(file32);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lineIterator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(fileOutputStream17);
        org.junit.Assert.assertNotNull(lineIterator18);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(file28);
        org.junit.Assert.assertEquals(file28.getParent(), "hi!");
        org.junit.Assert.assertEquals(file28.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(file32);
        org.junit.Assert.assertEquals(file32.getParent(), "hi!");
        org.junit.Assert.assertEquals(file32.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(lineIterator36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertNotNull(strList52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test639");
        java.net.URL uRL0 = null;
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file4 = org.apache.commons.io.FileUtils.getFile(strArray3);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file8 = org.apache.commons.io.FileUtils.getFile(strArray7);
        boolean boolean9 = org.apache.commons.io.FileUtils.isFileOlder(file4, file8);
        boolean boolean11 = org.apache.commons.io.FileUtils.waitFor(file8, (int) '4');
        org.apache.commons.io.LineIterator lineIterator12 = org.apache.commons.io.FileUtils.lineIterator(file8);
        boolean boolean13 = org.apache.commons.io.FileUtils.deleteQuietly(file8);
        org.apache.commons.io.FileUtils.writeStringToFile(file8, "");
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file19 = org.apache.commons.io.FileUtils.getFile(strArray18);
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file23 = org.apache.commons.io.FileUtils.getFile(strArray22);
        boolean boolean24 = org.apache.commons.io.FileUtils.isFileOlder(file19, file23);
        boolean boolean26 = org.apache.commons.io.FileUtils.waitFor(file23, (int) '4');
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file30 = org.apache.commons.io.FileUtils.getFile(strArray29);
        boolean boolean32 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file23, file30, "");
        boolean boolean33 = org.apache.commons.io.FileUtils.isFileNewer(file8, file23);
        java.io.File file34 = null;
        boolean boolean35 = org.apache.commons.io.FileUtils.contentEquals(file23, file34);
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file39 = org.apache.commons.io.FileUtils.getFile(strArray38);
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file43 = org.apache.commons.io.FileUtils.getFile(strArray42);
        boolean boolean44 = org.apache.commons.io.FileUtils.isFileOlder(file39, file43);
        boolean boolean46 = org.apache.commons.io.FileUtils.waitFor(file43, (int) '4');
        org.apache.commons.io.LineIterator lineIterator47 = org.apache.commons.io.FileUtils.lineIterator(file43);
        boolean boolean48 = org.apache.commons.io.FileUtils.deleteQuietly(file43);
        org.apache.commons.io.FileUtils.writeStringToFile(file43, "");
        java.lang.String[] strArray53 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file54 = org.apache.commons.io.FileUtils.getFile(strArray53);
        java.lang.String[] strArray57 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file58 = org.apache.commons.io.FileUtils.getFile(strArray57);
        boolean boolean59 = org.apache.commons.io.FileUtils.isFileOlder(file54, file58);
        boolean boolean61 = org.apache.commons.io.FileUtils.waitFor(file58, (int) '4');
        java.lang.String[] strArray64 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file65 = org.apache.commons.io.FileUtils.getFile(strArray64);
        boolean boolean67 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file58, file65, "");
        boolean boolean68 = org.apache.commons.io.FileUtils.isFileNewer(file43, file58);
        boolean boolean69 = org.apache.commons.io.FileUtils.isSymlink(file43);
        org.apache.commons.io.FileUtils.writeStringToFile(file43, "C:\\Users\\Mathieu\\AppData\\Local\\Temp\\", true);
        java.lang.String[] strArray75 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file76 = org.apache.commons.io.FileUtils.getFile(strArray75);
        java.lang.String[] strArray79 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file80 = org.apache.commons.io.FileUtils.getFile(strArray79);
        boolean boolean81 = org.apache.commons.io.FileUtils.isFileOlder(file76, file80);
        boolean boolean83 = org.apache.commons.io.FileUtils.waitFor(file80, (int) '4');
        org.apache.commons.io.LineIterator lineIterator84 = org.apache.commons.io.FileUtils.lineIterator(file80);
        boolean boolean86 = org.apache.commons.io.FileUtils.isFileOlder(file80, (-1L));
        byte[] byteArray87 = new byte[] {};
        org.apache.commons.io.FileUtils.writeByteArrayToFile(file80, byteArray87);
        org.apache.commons.io.FileUtils.writeByteArrayToFile(file43, byteArray87);
        boolean boolean91 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file23, file43, "1048576 EB");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.FileUtils.copyURLToFile(uRL0, file43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.net.URL.openStream()\" because \"source\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(file4);
        org.junit.Assert.assertEquals(file4.getParent(), "hi!");
        org.junit.Assert.assertEquals(file4.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(file8);
        org.junit.Assert.assertEquals(file8.getParent(), "hi!");
        org.junit.Assert.assertEquals(file8.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(lineIterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(file19);
        org.junit.Assert.assertEquals(file19.getParent(), "hi!");
        org.junit.Assert.assertEquals(file19.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(file23);
        org.junit.Assert.assertEquals(file23.getParent(), "hi!");
        org.junit.Assert.assertEquals(file23.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(file30);
        org.junit.Assert.assertEquals(file30.getParent(), "hi!");
        org.junit.Assert.assertEquals(file30.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(file39);
        org.junit.Assert.assertEquals(file39.getParent(), "hi!");
        org.junit.Assert.assertEquals(file39.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(file43);
        org.junit.Assert.assertEquals(file43.getParent(), "hi!");
        org.junit.Assert.assertEquals(file43.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(lineIterator47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(file54);
        org.junit.Assert.assertEquals(file54.getParent(), "hi!");
        org.junit.Assert.assertEquals(file54.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertNotNull(file58);
        org.junit.Assert.assertEquals(file58.getParent(), "hi!");
        org.junit.Assert.assertEquals(file58.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertNotNull(file65);
        org.junit.Assert.assertEquals(file65.getParent(), "hi!");
        org.junit.Assert.assertEquals(file65.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertNotNull(file76);
        org.junit.Assert.assertEquals(file76.getParent(), "hi!");
        org.junit.Assert.assertEquals(file76.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertNotNull(file80);
        org.junit.Assert.assertEquals(file80.getParent(), "hi!");
        org.junit.Assert.assertEquals(file80.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(lineIterator84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(byteArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray87), "[]");
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test640");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        org.apache.commons.io.LineIterator lineIterator11 = org.apache.commons.io.FileUtils.lineIterator(file7);
        boolean boolean13 = org.apache.commons.io.FileUtils.isFileOlder(file7, (-1L));
        java.nio.charset.Charset charset14 = null;
        java.lang.String str15 = org.apache.commons.io.FileUtils.readFileToString(file7, charset14);
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file19 = org.apache.commons.io.FileUtils.getFile(strArray18);
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file23 = org.apache.commons.io.FileUtils.getFile(strArray22);
        boolean boolean24 = org.apache.commons.io.FileUtils.isFileOlder(file19, file23);
        boolean boolean26 = org.apache.commons.io.FileUtils.waitFor(file23, (int) '4');
        org.apache.commons.io.LineIterator lineIterator27 = org.apache.commons.io.FileUtils.lineIterator(file23);
        boolean boolean28 = org.apache.commons.io.FileUtils.deleteQuietly(file23);
        org.apache.commons.io.FileUtils.write(file23, (java.lang.CharSequence) "hi!");
        java.nio.charset.Charset charset32 = null;
        org.apache.commons.io.FileUtils.write(file23, (java.lang.CharSequence) "", charset32, true);
        java.nio.charset.Charset charset36 = null;
        org.apache.commons.io.FileUtils.writeStringToFile(file23, "", charset36, false);
        long long39 = org.apache.commons.io.FileUtils.sizeOf(file23);
        org.apache.commons.io.FileUtils.writeStringToFile(file23, "");
        java.nio.charset.Charset charset42 = null;
        java.util.List<java.lang.String> strList43 = org.apache.commons.io.FileUtils.readLines(file23, charset42);
        org.apache.commons.io.FileUtils.writeLines(file7, (java.util.Collection<java.lang.String>) strList43, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.FileUtils.write(file7, (java.lang.CharSequence) "180 bytes", "C:\\Users\\Mathieu", true);
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: C:\\Users\\Mathieu");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lineIterator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(file19);
        org.junit.Assert.assertEquals(file19.getParent(), "hi!");
        org.junit.Assert.assertEquals(file19.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(file23);
        org.junit.Assert.assertEquals(file23.getParent(), "hi!");
        org.junit.Assert.assertEquals(file23.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(lineIterator27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertNotNull(strList43);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test641");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        org.apache.commons.io.LineIterator lineIterator11 = org.apache.commons.io.FileUtils.lineIterator(file7);
        boolean boolean13 = org.apache.commons.io.FileUtils.isFileOlder(file7, (-1L));
        long long14 = org.apache.commons.io.FileUtils.sizeOf(file7);
        java.io.File file15 = org.apache.commons.io.FileUtils.getUserDirectory();
        org.apache.commons.io.FileUtils.copyFileToDirectory(file7, file15, true);
        org.apache.commons.io.FileUtils.write(file7, (java.lang.CharSequence) "hi!", true);
        byte[] byteArray21 = org.apache.commons.io.FileUtils.readFileToByteArray(file7);
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file25 = org.apache.commons.io.FileUtils.getFile(strArray24);
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file29 = org.apache.commons.io.FileUtils.getFile(strArray28);
        boolean boolean30 = org.apache.commons.io.FileUtils.isFileOlder(file25, file29);
        boolean boolean32 = org.apache.commons.io.FileUtils.waitFor(file29, (int) '4');
        org.apache.commons.io.LineIterator lineIterator33 = org.apache.commons.io.FileUtils.lineIterator(file29);
        boolean boolean34 = org.apache.commons.io.FileUtils.deleteQuietly(file29);
        org.apache.commons.io.FileUtils.write(file29, (java.lang.CharSequence) "hi!");
        java.nio.charset.Charset charset38 = null;
        org.apache.commons.io.FileUtils.write(file29, (java.lang.CharSequence) "", charset38, true);
        java.nio.charset.Charset charset42 = null;
        org.apache.commons.io.FileUtils.writeStringToFile(file29, "", charset42, false);
        long long45 = org.apache.commons.io.FileUtils.sizeOf(file29);
        java.lang.String[] strArray48 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file49 = org.apache.commons.io.FileUtils.getFile(strArray48);
        java.lang.String[] strArray52 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file53 = org.apache.commons.io.FileUtils.getFile(strArray52);
        boolean boolean54 = org.apache.commons.io.FileUtils.isFileOlder(file49, file53);
        boolean boolean56 = org.apache.commons.io.FileUtils.waitFor(file53, (int) '4');
        org.apache.commons.io.LineIterator lineIterator57 = org.apache.commons.io.FileUtils.lineIterator(file53);
        boolean boolean58 = org.apache.commons.io.FileUtils.deleteQuietly(file53);
        org.apache.commons.io.FileUtils.write(file53, (java.lang.CharSequence) "hi!");
        java.nio.charset.Charset charset62 = null;
        org.apache.commons.io.FileUtils.write(file53, (java.lang.CharSequence) "", charset62, true);
        java.nio.charset.Charset charset66 = null;
        org.apache.commons.io.FileUtils.writeStringToFile(file53, "", charset66, false);
        long long69 = org.apache.commons.io.FileUtils.sizeOf(file53);
        org.apache.commons.io.FileUtils.writeStringToFile(file53, "");
        boolean boolean73 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file29, file53, "hi!");
        java.lang.String[] strArray76 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file77 = org.apache.commons.io.FileUtils.getFile(strArray76);
        java.lang.String[] strArray80 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file81 = org.apache.commons.io.FileUtils.getFile(strArray80);
        boolean boolean82 = org.apache.commons.io.FileUtils.isFileOlder(file77, file81);
        boolean boolean84 = org.apache.commons.io.FileUtils.waitFor(file81, (int) '4');
        org.apache.commons.io.LineIterator lineIterator85 = org.apache.commons.io.FileUtils.lineIterator(file81);
        boolean boolean86 = org.apache.commons.io.FileUtils.deleteQuietly(file81);
        org.apache.commons.io.FileUtils.write(file81, (java.lang.CharSequence) "hi!");
        java.nio.charset.Charset charset90 = null;
        org.apache.commons.io.FileUtils.write(file81, (java.lang.CharSequence) "", charset90, true);
        byte[] byteArray93 = org.apache.commons.io.FileUtils.readFileToByteArray(file81);
        org.apache.commons.io.FileUtils.writeByteArrayToFile(file29, byteArray93, true);
        org.apache.commons.io.FileUtils.writeByteArrayToFile(file7, byteArray93, true);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lineIterator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(file15);
        org.junit.Assert.assertEquals(file15.getParent(), "C:\\Users");
        org.junit.Assert.assertEquals(file15.toString(), "C:\\Users\\Mathieu");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[104, 105, 33]");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(file25);
        org.junit.Assert.assertEquals(file25.getParent(), "hi!");
        org.junit.Assert.assertEquals(file25.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(file29);
        org.junit.Assert.assertEquals(file29.getParent(), "hi!");
        org.junit.Assert.assertEquals(file29.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(lineIterator33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(file49);
        org.junit.Assert.assertEquals(file49.getParent(), "hi!");
        org.junit.Assert.assertEquals(file49.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(file53);
        org.junit.Assert.assertEquals(file53.getParent(), "hi!");
        org.junit.Assert.assertEquals(file53.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(lineIterator57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 0L + "'", long69 == 0L);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertNotNull(file77);
        org.junit.Assert.assertEquals(file77.getParent(), "hi!");
        org.junit.Assert.assertEquals(file77.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertNotNull(file81);
        org.junit.Assert.assertEquals(file81.getParent(), "hi!");
        org.junit.Assert.assertEquals(file81.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(lineIterator85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(byteArray93);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray93), "[104, 105, 33]");
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test642");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        org.apache.commons.io.LineIterator lineIterator11 = org.apache.commons.io.FileUtils.lineIterator(file7);
        boolean boolean13 = org.apache.commons.io.FileUtils.isFileOlder(file7, (-1L));
        java.nio.charset.Charset charset14 = null;
        java.lang.String str15 = org.apache.commons.io.FileUtils.readFileToString(file7, charset14);
        java.io.FileOutputStream fileOutputStream17 = org.apache.commons.io.FileUtils.openOutputStream(file7, false);
        org.apache.commons.io.LineIterator lineIterator18 = org.apache.commons.io.FileUtils.lineIterator(file7);
        org.apache.commons.io.FileUtils.writeStringToFile(file7, "-1 bytes", false);
        java.nio.charset.Charset charset23 = null;
        org.apache.commons.io.FileUtils.write(file7, (java.lang.CharSequence) "32 bytes", charset23);
        long long25 = org.apache.commons.io.FileUtils.checksumCRC32(file7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.LineIterator lineIterator27 = org.apache.commons.io.FileUtils.lineIterator(file7, "C:\\Users\\Mathieu\\AppData\\Local\\Temp\\\r\n\r\n");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: C:\\Users\\Mathieu\\AppData\\Local\\Temp\\????");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lineIterator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!hi!hi!" + "'", str15, "hi!hi!hi!");
        org.junit.Assert.assertNotNull(fileOutputStream17);
        org.junit.Assert.assertNotNull(lineIterator18);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 562794089L + "'", long25 == 562794089L);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test643");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        org.apache.commons.io.LineIterator lineIterator11 = org.apache.commons.io.FileUtils.lineIterator(file7);
        boolean boolean13 = org.apache.commons.io.FileUtils.isFileOlder(file7, (-1L));
        byte[] byteArray14 = new byte[] {};
        org.apache.commons.io.FileUtils.writeByteArrayToFile(file7, byteArray14);
        java.nio.charset.Charset charset17 = null;
        org.apache.commons.io.FileUtils.writeStringToFile(file7, "", charset17);
        java.io.File file19 = org.apache.commons.io.FileUtils.getTempDirectory();
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file23 = org.apache.commons.io.FileUtils.getFile(strArray22);
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file27 = org.apache.commons.io.FileUtils.getFile(strArray26);
        boolean boolean28 = org.apache.commons.io.FileUtils.isFileOlder(file23, file27);
        boolean boolean30 = org.apache.commons.io.FileUtils.waitFor(file27, (int) '4');
        org.apache.commons.io.LineIterator lineIterator31 = org.apache.commons.io.FileUtils.lineIterator(file27);
        boolean boolean33 = org.apache.commons.io.FileUtils.isFileOlder(file27, (-1L));
        java.nio.charset.Charset charset34 = null;
        java.lang.String str35 = org.apache.commons.io.FileUtils.readFileToString(file27, charset34);
        java.io.FileOutputStream fileOutputStream37 = org.apache.commons.io.FileUtils.openOutputStream(file27, false);
        java.io.FileOutputStream fileOutputStream39 = org.apache.commons.io.FileUtils.openOutputStream(file27, true);
        boolean boolean40 = org.apache.commons.io.FileUtils.isFileOlder(file19, file27);
        java.io.FileInputStream fileInputStream41 = org.apache.commons.io.FileUtils.openInputStream(file27);
        java.lang.String[] strArray42 = new java.lang.String[] {};
        java.io.File file43 = org.apache.commons.io.FileUtils.getFile(strArray42);
        java.io.File file44 = org.apache.commons.io.FileUtils.getFile(strArray42);
        java.io.File file45 = org.apache.commons.io.FileUtils.getFile(strArray42);
        java.io.File file46 = org.apache.commons.io.FileUtils.getFile(file27, strArray42);
        java.io.File file47 = org.apache.commons.io.FileUtils.getFile(file7, strArray42);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lineIterator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNotNull(file19);
        org.junit.Assert.assertEquals(file19.getParent(), "C:\\Users\\Mathieu\\AppData\\Local");
        org.junit.Assert.assertEquals(file19.toString(), "C:\\Users\\Mathieu\\AppData\\Local\\Temp");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(file23);
        org.junit.Assert.assertEquals(file23.getParent(), "hi!");
        org.junit.Assert.assertEquals(file23.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(file27);
        org.junit.Assert.assertEquals(file27.getParent(), "hi!");
        org.junit.Assert.assertEquals(file27.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(lineIterator31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(fileOutputStream37);
        org.junit.Assert.assertNotNull(fileOutputStream39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(fileInputStream41);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNull(file43);
        org.junit.Assert.assertNull(file44);
        org.junit.Assert.assertNull(file45);
        org.junit.Assert.assertNotNull(file46);
        org.junit.Assert.assertEquals(file46.getParent(), "hi!");
        org.junit.Assert.assertEquals(file46.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(file47);
        org.junit.Assert.assertEquals(file47.getParent(), "hi!");
        org.junit.Assert.assertEquals(file47.toString(), "hi!\\hi!");
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test644");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        org.apache.commons.io.LineIterator lineIterator11 = org.apache.commons.io.FileUtils.lineIterator(file7);
        boolean boolean12 = org.apache.commons.io.FileUtils.deleteQuietly(file7);
        org.apache.commons.io.FileUtils.writeStringToFile(file7, "");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file18 = org.apache.commons.io.FileUtils.getFile(strArray17);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file22 = org.apache.commons.io.FileUtils.getFile(strArray21);
        boolean boolean23 = org.apache.commons.io.FileUtils.isFileOlder(file18, file22);
        boolean boolean25 = org.apache.commons.io.FileUtils.waitFor(file22, (int) '4');
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file29 = org.apache.commons.io.FileUtils.getFile(strArray28);
        boolean boolean31 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file22, file29, "");
        boolean boolean32 = org.apache.commons.io.FileUtils.isFileNewer(file7, file22);
        java.io.FileOutputStream fileOutputStream33 = org.apache.commons.io.FileUtils.openOutputStream(file7);
        java.io.FileOutputStream fileOutputStream34 = org.apache.commons.io.FileUtils.openOutputStream(file7);
        org.apache.commons.io.FileUtils.write(file7, (java.lang.CharSequence) "1 TB");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lineIterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(file18);
        org.junit.Assert.assertEquals(file18.getParent(), "hi!");
        org.junit.Assert.assertEquals(file18.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(file22);
        org.junit.Assert.assertEquals(file22.getParent(), "hi!");
        org.junit.Assert.assertEquals(file22.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(file29);
        org.junit.Assert.assertEquals(file29.getParent(), "hi!");
        org.junit.Assert.assertEquals(file29.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(fileOutputStream33);
        org.junit.Assert.assertNotNull(fileOutputStream34);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test645");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.io.File file5 = org.apache.commons.io.FileUtils.getFile(strArray4);
        java.io.File file6 = org.apache.commons.io.FileUtils.getFile(file3, strArray4);
        java.lang.String str7 = org.apache.commons.io.FileUtils.readFileToString(file3);
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file12 = org.apache.commons.io.FileUtils.getFile(strArray11);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file16 = org.apache.commons.io.FileUtils.getFile(strArray15);
        boolean boolean17 = org.apache.commons.io.FileUtils.isFileOlder(file12, file16);
        java.lang.String str18 = org.apache.commons.io.FileUtils.readFileToString(file12);
        java.nio.charset.Charset charset19 = null;
        java.lang.String str20 = org.apache.commons.io.FileUtils.readFileToString(file12, charset19);
        java.math.BigInteger bigInteger21 = org.apache.commons.io.FileUtils.sizeOfAsBigInteger(file12);
        java.nio.charset.Charset charset22 = null;
        java.util.List<java.lang.String> strList23 = org.apache.commons.io.FileUtils.readLines(file12, charset22);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.FileUtils.writeLines(file3, "1048576 EB", (java.util.Collection<java.lang.String>) strList23, "C:\\Users\\Mathieu", false);
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: 1048576 EB");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(file5);
        org.junit.Assert.assertNotNull(file6);
        org.junit.Assert.assertEquals(file6.getParent(), "hi!");
        org.junit.Assert.assertEquals(file6.toString(), "hi!\\hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1 TB" + "'", str7, "1 TB");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(file12);
        org.junit.Assert.assertEquals(file12.getParent(), "hi!");
        org.junit.Assert.assertEquals(file12.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(file16);
        org.junit.Assert.assertEquals(file16.getParent(), "hi!");
        org.junit.Assert.assertEquals(file16.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1 TB" + "'", str18, "1 TB");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1 TB" + "'", str20, "1 TB");
        org.junit.Assert.assertNotNull(bigInteger21);
        org.junit.Assert.assertNotNull(strList23);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test646");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        org.apache.commons.io.LineIterator lineIterator11 = org.apache.commons.io.FileUtils.lineIterator(file7);
        boolean boolean12 = org.apache.commons.io.FileUtils.deleteQuietly(file7);
        org.apache.commons.io.FileUtils.writeStringToFile(file7, "");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file18 = org.apache.commons.io.FileUtils.getFile(strArray17);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file22 = org.apache.commons.io.FileUtils.getFile(strArray21);
        boolean boolean23 = org.apache.commons.io.FileUtils.isFileOlder(file18, file22);
        boolean boolean25 = org.apache.commons.io.FileUtils.waitFor(file22, (int) '4');
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file29 = org.apache.commons.io.FileUtils.getFile(strArray28);
        boolean boolean31 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file22, file29, "");
        boolean boolean32 = org.apache.commons.io.FileUtils.isFileNewer(file7, file22);
        boolean boolean33 = org.apache.commons.io.FileUtils.isSymlink(file7);
        boolean boolean35 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        org.apache.commons.io.FileUtils.writeStringToFile(file7, "hi!\000\000d\001");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lineIterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(file18);
        org.junit.Assert.assertEquals(file18.getParent(), "hi!");
        org.junit.Assert.assertEquals(file18.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(file22);
        org.junit.Assert.assertEquals(file22.getParent(), "hi!");
        org.junit.Assert.assertEquals(file22.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(file29);
        org.junit.Assert.assertEquals(file29.getParent(), "hi!");
        org.junit.Assert.assertEquals(file29.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test647");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        org.apache.commons.io.LineIterator lineIterator11 = org.apache.commons.io.FileUtils.lineIterator(file7);
        boolean boolean12 = org.apache.commons.io.FileUtils.deleteQuietly(file7);
        org.apache.commons.io.FileUtils.write(file7, (java.lang.CharSequence) "hi!");
        java.nio.charset.Charset charset16 = null;
        org.apache.commons.io.FileUtils.write(file7, (java.lang.CharSequence) "", charset16, true);
        byte[] byteArray19 = org.apache.commons.io.FileUtils.readFileToByteArray(file7);
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file23 = org.apache.commons.io.FileUtils.getFile(strArray22);
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file27 = org.apache.commons.io.FileUtils.getFile(strArray26);
        boolean boolean28 = org.apache.commons.io.FileUtils.isFileOlder(file23, file27);
        boolean boolean30 = org.apache.commons.io.FileUtils.waitFor(file27, (int) '4');
        boolean boolean31 = org.apache.commons.io.FileUtils.isFileOlder(file7, file27);
        java.util.List<java.lang.String> strList32 = org.apache.commons.io.FileUtils.readLines(file7);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lineIterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[104, 105, 33]");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(file23);
        org.junit.Assert.assertEquals(file23.getParent(), "hi!");
        org.junit.Assert.assertEquals(file23.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(file27);
        org.junit.Assert.assertEquals(file27.getParent(), "hi!");
        org.junit.Assert.assertEquals(file27.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(strList32);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test648");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file14 = org.apache.commons.io.FileUtils.getFile(strArray13);
        boolean boolean16 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file7, file14, "");
        org.apache.commons.io.LineIterator lineIterator17 = org.apache.commons.io.FileUtils.lineIterator(file7);
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file21 = org.apache.commons.io.FileUtils.getFile(strArray20);
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file25 = org.apache.commons.io.FileUtils.getFile(strArray24);
        boolean boolean26 = org.apache.commons.io.FileUtils.isFileOlder(file21, file25);
        boolean boolean28 = org.apache.commons.io.FileUtils.waitFor(file25, (int) '4');
        org.apache.commons.io.LineIterator lineIterator29 = org.apache.commons.io.FileUtils.lineIterator(file25);
        boolean boolean30 = org.apache.commons.io.FileUtils.deleteQuietly(file25);
        org.apache.commons.io.FileUtils.write(file25, (java.lang.CharSequence) "hi!");
        java.nio.charset.Charset charset34 = null;
        org.apache.commons.io.FileUtils.write(file25, (java.lang.CharSequence) "", charset34, true);
        java.nio.charset.Charset charset38 = null;
        org.apache.commons.io.FileUtils.writeStringToFile(file25, "", charset38, false);
        long long41 = org.apache.commons.io.FileUtils.sizeOf(file25);
        org.apache.commons.io.FileUtils.writeStringToFile(file25, "");
        java.nio.charset.Charset charset44 = null;
        java.util.List<java.lang.String> strList45 = org.apache.commons.io.FileUtils.readLines(file25, charset44);
        org.apache.commons.io.FileUtils.writeLines(file7, (java.util.Collection<java.lang.String>) strList45);
        java.lang.String[] strArray49 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file50 = org.apache.commons.io.FileUtils.getFile(strArray49);
        java.lang.String[] strArray53 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file54 = org.apache.commons.io.FileUtils.getFile(strArray53);
        boolean boolean55 = org.apache.commons.io.FileUtils.isFileOlder(file50, file54);
        boolean boolean57 = org.apache.commons.io.FileUtils.waitFor(file54, (int) '4');
        org.apache.commons.io.LineIterator lineIterator58 = org.apache.commons.io.FileUtils.lineIterator(file54);
        boolean boolean60 = org.apache.commons.io.FileUtils.isFileOlder(file54, (-1L));
        long long61 = org.apache.commons.io.FileUtils.sizeOf(file54);
        java.io.File file62 = org.apache.commons.io.FileUtils.getUserDirectory();
        org.apache.commons.io.FileUtils.copyFileToDirectory(file54, file62, true);
        org.apache.commons.io.FileUtils.write(file54, (java.lang.CharSequence) "hi!", true);
        byte[] byteArray68 = org.apache.commons.io.FileUtils.readFileToByteArray(file54);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.FileUtils.writeByteArrayToFile(file7, byteArray68, (int) (short) 10, (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(file14);
        org.junit.Assert.assertEquals(file14.getParent(), "hi!");
        org.junit.Assert.assertEquals(file14.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(lineIterator17);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(file21);
        org.junit.Assert.assertEquals(file21.getParent(), "hi!");
        org.junit.Assert.assertEquals(file21.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(file25);
        org.junit.Assert.assertEquals(file25.getParent(), "hi!");
        org.junit.Assert.assertEquals(file25.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(lineIterator29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertNotNull(strList45);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(file50);
        org.junit.Assert.assertEquals(file50.getParent(), "hi!");
        org.junit.Assert.assertEquals(file50.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(file54);
        org.junit.Assert.assertEquals(file54.getParent(), "hi!");
        org.junit.Assert.assertEquals(file54.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(lineIterator58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
        org.junit.Assert.assertNotNull(file62);
        org.junit.Assert.assertEquals(file62.getParent(), "C:\\Users");
        org.junit.Assert.assertEquals(file62.toString(), "C:\\Users\\Mathieu");
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray68), "[104, 105, 33]");
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test649");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        org.apache.commons.io.LineIterator lineIterator11 = org.apache.commons.io.FileUtils.lineIterator(file7);
        boolean boolean12 = org.apache.commons.io.FileUtils.deleteQuietly(file7);
        org.apache.commons.io.FileUtils.write(file7, (java.lang.CharSequence) "hi!");
        java.nio.charset.Charset charset16 = null;
        org.apache.commons.io.FileUtils.write(file7, (java.lang.CharSequence) "", charset16, true);
        java.nio.charset.Charset charset20 = null;
        org.apache.commons.io.FileUtils.writeStringToFile(file7, "", charset20, false);
        long long23 = org.apache.commons.io.FileUtils.sizeOf(file7);
        org.apache.commons.io.FileUtils.writeStringToFile(file7, "");
        org.apache.commons.io.FileUtils.forceDeleteOnExit(file7);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lineIterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test650");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        org.apache.commons.io.LineIterator lineIterator11 = org.apache.commons.io.FileUtils.lineIterator(file7);
        boolean boolean13 = org.apache.commons.io.FileUtils.isFileOlder(file7, (-1L));
        long long14 = org.apache.commons.io.FileUtils.sizeOf(file7);
        java.io.File file15 = org.apache.commons.io.FileUtils.getUserDirectory();
        org.apache.commons.io.FileUtils.copyFileToDirectory(file7, file15, true);
        org.apache.commons.io.FileUtils.write(file7, (java.lang.CharSequence) "hi!", true);
        java.nio.charset.Charset charset22 = null;
        org.apache.commons.io.FileUtils.writeStringToFile(file7, "", charset22, false);
        byte[] byteArray25 = org.apache.commons.io.FileUtils.readFileToByteArray(file7);
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file29 = org.apache.commons.io.FileUtils.getFile(strArray28);
        java.lang.String[] strArray32 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file33 = org.apache.commons.io.FileUtils.getFile(strArray32);
        boolean boolean34 = org.apache.commons.io.FileUtils.isFileOlder(file29, file33);
        boolean boolean36 = org.apache.commons.io.FileUtils.waitFor(file33, (int) '4');
        org.apache.commons.io.LineIterator lineIterator37 = org.apache.commons.io.FileUtils.lineIterator(file33);
        boolean boolean38 = org.apache.commons.io.FileUtils.deleteQuietly(file33);
        org.apache.commons.io.FileUtils.writeStringToFile(file33, "");
        java.lang.String[] strArray43 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file44 = org.apache.commons.io.FileUtils.getFile(strArray43);
        java.lang.String[] strArray47 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file48 = org.apache.commons.io.FileUtils.getFile(strArray47);
        boolean boolean49 = org.apache.commons.io.FileUtils.isFileOlder(file44, file48);
        boolean boolean51 = org.apache.commons.io.FileUtils.waitFor(file48, (int) '4');
        java.lang.String[] strArray54 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file55 = org.apache.commons.io.FileUtils.getFile(strArray54);
        boolean boolean57 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file48, file55, "");
        boolean boolean58 = org.apache.commons.io.FileUtils.isFileNewer(file33, file48);
        java.io.FileOutputStream fileOutputStream59 = org.apache.commons.io.FileUtils.openOutputStream(file33);
        java.io.FileOutputStream fileOutputStream61 = org.apache.commons.io.FileUtils.openOutputStream(file33, false);
        java.util.Collection<java.lang.String> strCollection62 = null;
        org.apache.commons.io.FileUtils.writeLines(file33, strCollection62, true);
        boolean boolean65 = org.apache.commons.io.FileUtils.contentEquals(file7, file33);
        java.lang.String[] strArray69 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file70 = org.apache.commons.io.FileUtils.getFile(strArray69);
        java.lang.String[] strArray73 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file74 = org.apache.commons.io.FileUtils.getFile(strArray73);
        boolean boolean75 = org.apache.commons.io.FileUtils.isFileOlder(file70, file74);
        java.lang.String str76 = org.apache.commons.io.FileUtils.readFileToString(file70);
        java.nio.charset.Charset charset77 = null;
        java.lang.String str78 = org.apache.commons.io.FileUtils.readFileToString(file70, charset77);
        java.math.BigInteger bigInteger79 = org.apache.commons.io.FileUtils.sizeOfAsBigInteger(file70);
        java.nio.charset.Charset charset80 = null;
        java.util.List<java.lang.String> strList81 = org.apache.commons.io.FileUtils.readLines(file70, charset80);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.FileUtils.writeLines(file33, "-1 bytes1 GB1048576 EB1 GBC:\\Users\\Mathieu\\AppData\\Local\\Temp\\1 GBC:\\Users\\Mathieu1 GB1 GB1048576 EB1 GB", (java.util.Collection<java.lang.String>) strList81, "1 GB1048576 EB1 GBC:\\Users\\Mathieu\\AppData\\Local\\Temp\\1 GBC:\\Users\\Mathieu1 GB1 GB1048576 EB1 GB\r\n1048576 EB\r\nC:\\Users\\Mathieu\\AppData\\Local\\Temp\\\r\nC:\\Users\\Mathieu\r\n\r\n1048576 EB\r\nhi!", false);
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: -1 bytes1 GB1048576 EB1 GBC:\\Users\\Mathieu\\AppData\\Local\\Temp\\1 GBC:\\Users\\Mathieu1 GB1 GB1048576 EB1 GB");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lineIterator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(file15);
        org.junit.Assert.assertEquals(file15.getParent(), "C:\\Users");
        org.junit.Assert.assertEquals(file15.toString(), "C:\\Users\\Mathieu");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[]");
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(file29);
        org.junit.Assert.assertEquals(file29.getParent(), "hi!");
        org.junit.Assert.assertEquals(file29.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(file33);
        org.junit.Assert.assertEquals(file33.getParent(), "hi!");
        org.junit.Assert.assertEquals(file33.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(lineIterator37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(file44);
        org.junit.Assert.assertEquals(file44.getParent(), "hi!");
        org.junit.Assert.assertEquals(file44.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(file48);
        org.junit.Assert.assertEquals(file48.getParent(), "hi!");
        org.junit.Assert.assertEquals(file48.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertNotNull(file55);
        org.junit.Assert.assertEquals(file55.getParent(), "hi!");
        org.junit.Assert.assertEquals(file55.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(fileOutputStream59);
        org.junit.Assert.assertNotNull(fileOutputStream61);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertNotNull(file70);
        org.junit.Assert.assertEquals(file70.getParent(), "hi!");
        org.junit.Assert.assertEquals(file70.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertNotNull(file74);
        org.junit.Assert.assertEquals(file74.getParent(), "hi!");
        org.junit.Assert.assertEquals(file74.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertNotNull(bigInteger79);
        org.junit.Assert.assertNotNull(strList81);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test651");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        org.apache.commons.io.LineIterator lineIterator11 = org.apache.commons.io.FileUtils.lineIterator(file7);
        boolean boolean12 = org.apache.commons.io.FileUtils.deleteQuietly(file7);
        org.apache.commons.io.FileUtils.write(file7, (java.lang.CharSequence) "hi!");
        java.nio.charset.Charset charset16 = null;
        org.apache.commons.io.FileUtils.write(file7, (java.lang.CharSequence) "", charset16, true);
        java.nio.charset.Charset charset20 = null;
        org.apache.commons.io.FileUtils.writeStringToFile(file7, "", charset20, false);
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file26 = org.apache.commons.io.FileUtils.getFile(strArray25);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file30 = org.apache.commons.io.FileUtils.getFile(strArray29);
        boolean boolean31 = org.apache.commons.io.FileUtils.isFileOlder(file26, file30);
        boolean boolean33 = org.apache.commons.io.FileUtils.waitFor(file30, (int) '4');
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file37 = org.apache.commons.io.FileUtils.getFile(strArray36);
        boolean boolean39 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file30, file37, "");
        java.io.FileOutputStream fileOutputStream41 = org.apache.commons.io.FileUtils.openOutputStream(file30, false);
        java.lang.String[] strArray48 = new java.lang.String[] { "", "1048576 EB", "C:\\Users\\Mathieu\\AppData\\Local\\Temp\\", "C:\\Users\\Mathieu", "", "1048576 EB" };
        java.util.ArrayList<java.lang.String> strList49 = new java.util.ArrayList<java.lang.String>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList49, strArray48);
        org.apache.commons.io.FileUtils.writeLines(file30, (java.util.Collection<java.lang.String>) strList49, "1 GB", false);
        org.apache.commons.io.FileUtils.writeLines(file7, (java.util.Collection<java.lang.String>) strList49, "35 bytes");
        java.lang.String[] strArray58 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file59 = org.apache.commons.io.FileUtils.getFile(strArray58);
        java.lang.String[] strArray62 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file63 = org.apache.commons.io.FileUtils.getFile(strArray62);
        boolean boolean64 = org.apache.commons.io.FileUtils.isFileOlder(file59, file63);
        boolean boolean66 = org.apache.commons.io.FileUtils.waitFor(file63, (int) '4');
        org.apache.commons.io.LineIterator lineIterator67 = org.apache.commons.io.FileUtils.lineIterator(file63);
        boolean boolean68 = org.apache.commons.io.FileUtils.deleteQuietly(file63);
        org.apache.commons.io.FileUtils.write(file63, (java.lang.CharSequence) "hi!");
        long long71 = org.apache.commons.io.FileUtils.sizeOf(file63);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.FileUtils.copyFileToDirectory(file7, file63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Destination 'hi!\\hi!' is not a directory");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lineIterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(file26);
        org.junit.Assert.assertEquals(file26.getParent(), "hi!");
        org.junit.Assert.assertEquals(file26.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(file30);
        org.junit.Assert.assertEquals(file30.getParent(), "hi!");
        org.junit.Assert.assertEquals(file30.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(file37);
        org.junit.Assert.assertEquals(file37.getParent(), "hi!");
        org.junit.Assert.assertEquals(file37.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(fileOutputStream41);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertNotNull(file59);
        org.junit.Assert.assertEquals(file59.getParent(), "hi!");
        org.junit.Assert.assertEquals(file59.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertNotNull(file63);
        org.junit.Assert.assertEquals(file63.getParent(), "hi!");
        org.junit.Assert.assertEquals(file63.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(lineIterator67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 3L + "'", long71 == 3L);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test652");
        java.io.File file0 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file5 = org.apache.commons.io.FileUtils.getFile(strArray4);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file9 = org.apache.commons.io.FileUtils.getFile(strArray8);
        boolean boolean10 = org.apache.commons.io.FileUtils.isFileOlder(file5, file9);
        boolean boolean12 = org.apache.commons.io.FileUtils.waitFor(file9, (int) '4');
        org.apache.commons.io.LineIterator lineIterator13 = org.apache.commons.io.FileUtils.lineIterator(file9);
        boolean boolean14 = org.apache.commons.io.FileUtils.deleteQuietly(file9);
        org.apache.commons.io.FileUtils.write(file9, (java.lang.CharSequence) "hi!");
        java.nio.charset.Charset charset18 = null;
        org.apache.commons.io.FileUtils.write(file9, (java.lang.CharSequence) "", charset18, true);
        java.nio.charset.Charset charset22 = null;
        org.apache.commons.io.FileUtils.writeStringToFile(file9, "", charset22, false);
        long long25 = org.apache.commons.io.FileUtils.sizeOf(file9);
        org.apache.commons.io.FileUtils.writeStringToFile(file9, "");
        java.nio.charset.Charset charset28 = null;
        java.util.List<java.lang.String> strList29 = org.apache.commons.io.FileUtils.readLines(file9, charset28);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.FileUtils.writeLines(file0, "100 bytes", (java.util.Collection<java.lang.String>) strList29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.File.exists()\" because \"file\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(file5);
        org.junit.Assert.assertEquals(file5.getParent(), "hi!");
        org.junit.Assert.assertEquals(file5.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(file9);
        org.junit.Assert.assertEquals(file9.getParent(), "hi!");
        org.junit.Assert.assertEquals(file9.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(lineIterator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(strList29);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test653");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        org.apache.commons.io.LineIterator lineIterator11 = org.apache.commons.io.FileUtils.lineIterator(file7);
        boolean boolean12 = org.apache.commons.io.FileUtils.deleteQuietly(file7);
        org.apache.commons.io.FileUtils.writeStringToFile(file7, "");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file18 = org.apache.commons.io.FileUtils.getFile(strArray17);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file22 = org.apache.commons.io.FileUtils.getFile(strArray21);
        boolean boolean23 = org.apache.commons.io.FileUtils.isFileOlder(file18, file22);
        boolean boolean25 = org.apache.commons.io.FileUtils.waitFor(file22, (int) '4');
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file29 = org.apache.commons.io.FileUtils.getFile(strArray28);
        boolean boolean31 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file22, file29, "");
        boolean boolean32 = org.apache.commons.io.FileUtils.isFileNewer(file7, file22);
        org.apache.commons.io.FileUtils.touch(file7);
        java.io.FileOutputStream fileOutputStream35 = org.apache.commons.io.FileUtils.openOutputStream(file7, false);
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file39 = org.apache.commons.io.FileUtils.getFile(strArray38);
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file43 = org.apache.commons.io.FileUtils.getFile(strArray42);
        boolean boolean44 = org.apache.commons.io.FileUtils.isFileOlder(file39, file43);
        boolean boolean46 = org.apache.commons.io.FileUtils.waitFor(file43, (int) '4');
        java.lang.String[] strArray49 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file50 = org.apache.commons.io.FileUtils.getFile(strArray49);
        boolean boolean52 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file43, file50, "");
        org.apache.commons.io.LineIterator lineIterator53 = org.apache.commons.io.FileUtils.lineIterator(file43);
        java.lang.String[] strArray56 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file57 = org.apache.commons.io.FileUtils.getFile(strArray56);
        java.lang.String[] strArray60 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file61 = org.apache.commons.io.FileUtils.getFile(strArray60);
        boolean boolean62 = org.apache.commons.io.FileUtils.isFileOlder(file57, file61);
        boolean boolean64 = org.apache.commons.io.FileUtils.waitFor(file61, (int) '4');
        org.apache.commons.io.LineIterator lineIterator65 = org.apache.commons.io.FileUtils.lineIterator(file61);
        boolean boolean66 = org.apache.commons.io.FileUtils.deleteQuietly(file61);
        org.apache.commons.io.FileUtils.write(file61, (java.lang.CharSequence) "hi!");
        java.nio.charset.Charset charset70 = null;
        org.apache.commons.io.FileUtils.write(file61, (java.lang.CharSequence) "", charset70, true);
        java.nio.charset.Charset charset74 = null;
        org.apache.commons.io.FileUtils.writeStringToFile(file61, "", charset74, false);
        long long77 = org.apache.commons.io.FileUtils.sizeOf(file61);
        org.apache.commons.io.FileUtils.writeStringToFile(file61, "");
        java.nio.charset.Charset charset80 = null;
        java.util.List<java.lang.String> strList81 = org.apache.commons.io.FileUtils.readLines(file61, charset80);
        org.apache.commons.io.FileUtils.writeLines(file43, (java.util.Collection<java.lang.String>) strList81);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.FileUtils.copyDirectory(file7, file43);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Source 'hi!\\hi!' exists but is not a directory");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lineIterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(file18);
        org.junit.Assert.assertEquals(file18.getParent(), "hi!");
        org.junit.Assert.assertEquals(file18.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(file22);
        org.junit.Assert.assertEquals(file22.getParent(), "hi!");
        org.junit.Assert.assertEquals(file22.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(file29);
        org.junit.Assert.assertEquals(file29.getParent(), "hi!");
        org.junit.Assert.assertEquals(file29.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(fileOutputStream35);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(file39);
        org.junit.Assert.assertEquals(file39.getParent(), "hi!");
        org.junit.Assert.assertEquals(file39.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(file43);
        org.junit.Assert.assertEquals(file43.getParent(), "hi!");
        org.junit.Assert.assertEquals(file43.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(file50);
        org.junit.Assert.assertEquals(file50.getParent(), "hi!");
        org.junit.Assert.assertEquals(file50.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(lineIterator53);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertNotNull(file57);
        org.junit.Assert.assertEquals(file57.getParent(), "hi!");
        org.junit.Assert.assertEquals(file57.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertNotNull(file61);
        org.junit.Assert.assertEquals(file61.getParent(), "hi!");
        org.junit.Assert.assertEquals(file61.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(lineIterator65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 0L + "'", long77 == 0L);
        org.junit.Assert.assertNotNull(strList81);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test654");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        org.apache.commons.io.LineIterator lineIterator11 = org.apache.commons.io.FileUtils.lineIterator(file7);
        boolean boolean12 = org.apache.commons.io.FileUtils.deleteQuietly(file7);
        org.apache.commons.io.FileUtils.writeStringToFile(file7, "");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file18 = org.apache.commons.io.FileUtils.getFile(strArray17);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file22 = org.apache.commons.io.FileUtils.getFile(strArray21);
        boolean boolean23 = org.apache.commons.io.FileUtils.isFileOlder(file18, file22);
        boolean boolean25 = org.apache.commons.io.FileUtils.waitFor(file22, (int) '4');
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file29 = org.apache.commons.io.FileUtils.getFile(strArray28);
        boolean boolean31 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file22, file29, "");
        java.io.FileOutputStream fileOutputStream33 = org.apache.commons.io.FileUtils.openOutputStream(file22, false);
        java.lang.String[] strArray40 = new java.lang.String[] { "", "1048576 EB", "C:\\Users\\Mathieu\\AppData\\Local\\Temp\\", "C:\\Users\\Mathieu", "", "1048576 EB" };
        java.util.ArrayList<java.lang.String> strList41 = new java.util.ArrayList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        org.apache.commons.io.FileUtils.writeLines(file22, (java.util.Collection<java.lang.String>) strList41, "1 GB", false);
        org.apache.commons.io.FileUtils.writeLines(file7, (java.util.Collection<java.lang.String>) strList41, true);
        java.lang.String[] strArray50 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file51 = org.apache.commons.io.FileUtils.getFile(strArray50);
        java.lang.String[] strArray54 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file55 = org.apache.commons.io.FileUtils.getFile(strArray54);
        boolean boolean56 = org.apache.commons.io.FileUtils.isFileOlder(file51, file55);
        boolean boolean58 = org.apache.commons.io.FileUtils.waitFor(file55, (int) '4');
        org.apache.commons.io.LineIterator lineIterator59 = org.apache.commons.io.FileUtils.lineIterator(file55);
        boolean boolean60 = org.apache.commons.io.FileUtils.deleteQuietly(file55);
        org.apache.commons.io.FileUtils.writeStringToFile(file55, "");
        java.lang.String[] strArray65 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file66 = org.apache.commons.io.FileUtils.getFile(strArray65);
        java.lang.String[] strArray69 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file70 = org.apache.commons.io.FileUtils.getFile(strArray69);
        boolean boolean71 = org.apache.commons.io.FileUtils.isFileOlder(file66, file70);
        boolean boolean73 = org.apache.commons.io.FileUtils.waitFor(file70, (int) '4');
        java.lang.String[] strArray76 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file77 = org.apache.commons.io.FileUtils.getFile(strArray76);
        boolean boolean79 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file70, file77, "");
        boolean boolean80 = org.apache.commons.io.FileUtils.isFileNewer(file55, file70);
        java.io.FileOutputStream fileOutputStream81 = org.apache.commons.io.FileUtils.openOutputStream(file55);
        long long82 = org.apache.commons.io.FileUtils.copyFile(file7, (java.io.OutputStream) fileOutputStream81);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.FileUtils.forceDelete(file7);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Unable to delete file: hi!\\hi!");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lineIterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(file18);
        org.junit.Assert.assertEquals(file18.getParent(), "hi!");
        org.junit.Assert.assertEquals(file18.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(file22);
        org.junit.Assert.assertEquals(file22.getParent(), "hi!");
        org.junit.Assert.assertEquals(file22.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(file29);
        org.junit.Assert.assertEquals(file29.getParent(), "hi!");
        org.junit.Assert.assertEquals(file29.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(fileOutputStream33);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(file51);
        org.junit.Assert.assertEquals(file51.getParent(), "hi!");
        org.junit.Assert.assertEquals(file51.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertNotNull(file55);
        org.junit.Assert.assertEquals(file55.getParent(), "hi!");
        org.junit.Assert.assertEquals(file55.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(lineIterator59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertNotNull(file66);
        org.junit.Assert.assertEquals(file66.getParent(), "hi!");
        org.junit.Assert.assertEquals(file66.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertNotNull(file70);
        org.junit.Assert.assertEquals(file70.getParent(), "hi!");
        org.junit.Assert.assertEquals(file70.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertNotNull(file77);
        org.junit.Assert.assertEquals(file77.getParent(), "hi!");
        org.junit.Assert.assertEquals(file77.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(fileOutputStream81);
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + 0L + "'", long82 == 0L);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test655");
        java.io.File file0 = null;
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file4 = org.apache.commons.io.FileUtils.getFile(strArray3);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file8 = org.apache.commons.io.FileUtils.getFile(strArray7);
        boolean boolean9 = org.apache.commons.io.FileUtils.isFileOlder(file4, file8);
        boolean boolean11 = org.apache.commons.io.FileUtils.waitFor(file8, (int) '4');
        org.apache.commons.io.LineIterator lineIterator12 = org.apache.commons.io.FileUtils.lineIterator(file8);
        boolean boolean13 = org.apache.commons.io.FileUtils.deleteQuietly(file8);
        org.apache.commons.io.FileUtils.writeStringToFile(file8, "");
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file19 = org.apache.commons.io.FileUtils.getFile(strArray18);
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file23 = org.apache.commons.io.FileUtils.getFile(strArray22);
        boolean boolean24 = org.apache.commons.io.FileUtils.isFileOlder(file19, file23);
        boolean boolean26 = org.apache.commons.io.FileUtils.waitFor(file23, (int) '4');
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file30 = org.apache.commons.io.FileUtils.getFile(strArray29);
        boolean boolean32 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file23, file30, "");
        boolean boolean33 = org.apache.commons.io.FileUtils.isFileNewer(file8, file23);
        java.io.FileOutputStream fileOutputStream34 = org.apache.commons.io.FileUtils.openOutputStream(file8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.FileUtils.copyFileToDirectory(file0, file8, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Destination 'hi!\\hi!' is not a directory");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(file4);
        org.junit.Assert.assertEquals(file4.getParent(), "hi!");
        org.junit.Assert.assertEquals(file4.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(file8);
        org.junit.Assert.assertEquals(file8.getParent(), "hi!");
        org.junit.Assert.assertEquals(file8.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(lineIterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(file19);
        org.junit.Assert.assertEquals(file19.getParent(), "hi!");
        org.junit.Assert.assertEquals(file19.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(file23);
        org.junit.Assert.assertEquals(file23.getParent(), "hi!");
        org.junit.Assert.assertEquals(file23.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(file30);
        org.junit.Assert.assertEquals(file30.getParent(), "hi!");
        org.junit.Assert.assertEquals(file30.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(fileOutputStream34);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test656");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean9 = org.apache.commons.io.FileUtils.deleteQuietly(file7);
        java.nio.charset.Charset charset11 = null;
        org.apache.commons.io.FileUtils.write(file7, (java.lang.CharSequence) "", charset11, true);
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file17 = org.apache.commons.io.FileUtils.getFile(strArray16);
        java.io.File file18 = org.apache.commons.io.FileUtils.getFile(strArray16);
        java.io.File file19 = org.apache.commons.io.FileUtils.getFile(file7, strArray16);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger20 = org.apache.commons.io.FileUtils.sizeOfAsBigInteger(file19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!\\hi!\\hi!\\hi! does not exist");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(file17);
        org.junit.Assert.assertEquals(file17.getParent(), "hi!");
        org.junit.Assert.assertEquals(file17.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(file18);
        org.junit.Assert.assertEquals(file18.getParent(), "hi!");
        org.junit.Assert.assertEquals(file18.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(file19);
        org.junit.Assert.assertEquals(file19.getParent(), "hi!\\hi!\\hi!");
        org.junit.Assert.assertEquals(file19.toString(), "hi!\\hi!\\hi!\\hi!");
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test657");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file14 = org.apache.commons.io.FileUtils.getFile(strArray13);
        boolean boolean16 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file7, file14, "");
        org.apache.commons.io.LineIterator lineIterator17 = org.apache.commons.io.FileUtils.lineIterator(file7);
        org.apache.commons.io.FileUtils.writeStringToFile(file7, "C:\\Users\\Mathieu\\AppData\\Local\\Temp\\", false);
        java.nio.charset.Charset charset22 = null;
        org.apache.commons.io.FileUtils.write(file7, (java.lang.CharSequence) "", charset22, true);
        org.apache.commons.io.FileUtils.touch(file7);
        java.nio.charset.Charset charset27 = null;
        org.apache.commons.io.FileUtils.write(file7, (java.lang.CharSequence) "1 GB1048576 EB1 GBC:\\Users\\Mathieu\\AppData\\Local\\Temp\\1 GBC:\\Users\\Mathieu1 GB1 GB1048576 EB1 GB", charset27);
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file32 = org.apache.commons.io.FileUtils.getFile(strArray31);
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file36 = org.apache.commons.io.FileUtils.getFile(strArray35);
        boolean boolean37 = org.apache.commons.io.FileUtils.isFileOlder(file32, file36);
        boolean boolean39 = org.apache.commons.io.FileUtils.waitFor(file36, (int) '4');
        org.apache.commons.io.LineIterator lineIterator40 = org.apache.commons.io.FileUtils.lineIterator(file36);
        boolean boolean41 = org.apache.commons.io.FileUtils.deleteQuietly(file36);
        org.apache.commons.io.FileUtils.writeStringToFile(file36, "");
        java.lang.String[] strArray46 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file47 = org.apache.commons.io.FileUtils.getFile(strArray46);
        java.lang.String[] strArray50 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file51 = org.apache.commons.io.FileUtils.getFile(strArray50);
        boolean boolean52 = org.apache.commons.io.FileUtils.isFileOlder(file47, file51);
        boolean boolean54 = org.apache.commons.io.FileUtils.waitFor(file51, (int) '4');
        java.lang.String[] strArray57 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file58 = org.apache.commons.io.FileUtils.getFile(strArray57);
        boolean boolean60 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file51, file58, "");
        boolean boolean61 = org.apache.commons.io.FileUtils.isFileNewer(file36, file51);
        java.io.FileOutputStream fileOutputStream62 = org.apache.commons.io.FileUtils.openOutputStream(file36);
        java.math.BigInteger bigInteger63 = org.apache.commons.io.FileUtils.sizeOfAsBigInteger(file36);
        java.nio.charset.Charset charset65 = null;
        org.apache.commons.io.FileUtils.writeStringToFile(file36, "\000\000d\001", charset65);
        java.lang.String[] strArray69 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file70 = org.apache.commons.io.FileUtils.getFile(strArray69);
        java.lang.String[] strArray73 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file74 = org.apache.commons.io.FileUtils.getFile(strArray73);
        boolean boolean75 = org.apache.commons.io.FileUtils.isFileOlder(file70, file74);
        org.apache.commons.io.FileUtils.write(file70, (java.lang.CharSequence) "1048576 EB", true);
        boolean boolean80 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file36, file70, "1 GB1048576 EB1 GBC:\\Users\\Mathieu\\AppData\\Local\\Temp\\1 GBC:\\Users\\Mathieu1 GB1 GB1048576 EB1 GB\r\n1048576 EB\r\nC:\\Users\\Mathieu\\AppData\\Local\\Temp\\\r\nC:\\Users\\Mathieu\r\n\r\n1048576 EB\r\nhi!");
        boolean boolean81 = org.apache.commons.io.FileUtils.contentEquals(file7, file36);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(file14);
        org.junit.Assert.assertEquals(file14.getParent(), "hi!");
        org.junit.Assert.assertEquals(file14.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(lineIterator17);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(file32);
        org.junit.Assert.assertEquals(file32.getParent(), "hi!");
        org.junit.Assert.assertEquals(file32.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(file36);
        org.junit.Assert.assertEquals(file36.getParent(), "hi!");
        org.junit.Assert.assertEquals(file36.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(lineIterator40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(file47);
        org.junit.Assert.assertEquals(file47.getParent(), "hi!");
        org.junit.Assert.assertEquals(file47.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(file51);
        org.junit.Assert.assertEquals(file51.getParent(), "hi!");
        org.junit.Assert.assertEquals(file51.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertNotNull(file58);
        org.junit.Assert.assertEquals(file58.getParent(), "hi!");
        org.junit.Assert.assertEquals(file58.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(fileOutputStream62);
        org.junit.Assert.assertNotNull(bigInteger63);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertNotNull(file70);
        org.junit.Assert.assertEquals(file70.getParent(), "hi!");
        org.junit.Assert.assertEquals(file70.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertNotNull(file74);
        org.junit.Assert.assertEquals(file74.getParent(), "hi!");
        org.junit.Assert.assertEquals(file74.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test658");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file14 = org.apache.commons.io.FileUtils.getFile(strArray13);
        boolean boolean16 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file7, file14, "");
        org.apache.commons.io.LineIterator lineIterator17 = org.apache.commons.io.FileUtils.lineIterator(file7);
        org.apache.commons.io.FileUtils.writeStringToFile(file7, "C:\\Users\\Mathieu\\AppData\\Local\\Temp\\", false);
        java.nio.charset.Charset charset22 = null;
        org.apache.commons.io.FileUtils.write(file7, (java.lang.CharSequence) "", charset22, true);
        boolean boolean26 = org.apache.commons.io.FileUtils.waitFor(file7, 0);
        org.apache.commons.io.FileUtils.writeStringToFile(file7, "C:\\Users\\Mathieu\\AppData\\Local\\Temp\\");
        java.nio.charset.Charset charset30 = null;
        org.apache.commons.io.FileUtils.writeStringToFile(file7, "35 bytes", charset30);
        java.lang.String[] strArray34 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file35 = org.apache.commons.io.FileUtils.getFile(strArray34);
        java.lang.String[] strArray36 = new java.lang.String[] {};
        java.io.File file37 = org.apache.commons.io.FileUtils.getFile(strArray36);
        java.io.File file38 = org.apache.commons.io.FileUtils.getFile(file35, strArray36);
        boolean boolean40 = org.apache.commons.io.FileUtils.isFileNewer(file35, (-1L));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.FileUtils.moveFile(file7, file35);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.io.FileExistsException; message: Destination 'hi!\\hi!' already exists");
        } catch (org.apache.commons.io.FileExistsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(file14);
        org.junit.Assert.assertEquals(file14.getParent(), "hi!");
        org.junit.Assert.assertEquals(file14.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(lineIterator17);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(file35);
        org.junit.Assert.assertEquals(file35.getParent(), "hi!");
        org.junit.Assert.assertEquals(file35.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNull(file37);
        org.junit.Assert.assertNotNull(file38);
        org.junit.Assert.assertEquals(file38.getParent(), "hi!");
        org.junit.Assert.assertEquals(file38.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test659");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        org.apache.commons.io.LineIterator lineIterator11 = org.apache.commons.io.FileUtils.lineIterator(file7);
        boolean boolean13 = org.apache.commons.io.FileUtils.isFileOlder(file7, (-1L));
        java.nio.charset.Charset charset14 = null;
        java.lang.String str15 = org.apache.commons.io.FileUtils.readFileToString(file7, charset14);
        java.io.FileOutputStream fileOutputStream17 = org.apache.commons.io.FileUtils.openOutputStream(file7, false);
        org.apache.commons.io.LineIterator lineIterator18 = org.apache.commons.io.FileUtils.lineIterator(file7);
        java.io.FileOutputStream fileOutputStream19 = org.apache.commons.io.FileUtils.openOutputStream(file7);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lineIterator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "35 bytes" + "'", str15, "35 bytes");
        org.junit.Assert.assertNotNull(fileOutputStream17);
        org.junit.Assert.assertNotNull(lineIterator18);
        org.junit.Assert.assertNotNull(fileOutputStream19);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test660");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        org.apache.commons.io.LineIterator lineIterator11 = org.apache.commons.io.FileUtils.lineIterator(file7);
        boolean boolean13 = org.apache.commons.io.FileUtils.isFileOlder(file7, (-1L));
        java.nio.charset.Charset charset14 = null;
        java.lang.String str15 = org.apache.commons.io.FileUtils.readFileToString(file7, charset14);
        java.io.FileOutputStream fileOutputStream17 = org.apache.commons.io.FileUtils.openOutputStream(file7, false);
        org.apache.commons.io.LineIterator lineIterator18 = org.apache.commons.io.FileUtils.lineIterator(file7);
        java.nio.charset.Charset charset20 = null;
        org.apache.commons.io.FileUtils.write(file7, (java.lang.CharSequence) "1048576 EB", charset20, false);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lineIterator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(fileOutputStream17);
        org.junit.Assert.assertNotNull(lineIterator18);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test661");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        org.apache.commons.io.LineIterator lineIterator11 = org.apache.commons.io.FileUtils.lineIterator(file7);
        boolean boolean13 = org.apache.commons.io.FileUtils.isFileOlder(file7, (-1L));
        byte[] byteArray14 = new byte[] {};
        org.apache.commons.io.FileUtils.writeByteArrayToFile(file7, byteArray14);
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file19 = org.apache.commons.io.FileUtils.getFile(strArray18);
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file23 = org.apache.commons.io.FileUtils.getFile(strArray22);
        boolean boolean24 = org.apache.commons.io.FileUtils.isFileOlder(file19, file23);
        boolean boolean26 = org.apache.commons.io.FileUtils.waitFor(file23, (int) '4');
        org.apache.commons.io.LineIterator lineIterator27 = org.apache.commons.io.FileUtils.lineIterator(file23);
        boolean boolean29 = org.apache.commons.io.FileUtils.isFileOlder(file23, (-1L));
        java.io.FileOutputStream fileOutputStream31 = org.apache.commons.io.FileUtils.openOutputStream(file23, false);
        long long32 = org.apache.commons.io.FileUtils.copyFile(file7, (java.io.OutputStream) fileOutputStream31);
        java.util.List<java.lang.String> strList33 = org.apache.commons.io.FileUtils.readLines(file7);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lineIterator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(file19);
        org.junit.Assert.assertEquals(file19.getParent(), "hi!");
        org.junit.Assert.assertEquals(file19.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(file23);
        org.junit.Assert.assertEquals(file23.getParent(), "hi!");
        org.junit.Assert.assertEquals(file23.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(lineIterator27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(fileOutputStream31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNotNull(strList33);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test662");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file14 = org.apache.commons.io.FileUtils.getFile(strArray13);
        boolean boolean16 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file7, file14, "");
        org.apache.commons.io.LineIterator lineIterator17 = org.apache.commons.io.FileUtils.lineIterator(file7);
        org.apache.commons.io.FileUtils.writeStringToFile(file7, "C:\\Users\\Mathieu\\AppData\\Local\\Temp\\", false);
        java.nio.charset.Charset charset22 = null;
        org.apache.commons.io.FileUtils.write(file7, (java.lang.CharSequence) "", charset22, true);
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file28 = org.apache.commons.io.FileUtils.getFile(strArray27);
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file32 = org.apache.commons.io.FileUtils.getFile(strArray31);
        boolean boolean33 = org.apache.commons.io.FileUtils.isFileOlder(file28, file32);
        boolean boolean35 = org.apache.commons.io.FileUtils.waitFor(file32, (int) '4');
        org.apache.commons.io.LineIterator lineIterator36 = org.apache.commons.io.FileUtils.lineIterator(file32);
        boolean boolean37 = org.apache.commons.io.FileUtils.deleteQuietly(file32);
        org.apache.commons.io.FileUtils.write(file32, (java.lang.CharSequence) "hi!");
        java.nio.charset.Charset charset41 = null;
        org.apache.commons.io.FileUtils.write(file32, (java.lang.CharSequence) "", charset41, true);
        byte[] byteArray44 = org.apache.commons.io.FileUtils.readFileToByteArray(file32);
        org.apache.commons.io.FileUtils.writeByteArrayToFile(file7, byteArray44);
        java.nio.charset.Charset charset47 = null;
        org.apache.commons.io.FileUtils.write(file7, (java.lang.CharSequence) "", charset47);
        org.apache.commons.io.FileUtils.forceDeleteOnExit(file7);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(file14);
        org.junit.Assert.assertEquals(file14.getParent(), "hi!");
        org.junit.Assert.assertEquals(file14.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(lineIterator17);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(file28);
        org.junit.Assert.assertEquals(file28.getParent(), "hi!");
        org.junit.Assert.assertEquals(file28.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(file32);
        org.junit.Assert.assertEquals(file32.getParent(), "hi!");
        org.junit.Assert.assertEquals(file32.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(lineIterator36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[104, 105, 33]");
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test663");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        org.apache.commons.io.LineIterator lineIterator11 = org.apache.commons.io.FileUtils.lineIterator(file7);
        boolean boolean12 = org.apache.commons.io.FileUtils.deleteQuietly(file7);
        java.io.FileOutputStream fileOutputStream13 = org.apache.commons.io.FileUtils.openOutputStream(file7);
        java.io.FileInputStream fileInputStream14 = org.apache.commons.io.FileUtils.openInputStream(file7);
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file18 = org.apache.commons.io.FileUtils.getFile(strArray17);
        org.apache.commons.io.FileUtils.copyToFile((java.io.InputStream) fileInputStream14, file18);
        java.nio.charset.Charset charset20 = null;
        java.lang.String str21 = org.apache.commons.io.FileUtils.readFileToString(file18, charset20);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lineIterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(fileOutputStream13);
        org.junit.Assert.assertNotNull(fileInputStream14);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(file18);
        org.junit.Assert.assertEquals(file18.getParent(), "hi!");
        org.junit.Assert.assertEquals(file18.toString(), "hi!\\hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test664");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        org.apache.commons.io.LineIterator lineIterator11 = org.apache.commons.io.FileUtils.lineIterator(file7);
        boolean boolean12 = org.apache.commons.io.FileUtils.deleteQuietly(file7);
        org.apache.commons.io.FileUtils.write(file7, (java.lang.CharSequence) "hi!");
        java.nio.charset.Charset charset16 = null;
        org.apache.commons.io.FileUtils.write(file7, (java.lang.CharSequence) "", charset16, true);
        java.nio.charset.Charset charset20 = null;
        org.apache.commons.io.FileUtils.writeStringToFile(file7, "", charset20, false);
        long long23 = org.apache.commons.io.FileUtils.sizeOf(file7);
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file27 = org.apache.commons.io.FileUtils.getFile(strArray26);
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file31 = org.apache.commons.io.FileUtils.getFile(strArray30);
        boolean boolean32 = org.apache.commons.io.FileUtils.isFileOlder(file27, file31);
        boolean boolean34 = org.apache.commons.io.FileUtils.waitFor(file31, (int) '4');
        org.apache.commons.io.LineIterator lineIterator35 = org.apache.commons.io.FileUtils.lineIterator(file31);
        boolean boolean36 = org.apache.commons.io.FileUtils.deleteQuietly(file31);
        org.apache.commons.io.FileUtils.write(file31, (java.lang.CharSequence) "hi!");
        java.nio.charset.Charset charset40 = null;
        org.apache.commons.io.FileUtils.write(file31, (java.lang.CharSequence) "", charset40, true);
        java.nio.charset.Charset charset44 = null;
        org.apache.commons.io.FileUtils.writeStringToFile(file31, "", charset44, false);
        long long47 = org.apache.commons.io.FileUtils.sizeOf(file31);
        org.apache.commons.io.FileUtils.writeStringToFile(file31, "");
        boolean boolean51 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file7, file31, "hi!");
        java.lang.String[] strArray54 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file55 = org.apache.commons.io.FileUtils.getFile(strArray54);
        java.lang.String[] strArray58 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file59 = org.apache.commons.io.FileUtils.getFile(strArray58);
        boolean boolean60 = org.apache.commons.io.FileUtils.isFileOlder(file55, file59);
        boolean boolean61 = org.apache.commons.io.FileUtils.deleteQuietly(file59);
        boolean boolean63 = org.apache.commons.io.FileUtils.isFileNewer(file59, 0L);
        java.nio.charset.Charset charset64 = null;
        java.util.List<java.lang.String> strList65 = org.apache.commons.io.FileUtils.readLines(file59, charset64);
        java.lang.String[] strArray68 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file69 = org.apache.commons.io.FileUtils.getFile(strArray68);
        java.lang.String[] strArray72 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file73 = org.apache.commons.io.FileUtils.getFile(strArray72);
        boolean boolean74 = org.apache.commons.io.FileUtils.isFileOlder(file69, file73);
        java.lang.String str75 = org.apache.commons.io.FileUtils.readFileToString(file69);
        java.lang.String[] strArray78 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file79 = org.apache.commons.io.FileUtils.getFile(strArray78);
        java.io.File file80 = org.apache.commons.io.FileUtils.getFile(file69, strArray78);
        java.io.File file81 = org.apache.commons.io.FileUtils.getFile(file59, strArray78);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<java.io.File> fileItor83 = org.apache.commons.io.FileUtils.iterateFiles(file31, strArray78, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'directory' is not a directory: hi!\\hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(lineIterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(file27);
        org.junit.Assert.assertEquals(file27.getParent(), "hi!");
        org.junit.Assert.assertEquals(file27.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(file31);
        org.junit.Assert.assertEquals(file31.getParent(), "hi!");
        org.junit.Assert.assertEquals(file31.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(lineIterator35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertNotNull(file55);
        org.junit.Assert.assertEquals(file55.getParent(), "hi!");
        org.junit.Assert.assertEquals(file55.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertNotNull(file59);
        org.junit.Assert.assertEquals(file59.getParent(), "hi!");
        org.junit.Assert.assertEquals(file59.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(strList65);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(file69);
        org.junit.Assert.assertEquals(file69.getParent(), "hi!");
        org.junit.Assert.assertEquals(file69.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertNotNull(file73);
        org.junit.Assert.assertEquals(file73.getParent(), "hi!");
        org.junit.Assert.assertEquals(file73.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertNotNull(file79);
        org.junit.Assert.assertEquals(file79.getParent(), "hi!");
        org.junit.Assert.assertEquals(file79.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(file80);
        org.junit.Assert.assertEquals(file80.getParent(), "hi!\\hi!\\hi!");
        org.junit.Assert.assertEquals(file80.toString(), "hi!\\hi!\\hi!\\hi!");
        org.junit.Assert.assertNotNull(file81);
        org.junit.Assert.assertEquals(file81.getParent(), "hi!\\hi!\\hi!");
        org.junit.Assert.assertEquals(file81.toString(), "hi!\\hi!\\hi!\\hi!");
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test665");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file14 = org.apache.commons.io.FileUtils.getFile(strArray13);
        boolean boolean16 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file7, file14, "");
        org.apache.commons.io.FileUtils.write(file14, (java.lang.CharSequence) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            long long19 = org.apache.commons.io.FileUtils.sizeOfDirectory(file14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!\\hi! is not a directory");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(file14);
        org.junit.Assert.assertEquals(file14.getParent(), "hi!");
        org.junit.Assert.assertEquals(file14.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test666");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean9 = org.apache.commons.io.FileUtils.deleteQuietly(file7);
        boolean boolean11 = org.apache.commons.io.FileUtils.isFileNewer(file7, 0L);
        java.nio.charset.Charset charset12 = null;
        java.util.List<java.lang.String> strList13 = org.apache.commons.io.FileUtils.readLines(file7, charset12);
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file17 = org.apache.commons.io.FileUtils.getFile(strArray16);
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file21 = org.apache.commons.io.FileUtils.getFile(strArray20);
        boolean boolean22 = org.apache.commons.io.FileUtils.isFileOlder(file17, file21);
        java.lang.String str23 = org.apache.commons.io.FileUtils.readFileToString(file17);
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file27 = org.apache.commons.io.FileUtils.getFile(strArray26);
        java.io.File file28 = org.apache.commons.io.FileUtils.getFile(file17, strArray26);
        java.io.File file29 = org.apache.commons.io.FileUtils.getFile(file7, strArray26);
        java.lang.String[] strArray32 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file33 = org.apache.commons.io.FileUtils.getFile(strArray32);
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file37 = org.apache.commons.io.FileUtils.getFile(strArray36);
        boolean boolean38 = org.apache.commons.io.FileUtils.isFileOlder(file33, file37);
        boolean boolean40 = org.apache.commons.io.FileUtils.waitFor(file37, (int) '4');
        java.lang.String[] strArray43 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file44 = org.apache.commons.io.FileUtils.getFile(strArray43);
        boolean boolean46 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file37, file44, "");
        org.apache.commons.io.LineIterator lineIterator47 = org.apache.commons.io.FileUtils.lineIterator(file37);
        org.apache.commons.io.FileUtils.writeStringToFile(file37, "C:\\Users\\Mathieu\\AppData\\Local\\Temp\\", false);
        java.nio.charset.Charset charset52 = null;
        org.apache.commons.io.FileUtils.write(file37, (java.lang.CharSequence) "", charset52, true);
        boolean boolean56 = org.apache.commons.io.FileUtils.waitFor(file37, 0);
        java.nio.charset.Charset charset57 = null;
        java.lang.String str58 = org.apache.commons.io.FileUtils.readFileToString(file37, charset57);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.FileUtils.moveToDirectory(file7, file37, true);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Destination 'hi!\\hi!' is not a directory");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(file17);
        org.junit.Assert.assertEquals(file17.getParent(), "hi!");
        org.junit.Assert.assertEquals(file17.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(file21);
        org.junit.Assert.assertEquals(file21.getParent(), "hi!");
        org.junit.Assert.assertEquals(file21.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(file27);
        org.junit.Assert.assertEquals(file27.getParent(), "hi!");
        org.junit.Assert.assertEquals(file27.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(file28);
        org.junit.Assert.assertEquals(file28.getParent(), "hi!\\hi!\\hi!");
        org.junit.Assert.assertEquals(file28.toString(), "hi!\\hi!\\hi!\\hi!");
        org.junit.Assert.assertNotNull(file29);
        org.junit.Assert.assertEquals(file29.getParent(), "hi!\\hi!\\hi!");
        org.junit.Assert.assertEquals(file29.toString(), "hi!\\hi!\\hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(file33);
        org.junit.Assert.assertEquals(file33.getParent(), "hi!");
        org.junit.Assert.assertEquals(file33.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(file37);
        org.junit.Assert.assertEquals(file37.getParent(), "hi!");
        org.junit.Assert.assertEquals(file37.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(file44);
        org.junit.Assert.assertEquals(file44.getParent(), "hi!");
        org.junit.Assert.assertEquals(file44.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(lineIterator47);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "C:\\Users\\Mathieu\\AppData\\Local\\Temp\\" + "'", str58, "C:\\Users\\Mathieu\\AppData\\Local\\Temp\\");
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test667");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file14 = org.apache.commons.io.FileUtils.getFile(strArray13);
        boolean boolean16 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file7, file14, "");
        org.apache.commons.io.LineIterator lineIterator17 = org.apache.commons.io.FileUtils.lineIterator(file7);
        org.apache.commons.io.FileUtils.writeStringToFile(file7, "C:\\Users\\Mathieu\\AppData\\Local\\Temp\\", false);
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file24 = org.apache.commons.io.FileUtils.getFile(strArray23);
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file28 = org.apache.commons.io.FileUtils.getFile(strArray27);
        boolean boolean29 = org.apache.commons.io.FileUtils.isFileOlder(file24, file28);
        java.lang.String str30 = org.apache.commons.io.FileUtils.readFileToString(file24);
        java.lang.String[] strArray33 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file34 = org.apache.commons.io.FileUtils.getFile(strArray33);
        java.io.File file35 = org.apache.commons.io.FileUtils.getFile(file24, strArray33);
        boolean boolean37 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file7, file35, "-1 bytes");
        java.io.FileOutputStream fileOutputStream38 = org.apache.commons.io.FileUtils.openOutputStream(file7);
        java.lang.String[] strArray41 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file42 = org.apache.commons.io.FileUtils.getFile(strArray41);
        java.lang.String[] strArray45 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file46 = org.apache.commons.io.FileUtils.getFile(strArray45);
        boolean boolean47 = org.apache.commons.io.FileUtils.isFileOlder(file42, file46);
        boolean boolean49 = org.apache.commons.io.FileUtils.waitFor(file46, (int) '4');
        org.apache.commons.io.LineIterator lineIterator50 = org.apache.commons.io.FileUtils.lineIterator(file46);
        boolean boolean51 = org.apache.commons.io.FileUtils.deleteQuietly(file46);
        org.apache.commons.io.FileUtils.write(file46, (java.lang.CharSequence) "hi!");
        java.nio.charset.Charset charset55 = null;
        org.apache.commons.io.FileUtils.write(file46, (java.lang.CharSequence) "", charset55, true);
        byte[] byteArray58 = org.apache.commons.io.FileUtils.readFileToByteArray(file46);
        boolean boolean60 = org.apache.commons.io.FileUtils.waitFor(file46, (int) 'a');
        byte[] byteArray61 = org.apache.commons.io.FileUtils.readFileToByteArray(file46);
        java.io.FileInputStream fileInputStream62 = org.apache.commons.io.FileUtils.openInputStream(file46);
        byte[] byteArray63 = org.apache.commons.io.FileUtils.readFileToByteArray(file46);
        org.apache.commons.io.FileUtils.writeByteArrayToFile(file7, byteArray63);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.io.FileUtils.cleanDirectory(file7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!\\hi! is not a directory");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(file14);
        org.junit.Assert.assertEquals(file14.getParent(), "hi!");
        org.junit.Assert.assertEquals(file14.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(lineIterator17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(file24);
        org.junit.Assert.assertEquals(file24.getParent(), "hi!");
        org.junit.Assert.assertEquals(file24.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(file28);
        org.junit.Assert.assertEquals(file28.getParent(), "hi!");
        org.junit.Assert.assertEquals(file28.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "C:\\Users\\Mathieu\\AppData\\Local\\Temp\\" + "'", str30, "C:\\Users\\Mathieu\\AppData\\Local\\Temp\\");
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(file34);
        org.junit.Assert.assertEquals(file34.getParent(), "hi!");
        org.junit.Assert.assertEquals(file34.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(file35);
        org.junit.Assert.assertEquals(file35.getParent(), "hi!\\hi!\\hi!");
        org.junit.Assert.assertEquals(file35.toString(), "hi!\\hi!\\hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(fileOutputStream38);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(file42);
        org.junit.Assert.assertEquals(file42.getParent(), "hi!");
        org.junit.Assert.assertEquals(file42.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(file46);
        org.junit.Assert.assertEquals(file46.getParent(), "hi!");
        org.junit.Assert.assertEquals(file46.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(lineIterator50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray58), "[104, 105, 33]");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[104, 105, 33]");
        org.junit.Assert.assertNotNull(fileInputStream62);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray63), "[104, 105, 33]");
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test668");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file3 = org.apache.commons.io.FileUtils.getFile(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file7 = org.apache.commons.io.FileUtils.getFile(strArray6);
        boolean boolean8 = org.apache.commons.io.FileUtils.isFileOlder(file3, file7);
        boolean boolean10 = org.apache.commons.io.FileUtils.waitFor(file7, (int) '4');
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file14 = org.apache.commons.io.FileUtils.getFile(strArray13);
        boolean boolean16 = org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(file7, file14, "");
        java.io.FileOutputStream fileOutputStream18 = org.apache.commons.io.FileUtils.openOutputStream(file7, false);
        java.lang.String[] strArray25 = new java.lang.String[] { "", "1048576 EB", "C:\\Users\\Mathieu\\AppData\\Local\\Temp\\", "C:\\Users\\Mathieu", "", "1048576 EB" };
        java.util.ArrayList<java.lang.String> strList26 = new java.util.ArrayList<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList26, strArray25);
        org.apache.commons.io.FileUtils.writeLines(file7, (java.util.Collection<java.lang.String>) strList26, "1 GB", false);
        java.lang.String[] strArray33 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file34 = org.apache.commons.io.FileUtils.getFile(strArray33);
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file38 = org.apache.commons.io.FileUtils.getFile(strArray37);
        boolean boolean39 = org.apache.commons.io.FileUtils.isFileOlder(file34, file38);
        boolean boolean41 = org.apache.commons.io.FileUtils.waitFor(file38, (int) '4');
        org.apache.commons.io.LineIterator lineIterator42 = org.apache.commons.io.FileUtils.lineIterator(file38);
        boolean boolean43 = org.apache.commons.io.FileUtils.deleteQuietly(file38);
        org.apache.commons.io.FileUtils.write(file38, (java.lang.CharSequence) "hi!");
        java.nio.charset.Charset charset47 = null;
        org.apache.commons.io.FileUtils.write(file38, (java.lang.CharSequence) "", charset47, true);
        java.nio.charset.Charset charset51 = null;
        org.apache.commons.io.FileUtils.writeStringToFile(file38, "", charset51, false);
        java.lang.String[] strArray56 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file57 = org.apache.commons.io.FileUtils.getFile(strArray56);
        java.lang.String[] strArray60 = new java.lang.String[] { "hi!", "hi!" };
        java.io.File file61 = org.apache.commons.io.FileUtils.getFile(strArray60);
        boolean boolean62 = org.apache.commons.io.FileUtils.isFileOlder(file57, file61);
        boolean boolean64 = org.apache.commons.io.FileUtils.waitFor(file61, (int) '4');
        org.apache.commons.io.LineIterator lineIterator65 = org.apache.commons.io.FileUtils.lineIterator(file61);
        boolean boolean66 = org.apache.commons.io.FileUtils.deleteQuietly(file61);
        org.apache.commons.io.FileUtils.write(file61, (java.lang.CharSequence) "hi!");
        java.nio.charset.Charset charset70 = null;
        org.apache.commons.io.FileUtils.write(file61, (java.lang.CharSequence) "", charset70, true);
        byte[] byteArray73 = org.apache.commons.io.FileUtils.readFileToByteArray(file61);
        boolean boolean75 = org.apache.commons.io.FileUtils.waitFor(file61, (int) 'a');
        byte[] byteArray76 = org.apache.commons.io.FileUtils.readFileToByteArray(file61);
        org.apache.commons.io.FileUtils.writeByteArrayToFile(file38, byteArray76);
        org.apache.commons.io.FileUtils.writeByteArrayToFile(file7, byteArray76, (int) (byte) 0, (int) (byte) 0, false);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "hi!");
        org.junit.Assert.assertEquals(file3.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "hi!");
        org.junit.Assert.assertEquals(file7.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(file14);
        org.junit.Assert.assertEquals(file14.getParent(), "hi!");
        org.junit.Assert.assertEquals(file14.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(fileOutputStream18);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(file34);
        org.junit.Assert.assertEquals(file34.getParent(), "hi!");
        org.junit.Assert.assertEquals(file34.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(file38);
        org.junit.Assert.assertEquals(file38.getParent(), "hi!");
        org.junit.Assert.assertEquals(file38.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(lineIterator42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertNotNull(file57);
        org.junit.Assert.assertEquals(file57.getParent(), "hi!");
        org.junit.Assert.assertEquals(file57.toString(), "hi!\\hi!");
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertNotNull(file61);
        org.junit.Assert.assertEquals(file61.getParent(), "hi!");
        org.junit.Assert.assertEquals(file61.toString(), "hi!\\hi!");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(lineIterator65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray73), "[104, 105, 33]");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray76), "[104, 105, 33]");
    }
}
