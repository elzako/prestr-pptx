package com.aspose.slides.internal.o9n;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.r1x.d2;
import com.aspose.slides.ms.System.a3;
import com.aspose.slides.ms.System.d1;

public abstract class n5$n5$h0 {
   protected final com.aspose.slides.internal.r2q.u9 n5;
   protected com.aspose.slides.internal.r2q.u3 l6;
   private int k5;
   private int u3;

   protected n5$n5$h0(com.aspose.slides.internal.r2q.u9 var1, com.aspose.slides.internal.r2q.u3 var2, d2 var3) {
      this.n5 = var1;
      this.l6 = var2;
      if (var3 != null) {
         this.k5 = var3.n5();
         this.u3 = var3.l6().h0();
      }
   }

   public void n5(com.aspose.slides.internal.r2q.u3 var1) {
      this.l6 = var1;
   }

   public final void n5(int var1) {
      this.n5.a6(var1);
   }

   protected final void n5(String var1) {
      this.n5(this.k5, var1);
   }

   protected final void n5(int var1, String var2) {
      switch (var1) {
         case 0:
            throw new com.aspose.slides.internal.h6t.u3(d1.n5("Cannot decode strip ", a3.l6(this.n5.u3()), ". Details: ", var2));
         case 1:
            int var3 = this.n5.k5(this.l6.s7());
            this.l6.n5(var3, this.u3);
            break;
         case 2:
            this.l6.n5(this.l6.s7() + 1, this.u3);
            break;
         default:
            throw new ArgumentException("recoveryMode");
      }
   }
}
