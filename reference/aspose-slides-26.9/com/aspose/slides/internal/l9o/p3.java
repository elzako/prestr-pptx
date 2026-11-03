package com.aspose.slides.internal.l9o;

public class p3 extends e5 {
   public p3(com.aspose.slides.internal.o9b.l6 var1, com.aspose.slides.internal.g3x.k5 var2) {
      super(var1, var2);
   }

   @Override
   protected int k5(int var1) {
      int var2 = var1 >> 16 & 0xFF;
      int var3 = var1 >> 8 & 0xFF;
      int var4 = var1 & 0xFF;
      int var5 = Math.round((var2 + var3 + var4) / 3.0F);
      return com.aspose.slides.internal.j9e.u3.l6[var5];
   }
}
