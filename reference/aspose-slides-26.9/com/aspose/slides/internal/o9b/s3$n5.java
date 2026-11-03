package com.aspose.slides.internal.o9b;

class s3$n5 {
   private static int n5 = 262144;
   private final a0 l6;
   private byte[] k5;

   public s3$n5(a0 var1) {
      this.l6 = var1;
      this.k5 = null;
   }

   public int n5() {
      return (int)Math.round(this.l6.getBounds().getX());
   }

   public int l6() {
      return (int)Math.round(this.l6.getBounds().getY());
   }

   public int k5() {
      return (int)Math.round(this.l6.getBounds().getWidth());
   }

   public int u3() {
      return (int)Math.round(this.l6.getBounds().getHeight());
   }

   private static boolean l6(com.aspose.slides.internal.c9b.n5 var0) {
      y2 var1 = y2.n5.n3();
      Object var2 = null;
      int var3 = var0.u9();
      if (var3 == 0) {
         return false;
      }

      if (!var0.l6(new com.aspose.slides.internal.v6g.a6<>(var1), null, null)) {
         return false;
      }

      if (var1.t2() != 0 && var1.l6() != 0) {
         int var4 = var1.t2() * 4;
         long var5 = var4 * var1.l6();
         if (var5 >= 1L && var5 <= n5 << 5) {
            var2 = new byte[(int)var5];
            return ((Object[])var2).length != 0;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   // $VF: synthetic method
   static a0 n5(s3$n5 var0) {
      return var0.l6;
   }

   // $VF: synthetic method
   static boolean n5(com.aspose.slides.internal.c9b.n5 var0) {
      return l6(var0);
   }
}
