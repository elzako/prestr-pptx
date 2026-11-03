package com.aspose.slides.internal.z0k;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.DirectoryNotFoundException;
import com.aspose.slides.exceptions.FileNotFoundException;
import com.aspose.slides.exceptions.IOException;
import com.aspose.slides.ms.System.d1;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class u9 {
   public static void n5(String var0, String var1) {
      j5 var2 = new j5(var0, true);

      try {
         var2.n5(var1);
      } finally {
         if (var2 != null) {
            var2.dispose();
         }
      }
   }

   public static void l6(String var0, String var1) {
      n5(var0, var1, false);
   }

   public static void n5(String var0, String var1, boolean var2) {
      if (var0 == null) {
         throw new ArgumentNullException("sourceFileName");
      }

      if (var1 == null) {
         throw new ArgumentNullException("destFileName");
      }

      if (var0.length() == 0) {
         throw new ArgumentException("An empty file name is not valid.", "sourceFileName");
      }

      if (d1.l6(var0).length() == 0) {
         throw new ArgumentException("The file name is not valid.");
      }

      if (var1.length() == 0) {
         throw new ArgumentException("An empty file name is not valid.", "destFileName");
      }

      if (d1.l6(var1).length() == 0) {
         throw new ArgumentException("The file name is not valid.");
      }

      File var3 = new File(var0);
      File var4 = new File(var1);
      if (!var3.exists()) {
         throw new FileNotFoundException("FileCopy: no such source file: " + var0, var0);
      }

      if (!var3.isFile()) {
         throw new IOException("FileCopy: can't copy directory: " + var0);
      }

      if (!var3.canRead()) {
         throw new IOException("FileCopy: source file is unreadable: " + var0);
      }

      if (var0.equals(var1)) {
         throw new IOException("Can't copy file to itsalf : " + var0);
      }

      if (var4.isDirectory()) {
         var4 = new File(var4, var3.getName());
      }

      if (var4.exists()) {
         if (!var2) {
            throw new IOException("Destination file alresdy exist :" + var4.getAbsolutePath());
         }
      } else {
         String var5 = var4.getParent();
         if (var5 == null) {
            var5 = System.getProperty("user.dir");
         }

         File var6 = new File(var5);
         if (!var6.exists()) {
            throw new IOException("FileCopy: destination directory doesn't exist: " + var5);
         }

         if (var6.isFile()) {
            throw new IOException("FileCopy: destination is not a directory: " + var5);
         }

         if (!var6.canWrite()) {
            throw new IOException("FileCopy: destination directory is unwriteable: " + var5);
         }
      }

      FileInputStream var23 = null;
      FileOutputStream var24 = null;

      try {
         var23 = new FileInputStream(var3);
         var24 = new FileOutputStream(var4);
         byte[] var7 = new byte[4096];

         int var8;
         while ((var8 = var23.read(var7)) != -1) {
            var24.write(var7, 0, var8);
         }
      } catch (java.io.FileNotFoundException var20) {
         throw new FileNotFoundException(var20.getMessage());
      } catch (java.io.IOException var21) {
         throw new IOException(var21.getMessage());
      } finally {
         if (var23 != null) {
            try {
               var23.close();
            } catch (java.io.IOException var19) {
            }
         }

         if (var24 != null) {
            try {
               var24.close();
            } catch (java.io.IOException var18) {
            }
         }
      }
   }

   public static n3 n5(String var0) {
      return new n3(var0, 2, 3);
   }

   public static void l6(String var0) {
      if (var0 == null) {
         throw new ArgumentNullException("path");
      }

      if (d1.l6(var0).length() == 0) {
         throw new ArgumentException("path");
      }

      String var1 = z1.u9(var0);
      if (!d1.n5(var1) && !u3.k5(var1)) {
         throw new DirectoryNotFoundException(d1.n5("Could not find a part of the path \"{0}\".", new Object[]{var0}));
      }

      File var2 = new File(var0);
      if (var2.isFile() && var2.exists() && !var2.delete()) {
         throw new IOException("File was not deleted: " + var0);
      }
   }

   public static boolean k5(String var0) {
      boolean var1 = false;
      if (var0 == null) {
         return var1;
      }

      if (var0.length() == 0) {
         return var1;
      }

      File var2 = new File(var0);

      try {
         return var2.isFile() && var2.exists();
      } catch (SecurityException var4) {
         return false;
      }
   }

   public static void k5(String var0, String var1) {
      if (var0 == null) {
         throw new ArgumentNullException("sourceFileName");
      }

      if (var1 == null) {
         throw new ArgumentNullException("destFileName");
      }

      if (var0.length() == 0) {
         throw new ArgumentException("An empty file name is not valid.", "sourceFileName");
      }

      if (d1.l6(var0).length() == 0) {
         throw new ArgumentException("The file name is not valid.");
      }

      if (var1.length() == 0) {
         throw new ArgumentException("An empty file name is not valid.", "destFileName");
      }

      if (d1.l6(var1).length() == 0) {
         throw new ArgumentException("The file name is not valid.");
      }

      File var2 = new File(var0);
      File var3 = new File(var1);
      if (!var2.exists()) {
         throw new FileNotFoundException("No such source file: " + var0, var0);
      }

      if (!var2.isFile()) {
         throw new IOException("Can't move directory: " + var0);
      }

      if (var3.exists()) {
         throw new IOException("Such directory already exist: " + var3.getAbsolutePath());
      }

      boolean var4 = false;
      var4 = var2.renameTo(var3);
      if (!var4) {
         throw new IOException("File was not moved");
      }
   }

   public static n3 n5(String var0, int var1) {
      return new n3(var0, var1, var1 == 6 ? 2 : 3, 0);
   }

   public static n3 n5(String var0, int var1, int var2) {
      return new n3(var0, var1, var2, 0);
   }

   public static n3 n5(String var0, int var1, int var2, int var3) {
      return new n3(var0, var1, var2, var3);
   }

   public static n3 u3(String var0) {
      return new n3(var0, 3, 1, 1);
   }

   public static m3 a6(String var0) {
      return new m3(var0);
   }

   public static n3 u9(String var0) {
      return new n3(var0, 4, 2, 0);
   }

   public static byte[] h0(String var0) {
      n3 var1 = u3(var0);

      try {
         long var2 = var1.getLength();
         if (var2 > 2147483647L) {
            throw new IOException("Reading more than 2GB with this call is not supported");
         }

         int var4 = 0;
         int var5 = (int)var2;
         byte[] var6 = new byte[(int)var2];

         while (var5 > 0) {
            int var7 = var1.read(var6, var4, var5);
            if (var7 == 0) {
               throw new IOException("Unexpected end of stream");
            }

            var4 += var7;
            var5 -= var7;
         }

         return var6;
      } finally {
         if (var1 != null) {
            var1.dispose();
         }
      }
   }

   public static String[] c8(String var0) {
      m3 var1 = a6(var0);

      try {
         return n5(var1);
      } finally {
         if (var1 != null) {
            var1.dispose();
         }
      }
   }

   static String[] n5(m3 var0) {
      List var1 = new List();

      while (!var0.k5()) {
         var1.addItem(var0.h0());
      }

      return (String[])var1.toArray(new String[0]);
   }

   public static String t2(String var0) {
      m3 var1 = new m3(var0);

      try {
         return var1.c8();
      } finally {
         if (var1 != null) {
            var1.dispose();
         }
      }
   }

   public static String n5(String var0, com.aspose.slides.internal.l7h.j5 var1) {
      m3 var2 = new m3(var0, var1);

      try {
         return var2.c8();
      } finally {
         if (var2 != null) {
            var2.dispose();
         }
      }
   }

   public static void n5(String var0, byte[] var1) {
      n3 var2 = n5(var0);

      try {
         var2.write(var1, 0, var1.length);
      } finally {
         if (var2 != null) {
            var2.dispose();
         }
      }
   }

   public static void u3(String var0, String var1) {
      n5(var0, var1, com.aspose.slides.internal.l7h.j5.z3());
   }

   public static void n5(String var0, String var1, com.aspose.slides.internal.l7h.j5 var2) {
      j5 var3 = new j5(var0, false, var2);

      try {
         var3.n5(var1);
      } finally {
         if (var3 != null) {
            var3.dispose();
         }
      }
   }
}
