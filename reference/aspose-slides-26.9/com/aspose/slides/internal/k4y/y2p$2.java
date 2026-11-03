package com.aspose.slides.internal.k4y;

class y2p$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final y2p l6;

   y2p$2(y2p var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (y2p.n5().n5(this.n5.n3())) {
         case 1:
            y2p var2 = new y2p(this.n5);
            y2p.n5(this.l6).addItem(new g7("table-column-group", var2));
            break;
         case 2:
            v0q var3 = new v0q(this.n5);
            y2p.n5(this.l6).addItem(new g7("table-columns", var3));
            break;
         case 3:
            l5h var4 = new l5h(this.n5);
            y2p.n5(this.l6).addItem(new g7("table-column", var4));
            break;
         case 4:
            w2c var5 = new w2c(this.n5);
            y2p.n5(this.l6).addItem(new g7("table-header-columns", var5));
            break;
         default:
            return false;
      }

      return true;
   }
}
