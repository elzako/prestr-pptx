package com.aspose.slides.internal.x7n;

class n5$n5<T1, T2> {
   private T1 l6;
   private T2 k5;
   // $VF: synthetic field
   final n5 n5;

   public n5$n5(n5 var1, T1 var2, T2 var3) {
      this.n5 = var1;
      this.l6 = (T1)var2;
      this.k5 = (T2)var3;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) {
         return true;
      }

      if (o == null) {
         return false;
      }

      n5$n5 var2 = (n5$n5)o;
      return this.l6.equals(var2.l6) && this.k5.equals(var2.k5);
   }

   @Override
   public int hashCode() {
      int var1 = this.l6.hashCode();
      return 31 * var1 + this.k5.hashCode();
   }
}
