package com.aspose.slides.internal.k4y;

class t4z$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final t4z l6;

   t4z$1(t4z var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (t4z.a6().n5(this.n5.n3())) {
         case 0:
            t4z.n5(this.l6, new r6x(this.n5));
            break;
         case 1:
            t4z.n5(this.l6, new n5u(this.n5));
            break;
         case 2:
            x1u var2 = new x1u(this.n5);
            t4z.n5(this.l6).addItem(new g7("sp", var2));
            break;
         case 3:
            j9u var3 = new j9u(this.n5);
            t4z.n5(this.l6).addItem(new g7("AlternateContent", var3));
            break;
         case 4:
            t4z var4 = new t4z(this.n5);
            t4z.n5(this.l6).addItem(new g7("grpSp", var4));
            break;
         case 5:
            s1k var5 = new s1k(this.n5);
            t4z.n5(this.l6).addItem(new g7("graphicFrame", var5));
            break;
         case 6:
            r0a var6 = new r0a(this.n5);
            t4z.n5(this.l6).addItem(new g7("cxnSp", var6));
            break;
         case 7:
            a6 var7 = new a6(this.n5);
            t4z.n5(this.l6).addItem(new g7("pic", var7));
            break;
         case 8:
            x1s var8 = new x1s(this.n5);
            t4z.n5(this.l6).addItem(new g7("contentPart", var8));
            break;
         case 9:
            t4z.n5(this.l6, new j9y(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
