package com.aspose.slides.internal.k4y;

class g8v$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final g8v l6;

   g8v$1(g8v var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (g8v.n5().n5(this.n5.n3())) {
         case 0:
            g8v.n5(this.l6, new g7("noFill", new u4k(this.n5)));
            break;
         case 1:
            g8v.n5(this.l6, new g7("solidFill", new e2l(this.n5)));
            break;
         case 2:
            g8v.n5(this.l6, new g7("gradFill", new j2p(this.n5)));
            break;
         case 3:
            g8v.n5(this.l6, new g7("blipFill", new e3(this.n5)));
            break;
         case 4:
            g8v.n5(this.l6, new g7("pattFill", new n9q(this.n5)));
            break;
         case 5:
            g8v.n5(this.l6, new g7("grpFill", new r6i(this.n5)));
            break;
         default:
            return false;
      }

      return true;
   }
}
