package com.aspose.slides.internal.x1;

public abstract class c8 {
   protected String n5 = "";
   protected short l6 = 0;
   protected short k5 = 0;
   protected byte[] u3 = null;
   protected long a6 = 0L;
   protected long u9 = 0L;
   protected c8 h0 = null;
   protected long c8 = 0L;
   protected int t2 = 0;
   protected int s7 = -1;
   private c8 x8 = null;
   private c8 n3 = null;
   private c8 y4 = null;

   public final long u3() {
      return this.c8;
   }

   public final void n5(long var1) {
      this.c8 = var1;
   }

   public final int a6() {
      return this.s7;
   }

   public final void k5(int var1) {
      this.s7 = var1;
   }

   public final byte[] u9() {
      return this.u3;
   }

   public final void l6(byte[] var1) {
      this.u3 = var1;
   }

   public final c8 h0() {
      return this.x8;
   }

   public final void n5(c8 var1) {
      this.x8 = var1;
   }

   public final c8 c8() {
      return this.n3;
   }

   public final void l6(c8 var1) {
      this.n3 = var1;
   }

   public final c8 t2() {
      return this.y4;
   }

   public final void k5(c8 var1) {
      this.y4 = var1;
   }

   public final short s7() {
      return this.l6;
   }

   public final void n5(short var1) {
      this.l6 = var1;
   }

   public final String x8() {
      return this.n5;
   }

   public final void n5(String var1) {
      this.n5 = var1;
   }

   public final int n3() {
      return this.t2;
   }

   public final void u3(int var1) {
      this.t2 = var1;
   }

   public final int u3(c8 var1) {
      if (this.n5.length() > var1.x8().length()) {
         return 1;
      }

      if (this.n5.length() < var1.x8().length()) {
         return -1;
      }

      for (int var2 = 0; var2 < this.n5.length(); var2++) {
         char var3 = com.aspose.slides.ms.System.t9.m1(this.n5.charAt(var2));
         char var4 = com.aspose.slides.ms.System.t9.m1(var1.x8().charAt(var2));
         if (var3 > var4) {
            return 1;
         }

         if (var3 < var4) {
            return -1;
         }
      }

      return 0;
   }
}
