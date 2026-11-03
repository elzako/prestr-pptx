package com.aspose.slides.internal.a1;

import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.internal.m3.y6;

public class c8 extends h0 {
   private com.aspose.slides.internal.t9.u3 n5;

   public c8(com.aspose.slides.internal.w5.k5 var1, com.aspose.slides.internal.t9.u3 var2) {
      super(var1);
      this.n5 = var2;
   }

   public String n5() {
      int var1 = this.n5.e9().n5();
      if (var1 == 0) {
         return "none";
      }

      a5 var2 = new a5();
      if ((8 & var1) == 8) {
         var2.n5(com.aspose.slides.internal.u3.k5.n5(com.aspose.slides.internal.v6g.k5.n5(y6.class), 8));
      }

      if ((4 & var1) == 4) {
         if (var2.l6() != 0) {
            var2.n5(" ");
         }

         var2.n5(com.aspose.slides.internal.u3.k5.n5(com.aspose.slides.internal.v6g.k5.n5(y6.class), 4));
      }

      if ((2 & var1) == 2) {
         if (var2.l6() != 0) {
            var2.n5(" ");
         }

         var2.n5(com.aspose.slides.internal.u3.k5.n5(com.aspose.slides.internal.v6g.k5.n5(y6.class), 2));
      }

      if ((1 & var1) == 1) {
         if (var2.l6() != 0) {
            var2.n5(" ");
         }

         var2.n5(com.aspose.slides.internal.u3.k5.n5(com.aspose.slides.internal.v6g.k5.n5(y6.class), 1));
      }

      return var2.toString();
   }
}
