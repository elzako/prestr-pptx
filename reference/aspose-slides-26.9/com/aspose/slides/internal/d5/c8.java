package com.aspose.slides.internal.d5;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.e5.x8;
import com.aspose.slides.internal.l7h.a5;

public class c8 extends l6 {
   public static int[] n5(com.aspose.slides.internal.r4.a6 var0, com.aspose.slides.internal.v8.k5 var1, List<u9> var2) {
      int[] var3 = new int[var0.h0()];
      if (!n5(var0, var3) && var1 != com.aspose.slides.internal.v8.k5.l6) {
         return null;
      }

      int[] var4 = n5(var3, var1 == com.aspose.slides.internal.v8.k5.l6 ? 1 : 0, new int[var3.length]);
      List var5 = new List();
      int var6 = 0;

      for (int var7 = 0; var7 < var2.size(); var7++) {
         if (com.aspose.slides.internal.v6g.k5.l6(((u9)var2.get_Item(var7)).n5(), x8.class)) {
            boolean var12 = false;
            x8 var9 = com.aspose.slides.internal.v6g.k5.n5(((u9)var2.get_Item(var7)).n5(), x8.class);
            a5 var10 = new a5();

            for (int var11 = ((u9)var2.get_Item(var7)).l6(); var11 < ((u9)var2.get_Item(var7)).k5(); var11++) {
               if (var0.u3(var11) <= 8238 && var0.u3(var11) >= 8234) {
                  var12 = true;
               } else {
                  var10.n5(var0.u3(var11));
                  var5.addItem(var4[var11]);
               }
            }

            if (var12) {
               var9.a6(var10.toString());
               var2.set_Item(var7, new u9(var9, var6, var6 + var10.l6()));
            }

            var6 += var10.l6();
         } else {
            for (int var8 = ((u9)var2.get_Item(var7)).k5() - 1; var8 >= ((u9)var2.get_Item(var7)).l6(); var8--) {
               var5.addItem(var4[var8]);
            }

            var2.set_Item(var7, new u9(((u9)var2.get_Item(var7)).n5(), var6, var6 + ((u9)var2.get_Item(var7)).k5() - ((u9)var2.get_Item(var7)).l6()));
            var6 += ((u9)var2.get_Item(var7)).k5() - ((u9)var2.get_Item(var7)).l6();
         }
      }

      return com.aspose.slides.internal.v3.a6.n5(var5);
   }

   public static int[] n5(int[] var0, int var1, int[] var2) {
      return n5(var0, l6(var0), var1, var2, false);
   }

   public static int[] n5(int[] var0, int[] var1, int var2, int[] var3, boolean var4) {
      int[] var5 = n5(var1);
      int[] var6 = new int[var3.length];
      l6(var5, var2, var6);
      n5(var5, var2, var6, n5(var6, var3));
      if (var4) {
         k5(var1, var2, var3);
      }

      return var3;
   }

   private static int[] n5(int[] var0) {
      int[] var1 = new int[var0.length];
      com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(var0)), 0, com.aspose.slides.ms.System.u3.n5((Object)(var1)), 0, var1.length);
      return var1;
   }

   private static void l6(int[] var0, int var1, int[] var2) {
      int[] var3 = new int[61];
      int var4 = 0;
      int var5 = var1;
      int var6 = 0;

      for (int var7 = var0.length; var6 < var7; var6++) {
         int var8 = var0[var6];
         int var10;
         switch (var8) {
            case 2:
            case 3:
            case 6:
            case 7:
               int var9;
               if (var8 != 6 && var8 != 7) {
                  var9 = (var5 & -129) + 2 & -2;
               } else {
                  var9 = (var5 & -129) + 1 | 1;
               }

               if (var9 < 62) {
                  var3[var4++] = var5;
                  if (var8 != 3 && var8 != 7) {
                     var5 = var9 & -129;
                  } else {
                     var5 = var9 | 128;
                  }
               }

               var10 = var5;
               break;
            case 4:
            case 5:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            default:
               var10 = var5;
               break;
            case 8:
               var10 = var5;
               if (var4 > 0) {
                  var5 = var3[--var4];
               }
               break;
            case 16:
               var5 = var1;
               var10 = var1;
               var4 = 0;
         }

         switch (var8) {
            case 2:
            case 3:
            case 6:
            case 7:
            case 8:
               var0[var6] = 15;
               break;
            case 4:
            case 5:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            default:
               if ((var10 & 128) != 0) {
                  var0[var6] = n5(var10);
               }
            case 15:
         }

         var2[var6] = var10;
      }
   }

   private static int n5(int var0) {
      return (var0 & 1) != 0 ? 4 : 1;
   }

   private static int l6(int var0) {
      return var0 & -129;
   }

   private static int[] n5(int[] var0, int[] var1) {
      int var2 = 0;

      for (int var3 = var1.length; var2 < var3; var2++) {
         var1[var2] = l6(var0[var2]);
      }

      return var1;
   }

   private static void n5(int[] var0, int var1, int[] var2, int[] var3) {
      if (var3.length != var0.length) {
         throw new ArgumentException("levels sequence length must match classes sequence length");
      }

      if (var3.length != var2.length) {
         throw new ArgumentException("levels sequence length must match embeddings sequence length");
      }

      int var4 = 0;
      int var5 = var2.length;
      int var6 = var1;

      while (var4 < var5) {
         int var7 = var4;
         int var8 = var7;
         int var9 = n5(var0, var2, var7, var6);

         while (var8 < var5) {
            if (var3[var8] != var9) {
               if (!n5(var0, var2, var8)) {
                  break;
               }

               var8 += n5(var2, var8);
            } else {
               var8++;
            }
         }

         var6 = n5(var0, var1, var2, var3, var7, var8, var9, var6);
         var4 = var8;
      }
   }

   private static int n5(int[] var0, int[] var1, int var2, int var3) {
      int var4 = var2;
      int var5 = var0.length;

      while (var4 < var5 && n5(var0, var1, var4)) {
         var4 += n5(var1, var4);
      }

      return var4 < var5 ? l6(var1[var4]) : var3;
   }

   private static int n5(int[] var0, int var1) {
      int var2 = 0;
      int var3 = var1;
      int var4 = var0.length;

      for (int var5 = l6(var0[var1]); var3 < var4 && l6(var0[var3]) == var5; var3++) {
         var2++;
      }

      return var2;
   }

   private static boolean n5(int[] var0, int[] var1, int var2) {
      int var3 = n5(var1, var2);
      if (var3 > 0) {
         int var4 = l6(var0, var2);
         return var4 >= var3;
      } else {
         return false;
      }
   }

   private static int l6(int[] var0, int var1) {
      int var2 = 0;
      int var3 = var1;

      for (int var4 = var0.length; var3 < var4 && var0[var3] == 15; var3++) {
         var2++;
      }

      return var2;
   }

   private static int n5(int[] var0, int var1, int[] var2, int[] var3, int var4, int var5, int var6, int var7) {
      int var8 = n5(n5(var7, var6));
      int var9 = -1;
      if (var5 == var0.length) {
         var9 = n5(var6, var1);
      } else {
         for (int var10 = var5; var10 < var0.length; var10++) {
            if (var0[var10] != 15) {
               var9 = n5(var6, var3[var10]);
               break;
            }
         }

         if (var9 < 0) {
            var9 = n5(var6, var1);
         }
      }

      int var11 = n5(var9);
      n5(var0, var2, var3, var4, var5, var6, var8, var11);
      l6(var0, var2, var3, var4, var5, var6, var8, var11);
      k5(var0, var2, var3, var4, var5, var6, var8, var11);
      return n5(var0, var4, var5) ? var7 : var6;
   }

   private static void n5(int[] var0, int[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = var3;
      int var9 = var6;

      while (var8 < var4) {
         int var10 = var0[var8];
         if (var10 == 14) {
            var0[var8] = var9;
         } else if (var10 != 15) {
            var9 = var10;
         }

         var8++;
      }

      var8 = var3;
      var9 = var6;

      while (var8 < var4) {
         int var25 = var0[var8];
         if (var25 == 9) {
            if (var9 == 5) {
               var0[var8] = 12;
            }
         } else if (k5(var25)) {
            var9 = var25;
         }

         var8++;
      }

      for (int var14 = var3; var14 < var4; var14++) {
         var9 = var0[var14];
         if (var9 == 5) {
            var0[var14] = 4;
         }
      }

      var8 = var3;
      var9 = var6;

      while (var8 < var4) {
         int var26 = var0[var8];
         if (var26 == 10) {
            int var30 = var7;

            for (int var32 = var8 + 1; var32 < var4; var32++) {
               if ((var26 = var0[var32]) != 15) {
                  var30 = var26;
                  break;
               }
            }

            if (var9 == 9 && var30 == 9) {
               var0[var8] = 9;
            }
         } else if (var26 == 13) {
            int var11 = var7;

            for (int var12 = var8 + 1; var12 < var4; var12++) {
               if ((var26 = var0[var12]) != 15) {
                  var11 = var26;
                  break;
               }
            }

            if (var9 == 9 && var11 == 9) {
               var0[var8] = 9;
            } else if (var9 == 12 && var11 == 12) {
               var0[var8] = 12;
            }
         }

         if (var26 != 15) {
            var9 = var26;
         }

         var8++;
      }

      var8 = var3;
      var9 = var6;

      while (var8 < var4) {
         int var27 = var0[var8];
         if (var27 != 11) {
            if (var27 != 15 && var27 != 11) {
               var9 = var27;
            }
         } else {
            int var31 = var7;

            for (int var33 = var8 + 1; var33 < var4; var33++) {
               var27 = var0[var33];
               if (var27 != 15 && var27 != 11) {
                  var31 = var27;
                  break;
               }
            }

            if (var9 == 9 || var31 == 9) {
               var0[var8] = 9;
            }
         }

         var8++;
      }

      for (int var17 = var3; var17 < var4; var17++) {
         var9 = var0[var17];
         if (var9 == 11 || var9 == 10 || var9 == 13) {
            var0[var17] = 19;
            n5(var0, var3, var4, var17, 19);
         }
      }

      var8 = var3;
      var9 = var6;

      while (var8 < var4) {
         int var29 = var0[var8];
         if (var29 == 9) {
            if (var9 == 1) {
               var0[var8] = 1;
            }
         } else if (var29 == 1 || var29 == 4) {
            var9 = var29;
         }

         var8++;
      }
   }

   private static void l6(int[] var0, int[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = var3;
      int var9 = var6;

      while (var8 < var4) {
         int var10 = var0[var8];
         if (!u3(var10)) {
            if (var10 == 1 || var10 == 4) {
               var9 = var10;
            } else if (var10 == 12 || var10 == 9) {
               var9 = 4;
            }
         } else {
            int var11 = var7;
            if (var8 + 1 == var4 && var0[var8] == 18) {
               var10 = var0[var8 - 1];
               if (var10 == 1 || var10 == 4) {
                  var11 = var10;
               } else if (var10 == 12 || var10 == 9) {
                  var11 = 4;
               }
            }

            int var12 = var8 + 1;

            while (var12 < var4) {
               var10 = var0[var12];
               if (var10 != 1 && var10 != 4) {
                  if (var10 != 12 && var10 != 9) {
                     if (!u3(var10) && !a6(var10)) {
                        break;
                     }

                     var12++;
                     continue;
                  }

                  var11 = 4;
                  break;
               }

               var11 = var10;
               break;
            }

            if (var9 == var11) {
               var0[var8] = var9;
               n5(var0, var3, var4, var8, var9);
            }
         }

         var8++;
      }

      for (int var13 = var3; var13 < var4; var13++) {
         var9 = var0[var13];
         if (u3(var9)) {
            int var17 = n5(l6(var1[var13]));
            var0[var13] = var17;
            n5(var0, var3, var4, var13, var17);
         }
      }
   }

   private static void n5(int[] var0, int var1, int var2, int var3, int var4) {
      if (var3 >= var1 && var3 < var2) {
         for (int var5 = var3 - 1; var5 >= var1; var5--) {
            int var6 = var0[var5];
            if (var6 != 15) {
               break;
            }

            var0[var5] = var4;
         }

         for (int var7 = var3 + 1; var7 < var2; var7++) {
            int var8 = var0[var7];
            if (var8 != 15) {
               break;
            }

            var0[var7] = var4;
         }
      } else {
         throw new ArgumentException();
      }
   }

   private static void k5(int[] var0, int[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7) {
      for (int var8 = var3; var8 < var4; var8++) {
         int var9 = var0[var8];
         int var10 = var2[var8];
         byte var11 = 0;
         if ((var10 & 1) == 0) {
            if (var9 == 4) {
               var11 = 1;
            } else if (var9 == 12) {
               var11 = 2;
            } else if (var9 == 9) {
               var11 = 2;
            }
         } else if (var9 == 1) {
            var11 = 1;
         } else if (var9 == 9) {
            var11 = 1;
         } else if (var9 == 12) {
            var11 = 1;
         }

         var2[var8] = var10 + var11;
      }
   }

   private static void k5(int[] var0, int var1, int[] var2) {
      int var3 = 0;

      for (int var4 = var0.length; var3 < var4; var3++) {
         int var5 = var0[var3];
         if (var5 == 17 || var5 == 16) {
            var2[var3] = var1;

            for (int var6 = var3 - 1; var6 >= 0; var6--) {
               int var7 = var0[var6];
               if (!a6(var7)) {
                  if (var7 != 18) {
                     break;
                  }

                  var2[var6] = var1;
               }
            }
         }
      }

      for (int var8 = var0.length; var8 > 0; var8--) {
         int var10 = var8 - 1;
         int var12 = var0[var10];
         if (!a6(var12)) {
            if (var12 != 18) {
               break;
            }

            var2[var10] = var1;
         }
      }

      var3 = 0;

      for (int var11 = var0.length; var3 < var11; var3++) {
         int var13 = var0[var3];
         if (a6(var13)) {
            if (var3 == 0) {
               var2[var3] = var1;
            } else {
               var2[var3] = var2[var3 - 1];
            }
         }
      }
   }

   private static boolean k5(int var0) {
      switch (var0) {
         case 1:
         case 4:
         case 5:
            return true;
         case 2:
         case 3:
         default:
            return false;
      }
   }

   private static boolean u3(int var0) {
      switch (var0) {
         case 16:
         case 17:
         case 18:
         case 19:
            return true;
         default:
            return false;
      }
   }

   private static boolean a6(int var0) {
      switch (var0) {
         case 2:
         case 3:
         case 6:
         case 7:
         case 8:
         case 15:
            return true;
         case 4:
         case 5:
         case 9:
         case 10:
         case 11:
         case 12:
         case 13:
         case 14:
         default:
            return false;
      }
   }

   private static boolean n5(int[] var0, int var1, int var2) {
      for (int var3 = var1; var3 < var2; var3++) {
         if (!a6(var0[var3])) {
            return false;
         }
      }

      return true;
   }

   private static int n5(int var0, int var1) {
      return var0 > var1 ? var0 : var1;
   }

   private static int[] l6(int[] var0) {
      int[] var1 = new int[var0.length];
      int var2 = 0;

      for (int var3 = var0.length; var2 < var3; var2++) {
         int var4 = var0[var2];
         int var5;
         if (var4 >= 0) {
            var5 = n5.n5(var0[var2]);
         } else {
            var5 = 20;
         }

         var1[var2] = var5;
      }

      return var1;
   }

   private static boolean n5(com.aspose.slides.internal.r4.a6 var0, int[] var1) {
      boolean var2 = false;
      if (var1.length != var0.h0()) {
         throw new ArgumentException("characters array length must match input sequence length");
      }

      int var3 = 0;
      int var4 = var1.length;

      while (var3 < var4) {
         char var5 = var0.u3(var3);
         int var6;
         if (var5 < '\ud800') {
            var6 = var5;
         } else if (var5 < '\udc00') {
            if (var3 + 1 >= var4) {
               throw new ArgumentException("truncated surrogate pair");
            }

            char var7 = var0.u3(var3 + 1);
            if (var7 < '\udc00' || var7 > '\udfff') {
               throw new ArgumentException("isolated high surrogate");
            }

            var6 = l6(var5, var7);
         } else {
            if (var5 < '\ue000') {
               throw new ArgumentException("isolated low surrogate");
            }

            var6 = var5;
         }

         if (!var2 && u9(var6)) {
            var2 = true;
         }

         if ((var6 & 0xFF0000) == 0) {
            var1[var3++] = var6;
         } else {
            var1[var3++] = var6;
            var1[var3++] = -1;
         }
      }

      return var2;
   }

   private static int l6(int var0, int var1) {
      if (var0 < 55296 || var0 > 56319) {
         throw new ArgumentException("bad high surrogate");
      } else if (var1 >= 56320 && var1 <= 57343) {
         return ((var0 & 1023) << 10 | var1 & 1023) + 65536;
      } else {
         throw new ArgumentException("bad low surrogate");
      }
   }

   private static boolean u9(int var0) {
      switch (n5.n5(var0)) {
         case 4:
         case 5:
         case 6:
         case 7:
         case 8:
         case 12:
            return true;
         case 9:
         case 10:
         case 11:
         default:
            return false;
      }
   }
}
