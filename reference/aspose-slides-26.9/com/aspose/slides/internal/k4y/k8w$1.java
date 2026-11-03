package com.aspose.slides.internal.k4y;

class k8w$1 extends b3$n5 {
   // $VF: synthetic field
   final k8w n5;

   k8w$1(k8w var1) {
      this.n5 = var1;
   }

   @Override
   public boolean n5(String var1, String var2) {
      switch (k8w.t2().n5(var1)) {
         case 0:
            k8w.n5(this.n5, new com.aspose.slides.ms.System.o0(var2));
            return true;
         case 1:
            k8w.n5(this.n5, var2);
            return true;
         case 2:
            k8w.l6(this.n5, var2);
            return true;
         case 3:
            k8w.n5(
               this.n5,
               var2.charAt(var2.length() - 1) == '%'
                  ? (float)com.aspose.slides.ms.System.Xml.f4.k7(com.aspose.slides.ms.System.d1.l6(var2, 0, var2.length() - 1))
                  : (float)com.aspose.slides.ms.System.Xml.f4.t9(var2) / 1000.0F
            );
            return true;
         case 4:
            k8w.l6(
               this.n5,
               var2.charAt(var2.length() - 1) == '%'
                  ? (float)com.aspose.slides.ms.System.Xml.f4.k7(com.aspose.slides.ms.System.d1.l6(var2, 0, var2.length() - 1))
                  : (float)com.aspose.slides.ms.System.Xml.f4.t9(var2) / 1000.0F
            );
            return true;
         case 5:
            k8w.k5(
               this.n5,
               var2.charAt(var2.length() - 1) == '%'
                  ? (float)com.aspose.slides.ms.System.Xml.f4.k7(com.aspose.slides.ms.System.d1.l6(var2, 0, var2.length() - 1))
                  : (float)com.aspose.slides.ms.System.Xml.f4.t9(var2) / 1000.0F
            );
            return true;
         case 6:
            k8w.u3(
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
