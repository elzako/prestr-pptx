package com.aspose.slides.internal.i6;

import com.aspose.slides.internal.c3.l4;

public class f2 extends d1 {
   @Override
   public void n5(l4 var1, com.aspose.slides.internal.c3.j3 var2) {
      var2.s7();
      if (var2.k5()) {
         var1.l6(this);
         var1.u9();
         var1.x8().n5(true);
         var1.h0();
         var1.n5(n5);
      } else {
         switch (var2.l6()) {
            case '\t':
            case '\n':
            case '\f':
            case ' ':
               var1.n5(j5);
               break;
            default:
               var1.l6(this);
               var1.n5(j5);
               var1.l6();
         }
      }
   }
}
