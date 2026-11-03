package com.aspose.slides.internal.k4y;

class u7a$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final u7a l6;

   u7a$2(u7a var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (u7a.u9().n5(this.n5.n3())) {
         case 3:
            u7a.n5(this.l6, new n5v(this.n5));
            break;
         case 4:
            u7a.n5(this.l6, new e5d(this.n5));
            break;
         case 5:
            u7a.u3(this.l6, this.n5.c4());
            if (!this.n5.m1()) {
               while (this.n5.s7() != 15) {
                  this.n5.u9();
                  u7a.u3(this.l6, com.aspose.slides.ms.System.d1.n5(u7a.n5(this.l6), this.n5.c4()));
               }
            }
            break;
         default:
            return false;
      }

      return true;
   }
}
