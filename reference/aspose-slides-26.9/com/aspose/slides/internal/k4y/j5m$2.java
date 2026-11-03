package com.aspose.slides.internal.k4y;

class j5m$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final j5m l6;

   j5m$2(j5m var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (j5m.n5().n5(this.n5.n3())) {
         case 4:
            k5l var2 = new k5l(this.n5);
            j5m.n5(this.l6).addItem(new g7("text", var2));
            break;
         case 5:
            s8z var3 = new s8z(this.n5);
            j5m.n5(this.l6).addItem(new g7("textarea", var3));
            break;
         case 6:
            b4b var4 = new b4b(this.n5);
            j5m.n5(this.l6).addItem(new g7("formatted-text", var4));
            break;
         case 7:
            c0u var5 = new c0u(this.n5);
            j5m.n5(this.l6).addItem(new g7("number", var5));
            break;
         case 8:
            f9e var6 = new f9e(this.n5);
            j5m.n5(this.l6).addItem(new g7("date", var6));
            break;
         case 9:
            e8y var7 = new e8y(this.n5);
            j5m.n5(this.l6).addItem(new g7("combobox", var7));
            break;
         case 10:
            i2h var8 = new i2h(this.n5);
            j5m.n5(this.l6).addItem(new g7("listbox", var8));
            break;
         case 11:
            l6v var9 = new l6v(this.n5);
            j5m.n5(this.l6).addItem(new g7("checkbox", var9));
            break;
         default:
            return false;
      }

      return true;
   }
}
