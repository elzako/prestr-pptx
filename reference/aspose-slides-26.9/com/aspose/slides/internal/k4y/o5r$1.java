package com.aspose.slides.internal.k4y;

class o5r$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final o5r l6;

   o5r$1(o5r var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (o5r.l6().n5(this.n5.n3())) {
         case 0:
            u9t var2 = new u9t(this.n5);
            o5r.n5(this.l6).addItem(new g7("master-page", var2));
            break;
         case 1:
            m4n var3 = new m4n(this.n5);
            o5r.n5(this.l6).addItem(new g7("handout-master", var3));
            break;
         case 2:
            g6b var4 = new g6b(this.n5);
            o5r.n5(this.l6).addItem(new g7("layer-set", var4));
            break;
         default:
            return false;
      }

      return true;
   }
}
