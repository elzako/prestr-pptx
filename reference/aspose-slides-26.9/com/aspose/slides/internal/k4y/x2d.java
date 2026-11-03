package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class x2d extends b3 {
   private boolean n5;
   private boolean l6;
   private b4i k5;
   private p7f u3;
   private a0w a6;
   private d3o u9;
   private u8n h0;
   private t7a c8;
   private y6z t2;
   private i3h s7;
   private f4e x8;
   private o3g n3;
   private List<g7> y4;
   private u6g e2;
   private s8f t9;
   private k6b z1;
   private u5j t4;
   private y0j q0;
   private static final com.aspose.slides.internal.v6g.u9 z3 = new com.aspose.slides.internal.v6g.u9(
      "text:global",
      "text:use-soft-page-breaks",
      "forms",
      "tracked-changes",
      "variable-decls",
      "sequence-decls",
      "user-field-decls",
      "dde-connection-decls",
      "alphabetical-index-auto-mark-file",
      "calculation-settings",
      "content-validations",
      "label-ranges",
      "page-sequence",
      "h",
      "p",
      "list",
      "numbered-paragraph",
      "table",
      "a",
      "section",
      "soft-page-break",
      "table-of-content",
      "illustration-index",
      "table-index",
      "object-index",
      "user-index",
      "alphabetical-index",
      "bibliography",
      "rect",
      "line",
      "polyline",
      "polygon",
      "regular-polygon",
      "path",
      "circle",
      "ellipse",
      "g",
      "page-thumbnail",
      "frame",
      "measure",
      "caption",
      "connector",
      "control",
      "scene",
      "custom-shape",
      "change",
      "change-start",
      "change-end",
      "named-expressions",
      "database-ranges",
      "data-pilot-tables",
      "consolidation",
      "dde-links"
   );

   public x2d(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      x2d$1 var2 = new x2d$1(this);
      n5(var1, var2);
      n5(var1, new x2d$2(this, var1));
   }

   public x2d() {
      this.l6();
   }

   private void l6() {
      this.n5 = false;
      this.l6 = false;
      this.y4 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5) {
         var2.l6("text:global", this.n5 ? "true" : "false");
      }

      if (this.l6) {
         var2.l6("text:use-soft-page-breaks", this.l6 ? "true" : "false");
      }

      if (this.k5 != null) {
         this.k5.n5("office", var2, "forms");
      }

      if (this.u3 != null) {
         this.u3.n5("text", var2, "tracked-changes");
      }

      if (this.a6 != null) {
         this.a6.n5("text", var2, "variable-decls");
      }

      if (this.u9 != null) {
         this.u9.n5("text", var2, "sequence-decls");
      }

      if (this.h0 != null) {
         this.h0.n5("text", var2, "user-field-decls");
      }

      if (this.c8 != null) {
         this.c8.n5("text", var2, "dde-connection-decls");
      }

      if (this.t2 != null) {
         this.t2.n5("text", var2, "alphabetical-index-auto-mark-file");
      }

      if (this.s7 != null) {
         this.s7.n5("table", var2, "calculation-settings");
      }

      if (this.x8 != null) {
         this.x8.n5("table", var2, "content-validations");
      }

      if (this.n3 != null) {
         this.n3.n5("table", var2, "label-ranges");
      }

      List$Enumerator var4 = this.y4.iterator();

      try {
         while (var4.hasNext()) {
            g7 var5 = (g7)var4.next();
            switch (z3.n5(var5.n5())) {
               case 12:
                  ((f4a)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 13:
                  ((m2v)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 14:
                  ((u1x)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 15:
                  ((u0y)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 16:
                  ((e2q)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 17:
                  ((y7e)var5.k5()).n5("table", var2, var5.n5());
                  break;
               case 18:
                  ((y3o)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 19:
                  ((x6o)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 20:
                  ((j0v)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 21:
                  ((o1b)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 22:
                  ((e1e)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 23:
                  ((i6x)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 24:
                  ((i2e)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 25:
                  ((q5c)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 26:
                  ((s1f)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 27:
                  ((z4m)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 28:
                  ((e6x)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 29:
                  ((j6v)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 30:
                  ((u5l)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 31:
                  ((s4p)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 32:
                  ((z7d)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 33:
                  ((c5w)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 34:
                  ((f1h)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 35:
                  ((d2z)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 36:
                  ((c4f)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 37:
                  ((h4i)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 38:
                  ((b4f)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 39:
                  ((v6z)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 40:
                  ((v8v)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 41:
                  ((l3d)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 42:
                  ((w4a)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 43:
                  ((d8f)var5.k5()).n5("dr3d", var2, var5.n5());
                  break;
               case 44:
                  ((g3c)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 45:
                  ((t2s)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 46:
                  ((t2s)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 47:
                  ((t2s)var5.k5()).n5("text", var2, var5.n5());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      if (this.e2 != null) {
         this.e2.n5("table", var2, "named-expressions");
      }

      if (this.t9 != null) {
         this.t9.n5("table", var2, "database-ranges");
      }

      if (this.z1 != null) {
         this.z1.n5("table", var2, "data-pilot-tables");
      }

      if (this.t4 != null) {
         this.t4.n5("table", var2, "consolidation");
      }

      if (this.q0 != null) {
         this.q0.n5("table", var2, "dde-links");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return z3;
   }

   // $VF: synthetic method
   static boolean n5(x2d var0, boolean var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static boolean l6(x2d var0, boolean var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static b4i n5(x2d var0, b4i var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static p7f n5(x2d var0, p7f var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static a0w n5(x2d var0, a0w var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static d3o n5(x2d var0, d3o var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static u8n n5(x2d var0, u8n var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static t7a n5(x2d var0, t7a var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static y6z n5(x2d var0, y6z var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static i3h n5(x2d var0, i3h var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static f4e n5(x2d var0, f4e var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static o3g n5(x2d var0, o3g var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static List n5(x2d var0) {
      return var0.y4;
   }

   // $VF: synthetic method
   static u6g n5(x2d var0, u6g var1) {
      return var0.e2 = var1;
   }

   // $VF: synthetic method
   static s8f n5(x2d var0, s8f var1) {
      return var0.t9 = var1;
   }

   // $VF: synthetic method
   static k6b n5(x2d var0, k6b var1) {
      return var0.z1 = var1;
   }

   // $VF: synthetic method
   static u5j n5(x2d var0, u5j var1) {
      return var0.t4 = var1;
   }

   // $VF: synthetic method
   static y0j n5(x2d var0, y0j var1) {
      return var0.q0 = var1;
   }
}
