package com.aspose.slides.internal.k4y;

class k4$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final k4 l6;

   k4$2(k4 var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (k4.u3().n5(this.n5.n3())) {
         case 1:
            a1k var2 = new a1k(this.n5);
            k4.n5(this.l6).addItem(var2);
            return true;
         default:
            return false;
      }
   }
}
