package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.ms.System.IDisposable;

public class u7q extends e2 {
   private d9l n5;
   private n5u l6;
   private List<g7> k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9(
      "nvGrpSpPr", "grpSpPr", "sp", "AlternateContent", "grpSp", "graphicFrame", "cxnSp", "pic"
   );

   public u7q(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u9();
      n5(var1, new u7q$1(this, var1));
   }

   public u7q() {
      this.u9();
      this.n5 = new d9l();
      this.l6 = new n5u();
   }

   private void u9() {
      this.k5 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      this.n5.n5("cdr", var2, "nvGrpSpPr");
      this.l6.n5("cdr", var2, "grpSpPr");
      List$Enumerator var4 = this.k5.iterator();

      try {
         while (var4.hasNext()) {
            g7 var5 = (g7)var4.next();
            switch (u3.n5(var5.n5())) {
               case 2:
                  ((p5w)var5.k5()).n5("cdr", var2, var5.n5());
                  break;
               case 3:
                  ((j9u)var5.k5()).n5("mc", var2, var5.n5());
                  break;
               case 4:
                  ((u7q)var5.k5()).n5("cdr", var2, var5.n5());
                  break;
               case 5:
                  ((g7i)var5.k5()).n5("cdr", var2, var5.n5());
                  break;
               case 6:
                  ((a3p)var5.k5()).n5("cdr", var2, var5.n5());
                  break;
               case 7:
                  ((d8y)var5.k5()).n5("cdr", var2, var5.n5());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      var2.s7();
   }

   @Override
   public g7 n5(String var1) {
      g7 var2;
      switch (u3.n5(var1)) {
         case 2:
            var2 = new g7("sp", new p5w());
            break;
         case 3:
            var2 = new g7("AlternateContent", new j9u());
            break;
         case 4:
            var2 = new g7("grpSp", new u7q());
            break;
         case 5:
            var2 = new g7("graphicFrame", new g7i());
            break;
         case 6:
            var2 = new g7("cxnSp", new a3p());
            break;
         case 7:
            var2 = new g7("pic", new d8y());
            break;
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Wrong element: ", var1}));
      }

      this.k5.addItem(var2);
      return var2;
   }

   @Override
   public t9 n5() {
      return this.n5;
   }

   @Override
   public n5u l6() {
      return this.l6;
   }

   @Override
   public List<g7> k5() {
      return this.k5;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 a6() {
      return u3;
   }

   // $VF: synthetic method
   static d9l n5(u7q var0, d9l var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static n5u n5(u7q var0, n5u var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static List n5(u7q var0) {
      return var0.k5;
   }
}
