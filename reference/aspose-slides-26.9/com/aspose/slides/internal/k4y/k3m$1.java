package com.aspose.slides.internal.k4y;

class k3m$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final k3m l6;

   k3m$1(k3m var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (k3m.n5().n5(this.n5.n3())) {
         case 0:
            l6g var2 = new l6g(this.n5);
            k3m.n5(this.l6).addItem(var2);
            break;
         case 1:
            k1x var3 = new k1x(this.n5);
            k3m.l6(this.l6).addItem(var3);
            break;
         default:
            return false;
      }

      return true;
   }
}
