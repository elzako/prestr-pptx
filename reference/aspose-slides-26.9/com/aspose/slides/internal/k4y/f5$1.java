package com.aspose.slides.internal.k4y;

class f5$1 extends b3$n5 {
   // $VF: synthetic field
   final f5 n5;

   f5$1(f5 var1) {
      this.n5 = var1;
   }

   @Override
   public boolean n5(String var1, String var2) {
      switch (f5.f2().n5(var1)) {
         case 0:
            f5.n5(
               this.n5,
               var2.charAt(var2.length() - 1) == '%'
                  ? (float)com.aspose.slides.ms.System.Xml.f4.k7(com.aspose.slides.ms.System.d1.l6(var2, 0, var2.length() - 1))
                  : (float)com.aspose.slides.ms.System.Xml.f4.t9(var2) / 1000.0F
            );
            return true;
         case 1:
            f5.n5(this.n5, com.aspose.slides.ms.System.Xml.f4.e2(var2));
            return true;
         case 2:
            f5.n5(this.n5, com.aspose.slides.ms.System.Xml.f4.t2(var2));
            return true;
         case 3:
            f5.l6(this.n5, com.aspose.slides.ms.System.Xml.f4.t2(var2));
            return true;
         case 4:
            f5.k5(this.n5, com.aspose.slides.ms.System.Xml.f4.t2(var2));
            return true;
         case 5:
            f5.u3(this.n5, com.aspose.slides.ms.System.Xml.f4.t2(var2));
            return true;
         case 6:
            f5.a6(this.n5, com.aspose.slides.ms.System.Xml.f4.t2(var2));
            return true;
         case 7:
            f5.u9(this.n5, com.aspose.slides.ms.System.Xml.f4.t2(var2));
            return true;
         case 8:
            f5.h0(this.n5, com.aspose.slides.ms.System.Xml.f4.t2(var2));
            return true;
         case 9:
            f5.c8(this.n5, com.aspose.slides.ms.System.Xml.f4.t2(var2));
            return true;
         case 10:
            f5.n5(this.n5, b3.q0(var2));
            return true;
         case 11:
            f5.n5(this.n5, var2);
            return true;
         default:
            return false;
      }
   }
}
