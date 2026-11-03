package com.aspose.slides.internal.k4y;

class b4h$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final b4h l6;

   b4h$2(b4h var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (b4h.h0().n5(this.n5.n3())) {
         case 3:
            u5h var2 = new u5h(this.n5);
            b4h.n5(this.l6).addItem(var2);
            break;
         case 4:
            r6r var3 = new r6r(this.n5);
            b4h.l6(this.l6).addItem(new g7("actionData", var3));
            break;
         case 5:
            i5q var4 = new i5q(this.n5);
            b4h.l6(this.l6).addItem(new g7("actionDataGroup", var4));
            break;
         default:
            return false;
      }

      return true;
   }
}
