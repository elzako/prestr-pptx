package com.aspose.slides.internal.k4y;

public class r2s extends b3 {
   private long n5;
   private String l6;
   private String k5;
   private long u3;
   private long a6;
   private y1g u9;
   private static final com.aspose.slides.internal.v6g.u9 h0 = new com.aspose.slides.internal.v6g.u9("id", "name", "initials", "lastIdx", "clrIdx", "extLst");

   public r2s(com.aspose.slides.ms.System.Xml.c7 var1) {
      r2s$1 var2 = new r2s$1(this);
      n5(var1, var2);
      n5(var1, new r2s$2(this, var1));
   }

   public r2s() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("id", com.aspose.slides.ms.System.Xml.f4.l6(this.n5));
      var2.l6("name", this.l6);
      var2.l6("initials", this.k5);
      var2.l6("lastIdx", com.aspose.slides.ms.System.Xml.f4.l6(this.u3));
      var2.l6("clrIdx", com.aspose.slides.ms.System.Xml.f4.l6(this.a6));
      if (this.u9 != null) {
         this.u9.n5("p", var2, "extLst");
      }

      var2.s7();
   }

   public final void n5(x8 var1) {
      this.u9 = (y1g)var1;
   }

   public final long n5() {
      return this.n5;
   }

   public final void n5(long var1) {
      this.n5 = var1;
   }

   public final String l6() {
      return this.l6;
   }

   public final void n5(String var1) {
      this.l6 = var1;
   }

   public final String k5() {
      return this.k5;
   }

   public final void l6(String var1) {
      this.k5 = var1;
   }

   public final void l6(long var1) {
      this.u3 = var1;
   }

   public final long u3() {
      return this.a6;
   }

   public final void k5(long var1) {
      this.a6 = var1;
   }

   public final x8 a6() {
      return this.u9;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u9() {
      return h0;
   }

   // $VF: synthetic method
   static long n5(r2s var0, long var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String n5(r2s var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String l6(r2s var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static long l6(r2s var0, long var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static long k5(r2s var0, long var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static y1g n5(r2s var0, y1g var1) {
      return var0.u9 = var1;
   }
}
