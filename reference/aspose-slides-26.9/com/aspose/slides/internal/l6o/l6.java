package com.aspose.slides.internal.l6o;

import com.aspose.slides.internal.z0k.e2;
import com.aspose.slides.internal.z0k.t4;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class l6 {
   public static void n5(InputStream var0, e2 var1) {
      if (var0 == null) {
         throw new NullPointerException("srcStream");
      }

      if (var1 == null) {
         throw new NullPointerException("srcStream");
      }

      byte[] var2 = new byte[65536];

      while (true) {
         int var3 = 0;

         try {
            var3 = var0.read(var2, 0, var2.length);
         } catch (IOException var5) {
            throw new com.aspose.slides.exceptions.IOException("exception", var5);
         }

         if (var3 <= 0) {
            var1.setPosition(0L);
            return;
         }

         var1.write(var2, 0, var3);
      }
   }

   public static e2 n5(t4 var0) {
      if (var0 == null) {
         throw new NullPointerException("srcStream");
      }

      e2 var1 = new e2();
      byte[] var2 = new byte[65536];

      while (true) {
         int var3 = var0.read(var2, 0, var2.length);
         if (var3 <= 0) {
            var1.setPosition(0L);
            return var1;
         }

         var1.write(var2, 0, var3);
      }
   }

   public static void n5(t4 var0, OutputStream var1) {
      n5(var0, var1, 0L);
   }

   public static void n5(t4 var0, OutputStream var1, long var2) {
      if (var0 == null) {
         throw new NullPointerException("srcStream");
      }

      if (var1 == null) {
         throw new NullPointerException("dstStream");
      }

      long var4 = var0.getPosition();
      var0.setPosition(var2);
      byte[] var6 = new byte[65536];

      while (true) {
         int var7 = var0.read(var6, 0, var6.length);
         if (var7 == 0) {
            var0.setPosition(var4);
            return;
         }

         try {
            var1.write(var6, 0, var7);
         } catch (IOException var9) {
            throw new com.aspose.slides.exceptions.IOException("exception", var9);
         }
      }
   }

   public static void n5(n5 var0) {
      var0.n5();
   }
}
