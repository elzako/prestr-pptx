package com.aspose.slides.internal.a4;

import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.n1;

public class u6 extends j4 {
   private float n5;

   public u6() {
      this.l6((short)16431);
   }

   public u6(b3 var1) {
      super(var1);
   }

   public final boolean k5() {
      return this.u9(13);
   }

   public final float u3() {
      return this.n5;
   }

   public final void n5(float var1) {
      this.n5 = var1;
   }

   protected final boolean n5(u6 var1) {
      return super.n5(var1) && n1.l6(this.u3(), var1.u3());
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return com.aspose.slides.ms.System.j8.n5(obj) != com.aspose.slides.ms.System.j8.n5(this) ? false : this.n5((u6)obj);
      }
   }

   @Override
   public int hashCode() {
      return super.hashCode() * 397 ^ n1.n5(this.u3());
   }

   @Override
   public String toString() {
      return d1.n5("{0}, PostMultipledMatrix: {1}, Angle: {2}", super.toString(), this.k5(), this.u3());
   }

   @Override
   public int u9() {
      return 4;
   }
}
