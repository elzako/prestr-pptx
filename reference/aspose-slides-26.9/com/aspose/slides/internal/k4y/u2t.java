package com.aspose.slides.internal.k4y;

public class u2t extends b3 {
   private String a6;
   private int u9;
   private int h0;
   private int c8;
   private int t2;
   private String s7;
   private String x8;
   private int n3;
   private int y4;
   private int e2;
   private long t9;
   private e8v z1;
   public static final int n5 = z6a.n5("none");
   public static final int l6 = b1b.n5("none");
   public static final int k5 = u9i.n5("medium");
   public static final int u3 = v5w.n5("simple");
   private static final com.aspose.slides.internal.v6g.u9 t4 = new com.aspose.slides.internal.v6g.u9(
      "script:event-name",
      "presentation:action",
      "presentation:effect",
      "presentation:direction",
      "presentation:speed",
      "presentation:start-scale",
      "xlink:href",
      "xlink:type",
      "xlink:show",
      "xlink:actuate",
      "presentation:verb",
      "sound"
   );

   public u2t(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      u2t$1 var2 = new u2t$1(this);
      n5(var1, var2);
      n5(var1, new u2t$2(this, var1));
   }

   public u2t() {
      this.l6();
   }

   private void l6() {
      this.u9 = 0;
      this.h0 = n5;
      this.c8 = l6;
      this.t2 = k5;
      this.s7 = "100%";
      this.n3 = u3;
      this.y4 = 0;
      this.e2 = 0;
      this.t9 = 4294967295L;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("script:event-name", this.a6);
      var2.l6("presentation:action", a1i.n5(this.u9));
      if (this.h0 != n5) {
         var2.l6("presentation:effect", z6a.n5(this.h0));
      }

      if (this.c8 != l6) {
         var2.l6("presentation:direction", b1b.n5(this.c8));
      }

      if (this.t2 != k5) {
         var2.l6("presentation:speed", u9i.n5(this.t2));
      }

      if (!"100%".equals(this.s7)) {
         var2.l6("presentation:start-scale", this.s7);
      }

      if (this.x8 != null) {
         var2.l6("xlink:href", this.x8);
      }

      if (this.n3 != u3) {
         var2.l6("xlink:type", v5w.n5(this.n3));
      }

      if (this.y4 != 0) {
         var2.l6("xlink:show", h8e.n5(this.y4));
      }

      if (this.e2 != 0) {
         var2.l6("xlink:actuate", p9c.n5(this.e2));
      }

      if ((this.t9 & 4294967295L) != 4294967295L) {
         var2.l6("presentation:verb", com.aspose.slides.ms.System.Xml.f4.l6(this.t9));
      }

      if (this.z1 != null) {
         this.z1.n5("presentation", var2, "sound");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return t4;
   }

   // $VF: synthetic method
   static String n5(u2t var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static int n5(u2t var0, int var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static int l6(u2t var0, int var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static int k5(u2t var0, int var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static int u3(u2t var0, int var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static String l6(u2t var0, String var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static String k5(u2t var0, String var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static int a6(u2t var0, int var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static int u9(u2t var0, int var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static int h0(u2t var0, int var1) {
      return var0.e2 = var1;
   }

   // $VF: synthetic method
   static long n5(u2t var0, long var1) {
      return var0.t9 = var1;
   }

   // $VF: synthetic method
   static e8v n5(u2t var0, e8v var1) {
      return var0.z1 = var1;
   }
}
