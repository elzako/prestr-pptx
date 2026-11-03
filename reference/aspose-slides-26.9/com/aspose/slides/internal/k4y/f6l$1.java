package com.aspose.slides.internal.k4y;

class f6l$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final f6l l6;

   f6l$1(f6l var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (f6l.l6().n5(this.n5.n3())) {
         case 0:
            z1y var2 = new z1y(this.n5);
            f6l.n5(this.l6).addItem(new g7("twoCellAnchor", var2));
            break;
         case 1:
            r6p var3 = new r6p(this.n5);
            f6l.n5(this.l6).addItem(new g7("oneCellAnchor", var3));
            break;
         case 2:
            t0g var4 = new t0g(this.n5);
            f6l.n5(this.l6).addItem(new g7("absoluteAnchor", var4));
            break;
         default:
            return false;
      }

      return true;
   }
}
