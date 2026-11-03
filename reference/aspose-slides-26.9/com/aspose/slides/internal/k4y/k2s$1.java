package com.aspose.slides.internal.k4y;

class k2s$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final k2s l6;

   k2s$1(k2s var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (k2s.l6().n5(this.n5.n3())) {
         case 0:
            k2s.n5(this.l6, new g7("strRef", new c9q(this.n5)));
            break;
         case 1:
            k2s.n5(this.l6, new g7("rich", new j3z(this.n5)));
            break;
         default:
            return false;
      }

      return true;
   }
}
