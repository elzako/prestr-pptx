package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class j1w extends b3 {
   private int n5;
   private String l6;
   private String k5;
   private String u3;
   private String a6;
   private String u9;
   private String h0;
   private int c8;
   private int t2;
   private String s7;
   private List<h0> x8;
   private static final com.aspose.slides.internal.v6g.u9 n3 = new com.aspose.slides.internal.v6g.u9(
      "fo:text-align",
      "text:space-before",
      "text:min-label-width",
      "text:min-label-distance",
      "style:font-name",
      "fo:width",
      "fo:height",
      "style:vertical-rel",
      "style:vertical-pos",
      "svg:y"
   );

   public j1w(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.a6();
      j1w$1 var2 = new j1w$1(this);
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
               switch (n3.n5(var1.n3())) {
                  default:
                     h0 var5 = new h0(var1);
                     this.x8.addItem(var5);
                     var4 = true;
               }
            }
         }
      }
   }

   public j1w() {
      this.a6();
   }

   private void a6() {
      this.n5 = 0;
      this.c8 = 0;
      this.t2 = 0;
      this.x8 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != 0) {
         var2.l6("fo:text-align", g6k.n5(this.n5));
      }

      if (this.l6 != null) {
         var2.l6("text:space-before", this.l6);
      }

      if (this.k5 != null) {
         var2.l6("text:min-label-width", this.k5);
      }

      if (this.u3 != null) {
         var2.l6("text:min-label-distance", this.u3);
      }

      if (this.a6 != null) {
         var2.l6("style:font-name", this.a6);
      }

      if (this.u9 != null) {
         var2.l6("fo:width", this.u9);
      }

      if (this.h0 != null) {
         var2.l6("fo:height", this.h0);
      }

      if (this.c8 != 0) {
         var2.l6("style:vertical-rel", s5t.n5(this.c8));
      }

      if (this.t2 != 0) {
         var2.l6("style:vertical-pos", d1v.n5(this.t2));
      }

      if (this.s7 != null) {
         var2.l6("svg:y", this.s7);
      }

      List$Enumerator var4 = this.x8.iterator();

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

   public final String n5() {
      return this.l6;
   }

   public final void n5(String var1) {
      this.l6 = var1;
   }

   public final String l6() {
      return this.k5;
   }

   public final void l6(String var1) {
      this.k5 = var1;
   }

   public final String k5() {
      return this.u9;
   }

   public final void k5(String var1) {
      this.u9 = var1;
   }

   public final void u3(String var1) {
      this.h0 = var1;
   }

   public final void n5(int var1) {
      this.c8 = var1;
   }

   public final void l6(int var1) {
      this.t2 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u3() {
      return n3;
   }

   // $VF: synthetic method
   static int n5(j1w var0, int var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String n5(j1w var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String l6(j1w var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String k5(j1w var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String u3(j1w var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static String a6(j1w var0, String var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static String u9(j1w var0, String var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static int l6(j1w var0, int var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static int k5(j1w var0, int var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static String h0(j1w var0, String var1) {
      return var0.s7 = var1;
   }
}
