package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class a6w extends b3 {
   private String n5;
   private String l6;
   private String k5;
   private int u3;
   private int a6;
   private String u9;
   private String h0;
   private String c8;
   private String t2;
   private String s7;
   private String x8;
   private byte n3;
   private String y4;
   private byte e2;
   private int t9;
   private byte z1;
   private byte t4;
   private int q0;
   private int z3;
   private int m1;
   private int k7;
   private byte m3;
   private int z8;
   private int j5;
   private int w1;
   private int r4;
   private int c4;
   private int y2;
   private s3p y1;
   private d9m a0;
   private static final com.aspose.slides.internal.v6g.u9 d2 = new com.aspose.slides.internal.v6g.u9(
      "presAssocID",
      "presName",
      "presStyleLbl",
      "presStyleIdx",
      "presStyleCnt",
      "loTypeId",
      "loCatId",
      "qsTypeId",
      "qsCatId",
      "csTypeId",
      "csCatId",
      "coherent3DOff",
      "phldrT",
      "phldr",
      "custAng",
      "custFlipVert",
      "custFlipHor",
      "custSzX",
      "custSzY",
      "custScaleX",
      "custScaleY",
      "custT",
      "custLinFactX",
      "custLinFactY",
      "custLinFactNeighborX",
      "custLinFactNeighborY",
      "custRadScaleRad",
      "custRadScaleInc",
      "presLayoutVars",
      "style"
   );

   public a6w(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.j5();
      a6w$1 var2 = new a6w$1(this);
      n5(var1, var2);
      n5(var1, new a6w$2(this, var1));
   }

   public a6w() {
      this.j5();
   }

   private void j5() {
      this.u3 = 0;
      this.a6 = 0;
      this.n3 = -1;
      this.e2 = -1;
      this.t9 = 0;
      this.z1 = -1;
      this.t4 = -1;
      this.q0 = 0;
      this.z3 = 0;
      this.m1 = 0;
      this.k7 = 0;
      this.m3 = -1;
      this.z8 = 0;
      this.j5 = 0;
      this.w1 = 0;
      this.r4 = 0;
      this.c4 = 0;
      this.y2 = 0;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         var2.l6("presAssocID", this.n5);
      }

      if (this.l6 != null) {
         var2.l6("presName", this.l6);
      }

      if (this.k5 != null) {
         var2.l6("presStyleLbl", this.k5);
      }

      if (this.u3 != 0) {
         var2.l6("presStyleIdx", com.aspose.slides.ms.System.Xml.f4.n5(this.u3));
      }

      if (this.a6 != 0) {
         var2.l6("presStyleCnt", com.aspose.slides.ms.System.Xml.f4.n5(this.a6));
      }

      if (this.u9 != null) {
         var2.l6("loTypeId", this.u9);
      }

      if (this.h0 != null) {
         var2.l6("loCatId", this.h0);
      }

      if (this.c8 != null) {
         var2.l6("qsTypeId", this.c8);
      }

      if (this.t2 != null) {
         var2.l6("qsCatId", this.t2);
      }

      if (this.s7 != null) {
         var2.l6("csTypeId", this.s7);
      }

      if (this.x8 != null) {
         var2.l6("csCatId", this.x8);
      }

      if (this.n3 != -1) {
         var2.l6("coherent3DOff", this.n3 == 1 ? "1" : "0");
      }

      if (this.y4 != null) {
         var2.l6("phldrT", this.y4);
      }

      if (this.e2 != -1) {
         var2.l6("phldr", this.e2 == 1 ? "1" : "0");
      }

      if (this.t9 != 0) {
         var2.l6("custAng", com.aspose.slides.ms.System.Xml.f4.n5(this.t9));
      }

      if (this.z1 != -1) {
         var2.l6("custFlipVert", this.z1 == 1 ? "1" : "0");
      }

      if (this.t4 != -1) {
         var2.l6("custFlipHor", this.t4 == 1 ? "1" : "0");
      }

      if (this.q0 != 0) {
         var2.l6("custSzX", com.aspose.slides.ms.System.Xml.f4.n5(this.q0));
      }

      if (this.z3 != 0) {
         var2.l6("custSzY", com.aspose.slides.ms.System.Xml.f4.n5(this.z3));
      }

      if (this.m1 != 0) {
         var2.l6("custScaleX", com.aspose.slides.ms.System.Xml.f4.n5(this.m1));
      }

      if (this.k7 != 0) {
         var2.l6("custScaleY", com.aspose.slides.ms.System.Xml.f4.n5(this.k7));
      }

      if (this.m3 != -1) {
         var2.l6("custT", this.m3 == 1 ? "1" : "0");
      }

      if (this.z8 != 0) {
         var2.l6("custLinFactX", com.aspose.slides.ms.System.Xml.f4.n5(this.z8));
      }

      if (this.j5 != 0) {
         var2.l6("custLinFactY", com.aspose.slides.ms.System.Xml.f4.n5(this.j5));
      }

      if (this.w1 != 0) {
         var2.l6("custLinFactNeighborX", com.aspose.slides.ms.System.Xml.f4.n5(this.w1));
      }

      if (this.r4 != 0) {
         var2.l6("custLinFactNeighborY", com.aspose.slides.ms.System.Xml.f4.n5(this.r4));
      }

      if (this.c4 != 0) {
         var2.l6("custRadScaleRad", com.aspose.slides.ms.System.Xml.f4.n5(this.c4));
      }

      if (this.y2 != 0) {
         var2.l6("custRadScaleInc", com.aspose.slides.ms.System.Xml.f4.n5(this.y2));
      }

      if (this.y1 != null) {
         this.y1.n5("dgm", var2, "presLayoutVars");
      }

      if (this.a0 != null) {
         this.a0.n5("dgm", var2, "style");
      }

      var2.s7();
   }

   public final s3p n5() {
      if (this.y1 != null) {
         throw new Exception("Only one <presLayoutVars> element can be added.");
      }

      this.y1 = new s3p();
      return this.y1;
   }

   public final String l6() {
      return this.n5;
   }

   public final void n5(String var1) {
      this.n5 = var1;
   }

   public final String k5() {
      return this.l6;
   }

   public final void l6(String var1) {
      this.l6 = var1;
   }

   public final String u3() {
      return this.k5;
   }

   public final void k5(String var1) {
      this.k5 = var1;
   }

   public final int a6() {
      return this.u3;
   }

   public final void n5(int var1) {
      this.u3 = var1;
   }

   public final int u9() {
      return this.a6;
   }

   public final void l6(int var1) {
      this.a6 = var1;
   }

   public final String h0() {
      return this.u9;
   }

   public final void u3(String var1) {
      this.u9 = var1;
   }

   public final void a6(String var1) {
      this.h0 = var1;
   }

   public final String c8() {
      return this.c8;
   }

   public final void u9(String var1) {
      this.c8 = var1;
   }

   public final void h0(String var1) {
      this.t2 = var1;
   }

   public final String t2() {
      return this.s7;
   }

   public final void c8(String var1) {
      this.s7 = var1;
   }

   public final void t2(String var1) {
      this.x8 = var1;
   }

   public final void n5(byte var1) {
      this.e2 = var1;
   }

   public final int s7() {
      return this.t9;
   }

   public final void k5(int var1) {
      this.t9 = var1;
   }

   public final byte x8() {
      return this.z1;
   }

   public final void l6(byte var1) {
      this.z1 = var1;
   }

   public final byte n3() {
      return this.t4;
   }

   public final void k5(byte var1) {
      this.t4 = var1;
   }

   public final int y4() {
      return this.m1;
   }

   public final void u3(int var1) {
      this.m1 = var1;
   }

   public final int e2() {
      return this.k7;
   }

   public final void a6(int var1) {
      this.k7 = var1;
   }

   public final void u3(byte var1) {
      this.m3 = var1;
   }

   public final int t9() {
      return this.z8;
   }

   public final void u9(int var1) {
      this.z8 = var1;
   }

   public final int z1() {
      return this.j5;
   }

   public final void h0(int var1) {
      this.j5 = var1;
   }

   public final int t4() {
      return this.w1;
   }

   public final void c8(int var1) {
      this.w1 = var1;
   }

   public final int q0() {
      return this.r4;
   }

   public final void t2(int var1) {
      this.r4 = var1;
   }

   public final int z3() {
      return this.c4;
   }

   public final void s7(int var1) {
      this.c4 = var1;
   }

   public final int m1() {
      return this.y2;
   }

   public final void x8(int var1) {
      this.y2 = var1;
   }

   public final s3p k7() {
      return this.y1;
   }

   public final d9m m3() {
      return this.a0;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 z8() {
      return d2;
   }

   // $VF: synthetic method
   static String n5(a6w var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(a6w var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String k5(a6w var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static int n5(a6w var0, int var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static int l6(a6w var0, int var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static String u3(a6w var0, String var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static String a6(a6w var0, String var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static String u9(a6w var0, String var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static String h0(a6w var0, String var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static String c8(a6w var0, String var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static String t2(a6w var0, String var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static byte n5(a6w var0, byte var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static String s7(a6w var0, String var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static byte l6(a6w var0, byte var1) {
      return var0.e2 = var1;
   }

   // $VF: synthetic method
   static int k5(a6w var0, int var1) {
      return var0.t9 = var1;
   }

   // $VF: synthetic method
   static byte k5(a6w var0, byte var1) {
      return var0.z1 = var1;
   }

   // $VF: synthetic method
   static byte u3(a6w var0, byte var1) {
      return var0.t4 = var1;
   }

   // $VF: synthetic method
   static int u3(a6w var0, int var1) {
      return var0.q0 = var1;
   }

   // $VF: synthetic method
   static int a6(a6w var0, int var1) {
      return var0.z3 = var1;
   }

   // $VF: synthetic method
   static int u9(a6w var0, int var1) {
      return var0.m1 = var1;
   }

   // $VF: synthetic method
   static int h0(a6w var0, int var1) {
      return var0.k7 = var1;
   }

   // $VF: synthetic method
   static byte a6(a6w var0, byte var1) {
      return var0.m3 = var1;
   }

   // $VF: synthetic method
   static int c8(a6w var0, int var1) {
      return var0.z8 = var1;
   }

   // $VF: synthetic method
   static int t2(a6w var0, int var1) {
      return var0.j5 = var1;
   }

   // $VF: synthetic method
   static int s7(a6w var0, int var1) {
      return var0.w1 = var1;
   }

   // $VF: synthetic method
   static int x8(a6w var0, int var1) {
      return var0.r4 = var1;
   }

   // $VF: synthetic method
   static int n3(a6w var0, int var1) {
      return var0.c4 = var1;
   }

   // $VF: synthetic method
   static int y4(a6w var0, int var1) {
      return var0.y2 = var1;
   }

   // $VF: synthetic method
   static s3p n5(a6w var0, s3p var1) {
      return var0.y1 = var1;
   }

   // $VF: synthetic method
   static d9m n5(a6w var0, d9m var1) {
      return var0.a0 = var1;
   }
}
