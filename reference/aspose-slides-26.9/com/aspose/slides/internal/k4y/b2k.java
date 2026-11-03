package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.ms.System.IDisposable;

public class b2k extends b3 {
   private long n5;
   private String l6;
   private List<g7> k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9(
      "text:start-value", "number", "p", "h", "list", "soft-page-break"
   );

   public b2k(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.k5();
      b2k$1 var2 = new b2k$1(this);
      n5(var1, var2);
      n5(var1, new b2k$2(this, var1));
   }

   public b2k() {
      this.k5();
   }

   private void k5() {
      this.n5 = 4294967295L;
      this.k5 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if ((this.n5 & 4294967295L) != 4294967295L) {
         var2.l6("text:start-value", com.aspose.slides.ms.System.Xml.f4.l6(this.n5));
      }

      if (this.l6 != null) {
         this.n5("text", var2, "number", this.l6, false);
      }

      List$Enumerator var4 = this.k5.iterator();

      try {
         while (var4.hasNext()) {
            g7 var5 = (g7)var4.next();
            switch (u3.n5(var5.n5())) {
               case 2:
                  ((u1x)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 3:
                  ((m2v)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 4:
                  ((u0y)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 5:
                  ((j0v)var5.k5()).n5("text", var2, var5.n5());
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
      switch (u3.n5(var1)) {
         case 2:
            var2 = new g7("p", new u1x());
            break;
         case 3:
            var2 = new g7("h", new m2v());
            break;
         case 4:
            var2 = new g7("list", new u0y());
            break;
         case 5:
            var2 = new g7("soft-page-break", new j0v());
            break;
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Wrong element: ", var1}));
      }

      this.k5.addItem(var2);
      return var2;
   }

   public final List<g7> n5() {
      return this.k5;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 l6() {
      return u3;
   }

   // $VF: synthetic method
   static long n5(b2k var0, long var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String n5(b2k var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String n5(b2k var0) {
      return var0.l6;
   }

   // $VF: synthetic method
   static List l6(b2k var0) {
      return var0.k5;
   }
}
