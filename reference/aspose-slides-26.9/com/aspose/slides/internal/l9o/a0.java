package com.aspose.slides.internal.l9o;

public class a0 extends a5 {
   public a0(com.aspose.slides.internal.o9b.l6 var1, com.aspose.slides.internal.g3x.k5 var2, com.aspose.slides.internal.j9e.n5 var3) {
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
      int var10 = com.aspose.slides.internal.t5g.u3.n5(var3 << 8 | var2) & 255;
      int var11 = com.aspose.slides.internal.t5g.u3.n5(var5 << 8 | var4) & 255;
      int var12 = com.aspose.slides.internal.t5g.u3.n5(var7 << 8 | var6) & 255;
      int var13 = this.n5(var8, var9);
      return var13 << 24 | var12 << 16 | var11 << 8 | var10;
   }
}
