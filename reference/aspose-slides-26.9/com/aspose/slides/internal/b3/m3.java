package com.aspose.slides.internal.b3;

import com.aspose.slides.internal.h2.a5;
import com.aspose.slides.internal.h2.j9;
import com.aspose.slides.ms.System.d1;

public class m3 extends s7 {
   @Override
   public int n5() {
      return 1;
   }

   @Override
   public com.aspose.slides.internal.f2.a6 l6() {
      return new m3$n5(null);
   }

   @Override
   public a5 n5(a5[] var1, j5 var2) {
      Object var3 = var1[0].h0();
      if (var3 == null) {
         throw new z8(d1.n5(new String[]{"Non numeric operand to ", "proportional-column-width() function."}));
      } else {
         com.aspose.slides.internal.e5.w1 var4 = var2.u3();
         if (!d1.a6(var4.n5().t9(), "fo:table-column")) {
            throw new z8(d1.n5(new String[]{"proportional-column-width() function ", "may only be used on fo:table-column."}));
         } else {
            com.aspose.slides.internal.u6.z1 var5 = (com.aspose.slides.internal.u6.z1)var4.l6();
            if (var5.o0()) {
               throw new z8(d1.n5(new String[]{"proportional-column-width() function ", "may only be used when fo:table has ", "table-layout=\"fixed\"."}));
            } else {
               return new j9(com.aspose.slides.ms.System.z3.n3(var3), var2.k5());
            }
         }
      }
   }
}
