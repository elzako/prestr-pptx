package com.aspose.slides.internal.k4y;

class l0n$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final l0n l6;

   l0n$2(l0n var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (l0n.l6().n5(this.n5.n3())) {
         case 3:
            l0n.n5(this.l6, new g7("bldAsOne", new e0j(this.n5)));
            break;
         case 4:
            l0n.n5(this.l6, new g7("bldSub", new g3(this.n5)));
            break;
         default:
            return false;
      }

      return true;
   }
}
