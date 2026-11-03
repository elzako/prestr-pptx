package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.k4y.d1n;
import com.aspose.slides.internal.k4y.l7p;
import com.aspose.slides.internal.k4y.v4a;
import com.aspose.slides.ms.System.IDisposable;

class n9v {
   private static final com.aspose.slides.internal.n8e.e2 n5 = new com.aspose.slides.internal.n8e.e2(
      "solid", "dot", "dash", "longdash", "dashdot", "longdashdot", "longdashdotdot", "shortdash", "shortdot", "shortdashdot", "shortdashdotdot"
   );
   private static final String[] l6 = new String[]{"fill", "fillback", "line", "lineback"};

   public static void n5(IFillFormat var0, ILineFormat var1, com.aspose.slides.internal.k4y.m1 var2, l7p var3, t5w var4) {
      n5(var0, var1, n5(var2, var3), var4);
   }

   public static void n5(IFillFormat var0, ILineFormat var1, com.aspose.slides.internal.k4y.m1 var2, t5w var3) {
      n5(var0, var1, var2, true, true, var3);
   }

   public static void n5(IFillFormat var0, ILineFormat var1, com.aspose.slides.internal.k4y.m1 var2, boolean var3, boolean var4, t5w var5) {
      if (var0 != null && var1 != null) {
         com.aspose.slides.internal.k4y.e6k var6 = (com.aspose.slides.internal.k4y.e6k)var2.n5("fill");
         String var7 = var2.c8();
         String var8 = null;
         String var9 = null;
         float var10 = 1.0F;
         float var11 = 1.0F;
         boolean var12 = com.aspose.slides.internal.k4y.m1.n5(var2.h0(), var3);
         if (var6 != null) {
            if (var6.k5() != null) {
               var7 = var6.k5();
            }

            var12 = com.aspose.slides.internal.k4y.m1.n5(var6.l6(), var12);
            var10 = l6(var6.u3(), "1");
            if (var12) {
               switch (var6.n5()) {
                  case 0:
                  case 1:
                     var0.setFillType((byte)1);
                     break;
                  case 2:
                     var0.setFillType((byte)2);
                     var0.getGradientFormat().setGradientShape((byte)0);
                     var0.getGradientFormat().setLinearGradientAngle(l6(var6.h0(), "0"));
                     var0.getGradientFormat().setLinearGradientScaled((byte)1);
                     var11 = l6(var6.t2(), "1");
                     var9 = var6.a6();
                     var8 = var6.u9();
                     break;
                  case 3:
                     var0.setFillType((byte)2);
                     var0.getGradientFormat().setGradientShape((byte)1);
                     var11 = l6(var6.t2(), "1");
                     var9 = var6.a6();
                     var8 = var6.u9();
                     String var13 = var6.c8();
                     if (var13 == null) {
                        var13 = "0.5,0.5";
                     }

                     com.aspose.slides.internal.n8e.u5 var14 = new com.aspose.slides.internal.n8e.u5(var13);
                     float var15 = var14.u3();
                     if (com.aspose.slides.ms.System.n1.k5(var15)) {
                        var15 = 0.0F;
                     }

                     float var16 = 0.0F;
                     var14.t2();
                     if (var14.h0() > 0) {
                        var14.c8();
                        var16 = var14.u3();
                     }

                     if (com.aspose.slides.ms.System.n1.k5(var16)) {
                        var16 = 0.0F;
                     }

                     ((GradientFormat)var0.getGradientFormat()).n5(var15, var16, 0.0F, 0.0F);
                     break;
                  case 4:
                     n5(var6, var0, var5);
                     var0.getPictureFillFormat().setPictureFillMode(0);
                     break;
                  case 5:
                     var0.setFillType((byte)3);
                     var11 = l6(var6.t2(), "1");
                     var9 = var6.a6();
                     break;
                  case 6:
                     n5(var6, var0, var5);
                     var0.getPictureFillFormat().setPictureFillMode(1);
               }
            }
         } else if (var12) {
            var0.setFillType((byte)1);
         }

         if (!var12) {
            var0.setFillType((byte)0);
         }

         d1n var28 = (d1n)var2.n5("stroke");
         boolean var29 = com.aspose.slides.internal.k4y.m1.n5(var2.x8(), var4);
         String var30 = var2.n3();
         if (var30 == null) {
            var30 = "";
         }

         String var31 = var30;
         String var17 = null;
         float var18 = 1.0F;
         String var19 = var2.y4();
         if (var19 == null) {
            var19 = "1";
         }

         String var20 = var19;
         if (var28 != null) {
            if (var28.l6() != null) {
               var20 = var28.l6();
            }

            if (var28.k5() != null) {
               var31 = var28.k5();
            }

            var29 = com.aspose.slides.internal.k4y.m1.n5(var28.n5(), var29);
            if (var29) {
               var18 = l6(var28.u3(), "1");
               var17 = var28.x8();
               var1.setStyle(var28.a6() != -1 ? var28.a6() : 0);
               var1.setJoinStyle(var28.h0() != -1 ? var28.h0() : 0);
               if (var1.getJoinStyle() == 2) {
                  var1.setMiterLimit(l6(var28.u9(), "8"));
               }

               var1.setCapStyle(var28.c8() != -1 ? var28.c8() : 2);
               n5(var28, var1);
            }
         }

         if (var29) {
            var1.getFillFormat().setFillType((byte)1);
            var1.setWidth(new com.aspose.slides.internal.n8e.u5(var20).x8());
         }

         IColorFormat[] var21 = new IColorFormat[4];
         byte var22 = 0;
         switch (var0.getFillType()) {
            case 1:
               var21[0] = var0.getSolidFillColor();
               var21[1] = var0.getPatternFormat().getBackColor();
               break;
            case 2:
               var0.getGradientFormat().getGradientStops().addPresetColor(0.0F, 7);
               var0.getGradientFormat().getGradientStops().addPresetColor(1.0F, 136);
               var21[0] = var0.getGradientFormat().getGradientStops().get_Item(0).getColor();
               var21[1] = var0.getGradientFormat().getGradientStops().get_Item(1).getColor();
               break;
            case 3:
               var21[0] = var0.getPatternFormat().getForeColor();
               var21[1] = var0.getPatternFormat().getBackColor();
         }

         if (var1.getFillFormat().getFillType() == 1) {
            var21[2] = var1.getFillFormat().getSolidFillColor();
            var21[3] = var1.getFillFormat().getPatternFormat().getBackColor();
         }

         String[] var23 = new String[]{var7, var9, var31, var17};

         byte var24;
         do {
            var24 = var22;

            for (int var25 = 0; var25 < var21.length; var25++) {
               if ((var22 & 255 & 1 << var25) == 0) {
                  boolean var26 = true;
                  if (var23[var25] != null && !"".equals(var23[var25])) {
                     for (int var27 = 0; var27 < var21.length; var27++) {
                        if ((var22 & 255 & 1 << var27) == 0 && com.aspose.slides.ms.System.d1.c8(var23[var25], l6[var27]) >= 0) {
                           var26 = false;
                           break;
                        }
                     }

                     if (var26) {
                        if (var21[var25] != null) {
                           new com.aspose.slides.internal.n8e.u5(var23[var25]).n5(var21[var25], var21[0], var21[1], var21[2], var21[3]);
                        }

                        var22 = (byte)(var22 & 0xFF | (byte)(1 << var25) & 0xFF);
                     }
                  } else {
                     var22 = (byte)(var22 & 0xFF | (byte)(1 << var25) & 0xFF);
                  }
               }
            }
         } while ((var24 & 255) != (var22 & 255));

         for (int var32 = 0; var32 < var21.length; var32++) {
            if ((var22 & 255 & 1 << var32) == 0) {
               new com.aspose.slides.internal.n8e.u5(var23[var32]).n5(var21[var32]);
            }
         }

         if (var0.getFillType() != 0) {
            if (var10 < 1.0F) {
               var21[0].getColorTransform().add(5, var10);
            }

            if (var11 < 1.0F) {
               var21[1].getColorTransform().add(5, var11);
            }
         }

         if (var18 < 1.0F) {
            var21[2].getColorTransform().add(5, var18);
         }

         if (var0.getFillType() == 2 && var8 != null && !"".equals(var8)) {
            var0.getGradientFormat().getGradientStops().clear();
            com.aspose.slides.internal.n8e.u5 var33 = new com.aspose.slides.internal.n8e.u5(var8);
            var33.t2();

            for (; var33.h0() > 0; var33.t2()) {
               float var34 = var33.u3();
               if (com.aspose.slides.ms.System.n1.k5(var34)) {
                  break;
               }

               var0.getGradientFormat().getGradientStops().addPresetColor(var34, -1);
               var33.n5(
                  var0.getGradientFormat().getGradientStops().get_Item(var0.getGradientFormat().getGradientStops().size() - 1).getColor(),
                  var21[0],
                  var21[1],
                  var21[2],
                  var21[3]
               );
               var33.t2();
               if (var33.h0() > 0) {
                  var33.c8();
               }
            }
         }
      }
   }

   private static void n5(d1n var0, ILineFormat var1) {
      String var2 = var0.t2();
      if (var2 == null) {
         var2 = "solid";
      }

      String var3 = var2;
      var3 = com.aspose.slides.ms.System.d1.n5(var3, com.aspose.slides.internal.x7n.l6.k5());
      com.aspose.slides.internal.n8e.u5 var4 = new com.aspose.slides.internal.n8e.u5(var3);
      var4.t2();
      if (var4.u9() >= '0' && var4.u9() <= '9') {
         List var5 = new List();

         float var6;
         while (!com.aspose.slides.ms.System.n1.k5(var6 = var4.u3())) {
            if (var6 > 0.0F) {
               var5.addItem(var6);
            }
         }

         var1.setDashStyle((byte)11);
         var1.setCustomDashPattern(com.aspose.slides.internal.n8e.v4.a6(var5));
      } else {
         var1.setDashStyle((byte)n5.n5(var3));
      }
   }

   private static void n5(com.aspose.slides.internal.k4y.e6k var0, IFillFormat var1, t5w var2) {
      var1.setFillType((byte)4);
      String var3 = var0.s7();
      if (var3 != null) {
         com.aspose.slides.internal.c8m.a2 var4 = var2.k7();
         var1.getPictureFillFormat().getPicture().setImage(var2.n5(var4.n5(var3).l6()));
      }
   }

   private static com.aspose.slides.internal.k4y.m1 n5(com.aspose.slides.internal.k4y.m1 var0, l7p var1) {
      if (var0 != null && var1 != null) {
         v4a var2 = new v4a();
         var2.a6(n5(var0.c8(), var1.c8()));
         var2.k5(n5(var0.h0(), var1.h0()));
         com.aspose.slides.internal.k4y.e6k var3 = (com.aspose.slides.internal.k4y.e6k)var0.n5("fill");
         com.aspose.slides.internal.k4y.e6k var4 = (com.aspose.slides.internal.k4y.e6k)var1.n5("fill");
         if (var3 != null && var4 != null) {
            com.aspose.slides.internal.k4y.e6k var5 = new com.aspose.slides.internal.k4y.e6k();
            var2.n5(new com.aspose.slides.internal.k4y.g7("fill", var5));
            var5.n5(l6(var3.n5(), var4.n5()));
            var5.a6(n5(var3.h0(), var4.h0()));
            var5.n5(n5(var3.k5(), var4.k5()));
            var5.k5(n5(var3.a6(), var4.a6()));
            var5.u3(n5(var3.u9(), var4.u9()));
            var5.l6(n5(var3.l6(), var4.l6()));
            var5.l6(n5(var3.u3(), var4.u3()));
            var5.t2(n5(var3.t2(), var4.t2()));
            var5.c8(n5(var3.c8(), var4.c8()));
            var5.s7(n5(var3.s7(), var4.s7()));
         } else if (var3 != null) {
            var2.n5(new com.aspose.slides.internal.k4y.g7("fill", var3));
         } else if (var4 != null) {
            var2.n5(new com.aspose.slides.internal.k4y.g7("fill", var4));
         }

         var2.a6(n5(var0.x8(), var1.x8()));
         var2.h0(n5(var0.n3(), var1.n3()));
         var2.c8(n5(var0.y4(), var1.y4()));
         d1n var8 = (d1n)var0.n5("stroke");
         d1n var6 = (d1n)var1.n5("stroke");
         if (var8 != null && var6 != null) {
            d1n var7 = new d1n();
            var2.n5(new com.aspose.slides.internal.k4y.g7("stroke", var7));
            var7.l6(l6(var8.s7(), var6.s7()));
            var7.n5(n5(var8.l6(), var6.l6()));
            var7.l6(n5(var8.k5(), var6.k5()));
            var7.a6(n5(var8.x8(), var6.x8()));
            var7.u3(n5(var8.t2(), var6.t2()));
            var7.l6(var8.h0() != -1 ? var8.h0() : var6.h0());
            var7.n5(var8.a6() != -1 ? var8.a6() : var6.a6());
            var7.k5(var8.c8() != -1 ? var8.c8() : var6.c8());
            var7.k5(n5(var8.u9(), var6.u9()));
            var7.n5(n5(var8.n5(), var6.n5()));
         } else if (var8 != null) {
            var2.n5(new com.aspose.slides.internal.k4y.g7("stroke", var8));
         } else if (var6 != null) {
            var2.n5(new com.aspose.slides.internal.k4y.g7("stroke", var6));
         }

         return var2;
      } else if (var0 != null) {
         return var0;
      } else {
         return var1 != null ? var0 : null;
      }
   }

   private static String n5(String var0, String var1) {
      String var2 = var0;
      if (var2 == null) {
         var2 = var1;
      }

      return var2;
   }

   private static int n5(int var0, int var1) {
      return var0 != 0 ? var0 : var1;
   }

   private static int l6(int var0, int var1) {
      return var0 != 0 ? var0 : var1;
   }

   public static void n5(com.aspose.slides.internal.k4y.m1 var0, IFillFormat var1, ILineFormat var2, n4i var3) {
      n5(var0, var1, var2, null, var3);
   }

   public static void n5(com.aspose.slides.internal.k4y.m1 var0, IFillFormat var1, ILineFormat var2, t4i var3, n4i var4) {
      switch (var1.getFillType()) {
         case -1:
         case 0:
         default:
            var0.k5(2);
            break;
         case 1:
            n5(var0, var1);
            break;
         case 2:
            l6(var0, var1);
            break;
         case 3:
            n5(var0, var1, var3, var4);
            break;
         case 4:
            n5(var0, var1.getPictureFillFormat(), var3, var4);
      }

      if (var2.getFillFormat().getFillType() != 0 && var2.getFillFormat().getFillType() != -1) {
         if (!com.aspose.slides.ms.System.d2.k5(var2.getWidth())) {
            var0.c8(com.aspose.slides.ms.System.d1.n5("{0}pt", new Object[]{com.aspose.slides.ms.System.Xml.f4.n5(var2.getWidth())}));
         }

         var0.a6(1);
         var0.h0(var2.getFillFormat().getSolidFillColor().toString(0));
      } else {
         var0.a6(2);
      }
   }

   private static void n5(com.aspose.slides.internal.k4y.m1 var0, IFillFormat var1) {
      if ((n5(var1.getSolidFillColor(), com.aspose.slides.internal.o9b.c8.w4().o8()).s7() & 255) < 255) {
         com.aspose.slides.internal.k4y.e6k var2 = n5(var0);
         var2.l6(1);
         var2.n5(1);
         n5(var2, var1.getSolidFillColor());
      } else {
         var0.k5(1);
         var0.a6(var1.getSolidFillColor().toString(0));
      }
   }

   private static void l6(com.aspose.slides.internal.k4y.m1 var0, IFillFormat var1) {
      com.aspose.slides.internal.k4y.e6k var2 = n5(var0);
      var2.l6(1);
      GradientFormat var3 = (GradientFormat)var1.getGradientFormat();
      if (var3.getGradientShape() != 0 && var3.getGradientShape() != -1) {
         var2.n5(3);
         s4s var4 = var3.u9().l6();
         var2.c8(
            com.aspose.slides.ms.System.d1.n5("{0},{1}",new Object[]{ com.aspose.slides.ms.System.Xml.f4.n5(var4.n5.n5), com.aspose.slides.ms.System.Xml.f4.n5(var4.n5.l6)})
         );
         var2.h0(
            com.aspose.slides.ms.System.d1.n5("{0},{1}",new Object[]{ com.aspose.slides.ms.System.Xml.f4.n5(var4.l6.n5), com.aspose.slides.ms.System.Xml.f4.n5(var4.l6.l6)})
         );
      } else {
         var2.n5(2);
         var2.u3(n5(var1.getRotateWithShape()));
         var2.a6(com.aspose.slides.ms.System.Xml.f4.n5(var3.getLinearGradientAngle()));
      }

      if (var3.getGradientStops().size() > 0) {
         if (var3.getGradientStops().size() <= 2) {
            if (var3.getGradientStops().get_Item(0).getPosition() == 0.0F
               && var3.getGradientStops().get_Item(var3.getGradientStops().size() - 1).getPosition() == 1.0F) {
               var2.k5(5);
            }
         } else {
            com.aspose.slides.internal.l7h.a5 var6 = new com.aspose.slides.internal.l7h.a5();
            if (var3.getGradientStops().size() > 0) {
               var6.n5(com.aspose.slides.ms.System.Xml.f4.n5(var3.getGradientStops().get_Item(0).getPosition()));
               var6.n5(' ');
               var6.n5(var3.getGradientStops().get_Item(0).getColor().toString(0));
            }

            for (int var5 = 1; var5 < var3.getGradientStops().size(); var5++) {
               var6.n5("; ");
               var6.n5(com.aspose.slides.ms.System.Xml.f4.n5(var3.getGradientStops().get_Item(var5).getPosition()));
               var6.n5(' ');
               var6.n5(var3.getGradientStops().get_Item(var5).getColor().toString(0));
            }

            var2.u3(var6.toString());
         }

         n5(var2, var3.getGradientStops().get_Item(0).getColor());
         l6(var2, var3.getGradientStops().get_Item(var3.getGradientStops().size() - 1).getColor());
      }

      var2.u9("100%");
   }

   private static void n5(com.aspose.slides.internal.k4y.m1 var0, IFillFormat var1, t4i var2, n4i var3) {
      com.aspose.slides.internal.k4y.e6k var4 = n5(var0);
      var4.l6(1);
      var4.n5(5);
      var4.u3(n5(var1.getRotateWithShape()));
      PatternFormat var5 = (PatternFormat)var1.getPatternFormat();
      com.aspose.slides.internal.o9b.l6 var6 = var5.l6(com.aspose.slides.internal.o9b.c8.w4().o8(), com.aspose.slides.internal.o9b.c8.m3().o8());

      try {
         com.aspose.slides.internal.c8m.j8 var7 = var3.n5().n5(var6);
         if (var3.h0() != null) {
            String var8 = var3.h0().e2().l6(var7).a6();
            var4.s7(var8);
         } else if (var2 != null) {
            var2.u3().addItem(var4, var7);
         }
      } finally {
         if (var6 != null) {
            var6.dispose();
         }
      }

      n5(var4, var5.getForeColor());
      l6(var4, var5.getBackColor());
   }

   private static void n5(com.aspose.slides.internal.k4y.m1 var0, IPictureFillFormat var1, t4i var2, n4i var3) {
      com.aspose.slides.internal.k4y.e6k var4 = n5(var0);
      var4.l6(1);
      var4.n5(var1.getPictureFillMode() == 0 ? 4 : 6);
      if (var1.getPicture().getImage() != null) {
         com.aspose.slides.internal.c8m.j8 var5 = var3.n5().l6(var1.getPicture().getImage());
         if (var3.h0() != null) {
            String var6 = var3.h0().e2().l6(var5).a6();
            var4.s7(var6);
         } else if (var2 != null) {
            var2.u3().addItem(var4, var5);
         }
      }
   }

   private static com.aspose.slides.internal.k4y.e6k n5(com.aspose.slides.internal.k4y.m1 var0) {
      return (com.aspose.slides.internal.k4y.e6k)var0.u9("fill").l6();
   }

   private static void n5(com.aspose.slides.internal.k4y.e6k var0, IColorFormat var1) {
      String var2 = null;
      String var3 = null;
      String[] var4 = new String[]{var2};
      String[] var5 = new String[]{var3};
      n5(var1, var4, var5);
      var2 = var4[0];
      var3 = var5[0];
      var0.n5(var2);
      var0.l6(var3);
   }

   private static void l6(com.aspose.slides.internal.k4y.e6k var0, IColorFormat var1) {
      String var2 = null;
      String var3 = null;
      String[] var4 = new String[]{var2};
      String[] var5 = new String[]{var3};
      n5(var1, var4, var5);
      var2 = var4[0];
      var3 = var5[0];
      var0.k5(var2);
      var0.t2(var3);
   }

   private static void n5(IColorFormat var0, String[] var1, String[] var2) {
      var1[0] = var0.toString(0);
      var2[0] = null;
      IGenericEnumerator var3 = var0.getColorTransform().iterator();

      try {
         while (var3.hasNext()) {
            IColorOperation var4 = (IColorOperation)var3.next();
            switch (var4.getOperationType()) {
               case 5:
                  int var5 = com.aspose.slides.internal.v6g.k5.u3(var4.getParameter() * 65536.0F, 13);
                  var2[0] = com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.a3.l6(var5), "f"});
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }
   }

   private static com.aspose.slides.internal.o9b.c8 n5(IColorFormat var0, com.aspose.slides.internal.o9b.c8 var1) {
      if (var0.getColorType() == 3 && var0.getSchemeColor() == 12) {
         var0.setR(com.aspose.slides.internal.o9b.c8.m3().x8());
         var0.setG(com.aspose.slides.internal.o9b.c8.m3().n3());
         var0.setB(com.aspose.slides.internal.o9b.c8.m3().y4());
         com.aspose.slides.internal.o9b.c8 var2 = ((ColorFormat)var0).u3().o8();
         var0.setColorType(3);
         var0.setSchemeColor(12);
         return var2;
      } else {
         return ((ColorFormat)var0).u3();
      }
   }

   private static float l6(String var0, String var1) {
      String var2 = var0;
      if (var2 == null) {
         var2 = var1;
      }

      return new com.aspose.slides.internal.n8e.u5(var2).u3();
   }

   private static int n5(byte var0) {
      return var0 == 1 ? 1 : 2;
   }
}
