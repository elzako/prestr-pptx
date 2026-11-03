package com.aspose.slides.internal.k4y;

class l4i$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final l4i l6;

   l4i$1(l4i var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (l4i.u3().n5(this.n5.n3())) {
         case 0:
            l4i.n5(this.l6, new a0w(this.n5));
            break;
         case 1:
            l4i.n5(this.l6, new d3o(this.n5));
            break;
         case 2:
            l4i.n5(this.l6, new u8n(this.n5));
            break;
         case 3:
            l4i.n5(this.l6, new t7a(this.n5));
            break;
         case 4:
            l4i.n5(this.l6, new y6z(this.n5));
            break;
         case 5:
            l4i.n5(this.l6, new i3h(this.n5));
            break;
         case 6:
            l4i.n5(this.l6, new f4e(this.n5));
            break;
         case 7:
            l4i.n5(this.l6, new o3g(this.n5));
            break;
         case 8:
            l8c var2 = new l8c(this.n5);
            l4i.n5(this.l6).addItem(new g7("header-decl", var2));
            break;
         case 9:
            y1a var3 = new y1a(this.n5);
            l4i.n5(this.l6).addItem(new g7("footer-decl", var3));
            break;
         case 10:
            r9m var4 = new r9m(this.n5);
            l4i.n5(this.l6).addItem(new g7("date-time-decl", var4));
            break;
         case 11:
            i4x var5 = new i4x(this.n5);
            l4i.l6(this.l6).addItem(var5);
            break;
         case 12:
            l4i.n5(this.l6, new c5d(this.n5));
            break;
         case 13:
            l4i.n5(this.l6, new u6g(this.n5));
            break;
         case 14:
            l4i.n5(this.l6, new s8f(this.n5));
            break;
         case 15:
            l4i.n5(this.l6, new k6b(this.n5));
            break;
         case 16:
            l4i.n5(this.l6, new u5j(this.n5));
            break;
         case 17:
            l4i.n5(this.l6, new y0j(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
