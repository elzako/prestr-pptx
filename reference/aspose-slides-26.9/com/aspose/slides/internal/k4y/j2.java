package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.ms.System.IDisposable;

public class j2 extends b3 {
   private List<g7> n5;
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9(
      "noFill", "solidFill", "gradFill", "blipFill", "pattFill", "grpFill"
   );

   public j2(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.k5();
      n5(var1, new j2$1(this, var1));
   }

   public j2() {
      this.k5();
   }

   private void k5() {
      this.n5 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      List$Enumerator var4 = this.n5.iterator();

      try {
         while (var4.hasNext()) {
            g7 var5 = (g7)var4.next();
            switch (l6.n5(var5.n5())) {
               case 0:
                  ((u4k)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 1:
                  ((e2l)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 2:
                  ((j2p)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 3:
                  ((e3)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 4:
                  ((n9q)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 5:
                  ((r6i)var5.k5()).n5("a", var2, var5.n5());
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
      switch (l6.n5(var1)) {
         case 0:
            var2 = new g7("noFill", new u4k());
            break;
         case 1:
            var2 = new g7("solidFill", new e2l());
            break;
         case 2:
            var2 = new g7("gradFill", new j2p());
            break;
         case 3:
            var2 = new g7("blipFill", new e3());
            break;
         case 4:
            var2 = new g7("pattFill", new n9q());
            break;
         case 5:
            var2 = new g7("grpFill", new r6i());
            break;
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Wrong element: ", var1}));
      }

      this.n5.addItem(var2);
      return var2;
   }

   public final List<g7> n5() {
      return this.n5;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 l6() {
      return l6;
   }

   // $VF: synthetic method
   static List n5(j2 var0) {
      return var0.n5;
   }
}
