package com.aspose.slides.internal.r2q;

import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.ms.System.q1;

public class u3 extends k5 {
   private final int a6;
   private final int u9;
   private final int h0;
   private final int c8;
   private int t2;
   private int s7;
   private int x8;
   private int[] n3;
   private y2 y4 = new y2();
   private int e2;
   private int t9;

   public u3(y2 var1, int var2, int var3, boolean var4) {
      super(var2, var4);
      this.c8 = var2;
      this.a6 = var1.c8();
      this.u9 = var1.u3();
      this.h0 = var1.u9();
      this.t2 = var3;
      this.t9 = this.n5[0];
   }

   public final boolean h0() {
      return this.s7 == 0;
   }

   public final boolean c8() {
      return this.s7 >= this.c8;
   }

   public final boolean t2() {
      return this.e2 < this.n3.length;
   }

   public final int s7() {
      return this.t2;
   }

   public final void n5(int[] var1, y2 var2) {
      this.n3 = var1;
      var2.u3(this.y4);
      this.e2 = 0;
      this.n3();
      if (this.t2 == var2.c8() && this.s7 > var2.u3()) {
         int var3 = var2.u3();
         int var4 = 0;
         int var5 = 0;
         int var6 = this.n3.length - this.e2;
         int var7 = 0;

         for (int var8 = 0; var8 < this.l6.length; var8++) {
            int var9 = this.l6[var8];
            int var10 = var5 + var9;
            if (var9 > 0 && var10 > var3) {
               int var11 = var10 - var3;
               int var12 = q1.l6(var11, var6);
               int var13 = this.n5[var4];

               for (int var14 = 0; var14 < var12; var14++) {
                  this.n3[this.e2++] = var13;
               }

               var6 -= var12;
               if (var6 <= 0) {
                  break;
               }

               var3 = var10;
            }

            if (++var4 == 2) {
               var4 = 0;
            }

            var5 = var10;
            var7 += var9;
            if (var7 == this.s7) {
               break;
            }
         }
      }
   }

   public final void x8() {
      this.t2++;
      this.s7 = 0;
      this.u3 = 0;
      this.l6 = new int[this.l6.length];
      this.k5 = 0;
   }

   public final void n5(int var1, int var2) {
      this.l6[this.k5] = this.l6[this.k5] + (this.c8 - this.s7);
      this.t9 = var2;
      this.x8 = var1;
      this.n3();
   }

   public final void n5(int var1) {
      this.l6[this.k5] = this.l6[this.k5] + q1.l6(var1, this.c8 - this.s7);
      if (var1 > 0) {
         if (this.t2 >= this.a6) {
            int var2 = var1;
            int var3 = var2 + this.s7;
            var3 = q1.l6(var3, this.h0);
            var2 = var3 - q1.n5(this.s7, this.u9);
            var2 = q1.l6(this.n3.length - this.e2, var2);
            if (var2 > 0) {
               int var4 = this.n5[this.u3];

               for (int var5 = this.e2 + var2; this.e2 < var5; this.e2++) {
                  this.n3[this.e2] = var4;
               }
            }
         }

         this.s7 += var1;
      }
   }

   private void n3() {
      if (this.t2 < this.x8) {
         int var1 = this.y4.c8();
         int var2 = (this.x8 - var1) * (this.h0 - this.u9);
         int var3 = q1.l6(var2 - this.e2, this.n3.length - this.e2);

         for (int var4 = 0; var4 < var3; var4++) {
            this.n3[this.e2++] = this.t9;
         }

         this.t2 = this.e2 / (this.h0 - this.u9) + var1;
         this.s7 = this.e2 % (this.h0 - this.u9) + this.y4.u3();
         if (this.s7 == 0 && this.x8 == this.t2) {
            this.t2--;
            this.s7 = this.c8;
            this.t9 = this.n5[0];
         }
      }
   }
}
