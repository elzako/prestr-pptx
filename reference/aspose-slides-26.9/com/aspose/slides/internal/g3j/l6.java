package com.aspose.slides.internal.g3j;

import com.aspose.slides.exceptions.EndOfStreamException;
import com.aspose.slides.internal.r1x.v3;

public class l6 {
   private static final byte[] n5 = new byte[]{1, 3, 7, 15, 31, 63, 127, -1};
   private final v3 l6;
   private int k5;
   private int u3;

   public l6(v3 var1) {
      this.l6 = var1;
      this.u3 = -1;
   }

   public final int n5(byte[] var1, int var2, int var3) {
      this.n5();
      return this.l6.n5(var1, var2, var3);
   }

   public final int n5(int var1) {
      int var2 = 0;
      int var3 = 0;

      while (var1 > 0) {
         if (this.u3 < 0 || 8 <= this.u3) {
            this.k5 = this.l6.x8();
            this.u3 = 0;
            if (this.k5 == -1) {
               throw new EndOfStreamException();
            }
         }

         int var4 = this.u3 + var1 - 8;
         int var5;
         if (var4 > 0) {
            var5 = 8 - this.u3;
         } else {
            var5 = var1;
         }

         var2 |= (this.k5 & n5[var5 - 1] & 255) << var3;
         var3 += var5;
         this.u3 += var5;
         if (this.u3 < 8) {
            this.k5 >>= var5;
         }

         var1 -= var5;
      }

      return var2;
   }

   public final void n5() {
      this.u3 = -1;
   }
}
