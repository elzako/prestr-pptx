package com.aspose.slides.internal.e2l;

import com.aspose.slides.internal.y5s.j5;
import com.aspose.slides.internal.y5s.t4;
import com.aspose.slides.internal.y5s.z3;

class k5$l6 implements com.aspose.slides.internal.j3b.c8 {
   private final com.aspose.slides.internal.j3b.u9 n5;
   private final k5 l6;
   private final j5 k5 = new j5();

   public k5$l6(j5 var1, k5 var2, com.aspose.slides.internal.j3b.u9 var3) {
      var1.n5(this.k5);
      this.l6 = var2;
      this.n5 = var3;
   }

   @Override
   public void n5(j5 var1, byte[] var2, z3 var3, z3 var4) {
      int[] var5 = com.aspose.slides.internal.e2l.k5.n5(this.l6).l6();
      if (com.aspose.slides.internal.e2l.k5.l6(this.l6) != null) {
         com.aspose.slides.internal.v2x.u3 var6 = com.aspose.slides.internal.e2l.k5.l6(this.l6).j5();
         if (var6 != null && var6.k5()) {
            int var7 = var6.l6() & 255;
            if (var7 >= 0 && var7 < var5.length) {
               var5[var7] &= 16777215;
            }
         }
      }

      k5$n5 var8 = new k5$n5(var2, var1.n3(), var5, this.n5);
      t4.n5(this.k5.n3(), var8);
   }
}
