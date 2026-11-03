package com.aspose.slides.internal.k4y;

public class s6y extends b3 {
   private int l6;
   private int k5;
   private int u3;
   private int a6;
   private String u9;
   private int h0;
   private String c8;
   private j9g t2;
   private a5d s7;
   private m2g x8;
   private t4g n3;
   public static final int n5 = s3k.n5("pending");
   private static final com.aspose.slides.internal.v6g.u9 y4 = new com.aspose.slides.internal.v6g.u9(
      "table:type",
      "table:position",
      "table:table",
      "table:multi-deletion-spanned",
      "table:id",
      "table:acceptance-state",
      "table:rejecting-change-id",
      "change-info",
      "dependencies",
      "deletions",
      "cut-offs"
   );

   public s6y(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      s6y$1 var2 = new s6y$1(this);
      n5(var1, var2);
      n5(var1, new s6y$2(this, var1));
   }

   public s6y() {
      this.l6();
      this.t2 = new j9g();
   }

   private void l6() {
      this.l6 = 0;
      this.u3 = 0;
      this.a6 = 0;
      this.h0 = n5;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("table:type", j9p.n5(this.l6));
      var2.l6("table:position", com.aspose.slides.ms.System.Xml.f4.n5(this.k5));
      if (this.u3 != 0) {
         var2.l6("table:table", com.aspose.slides.ms.System.Xml.f4.n5(this.u3));
      }

      if (this.a6 != 0) {
         var2.l6("table:multi-deletion-spanned", com.aspose.slides.ms.System.Xml.f4.n5(this.a6));
      }

      var2.l6("table:id", this.u9);
      if (this.h0 != n5) {
         var2.l6("table:acceptance-state", s3k.n5(this.h0));
      }

      if (this.c8 != null) {
         var2.l6("table:rejecting-change-id", this.c8);
      }

      this.t2.n5("office", var2, "change-info");
      if (this.s7 != null) {
         this.s7.n5("table", var2, "dependencies");
      }

      if (this.x8 != null) {
         this.x8.n5("table", var2, "deletions");
      }

      if (this.n3 != null) {
         this.n3.n5("table", var2, "cut-offs");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return y4;
   }

   // $VF: synthetic method
   static int n5(s6y var0, int var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static int l6(s6y var0, int var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static int k5(s6y var0, int var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static int u3(s6y var0, int var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static String n5(s6y var0, String var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static int a6(s6y var0, int var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static String l6(s6y var0, String var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static j9g n5(s6y var0, j9g var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static a5d n5(s6y var0, a5d var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static m2g n5(s6y var0, m2g var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static t4g n5(s6y var0, t4g var1) {
      return var0.n3 = var1;
   }
}
