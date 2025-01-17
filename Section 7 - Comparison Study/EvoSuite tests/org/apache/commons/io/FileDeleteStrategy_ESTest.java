/*
 * This file was automatically generated by EvoSuite
 * Thu Jan 21 18:50:27 GMT 2021
 */

package org.apache.commons.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileDeleteStrategy;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class FileDeleteStrategy_ESTest extends FileDeleteStrategy_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      File file0 = MockFile.createTempFile("W_I^F", "");
      FileDeleteStrategy.ForceFileDeleteStrategy fileDeleteStrategy_ForceFileDeleteStrategy0 = new FileDeleteStrategy.ForceFileDeleteStrategy();
      boolean boolean0 = fileDeleteStrategy_ForceFileDeleteStrategy0.deleteQuietly(file0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FileDeleteStrategy fileDeleteStrategy0 = new FileDeleteStrategy("");
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("org.apache.commons.io.FileDeleteStrategy$ForceFileDeleteStrategy");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "\"$lmUyXYB");
      MockFile mockFile0 = new MockFile("");
      try { 
        fileDeleteStrategy0.delete(mockFile0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Deletion failed: 
         //
         verifyException("org.apache.commons.io.FileDeleteStrategy", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FileDeleteStrategy fileDeleteStrategy0 = new FileDeleteStrategy("W_I^F");
      File file0 = MockFile.createTempFile("W_I^F", "");
      fileDeleteStrategy0.FORCE.delete(file0);
      assertEquals("W_I^F0", file0.getName());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      FileDeleteStrategy.ForceFileDeleteStrategy fileDeleteStrategy_ForceFileDeleteStrategy0 = new FileDeleteStrategy.ForceFileDeleteStrategy();
      boolean boolean0 = fileDeleteStrategy_ForceFileDeleteStrategy0.deleteQuietly((File) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          MockFile mockFile0 = new MockFile("");
          FileDeleteStrategy.ForceFileDeleteStrategy fileDeleteStrategy_ForceFileDeleteStrategy0 = (FileDeleteStrategy.ForceFileDeleteStrategy)FileDeleteStrategy.FORCE;
          // Undeclared exception!
          try { 
            fileDeleteStrategy_ForceFileDeleteStrategy0.deleteQuietly(mockFile0);
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.io.FilePermission\" \".classpath\" \"delete\")
             // java.base/java.lang.Thread.getStackTrace(Thread.java:1598)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:433)
             // java.base/java.lang.SecurityManager.checkDelete(SecurityManager.java:866)
             // java.base/sun.nio.fs.WindowsPath.checkDelete(WindowsPath.java:861)
             // java.base/sun.nio.fs.WindowsFileSystemProvider.implDelete(WindowsFileSystemProvider.java:245)
             // java.base/sun.nio.fs.AbstractFileSystemProvider.deleteIfExists(AbstractFileSystemProvider.java:110)
             // java.base/java.nio.file.Files.deleteIfExists(Files.java:1185)
             // org.apache.commons.io.file.DeletingPathVisitor.visitFile(DeletingPathVisitor.java:98)
             // org.apache.commons.io.file.CountingPathVisitor.visitFile(CountingPathVisitor.java:1)
             // java.base/java.nio.file.Files.walkFileTree(Files.java:2804)
             // java.base/java.nio.file.Files.walkFileTree(Files.java:2876)
             // org.apache.commons.io.file.PathUtils.visitFileTree(PathUtils.java:535)
             // org.apache.commons.io.file.PathUtils.deleteDirectory(PathUtils.java:265)
             // org.apache.commons.io.file.PathUtils.delete(PathUtils.java:254)
             // org.apache.commons.io.FileUtils.forceDelete(FileUtils.java:1332)
             // org.apache.commons.io.FileDeleteStrategy$ForceFileDeleteStrategy.doDelete(FileDeleteStrategy.java:60)
             // org.apache.commons.io.FileDeleteStrategy.deleteQuietly(FileDeleteStrategy.java:122)
             // jdk.internal.reflect.GeneratedMethodAccessor62.invoke(Unknown Source)
             // java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
             // java.base/java.lang.reflect.Method.invoke(Method.java:564)
             // org.evosuite.testcase.statements.MethodStatement$1.execute(MethodStatement.java:261)
             // org.evosuite.testcase.statements.AbstractStatement.exceptionHandler(AbstractStatement.java:172)
             // org.evosuite.testcase.statements.MethodStatement.execute(MethodStatement.java:224)
             // org.evosuite.testcase.execution.TestRunnable.executeStatements(TestRunnable.java:295)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:201)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:54)
             // java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
             // java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1130)
             // java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:630)
             // java.base/java.lang.Thread.run(Thread.java:832)
             //
             verifyException("org.evosuite.runtime.sandbox.MSecurityManager", e);
          }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      FileDeleteStrategy fileDeleteStrategy0 = new FileDeleteStrategy("W_I^F");
      String string0 = fileDeleteStrategy0.FORCE.toString();
      assertEquals("FileDeleteStrategy[Force]", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      FileDeleteStrategy fileDeleteStrategy0 = new FileDeleteStrategy("");
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("org.apache.commons.io.FileDeleteStrategy$ForceFileDeleteStrategy");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "\"$lmUyXYB");
      MockFile mockFile0 = new MockFile("org.apache.commons.io.FileDeleteStrategy$ForceFileDeleteStrategy");
      fileDeleteStrategy0.delete(mockFile0);
      assertFalse(mockFile0.canRead());
      assertEquals(0L, mockFile0.lastModified());
  }
}
