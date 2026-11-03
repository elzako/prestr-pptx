package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class g8a extends b3 {
   private int n5;
   private long l6;
   private int k5;
   private boolean u3;
   private boolean a6;
   private boolean u9;
   private boolean h0;
   private int c8;
   private String t2;
   private int s7;
   private long x8;
   private int n3;
   private boolean y4;
   private List<String> e2;
   private v3x t9;
   private g3o z1;
   private o1n t4;
   private l0k q0;
   private static final com.aspose.slides.internal.v6g.u9 z3 = new com.aspose.slides.internal.v6g.u9(
      "type",
      "dxfId",
      "priority",
      "stopIfTrue",
      "aboveAverage",
      "percent",
      "bottom",
      "operator",
      "text",
      "timePeriod",
      "rank",
      "stdDev",
      "equalAverage",
      "formula",
      "colorScale",
      "dataBar",
      "iconSet",
      "extLst"
   );

   public g8a(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      g8a$1 var2 = new g8a$1(this);
      n5(var1, var2);
      n5(var1, new g8a$2(this, var1));
   }

   public g8a() {
      this.l6();
   }

   private void l6() {
      this.n5 = 0;
      this.l6 = 4294967295L;
      this.u3 = false;
      this.a6 = true;
      this.u9 = false;
      this.h0 = false;
      this.c8 = 0;
      this.s7 = 0;
      this.x8 = 4294967295L;
      this.n3 = 0;
      this.y4 = false;
      this.e2 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != 0) {
         var2.l6("type", y2c.n5(this.n5));
      }

      if ((this.l6 & 4294967295L) != 4294967295L) {
         var2.l6("dxfId", com.aspose.slides.ms.System.Xml.f4.l6(this.l6));
      }

      var2.l6("priority", com.aspose.slides.ms.System.Xml.f4.n5(this.k5));
      if (this.u3) {
         var2.l6("stopIfTrue", this.u3 ? "1" : "0");
      }

      if (!this.a6) {
         var2.l6("aboveAverage", this.a6 ? "1" : "0");
      }

      if (this.u9) {
         var2.l6("percent", this.u9 ? "1" : "0");
      }

      if (this.h0) {
         var2.l6("bottom", this.h0 ? "1" : "0");
      }

      if (this.c8 != 0) {
         var2.l6("operator", e3f.n5(this.c8));
      }

      if (this.t2 != null) {
         var2.l6("text", this.t2);
      }

      if (this.s7 != 0) {
         var2.l6("timePeriod", e0h.n5(this.s7));
      }

      if ((this.x8 & 4294967295L) != 4294967295L) {
         var2.l6("rank", com.aspose.slides.ms.System.Xml.f4.l6(this.x8));
      }

      if (this.n3 != 0) {
         var2.l6("stdDev", com.aspose.slides.ms.System.Xml.f4.n5(this.n3));
      }

      if (this.y4) {
         var2.l6("equalAverage", this.y4 ? "1" : "0");
      }

      List$Enumerator var4 = this.e2.iterator();

      try {
         while (var4.hasNext()) {
            String var5 = (String)var4.next();
            this.n5("ssml", var2, "formula", var5, true);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      if (this.t9 != null) {
         this.t9.n5("ssml", var2, "colorScale");
      }

      if (this.z1 != null) {
         this.z1.n5("ssml", var2, "dataBar");
      }

      if (this.t4 != null) {
         this.t4.n5("ssml", var2, "iconSet");
      }

      if (this.q0 != null) {
         this.q0.n5("ssml", var2, "extLst");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return z3;
   }

   // $VF: synthetic method
   static int n5(g8a var0, int var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static long n5(g8a var0, long var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static int l6(g8a var0, int var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static boolean n5(g8a var0, boolean var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static boolean l6(g8a var0, boolean var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static boolean k5(g8a var0, boolean var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static boolean u3(g8a var0, boolean var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static int k5(g8a var0, int var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static String n5(g8a var0, String var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static int u3(g8a var0, int var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static long l6(g8a var0, long var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static int a6(g8a var0, int var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static boolean a6(g8a var0, boolean var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static List n5(g8a var0) {
      return var0.e2;
   }

   // $VF: synthetic method
   static v3x n5(g8a var0, v3x var1) {
      return var0.t9 = var1;
   }

   // $VF: synthetic method
   static g3o n5(g8a var0, g3o var1) {
      return var0.z1 = var1;
   }

   // $VF: synthetic method
   static o1n n5(g8a var0, o1n var1) {
      return var0.t4 = var1;
   }

   // $VF: synthetic method
   static l0k n5(g8a var0, l0k var1) {
      return var0.q0 = var1;
   }
}
