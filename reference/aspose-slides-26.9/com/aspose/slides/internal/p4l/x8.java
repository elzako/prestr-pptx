package com.aspose.slides.internal.p4l;

import com.aspose.slides.exceptions.AmbiguousMatchException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.d5;
import com.aspose.slides.ms.System.o5;
import com.aspose.slides.ms.System.v8;
import com.aspose.slides.ms.System.x9;
import com.aspose.slides.ms.System.y8;

public class x8 extends l6 {
   @Override
   public t4 n5(int var1, t4[] var2, y8[] var3, m1[] var4) {
      return this.n5(var1, var2, var3, var4, false);
   }

   private static boolean n5(y8 var0, y8 var1) {
      if (var0 == var1) {
         return true;
      }

      if (var0 == null) {
         return true;
      }

      if (var1.f2() != var0.f2()) {
         return false;
      }

      if (var1.y2()) {
         return var1.l6(var0);
      }

      if (var1.d2()) {
         var1 = d5.getUnderlyingType(var1);
         if (var0 == var1) {
            return true;
         }
      }

      if (var1.a6() && var1.o0() == com.aspose.slides.internal.v6g.k5.n5(o5.class) && var1.u9()[0] == var0) {
         return true;
      }

      int var2 = y8.u3(var0);
      int var3 = y8.u3(var1);
      switch (var2) {
         case 3:
            switch (var3) {
               case 3:
                  return true;
            }
         default:
            if (var1 == com.aspose.slides.internal.v6g.k5.n5(Object.class) && var0.y1()) {
               return true;
            } else {
               if (var1.i1() && var0 == com.aspose.slides.internal.v6g.k5.n5(x9.class)) {
                  return true;
               }

               return var1.l6(var0);
            }
         case 4:
            switch (var3) {
               case 8:
               case 9:
               case 10:
               case 11:
               case 12:
               case 13:
               case 14:
                  return true;
               default:
                  return var1 == com.aspose.slides.internal.v6g.k5.n5(Object.class);
            }
         case 5:
            switch (var3) {
               case 7:
               case 9:
               case 11:
               case 13:
               case 14:
                  return true;
               case 8:
               case 10:
               case 12:
               default:
                  return var1 == com.aspose.slides.internal.v6g.k5.n5(Object.class) || var0.d2() && var1 == com.aspose.slides.internal.v6g.k5.n5(d5.class);
            }
         case 6:
            switch (var3) {
               case 4:
               case 7:
               case 8:
               case 9:
               case 10:
               case 11:
               case 12:
               case 13:
               case 14:
                  return true;
               case 5:
               case 6:
               default:
                  return var1 == com.aspose.slides.internal.v6g.k5.n5(Object.class) || var0.d2() && var1 == com.aspose.slides.internal.v6g.k5.n5(d5.class);
            }
         case 7:
            switch (var3) {
               case 9:
               case 11:
               case 13:
               case 14:
                  return true;
               case 10:
               case 12:
               default:
                  return var1 == com.aspose.slides.internal.v6g.k5.n5(Object.class) || var0.d2() && var1 == com.aspose.slides.internal.v6g.k5.n5(d5.class);
            }
         case 8:
            switch (var3) {
               case 9:
               case 10:
               case 11:
               case 12:
               case 13:
               case 14:
                  return true;
               default:
                  return var1 == com.aspose.slides.internal.v6g.k5.n5(Object.class) || var0.d2() && var1 == com.aspose.slides.internal.v6g.k5.n5(d5.class);
            }
         case 9:
            switch (var3) {
               case 9:
               case 11:
               case 13:
               case 14:
                  return true;
               case 10:
               case 12:
               default:
                  return var1 == com.aspose.slides.internal.v6g.k5.n5(Object.class) || var0.d2() && var1 == com.aspose.slides.internal.v6g.k5.n5(d5.class);
            }
         case 10:
            switch (var3) {
               case 11:
               case 12:
               case 13:
               case 14:
                  return true;
               default:
                  return var1 == com.aspose.slides.internal.v6g.k5.n5(Object.class) || var0.d2() && var1 == com.aspose.slides.internal.v6g.k5.n5(d5.class);
            }
         case 11:
         case 12:
            switch (var3) {
               case 13:
               case 14:
                  return true;
               default:
                  return var1 == com.aspose.slides.internal.v6g.k5.n5(Object.class) || var0.d2() && var1 == com.aspose.slides.internal.v6g.k5.n5(d5.class);
            }
         case 13:
            return var3 == 14 || var1 == com.aspose.slides.internal.v6g.k5.n5(Object.class);
      }
   }

   private t4 n5(int var1, t4[] var2, y8[] var3, m1[] var4, boolean var5) {
      if (var2 == null) {
         throw new ArgumentNullException("match");
      }

      t4 var6 = null;

      for (int var7 = 0; var7 < var2.length; var7++) {
         t4 var8 = var2[var7];
         z3[] var9 = var8.a6();
         if (var9.length == var3.length) {
            int var10 = 0;

            while (var10 < var3.length && var3[var10] == var9[var10].n5()) {
               var10++;
            }

            if (var10 == var3.length) {
               if (var6 != null) {
                  var6 = null;
                  break;
               }

               var6 = var8;
            }
         }
      }

      if (var6 != null) {
         return var6;
      }

      boolean var18 = false;
      Object var11 = null;

      for (int var14 = 0; var14 < var2.length; var14++) {
         t4 var16 = var2[var14];
         z3[] var12 = var16.a6();
         if (var12.length <= var3.length + 1 && var12.length != 0) {
            var18 = com.aspose.slides.ms.System.t2.n5(var12[var12.length - 1], com.aspose.slides.internal.v6g.k5.n5(v8.class));
            if (var18) {
               var11 = var12[var12.length - 1].n5().h0();
               int var20 = 0;

               while (
                  var20 < var3.length && (var20 >= var12.length - 1 || var3[var20] == var12[var20].n5()) && (var20 < var12.length - 1 || var3[var20] == var11)
               ) {
                  var20++;
               }

               if (var20 == var3.length) {
                  return var16;
               }
            }
         }
      }

      if ((var1 & 65536) != 0) {
         return null;
      }

      t4 var22 = null;

      for (int var15 = 0; var15 < var2.length; var15++) {
         t4 var17 = var2[var15];
         z3[] var13 = var17.a6();
         if (var13.length == var3.length && n5(var3, var13, var5)) {
            if (var22 != null) {
               var22 = this.n5(var22, var17, var3);
            } else {
               var22 = var17;
            }
         }
      }

      return var22;
   }

   private static boolean n5(y8[] var0, z3[] var1, boolean var2) {
      for (int var3 = 0; var3 < var0.length; var3++) {
         boolean var4 = n5(var0[var3], var1[var3].n5());
         if (!var4 && var2) {
            y8 var5 = var1[var3].n5();
            if (var5.f2()) {
               var4 = n5(var0[var3], var5.h0());
            }
         }

         if (!var4) {
            return false;
         }
      }

      return true;
   }

   private t4 n5(t4 var1, t4 var2, y8[] var3) {
      z3[] var4 = var1.a6();
      z3[] var5 = var2.a6();
      int var6 = 0;

      for (int var7 = 0; var7 < var4.length; var7++) {
         int var8 = this.l6(var4[var7].n5(), var5[var7].n5());
         if (var8 != 0 && var6 != 0 && var6 != var8) {
            throw new AmbiguousMatchException();
         }

         if (var8 != 0) {
            var6 = var8;
         }
      }

      if (var6 != 0) {
         return var6 > 0 ? var2 : var1;
      }

      y8 var11 = var1.t2();
      y8 var12 = var2.t2();
      if (var11 != var12) {
         if (var11.n5(var12)) {
            return var1;
         }

         if (var12.n5(var11)) {
            return var2;
         }
      }

      boolean var9 = (var1.n3() & 2) != 0;
      boolean var10 = (var2.n3() & 2) != 0;
      if (var9 && !var10) {
         return var2;
      } else if (var10 && !var9) {
         return var1;
      } else {
         throw new AmbiguousMatchException();
      }
   }

   private int l6(y8 var1, y8 var2) {
      if (var1 == var2) {
         return 0;
      } else if (var1.p8() && !var2.p8()) {
         return 1;
      } else if (!var1.p8() && var2.p8()) {
         return -1;
      } else if (var1.b3() && var2.b3()) {
         return this.l6(var1.h0(), var2.h0());
      } else if (var1.n5(var2)) {
         return -1;
      } else if (var2.n5(var1)) {
         return 1;
      } else if (var1.y2() && com.aspose.slides.ms.System.u3.n5(var2.t9(), var1, 0, var2.t9().length) >= 0) {
         return 1;
      } else {
         return var2.y2() && com.aspose.slides.ms.System.u3.n5(var1.t9(), var2, 0, var1.t9().length) >= 0 ? -1 : 0;
      }
   }

   public static t4 n5(t4[] var0, y8[] var1, m1[] var2) {
      if (var0 == null) {
         throw new ArgumentNullException("match");
      }

      t4[] var3 = new t4[var0.length];
      int var4 = 0;

      for (int var5 = 0; var5 < var0.length; var5++) {
         z3[] var6 = var0[var5].u3();
         if (var6.length != 0) {
            int var7 = 0;

            while (var7 < var1.length && var6[var7].n5().k5(var1[var7])) {
               var7++;
            }

            if (var7 >= var1.length) {
               var3[var4] = var0[var5];
               var4++;
            }
         }
      }

      switch (var4) {
         case 0:
            return null;
         case 1:
            return var3[0];
         default:
            return n5(var3, var4);
      }
   }

   static t4 n5(t4[] var0, int var1) {
      int var2 = 0;
      t4 var3 = null;

      for (int var4 = 0; var4 < var1; var4++) {
         int var5 = n5(var0[var4].t2());
         if (var5 == var2) {
            throw new AmbiguousMatchException("Ambiguous match found.");
         }

         if (var5 > var2) {
            var2 = var5;
            var3 = var0[var4];
         }
      }

      return var3;
   }

   static int n5(y8 var0) {
      int var1 = 0;
      y8 var2 = var0;

      do {
         var1++;
         var2 = var2.n5();
      } while (var2 != null);

      return var1;
   }

   static boolean n5(t4 var0, t4 var1) {
      z3[] var2 = var0.u3();
      z3[] var3 = var1.u3();
      if (var2.length != var3.length) {
         return false;
      }

      int var4 = var2.length;

      for (int var5 = 0; var5 < var4; var5++) {
         if (!var2[var5].n5().k5(var3[var5].n5())) {
            return false;
         }
      }

      return true;
   }
}
