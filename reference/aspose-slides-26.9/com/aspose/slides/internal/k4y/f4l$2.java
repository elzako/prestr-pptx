package com.aspose.slides.internal.k4y;

class f4l$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final f4l l6;

   f4l$2(f4l var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (f4l.r4().n5(this.n5.n3())) {
         case 19:
            f4l.n5(this.l6, new c9t(this.n5));
            break;
         case 20:
            f4l.n5(this.l6, new g7("noAutofit", new k0y(this.n5)));
            break;
         case 21:
            f4l.n5(this.l6, new g7("normAutofit", new x5e(this.n5)));
            break;
         case 22:
            f4l.n5(this.l6, new g7("spAutoFit", new f9d(this.n5)));
            break;
         case 23:
            f4l.n5(this.l6, new h6l(this.n5));
            break;
         case 24:
            f4l.l6(this.l6, new g7("sp3d", new q9u(this.n5)));
            break;
         case 25:
            f4l.l6(this.l6, new g7("flatTx", new p6w(this.n5)));
            break;
         case 26:
            f4l.n5(this.l6, new l8r(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
