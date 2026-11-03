package com.aspose.slides.internal.k4y;

class q6r$1 extends b3$n5 {
   // $VF: synthetic field
   final q6r n5;

   q6r$1(q6r var1) {
      this.n5 = var1;
   }

   @Override
   public boolean n5(String var1, String var2) {
      switch (q6r.n5().n5(var1)) {
         case 0:
            q6r.n5(
               this.n5,
               var2.charAt(var2.length() - 1) == '%'
                  ? (float)com.aspose.slides.ms.System.Xml.f4.k7(com.aspose.slides.ms.System.d1.l6(var2, 0, var2.length() - 1))
                  : (float)com.aspose.slides.ms.System.Xml.f4.t9(var2) / 1000.0F
            );
            return true;
         case 1:
            q6r.l6(
               this.n5,
               var2.charAt(var2.length() - 1) == '%'
                  ? (float)com.aspose.slides.ms.System.Xml.f4.k7(com.aspose.slides.ms.System.d1.l6(var2, 0, var2.length() - 1))
                  : (float)com.aspose.slides.ms.System.Xml.f4.t9(var2) / 1000.0F
            );
            return true;
         case 2:
            q6r.k5(this.n5, com.aspose.slides.ms.System.Xml.f4.e2(var2) / 60000.0F);
            return true;
         case 3:
            q6r.u3(this.n5, com.aspose.slides.ms.System.Xml.f4.e2(var2) / 60000.0F);
            return true;
         case 4:
            q6r.n5(this.n5, com.aspose.slides.ms.System.Xml.f4.k7(var2) / 12700.0);
            return true;
         case 5:
            q6r.l6(this.n5, com.aspose.slides.ms.System.Xml.f4.k7(var2) / 12700.0);
            return true;
         default:
            return false;
      }
   }
}
