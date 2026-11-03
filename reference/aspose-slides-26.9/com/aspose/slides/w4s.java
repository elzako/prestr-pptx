package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.ms.System.IDisposable;

class w4s {
   public static void n5(k6j var0, com.aspose.slides.internal.k4y.v5e var1, t5w var2) {
      if (var1 != null) {
         com.aspose.slides.internal.c8m.a2 var3 = var2.k7();
         com.aspose.slides.internal.k4y.e1t[] var4 = var1.l6();
         if (var4 != null && var4.length > 0) {
            for (com.aspose.slides.internal.k4y.e1t var8 : var4) {
               var2.z1().throwIfInterruptionRequested();
               String var9 = var8.a6().n5();
               if (var0.n5().n5(var9) == null) {
                  if (var8.u9() != null) {
                     com.aspose.slides.internal.c8m.r7 var10 = var3.n5(var8.u9().n5());
                     if (var10.l6() != null) {
                        n5(var0.n5(), var10.l6(), var9, var8.a6().u3(), b8s.n5(var8.a6().l6()), var8.a6().k5(), 0, var2);
                     }
                  }

                  if (var8.h0() != null) {
                     com.aspose.slides.internal.c8m.r7 var11 = var3.n5(var8.h0().n5());
                     if (var11.l6() != null) {
                        n5(var0.n5(), var11.l6(), var9, var8.a6().u3(), b8s.n5(var8.a6().l6()), var8.a6().k5(), 1, var2);
                     }
                  }

                  if (var8.c8() != null) {
                     com.aspose.slides.internal.c8m.r7 var12 = var3.n5(var8.c8().n5());
                     if (var12.l6() != null) {
                        n5(var0.n5(), var12.l6(), var9, var8.a6().u3(), b8s.n5(var8.a6().l6()), var8.a6().k5(), 2, var2);
                     }
                  }

                  if (var8.t2() != null) {
                     com.aspose.slides.internal.c8m.r7 var13 = var3.n5(var8.t2().n5());
                     if (var13.l6() != null) {
                        n5(var0.n5(), var13.l6(), var9, var8.a6().u3(), b8s.n5(var8.a6().l6()), var8.a6().k5(), 3, var2);
                     }
                  }
               }
            }

            t1g.n5(var0.n5());
         }
      }
   }

   private static void n5(e6s var0, com.aspose.slides.internal.c8m.j8 var1, String var2, byte var3, byte[] var4, int var5, int var6, t5w var7) {
      var1.n5(true);

      try {
         var0.n5(var2, var3, var4, var5, var6, var1.a6(), false, var7.t9().a6());
      } catch (RuntimeException var9) {
         var7.n5(
            com.aspose.slides.ms.System.d1.n5(
               "Embedded font \"",
               var2,
               " ",
               com.aspose.slides.ms.System.s3.n5(com.aspose.slides.internal.o9b.e2.class, var6),
               "\" cannot be installed: General failure"
            ),
            1
         );
      }
   }

   public static void n5(e6s var0, com.aspose.slides.internal.f3.k5<com.aspose.slides.internal.k4y.v5e> var1, g6c var2) {
      com.aspose.slides.internal.c8m.a2 var3 = var2.u6();
      String var4 = "/ppt/fonts/font{0}.fntdata";
      int[] var5 = new int[]{1};
      com.aspose.slides.internal.k4y.v5e var6 = (com.aspose.slides.internal.k4y.v5e)var1.invoke();
      n5(var0, new w4s$1(var2, var5), var6, var3, var2);
   }

   private static void n5(e6s var0, w4s$n5 var1, com.aspose.slides.internal.k4y.v5e var2, com.aspose.slides.internal.c8m.a2 var3, g6c var4) {
      IGenericEnumerator var5 = var0.iterator();

      try {
         while (var5.hasNext()) {
            KeyValuePair var6 = (KeyValuePair)var5.next();
            com.aspose.slides.internal.k4y.e1t var7 = var2.n5();
            var7.a6().l6(((c4y)var6.getValue()).l6());
            var7.a6().l6(b8s.n5(((c4y)var6.getValue()).a6()));
            var7.a6().n5((byte)((c4y)var6.getValue()).u9());
            var7.a6().n5(((c4y)var6.getValue()).getFontName());
            IGenericDictionary var9;
            if (((c4y)var6.getValue()).t2()) {
               IGenericDictionary var8 = ((FontsManager)var4.t2().getFontsManager()).n5((c4y)var6.getValue(), var4.n5());
               var9 = new Dictionary();
               IGenericEnumerator var10 = var8.iterator();

               try {
                  while (var10.hasNext()) {
                     KeyValuePair var11 = (KeyValuePair)var10.next();

                     try {
                        FontData var12 = null;
                        FontData[] var13 = new FontData[]{var12};
                        var9.addItem(var11.getKey(), FontsManager.n5((byte[])var11.getValue(), var13));
                        var12 = var13[0];
                     } catch (RuntimeException var39) {
                        var9.addItem(var11.getKey(), (byte[])var11.getValue());
                     }
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var10, IDisposable.class)) {
                     var10.dispose();
                  }
               }
            } else {
               IGenericDictionary var44 = ((c4y)var6.getValue()).c8();
               if (var44.size() == 0) {
                  var9 = new Dictionary(((c4y)var6.getValue()).h0().size());
                  IGenericDictionary var46 = ((c4y)var6.getValue()).h0();
                  IGenericEnumerator var48 = var46.iterator();

                  try {
                     while (var48.hasNext()) {
                        KeyValuePair var51 = (KeyValuePair)var48.next();
                        FontData var52 = null;
                        FontData[] var14 = new FontData[]{var52};
                        byte[] var15 = FontsManager.n5((byte[])var51.getValue(), var14);
                        var52 = var14[0];
                        var9.addItem(var51.getKey(), var15);
                     }
                  } finally {
                     if (com.aspose.slides.internal.v6g.k5.n5(var48, IDisposable.class)) {
                        var48.dispose();
                     }
                  }
               } else {
                  var9 = var44;
               }
            }

            IGenericEnumerator var45 = var9.iterator();

            try {
               while (var45.hasNext()) {
                  KeyValuePair var47 = (KeyValuePair)var45.next();
                  com.aspose.slides.internal.c8m.j8 var49 = var1.n5(var4, (byte[])var47.getValue());
                  if ((Integer)var47.getKey() == 0) {
                     var7.n5().n5(var3.l6(var49).a6());
                  } else if (((Integer)var47.getKey() & 1) == 1 && ((Integer)var47.getKey() & 2) == 2) {
                     var7.u3().n5(var3.l6(var49).a6());
                  } else if (((Integer)var47.getKey() & 1) == 1) {
                     var7.l6().n5(var3.l6(var49).a6());
                  } else if (((Integer)var47.getKey() & 2) == 2) {
                     var7.k5().n5(var3.l6(var49).a6());
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var45, IDisposable.class)) {
                  var45.dispose();
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
            var5.dispose();
         }
      }
   }
}
