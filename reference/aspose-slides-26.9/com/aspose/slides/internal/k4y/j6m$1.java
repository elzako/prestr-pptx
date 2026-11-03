package com.aspose.slides.internal.k4y;

class j6m$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final j6m l6;

   j6m$1(j6m var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (j6m.k5().n5(this.n5.n3())) {
         case 0:
            p2y var2 = new p2y(this.n5);
            j6m.n5(this.l6).addItem(var2);
            return true;
         default:
            return false;
      }
   }
}
