package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class s6g extends b3 {
   private long k5;
   private String u3;
   private String a6;
   private String u9;
   private int h0;
   private double c8;
   private String t2;
   private com.aspose.slides.ms.System.j5 s7 = new com.aspose.slides.ms.System.j5();
   private com.aspose.slides.ms.System.s4 x8 = new com.aspose.slides.ms.System.s4();
   private byte n3;
   private String y4;
   private boolean e2;
   private b3d t9;
   private j8d z1;
   private k3m t4;
   private List<g7> q0;
   public static final com.aspose.slides.ms.System.j5 n5 = com.aspose.slides.ms.System.j5.l6.m3();
   public static final com.aspose.slides.ms.System.s4 l6 = com.aspose.slides.ms.System.s4.k5.n3();
   private static final com.aspose.slides.internal.v6g.u9 z3 = new com.aspose.slides.internal.v6g.u9(
      "table:number-columns-repeated",
      "table:style-name",
      "table:content-validation-name",
      "table:formula",
      "office:value-type",
      "office:value",
      "office:currency",
      "office:date-value",
      "office:time-value",
      "office:boolean-value",
      "office:string-value",
      "table:protect",
      "cell-range-source",
      "annotation",
      "detective",
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
      "change-end"
   );

   public s6g(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u3();
      s6g$1 var2 = new s6g$1(this);
      n5(var1, var2);
      n5(var1, new s6g$2(this, var1));
   }

   public s6g() {
      this.u3();
   }

   private void u3() {
      this.k5 = 1L;
      this.h0 = 0;
      this.c8 = Double.NaN;
      n5.u3(this.s7);
      l6.u3(this.x8);
      this.n3 = -1;
      this.e2 = false;
      this.q0 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if ((this.k5 & 4294967295L) != 1L) {
         var2.l6("table:number-columns-repeated", com.aspose.slides.ms.System.Xml.f4.l6(this.k5));
      }

      if (this.u3 != null) {
         var2.l6("table:style-name", this.u3);
      }

      if (this.a6 != null) {
         var2.l6("table:content-validation-name", this.a6);
      }

      if (this.u9 != null) {
         var2.l6("table:formula", this.u9);
      }

      if (this.h0 != 0) {
         var2.l6("office:value-type", x6e.n5(this.h0));
      }

      if (!com.aspose.slides.ms.System.d2.k5(this.c8)) {
         var2.l6("office:value", com.aspose.slides.ms.System.Xml.f4.n5(this.c8));
      }

      if (this.t2 != null) {
         var2.l6("office:currency", this.t2);
      }

      if (com.aspose.slides.ms.System.j5.c8(this.s7, n5)) {
         var2.l6("office:date-value", com.aspose.slides.ms.System.Xml.f4.n5(this.s7.m3(), "yyyy-MM-ddTHH:mm:ss.fffffffK"));
      }

      if (com.aspose.slides.ms.System.s4.a6(this.x8, l6)) {
         var2.l6("office:time-value", n5(this.x8.n3()));
      }

      if (this.n3 != -1) {
         var2.l6("office:boolean-value", this.n3 == 1 ? "true" : "false");
      }

      if (this.y4 != null) {
         var2.l6("office:string-value", this.y4);
      }

      if (this.e2) {
         var2.l6("table:protect", this.e2 ? "true" : "false");
      }

      if (this.t9 != null) {
         this.t9.n5("table", var2, "cell-range-source");
      }

      if (this.z1 != null) {
         this.z1.n5("office", var2, "annotation");
      }

      if (this.t4 != null) {
         this.t4.n5("table", var2, "detective");
      }

      List$Enumerator var4 = this.q0.iterator();

      try {
         while (var4.hasNext()) {
            g7 var5 = (g7)var4.next();
            switch (z3.n5(var5.n5())) {
               case 15:
                  ((m2v)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 16:
                  ((u1x)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 17:
                  ((u0y)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 18:
                  ((e2q)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 19:
                  ((y7e)var5.k5()).n5("table", var2, var5.n5());
                  break;
               case 20:
                  ((y3o)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 21:
                  ((x6o)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 22:
                  ((j0v)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 23:
                  ((o1b)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 24:
                  ((e1e)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 25:
                  ((i6x)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 26:
                  ((i2e)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 27:
                  ((q5c)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 28:
                  ((s1f)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 29:
                  ((z4m)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 30:
                  ((e6x)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 31:
                  ((j6v)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 32:
                  ((u5l)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 33:
                  ((s4p)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 34:
                  ((z7d)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 35:
                  ((c5w)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 36:
                  ((f1h)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 37:
                  ((d2z)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 38:
                  ((c4f)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 39:
                  ((h4i)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 40:
                  ((b4f)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 41:
                  ((v6z)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 42:
                  ((v8v)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 43:
                  ((l3d)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 44:
                  ((w4a)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 45:
                  ((d8f)var5.k5()).n5("dr3d", var2, var5.n5());
                  break;
               case 46:
                  ((g3c)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 47:
                  ((t2s)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 48:
                  ((t2s)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 49:
                  ((t2s)var5.k5()).n5("text", var2, var5.n5());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      var2.s7();
   }

   public final String n5() {
      return this.u3;
   }

   public final List<g7> l6() {
      return this.q0;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return z3;
   }

   // $VF: synthetic method
   static long n5(s6g var0, long var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String n5(s6g var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String l6(s6g var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static String k5(s6g var0, String var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static int n5(s6g var0, int var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static double n5(s6g var0, double var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static String u3(s6g var0, String var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.ms.System.j5 n5(s6g var0) {
      return var0.s7;
   }

   // $VF: synthetic method
   static com.aspose.slides.ms.System.s4 l6(s6g var0) {
      return var0.x8;
   }

   // $VF: synthetic method
   static byte n5(s6g var0, byte var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static String a6(s6g var0, String var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static boolean n5(s6g var0, boolean var1) {
      return var0.e2 = var1;
   }

   // $VF: synthetic method
   static b3d n5(s6g var0, b3d var1) {
      return var0.t9 = var1;
   }

   // $VF: synthetic method
   static j8d n5(s6g var0, j8d var1) {
      return var0.z1 = var1;
   }

   // $VF: synthetic method
   static k3m n5(s6g var0, k3m var1) {
      return var0.t4 = var1;
   }

   // $VF: synthetic method
   static List k5(s6g var0) {
      return var0.q0;
   }
}
