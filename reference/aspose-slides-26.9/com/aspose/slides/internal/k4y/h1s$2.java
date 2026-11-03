package com.aspose.slides.internal.k4y;

class h1s$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final h1s l6;

   h1s$2(h1s var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (h1s.n5().n5(this.n5.n3())) {
         case 9:
            h1s.n5(this.l6, new j9d(this.n5));
            break;
         case 10:
            o3q var2 = new o3q(this.n5);
            h1s.n5(this.l6).addItem(new g7("number", var2));
            break;
         case 11:
            this.n5.u9();
            String var3 = this.n5.z1();
            h1s.n5(this.l6).addItem(new g7("text", var3));
            break;
         case 12:
            j3t var4 = new j3t(this.n5);
            h1s.l6(this.l6).addItem(var4);
            break;
         default:
            return false;
      }

      return true;
   }
}
