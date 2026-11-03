package com.aspose.slides.internal.b9;

public class f8 extends d5 {
   private int n5;
   private int l6;
   private long k5;
   private long u3;
   private long a6;
   private float u9;
   private float h0;
   private com.aspose.slides.internal.k1.k7 c8;
   private String t2;
   private byte[] s7;

   public f8(s9 var1) {
      super(var1);
   }

   public final int n5() {
      return this.n5;
   }

   public final void n5(int var1) {
      this.n5 = var1;
   }

   public final int l6() {
      return this.l6;
   }

   public final void l6(int var1) {
      this.l6 = var1;
   }

   public final long k5() {
      return this.k5;
   }

   public final void n5(long var1) {
      this.k5 = var1;
   }

   public final long u3() {
      return this.u3;
   }

   public final void l6(long var1) {
      this.u3 = var1;
   }

   public final long u9() {
      return this.a6;
   }

   public final void k5(long var1) {
      this.a6 = var1;
   }

   public final float h0() {
      return this.u9;
   }

   public final void n5(float var1) {
      this.u9 = var1;
   }

   public final float c8() {
      return this.h0;
   }

   public final void l6(float var1) {
      this.h0 = var1;
   }

   public final com.aspose.slides.internal.k1.k7 t2() {
      return this.c8;
   }

   public final void n5(com.aspose.slides.internal.k1.k7 var1) {
      this.c8 = var1;
   }

   public final String s7() {
      return this.t2;
   }

   public final void n5(String var1) {
      this.t2 = var1;
   }

   public final byte[] x8() {
      return this.s7;
   }

   public final void n5(byte[] var1) {
      this.s7 = var1;
   }

   protected final boolean n5(f8 var1) {
      return super.n5(var1)
         && this.n5 == var1.n5
         && this.l6 == var1.l6
         && this.k5 == var1.k5
         && this.u3 == var1.u3
         && this.a6 == var1.a6
         && com.aspose.slides.ms.System.n1.l6(this.u9, var1.u9)
         && com.aspose.slides.ms.System.n1.l6(this.h0, var1.h0)
         && com.aspose.slides.ms.System.j8.n5(this.c8, var1.c8)
         && com.aspose.slides.ms.System.d1.a6(this.t2, var1.t2);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return com.aspose.slides.ms.System.j8.n5(obj) != com.aspose.slides.ms.System.j8.n5(this) ? false : this.n5((f8)obj);
      }
   }

   @Override
   public int hashCode() {
      int var1 = super.hashCode();
      var1 = var1 * 397 ^ this.n5;
      var1 = var1 * 397 ^ this.l6;
      var1 = var1 * 397 ^ (int)this.k5;
      var1 = var1 * 397 ^ (int)this.u3;
      var1 = var1 * 397 ^ (int)this.a6;
      var1 = var1 * 397 ^ com.aspose.slides.ms.System.n1.n5(this.u9);
      var1 = var1 * 397 ^ com.aspose.slides.ms.System.n1.n5(this.h0);
      var1 = var1 * 397 ^ (this.c8 != null ? this.c8.hashCode() : 0);
      return var1 * 397 ^ (this.t2 != null ? this.t2.hashCode() : 0);
   }
}
