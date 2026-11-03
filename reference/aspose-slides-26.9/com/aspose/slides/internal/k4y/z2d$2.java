package com.aspose.slides.internal.k4y;

class z2d$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final z2d l6;

   z2d$2(z2d var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (z2d.n5().n5(this.n5.n3())) {
         case 9:
            z2d.h0(this.l6, this.n5.c4());
            if (!this.n5.m1()) {
               while (this.n5.s7() != 15) {
                  this.n5.u9();
                  z2d.h0(this.l6, com.aspose.slides.ms.System.d1.n5(z2d.n5(this.l6), this.n5.c4()));
               }
            }
            break;
         case 10:
            z2d.c8(this.l6, this.n5.c4());
            if (!this.n5.m1()) {
               while (this.n5.s7() != 15) {
                  this.n5.u9();
                  z2d.c8(this.l6, com.aspose.slides.ms.System.d1.n5(z2d.l6(this.l6), this.n5.c4()));
               }
            }
            break;
         case 11:
            z2d.n5(this.l6, new c6x(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
