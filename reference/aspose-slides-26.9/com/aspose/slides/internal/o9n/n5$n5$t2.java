package com.aspose.slides.internal.o9n;

import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.r1x.d2;

public abstract class n5$n5$t2 extends n5$n5$n5 {
   private final int k5;
   private int u3;
   private int a6;

   protected n5$n5$t2(int var1, com.aspose.slides.internal.r2q.u9 var2, com.aspose.slides.internal.r2q.u3 var3, d2 var4, y2 var5) {
      super(var2, var3, var4, var5.n3());
      this.k5 = var1;
   }

   protected final void k5() {
      if (this.l6.h0()) {
         this.a6 = 0;
      }

      boolean var1 = true;
      boolean var2 = true;
      int var3 = this.l6.k5();

      while (this.a6 < this.k5 && var1) {
         byte var4 = 13;
         int[] var5 = com.aspose.slides.internal.e0w.n5.u3();
         if (var3 == 0) {
            var5 = com.aspose.slides.internal.e0w.n5.a6();
            var4 = 12;
         }

         com.aspose.slides.internal.r2q.h0 var6 = this.n5.n5(var4, true).n5();
         if (var6.n5 == 2) {
            this.n5(var6.l6);
            this.a6 = this.k5;
            var2 = false;
            break;
         }

         com.aspose.slides.internal.r2q.n5 var8;
         if (var6.n5 == 0) {
            int var7 = var6.k5;
            var8 = com.aspose.slides.internal.r2q.n5.n5(var5, var7);
         } else {
            var8 = com.aspose.slides.internal.r2q.n5.n5();
         }

         this.n5.n5(var8.k5() & 255);
         switch (var8.l6()) {
            case 7:
            case 8:
               int var9 = this.u3 + var8.u3();
               this.a6 += var9;
               this.u3 = 0;
               this.l6.n5(var9);
               this.l6.u9();
               var3 = this.l6.k5();
               break;
            case 9:
            case 10:
            case 11:
               this.u3 = this.u3 + var8.u3();
               break;
            case 12:
               var1 = false;
         }
      }

      if (var2) {
         int var10 = this.k5 - this.a6;
         if (var10 > 0) {
            this.l6.n5(var10);
         }
      }
   }
}
