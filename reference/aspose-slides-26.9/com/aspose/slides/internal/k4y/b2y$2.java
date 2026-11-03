package com.aspose.slides.internal.k4y;

class b2y$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final b2y l6;

   b2y$2(b2y var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (b2y.n5().n5(this.n5.n3())) {
         case 10:
            b2y.n5(this.l6, new j9d(this.n5));
            break;
         case 11:
            this.n5.u9();
            String var2 = this.n5.z1();
            b2y.n5(this.l6).addItem(new g7("text", var2));
            break;
         case 12:
            o3q var3 = new o3q(this.n5);
            b2y.n5(this.l6).addItem(new g7("number", var3));
            break;
         case 13:
            m0g var4 = new m0g(this.n5);
            b2y.n5(this.l6).addItem(new g7("currency-symbol", var4));
            break;
         case 14:
            j3t var5 = new j3t(this.n5);
            b2y.l6(this.l6).addItem(var5);
            break;
         default:
            return false;
      }

      return true;
   }
}
