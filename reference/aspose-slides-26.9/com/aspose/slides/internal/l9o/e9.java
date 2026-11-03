package com.aspose.slides.internal.l9o;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p4t.n5$n5;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;

public class e9 extends s3 {
   public e9(com.aspose.slides.internal.o9b.l6 var1, com.aspose.slides.internal.g3x.k5 var2) {
      super(var1, var2);
   }

   @Override
   protected void k5(byte[] var1) {
      DataBufferByte var2 = (DataBufferByte)this.u3();
      byte[] var3 = var2.getData();
      BufferedImage var4 = this.l6();
      if (this.a6 == 0 && this.u9 == 0 && this.h0 == var4.getWidth() && this.c8 == var4.getHeight() && this.k5 == 0) {
         System.arraycopy(var3, 0, var1, 0, var3.length);
      } else {
         int var5 = var4.getWidth() * 3;
         int var6 = this.h0 * 3;
         int var7 = this.a6 * 3;
         int var8 = var7 + this.u9 * var5;
         int var9 = 0;

         for (int var10 = 0; var10 < this.c8; var10++) {
            System.arraycopy(var3, var8, var1, var9, var6);
            var8 += var5;
            var9 += this.k5 + var6;
         }
      }
   }

   @Override
   protected n5$n5 t2() {
      throw new InvalidOperationException("This method must not be called!");
   }

   @Override
   protected void n5(int var1, com.aspose.slides.internal.p4t.u3 var2) {
      byte var3 = (byte)(var1 >> 16 & 0xFF);
      byte var4 = (byte)(var1 >> 8 & 0xFF);
      byte var5 = (byte)(var1 & 0xFF);
      var2.n5(var5);
      var2.n5(var4);
      var2.n5(var3);
   }

   @Override
   protected int k5(int var1) {
      return var1;
   }
}
