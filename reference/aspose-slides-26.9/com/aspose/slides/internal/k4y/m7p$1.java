package com.aspose.slides.internal.k4y;

class m7p$1 extends b3$n5 {
   // $VF: synthetic field
   final m7p n5;

   m7p$1(m7p var1) {
      this.n5 = var1;
   }

   @Override
   public boolean n5(String var1, String var2) {
      switch (m7p.k5().n5(var1)) {
         case 0:
            m7p.n5(
               this.n5,
               var2.charAt(var2.length() - 1) == '%'
                  ? (float)com.aspose.slides.ms.System.Xml.f4.k7(com.aspose.slides.ms.System.d1.l6(var2, 0, var2.length() - 1))
                  : (float)com.aspose.slides.ms.System.Xml.f4.t9(var2) / 1000.0F
            );
            return true;
         case 1:
            m7p.n5(this.n5, com.aspose.slides.ms.System.Xml.f4.t2(var2));
            return true;
         default:
            return false;
      }
   }
}
