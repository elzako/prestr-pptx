package com.aspose.slides.internal.k4y;

class x1i$1 extends b3$n5 {
   // $VF: synthetic field
   final x1i n5;

   x1i$1(x1i var1) {
      this.n5 = var1;
   }

   @Override
   public boolean n5(String var1, String var2) {
      switch (x1i.t4().n5(var1)) {
         case 0:
            x1i.n5(this.n5, w5y.n5(var2));
            break;
         case 1:
            x1i.n5(this.n5, com.aspose.slides.ms.System.Xml.f4.t2(var2));
            break;
         case 2:
            x1i.n5(this.n5, com.aspose.slides.ms.System.Xml.f4.t9(var2) & 4294967295L);
            break;
         case 3:
            x1i.n5(this.n5, var2);
            break;
         case 4:
            x1i.l6(this.n5, com.aspose.slides.ms.System.Xml.f4.t9(var2) & 4294967295L);
            break;
         default:
            return false;
      }

      return true;
   }
}
