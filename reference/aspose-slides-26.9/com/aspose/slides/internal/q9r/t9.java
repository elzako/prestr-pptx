package com.aspose.slides.internal.q9r;

public class t9 {
   private final com.aspose.slides.internal.z5z.n5 n5;

   public t9(com.aspose.slides.internal.z5z.n5 var1) {
      this.n5 = var1;
   }

   public final short n5() {
      return (short)(this.n5.u9() & 0xFF);
   }

   public final int l6() {
      return this.n5.a6();
   }

   public final short k5() {
      return (short)(this.n5.u9() & 0xFF);
   }

   public final int[] n5(short var1, int var2) {
      int[] var3 = new int[var2];
      byte[] var4 = this.n5.n5(var1 * var2);

      for (int var5 = 0; var5 < var2; var5++) {
         for (int var6 = 0; var6 < var1; var6++) {
            var3[var5] |= var4[var5 * var1 + var6] & 255;
            if (var1 - var6 - 1 > 0) {
               var3[var5] <<= 8;
            }
         }
      }

      return var3;
   }

   public final com.aspose.slides.internal.z5z.n5 u3() {
      return this.n5;
   }

   public final e2 a6() {
      return new e2(this);
   }
}
