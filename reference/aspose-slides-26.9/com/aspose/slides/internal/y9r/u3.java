package com.aspose.slides.internal.y9r;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.e2l.h0;
import com.aspose.slides.internal.y5s.a0;
import com.aspose.slides.ms.System.q1;
import com.aspose.slides.ms.System.x8;

public class u3 extends l6 {
   @Override
   public boolean n5(a0 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("streamContainer");
      } else {
         return var1.u3() == 44;
      }
   }

   @Override
   public h0 n5(a0 var1, com.aspose.slides.internal.j3b.u3 var2) {
      byte[] var3 = com.aspose.slides.internal.e2l.a6.l6(var1, 10);
      if (com.aspose.slides.internal.v6g.k5.u3(var3[0], 6) != 44) {
         throw new com.aspose.slides.internal.g9t.n5("Extension label is unexpected for image descriptor block.");
      }

      int var4 = x8.n5(var3, 1);
      int var5 = x8.n5(var3, 3);
      int var6 = x8.n5(var3, 5);
      int var7 = x8.n5(var3, 7);
      byte var8 = var3[9];
      com.aspose.slides.internal.j3b.u3 var9 = null;
      if ((com.aspose.slides.internal.v6g.k5.u3(var8, 6) & 128) != 0) {
         int var10 = 2 << (com.aspose.slides.internal.v6g.k5.u3(var8, 6) & 7);
         var9 = com.aspose.slides.internal.e2l.a6.n5(var1, var10);
      }

      byte var22 = com.aspose.slides.internal.v6g.k5.n5((Object)(var1.u3()), 9);
      long var11 = var1.k5();
      long var13 = var1.n5();
      long var15 = var13;

      for (byte var17 = 1; com.aspose.slides.internal.v6g.k5.u3(var17, 6) != 0; var15 += com.aspose.slides.internal.v6g.k5.u9(var17, 6)) {
         int var18 = var1.u3();
         if (var18 < 0) {
            break;
         }

         var15++;
         var17 = com.aspose.slides.internal.v6g.k5.n5((Object)(var18), 9);
         long var19 = q1.k5(var15 + com.aspose.slides.internal.v6g.k5.u9(var17, 6), var11) - var15;
         if (com.aspose.slides.internal.v6g.k5.u3(var17, 6) != var19) {
            var1.n5(var19, 1);
            break;
         }

         var1.n5(com.aspose.slides.internal.v6g.k5.u9(var17, 6), 1);
      }

      com.aspose.slides.internal.e2l.k5 var24 = new com.aspose.slides.internal.e2l.k5(
         var1,
         var13,
         (com.aspose.slides.internal.v6g.k5.u3(var8, 6) & 64) != 0,
         new com.aspose.slides.internal.y5s.h0(com.aspose.slides.internal.v2x.k5.k5(var9, var2).l6()),
         var6,
         var7,
         com.aspose.slides.internal.v6g.k5.u3(var22, 6)
      );
      com.aspose.slides.internal.v2x.k5 var21 = new com.aspose.slides.internal.v2x.k5(
         var24,
         var4,
         var5,
         var6,
         var7,
         var9,
         (com.aspose.slides.internal.v6g.k5.u3(var8, 6) & 32) > 0,
         (com.aspose.slides.internal.v6g.k5.u3(var8, 6) & 64) > 0,
         var22
      );
      var21.n5(var1);
      return var21;
   }
}
