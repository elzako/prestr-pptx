package com.aspose.slides.internal.i6;

import com.aspose.slides.internal.c3.l4;

public class n3 extends d1 {
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
               var1.t2().a6();
               var1.t2().l6('�');
               var1.n5(c8);
            case '\t':
            case '\n':
            case '\f':
            case '\r':
            case ' ':
               break;
            case '"':
            case '\'':
            case '<':
            case '=':
               var1.l6(this);
               this.l6(var1, var2);
               break;
            case '/':
               var1.n5(a6);
               break;
            case '>':
               var1.k5();
               var1.n5(n5);
               break;
            default:
               this.l6(var1, var2);
         }
      }
   }

   @Override
   protected void l6(l4 var1, com.aspose.slides.internal.c3.j3 var2) {
      var1.t2().a6();
      var1.t2().l6(var2.l6());
      var1.n5(c8);
   }
}
