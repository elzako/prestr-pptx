package com.aspose.slides.internal.o7p;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.d1;

class u3 extends c8 implements n5 {
   public u3(com.aspose.slides.internal.f2i.n5 var1, int var2, int var3) {
      super(var1, var2, var3);
   }

   @Override
   public final byte[] n5(byte[] var1) {
      int var2 = 3 + this.h0;
      int var3 = this.k5 * this.u3 * var2;
      int var4 = this.n5 * this.l6;
      if (var1 == null) {
         throw new ArgumentNullException("data");
      }

      if (var1.length < var3) {
         throw new com.aspose.slides.internal.h6t.u3(d1.n5("Invalid data buffer lenght {0}. Must be at least {1}",new Object[]{ var1.length, var3}));
      }

      int var5 = 0;
      int var6 = this.n5() * this.a6 * this.u9;
      byte[] var7 = new byte[var6];

      for (int var8 = 0; var8 < this.u9; var8++) {
         for (int var9 = 0; var9 < this.a6; var9++) {
            short var10 = 0;
            short var11 = 0;
            short var12 = 0;

            for (int var13 = 0; var13 < this.l6; var13++) {
               for (int var14 = 0; var14 < this.n5; var14++) {
                  int var15 = this.n5 * var9 + var14;
                  int var16 = this.l6 * var8 + var13;
                  if (var16 < this.u3 && var15 < this.k5) {
                     var12++;
                     int var17 = var2 * (var15 + this.k5 * var16);
                     var10 = (short)(var10 + (var1[var17 + 1] & 255));
                     var11 = (short)(var11 + (var1[var17 + 2] & 255));
                  }
               }
            }

            byte var23 = (byte)(var10 / var12);
            byte var24 = (byte)(var11 / var12);

            for (int var25 = 0; var25 < this.l6; var25++) {
               for (int var26 = 0; var26 < this.n5; var26++) {
                  int var27 = this.n5 * var9 + var26;
                  int var18 = this.l6 * var8 + var25;
                  int var19 = var2 * (var27 + this.k5 * var18);
                  var7[var5] = var1[var19];

                  for (int var20 = 0; var20 < this.h0; var20++) {
                     var7[var5 + (var20 + 1) * var4 + 2] = var1[var19 + 3 + var20];
                  }

                  var5++;
               }
            }

            var7[var5++] = var23;
            var7[var5++] = var24;
            var5 += this.h0 * var4;
         }
      }

      return var7;
   }

   public final int n5() {
      return this.n5 * this.l6 * (1 + this.h0) + 2;
   }
}
