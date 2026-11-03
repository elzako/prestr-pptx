package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class g2n extends b3 {
   private String k5;
   private String u3;
   private String a6;
   private int u9;
   private int h0;
   private String c8;
   private String t2;
   private String s7;
   private boolean x8;
   private boolean n3;
   private boolean y4;
   private boolean e2;
   private int t9;
   private String z1;
   private String t4;
   private String q0;
   private String z3;
   private boolean m1;
   private String k7;
   private boolean m3;
   private int z8;
   private String j5;
   private int w1;
   private l7j r4;
   private c6x c4;
   private List<g7> y2;
   private n7e y1;
   public static final int n5 = v5w.n5("simple");
   public static final int l6 = v9t.n5("command");
   private static final com.aspose.slides.internal.v6g.u9 a0 = new com.aspose.slides.internal.v6g.u9(
      "form:name",
      "form:control-implementation",
      "xlink:href",
      "xlink:type",
      "xlink:actuate",
      "office:target-frame",
      "form:method",
      "form:enctype",
      "form:allow-deletes",
      "form:allow-inserts",
      "form:allow-updates",
      "form:apply-filter",
      "form:command-type",
      "form:command",
      "form:datasource",
      "form:master-fields",
      "form:detail-fields",
      "form:escape-processing",
      "form:filter",
      "form:ignore-result",
      "form:navigation-mode",
      "form:order",
      "form:tab-cycle",
      "properties",
      "event-listeners",
      "text",
      "textarea",
      "formatted-text",
      "number",
      "date",
      "combobox",
      "listbox",
      "checkbox",
      "password",
      "file",
      "time",
      "fixed-text",
      "button",
      "image",
      "radio",
      "frame",
      "image-frame",
      "hidden",
      "grid",
      "value-range",
      "generic-control",
      "form",
      "connection-resource"
   );

   public g2n(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      g2n$1 var2 = new g2n$1(this);
      n5(var1, var2);
      n5(var1, new g2n$2(this, var1));
   }

   public g2n() {
      this.l6();
   }

   private void l6() {
      this.u9 = n5;
      this.h0 = 0;
      this.c8 = "_blank";
      this.t2 = "get";
      this.s7 = "application/x-www-form-urlencoded";
      this.x8 = true;
      this.n3 = true;
      this.y4 = true;
      this.e2 = false;
      this.t9 = l6;
      this.m1 = true;
      this.m3 = false;
      this.z8 = 0;
      this.w1 = 0;
      this.y2 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.k5 != null) {
         var2.l6("form:name", this.k5);
      }

      if (this.u3 != null) {
         var2.l6("form:control-implementation", this.u3);
      }

      if (this.a6 != null) {
         var2.l6("xlink:href", this.a6);
      }

      if (this.u9 != n5) {
         var2.l6("xlink:type", v5w.n5(this.u9));
      }

      if (this.h0 != 0) {
         var2.l6("xlink:actuate", p9c.n5(this.h0));
      }

      if (!"_blank".equals(this.c8)) {
         var2.l6("office:target-frame", this.c8);
      }

      if (!"get".equals(this.t2)) {
         var2.l6("form:method", this.t2);
      }

      if (!"application/x-www-form-urlencoded".equals(this.s7)) {
         var2.l6("form:enctype", this.s7);
      }

      if (!this.x8) {
         var2.l6("form:allow-deletes", this.x8 ? "true" : "false");
      }

      if (!this.n3) {
         var2.l6("form:allow-inserts", this.n3 ? "true" : "false");
      }

      if (!this.y4) {
         var2.l6("form:allow-updates", this.y4 ? "true" : "false");
      }

      if (this.e2) {
         var2.l6("form:apply-filter", this.e2 ? "true" : "false");
      }

      if (this.t9 != l6) {
         var2.l6("form:command-type", v9t.n5(this.t9));
      }

      if (this.z1 != null) {
         var2.l6("form:command", this.z1);
      }

      if (this.t4 != null) {
         var2.l6("form:datasource", this.t4);
      }

      if (this.q0 != null) {
         var2.l6("form:master-fields", this.q0);
      }

      if (this.z3 != null) {
         var2.l6("form:detail-fields", this.z3);
      }

      if (!this.m1) {
         var2.l6("form:escape-processing", this.m1 ? "true" : "false");
      }

      if (this.k7 != null) {
         var2.l6("form:filter", this.k7);
      }

      if (this.m3) {
         var2.l6("form:ignore-result", this.m3 ? "true" : "false");
      }

      if (this.z8 != 0) {
         var2.l6("form:navigation-mode", g4a.n5(this.z8));
      }

      if (this.j5 != null) {
         var2.l6("form:order", this.j5);
      }

      if (this.w1 != 0) {
         var2.l6("form:tab-cycle", h1o.n5(this.w1));
      }

      if (this.r4 != null) {
         this.r4.n5("form", var2, "properties");
      }

      if (this.c4 != null) {
         this.c4.n5("office", var2, "event-listeners");
      }

      List$Enumerator var4 = this.y2.iterator();

      try {
         while (var4.hasNext()) {
            g7 var5 = (g7)var4.next();
            switch (a0.n5(var5.n5())) {
               case 25:
                  ((k5l)var5.k5()).n5("form", var2, var5.n5());
                  break;
               case 26:
                  ((s8z)var5.k5()).n5("form", var2, var5.n5());
                  break;
               case 27:
                  ((b4b)var5.k5()).n5("form", var2, var5.n5());
                  break;
               case 28:
                  ((c0u)var5.k5()).n5("form", var2, var5.n5());
                  break;
               case 29:
                  ((f9e)var5.k5()).n5("form", var2, var5.n5());
                  break;
               case 30:
                  ((e8y)var5.k5()).n5("form", var2, var5.n5());
                  break;
               case 31:
                  ((i2h)var5.k5()).n5("form", var2, var5.n5());
                  break;
               case 32:
                  ((l6v)var5.k5()).n5("form", var2, var5.n5());
                  break;
               case 33:
                  ((l3u)var5.k5()).n5("form", var2, var5.n5());
                  break;
               case 34:
                  ((x3z)var5.k5()).n5("form", var2, var5.n5());
                  break;
               case 35:
                  ((c2h)var5.k5()).n5("form", var2, var5.n5());
                  break;
               case 36:
                  ((y4t)var5.k5()).n5("form", var2, var5.n5());
                  break;
               case 37:
                  ((n4k)var5.k5()).n5("form", var2, var5.n5());
                  break;
               case 38:
                  ((l1p)var5.k5()).n5("form", var2, var5.n5());
                  break;
               case 39:
                  ((k5y)var5.k5()).n5("form", var2, var5.n5());
                  break;
               case 40:
                  ((b3h)var5.k5()).n5("form", var2, var5.n5());
                  break;
               case 41:
                  ((t9v)var5.k5()).n5("form", var2, var5.n5());
                  break;
               case 42:
                  ((j1g)var5.k5()).n5("form", var2, var5.n5());
                  break;
               case 43:
                  ((l5t)var5.k5()).n5("form", var2, var5.n5());
                  break;
               case 44:
                  ((l1z)var5.k5()).n5("form", var2, var5.n5());
                  break;
               case 45:
                  ((x4w)var5.k5()).n5("form", var2, var5.n5());
                  break;
               case 46:
                  ((g2n)var5.k5()).n5("form", var2, var5.n5());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      if (this.y1 != null) {
         this.y1.n5("form", var2, "connection-resource");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return a0;
   }

   // $VF: synthetic method
   static String n5(g2n var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String l6(g2n var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String k5(g2n var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static int n5(g2n var0, int var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static int l6(g2n var0, int var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static String u3(g2n var0, String var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static String a6(g2n var0, String var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static String u9(g2n var0, String var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static boolean n5(g2n var0, boolean var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static boolean l6(g2n var0, boolean var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static boolean k5(g2n var0, boolean var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static boolean u3(g2n var0, boolean var1) {
      return var0.e2 = var1;
   }

   // $VF: synthetic method
   static int k5(g2n var0, int var1) {
      return var0.t9 = var1;
   }

   // $VF: synthetic method
   static String h0(g2n var0, String var1) {
      return var0.z1 = var1;
   }

   // $VF: synthetic method
   static String c8(g2n var0, String var1) {
      return var0.t4 = var1;
   }

   // $VF: synthetic method
   static String t2(g2n var0, String var1) {
      return var0.q0 = var1;
   }

   // $VF: synthetic method
   static String s7(g2n var0, String var1) {
      return var0.z3 = var1;
   }

   // $VF: synthetic method
   static boolean a6(g2n var0, boolean var1) {
      return var0.m1 = var1;
   }

   // $VF: synthetic method
   static String x8(g2n var0, String var1) {
      return var0.k7 = var1;
   }

   // $VF: synthetic method
   static boolean u9(g2n var0, boolean var1) {
      return var0.m3 = var1;
   }

   // $VF: synthetic method
   static int u3(g2n var0, int var1) {
      return var0.z8 = var1;
   }

   // $VF: synthetic method
   static String n3(g2n var0, String var1) {
      return var0.j5 = var1;
   }

   // $VF: synthetic method
   static int a6(g2n var0, int var1) {
      return var0.w1 = var1;
   }

   // $VF: synthetic method
   static l7j n5(g2n var0, l7j var1) {
      return var0.r4 = var1;
   }

   // $VF: synthetic method
   static c6x n5(g2n var0, c6x var1) {
      return var0.c4 = var1;
   }

   // $VF: synthetic method
   static List n5(g2n var0) {
      return var0.y2;
   }

   // $VF: synthetic method
   static n7e n5(g2n var0, n7e var1) {
      return var0.y1 = var1;
   }
}
