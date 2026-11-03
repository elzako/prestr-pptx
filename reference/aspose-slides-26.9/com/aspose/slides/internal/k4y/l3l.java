package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class l3l extends b3 {
   private int k5;
   private String u3;
   private int a6;
   private String u9;
   private String h0;
   private String c8;
   private String t2;
   private String s7;
   private String x8;
   private List<s6x> n3;
   public static final int n5 = d4g.n5("objectBoundingBox");
   public static final int l6 = c6m.n5("pad");
   private static final com.aspose.slides.internal.v6g.u9 y4 = new com.aspose.slides.internal.v6g.u9(
      "svg:gradientUnits", "svg:gradientTransform", "svg:spreadMethod", "draw:name", "draw:display-name", "svg:x1", "svg:y1", "svg:x2", "svg:y2", "stop"
   );

   public l3l(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      l3l$1 var2 = new l3l$1(this);
      n5(var1, var2);
      n5(var1, new l3l$2(this, var1));
   }

   public l3l() {
      this.l6();
   }

   private void l6() {
      this.k5 = n5;
      this.a6 = l6;
      this.c8 = "0%";
      this.t2 = "0%";
      this.s7 = "100%";
      this.x8 = "100%";
      this.n3 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.k5 != n5) {
         var2.l6("svg:gradientUnits", d4g.n5(this.k5));
      }

      if (this.u3 != null) {
         var2.l6("svg:gradientTransform", this.u3);
      }

      if (this.a6 != l6) {
         var2.l6("svg:spreadMethod", c6m.n5(this.a6));
      }

      var2.l6("draw:name", this.u9);
      if (this.h0 != null) {
         var2.l6("draw:display-name", this.h0);
      }

      if (!"0%".equals(this.c8)) {
         var2.l6("svg:x1", this.c8);
      }

      if (!"0%".equals(this.t2)) {
         var2.l6("svg:y1", this.t2);
      }

      if (!"100%".equals(this.s7)) {
         var2.l6("svg:x2", this.s7);
      }

      if (!"100%".equals(this.x8)) {
         var2.l6("svg:y2", this.x8);
      }

      List$Enumerator var4 = this.n3.iterator();

      try {
         while (var4.hasNext()) {
            s6x var5 = (s6x)var4.next();
            var5.n5("svg", var2, "stop");
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
      return y4;
   }

   // $VF: synthetic method
   static int n5(l3l var0, int var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String n5(l3l var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static int l6(l3l var0, int var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static String l6(l3l var0, String var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static String k5(l3l var0, String var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static String u3(l3l var0, String var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static String a6(l3l var0, String var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static String u9(l3l var0, String var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static String h0(l3l var0, String var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static List n5(l3l var0) {
      return var0.n3;
   }
}
