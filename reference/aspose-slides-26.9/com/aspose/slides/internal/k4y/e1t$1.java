package com.aspose.slides.internal.k4y;

class e1t$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final e1t l6;

   e1t$1(e1t var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (e1t.s7().n5(this.n5.n3())) {
         case 0:
            e1t.n5(this.l6, new q5v(this.n5));
            break;
         case 1:
            e1t.n5(this.l6, new u4o(this.n5));
            break;
         case 2:
            e1t.l6(this.l6, new u4o(this.n5));
            break;
         case 3:
            e1t.k5(this.l6, new u4o(this.n5));
            break;
         case 4:
            e1t.u3(this.l6, new u4o(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
