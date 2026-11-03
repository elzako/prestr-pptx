package com.aspose.slides.internal.e2l;

import com.aspose.slides.internal.y5s.j5;
import com.aspose.slides.internal.y5s.z3;

class k5$n5 implements com.aspose.slides.internal.j3b.h0 {
   private final byte[] n5;
   private final com.aspose.slides.internal.j3b.u9 l6;
   private final int[] k5;
   private j5 u3 = new j5();

   public k5$n5(byte[] var1, j5 var2, int[] var3, com.aspose.slides.internal.j3b.u9 var4) {
      this.k5 = var3;
      this.n5 = var1;
      var2.n5(this.u3);
      this.l6 = var4;
   }

   @Override
   public void n5(j5 var1) {
      j5 var2 = j5.n5(this.u3.n3(), var1.n3()).n3();
      if (!var2.x8()) {
         int[] var3 = new int[var2.a6() * var2.u9()];

         for (int var4 = var2.c8(); var4 < var2.s7(); var4++) {
            int var5 = (var4 - this.u3.c8()) * this.u3.a6();
            int var6 = (var4 - var2.c8()) * var2.a6();

            for (int var7 = 0; var7 < var2.a6(); var7++) {
               var3[var7 + var6] = this.k5[this.n5[var7 + var5] & 0xFF];
            }
         }

         this.l6.n5(var2.n3(), var3, var2.l6().u3(), new z3(var2.t2(), var2.s7()));
      }
   }
}
