package com.aspose.slides.internal.k4y;

class w6g$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final w6g l6;

   w6g$2(w6g var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (w6g.n5().n5(this.n5.n3())) {
         case 12:
            w6g.s7(this.l6, this.n5.c4());
            if (!this.n5.m1()) {
               while (this.n5.s7() != 15) {
                  this.n5.u9();
                  w6g.s7(this.l6, com.aspose.slides.ms.System.d1.n5(w6g.n5(this.l6), this.n5.c4()));
               }
            }
            break;
         case 13:
            w6g.x8(this.l6, this.n5.c4());
            if (!this.n5.m1()) {
               while (this.n5.s7() != 15) {
                  this.n5.u9();
                  w6g.x8(this.l6, com.aspose.slides.ms.System.d1.n5(w6g.l6(this.l6), this.n5.c4()));
               }
            }
            break;
         case 14:
            w6g.n5(this.l6, new c6x(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
