package com.aspose.slides.internal.k4y;

class f1c$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final f1c l6;

   f1c$1(f1c var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (f1c.l6().n5(this.n5.n3())) {
         case 0:
            u4k var2 = new u4k(this.n5);
            f1c.n5(this.l6).addItem(new g7("noFill", var2));
            break;
         case 1:
            e2l var3 = new e2l(this.n5);
            f1c.n5(this.l6).addItem(new g7("solidFill", var3));
            break;
         case 2:
            j2p var4 = new j2p(this.n5);
            f1c.n5(this.l6).addItem(new g7("gradFill", var4));
            break;
         case 3:
            e3 var5 = new e3(this.n5);
            f1c.n5(this.l6).addItem(new g7("blipFill", var5));
            break;
         case 4:
            n9q var6 = new n9q(this.n5);
            f1c.n5(this.l6).addItem(new g7("pattFill", var6));
            break;
         case 5:
            r6i var7 = new r6i(this.n5);
            f1c.n5(this.l6).addItem(new g7("grpFill", var7));
            break;
         default:
            return false;
      }

      return true;
   }
}
