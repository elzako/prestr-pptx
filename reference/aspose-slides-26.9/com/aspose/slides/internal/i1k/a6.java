package com.aspose.slides.internal.i1k;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.b5j.c8;
import com.aspose.slides.internal.b5j.n3;
import com.aspose.slides.internal.b5j.s7;
import com.aspose.slides.internal.b5j.t2;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.internal.o9b.f2;
import com.aspose.slides.internal.o9b.y1;

public class a6 extends com.aspose.slides.internal.d0e.a6 implements com.aspose.slides.internal.d0e.n5, com.aspose.slides.internal.z9u.n5 {
   public a6() {
      this.u9 = "polyline";
   }

   public final String a0() {
      return this.l6.k5("points");
   }

   public final void s7(String var1) {
      this.l6.l6("points", var1);
   }

   @Override
   public final List<c8> l6(n3 var1, f2 var2) {
      List var3 = s7.n5(this.a0());
      if (var3.size() == 0) {
         return new List<>();
      }

      a5 var4 = new a5();
      var4.n5(
         com.aspose.slides.internal.x7n.l6.k5(),
         "M {0} {1}",
         com.aspose.slides.internal.b3z.c8.n5((Float)var3.get_Item(0)),
         com.aspose.slides.internal.b3z.c8.n5((Float)var3.get_Item(1))
      );

      for (int var5 = 3; var5 < var3.size(); var5 += 2) {
         var4.n5(
            com.aspose.slides.internal.x7n.l6.k5(),
            " L {0} {1}",
            com.aspose.slides.internal.b3z.c8.n5((Float)var3.get_Item(var5 - 1)),
            com.aspose.slides.internal.b3z.c8.n5((Float)var3.get_Item(var5))
         );
      }

      return t2.n5(var4.toString(), var1);
   }

   @Override
   public final y1 n5(n3 var1, f2 var2) {
      com.aspose.slides.internal.x4g.s7 var3 = com.aspose.slides.internal.w9s.n5.n5(this.l6(var1, var2.a6()));
      return var3.s7();
   }
}
