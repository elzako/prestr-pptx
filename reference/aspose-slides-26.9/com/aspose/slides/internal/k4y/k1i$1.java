package com.aspose.slides.internal.k4y;

class k1i$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final k1i l6;

   k1i$1(k1i var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (k1i.l6().n5(this.n5.n3())) {
         case 0:
            String var2 = this.n5.u3("val");
            long var3 = com.aspose.slides.ms.System.Xml.f4.t9(var2) & 4294967295L;
            k1i.n5(this.l6).addItem(var3);
            return true;
         default:
            return false;
      }
   }
}
