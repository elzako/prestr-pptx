package com.aspose.slides.internal.k4y;

class w1c$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final w1c l6;

   w1c$1(w1c var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (w1c.l6().n5(this.n5.n3())) {
         case 0:
            w1c.n5(this.l6, new g7("strRef", new c9q(this.n5)));
            break;
         case 1:
            if (this.n5.m1()) {
               w1c.n5(this.l6, new g7("v", ""));
            } else {
               this.n5.u9();
               w1c.n5(this.l6, new g7("v", this.n5.z1()));
            }
            break;
         default:
            return false;
      }

      return true;
   }
}
