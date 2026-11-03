package com.aspose.slides.internal.k4y;

class t2f$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final t2f l6;

   t2f$2(t2f var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (t2f.n5().n5(this.n5.n3())) {
         case 2:
            t2f.n5(this.l6, new q5p(this.n5));
            break;
         case 3:
            x1n var2 = new x1n(this.n5);
            t2f.n5(this.l6).addItem(var2);
            break;
         default:
            return false;
      }

      return true;
   }
}
