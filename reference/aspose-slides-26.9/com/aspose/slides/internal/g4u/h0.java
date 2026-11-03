package com.aspose.slides.internal.g4u;

import com.aspose.slides.internal.c4t.t2;
import java.awt.Color;
import java.awt.Stroke;
import java.io.IOException;

public final class h0 extends com.aspose.slides.internal.n2z.k5 {
   int n5;
   int l6;
   int k5;
   Color u3;

   @Override
   public void n5(byte[] var1, int var2, int var3) throws com.aspose.slides.internal.p7x.l6, IOException {
      this.n5 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
      var2 += 4;
      this.l6 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
      var2 += 4;
      this.k5 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
      var2 += 8;
      this.u3 = com.aspose.slides.internal.l1b.k5.n3(var1, var2);
      var2 += 4;
   }

   @Override
   public int n5() {
      return 38;
   }

   @Override
   public void n5(com.aspose.slides.internal.o6t.l6 var1, com.aspose.slides.internal.m5l.k5 var2, int var3) throws com.aspose.slides.internal.p7x.l6 {
      Stroke var4 = t2.n5(this.l6, this.k5);
      t2 var5 = new t2(var4, this.u3);
      var1.n5(this.n5, var5);
   }
}
