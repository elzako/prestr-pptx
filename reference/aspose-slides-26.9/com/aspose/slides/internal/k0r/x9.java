package com.aspose.slides.internal.k0r;

public class x9 {
   private y0 n5;
   private long l6;
   private int k5;
   private int u3;
   private long a6;
   private long u9;
   private long h0;
   private long c8;
   private String t2;
   private long s7;

   public final y0 n5() {
      return this.n5;
   }

   public final void n5(y0 var1) {
      this.n5 = var1;
   }

   public final long l6() {
      return this.l6;
   }

   public final void n5(long var1) {
      this.l6 = var1;
   }

   public final int k5() {
      return this.k5;
   }

   public final void n5(int var1) {
      this.k5 = var1;
   }

   public final int u3() {
      return this.u3;
   }

   public final void l6(int var1) {
      this.u3 = var1;
   }

   public final long a6() {
      return this.a6;
   }

   public final void l6(long var1) {
      this.a6 = var1;
   }

   public final long u9() {
      return this.u9;
   }

   public final void k5(long var1) {
      this.u9 = var1;
   }

   public final long h0() {
      return this.h0;
   }

   public final void u3(long var1) {
      this.h0 = var1;
   }

   public final long c8() {
      return this.c8;
   }

   public final void a6(long var1) {
      this.c8 = var1;
   }

   public final String t2() {
      return this.t2;
   }

   public final void n5(String var1) {
      this.t2 = var1;
   }

   public final long s7() {
      return this.s7;
   }

   public final void u9(long var1) {
      this.s7 = var1;
   }

   public x9() {
      this.n5(new y0());
      this.n5().n5(true);
      this.n5(0L);
      this.n5(26625);
      this.l6(32772);
      this.l6(40L);
      this.k5(1L);
      this.u3(0L);
      this.a6(0L);
      this.n5("Microsoft Base Cryptographic Provider v1.0");
      this.u9(118L);
   }

   final int x8() {
      com.aspose.slides.internal.l7h.t1 var1 = new com.aspose.slides.internal.l7h.t1();
      int var2 = var1.l6(com.aspose.slides.ms.System.d1.c8(this.t2())).length + 2;
      return 32 + var2;
   }

   public final void n5(com.aspose.slides.internal.z0k.l6 var1) {
      var1.n5(this.n5().k5() & 4294967295L);
      var1.n5(this.l6() & 4294967295L);
      var1.l6(this.k5());
      var1.l6(this.u3());
      var1.n5(this.a6() & 4294967295L);
      var1.n5(this.u9() & 4294967295L);
      var1.n5(this.h0() & 4294967295L);
      var1.n5(this.c8() & 4294967295L);
      com.aspose.slides.internal.l7h.t1 var2 = new com.aspose.slides.internal.l7h.t1();
      byte[] var3 = var2.l6(com.aspose.slides.ms.System.d1.c8(this.t2()));
      var1.n5(var3);
      var1.n5((short)0);
   }

   public static x9 n5(com.aspose.slides.internal.z0k.t4 var0, long var1) {
      long var3 = 32L;
      x9 var5 = new x9();
      var5.n5(y0.n5(var0));
      var5.n5(com.aspose.slides.internal.n8e.y2.l6(var0) & 4294967295L);
      var5.n5(com.aspose.slides.internal.n8e.y2.l6(var0));
      var5.l6(com.aspose.slides.internal.n8e.y2.l6(var0));
      var5.l6(com.aspose.slides.internal.n8e.y2.l6(var0) & 4294967295L);
      if ((var5.a6() & 4294967295L) == 0L) {
         var5.l6(40L);
      }

      var5.k5(com.aspose.slides.internal.n8e.y2.l6(var0) & 4294967295L);
      var5.u3(com.aspose.slides.internal.n8e.y2.l6(var0) & 4294967295L);
      var5.a6(com.aspose.slides.internal.n8e.y2.l6(var0) & 4294967295L);
      long var6 = (var1 & 4294967295L) - 32L & 4294967295L;
      int var8 = (int)(((var6 & 4294967295L) / 2L & 4294967295L) - 1L);
      com.aspose.slides.internal.l7h.t1 var9 = new com.aspose.slides.internal.l7h.t1();
      char[] var10 = var9.k5(com.aspose.slides.internal.n8e.y2.l6(var0, var8 * 2), 0, var8 * 2);
      com.aspose.slides.internal.n8e.y2.l6(var0, 2);
      var5.n5(com.aspose.slides.ms.System.d1.n5(var10));
      return var5;
   }

   public final boolean n3() {
      if (this.n5().l6()) {
         return false;
      }

      switch (this.u3()) {
         case 0:
         case 32772:
            return true;
         default:
            return false;
      }
   }
}
