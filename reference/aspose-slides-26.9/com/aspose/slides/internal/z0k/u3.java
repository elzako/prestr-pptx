package com.aspose.slides.internal.z0k;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.DirectoryNotFoundException;
import com.aspose.slides.exceptions.IOException;
import com.aspose.slides.ms.System.d1;
import java.io.File;

public class u3 {
   public static a6 n5(String var0) {
      if (var0 == null) {
         throw new ArgumentNullException("path");
      } else if (var0.length() == 0) {
         throw new ArgumentException("Path is empty");
      } else if (d1.l6(var0).length() == 0) {
         throw new ArgumentException("Only blank characters in path");
      } else {
         File var1 = new File(var0);
         if (!var1.mkdirs() && (!var1.isDirectory() || !var1.exists())) {
            throw new IOException("DirectoryInfo was not created");
         } else {
            return new a6(var0, true);
         }
      }
   }

   public static void l6(String var0) {
      if (var0 != null && !d1.l6(var0).equals(d1.n5)) {
         File var1 = new File(var0);
         if (!var1.exists()) {
            throw new DirectoryNotFoundException("Directory was not found");
         }

         if (!var1.isDirectory()) {
            throw new IOException("Target path is not directory");
         }

         boolean var2 = var1.delete();
         if (!var2) {
            throw new IOException("Directory was not deleted");
         }
      } else {
         throw new ArgumentNullException("path");
      }
   }

   public static void n5(String var0, boolean var1) {
      File var2 = new File(var0);
      if (var1) {
         n5(var2);
      } else {
         l6(var0);
      }
   }

   static void n5(File var0) {
      if (var0.isDirectory()) {
         for (File var4 : var0.listFiles()) {
            if (var4.isDirectory()) {
               n5(var4);
            } else {
               var4.delete();
            }
         }
      }

      var0.delete();
   }

   public static boolean k5(String var0) {
      if (var0 != null && var0.length() != 0) {
         try {
            return new File(var0).isDirectory();
         } catch (SecurityException var2) {
            return false;
         }
      } else {
         return false;
      }
   }

   public static String n5() {
      File var0 = new File(".");
      File var1 = new File(var0.getAbsolutePath());
      return var1.getParent();
   }

   public static String[] u3(String var0) {
      return n5(var0, "*");
   }

   public static String[] n5(String var0, String var1) {
      if (var0 == null) {
         throw new ArgumentNullException("path");
      }

      File var2 = new File(var0);
      u3$n5 var3 = new u3$n5(var1, false);
      String[] var4 = new String[0];
      String[] var5 = var2.list(var3);
      if (var5 != null) {
         var4 = new String[var5.length];

         for (int var6 = 0; var6 < var4.length; var6++) {
            var4[var6] = z1.l6(var0, var5[var6]);
         }
      }

      return var4;
   }

   public static String[] a6(String var0) {
      if (var0 == null) {
         throw new ArgumentNullException("path");
      } else {
         return l6(var0, "*.*");
      }
   }

   public static String[] l6(String var0, String var1) {
      if (var0 == null) {
         throw new ArgumentNullException("path");
      }

      File var2 = new File(var0);
      u3$n5 var3 = new u3$n5(var1, true);
      String[] var4 = new String[0];
      String[] var5 = var2.list(var3);
      if (var5 != null) {
         var4 = new String[var5.length];

         for (int var6 = 0; var6 < var4.length; var6++) {
            var4[var6] = z1.l6(var0, var5[var6]);
         }
      }

      return var4;
   }

   static boolean u9(String var0) {
      return "/".equals(var0) ? true : var0.length() == 3 && d1.k5(var0, ":\\");
   }

   public static a6 h0(String var0) {
      if (var0 == null) {
         throw new ArgumentNullException("path");
      }

      if (u9(var0)) {
         return null;
      }

      String var1 = z1.u9(var0);
      if (var1 == null || var1.length() == 0) {
         var1 = n5();
      }

      return new a6(var1);
   }
}
