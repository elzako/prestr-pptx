package com.aspose.slides.internal.k4y;

class t7p$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final t7p l6;

   t7p$1(t7p var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (t7p.k5().n5(this.n5.n3())) {
         case 0:
            t7p.n5(this.l6, new r5w(this.n5));
            break;
         case 1:
            t7p.n5(this.l6, new g7("effectLst", new o9b(this.n5)));
            break;
         case 2:
            t7p.n5(this.l6, new g7("effectDag", new f8y(this.n5)));
            break;
         default:
            return false;
      }

      return true;
   }
}
