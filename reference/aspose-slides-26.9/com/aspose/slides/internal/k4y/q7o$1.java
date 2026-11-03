package com.aspose.slides.internal.k4y;

class q7o$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final q7o l6;

   q7o$1(q7o var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (q7o.u3().n5(this.n5.n3())) {
         case 0:
            k8w var2 = new k8w(this.n5);
            q7o.n5(this.l6).addItem(var2);
            break;
         case 1:
            q7o.n5(this.l6, new g7("gridLayout", new b3u(this.n5)));
            break;
         case 2:
            q7o.n5(this.l6, new g7("fixedLayout", new w9z(this.n5)));
            break;
         case 3:
            q7o.n5(this.l6, new y1g(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
