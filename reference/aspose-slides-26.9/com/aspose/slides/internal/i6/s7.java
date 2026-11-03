package com.aspose.slides.internal.i6;

import com.aspose.slides.internal.c3.l4;

public class s7 extends d1 {
   @Override
   public void n5(l4 var1, com.aspose.slides.internal.c3.j3 var2) {
      var2.s7();
      if (var2.k5()) {
         var1.l6(this);
         var1.n5(n5);
         var1.l6();
      } else {
         switch (var2.l6()) {
            case '\u0000':
               var1.l6(this);
               var1.t2().k5('�');
               break;
            case '&':
               char[] var3 = var1.n5(new com.aspose.slides.ms.System.o5<>('\''), true);
               if (var3 != null) {
                  var1.t2().n5(var3);
               } else {
                  var1.t2().k5(var2.l6());
               }
               break;
            case '\'':
               var1.n5(e2);
               break;
            default:
               var1.t2().k5(var2.l6());
         }
      }
   }
}
