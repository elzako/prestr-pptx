package com.aspose.slides.internal.k4y;

class p2m$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final p2m l6;

   p2m$2(p2m var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (p2m.k5().n5(this.n5.n3())) {
         case 1:
            t4d var2 = new t4d(this.n5);
            p2m.n5(this.l6).addItem(var2);
            return true;
         default:
            return false;
      }
   }
}
