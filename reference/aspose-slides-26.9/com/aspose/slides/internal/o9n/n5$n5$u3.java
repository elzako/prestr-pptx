package com.aspose.slides.internal.o9n;

import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.r1x.d2;
import com.aspose.slides.internal.r1x.s3;

public class n5$n5$u3 extends n5$n5$t2 {
   private final n5$n5$l6 k5;
   private boolean u3;
   private int[] a6;

   public n5$n5$u3(int var1, com.aspose.slides.internal.r2q.u9 var2, com.aspose.slides.internal.r2q.u3 var3, d2 var4, y2 var5) {
      super(var1, var2, var3, var4, var5.n3());
      this.k5 = new n5$n5$l6(var3, var1, var2, var4);
   }

   @Override
   public void n5(com.aspose.slides.internal.r2q.u3 var1) {
      super.n5(var1);
      this.k5.n5(var1);
   }

   @Override
   protected final void n5() {
      while (this.l6.t2()) {
         if (this.l6.c8()) {
            this.a6 = this.l6.u3();
            this.l6.x8();
            if (this.l6()) {
               this.a6 = null;
            }
         }

         if (this.l6.h0()) {
            s3 var1 = n5(this.n5).n5();
            if (!var1.n5) {
               this.n5(var1.l6);
               continue;
            }

            com.aspose.slides.internal.r2q.h0 var2 = this.n5.n5(1, true).n5();
            if (var2.n5 != 0) {
               this.n5(var2.l6);
               continue;
            }

            this.u3 = var2.k5 != 0;
            this.n5.n5(1);
            if (!this.u3) {
               this.k5.n5(this.a6);
            }
         }

         if (this.u3) {
            this.k5();
         } else {
            this.k5.n5();
         }
      }
   }
}
