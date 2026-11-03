package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class d5q extends b3 {
   private String n5;
   private String l6;
   private boolean k5;
   private boolean u3;
   private String a6;
   private String u9;
   private String h0;
   private List<m6q> c8;
   private static final com.aspose.slides.internal.v6g.u9 t2 = new com.aspose.slides.internal.v6g.u9(
      "text:prefix", "text:suffix", "text:numbered-entries", "text:sort-by-position", "fo:language", "fo:country", "text:sort-algorithm", "sort-key"
   );

   public d5q(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      d5q$1 var2 = new d5q$1(this);
      n5(var1, var2);
      n5(var1, new d5q$2(this, var1));
   }

   public d5q() {
      this.l6();
   }

   private void l6() {
      this.k5 = false;
      this.u3 = true;
      this.c8 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         var2.l6("text:prefix", this.n5);
      }

      if (this.l6 != null) {
         var2.l6("text:suffix", this.l6);
      }

      if (this.k5) {
         var2.l6("text:numbered-entries", this.k5 ? "true" : "false");
      }

      if (!this.u3) {
         var2.l6("text:sort-by-position", this.u3 ? "true" : "false");
      }

      if (this.a6 != null) {
         var2.l6("fo:language", this.a6);
      }

      if (this.u9 != null) {
         var2.l6("fo:country", this.u9);
      }

      if (this.h0 != null) {
         var2.l6("text:sort-algorithm", this.h0);
      }

      List$Enumerator var4 = this.c8.iterator();

      try {
         while (var4.hasNext()) {
            m6q var5 = (m6q)var4.next();
            var5.n5("text", var2, "sort-key");
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
      return t2;
   }

   // $VF: synthetic method
   static String n5(d5q var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(d5q var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static boolean n5(d5q var0, boolean var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static boolean l6(d5q var0, boolean var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String k5(d5q var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static String u3(d5q var0, String var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static String a6(d5q var0, String var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static List n5(d5q var0) {
      return var0.c8;
   }
}
