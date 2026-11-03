package com.aspose.slides.internal.e4;

public class c8 extends u3 {
   private int u3;
   private int a6;
   private int u9;
   private int h0;
   private int c8;
   private int t2;
   private int s7;
   private int x8;
   private int n3;
   private int[] y4;
   private int[] e2;
   private boolean[] t9;
   private int[] z1;

   public c8(com.aspose.slides.internal.m9.h0 var1, int var2, int var3) {
      super(var1, var2, var3, 0);
   }

   @Override
   protected void k5() {
      if (!this.l6) {
         if (!this.l6) {
            if (this.n5().n5() == 0) {
               this.u3 = 0;
               this.a6 = 0;
               this.u9 = 0;
               this.h0 = 0;
               this.c8 = 0;
               this.t2 = 0;
            } else {
               this.u3 = this.n5.a6(10 + this.h0() * 2);
               this.u9 = 10 + (this.h0() + 1) * 2;
               this.h0 = this.u9 + this.u3 * 1;
               this.a6 = this.l6(this.h0() - 1) + 1;
               this.y4 = new int[this.a6];
               this.e2 = new int[this.a6];
               this.t9 = new boolean[this.a6];
               this.n5(false);
               this.c8 = this.h0 + this.s7 * 1;
               this.t2 = this.c8 + this.x8 * 1;
               this.z1 = new int[this.h0() + 1];
               this.z1[0] = 0;

               for (int var1 = 0; var1 < this.z1.length - 1; var1++) {
                  this.z1[var1 + 1] = this.l6(var1) + 1;
               }

               this.n5(true);
               int var2 = 10 + this.h0() * 2 + 2 + this.u3 * 1 + this.s7 * 1 + this.x8 * 1 + this.n3 * 1;
               this.n5(this.l6() - var2);
               this.l6 = true;
            }
         }
      }
   }

   private void n5(boolean var1) {
      int var2 = 0;
      int var3 = 0;
      int var4 = 0;
      int var5 = 0;
      int var6 = 0;

      for (int var7 = 0; var7 < this.a6; var7++) {
         if (var3 == 0) {
            var2 = this.u3(var4++);
            if ((var2 & 8) == 8) {
               var3 = this.u3(var4++);
            }
         } else {
            var3--;
         }

         if (var1) {
            this.t9[var7] = (var2 & 1) == 1;
         }

         if ((var2 & 2) == 2) {
            if (var1) {
               this.y4[var7] = this.n5.k5(this.c8 + var5);
               this.y4[var7] = this.y4[var7] * ((var2 & 16) == 16 ? 1 : -1);
            }

            var5++;
         } else if ((var2 & 16) != 16) {
            if (var1) {
               this.y4[var7] = this.n5.u9(this.c8 + var5);
            }

            var5 += 2;
         }

         if (var1 && var7 > 0) {
            this.y4[var7] = this.y4[var7] + this.y4[var7 - 1];
         }

         if ((var2 & 4) == 4) {
            if (var1) {
               this.e2[var7] = this.n5.k5(this.t2 + var6);
               this.e2[var7] = this.e2[var7] * ((var2 & 32) == 32 ? 1 : -1);
            }

            var6++;
         } else if ((var2 & 32) != 32) {
            if (var1) {
               this.e2[var7] = this.n5.u9(this.t2 + var6);
            }

            var6 += 2;
         }

         if (var1 && var7 > 0) {
            this.e2[var7] = this.e2[var7] + this.e2[var7 - 1];
         }
      }

      this.s7 = var4;
      this.x8 = var5;
      this.n3 = var6;
   }

   private int u3(int var1) {
      return this.n5.k5(this.h0 + var1 * 1);
   }

   public final int l6(int var1) {
      return this.n5.a6(var1 * 2 + 10);
   }

   @Override
   public int a6() {
      this.k5();
      return this.u3;
   }

   @Override
   public com.aspose.slides.internal.m9.h0 u9() {
      this.k5();
      return (com.aspose.slides.internal.m9.h0)this.n5.k5(this.u9, this.a6());
   }

   public final int k5(int var1) {
      this.k5();
      return var1 >= this.h0() ? 0 : this.z1[var1 + 1] - this.z1[var1];
   }

   public final int n5(int var1, int var2) {
      this.k5();
      return this.y4[this.z1[var1] + var2];
   }

   public final int l6(int var1, int var2) {
      this.k5();
      return this.e2[this.z1[var1] + var2];
   }

   public final boolean k5(int var1, int var2) {
      this.k5();
      return this.t9[this.z1[var1] + var2];
   }
}
