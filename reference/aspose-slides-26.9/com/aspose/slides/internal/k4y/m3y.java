package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class m3y extends b3 {
   private String n5;
   private String l6;
   private int k5;
   private String u3;
   private String a6;
   private String u9;
   private String h0;
   private String c8;
   private String t2;
   private int s7;
   private int x8;
   private String n3;
   private String y4;
   private int e2;
   private byte t9;
   private int z1;
   private int t4;
   private byte q0;
   private v9d z3;
   private List<h0> m1;
   private static final com.aspose.slides.internal.v6g.u9 k7 = new com.aspose.slides.internal.v6g.u9(
      "style:width",
      "style:rel-width",
      "table:align",
      "fo:margin-left",
      "fo:margin-right",
      "fo:margin-top",
      "fo:margin-bottom",
      "fo:margin",
      "style:page-number",
      "fo:break-before",
      "fo:break-after",
      "fo:background-color",
      "style:shadow",
      "fo:keep-with-next",
      "style:may-break-between-rows",
      "table:border-model",
      "style:writing-mode",
      "table:display",
      "background-image"
   );

   public m3y(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      m3y$1 var2 = new m3y$1(this);
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
               switch (k7.n5(var1.n3())) {
                  case 18:
                     this.z3 = new v9d(var1);
                     break;
                  default:
                     h0 var5 = new h0(var1);
                     this.m1.addItem(var5);
                     var4 = true;
               }
            }
         }
      }
   }

   public m3y() {
      this.l6();
   }

   private void l6() {
      this.k5 = 0;
      this.s7 = 0;
      this.x8 = 0;
      this.e2 = 0;
      this.t9 = -1;
      this.z1 = 0;
      this.t4 = 0;
      this.q0 = -1;
      this.m1 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("style:width", this.n5);
      var2.l6("style:rel-width", this.l6);
      if (this.k5 != 0) {
         var2.l6("table:align", u8w.n5(this.k5));
      }

      if (this.u3 != null) {
         var2.l6("fo:margin-left", this.u3);
      }

      if (this.a6 != null) {
         var2.l6("fo:margin-right", this.a6);
      }

      if (this.u9 != null) {
         var2.l6("fo:margin-top", this.u9);
      }

      if (this.h0 != null) {
         var2.l6("fo:margin-bottom", this.h0);
      }

      if (this.c8 != null) {
         var2.l6("fo:margin", this.c8);
      }

      if (this.t2 != null) {
         var2.l6("style:page-number", this.t2);
      }

      if (this.s7 != 0) {
         var2.l6("fo:break-before", g4c.n5(this.s7));
      }

      if (this.x8 != 0) {
         var2.l6("fo:break-after", w7s.n5(this.x8));
      }

      if (this.n3 != null) {
         var2.l6("fo:background-color", this.n3);
      }

      if (this.y4 != null) {
         var2.l6("style:shadow", this.y4);
      }

      if (this.e2 != 0) {
         var2.l6("fo:keep-with-next", i7r.n5(this.e2));
      }

      if (this.t9 != -1) {
         var2.l6("style:may-break-between-rows", this.t9 == 1 ? "true" : "false");
      }

      if (this.z1 != 0) {
         var2.l6("table:border-model", m4i.n5(this.z1));
      }

      if (this.t4 != 0) {
         var2.l6("style:writing-mode", w6i.n5(this.t4));
      }

      if (this.q0 != -1) {
         var2.l6("table:display", this.q0 == 1 ? "true" : "false");
      }

      if (this.z3 != null) {
         this.z3.n5("style", var2, "background-image");
      }

      List$Enumerator var4 = this.m1.iterator();

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
      return k7;
   }

   // $VF: synthetic method
   static String n5(m3y var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(m3y var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static int n5(m3y var0, int var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String k5(m3y var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String u3(m3y var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static String a6(m3y var0, String var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static String u9(m3y var0, String var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static String h0(m3y var0, String var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static String c8(m3y var0, String var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static int l6(m3y var0, int var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static int k5(m3y var0, int var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static String t2(m3y var0, String var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static String s7(m3y var0, String var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static int u3(m3y var0, int var1) {
      return var0.e2 = var1;
   }

   // $VF: synthetic method
   static byte n5(m3y var0, byte var1) {
      return var0.t9 = var1;
   }

   // $VF: synthetic method
   static int a6(m3y var0, int var1) {
      return var0.z1 = var1;
   }

   // $VF: synthetic method
   static int u9(m3y var0, int var1) {
      return var0.t4 = var1;
   }

   // $VF: synthetic method
   static byte l6(m3y var0, byte var1) {
      return var0.q0 = var1;
   }
}
