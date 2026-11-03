package com.aspose.slides.internal.b9;

public class e2 extends z3 {
   private long n5;
   private com.aspose.slides.internal.a4.b3[] l6;

   public e2() {
      this.x8(70L);
   }

   public e2(z3 var1) {
      super(var1);
      this.u3(var1.c8());
   }

   public final long n5() {
      return this.n5;
   }

   public final void n5(long var1) {
      this.n5 = var1;
   }

   public final com.aspose.slides.internal.a4.b3[] l6() {
      return this.l6;
   }

   public final void n5(com.aspose.slides.internal.a4.b3[] var1) {
      this.l6 = var1;
   }

   @Override
   public String toString() {
      com.aspose.slides.internal.l7h.a5 var1 = new com.aspose.slides.internal.l7h.a5();
      var1.k5();

      for (com.aspose.slides.internal.a4.b3 var5 : this.l6()) {
         var1.l6(com.aspose.slides.ms.System.d1.n5(new String[]{"\t\t", var5.toString()}));
      }

      return com.aspose.slides.ms.System.d1.n5(
         "{0}, CommentIdentifier: {1}, EmfPlusRecords: {2}",new Object[]{ super.toString(), com.aspose.slides.ms.System.s3.n5(z3$n5.class, this.n5), var1.toString()
      });
   }

   public final void k5() {
      int var1 = 4;

      for (com.aspose.slides.internal.a4.b3 var5 : this.l6) {
         var1 += var5.m1();
      }

      this.u3(var1 & 4294967295L);
      this.t2((int)((this.c8() & 4294967295L) + 12L));
   }

   protected final boolean n5(e2 var1) {
      return super.n5(var1) && this.n5 == var1.n5 && com.aspose.slides.internal.y6.c8.n5(this.l6, var1.l6);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return com.aspose.slides.ms.System.j8.n5(obj) != com.aspose.slides.ms.System.j8.n5(this) ? false : this.n5((e2)obj);
      }
   }

   @Override
   public int hashCode() {
      int var1 = super.hashCode();
      var1 = var1 * 397 ^ (int)this.n5;
      return var1 * 397 ^ (this.l6 != null ? com.aspose.slides.ms.System.u3.n5((Object)(this.l6)).hashCode() : 0);
   }
}
