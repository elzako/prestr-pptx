package com.aspose.slides.internal.i6;

import com.aspose.slides.internal.c3.l4;

public class p6 extends d1 {
   @Override
   public void n5(l4 var1, com.aspose.slides.internal.c3.j3 var2) {
      var2.s7();
      switch (var2.l6()) {
         case '!':
            var1.n5(z1);
            break;
         case '/':
            var1.n5(u9);
            break;
         case '?':
            var1.n5(t9);
            break;
         default:
            if (var2.z1()) {
               var1.n5(true);
               var1.t2().n5(var2.l6());
               var1.n5(u3);
            } else {
               var1.l6(this);
               var1.n5('<');
               var1.n5(n5);
               var1.l6();
            }
      }
   }
}
