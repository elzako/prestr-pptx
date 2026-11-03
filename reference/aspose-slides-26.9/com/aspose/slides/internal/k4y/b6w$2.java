package com.aspose.slides.internal.k4y;

class b6w$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final b6w l6;

   b6w$2(b6w var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (b6w.n5().n5(this.n5.n3())) {
         case 2:
            g8a var2 = new g8a(this.n5);
            b6w.n5(this.l6).addItem(var2);
            break;
         case 3:
            b6w.n5(this.l6, new l0k(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
