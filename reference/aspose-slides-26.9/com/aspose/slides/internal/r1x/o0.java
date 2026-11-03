package com.aspose.slides.internal.r1x;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.OutOfMemoryException;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.q1;

public class o0 {
   public static void n5(com.aspose.slides.internal.o9b.y2 var0, com.aspose.slides.internal.b8u.e2 var1) {
      n5(var0.n3(), var1, 0, 0, 0);
   }

   private static void n5(com.aspose.slides.internal.o9b.y2 var0, com.aspose.slides.internal.b8u.e2 var1, int var2, int var3, int var4) {
      if (var1 == null) {
         throw new ArgumentNullException("partialProcessor");
      }

      if (var0.t2() <= 0) {
         throw new ArgumentOutOfRangeException("areaToProcess", "The processing area widht must be positive and more than 0.");
      }

      if (var0.l6() <= 0) {
         throw new ArgumentOutOfRangeException("areaToProcess", "The processing area height must be positive and more than 0.");
      }

      if (var0.u3() < 0) {
         throw new ArgumentOutOfRangeException("areaToProcess", "The processing area left must be positive.");
      }

      if (var0.c8() < 0) {
         throw new ArgumentOutOfRangeException("areaToProcess", "The processing area top must be positive.");
      }

      List var5 = new List();
      if (var2 == 1) {
         int var6 = 0;
         int var7 = var0.n5();
         if (var0.l6() >= 8) {
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
               var5.addItem(new com.aspose.slides.internal.o9b.y2(0, var13, var3, 1));
            }

            var7 = var4;
         }

         if (var6 >= 3) {
            int var14 = 0;

            for (int var17 = 2; var17 < var7; var17 += 4) {
               var5.insertItem(var14++, new com.aspose.slides.internal.o9b.y2(0, var17, var3, 1));
            }

            var7 = var4;
         }

         if (var6 >= 2) {
            int var15 = 0;

            for (int var18 = 4; var18 < var7; var18 += 8) {
               var5.insertItem(var15++, new com.aspose.slides.internal.o9b.y2(0, var18, var3, 1));
            }

            var7 = var4;
         }

         if (var6 >= 1) {
            int var16 = 0;

            for (int var19 = 0; var19 < var7; var19 += 8) {
               var5.insertItem(var16++, new com.aspose.slides.internal.o9b.y2(0, var19, var3, 1));
            }
         }
      } else {
         var5.addItem(var0.n3());
      }

      com.aspose.slides.internal.b8u.z1 var12 = com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.b8u.z1.class);
      if (!com.aspose.slides.ms.System.j8.l6(var12, null)) {
         n5(var12, var5);
      } else {
         n5(var1, var5);
      }
   }

   private static void n5(com.aspose.slides.internal.b8u.z1 var0, IGenericList<com.aspose.slides.internal.o9b.y2> var1) {
      boolean var2 = false;
      boolean var3 = false;
      boolean var4 = false;

      while (var1.size() > 0) {
         com.aspose.slides.internal.o9b.y2 var5 = ((com.aspose.slides.internal.o9b.y2)var1.get_Item(0)).n3();
         var1.removeAt(0);

         try {
            long var6 = var0.l6(var5.n3());
            boolean var18 = com.aspose.slides.internal.d9r.u9.n5(0).n5(var6);
            if (var18) {
               var0.n5(var5.n3());
            } else {
               IGenericList[] var20 = new IGenericList[]{var1};
               boolean[] var10 = new boolean[]{var3};
               boolean[] var11 = new boolean[]{var2};
               boolean[] var12 = new boolean[]{var4};
               n5(var0, var5.n3(), var20, var10, var11, var12);
               var1 = var20[0];
               var3 = var10[0];
               var2 = var11[0];
               var4 = var12[0];
            }
         } catch (com.aspose.slides.internal.z3b.h0 var15) {
            IGenericList[] var21 = new IGenericList[]{var1};
            boolean[] var17 = new boolean[]{var2};
            boolean[] var19 = new boolean[]{var4};
            n5(var5.n3(), var21, var17, var19, (int)var15.n5());
            var1 = var21[0];
            var2 = var17[0];
            var4 = var19[0];
         } catch (OutOfMemoryError var16) {
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

   private static void n5(
      com.aspose.slides.internal.b8u.z1 var0,
      com.aspose.slides.internal.o9b.y2 var1,
      IGenericList<com.aspose.slides.internal.o9b.y2>[] var2,
      boolean[] var3,
      boolean[] var4,
      boolean[] var5
   ) {
      if (!var3[0]) {
         long var6 = var0.k5(var1.n3());
         long var8 = var0.n5();
         int var10 = var1.l6();
         int var11 = var1.t2();
         var2[0].insertItem(0, var1.n3());

         do {
            if (var10 > 1) {
               var10 /= 2;
               long var12 = var6 * com.aspose.slides.internal.v6g.k5.h0(var10, 9);
               boolean var14 = com.aspose.slides.internal.d9r.u9.n5(0).n5(var12);
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

               long var15 = var8 * com.aspose.slides.internal.v6g.k5.h0(var11, 9);
               boolean var16 = com.aspose.slides.internal.d9r.u9.n5(0).n5(var15);
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

   private static void n5(
      com.aspose.slides.internal.o9b.y2 var0, IGenericList<com.aspose.slides.internal.o9b.y2>[] var1, boolean[] var2, boolean[] var3, int var4
   ) {
      int var5 = q1.n5(1, var0.l6() / var4);
      l6(var0.n3(), var1, var2, var3, var5);
   }

   private static void n5(com.aspose.slides.internal.o9b.y2 var0, IGenericList<com.aspose.slides.internal.o9b.y2>[] var1, boolean[] var2, boolean[] var3) {
      l6(var0.n3(), var1, var2, var3, 1);
   }

   private static void l6(
      com.aspose.slides.internal.o9b.y2 var0, IGenericList<com.aspose.slides.internal.o9b.y2>[] var1, boolean[] var2, boolean[] var3, int var4
   ) {
      if (var2[0]) {
         throw new OutOfMemoryException();
      }

      if (!var3[0]) {
         var3[0] = var4 == 1;
         var1[0].insertItem(0, var0.n3());
         var1[0] = l6(var1[0], var4);
      } else {
         var1[0].insertItem(0, var0.n3());
         if (var0.t2() / 2 >= 1) {
            var1[0] = n5(var1[0], var0.t2() / 2);
         } else {
            var2[0] = true;
         }
      }
   }

   private static void n5(com.aspose.slides.internal.b8u.e2 var0, IGenericList<com.aspose.slides.internal.o9b.y2> var1) {
      boolean var2 = false;
      boolean var3 = false;

      while (var1.size() > 0) {
         com.aspose.slides.internal.o9b.y2 var4 = ((com.aspose.slides.internal.o9b.y2)var1.get_Item(0)).n3();
         var1.removeAt(0);

         try {
            var0.n5(var4.n3());
         } catch (com.aspose.slides.internal.z3b.h0 var9) {
            IGenericList[] var11 = new IGenericList[]{var1};
            boolean[] var12 = new boolean[]{var2};
            boolean[] var13 = new boolean[]{var3};
            n5(var4.n3(), var11, var12, var13, (int)var9.n5());
            var1 = var11[0];
            var2 = var12[0];
            var3 = var13[0];
         } catch (OutOfMemoryError var10) {
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

   private static IGenericList<com.aspose.slides.internal.o9b.y2> n5(IGenericList<com.aspose.slides.internal.o9b.y2> var0, int var1) {
      List var2 = new List(var0.size() * 2);
      IGenericEnumerator var3 = var0.iterator();

      try {
         while (var3.hasNext()) {
            com.aspose.slides.internal.o9b.y2 var4 = (com.aspose.slides.internal.o9b.y2)var3.next();
            if (var4.t2() > 1) {
               IGenericList var5 = n5(var4.n3(), var1);
               IGenericEnumerator var6 = var5.iterator();

               try {
                  while (var6.hasNext()) {
                     com.aspose.slides.internal.o9b.y2 var7 = (com.aspose.slides.internal.o9b.y2)var6.next();
                     if (var7.t2() > 0 && var7.l6() > 0) {
                        var2.addItem(var7.n3());
                     }
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
                     var6.dispose();
                  }
               }
            } else {
               var2.addItem(var4.n3());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      return var2;
   }

   private static IGenericList<com.aspose.slides.internal.o9b.y2> n5(com.aspose.slides.internal.o9b.y2 var0, int var1) {
      List var2 = new List(var0.t2() / var1);

      for (int var3 = var0.u3(); var3 < var0.u9(); var3 += var1) {
         int var4 = var3 + var1 < var0.u9() ? var1 : var0.u9() - var3;
         com.aspose.slides.internal.o9b.y2 var5 = new com.aspose.slides.internal.o9b.y2(var3, var0.c8(), var4, var0.l6());
         var2.addItem(var5.n3());
      }

      return var2;
   }

   private static IGenericList<com.aspose.slides.internal.o9b.y2> l6(IGenericList<com.aspose.slides.internal.o9b.y2> var0, int var1) {
      List var2 = new List();
      IGenericEnumerator var3 = var0.iterator();

      try {
         while (var3.hasNext()) {
            com.aspose.slides.internal.o9b.y2 var4 = (com.aspose.slides.internal.o9b.y2)var3.next();
            if (var4.l6() > 1) {
               IGenericList var5 = l6(var4.n3(), var1);
               IGenericEnumerator var6 = var5.iterator();

               try {
                  while (var6.hasNext()) {
                     com.aspose.slides.internal.o9b.y2 var7 = (com.aspose.slides.internal.o9b.y2)var6.next();
                     if (var7.t2() > 0 && var7.l6() > 0) {
                        var2.addItem(var7.n3());
                     }
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
                     var6.dispose();
                  }
               }
            } else {
               var2.addItem(var4.n3());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      return var2;
   }

   private static IGenericList<com.aspose.slides.internal.o9b.y2> l6(com.aspose.slides.internal.o9b.y2 var0, int var1) {
      List var2 = new List(var0.l6() / var1);
      if (var1 >= var0.l6()) {
         var2.addItem(var0.n3());
      } else {
         int var3 = var0.l6() % var1;
         int var4 = var0.n5();
         if (var3 > 0) {
            var4 = var0.c8() + var0.l6() / var1 * var1;
         }

         for (int var5 = var0.c8(); var5 < var4; var5 += var1) {
            com.aspose.slides.internal.o9b.y2 var6 = new com.aspose.slides.internal.o9b.y2(var0.u3(), var5, var0.t2(), var1);
            var2.addItem(var6.n3());
         }

         if (var3 > 0) {
            com.aspose.slides.internal.o9b.y2 var7 = new com.aspose.slides.internal.o9b.y2(var0.u3(), var4, var0.t2(), var3);
            var2.addItem(var7.n3());
         }
      }

      return var2;
   }
}
