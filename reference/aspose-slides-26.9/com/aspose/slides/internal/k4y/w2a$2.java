package com.aspose.slides.internal.k4y;

class w2a$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final w2a l6;

   w2a$2(w2a var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (w2a.a6().n5(this.n5.n3())) {
         case 1:
            w2a.n5(this.l6, new g7("custGeom", new u1s(this.n5)));
            break;
         case 2:
            w2a.n5(this.l6, new g7("prstGeom", new r7n(this.n5)));
            break;
         case 3:
            w2a.n5(this.l6, new r6o(this.n5));
            break;
         case 4:
            this.n5.u9();
            w2a.l6(this.l6, b3.q0(this.n5.z1()));
            break;
         case 5:
            w2a.n5(this.l6, new l8r(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
