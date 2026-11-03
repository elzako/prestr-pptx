package com.aspose.slides.internal.p3;

public class j8 {
   private y2 n5;
   private int l6 = -1;

   public j8(y2 var1) {
      this.n5 = var1;
   }

   public j8(y2 var1, int var2) {
      this(var1);
      this.k5(var2);
   }

   public final y2 u3() {
      return this.n5;
   }

   public final y2 n5(int var1) {
      j8 var2 = this.l6(var1);
      return var2 == null ? null : var2.u3();
   }

   public j8 k5() {
      return null;
   }

   public final j8 l6(int var1) {
      j8 var2 = this;

      for (int var3 = 0; var3 < var1 && var2 != null; var2 = var2.k5()) {
         var3++;
      }

      return var2;
   }

   public boolean w_() {
      return false;
   }

   public final void k5(int var1) {
      this.l6 = var1;
   }

   public final int a6() {
      return this.l6;
   }

   protected final String u9() {
      if (this.u3() != null) {
         String var1 = this.u3().toString();
         int var2 = com.aspose.slides.ms.System.d1.k5(var1, '.');
         return var2 >= 0 && com.aspose.slides.ms.System.d1.u3(var1, '@') > 0 ? com.aspose.slides.ms.System.d1.k5(var1, var2 + 1) : var1;
      } else {
         return "null";
      }
   }

   @Override
   public String toString() {
      com.aspose.slides.internal.l7h.a5 var1 = new com.aspose.slides.internal.l7h.a5();
      var1.n5("Position:").k5(this.a6()).n5("(");
      var1.n5(this.u9());
      var1.n5(")");
      return var1.toString();
   }
}
