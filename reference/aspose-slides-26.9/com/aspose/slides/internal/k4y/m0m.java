package com.aspose.slides.internal.k4y;

public class m0m extends b3 {
   private String l6;
   private long k5;
   private boolean u3;
   private int a6;
   private boolean u9;
   public static final int n5 = e4h.n5("allAtOnce");
   private static final com.aspose.slides.internal.v6g.u9 h0 = new com.aspose.slides.internal.v6g.u9("spid", "grpId", "uiExpand", "bld", "animBg");

   public m0m(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u3();
      m0m$1 var2 = new m0m$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public m0m() {
      this.u3();
   }

   private void u3() {
      this.u3 = false;
      this.a6 = n5;
      this.u9 = true;
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
         var2.l6("bld", e4h.n5(this.a6));
      }

      if (!this.u9) {
         var2.l6("animBg", this.u9 ? "1" : "0");
      }

      var2.s7();
   }

   public final String n5() {
      return this.l6;
   }

   public final void n5(String var1) {
      this.l6 = var1;
   }

   public final int l6() {
      return this.a6;
   }

   public final void n5(int var1) {
      this.a6 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return h0;
   }

   // $VF: synthetic method
   static String n5(m0m var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static long n5(m0m var0, long var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static boolean n5(m0m var0, boolean var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static int n5(m0m var0, int var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static boolean l6(m0m var0, boolean var1) {
      return var0.u9 = var1;
   }
}
