package com.aspose.slides.internal.v9e;

public class j4 extends t9 {
   private boolean n5;
   private String l6;

   public void l6(z1 var1) {
      this.u3(var1);
      this.u9(var1);
   }

   @Override
   public boolean k5(z1 var1) {
      String var2 = var1.u3().e2();
      String var3 = var1.u3().t4();
      if (com.aspose.slides.ms.System.Xml.v8.n5(var2, var1.n5().j5)) {
         this.n5 = var1.c8(var3);
         return true;
      } else {
         return false;
      }
   }

   private void u9(z1 var1) {
      if (var1.u9()) {
         z7 var2 = var1.u3();
         this.l6 = com.aspose.slides.ms.System.d1.n5;

         do {
            switch (var2.n3()) {
               case 4:
               case 5:
               case 6:
                  this.l6 = com.aspose.slides.ms.System.d1.n5(this.l6, var2.t4());
               case 7:
               case 8:
                  break;
               default:
                  throw var1.x9();
            }
         } while (var1.a6());

         var1.h0();
      }
   }

   @Override
   public void n5(p3 var1, l6 var2) {
      switch (var2.k5()) {
         case 0:
            if (var1.n5(this.l6, this.n5)) {
               var2.s7();
            }
            break;
         default:
            com.aspose.slides.internal.f8y.n5.n5("Invalid execution state in TextAction");
      }
   }
}
