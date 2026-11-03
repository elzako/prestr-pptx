package com.aspose.slides.internal.k4y;

class m0y$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final m0y l6;

   m0y$2(m0y var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (m0y.n5().n5(this.n5.n3())) {
         case 4:
            y7i var2 = new y7i(this.n5);
            m0y.n5(this.l6).addItem(var2);
            break;
         case 5:
            m0y.n5(this.l6, new l0k(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
