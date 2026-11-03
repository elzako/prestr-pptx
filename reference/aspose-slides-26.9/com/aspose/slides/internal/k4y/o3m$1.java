package com.aspose.slides.internal.k4y;

class o3m$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final o3m l6;

   o3m$1(o3m var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (o3m.u9().n5(this.n5.n3())) {
         case 0:
            o3m.n5(this.l6, new e5s(this.n5));
            break;
         case 1:
            x1i var2 = new x1i(this.n5);
            o3m.n5(this.l6).addItem(var2);
            break;
         case 2:
            o3m.n5(this.l6, new h6m(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
