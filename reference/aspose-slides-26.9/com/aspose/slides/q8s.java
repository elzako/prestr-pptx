package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

class q8s {
   private static int n5 = 0;
   private static int l6 = 2;

   public static int n5(ISlide var0) {
      int var1 = 0;

      for (int var2 = 0; var2 < var0.getSlideNumber(); var2++) {
         if (var0.getPresentation().getSlides().get_Item(var2).getHidden()) {
            var1++;
         }
      }

      return var0.getSlideNumber() - var1;
   }

   public static String l6(ISlide var0) {
      String var1 = "";
      switch (var0.getSlideShowTransition().getType()) {
         case 4:
            var1 = com.aspose.slides.ms.System.s3.n5(Orientation.class, ((IOrientationTransition)var0.getSlideShowTransition().getValue()).getDirection());
            break;
         case 5:
         case 12:
            var1 = com.aspose.slides.ms.System.s3.n5(
               TransitionEightDirectionType.class, ((IEightDirectionTransition)var0.getSlideShowTransition().getValue()).getDirection()
            );
         case 6:
         case 7:
         case 8:
         case 9:
         case 10:
         case 11:
         case 14:
         case 17:
         case 18:
         case 19:
         case 22:
         case 25:
         case 26:
         case 31:
         case 32:
         case 37:
         case 40:
         case 41:
         default:
            break;
         case 13:
         case 20:
         case 27:
         case 28:
         case 29:
         case 30:
         case 36:
            var1 = com.aspose.slides.ms.System.s3.n5(
               TransitionSideDirectionType.class, ((ISideDirectionTransition)var0.getSlideShowTransition().getValue()).getDirection()
            );
            break;
         case 15:
            var1 = com.aspose.slides.ms.System.s3.n5(Orientation.class, ((IOrientationTransition)var0.getSlideShowTransition().getValue()).getDirection());
            break;
         case 16:
            var1 = com.aspose.slides.ms.System.s3.n5(
               TransitionInOutDirectionType.class, ((ISplitTransition)var0.getSlideShowTransition().getValue()).getDirection()
            );
            break;
         case 21:
         case 38:
            var1 = com.aspose.slides.ms.System.s3.n5(
               TransitionInOutDirectionType.class, ((IInOutTransition)var0.getSlideShowTransition().getValue()).getDirection()
            );
            break;
         case 23:
         case 24:
         case 33:
         case 34:
         case 35:
            var1 = com.aspose.slides.ms.System.s3.n5(
               TransitionLeftRightDirectionType.class, ((ILeftRightDirectionTransition)var0.getSlideShowTransition().getValue()).getDirection()
            );
            break;
         case 39:
            var1 = com.aspose.slides.ms.System.s3.n5(
               TransitionInOutDirectionType.class, ((IFlyThroughTransition)var0.getSlideShowTransition().getValue()).getDirection()
            );
            break;
         case 42:
            var1 = com.aspose.slides.ms.System.s3.n5(
               TransitionLeftRightDirectionType.class, ((IRevealTransition)var0.getSlideShowTransition().getValue()).getDirection()
            );
      }

      return var1;
   }

   public static String k5(ISlide var0) {
      String var1 = "";
      if (var0.getSlideShowTransition().getType() == 39) {
         var1 = ((IFlyThroughTransition)var0.getSlideShowTransition().getValue()).hasBounce() ? "HasBounce" : "";
      } else if (var0.getSlideShowTransition().getType() == 42) {
         var1 = ((IRevealTransition)var0.getSlideShowTransition().getValue()).getThroughBlack() ? "ThroughBlack" : "";
      } else if (var0.getSlideShowTransition().getType() == 16) {
         var1 = com.aspose.slides.ms.System.s3.n5(Orientation.class, ((ISplitTransition)var0.getSlideShowTransition().getValue()).getOrientation());
      }

      return var1;
   }

   public static Dictionary<IShape, List<m0j<String, String, Float, Float, String, String, Integer, z6>>> u3(ISlide var0) {
      Dictionary var1 = new Dictionary();
      int var2 = 0;
      var2 = n5(var0.getLayoutSlide().getMasterSlide().getTimeline().getMainSequence(), var1, null, var2);
      var2 = n5(var0.getLayoutSlide().getTimeline().getMainSequence(), var1, null, var2);
      var2 = n5(var0.getTimeline().getMainSequence(), var1, null, var2);
      IGenericEnumerator var3 = var0.getLayoutSlide().getMasterSlide().getTimeline().getInteractiveSequences().iterator();

      try {
         while (var3.hasNext()) {
            ISequence var4 = (ISequence)var3.next();
            n5(var4, var1, null, -1);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      IGenericEnumerator var23 = var0.getLayoutSlide().getTimeline().getInteractiveSequences().iterator();

      try {
         while (var23.hasNext()) {
            ISequence var5 = (ISequence)var23.next();
            n5(var5, var1, null, -1);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var23, IDisposable.class)) {
            var23.dispose();
         }
      }

      IGenericEnumerator var24 = var0.getTimeline().getInteractiveSequences().iterator();

      try {
         while (var24.hasNext()) {
            ISequence var6 = (ISequence)var24.next();
            n5(var6, var1, null, -1);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var24, IDisposable.class)) {
            var24.dispose();
         }
      }

      return var1;
   }

   public static Dictionary<IParagraph, m0j<String, String, Float, Float, String, String, Integer, z6>> a6(ISlide var0) {
      Dictionary var1 = new Dictionary();
      int var2 = 0;
      var2 = n5(var0.getLayoutSlide().getMasterSlide().getTimeline().getMainSequence(), null, var1, var2);
      var2 = n5(var0.getLayoutSlide().getTimeline().getMainSequence(), null, var1, var2);
      var2 = n5(var0.getTimeline().getMainSequence(), null, var1, var2);
      IGenericEnumerator var3 = var0.getLayoutSlide().getMasterSlide().getTimeline().getInteractiveSequences().iterator();

      try {
         while (var3.hasNext()) {
            ISequence var4 = (ISequence)var3.next();
            n5(var4, null, var1, -1);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      IGenericEnumerator var23 = var0.getLayoutSlide().getTimeline().getInteractiveSequences().iterator();

      try {
         while (var23.hasNext()) {
            ISequence var5 = (ISequence)var23.next();
            n5(var5, null, var1, -1);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var23, IDisposable.class)) {
            var23.dispose();
         }
      }

      IGenericEnumerator var24 = var0.getTimeline().getInteractiveSequences().iterator();

      try {
         while (var24.hasNext()) {
            ISequence var6 = (ISequence)var24.next();
            n5(var6, null, var1, -1);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var24, IDisposable.class)) {
            var24.dispose();
         }
      }

      return var1;
   }

   private static int n5(
      ISequence var0,
      Dictionary<IShape, List<m0j<String, String, Float, Float, String, String, Integer, z6>>> var1,
      Dictionary<IParagraph, m0j<String, String, Float, Float, String, String, Integer, z6>> var2,
      int var3
   ) {
      float var4 = 0.0F;
      float var5 = 0.0F;
      IGenericEnumerator var6 = var0.iterator();

      try {
         while (var6.hasNext()) {
            IEffect var7 = (IEffect)var6.next();
            IShape var8 = var7.getTargetShape();
            int var9 = var7.getPresetClassType();
            int var10 = var7.getType();
            int var11 = var7.getSubtype();
            int var12 = var7.getTiming().getTriggerType();
            float var13 = var7.getTiming().getTriggerDelayTime();
            String var14 = "";
            IColorFormat var15 = null;
            String var16 = null;
            float var17 = 0.0F;
            IGenericEnumerator var18 = var7.getBehaviors().iterator();

            try {
               while (var18.hasNext()) {
                  IBehavior var19 = (IBehavior)var18.next();
                  if (com.aspose.slides.ms.System.j8.n5(var19) == com.aspose.slides.internal.v6g.k5.n5(ColorEffect.class)) {
                     var15 = ((ColorEffect)var19).getTo();
                  }

                  if (com.aspose.slides.ms.System.j8.n5(var19) == com.aspose.slides.internal.v6g.k5.n5(SetEffect.class)
                     && com.aspose.slides.internal.v6g.k5.l6(((SetEffect)var19).getTo(), IColorFormat.class)) {
                     var15 = (IColorFormat)((SetEffect)var19).getTo();
                     var17 = var19.getTiming().getDuration();
                     break;
                  }

                  if (var10 == 145 && com.aspose.slides.ms.System.j8.n5(var19) == com.aspose.slides.internal.v6g.k5.n5(MotionEffect.class)) {
                     var16 = ((MotionEffect)var19).a6().toString();
                  }

                  if (var10 == 142 && com.aspose.slides.ms.System.j8.n5(var19) == com.aspose.slides.internal.v6g.k5.n5(SetEffect.class)) {
                     var16 = ((SetEffect)var19).getTo().toString();
                  }

                  if (var10 == 131 && com.aspose.slides.ms.System.j8.n5(var19) == com.aspose.slides.internal.v6g.k5.n5(RotationEffect.class)) {
                     var16 = com.aspose.slides.ms.System.n1.u9(((RotationEffect)var19).getBy());
                  }

                  if (var10 == 51 && com.aspose.slides.ms.System.j8.n5(var19) == com.aspose.slides.internal.v6g.k5.n5(ScaleEffect.class)) {
                     var16 = ((ScaleEffect)var19).u3().toString();
                  }

                  if (com.aspose.slides.ms.System.j8.n5(var19) == com.aspose.slides.internal.v6g.k5.n5(PropertyEffect.class)
                     || com.aspose.slides.ms.System.j8.n5(var19) == com.aspose.slides.internal.v6g.k5.n5(FilterEffect.class)
                     || com.aspose.slides.ms.System.j8.n5(var19) == com.aspose.slides.internal.v6g.k5.n5(RotationEffect.class)
                     || com.aspose.slides.ms.System.j8.n5(var19) == com.aspose.slides.internal.v6g.k5.n5(ScaleEffect.class)
                     || com.aspose.slides.ms.System.j8.n5(var19) == com.aspose.slides.internal.v6g.k5.n5(ColorEffect.class)) {
                     if (var10 != 13 && var10 != 9 && var10 != 140 && var10 != 44 && var10 != 145) {
                        var17 = var19.getTiming().getDuration();
                        break;
                     }

                     var17 += var19.getTiming().getDuration();
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var18, IDisposable.class)) {
                  var18.dispose();
               }
            }

            if (com.aspose.slides.ms.System.n1.l6(var17)) {
               var17 = 0.5F;
            }

            if (var10 == 13 || var10 == 9) {
               var17 /= 2.0F;
            }

            if (var12 == 0) {
               var4 += var5;
               var5 = var13 + var17;
            } else if (var12 == 2) {
               var5 = com.aspose.slides.ms.System.q1.n5((float)(var5), (float)(var13 + var17));
            } else {
               var3++;
               var4 = 0.0F;
               var5 = var13 + var17;
            }

            if (var0.getTriggerShape() != null) {
               var14 = com.aspose.slides.ms.System.d1.n5(new String[]{
                  "slide-",
                  com.aspose.slides.ms.System.l4.l6(var0.getTriggerShape().getSlide().getSlideId()),
                  "-shape-",
                  com.aspose.slides.ms.System.l4.l6(var0.getTriggerShape().getUniqueId())
               });
            } else {
               var14 = "slide";
            }

            float var30 = var13 + var4;
            if (var15 != null && var15.getColorType() != -1) {
               var16 = n5(var8, var15);
            }

            IParagraph var20 = n5(var0, var7);
            m0j var21 = new m0j<>(
               com.aspose.slides.ms.System.d1.n5(new String[]{
                  com.aspose.slides.ms.System.s3.n5(EffectPresetClassType.class, var9), com.aspose.slides.ms.System.s3.n5(EffectType.class, var10)
               }),
               com.aspose.slides.ms.System.s3.n5(EffectSubtype.class, var11),
               var17,
               var30,
               var14,
               var16,
               var3,
               new z6(var7.getSound(), var7.getTiming().getRepeatCount(), var7.getTiming().getAutoReverse())
            );
            if (var20 != null) {
               if (var2 != null && !var2.containsKey(var20)) {
                  var2.addItem(var20, var21);
               }
            } else if (var1 != null) {
               if (!var1.containsKey(var8)) {
                  var1.addItem(var8, new List());
               }

               ((List)var1.get_Item(var8)).addItem(var21);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
            var6.dispose();
         }
      }

      return var3;
   }

   private static IParagraph n5(ISequence var0, IEffect var1) {
      AutoShape var2 = com.aspose.slides.internal.v6g.k5.n5(var1.getTargetShape(), AutoShape.class);
      if (var0 != null && var2 != null && var2.getTextFrame() != null) {
         IGenericEnumerator var3 = var2.getTextFrame().getParagraphs().iterator();

         try {
            while (var3.hasNext()) {
               IParagraph var4 = (IParagraph)var3.next();
               IEffect[] var5 = var0.getEffectsByParagraph(var4);
               if (var5 != null) {
                  for (IEffect var9 : var5) {
                     if (com.aspose.slides.ms.System.j8.l6(var9, var1)) {
                        return var4;
                     }
                  }
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               var3.dispose();
            }
         }

         return null;
      } else {
         return null;
      }
   }

   private static String n5(IShape var0, IColorFormat var1) {
      IShape var2 = var0.getSlide().getShapes().addClone(var0);
      var2.getFillFormat().setFillType((byte)1);
      var2.getFillFormat().getSolidFillColor().copyFrom(var1);
      com.aspose.slides.internal.o9b.c8 var3 = ((f6a)var2.getFillFormat().getEffective()).h0().o8();
      var0.getSlide().getShapes().remove(var2);
      return com.aspose.slides.ms.System.d1.n5(new String[]{
         "rgb(",
         com.aspose.slides.ms.System.e2.l6(var3.x8()),
         ",",
         com.aspose.slides.ms.System.e2.l6(var3.n3()),
         ",",
         com.aspose.slides.ms.System.e2.l6(var3.y4()),
         ")"
      });
   }

   public static String n5(TemplateContext<Slide> var0) {
      IFillFormatEffectiveData var1 = ((Slide)var0.getObject()).getBackground().getEffective().getFillFormat();
      String var2 = o8n.n5(var1, var0);
      if (var1.getFillType() == 4 && var1.getPictureFillFormat().getPictureFillMode() == 1) {
         var2 = com.aspose.slides.ms.System.d1.n5(var2, " background-size: cover;");
      }

      return var2;
   }

   public static IGenericEnumerable<IComment> n5(Slide var0) {
      List var1 = new List<>(com.aspose.slides.ms.System.u3.n5(var0.getSlideComments(null)));
      List var2 = new List();
      var1.sort(new q8s$1());
      List$Enumerator var3 = var1.iterator();

      try {
         while (var3.hasNext()) {
            IComment var4 = (IComment)var3.next();
            if (var4.getParentComment() == null) {
               var2.addItem(var4);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      for (int var15 = 0; var15 < var2.size(); var15++) {
         IComment var5 = (IComment)var2.get_Item(var15);
         List$Enumerator var6 = var1.iterator();

         try {
            while (var6.hasNext()) {
               IComment var7 = (IComment)var6.next();
               if (var7.getParentComment() == var5) {
                  var2.insertItem(++var15, var7);
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
               var6.dispose();
            }
         }
      }

      return var2;
   }

   private static float n5(int var0) {
      switch (var0) {
         case 0:
            return 0.55F;
         case 1:
            return 0.55F;
         case 2:
            return 0.25F;
         case 3:
            return 0.25F;
         case 4:
            return 0.25F;
         case 5:
            return 0.25F;
         case 6:
            return 0.25F;
         case 7:
            return 0.15F;
         case 8:
            return 0.15F;
         default:
            return 1.0F;
      }
   }

   private static void n5(TemplateContext<Presentation> var0, float var1, int[] var2, int[] var3) {
      com.aspose.slides.internal.o9b.f2 var4 = ((SlideSize)((Presentation)var0.getObject()).getSlideSize()).n5().a6();
      var4 = new com.aspose.slides.internal.o9b.f2(var4.l6() * var1 + 2.0F, var4.k5() * var1 + 2.0F);
      var2[0] = com.aspose.slides.internal.v6g.k5.u3(var4.l6(), 13);
      var3[0] = com.aspose.slides.internal.v6g.k5.u3(var4.k5(), 13);
   }

   private static void n5(TemplateContext<Presentation> var0, float var1, int var2, com.aspose.slides.internal.o9b.f2 var3, int[] var4, int[] var5) {
      com.aspose.slides.internal.o9b.f2 var6 = ((SlideSize)((Presentation)var0.getObject()).getSlideSize()).n5().a6();
      var6 = new com.aspose.slides.internal.o9b.f2(var6.l6() * var1 + 2.0F, var6.k5() * var1 + 2.0F);
      com.aspose.slides.internal.o9b.f2 var7 = new com.aspose.slides.internal.o9b.f2(var2 * 7.5F, var2 * 10.0F);
      com.aspose.slides.internal.o9b.f2 var8 = new com.aspose.slides.internal.o9b.f2(
         (float)com.aspose.slides.ms.System.q1.l6((double)((var7.l6() - var6.l6() * var3.l6()) / (2.0F * var3.l6()))),
         (float)com.aspose.slides.ms.System.q1.l6((double)((var7.k5() - var6.k5() * var3.k5()) / (2.0F * var3.k5())))
      );
      var5[0] = com.aspose.slides.internal.v6g.k5.u3(var8.l6(), 13) - 4;
      var4[0] = com.aspose.slides.internal.v6g.k5.u3(var8.k5(), 13) - 4;
      if (var3.l6() == 1.0F && var3.k5() == 3.0F) {
         var5[0] = var4[0];
      }
   }

   private static com.aspose.slides.internal.o9b.f2 l6(int var0) {
      switch (var0) {
         case 0:
            return new com.aspose.slides.internal.o9b.f2(1.0F, 1.0F);
         case 1:
            return new com.aspose.slides.internal.o9b.f2(1.0F, 2.0F);
         case 2:
            return new com.aspose.slides.internal.o9b.f2(1.0F, 3.0F);
         case 3:
            return new com.aspose.slides.internal.o9b.f2(2.0F, 2.0F);
         case 4:
            return new com.aspose.slides.internal.o9b.f2(2.0F, 2.0F);
         case 5:
            return new com.aspose.slides.internal.o9b.f2(2.0F, 3.0F);
         case 6:
            return new com.aspose.slides.internal.o9b.f2(2.0F, 3.0F);
         case 7:
            return new com.aspose.slides.internal.o9b.f2(3.0F, 3.0F);
         case 8:
            return new com.aspose.slides.internal.o9b.f2(3.0F, 3.0F);
         default:
            return new com.aspose.slides.internal.o9b.f2(1.0F, 1.0F);
      }
   }

   public static void n5(TemplateContext<Presentation> var0, String[] var1, String[] var2, String[] var3) {
      byte var4 = 96;
      boolean var5 = var0.getGlobal().containsKey("handout");
      int var6 = var5 ? var0.getGlobal().<Integer>get("handout") : 0;
      float var7 = n5(var6);
      com.aspose.slides.internal.o9b.f2 var8 = l6(var6).a6();
      int var9 = 0;
      int var10 = 0;
      int var11 = 0;
      int var12 = 0;
      int[] var13 = new int[]{0};
      int[] var14 = new int[]{0};
      n5(var0, var7, 96, var8.a6(), var13, var14);
      var9 = var13[0];
      var10 = var14[0];
      int[] var15 = new int[]{0};
      int[] var16 = new int[]{0};
      n5(var0, var7, var15, var16);
      var11 = var15[0];
      var12 = var16[0];
      var1[0] = com.aspose.slides.ms.System.d1.n5("margin: {0}px {1}px; width: {2}px; height: {3}px;",new Object[]{ var9, var10, var11, var12});
      var2[0] = com.aspose.slides.ms.System.d1.n5("transform: scale({0}); transform-origin: top left; margin: 0;", new Object[]{f7i.n5(var7, 2)});
      var3[0] = com.aspose.slides.ms.System.a3.l6(var12);
      if (!var5) {
         var2[0] = "";
      }
   }

   public static <T> String n5(IAudio var0, TemplateContext<T> var1) {
      if (var0 != null && var0.getBinaryData() != null && var0.getBinaryData().length != 0) {
         String var2 = var1.getOutput().getResourcePath(var0);
         String var3 = var1.getGlobal().get("slidesPath");
         return o6c.n5(var2, var3);
      } else {
         return com.aspose.slides.ms.System.d1.n5;
      }
   }
}
