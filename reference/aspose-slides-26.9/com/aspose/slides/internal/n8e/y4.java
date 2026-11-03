package com.aspose.slides.internal.n8e;

class y4 {
   private n3[] n5 = new n3[64];
   private int l6;

   public final void n5(n3 var1) {
      if (this.l6 >= this.n5.length) {
         n3[] var2 = new n3[this.n5.length + this.n5.length / 2 + 8];
         System.arraycopy(this.n5, 0, var2, 0, this.n5.length);
         this.n5 = var2;
      }

      this.n5[this.l6++] = var1;
   }

   public final int n5() {
      return this.l6;
   }

   public final void l6() {
      this.l6--;
   }

   public final n3 k5() {
      return this.n5[this.l6 - 1];
   }

   public final n3 n5(int var1) {
      return this.n5[this.l6 - 1 - var1];
   }

   public final String n5(String var1) {
      for (int var2 = this.l6 - 1; var2 >= 0; var2--) {
         String var3 = this.n5[var2].l6(var1);
         if (var3 != null) {
            return var3;
         }
      }

      return null;
   }

   public final boolean l6(String var1) {
      String var2 = this.n5(var1);
      return "http://schemas.openxmlformats.org/markup-compatibility/2006".equals(var2) ? true : this.k5(var2);
   }

   public final boolean k5(String var1) {
      if (f0.n5.n5(var1)) {
         return false;
      }

      for (int var2 = this.l6 - 1; var2 >= 0; var2--) {
         if (this.n5[var2].k5(var1)) {
            return true;
         }
      }

      return false;
   }

   public final boolean n5(String var1, String var2) {
      String var3 = this.n5(var1);

      for (int var4 = this.l6 - 1; var4 >= 0; var4--) {
         for (int var5 = 0; var5 < this.n5[var4].n5(); var5++) {
            if (this.n5[var4].k5(var3, var2)) {
               return true;
            }
         }
      }

      return "http://schemas.openxmlformats.org/markup-compatibility/2006".equals(var3)
         && ("AlternateContent".equals(var2) || "Choice".equals(var2) || "Fallback".equals(var2));
   }

   public final boolean u3(String var1) {
      String var2 = this.n5(var1);

      for (int var3 = 0; var3 < f0.n5.n5(); var3++) {
         if (com.aspose.slides.ms.System.d1.a6(var2, f0.n5.n5(var3).l6())) {
            return true;
         }
      }

      return false;
   }
}
