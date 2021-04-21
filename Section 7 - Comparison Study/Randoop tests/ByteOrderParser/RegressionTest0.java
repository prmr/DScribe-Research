import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test1");
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteOrder byteOrder1 = org.apache.commons.io.ByteOrderParser.parseByteOrder("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported byte order setting: hi!, expeced one of LITTLE_ENDIAN, BIG_ENDIAN");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test3");
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteOrder byteOrder1 = org.apache.commons.io.ByteOrderParser.parseByteOrder("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported byte order setting: , expeced one of LITTLE_ENDIAN, BIG_ENDIAN");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }
}

