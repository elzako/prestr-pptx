package com.aspose.slides.internal.g4u;

import java.io.IOException;

public abstract class n5 extends com.aspose.slides.internal.n2z.k5 {
   int n5;
   int l6;
   com.aspose.slides.internal.c4t.n5 k5;

   @Override
   public void n5(byte[] var1, int var2, int var3) throws com.aspose.slides.internal.p7x.l6, IOException {
      int var4 = var2 - 8;
      this.n5 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
      var2 += 4;
      this.l6 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
      var2 += 4;
      int var5 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
      var2 += 4;
      int var6 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
      var2 += 4;
      int var7 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
      var2 += 4;
      int var8 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
      var2 += 4;
      this.k5 = new com.aspose.slides.internal.c4t.n5();
      this.k5.n5(var1, var4 + var5, var6, var4 + var7, var8);
   }

   @Override
   public void n5(com.aspose.slides.internal.o6t.l6 var1, com.aspose.slides.internal.m5l.k5 var2, int var3) throws com.aspose.slides.internal.p7x.l6 {
      com.aspose.slides.internal.c4t.k5 var4 = new com.aspose.slides.internal.c4t.k5(this.k5.n5());
      var1.n5(this.n5, var4);
   }
}
