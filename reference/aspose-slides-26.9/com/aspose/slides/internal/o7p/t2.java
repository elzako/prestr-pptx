package com.aspose.slides.internal.o7p;

class t2 extends c8 implements l6 {
   public t2(com.aspose.slides.internal.f2i.n5 var1, int var2, int var3) {
      super(var1, var2, var3);
   }

   @Override
   public final byte[] n5(byte[] var1) {
      byte var2 = 3;
      int var3 = this.n5 * this.l6;
      int var4 = 0;
      int var5 = 3 * this.k5 * this.u3;
      byte[] var6 = new byte[var5];
      int var7 = var3 + 1;

      for (int var8 = 0; var8 < this.u9; var8++) {
         for (int var9 = 0; var9 < this.a6; var9++) {
            byte var10 = var1[var4 + var3];
            byte var11 = var1[var4 + var7];

            for (int var12 = 0; var12 < this.l6; var12++) {
               for (int var13 = 0; var13 < this.n5; var13++) {
                  int var14 = this.n5 * var9 + var13;
                  int var15 = this.l6 * var8 + var12;
                  int var16 = 3 * (var14 + this.k5 * var15);
                  var6[var16] = var1[var4++];
                  var6[var16 + 1] = var10;
                  var6[var16 + 2] = var11;
               }
            }

            var4 += 2;
         }
      }

      return var6;
   }

   @Override
   public final int n5() {
      return this.n5 * this.l6 + 2;
   }

   @Override
   public final long l6() {
      return this.a6 * this.u9 * this.n5();
   }
}
