package com.aspose.slides.internal.k4y;

class c3u$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final c3u l6;

   c3u$1(c3u var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (c3u.a6().n5(this.n5.n3())) {
         case 0:
            c3u.n5(this.l6, new a5x(this.n5));
            break;
         case 1:
            c3u.n5(this.l6, new n5u(this.n5));
            break;
         case 2:
            f6w var2 = new f6w(this.n5);
            c3u.n5(this.l6).addItem(new g7("sp", var2));
            break;
         case 3:
            c3u var3 = new c3u(this.n5);
            c3u.n5(this.l6).addItem(new g7("grpSp", var3));
            break;
         case 4:
            j9u var4 = new j9u(this.n5);
            c3u.n5(this.l6).addItem(new g7("AlternateContent", var4));
            break;
         case 5:
            c3u.n5(this.l6, new l8r(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
