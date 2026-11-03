package com.aspose.slides.internal.k4y;

class m6c$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final m6c l6;

   m6c$1(m6c var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (m6c.a6().n5(this.n5.n3())) {
         case 0:
            m6c.n5(this.l6, new r1g(this.n5));
            break;
         case 1:
            m6c.n5(this.l6, new s0m(this.n5));
            break;
         case 2:
            m6c.l6(this.l6, new s0m(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
