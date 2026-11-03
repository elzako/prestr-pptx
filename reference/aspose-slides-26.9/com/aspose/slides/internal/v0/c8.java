package com.aspose.slides.internal.v0;

public class c8 {
   private String n5 = null;
   private com.aspose.slides.internal.a3.u3 l6 = null;
   private boolean k5 = false;

   public final boolean n5() {
      return this.k5;
   }

   protected final com.aspose.slides.internal.a3.u3 l6() {
      if (this.l6 == null) {
         this.l6 = new com.aspose.slides.internal.a3.u3();
      }

      return this.l6;
   }

   public final void n5(h0 var1, n3[] var2) {
      int var3 = 1;
      int var4 = 0;

      for (int var5 = var2.length; var4 < var5; var4++) {
         var3 = var2[var4].n5(var3, var1);
      }

      this.l6().n5(var1);
   }

   public static z1 n5(boolean var0) {
      return new c8$n5(var0);
   }
}
