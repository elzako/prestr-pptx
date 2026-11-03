package com.aspose.slides.internal.k4y;

class v4b$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final v4b l6;

   v4b$1(v4b var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (v4b.l6().n5(this.n5.n3())) {
         case 0:
            j7d var2 = new j7d(this.n5);
            v4b.n5(this.l6).addItem(var2);
            return true;
         default:
            return false;
      }
   }
}
