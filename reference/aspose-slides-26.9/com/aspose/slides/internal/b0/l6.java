package com.aspose.slides.internal.b0;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.FileNotFoundException;
import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.internal.e1x.a0;
import com.aspose.slides.internal.e1x.f2;
import com.aspose.slides.internal.e1x.i1;
import com.aspose.slides.internal.e1x.x8;
import com.aspose.slides.internal.e1x.z1;
import com.aspose.slides.internal.l7h.j5;
import com.aspose.slides.internal.o9b.n3;
import com.aspose.slides.internal.o9b.v4;
import com.aspose.slides.internal.o9b.y4;
import com.aspose.slides.internal.t5n.l6$n5;
import com.aspose.slides.internal.z0k.u9;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.q1;
import com.aspose.slides.ms.System.x9;

public class l6 {
   private static final com.aspose.slides.internal.v7u.k5 n5 = new com.aspose.slides.internal.v7u.k5();
   private static final Dictionary<String, com.aspose.slides.internal.v7u.k5> l6 = new Dictionary<>();
   private static final List<String> k5 = new List<>();

   public static n3 n5(String var0, float var1, int var2) {
      return n5(var0, var1, var2, 0);
   }

   public static n3 n5(String var0, float var1, int var2, int var3) {
      i1 var4 = x8.u3().n5(var0, var2);
      if (var4 == null) {
         throw new NullReferenceException();
      }

      y4 var5;
      try {
         var5 = n5(var4);
      } catch (ArgumentException var7) {
         var5 = null;
      }

      if (var5 != null) {
         return var5.c8(var2) ? new n3(var5, var1, var2, var3) : new n3(var5.a6(), var1, var2, var3);
      } else {
         return new n3(v4.l6().l6(), var1 / 96.0F * 72.0F);
      }
   }

   public static n3 l6(String var0, float var1, int var2, int var3) {
      i1 var4 = x8.u3().n5(var0, var2);
      if (var4 == null) {
         var4 = f2.n5().n5(var0, var2, null);
      }

      y4 var5;
      try {
         var5 = n5(var4);
      } catch (ArgumentException var7) {
         var5 = null;
      }

      if (var5 != null) {
         return var5.c8(var2) ? new n3(var5, var1, var2, var3) : new n3(var5.a6(), var1, var2, var3);
      } else {
         return new n3(v4.l6().l6(), var1 / 96.0F * 72.0F);
      }
   }

   private static y4 n5(i1 var0) {
      String var1 = d1.u9(var0.u3());
      com.aspose.slides.internal.v7u.k5 var2 = null;
      com.aspose.slides.internal.v7u.k5[] var3 = new com.aspose.slides.internal.v7u.k5[]{var2};
      boolean var4 = !l6.tryGetValue(var0.u9(), var3);
      var2 = var3[0];
      if (var4) {
         var2 = n5;
      }

      if (!k5.containsItem(var1) && var0.y1().k5()) {
         z1 var5 = var0.y1();
         com.aspose.slides.internal.e1x.y4 var6 = com.aspose.slides.internal.v6g.k5.n5(var5, com.aspose.slides.internal.e1x.y4.class);
         if (var6 == null) {
            a0 var29 = com.aspose.slides.internal.v6g.k5.n5(var5, a0.class);
            if (var29 != null) {
               byte[] var8 = var29.n5();
               x9 var33 = com.aspose.slides.internal.e3m.n5.n5(var8.length);
               com.aspose.slides.internal.e3m.n5.n5(var8, 0, var33, var8.length);
               var2.n5(var33, var8.length);
               com.aspose.slides.internal.e3m.n5.n5(var33);
            }
         } else {
            var3[0] = var2;
            boolean var7 = !l6.tryGetValue(var6.n5(), var3);
            var2 = var3[0];
            if (var7) {
               var2 = new com.aspose.slides.internal.v7u.k5();

               try {
                  var2.n5(var6.n5());
                  l6.addItem(var6.n5(), var2);
               } catch (FileNotFoundException var25) {
                  if (u9.k5(var6.n5())) {
                     byte[] var9 = null;
                     com.aspose.slides.internal.z0k.n3 var10 = u9.u3(var6.n5());

                     try {
                        var9 = new byte[(int)var10.getLength()];
                        var10.read(var9, 0, var9.length);
                        var10.close();
                     } finally {
                        if (var10 != null) {
                           var10.dispose();
                        }
                     }

                     if ("OTTO".equals(j5.z3().l6(var9, 0, 4))) {
                        byte[] var11 = com.aspose.slides.internal.c8e.n5.n5(var9);

                        try {
                           com.aspose.slides.internal.l6j.n5 var12 = com.aspose.slides.internal.l6j.n5.n5(var11);
                           var2.n5(var12.a6(), var11.length);
                           var12.u9();
                           l6.addItem(var6.n5(), var2);
                        } catch (FileNotFoundException var22) {
                        } finally {
                           ;
                        }
                     }
                  }
               }
            }
         }

         k5.addItem(var1);
      }

      if (var2.n5().length > 0) {
         for (y4 var31 : var2.n5()) {
            if (d1.a6(var31.a6(), var0.n5())) {
               return var31;
            }
         }
      }

      return new y4(var0.n5(), var2);
   }

   public static i1 n5(l6$n5 var0) {
      return com.aspose.slides.internal.b0.k5.n5(var0);
   }

   public static n3 l6(l6$n5 var0) {
      int var1 = k5(var0);
      i1 var2 = com.aspose.slides.internal.b0.k5.n5(var0);
      if (var2 == null) {
         throw new NullReferenceException();
      }

      y4 var3;
      try {
         var3 = n5(var2);
      } catch (ArgumentException var8) {
         var3 = null;
      }

      if (var3 == null) {
         var3 = y4.k5();
      }

      float var4 = 0.0F;
      if (var0.n5 > 0) {
         int var5 = var0.n5;
         int var6 = var3.u9(var1);
         int var7 = var3.h0(var1);
         if (var2 != null) {
            var6 = var2.t2();
            var7 = var2.y4();
         }

         var4 = (float)(var5 * var6) / var7;
      } else if (var0.n5 < 0) {
         var4 = q1.n5(var0.n5);
      } else {
         var4 = 16.0F;
      }

      return new n3(var3.a6(), var4, var1, 0, var0.t2);
   }

   public static int k5(l6$n5 var0) {
      byte var1 = 0;
      if ((var0.u9 & 255) != 0) {
         var1 |= 2;
      }

      if ((var0.c8 & 255) != 0) {
         var1 |= 8;
      }

      if ((var0.h0 & 255) != 0) {
         var1 |= 4;
      }

      if (var0.a6 >= 600) {
         var1 |= 1;
      }

      return var1;
   }

   public static void n5() {
      l6.clear();
      k5.clear();
   }
}
