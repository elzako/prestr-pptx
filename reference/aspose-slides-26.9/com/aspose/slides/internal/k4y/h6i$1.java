package com.aspose.slides.internal.k4y;

class h6i$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final h6i l6;

   h6i$1(h6i var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (h6i.l6().n5(this.n5.n3())) {
         case 0:
            j0v var2 = new j0v(this.n5);
            h6i.n5(this.l6).addItem(new g7("soft-page-break", var2));
            break;
         case 1:
            w1x var3 = new w1x(this.n5);
            h6i.n5(this.l6).addItem(new g7("table-row", var3));
            break;
         default:
            return false;
      }

      return true;
   }
}
