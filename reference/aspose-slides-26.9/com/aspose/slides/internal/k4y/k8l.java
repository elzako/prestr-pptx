package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.ms.System.IDisposable;

public final class k8l extends b3 {
   private String n5;
   private String l6;
   private String k5;
   private List<g7> u3 = new List<>();
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9(
      "Ignorable", "MustUnderstand", "ProcessContent", "sp", "graphicFrame", "pic", "grpSp"
   );

   public k8l(com.aspose.slides.ms.System.Xml.c7 var1) {
      this();
      n5(var1, new k8l$1(this));
      n5(var1, new k8l$2(this, var1));
   }

   public k8l() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         var2.l6("mc:Ignorable", this.n5);
      }

      if (this.l6 != null) {
         var2.l6("mc:MustUnderstand", this.l6);
      }

      if (this.k5 != null) {
         var2.l6("mc:ProcessContent", this.k5);
      }

      List$Enumerator var4 = this.u3.iterator();

      try {
         while (var4.hasNext()) {
            g7 var5 = (g7)var4.next();
            switch (a6.n5(var5.n5())) {
               case 3:
                  ((x1u)var5.k5()).n5("p", var2, var5.n5());
                  break;
               case 4:
                  ((s1k)var5.k5()).n5("p", var2, var5.n5());
                  break;
               case 5:
                  ((n7n)var5.k5()).n5("p", var2, var5.n5());
                  break;
               case 6:
                  ((t4z)var5.k5()).n5("p", var2, var5.n5());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      var2.s7();
   }

   public final g7 n5(String var1) {
      g7 var2;
      switch (a6.n5(var1)) {
         case 3:
            var2 = new g7("sp", new x1u());
            break;
         case 4:
            var2 = new g7("graphicFrame", new s1k());
            break;
         case 5:
            var2 = new g7("pic", new n7n());
            break;
         case 6:
            var2 = new g7("grpSp", new t4z());
            break;
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Wrong element: ", var1}));
      }

      this.u3.addItem(var2);
      return var2;
   }

   public final g7[] n5() {
      return this.u3.toArray(new g7[0]);
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 l6() {
      return a6;
   }

   // $VF: synthetic method
   static String n5(k8l var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(k8l var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String k5(k8l var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static List n5(k8l var0) {
      return var0.u3;
   }
}
