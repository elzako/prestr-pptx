package com.aspose.slides.internal.k4y;

class m1k$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final m1k l6;

   m1k$1(m1k var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (m1k.u3().n5(this.n5.n3())) {
         case 0:
            m1k.n5(this.l6, new w0l(this.n5));
            break;
         case 1:
            m1k.n5(this.l6, new w3q(this.n5));
            break;
         case 2:
            m1k.n5(this.l6, new c5y(this.n5));
            break;
         case 3:
            m1k.n5(this.l6, new g4t(this.n5));
            break;
         case 4:
            m1k.n5(this.l6, new p2b(this.n5));
            break;
         case 5:
            m1k.n5(this.l6, new b1w(this.n5));
            break;
         case 6:
            m1k.n5(this.l6, new l0k(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
