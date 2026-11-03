package com.aspose.slides.internal.k4y;

public class u5v extends b3 {
   private String a6;
   private int u9;
   private int h0;
   private int c8;
   private com.aspose.slides.ms.System.s4 t2 = new com.aspose.slides.ms.System.s4();
   private String s7;
   private String x8;
   private e8v n3;
   public static final int n5 = z6a.n5("none");
   public static final int l6 = b1b.n5("none");
   public static final int k5 = u9i.n5("medium");
   public static final com.aspose.slides.ms.System.s4 u3 = com.aspose.slides.ms.System.s4.k5.n3();
   private static final com.aspose.slides.internal.v6g.u9 y4 = new com.aspose.slides.internal.v6g.u9(
      "draw:shape-id",
      "presentation:effect",
      "presentation:direction",
      "presentation:speed",
      "presentation:delay",
      "presentation:start-scale",
      "presentation:path-id",
      "sound"
   );

   public u5v(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      u5v$1 var2 = new u5v$1(this);
      n5(var1, var2);
      n5(var1, new u5v$2(this, var1));
   }

   public u5v() {
      this.l6();
   }

   private void l6() {
      this.u9 = n5;
      this.h0 = l6;
      this.c8 = k5;
      u3.u3(this.t2);
      this.s7 = "100%";
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("draw:shape-id", this.a6);
      if (this.u9 != n5) {
         var2.l6("presentation:effect", z6a.n5(this.u9));
      }

      if (this.h0 != l6) {
         var2.l6("presentation:direction", b1b.n5(this.h0));
      }

      if (this.c8 != k5) {
         var2.l6("presentation:speed", u9i.n5(this.c8));
      }

      if (com.aspose.slides.ms.System.s4.a6(this.t2, u3)) {
         var2.l6("presentation:delay", n5(this.t2.n3()));
      }

      if (!"100%".equals(this.s7)) {
         var2.l6("presentation:start-scale", this.s7);
      }

      if (this.x8 != null) {
         var2.l6("presentation:path-id", this.x8);
      }

      if (this.n3 != null) {
         this.n3.n5("presentation", var2, "sound");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return y4;
   }

   // $VF: synthetic method
   static String n5(u5v var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static int n5(u5v var0, int var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static int l6(u5v var0, int var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static int k5(u5v var0, int var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.ms.System.s4 n5(u5v var0) {
      return var0.t2;
   }

   // $VF: synthetic method
   static String l6(u5v var0, String var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static String k5(u5v var0, String var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static e8v n5(u5v var0, e8v var1) {
      return var0.n3 = var1;
   }
}
