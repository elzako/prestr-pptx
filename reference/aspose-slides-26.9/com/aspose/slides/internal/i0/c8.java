package com.aspose.slides.internal.i0;

public class c8 extends y8 {
   private float[] n5;
   private long l6;

   public final float[] n5() {
      return this.n5;
   }

   public final void n5(float[] var1) {
      this.n5 = var1;
   }

   public final long l6() {
      return this.l6;
   }

   public final void n5(long var1) {
      this.l6 = var1;
   }

   @Override
   public String toString() {
      com.aspose.slides.internal.l7h.a5 var1 = new com.aspose.slides.internal.l7h.a5();

      for (float var5 : this.n5) {
         var1.n5(com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.n1.u9(var5), ", "}));
      }

      return com.aspose.slides.ms.System.d1.n5("BlendPositions: [{0}], PositionCount: {1}",new Object[]{ var1, this.l6});
   }

   protected final boolean n5(c8 var1) {
      return com.aspose.slides.internal.y6.c8.n5(this.n5, var1.n5) && this.l6 == var1.l6;
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return com.aspose.slides.ms.System.j8.n5(obj) != com.aspose.slides.ms.System.j8.n5(this) ? false : this.n5((c8)obj);
      }
   }

   @Override
   public int hashCode() {
      return (this.n5 != null ? com.aspose.slides.ms.System.u3.n5((Object)(this.n5)).hashCode() : 0) * 397 ^ (int)this.l6;
   }

   @Override
   public int u9() {
      return (int)(4L + (4L * (this.l6 & 4294967295L) & 4294967295L));
   }
}
