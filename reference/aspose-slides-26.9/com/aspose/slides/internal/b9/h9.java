package com.aspose.slides.internal.b9;

public class h9 extends s2 {
   private float n5;

   public h9(s9 var1) {
      super(var1);
   }

   public final float n5() {
      return this.n5;
   }

   public final void n5(float var1) {
      this.n5 = var1;
   }

   @Override
   public String toString() {
      return com.aspose.slides.ms.System.d1.n5("{0}, MiterLimit: {1}", super.toString(), this.n5());
   }

   protected final boolean n5(h9 var1) {
      return super.n5(var1) && this.n5 == var1.n5;
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return com.aspose.slides.ms.System.j8.n5(obj) != com.aspose.slides.ms.System.j8.n5(this) ? false : this.n5((h9)obj);
      }
   }

   @Override
   public int hashCode() {
      return super.hashCode() * 397 ^ com.aspose.slides.internal.v6g.k5.u3(this.n5, 13);
   }
}
