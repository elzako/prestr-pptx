package com.aspose.slides.internal.k4y;

class e8$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final e8 l6;

   e8$1(e8 var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (e8.k5().n5(this.n5.n3())) {
         case 0:
            s1e var2 = new s1e(this.n5);
            e8.n5(this.l6).addItem(var2);
            return true;
         default:
            return false;
      }
   }
}
