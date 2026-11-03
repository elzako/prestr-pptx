package com.aspose.slides.internal.k4y;

class e5a$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final e5a l6;

   e5a$1(e5a var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (e5a.k5().n5(this.n5.n3())) {
         case 0:
            t4r var2 = new t4r(this.n5);
            e5a.n5(this.l6).addItem(var2);
            return true;
         default:
            return false;
      }
   }
}
