package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.ms.System.IDisposable;

public class y2i extends b3 {
   private String n5;
   private String l6;
   private String k5;
   private String u3;
   private String a6;
   private String u9;
   private boolean h0;
   private String c8;
   private String t2;
   private long s7;
   private int x8;
   private List<g7> n3;
   private List<j3t> y4;
   private static final com.aspose.slides.internal.v6g.u9 e2 = new com.aspose.slides.internal.v6g.u9(
      "style:name",
      "style:display-name",
      "style:parent-style-name",
      "style:next-style-name",
      "style:list-style-name",
      "style:master-page-name",
      "style:auto-update",
      "style:data-style-name",
      "style:class",
      "style:default-outline-level",
      "style:family",
      "chart-properties",
      "graphic-properties",
      "table-cell-properties",
      "paragraph-properties",
      "text-properties",
      "section-properties",
      "ruby-properties",
      "table-properties",
      "table-column-properties",
      "table-row-properties",
      "drawing-page-properties",
      "map"
   );

   public y2i(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u9();
      y2i$1 var2 = new y2i$1(this);
      n5(var1, var2);
      n5(var1, new y2i$2(this, var1));
   }

   public y2i() {
      this.u9();
   }

   private void u9() {
      this.h0 = false;
      this.s7 = 4294967295L;
      this.x8 = 0;
      this.n3 = new List<>();
      this.y4 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("style:name", this.n5);
      if (this.l6 != null) {
         var2.l6("style:display-name", this.l6);
      }

      if (this.k5 != null) {
         var2.l6("style:parent-style-name", this.k5);
      }

      if (this.u3 != null) {
         var2.l6("style:next-style-name", this.u3);
      }

      if (this.a6 != null) {
         var2.l6("style:list-style-name", this.a6);
      }

      if (this.u9 != null) {
         var2.l6("style:master-page-name", this.u9);
      }

      if (this.h0) {
         var2.l6("style:auto-update", this.h0 ? "true" : "false");
      }

      if (this.c8 != null) {
         var2.l6("style:data-style-name", this.c8);
      }

      if (this.t2 != null) {
         var2.l6("style:class", this.t2);
      }

      if ((this.s7 & 4294967295L) != 4294967295L) {
         var2.l6("style:default-outline-level", com.aspose.slides.ms.System.Xml.f4.l6(this.s7));
      }

      var2.l6("style:family", j1r.n5(this.x8));
      List$Enumerator var4 = this.n3.iterator();

      try {
         while (var4.hasNext()) {
            g7 var5 = (g7)var4.next();
            switch (e2.n5(var5.n5())) {
               case 11:
                  ((a8k)var5.k5()).n5("style", var2, var5.n5());
                  break;
               case 12:
                  ((p3w)var5.k5()).n5("style", var2, var5.n5());
                  break;
               case 13:
                  ((b4u)var5.k5()).n5("style", var2, var5.n5());
                  break;
               case 14:
                  ((v5n)var5.k5()).n5("style", var2, var5.n5());
                  break;
               case 15:
                  ((j9d)var5.k5()).n5("style", var2, var5.n5());
                  break;
               case 16:
                  ((d5z)var5.k5()).n5("style", var2, var5.n5());
                  break;
               case 17:
                  ((r1w)var5.k5()).n5("style", var2, var5.n5());
                  break;
               case 18:
                  ((m3y)var5.k5()).n5("style", var2, var5.n5());
                  break;
               case 19:
                  ((n0l)var5.k5()).n5("style", var2, var5.n5());
                  break;
               case 20:
                  ((s6j)var5.k5()).n5("style", var2, var5.n5());
                  break;
               case 21:
                  ((r9l)var5.k5()).n5("style", var2, var5.n5());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      List$Enumerator var14 = this.y4.iterator();

      try {
         while (var14.hasNext()) {
            j3t var6 = (j3t)var14.next();
            var6.n5("style", var2, "map");
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
      switch (e2.n5(var1)) {
         case 11:
            var2 = new g7("chart-properties", new a8k());
            break;
         case 12:
            var2 = new g7("graphic-properties", new p3w());
            break;
         case 13:
            var2 = new g7("table-cell-properties", new b4u());
            break;
         case 14:
            var2 = new g7("paragraph-properties", new v5n());
            break;
         case 15:
            var2 = new g7("text-properties", new j9d());
            break;
         case 16:
            var2 = new g7("section-properties", new d5z());
            break;
         case 17:
            var2 = new g7("ruby-properties", new r1w());
            break;
         case 18:
            var2 = new g7("table-properties", new m3y());
            break;
         case 19:
            var2 = new g7("table-column-properties", new n0l());
            break;
         case 20:
            var2 = new g7("table-row-properties", new s6j());
            break;
         case 21:
            var2 = new g7("drawing-page-properties", new r9l());
            break;
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Wrong element: ", var1}));
      }

      this.n3.addItem(var2);
      return var2;
   }

   public final void n5(g7 var1) {
      this.n3.addItem(var1);
   }

   public final String n5() {
      return this.n5;
   }

   public final void l6(String var1) {
      this.n5 = var1;
   }

   public final String l6() {
      return this.k5;
   }

   public final int k5() {
      return this.x8;
   }

   public final void n5(int var1) {
      this.x8 = var1;
   }

   public final List<g7> u3() {
      return this.n3;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 a6() {
      return e2;
   }

   // $VF: synthetic method
   static String n5(y2i var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(y2i var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String k5(y2i var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String u3(y2i var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String a6(y2i var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static String u9(y2i var0, String var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static boolean n5(y2i var0, boolean var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static String h0(y2i var0, String var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static String c8(y2i var0, String var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static long n5(y2i var0, long var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static int n5(y2i var0, int var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static List n5(y2i var0) {
      return var0.n3;
   }

   // $VF: synthetic method
   static List l6(y2i var0) {
      return var0.y4;
   }
}
