package com.aspose.slides.internal.k4y;

class l7j$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final l7j l6;

   l7j$1(l7j var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (l7j.n5().n5(this.n5.n3())) {
         case 0:
            h1t var2 = new h1t(this.n5);
            l7j.n5(this.l6).addItem(new g7("property", var2));
            break;
         case 1:
            e8m var3 = new e8m(this.n5);
            l7j.n5(this.l6).addItem(new g7("list-property", var3));
            break;
         default:
            return false;
      }

      return true;
   }
}
