package com.aspose.slides.internal.k4y;

class r6r$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final r6r l6;

   r6r$2(r6r var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (r6r.a6().n5(this.n5.n3())) {
         case 3:
            o3x var2 = new o3x(this.n5);
            r6r.n5(this.l6).addItem(new g7("trace", var2));
            break;
         case 4:
            l5u var3 = new l5u(this.n5);
            r6r.n5(this.l6).addItem(new g7("traceView", var3));
            break;
         default:
            return false;
      }

      return true;
   }
}
