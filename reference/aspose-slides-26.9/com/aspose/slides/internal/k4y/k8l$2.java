package com.aspose.slides.internal.k4y;

class k8l$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final k8l l6;

   k8l$2(k8l var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (k8l.l6().n5(this.n5.n3())) {
         case 3:
            x1u var2 = new x1u(this.n5);
            k8l.n5(this.l6).addItem(new g7("sp", var2));
            break;
         case 4:
            s1k var3 = new s1k(this.n5);
            k8l.n5(this.l6).addItem(new g7("graphicFrame", var3));
            break;
         case 5:
            n7n var4 = new n7n(this.n5);
            k8l.n5(this.l6).addItem(new g7("pic", var4));
            break;
         case 6:
            t4z var5 = new t4z(this.n5);
            k8l.n5(this.l6).addItem(new g7("grpSp", var5));
            break;
         default:
            return false;
      }

      return true;
   }
}
