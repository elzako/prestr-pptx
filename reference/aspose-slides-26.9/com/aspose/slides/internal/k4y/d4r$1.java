package com.aspose.slides.internal.k4y;

class d4r$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final d4r l6;

   d4r$1(d4r var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (d4r.u3().n5(this.n5.n3())) {
         case 3:
            String var3 = this.n5.u3("val");
            d4r.n5(this.l6, new g7("binSize", b3.e2(var3)));
            break;
         case 4:
            String var2 = this.n5.u3("val");
            d4r.n5(this.l6, new g7("binCount", com.aspose.slides.ms.System.Xml.f4.t9(var2) & 4294967295L));
            break;
         default:
            return false;
      }

      return true;
   }
}
