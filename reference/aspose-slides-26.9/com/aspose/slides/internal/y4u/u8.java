package com.aspose.slides.internal.y4u;

public abstract class u8 extends s7 {
   protected com.aspose.slides.internal.l3e.h0 z8 = new com.aspose.slides.internal.l3e.h0();
   protected static int[] j5;
   protected static int[] w1;
   protected static int[] r4;
   protected static int[] c4;

   @Override
   protected void n5() {
      com.aspose.slides.internal.l3e.c8.n5().n5(this.z8);
   }

   private static void l6() {
      c4 = new int[256];
      j5 = new int[256];
      r4 = new int[256];
      w1 = new int[256];
      int var0 = 0;

      for (int var1 = -128; var0 < 256; var1++) {
         c4[var0] = n5(1.402) * var1 + 32768 >> 16;
         j5[var0] = n5(1.772) * var1 + 32768 >> 16;
         r4[var0] = -n5(0.71414) * var1;
         w1[var0] = -n5(0.34414) * var1 + 32768;
         var0++;
      }
   }

   private static int n5(double var0) {
      return com.aspose.slides.internal.v6g.k5.u3(var0 * 65536.0 + 0.5, 14);
   }

   static {
      l6();
   }
}
