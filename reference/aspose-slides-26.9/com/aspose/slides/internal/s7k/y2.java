package com.aspose.slides.internal.s7k;

import com.aspose.slides.exceptions.NotSupportedException;

class y2 extends z1 {
   private int t2;

   @Override
   public void n5(m1 var1) {
      long var2 = var1.a6();
      this.h0 = com.aspose.slides.internal.v6g.k5.u3(var1.k5(), 10);
      this.n3();
      this.c8 = var1.k5();
      this.l6 = var1.n5();
      this.k5 = var1.n5();
      this.t2 = var1.l6();
      long[] var4 = var1.a6(5);
      if (com.aspose.slides.internal.v6g.k5.a6(var4[0], 10) != 0L) {
         var1.n5(var2 + com.aspose.slides.internal.v6g.k5.u9(var4[0], 10));
         n5(this.k5(), var1);
      }

      if (com.aspose.slides.internal.v6g.k5.a6(var4[1], 10) != 0L) {
         var1.n5(var2 + com.aspose.slides.internal.v6g.k5.u9(var4[1], 10));
         this.n5(var1.u3(12));
      }

      if (com.aspose.slides.internal.v6g.k5.a6(var4[2], 10) != 0L) {
         var1.n5(var2 + com.aspose.slides.internal.v6g.k5.u9(var4[2], 10));
         n5(this.l6(), var1);
      }

      if (com.aspose.slides.internal.v6g.k5.a6(var4[3], 10) != 0L) {
         var1.n5(var2 + com.aspose.slides.internal.v6g.k5.u9(var4[3], 10));
         u9 var5 = this.n5((byte)0, (byte)0);
         var5.n5(var1);
      }

      if (com.aspose.slides.internal.v6g.k5.a6(var4[4], 10) != 0L) {
         var1.n5(var2 + com.aspose.slides.internal.v6g.k5.u9(var4[4], 10));
         n5(this.n5(), var1);
      }
   }

   @Override
   protected void n3() {
      if (this.h0 != 1833058592) {
         throw new e2();
      }
   }

   private static void n5(s7[] var0, m1 var1) {
      for (byte var2 = 0; com.aspose.slides.internal.v6g.k5.u3(var2, 6) < var0.length; var2++) {
         long var3 = var1.a6();
         int var5 = com.aspose.slides.internal.v6g.k5.u3(var1.k5(), 10);
         var1.n5(var3);
         if (var5 != 1668641398 && var5 != 1885434465) {
            throw new NotSupportedException("Only CurveType and ParametricCurveType tags can be here");
         }

         var0[com.aspose.slides.internal.v6g.k5.u3(var2, 6)] = (s7)k7.n5(var5);
         var0[com.aspose.slides.internal.v6g.k5.u3(var2, 6)].n5(var1);
      }
   }
}
