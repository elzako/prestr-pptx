package com.aspose.slides.internal.g8v;

class x9$n5 {
   private com.aspose.slides.ms.System.r8 n5;
   private com.aspose.slides.ms.System.r8 l6;
   private boolean k5;

   public x9$n5(com.aspose.slides.ms.System.r8 var1, com.aspose.slides.ms.System.r8 var2, boolean var3) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
   }

   public boolean n5() {
      return this.l6 != null;
   }

   @Override
   public int hashCode() {
      int var1 = 23;
      var1 = var1 * 31 + (this.k5 ? 1 : 0);
      var1 = var1 * 31 + this.n5.hashCode();
      return var1 * 31 + (this.l6 != null ? this.l6.hashCode() : 0);
   }

   @Override
   public boolean equals(Object obj) {
      x9$n5 var2 = com.aspose.slides.internal.v6g.k5.n5(obj, x9$n5.class);
      if (obj == null) {
         return false;
      } else if (!this.n5.equals(var2.n5)) {
         return false;
      } else {
         return this.k5 != var2.k5 || this.n5() != var2.n5() ? false : !this.n5() || this.l6.equals(var2.l6);
      }
   }
}
