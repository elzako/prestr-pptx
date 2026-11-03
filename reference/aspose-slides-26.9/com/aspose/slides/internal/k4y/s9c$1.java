package com.aspose.slides.internal.k4y;

class s9c$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final s9c l6;

   s9c$1(s9c var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (s9c.u3().n5(this.n5.n3())) {
         case 0:
            p1s var2 = new p1s(this.n5);
            s9c.n5(this.l6).addItem(var2);
            break;
         case 1:
            s9c.n5(this.l6, new h3k(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
