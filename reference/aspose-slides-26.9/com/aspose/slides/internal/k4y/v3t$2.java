package com.aspose.slides.internal.k4y;

class v3t$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final v3t l6;

   v3t$2(v3t var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (v3t.n5().n5(this.n5.n3())) {
         case 1:
            v3t.n5(this.l6, new s2b(this.n5));
            break;
         case 2:
            s2b var2 = new s2b(this.n5);
            v3t.n5(this.l6).addItem(var2);
            break;
         default:
            return false;
      }

      return true;
   }
}
