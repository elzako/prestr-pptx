package com.aspose.slides.internal.b9;

public class q0 extends z3 {
   private long n5;
   private long l6;

   public q0(z3 var1) {
      super(var1);
      this.u3(var1.c8());
   }

   public final long u9() {
      return this.n5;
   }

   public final void l6(long var1) {
      this.n5 = var1;
   }

   public final long h0() {
      return this.l6;
   }

   public final void k5(long var1) {
      this.l6 = var1;
   }

   @Override
   public String toString() {
      return com.aspose.slides.ms.System.d1.n5(
         "{0}, CommentIdentifier: {1}, PublicCommentIdentifier: {2}",new Object[]{
         super.toString(),
         com.aspose.slides.ms.System.s3.n5(z3$n5.class, this.u9()),
         com.aspose.slides.ms.System.s3.n5(com.aspose.slides.internal.c5.k5.class, this.h0())
      });
   }

   protected final boolean n5(q0 var1) {
      return super.n5(var1) && this.n5 == var1.n5 && this.l6 == var1.l6;
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return com.aspose.slides.ms.System.j8.n5(obj) != com.aspose.slides.ms.System.j8.n5(this) ? false : this.n5((q0)obj);
      }
   }

   @Override
   public int hashCode() {
      int var1 = super.hashCode();
      var1 = var1 * 397 ^ (int)this.n5;
      return var1 * 397 ^ (int)this.l6;
   }
}
