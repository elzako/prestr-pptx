package com.aspose.slides.internal.k4y;

class u8n$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final u8n l6;

   u8n$1(u8n var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (u8n.n5().n5(this.n5.n3())) {
         case 0:
            t4y var2 = new t4y(this.n5);
            u8n.n5(this.l6).addItem(var2);
            return true;
         default:
            return false;
      }
   }
}
