package com.aspose.slides.internal.b7s;

import com.aspose.slides.exceptions.Exception;

public class v0 {
   private final y0 n5;
   private int l6;
   private int k5;

   public v0(y0 var1) {
      this.n5 = var1;
      this.k5 = 0;
      this.l6 = 0;
   }

   public final y0 n5() {
      return this.n5;
   }

   public final void n5(int var1, int var2) {
      if (var2 == 0) {
         throw new Exception("Attempt to write 0 bits");
      }

      int var3 = var1;
      int var4 = this.k5;
      var3 &= (1 << var2) - 1;
      var4 += var2;
      var3 <<= 24 - var4;
      var3 |= this.l6;

      while (var4 >= 8) {
         int var5 = var3 >> 16 & 0xFF;
         this.n5((byte)var5);
         if (var5 == 255) {
            this.n5((byte)0);
         }

         var3 <<= 8;
         var4 -= 8;
      }

      this.l6 = var3;
      this.k5 = var4;
   }

   public final void n5(byte var1) {
      this.n5.n5(var1);
   }

   public final void l6() {
      this.n5(127, 7);
      this.l6 = 0;
      this.k5 = 0;
   }
}
