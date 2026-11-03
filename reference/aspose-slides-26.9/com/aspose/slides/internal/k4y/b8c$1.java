package com.aspose.slides.internal.k4y;

class b8c$1 extends b3$n5 {
   // $VF: synthetic field
   final b8c n5;

   b8c$1(b8c var1) {
      this.n5 = var1;
   }

   @Override
   public boolean n5(String var1, String var2) {
      switch (b8c.n3().n5(var1)) {
         case 0:
            b8c.n5(this.n5, com.aspose.slides.ms.System.Xml.f4.e2(var2) / 60000.0F);
            return true;
         case 1:
            b8c.n5(this.n5, com.aspose.slides.ms.System.Xml.f4.t2(var2));
            return true;
         case 2:
            b8c.l6(this.n5, com.aspose.slides.ms.System.Xml.f4.t2(var2));
            return true;
         default:
            return false;
      }
   }
}
