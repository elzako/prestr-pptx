package com.aspose.slides.internal.k4y;

class v9d$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final v9d l6;

   v9d$2(v9d var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (v9d.k5().n5(this.n5.n3())) {
         case 8:
            v9d.a6(this.l6, this.n5.c4());
            if (!this.n5.m1()) {
               while (this.n5.s7() != 15) {
                  this.n5.u9();
                  v9d.a6(this.l6, com.aspose.slides.ms.System.d1.n5(v9d.n5(this.l6), this.n5.c4()));
               }
            }

            return true;
         default:
            return false;
      }
   }
}
