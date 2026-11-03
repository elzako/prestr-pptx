package com.aspose.slides;

class k2s extends com.aspose.slides.internal.v6g.h0<k2s> {
   public k2s() {
   }

   public static com.aspose.slides.internal.o9b.c8 n5(int var0, com.aspose.slides.internal.o9b.c8 var1) {
      if (var0 == 7 || var0 == 8) {
         var0 = n5(var1.o8(), var0);
      }

      float var2 = 0.0F;
      switch (var0) {
         case 0:
            return com.aspose.slides.internal.o9b.c8.e2().o8();
         case 1:
            return com.aspose.slides.internal.n2d.l6.y1();
         case 2:
            return var1;
         case 3:
            var2 = -0.3F;
            break;
         case 4:
            var2 = -0.5F;
            break;
         case 5:
            var2 = 0.3F;
            break;
         case 6:
            var2 = 0.5F;
         case 7:
         case 8:
         default:
            break;
         case 9:
            return n5(var1.o8());
      }

      return r1q.n5(var1.o8(), var2);
   }

   private static int n5(com.aspose.slides.internal.o9b.c8 var0, int var1) {
      if (var0.c8() > 0.4F) {
         return var1 == 7 ? 3 : 4;
      } else {
         return var1 == 7 ? 5 : 6;
      }
   }

   private static com.aspose.slides.internal.o9b.c8 n5(com.aspose.slides.internal.o9b.c8 var0) {
      return var0.c8() > 0.4F ? com.aspose.slides.internal.o9b.c8.m3().o8() : com.aspose.slides.internal.o9b.c8.w4().o8();
   }

   public void n5(k2s var1) {
   }

   public k2s n5() {
      k2s var1 = new k2s();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   private boolean l6(k2s var1) {
      return true;
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof k2s) ? false : this.l6((k2s)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public k2s Clone() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(k2s bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
