package com.aspose.slides.internal.k4y;

class v1p$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final v1p l6;

   v1p$2(v1p var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (v1p.k5().n5(this.n5.n3())) {
         case 3:
            v1p.l6(this.l6, this.n5.c4());
            if (!this.n5.m1()) {
               while (this.n5.s7() != 15) {
                  this.n5.u9();
                  v1p.l6(this.l6, com.aspose.slides.ms.System.d1.n5(v1p.n5(this.l6), this.n5.c4()));
               }
            }
            break;
         case 4:
            v1p.k5(this.l6, this.n5.c4());
            if (!this.n5.m1()) {
               while (this.n5.s7() != 15) {
                  this.n5.u9();
                  v1p.k5(this.l6, com.aspose.slides.ms.System.d1.n5(v1p.l6(this.l6), this.n5.c4()));
               }
            }
            break;
         default:
            return false;
      }

      return true;
   }
}
