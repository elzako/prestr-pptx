package com.aspose.slides.internal.o9n;

import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.r1x.d2;
import com.aspose.slides.internal.r1x.s3;

public abstract class n5$n5$n5 extends n5$n5$h0 {
   private final int k5;
   private boolean u3;

   protected n5$n5$n5(com.aspose.slides.internal.r2q.u9 var1, com.aspose.slides.internal.r2q.u3 var2, d2 var3, y2 var4) {
      super(var1, var2, var3);
      this.k5 = var4.u3();
   }

   public final int[] n5(y2 var1) {
      int[] var2 = new int[var1.t2() * var1.l6()];
      this.u3 = this.k5 == var1.u3();
      this.l6.n5(var2, var1.n3());
      this.n5();
      return var2;
   }

   protected static s3 n5(com.aspose.slides.internal.r2q.u9 var0) {
      boolean var1 = true;
      s3 var2 = new s3();
      var2.n5 = true;

      while (true) {
         com.aspose.slides.internal.r2q.h0 var3 = var0.n5(11, false).n5();
         if (var3.n5 == 2) {
            var1 = false;
            var2.l6 = var3.l6;
            var2.n5 = false;
            break;
         }

         if (var3.n5 != 0) {
            var1 = false;
            break;
         }

         if (var0.l6(11) == 0) {
            break;
         }

         var0.n5(1);
      }

      if (var1) {
         while (true) {
            com.aspose.slides.internal.r2q.h0 var4 = var0.n5(8, false).n5();
            if (var4.n5 == 2) {
               var1 = false;
               var2.l6 = var4.l6;
               var2.n5 = false;
               break;
            }

            if (var4.n5 != 0) {
               var1 = false;
               break;
            }

            if (var0.l6(8) != 0) {
               break;
            }

            var0.n5(8);
         }

         if (var1) {
            while (var0.l6(1) == 0) {
               var0.n5(1);
            }

            var0.n5(1);
         }
      }

      return var2;
   }

   protected abstract void n5();

   protected final boolean l6() {
      boolean var1 = false;
      if (this.u3) {
         int var2 = this.n5.a6();
         if (var2 == this.l6.s7()) {
            int var3 = this.l6.s7();
            this.n5.u3(var3);
            var1 = true;
         }
      }

      return var1;
   }
}
