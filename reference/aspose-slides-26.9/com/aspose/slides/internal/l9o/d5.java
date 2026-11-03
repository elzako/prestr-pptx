package com.aspose.slides.internal.l9o;

import java.awt.image.DataBufferByte;

public class d5 extends f2 {
   public d5(com.aspose.slides.internal.o9b.l6 var1, com.aspose.slides.internal.g3x.k5 var2, com.aspose.slides.internal.j9e.n5 var3) {
      super(var1, var2, var3);
   }

   @Override
   protected void c8() {
      byte[] var1 = this.n3();
      DataBufferByte var2 = (DataBufferByte)this.u3();
      byte[] var3 = var2.getData();
      int var4 = this.l6().getWidth();
      int var5 = this.h0;
      int var6 = this.a6;
      int var7 = var6 + this.u9 * var4;
      int var8 = 0;

      for (int var9 = 0; var9 < this.c8; var9++) {
         System.arraycopy(var1, var8, var3, var7, var5);
         var7 += var4;
         var8 += this.k5 + var5;
      }
   }

   @Override
   protected int k5(int var1) {
      return com.aspose.slides.internal.j9e.u3.l6[var1 & 0xFF];
   }
}
