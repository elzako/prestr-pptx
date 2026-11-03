package com.aspose.slides.internal.k4y;

class v2x$1 extends b3$n5 {
   // $VF: synthetic field
   final v2x n5;

   v2x$1(v2x var1) {
      this.n5 = var1;
   }

   @Override
   public boolean n5(String var1, String var2) {
      switch (v2x.u3().n5(var1)) {
         case 0:
            v2x.n5(this.n5, com.aspose.slides.ms.System.Xml.f4.e2(var2) / 60000.0F);
            return true;
         case 1:
            v2x.l6(this.n5, com.aspose.slides.ms.System.Xml.f4.e2(var2) / 60000.0F);
            return true;
         case 2:
            v2x.k5(this.n5, com.aspose.slides.ms.System.Xml.f4.e2(var2) / 60000.0F);
            return true;
         default:
            return false;
      }
   }
}
