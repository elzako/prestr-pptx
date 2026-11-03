package com.aspose.slides.internal.k4y;

class a4j$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final a4j l6;

   a4j$1(a4j var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (a4j.n5().n5(this.n5.n3())) {
         case 0:
            i2t var2 = new i2t(this.n5);
            a4j.n5(this.l6).addItem(var2);
            return true;
         default:
            return false;
      }
   }
}
