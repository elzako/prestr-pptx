package com.aspose.slides.internal.k4y;

class r4q$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final r4q l6;

   r4q$2(r4q var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (r4q.n5().n5(this.n5.n3())) {
         case 1:
            s0v var2 = new s0v(this.n5);
            r4q.n5(this.l6).addItem(new g7("config-item", var2));
            break;
         case 2:
            r4q var3 = new r4q(this.n5);
            r4q.n5(this.l6).addItem(new g7("config-item-set", var3));
            break;
         case 3:
            q8i var4 = new q8i(this.n5);
            r4q.n5(this.l6).addItem(new g7("config-item-map-named", var4));
            break;
         case 4:
            a2y var5 = new a2y(this.n5);
            r4q.n5(this.l6).addItem(new g7("config-item-map-indexed", var5));
            break;
         default:
            return false;
      }

      return true;
   }
}
