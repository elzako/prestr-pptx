package com.aspose.slides.internal.v9l;

import com.aspose.slides.internal.o9b.w1;
import com.aspose.slides.internal.t9z.h0;
import com.aspose.slides.internal.v1y.c8;
import com.aspose.slides.internal.x4g.s7;

public class n5 {
   private h0 n5;
   private boolean l6;

   public n5(h0 var1, boolean var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   public a6 n5(s7 var1) {
      return var1.t4() ? this.k5(var1) : this.l6(var1);
   }

   private a6 l6(s7 var1) {
      c8 var2 = new c8();
      return var2.n5(this.n5, this.u3(var1));
   }

   private a6 k5(s7 var1) {
      k5 var2 = null;
      if (this.n5.n5().x8() == 0) {
         var2 = this.u3(var1);
      } else {
         n5$n5 var3 = new n5$n5();
         var2 = var3.n5(var1);
      }

      a6 var5 = new a6();
      var5.n5(var2);
      var5.l6((w1)null);
      var5.u3(null);
      return var5;
   }

   private k5 u3(s7 var1) {
      return u3.n5(var1);
   }
}
