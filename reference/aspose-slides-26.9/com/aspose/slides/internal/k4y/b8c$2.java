package com.aspose.slides.internal.k4y;

class b8c$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final b8c l6;

   b8c$2(b8c var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (b8c.n3().n5(this.n5.n3())) {
         case 3:
            b8c.n5(this.l6, new s2b(this.n5));
            break;
         case 4:
            b8c.n5(this.l6, new q8g(this.n5));
            break;
         case 5:
            b8c.l6(this.l6, new s2b(this.n5));
            break;
         case 6:
            b8c.l6(this.l6, new q8g(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
