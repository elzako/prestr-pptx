package com.aspose.slides.internal.v9e;

import com.aspose.slides.exceptions.XsltException;

public class u6 extends t4 {
   private String n5;
   private String u3;
   private boolean a6;

   @Override
   public void l6(z1 var1) {
      com.aspose.slides.internal.x6s.a6 var2 = var1.u3().u3().n5();
      this.n5 = var2.u9();
      var2.q0();
      this.u3 = var2.u9();
      if (var1.u9()) {
         this.e2(var1);
         var1.h0();
      }
   }

   public final void e2(z1 var1) {
      z7 var2 = var1.u3();

      do {
         if (com.aspose.slides.ms.System.Xml.v8.n5(var2.t9(), var2.k5().y6) && com.aspose.slides.ms.System.Xml.v8.n5(var2.e2(), var2.k5().s3)) {
            this.a6 = true;
            if (var1.u9()) {
               this.n3(var1);
               var1.h0();
            }
         }
      } while (var1.a6());
   }

   @Override
   public void n5(p3 var1, l6 var2) {
      switch (var2.k5()) {
         case 0:
            if (!this.a6) {
               throw XsltException.create("'{0}' is not a recognized extension element.", this.n5);
            }

            if (this.l6 != null && this.l6.size() > 0) {
               var1.n5(var2);
               var2.n5(1);
            } else {
               var2.s7();
            }
            break;
         case 1:
            var2.s7();
            break;
         default:
            com.aspose.slides.internal.f8y.n5.n5("Invalid Container action execution state");
      }
   }
}
