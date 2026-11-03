package com.aspose.slides.internal.k4y;

class w9n$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final w9n l6;

   w9n$1(w9n var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (w9n.a6().n5(this.n5.n3())) {
         case 0:
            w9n.n5(this.l6, this.n5.c4());
            if (!this.n5.m1()) {
               while (this.n5.s7() != 15) {
                  this.n5.u9();
                  w9n.n5(this.l6, com.aspose.slides.ms.System.d1.n5(w9n.n5(this.l6), this.n5.c4()));
               }
            }
            break;
         case 1:
            w9n.n5(this.l6, new x2o(this.n5));
            break;
         case 2:
            w9n.n5(this.l6, new a9t(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
