package com.aspose.slides.internal.n8e;

public final class h2 {
   public float n5;
   public float l6;
   public float k5;

   public h2(float var1, float var2, float var3) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
   }

   public float n5() {
      return (float)com.aspose.slides.ms.System.q1.z3(this.n5 * this.n5 + this.l6 * this.l6 + this.k5 * this.k5);
   }

   public void l6() {
      float var1 = this.n5();
      if (var1 != 0.0F) {
         this.n5 /= var1;
         this.l6 /= var1;
         this.k5 /= var1;
      }
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) {
         return true;
      } else if (o != null && this.getClass() == o.getClass()) {
         h2 var2 = (h2)o;
         return Float.compare(var2.n5, this.n5) == 0 && Float.compare(var2.l6, this.l6) == 0 && Float.compare(var2.k5, this.k5) == 0;
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return com.aspose.slides.internal.n2d.q0.n5(this.n5, this.l6, this.k5);
   }
}
