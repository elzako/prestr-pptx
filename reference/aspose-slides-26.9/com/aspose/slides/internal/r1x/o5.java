package com.aspose.slides.internal.r1x;

public final class o5 implements com.aspose.slides.internal.b8u.a6 {
   private final com.aspose.slides.internal.b8u.a6 n5;
   private final com.aspose.slides.internal.b8u.a6 l6;

   public o5(com.aspose.slides.internal.b8u.a6 var1) {
      boolean var2 = false;

      for (int var6 : var1.l6()) {
         if ((var6 >> 24 & 0xFF) != 255) {
            var2 = true;
            break;
         }
      }

      if (var1.n5() <= 256) {
         if (var2) {
            this.l6 = o5$h0.n5(var1);
         } else {
            this.l6 = new o5$u3(var1);
         }
      } else if (var1.n5() <= 65536) {
         if (var2) {
            this.l6 = o5$a6.n5(var1);
         } else {
            this.l6 = new o5$l6(var1);
         }
      } else if (var2) {
         this.l6 = o5$u9.n5(var1);
      } else {
         this.l6 = new o5$k5(var1);
      }

      this.n5 = var1;
   }

   @Override
   public final int n5() {
      return this.n5.n5();
   }

   @Override
   public final int[] l6() {
      return this.n5.l6();
   }

   @Override
   public final com.aspose.slides.internal.o9b.c8[] k5() {
      return this.n5.k5();
   }

   @Override
   public final boolean u3() {
      return this.n5.u3();
   }

   @Override
   public final int n5(int var1) {
      return this.l6.n5(var1);
   }

   @Override
   public final int l6(int var1) {
      return this.n5.l6(var1);
   }
}
