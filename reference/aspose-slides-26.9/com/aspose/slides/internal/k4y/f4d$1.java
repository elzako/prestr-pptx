package com.aspose.slides.internal.k4y;

class f4d$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final f4d l6;

   f4d$1(f4d var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (f4d.n5().n5(this.n5.n3())) {
         case 0:
            f4d.n5(this.l6, new y4q(this.n5));
            break;
         case 1:
            a4m var2 = new a4m(this.n5);
            f4d.n5(this.l6).addItem(var2);
            break;
         default:
            return false;
      }

      return true;
   }
}
