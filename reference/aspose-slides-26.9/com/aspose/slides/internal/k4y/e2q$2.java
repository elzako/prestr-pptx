package com.aspose.slides.internal.k4y;

class e2q$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final e2q l6;

   e2q$2(e2q var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (e2q.n5().n5(this.n5.n3())) {
         case 4:
            e2q.l6(this.l6, this.n5.c4());
            if (!this.n5.m1()) {
               while (this.n5.s7() != 15) {
                  this.n5.u9();
                  e2q.l6(this.l6, com.aspose.slides.ms.System.d1.n5(e2q.n5(this.l6), this.n5.c4()));
               }
            }
            break;
         case 5:
            e2q.n5(this.l6, new g7("p", new u1x(this.n5)));
            break;
         case 6:
            e2q.n5(this.l6, new g7("h", new m2v(this.n5)));
            break;
         default:
            return false;
      }

      return true;
   }
}
