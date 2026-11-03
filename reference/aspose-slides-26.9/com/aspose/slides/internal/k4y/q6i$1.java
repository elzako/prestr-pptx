package com.aspose.slides.internal.k4y;

class q6i$1 extends b3$n5 {
   // $VF: synthetic field
   final q6i n5;

   q6i$1(q6i var1) {
      this.n5 = var1;
   }

   @Override
   public boolean n5(String var1, String var2) {
      switch (q6i.t2().n5(var1)) {
         case 0:
            q6i.n5(this.n5, b3.z1(var2));
            return true;
         case 1:
            q6i.n5(
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
