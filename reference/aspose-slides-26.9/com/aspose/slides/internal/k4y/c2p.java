package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class c2p extends b3 {
   private boolean n5;
   private String l6;
   private z3y k5;
   private a0w u3;
   private d3o a6;
   private u8n u9;
   private t7a h0;
   private y6z c8;
   private i3h t2;
   private f4e s7;
   private o3g x8;
   private List<y7e> n3;
   private u6g y4;
   private s8f e2;
   private k6b t9;
   private u5j z1;
   private y0j t4;
   private static final com.aspose.slides.internal.v6g.u9 q0 = new com.aspose.slides.internal.v6g.u9(
      "table:structure-protected",
      "table:protection-key",
      "tracked-changes",
      "variable-decls",
      "sequence-decls",
      "user-field-decls",
      "dde-connection-decls",
      "alphabetical-index-auto-mark-file",
      "calculation-settings",
      "content-validations",
      "label-ranges",
      "table",
      "named-expressions",
      "database-ranges",
      "data-pilot-tables",
      "consolidation",
      "dde-links"
   );

   public c2p(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      c2p$1 var2 = new c2p$1(this);
      n5(var1, var2);
      n5(var1, new c2p$2(this, var1));
   }

   public c2p() {
      this.l6();
   }

   private void l6() {
      this.n5 = false;
      this.n3 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5) {
         var2.l6("table:structure-protected", this.n5 ? "true" : "false");
      }

      var2.l6("table:protection-key", this.l6);
      if (this.k5 != null) {
         this.k5.n5("table", var2, "tracked-changes");
      }

      if (this.u3 != null) {
         this.u3.n5("text", var2, "variable-decls");
      }

      if (this.a6 != null) {
         this.a6.n5("text", var2, "sequence-decls");
      }

      if (this.u9 != null) {
         this.u9.n5("text", var2, "user-field-decls");
      }

      if (this.h0 != null) {
         this.h0.n5("text", var2, "dde-connection-decls");
      }

      if (this.c8 != null) {
         this.c8.n5("text", var2, "alphabetical-index-auto-mark-file");
      }

      if (this.t2 != null) {
         this.t2.n5("table", var2, "calculation-settings");
      }

      if (this.s7 != null) {
         this.s7.n5("table", var2, "content-validations");
      }

      if (this.x8 != null) {
         this.x8.n5("table", var2, "label-ranges");
      }

      List$Enumerator var4 = this.n3.iterator();

      try {
         while (var4.hasNext()) {
            y7e var5 = (y7e)var4.next();
            var5.n5("table", var2, "table");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      if (this.y4 != null) {
         this.y4.n5("table", var2, "named-expressions");
      }

      if (this.e2 != null) {
         this.e2.n5("table", var2, "database-ranges");
      }

      if (this.t9 != null) {
         this.t9.n5("table", var2, "data-pilot-tables");
      }

      if (this.z1 != null) {
         this.z1.n5("table", var2, "consolidation");
      }

      if (this.t4 != null) {
         this.t4.n5("table", var2, "dde-links");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return q0;
   }

   // $VF: synthetic method
   static boolean n5(c2p var0, boolean var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String n5(c2p var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static z3y n5(c2p var0, z3y var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static a0w n5(c2p var0, a0w var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static d3o n5(c2p var0, d3o var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static u8n n5(c2p var0, u8n var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static t7a n5(c2p var0, t7a var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static y6z n5(c2p var0, y6z var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static i3h n5(c2p var0, i3h var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static f4e n5(c2p var0, f4e var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static o3g n5(c2p var0, o3g var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static List n5(c2p var0) {
      return var0.n3;
   }

   // $VF: synthetic method
   static u6g n5(c2p var0, u6g var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static s8f n5(c2p var0, s8f var1) {
      return var0.e2 = var1;
   }

   // $VF: synthetic method
   static k6b n5(c2p var0, k6b var1) {
      return var0.t9 = var1;
   }

   // $VF: synthetic method
   static u5j n5(c2p var0, u5j var1) {
      return var0.z1 = var1;
   }

   // $VF: synthetic method
   static y0j n5(c2p var0, y0j var1) {
      return var0.t4 = var1;
   }
}
