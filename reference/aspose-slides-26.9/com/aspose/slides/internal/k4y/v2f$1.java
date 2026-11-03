package com.aspose.slides.internal.k4y;

class v2f$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final v2f l6;

   v2f$1(v2f var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (v2f.n5().n5(this.n5.n3())) {
         case 0:
            h5a var2 = new h5a(this.n5);
            v2f.n5(this.l6).addItem(new g7("rPr", var2));
            return true;
         default:
            return false;
      }
   }
}
