package com.aspose.slides.internal.k4y;

class h0i$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final h0i l6;

   h0i$1(h0i var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (h0i.c8().n5(this.n5.n3())) {
         case 0:
            h0i.n5(this.l6, new m9a(this.n5));
            break;
         case 1:
            h0i.n5(this.l6, new w9s(this.n5));
            break;
         case 2:
            h0i.l6(this.l6, new w9s(this.n5));
            break;
         case 3:
            h0i.n5(this.l6, new a9t(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
