package com.aspose.slides.internal.e8p;

import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;

public class l6 extends u9 {
   public l6(com.aspose.slides.internal.c5e.x8 var1, BufferedImage var2) {
      super(var1, var2);
   }

   @Deprecated
   @Override
   protected void n5(com.aspose.slides.internal.c5e.k5 var1, int[] var2) {
      for (int var3 = 0; var3 < var2.length; var3++) {
         int var4 = var3 * this.n5.n5.u3;
         int var5 = var1.l6[var4];
         int var6 = var1.l6[var4 + 1];
         var2[var3] = var6 << 24 | var5 << 16 | var5 << 8 | var5;
      }
   }

   @Override
   public void n5() {
      int var1 = this.n5.n5.l6;

      for (int var2 = 0; var2 < var1; var2++) {
         com.aspose.slides.internal.c5e.k5 var3 = this.n5.n5(var2);
         this.n5(var3, this.l6);
      }
   }

   @Override
   protected void n5(com.aspose.slides.internal.c5e.k5 var1, BufferedImage var2) {
      DataBufferByte var3 = (DataBufferByte)var2.getRaster().getDataBuffer();
      byte[] var4 = var3.getData();
      int var5 = var1.n5();
      int var6 = this.n5.n5.n5;
      int var7 = var6 * 4;
      int var8 = var5 * var7;

      for (int var9 = 0; var9 < var6; var9++) {
         int var10 = var9 * 2;
         int var11 = var8 + var9 * 4;
         int var12 = var1.l6[var10];
         int var13 = var1.l6[var10 + 1];
         var4[var11] = (byte)var13;
         var4[var11 + 1] = (byte)var12;
         var4[var11 + 2] = (byte)var12;
         var4[var11 + 3] = (byte)var12;
      }
   }
}
