package com.aspose.slides.internal.k1;

import com.aspose.slides.internal.o9b.i1;

public class x8 extends com.aspose.slides.internal.y6.u3 {
   private int n5;
   private c8 l6;
   private int k5;

   public final int n5() {
      return this.n5;
   }

   public final void n5(int var1) {
      this.n5 = var1;
   }

   public final c8 l6() {
      return this.l6;
   }

   public final void n5(c8 var1) {
      this.l6 = var1;
   }

   public final int k5() {
      return this.k5;
   }

   public final void l6(int var1) {
      this.k5 = var1;
   }

   public final com.aspose.slides.internal.o9b.u3 u3() {
      switch (this.n5) {
         case 0:
            return new i1(this.l6().u9().o8());
         case 1:
            return null;
         case 2:
            return new com.aspose.slides.internal.x4g.n3(this.k5() & 65535, this.l6().u9().o8());
         default:
            return new i1(com.aspose.slides.internal.o9b.c8.m3().o8());
      }
   }
}
