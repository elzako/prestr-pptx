package com.aspose.slides.internal.a4;

import com.aspose.slides.ms.System.d1;

public class y1 extends y2 {
   private long n5;
   private com.aspose.slides.internal.i0.a6[] l6;

   public y1() {
      this.l6((short)16394);
   }

   public y1(b3 var1) {
      super(var1);
   }

   public final boolean k5() {
      return this.u9(14);
   }

   public final long u3() {
      return this.n5;
   }

   public final void n5(long var1) {
      this.n5 = var1;
   }

   public final com.aspose.slides.internal.i0.a6[] c8() {
      return this.l6;
   }

   public final void n5(com.aspose.slides.internal.i0.a6[] var1) {
      this.l6 = var1;
   }

   protected final boolean n5(y1 var1) {
      return this.y4() == var1.y4() && this.n5 == var1.n5 && com.aspose.slides.internal.y6.c8.n5(this.l6, var1.l6);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return com.aspose.slides.ms.System.j8.n5(obj) != com.aspose.slides.ms.System.j8.n5(this) ? false : this.n5((y1)obj);
      }
   }

   @Override
   public int hashCode() {
      int var1 = this.y4();
      var1 = var1 * 397 ^ (int)this.n5;
      return var1 * 397 ^ (this.l6 != null ? com.aspose.slides.ms.System.u3.n5((Object)(this.l6)).hashCode() : 0);
   }

   @Override
   public String toString() {
      return d1.n5("{0}, Count: {1}, RectData: {2}", super.toString(), this.n5, this.l6);
   }

   @Override
   public int u9() {
      int var1 = 8;
      if (this.c8() != null) {
         for (com.aspose.slides.internal.i0.a6 var5 : this.c8()) {
            var1 += var5.u9();
         }
      }

      return var1;
   }
}
