package com.aspose.slides.internal.k4y;

class u5b$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final u5b l6;

   u5b$1(u5b var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (u5b.l6().n5(this.n5.n3())) {
         case 0:
            u5b.n5(this.l6, new b8n(this.n5));
            return true;
         case 1:
            l6j var2 = new l6j(this.n5);
            u5b.n5(this.l6).addItem(var2);
            return true;
         case 2:
            u5b.n5(this.l6, new a9t(this.n5));
            return true;
         default:
            return false;
      }
   }
}
