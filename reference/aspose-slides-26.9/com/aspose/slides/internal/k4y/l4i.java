package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class l4i extends b3 {
   private a0w n5;
   private d3o l6;
   private u8n k5;
   private t7a u3;
   private y6z a6;
   private i3h u9;
   private f4e h0;
   private o3g c8;
   private List<g7> t2;
   private List<i4x> s7;
   private c5d x8;
   private u6g n3;
   private s8f y4;
   private k6b e2;
   private u5j t9;
   private y0j z1;
   private static final com.aspose.slides.internal.v6g.u9 t4 = new com.aspose.slides.internal.v6g.u9(
      "variable-decls",
      "sequence-decls",
      "user-field-decls",
      "dde-connection-decls",
      "alphabetical-index-auto-mark-file",
      "calculation-settings",
      "content-validations",
      "label-ranges",
      "header-decl",
      "footer-decl",
      "date-time-decl",
      "page",
      "settings",
      "named-expressions",
      "database-ranges",
      "data-pilot-tables",
      "consolidation",
      "dde-links"
   );

   public l4i(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.a6();
      n5(var1, new l4i$1(this, var1));
   }

   public l4i() {
      this.a6();
   }

   private void a6() {
      this.t2 = new List<>();
      this.s7 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         this.n5.n5("text", var2, "variable-decls");
      }

      if (this.l6 != null) {
         this.l6.n5("text", var2, "sequence-decls");
      }

      if (this.k5 != null) {
         this.k5.n5("text", var2, "user-field-decls");
      }

      if (this.u3 != null) {
         this.u3.n5("text", var2, "dde-connection-decls");
      }

      if (this.a6 != null) {
         this.a6.n5("text", var2, "alphabetical-index-auto-mark-file");
      }

      if (this.u9 != null) {
         this.u9.n5("table", var2, "calculation-settings");
      }

      if (this.h0 != null) {
         this.h0.n5("table", var2, "content-validations");
      }

      if (this.c8 != null) {
         this.c8.n5("table", var2, "label-ranges");
      }

      List$Enumerator var4 = this.t2.iterator();

      try {
         while (var4.hasNext()) {
            g7 var5 = (g7)var4.next();
            switch (t4.n5(var5.n5())) {
               case 8:
                  ((l8c)var5.k5()).n5("presentation", var2, var5.n5());
                  break;
               case 9:
                  ((y1a)var5.k5()).n5("presentation", var2, var5.n5());
                  break;
               case 10:
                  ((r9m)var5.k5()).n5("presentation", var2, var5.n5());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      List$Enumerator var14 = this.s7.iterator();

      try {
         while (var14.hasNext()) {
            i4x var6 = (i4x)var14.next();
            var6.n5("draw", var2, "page");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var14, IDisposable.class)) {
            var14.dispose();
         }
      }

      if (this.x8 != null) {
         this.x8.n5("presentation", var2, "settings");
      }

      if (this.n3 != null) {
         this.n3.n5("table", var2, "named-expressions");
      }

      if (this.y4 != null) {
         this.y4.n5("table", var2, "database-ranges");
      }

      if (this.e2 != null) {
         this.e2.n5("table", var2, "data-pilot-tables");
      }

      if (this.t9 != null) {
         this.t9.n5("table", var2, "consolidation");
      }

      if (this.z1 != null) {
         this.z1.n5("table", var2, "dde-links");
      }

      var2.s7();
   }

   public final i4x n5() {
      i4x var1 = new i4x();
      this.s7.addItem(var1);
      return var1;
   }

   public final List<g7> l6() {
      return this.t2;
   }

   public final i4x[] k5() {
      return this.s7.toArray(new i4x[0]);
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u3() {
      return t4;
   }

   // $VF: synthetic method
   static a0w n5(l4i var0, a0w var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static d3o n5(l4i var0, d3o var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static u8n n5(l4i var0, u8n var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static t7a n5(l4i var0, t7a var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static y6z n5(l4i var0, y6z var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static i3h n5(l4i var0, i3h var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static f4e n5(l4i var0, f4e var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static o3g n5(l4i var0, o3g var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static List n5(l4i var0) {
      return var0.t2;
   }

   // $VF: synthetic method
   static List l6(l4i var0) {
      return var0.s7;
   }

   // $VF: synthetic method
   static c5d n5(l4i var0, c5d var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static u6g n5(l4i var0, u6g var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static s8f n5(l4i var0, s8f var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static k6b n5(l4i var0, k6b var1) {
      return var0.e2 = var1;
   }

   // $VF: synthetic method
   static u5j n5(l4i var0, u5j var1) {
      return var0.t9 = var1;
   }

   // $VF: synthetic method
   static y0j n5(l4i var0, y0j var1) {
      return var0.z1 = var1;
   }
}
