package com.aspose.slides.internal.k4y;

class b5c$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final b5c l6;

   b5c$2(b5c var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (b5c.a6().n5(this.n5.n3())) {
         case 5:
            b5c.l6(this.l6, this.n5.c4());
            if (!this.n5.m1()) {
               while (this.n5.s7() != 15) {
                  this.n5.u9();
                  b5c.l6(this.l6, com.aspose.slides.ms.System.d1.n5(b5c.n5(this.l6), this.n5.c4()));
               }
            }
            break;
         case 6:
            b5c.n5(this.l6, new j1w(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
