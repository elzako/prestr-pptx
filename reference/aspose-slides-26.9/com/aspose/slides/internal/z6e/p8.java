package com.aspose.slides.internal.z6e;

import java.awt.Rectangle;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public abstract class p8 extends com.aspose.slides.internal.n2z.k5 {
   Rectangle n5;
   int l6;
   float k5;
   float u3;
   com.aspose.slides.internal.c4t.e2[] a6;

   @Override
   public void n5(byte[] var1, int var2, int var3) throws com.aspose.slides.internal.p7x.l6, IOException {
      this.n5 = com.aspose.slides.internal.l1b.k5.u9(var1, var2);
      var2 += 16;
      this.l6 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
      var2 += 4;
      ByteBuffer var4 = ByteBuffer.wrap(var1, var2, 8).order(ByteOrder.LITTLE_ENDIAN);
      this.k5 = var4.getFloat();
      this.u3 = var4.getFloat();
      var2 += 8;
      int var5 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
      var2 += 4;
      this.a6 = new com.aspose.slides.internal.c4t.e2[var5];

      for (int var6 = 0; var6 < var5; var6++) {
         this.a6[var6] = new com.aspose.slides.internal.c4t.e2();
         var2 += this.a6[var6].n5(var1, var2, -8, this.l6());
      }
   }

   @Override
   protected void n5(com.aspose.slides.internal.o6t.l6 var1, com.aspose.slides.internal.m5l.k5 var2, int var3) throws com.aspose.slides.internal.p7x.l6 {
      var1.n5(var2, this.a6, this.l6, this.k5, this.u3);
   }

   protected abstract boolean l6();
}
