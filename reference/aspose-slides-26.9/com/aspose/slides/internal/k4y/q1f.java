package com.aspose.slides.internal.k4y;

public class q1f extends b3 {
   private int l6;
   private boolean k5;
   private boolean u3;
   private boolean a6;
   private boolean u9;
   private long h0;
   private int c8;
   private long t2;
   private long s7;
   private long x8;
   private long n3;
   private long y4;
   private long e2;
   private long t9;
   private long z1;
   private long t4;
   private String q0;
   private h0o z3;
   public static final int n5 = m2u.n5("topLeft");
   private static final com.aspose.slides.internal.v6g.u9 m1 = new com.aspose.slides.internal.v6g.u9(
      "pane",
      "showHeader",
      "label",
      "data",
      "extendable",
      "count",
      "axis",
      "dimension",
      "start",
      "min",
      "max",
      "activeRow",
      "activeCol",
      "previousRow",
      "previousCol",
      "click",
      "r:id",
      "pivotArea"
   );

   public q1f(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      q1f$1 var2 = new q1f$1(this);
      n5(var1, var2);
      n5(var1, new q1f$2(this, var1));
   }

   public q1f() {
      this.l6();
      this.z3 = new h0o();
   }

   private void l6() {
      this.l6 = n5;
      this.k5 = false;
      this.u3 = false;
      this.a6 = false;
      this.u9 = false;
      this.h0 = 0L;
      this.c8 = 0;
      this.t2 = 0L;
      this.s7 = 0L;
      this.x8 = 0L;
      this.n3 = 0L;
      this.y4 = 0L;
      this.e2 = 0L;
      this.t9 = 0L;
      this.z1 = 0L;
      this.t4 = 0L;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.l6 != n5) {
         var2.l6("pane", m2u.n5(this.l6));
      }

      if (this.k5) {
         var2.l6("showHeader", this.k5 ? "1" : "0");
      }

      if (this.u3) {
         var2.l6("label", this.u3 ? "1" : "0");
      }

      if (this.a6) {
         var2.l6("data", this.a6 ? "1" : "0");
      }

      if (this.u9) {
         var2.l6("extendable", this.u9 ? "1" : "0");
      }

      if ((this.h0 & 4294967295L) != 0L) {
         var2.l6("count", com.aspose.slides.ms.System.Xml.f4.l6(this.h0));
      }

      if (this.c8 != 0) {
         var2.l6("axis", w7m.n5(this.c8));
      }

      if ((this.t2 & 4294967295L) != 0L) {
         var2.l6("dimension", com.aspose.slides.ms.System.Xml.f4.l6(this.t2));
      }

      if ((this.s7 & 4294967295L) != 0L) {
         var2.l6("start", com.aspose.slides.ms.System.Xml.f4.l6(this.s7));
      }

      if ((this.x8 & 4294967295L) != 0L) {
         var2.l6("min", com.aspose.slides.ms.System.Xml.f4.l6(this.x8));
      }

      if ((this.n3 & 4294967295L) != 0L) {
         var2.l6("max", com.aspose.slides.ms.System.Xml.f4.l6(this.n3));
      }

      if ((this.y4 & 4294967295L) != 0L) {
         var2.l6("activeRow", com.aspose.slides.ms.System.Xml.f4.l6(this.y4));
      }

      if ((this.e2 & 4294967295L) != 0L) {
         var2.l6("activeCol", com.aspose.slides.ms.System.Xml.f4.l6(this.e2));
      }

      if ((this.t9 & 4294967295L) != 0L) {
         var2.l6("previousRow", com.aspose.slides.ms.System.Xml.f4.l6(this.t9));
      }

      if ((this.z1 & 4294967295L) != 0L) {
         var2.l6("previousCol", com.aspose.slides.ms.System.Xml.f4.l6(this.z1));
      }

      if ((this.t4 & 4294967295L) != 0L) {
         var2.l6("click", com.aspose.slides.ms.System.Xml.f4.l6(this.t4));
      }

      if (this.q0 != null) {
         if (var2.n5("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
            var2.u3("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
         }

         var2.l6("r:id", this.q0);
      }

      this.z3.n5("ssml", var2, "pivotArea");
      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return m1;
   }

   // $VF: synthetic method
   static int n5(q1f var0, int var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static boolean n5(q1f var0, boolean var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static boolean l6(q1f var0, boolean var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static boolean k5(q1f var0, boolean var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static boolean u3(q1f var0, boolean var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static long n5(q1f var0, long var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static int l6(q1f var0, int var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static long l6(q1f var0, long var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static long k5(q1f var0, long var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static long u3(q1f var0, long var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static long a6(q1f var0, long var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static long u9(q1f var0, long var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static long h0(q1f var0, long var1) {
      return var0.e2 = var1;
   }

   // $VF: synthetic method
   static long c8(q1f var0, long var1) {
      return var0.t9 = var1;
   }

   // $VF: synthetic method
   static long t2(q1f var0, long var1) {
      return var0.z1 = var1;
   }

   // $VF: synthetic method
   static long s7(q1f var0, long var1) {
      return var0.t4 = var1;
   }

   // $VF: synthetic method
   static String n5(q1f var0, String var1) {
      return var0.q0 = var1;
   }

   // $VF: synthetic method
   static h0o n5(q1f var0, h0o var1) {
      return var0.z3 = var1;
   }
}
