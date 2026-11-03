package com.aspose.slides.internal.k4y;

class a8r$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final a8r l6;

   a8r$2(a8r var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (a8r.k5().n5(this.n5.n3())) {
         case 3:
            x8m var2 = new x8m(this.n5);
            a8r.n5(this.l6).addItem(new g7("list-level-style-number", var2));
            break;
         case 4:
            v8w var3 = new v8w(this.n5);
            a8r.n5(this.l6).addItem(new g7("list-level-style-bullet", var3));
            break;
         case 5:
            b5c var4 = new b5c(this.n5);
            a8r.n5(this.l6).addItem(new g7("list-level-style-image", var4));
            break;
         default:
            return false;
      }

      return true;
   }
}
