package com.aspose.slides.internal.k4y;

class b6o$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final b6o l6;

   b6o$2(b6o var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (b6o.u3().n5(this.n5.n3())) {
         case 12:
            b6o.n5(this.l6, new a1c(this.n5));
            break;
         case 13:
            b6o.l6(this.l6, new a1c(this.n5));
            break;
         case 14:
            b6o.n5(this.l6, new d3m(this.n5));
            break;
         case 15:
            b6o.n5(this.l6, new l0k(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
