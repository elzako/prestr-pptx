package com.aspose.slides.internal.v6;

import com.aspose.slides.internal.b9.a7;
import com.aspose.slides.internal.b9.s9;

public abstract class m1 extends com.aspose.slides.internal.r5.a6 {
   protected m1(com.aspose.slides.internal.r5.y4 var1) {
      super(var1);
   }

   @Override
   public void u9(s9 var1, com.aspose.slides.internal.r6.u9 var2) {
      a7 var3 = (a7)var1;
      com.aspose.slides.internal.o9b.j5[] var4 = (com.aspose.slides.internal.o9b.j5[])com.aspose.slides.ms.System.u3.n5(
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o9b.j5.class), (int)var3.l6())
      );

      for (int var5 = 0; var5 < var4.length; var5++) {
         var3.k5()[var5].u3().k5(var4[var5]);
      }

      byte[] var9 = new byte[var3.u3().length];

      for (int var6 = 0; var6 < var3.u3().length; var6++) {
         byte var7 = 0;
         byte var8 = var3.u3()[var6];
         if ((var8 & 6) == 6) {
            var7 = 0;
         } else {
            if ((var8 & 2) == 2) {
               var7 = (byte)(var7 & 0xFF | 1);
            } else if ((var8 & 4) == 4) {
               var7 = (byte)(var7 & 0xFF | 3);
            }

            if ((var8 & 1) == 1) {
               var7 = (byte)(var7 & 0xFF | 128);
            }
         }

         var9[var6] = var7;
      }

      com.aspose.slides.internal.x4g.s7 var10 = new com.aspose.slides.internal.x4g.s7(var4, var9);
      if (var2.e2()) {
         var2.y4().n5(var10, false);
      } else if (var2.c8() != null) {
         this.n5(var10, var2);
      }
   }

   @Override
   public boolean h0(s9 var1, com.aspose.slides.internal.r6.u9 var2) {
      return !var2.e2();
   }

   protected abstract void n5(com.aspose.slides.internal.x4g.s7 var1, com.aspose.slides.internal.r6.u9 var2);
}
