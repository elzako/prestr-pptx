package com.aspose.slides.internal.k4y;

class d6q$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final d6q l6;

   d6q$1(d6q var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (d6q.n5().n5(this.n5.n3())) {
         case 0:
            d6q.n5(this.l6, this.n5.c4());
            if (!this.n5.m1()) {
               while (this.n5.s7() != 15) {
                  this.n5.u9();
                  d6q.n5(this.l6, com.aspose.slides.ms.System.d1.n5(d6q.n5(this.l6), this.n5.c4()));
               }
            }
            break;
         case 1:
            d6q.l6(this.l6, this.n5.c4());
            if (!this.n5.m1()) {
               while (this.n5.s7() != 15) {
                  this.n5.u9();
                  d6q.l6(this.l6, com.aspose.slides.ms.System.d1.n5(d6q.l6(this.l6), this.n5.c4()));
               }
            }
            break;
         default:
            return false;
      }

      return true;
   }
}
