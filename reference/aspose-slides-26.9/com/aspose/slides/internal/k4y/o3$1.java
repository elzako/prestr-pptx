package com.aspose.slides.internal.k4y;

class o3$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final o3 l6;

   o3$1(o3 var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (o3.l6().n5(this.n5.n3())) {
         case 0:
            w2v var2 = new w2v(this.n5);
            o3.n5(this.l6).addItem(new g7("relSizeAnchor", var2));
            break;
         case 1:
            o7p var3 = new o7p(this.n5);
            o3.n5(this.l6).addItem(new g7("absSizeAnchor", var3));
            break;
         default:
            return false;
      }

      return true;
   }
}
