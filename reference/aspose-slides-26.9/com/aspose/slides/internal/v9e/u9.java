package com.aspose.slides.internal.v9e;

import com.aspose.slides.exceptions.XsltException;
import com.aspose.slides.ms.System.Xml.k6;

public class u9 extends t4 {
   public k6 n5;

   public final k6 n5() {
      return this.n5;
   }

   @Override
   public void l6(z1 var1) {
      this.u3(var1);
      this.n5(var1, this.n5, "name");
      this.e2(var1);
   }

   @Override
   public boolean k5(z1 var1) {
      String var2 = var1.u3().e2();
      String var3 = var1.u3().t4();
      if (com.aspose.slides.ms.System.Xml.v8.n5(var2, var1.n5().j4)) {
         this.n5 = var1.s7(var3);
      } else {
         if (!com.aspose.slides.ms.System.Xml.v8.n5(var2, var1.n5().u2)) {
            return false;
         }

         this.n5(var1.h2());
      }

      return true;
   }

   private void e2(z1 var1) {
      z7 var2 = var1.u3();
      if (var1.u9()) {
         do {
            switch (var2.n3()) {
               case 1:
                  var1.t4();
                  String var3 = var2.t9();
                  String var4 = var2.e2();
                  if (!com.aspose.slides.ms.System.Xml.v8.n5(var3, var2.k5().y6) || !com.aspose.slides.ms.System.Xml.v8.n5(var4, var2.k5().u9)) {
                     throw var1.x9();
                  }

                  this.n5(var1.c4());
                  var1.q0();
                  break;
               case 2:
               case 3:
               case 4:
               default:
                  throw XsltException.create("The contents of '{0}' are invalid.", "attribute-set");
               case 5:
               case 6:
               case 7:
               case 8:
            }
         } while (var1.a6());

         var1.h0();
      }
   }

   public final void n5(u9 var1) {
      n5 var3;
      for (int var2 = 0; (var3 = var1.n5(var2)) != null; var2++) {
         this.n5(var3);
      }
   }
}
