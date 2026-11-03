package com.aspose.slides.internal.s6;

import com.aspose.slides.exceptions.Exception;

final class y0 {
   private p3 n5;

   public y0(p3 var1) {
      this.n5 = var1;
   }

   public final void n5() {
      this.n5.l6().n5(new e2$n5());

      for (int var1 = 0; var1 < this.n5.k5().n5(); var1++) {
         e2 var2 = this.n5.k5().l6(var1);
         e2 var3 = j9.n5(var2, this.n5.l6());
         if (var3 != null) {
            var3.n5(true);
         }

         if (var3 == null) {
            o5 var4 = new o5(this.n5);
            int var5 = 0;
            int var6 = 6 * this.n5.n5().n5();
            m3 var7 = new j5(var2.n5()[0]);

            do {
               var7 = this.n5(var2, var7, var4);
               if (++var5 > var6) {
                  throw new Exception("Infinite loop");
               }
            } while (var7 != null && var7.n5() != var2.n5()[1]);

            j4 var8 = null;
            j4[] var9 = new j4[]{var8};
            boolean var10 = this.n5(var4.l6(), var4.n5(), var9);
            var8 = var9[0];
            if (var10) {
               e2 var11 = new e2(var2.n5()[0], var8);
               e2 var12 = new e2(var8, var2.n5()[1]);
               this.n5.k5().n5(var1, var11);
               this.n5.k5().l6(var1 + 1, var12);
               var1--;
            } else {
               h2 var14 = var4.u9();
               this.n5(var14);
            }
         }
      }

      this.l6();
   }

   private m3 n5(e2 var1, m3 var2, o5 var3) {
      if (com.aspose.slides.internal.v6g.k5.l6(var2, j5.class)) {
         return this.n5((j5)var2, var1, var3);
      } else {
         return com.aspose.slides.internal.v6g.k5.l6(var2, z8.class) ? this.n5((z8)var2, var1, var3) : null;
      }
   }

   private boolean n5(t9 var1, i9 var2, j4[] var3) {
      for (int var4 = 0; var4 < var1.n5(); var4++) {
         e2 var5 = var1.l6(var4);
         if (var5.u3() == 0.0) {
            if (var2.k5(var5.n5()[0]) < 0) {
               var3[0] = var5.n5()[0];
               return true;
            }

            if (var2.k5(var5.n5()[1]) < 0) {
               var3[0] = var5.n5()[1];
               return true;
            }
         }
      }

      var3[0] = null;
      return false;
   }

   private void l6() {
      h2 var1 = new h2();

      for (int var2 = 0; var2 < this.n5.l6().n5(); var2++) {
         e2 var3 = this.n5.l6().l6(var2);
         if (!var3.k5() && var3.l6()[0] != null && var3.l6()[1] != null) {
            a5 var4 = var3.l6()[1];
            int var5 = var4.l6(var3);
            j4 var6 = var3.l6()[0].n5(var3);
            j4 var7 = var4.n5()[(var5 + 2) % 3];
            j4 var8 = var4.n5()[var5];
            j4 var9 = var4.n5()[(var5 + 1) % 3];
            if (!t4.n5(var6, var7, var8, var9)) {
               if (var1.k5(var3.l6()[0]) < 0) {
                  var1.n5(var3.l6()[0]);
               }

               if (var1.k5(var3.l6()[1]) < 0) {
                  var1.n5(var3.l6()[1]);
               }
            }
         }
      }

      this.n5(var1);
   }

   private m3 n5(j5 var1, e2 var2, o5 var3) {
      j4 var4 = var1.n5();
      j4 var5 = null;
      e2 var6 = null;

      int var7;
      for (var7 = 0; var7 < var4.u3().n5(); var7++) {
         var6 = var4.u3().l6(var7).n5(var4);
         j4[] var8 = new j4[]{var5};
         boolean var9 = t4.n5(var4, var2.n5()[1], var6.n5()[0], var6.n5()[1], var8) == 1;
         var5 = var8[0];
         if (var9) {
            break;
         }
      }

      a5 var10 = var4.u3().l6(var7);
      j4 var11 = this.n5(var6, var5);
      return var11 != null ? this.n5(var4, var11, var10) : this.n5(var4, var6, var5, var10, var3);
   }

   private z8 n5(j4 var1, e2 var2, j4 var3, a5 var4, o5 var5) {
      var5.n5().n5(var3);
      e2 var6;
      var5.l6().n5(var6 = new e2(var3, var1));
      var6.n5(true);
      e2 var7;
      var5.l6().n5(var7 = new e2(var3, var2.n5()[0]));
      var7.n5(var2.k5());
      e2 var8;
      var5.l6().n5(var8 = new e2(var3, var2.n5()[1]));
      var8.n5(var2.k5());
      var5.k5().n5(new f0(var1, var3, var2.n5()[0], var6, var7, var4.n5(var1, var2.n5()[0])));
      var5.k5().n5(new f0(var1, var3, var2.n5()[1], var6, var8, var4.n5(var1, var2.n5()[1])));
      var5.u3().n5(var2);
      var5.a6().n5(var4);
      return new z8(var2, var3, var7, var8, var2.n5(var4));
   }

   private j5 n5(j4 var1, j4 var2, a5 var3) {
      j5 var4 = new j5(var2);
      e2 var5 = var3.n5(var1, var4.n5());
      var5.n5(true);
      return var4;
   }

   private j4 n5(e2 var1, j4 var2) {
      if (var1 != null && var2 != null && t4.n5(var1.n5()[0].k5().k5(), var2.k5().k5(), 1.0E-7)) {
         return var1.n5()[0];
      } else {
         return var1 != null && var2 != null && t4.n5(var1.n5()[1].k5().k5(), var2.k5().k5(), 1.0E-7) ? var1.n5()[1] : null;
      }
   }

   private m3 n5(z8 var1, e2 var2, o5 var3) {
      a5 var4 = var1.a6();
      int var5 = 0;

      while (var5 < 3 && var4.l6()[var5] != var1.l6()) {
         var5++;
      }

      e2 var6 = null;
      j4 var7 = null;
      j4 var8 = var2.n5()[0];
      j4 var9 = var2.n5()[1];

      for (int var10 = 1; var10 <= 2; var10++) {
         var6 = var4.l6()[(var5 + var10) % 3];
         j4[] var11 = new j4[]{var7};
         boolean var12 = t4.n5(var8, var9, var6.n5()[0], var6.n5()[1], var11) == 1;
         var7 = var11[0];
         if (var12) {
            break;
         }
      }

      j4 var13 = this.n5(var6, var7);
      return var13 != null ? this.n5(var1, var13, var3) : this.n5(var1, var6, var7, var3);
   }

   private j5 n5(z8 var1, j4 var2, o5 var3) {
      a5 var4 = var1.a6();
      e2 var5 = var1.l6();
      j4 var6 = var1.n5();
      e2 var7;
      var3.l6().n5(var7 = new e2(var6, var2));
      var7.n5(true);
      e2 var8;
      e2 var9;
      if (var1.k5().n5()[0] != var5.n5()[0] && var1.k5().n5()[1] != var5.n5()[0]) {
         var8 = var1.u3();
         var9 = var1.k5();
      } else {
         var8 = var1.k5();
         var9 = var1.u3();
      }

      var3.k5().n5(new f0(var2, var6, var5.n5()[0], var7, var8, var4.n5(var2, var5.n5()[0])));
      var3.k5().n5(new f0(var2, var6, var5.n5()[1], var7, var9, var4.n5(var2, var5.n5()[1])));
      var3.a6().n5(var4);
      return new j5(var2);
   }

   private z8 n5(z8 var1, e2 var2, j4 var3, o5 var4) {
      a5 var5 = var1.a6();
      e2 var6 = var1.l6();
      j4 var7 = var5.n5(var2);
      j4 var8 = var5.n5(var6);
      j4 var9 = null;

      for (int var10 = 0; var10 < 3; var10++) {
         if (var5.n5()[var10] != var7 && var5.n5()[var10] != var8) {
            var9 = var5.n5()[var10];
            break;
         }
      }

      e2 var19 = null;
      e2 var11 = null;
      e2 var12 = var1.k5();
      e2 var13 = var1.u3();
      if (var12.n5()[0] == var9 || var12.n5()[1] == var9) {
         var19 = var12;
         var11 = var13;
      } else if (var13.n5()[0] == var9 || var13.n5()[1] == var9) {
         var19 = var13;
         var11 = var12;
      }

      j4 var14 = var1.n5();
      var4.n5().n5(var3);
      e2 var15;
      var4.l6().n5(var15 = new e2(var9, var3));
      var15.n5(var2.k5());
      e2 var16;
      var4.l6().n5(var16 = new e2(var14, var3));
      var16.n5(true);
      e2 var17;
      var4.l6().n5(var17 = new e2(var3, var8));
      var17.n5(var2.k5());
      if (t4.n5(var7, var8, var3, var14)) {
         e2 var18;
         var4.l6().n5(var18 = new e2(var14, var8));
         var4.k5().n5(new f0(var7, var8, var14, var5.n5(var9), var18, var11));
         var4.k5().n5(new f0(var8, var3, var14, var17, var16, var18));
      } else if (t4.n5(var8, var7, var14, var3)) {
         e2 var20;
         var4.l6().n5(var20 = new e2(var3, var7));
         var4.k5().n5(new f0(var7, var8, var3, var5.n5(var9), var20, var17));
         var4.k5().n5(new f0(var7, var3, var14, var11, var16, var20));
      }

      var4.u3().n5(var2);
      var4.a6().n5(var5);
      var4.k5().n5(new f0(var14, var3, var9, var19, var16, var15));
      return new z8(var2, var3, var17, var15, var2.n5(var5));
   }

   private void n5(h2 var1) {
      int var2 = 6 * var1.n5();
      int var3 = 0;

      for (int var4 = 0; var4 < var1.n5(); var4++) {
         for (int var5 = 0; var5 < 3; var5++) {
            e2 var6 = var1.l6(var4).l6()[var5];
            if (!var6.k5() && var6.l6()[0] != null && var6.l6()[1] != null) {
               a5 var7 = var6.n5(var1.l6(var4));
               int var8 = var1.l6(var4).l6(var6);
               int var9 = var7.l6(var6);
               j4 var10 = var1.l6(var4).n5()[var8];
               j4 var11 = var7.n5()[(var9 + 2) % 3];
               j4 var12 = var7.n5()[var9];
               j4 var13 = var7.n5()[(var9 + 1) % 3];
               e2 var14 = var1.l6(var4).n5(var13);
               e2 var15 = var7.n5(var13);
               e2 var16 = var7.n5(var11);
               e2 var17 = var1.l6(var4).n5(var11);
               if (!t4.n5(var10, var11, var12, var13)) {
                  e2 var18 = new e2(var10, var12);
                  z6.n5(this.n5, var6, true);
                  var1.l6(var6.l6()[0]);
                  var1.l6(var6.l6()[1]);
                  this.n5.l6().u3(var18);
                  a5 var19;
                  this.n5.u3().n5(var19 = new a5(var10, var11, var12, var14, var15, var18));
                  var1.n5(var19);
                  this.n5.u3().n5(var19 = new a5(var12, var13, var10, var16, var17, var18));
                  var1.n5(var19);
                  if (var4 > 0 && var3 <= var2) {
                     var4 -= 2;
                  }

                  var3++;
                  break;
               }
            }
         }
      }

      var1.k5();
   }
}
