package com.aspose.slides.internal.b9;

public class d9 extends u9 {
   private com.aspose.slides.internal.k1.k7 n5;
   private int l6;
   private int k5;
   private int u3;
   private int a6;
   private int u9;
   private int h0;
   private long c8;
   private long t2;
   private long s7;
   private long x8;
   private long n3;
   private long y4;
   private long e2;
   private com.aspose.slides.internal.k1.t2 t9;

   public d9(s9 var1) {
      super(var1);
   }

   public final com.aspose.slides.internal.k1.k7 n5() {
      return this.n5;
   }

   public final void n5(com.aspose.slides.internal.k1.k7 var1) {
      this.n5 = var1;
   }

   public final int l6() {
      return this.l6;
   }

   public final void n5(int var1) {
      this.l6 = var1;
   }

   public final int k5() {
      return this.k5;
   }

   public final void l6(int var1) {
      this.k5 = var1;
   }

   public final int u3() {
      return this.u3;
   }

   public final void k5(int var1) {
      this.u3 = var1;
   }

   public final int u9() {
      return this.a6;
   }

   public final void u3(int var1) {
      this.a6 = var1;
   }

   public final int h0() {
      return this.u9;
   }

   public final void a6(int var1) {
      this.u9 = var1;
   }

   public final int c8() {
      return this.h0;
   }

   public final void u9(int var1) {
      this.h0 = var1;
   }

   public final long t2() {
      return this.c8;
   }

   public final void n5(long var1) {
      this.c8 = var1;
   }

   public final long s7() {
      return this.t2;
   }

   public final void l6(long var1) {
      this.t2 = var1;
   }

   public final long x8() {
      return this.s7;
   }

   public final void k5(long var1) {
      this.s7 = var1;
   }

   public final long n3() {
      return this.x8;
   }

   public final void u3(long var1) {
      this.x8 = var1;
   }

   public final long y4() {
      return this.n3;
   }

   public final void a6(long var1) {
      this.n3 = var1;
   }

   public final long e2() {
      return this.y4;
   }

   public final void u9(long var1) {
      this.y4 = var1;
   }

   public final com.aspose.slides.internal.k1.t2 t9() {
      return this.t9;
   }

   public final void n5(com.aspose.slides.internal.k1.t2 var1) {
      this.t9 = var1;
   }

   protected final boolean n5(d9 var1) {
      return super.n5(var1)
         && com.aspose.slides.ms.System.j8.n5(this.n5, var1.n5)
         && this.l6 == var1.l6
         && this.k5 == var1.k5
         && this.u3 == var1.u3
         && this.a6 == var1.a6
         && this.u9 == var1.u9
         && this.h0 == var1.h0
         && this.c8 == var1.c8
         && this.t2 == var1.t2
         && this.s7 == var1.s7
         && this.x8 == var1.x8
         && this.n3 == var1.n3
         && this.y4 == var1.y4
         && this.e2 == var1.e2
         && com.aspose.slides.ms.System.j8.n5(this.t9, var1.t9);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return com.aspose.slides.ms.System.j8.n5(obj) != com.aspose.slides.ms.System.j8.n5(this) ? false : this.n5((d9)obj);
      }
   }

   @Override
   public int hashCode() {
      int var1 = super.hashCode();
      var1 = var1 * 397 ^ (this.n5 != null ? this.n5.hashCode() : 0);
      var1 = var1 * 397 ^ this.l6;
      var1 = var1 * 397 ^ this.k5;
      var1 = var1 * 397 ^ this.u3;
      var1 = var1 * 397 ^ this.a6;
      var1 = var1 * 397 ^ this.u9;
      var1 = var1 * 397 ^ this.h0;
      var1 = var1 * 397 ^ (int)this.c8;
      var1 = var1 * 397 ^ (int)this.t2;
      var1 = var1 * 397 ^ (int)this.s7;
      var1 = var1 * 397 ^ (int)this.x8;
      var1 = var1 * 397 ^ (int)this.n3;
      var1 = var1 * 397 ^ (int)this.y4;
      var1 = var1 * 397 ^ (int)this.e2;
      return var1 * 397 ^ (this.t9 != null ? this.t9.hashCode() : 0);
   }
}
