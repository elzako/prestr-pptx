package com.aspose.slides.internal.l9o;

public class d2 extends a5 {
   public d2(com.aspose.slides.internal.o9b.l6 var1, com.aspose.slides.internal.g3x.k5 var2, com.aspose.slides.internal.j9e.n5 var3) {
      super(var1, var2, var3);
   }

   @Override
   protected int n5(com.aspose.slides.internal.p4t.u3 var1) {
      int var2 = var1.n5() & 255;
      int var3 = var1.n5() & 255;
      int var4 = var1.n5() & 255;
      int var5 = var1.n5() & 255;
      int var6 = var1.n5() & 255;
      int var7 = var1.n5() & 255;
      int var8 = var1.n5() & 255;
      int var9 = var1.n5() & 255;
      int var10 = this.n5(var8, var9);

      int var14;
      int var15;
      try {
         long var11 = var9 << 24 | var8 << 16 | var7 << 8 | var6;
         int var13 = com.aspose.slides.internal.t5g.u3.n5(var11);
         var14 = var13 >> 8 & 0xFF;
         var15 = var13 & 0xFF;
      } catch (IllegalStateException var21) {
         var14 = var10;
         var15 = com.aspose.slides.internal.t5g.u3.n5(var7 << 8 | var6) & 255;
         if (var10 != 0) {
            var15 = var15 * 255 / var10;
         }
      }

      int var17;
      try {
         long var22 = var9 << 24 | var8 << 16 | var5 << 8 | var4;
         int var24 = com.aspose.slides.internal.t5g.u3.n5(var22);
         var17 = var24 & 0xFF;
      } catch (IllegalStateException var20) {
         var14 = var10;
         var17 = com.aspose.slides.internal.t5g.u3.n5(var5 << 8 | var4) & 255;
         if (var10 != 0) {
            var17 = var17 * 255 / var10;
         }
      }

      int var18;
      try {
         long var23 = var9 << 24 | var8 << 16 | var3 << 8 | var2;
         int var25 = com.aspose.slides.internal.t5g.u3.n5(var23);
         var18 = var25 & 0xFF;
      } catch (IllegalStateException var19) {
         var14 = var10;
         var18 = com.aspose.slides.internal.t5g.u3.n5(var3 << 8 | var2) & 255;
         if (var10 != 0) {
            var18 = var18 * 255 / var10;
         }
      }

      return var14 << 24 | var15 << 16 | var17 << 8 | var18;
   }
}
