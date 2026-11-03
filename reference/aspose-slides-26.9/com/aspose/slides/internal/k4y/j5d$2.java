package com.aspose.slides.internal.k4y;

class j5d$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final j5d l6;

   j5d$2(j5d var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (j5d.n5().n5(this.n5.n3())) {
         case 13:
            j5d.u9(this.l6, this.n5.c4());
            if (!this.n5.m1()) {
               while (this.n5.s7() != 15) {
                  this.n5.u9();
                  j5d.u9(this.l6, com.aspose.slides.ms.System.d1.n5(j5d.n5(this.l6), this.n5.c4()));
               }
            }
            break;
         case 14:
            j5d.h0(this.l6, this.n5.c4());
            if (!this.n5.m1()) {
               while (this.n5.s7() != 15) {
                  this.n5.u9();
                  j5d.h0(this.l6, com.aspose.slides.ms.System.d1.n5(j5d.l6(this.l6), this.n5.c4()));
               }
            }
            break;
         default:
            return false;
      }

      return true;
   }
}
