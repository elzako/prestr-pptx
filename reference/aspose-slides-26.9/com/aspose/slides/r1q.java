package com.aspose.slides;

class r1q extends com.aspose.slides.internal.v6g.h0<r1q> {
   public r1q() {
   }

   public static com.aspose.slides.internal.o9b.c8 n5(com.aspose.slides.internal.o9b.c8 var0, float var1) {
      if (var1 == 0.0F) {
         return var0;
      }

      float var2 = var0.x8() & 0xFF;
      float var3 = var0.n3() & 0xFF;
      float var4 = var0.y4() & 0xFF;
      if (var1 < 0.0F) {
         var2 *= ++var1;
         var3 *= var1;
         var4 *= var1;
      } else {
         var2 = (255.0F - var2) * var1 + var2;
         var3 = (255.0F - var3) * var1 + var3;
         var4 = (255.0F - var4) * var1 + var4;
      }

      return com.aspose.slides.internal.o9b.c8.n5(
         var0.s7() & 255,
         com.aspose.slides.internal.v6g.k5.u3(var2, 13),
         com.aspose.slides.internal.v6g.k5.u3(var3, 13),
         com.aspose.slides.internal.v6g.k5.u3(var4, 13)
      );
   }

   public void n5(r1q var1) {
   }

   public r1q n5() {
      r1q var1 = new r1q();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   private boolean l6(r1q var1) {
      return true;
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof r1q) ? false : this.l6((r1q)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public r1q Clone() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(r1q bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
