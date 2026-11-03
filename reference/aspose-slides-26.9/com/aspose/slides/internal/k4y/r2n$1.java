package com.aspose.slides.internal.k4y;

class r2n$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final r2n l6;

   r2n$1(r2n var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (r2n.k5().n5(this.n5.n3())) {
         case 0:
            y2o var2 = new y2o(this.n5);
            r2n.n5(this.l6).addItem(var2);
            return true;
         default:
            return false;
      }
   }
}
