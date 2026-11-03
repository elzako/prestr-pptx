package com.aspose.slides.internal.k4y;

class d7u$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final d7u l6;

   d7u$2(d7u var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (d7u.n3().n5(this.n5.n3())) {
         case 7:
            d7u.n5(this.l6, new g7("noFill", new u4k(this.n5)));
            break;
         case 8:
            d7u.n5(this.l6, new g7("solidFill", new e2l(this.n5)));
            break;
         case 9:
            d7u.n5(this.l6, new g7("gradFill", new j2p(this.n5)));
            break;
         case 10:
            d7u.n5(this.l6, new g7("blipFill", new e3(this.n5)));
            break;
         case 11:
            d7u.n5(this.l6, new g7("pattFill", new n9q(this.n5)));
            break;
         case 12:
            d7u.n5(this.l6, new g7("grpFill", new r6i(this.n5)));
            break;
         case 13:
            d7u.l6(this.l6, new g7("effectLst", new o9b(this.n5)));
            break;
         case 14:
            d7u.l6(this.l6, new g7("effectDag", new f8y(this.n5)));
            break;
         case 15:
            d7u.k5(this.l6, new g7("tableStyle", new a1k(this.n5)));
            break;
         case 16:
            this.n5.u9();
            d7u.k5(this.l6, new g7("tableStyleId", new com.aspose.slides.ms.System.o0(this.n5.z1())));
            break;
         case 17:
            d7u.n5(this.l6, new l8r(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
