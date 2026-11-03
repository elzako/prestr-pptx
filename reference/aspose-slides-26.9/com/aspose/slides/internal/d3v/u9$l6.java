package com.aspose.slides.internal.d3v;

class u9$l6 {
   private final com.aspose.slides.internal.b8u.n5 n5;
   private final int l6;
   private final int k5;
   private byte[] u3;
   private int a6;

   public u9$l6(com.aspose.slides.internal.b8u.n5 var1, int var2, int var3, int var4) {
      this.n5 = var1;
      int var5 = (var3 * var4 + 7) / 8;
      int var6 = var5 + (var5 + 127) / 128;
      this.k5 = var6 * var2;
      this.l6 = var5;
   }

   public final void n5() {
      this.u3 = new byte[this.k5];
      this.a6 = 0;
   }

   public final void n5(int var1) {
      this.n5.n5(this.u3, this.a6);
      this.n5.n5(var1);
   }

   public final void n5(byte[] var1, int var2) {
      int var3 = var2;
      int var4 = 0;

      do {
         this.a6 = n5(var1, var4, this.l6, this.u3, this.a6);
         var4 += this.l6;
         var3 -= this.l6;
      } while (var3 >= this.l6);

      if (var3 != 0) {
         throw new com.aspose.slides.internal.h6t.u3("The strip has corrupt data and cannot be decoded.");
      }
   }

   private static int n5(byte[] var0, int var1, int var2, byte[] var3, int var4) {
      int var5 = var1 + var2 - 1;
      int var6 = var5 - 1;

      while (var1 <= var5) {
         int var7 = 1;
         byte var8 = var0[var1];

         while (var7 < 127 && var1 < var5 && var0[var1] == var0[var1 + 1]) {
            var7++;
            var1++;
         }

         if (var7 > 1) {
            var1++;
            var3[var4++] = (byte)(-(var7 - 1) & 0xFF);
            var3[var4++] = var8;
         }

         var7 = 0;
         int var9 = var4;

         while (var7 < 128 && (var1 < var5 && (var0[var1] & 255) != (var0[var1 + 1] & 255) || var1 < var6 && (var0[var1] & 255) != (var0[var1 + 2] & 255))) {
            var7++;
            var3[++var4] = var0[var1++];
         }

         if (var7 > 0) {
            var3[var9] = (byte)(var7 - 1 & 0xFF);
            var4++;
         }

         if (var1 == var5) {
            if (var7 > 0 && var7 < 128) {
               var3[var9]++;
               var3[var4++] = var0[var1++];
            } else {
               var3[var4++] = 0;
               var3[var4++] = var0[var1++];
            }
         }
      }

      return var4;
   }
}
