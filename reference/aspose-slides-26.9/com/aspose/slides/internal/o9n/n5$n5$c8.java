package com.aspose.slides.internal.o9n;

import com.aspose.slides.internal.o9b.j5;
import com.aspose.slides.internal.o9b.y2;

public class n5$n5$c8 implements com.aspose.slides.internal.b8u.e2 {
   private final com.aspose.slides.internal.b8u.x8 n5;
   private final int[] l6;
   private final y2 k5 = new y2();

   public n5$n5$c8(int[] var1, com.aspose.slides.internal.b8u.x8 var2, y2 var3) {
      this.n5 = var2;
      this.l6 = var1;
      var3.u3(this.k5);
   }

   @Override
   public final void n5(y2 var1) {
      if (y2.k5(var1, this.k5)) {
         this.n5.n5(var1.n3(), this.l6, var1.a6().k5(), new j5(var1.u9(), var1.n5()));
      } else {
         int var2 = var1.t2();
         int var3 = var1.l6();
         int var4 = var2 * var3;
         int[] var5 = new int[var4];
         int var6 = var1.c8() - this.k5.c8();
         int var7 = this.k5.t2();
         if (var1.u3() == this.k5.u3() && var1.u9() == this.k5.u9()) {
            int var12 = var6 * var7;
            com.aspose.slides.ms.System.u3.n5(this.l6, var12, var5, 0, var4);
         } else {
            int var8 = var1.u3() - this.k5.u3();
            int var9 = var1.l6();

            for (int var10 = 0; var10 < var9; var10++) {
               int var11 = var6++ * var7 + var8;
               com.aspose.slides.ms.System.u3.n5(this.l6, var11, var5, var10 * var2, var2);
            }
         }

         this.n5.n5(var1.n3(), var5, var1.a6().k5(), new j5(var1.u9(), var1.n5()));
      }
   }
}
