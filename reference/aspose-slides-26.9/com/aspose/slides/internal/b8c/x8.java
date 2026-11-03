package com.aspose.slides.internal.b8c;

public class x8 {
   public String n5;
   public com.aspose.slides.ms.System.r8 l6;
   public a9 k5;
   private int u3;

   public x8(String var1, a9 var2) {
      this.n5 = var1;
      this.l6 = var2.m1();
      if (this.l6.m1().length() == 0) {
         this.k5 = var2;
      }
   }

   @Override
   public int hashCode() {
      if (this.u3 == 0) {
         this.u3 = this.n5.hashCode() + this.l6.hashCode() + (this.k5 == null ? 0 : this.k5.hashCode());
      }

      return this.u3;
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      }

      x8 var2 = com.aspose.slides.internal.v6g.k5.n5(obj, x8.class);
      return var2 == null
         ? false
         : com.aspose.slides.ms.System.d1.a6(this.n5, var2.n5) && this.l6.equals(var2.l6) && com.aspose.slides.ms.System.j8.l6(this.k5, var2.k5);
   }
}
