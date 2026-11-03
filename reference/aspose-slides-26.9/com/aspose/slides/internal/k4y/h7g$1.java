package com.aspose.slides.internal.k4y;

class h7g$1 extends b3$n5 {
   // $VF: synthetic field
   final h7g n5;

   h7g$1(h7g var1) {
      this.n5 = var1;
   }

   @Override
   public boolean n5(String var1, String var2) {
      switch (h7g.t9().n5(var1)) {
         case 0:
            h7g.n5(this.n5, x7.n5(var2));
            return true;
         case 1:
            h7g.n5(this.n5, var2);
            return true;
         case 2:
            h7g.l6(this.n5, z0.n5(var2));
            return true;
         case 3:
            h7g.n5(this.n5, com.aspose.slides.ms.System.Xml.f4.e2(var2) / 60000.0F);
            return true;
         case 4:
            h7g.l6(this.n5, var2);
            return true;
         case 5:
            h7g.l6(
               this.n5,
               var2.charAt(var2.length() - 1) == '%'
                  ? (float)com.aspose.slides.ms.System.Xml.f4.k7(com.aspose.slides.ms.System.d1.l6(var2, 0, var2.length() - 1))
                  : (float)com.aspose.slides.ms.System.Xml.f4.t9(var2) / 1000.0F
            );
            return true;
         default:
            return false;
      }
   }
}
