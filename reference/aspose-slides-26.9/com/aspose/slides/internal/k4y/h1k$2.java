package com.aspose.slides.internal.k4y;

class h1k$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final h1k l6;

   h1k$2(h1k var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (h1k.a6().n5(this.n5.n3())) {
         case 3:
            h1k.n5(this.l6, new z3s(this.n5));
            break;
         case 4:
            r7g var2 = new r7g(this.n5);
            h1k.n5(this.l6).addItem(new g7("actionGroup", var2));
            break;
         case 5:
            b4h var3 = new b4h(this.n5);
            h1k.n5(this.l6).addItem(new g7("action", var3));
            break;
         default:
            return false;
      }

      return true;
   }
}
