package com.aspose.slides.internal.k4y;

class r3q$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final r3q l6;

   r3q$2(r3q var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (r3q.k5().n5(this.n5.n3())) {
         case 7:
            r3q.n5(this.l6, new g7("bounds", new n4(this.n5)));
            break;
         case 8:
            r3q.n5(this.l6, new g7("effectOffsets", new p6r(this.n5)));
            break;
         case 9:
            r3q.n5(this.l6, new g7("preciseEffectOffsets", new e6a(this.n5)));
            break;
         case 10:
            r3q.n5(this.l6, new g7("xlAnchor", new u2w(this.n5)));
            break;
         default:
            return false;
      }

      return true;
   }
}
