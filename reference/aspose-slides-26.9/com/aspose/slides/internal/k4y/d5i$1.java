package com.aspose.slides.internal.k4y;

class d5i$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final d5i l6;

   d5i$1(d5i var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (d5i.l6().n5(this.n5.n3())) {
         case 0:
            d5i.n5(this.l6, new g7("stSnd", new q6c(this.n5)));
            break;
         case 1:
            d5i.n5(this.l6, new g7("endSnd", new e0j(this.n5)));
            break;
         default:
            return false;
      }

      return true;
   }
}
