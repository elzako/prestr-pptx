package com.aspose.slides.internal.u7q;

public abstract class l6 extends k5 {
   protected boolean n5 = true;
   protected byte l6 = 0;
   protected byte k5 = 0;
   protected n5[] u3 = null;
   protected n5[] a6 = null;
   protected n5[] u9 = null;
   private com.aspose.slides.internal.d9l.n5 t2 = null;
   private com.aspose.slides.internal.d9l.u3 s7 = null;
   private long x8 = 1061109567L;
   private long n3 = 1061109567L;

   public final n5[] n5() {
      n5[] var1 = this.u3;
      if (var1 == null) {
         n5[] var2 = new n5[!this.n5 ? this.l6 : this.k5];
         this.u3 = var2;
         var1 = var2;
      }

      return var1;
   }

   public final com.aspose.slides.internal.d9l.n5 n5(byte var1, byte var2) {
      com.aspose.slides.internal.d9l.n5 var3 = this.t2;
      if (var3 == null) {
         com.aspose.slides.internal.d9l.n5 var4 = com.aspose.slides.internal.d9l.n5.n5(this.l6, this.k5, var1, var2);
         this.t2 = var4;
         var3 = var4;
      }

      return var3;
   }

   public final n5[] l6() {
      n5[] var1 = this.a6;
      if (var1 == null) {
         n5[] var2 = new n5[this.n5 ? this.l6 : this.k5];
         this.a6 = var2;
         var1 = var2;
      }

      return var1;
   }

   public final com.aspose.slides.internal.d9l.u3 n5(float[] var1) {
      com.aspose.slides.internal.d9l.u3 var2 = this.s7;
      if (var2 == null) {
         com.aspose.slides.internal.d9l.u3 var3 = new com.aspose.slides.internal.d9l.u3(var1);
         this.s7 = var3;
         var2 = var3;
      }

      return var2;
   }

   public final n5[] k5() {
      n5[] var1 = this.u9;
      if (var1 == null) {
         n5[] var2 = new n5[this.n5 ? this.l6 : this.k5];
         this.u9 = var2;
         var1 = var2;
      }

      return var1;
   }

   public void n5(long var1, long var3) {
      this.x8 = var1;
      this.n3 = var3;
   }

   public final boolean u3() {
      return this.n5;
   }

   public final byte a6() {
      return this.l6;
   }

   public final byte u9() {
      return this.k5;
   }

   public final n5[] h0() {
      return this.u3;
   }

   public final n5[] c8() {
      return this.a6;
   }

   public final n5[] t2() {
      return this.u9;
   }

   public final com.aspose.slides.internal.d9l.n5 s7() {
      return this.t2;
   }

   public final com.aspose.slides.internal.d9l.u3 x8() {
      return this.s7;
   }

   public boolean n3() {
      return false;
   }
}
