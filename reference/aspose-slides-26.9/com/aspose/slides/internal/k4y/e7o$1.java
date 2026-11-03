package com.aspose.slides.internal.k4y;

class e7o$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final e7o l6;

   e7o$1(e7o var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (e7o.a6().n5(this.n5.n3())) {
         case 0:
            s1k var2 = new s1k(this.n5);
            e7o.n5(this.l6).addItem(new g7("graphicFrame", var2));
            return true;
         default:
            return false;
      }
   }
}
