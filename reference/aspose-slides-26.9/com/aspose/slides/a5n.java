package com.aspose.slides;

class a5n {
   private static final int[] n5 = new int[28];

   public static void n5(t2s var0) {
      BaseSlide var1 = var0.y4();
      d5f var2 = var0.a6();
      com.aspose.slides.internal.k0r.l2p var3 = var0.t4();
      ISlideShowTransition var4 = var1.getSlideShowTransition();
      if (var3 != null) {
         if (com.aspose.slides.internal.v6g.k5.l6(var1, Slide.class)) {
            ((Slide)var1).setHidden(n5(var3, 'C'));
         }

         var4.setAdvanceOnClick(n5(var3, 'A'));
         if (n5(var3, 'K')) {
            var4.setAdvanceAfterTime(var3.l6() & 4294967295L);
         } else {
            var4.setAdvanceAfterTime(0L);
            var4.setAdvanceAfter(false);
         }

         if (var3.k5() != 0 && var2.k5().h0().s7() != null) {
            com.aspose.slides.internal.k0r.x6s var5 = var2.k5().h0().s7().n5(var3.k5());
            if (var5.u9() != null) {
               SlideShowTransition var6 = (SlideShowTransition)var4;
               var6.l6().n5(var3.k5() & 4294967295L);
               var4.setSound(var2.n5(var5));
               var4.setSoundIsBuiltIn(false);
            }
         }

         var4.setSoundLoop(n5(var3, 'G'));
         if (n5(var3, 'I')) {
            var4.setSoundMode(1);
         } else if (n5(var3, 'E')) {
            var4.setSoundMode(0);
         } else {
            var4.setSoundMode(-1);
         }

         var4.setType(n5(var3));
         n5(var4, var3);
         switch (var3.h0()) {
            case 0:
               var4.setSpeed(2);
               break;
            case 1:
               var4.setSpeed(1);
               break;
            case 2:
               var4.setSpeed(0);
         }
      }
   }

   private static int n5(com.aspose.slides.internal.k0r.l2p var0) {
      if ((var0.a6() & 255) == 0 && (var0.u3() & 255) == 2) {
         return 0;
      } else {
         return (var0.a6() & 0xFF) < n5.length ? n5[var0.a6() & 0xFF] : 0;
      }
   }

   public static void n5(y2q var0) {
      BaseSlide var1 = var0.l6();
      com.aspose.slides.internal.k0r.o8 var2 = (com.aspose.slides.internal.k0r.o8)var0.u3();
      g6o var3 = var0.n5();
      ISlideShowTransition var4 = var1.getSlideShowTransition();
      var2.l6(true);
      if (com.aspose.slides.internal.v6g.k5.l6(var1, Slide.class) && ((Slide)var1).getHidden()) {
         n5(var2.q0(), 'C', true);
      }

      if (var4.getType() != 0 || var4.getSound() != null) {
         com.aspose.slides.internal.k0r.l2p var5 = var2.q0();
         var5.n5((int)var4.getAdvanceAfterTime());
         n5(var5, 'K', var4.getAdvanceAfter());
         n5(var5, 'A', var4.getAdvanceOnClick());
         if (var4.getSound() != null) {
            var5.l6(e0j.n5(var4.getSound(), var3));
         }

         n5(var5, 'G', var4.getSoundLoop());
         switch (var4.getSoundMode()) {
            case -1:
               n5(var5, 'I', false);
               n5(var5, 'E', false);
               break;
            case 0:
               n5(var5, 'I', false);
               n5(var5, 'E', true);
               break;
            case 1:
               n5(var5, 'I', true);
               n5(var5, 'E', false);
         }

         var5.l6(var4.getType() != 0 ? (byte)com.aspose.slides.ms.System.u3.l6(com.aspose.slides.ms.System.u3.n5((Object)(n5)), var4.getType()) : -1);
         l6(var4, var5);
         switch (var4.getSpeed()) {
            case 0:
               var5.k5((byte)2);
               break;
            case 1:
               var5.k5((byte)1);
               break;
            case 2:
               var5.k5((byte)0);
         }

         var5.c8();
      }
   }

   private static boolean n5(com.aspose.slides.internal.k0r.l2p var0, char var1) {
      int var2 = var1 - 'A';
      return (var0.u9() & 65535 & 1 << var2) != 0;
   }

   private static void n5(com.aspose.slides.internal.k0r.l2p var0, char var1, boolean var2) {
      int var3 = var1 - 'A';
      int var4 = 1 << var3 & 65535;
      if (var2) {
         var0.k5((var0.u9() & 65535 | var4 & 65535) & 65535);
      } else {
         var0.k5(var0.u9() & 65535 & ~(var4 & 65535) & 65535);
      }
   }

   private static void n5(ISlideShowTransition var0, com.aspose.slides.internal.k0r.l2p var1) {
      switch (var0.getType()) {
         case 1:
            OrientationTransition var15 = com.aspose.slides.internal.v6g.k5.n5(var0.getValue(), OrientationTransition.class);
            switch (var1.u3()) {
               case 0:
                  var15.setDirection((byte)1);
                  return;
               case 1:
                  var15.setDirection((byte)0);
                  return;
               default:
                  return;
            }
         case 2:
            OrientationTransition var14 = com.aspose.slides.internal.v6g.k5.n5(var0.getValue(), OrientationTransition.class);
            switch (var1.u3()) {
               case 0:
                  var14.setDirection((byte)0);
                  break;
               case 1:
                  var14.setDirection((byte)1);
            }
         case 3:
         case 7:
         case 8:
         case 10:
         case 11:
         case 14:
         case 18:
         default:
            break;
         case 4:
            OrientationTransition var13 = com.aspose.slides.internal.v6g.k5.n5(var0.getValue(), OrientationTransition.class);
            switch (var1.u3()) {
               case 0:
                  var13.setDirection((byte)0);
                  return;
               case 1:
                  var13.setDirection((byte)1);
                  return;
               default:
                  return;
            }
         case 5:
            EightDirectionTransition var12 = com.aspose.slides.internal.v6g.k5.n5(var0.getValue(), EightDirectionTransition.class);
            switch (var1.u3()) {
               case 0:
                  var12.setDirection(4);
                  return;
               case 1:
                  var12.setDirection(5);
                  return;
               case 2:
                  var12.setDirection(7);
                  return;
               case 3:
                  var12.setDirection(6);
                  return;
               case 4:
                  var12.setDirection(1);
                  return;
               case 5:
                  var12.setDirection(3);
                  return;
               case 6:
                  var12.setDirection(0);
                  return;
               case 7:
                  var12.setDirection(2);
                  return;
               default:
                  return;
            }
         case 6:
            OptionalBlackTransition var11 = com.aspose.slides.internal.v6g.k5.n5(var0.getValue(), OptionalBlackTransition.class);
            var11.setFromBlack((var1.u3() & 255) == 1);
            break;
         case 9:
            OptionalBlackTransition var10 = com.aspose.slides.internal.v6g.k5.n5(var0.getValue(), OptionalBlackTransition.class);
            var10.setFromBlack((var1.a6() & 255) == 6);
            break;
         case 12:
            EightDirectionTransition var9 = com.aspose.slides.internal.v6g.k5.n5(var0.getValue(), EightDirectionTransition.class);
            switch (var1.u3()) {
               case 0:
                  var9.setDirection(4);
                  return;
               case 1:
                  var9.setDirection(5);
                  return;
               case 2:
                  var9.setDirection(7);
                  return;
               case 3:
                  var9.setDirection(6);
                  return;
               case 4:
                  var9.setDirection(1);
                  return;
               case 5:
                  var9.setDirection(3);
                  return;
               case 6:
                  var9.setDirection(0);
                  return;
               case 7:
                  var9.setDirection(2);
                  return;
               default:
                  return;
            }
         case 13:
            SideDirectionTransition var8 = com.aspose.slides.internal.v6g.k5.n5(var0.getValue(), SideDirectionTransition.class);
            switch (var1.u3()) {
               case 0:
                  var8.setDirection(0);
                  return;
               case 1:
                  var8.setDirection(1);
                  return;
               case 2:
                  var8.setDirection(3);
                  return;
               case 3:
                  var8.setDirection(2);
                  return;
               default:
                  return;
            }
         case 15:
            OrientationTransition var7 = com.aspose.slides.internal.v6g.k5.n5(var0.getValue(), OrientationTransition.class);
            switch (var1.u3()) {
               case 0:
                  var7.setDirection((byte)0);
                  return;
               case 1:
                  var7.setDirection((byte)1);
                  return;
               default:
                  return;
            }
         case 16:
            SplitTransition var6 = com.aspose.slides.internal.v6g.k5.n5(var0.getValue(), SplitTransition.class);
            switch (var1.u3()) {
               case 0:
                  var6.setOrientation((byte)0);
                  var6.setDirection(1);
                  return;
               case 1:
                  var6.setOrientation((byte)0);
                  var6.setDirection(0);
                  return;
               case 2:
                  var6.setOrientation((byte)1);
                  var6.setDirection(1);
                  return;
               case 3:
                  var6.setOrientation((byte)1);
                  var6.setDirection(0);
                  return;
               default:
                  return;
            }
         case 17:
            CornerDirectionTransition var5 = com.aspose.slides.internal.v6g.k5.n5(var0.getValue(), CornerDirectionTransition.class);
            switch (var1.u3()) {
               case 4:
                  var5.setDirection(1);
                  return;
               case 5:
                  var5.setDirection(3);
                  return;
               case 6:
                  var5.setDirection(0);
                  return;
               case 7:
                  var5.setDirection(2);
                  return;
               default:
                  return;
            }
         case 19:
            WheelTransition var4 = com.aspose.slides.internal.v6g.k5.n5(var0.getValue(), WheelTransition.class);
            if ((var1.u3() & 255) == 1 || (var1.u3() & 255) == 2 || (var1.u3() & 255) == 3 || (var1.u3() & 255) == 4 || (var1.u3() & 255) == 8) {
               var4.setSpokes(var1.u3() & 0xFF);
            }
            break;
         case 20:
            SideDirectionTransition var3 = com.aspose.slides.internal.v6g.k5.n5(var0.getValue(), SideDirectionTransition.class);
            switch (var1.u3()) {
               case 0:
                  var3.setDirection(0);
                  return;
               case 1:
                  var3.setDirection(1);
                  return;
               case 2:
                  var3.setDirection(3);
                  return;
               case 3:
                  var3.setDirection(2);
                  return;
               default:
                  return;
            }
         case 21:
            InOutTransition var2 = com.aspose.slides.internal.v6g.k5.n5(var0.getValue(), InOutTransition.class);
            switch (var1.u3()) {
               case 0:
                  var2.setDirection(1);
                  break;
               case 1:
                  var2.setDirection(0);
            }
      }
   }

   private static void l6(ISlideShowTransition var0, com.aspose.slides.internal.k0r.l2p var1) {
      switch (var0.getType()) {
         case 1:
            OrientationTransition var11 = com.aspose.slides.internal.v6g.k5.n5(var0.getValue(), OrientationTransition.class);
            var1.n5((byte)(var11.getDirection() == 0 ? 1 : 0));
            break;
         case 2:
         case 4:
         case 15:
            OrientationTransition var10 = com.aspose.slides.internal.v6g.k5.n5(var0.getValue(), OrientationTransition.class);
            var1.n5((byte)(var10.getDirection() == 1 ? 1 : 0));
         case 3:
         case 7:
         case 8:
         case 10:
         case 11:
         case 14:
         case 18:
         default:
            break;
         case 5:
         case 12:
            EightDirectionTransition var9 = com.aspose.slides.internal.v6g.k5.n5(var0.getValue(), EightDirectionTransition.class);
            switch (var9.getDirection()) {
               case 0:
                  var1.n5((byte)6);
                  return;
               case 1:
                  var1.n5((byte)4);
                  return;
               case 2:
                  var1.n5((byte)7);
                  return;
               case 3:
                  var1.n5((byte)5);
                  return;
               case 4:
                  var1.n5((byte)0);
                  return;
               case 5:
                  var1.n5((byte)1);
                  return;
               case 6:
                  var1.n5((byte)3);
                  return;
               case 7:
                  var1.n5((byte)2);
                  return;
               default:
                  return;
            }
         case 6:
            OptionalBlackTransition var8 = com.aspose.slides.internal.v6g.k5.n5(var0.getValue(), OptionalBlackTransition.class);
            var1.n5((byte)(var8.getFromBlack() ? 1 : 0));
            break;
         case 9:
            OptionalBlackTransition var7 = com.aspose.slides.internal.v6g.k5.n5(var0.getValue(), OptionalBlackTransition.class);
            var1.l6((byte)(var7.getFromBlack() ? 6 : 23));
            var1.n5((byte)0);
            break;
         case 13:
         case 20:
            SideDirectionTransition var6 = com.aspose.slides.internal.v6g.k5.n5(var0.getValue(), SideDirectionTransition.class);
            switch (var6.getDirection()) {
               case 0:
                  var1.n5((byte)0);
                  return;
               case 1:
                  var1.n5((byte)1);
                  return;
               case 2:
                  var1.n5((byte)3);
                  return;
               case 3:
                  var1.n5((byte)2);
                  return;
               default:
                  return;
            }
         case 16:
            SplitTransition var5 = com.aspose.slides.internal.v6g.k5.n5(var0.getValue(), SplitTransition.class);
            if (var5.getOrientation() == 0) {
               var1.n5((byte)(var5.getDirection() == 0 ? 1 : 0));
            } else {
               var1.n5((byte)(var5.getDirection() == 0 ? 3 : 2));
            }
            break;
         case 17:
            CornerDirectionTransition var4 = com.aspose.slides.internal.v6g.k5.n5(var0.getValue(), CornerDirectionTransition.class);
            switch (var4.getDirection()) {
               case 0:
                  var1.n5((byte)6);
                  return;
               case 1:
                  var1.n5((byte)4);
                  return;
               case 2:
                  var1.n5((byte)7);
                  return;
               case 3:
                  var1.n5((byte)5);
                  return;
               default:
                  return;
            }
         case 19:
            WheelTransition var3 = com.aspose.slides.internal.v6g.k5.n5(var0.getValue(), WheelTransition.class);
            var1.n5((byte)var3.getSpokes());
            break;
         case 21:
            InOutTransition var2 = com.aspose.slides.internal.v6g.k5.n5(var0.getValue(), InOutTransition.class);
            var1.n5((byte)(var2.getDirection() == 0 ? 1 : 0));
      }
   }

   static {
      n5[0] = 6;
      n5[1] = 14;
      n5[2] = 1;
      n5[3] = 2;
      n5[4] = 5;
      n5[5] = 8;
      n5[6] = 9;
      n5[7] = 12;
      n5[8] = 15;
      n5[9] = 17;
      n5[10] = 20;
      n5[11] = 21;
      n5[13] = 16;
      n5[17] = 7;
      n5[18] = 11;
      n5[19] = 18;
      n5[20] = 13;
      n5[21] = 4;
      n5[22] = 10;
      n5[23] = 9;
      n5[26] = 19;
      n5[27] = 3;
   }
}
