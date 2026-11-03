package com.aspose.slides.internal.k4y;

class m3e$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final m3e l6;

   m3e$2(m3e var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (m3e.t2().n5(this.n5.n3())) {
         case 3:
            m3e.n5(this.l6, new b9y(this.n5));
            break;
         case 4:
            m3e.n5(this.l6, new j3z(this.n5));
            break;
         case 5:
            m3e.n5(this.l6, new h6m(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
