package com.aspose.slides.ms.core.resources;

import com.aspose.slides.internal.f3h.u9;
import com.aspose.slides.internal.l7h.j5;
import com.aspose.slides.internal.z0k.e2;
import com.aspose.slides.internal.z0k.t4;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.x8;

public class l6 {
   public static n5 n5(t4 var0, String var1) {
      byte[] var2 = new byte["PAK".length()];
      var0.read(var2, 0, "PAK".length());
      String var3 = j5.e2().l6(var2);
      if (!d1.a6("PAK", var3)) {
         throw new IllegalArgumentException("unknown format");
      }

      byte[] var4 = new byte[8];
      var0.read(var4, 0, 8);
      long var5 = x8.u9(var4, 0);
      byte[] var7 = new byte[4];
      var0.read(var7, 0, 4);
      int var8 = x8.a6(var7, 0);

      for (int var9 = 0; var9 < var8; var9++) {
         byte[] var10 = new byte[4];
         var0.read(var10, 0, 4);
         int var11 = x8.a6(var10, 0);
         byte[] var12 = new byte[var11];
         var0.read(var12, 0, var11);
         String var13 = j5.z3().l6(var12);
         byte[] var14 = new byte[4];
         var0.read(var14, 0, 4);
         int var15 = x8.a6(var14, 0);
         if (d1.a6(var1, var13)) {
            e2 var16 = n5(var0, var15);
            return new n5(var13, var16);
         }

         l6(var0, var15);
      }

      return null;
   }

   private static e2 n5(t4 var0, int var1) {
      e2 var2 = new e2(var1);
      n5(var0, var2, var1);
      var2.setPosition(0L);
      e2 var3 = new e2(var1);

      try {
         n5(var2, var3);
      } finally {
         var2.close();
      }

      var3.setPosition(0L);
      return var3;
   }

   private static void l6(t4 var0, int var1) {
      var0.seek(var1, 1);
   }

   private static void n5(t4 var0, t4 var1) {
      u9 var2 = new u9(var0, 1, true);

      try {
         byte[] var3 = new byte[65536];

         int var4;
         while ((var4 = var2.read(var3, 0, var3.length)) > 0) {
            var1.write(var3, 0, var4);
         }
      } finally {
         var2.close();
      }
   }

   static void n5(t4 var0, t4 var1, int var2) {
      byte[] var3 = new byte[var2];
      int var4 = 0;

      while ((var4 = var0.read(var3, 0, var2)) > 0) {
         var1.write(var3, 0, var4);
         var2 -= var4;
         if (var2 <= 0) {
            return;
         }
      }

      if (var2 > 0) {
         throw new IllegalArgumentException("input stream length less then Count");
      }
   }
}
