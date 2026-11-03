package com.aspose.slides.internal.b9;

public class s9 extends com.aspose.slides.internal.y6.u3 {
   private com.aspose.slides.internal.d9.n5 n5;
   private long l6;
   private int k5;
   private long u3;

   public s9() {
   }

   public s9(s9 var1) {
      this.n5 = var1.n5;
      this.t2(var1.y2());
      this.x8(var1.c4());
      this.n3(var1.u3);
   }

   public s9(com.aspose.slides.internal.d9.n5 var1) {
      this.n5 = var1;
   }

   public final com.aspose.slides.internal.d9.n5 r4() {
      return this.n5;
   }

   public final long c4() {
      return this.l6;
   }

   public final void x8(long var1) {
      this.l6 = var1;
   }

   public final int y2() {
      return this.k5;
   }

   public final void t2(int var1) {
      this.k5 = var1;
   }

   public final long y1() {
      return this.u3;
   }

   public final void n3(long var1) {
      this.u3 = var1;
   }

   @Override
   public String toString() {
      return com.aspose.slides.ms.System.d1.n5(
         "Type: {0}, Size: {1}, Offset: {2}", com.aspose.slides.ms.System.s3.n5(com.aspose.slides.internal.c5.e2.class, this.l6), this.k5, this.u3
      );
   }

   protected final boolean n5(s9 var1) {
      return this.l6 == var1.l6 && this.k5 == var1.k5 && this.u3 == var1.u3;
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return com.aspose.slides.ms.System.j8.n5(obj) != com.aspose.slides.ms.System.j8.n5(this) ? false : this.n5((s9)obj);
      }
   }

   @Override
   public int hashCode() {
      return (int)this.l6 * 397 ^ this.k5;
   }
}
