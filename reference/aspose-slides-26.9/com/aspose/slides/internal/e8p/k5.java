package com.aspose.slides.internal.e8p;

import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;

public class k5 extends u9 {
   private byte[] k5;
   private boolean u3 = false;
   private int a6 = 0;
   private boolean u9 = false;
   private int h0;

   public k5(com.aspose.slides.internal.c5e.x8 var1, BufferedImage var2) {
      super(var1, var2);
      this.k5 = com.aspose.slides.internal.v4y.n5.n5(var1.n5.t2);
      this.u3 = var1.l6().u3() != null;
      if (this.u3) {
         this.a6 = var1.l6().u3().k5();
      }

      this.h0 = var1.l6().a6().u3();
      this.u9 = this.h0 == 16;
   }

   @Deprecated
   @Override
   protected void n5(com.aspose.slides.internal.c5e.k5 var1, int[] var2) {
      for (int var3 = 0; var3 < var2.length; var3++) {
         int var4 = var1.l6[var3];
         int var5 = this.k5[var4] & 255;
         if (!this.u3 || var4 != this.a6) {
            var2[var3] = 0xFF000000 | var5 << 16 | var5 << 8 | var5;
         } else if (this.u9) {
            var2[var3] = var5 << 16 | var5 << 8 | var5;
         } else {
            var2[var3] = 0;
         }
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
         int var10 = var8 + var9 * 4;
         int var11 = var1.l6[var9];
         int var12 = this.k5[var11] & 255;
         if (!this.u3 || var11 != this.a6) {
            var4[var10] = -1;
            var4[var10 + 1] = (byte)var12;
            var4[var10 + 2] = (byte)var12;
            var4[var10 + 3] = (byte)var12;
         } else if (this.u9) {
            var4[var10] = 0;
            var4[var10 + 1] = (byte)var12;
            var4[var10 + 2] = (byte)var12;
            var4[var10 + 3] = (byte)var12;
         } else {
            var4[var10] = 0;
            var4[var10 + 1] = 0;
            var4[var10 + 2] = 0;
            var4[var10 + 3] = 0;
         }
      }
   }
}
