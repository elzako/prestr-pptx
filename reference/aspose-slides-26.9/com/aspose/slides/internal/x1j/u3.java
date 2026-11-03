package com.aspose.slides.internal.x1j;

import java.util.Iterator;

final class u3 implements Iterator<Integer> {
   final Integer n5;
   final Integer l6;
   int k5;
   Integer u3;
   float a6;
   // $VF: synthetic field
   final int u9;
   // $VF: synthetic field
   final int h0;
   // $VF: synthetic field
   final float[] c8;
   // $VF: synthetic field
   final float[] t2;

   u3(int var1, int var2, float[] var3, float[] var4) {
      this.u9 = var1;
      this.h0 = var2;
      this.c8 = var3;
      this.t2 = var4;
      this.n5 = 0;
      this.l6 = this.u9;
      this.k5 = 0;
      this.u3 = this.n5;
      this.a6 = 0.0F;
   }

   @Override
   public boolean hasNext() {
      return this.k5 < this.h0 + 1;
   }

   public Integer n5() {
      Integer var3;
      if (this.k5 < this.h0) {
         float var1 = this.c8[this.k5];
         float var2 = (var1 - this.a6) / (1.0F - this.a6);
         com.aspose.slides.internal.x1j.a6.n5(var2, this.t2, this.u3, this.t2, 0, this.t2, this.u9, this.u9);
         this.a6 = var1;
         var3 = this.n5;
         this.u3 = this.l6;
      } else {
         var3 = this.u3;
      }

      this.k5++;
      return var3;
   }

   @Override
   public void remove() {
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public Integer next() {
      return this.n5();
   }

}
