package com.aspose.slides.internal.k4y;

class s7m$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final s7m l6;

   s7m$2(s7m var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (s7m.y4().n5(this.n5.n3())) {
         case 2:
            s7m.n5(this.l6, new n9v(this.n5));
            break;
         case 3:
            s7m.n5(this.l6, new b9y(this.n5));
            break;
         case 4:
            s7m.n5(this.l6, new j3z(this.n5));
            break;
         case 5:
            s7m.n5(this.l6, new e5k(this.n5));
            break;
         case 6:
            s7m.n5(this.l6, this.n5.c4());
            if (!this.n5.m1()) {
               while (this.n5.s7() != 15) {
                  this.n5.u9();
                  s7m.n5(this.l6, com.aspose.slides.ms.System.d1.n5(s7m.n5(this.l6), this.n5.c4()));
               }
            }
            break;
         case 7:
            s7m.n5(this.l6, new h6m(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
