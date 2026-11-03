package com.aspose.slides.internal.k4y;

class r8u$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final r8u l6;

   r8u$2(r8u var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (r8u.k5().n5(this.n5.n3())) {
         case 1:
            r8u.l6(this.l6, this.n5.c4());
            if (!this.n5.m1()) {
               while (this.n5.s7() != 15) {
                  this.n5.u9();
                  r8u.l6(this.l6, com.aspose.slides.ms.System.d1.n5(r8u.n5(this.l6), this.n5.c4()));
               }
            }
            break;
         case 2:
            r8u.n5(this.l6, new a3g(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
