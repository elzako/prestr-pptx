package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class s7m extends b3 {
   private long n5;
   private int l6;
   private n9v k5;
   private b9y u3;
   private j3z a6;
   private e5k u9;
   private String h0;
   private h6m c8;
   private static final com.aspose.slides.internal.v6g.u9 t2 = new com.aspose.slides.internal.v6g.u9(
      "idx", "pos", "numFmt", "spPr", "txPr", "visibility", "separator", "extLst"
   );

   public s7m(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.e2();
      s7m$1 var2 = new s7m$1(this);
      n5(var1, var2);
      n5(var1, new s7m$2(this, var1));
   }

   public s7m() {
      this.e2();
   }

   private void e2() {
      this.l6 = 0;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("idx", com.aspose.slides.ms.System.Xml.f4.l6(this.n5));
      if (this.l6 != 0) {
         var2.l6("pos", v2p.n5(this.l6));
      }

      if (this.k5 != null) {
         this.k5.n5("cx", var2, "numFmt");
      }

      if (this.u3 != null) {
         this.u3.n5("cx", var2, "spPr");
      }

      if (this.a6 != null) {
         this.a6.n5("cx", var2, "txPr");
      }

      if (this.u9 != null) {
         this.u9.n5("cx", var2, "visibility");
      }

      if (this.h0 != null) {
         this.n5("cx", var2, "separator", this.h0, false);
      }

      if (this.c8 != null) {
         this.c8.n5("cx", var2, "extLst");
      }

      var2.s7();
   }

   public final n9v n5() {
      if (this.k5 != null) {
         throw new Exception("Only one <numFmt> element can be added.");
      }

      this.k5 = new n9v();
      return this.k5;
   }

   public final b9y l6() {
      if (this.u3 != null) {
         throw new Exception("Only one <spPr> element can be added.");
      }

      this.u3 = new b9y();
      return this.u3;
   }

   public final j3z k5() {
      if (this.a6 != null) {
         throw new Exception("Only one <txPr> element can be added.");
      }

      this.a6 = new j3z();
      return this.a6;
   }

   public final e5k u3() {
      if (this.u9 != null) {
         throw new Exception("Only one <visibility> element can be added.");
      }

      this.u9 = new e5k();
      return this.u9;
   }

   public final void n5(h6m var1) {
      this.c8 = var1;
   }

   public final long a6() {
      return this.n5;
   }

   public final void n5(long var1) {
      this.n5 = var1;
   }

   public final int u9() {
      return this.l6;
   }

   public final void n5(int var1) {
      this.l6 = var1;
   }

   public final n9v h0() {
      return this.k5;
   }

   public final b9y c8() {
      return this.u3;
   }

   public final j3z t2() {
      return this.a6;
   }

   public final e5k s7() {
      return this.u9;
   }

   public final String x8() {
      return this.h0;
   }

   public final void n5(String var1) {
      this.h0 = var1;
   }

   public final h6m n3() {
      return this.c8;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 y4() {
      return t2;
   }

   // $VF: synthetic method
   static long n5(s7m var0, long var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static int n5(s7m var0, int var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static n9v n5(s7m var0, n9v var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static b9y n5(s7m var0, b9y var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static j3z n5(s7m var0, j3z var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static e5k n5(s7m var0, e5k var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static String n5(s7m var0, String var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static String n5(s7m var0) {
      return var0.h0;
   }

   // $VF: synthetic method
   static h6m n5(s7m var0, h6m var1) {
      return var0.c8 = var1;
   }
}
