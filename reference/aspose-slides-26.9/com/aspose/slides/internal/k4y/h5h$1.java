package com.aspose.slides.internal.k4y;

class h5h$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final h5h l6;

   h5h$1(h5h var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (h5h.l6().n5(this.n5.n3())) {
         case 0:
            m7f var2 = new m7f(this.n5);
            h5h.n5(this.l6).addItem(new g7("bldP", var2));
            break;
         case 1:
            k8b var3 = new k8b(this.n5);
            h5h.n5(this.l6).addItem(new g7("bldDgm", var3));
            break;
         case 2:
            m0m var4 = new m0m(this.n5);
            h5h.n5(this.l6).addItem(new g7("bldOleChart", var4));
            break;
         case 3:
            l0n var5 = new l0n(this.n5);
            h5h.n5(this.l6).addItem(new g7("bldGraphic", var5));
            break;
         default:
            return false;
      }

      return true;
   }
}
