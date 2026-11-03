package com.aspose.slides.internal.k4y;

class k1d$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final k1d l6;

   k1d$2(k1d var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (k1d.k5().n5(this.n5.n3())) {
         case 1:
            k1d.n5(this.l6, new g7("noFill", new u4k(this.n5)));
            break;
         case 2:
            k1d.n5(this.l6, new g7("solidFill", new e2l(this.n5)));
            break;
         case 3:
            k1d.n5(this.l6, new g7("gradFill", new j2p(this.n5)));
            break;
         case 4:
            k1d.n5(this.l6, new g7("blipFill", new e3(this.n5)));
            break;
         case 5:
            k1d.n5(this.l6, new g7("pattFill", new n9q(this.n5)));
            break;
         case 6:
            k1d.n5(this.l6, new g7("grpFill", new r6i(this.n5)));
            break;
         default:
            return false;
      }

      return true;
   }
}
