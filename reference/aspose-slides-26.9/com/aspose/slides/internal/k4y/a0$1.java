package com.aspose.slides.internal.k4y;

class a0$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final a0 l6;

   a0$1(a0 var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (a0.k5().n5(this.n5.n3())) {
         case 0:
            r2s var2 = new r2s(this.n5);
            a0.n5(this.l6).addItem(var2);
            return true;
         default:
            return false;
      }
   }
}
