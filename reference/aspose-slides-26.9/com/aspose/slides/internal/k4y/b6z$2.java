package com.aspose.slides.internal.k4y;

class b6z$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final b6z l6;

   b6z$2(b6z var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (b6z.u3().n5(this.n5.n3())) {
         case 2:
            b6z.n5(this.l6, new g7("tmAbs", new q4e(this.n5)));
            break;
         case 3:
            b6z.n5(this.l6, new g7("tmPct", new u6e(this.n5)));
            break;
         default:
            return false;
      }

      return true;
   }
}
