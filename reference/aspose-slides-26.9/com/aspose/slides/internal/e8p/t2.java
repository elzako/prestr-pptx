package com.aspose.slides.internal.e8p;

import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;

public class t2 extends u9 {
   private boolean k5;
   private int u3 = 0;
   private byte[] a6;

   public t2(com.aspose.slides.internal.c5e.x8 var1, BufferedImage var2) {
      super(var1, var2);
      this.k5 = var1.l6().u3() != null;
      if (this.k5) {
         int[] var3 = var1.l6().u3().l6();
         this.u3 = var3[0] << 16 | var3[1] << 8 | var3[2];
         this.a6 = new byte[3];
         this.a6[0] = (byte)var3[0];
         this.a6[1] = (byte)var3[1];
         this.a6[2] = (byte)var3[2];
      }
   }

   @Deprecated
   @Override
   protected void n5(com.aspose.slides.internal.c5e.k5 var1, int[] var2) {
      for (int var3 = 0; var3 < var2.length; var3++) {
         var2[var3] = com.aspose.slides.internal.c5e.u3.n5(var1, var3);
         if (!this.k5 || var2[var3] != this.u3) {
            var2[var3] |= -16777216;
         }
      }
   }

   @Override
   public void n5() {
      int var1 = this.n5.n5.l6;

      for (int var2 = 0; var2 < var1; var2++) {
         com.aspose.slides.internal.c5e.k5 var3 = this.n5.l6(var2);
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
      byte[] var9 = var1.k5();

      for (int var10 = 0; var10 < var6; var10++) {
         int var11 = var10 * 3;
         int var12 = var8 + var10 * 4;
         byte var13 = var9[var11];
         byte var14 = var9[var11 + 1];
         byte var15 = var9[var11 + 2];
         if (!this.k5 || var13 != this.a6[0] || var14 != this.a6[1] || var15 != this.a6[2]) {
            var4[var12] = -1;
         }

         var4[var12 + 1] = var15;
         var4[var12 + 2] = var14;
         var4[var12 + 3] = var13;
      }
   }
}
