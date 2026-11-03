package com.aspose.slides.internal.k4y;

class g8a$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final g8a l6;

   g8a$2(g8a var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (g8a.n5().n5(this.n5.n3())) {
         case 13:
            String var2 = this.n5.c4();
            if (!this.n5.m1()) {
               while (this.n5.s7() != 15) {
                  this.n5.u9();
                  var2 = com.aspose.slides.ms.System.d1.n5(var2, this.n5.c4());
               }

               g8a.n5(this.l6).addItem(var2);
            }
            break;
         case 14:
            g8a.n5(this.l6, new v3x(this.n5));
            break;
         case 15:
            g8a.n5(this.l6, new g3o(this.n5));
            break;
         case 16:
            g8a.n5(this.l6, new o1n(this.n5));
            break;
         case 17:
            g8a.n5(this.l6, new l0k(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
