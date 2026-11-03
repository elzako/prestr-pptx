package com.aspose.slides.internal.k4y;

class y2l$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final y2l l6;

   y2l$1(y2l var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (y2l.n5().n5(this.n5.n3())) {
         case 0:
            y2l.n5(this.l6, this.n5.c4());
            if (!this.n5.m1()) {
               while (this.n5.s7() != 15) {
                  this.n5.u9();
                  y2l.n5(this.l6, com.aspose.slides.ms.System.d1.n5(y2l.n5(this.l6), this.n5.c4()));
               }
            }

            return true;
         default:
            return false;
      }
   }
}
