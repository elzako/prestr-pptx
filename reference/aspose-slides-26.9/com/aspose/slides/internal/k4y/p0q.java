package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class p0q extends b3 {
   private y4e n5;
   private n5u l6;
   private List<g7> k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9(
      "nvGrpSpPr", "grpSpPr", "sp", "AlternateContent", "grpSp", "graphicFrame", "cxnSp", "pic"
   );

   public p0q(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      n5(var1, new p0q$1(this, var1));
   }

   public p0q() {
      this.l6();
      this.n5 = new y4e();
      this.l6 = new n5u();
   }

   private void l6() {
      this.k5 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      this.n5.n5("xdr", var2, "nvGrpSpPr");
      this.l6.n5("xdr", var2, "grpSpPr");
      List$Enumerator var4 = this.k5.iterator();

      try {
         while (var4.hasNext()) {
            g7 var5 = (g7)var4.next();
            switch (u3.n5(var5.n5())) {
               case 2:
                  ((j5z)var5.k5()).n5("xdr", var2, var5.n5());
                  break;
               case 3:
                  ((j9u)var5.k5()).n5("mc", var2, var5.n5());
                  break;
               case 4:
                  ((p0q)var5.k5()).n5("xdr", var2, var5.n5());
                  break;
               case 5:
                  ((h0m)var5.k5()).n5("xdr", var2, var5.n5());
                  break;
               case 6:
                  ((h1z)var5.k5()).n5("xdr", var2, var5.n5());
                  break;
               case 7:
                  ((b3w)var5.k5()).n5("xdr", var2, var5.n5());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return u3;
   }

   // $VF: synthetic method
   static y4e n5(p0q var0, y4e var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static n5u n5(p0q var0, n5u var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static List n5(p0q var0) {
      return var0.k5;
   }
}
