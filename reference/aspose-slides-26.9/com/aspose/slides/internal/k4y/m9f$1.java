package com.aspose.slides.internal.k4y;

class m9f$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final m9f l6;

   m9f$1(m9f var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (m9f.n5().n5(this.n5.n3())) {
         case 0:
            m9f.n5(this.l6, new y4q(this.n5));
            break;
         case 1:
            m9f.l6(this.l6, new y4q(this.n5));
            break;
         case 2:
            m9f.n5(this.l6, new a5j(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
