package com.aspose.slides.internal.k4y;

class h0m$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final h0m l6;

   h0m$2(h0m var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (h0m.u3().n5(this.n5.n3())) {
         case 2:
            h0m.n5(this.l6, new w9e(this.n5));
            break;
         case 3:
            h0m.n5(this.l6, new e8b(this.n5));
            break;
         case 4:
            h0m.n5(this.l6, new l7h(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
