package com.aspose.slides.internal.j8o;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.b7s.n3;
import com.aspose.slides.internal.b7s.t9;

public class u9 extends l6 {
   private final com.aspose.slides.internal.b7s.u3[] u3 = new com.aspose.slides.internal.b7s.u3[4];
   private int a6;
   private com.aspose.slides.internal.b7s.u3 u9;
   private int h0;
   private int c8;
   private l6$n5 t2 = new l6$n5();

   public u9(t9 var1) {
      super(var1);
      int[][] var2 = new int[10][];

      for (int var3 = 0; var3 < var2.length; var3++) {
         int[] var4 = new int[64];

         for (int var5 = 0; var5 < var4.length; var5++) {
            var4[var5] = -1;
         }

         var2[var3] = var4;
      }

      var1.n5(var2);
   }

   public final int l6(short[][] var1) {
      if (this.k5.e2() != 0 && this.c8 == 0) {
         this.k5();
      }

      byte var2 = 0;
      if (this.a6 > 0) {
         this.a6--;
      } else {
         byte var3 = this.k5.u9().u3;
         byte var4 = this.k5.u9().k5;
         short[] var5 = var1[0];
         int var6 = this.k5.u9().l6();

         for (int var15 = var3 & 255; var15 <= (var4 & 255); var15++) {
            int var8 = 0;
            int[] var9 = new int[]{0};
            l6$n5[] var10 = new l6$n5[]{this.t2};
            boolean var11 = !this.n5(this.u9, var9, var10);
            var8 = var9[0];
            var10[0].n5(this.t2);
            if (var11) {
               return -1;
            }

            int var12 = var8 >> 4;
            var8 &= 15;
            if (var8 != 0) {
               var15 += var12;
               var10[0] = this.t2;
               boolean var13 = !this.l6(var8, var10);
               var10[0].n5(this.t2);
               if (var13) {
                  return -1;
               }

               var10[0] = this.t2;
               var12 = n5(var8, var10);
               var10[0].n5(this.t2);
               var8 = n5(var12, var8);
               var5[com.aspose.slides.internal.n5p.u9.n5()[var15]] = (short)(var8 << var6);
            } else {
               if (var12 != 15) {
                  this.a6 = 1 << var12;
                  if (var12 != 0) {
                     var10[0] = this.t2;
                     boolean var21 = !this.l6(var12, var10);
                     var10[0].n5(this.t2);
                     if (var21) {
                        return -1;
                     }

                     l6$n5[] var14 = new l6$n5[]{this.t2};
                     var12 = n5(var12, var14);
                     var14[0].n5(this.t2);
                     this.a6 += var12;
                  }

                  this.a6--;
                  break;
               }

               var15 += 15;
            }
         }

         var2 = 1;
      }

      this.c8--;
      return var2;
   }

   @Override
   public int n5(short[][] var1) {
      switch (this.h0) {
         case 0:
            return this.a6(var1);
         case 1:
            return this.l6(var1);
         case 2:
            return this.u3(var1);
         case 3:
            return this.k5(var1);
         default:
            throw new ArgumentOutOfRangeException();
      }
   }

   @Override
   public void l6() {
      this.n5(this.k5.u9().l6);
      if (this.k5.e2() > 0) {
         this.c8 = this.k5.e2();
      }

      boolean var1 = (this.k5.u9().u3 & 255) == 0;

      for (int var2 = 0; var2 < this.k5.u9().l6.length; var2++) {
         int var3 = this.k5.u9().l6[var2];

         for (int var4 = this.k5.u9().u3 & 255; var4 <= (this.k5.u9().k5 & 255); var4++) {
            this.k5.s7()[var3][var4] = this.k5.u9().l6();
         }

         this.l6[var3] = 0;
      }

      if (this.k5.u9().n5() == 0) {
         this.h0 = var1 ? 0 : 1;
      } else {
         this.h0 = var1 ? 2 : 3;
      }

      for (int var5 = 0; var5 < this.k5.u9().u9(); var5++) {
         int var6 = this.k5.u9().k5()[var5];
         n3 var7 = this.k5.u3().l6()[var6];
         if (var1) {
            if (this.k5.u9().n5() == 0) {
               this.u3[var7.l6() & 0xFF] = this.k5.n5().get_Item(var7.l6() & 255);
            }
         } else {
            this.u9 = this.k5.n5().get_Item(16 | var7.n5() & 255);
         }
      }

      this.a6 = 0;
      this.t2 = new l6$n5();
   }

   public final int k5(short[][] var1) {
      int var2 = 1 << this.k5.u9().l6();
      int var3 = -1 << this.k5.u9().l6();
      if (this.k5.e2() != 0 && this.c8 == 0) {
         this.k5();
      }

      int var4 = this.k5.u9().u3 & 255;
      int var5 = this.k5.u9().k5 & 255;
      int var6 = var4;
      if (this.a6 == 0) {
         int var7;
         for (var7 = var4; var7 <= var5; var7++) {
            int var8 = 0;
            int[] var9 = new int[]{0};
            l6$n5[] var10 = new l6$n5[]{this.t2};
            boolean var11 = !this.n5(this.u9, var9, var10);
            var8 = var9[0];
            var10[0].n5(this.t2);
            if (var11) {
               return -1;
            }

            int var12 = var8 >> 4;
            var8 &= 15;
            if (var8 != 0) {
               var10[0] = this.t2;
               boolean var13 = !this.l6(1, var10);
               var10[0].n5(this.t2);
               if (var13) {
                  return -1;
               }

               var10[0] = this.t2;
               int var14 = n5(1, var10);
               var10[0].n5(this.t2);
               var8 = var14 != 0 ? var2 : var3;
            } else if (var12 != 15) {
               this.a6 = 1 << var12;
               if (var12 != 0) {
                  var10[0] = this.t2;
                  boolean var28 = !this.l6(var12, var10);
                  var10[0].n5(this.t2);
                  if (var28) {
                     return -1;
                  }

                  var10[0] = this.t2;
                  var12 = n5(var12, var10);
                  var10[0].n5(this.t2);
                  this.a6 += var12;
               }
               break;
            }

            do {
               int var26 = com.aspose.slides.internal.n5p.u9.n5()[var7];
               short var29 = var1[0][var26];
               int var15 = 0;
               if (var29 != 0) {
                  var10[0] = this.t2;
                  boolean var16 = !this.l6(1, var10);
                  var10[0].n5(this.t2);
                  if (var16) {
                     return -1;
                  }

                  var10[0] = this.t2;
                  var15 = n5(1, var10);
                  var10[0].n5(this.t2);
                  if (var15 != 0 && (var29 & var2) == 0) {
                     if (var29 >= 0) {
                        var1[0][var26] = (short)(var1[0][var26] + (short)var2);
                     } else {
                        var1[0][var26] = (short)(var1[0][var26] + (short)var3);
                     }
                  }
               } else if (--var12 < 0) {
                  break;
               }
            } while (++var7 <= var5);

            if (var8 != 0) {
               int var27 = com.aspose.slides.internal.n5p.u9.n5()[var7];
               var1[0][var27] = (short)var8;
            }
         }

         var6 = var7;
      }

      if (this.a6 > 0) {
         for (int var17 = var6; var17 <= var5; var17++) {
            int var20 = com.aspose.slides.internal.n5p.u9.n5()[var17];
            short var21 = var1[0][var20];
            if (var21 != 0) {
               l6$n5[] var22 = new l6$n5[]{this.t2};
               boolean var23 = !this.l6(1, var22);
               var22[0].n5(this.t2);
               if (var23) {
                  return -1;
               }

               var22[0] = this.t2;
               int var25 = n5(1, var22);
               var22[0].n5(this.t2);
               if (var25 != 0 && (var21 & var2) == 0) {
                  if (var21 >= 0) {
                     var1[0][var20] = (short)(var1[0][var20] + (short)var2);
                  } else {
                     var1[0][var20] = (short)(var1[0][var20] + (short)var3);
                  }
               }
            }
         }

         this.a6--;
      }

      this.c8--;
      return 1;
   }

   public final int u3(short[][] var1) {
      if (this.k5.e2() != 0 && this.c8 == 0) {
         this.k5();
      }

      int var2 = this.k5.u9().u9();
      int var3 = this.k5.u9().l6();

      for (int var4 = 0; var4 < var2; var4++) {
         l6$n5[] var5 = new l6$n5[]{this.t2};
         boolean var6 = !this.l6(1, var5);
         var5[0].n5(this.t2);
         if (var6) {
            return -1;
         }

         var5[0] = this.t2;
         int var7 = n5(1, var5);
         var5[0].n5(this.t2);
         if (var7 != 0) {
            var1[var4][0] = (short)(var1[var4][0] | (short)(1 << var3));
         }
      }

      this.c8--;
      return var2;
   }

   private int a6(short[][] var1) {
      if (this.k5.e2() != 0 && this.c8 == 0) {
         this.k5();
      }

      int var2 = this.k5.u9().u9();

      for (int var3 = 0; var3 < var2; var3++) {
         int var4 = this.k5.u9().k5()[var3];
         int var5 = 0;
         int[] var6 = new int[]{0};
         l6$n5[] var7 = new l6$n5[]{this.t2};
         boolean var8 = !this.n5(this.u3[this.k5.u3().l6()[var4].l6() & 0xFF], var6, var7);
         var5 = var6[0];
         var7[0].n5(this.t2);
         if (var8) {
            return -1;
         }

         if (var5 != 0) {
            var7[0] = this.t2;
            boolean var9 = !this.l6(var5, var7);
            var7[0].n5(this.t2);
            if (var9) {
               return -1;
            }

            var7[0] = this.t2;
            int var10 = n5(var5, var7);
            var7[0].n5(this.t2);
            var5 = n5(var10, var5);
         }

         var5 += this.l6[var4];
         this.l6[var4] = var5;
         var1[var3][0] = (short)(var5 << this.k5.u9().l6());
      }

      this.c8--;
      return var2;
   }

   private void k5() {
      this.c8 = this.k5.e2();
      byte var1 = this.n5.u9();
      if ((var1 & 255) >= 208 && (var1 & 255) <= 215) {
         for (int var2 = 0; var2 < this.l6.length; var2++) {
            this.l6[var2] = 0;
         }

         this.a6 = 0;
      } else {
         throw new Exception("Invalid jpeg marker");
      }
   }

   private void n5(int var1) {
      int[][] var2 = new int[var1][];

      for (int var3 = 0; var3 < var1; var3++) {
         var2[var3] = new int[64];

         for (int var4 = 0; var4 < 64; var4++) {
            var2[var3][var4] = -1;
         }
      }

      this.k5.n5(var2);
   }

   private void n5(int[] var1) {
      int var2 = this.l6(var1);
      if (this.k5.s7().length < var2 + 1) {
         this.n5(var2 + 1);
      }

      if (this.l6.length < var2 + 1) {
         this.l6 = new int[var2 + 1];
      }
   }

   private int l6(int[] var1) {
      int var2 = 0;

      for (int var6 : var1) {
         if (var6 > var2) {
            var2 = var6;
         }
      }

      return var2;
   }
}
