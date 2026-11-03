package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.ms.System.IDisposable;

class u7a {
   static final String[] n5 = new String[]{"c", "w", "h", "ss", "ls", "hc", "vc", "l", "t", "r", "b"};
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9("custGeom", "prstGeom", "ahXY", "ahPolar");

   public static void n5(IGeometryShape var0, com.aspose.slides.internal.k4y.b9y var1) {
      if (var1.h0() != null) {
         a3g var2 = ((GeometryShape)var0).u9();
         u3k var3 = var2.s7();
         Dictionary var4 = null;
         switch (l6.n5(var1.h0().n5())) {
            case 0:
               com.aspose.slides.internal.k4y.u1s var17 = (com.aspose.slides.internal.k4y.u1s)var1.h0().l6();
               Dictionary[] var18 = new Dictionary[]{var4};
               var3.n5(n5(var17.u9(), null, var3, ((GeometryShape)var0).e2(), var18));
               var4 = var18[0];
               var3.n5(0);
               List var7 = n5(var17.h0(), var4);
               var3.n5(n5(var17.t2(), var4, var7));
               var3.n5(n5(var17.c8(), var4, var7));
               com.aspose.slides.internal.k4y.o8m var8 = var17.s7();
               if (var8 != null) {
                  var3.n5(new y1[1]);
                  var3.u9()[0] = new y1(var8.n5(), var8.l6(), var4, var7);
                  var3.l6(new y1[1]);
                  var3.h0()[0] = new y1(var8.k5(), var8.u3(), var4, var7);
               }

               com.aspose.slides.internal.k4y.j8m var9 = var17.x8();
               if (var9 != null) {
                  List var10 = new List();

                  for (com.aspose.slides.internal.k4y.c7f var14 : var9.l6()) {
                     var10.addItem(new q7g(var14, var4, var7));
                  }

                  var3.n5((q7g[])var10.toArray(new q7g[0]));
               }

               var3.n5((r8e[])var7.toArray(new r8e[0]));
               break;
            case 1:
               com.aspose.slides.internal.k4y.r7n var5 = (com.aspose.slides.internal.k4y.r7n)var1.h0().l6();
               var3.n5(var5.l6());
               var3.n5(c3u.n5(var5.l6()));
               if (var3.t2() == null) {
                  return;
               }

               Dictionary[] var6 = new Dictionary[]{var4};
               var3.n5(n5(var5.k5(), var3.t2().n5(), var3, ((GeometryShape)var0).e2(), var6));
               var4 = var6[0];
               break;
            default:
               throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Unknown element \"", var1.h0().n5(), "\""}));
         }
      }
   }

   static y2[] n5(com.aspose.slides.internal.k4y.u6p var0, y2[] var1, Dictionary<String, Integer>[] var2) {
      return n5(var0, var1, null, null, var2);
   }

   static y2[] n5(com.aspose.slides.internal.k4y.u6p var0, y2[] var1, u3k var2, j2x var3, Dictionary<String, Integer>[] var4) {
      var4[0] = new Dictionary();
      if (var0 == null) {
         return var1 != null ? var1 : new y2[0];
      }

      com.aspose.slides.internal.k4y.h3d[] var5 = var0.l6();
      int var6 = 0;
      y2[] var7;
      if (var1 == null) {
         var7 = new y2[var5.length];

         for (com.aspose.slides.internal.k4y.h3d var11 : var5) {
            var4[0].set_Item(var11.n5(), ++var6);
         }
      } else {
         for (var6 = 0; var6 < var1.length; var6++) {
            var4[0].set_Item(var1[var6].k5(), var6 + 1);
         }

         for (com.aspose.slides.internal.k4y.h3d var23 : var5) {
            if (!var4[0].containsKey(var23.n5())) {
               var4[0].set_Item(var23.n5(), ++var6);
            }
         }

         var7 = new y2[var6];

         for (int var17 = 0; var17 < var1.length; var17++) {
            var7[var17] = new y2(var1[var17]);
         }
      }

      Dictionary var18 = new Dictionary();
      byte[] var20 = null;
      double[] var22 = null;
      if (var3 != null) {
         List var24 = n5(var0, var18, true);
         if (var24.size() > 0) {
            byte[][] var12 = new byte[][]{var20};
            double[][] var13 = new double[][]{var22};
            var3.n5(100000.0F, 100000.0F, (r8e[])var24.toArray(new r8e[0]), var12, var13);
            var20 = var12[0];
            var22 = var13[0];
         }
      }

      for (com.aspose.slides.internal.k4y.h3d var14 : var5) {
         if (var14.l6() == null || com.aspose.slides.ms.System.d1.l6(var14.l6(), "val ")) {
            var7[var4[0].get_Item(var14.n5()) - 1] = new y2(var14.n5(), var14.l6() != null ? var14.l6() : "val 0", var1);
         } else if (!com.aspose.slides.ms.System.d1.n5(var14.n5()) && var18.containsKey(var14.n5()) && var22 != null && var20 != null) {
            var7[var4[0].get_Item(var14.n5()) - 1] = new y2(
               var14.n5(), com.aspose.slides.internal.v6g.k5.u9(var2.n5(var22, var20, -27273042329600L + ((Integer)var18.get_Item(var14.n5())).intValue()), 13)
            );
         }
      }

      return var7;
   }

   static List<r8e> n5(com.aspose.slides.internal.k4y.u6p var0, Dictionary<String, Integer> var1) {
      return n5(var0, var1, false);
   }

   static List<r8e> n5(com.aspose.slides.internal.k4y.u6p var0, Dictionary<String, Integer> var1, boolean var2) {
      int var3 = 1;

      for (String var7 : n5) {
         var1.set_Item(var7, -(var3++));
      }

      if (var0 == null) {
         return new List<>();
      }

      com.aspose.slides.internal.k4y.h3d[] var16 = var0.l6();
      List var17 = new List(var16.length);
      Dictionary var18 = new Dictionary();

      for (com.aspose.slides.internal.k4y.h3d var10 : var16) {
         if (!var18.containsKey(var10.n5())) {
            var18.addItem(var10.n5(), var17.size());
            var17.addItem(var10);
         } else {
            var17.set_Item((Integer)var18.get_Item(var10.n5()), var10);
         }
      }

      List var20 = new List(var16.length);
      var3 = 0;
      List$Enumerator var21 = var17.iterator();

      try {
         while (var21.hasNext()) {
            com.aspose.slides.internal.k4y.h3d var22 = (com.aspose.slides.internal.k4y.h3d)var21.next();
            if (!var2 || var22.l6() == null || !com.aspose.slides.ms.System.d1.l6(var22.l6(), "val ")) {
               String var23 = var22.n5();
               r8e var11 = new r8e(var23, var22.l6() != null ? var22.l6() : "val 0", var1, var20);
               var20.addItem(var11);
               var1.set_Item(var23, -(++var3 + 11));
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var21, IDisposable.class)) {
            var21.dispose();
         }
      }

      return var20;
   }

   static i4w[] n5(com.aspose.slides.internal.k4y.z6z var0, Dictionary<String, Integer> var1, List<r8e> var2) {
      if (var0 == null) {
         return null;
      }

      com.aspose.slides.internal.k4y.p5k[] var3 = var0.l6();
      i4w[] var4 = new i4w[var3.length];
      int var5 = 0;

      for (com.aspose.slides.internal.k4y.p5k var9 : var3) {
         com.aspose.slides.internal.k4y.u1 var10 = var9.l6();
         String var11 = var10.n5();
         String var12 = var10.l6();
         String var13 = var9.n5();
         var4[var5++] = new i4w(var11, var12, var13, var1, var2);
      }

      return var4;
   }

   static c4[] n5(com.aspose.slides.internal.k4y.x2 var0, Dictionary<String, Integer> var1, List<r8e> var2) {
      if (var0 == null) {
         return null;
      }

      c4[] var3 = new c4[var0.n5().size()];

      for (int var4 = 0; var4 < var0.n5().size(); var4++) {
         com.aspose.slides.internal.k4y.g7 var5 = var0.n5().get_Item(var4);
         switch (l6.n5(var5.n5())) {
            case 2:
               com.aspose.slides.internal.k4y.q4o var6 = (com.aspose.slides.internal.k4y.q4o)var5.l6();
               String var17 = var6.h0().n5();
               String var18 = var6.h0().l6();
               boolean var19 = false;
               String var20 = var6.n5();
               String var21 = var6.u3();
               String var22 = var6.l6();
               String var23 = var6.a6();
               String var24 = var6.k5();
               String var25 = var6.u9();
               var3[var4] = new c4(var19, var20, var22, var24, var21, var23, var25, var17, var18, var1, var2);
               break;
            case 3:
               com.aspose.slides.internal.k4y.n1g var16 = (com.aspose.slides.internal.k4y.n1g)var5.l6();
               String var7 = var16.h0().n5();
               String var8 = var16.h0().l6();
               boolean var9 = true;
               String var10 = var16.n5();
               String var11 = var16.u3();
               String var12 = var16.l6();
               String var13 = var16.a6();
               String var14 = var16.k5();
               String var15 = var16.u9();
               var3[var4] = new c4(var9, var10, var12, var14, var11, var13, var15, var7, var8, var1, var2);
               break;
            default:
               throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Unknown element \"", var5.n5(), "\""}));
         }
      }

      return var3;
   }

   public static void l6(IGeometryShape var0, com.aspose.slides.internal.k4y.b9y var1) {
      if (var0.getShapeType() != -1) {
         a3g var2 = ((GeometryShape)var0).u9();
         u3k var3 = var2.s7();
         r8e[] var4 = var3.u3();
         y2[] var5 = var3.n5();
         c4[] var6 = var3.k5();
         i4w[] var7 = var3.l6();
         switch (var0.getShapeType()) {
            case 0:
               com.aspose.slides.internal.k4y.u1s var8 = (com.aspose.slides.internal.k4y.u1s)var1.k5("custGeom").l6();
               n5(var5, new u7a$1(var8));
               n5(var4, var5, new u7a$2(var8));
               n5(var6, var4, var5, new u7a$3(var8));
               n5(var7, var4, var5, new u7a$4(var8));
               y1[] var9 = var3.u9();
               if (var9 != null) {
                  com.aspose.slides.internal.k4y.o8m var14 = var8.a6();
                  var14.n5(n5(var9[0].n5(), var4, var5));
                  var14.l6(n5(var9[0].l6(), var4, var5));
                  var14.k5(n5(var3.h0()[0].n5(), var4, var5));
                  var14.u3(n5(var3.h0()[0].l6(), var4, var5));
               } else {
                  com.aspose.slides.internal.k4y.o8m var15 = var8.a6();
                  var15.n5("l");
                  var15.l6("t");
                  var15.k5("r");
                  var15.u3("b");
               }

               if (var3.a6() != null) {
                  for (q7g var13 : var3.a6()) {
                     e2c.n5(var13, var8.x8(), var4, var5);
                  }
               }
               break;
            default:
               com.aspose.slides.internal.k4y.r7n var10 = (com.aspose.slides.internal.k4y.r7n)var1.k5("prstGeom").l6();
               n5(var5, var10.n5());
               var10.n5(var3.c8());
         }
      }
   }

   static void n5(y2[] var0, com.aspose.slides.internal.f3.k5<com.aspose.slides.internal.k4y.u6p> var1) {
      if (var0 != null && var0.length != 0) {
         n5(var0, (com.aspose.slides.internal.k4y.u6p)var1.invoke());
      }
   }

   static void n5(y2[] var0, com.aspose.slides.internal.k4y.u6p var1) {
      if (var0 != null && var0.length != 0) {
         boolean var2 = true;

         for (y2 var6 : var0) {
            if (var6 != null && !var6.a6()) {
               var2 = false;
               break;
            }
         }

         if (!var2) {
            for (y2 var11 : var0) {
               if (var11 != null) {
                  com.aspose.slides.internal.k4y.h3d var7 = var1.n5();
                  var7.n5(var11.k5());
                  var7.l6(com.aspose.slides.ms.System.d1.n5(new String[]{"val ", com.aspose.slides.ms.System.Xml.f4.n5(var11.n5())}));
               }
            }
         }
      }
   }

   static void n5(r8e[] var0, y2[] var1, com.aspose.slides.internal.f3.k5<com.aspose.slides.internal.k4y.u6p> var2) {
      int var3 = 0;
      if (var0 != null) {
         for (int var4 = 0; var4 < var0.length; var4++) {
            if (!var0[var4].l6()) {
               var3++;
            }
         }
      }

      if (var3 != 0) {
         com.aspose.slides.internal.k4y.u6p var8 = (com.aspose.slides.internal.k4y.u6p)var2.invoke();

         for (int var5 = 0; var5 < var0.length; var5++) {
            r8e var6 = var0[var5];
            if (!var6.l6()) {
               com.aspose.slides.internal.k4y.h3d var7 = var8.n5();
               var7.n5(var6.n5());
               var7.l6(s7q.n5(var6, var0, var1));
            }
         }
      }
   }

   static void n5(c4[] var0, r8e[] var1, y2[] var2, com.aspose.slides.internal.f3.k5<com.aspose.slides.internal.k4y.x2> var3) {
      if (var0 != null && var0.length != 0) {
         com.aspose.slides.internal.k4y.x2 var4 = (com.aspose.slides.internal.k4y.x2)var3.invoke();

         for (c4 var8 : var0) {
            if (var8.n5) {
               com.aspose.slides.internal.k4y.n1g var9 = (com.aspose.slides.internal.k4y.n1g)var4.n5("ahPolar").l6();
               var9.n5(n5(var8.l6, var1, var2, true));
               var9.u3(n5(var8.a6, var1, var2, true));
               var9.l6(n5(var8.k5, var1, var2, true));
               var9.a6(n5(var8.u9, var1, var2, true));
               var9.k5(n5(var8.u3, var1, var2, true));
               var9.u9(n5(var8.h0, var1, var2, true));
               var9.h0().n5(n5(var8.c8.n5(), var1, var2, true));
               var9.h0().l6(n5(var8.c8.l6(), var1, var2, true));
            } else {
               com.aspose.slides.internal.k4y.q4o var10 = (com.aspose.slides.internal.k4y.q4o)var4.n5("ahXY").l6();
               var10.n5(n5(var8.l6, var1, var2, true));
               var10.u3(n5(var8.a6, var1, var2, true));
               var10.l6(n5(var8.k5, var1, var2, true));
               var10.a6(n5(var8.u9, var1, var2, true));
               var10.k5(n5(var8.u3, var1, var2, true));
               var10.u9(n5(var8.h0, var1, var2, true));
               var10.h0().n5(n5(var8.c8.n5(), var1, var2, true));
               var10.h0().l6(n5(var8.c8.l6(), var1, var2, true));
            }
         }
      }
   }

   static void n5(i4w[] var0, r8e[] var1, y2[] var2, com.aspose.slides.internal.f3.k5<com.aspose.slides.internal.k4y.z6z> var3) {
      if (var0 != null && var0.length != 0) {
         com.aspose.slides.internal.k4y.z6z var4 = (com.aspose.slides.internal.k4y.z6z)var3.invoke();

         for (i4w var8 : var0) {
            com.aspose.slides.internal.k4y.p5k var9 = var4.n5();
            var9.l6().n5(n5(var8.n5().n5(), var1, var2));
            var9.l6().l6(n5(var8.n5().l6(), var1, var2));
            var9.n5(n5(var8.l6(), var1, var2));
         }
      }
   }

   static String n5(long var0, r8e[] var2, y2[] var3) {
      return n5(var0, var2, var3, false);
   }

   static String n5(long var0, r8e[] var2, y2[] var3, boolean var4) {
      if (var0 < -27273042329600L) {
         return var0 <= -27273042329612L ? var2[(int)(-27273042329612L - var0)].n5() : n5[(int)(-27273042329601L - var0)];
      } else if (var0 <= 27273042316900L) {
         return com.aspose.slides.ms.System.Xml.f4.n5(var0);
      } else if (var0 == Long.MAX_VALUE) {
         return var4 ? null : com.aspose.slides.ms.System.d1.n5;
      } else {
         return var3[(int)(var0 - 27273042316900L - 1L)].k5();
      }
   }
}
