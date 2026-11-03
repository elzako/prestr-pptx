package com.aspose.slides.internal.k4y;

class p4t$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final p4t l6;

   p4t$1(p4t var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (p4t.u9().n5(this.n5.n3())) {
         case 0:
            p4t.n5(this.l6, new b8n(this.n5));
            break;
         case 1:
            l6j var2 = new l6j(this.n5);
            p4t.n5(this.l6).addItem(var2);
            break;
         case 2:
            p4t.n5(this.l6, new a9t(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
