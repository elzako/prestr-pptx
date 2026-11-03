package com.aspose.slides;

class w6a {
   static final w6a n5 = new w6a(null, null);
   private r0s l6;
   private ColorFormat k5;

   final r0s n5() {
      return this.l6;
   }

   public final ColorFormat l6() {
      return this.k5;
   }

   @Override
   public boolean equals(Object obj) {
      if (obj == null) {
         return false;
      }

      if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      }

      boolean var2 = true;
      w6a var3 = (w6a)obj;
      if (this.l6 != null) {
         var2 &= this.l6.n5(var3.l6);
      } else {
         var2 &= var3.l6 == null;
      }

      if (this.k5 != null) {
         var2 &= this.k5.equals(var3.k5);
      } else {
         var2 &= var3.k5 == null;
      }

      return var2;
   }

   @Override
   public int hashCode() {
      return (this.l6 != null ? this.l6.hashCode() : 0) + (this.k5 != null ? this.k5.hashCode() : 0);
   }

   w6a(r0s var1, ColorFormat var2) {
      this.l6 = var1;
      this.k5 = var2;
   }
}
