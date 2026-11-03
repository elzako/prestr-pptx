package com.aspose.slides.internal.k4y;

class q8h$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final q8h l6;

   q8h$1(q8h var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (q8h.k5().n5(this.n5.n3())) {
         case 0:
            q8h.n5(this.l6, new f2z(this.n5));
            break;
         case 1:
            q8h.n5(this.l6, this.n5.c4());
            if (!this.n5.m1()) {
               while (this.n5.s7() != 15) {
                  this.n5.u9();
                  q8h.n5(this.l6, com.aspose.slides.ms.System.d1.n5(q8h.n5(this.l6), this.n5.c4()));
               }
            }
            break;
         default:
            return false;
      }

      return true;
   }
}
