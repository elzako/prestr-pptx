package com.aspose.slides.internal.k4y;

class l6z$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final l6z l6;

   l6z$1(l6z var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (l6z.m3().n5(this.n5.n3())) {
         case 0:
            l6z.n5(this.l6, this.n5.c4());
            if (!this.n5.m1()) {
               while (this.n5.s7() != 15) {
                  this.n5.u9();
                  l6z.n5(this.l6, com.aspose.slides.ms.System.d1.n5(l6z.n5(this.l6), this.n5.c4()));
               }
            }
            break;
         case 1:
            l6z.n5(this.l6, new b9y(this.n5));
            break;
         case 2:
            l6z.n5(this.l6, new b5j(this.n5));
            break;
         case 3:
            l6z.n5(this.l6, new i1t(this.n5));
            break;
         case 4:
            l6z.n5(this.l6, new w2k(this.n5));
            break;
         case 5:
            l6z.n5(this.l6, new x8w(this.n5));
            break;
         case 6:
            l6z.l6(this.l6, new x8w(this.n5));
            break;
         case 7:
            l6z.k5(this.l6, new x8w(this.n5));
            break;
         case 8:
            l6z.n5(this.l6, new c8q(this.n5));
            break;
         case 9:
            l6z.l6(this.l6, new c8q(this.n5));
            break;
         case 10:
            l6z.n5(this.l6, new n1n(this.n5));
            break;
         case 11:
            l6z.n5(this.l6, new a9t(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
