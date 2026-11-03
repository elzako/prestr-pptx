package com.aspose.slides.internal.j9;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p3.j5;
import com.aspose.slides.ms.System.a3;
import com.aspose.slides.ms.System.d1;

class n5$k5 {
   public int n5;
   public int l6;
   public int k5;
   public int u3;
   public int a6;
   public int u9;
   public List<j5> h0;
   public int c8;
   public int t2;

   public n5$k5(int var1) {
      this.k5 = var1;
      this.l6 = -1;
   }

   public n5$k5(n5$k5 var1) {
      this.n5(var1);
   }

   public final void n5(n5$k5 var1) {
      this.n5 = var1.n5;
      this.l6 = var1.l6;
      this.k5 = var1.k5;
      this.u3 = var1.u3;
      this.a6 = var1.a6;
      this.u9 = var1.u9;
      if (var1.h0 != null) {
         if (this.h0 == null) {
            this.h0 = new List<>();
         }

         this.h0.addRange(var1.h0);
      }

      this.t2 = var1.t2;
      this.c8 = var1.c8;
   }

   @Override
   public String toString() {
      return d1.n5("Step: start=", a3.l6(this.n5), " end=", a3.l6(this.l6), " length=", a3.l6(this.u3));
   }
}
