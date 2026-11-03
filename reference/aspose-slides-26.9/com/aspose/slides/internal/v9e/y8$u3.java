package com.aspose.slides.internal.v9e;

class y8$u3 extends y8$n3 {
   private Object n5;
   private com.aspose.slides.internal.p4l.q0 l6;
   private int[] k5;

   public y8$u3(Object var1, com.aspose.slides.internal.p4l.q0 var2, com.aspose.slides.internal.u0a.n5 var3) {
      this.n5 = var1;
      this.l6 = var2;
      int var4 = y8.n5(var2.k7());
      com.aspose.slides.internal.p4l.z3[] var5 = var2.a6();
      int var6 = var5.length;
      int var7 = var5.length;
      this.k5 = new int[var5.length];
      int[] var8 = new int[var5.length];
      boolean var9 = true;

      for (int var10 = var5.length - 1; 0 <= var10; var10--) {
         this.k5[var10] = com.aspose.slides.ms.System.y8.u3(var5[var10].n5());
         var8[var10] = y8.n5(var5[var10].n5());
         if (var9) {
            if (var5[var10].k5()) {
               var6--;
            } else {
               var9 = false;
            }
         }
      }

      super.n5(var6, var7, var4, var8);
   }

   @Override
   public Object n5(com.aspose.slides.internal.k4s.h0 var1, Object[] var2, com.aspose.slides.internal.x6s.a6 var3) {
      for (int var4 = var2.length - 1; 0 <= var4; var4--) {
         var2[var4] = n5(var2[var4], this.u3()[var4], this.k5[var4]);
      }

      return this.l6.n5(this.n5, var2);
   }
}
