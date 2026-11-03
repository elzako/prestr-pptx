package com.aspose.slides.internal.k4y;

class g1i$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final g1i l6;

   g1i$2(g1i var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (g1i.k5().n5(this.n5.n3())) {
         case 1:
            o8n var2 = new o8n(this.n5);
            g1i.n5(this.l6).addItem(new g7("numDim", var2));
            break;
         case 2:
            a9k var3 = new a9k(this.n5);
            g1i.n5(this.l6).addItem(new g7("strDim", var3));
            break;
         case 3:
            g1i.n5(this.l6, new h6m(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
