package com.aspose.slides.internal.k4y;

class f1j$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final f1j l6;

   f1j$2(f1j var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (f1j.h0().n5(this.n5.n3())) {
         case 12:
            u1v var2 = new u1v(this.n5);
            f1j.n5(this.l6).addItem(var2);
            break;
         case 13:
            f1j.n5(this.l6, new l0k(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
