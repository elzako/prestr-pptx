package com.aspose.slides.internal.k4y;

class m3z$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final m3z l6;

   m3z$2(m3z var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (m3z.h0().n5(this.n5.n3())) {
         case 3:
            m3z.n5(this.l6, new a6g(this.n5));
            break;
         case 4:
            m3z.n5(this.l6, new u2l(this.n5));
            break;
         case 5:
            g1h var2 = new g1h(this.n5);
            m3z.n5(this.l6).addItem(var2);
            break;
         default:
            return false;
      }

      return true;
   }
}
