package com.aspose.slides.internal.i6;

import com.aspose.slides.internal.c3.l4;

public class v4 extends d1 {
   @Override
   public void n5(l4 var1, com.aspose.slides.internal.c3.j3 var2) {
      var2.s7();
      switch (var2.l6()) {
         case '\t':
         case '\n':
         case '\f':
         case '\r':
         case ' ':
            if (var1.e2()) {
               var1.n5(h0);
            } else {
               this.l6(var1, var2);
            }
            break;
         case '/':
            if (var1.e2()) {
               var1.n5(a6);
            } else {
               this.l6(var1, var2);
            }
            break;
         case '>':
            if (var1.e2()) {
               var1.k5();
               var1.n5(n5);
            } else {
               this.l6(var1, var2);
            }
            break;
         default:
            if (var2.z1()) {
               var1.t2().n5(var2.l6());
               var1.n3().n5(var2.l6());
            } else {
               this.l6(var1, var2);
            }
      }
   }

   @Override
   protected void l6(l4 var1, com.aspose.slides.internal.c3.j3 var2) {
      var1.n5("</" + var1.n3());
      var1.n5(i9);
      var1.l6();
   }
}
