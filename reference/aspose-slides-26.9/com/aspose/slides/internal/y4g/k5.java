package com.aspose.slides.internal.y4g;

public class k5 extends y4 {
   private com.aspose.slides.internal.g8v.w1 x8;
   private int n3;

   public k5(com.aspose.slides.internal.z0k.t4 var1, com.aspose.slides.internal.f3c.s7 var2, com.aspose.slides.internal.g8v.w1 var3, byte[] var4) {
      super(var1, var3.n5().a6(), false, com.aspose.slides.internal.g8v.x9.k5(), var2);
      this.x8 = var3;
      this.n3 = 0;
      if (var4 != null) {
         this.l6().write(var4, 0, var4.length);
      }

      super.n5(com.aspose.slides.internal.g8v.x9.l6());
      this.l6.l6(new u3(this));
      this.k5.l6(new a6(this));
   }

   public boolean n5() {
      switch (this.n3) {
         case -2146762487:
         case -2146762486:
            return true;
         default:
            return false;
      }
   }

   @Override
   public boolean n5(com.aspose.slides.internal.f3c.u9 var1, int[] var2) {
      boolean var3 = var2.length > 0;
      this.n3 = var3 ? var2[0] : 0;
      if (com.aspose.slides.internal.g8v.x9.n5() != null) {
         com.aspose.slides.internal.g8v.f0 var4 = this.x8.m3();
         boolean var5 = com.aspose.slides.internal.g8v.x9.n5().n5(var4, var1, this.x8, this.n3);
         if (!var5) {
            return false;
         }

         var3 = true;
      }

      if (this.u3()) {
         return var3;
      }

      com.aspose.slides.internal.f1c.n5 var10 = com.aspose.slides.internal.g8v.x9.u3();
      if (var10 != null) {
         byte var11 = 0;

         for (int var9 : var2) {
            if (var9 == -2146762490) {
               var11 |= 1;
            } else if (var9 == -2146762481) {
               var11 |= 2;
            } else {
               var11 |= 4;
            }
         }

         com.aspose.slides.internal.f3c.h0 var12 = new com.aspose.slides.internal.f3c.h0(var1.x8());
         com.aspose.slides.internal.f3c.x8 var13 = new com.aspose.slides.internal.f3c.x8();
         if (!var13.n5(var12)) {
            var11 |= 4;
         }

         return var10.n5(this.x8, var12, var13, var11);
      } else {
         return var3;
      }
   }
}
