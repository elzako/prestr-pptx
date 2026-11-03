package com.aspose.slides.internal.k4y;

public class k8b extends b3 {
   private String l6;
   private long k5;
   private boolean u3;
   private int a6;
   public static final int n5 = j5f.n5("whole");
   private static final com.aspose.slides.internal.v6g.u9 u9 = new com.aspose.slides.internal.v6g.u9("spid", "grpId", "uiExpand", "bld");

   public k8b(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u3();
      k8b$1 var2 = new k8b$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public k8b() {
      this.u3();
   }

   private void u3() {
      this.u3 = false;
      this.a6 = n5;
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
         var2.l6("bld", j5f.n5(this.a6));
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
      return u9;
   }

   // $VF: synthetic method
   static String n5(k8b var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static long n5(k8b var0, long var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static boolean n5(k8b var0, boolean var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static int n5(k8b var0, int var1) {
      return var0.a6 = var1;
   }
}
