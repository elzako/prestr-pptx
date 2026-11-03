package com.aspose.slides.internal.k4y;

class r6a$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final r6a l6;

   r6a$1(r6a var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (r6a.u3().n5(this.n5.n3())) {
         case 0:
            r6a.n5(this.l6, new m0l(this.n5));
            break;
         case 1:
            r6a.n5(this.l6, this.n5.c4());
            if (!this.n5.m1()) {
               while (this.n5.s7() != 15) {
                  this.n5.u9();
                  r6a.n5(this.l6, com.aspose.slides.ms.System.d1.n5(r6a.n5(this.l6), this.n5.c4()));
               }
            }
            break;
         default:
            return false;
      }

      return true;
   }
}
