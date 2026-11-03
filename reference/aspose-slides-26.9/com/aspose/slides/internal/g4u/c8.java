package com.aspose.slides.internal.g4u;

import com.aspose.slides.internal.c4t.t2;
import java.io.IOException;

public final class c8 extends com.aspose.slides.internal.n2z.k5 {
   int n5;
   int l6;
   int k5;
   com.aspose.slides.internal.d2n.n5 u3;
   int[] a6;
   com.aspose.slides.internal.c4t.n5 u9;

   @Override
   public void n5(byte[] var1, int var2, int var3) throws com.aspose.slides.internal.p7x.l6, IOException {
      int var4 = var2 - 8;
      this.n5 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
      var2 += 4;
      int var5 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
      var2 += 4;
      int var6 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
      var2 += 4;
      int var7 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
      var2 += 4;
      int var8 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
      var2 += 4;
      this.l6 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
      var2 += 4;
      this.k5 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
      var2 += 4;
      this.u3 = new com.aspose.slides.internal.d2n.n5();
      var2 += this.u3.l6(var1, var2);
      int var9 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
      var2 += 4;
      this.a6 = new int[var9];

      for (int var10 = 0; var10 < var9; var2 += 4) {
         this.a6[var10] = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
         var10++;
      }

      if (var5 > 0) {
         this.u9 = new com.aspose.slides.internal.c4t.n5();
         var2 = var4 + var5;
         this.u9.n5(var1, var2, var6, var4 + var7, var8);
      }
   }

   @Override
   public int n5() {
      return 95;
   }

   @Override
   protected void n5(com.aspose.slides.internal.o6t.l6 var1, com.aspose.slides.internal.m5l.k5 var2, int var3) throws com.aspose.slides.internal.p7x.l6 {
      t2 var4 = new t2(this.l6, this.k5, this.u3, this.a6, this.u9);
      var1.n5(this.n5, var4);
   }
}
