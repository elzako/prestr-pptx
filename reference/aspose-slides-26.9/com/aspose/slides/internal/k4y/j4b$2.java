package com.aspose.slides.internal.k4y;

class j4b$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final j4b l6;

   j4b$2(j4b var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (j4b.n5().n5(this.n5.n3())) {
         case 9:
            j4b.n5(this.l6, new j9d(this.n5));
            break;
         case 10:
            r7x var2 = new r7x(this.n5);
            j4b.n5(this.l6).addItem(new g7("boolean", var2));
            break;
         case 11:
            this.n5.u9();
            String var3 = this.n5.z1();
            j4b.n5(this.l6).addItem(new g7("text", var3));
            break;
         case 12:
            j3t var4 = new j3t(this.n5);
            j4b.l6(this.l6).addItem(var4);
            break;
         default:
            return false;
      }

      return true;
   }
}
