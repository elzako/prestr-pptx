package com.aspose.slides.internal.k4y;

class w4a$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final w4a l6;

   w4a$2(w4a var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (w4a.n5().n5(this.n5.n3())) {
         case 22:
            w4a.z3(this.l6, this.n5.c4());
            if (!this.n5.m1()) {
               while (this.n5.s7() != 15) {
                  this.n5.u9();
                  w4a.z3(this.l6, com.aspose.slides.ms.System.d1.n5(w4a.n5(this.l6), this.n5.c4()));
               }
            }
            break;
         case 23:
            w4a.m1(this.l6, this.n5.c4());
            if (!this.n5.m1()) {
               while (this.n5.s7() != 15) {
                  this.n5.u9();
                  w4a.m1(this.l6, com.aspose.slides.ms.System.d1.n5(w4a.l6(this.l6), this.n5.c4()));
               }
            }
            break;
         case 24:
            l4y var2 = new l4y(this.n5);
            w4a.k5(this.l6).addItem(var2);
            break;
         default:
            return false;
      }

      return true;
   }
}
