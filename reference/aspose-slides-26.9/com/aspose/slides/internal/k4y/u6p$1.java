package com.aspose.slides.internal.k4y;

class u6p$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final u6p l6;

   u6p$1(u6p var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (u6p.k5().n5(this.n5.n3())) {
         case 0:
            h3d var2 = new h3d(this.n5);
            u6p.n5(this.l6).addItem(var2);
            return true;
         default:
            return false;
      }
   }
}
