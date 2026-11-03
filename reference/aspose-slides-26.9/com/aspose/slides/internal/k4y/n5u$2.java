package com.aspose.slides.internal.k4y;

class n5u$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final n5u l6;

   n5u$2(n5u var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (n5u.h0().n5(this.n5.n3())) {
         case 1:
            n5u.n5(this.l6, new b8c(this.n5));
            break;
         case 2:
            n5u.n5(this.l6, new g7("noFill", new u4k(this.n5)));
            break;
         case 3:
            n5u.n5(this.l6, new g7("solidFill", new e2l(this.n5)));
            break;
         case 4:
            n5u.n5(this.l6, new g7("gradFill", new j2p(this.n5)));
            break;
         case 5:
            n5u.n5(this.l6, new g7("blipFill", new e3(this.n5)));
            break;
         case 6:
            n5u.n5(this.l6, new g7("pattFill", new n9q(this.n5)));
            break;
         case 7:
            n5u.n5(this.l6, new g7("grpFill", new r6i(this.n5)));
            break;
         case 8:
            n5u.l6(this.l6, new g7("effectLst", new o9b(this.n5)));
            break;
         case 9:
            n5u.l6(this.l6, new g7("effectDag", new f8y(this.n5)));
            break;
         case 10:
            n5u.n5(this.l6, new h6l(this.n5));
            break;
         case 11:
            n5u.n5(this.l6, new l8r(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
