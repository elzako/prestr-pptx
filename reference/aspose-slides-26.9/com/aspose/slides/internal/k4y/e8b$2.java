package com.aspose.slides.internal.k4y;

class e8b$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final e8b l6;

   e8b$2(e8b var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (e8b.c8().n5(this.n5.n3())) {
         case 3:
            e8b.n5(this.l6, new s2b(this.n5));
            break;
         case 4:
            e8b.n5(this.l6, new q8g(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
