package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class m4k extends b3 {
   private String n5;
   private String l6;
   private String k5;
   private String u3;
   private String a6;
   private byte u9;
   private List<a4l> h0;
   private y2h c8;
   private c2u t2;
   private z4s s7;
   private List<x6b> x8;
   private static final com.aspose.slides.internal.v6g.u9 n3 = new com.aspose.slides.internal.v6g.u9(
      "chart:values-cell-range-address",
      "chart:label-cell-address",
      "chart:class",
      "chart:attached-axis",
      "chart:style-name",
      "loext:hide-legend",
      "domain",
      "mean-value",
      "regression-curve",
      "error-indicator",
      "data-point"
   );

   public m4k(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.s7();
      m4k$1 var2 = new m4k$1(this);
      n5(var1, var2);
      n5(var1, new m4k$2(this, var1));
   }

   public m4k() {
      this.s7();
   }

   private void s7() {
      this.u9 = -1;
      this.h0 = new List<>();
      this.x8 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         var2.l6("chart:values-cell-range-address", this.n5);
      }

      if (this.l6 != null) {
         var2.l6("chart:label-cell-address", this.l6);
      }

      if (this.k5 != null) {
         var2.l6("chart:class", this.k5);
      }

      if (this.u3 != null) {
         var2.l6("chart:attached-axis", this.u3);
      }

      if (this.a6 != null) {
         var2.l6("chart:style-name", this.a6);
      }

      if (this.u9 != -1) {
         var2.l6("loext:hide-legend", this.u9 == 1 ? "true" : "false");
      }

      List$Enumerator var4 = this.h0.iterator();

      try {
         while (var4.hasNext()) {
            a4l var5 = (a4l)var4.next();
            var5.n5("chart", var2, "domain");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      if (this.c8 != null) {
         this.c8.n5("chart", var2, "mean-value");
      }

      if (this.t2 != null) {
         this.t2.n5("chart", var2, "regression-curve");
      }

      if (this.s7 != null) {
         this.s7.n5("chart", var2, "error-indicator");
      }

      List$Enumerator var14 = this.x8.iterator();

      try {
         while (var14.hasNext()) {
            x6b var6 = (x6b)var14.next();
            var6.n5("chart", var2, "data-point");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var14, IDisposable.class)) {
            var14.dispose();
         }
      }

      var2.s7();
   }

   public final String n5() {
      return this.n5;
   }

   public final String l6() {
      return this.l6;
   }

   public final String k5() {
      return this.k5;
   }

   public final String u3() {
      return this.u3;
   }

   public final String a6() {
      return this.a6;
   }

   public final byte u9() {
      return this.u9;
   }

   public final a4l[] h0() {
      return this.h0.toArray(new a4l[0]);
   }

   public final x6b[] c8() {
      return this.x8.toArray(new x6b[0]);
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 t2() {
      return n3;
   }

   // $VF: synthetic method
   static String n5(m4k var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(m4k var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String k5(m4k var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String u3(m4k var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String a6(m4k var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static byte n5(m4k var0, byte var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static List n5(m4k var0) {
      return var0.h0;
   }

   // $VF: synthetic method
   static y2h n5(m4k var0, y2h var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static c2u n5(m4k var0, c2u var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static z4s n5(m4k var0, z4s var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static List l6(m4k var0) {
      return var0.x8;
   }
}
