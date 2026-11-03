package com.aspose.slides.internal.k4y;

public class f7x extends b3 {
   private String l6;
   private int k5;
   private String u3;
   private String a6;
   private long u9;
   private long h0;
   private String c8;
   private String t2;
   private String s7;
   private l8r x8;
   public static final int n5 = b2u.n5("parOf");
   private static final com.aspose.slides.internal.v6g.u9 n3 = new com.aspose.slides.internal.v6g.u9(
      "modelId", "type", "srcId", "destId", "srcOrd", "destOrd", "parTransId", "sibTransId", "presId", "extLst"
   );

   public f7x(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.t2();
      f7x$1 var2 = new f7x$1(this);
      n5(var1, var2);
      n5(var1, new f7x$2(this, var1));
   }

   public f7x() {
      this.t2();
   }

   private void t2() {
      this.k5 = n5;
      this.c8 = "0";
      this.t2 = "0";
      this.s7 = "";
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("modelId", this.l6);
      if (this.k5 != n5) {
         var2.l6("type", b2u.n5(this.k5));
      }

      var2.l6("srcId", this.u3);
      var2.l6("destId", this.a6);
      var2.l6("srcOrd", com.aspose.slides.ms.System.Xml.f4.l6(this.u9));
      var2.l6("destOrd", com.aspose.slides.ms.System.Xml.f4.l6(this.h0));
      if (!"0".equals(this.c8)) {
         var2.l6("parTransId", this.c8);
      }

      if (!"0".equals(this.t2)) {
         var2.l6("sibTransId", this.t2);
      }

      if (!"".equals(this.s7)) {
         var2.l6("presId", this.s7);
      }

      if (this.x8 != null) {
         this.x8.n5("dgm", var2, "extLst");
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
      return this.k5;
   }

   public final void n5(int var1) {
      this.k5 = var1;
   }

   public final String k5() {
      return this.u3;
   }

   public final void l6(String var1) {
      this.u3 = var1;
   }

   public final String u3() {
      return this.a6;
   }

   public final void k5(String var1) {
      this.a6 = var1;
   }

   public final long a6() {
      return this.u9;
   }

   public final void n5(long var1) {
      this.u9 = var1;
   }

   public final void l6(long var1) {
      this.h0 = var1;
   }

   public final String u9() {
      return this.c8;
   }

   public final void u3(String var1) {
      this.c8 = var1;
   }

   public final String h0() {
      return this.t2;
   }

   public final void a6(String var1) {
      this.t2 = var1;
   }

   public final void u9(String var1) {
      this.s7 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 c8() {
      return n3;
   }

   // $VF: synthetic method
   static String n5(f7x var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static int n5(f7x var0, int var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String l6(f7x var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String k5(f7x var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static long n5(f7x var0, long var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static long l6(f7x var0, long var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static String u3(f7x var0, String var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static String a6(f7x var0, String var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static String u9(f7x var0, String var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static l8r n5(f7x var0, l8r var1) {
      return var0.x8 = var1;
   }
}
