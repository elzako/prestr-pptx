package com.aspose.slides.internal.y5s;

public final class c4 implements com.aspose.slides.internal.j3b.u3 {
   private final com.aspose.slides.internal.j3b.u3 n5;
   private final c4$n5 l6;

   public c4(com.aspose.slides.internal.j3b.u3 var1) {
      if (var1.n5() <= 256) {
         this.l6 = new c4$u3(var1);
      } else if (var1.n5() <= 65536) {
         this.l6 = new c4$l6(var1);
      } else {
         this.l6 = new c4$k5(var1);
      }

      this.n5 = var1;
   }

   @Override
   public int n5() {
      return this.n5.n5();
   }

   @Override
   public int[] l6() {
      return this.n5.l6();
   }

   @Override
   public int n5(int var1) {
      return this.l6.n5(var1);
   }

   @Override
   public int l6(int var1) {
      return this.n5.l6(var1);
   }
}
