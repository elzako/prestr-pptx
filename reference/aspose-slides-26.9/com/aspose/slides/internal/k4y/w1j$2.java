package com.aspose.slides.internal.k4y;

class w1j$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final w1j l6;

   w1j$2(w1j var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (w1j.l6().n5(this.n5.n3())) {
         case 4:
            x1u var2 = new x1u(this.n5);
            w1j.n5(this.l6).addItem(new g7("sp", var2));
            break;
         case 5:
            s1k var3 = new s1k(this.n5);
            w1j.n5(this.l6).addItem(new g7("graphicFrame", var3));
            break;
         case 6:
            x1s var4 = new x1s(this.n5);
            w1j.n5(this.l6).addItem(new g7("contentPart", var4));
            break;
         case 7:
            i9 var5 = new i9(this.n5);
            w1j.n5(this.l6).addItem(new g7("notes", var5));
            break;
         default:
            return false;
      }

      return true;
   }
}
