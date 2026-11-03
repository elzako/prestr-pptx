package com.aspose.slides.internal.k4y;

class h4i$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final h4i l6;

   h4i$2(h4i var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (h4i.n5().n5(this.n5.n3())) {
         case 24:
            h4i.t4(this.l6, this.n5.c4());
            if (!this.n5.m1()) {
               while (this.n5.s7() != 15) {
                  this.n5.u9();
                  h4i.t4(this.l6, com.aspose.slides.ms.System.d1.n5(h4i.n5(this.l6), this.n5.c4()));
               }
            }
            break;
         case 25:
            h4i.q0(this.l6, this.n5.c4());
            if (!this.n5.m1()) {
               while (this.n5.s7() != 15) {
                  this.n5.u9();
                  h4i.q0(this.l6, com.aspose.slides.ms.System.d1.n5(h4i.l6(this.l6), this.n5.c4()));
               }
            }
            break;
         default:
            return false;
      }

      return true;
   }
}
