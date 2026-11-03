package com.aspose.slides.internal.k4y;

class m5l$1 extends b3$n5 {
   // $VF: synthetic field
   final m5l n5;

   m5l$1(m5l var1) {
      this.n5 = var1;
   }

   @Override
   public boolean n5(String var1, String var2) {
      switch (m5l.k5().n5(var1)) {
         case 0:
            m5l.n5(this.n5, com.aspose.slides.ms.System.Xml.f4.e2(var2) / 60000.0F);
            return true;
         case 1:
            m5l.n5(this.n5, b3.z1(var2));
            return true;
         default:
            return false;
      }
   }
}
