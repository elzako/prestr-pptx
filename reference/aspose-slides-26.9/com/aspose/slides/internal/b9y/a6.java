package com.aspose.slides.internal.b9y;

import com.aspose.slides.exceptions.ArgumentNullException;

public abstract class a6 extends k5 {
   private int n5 = -1;
   private int l6;
   private int k5;
   private int[] u3;
   private int a6;
   private boolean u9;
   private int h0;
   private final com.aspose.slides.internal.j3b.n5 c8;

   protected a6(com.aspose.slides.internal.j3b.n5 var1, int var2, int var3) {
      super(var2, var3);
      if (var1 == null) {
         throw new ArgumentNullException("bufferProcessor");
      }

      this.c8 = var1;
   }

   protected com.aspose.slides.internal.j3b.n5 l6() {
      return this.c8;
   }

   public void k5() {
      this.u3(this.t2() + 1);
      this.l6 = 1 << this.t2();
      this.k5 = this.l6 + 1;
      this.n5();
      this.n3();
      this.u9 = false;
   }

   public void n5(int var1) {
      this.l6(this.u3[this.h0]);
   }

   public void n5(byte[] var1, int var2) {
      if (var1 == null) {
         throw new ArgumentNullException("values");
      }

      if (this.n5 == -1) {
         throw new IllegalArgumentException("LzwCompressorException:StartEncoding method was not called first.");
      }

      if (var2 > 0) {
         int var3 = 0;
         if (!this.u9) {
            this.l6(this.h0());
            this.h0 = (var1[0] & 255) * this.k5;
            var3 = 1;
            this.u9 = true;
         }

         for (; var3 < var2; var3++) {
            int var4 = var1[var3] & 255;
            int var5 = this.h0 + var4 + 1;
            int var6 = this.u3[var5];
            if (var6 != 0) {
               this.h0 = var5 + var6;
            } else {
               int var7 = this.a6 - var5;
               this.u3[var5] = var7;
               this.u3[this.a6] = this.c8() + this.n5++;
               this.a6 = (this.l6 + this.n5) * this.k5;
               this.l6(this.u3[this.h0]);
               if (this.n5 > this.x8()) {
                  this.e2();
               }

               if (this.s7() == 12 && this.n5 == this.x8()) {
                  this.l6(this.h0());
                  this.y4();
                  this.n5();
               }

               this.h0 = var4 * this.k5;
            }
         }
      }
   }

   private void n5() {
      if (this.u3 == null) {
         this.u3 = new int[4095 * this.k5];
      } else {
         com.aspose.slides.ms.System.u3.n5(this.u3, 0, this.u3.length);
      }

      int var1 = 0;

      while (var1 < this.l6) {
         this.u3[this.k5 * var1] = var1++;
      }

      this.n5 = 0;
      this.a6 = this.l6 * this.k5;
   }

   protected abstract void l6(int var1);
}
