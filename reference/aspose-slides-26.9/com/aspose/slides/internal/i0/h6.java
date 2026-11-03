package com.aspose.slides.internal.i0;

public class h6 extends y8 {
   private t4[] n5;
   private float[] l6;

   public final float[] n5() {
      return this.l6;
   }

   public final void n5(float[] var1) {
      this.l6 = var1;
   }

   public final t4[] l6() {
      return this.n5;
   }

   public final void n5(t4[] var1) {
      this.n5 = var1;
   }

   protected final boolean n5(h6 var1) {
      return com.aspose.slides.internal.y6.c8.n5(this.n5, var1.n5) && com.aspose.slides.internal.y6.c8.n5(this.l6, var1.l6);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return com.aspose.slides.ms.System.j8.n5(obj) != com.aspose.slides.ms.System.j8.n5(this) ? false : this.n5((h6)obj);
      }
   }

   @Override
   public int hashCode() {
      return (this.n5 != null ? com.aspose.slides.ms.System.u3.n5((Object)(this.n5)).hashCode() : 0) * 397
         ^ (this.l6 != null ? com.aspose.slides.ms.System.u3.n5((Object)(this.l6)).hashCode() : 0);
   }

   @Override
   public int u9() {
      int var1 = 0;
      if (this.l6 != null) {
         var1 += this.l6.length * 4;
      }

      if (this.l6() != null) {
         for (t4 var5 : this.l6()) {
            var1 += var5.u9();
         }
      }

      return var1;
   }

   @Override
   public String toString() {
      com.aspose.slides.internal.l7h.a5 var1 = new com.aspose.slides.internal.l7h.a5();
      if (this.n5() != null) {
         for (float var5 : this.n5()) {
            var1.n5(com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.n1.u9(var5), ","}));
         }
      }

      com.aspose.slides.internal.l7h.a5 var7 = new com.aspose.slides.internal.l7h.a5();
      if (this.n5 != null) {
         for (t4 var6 : this.n5) {
            var7.n5(com.aspose.slides.ms.System.d1.n5(new String[]{var6.toString(), ","}));
         }
      }

      return com.aspose.slides.ms.System.d1.n5("CharRange: [{0}], TabStops: [{1}]",new Object[]{ var7, var1});
   }
}
