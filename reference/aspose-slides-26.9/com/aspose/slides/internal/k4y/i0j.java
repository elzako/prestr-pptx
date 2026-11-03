package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class i0j extends b3 {
   private boolean n5;
   private boolean l6;
   private boolean k5;
   private f6d u3;
   private List<a8s> a6;
   private static final com.aspose.slides.internal.v6g.u9 u9 = new com.aspose.slides.internal.v6g.u9(
      "table:bind-styles-to-content", "table:case-sensitive", "table:page-breaks-on-group-change", "sort-groups", "subtotal-rule"
   );

   public i0j(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      i0j$1 var2 = new i0j$1(this);
      n5(var1, var2);
      n5(var1, new i0j$2(this, var1));
   }

   public i0j() {
      this.l6();
   }

   private void l6() {
      this.n5 = true;
      this.k5 = false;
      this.a6 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (!this.n5) {
         var2.l6("table:bind-styles-to-content", this.n5 ? "true" : "false");
      }

      var2.l6("table:case-sensitive", this.l6 ? "true" : "false");
      if (this.k5) {
         var2.l6("table:page-breaks-on-group-change", this.k5 ? "true" : "false");
      }

      if (this.u3 != null) {
         this.u3.n5("table", var2, "sort-groups");
      }

      List$Enumerator var4 = this.a6.iterator();

      try {
         while (var4.hasNext()) {
            a8s var5 = (a8s)var4.next();
            var5.n5("table", var2, "subtotal-rule");
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
      return u9;
   }

   // $VF: synthetic method
   static boolean n5(i0j var0, boolean var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static boolean l6(i0j var0, boolean var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static boolean k5(i0j var0, boolean var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static f6d n5(i0j var0, f6d var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static List n5(i0j var0) {
      return var0.a6;
   }
}
