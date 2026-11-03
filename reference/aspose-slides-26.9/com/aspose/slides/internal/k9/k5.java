package com.aspose.slides.internal.k9;

import com.aspose.slides.internal.l7h.a5;

public abstract class k5 {
   private final k5 n5;

   protected k5() {
      this.n5 = null;
   }

   protected k5(k5 var1) {
      this.n5 = var1;
   }

   @Override
   public boolean equals(Object obj) {
      if (obj == null) {
         return false;
      } else {
         k5 var2 = com.aspose.slides.internal.v6g.k5.n5(obj, k5.class);
         if (var2 == null) {
            return false;
         } else if (this.n5 == null && var2.n5 == null) {
            return true;
         } else {
            return this.n5 == null | var2.n5 == null ? false : this.n5.equals(var2.n5);
         }
      }
   }

   @Override
   public int hashCode() {
      return this.n5 == null ? 0 : -324743029 + this.n5.hashCode();
   }

   @Override
   public String toString() {
      if (this.n5 == null) {
         return "";
      }

      a5 var1 = new a5();
      this.n5(this.n5, var1);
      return var1.toString();
   }

   private void n5(k5 var1, a5 var2) {
      if (var1.n5 != null) {
         this.n5(var1.n5, var2);
      }

      var2.n5(var1).n5(" :: ");
   }
}
