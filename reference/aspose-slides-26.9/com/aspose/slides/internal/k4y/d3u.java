package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class d3u extends b3 {
   private String n5;
   private String l6;
   private String k5;
   private String u3;
   private String a6;
   private String u9;
   private String h0;
   private String c8;
   private String t2;
   private String s7;
   private String x8;
   private String n3;
   private String y4;
   private String e2;
   private String t9;
   private String z1;
   private String t4;
   private String q0;
   private String z3;
   private String m1;
   private String k7;
   private String m3;
   private String z8;
   private String j5;
   private byte w1;
   private v9d r4;
   private List<h0> c4;
   private static final com.aspose.slides.internal.v6g.u9 y2 = new com.aspose.slides.internal.v6g.u9(
      "svg:height",
      "fo:min-height",
      "fo:margin-left",
      "fo:margin-right",
      "fo:margin-top",
      "fo:margin-bottom",
      "fo:margin",
      "fo:border",
      "fo:border-top",
      "fo:border-bottom",
      "fo:border-left",
      "fo:border-right",
      "style:border-line-width",
      "style:border-line-width-top",
      "style:border-line-width-bottom",
      "style:border-line-width-left",
      "style:border-line-width-right",
      "fo:padding",
      "fo:padding-top",
      "fo:padding-bottom",
      "fo:padding-left",
      "fo:padding-right",
      "fo:background-color",
      "style:shadow",
      "style:dynamic-spacing",
      "background-image"
   );

   public d3u(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      d3u$1 var2 = new d3u$1(this);
      n5(var1, var2);
      if (!var1.m1()) {
         String var3 = var1.n3();
         boolean var4 = false;

         while (var4 && !var1.j5() || var1.u9()) {
            if (var1.s7() == 15 && com.aspose.slides.ms.System.d1.a6(var1.n3(), var3)) {
               break;
            }

            var4 = false;
            if (var1.s7() == 1) {
               switch (y2.n5(var1.n3())) {
                  case 25:
                     this.r4 = new v9d(var1);
                     break;
                  default:
                     h0 var5 = new h0(var1);
                     this.c4.addItem(var5);
                     var4 = true;
               }
            }
         }
      }
   }

   public d3u() {
      this.l6();
   }

   private void l6() {
      this.w1 = -1;
      this.c4 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         var2.l6("svg:height", this.n5);
      }

      var2.l6("fo:min-height", this.l6);
      if (this.k5 != null) {
         var2.l6("fo:margin-left", this.k5);
      }

      if (this.u3 != null) {
         var2.l6("fo:margin-right", this.u3);
      }

      if (this.a6 != null) {
         var2.l6("fo:margin-top", this.a6);
      }

      if (this.u9 != null) {
         var2.l6("fo:margin-bottom", this.u9);
      }

      if (this.h0 != null) {
         var2.l6("fo:margin", this.h0);
      }

      if (this.c8 != null) {
         var2.l6("fo:border", this.c8);
      }

      if (this.t2 != null) {
         var2.l6("fo:border-top", this.t2);
      }

      if (this.s7 != null) {
         var2.l6("fo:border-bottom", this.s7);
      }

      if (this.x8 != null) {
         var2.l6("fo:border-left", this.x8);
      }

      if (this.n3 != null) {
         var2.l6("fo:border-right", this.n3);
      }

      if (this.y4 != null) {
         var2.l6("style:border-line-width", this.y4);
      }

      if (this.e2 != null) {
         var2.l6("style:border-line-width-top", this.e2);
      }

      if (this.t9 != null) {
         var2.l6("style:border-line-width-bottom", this.t9);
      }

      if (this.z1 != null) {
         var2.l6("style:border-line-width-left", this.z1);
      }

      if (this.t4 != null) {
         var2.l6("style:border-line-width-right", this.t4);
      }

      if (this.q0 != null) {
         var2.l6("fo:padding", this.q0);
      }

      if (this.z3 != null) {
         var2.l6("fo:padding-top", this.z3);
      }

      if (this.m1 != null) {
         var2.l6("fo:padding-bottom", this.m1);
      }

      if (this.k7 != null) {
         var2.l6("fo:padding-left", this.k7);
      }

      if (this.m3 != null) {
         var2.l6("fo:padding-right", this.m3);
      }

      if (this.z8 != null) {
         var2.l6("fo:background-color", this.z8);
      }

      if (this.j5 != null) {
         var2.l6("style:shadow", this.j5);
      }

      if (this.w1 != -1) {
         var2.l6("style:dynamic-spacing", this.w1 == 1 ? "true" : "false");
      }

      if (this.r4 != null) {
         this.r4.n5("style", var2, "background-image");
      }

      List$Enumerator var4 = this.c4.iterator();

      try {
         while (var4.hasNext()) {
            h0 var5 = (h0)var4.next();
            var5.n5("", var2, "");
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
      return y2;
   }

   // $VF: synthetic method
   static String n5(d3u var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(d3u var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String k5(d3u var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String u3(d3u var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String a6(d3u var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static String u9(d3u var0, String var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static String h0(d3u var0, String var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static String c8(d3u var0, String var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static String t2(d3u var0, String var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static String s7(d3u var0, String var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static String x8(d3u var0, String var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static String n3(d3u var0, String var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static String y4(d3u var0, String var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static String e2(d3u var0, String var1) {
      return var0.e2 = var1;
   }

   // $VF: synthetic method
   static String t9(d3u var0, String var1) {
      return var0.t9 = var1;
   }

   // $VF: synthetic method
   static String z1(d3u var0, String var1) {
      return var0.z1 = var1;
   }

   // $VF: synthetic method
   static String t4(d3u var0, String var1) {
      return var0.t4 = var1;
   }

   // $VF: synthetic method
   static String q0(d3u var0, String var1) {
      return var0.q0 = var1;
   }

   // $VF: synthetic method
   static String z3(d3u var0, String var1) {
      return var0.z3 = var1;
   }

   // $VF: synthetic method
   static String m1(d3u var0, String var1) {
      return var0.m1 = var1;
   }

   // $VF: synthetic method
   static String k7(d3u var0, String var1) {
      return var0.k7 = var1;
   }

   // $VF: synthetic method
   static String m3(d3u var0, String var1) {
      return var0.m3 = var1;
   }

   // $VF: synthetic method
   static String z8(d3u var0, String var1) {
      return var0.z8 = var1;
   }

   // $VF: synthetic method
   static String j5(d3u var0, String var1) {
      return var0.j5 = var1;
   }

   // $VF: synthetic method
   static byte n5(d3u var0, byte var1) {
      return var0.w1 = var1;
   }
}
