package com.aspose.slides.internal.i0;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

public class z7 extends f2 {
   private int n5;
   private long l6;
   private n5 k5;
   private int u3;
   private int a6;

   public final int n5() {
      return this.n5;
   }

   public final void n5(int var1) {
      this.n5 = var1;
   }

   public final long l6() {
      return this.l6;
   }

   public final void n5(long var1) {
      this.l6 = var1;
   }

   public final n5 k5() {
      return this.k5;
   }

   public final void n5(n5 var1) {
      this.k5 = var1;
   }

   public final int u3() {
      return this.u3;
   }

   public final void l6(int var1) {
      this.u3 = var1;
   }

   public final int a6() {
      return this.a6;
   }

   public final void k5(int var1) {
      if (var1 != 0) {
         throw new ArgumentOutOfRangeException("value");
      }

      this.a6 = var1;
   }

   protected final boolean n5(z7 var1) {
      return super.n5(var1)
         && this.n5 == var1.n5
         && this.l6 == var1.l6
         && com.aspose.slides.ms.System.j8.n5(this.k5, var1.k5)
         && this.u3 == var1.u3
         && this.a6 == var1.a6;
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return com.aspose.slides.ms.System.j8.n5(obj) != com.aspose.slides.ms.System.j8.n5(this) ? false : this.n5((z7)obj);
      }
   }

   @Override
   public int hashCode() {
      int var1 = super.hashCode();
      var1 = var1 * 397 ^ this.n5;
      var1 = var1 * 397 ^ (int)this.l6;
      var1 = var1 * 397 ^ (this.k5 != null ? this.k5.hashCode() : 0);
      var1 = var1 * 397 ^ this.u3;
      return var1 * 397 ^ this.a6;
   }

   @Override
   public String toString() {
      return com.aspose.slides.ms.System.d1.n5(
         "{0}, WrapMode: {1}, ClampColor: {2}, ObjectClamp: {3}",
         super.toString(),
         com.aspose.slides.ms.System.s3.n5(com.aspose.slides.internal.g8.a5.class, this.l6),
         this.k5,
         com.aspose.slides.ms.System.s3.n5(com.aspose.slides.internal.g8.j5.class, this.u3)
      );
   }

   @Override
   public int u9() {
      return 24;
   }

   public final com.aspose.slides.internal.j9e.t2 h0() {
      com.aspose.slides.internal.j9e.t2 var1 = new com.aspose.slides.internal.j9e.t2();
      var1.n5((int)this.l6(), this.k5().a6().o8());
      return var1;
   }
}
