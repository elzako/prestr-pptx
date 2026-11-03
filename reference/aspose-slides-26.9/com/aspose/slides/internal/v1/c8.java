package com.aspose.slides.internal.v1;

import com.aspose.slides.exceptions.FormatException;
import com.aspose.slides.exceptions.IOException;
import com.aspose.slides.internal.e5a.s3;
import com.aspose.slides.internal.z0k.t4;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.q1;

public class c8 implements t2 {
   private void n5(t4 var1, t4 var2) {
      s3 var3 = new s3(var1, 1, 0, 1950, false);
      byte[] var4 = new byte[4092];

      int var5;
      try {
         do {
            var5 = var3.read(var4, 0, var4.length);
            if (var5 > 0) {
               var2.write(var4, 0, var5);
            }
         } while (var5 > 0);
      } finally {
         var3.close();
      }

      var2.flush();
   }

   @Override
   public final u9 n5(t4 var1, t4 var2, com.aspose.slides.internal.v2.k5 var3, int var4) {
      com.aspose.slides.internal.v2.s7 var5 = var3.n5(com.aspose.slides.internal.v2.c8.t3, com.aspose.slides.internal.v2.c8.b9);
      com.aspose.slides.internal.v2.k5 var6 = null;
      if (com.aspose.slides.internal.v6g.k5.l6(var5, com.aspose.slides.internal.v2.k5.class)) {
         var6 = (com.aspose.slides.internal.v2.k5)var5;
      } else if (com.aspose.slides.internal.v6g.k5.l6(var5, com.aspose.slides.internal.v2.n5.class)) {
         com.aspose.slides.internal.v2.n5 var7 = (com.aspose.slides.internal.v2.n5)var5;
         if (var4 < var7.n5()) {
            com.aspose.slides.internal.v2.s7 var8 = var7.l6(var4);
            var6 = com.aspose.slides.internal.v6g.k5.n5(var8, com.aspose.slides.internal.v2.k5.class);
         }
      } else if (var5 != null) {
         String var16 = d1.n5("Error: Expected CosArray or CosDictionary!", new Object[]{});
         throw new IOException(var16);
      }

      int var15 = -1;
      if (var6 != null) {
         var15 = var6.t2(com.aspose.slides.internal.v2.c8.o9b);
      }

      try {
         if (var15 > 1 && var6 != null) {
            int var17 = q1.l6(var6.n5(com.aspose.slides.internal.v2.c8.i9, 1), 32);
            int var9 = var6.n5(com.aspose.slides.internal.v2.c8.f2, 8);
            int var10 = var6.n5(com.aspose.slides.internal.v2.c8.j3, 1);
            com.aspose.slides.internal.z0k.e2 var11 = new com.aspose.slides.internal.z0k.e2();
            this.n5(var1, var11);
            byte[] var12 = com.aspose.slides.internal.d4.l6.n5(var11);
            com.aspose.slides.internal.z0k.e2 var13 = new com.aspose.slides.internal.z0k.e2(var12);
            y4.n5(var15, var17, var9, var10, var13, var2, 4096);
            var2.flush();
            var11.dispose();
            var13.dispose();
         } else {
            this.n5(var1, var2);
         }
      } catch (FormatException var14) {
         throw new IOException("Error occured in a Decode Flate filter", var14);
      }

      return new u9(var3);
   }
}
