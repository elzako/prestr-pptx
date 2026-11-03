package com.aspose.slides.internal.h0i;

import com.aspose.slides.internal.k2s.a6;
import com.aspose.slides.internal.k2s.h0;
import com.aspose.slides.internal.k2s.u9;
import com.aspose.slides.internal.o9b.a0;
import com.aspose.slides.internal.o9b.f2;
import com.aspose.slides.internal.w9s.u3;
import com.aspose.slides.ms.System.d1;

public class k5 extends u9 {
   private final u3 c8;
   private final a0 t2;

   public k5(u3 var1, a0 var2) {
      super(var1.u3(), var1.a6(), var1.u9(), var1.l6());
      this.c8 = var1;
      this.t2 = var2;
   }

   @Override
   protected com.aspose.slides.internal.k2s.k5 n5(a6 var1, com.aspose.slides.internal.k2s.l6 var2) {
      return new n5(this.c8, var2, var1, this.t2);
   }

   @Override
   protected h0 n5(a6 var1, com.aspose.slides.internal.p1s.l6 var2) {
      if (var1.s7) {
         var1.a6 /= 1.3F;
         var1.c8 = d1.t2(var1.c8);
         var2 = new com.aspose.slides.internal.p1s.l6(var1.a6, var2.l6(), var2.n5());
      }

      return new l6(this.c8, var2, this.c8.c8(), var1, this.t2);
   }

   @Override
   protected void n5(com.aspose.slides.internal.i1k.u9 var1, f2 var2) {
      this.c8.k5(var1, var2.a6(), this.t2);
   }
}
