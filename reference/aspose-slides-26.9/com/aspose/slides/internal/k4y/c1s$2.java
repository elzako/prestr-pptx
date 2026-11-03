package com.aspose.slides.internal.k4y;

class c1s$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final c1s l6;

   c1s$2(c1s var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (c1s.n5().n5(this.n5.n3())) {
         case 9:
            c1s.n5(this.l6, new j9d(this.n5));
            break;
         case 10:
            o3q var2 = new o3q(this.n5);
            c1s.n5(this.l6).addItem(new g7("number", var2));
            break;
         case 11:
            f1n var3 = new f1n(this.n5);
            c1s.n5(this.l6).addItem(new g7("scientific-number", var3));
            break;
         case 12:
            d0g var4 = new d0g(this.n5);
            c1s.n5(this.l6).addItem(new g7("fraction", var4));
            break;
         case 13:
            this.n5.u9();
            String var5 = this.n5.z1();
            c1s.n5(this.l6).addItem(new g7("text", var5));
            break;
         case 14:
            j3t var6 = new j3t(this.n5);
            c1s.l6(this.l6).addItem(var6);
            break;
         default:
            return false;
      }

      return true;
   }
}
