package com.aspose.slides.internal.k4y;

class g3a$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final g3a l6;

   g3a$2(g3a var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (g3a.n5().n5(this.n5.n3())) {
         case 9:
            g3a.n5(this.l6, new g7("database-source-sql", new q5o(this.n5)));
            break;
         case 10:
            g3a.n5(this.l6, new g7("database-source-query", new g3d(this.n5)));
            break;
         case 11:
            g3a.n5(this.l6, new g7("database-source-table", new h8k(this.n5)));
            break;
         case 12:
            g3a.n5(this.l6, new g7("source-service", new k4w(this.n5)));
            break;
         case 13:
            g3a.n5(this.l6, new g7("source-cell-range", new g2l(this.n5)));
            break;
         case 14:
            q7g var2 = new q7g(this.n5);
            g3a.n5(this.l6).addItem(var2);
            break;
         default:
            return false;
      }

      return true;
   }
}
