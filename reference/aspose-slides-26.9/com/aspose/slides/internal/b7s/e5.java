package com.aspose.slides.internal.b7s;

public class e5 implements com.aspose.slides.internal.b8u.t9 {
   private final y0 n5;
   private final d5 l6;

   public e5(y0 var1, d5 var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   public static void n5(byte[][] var0, int[] var1, y0 var2, d5 var3) {
      z7 var4 = new z7(var2);
      var4.n5(t1.n5(var3.n5(), var3.l6(), var3.k5(), var3.a6(), var3.s7(), var3.x8()));
      if (var3.h0() == 0) {
         for (int var5 = 0; var5 < var3.a6(); var5++) {
            var4.n5(var5, var0[var5], var1[var5], var3);
         }
      } else {
         var4.n5(var0, var1, var3);
      }

      var4.n5();
   }

   @Override
   public final void n5(com.aspose.slides.internal.o9b.y2 var1, byte[] var2, com.aspose.slides.internal.o9b.j5 var3, com.aspose.slides.internal.o9b.j5 var4) {
      byte[][] var5 = i1.n5(var2, 0, this.l6, var1.n3());
      int[] var6 = new int[this.l6.a6()];
      n5(var5, var6, this.n5, this.l6);
   }
}
