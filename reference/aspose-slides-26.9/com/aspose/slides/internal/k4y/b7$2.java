package com.aspose.slides.internal.k4y;

class b7$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final b7 l6;

   b7$2(b7 var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (b7.n5().n5(this.n5.n3())) {
         case 4:
            b8 var2 = new b8(this.n5);
            b7.n5(this.l6).addItem(var2);
            break;
         case 5:
            s6 var3 = new s6(this.n5);
            b7.l6(this.l6).addItem(var3);
            break;
         default:
            return false;
      }

      return true;
   }
}
