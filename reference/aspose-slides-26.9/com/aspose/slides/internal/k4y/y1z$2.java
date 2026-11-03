package com.aspose.slides.internal.k4y;

class y1z$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final y1z l6;

   y1z$2(y1z var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (y1z.e2().n5(this.n5.n3())) {
         case 45:
            j2l var2 = new j2l(this.n5);
            y1z.n5(this.l6).addItem(var2);
            break;
         case 46:
            m1f var3 = new m1f(this.n5);
            y1z.l6(this.l6).addItem(var3);
            break;
         default:
            return false;
      }

      return true;
   }
}
