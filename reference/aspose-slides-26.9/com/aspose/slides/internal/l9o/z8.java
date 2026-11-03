package com.aspose.slides.internal.l9o;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p4t.n5$n5;
import java.awt.image.DataBufferByte;

public class z8 extends k7 {
   public z8(com.aspose.slides.internal.o9b.l6 var1, com.aspose.slides.internal.g3x.k5 var2, com.aspose.slides.internal.j9e.n5 var3) {
      super(var1, var2, var3);
   }

   @Override
   protected void c8() {
      byte[] var1 = this.n3();
      DataBufferByte var2 = (DataBufferByte)this.u3();
      byte[] var3 = var2.getData();
      if (this.a6 == 0 && this.u9 == 0 && this.h0 == this.l6().getWidth() && this.c8 == this.l6().getHeight()) {
         this.n5(var1, var3, 0, 0, this.h0 * this.c8);
      } else {
         int var4 = this.l6().getWidth() * 4;
         int var5 = this.h0 * 4;
         int var6 = this.a6 * 4;
         int var7 = var6 + this.u9 * var4;
         int var8 = 0;

         for (int var9 = 0; var9 < this.c8; var9++) {
            this.n5(var1, var3, var8, var7, this.h0);
            var7 += var4;
            var8 += this.k5 + var5;
         }
      }
   }

   private void n5(byte[] var1, byte[] var2, int var3, int var4, int var5) {
      for (int var6 = 0; var6 < var5; var6++) {
         var2[var4] = var1[var3 + 3];
         var2[var4 + 1] = var1[var3];
         var2[var4 + 2] = var1[var3 + 1];
         var2[var4 + 3] = var1[var3 + 2];
         var3 += 4;
         var4 += 4;
      }
   }

   @Override
   protected n5$n5 t2() {
      throw new InvalidOperationException("This method must not be called!");
   }
}
