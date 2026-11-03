package com.aspose.slides.internal.k4y;

class r9o$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final r9o l6;

   r9o$1(r9o var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (r9o.a6().n5(this.n5.n3())) {
         case 0:
            p5t var2 = new p5t(this.n5);
            r9o.n5(this.l6).addItem(var2);
            break;
         case 1:
            r9o.n5(this.l6, new w4m(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
