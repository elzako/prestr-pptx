package com.aspose.slides.internal.k4y;

class d5t$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final d5t l6;

   d5t$2(d5t var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (d5t.n5().n5(this.n5.n3())) {
         case 3:
            d5t.n5(this.l6, new g7("filters", new e2p(this.n5)));
            break;
         case 4:
            d5t.n5(this.l6, new g7("top10", new o3a(this.n5)));
            break;
         case 5:
            d5t.n5(this.l6, new g7("customFilters", new y6k(this.n5)));
            break;
         case 6:
            d5t.n5(this.l6, new g7("dynamicFilter", new k1v(this.n5)));
            break;
         case 7:
            d5t.n5(this.l6, new g7("colorFilter", new d7f(this.n5)));
            break;
         case 8:
            d5t.n5(this.l6, new g7("iconFilter", new m7a(this.n5)));
            break;
         case 9:
            d5t.n5(this.l6, new g7("extLst", new l0k(this.n5)));
            break;
         default:
            return false;
      }

      return true;
   }
}
