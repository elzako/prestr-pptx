package com.aspose.slides.internal.k4y;

class r1f$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final r1f l6;

   r1f$2(r1f var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (r1f.n5().n5(this.n5.n3())) {
         case 9:
            r1f.n5(this.l6, new j9d(this.n5));
            break;
         case 10:
            g6h var2 = new g6h(this.n5);
            r1f.n5(this.l6).addItem(new g7("text-content", var2));
            break;
         case 11:
            this.n5.u9();
            String var3 = this.n5.z1();
            r1f.n5(this.l6).addItem(new g7("text", var3));
            break;
         case 12:
            j3t var4 = new j3t(this.n5);
            r1f.l6(this.l6).addItem(var4);
            break;
         default:
            return false;
      }

      return true;
   }
}
