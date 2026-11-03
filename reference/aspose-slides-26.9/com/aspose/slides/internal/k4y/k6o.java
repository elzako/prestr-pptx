package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class k6o extends b3 {
   private int k5;
   private String u3;
   private String a6;
   private int u9;
   private String h0;
   private String c8;
   private String t2;
   private String s7;
   private String x8;
   private String n3;
   private String y4;
   private String e2;
   private List<g3e> t9;
   public static final int n5 = p3r.n5("default");
   public static final int l6 = v1e.n5("custom");
   private static final com.aspose.slides.internal.v6g.u9 z1 = new com.aspose.slides.internal.v6g.u9(
      "presentation:node-type",
      "presentation:preset-id",
      "presentation:preset-sub-type",
      "presentation:preset-class",
      "presentation:master-element",
      "presentation:group-id",
      "anim:id",
      "anim:command",
      "smil:begin",
      "smil:end",
      "smil:targetElement",
      "anim:sub-item",
      "param"
   );

   public k6o(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      k6o$1 var2 = new k6o$1(this);
      n5(var1, var2);
      n5(var1, new k6o$2(this, var1));
   }

   public k6o() {
      this.l6();
   }

   private void l6() {
      this.k5 = n5;
      this.u9 = l6;
      this.t9 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.k5 != n5) {
         var2.l6("presentation:node-type", p3r.n5(this.k5));
      }

      if (this.u3 != null) {
         var2.l6("presentation:preset-id", this.u3);
      }

      if (this.a6 != null) {
         var2.l6("presentation:preset-sub-type", this.a6);
      }

      if (this.u9 != l6) {
         var2.l6("presentation:preset-class", v1e.n5(this.u9));
      }

      if (this.h0 != null) {
         var2.l6("presentation:master-element", this.h0);
      }

      if (this.c8 != null) {
         var2.l6("presentation:group-id", this.c8);
      }

      if (this.t2 != null) {
         var2.l6("anim:id", this.t2);
      }

      var2.l6("anim:command", this.s7);
      if (this.x8 != null) {
         var2.l6("smil:begin", this.x8);
      }

      if (this.n3 != null) {
         var2.l6("smil:end", this.n3);
      }

      if (this.y4 != null) {
         var2.l6("smil:targetElement", this.y4);
      }

      if (this.e2 != null) {
         var2.l6("anim:sub-item", this.e2);
      }

      List$Enumerator var4 = this.t9.iterator();

      try {
         while (var4.hasNext()) {
            g3e var5 = (g3e)var4.next();
            var5.n5("anim", var2, "param");
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
      return z1;
   }

   // $VF: synthetic method
   static int n5(k6o var0, int var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String n5(k6o var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String l6(k6o var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static int l6(k6o var0, int var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static String k5(k6o var0, String var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static String u3(k6o var0, String var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static String a6(k6o var0, String var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static String u9(k6o var0, String var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static String h0(k6o var0, String var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static String c8(k6o var0, String var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static String t2(k6o var0, String var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static String s7(k6o var0, String var1) {
      return var0.e2 = var1;
   }

   // $VF: synthetic method
   static List n5(k6o var0) {
      return var0.t9;
   }
}
