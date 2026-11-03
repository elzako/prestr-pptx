package com.aspose.slides.internal.k4y;

class p0t$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final p0t l6;

   p0t$1(p0t var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (p0t.n5().n5(this.n5.n3())) {
         case 0:
            p0t.n5(this.l6, new s4r(this.n5));
            break;
         case 1:
            p4z var2 = new p4z(this.n5);
            p0t.n5(this.l6).addItem(var2);
            break;
         default:
            return false;
      }

      return true;
   }
}
