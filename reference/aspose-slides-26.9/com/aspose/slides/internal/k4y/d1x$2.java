package com.aspose.slides.internal.k4y;

class d1x$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final d1x l6;

   d1x$2(d1x var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (d1x.u3().n5(this.n5.n3())) {
         case 2:
            d1x.n5(this.l6, new g7("tgtEl", new s2a(this.n5)));
            break;
         case 3:
            d1x.n5(this.l6, new g7("tn", new i1s(this.n5)));
            break;
         case 4:
            d1x.n5(this.l6, new g7("rtn", new v0e(this.n5)));
            break;
         default:
            return false;
      }

      return true;
   }
}
