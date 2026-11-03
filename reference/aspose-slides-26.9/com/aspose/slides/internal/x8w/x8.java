package com.aspose.slides.internal.x8w;

import com.aspose.slides.internal.o8m.i1;

public class x8 {
   private i1 n5;
   private byte[] l6;
   private int k5;
   private int u3;

   public x8(i1 var1, int var2) {
      this.n5 = var1;
      this.k5 = var2;
      this.l6 = new byte[var2];
   }

   public void n5() {
      com.aspose.slides.ms.System.u3.n5(this.l6, 0, this.k5);
      this.u3 = 0;
   }

   public void n5(byte[] var1) {
      this.n5(var1, 0, var1.length);
   }

   public void n5(byte[] var1, int var2, int var3) {
      int var4 = Math.min(this.k5 - this.u3, var3);
      com.aspose.slides.ms.System.y4.n5(var1, var2, this.l6, this.u3, var4);
      this.u3 += var4;
      if (this.u3 == this.k5) {
         this.n5.n5(this.l6, 0, this.k5, this.l6, 0);
         int var5 = (var3 - var4) / this.k5;

         for (int var6 = 0; var6 < var5; var6++) {
            this.n5.n5(var1, var4 + var2, this.k5, this.l6, 0);
            var4 += this.k5;
         }

         this.u3 = var3 - var4;
         if (this.u3 > 0) {
            com.aspose.slides.ms.System.y4.n5(var1, var4 + var2, this.l6, 0, this.u3);
         }
      }
   }

   public byte[] l6() {
      return this.n5.n5(this.l6, 0, this.u3);
   }
}
