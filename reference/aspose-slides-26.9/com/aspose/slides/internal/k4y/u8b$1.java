package com.aspose.slides.internal.k4y;

class u8b$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final u8b l6;

   u8b$1(u8b var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (u8b.l6().n5(this.n5.n3())) {
         case 0:
            f7x var2 = new f7x(this.n5);
            u8b.n5(this.l6).addItem(var2);
            return true;
         default:
            return false;
      }
   }
}
