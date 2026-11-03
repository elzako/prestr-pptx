package com.aspose.slides.internal.k4y;

public class y2w extends b3 {
   private String l6;
   private int k5;
   private String u3;
   private g4j a6;
   private f1g u9;
   private j9g h0;
   private a5d c8;
   private m2g t2;
   public static final int n5 = s3k.n5("pending");
   private static final com.aspose.slides.internal.v6g.u9 s7 = new com.aspose.slides.internal.v6g.u9(
      "table:id",
      "table:acceptance-state",
      "table:rejecting-change-id",
      "source-range-address",
      "target-range-address",
      "change-info",
      "dependencies",
      "deletions"
   );

   public y2w(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      y2w$1 var2 = new y2w$1(this);
      n5(var1, var2);
      n5(var1, new y2w$2(this, var1));
   }

   public y2w() {
      this.l6();
      this.a6 = new g4j();
      this.u9 = new f1g();
      this.h0 = new j9g();
   }

   private void l6() {
      this.k5 = n5;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("table:id", this.l6);
      if (this.k5 != n5) {
         var2.l6("table:acceptance-state", s3k.n5(this.k5));
      }

      if (this.u3 != null) {
         var2.l6("table:rejecting-change-id", this.u3);
      }

      this.a6.n5("table", var2, "source-range-address");
      this.u9.n5("table", var2, "target-range-address");
      this.h0.n5("office", var2, "change-info");
      if (this.c8 != null) {
         this.c8.n5("table", var2, "dependencies");
      }

      if (this.t2 != null) {
         this.t2.n5("table", var2, "deletions");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return s7;
   }

   // $VF: synthetic method
   static String n5(y2w var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static int n5(y2w var0, int var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String l6(y2w var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static g4j n5(y2w var0, g4j var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static f1g n5(y2w var0, f1g var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static j9g n5(y2w var0, j9g var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static a5d n5(y2w var0, a5d var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static m2g n5(y2w var0, m2g var1) {
      return var0.t2 = var1;
   }
}
