package com.aspose.slides.internal.l9o;

import java.awt.image.DataBufferByte;
import java.awt.image.WritableRaster;

public class y2 extends f2 {
   public y2(com.aspose.slides.internal.o9b.l6 var1, com.aspose.slides.internal.g3x.k5 var2, com.aspose.slides.internal.j9e.n5 var3) {
      super(var1, var2, var3);
   }

   @Override
   protected void c8() {
      byte[] var1 = this.n3();
      if (this.a6 % 2 == 0) {
         this.k5(var1);
      } else {
         WritableRaster var2 = this.k5();
         com.aspose.slides.internal.p4t.u3 var3 = this.l6(var1);
         com.aspose.slides.internal.p4t.l6 var4 = new com.aspose.slides.internal.p4t.l6(this.a6, this.u9, this.h0, this.c8, var3);
         var4.n5(new y1(this, var2));
      }
   }

   private void k5(byte[] var1) {
      DataBufferByte var2 = (DataBufferByte)this.u3();
      byte[] var3 = var2.getData();
      int var4 = (int)Math.ceil(this.l6().getWidth() / 2.0F);
      int var5 = (int)Math.ceil(this.h0 / 2.0F);
      boolean var6 = this.h0 % 2 != 0;
      boolean var7 = this.a6 + this.h0 >= this.l6().getWidth();
      int var8 = this.a6 / 2;
      int var9 = var8 + this.u9 * var4;
      int var10 = 0;

      for (int var11 = 0; var11 < this.c8; var11++) {
         if (var6 && !var7) {
            System.arraycopy(var1, var10, var3, var9, var5 - 1);
            int var12 = var9 + var5 - 1;
            int var13 = var10 + var5 - 1;
            byte var14 = var1[var13];
            var3[var12] |= (byte)(var14 & 240);
         } else {
            System.arraycopy(var1, var10, var3, var9, var5);
         }

         var9 += var4;
         var10 += this.k5 + var5;
      }
   }

   @Override
   protected com.aspose.slides.internal.p4t.u3 l6(byte[] var1) {
      return new com.aspose.slides.internal.p4t.u9(this.h0, this.k5, var1);
   }

   @Override
   protected int k5(int var1) {
      return com.aspose.slides.internal.j9e.u3.n5[var1];
   }
}
