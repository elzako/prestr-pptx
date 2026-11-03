package com.aspose.slides.internal.k4y;

class j3m$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final j3m l6;

   j3m$2(j3m var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (j3m.n5().n5(this.n5.n3())) {
         case 10:
            j3m.n5(this.l6, new g7("database-source-sql", new q5o(this.n5)));
            break;
         case 11:
            j3m.n5(this.l6, new g7("database-source-query", new g3d(this.n5)));
            break;
         case 12:
            j3m.n5(this.l6, new g7("database-source-table", new h8k(this.n5)));
            break;
         case 13:
            j3m.n5(this.l6, new z8r(this.n5));
            break;
         case 14:
            j3m.n5(this.l6, new r5l(this.n5));
            break;
         case 15:
            j3m.n5(this.l6, new i0j(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
