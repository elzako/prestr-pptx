package com.aspose.slides.internal.k4y;

public class h2d extends b3 {
   private int l6;
   private boolean k5;
   private String u3;
   private boolean a6;
   private boolean u9;
   private boolean h0;
   private boolean c8;
   private String t2;
   private String s7;
   private boolean x8;
   private long n3;
   private boolean y4;
   private String e2;
   public static final int n5 = c3.n5("normal");
   private static final com.aspose.slides.internal.v6g.u9 t9 = new com.aspose.slides.internal.v6g.u9(
      "t", "aca", "ref", "dt2D", "dtr", "del1", "del2", "r1", "r2", "ca", "si", "bx"
   );

   public h2d(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.h0();
      h2d$1 var2 = new h2d$1(this);
      n5(var1, var2);
      if (!var1.m1()) {
         var1.u9();
         this.e2 = var1.z1();
      }
   }

   public h2d() {
      this.h0();
   }

   private void h0() {
      this.l6 = n5;
      this.k5 = false;
      this.a6 = false;
      this.u9 = false;
      this.h0 = false;
      this.c8 = false;
      this.x8 = false;
      this.n3 = 4294967295L;
      this.y4 = false;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.l6 != n5) {
         var2.l6("t", c3.n5(this.l6));
      }

      if (this.k5) {
         var2.l6("aca", this.k5 ? "1" : "0");
      }

      if (this.u3 != null) {
         var2.l6("ref", this.u3);
      }

      if (this.a6) {
         var2.l6("dt2D", this.a6 ? "1" : "0");
      }

      if (this.u9) {
         var2.l6("dtr", this.u9 ? "1" : "0");
      }

      if (this.h0) {
         var2.l6("del1", this.h0 ? "1" : "0");
      }

      if (this.c8) {
         var2.l6("del2", this.c8 ? "1" : "0");
      }

      if (this.t2 != null) {
         var2.l6("r1", this.t2);
      }

      if (this.s7 != null) {
         var2.l6("r2", this.s7);
      }

      if (this.x8) {
         var2.l6("ca", this.x8 ? "1" : "0");
      }

      if ((this.n3 & 4294967295L) != 4294967295L) {
         var2.l6("si", com.aspose.slides.ms.System.Xml.f4.l6(this.n3));
      }

      if (this.y4) {
         var2.l6("bx", this.y4 ? "1" : "0");
      }

      var2.l6(this.e2);
      var2.s7();
   }

   public final int n5() {
      return this.l6;
   }

   public final void n5(int var1) {
      this.l6 = var1;
   }

   public final String l6() {
      return this.u3;
   }

   public final void n5(String var1) {
      this.u3 = var1;
   }

   public final boolean k5() {
      return this.x8;
   }

   public final void n5(boolean var1) {
      this.x8 = var1;
   }

   public final long u3() {
      return this.n3;
   }

   public final void n5(long var1) {
      this.n3 = var1;
   }

   public final String a6() {
      return this.e2;
   }

   public final void l6(String var1) {
      this.e2 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u9() {
      return t9;
   }

   // $VF: synthetic method
   static int n5(h2d var0, int var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static boolean n5(h2d var0, boolean var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String n5(h2d var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static boolean l6(h2d var0, boolean var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static boolean k5(h2d var0, boolean var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static boolean u3(h2d var0, boolean var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static boolean a6(h2d var0, boolean var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static String l6(h2d var0, String var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static String k5(h2d var0, String var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static boolean u9(h2d var0, boolean var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static long n5(h2d var0, long var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static boolean h0(h2d var0, boolean var1) {
      return var0.y4 = var1;
   }
}
