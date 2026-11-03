package com.aspose.slides.internal.e5;

public class x8$n5 {
   private int n5;
   private int l6;

   public x8$n5(int var1, int var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   @Override
   public int hashCode() {
      return this.n5 * 31 + this.l6;
   }

   @Override
   public boolean equals(Object o) {
      if (!com.aspose.slides.internal.v6g.k5.l6(o, x8$n5.class)) {
         return false;
      }

      x8$n5 var2 = (x8$n5)o;
      return var2.n5 == this.n5 && var2.l6 == this.l6;
   }
}
