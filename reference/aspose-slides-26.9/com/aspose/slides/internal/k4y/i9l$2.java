package com.aspose.slides.internal.k4y;

class i9l$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final i9l l6;

   i9l$2(i9l var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (i9l.u3().n5(this.n5.n3())) {
         case 1:
            k3i var2 = new k3i(this.n5);
            i9l.n5(this.l6).addItem(var2);
            break;
         case 2:
            i9l.n5(this.l6, new a6k(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
