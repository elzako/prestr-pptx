package com.aspose.slides.internal.k7;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.k5.l6$n5;
import com.aspose.slides.ms.System.o5;

public class r4 extends n5 {
   private String n5 = null;
   private o5<Integer> l6 = new o5<>();
   private boolean k5;
   private boolean u3;

   public r4(com.aspose.slides.internal.k5.u9 var1) {
      super(var1);
      IGenericEnumerator var2 = com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.k5.h0.class).iterator();

      while (var2.hasNext()) {
         var1 = (com.aspose.slides.internal.k5.u9)var2.next();
         if (l6$n5.y1 == var1) {
            this.k5 = true;
         } else if (l6$n5.a0 == var1) {
            this.u3 = true;
         } else if (var1.h0() == 1 && (((com.aspose.slides.internal.k5.u3)var1).n5() == 19 || ((com.aspose.slides.internal.k5.u3)var1).n5() == 20)) {
            this.n5 = ((com.aspose.slides.internal.k5.u3)var1).l6();
            if (var2.hasNext()) {
               var1 = (com.aspose.slides.internal.k5.u9)var2.next();
               if (l6$n5.r6 == var1) {
                  this.l6 = new o5<>(0);
               } else if (l6$n5.j9 == var1) {
                  this.l6 = new o5<>(1);
               }
            }
         }
      }
   }
}
