package com.aspose.slides;

import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

class h6i {
   public static k7p n5(ISequence var0, e9 var1) {
      j2m[] var2 = new j2m[var0.getCount()];

      for (int var3 = 0; var3 < var0.getCount(); var3++) {
         Effect var4 = (Effect)var0.get_Item(var3);
         j2m var5 = null;
         List var6 = new List();
         IBehavior var7 = null;
         IBehaviorCollection var8 = var4.getBehaviors();

         for (int var9 = 0; var9 < var8.getCount(); var9++) {
            IBehavior var10 = var8.get_Item(var9);
            double var11 = n5(var10.getTiming().getDuration(), var4.getTiming().getTriggerType() == 1 ? var1.n5() : -1.0F);
            if (var4.getType() == 140 && var9 + 1 == var8.getCount() && com.aspose.slides.internal.v6g.k5.l6(var10, RotationEffect.class)) {
               var10 = new RotationEffect();
               ((RotationEffect)var10).setBy(var4.getTargetShape().getRotation());
               var10.setTiming(var10.getTiming());
            }

            j2m var13;
            if (var4.getType() == 16) {
               var13 = n5(var4, var1, var10, var11);
            } else if (var4.u3 >= 0) {
               var13 = n5(var4, var1, var10, var11);
            } else {
               var13 = n5((Shape)var4.getTargetShape(), var1, var7, var10, var11);
            }

            if (var13 != null) {
               var13 = n5(var13, var10.getTiming());
               var6.addItem(var13);
            }

            var7 = var10;
         }

         if (var6.size() > 0) {
            if (var6.size() == 1) {
               var5 = (j2m)var6.get_Item(0);
            } else {
               var5 = new b3d(var6);
            }
         }

         if (var5 != null) {
            var5 = n5(var5, var4.getTiming());
            if (var4.getTiming().getTriggerType() == 2 && var3 >= 1) {
               int var21;
               for (var21 = var3 - 1; var21 >= 0; var21--) {
                  Effect var22 = (Effect)var0.get_Item(var21);
                  if (var22.getTiming().getTriggerType() != 2 || var22.getTiming().getTriggerType() == 2 && var21 == 0) {
                     break;
                  }
               }

               if (var21 >= 0 && var2[var21] != null) {
                  j2m var23 = var2[var21];
                  if (com.aspose.slides.internal.v6g.k5.l6(var23, b3d.class)) {
                     com.aspose.slides.internal.v6g.k5.n5(var23, b3d.class).n5(var5);
                  } else {
                     b3d var14 = new b3d();
                     var14.n5(var23);
                     var14.n5(var5);
                     var2[var21] = var14;
                  }

                  var2[var3] = null;
               } else {
                  var2[var3] = var5;
               }
            } else {
               var2[var3] = var5;
            }
         }
      }

      k7p var15 = null;

      for (j2m var20 : var2) {
         if (var20 != null) {
            if (var15 == null) {
               var15 = new k7p();
            }

            var15.n5(var20);
         }
      }

      return var15;
   }

   private static j2m n5(j2m var0, ITiming var1) {
      if (var1.getAccelerate() > 0.0F || var1.getDecelerate() > 0.0F) {
         var0 = new l6(var0, var1.getAccelerate(), var1.getDecelerate());
      }

      int var2 = com.aspose.slides.ms.System.n1.a6(var1.getRepeatCount()) ? 0 : com.aspose.slides.internal.v6g.k5.u3(var1.getRepeatCount(), 13);
      if (var2 > 1) {
         var0 = new a8k(var0, var2);
      }

      if (var1.getAutoReverse()) {
         var0 = new q1(var0);
      }

      if (var1.getTriggerDelayTime() > 0.0F) {
         var0 = new w1y(var0, n5(var1.getTriggerDelayTime()));
      }

      return var0;
   }

   private static j2m n5(Shape var0, e9 var1, IBehavior var2, IBehavior var3, double var4) {
      if (com.aspose.slides.internal.v6g.k5.l6(var3, MotionEffect.class)) {
         return n5(var1, (MotionEffect)var3, var0, var4);
      }

      if (com.aspose.slides.internal.v6g.k5.l6(var3, RotationEffect.class)) {
         RotationEffect var18 = (RotationEffect)var3;
         i6x var21 = new i6x(var0);
         var21.k5 = var18.getBy();
         if (com.aspose.slides.internal.v6g.k5.l6(var2, RotationEffect.class)) {
            RotationEffect var22 = (RotationEffect)var2;
            var21.l6 = var22.getBy();
         }

         return new u5j(var21, var4);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var3, FilterEffect.class)) {
         FilterEffect var17 = (FilterEffect)var3;
         l8k var20 = null;
         switch (var17.getType()) {
            case 1:
            case 17:
            case 18:
               var20 = i7.n5(var0, var1, var17);
               break;
            case 2:
               var20 = s6.n5(var0, var1, var17);
               break;
            case 3:
            case 5:
            case 6:
            case 11:
               var20 = d7u.n5(var0, var1, var17);
            case 4:
            case 7:
            case 9:
            case 10:
            case 13:
            case 14:
            case 15:
            case 16:
            default:
               break;
            case 8:
               var20 = t3c.n5(var0, var1, var17.getReveal() == 1);
               break;
            case 12:
               var20 = q1l.n5(var0, var1, var17.getSubtype() == 9, var17.getReveal() == 1);
         }

         return var20 != null ? new u5j(var20, var4) : null;
      } else {
         if (com.aspose.slides.internal.v6g.k5.l6(var3, f6w.class)) {
            b3q var16 = new b3q(var0, (f6w)var3);
            return new u5j(var16, var4);
         }

         if (com.aspose.slides.internal.v6g.k5.l6(var3, PropertyEffect.class)) {
            l8k var15 = PropertyEffectPlaying.n5(var1, var0, (PropertyEffect)var3);
            return var15 != null ? new u5j(var15, var4) : null;
         }

         if (com.aspose.slides.internal.v6g.k5.l6(var3, ScaleEffect.class)) {
            ScaleEffect var14 = com.aspose.slides.internal.v6g.k5.n5(var3, ScaleEffect.class);
            com.aspose.slides.internal.o9b.w1 var19 = var14.l6().u3();
            com.aspose.slides.internal.o9b.w1 var8 = var14.k5().u3();
            com.aspose.slides.internal.o9b.w1 var9 = var14.u3().u3();
            d2k var10 = d2k.u3.u3();
            d2k var11 = d2k.k5.u3();
            if (!com.aspose.slides.ms.System.n1.k5(var19.l6()) && !com.aspose.slides.ms.System.n1.k5(var19.k5())) {
               d2k.n5(new d2k(var19.l6(), var19.k5()), 0.01F).n5(var10);
            }

            if (!com.aspose.slides.ms.System.n1.k5(var8.l6()) && !com.aspose.slides.ms.System.n1.k5(var8.k5())) {
               var11 = new d2k(var8.l6(), var8.k5());
            } else if (!com.aspose.slides.ms.System.n1.k5(var9.l6()) && !com.aspose.slides.ms.System.n1.k5(var9.k5())) {
               var11 = new d2k(var9.l6(), var9.k5());
            }

            if (d2k.u3(var11, d2k.k5)) {
               w3n var12 = new w3n(var1, var0, var10.u3(), d2k.n5(var11, 0.01F).u3());
               return new u5j(var12, var4);
            } else {
               return null;
            }
         } else {
            if (com.aspose.slides.internal.v6g.k5.l6(var3, SetEffect.class)) {
               a4q var13 = a4q.n5(var0, (SetEffect)var3);
               return var13 != null ? new u5j(var13, var4) : null;
            }

            if (com.aspose.slides.internal.v6g.k5.l6(var3, ColorEffect.class)) {
               ColorEffect var6 = (ColorEffect)var3;
               if (v4m.n5(var6)) {
                  v4m var7 = new v4m(var0, var6);
                  return new u5j(var7, var4);
               } else {
                  return null;
               }
            } else {
               return null;
            }
         }
      }
   }

   private static j2m n5(Effect var0, e9 var1, IBehavior var2, double var3) {
      Shape var5 = (Shape)var0.getTargetShape();
      if (com.aspose.slides.internal.v6g.k5.l6(var2, FilterEffect.class)) {
         FilterEffect var11 = (FilterEffect)var2;
         l8k var12 = null;
         switch (var11.getType()) {
            case 1:
            case 17:
            case 18:
               var12 = i7.n5(var0.n5(), var5, var1, var11);
               break;
            case 2:
               var12 = s6.n5(var0.n5(), var5, var1, var11);
               break;
            case 3:
            case 5:
            case 6:
            case 11:
               var12 = d7u.n5(var0.n5(), var5, var1, var11);
            case 4:
            case 7:
            case 9:
            case 10:
            case 13:
            case 14:
            case 15:
            case 16:
            default:
               break;
            case 8:
               var12 = t3c.n5(var0.n5(), var5, var1, var11.getReveal() == 1);
               break;
            case 12:
               var12 = q1l.n5(var0.n5(), var5, var1, var11.getSubtype() == 9, var11.getReveal() == 1);
         }

         return var12 != null ? new u5j(var12, var3) : null;
      } else {
         if (com.aspose.slides.internal.v6g.k5.l6(var2, SetEffect.class)) {
            a4q var10 = a4q.n5(var5, new com.aspose.slides.internal.u0.n5<>(var0.u3, var0.a6), (SetEffect)var2);
            return var10 != null ? new u5j(var10, var3) : null;
         }

         if (com.aspose.slides.internal.v6g.k5.l6(var2, ColorEffect.class) && com.aspose.slides.internal.v6g.k5.l6(var5, AutoShape.class)) {
            ColorEffect var6 = (ColorEffect)var2;
            if (j5f.n5(var6)) {
               AutoShape var7 = (AutoShape)var5;
               if (var0.u3 >= 0 && var0.a6 >= 0) {
                  j5f var13 = new j5f(var0.u3, var0.a6, var7, var6);
                  return new u5j(var13, var3);
               }

               IParagraphCollection var8 = var7.getTextFrame().getParagraphs();
               if (var8.getCount() > 0) {
                  j5f var9 = new j5f(0, var8.getCount() - 1, var7, var6);
                  return new u5j(var9, var3);
               }
            }

            return null;
         } else {
            return null;
         }
      }
   }

   private static j2m n5(e9 var0, MotionEffect var1, IShape var2, double var3) {
      w5j var5 = new w5j(var2);
      IMotionPath var6 = var1.getPath();
      if (var6 != null) {
         return n5(var0, var2, var6, var3, new h6i$1(var5));
      }

      d2k var7 = var5.n5(var1.l6().u3()).u3();
      d2k var8 = var5.n5(var1.k5().u3()).u3();
      l0h var9 = new l0h(var7.u3(), d2k.l6(var8, var7).u3());
      MovePlayer var10 = new MovePlayer(var0, var2, new h6i$2(var9));
      return new u5j(var10, var3);
   }

   private static j2m n5(e9 var0, IShape var1, IMotionPath var2, double var3, com.aspose.slides.internal.f3.u3<com.aspose.slides.internal.o9b.w1, d2k> var5) {
      List var6 = new List();
      double var7 = 0.0;
      d2k var9 = ((d2k)var5.invoke(new com.aspose.slides.internal.o9b.w1(0.0F, 0.0F))).u3();

      for (int var10 = 0; var10 < var2.getCount(); var10++) {
         MotionCmdPath var11 = (MotionCmdPath)var2.get_Item(var10);
         if (var11.getCommandType() == 0) {
            ((d2k)var5.invoke(var11.n5()[0].u3())).n5(var9);
         } else if (var11.getCommandType() == 1) {
            d2k var12 = ((d2k)var5.invoke(var11.n5()[0].u3())).u3();
            l0h var13 = new l0h(var9.u3(), d2k.l6(var12, var9).u3());
            var12.n5(var9);
            double var14 = var13.l6.k5();
            var7 += var14;
            MovePlayer var16 = new MovePlayer(var0, var1, new h6i$3(var13));
            var6.addItem(new KeyValuePair<>(var14, var16));
         } else if (var11.getCommandType() == 2) {
            d2k var28 = ((d2k)var5.invoke(var11.n5()[2].u3())).u3();
            e8 var31 = new e8();
            var9.n5(var31.n5);
            ((d2k)var5.invoke(var11.n5()[0].u3())).n5(var31.l6);
            ((d2k)var5.invoke(var11.n5()[1].u3())).n5(var31.k5);
            var28.n5(var31.u3);
            var28.n5(var9);
            double var33 = var31.n5();
            var7 += var33;
            MovePlayer var34 = new MovePlayer(var0, var1, new h6i$4(var31));
            var6.addItem(new KeyValuePair<>(var33, var34));
         }
      }

      if (var6.size() <= 0) {
         return null;
      }

      double var17 = 0.0;
      if (var7 > 0.0) {
         var17 = 1.0 / var7;
      }

      if (var6.size() == 1) {
         KeyValuePair var30 = ((KeyValuePair)var6.get_Item(0)).Clone();
         return new u5j((l8k)var30.getValue(), var3);
      }

      k7p var29 = new k7p();
      List$Enumerator var32 = var6.iterator();

      try {
         while (var32.hasNext()) {
            KeyValuePair var19 = (KeyValuePair)var32.next();
            MovePlayer var20 = (MovePlayer)var19.getValue();
            double var21 = (Double)var19.getKey();
            double var23 = var21 * var17;
            var29.n5(new u5j(var20, var3 * var23));
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var32, IDisposable.class)) {
            var32.dispose();
         }
      }

      return var29;
   }

   private static double n5(float var0) {
      return n5(var0, -1.0F);
   }

   private static double n5(float var0, float var1) {
      if (com.aspose.slides.ms.System.n1.l6(var0)) {
         return 500.0;
      } else {
         return var1 > 0.0F && var0 == 0.001F ? var1 : 1000.0 * var0;
      }
   }
}
