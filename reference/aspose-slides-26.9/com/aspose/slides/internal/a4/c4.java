package com.aspose.slides.internal.a4;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.ms.System.d1;

public class c4 extends y2 {
   private long n5;
   private com.aspose.slides.internal.i0.u3[] l6;

   public c4() {
      this.l6((short)16396);
   }

   public c4(b3 var1) {
      super(var1);
   }

   public final boolean k5() {
      return this.u9(14);
   }

   public final boolean u3() {
      return this.u9(13);
   }

   public final long c8() {
      return this.n5;
   }

   public final void n5(long var1) {
      if ((var1 & 4294967295L) < 3L) {
         throw new ArgumentOutOfRangeException("value");
      }

      this.n5 = var1;
   }

   public final com.aspose.slides.internal.i0.u3[] t2() {
      return this.l6;
   }

   public final void n5(com.aspose.slides.internal.i0.u3[] var1) {
      this.l6 = var1;
   }

   protected final boolean n5(c4 var1) {
      return this.y4() == var1.y4() && this.n5 == var1.n5 && com.aspose.slides.internal.y6.c8.n5(this.l6, var1.l6);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return com.aspose.slides.ms.System.j8.n5(obj) != com.aspose.slides.ms.System.j8.n5(this) ? false : this.n5((c4)obj);
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
      return d1.n5("{0}, Count: {1}, PointData: {2}", super.toString(), this.n5, this.l6);
   }

   @Override
   public int u9() {
      int var1 = 8;
      if (this.t2() != null) {
         for (com.aspose.slides.internal.i0.u3 var5 : this.t2()) {
            var1 += var5.u9();
         }
      }

      return var1;
   }
}
