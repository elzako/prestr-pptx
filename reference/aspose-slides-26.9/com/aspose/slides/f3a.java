package com.aspose.slides;

class f3a extends com.aspose.slides.internal.v6g.h0<f3a> {
   public f3a() {
   }

   public static void n5(com.aspose.slides.internal.o9b.y1[] var0, com.aspose.slides.internal.o9b.w1 var1) {
      n5(var0, var1.l6());
      l6(var0, var1.k5());
   }

   public static void n5(com.aspose.slides.internal.o9b.y1[] var0, float var1) {
      if (var1 < var0[0].x8()) {
         var0[0].l6(var0[0].h0() - var1);
         var0[0].k5(var1);
      } else if (var1 > var0[0].h0()) {
         var0[0].l6(var1 - var0[0].x8());
      }
   }

   public static void l6(com.aspose.slides.internal.o9b.y1[] var0, float var1) {
      if (var1 < var0[0].n3()) {
         var0[0].n5(var0[0].l6() - var1);
         var0[0].u3(var1);
      } else if (var1 > var0[0].l6()) {
         var0[0].n5(var1 - var0[0].n3());
      }
   }

   public void n5(f3a var1) {
   }

   public f3a n5() {
      f3a var1 = new f3a();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   private boolean l6(f3a var1) {
      return true;
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof f3a) ? false : this.l6((f3a)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public f3a Clone() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(f3a bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
