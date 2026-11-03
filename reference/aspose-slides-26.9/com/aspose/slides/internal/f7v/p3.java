package com.aspose.slides.internal.f7v;

abstract class p3 extends s7 {
   protected p3(String var1, com.aspose.slides.internal.c5e.l6 var2) {
      super(var1, var2);
   }

   @Override
   public final boolean n5() {
      return false;
   }

   @Override
   public int hashCode() {
      byte var1 = 31;
      byte var2 = 1;
      return 31 * var2 + (this.n5 == null ? 0 : this.n5.hashCode());
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj) {
         return true;
      }

      if (obj == null) {
         return false;
      }

      if (this.getClass() != obj.getClass()) {
         return false;
      }

      p3 var2 = (p3)obj;
      if (this.n5 == null) {
         if (var2.n5 != null) {
            return false;
         }
      } else if (!this.n5.equals(var2.n5)) {
         return false;
      }

      return true;
   }
}
