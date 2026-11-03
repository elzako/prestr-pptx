package com.aspose.slides.internal.k4y;

class c9q$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final c9q l6;

   c9q$1(c9q var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (c9q.a6().n5(this.n5.n3())) {
         case 0:
            c9q.n5(this.l6, this.n5.c4());
            if (!this.n5.m1()) {
               while (this.n5.s7() != 15) {
                  this.n5.u9();
                  c9q.n5(this.l6, com.aspose.slides.ms.System.d1.n5(c9q.n5(this.l6), this.n5.c4()));
               }
            }
            break;
         case 1:
            c9q.n5(this.l6, new p4t(this.n5));
            break;
         case 2:
            c9q.n5(this.l6, new a9t(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
