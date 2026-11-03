package com.aspose.slides.internal.k4y;

class h6e$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final h6e l6;

   h6e$1(h6e var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (h6e.n5().n5(this.n5.n3())) {
         case 0:
            n3k var2 = new n3k(this.n5);
            h6e.n5(this.l6).addItem(new g7("name", var2));
            break;
         case 1:
            a5j var3 = new a5j(this.n5);
            h6e.n5(this.l6).addItem(new g7("enabled", var3));
            break;
         case 2:
            a5j var4 = new a5j(this.n5);
            h6e.n5(this.l6).addItem(new g7("calcOnExit", var4));
            break;
         case 3:
            y6u var5 = new y6u(this.n5);
            h6e.n5(this.l6).addItem(new g7("entryMacro", var5));
            break;
         case 4:
            y6u var6 = new y6u(this.n5);
            h6e.n5(this.l6).addItem(new g7("exitMacro", var6));
            break;
         case 5:
            s2z var7 = new s2z(this.n5);
            h6e.n5(this.l6).addItem(new g7("helpText", var7));
            break;
         case 6:
            a9g var8 = new a9g(this.n5);
            h6e.n5(this.l6).addItem(new g7("statusText", var8));
            break;
         case 7:
            w4y var9 = new w4y(this.n5);
            h6e.n5(this.l6).addItem(new g7("checkBox", var9));
            break;
         case 8:
            b4k var10 = new b4k(this.n5);
            h6e.n5(this.l6).addItem(new g7("ddList", var10));
            break;
         case 9:
            k2d var11 = new k2d(this.n5);
            h6e.n5(this.l6).addItem(new g7("textInput", var11));
            break;
         default:
            return false;
      }

      return true;
   }
}
