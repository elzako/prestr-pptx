package com.aspose.slides.internal.k4y;

class h5w$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final h5w l6;

   h5w$1(h5w var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (h5w.l6().n5(this.n5.n3())) {
         case 0:
            h5w.n5(this.l6, new u8x(this.n5));
            break;
         case 1:
            h5w.n5(this.l6, this.n5.c4());
            if (!this.n5.m1()) {
               while (this.n5.s7() != 15) {
                  this.n5.u9();
                  h5w.n5(this.l6, com.aspose.slides.ms.System.d1.n5(h5w.n5(this.l6), this.n5.c4()));
               }
            }
            break;
         default:
            return false;
      }

      return true;
   }
}
