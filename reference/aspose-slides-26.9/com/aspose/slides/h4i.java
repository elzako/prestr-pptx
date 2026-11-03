package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.k4y.d1n;
import com.aspose.slides.internal.k4y.e9w;
import com.aspose.slides.internal.k4y.f5z;
import com.aspose.slides.internal.k4y.g7n;
import com.aspose.slides.internal.k4y.k5x;
import com.aspose.slides.internal.k4y.l2j;
import com.aspose.slides.internal.k4y.l7p;
import com.aspose.slides.internal.k4y.r1k;
import com.aspose.slides.internal.k4y.t3k;
import com.aspose.slides.internal.k4y.t9x;
import com.aspose.slides.internal.k4y.v4a;

class h4i {
   public static ILegacyDiagram n5(ShapeCollection var0, com.aspose.slides.internal.k4y.n3 var1, i1x var2) {
      LegacyDiagram var3 = var0.x8();
      l5u.n5(var3, var1, var2);
      com.aspose.slides.internal.k4y.s8x var4 = var1.k5().n5().k7();
      if (var4 != null) {
         var2.n5(var4.n5(), var3);
      }

      return var3;
   }

   public static void n5(LegacyDiagram var0, com.aspose.slides.internal.k4y.n3 var1, n4i var2) {
      if (var0.n5().n5() == null && var0.n5().k5() != null) {
         var0.n5().n5(n5(var0, var2));
      }

      l5u.n5(var0, var1, var2.n5());
      com.aspose.slides.internal.k4y.s8x var3 = var1.k5().n5().t2();
      var3.n5(com.aspose.slides.ms.System.d1.n5("_x0000_s{0:D4}", new Object[]{var2.n5(var0)}));
   }

   private static f5z n5(LegacyDiagram var0, n4i var1) {
      f5z var2 = new f5z();
      GroupShape var3 = var0.k5();
      e4c var4 = var3.k5().u9();
      e4c var5 = var3.u9().u9();
      var2.l6(com.aspose.slides.ms.System.d1.n5(new String[]{"_s", com.aspose.slides.ms.System.l4.l6(var3.n5().z3())}));
      var2.u3(com.aspose.slides.ms.System.d1.n5("_x0000_s{0:D4}", new Object[]{var3.n5().z3()}));
      var2.m1(
         com.aspose.slides.ms.System.d1.n5(new String[]{
            com.aspose.slides.ms.System.a3.l6(com.aspose.slides.internal.v6g.k5.u3(var4.n5 * 12700.0, 14)),
            ",",
            com.aspose.slides.ms.System.a3.l6(com.aspose.slides.internal.v6g.k5.u3(var4.l6 * 12700.0, 14))
         })
      );
      var2.z3(
         com.aspose.slides.ms.System.d1.n5(new String[]{
            com.aspose.slides.ms.System.a3.l6(com.aspose.slides.internal.v6g.k5.u3(var5.n5 * 12700.0, 14)),
            ",",
            com.aspose.slides.ms.System.a3.l6(com.aspose.slides.internal.v6g.k5.u3(var5.l6 * 12700.0, 14))
         })
      );
      n9s.n5(var2, var0.getFrame());
      com.aspose.slides.internal.k4y.g7 var6 = var2.u9("diagram");
      com.aspose.slides.internal.k4y.a1h var7 = (com.aspose.slides.internal.k4y.a1h)var6.l6();
      var7.n5(2);
      com.aspose.slides.internal.k0r.a9 var8 = var0.k5().k7().y4();
      if (var8 != null && var8.l6() != null) {
         com.aspose.slides.internal.k0r.z5 var9 = com.aspose.slides.internal.v6g.k5.n5(var8.l6().n5(1280), com.aspose.slides.internal.k0r.z5.class);
         if (var9 != null) {
            switch ((int)var9.j5()) {
               case 0:
                  var2.u3(1);
                  break;
               case 1:
                  var2.u3(2);
                  break;
               case 2:
                  var2.u3(3);
                  break;
               case 3:
                  var2.u3(4);
                  break;
               case 4:
                  var2.u3(5);
                  break;
               case 5:
                  var2.u3(6);
                  break;
               case 6:
                  var2.u3(7);
                  break;
               default:
                  var2.u3(0);
            }
         }

         var9 = com.aspose.slides.internal.v6g.k5.n5(var8.l6().n5(1281), com.aspose.slides.internal.k0r.z5.class);
         if (var9 != null) {
            var7.l6((int)var9.j5());
         }

         var9 = com.aspose.slides.internal.v6g.k5.n5(var8.l6().n5(1285), com.aspose.slides.internal.k0r.z5.class);
         if (var9 != null) {
            var7.k5((int)var9.j5());
         }

         var9 = com.aspose.slides.internal.v6g.k5.n5(var8.l6().n5(1286), com.aspose.slides.internal.k0r.z5.class);
         if (var9 != null) {
            var7.u3((int)var9.j5());
         }

         var9 = com.aspose.slides.internal.v6g.k5.n5(var8.l6().n5(1287), com.aspose.slides.internal.k0r.z5.class);
         if (var9 != null) {
            var7.a6((int)var9.j5());
         }

         var7.n5(var0.n5().k5());
         com.aspose.slides.internal.k0r.b2 var10 = com.aspose.slides.internal.v6g.k5.n5(var8.l6().n5(1288), com.aspose.slides.internal.k0r.b2.class);
         if (var10 != null && (var10.u3() & 65535) == 4) {
            String var11 = com.aspose.slides.ms.System.d1.n5;

            for (int var12 = 0; var12 < (var10.u3() & 65535); var12++) {
               if (!com.aspose.slides.ms.System.d1.a6(var11, com.aspose.slides.ms.System.d1.n5)) {
                  var11 = com.aspose.slides.ms.System.d1.n5(var11, ",");
               }

               var11 = com.aspose.slides.ms.System.d1.l6(var11, com.aspose.slides.internal.n8e.y2.k5(var10.k5(var12), 0));
            }

            var7.n5(var11);
         } else {
            var7.n5("0,0,0,0");
         }

         boolean var32 = false;
         boolean var33 = false;
         boolean var13 = false;
         boolean var14 = false;
         boolean var15 = false;
         boolean var16 = false;
         List var17 = var1.c8();
         n5(var2, var17);
         Shape var18 = (Shape)var3.getShapes().get_Item(0);
         v4a var19 = (v4a)var2.u9("shape").l6();
         var19.l6(com.aspose.slides.ms.System.d1.n5(new String[]{"_s", com.aspose.slides.ms.System.l4.l6(var18.h0().z3())}));
         var19.u3(com.aspose.slides.ms.System.d1.n5("_x0000_s{0:D4}", new Object[]{var18.h0().z3()}));
         var19.x8(com.aspose.slides.ms.System.d1.n5(new String[]{"#", "_x0000_t75"}));
         n5(var19, var18);
         n9v.n5(var19, var18.getFillFormat(), var18.getLineFormat(), var0.n5(), var1);
         int var20 = 1;

         for (int var21 = 1; var21 < var3.getShapes().size(); var21++) {
            Shape var22 = (Shape)var3.getShapes().get_Item(var21);
            com.aspose.slides.internal.k0r.r3 var23 = var22.k7().n3();
            if (com.aspose.slides.internal.v6g.k5.l6(var22, Connector.class)) {
               Connector var24 = (Connector)var22;
               switch (var24.getShapeType()) {
                  case 1:
                     if (var2.s7() == 3) {
                        g7n var27 = (g7n)var2.u9("line").l6();
                        n5(var27, var24, var23, var1);
                     } else {
                        if (!var13) {
                           l6(var2, var17);
                           var13 = true;
                        }

                        v4a var47 = (v4a)var2.u9("shape").l6();
                        var47.x8(com.aspose.slides.ms.System.d1.n5(new String[]{"#", "_x0000_t32"}));
                        l6(var47, var24, var23, var1);
                     }
                     break;
                  case 97:
                     if (!var32) {
                        k5(var2, var17);
                        var32 = true;
                     }

                     v4a var25 = (v4a)var2.u9("shape").l6();
                     var25.x8(com.aspose.slides.ms.System.d1.n5(new String[]{"#", "_x0000_t33"}));
                     l6(var25, var24, var23, var1);
                     break;
                  case 98:
                     if (!var33) {
                        u3(var2, var17);
                        var33 = true;
                     }

                     v4a var26 = (v4a)var2.u9("shape").l6();
                     var26.x8(com.aspose.slides.ms.System.d1.n5(new String[]{"#", "_x0000_t34"}));
                     l6(var26, var24, var23, var1);
               }
            } else if (com.aspose.slides.internal.v6g.k5.l6(var22, AutoShape.class)) {
               AutoShape var34 = (AutoShape)var22;
               switch (var34.getShapeType()) {
                  case 0:
                     if (var22.k7().x8() != null && var22.k7().x8().t2() == 8) {
                        if (!var14) {
                           a6(var2, var17);
                           var14 = true;
                        }

                        v4a var40 = (v4a)var2.u9("shape").l6();
                        var40.x8(com.aspose.slides.ms.System.d1.n5(new String[]{"#", "_x0000_t8"}));
                        int[] var46 = new int[]{var20};
                        n5(var40, var34, var0, var1, var46);
                        var20 = var46[0];
                     }
                     break;
                  case 5:
                     l2j var39 = (l2j)var2.u9("rect").l6();
                     int[] var45 = new int[]{var20};
                     n5(var39, var34, var0, var1, var45);
                     var20 = var45[0];
                     break;
                  case 26:
                     k5x var38 = (k5x)var2.u9("roundrect").l6();
                     int[] var44 = new int[]{var20};
                     n5(var38, var34, var0, var1, var44);
                     var20 = var44[0];
                     break;
                  case 35:
                     e9w var37 = (e9w)var2.u9("oval").l6();
                     int[] var43 = new int[]{var20};
                     n5(var37, var34, var0, var1, var43);
                     var20 = var43[0];
                     break;
                  case 42:
                     if (!var15) {
                        u9(var2, var17);
                        var15 = true;
                     }

                     v4a var36 = (v4a)var2.u9("shape").l6();
                     var36.x8(com.aspose.slides.ms.System.d1.n5(new String[]{"#", "_x0000_t23"}));
                     int[] var42 = new int[]{var20};
                     n5(var36, var34, var0, var1, var42);
                     var20 = var42[0];
                     break;
                  case 106:
                     if (!var16) {
                        h0(var2, var17);
                        var16 = true;
                     }

                     v4a var35 = (v4a)var2.u9("shape").l6();
                     var35.x8(com.aspose.slides.ms.System.d1.n5(new String[]{"#", "_x0000_t42"}));
                     int[] var41 = new int[]{var20};
                     n5(var35, var34, var0, var1, var41);
                     var20 = var41[0];
               }
            }
         }
      }

      return var2;
   }

   private static void n5(com.aspose.slides.internal.k4y.m1 var0, Shape var1, LegacyDiagram var2, n4i var3, int[] var4) {
      var0.l6(com.aspose.slides.ms.System.d1.n5(new String[]{"_s", com.aspose.slides.ms.System.l4.l6(var1.h0().z3())}));
      var0.u3(com.aspose.slides.ms.System.d1.n5("_x0000_s{0:D4}", new Object[]{var1.h0().z3()}));
      com.aspose.slides.internal.k0r.r3 var5 = var1.k7().n3();
      if (var5 != null) {
         String var6 = com.aspose.slides.ms.System.d1.n5;
         com.aspose.slides.internal.k0r.z5 var7 = com.aspose.slides.internal.v6g.k5.n5(var5.l6().n5(327), com.aspose.slides.internal.k0r.z5.class);
         if (var7 != null) {
            var6 = com.aspose.slides.ms.System.d1.n5(var6, com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.a3.l6((int)var7.j5()), ","}));
         }

         var7 = com.aspose.slides.internal.v6g.k5.n5(var5.l6().n5(328), com.aspose.slides.internal.k0r.z5.class);
         if (var7 != null) {
            var6 = com.aspose.slides.ms.System.d1.n5(var6, com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.a3.l6((int)var7.j5()), ","}));
         }

         var7 = com.aspose.slides.internal.v6g.k5.n5(var5.l6().n5(329), com.aspose.slides.internal.k0r.z5.class);
         if (var7 != null) {
            var6 = com.aspose.slides.ms.System.d1.n5(var6, com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.a3.l6((int)var7.j5()), ","}));
         }

         var7 = com.aspose.slides.internal.v6g.k5.n5(var5.l6().n5(330), com.aspose.slides.internal.k0r.z5.class);
         if (var7 != null) {
            var6 = com.aspose.slides.ms.System.d1.n5(var6, com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.a3.l6((int)var7.j5()), ","}));
         }

         var7 = com.aspose.slides.internal.v6g.k5.n5(var5.l6().n5(331), com.aspose.slides.internal.k0r.z5.class);
         if (var7 != null) {
            var6 = com.aspose.slides.ms.System.d1.n5(var6, com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.a3.l6((int)var7.j5()), ","}));
         }

         var7 = com.aspose.slides.internal.v6g.k5.n5(var5.l6().n5(332), com.aspose.slides.internal.k0r.z5.class);
         if (var7 != null) {
            var6 = com.aspose.slides.ms.System.d1.n5(var6, com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.a3.l6((int)var7.j5()), ","}));
         }

         var7 = com.aspose.slides.internal.v6g.k5.n5(var5.l6().n5(333), com.aspose.slides.internal.k0r.z5.class);
         if (var7 != null) {
            var6 = com.aspose.slides.ms.System.d1.n5(var6, com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.a3.l6((int)var7.j5()), ","}));
         }

         var7 = com.aspose.slides.internal.v6g.k5.n5(var5.l6().n5(334), com.aspose.slides.internal.k0r.z5.class);
         if (var7 != null) {
            var6 = com.aspose.slides.ms.System.d1.n5(var6, com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.a3.l6((int)var7.j5()), ","}));
         }

         if (!com.aspose.slides.ms.System.d1.a6(var6, com.aspose.slides.ms.System.d1.n5)) {
            var0.n3(com.aspose.slides.ms.System.d1.l6(var6, 0, var6.length() - 1));
         }
      }

      n5(var0, var1);
      n9v.n5(var0, var1.getFillFormat(), var1.getLineFormat(), var2.n5(), var3);
      com.aspose.slides.internal.k0r.a9 var17 = var1.k7().y4();
      if (var17 != null) {
         com.aspose.slides.internal.k0r.z5 var8 = com.aspose.slides.internal.v6g.k5.n5(var17.l6().n5(777), com.aspose.slides.internal.k0r.z5.class);
         if (var8 != null) {
            var0.n5((int)var8.j5());
         }

         com.aspose.slides.internal.k0r.z5 var9 = com.aspose.slides.internal.v6g.k5.n5(var17.l6().n5(778), com.aspose.slides.internal.k0r.z5.class);
         if (var9 != null) {
            var0.l6((int)var9.j5());
         }
      }

      if (var1.k7().e2() != null) {
         t9x var25 = (t9x)var0.u9("textbox").l6();
         var25.n5("<v:textbox inset=\"0,0,0,0\"/>");
         com.aspose.slides.internal.k4y.b3e var26 = (com.aspose.slides.internal.k4y.b3e)var0.u9("textdata").l6();
         var26.n5(com.aspose.slides.ms.System.d1.n5(new String[]{"rId", com.aspose.slides.ms.System.a3.l6(var4[0])}));
         com.aspose.slides.internal.k0r.d3 var10 = var1.k7().e2();
         var10.w1().n5(4130);
         byte[] var11 = new byte[var10.y1() + var10.n5()];
         com.aspose.slides.internal.z0k.e2 var12 = new com.aspose.slides.internal.z0k.e2(var11);

         try {
            com.aspose.slides.internal.z0k.l6 var13 = new com.aspose.slides.internal.z0k.l6(var12);
            var10.l6(var13);
         } finally {
            if (var12 != null) {
               var12.dispose();
            }
         }

         var2.n5().l6().addItem(var26, var11);
         var4[0]++;
      }
   }

   private static void n5(com.aspose.slides.internal.k4y.m1 var0, Connector var1, com.aspose.slides.internal.k0r.r3 var2, n4i var3) {
      var0.l6(com.aspose.slides.ms.System.d1.n5(new String[]{"_s", com.aspose.slides.ms.System.l4.l6(var1.n5().z3())}));
      var0.u3(com.aspose.slides.ms.System.d1.n5("_x0000_s{0:D4}", new Object[]{var1.n5().z3()}));
      o4f var4 = var1.R_();
      com.aspose.slides.internal.l7h.a5 var5 = new com.aspose.slides.internal.l7h.a5("position:absolute");
      if (!com.aspose.slides.ms.System.d2.k5(var4.k5()) && var4.k5() != 0.0F) {
         var5.n5(";rotation:{0}",new Object[]{ com.aspose.slides.ms.System.Xml.f4.n5(var4.k5())});
      }

      if (var4.u3() == 1 || var4.a6() == 1) {
         var5.n5(";flip:");
         if (var4.u3() == 1) {
            var5.n5("x");
         }

         if (var4.a6() == 1) {
            var5.n5("y");
         }
      }

      var0.k5(var5.toString());
      var0.t2(
         com.aspose.slides.ms.System.d1.n5(new String[]{
            com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(var4.n5().n5 * 12700.0, 14)),
            ",",
            com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(var4.n5().l6 * 12700.0, 14))
         })
      );
      e4c var6 = e4c.l6(e4c.n5(var4.n5(), var1.z7()), 12700).u9();
      var0.s7(
         com.aspose.slides.ms.System.d1.n5(new String[]{
            com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(var6.n5, 14)),
            ",",
            com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(var6.l6, 14))
         })
      );
      n9v.n5(var0, var1.getFillFormat(), var1.getLineFormat(), var3);
   }

   private static void l6(com.aspose.slides.internal.k4y.m1 var0, Connector var1, com.aspose.slides.internal.k0r.r3 var2, n4i var3) {
      var0.l6(com.aspose.slides.ms.System.d1.n5(new String[]{"_s", com.aspose.slides.ms.System.l4.l6(var1.n5().z3())}));
      var0.u3(com.aspose.slides.ms.System.d1.n5("_x0000_s{0:D4}", new Object[]{var1.n5().z3()}));
      var0.u9(3);
      if (var2 != null) {
         String var4 = com.aspose.slides.ms.System.d1.n5;
         com.aspose.slides.internal.k0r.z5 var5 = com.aspose.slides.internal.v6g.k5.n5(var2.l6().n5(327), com.aspose.slides.internal.k0r.z5.class);
         if (var5 != null) {
            var4 = com.aspose.slides.ms.System.d1.n5(var4, com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.a3.l6((int)var5.j5()), ","}));
         }

         var5 = com.aspose.slides.internal.v6g.k5.n5(var2.l6().n5(328), com.aspose.slides.internal.k0r.z5.class);
         if (var5 != null) {
            var4 = com.aspose.slides.ms.System.d1.n5(var4, com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.a3.l6((int)var5.j5()), ","}));
         }

         var5 = com.aspose.slides.internal.v6g.k5.n5(var2.l6().n5(329), com.aspose.slides.internal.k0r.z5.class);
         if (var5 != null) {
            var4 = com.aspose.slides.ms.System.d1.n5(var4, com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.a3.l6((int)var5.j5()), ","}));
         }

         if (!com.aspose.slides.ms.System.d1.a6(var4, com.aspose.slides.ms.System.d1.n5)) {
            var0.n3(com.aspose.slides.ms.System.d1.l6(var4, 0, var4.length() - 1));
         }
      }

      n5(var0, var1);
      n9v.n5(var0, var1.getFillFormat(), var1.getLineFormat(), var3);
   }

   private static void n5(com.aspose.slides.internal.k4y.m1 var0, Shape var1) {
      o4f var2 = var1.R_();
      e4c var3 = var1.z7().u9();
      com.aspose.slides.internal.l7h.a5 var4 = new com.aspose.slides.internal.l7h.a5("position:absolute");
      if (!com.aspose.slides.ms.System.d2.k5(var2.n5().n5)) {
         var4.n5(";left:{0}",new Object[]{ com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(var2.n5().n5 * 12700.0, 14))});
      }

      if (!com.aspose.slides.ms.System.d2.k5(var2.n5().l6)) {
         var4.n5(";top:{0}",new Object[]{ com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(var2.n5().l6 * 12700.0, 14))});
      }

      if (!com.aspose.slides.ms.System.d2.k5(var3.n5)) {
         var4.n5(";width:{0}",new Object[]{ com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(var3.n5 * 12700.0, 14))});
      }

      if (!com.aspose.slides.ms.System.d2.k5(var3.l6)) {
         var4.n5(";height:{0}",new Object[]{ com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(var3.l6 * 12700.0, 14))});
      }

      if (!com.aspose.slides.ms.System.d2.k5(var2.k5()) && var2.k5() != 0.0F) {
         var4.n5(";rotation:{0}",new Object[]{ com.aspose.slides.ms.System.Xml.f4.n5(var2.k5())});
      }

      if (var2.u3() == 1 || var2.a6() == 1) {
         var4.n5(";flip:");
         if (var2.u3() == 1) {
            var4.n5("x");
         }

         if (var2.a6() == 1) {
            var4.n5("y");
         }
      }

      if (com.aspose.slides.internal.v6g.k5.l6(var1, AutoShape.class) && ((AutoShape)var1).getTextFrame() != null) {
         ITextFrameFormat var5 = ((AutoShape)var1).getTextFrame().getTextFrameFormat();
         if (var5.getWrapText() == 0) {
            var4.n5(";mso-wrap-style:none");
         }

         switch (var5.getAnchoringType()) {
            case 1:
               var4.n5(";v-text-anchor:middle");
               break;
            case 2:
               var4.n5(";v-text-anchor:bottom");
         }
      }

      var0.k5(var4.toString());
   }

   private static void n5(f5z var0, List<String> var1) {
      if (!var1.containsItem("_x0000_t75")) {
         l7p var2 = (l7p)var0.u9("shapetype").l6();
         var2.z3("21600,21600");
         var2.l6("_x0000_t75");
         var2.n5(75.0F);
         var2.h0(2);
         var2.y4("m@4@5l@4@11@9@11@9@5xe");
         var2.k5(2);
         var2.a6(2);
         d1n var3 = (d1n)var2.u9("stroke").l6();
         var3.l6((byte)2);
         com.aspose.slides.internal.k4y.j2b var4 = (com.aspose.slides.internal.k4y.j2b)var2.u9("formulas").l6();
         var4.n5().n5("if lineDrawn pixelLineWidth 0");
         var4.n5().n5("sum @0 1 0");
         var4.n5().n5("sum 0 0 @1");
         var4.n5().n5("prod @2 1 2");
         var4.n5().n5("prod @3 21600 pixelWidth");
         var4.n5().n5("prod @3 21600 pixelHeight");
         var4.n5().n5("sum @0 0 1");
         var4.n5().n5("prod @6 1 2");
         var4.n5().n5("prod @7 21600 pixelWidth");
         var4.n5().n5("sum @8 21600 0");
         var4.n5().n5("prod @7 21600 pixelHeight");
         var4.n5().n5("sum @10 21600 0");
         t3k var5 = (t3k)var2.u9("path").l6();
         var5.a6(2);
         var5.k5(1);
         var5.u3(2);
         com.aspose.slides.internal.k4y.f1z var6 = (com.aspose.slides.internal.k4y.f1z)var2.u9("lock").l6();
         var6.n5(2);
         var6.a6(1);
         var1.addItem("_x0000_t75");
      }
   }

   private static void l6(f5z var0, List<String> var1) {
      if (!var1.containsItem("_x0000_t32")) {
         l7p var2 = (l7p)var0.u9("shapetype").l6();
         var2.z3("21600,21600");
         var2.l6("_x0000_t32");
         var2.n5(32.0F);
         var2.c8(1);
         var2.y4("m,l21600,21600e");
         var2.k5(2);
         t3k var3 = (t3k)var2.u9("path").l6();
         var3.l6(1);
         var3.n5(2);
         var3.u3(1);
         com.aspose.slides.internal.k4y.f1z var4 = (com.aspose.slides.internal.k4y.f1z)var2.u9("lock").l6();
         var4.n5(2);
         var4.u9(1);
         var1.addItem("_x0000_t32");
      }
   }

   private static void k5(f5z var0, List<String> var1) {
      if (!var1.containsItem("_x0000_t33")) {
         l7p var2 = (l7p)var0.u9("shapetype").l6();
         var2.z3("21600,21600");
         var2.l6("_x0000_t33");
         var2.n5(33.0F);
         var2.c8(1);
         var2.y4("m,l21600,r,21600e");
         var2.k5(2);
         d1n var3 = (d1n)var2.u9("stroke").l6();
         var3.l6((byte)2);
         t3k var4 = (t3k)var2.u9("path").l6();
         var4.l6(1);
         var4.n5(2);
         var4.u3(1);
         com.aspose.slides.internal.k4y.f1z var5 = (com.aspose.slides.internal.k4y.f1z)var2.u9("lock").l6();
         var5.n5(2);
         var5.u9(1);
         var1.addItem("_x0000_t33");
      }
   }

   private static void u3(f5z var0, List<String> var1) {
      if (!var1.containsItem("_x0000_t34")) {
         l7p var2 = (l7p)var0.u9("shapetype").l6();
         var2.z3("21600,21600");
         var2.l6("_x0000_t34");
         var2.n5(34.0F);
         var2.c8(1);
         var2.n3("10800");
         var2.y4("m,l@0,0@0,21600,21600,21600e");
         var2.k5(2);
         d1n var3 = (d1n)var2.u9("stroke").l6();
         var3.l6((byte)2);
         com.aspose.slides.internal.k4y.j2b var4 = (com.aspose.slides.internal.k4y.j2b)var2.u9("formulas").l6();
         var4.n5().n5("val #0");
         t3k var5 = (t3k)var2.u9("path").l6();
         var5.l6(1);
         var5.n5(2);
         var5.u3(1);
         r1k var6 = (r1k)var2.u9("handles").l6();
         var6.n5().n5("#0,center");
         com.aspose.slides.internal.k4y.f1z var7 = (com.aspose.slides.internal.k4y.f1z)var2.u9("lock").l6();
         var7.n5(2);
         var7.u9(1);
         var1.addItem("_x0000_t34");
      }
   }

   private static void a6(f5z var0, List<String> var1) {
      if (!var1.containsItem("_x0000_t8")) {
         l7p var2 = (l7p)var0.u9("shapetype").l6();
         var2.z3("21600,21600");
         var2.l6("_x0000_t8");
         var2.n5(8.0F);
         var2.n3("5400");
         var2.y4("m0,0l@0,21600@1,21600,21600,0xe");
         d1n var3 = (d1n)var2.u9("stroke").l6();
         var3.l6((byte)2);
         com.aspose.slides.internal.k4y.j2b var4 = (com.aspose.slides.internal.k4y.j2b)var2.u9("formulas").l6();
         var4.n5().n5("val #0");
         var4.n5().n5("sum width 0 #0");
         var4.n5().n5("prod #0 1 2");
         var4.n5().n5("sum width 0 @2");
         var4.n5().n5("mid #0 width");
         var4.n5().n5("mid @1 0");
         var4.n5().n5("prod height width #0");
         var4.n5().n5("prod @6 1 2");
         var4.n5().n5("sum height 0 @7");
         var4.n5().n5("prod width 1 2");
         var4.n5().n5("sum #0 0 @9");
         var4.n5().n5("if @10 @8 0");
         var4.n5().n5("if @10 @7 height");
         t3k var5 = (t3k)var2.u9("path").l6();
         var5.k5(1);
         var5.u3(4);
         var5.l6("@3,10800;10800,21600;@2,10800;10800,0");
         var5.n5("1800,1800,19800,19800;4500,4500,17100,17100;7200,7200,14400,14400");
         r1k var6 = (r1k)var2.u9("handles").l6();
         var6.n5().n5("#0,bottomRight");
         var6.n5().l6("0,10800");
         var1.addItem("_x0000_t8");
      }
   }

   private static void u9(f5z var0, List<String> var1) {
      if (!var1.containsItem("_x0000_t23")) {
         l7p var2 = (l7p)var0.u9("shapetype").l6();
         var2.z3("21600,21600");
         var2.l6("_x0000_t23");
         var2.n5(23.0F);
         var2.n3("5400");
         var2.y4("m0,10800qy10800,,21600,10800,10800,21600,,10800xm@0,10800qy10800@2@1,10800,10800@0@0,10800xe");
         com.aspose.slides.internal.k4y.j2b var3 = (com.aspose.slides.internal.k4y.j2b)var2.u9("formulas").l6();
         var3.n5().n5("val #0");
         var3.n5().n5("sum width 0 #0");
         var3.n5().n5("sum height 0 #0");
         var3.n5().n5("prod @0 2929 10000");
         var3.n5().n5("sum width 0 @3");
         var3.n5().n5("sum height 0 @3");
         t3k var4 = (t3k)var2.u9("path").l6();
         var4.u3(4);
         var4.l6("10800,0;3163,3163;0,10800;3163,18437;10800,21600;18437,18437;21600,10800;18437,3163");
         var4.n5("3163,3163,18437,18437");
         r1k var5 = (r1k)var2.u9("handles").l6();
         var5.n5().n5("#0,center");
         var5.n5().l6("0,10800");
         var1.addItem("_x0000_t23");
      }
   }

   private static void h0(f5z var0, List<String> var1) {
      if (!var1.containsItem("_x0000_t42")) {
         l7p var2 = (l7p)var0.u9("shapetype").l6();
         var2.z3("21600,21600");
         var2.l6("_x0000_t42");
         var2.n5(42.0F);
         var2.n3("-10080,24300,-3600,4050,-1800,4050");
         var2.y4("m@0@1l@2@3@4@5nfem0,0l21600,,21600,21600,,21600nsxe");
         d1n var3 = (d1n)var2.u9("stroke").l6();
         var3.l6((byte)2);
         com.aspose.slides.internal.k4y.j2b var4 = (com.aspose.slides.internal.k4y.j2b)var2.u9("formulas").l6();
         var4.n5().n5("val #0");
         var4.n5().n5("val #1");
         var4.n5().n5("val #2");
         var4.n5().n5("val #3");
         var4.n5().n5("val #4");
         var4.n5().n5("val #5");
         t3k var5 = (t3k)var2.u9("path").l6();
         var5.l6(1);
         var5.k5(1);
         var5.a6(2);
         var5.u3(4);
         var5.l6("@0,@1;10800,0;10800,21600;0,10800;21600,10800");
         r1k var6 = (r1k)var2.u9("handles").l6();
         var6.n5().n5("#0,#1");
         var6.n5().n5("#2,#3");
         var6.n5().n5("#4,#5");
         var1.addItem("_x0000_t42");
      }
   }
}
