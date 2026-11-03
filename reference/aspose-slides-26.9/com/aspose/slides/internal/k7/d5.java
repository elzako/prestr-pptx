package com.aspose.slides.internal.k7;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.k5.l6$n5;
import com.aspose.slides.ms.System.o5;

public class d5 extends n5 {
   private com.aspose.slides.internal.q0.e2 n5;
   private com.aspose.slides.internal.q0.e2 l6;
   private com.aspose.slides.internal.q0.e2 k5;
   private o5<com.aspose.slides.internal.o9b.c8> u3 = new o5<>();
   private boolean a6;

   public d5(com.aspose.slides.internal.k5.u9 var1) {
      super(var1);
      IGenericEnumerator var2 = ((com.aspose.slides.internal.k5.h0)var1).iterator();

      for (int var3 = 0; var2.hasNext(); var3++) {
         if (var2.next() == l6$n5.a0) {
            this.a6 = true;
            return;
         }

         switch (var3) {
            case 0:
               this.n5 = y1.n5((com.aspose.slides.internal.k5.u9)var2.next());
               break;
            case 1:
               this.l6 = y1.n5((com.aspose.slides.internal.k5.u9)var2.next());
               break;
            case 2:
               if (!com.aspose.slides.internal.v6g.k5.l6(var2.next(), com.aspose.slides.internal.y4.c8.class)
                  && !com.aspose.slides.internal.v6g.k5.l6(var2.next(), com.aspose.slides.internal.y4.n3.class)) {
                  this.u3 = new o5<>(((com.aspose.slides.internal.k5.u3)var2.next()).a6().a6().o8());
               } else {
                  this.k5 = y1.n5((com.aspose.slides.internal.k5.u9)var2.next());
               }
               break;
            case 3:
               this.u3 = new o5<>(((com.aspose.slides.internal.k5.u3)var2.next()).a6().a6().o8());
         }
      }
   }
}
