package com.aspose.slides.internal.k4y;

class a4s$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final a4s l6;

   a4s$1(a4s var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (a4s.d2().n5(this.n5.n3())) {
         case 0:
            l9a var2 = new l9a(this.n5);
            a4s.n5(this.l6).addItem(var2);
            break;
         case 1:
            a4s.n5(this.l6, new g7("delete", new c8q(this.n5)));
            break;
         case 2:
            a4s.n5(this.l6, new p6x(this.n5));
            break;
         case 3:
            a4s.n5(this.l6, new b9y(this.n5));
            break;
         case 4:
            a4s.n5(this.l6, new j3z(this.n5));
            break;
         case 5:
            a4s.n5(this.l6, new h5r(this.n5));
            break;
         case 6:
            a4s.n5(this.l6, new c8q(this.n5));
            break;
         case 7:
            a4s.l6(this.l6, new c8q(this.n5));
            break;
         case 8:
            a4s.k5(this.l6, new c8q(this.n5));
            break;
         case 9:
            a4s.u3(this.l6, new c8q(this.n5));
            break;
         case 10:
            a4s.a6(this.l6, new c8q(this.n5));
            break;
         case 11:
            a4s.u9(this.l6, new c8q(this.n5));
            break;
         case 12:
            a4s.n5(this.l6, this.n5.c4());
            if (!this.n5.m1()) {
               while (this.n5.s7() != 15) {
                  this.n5.u9();
                  a4s.n5(this.l6, com.aspose.slides.ms.System.d1.n5(a4s.l6(this.l6), this.n5.c4()));
               }
            }
            break;
         case 13:
            a4s.h0(this.l6, new c8q(this.n5));
            break;
         case 14:
            a4s.n5(this.l6, new n9p(this.n5));
            break;
         case 15:
            a4s.n5(this.l6, new a9t(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
