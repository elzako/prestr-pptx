package com.aspose.slides.internal.o9n;

import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.r1x.d2;

public class n5$n5$a6 extends n5$n5$n5 {
   private final n5$n5$l6 k5;
   private final int u3;

   @Override
   public void n5(com.aspose.slides.internal.r2q.u3 var1) {
      super.n5(var1);
      this.k5.n5(var1);
      this.k5.n5(new int[]{this.u3, 0});
   }

   public n5$n5$a6(int var1, com.aspose.slides.internal.r2q.u9 var2, com.aspose.slides.internal.r2q.u3 var3, d2 var4, y2 var5) {
      super(var2, var3, var4, var5.n3());
      this.k5 = new n5$n5$l6(var3, var1, var2, var4);
      this.k5.n5(new int[]{var1, 0});
      this.u3 = var1;
   }

   @Override
   protected void n5() {
      while (this.l6.t2()) {
         if (this.l6.c8()) {
            int[] var1 = this.l6.u3();
            this.l6.x8();
            if (this.l6()) {
               var1 = new int[]{this.u3, 0};
            }

            this.k5.n5(var1);
         }

         this.k5.n5();
      }
   }
}
