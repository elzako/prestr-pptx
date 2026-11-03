package com.aspose.slides.internal.k4y;

class a4h$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final a4h l6;

   a4h$2(a4h var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (a4h.n5().n5(this.n5.n3())) {
         case 2:
            k6y var2 = new k6y(this.n5);
            a4h.n5(this.l6).addItem(new g7("index-entry-chapter", var2));
            break;
         case 3:
            c4b var3 = new c4b(this.n5);
            a4h.n5(this.l6).addItem(new g7("index-entry-page-number", var3));
            break;
         case 4:
            l1x var4 = new l1x(this.n5);
            a4h.n5(this.l6).addItem(new g7("index-entry-text", var4));
            break;
         case 5:
            s5b var5 = new s5b(this.n5);
            a4h.n5(this.l6).addItem(new g7("index-entry-span", var5));
            break;
         case 6:
            i0d var6 = new i0d(this.n5);
            a4h.n5(this.l6).addItem(new g7("index-entry-tab-stop", var6));
            break;
         case 7:
            h6c var7 = new h6c(this.n5);
            a4h.n5(this.l6).addItem(new g7("index-entry-link-start", var7));
            break;
         case 8:
            b8k var8 = new b8k(this.n5);
            a4h.n5(this.l6).addItem(new g7("index-entry-link-end", var8));
            break;
         default:
            return false;
      }

      return true;
   }
}
