package com.aspose.slides.internal.a4;

import com.aspose.slides.ms.System.d1;

public class j5 extends y2 {
   private com.aspose.slides.internal.i0.a6 n5;

   public j5() {
      this.l6((short)16398);
   }

   public j5(b3 var1) {
      super(var1);
   }

   public final boolean k5() {
      return this.u9(14);
   }

   public final com.aspose.slides.internal.i0.a6 u3() {
      return this.n5;
   }

   public final void n5(com.aspose.slides.internal.i0.a6 var1) {
      this.n5 = var1;
   }

   @Override
   public int u9() {
      return 4 + this.n5.u9();
   }

   @Override
   public String toString() {
      return d1.n5("{0}, RectData: {1}", super.toString(), this.n5);
   }

   protected final boolean n5(j5 var1) {
      return this.y4() == var1.y4() && com.aspose.slides.ms.System.j8.n5(this.n5, var1.n5);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return com.aspose.slides.ms.System.j8.n5(obj) != com.aspose.slides.ms.System.j8.n5(this) ? false : this.n5((j5)obj);
      }
   }

   @Override
   public int hashCode() {
      return this.y4() * 397 ^ (this.n5 != null ? this.n5.hashCode() : 0);
   }
}
