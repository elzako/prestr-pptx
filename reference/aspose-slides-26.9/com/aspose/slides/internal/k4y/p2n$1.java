package com.aspose.slides.internal.k4y;

class p2n$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final p2n l6;

   p2n$1(p2n var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (p2n.u3().n5(this.n5.n3())) {
         case 0:
            p2n.n5(this.l6, new b8n(this.n5));
            break;
         case 1:
            p2n.n5(this.l6, new g7("delete", new c8q(this.n5)));
            break;
         case 2:
            p2n.n5(this.l6, new g7("txPr", new j3z(this.n5)));
            break;
         case 3:
            p2n.n5(this.l6, new a9t(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
