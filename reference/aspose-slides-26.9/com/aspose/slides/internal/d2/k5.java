package com.aspose.slides.internal.d2;

import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.internal.a0.m3;
import com.aspose.slides.ms.System.IDisposable;

public class k5 extends s7 {
   private m3 e2;

   @Override
   public void l6(com.aspose.slides.internal.a0.l6 var1) {
      super.l6(var1);
      this.t9(this.w1() + this.y4);
      List$Enumerator var2 = this.x8.iterator();

      try {
         while (var2.hasNext()) {
            c8 var3 = (c8)var2.next();
            var3.t9(var3.w1() - this.y4);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      this.k5(this.j5());
   }

   public final void n5(m3 var1) {
      this.e2 = var1;
   }

   public final m3 m1() {
      return this.e2;
   }
}
