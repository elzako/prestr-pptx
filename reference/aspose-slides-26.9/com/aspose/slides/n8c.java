package com.aspose.slides;

import com.aspose.slides.exceptions.Exception;

class n8c {
   private static final com.aspose.slides.internal.v6g.u9 n5 = new com.aspose.slides.internal.v6g.u9(
      "blinds",
      "checker",
      "circle",
      "comb",
      "cover",
      "cut",
      "diamond",
      "dissolve",
      "fade",
      "newsflash",
      "plus",
      "pull",
      "push",
      "random",
      "randomBar",
      "split",
      "strips",
      "wedge",
      "wheel",
      "wipe",
      "zoom",
      "vortex",
      "switch",
      "flip",
      "ripple",
      "honeycomb",
      "prism",
      "doors",
      "window",
      "ferris",
      "gallery",
      "conveyor",
      "pan",
      "glitter",
      "warp",
      "flythrough",
      "flash",
      "shred",
      "reveal",
      "wheelReverse",
      "prstTrans",
      "morph",
      "stSnd",
      "endSnd"
   );

   public static void n5(ISlideShowTransition var0, com.aspose.slides.internal.k4y.u9 var1, t5w var2) {
      if (var1 != null) {
         com.aspose.slides.internal.k4y.v0l var3;
         if (com.aspose.slides.internal.n8e.f0.n5.n5("http://schemas.microsoft.com/office/powerpoint/2015/09/main") && var1.u9() != null) {
            var3 = var1.u9();
         } else if (com.aspose.slides.internal.n8e.f0.n5.n5("http://schemas.microsoft.com/office/powerpoint/2012/main") && var1.h0() != null) {
            var3 = var1.h0();
         } else if (com.aspose.slides.internal.n8e.f0.n5.n5("http://schemas.microsoft.com/office/powerpoint/2010/main") && var1.c8() != null) {
            var3 = var1.c8();
         } else {
            var3 = var1.a6();
         }

         com.aspose.slides.internal.k4y.g7 var4 = var3.u9();
         if (var4 != null) {
            switch (n5.n5(var4.n5())) {
               case 0:
                  com.aspose.slides.internal.k4y.f2b var5 = (com.aspose.slides.internal.k4y.f2b)var4.l6();
                  var0.setType(1);
                  v9o.n5((IOrientationTransition)var0.getValue(), var5);
                  break;
               case 1:
                  com.aspose.slides.internal.k4y.f2b var6 = (com.aspose.slides.internal.k4y.f2b)var4.l6();
                  var0.setType(2);
                  v9o.n5((IOrientationTransition)var0.getValue(), var6);
                  break;
               case 2:
                  var0.setType(3);
                  break;
               case 3:
                  com.aspose.slides.internal.k4y.f2b var7 = (com.aspose.slides.internal.k4y.f2b)var4.l6();
                  var0.setType(4);
                  v9o.n5((IOrientationTransition)var0.getValue(), var7);
                  break;
               case 4:
                  com.aspose.slides.internal.k4y.q1m var8 = (com.aspose.slides.internal.k4y.q1m)var4.l6();
                  var0.setType(5);
                  s8x.n5((IEightDirectionTransition)var0.getValue(), var8);
                  break;
               case 5:
                  com.aspose.slides.internal.k4y.x1c var9 = (com.aspose.slides.internal.k4y.x1c)var4.l6();
                  var0.setType(6);
                  q5s.n5((IOptionalBlackTransition)var0.getValue(), var9);
                  break;
               case 6:
                  var0.setType(7);
                  break;
               case 7:
                  var0.setType(8);
                  break;
               case 8:
                  com.aspose.slides.internal.k4y.x1c var10 = (com.aspose.slides.internal.k4y.x1c)var4.l6();
                  var0.setType(9);
                  q5s.n5((IOptionalBlackTransition)var0.getValue(), var10);
                  break;
               case 9:
                  var0.setType(10);
                  break;
               case 10:
                  var0.setType(11);
                  break;
               case 11:
                  com.aspose.slides.internal.k4y.q1m var11 = (com.aspose.slides.internal.k4y.q1m)var4.l6();
                  var0.setType(12);
                  s8x.n5((IEightDirectionTransition)var0.getValue(), var11);
                  break;
               case 12:
                  com.aspose.slides.internal.k4y.p3h var12 = (com.aspose.slides.internal.k4y.p3h)var4.l6();
                  var0.setType(13);
                  b5u.n5((ISideDirectionTransition)var0.getValue(), var12);
                  break;
               case 13:
                  var0.setType(14);
                  break;
               case 14:
                  com.aspose.slides.internal.k4y.f2b var13 = (com.aspose.slides.internal.k4y.f2b)var4.l6();
                  var0.setType(15);
                  v9o.n5((IOrientationTransition)var0.getValue(), var13);
                  break;
               case 15:
                  com.aspose.slides.internal.k4y.w5g var14 = (com.aspose.slides.internal.k4y.w5g)var4.l6();
                  var0.setType(16);
                  s1k.n5((ISplitTransition)var0.getValue(), var14);
                  break;
               case 16:
                  com.aspose.slides.internal.k4y.f6b var15 = (com.aspose.slides.internal.k4y.f6b)var4.l6();
                  var0.setType(17);
                  n3o.n5((ICornerDirectionTransition)var0.getValue(), var15);
                  break;
               case 17:
                  var0.setType(18);
                  break;
               case 18:
                  com.aspose.slides.internal.k4y.o8h var16 = (com.aspose.slides.internal.k4y.o8h)var4.l6();
                  var0.setType(19);
                  b2i.n5((IWheelTransition)var0.getValue(), var16);
                  break;
               case 19:
                  com.aspose.slides.internal.k4y.p3h var17 = (com.aspose.slides.internal.k4y.p3h)var4.l6();
                  var0.setType(20);
                  b5u.n5((ISideDirectionTransition)var0.getValue(), var17);
                  break;
               case 20:
                  com.aspose.slides.internal.k4y.p3u var18 = (com.aspose.slides.internal.k4y.p3u)var4.l6();
                  var0.setType(21);
                  y2d.n5((IInOutTransition)var0.getValue(), var18);
                  break;
               case 21:
                  com.aspose.slides.internal.k4y.p3h var19 = (com.aspose.slides.internal.k4y.p3h)var4.l6();
                  var0.setType(22);
                  b5u.n5((ISideDirectionTransition)var0.getValue(), var19);
                  break;
               case 22:
                  com.aspose.slides.internal.k4y.s7n var20 = (com.aspose.slides.internal.k4y.s7n)var4.l6();
                  var0.setType(23);
                  v6z.n5((ILeftRightDirectionTransition)var0.getValue(), var20);
                  break;
               case 23:
                  com.aspose.slides.internal.k4y.s7n var21 = (com.aspose.slides.internal.k4y.s7n)var4.l6();
                  var0.setType(24);
                  v6z.n5((ILeftRightDirectionTransition)var0.getValue(), var21);
                  break;
               case 24:
                  com.aspose.slides.internal.k4y.q8s var22 = (com.aspose.slides.internal.k4y.q8s)var4.l6();
                  var0.setType(25);
                  j9d.n5((IRippleTransition)var0.getValue(), var22);
                  break;
               case 25:
                  var0.setType(26);
                  break;
               case 26:
                  com.aspose.slides.internal.k4y.j1p var23 = (com.aspose.slides.internal.k4y.j1p)var4.l6();
                  u7g.n5(var0, var23);
                  break;
               case 27:
                  com.aspose.slides.internal.k4y.f2b var24 = (com.aspose.slides.internal.k4y.f2b)var4.l6();
                  var0.setType(31);
                  v9o.n5((IOrientationTransition)var0.getValue(), var24);
                  break;
               case 28:
                  com.aspose.slides.internal.k4y.f2b var25 = (com.aspose.slides.internal.k4y.f2b)var4.l6();
                  var0.setType(32);
                  v9o.n5((IOrientationTransition)var0.getValue(), var25);
                  break;
               case 29:
                  com.aspose.slides.internal.k4y.s7n var26 = (com.aspose.slides.internal.k4y.s7n)var4.l6();
                  var0.setType(33);
                  v6z.n5((ILeftRightDirectionTransition)var0.getValue(), var26);
                  break;
               case 30:
                  com.aspose.slides.internal.k4y.s7n var27 = (com.aspose.slides.internal.k4y.s7n)var4.l6();
                  var0.setType(34);
                  v6z.n5((ILeftRightDirectionTransition)var0.getValue(), var27);
                  break;
               case 31:
                  com.aspose.slides.internal.k4y.s7n var28 = (com.aspose.slides.internal.k4y.s7n)var4.l6();
                  var0.setType(35);
                  v6z.n5((ILeftRightDirectionTransition)var0.getValue(), var28);
                  break;
               case 32:
                  com.aspose.slides.internal.k4y.p3h var29 = (com.aspose.slides.internal.k4y.p3h)var4.l6();
                  var0.setType(36);
                  b5u.n5((ISideDirectionTransition)var0.getValue(), var29);
                  break;
               case 33:
                  com.aspose.slides.internal.k4y.g4m var30 = (com.aspose.slides.internal.k4y.g4m)var4.l6();
                  var0.setType(37);
                  r6r.n5((IGlitterTransition)var0.getValue(), var30);
                  break;
               case 34:
                  com.aspose.slides.internal.k4y.p3u var31 = (com.aspose.slides.internal.k4y.p3u)var4.l6();
                  var0.setType(38);
                  y2d.n5((IInOutTransition)var0.getValue(), var31);
                  break;
               case 35:
                  com.aspose.slides.internal.k4y.n1e var32 = (com.aspose.slides.internal.k4y.n1e)var4.l6();
                  var0.setType(39);
                  i5i.n5((IFlyThroughTransition)var0.getValue(), var32);
                  break;
               case 36:
                  var0.setType(40);
                  break;
               case 37:
                  com.aspose.slides.internal.k4y.c6d var33 = (com.aspose.slides.internal.k4y.c6d)var4.l6();
                  var0.setType(41);
                  a9h.n5((IShredTransition)var0.getValue(), var33);
                  break;
               case 38:
                  com.aspose.slides.internal.k4y.u8h var34 = (com.aspose.slides.internal.k4y.u8h)var4.l6();
                  var0.setType(42);
                  r1w.n5((IRevealTransition)var0.getValue(), var34);
                  break;
               case 39:
                  com.aspose.slides.internal.k4y.o8h var35 = (com.aspose.slides.internal.k4y.o8h)var4.l6();
                  var0.setType(43);
                  b2i.n5((IWheelTransition)var0.getValue(), var35);
                  break;
               case 40:
                  com.aspose.slides.internal.k4y.n4i var36 = (com.aspose.slides.internal.k4y.n4i)var4.l6();
                  k7n.n5(var0, var36);
                  break;
               case 41:
                  com.aspose.slides.internal.k4y.o5y var37 = (com.aspose.slides.internal.k4y.o5y)var4.l6();
                  var0.setType(56);
                  k7u.n5((IMorphTransition)var0.getValue(), var37);
                  break;
               default:
                  throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Unknown element \"", var4.n5(), "\""}));
            }
         }

         if (var3.h0() != null) {
            com.aspose.slides.internal.k4y.g7 var38 = var3.h0().n5();
            switch (n5.n5(var38.n5())) {
               case 42:
                  com.aspose.slides.internal.k4y.q6c var40 = (com.aspose.slides.internal.k4y.q6c)var38.l6();
                  com.aspose.slides.internal.c8m.j8 var42 = var2.k7().n5(var40.l6().n5()).l6();
                  if (var42 != null) {
                     var0.setSoundMode(0);
                     var0.setSoundLoop(var40.n5());
                     var0.setSoundIsBuiltIn(var40.l6().k5());
                     var0.setSound(var2.l6(var42));
                     if (var0.getSound() != null) {
                        var0.setSoundName(var40.l6().l6());
                     }
                  }
                  break;
               case 43:
                  var0.setSoundMode(1);
                  break;
               default:
                  throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Unknown element \"", var38.n5(), "\""}));
            }
         }

         t6r var39 = ((SlideShowTransition)var0).n5();
         var39.n5(var3.a6());
         var39.n5(var3.c8());
         var0.setAdvanceOnClick(var3.k5());
         boolean var41 = (var3.u3() & 4294967295L) != 4294967295L;
         var0.setAdvanceAfterTime(var41 ? var3.u3() : 0L);
         var0.setAdvanceAfter(var41);
         switch (var3.l6()) {
            case 1:
               var0.setSpeed(2);
               break;
            case 2:
               var0.setSpeed(1);
               break;
            case 3:
            default:
               var0.setSpeed(0);
         }
      }
   }

   public static void n5(ISlideShowTransition var0, com.aspose.slides.internal.k4y.u9 var1, g6c var2) {
      boolean var3 = k5(var0);
      boolean var4 = l6(var0);
      boolean var5 = n5(var0);
      com.aspose.slides.internal.k4y.v0l var6 = null;
      com.aspose.slides.internal.k4y.v0l var7 = null;
      com.aspose.slides.internal.k4y.v0l var8 = null;
      if (var3) {
         var8 = var1.l6();
      } else if (var4) {
         var7 = var1.k5();
      } else if (var5) {
         var6 = var1.u3();
      }

      com.aspose.slides.internal.k4y.v0l var9 = var1.n5();
      switch (var0.getType()) {
         case 0:
            break;
         case 1:
            if (var6 != null) {
               com.aspose.slides.internal.k4y.f2b var10 = (com.aspose.slides.internal.k4y.f2b)var6.n5("blinds").l6();
               v9o.l6((IOrientationTransition)var0.getValue(), var10);
            }

            com.aspose.slides.internal.k4y.f2b var43 = (com.aspose.slides.internal.k4y.f2b)var9.n5("blinds").l6();
            v9o.l6((IOrientationTransition)var0.getValue(), var43);
            break;
         case 2:
            if (var6 != null) {
               com.aspose.slides.internal.k4y.f2b var11 = (com.aspose.slides.internal.k4y.f2b)var6.n5("checker").l6();
               v9o.l6((IOrientationTransition)var0.getValue(), var11);
            }

            com.aspose.slides.internal.k4y.f2b var49 = (com.aspose.slides.internal.k4y.f2b)var9.n5("checker").l6();
            v9o.l6((IOrientationTransition)var0.getValue(), var49);
            break;
         case 3:
            if (var6 != null) {
               var6.n5("circle");
            }

            var9.n5("circle");
            break;
         case 4:
            if (var6 != null) {
               com.aspose.slides.internal.k4y.f2b var12 = (com.aspose.slides.internal.k4y.f2b)var6.n5("comb").l6();
               v9o.l6((IOrientationTransition)var0.getValue(), var12);
            }

            com.aspose.slides.internal.k4y.f2b var50 = (com.aspose.slides.internal.k4y.f2b)var9.n5("comb").l6();
            v9o.l6((IOrientationTransition)var0.getValue(), var50);
            break;
         case 5:
            if (var6 != null) {
               com.aspose.slides.internal.k4y.q1m var13 = (com.aspose.slides.internal.k4y.q1m)var6.n5("cover").l6();
               s8x.l6((IEightDirectionTransition)var0.getValue(), var13);
            }

            com.aspose.slides.internal.k4y.q1m var51 = (com.aspose.slides.internal.k4y.q1m)var9.n5("cover").l6();
            s8x.l6((IEightDirectionTransition)var0.getValue(), var51);
            break;
         case 6:
            if (var6 != null) {
               com.aspose.slides.internal.k4y.x1c var14 = (com.aspose.slides.internal.k4y.x1c)var6.n5("cut").l6();
               q5s.l6((IOptionalBlackTransition)var0.getValue(), var14);
            }

            com.aspose.slides.internal.k4y.x1c var52 = (com.aspose.slides.internal.k4y.x1c)var9.n5("cut").l6();
            q5s.l6((IOptionalBlackTransition)var0.getValue(), var52);
            break;
         case 7:
            if (var6 != null) {
               var6.n5("diamond");
            }

            var9.n5("diamond");
            break;
         case 8:
            if (var6 != null) {
               var6.n5("dissolve");
            }

            var9.n5("dissolve");
            break;
         case 9:
            if (var6 != null) {
               com.aspose.slides.internal.k4y.x1c var15 = (com.aspose.slides.internal.k4y.x1c)var6.n5("fade").l6();
               q5s.l6((IOptionalBlackTransition)var0.getValue(), var15);
            }

            com.aspose.slides.internal.k4y.x1c var53 = (com.aspose.slides.internal.k4y.x1c)var9.n5("fade").l6();
            q5s.l6((IOptionalBlackTransition)var0.getValue(), var53);
            break;
         case 10:
            if (var6 != null) {
               var6.n5("newsflash");
            }

            var9.n5("newsflash");
            break;
         case 11:
            if (var6 != null) {
               var6.n5("plus");
            }

            var9.n5("plus");
            break;
         case 12:
            if (var6 != null) {
               com.aspose.slides.internal.k4y.q1m var16 = (com.aspose.slides.internal.k4y.q1m)var6.n5("pull").l6();
               s8x.l6((IEightDirectionTransition)var0.getValue(), var16);
            }

            com.aspose.slides.internal.k4y.q1m var54 = (com.aspose.slides.internal.k4y.q1m)var9.n5("pull").l6();
            s8x.l6((IEightDirectionTransition)var0.getValue(), var54);
            break;
         case 13:
            if (var6 != null) {
               com.aspose.slides.internal.k4y.p3h var17 = (com.aspose.slides.internal.k4y.p3h)var6.n5("push").l6();
               b5u.l6((ISideDirectionTransition)var0.getValue(), var17);
            }

            com.aspose.slides.internal.k4y.p3h var55 = (com.aspose.slides.internal.k4y.p3h)var9.n5("push").l6();
            b5u.l6((ISideDirectionTransition)var0.getValue(), var55);
            break;
         case 14:
            if (var6 != null) {
               var6.n5("random");
            }

            var9.n5("random");
            break;
         case 15:
            if (var6 != null) {
               com.aspose.slides.internal.k4y.f2b var18 = (com.aspose.slides.internal.k4y.f2b)var6.n5("randomBar").l6();
               v9o.l6((IOrientationTransition)var0.getValue(), var18);
            }

            com.aspose.slides.internal.k4y.f2b var56 = (com.aspose.slides.internal.k4y.f2b)var9.n5("randomBar").l6();
            v9o.l6((IOrientationTransition)var0.getValue(), var56);
            break;
         case 16:
            if (var6 != null) {
               com.aspose.slides.internal.k4y.w5g var19 = (com.aspose.slides.internal.k4y.w5g)var6.n5("split").l6();
               s1k.l6((ISplitTransition)var0.getValue(), var19);
            }

            com.aspose.slides.internal.k4y.w5g var57 = (com.aspose.slides.internal.k4y.w5g)var9.n5("split").l6();
            s1k.l6((ISplitTransition)var0.getValue(), var57);
            break;
         case 17:
            if (var6 != null) {
               com.aspose.slides.internal.k4y.f6b var20 = (com.aspose.slides.internal.k4y.f6b)var6.n5("strips").l6();
               n3o.l6((ICornerDirectionTransition)var0.getValue(), var20);
            }

            com.aspose.slides.internal.k4y.f6b var58 = (com.aspose.slides.internal.k4y.f6b)var9.n5("strips").l6();
            n3o.l6((ICornerDirectionTransition)var0.getValue(), var58);
            break;
         case 18:
            if (var6 != null) {
               var6.n5("wedge");
            }

            var9.n5("wedge");
            break;
         case 19:
            if (var6 != null) {
               com.aspose.slides.internal.k4y.o8h var21 = (com.aspose.slides.internal.k4y.o8h)var6.n5("wheel").l6();
               b2i.l6((IWheelTransition)var0.getValue(), var21);
            }

            com.aspose.slides.internal.k4y.o8h var59 = (com.aspose.slides.internal.k4y.o8h)var9.n5("wheel").l6();
            b2i.l6((IWheelTransition)var0.getValue(), var59);
            break;
         case 20:
            if (var6 != null) {
               com.aspose.slides.internal.k4y.p3h var22 = (com.aspose.slides.internal.k4y.p3h)var6.n5("wipe").l6();
               b5u.l6((ISideDirectionTransition)var0.getValue(), var22);
            }

            com.aspose.slides.internal.k4y.p3h var60 = (com.aspose.slides.internal.k4y.p3h)var9.n5("wipe").l6();
            b5u.l6((ISideDirectionTransition)var0.getValue(), var60);
            break;
         case 21:
            if (var6 != null) {
               com.aspose.slides.internal.k4y.p3u var23 = (com.aspose.slides.internal.k4y.p3u)var6.n5("zoom").l6();
               y2d.l6((IInOutTransition)var0.getValue(), var23);
            }

            com.aspose.slides.internal.k4y.p3u var61 = (com.aspose.slides.internal.k4y.p3u)var9.n5("zoom").l6();
            y2d.l6((IInOutTransition)var0.getValue(), var61);
            break;
         case 22:
            com.aspose.slides.internal.k4y.p3h var24 = (com.aspose.slides.internal.k4y.p3h)var6.n5("vortex").l6();
            b5u.l6((ISideDirectionTransition)var0.getValue(), var24);
            var9.n5("fade");
            break;
         case 23:
            com.aspose.slides.internal.k4y.s7n var25 = (com.aspose.slides.internal.k4y.s7n)var6.n5("switch").l6();
            v6z.l6((ILeftRightDirectionTransition)var0.getValue(), var25);
            var9.n5("fade");
            break;
         case 24:
            com.aspose.slides.internal.k4y.s7n var26 = (com.aspose.slides.internal.k4y.s7n)var6.n5("flip").l6();
            v6z.l6((ILeftRightDirectionTransition)var0.getValue(), var26);
            var9.n5("fade");
            break;
         case 25:
            com.aspose.slides.internal.k4y.q8s var27 = (com.aspose.slides.internal.k4y.q8s)var6.n5("ripple").l6();
            j9d.l6((IRippleTransition)var0.getValue(), var27);
            var9.n5("fade");
            break;
         case 26:
            var6.n5("honeycomb");
            var9.n5("fade");
            break;
         case 27:
         case 28:
         case 29:
         case 30:
            com.aspose.slides.internal.k4y.j1p var28 = (com.aspose.slides.internal.k4y.j1p)var6.n5("prism").l6();
            u7g.l6(var0, var28);
            var9.n5("fade");
            break;
         case 31:
            com.aspose.slides.internal.k4y.f2b var29 = (com.aspose.slides.internal.k4y.f2b)var6.n5("doors").l6();
            v9o.l6((IOrientationTransition)var0.getValue(), var29);
            var9.n5("fade");
            break;
         case 32:
            com.aspose.slides.internal.k4y.f2b var30 = (com.aspose.slides.internal.k4y.f2b)var6.n5("window").l6();
            v9o.l6((IOrientationTransition)var0.getValue(), var30);
            var9.n5("fade");
            break;
         case 33:
            com.aspose.slides.internal.k4y.s7n var31 = (com.aspose.slides.internal.k4y.s7n)var6.n5("ferris").l6();
            v6z.l6((ILeftRightDirectionTransition)var0.getValue(), var31);
            var9.n5("fade");
            break;
         case 34:
            com.aspose.slides.internal.k4y.s7n var32 = (com.aspose.slides.internal.k4y.s7n)var6.n5("gallery").l6();
            v6z.l6((ILeftRightDirectionTransition)var0.getValue(), var32);
            var9.n5("fade");
            break;
         case 35:
            com.aspose.slides.internal.k4y.s7n var33 = (com.aspose.slides.internal.k4y.s7n)var6.n5("conveyor").l6();
            v6z.l6((ILeftRightDirectionTransition)var0.getValue(), var33);
            var9.n5("fade");
            break;
         case 36:
            com.aspose.slides.internal.k4y.p3h var34 = (com.aspose.slides.internal.k4y.p3h)var6.n5("pan").l6();
            b5u.l6((ISideDirectionTransition)var0.getValue(), var34);
            var9.n5("fade");
            break;
         case 37:
            com.aspose.slides.internal.k4y.g4m var35 = (com.aspose.slides.internal.k4y.g4m)var6.n5("glitter").l6();
            r6r.l6((IGlitterTransition)var0.getValue(), var35);
            var9.n5("fade");
            break;
         case 38:
            com.aspose.slides.internal.k4y.p3u var36 = (com.aspose.slides.internal.k4y.p3u)var6.n5("warp").l6();
            y2d.l6((IInOutTransition)var0.getValue(), var36);
            var9.n5("fade");
            break;
         case 39:
            com.aspose.slides.internal.k4y.n1e var37 = (com.aspose.slides.internal.k4y.n1e)var6.n5("flythrough").l6();
            i5i.l6((IFlyThroughTransition)var0.getValue(), var37);
            var9.n5("fade");
            break;
         case 40:
            var6.n5("flash");
            var9.n5("fade");
            break;
         case 41:
            com.aspose.slides.internal.k4y.c6d var38 = (com.aspose.slides.internal.k4y.c6d)var6.n5("shred").l6();
            a9h.l6((IShredTransition)var0.getValue(), var38);
            var9.n5("fade");
            break;
         case 42:
            com.aspose.slides.internal.k4y.u8h var39 = (com.aspose.slides.internal.k4y.u8h)var6.n5("reveal").l6();
            r1w.l6((IRevealTransition)var0.getValue(), var39);
            var9.n5("fade");
            break;
         case 43:
            com.aspose.slides.internal.k4y.o8h var40 = (com.aspose.slides.internal.k4y.o8h)var6.n5("wheelReverse").l6();
            b2i.l6((IWheelTransition)var0.getValue(), var40);
            var9.n5("fade");
            break;
         case 44:
         case 45:
         case 46:
         case 47:
         case 48:
         case 49:
         case 50:
         case 51:
         case 52:
         case 53:
         case 54:
         case 55:
            com.aspose.slides.internal.k4y.n4i var41 = (com.aspose.slides.internal.k4y.n4i)var7.n5("prstTrans").l6();
            k7n.l6(var0, var41);
            var9.n5("fade");
            break;
         case 56:
            com.aspose.slides.internal.k4y.o5y var42 = (com.aspose.slides.internal.k4y.o5y)var8.n5("morph").l6();
            k7u.l6((IMorphTransition)var0.getValue(), var42);
            var9.n5("fade");
            break;
         default:
            throw new Exception();
      }

      switch (var0.getSpeed()) {
         case 0:
            if (var6 != null) {
               var6.n5(3);
            } else if (var7 != null) {
               var7.n5(3);
            } else if (var8 != null) {
               var8.n5(3);
            }

            var9.n5(3);
            break;
         case 1:
            if (var6 != null) {
               var6.n5(2);
            } else if (var7 != null) {
               var7.n5(2);
            } else if (var8 != null) {
               var8.n5(2);
            }

            var9.n5(2);
            break;
         case 2:
            if (var6 != null) {
               var6.n5(1);
            } else if (var7 != null) {
               var7.n5(1);
            } else if (var8 != null) {
               var8.n5(1);
            }

            var9.n5(1);
      }

      if (var6 != null) {
         var6.n5(var0.getAdvanceOnClick());
      } else if (var7 != null) {
         var7.n5(var0.getAdvanceOnClick());
      } else if (var8 != null) {
         var8.n5(var0.getAdvanceOnClick());
      }

      var9.n5(var0.getAdvanceOnClick());
      if (var0.getAdvanceAfter()) {
         if (var6 != null) {
            var6.n5(var0.getAdvanceAfterTime());
         } else if (var7 != null) {
            var7.n5(var0.getAdvanceAfterTime());
         } else if (var8 != null) {
            var8.n5(var0.getAdvanceAfterTime());
         }

         var9.n5(var0.getAdvanceAfterTime());
      }

      switch (var0.getSoundMode()) {
         case 0:
            if (var0.getSound() != null) {
               if (var6 != null) {
                  com.aspose.slides.internal.k4y.d5i var44 = var6.n5();
                  n5(var0, var44, var2);
               } else if (var7 != null) {
                  com.aspose.slides.internal.k4y.d5i var45 = var7.n5();
                  n5(var0, var45, var2);
               } else if (var8 != null) {
                  com.aspose.slides.internal.k4y.d5i var46 = var8.n5();
                  n5(var0, var46, var2);
               }

               com.aspose.slides.internal.k4y.d5i var47 = var9.n5();
               n5(var0, var47, var2);
            }
            break;
         case 1:
            if (var6 != null) {
               var6.n5().n5("endSnd");
            } else if (var7 != null) {
               var7.n5().n5("endSnd");
            } else if (var8 != null) {
               var8.n5().n5("endSnd");
            }

            var9.n5().n5("endSnd");
      }

      t6r var48 = ((SlideShowTransition)var0).n5();
      if (var6 != null) {
         var6.l6(var48.n5());
      } else if (var7 != null) {
         var7.l6(var48.n5());
      } else if (var8 != null) {
         var8.l6(var48.n5());
      }

      var9.l6(null);
      if (var6 != null) {
         var6.n5(var48.l6());
      } else if (var7 != null) {
         var7.n5(var48.l6());
      } else if (var8 != null) {
         var8.n5(var48.l6());
      }

      var9.n5(var48.l6());
   }

   private static void n5(ISlideShowTransition var0, com.aspose.slides.internal.k4y.d5i var1, g6c var2) {
      com.aspose.slides.internal.k4y.q6c var3 = (com.aspose.slides.internal.k4y.q6c)var1.n5("stSnd").l6();
      var3.n5(var0.getSoundLoop());
      if (var0.getSound() != null) {
         var3.l6().l6(var0.getSoundName());
      }

      var3.l6().n5(var0.getSoundIsBuiltIn());
      var3.l6().n5(var2.u6().l6(var2.n5(var0.getSound())).a6());
   }

   private static boolean n5(ISlideShowTransition var0) {
      if (!l6(var0) && !k5(var0)) {
         boolean var1;
         switch (var0.getType()) {
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
               var1 = true;
               break;
            default:
               var1 = false;
         }

         t6r var2 = ((SlideShowTransition)var0).n5();
         boolean var3 = var2.n5() != null && !"1000".equals(var2.n5());
         return var1 || var3;
      } else {
         return false;
      }
   }

   private static boolean l6(ISlideShowTransition var0) {
      boolean var1;
      switch (var0.getType()) {
         case 44:
         case 45:
         case 46:
         case 47:
         case 48:
         case 49:
         case 50:
         case 51:
         case 52:
         case 53:
         case 54:
         case 55:
            var1 = true;
            break;
         default:
            var1 = false;
      }

      return var1;
   }

   private static boolean k5(ISlideShowTransition var0) {
      boolean var1;
      switch (var0.getType()) {
         case 56:
            var1 = true;
            break;
         default:
            var1 = false;
      }

      return var1;
   }
}
