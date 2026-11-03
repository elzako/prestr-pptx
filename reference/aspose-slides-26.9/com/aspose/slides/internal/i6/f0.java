package com.aspose.slides.internal.i6;

import com.aspose.slides.internal.c3.l4;

public class f0 extends d1 {
   @Override
   public void n5(l4 var1, com.aspose.slides.internal.c3.j3 var2) {
      var2.s7();
      switch (var2.l6()) {
         case '\t':
         case '\n':
         case '\f':
         case '\r':
         case ' ':
         case '/':
         case '>':
            if (com.aspose.slides.ms.System.d1.a6(var1.n3().toString(), "script")) {
               var1.n5(j9);
            } else {
               var1.n5(s0);
            }

            var1.n5(var2.l6());
            break;
         default:
            if (var2.z1()) {
               var1.n3().n5(com.aspose.slides.ms.System.t9.z1(var2.l6()));
               var1.n5(var2.l6());
            } else {
               var1.n5(s0);
               var1.l6();
            }
      }
   }
}
