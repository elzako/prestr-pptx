package com.aspose.slides.internal.h2;

import com.aspose.slides.ms.System.q1;

public class v4$l6 extends h2 implements Cloneable {
   public v4$l6(int var1) {
      super(var1);
   }

   @Override
   public a5 l6(a5 var1, com.aspose.slides.internal.e5.w1 var2, com.aspose.slides.internal.e5.t9 var3) {
      if (com.aspose.slides.internal.v6g.k5.l6(var1, z8.class)) {
         return m3.n5(var1);
      }

      Object var4 = var1.h0();
      if (var4 != null) {
         int var5 = com.aspose.slides.internal.v6g.k5.u3(q1.u3(com.aspose.slides.ms.System.z3.x8(var4)), 14);
         if (var5 <= 0) {
            var5 = 1;
         }

         return v4.l6(var5);
      } else {
         return this.n5(var1, var2, var3);
      }
   }
}
