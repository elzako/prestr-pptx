package com.aspose.slides.internal.k4y;

class r1k$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final r1k l6;

   r1k$1(r1k var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (r1k.l6().n5(this.n5.n3())) {
         case 0:
            i7l var2 = new i7l(this.n5);
            r1k.n5(this.l6).addItem(var2);
            return true;
         default:
            return false;
      }
   }
}
