package com.aspose.slides.internal.t5;

import com.aspose.slides.internal.o9b.a0;
import com.aspose.slides.ms.System.j8;

public class m1 extends q0 {
   private k7 n5;
   private com.aspose.slides.internal.k1.k7[] l6;

   public final k7 n5() {
      return this.n5;
   }

   public final void n5(k7 var1) {
      this.n5 = var1;
   }

   public final com.aspose.slides.internal.k1.k7[] l6() {
      return this.l6;
   }

   public final void n5(com.aspose.slides.internal.k1.k7[] var1) {
      this.l6 = var1;
   }

   public final a0 k5() {
      a0 var1 = new a0();
      var1.u3();
      if (this.l6() != null) {
         for (com.aspose.slides.internal.k1.k7 var5 : this.l6()) {
            var1.k5(var5.c8().n3());
         }
      }

      return var1;
   }

   protected final boolean n5(m1 var1) {
      return j8.n5(this.n5, var1.n5) && com.aspose.slides.internal.y6.c8.n5(this.l6, var1.l6);
   }

   @Override
   public boolean equals(Object obj) {
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return j8.n5(obj) != j8.n5(this) ? false : this.n5((m1)obj);
      }
   }

   @Override
   public int hashCode() {
      return (this.n5 != null ? this.n5.hashCode() : 0) * 397 ^ (this.l6 != null ? com.aspose.slides.ms.System.u3.n5((Object)(this.l6)).hashCode() : 0);
   }
}
