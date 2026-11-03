package com.aspose.slides.internal.d2;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.o9b.p8;
import com.aspose.slides.ms.System.d1;

public class t2 extends c8 {
   protected com.aspose.slides.internal.a0.t2 x8 = null;

   @Override
   public void n5(com.aspose.slides.internal.a0.l6 var1) {
      if (this.x8 != null) {
         throw new InvalidOperationException("InlineBlockParent may have only one child area.");
      }

      if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.a0.t2.class)) {
         this.x8 = (com.aspose.slides.internal.a0.t2)var1;
         this.l6(var1.f_());
         this.k5(var1.a6());
      } else {
         throw new InvalidOperationException(d1.n5(new String[]{"The child of an InlineBlockParent must be a", " Block area"}));
      }
   }

   public final com.aspose.slides.internal.a0.t2 m1() {
      return this.x8;
   }

   @Override
   public p8 n5(boolean var1) {
      p8 var2 = this.x8.n5(var1).u3();
      var2.l6(0);
      return var2;
   }
}
