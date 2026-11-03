package com.aspose.slides.internal.l9o;

import java.awt.image.DataBufferByte;
import java.awt.image.WritableRaster;

public class t4 extends f2 {
   private static final int s7 = com.aspose.slides.internal.o9b.c8.n5(255, 0, 0, 0).h0();
   private static final int x8 = com.aspose.slides.internal.o9b.c8.n5(255, 255, 255, 255).h0();

   public t4(com.aspose.slides.internal.o9b.l6 var1, com.aspose.slides.internal.g3x.k5 var2, com.aspose.slides.internal.j9e.n5 var3) {
      super(var1, var2, var3);
   }

   @Override
   protected void c8() {
      byte[] var1 = this.n3();
      if (this.a6 % 8 == 0) {
         this.k5(var1);
      } else {
         WritableRaster var2 = this.k5();
         com.aspose.slides.internal.p4t.u3 var3 = this.l6(var1);
         com.aspose.slides.internal.p4t.l6 var4 = new com.aspose.slides.internal.p4t.l6(this.a6, this.u9, this.h0, this.c8, var3);
         var4.n5(new q0(this, var2));
      }
   }

   private void k5(byte[] var1) {
      DataBufferByte var2 = (DataBufferByte)this.u3();
      byte[] var3 = var2.getData();
      int var4 = (int)Math.ceil(this.l6().getWidth() / 8.0F);
      int var5 = (int)Math.ceil(this.h0 / 8.0F);
      int var6 = this.h0 % 8;
      int var7 = this.a6 / 8;
      int var8 = var7 + this.u9 * var4;
      int var9 = 0;

      for (int var10 = 0; var10 < this.c8; var10++) {
         if (var6 == 0) {
            System.arraycopy(var1, var9, var3, var8, var5);
         } else {
            System.arraycopy(var1, var9, var3, var8, var5 - 1);
            int var11 = var8 + var5 - 1;
            int var12 = var9 + var5 - 1;
            byte var13 = var1[var12];
            var3[var11] = (byte)(var13 & 255 << 8 - var6 & 0xFF);
         }

         var8 += var4;
         var9 += this.k5 + var5;
      }
   }

   @Override
   protected com.aspose.slides.internal.p4t.u3 l6(byte[] var1) {
      return new com.aspose.slides.internal.p4t.a6(this.h0, this.k5, var1);
   }

   @Override
   protected int k5(int var1) {
      return var1 == 0 ? s7 : x8;
   }
}
