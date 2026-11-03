package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.ms.System.IDisposable;

public class w1j extends b3 {
   private String n5;
   private String l6;
   private String k5;
   private String u3;
   private List<g7> a6;
   private static final com.aspose.slides.internal.v6g.u9 u9 = new com.aspose.slides.internal.v6g.u9(
      "Ignorable", "MustUnderstand", "ProcessContent", "Requires", "sp", "graphicFrame", "contentPart", "notes"
   );

   public w1j(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.k5();
      w1j$1 var2 = new w1j$1(this);
      n5(var1, var2);
      n5(var1, new w1j$2(this, var1));
   }

   public w1j() {
      this.k5();
   }

   private void k5() {
      this.a6 = new List<>();
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

      var2.l6("Requires", this.u3);
      List$Enumerator var4 = this.a6.iterator();

      try {
         while (var4.hasNext()) {
            g7 var5 = (g7)var4.next();
            switch (u9.n5(var5.n5())) {
               case 4:
                  ((x1u)var5.k5()).n5("p", var2, var5.n5());
                  break;
               case 5:
                  ((s1k)var5.k5()).n5("p", var2, var5.n5());
                  break;
               case 6:
                  ((x1s)var5.k5()).n5("p", var2, var5.n5());
                  break;
               case 7:
                  ((i9)var5.k5()).n5("p", var2, var5.n5());
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
      switch (u9.n5(var1)) {
         case 4:
            var2 = new g7("sp", new x1u());
            break;
         case 5:
            var2 = new g7("graphicFrame", new s1k());
            break;
         case 6:
            var2 = new g7("contentPart", new x1s());
            break;
         case 7:
            var2 = new g7("notes", new i9());
            break;
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Wrong element: ", var1}));
      }

      this.a6.addItem(var2);
      return var2;
   }

   public final void l6(String var1) {
      this.u3 = var1;
   }

   public final List<g7> n5() {
      return this.a6;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 l6() {
      return u9;
   }

   // $VF: synthetic method
   static String n5(w1j var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(w1j var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String k5(w1j var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String u3(w1j var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static List n5(w1j var0) {
      return var0.a6;
   }
}
