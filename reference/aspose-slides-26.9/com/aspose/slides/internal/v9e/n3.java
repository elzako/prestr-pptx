package com.aspose.slides.internal.v9e;

import com.aspose.slides.exceptions.XsltException;
import com.aspose.slides.ms.System.Xml.k6;

public class n3 extends t4 {
   private k6 n5;

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
         return true;
      } else {
         return false;
      }
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
                  if (!com.aspose.slides.ms.System.Xml.v8.n5(var3, var2.k5().y6) || !com.aspose.slides.ms.System.Xml.v8.n5(var4, var2.k5().r6)) {
                     throw var1.x9();
                  }

                  s4 var5 = var1.f0();
                  this.l6(var5.k5());
                  this.n5(var5);
                  var1.q0();
                  break;
               case 2:
               case 3:
               case 4:
               default:
                  throw XsltException.create("The contents of '{0}' are invalid.", "call-template");
               case 5:
               case 6:
               case 7:
               case 8:
            }
         } while (var1.a6());

         var1.h0();
      }
   }

   @Override
   public void n5(p3 var1, l6 var2) {
      switch (var2.k5()) {
         case 0:
            var1.z1();
            if (this.l6 != null && this.l6.size() > 0) {
               var1.n5(var2);
               var2.n5(2);
            } else {
               w2 var4 = var1.l6().n5(this.n5);
               if (var4 == null) {
                  throw XsltException.create("The named template '{0}' does not exist.", this.n5.toString());
               }

               var2.n5(3);
               var1.n5(var4, var2.u9());
            }
            break;
         case 1:
         default:
            com.aspose.slides.internal.f8y.n5.n5("Invalid CallTemplateAction execution state");
            break;
         case 2:
            w2 var3 = var1.l6().n5(this.n5);
            if (var3 == null) {
               throw XsltException.create("The named template '{0}' does not exist.", this.n5.toString());
            }

            var2.n5(3);
            var1.n5(var3, var2.u9());
            break;
         case 3:
            var2.s7();
      }
   }
}
