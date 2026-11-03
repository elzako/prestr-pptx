package com.aspose.slides.internal.v2;

public class l6 extends s7 {
   private boolean n5;

   private l6(boolean var1) {
      this.n5(var1);
   }

   public static l6 n5() {
      return new l6(true);
   }

   public static l6 l6() {
      return new l6(false);
   }

   public final boolean k5() {
      return this.n5;
   }

   private void n5(boolean var1) {
      this.n5 = var1;
   }

   public static l6 n5(String var0) {
      boolean var1 = false;
      boolean[] var2 = new boolean[]{false};
      boolean var3 = com.aspose.slides.ms.System.n3.n5(var0, var2);
      var1 = var2[0];
      if (var3) {
         return var1 ? n5() : l6();
      } else {
         return null;
      }
   }

   @Override
   public String toString() {
      return com.aspose.slides.ms.System.n3.l6(this.k5());
   }
}
