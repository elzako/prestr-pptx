package com.aspose.slides.internal.k4y;

class r6e$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final r6e l6;

   r6e$1(r6e var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (r6e.n5().n5(this.n5.n3())) {
         case 0:
            y7q var2 = new y7q(this.n5);
            r6e.n5(this.l6).addItem(new g7("show-shape", var2));
            break;
         case 1:
            k8i var3 = new k8i(this.n5);
            r6e.n5(this.l6).addItem(new g7("show-text", var3));
            break;
         case 2:
            u5v var4 = new u5v(this.n5);
            r6e.n5(this.l6).addItem(new g7("hide-shape", var4));
            break;
         case 3:
            q3m var5 = new q3m(this.n5);
            r6e.n5(this.l6).addItem(new g7("hide-text", var5));
            break;
         case 4:
            f4p var6 = new f4p(this.n5);
            r6e.n5(this.l6).addItem(new g7("dim", var6));
            break;
         case 5:
            i5o var7 = new i5o(this.n5);
            r6e.n5(this.l6).addItem(new g7("play", var7));
            break;
         default:
            return false;
      }

      return true;
   }
}
