package com.aspose.slides.internal.i0;

public class m3 extends y8 {
   private float[] n5;
   private int l6;

   public final float[] n5() {
      return this.n5;
   }

   public final void n5(float[] var1) {
      this.n5 = var1;
   }

   public final int l6() {
      return this.l6;
   }

   public final void n5(int var1) {
      this.l6 = var1;
   }

   @Override
   public String toString() {
      com.aspose.slides.internal.l7h.a5 var1 = new com.aspose.slides.internal.l7h.a5();

      for (float var5 : this.n5) {
         var1.n5(var5);
         var1.n5(", ");
      }

      return com.aspose.slides.ms.System.d1.n5("CompoundLineData: [{0}], CompoundLineDataSize: {1}", var1, this.l6);
   }

   protected final boolean n5(m3 var1) {
      return com.aspose.slides.internal.y6.c8.n5(this.n5, var1.n5) && this.l6 == var1.l6;
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return com.aspose.slides.ms.System.j8.n5(obj) != com.aspose.slides.ms.System.j8.n5(this) ? false : this.n5((m3)obj);
      }
   }

   @Override
   public int hashCode() {
      return (this.n5 != null ? com.aspose.slides.ms.System.u3.n5((Object)(this.n5)).hashCode() : 0) * 397 ^ this.l6;
   }

   @Override
   public int u9() {
      return 4 + 4 * this.l6;
   }
}
