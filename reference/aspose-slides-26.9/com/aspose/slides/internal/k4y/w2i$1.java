package com.aspose.slides.internal.k4y;

class w2i$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final w2i l6;

   w2i$1(w2i var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (w2i.k5().n5(this.n5.n3())) {
         case 0:
            this.n5.u9();
            w2i.n5(this.l6, b3.e2(this.n5.z1()));
            break;
         case 1:
            this.n5.u9();
            w2i.l6(this.l6, b3.e2(this.n5.z1()));
            break;
         default:
            return false;
      }

      return true;
   }
}
