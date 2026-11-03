package com.aspose.slides.internal.y5s;

import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.OutOfMemoryException;
import com.aspose.slides.ms.System.j8;
import com.aspose.slides.ms.System.q1;

public class t4 {
   public static void n5(j5 var0, int var1, int var2, com.aspose.slides.internal.j3b.h0 var3) {
      if (var0.s7() > var2) {
         throw new ArgumentOutOfRangeException("fullHeight", "The rectangle bottom is more than full height.");
      }

      if (var0.t2() > var1) {
         throw new ArgumentOutOfRangeException("fullWidth", "The rectangle right is more than full width.");
      }

      n5(var0.n3(), var3, 1, var1, var2);
   }

   public static void n5(j5 var0, com.aspose.slides.internal.j3b.h0 var1) {
      n5(var0.n3(), var1, 0, 0, 0);
   }

   private static void n5(j5 var0, com.aspose.slides.internal.j3b.h0 var1, int var2, int var3, int var4) {
      if (var1 == null) {
         throw new ArgumentNullException("partialProcessor");
      }

      if (var0.a6() <= 0) {
         throw new ArgumentOutOfRangeException("areaToProcess", "The processing area widht must be positive and more than 0.");
      }

      if (var0.u9() <= 0) {
         throw new ArgumentOutOfRangeException("areaToProcess", "The processing area height must be positive and more than 0.");
      }

      if (var0.h0() < 0) {
         throw new ArgumentOutOfRangeException("areaToProcess", "The processing area left must be positive.");
      }

      if (var0.c8() < 0) {
         throw new ArgumentOutOfRangeException("areaToProcess", "The processing area top must be positive.");
      }

      List var5 = new List();
      if (var2 == 1) {
         int var6 = 0;
         int var7 = var0.s7();
         if (var0.u9() >= 8) {
            var6 = 4;
         } else {
            for (int var8 = var0.c8(); var8 < var7; var8++) {
               int var9 = var8 % 2;
               if (var9 == 1) {
                  var6 = 4;
                  break;
               }

               int var10 = var8 % 4;
               if (var10 == 2) {
                  var6 = 3;
               } else {
                  int var11 = var8 % 8;
                  if (var11 == 4) {
                     var6 = q1.n5(var6, 2);
                  } else if (var11 == 0) {
                     var6 = q1.n5(var6, 1);
                  }
               }
            }
         }

         if (var6 == 4) {
            for (int var13 = 1; var13 < var7; var13 += 2) {
               var5.addItem(new j5(0, var13, var3, 1));
            }

            var7 = var4;
         }

         if (var6 >= 3) {
            int var14 = 0;

            for (int var17 = 2; var17 < var7; var17 += 4) {
               var5.insertItem(var14++, new j5(0, var17, var3, 1));
            }

            var7 = var4;
         }

         if (var6 >= 2) {
            int var15 = 0;

            for (int var18 = 4; var18 < var7; var18 += 8) {
               var5.insertItem(var15++, new j5(0, var18, var3, 1));
            }

            var7 = var4;
         }

         if (var6 >= 1) {
            int var16 = 0;

            for (int var19 = 0; var19 < var7; var19 += 8) {
               var5.insertItem(var16++, new j5(0, var19, var3, 1));
            }
         }
      } else {
         var5.addItem(var0.n3());
      }

      com.aspose.slides.internal.j3b.t2 var12 = com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.j3b.t2.class);
      if (!j8.l6(var12, null)) {
         n5(var12, var5);
      } else {
         n5(var1, var5);
      }
   }

   private static void n5(com.aspose.slides.internal.j3b.t2 var0, IGenericList<j5> var1) {
      boolean var2 = false;
      boolean var3 = false;
      boolean var4 = false;

      while (var1.size() > 0) {
         j5 var5 = ((j5)var1.get_Item(0)).n3();
         var1.removeAt(0);

         try {
            long var6 = var0.l6(var5.n3());
            boolean var16 = n5.l6(var6);
            if (var16) {
               var0.n5(var5.n3());
            } else {
               IGenericList[] var17 = new IGenericList[]{var1};
               boolean[] var10 = new boolean[]{var3};
               boolean[] var11 = new boolean[]{var2};
               boolean[] var12 = new boolean[]{var4};
               n5(var0, var5.n3(), var17, var10, var11, var12);
               var1 = var17[0];
               var3 = var10[0];
               var2 = var11[0];
               var4 = var12[0];
            }
         } catch (OutOfMemoryError var15) {
            IGenericList[] var14 = new IGenericList[]{var1};
            boolean[] var8 = new boolean[]{var2};
            boolean[] var9 = new boolean[]{var4};
            n5(var5.n3(), var14, var8, var9);
            var1 = var14[0];
            var2 = var8[0];
            var4 = var9[0];
         }
      }
   }

   private static void n5(com.aspose.slides.internal.j3b.t2 var0, j5 var1, IGenericList<j5>[] var2, boolean[] var3, boolean[] var4, boolean[] var5) {
      if (!var3[0]) {
         long var6 = var0.k5(var1.n3());
         long var8 = var0.n5();
         int var10 = var1.u9();
         int var11 = var1.a6();
         var2[0].insertItem(0, var1.n3());

         do {
            if (var10 > 1) {
               var10 /= 2;
               long var12 = var6 * var10;
               boolean var14 = n5.l6(var12);
               if (var14) {
                  var2[0] = l6(var2[0], var10);
                  break;
               }
            } else {
               if (!var5[0]) {
                  var2[0] = l6(var2[0], 1);
                  var5[0] = true;
               }

               if (var11 <= 1) {
                  var4[0] = true;
                  break;
               }

               var11 /= 2;
               if (var11 < 1) {
                  var4[0] = true;
                  break;
               }

               long var15 = var8 * var11;
               boolean var16 = n5.l6(var15);
               if (var16) {
                  var2[0] = n5(var2[0], var11);
                  break;
               }
            }
         } while (var10 > 1 || var11 > 1);

         var3[0] = true;
      } else {
         n5(var1.n3(), var2, var4, var5);
      }
   }

   private static void n5(j5 var0, IGenericList<j5>[] var1, boolean[] var2, boolean[] var3) {
      if (var2[0]) {
         throw new OutOfMemoryException();
      }

      if (!var3[0]) {
         var3[0] = true;
         var1[0].insertItem(0, var0.n3());
         var1[0] = l6(var1[0], 1);
      } else {
         var1[0].insertItem(0, var0.n3());
         if (var0.a6() / 2 >= 1) {
            var1[0] = n5(var1[0], var0.a6() / 2);
         } else {
            var2[0] = true;
         }
      }
   }

   private static void n5(com.aspose.slides.internal.j3b.h0 var0, IGenericList<j5> var1) {
      boolean var2 = false;
      boolean var3 = false;

      while (var1.size() > 0) {
         j5 var4 = ((j5)var1.get_Item(0)).n3();
         var1.removeAt(0);

         try {
            var0.n5(var4.n3());
         } catch (OutOfMemoryError var9) {
            IGenericList[] var6 = new IGenericList[]{var1};
            boolean[] var7 = new boolean[]{var2};
            boolean[] var8 = new boolean[]{var3};
            n5(var4.n3(), var6, var7, var8);
            var1 = var6[0];
            var2 = var7[0];
            var3 = var8[0];
         }
      }
   }

   private static IGenericList<j5> n5(IGenericList<j5> var0, int var1) {
      List var2 = new List(var0.size() * 2);

      for (j5 var4 : var0) {
         if (var4.a6() > 1) {
            for (j5 var7 : n5(var4.n3(), var1)) {
               if (var7.a6() > 0 && var7.u9() > 0) {
                  var2.addItem(var7.n3());
               }
            }
         } else {
            var2.addItem(var4.n3());
         }
      }

      return var2;
   }

   private static IGenericList<j5> n5(j5 var0, int var1) {
      List var2 = new List(var0.a6() / var1);

      for (int var3 = var0.h0(); var3 < var0.t2(); var3 += var1) {
         int var4 = var3 + var1 < var0.t2() ? var1 : var0.t2() - var3;
         j5 var5 = new j5(var3, var0.c8(), var4, var0.u9());
         var2.addItem(var5.n3());
      }

      return var2;
   }

   private static IGenericList<j5> l6(IGenericList<j5> var0, int var1) {
      List var2 = new List();

      for (j5 var4 : var0) {
         if (var4.u9() > 1) {
            for (j5 var7 : l6(var4.n3(), var1)) {
               if (var7.a6() > 0 && var7.u9() > 0) {
                  var2.addItem(var7.n3());
               }
            }
         } else {
            var2.addItem(var4.n3());
         }
      }

      return var2;
   }

   private static IGenericList<j5> l6(j5 var0, int var1) {
      List var2 = new List(var0.u9() / var1);
      if (var1 >= var0.u9()) {
         var2.addItem(var0.n3());
      } else {
         int var3 = var0.u9() % var1;
         int var4 = var0.s7();
         if (var3 > 0) {
            var4 = var0.c8() + var0.u9() / var1 * var1;
         }

         for (int var5 = var0.c8(); var5 < var4; var5 += var1) {
            j5 var6 = new j5(var0.h0(), var5, var0.a6(), var1);
            var2.addItem(var6.n3());
         }

         if (var3 > 0) {
            j5 var7 = new j5(var0.h0(), var4, var0.a6(), var3);
            var2.addItem(var7.n3());
         }
      }

      return var2;
   }
}
