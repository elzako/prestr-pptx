package com.aspose.slides.internal.k4y;

class l9a$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final l9a l6;

   l9a$1(l9a var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (l9a.a0().n5(this.n5.n3())) {
         case 0:
            l9a.n5(this.l6, new b8n(this.n5));
            break;
         case 1:
            l9a.n5(this.l6, new g7("delete", new c8q(this.n5)));
            break;
         case 2:
            l9a.n5(this.l6, new v2o(this.n5));
            break;
         case 3:
            l9a.n5(this.l6, new k2s(this.n5));
            break;
         case 4:
            l9a.n5(this.l6, new p6x(this.n5));
            break;
         case 5:
            l9a.n5(this.l6, new b9y(this.n5));
            break;
         case 6:
            l9a.n5(this.l6, new j3z(this.n5));
            break;
         case 7:
            l9a.n5(this.l6, new h5r(this.n5));
            break;
         case 8:
            l9a.n5(this.l6, new c8q(this.n5));
            break;
         case 9:
            l9a.l6(this.l6, new c8q(this.n5));
            break;
         case 10:
            l9a.k5(this.l6, new c8q(this.n5));
            break;
         case 11:
            l9a.u3(this.l6, new c8q(this.n5));
            break;
         case 12:
            l9a.a6(this.l6, new c8q(this.n5));
            break;
         case 13:
            l9a.u9(this.l6, new c8q(this.n5));
            break;
         case 14:
            l9a.n5(this.l6, this.n5.c4());
            if (!this.n5.m1()) {
               while (this.n5.s7() != 15) {
                  this.n5.u9();
                  l9a.n5(this.l6, com.aspose.slides.ms.System.d1.n5(l9a.n5(this.l6), this.n5.c4()));
               }
            }
            break;
         case 15:
            l9a.n5(this.l6, new a9t(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
