package com.aspose.slides.internal.i6;

import com.aspose.slides.internal.c3.l4;

public class z8 extends d1 {
   @Override
   public void n5(l4 var1, com.aspose.slides.internal.c3.j3 var2) {
      var2.s7();
      if (var2.k5()) {
         var1.l6(this);
         var1.a6();
         var1.n5(n5);
         var1.l6();
      } else {
         switch (var2.l6()) {
            case '\u0000':
               var1.l6(this);
               var1.s7().n5("--!");
               var1.s7().n5('�');
               var1.n5(q0);
               break;
            case '-':
               var1.s7().n5("--!");
               var1.n5(m1);
               break;
            case '>':
               var1.a6();
               var1.n5(n5);
               break;
            default:
               var1.s7().n5("--!");
               var1.s7().n5(var2.l6());
               var1.n5(q0);
         }
      }
   }
}
