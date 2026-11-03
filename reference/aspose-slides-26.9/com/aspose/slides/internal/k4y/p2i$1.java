package com.aspose.slides.internal.k4y;

class p2i$1 extends b3$n5 {
   // $VF: synthetic field
   final p2i n5;

   p2i$1(p2i var1) {
      this.n5 = var1;
   }

   @Override
   public boolean n5(String var1, String var2) {
      switch (p2i.a6().n5(var1)) {
         case 0:
            p2i.n5(this.n5, t5.n5(var2));
            return true;
         case 1:
            p2i.n5(this.n5, com.aspose.slides.ms.System.Xml.f4.k7(var2) / 12700.0);
            return true;
         case 2:
            p2i.n5(this.n5, com.aspose.slides.ms.System.Xml.f4.e2(var2) / 60000.0F);
            return true;
         default:
            return false;
      }
   }
}
