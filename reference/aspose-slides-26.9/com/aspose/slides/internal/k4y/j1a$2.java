package com.aspose.slides.internal.k4y;

class j1a$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final j1a l6;

   j1a$2(j1a var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (j1a.a6().n5(this.n5.n3())) {
         case 5:
            j1a.k5(this.l6, this.n5.c4());
            if (!this.n5.m1()) {
               while (this.n5.s7() != 15) {
                  this.n5.u9();
                  j1a.k5(this.l6, com.aspose.slides.ms.System.d1.n5(j1a.n5(this.l6), this.n5.c4()));
               }
            }

            return true;
         default:
            return false;
      }
   }
}
