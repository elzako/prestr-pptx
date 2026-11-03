package com.aspose.slides.internal.k4y;

class q3g$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final q3g l6;

   q3g$2(q3g var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (q3g.h0().n5(this.n5.n3())) {
         case 3:
            q3g.n5(this.l6, new s2b(this.n5));
            break;
         case 4:
            q3g.n5(this.l6, this.n5.c4());
            if (!this.n5.m1()) {
               while (this.n5.s7() != 15) {
                  this.n5.u9();
                  q3g.n5(this.l6, com.aspose.slides.ms.System.d1.n5(q3g.l6(this.l6), this.n5.c4()));
               }
            }
            break;
         case 5:
            q3g.n5(this.l6, new j9y(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
