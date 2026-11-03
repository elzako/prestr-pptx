package com.aspose.slides.internal.k4y;

class j6c$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final j6c l6;

   j6c$2(j6c var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (j6c.k5().n5(this.n5.n3())) {
         case 1:
            j6c.l6(this.l6, this.n5.c4());
            if (!this.n5.m1()) {
               while (this.n5.s7() != 15) {
                  this.n5.u9();
                  j6c.l6(this.l6, com.aspose.slides.ms.System.d1.n5(j6c.n5(this.l6), this.n5.c4()));
               }
            }
            break;
         case 2:
            j6c.n5(this.l6, new y6f(this.n5));
            break;
         case 3:
            j6c.n5(this.l6, new y2l(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
