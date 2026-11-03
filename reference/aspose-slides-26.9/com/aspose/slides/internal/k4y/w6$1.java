package com.aspose.slides.internal.k4y;

class w6$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final w6 l6;

   w6$1(w6 var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (w6.k5().n5(this.n5.n3())) {
         case 0:
            w6.n5(this.l6, new g7("noFill", new u4k(this.n5)));
            break;
         case 1:
            w6.n5(this.l6, new g7("solidFill", new e2l(this.n5)));
            break;
         case 2:
            w6.n5(this.l6, new g7("gradFill", new j2p(this.n5)));
            break;
         case 3:
            w6.n5(this.l6, new g7("blipFill", new e3(this.n5)));
            break;
         case 4:
            w6.n5(this.l6, new g7("pattFill", new n9q(this.n5)));
            break;
         case 5:
            w6.n5(this.l6, new g7("grpFill", new r6i(this.n5)));
            break;
         case 6:
            w6.l6(this.l6, new g7("effectLst", new o9b(this.n5)));
            break;
         case 7:
            w6.l6(this.l6, new g7("effectDag", new f8y(this.n5)));
            break;
         default:
            return false;
      }

      return true;
   }
}
