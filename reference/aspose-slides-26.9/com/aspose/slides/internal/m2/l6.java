package com.aspose.slides.internal.m2;

import com.aspose.slides.internal.e1.a6;
import com.aspose.slides.internal.e1.c4;
import com.aspose.slides.internal.e1.r4;
import com.aspose.slides.internal.e1.y2;
import com.aspose.slides.internal.e1.y4;
import com.aspose.slides.internal.o9b.w1;
import com.aspose.slides.internal.x4g.s7;
import com.aspose.slides.ms.System.q1;

public class l6 extends y4 {
   private s7 n5;

   @Override
   public void l6(r4 var1) {
      this.n5 = new s7(var1.h0());
   }

   @Override
   public void n5(c4 var1) {
      this.n5.t9();
   }

   @Override
   public void l6(c4 var1) {
      if (var1.n5()) {
         this.n5.n3();
      }
   }

   @Override
   public void n5(y2 var1) {
      w1[] var2 = var1.n5().toArray(new w1[0]);
      if (var2 != null && var2.length > 1) {
         boolean var3 = true;
         w1 var4 = var2[0].u3();

         for (int var5 = 1; var5 < var2.length; var5++) {
            if (w1.l6(var4, var2[var5])) {
               var3 = false;
               break;
            }
         }

         if (var3) {
            var2[var2.length - 1] = new w1(var4.l6() + 0.5F, var4.k5());
         }
      }

      this.n5.l6(var2);
   }

   @Override
   public void n5(a6 var1) {
      if (q1.n5((double)(var1.n5().n5().l6()), (int)(2)) == q1.n5((double)(var1.n5().l6().l6()), (int)(2))
         && q1.n5((double)(var1.n5().n5().k5()), (int)(2)) == q1.n5((double)(var1.n5().l6().k5()), (int)(2))
         && q1.n5((double)(var1.n5().l6().l6()), (int)(2)) == q1.n5((double)(var1.n5().k5().l6()), (int)(2))
         && q1.n5((double)(var1.n5().l6().k5()), (int)(2)) == q1.n5((double)(var1.n5().k5().k5()), (int)(2))
         && q1.n5((double)(var1.n5().k5().l6()), (int)(2)) == q1.n5((double)(var1.n5().u3().l6()), (int)(2))
         && q1.n5((double)(var1.n5().k5().k5()), (int)(2)) == q1.n5((double)(var1.n5().u3().k5()), (int)(2))) {
         this.n5.n5(var1.n5().n5().u3(), var1.n5().u3().u3());
      } else {
         this.n5.n5(var1.n5().n5().u3(), var1.n5().l6().u3(), var1.n5().k5().u3(), var1.n5().u3().u3());
      }
   }

   public final s7 l6() {
      return this.n5;
   }

   protected final void n5(s7 var1) {
      this.n5 = var1;
   }
}
