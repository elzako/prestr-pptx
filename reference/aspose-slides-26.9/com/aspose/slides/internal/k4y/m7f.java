package com.aspose.slides.internal.k4y;

public class m7f extends b3 {
   private String l6;
   private long k5;
   private boolean u3;
   private int a6;
   private long u9;
   private boolean h0;
   private boolean c8;
   private boolean t2;
   private String s7;
   private x6q x8;
   public static final int n5 = o6z.n5("whole");
   private static final com.aspose.slides.internal.v6g.u9 n3 = new com.aspose.slides.internal.v6g.u9(
      "spid", "grpId", "uiExpand", "build", "bldLvl", "animBg", "autoUpdateAnimBg", "rev", "advAuto", "tmplLst"
   );

   public m7f(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.x8();
      m7f$1 var2 = new m7f$1(this);
      n5(var1, var2);
      n5(var1, new m7f$2(this, var1));
   }

   public m7f() {
      this.x8();
   }

   private void x8() {
      this.u3 = false;
      this.a6 = n5;
      this.u9 = 1L;
      this.h0 = false;
      this.c8 = true;
      this.t2 = false;
      this.s7 = "indefinite";
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("spid", this.l6);
      var2.l6("grpId", com.aspose.slides.ms.System.Xml.f4.l6(this.k5));
      if (this.u3) {
         var2.l6("uiExpand", this.u3 ? "1" : "0");
      }

      if (this.a6 != n5) {
         var2.l6("build", o6z.n5(this.a6));
      }

      if ((this.u9 & 4294967295L) != 1L) {
         var2.l6("bldLvl", com.aspose.slides.ms.System.Xml.f4.l6(this.u9));
      }

      if (this.h0) {
         var2.l6("animBg", this.h0 ? "1" : "0");
      }

      if (!this.c8) {
         var2.l6("autoUpdateAnimBg", this.c8 ? "1" : "0");
      }

      if (this.t2) {
         var2.l6("rev", this.t2 ? "1" : "0");
      }

      if (!"indefinite".equals(this.s7)) {
         var2.l6("advAuto", this.s7);
      }

      if (this.x8 != null) {
         this.x8.n5("p", var2, "tmplLst");
      }

      var2.s7();
   }

   public final String n5() {
      return this.l6;
   }

   public final void n5(String var1) {
      this.l6 = var1;
   }

   public final long l6() {
      return this.k5;
   }

   public final void n5(long var1) {
      this.k5 = var1;
   }

   public final boolean k5() {
      return this.u3;
   }

   public final void n5(boolean var1) {
      this.u3 = var1;
   }

   public final int u3() {
      return this.a6;
   }

   public final void n5(int var1) {
      this.a6 = var1;
   }

   public final long a6() {
      return this.u9;
   }

   public final void l6(long var1) {
      this.u9 = var1;
   }

   public final boolean u9() {
      return this.h0;
   }

   public final void l6(boolean var1) {
      this.h0 = var1;
   }

   public final boolean h0() {
      return this.c8;
   }

   public final boolean c8() {
      return this.t2;
   }

   public final void k5(boolean var1) {
      this.t2 = var1;
   }

   public final String t2() {
      return this.s7;
   }

   public final void l6(String var1) {
      this.s7 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 s7() {
      return n3;
   }

   // $VF: synthetic method
   static String n5(m7f var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static long n5(m7f var0, long var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static boolean n5(m7f var0, boolean var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static int n5(m7f var0, int var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static long l6(m7f var0, long var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static boolean l6(m7f var0, boolean var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static boolean k5(m7f var0, boolean var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static boolean u3(m7f var0, boolean var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static String l6(m7f var0, String var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static x6q n5(m7f var0, x6q var1) {
      return var0.x8 = var1;
   }
}
