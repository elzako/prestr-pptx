package com.aspose.slides.internal.k4y;

class g5s$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final g5s l6;

   g5s$2(g5s var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (g5s.n5().n5(this.n5.n3())) {
         case 2:
            k6y var2 = new k6y(this.n5);
            g5s.n5(this.l6).addItem(new g7("index-entry-chapter", var2));
            break;
         case 3:
            c4b var3 = new c4b(this.n5);
            g5s.n5(this.l6).addItem(new g7("index-entry-page-number", var3));
            break;
         case 4:
            l1x var4 = new l1x(this.n5);
            g5s.n5(this.l6).addItem(new g7("index-entry-text", var4));
            break;
         case 5:
            s5b var5 = new s5b(this.n5);
            g5s.n5(this.l6).addItem(new g7("index-entry-span", var5));
            break;
         case 6:
            i0d var6 = new i0d(this.n5);
            g5s.n5(this.l6).addItem(new g7("index-entry-tab-stop", var6));
            break;
         default:
            return false;
      }

      return true;
   }
}
