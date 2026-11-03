package com.aspose.slides.internal.k4y;

class e8a$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final e8a l6;

   e8a$1(e8a var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (e8a.u3().n5(this.n5.n3())) {
         case 0:
            e8a.n5(this.l6, new l3t(this.n5));
            break;
         case 1:
            k6w var2 = new k6w(this.n5);
            e8a.n5(this.l6).addItem(var2);
            break;
         default:
            return false;
      }

      return true;
   }
}
