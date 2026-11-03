package com.aspose.slides.internal.o8x;

import com.aspose.slides.ms.System.d1;

public abstract class t2 {
   public static int n5(c8[] var0, int var1, c8[][] var2) {
      if (var0[var1].m1()) {
         return var0[var1].u9().n5(var0, var1, var2);
      }

      var2[0] = null;
      return 0;
   }

   public static int l6(c8[] var0, int var1, c8[][] var2) {
      if (var0[var1].n5() == 1) {
         com.aspose.slides.internal.x6s.l6 var3 = var0[var1].u9();

         while (!var0[var1].m1()) {
            c8[][] var4 = new c8[][]{var0};
            var1 = var4[0][var1].l6(var4);
            var0 = var4[0];
            if (var1 == 0) {
               return var3.k5(var2);
            }
         }

         return var3.n5(var0, var1, var2);
      } else {
         var2[0] = null;
         return 0;
      }
   }

   public static boolean n5(c8[][] var0, int[] var1) {
      if (var0[0][var1[0]].t9()) {
         h0(var0, var1);
         return true;
      } else {
         return false;
      }
   }

   public static boolean l6(c8[][] var0, int[] var1) {
      Object var2 = null;
      c8[][] var3 = new c8[][]{(c8[])var2};
      int var4 = var0[0][var1[0]].k5(var3);
      var2 = var3[0];
      if (var4 != 0 && ((c8)((Object[])var2)[var4]).n5() == 2) {
         var0[0] = (c8[])var2;
         var1[0] = var4;
         return true;
      } else {
         return false;
      }
   }

   public static boolean k5(c8[][] var0, int[] var1) {
      c8[] var2 = var0[0];
      int var3 = var1[0];
      if (!var2[var3].z1()) {
         return false;
      }

      c8[][] var4 = new c8[][]{var2};
      int[] var5 = new int[]{var3};
      h0(var4, var5);
      var2 = var4[0];

      for (var3 = var5[0]; var2[var3].n5() == 2; var2 = var4[0]) {
         var4[0] = var2;
         var3 = var4[0][var3].k5(var4);
      }

      var0[0] = var2;
      var1[0] = var3;
      return true;
   }

   public static boolean u3(c8[][] var0, int[] var1) {
      c8[] var2 = var0[0];
      int var3 = var1[0];
      if (!var2[var3].q0()) {
         c8[][] var4 = new c8[][]{var2};
         var3 = var4[0][var3].k5(var4);
         var2 = var4[0];
         if (var3 != 0) {
            var0[0] = var2;
            var1[0] = var3;
            return true;
         }
      }

      return false;
   }

   public static boolean a6(c8[][] var0, int[] var1) {
      c8[] var2 = var0[0];
      int var3 = var1[0];
      c8[][] var4 = new c8[][]{var2};
      var3 = var4[0][var3].l6(var4);
      var2 = var4[0];
      if (var3 != 0) {
         var0[0] = var2;
         var1[0] = var3;
         return true;
      } else {
         return false;
      }
   }

   public static int n5(c8[] var0, int var1) {
      return var0[0].x8().n5() << 16 | var1;
   }

   public static boolean n5(c8[][] var0, int[] var1, String var2, String var3) {
      c8[] var4 = var0[0];
      int var5 = var1[0];
      if (var4[var5].t4()) {
         c8[][] var6 = new c8[][]{var4};
         int[] var7 = new int[]{var5};
         h0(var6, var7);
         var4 = var6[0];
         var5 = var7[0];

         do {
            if (var4[var5].l6(var2, var3)) {
               var0[0] = var4;
               var1[0] = var5;
               return true;
            }

            var6[0] = var4;
            var5 = var6[0][var5].k5(var6);
            var4 = var6[0];
         } while (var5 != 0);
      }

      return false;
   }

   public static boolean l6(c8[][] var0, int[] var1, String var2, String var3) {
      c8[] var4 = var0[0];
      int var5 = var1[0];
      if (var4[var5].n5() != 2) {
         while (true) {
            c8[][] var6 = new c8[][]{var4};
            var5 = var6[0][var5].k5(var6);
            var4 = var6[0];
            if (var5 == 0) {
               break;
            }

            if (var4[var5].l6(var2, var3)) {
               var0[0] = var4;
               var1[0] = var5;
               return true;
            }
         }
      }

      return false;
   }

   public static boolean n5(c8[][] var0, int[] var1, int var2) {
      c8[] var3 = var0[0];
      int var4 = var1[0];
      if (var3[var4].z1()) {
         int var5 = com.aspose.slides.internal.x6s.a6.h0(var2);
         c8[][] var6 = new c8[][]{var3};
         int[] var7 = new int[]{var4};
         h0(var6, var7);
         var3 = var6[0];
         var4 = var7[0];

         do {
            if ((1 << var3[var4].n5() & var5) != 0) {
               if (var2 == 2) {
                  return false;
               }

               var0[0] = var3;
               var1[0] = var4;
               return true;
            }

            var6[0] = var3;
            var4 = var6[0][var4].k5(var6);
            var3 = var6[0];
         } while (var4 != 0);
      }

      return false;
   }

   public static boolean l6(c8[][] var0, int[] var1, int var2) {
      c8[] var3 = var0[0];
      int var4 = var1[0];
      int var5 = com.aspose.slides.internal.x6s.a6.h0(var2);
      if (var3[var4].n5() != 2) {
         while (true) {
            c8[][] var6 = new c8[][]{var3};
            var4 = var6[0][var4].k5(var6);
            var3 = var6[0];
            if (var4 == 0) {
               break;
            }

            if ((1 << var3[var4].n5() & var5) != 0) {
               var0[0] = var3;
               var1[0] = var4;
               return true;
            }
         }
      }

      return false;
   }

   public static boolean k5(c8[][] var0, int[] var1, String var2, String var3) {
      c8[] var4 = var0[0];
      int var5 = var1[0];
      if (var4[var5].t9()) {
         c8[][] var6 = new c8[][]{var4};
         int[] var7 = new int[]{var5};
         h0(var6, var7);
         var4 = var6[0];
         var5 = var7[0];

         do {
            if (var4[var5].n5(var2, var3)) {
               var0[0] = var4;
               var1[0] = var5;
               return true;
            }

            var6[0] = var4;
            var5 = var6[0][var5].k5(var6);
            var4 = var6[0];
         } while (var5 != 0 && var4[var5].n5() == 2);
      }

      return false;
   }

   public static boolean n5(c8[][] var0, int[] var1, c8[] var2, int var3, String var4, String var5) {
      c8[] var6 = var0[0];
      int var7 = var1[0];
      if (var6[var7].n5() == 1 && var6[var7].k5() == var4) {
         int var8 = 0;
         if (var2 != null) {
            var8 = var2[0].x8().n5();
            int var9 = var6[0].x8().n5();
            if (var9 > var8 || var9 == var8 && var7 >= var3) {
               var2 = null;
            }
         }

         while (true) {
            c8[][] var10 = new c8[][]{var6};
            var7 = var10[0][var7].u3(var10);
            var6 = var10[0];
            if (var7 == 0) {
               break;
            }

            if (var2 != null) {
               int var12 = var6[0].x8().n5();
               if (var12 > var8 || var12 == var8 && var7 >= var3) {
                  break;
               }
            }

            if (var6[var7].k5() == var4 && d1.a6(var6[var7].a6(), var5)) {
               var0[0] = var6;
               var1[0] = var7;
               return true;
            }
         }

         return false;
      } else {
         var7++;

         do {
            if (var6 == var2 && var7 <= var3) {
               while (var7 != var3) {
                  if (var6[var7].l6(var4, var5)) {
                     var0[0] = var6;
                     var1[0] = var7;
                     return true;
                  }

                  var7++;
               }
               break;
            }

            while (var7 < var6[0].x8().l6()) {
               if (var6[var7].l6(var4, var5)) {
                  var0[0] = var6;
                  var1[0] = var7;
                  return true;
               }

               var7++;
            }

            var6 = var6[0].x8().k5();
            var7 = 1;
         } while (var6 != null);

         return false;
      }
   }

   public static boolean n5(c8[][] var0, int[] var1, c8[] var2, int var3, int var4) {
      c8[] var5 = var0[0];
      int var6 = var1[0];
      int var7 = com.aspose.slides.internal.x6s.a6.h0(var4);
      var6++;

      do {
         if (var5 == var2 && var6 <= var3) {
            while (var6 != var3) {
               if ((1 << var5[var6].n5() & var7) != 0) {
                  var0[0] = var5;
                  var1[0] = var6;
                  return true;
               }

               var6++;
            }
            break;
         }

         while (var6 < var5[0].x8().l6()) {
            if ((1 << var5[var6].n5() & var7) != 0) {
               var0[0] = var5;
               var1[0] = var6;
               return true;
            }

            var6++;
         }

         var5 = var5[0].x8().k5();
         var6 = 1;
      } while (var5 != null);

      return false;
   }

   public static boolean n5(c8[][] var0, int[] var1, c8[] var2, int var3) {
      c8[] var4 = var0[0];
      int var5 = var1[0];
      var5++;

      do {
         if (var4 == var2 && var5 <= var3) {
            while (var5 != var3) {
               if (var4[var5].z3() || var4[var5].n5() == 1 && var4[var5].e2()) {
                  var0[0] = var4;
                  var1[0] = var5;
                  return true;
               }

               var5++;
            }
            break;
         }

         while (var5 < var4[0].x8().l6()) {
            if (var4[var5].z3() || var4[var5].n5() == 1 && var4[var5].e2()) {
               var0[0] = var4;
               var1[0] = var5;
               return true;
            }

            var5++;
         }

         var4 = var4[0].x8().k5();
         var5 = 1;
      } while (var4 != null);

      return false;
   }

   public static boolean u9(c8[][] var0, int[] var1) {
      c8[] var2 = var0[0];
      int var3 = var1[0];

      while (!var2[var3].y4()) {
         c8[][] var4 = new c8[][]{var2};
         var3 = var4[0][var3].l6(var4);
         var2 = var4[0];
         if (var3 == 0) {
            return false;
         }
      }

      var0[0] = var2;
      var1[0] = var2[var3].k5(var0);
      return true;
   }

   private static void h0(c8[][] var0, int[] var1) {
      if (++var1[0] >= var0[0].length) {
         var0[0] = var0[0][0].x8().k5();
         var1[0] = 1;
      }
   }
}
