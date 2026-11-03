package com.aspose.slides.internal.b9;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

public class m1 extends q0 {
   private int n5;
   private short l6;
   private long k5;
   private int u3;
   private long a6;
   private com.aspose.slides.internal.y6.l6 u9;

   public m1(q0 var1) {
      super(var1);
      this.l6(var1.u9());
      this.k5(var1.h0());
   }

   public final int n5() {
      return this.n5;
   }

   public final void n5(int var1) {
      this.n5 = var1;
   }

   public final short l6() {
      return this.l6;
   }

   public final void n5(short var1) {
      if (var1 != 0) {
         throw new ArgumentOutOfRangeException("value");
      }

      this.l6 = var1;
   }

   public final long k5() {
      return this.k5;
   }

   public final void n5(long var1) {
      this.k5 = var1;
   }

   public final int u3() {
      return this.u3;
   }

   public final void l6(int var1) {
      if (var1 != 0) {
         throw new ArgumentOutOfRangeException("value");
      }

      this.u3 = var1;
   }

   public final long t2() {
      return this.a6;
   }

   public final void a6(long var1) {
      this.a6 = var1;
   }

   public final com.aspose.slides.internal.y6.l6 s7() {
      return this.u9;
   }

   public final void n5(com.aspose.slides.internal.y6.l6 var1) {
      this.u9 = var1;
   }

   @Override
   public String toString() {
      return com.aspose.slides.ms.System.d1.n5(
         "{0}, Version: {1}, Reserved: {2}, Checksum: {3}, Flags: {4}, WinMetafileSize: {5}, WinMetafile: {6}",
         super.toString(),
         com.aspose.slides.ms.System.s3.n5(com.aspose.slides.internal.o4.t9.class, this.n5()),
         this.l6(),
         this.k5(),
         this.u3(),
         this.t2(),
         this.s7()
      );
   }

   protected final boolean n5(m1 var1) {
      return super.n5(var1)
         && this.n5 == var1.n5
         && this.l6 == var1.l6
         && this.k5 == var1.k5
         && this.u3 == var1.u3
         && this.a6 == var1.a6
         && com.aspose.slides.ms.System.j8.n5(this.u9, var1.u9);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return com.aspose.slides.ms.System.j8.n5(obj) != com.aspose.slides.ms.System.j8.n5(this) ? false : this.n5((m1)obj);
      }
   }

   @Override
   public int hashCode() {
      int var1 = super.hashCode();
      var1 = var1 * 397 ^ this.n5 & 65535;
      var1 = var1 * 397 ^ com.aspose.slides.ms.System.f0.n5(this.l6);
      var1 = var1 * 397 ^ (int)this.k5;
      var1 = var1 * 397 ^ this.u3;
      var1 = var1 * 397 ^ (int)this.a6;
      return var1 * 397 ^ (this.u9 != null ? this.u9.hashCode() : 0);
   }
}
