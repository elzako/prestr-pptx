package com.aspose.slides.internal.k4y;

class e8b$1 extends b3$n5 {
   // $VF: synthetic field
   final e8b n5;

   e8b$1(e8b var1) {
      this.n5 = var1;
   }

   @Override
   public boolean n5(String var1, String var2) {
      switch (e8b.c8().n5(var1)) {
         case 0:
            e8b.n5(this.n5, com.aspose.slides.ms.System.Xml.f4.e2(var2) / 60000.0F);
            return true;
         case 1:
            e8b.n5(this.n5, com.aspose.slides.ms.System.Xml.f4.t2(var2));
            return true;
         case 2:
            e8b.l6(this.n5, com.aspose.slides.ms.System.Xml.f4.t2(var2));
            return true;
         default:
            return false;
      }
   }
}
