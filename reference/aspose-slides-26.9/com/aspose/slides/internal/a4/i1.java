package com.aspose.slides.internal.a4;

import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.n1;

public class i1 extends u3 {
   private float n5;
   private float l6;

   public i1() {
      this.l6((short)16437);
   }

   public i1(b3 var1) {
      super(var1);
   }

   public final float k5() {
      return this.n5;
   }

   public final void n5(float var1) {
      this.n5 = var1;
   }

   public final float u3() {
      return this.l6;
   }

   public final void l6(float var1) {
      this.l6 = var1;
   }

   protected final boolean n5(i1 var1) {
      return n1.l6(this.n5, var1.n5) && n1.l6(this.l6, var1.l6);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return com.aspose.slides.ms.System.j8.n5(obj) != com.aspose.slides.ms.System.j8.n5(this) ? false : this.n5((i1)obj);
      }
   }

   @Override
   public int hashCode() {
      return n1.n5(this.n5) * 397 ^ n1.n5(this.l6);
   }

   @Override
   public String toString() {
      return d1.n5("{0}, Dx: {1}, Dy: {2}", super.toString(), this.n5, this.l6);
   }

   @Override
   public int u9() {
      return 8;
   }
}
