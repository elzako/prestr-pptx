package com.aspose.slides.internal.k4y;

class l7y$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final l7y l6;

   l7y$2(l7y var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (l7y.n5().n5(this.n5.n3())) {
         case 11:
            l7y.n5(this.l6, new j9d(this.n5));
            break;
         case 12:
            h5m var2 = new h5m(this.n5);
            l7y.n5(this.l6).addItem(new g7("hours", var2));
            break;
         case 13:
            k6m var3 = new k6m(this.n5);
            l7y.n5(this.l6).addItem(new g7("am-pm", var3));
            break;
         case 14:
            v1l var4 = new v1l(this.n5);
            l7y.n5(this.l6).addItem(new g7("minutes", var4));
            break;
         case 15:
            m2d var5 = new m2d(this.n5);
            l7y.n5(this.l6).addItem(new g7("seconds", var5));
            break;
         case 16:
            this.n5.u9();
            String var6 = this.n5.z1();
            l7y.n5(this.l6).addItem(new g7("text", var6));
            break;
         case 17:
            j3t var7 = new j3t(this.n5);
            l7y.l6(this.l6).addItem(var7);
            break;
         default:
            return false;
      }

      return true;
   }
}
