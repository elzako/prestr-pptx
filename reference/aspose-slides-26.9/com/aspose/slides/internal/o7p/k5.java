package com.aspose.slides.internal.o7p;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.d1;

class k5 extends c8 implements n5 {
   public k5(com.aspose.slides.internal.f2i.n5 var1, int var2, int var3) {
      super(var1, var2, var3);
   }

   @Override
   public final byte[] n5(byte[] var1) {
      byte var2 = 3;
      int var3 = this.k5 * this.u3 * 3;
      if (var1 == null) {
         throw new ArgumentNullException("data");
      }

      if (var1.length < var3) {
         throw new com.aspose.slides.internal.h6t.u3(d1.n5("Invalid data buffer lenght {0}. Must be at least {1}",new Object[]{ var1.length, var3}));
      }

      int var4 = 0;
      int var5 = this.n5() * this.a6 * this.u9;
      byte[] var6 = new byte[var5];

      for (int var7 = 0; var7 < this.u9; var7++) {
         for (int var8 = 0; var8 < this.a6; var8++) {
            int var9 = 0;
            int var10 = 0;
            int var11 = 0;

            for (int var12 = 0; var12 < this.l6; var12++) {
               int var13 = this.l6 * var7 + var12;
               if (var13 >= this.u3) {
                  break;
               }

               for (int var14 = 0; var14 < this.n5; var14++) {
                  int var15 = this.n5 * var8 + var14;
                  if (var15 >= this.k5) {
                     break;
                  }

                  int var16 = 3 * (var15 + this.k5 * var13);
                  var6[var4++] = var1[var16];
                  var9 += var1[var16 + 1] & 255;
                  var10 += var1[var16 + 2] & 255;
                  var11++;
               }
            }

            byte var18 = (byte)(var9 / var11);
            byte var19 = (byte)(var10 / var11);
            var6[var4++] = var18;
            var6[var4++] = var19;
         }
      }

      return var6;
   }

   public final int n5() {
      return this.n5 * this.l6 + 2;
   }
}
