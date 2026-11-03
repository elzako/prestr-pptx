package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.ms.System.IDisposable;

public class y7e extends b3 {
   private String n5;
   private String l6;
   private String k5;
   private boolean u3;
   private boolean a6;
   private boolean u9;
   private boolean h0;
   private boolean c8;
   private boolean t2;
   private boolean s7;
   private String x8;
   private boolean n3;
   private String y4;
   private boolean e2;
   private p0z t9;
   private p3x z1;
   private m4g t4;
   private b4i q0;
   private z1c z3;
   private List<g7> m1;
   private List<g7> k7;
   private static final com.aspose.slides.internal.v6g.u9 m3 = new com.aspose.slides.internal.v6g.u9(
      "table:name",
      "table:style-name",
      "table:template-name",
      "table:use-first-row-styles",
      "table:use-last-row-styles",
      "table:use-first-column-styles",
      "table:use-last-column-styles",
      "table:use-banding-rows-styles",
      "table:use-banding-columns-styles",
      "table:protected",
      "table:protection-key",
      "table:print",
      "table:print-ranges",
      "table:is-sub-table",
      "table-source",
      "dde-source",
      "scenario",
      "forms",
      "shapes",
      "table-column-group",
      "table-columns",
      "table-column",
      "table-header-columns",
      "table-row-group",
      "table-rows",
      "table-row",
      "table-header-rows",
      "soft-page-break"
   );

   public y7e(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.n3();
      y7e$1 var2 = new y7e$1(this);
      n5(var1, var2);
      n5(var1, new y7e$2(this, var1));
   }

   public y7e() {
      this.n3();
   }

   private void n3() {
      this.u3 = false;
      this.a6 = false;
      this.u9 = false;
      this.h0 = false;
      this.c8 = false;
      this.t2 = false;
      this.s7 = false;
      this.n3 = true;
      this.e2 = false;
      this.m1 = new List<>();
      this.k7 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("table:name", this.n5);
      if (this.l6 != null) {
         var2.l6("table:style-name", this.l6);
      }

      if (this.k5 != null) {
         var2.l6("table:template-name", this.k5);
      }

      if (this.u3) {
         var2.l6("table:use-first-row-styles", this.u3 ? "true" : "false");
      }

      if (this.a6) {
         var2.l6("table:use-last-row-styles", this.a6 ? "true" : "false");
      }

      if (this.u9) {
         var2.l6("table:use-first-column-styles", this.u9 ? "true" : "false");
      }

      if (this.h0) {
         var2.l6("table:use-last-column-styles", this.h0 ? "true" : "false");
      }

      if (this.c8) {
         var2.l6("table:use-banding-rows-styles", this.c8 ? "true" : "false");
      }

      if (this.t2) {
         var2.l6("table:use-banding-columns-styles", this.t2 ? "true" : "false");
      }

      if (this.s7) {
         var2.l6("table:protected", this.s7 ? "true" : "false");
      }

      if (this.x8 != null) {
         var2.l6("table:protection-key", this.x8);
      }

      if (!this.n3) {
         var2.l6("table:print", this.n3 ? "true" : "false");
      }

      if (this.y4 != null) {
         var2.l6("table:print-ranges", this.y4);
      }

      if (this.e2) {
         var2.l6("table:is-sub-table", this.e2 ? "true" : "false");
      }

      if (this.t9 != null) {
         this.t9.n5("table", var2, "table-source");
      }

      if (this.z1 != null) {
         this.z1.n5("office", var2, "dde-source");
      }

      if (this.t4 != null) {
         this.t4.n5("table", var2, "scenario");
      }

      if (this.q0 != null) {
         this.q0.n5("office", var2, "forms");
      }

      if (this.z3 != null) {
         this.z3.n5("table", var2, "shapes");
      }

      List$Enumerator var4 = this.m1.iterator();

      try {
         while (var4.hasNext()) {
            g7 var5 = (g7)var4.next();
            switch (m3.n5(var5.n5())) {
               case 19:
                  ((y2p)var5.k5()).n5("table", var2, var5.n5());
                  break;
               case 20:
                  ((v0q)var5.k5()).n5("table", var2, var5.n5());
                  break;
               case 21:
                  ((l5h)var5.k5()).n5("table", var2, var5.n5());
                  break;
               case 22:
                  ((w2c)var5.k5()).n5("table", var2, var5.n5());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      List$Enumerator var14 = this.k7.iterator();

      try {
         while (var14.hasNext()) {
            g7 var6 = (g7)var14.next();
            switch (m3.n5(var6.n5())) {
               case 23:
                  ((p0w)var6.k5()).n5("table", var2, var6.n5());
                  break;
               case 24:
                  ((h6i)var6.k5()).n5("table", var2, var6.n5());
                  break;
               case 25:
                  ((w1x)var6.k5()).n5("table", var2, var6.n5());
                  break;
               case 26:
                  ((u1j)var6.k5()).n5("table", var2, var6.n5());
                  break;
               case 27:
                  ((j0v)var6.k5()).n5("text", var2, var6.n5());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var14, IDisposable.class)) {
            var14.dispose();
         }
      }

      var2.s7();
   }

   public final g7 n5(String var1) {
      g7 var2;
      switch (m3.n5(var1)) {
         case 19:
            var2 = new g7("table-column-group", new y2p());
            break;
         case 20:
            var2 = new g7("table-columns", new v0q());
            break;
         case 21:
            var2 = new g7("table-column", new l5h());
            break;
         case 22:
            var2 = new g7("table-header-columns", new w2c());
            break;
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Wrong element: ", var1}));
      }

      this.m1.addItem(var2);
      return var2;
   }

   public final g7 l6(String var1) {
      g7 var2;
      switch (m3.n5(var1)) {
         case 23:
            var2 = new g7("table-row-group", new p0w());
            break;
         case 24:
            var2 = new g7("table-rows", new h6i());
            break;
         case 25:
            var2 = new g7("table-row", new w1x());
            break;
         case 26:
            var2 = new g7("table-header-rows", new u1j());
            break;
         case 27:
            var2 = new g7("soft-page-break", new j0v());
            break;
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Wrong element: ", var1}));
      }

      this.k7.addItem(var2);
      return var2;
   }

   public final String n5() {
      return this.n5;
   }

   public final void k5(String var1) {
      this.n5 = var1;
   }

   public final String l6() {
      return this.k5;
   }

   public final boolean k5() {
      return this.u3;
   }

   public final boolean u3() {
      return this.a6;
   }

   public final boolean a6() {
      return this.u9;
   }

   public final boolean u9() {
      return this.h0;
   }

   public final boolean h0() {
      return this.c8;
   }

   public final boolean c8() {
      return this.t2;
   }

   public final List<g7> t2() {
      return this.m1;
   }

   public final List<g7> s7() {
      return this.k7;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 x8() {
      return m3;
   }

   // $VF: synthetic method
   static String n5(y7e var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(y7e var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String k5(y7e var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static boolean n5(y7e var0, boolean var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static boolean l6(y7e var0, boolean var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static boolean k5(y7e var0, boolean var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static boolean u3(y7e var0, boolean var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static boolean a6(y7e var0, boolean var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static boolean u9(y7e var0, boolean var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static boolean h0(y7e var0, boolean var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static String u3(y7e var0, String var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static boolean c8(y7e var0, boolean var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static String a6(y7e var0, String var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static boolean t2(y7e var0, boolean var1) {
      return var0.e2 = var1;
   }

   // $VF: synthetic method
   static p0z n5(y7e var0, p0z var1) {
      return var0.t9 = var1;
   }

   // $VF: synthetic method
   static p3x n5(y7e var0, p3x var1) {
      return var0.z1 = var1;
   }

   // $VF: synthetic method
   static m4g n5(y7e var0, m4g var1) {
      return var0.t4 = var1;
   }

   // $VF: synthetic method
   static b4i n5(y7e var0, b4i var1) {
      return var0.q0 = var1;
   }

   // $VF: synthetic method
   static z1c n5(y7e var0, z1c var1) {
      return var0.z3 = var1;
   }

   // $VF: synthetic method
   static List n5(y7e var0) {
      return var0.m1;
   }

   // $VF: synthetic method
   static List l6(y7e var0) {
      return var0.k7;
   }
}
