package com.aspose.slides.internal.k4y;

class o8r$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final o8r l6;

   o8r$2(o8r var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (o8r.u3().n5(this.n5.n3())) {
         case 2:
            o8r.l6(this.l6, this.n5.c4());
            if (!this.n5.m1()) {
               while (this.n5.s7() != 15) {
                  this.n5.u9();
                  o8r.l6(this.l6, com.aspose.slides.ms.System.d1.n5(o8r.n5(this.l6), this.n5.c4()));
               }
            }

            return true;
         default:
            return false;
      }
   }
}
