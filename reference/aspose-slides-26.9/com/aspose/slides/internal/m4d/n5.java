package com.aspose.slides.internal.m4d;

import com.aspose.slides.Collections.Generic.List;
import java.awt.image.BufferedImage;
import java.awt.image.IndexColorModel;

class n5 {
   private final com.aspose.slides.internal.e2l.u9 n5;
   private final List<com.aspose.slides.internal.v2x.k5> l6;
   private final boolean k5;
   private final a6 u3;

   n5(com.aspose.slides.internal.e2l.u9 var1, List<com.aspose.slides.internal.v2x.k5> var2, boolean var3, a6 var4) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
      this.u3 = var4;
   }

   public int n5() {
      return this.k5 ? 2498570 : 198659;
   }

   public BufferedImage n5(int var1) {
      com.aspose.slides.internal.v2x.k5 var2 = this.l6.get_Item(var1);
      int[] var3 = var2.u3(var2.s7());
      BufferedImage var4 = null;
      boolean var5 = false;
      if (this.k5) {
         var4 = com.aspose.slides.internal.v4y.l6.n5(this.n5.t9(), this.n5.n3(), 2498570);
      } else {
         IndexColorModel var6 = this.u3.n5(var1);
         var4 = new BufferedImage(var6, var6.createCompatibleWritableRaster(this.n5.t9(), this.n5.n3()), false, null);
         var5 = true;
      }

      int var15 = com.aspose.slides.internal.o9b.c8.n5(0, com.aspose.slides.internal.o9b.c8.w4()).h0();
      int var7 = var2.z8();
      int var8 = var2.n3() + var7;
      int var9 = var2.m3();
      int var10 = var2.t9() + var9;

      for (int var11 = var7; var11 < var8; var11++) {
         for (int var12 = var9; var12 < var10; var12++) {
            int var13 = var12 - var9 + (var11 - var7) * var2.t9();
            if (var3[var13] == -1 && !var5) {
               var4.setRGB(var12, var11, var15);
            } else {
               var4.setRGB(var12, var11, var3[var13]);
            }
         }
      }

      return var4;
   }
}
