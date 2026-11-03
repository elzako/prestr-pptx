package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.ms.System.IDisposable;
import java.awt.Dimension;
import java.awt.geom.Dimension2D;

public class PresentationAnimationsGenerator implements IDisposable {
   private final com.aspose.slides.internal.o9b.l6 l6;
   private int k5 = 0;
   final com.aspose.slides.internal.o9b.p8 n5 = new com.aspose.slides.internal.o9b.p8();
   private int u3;
   private boolean a6;
   private int u9;
   private float h0;
   private PresentationAnimationsGenerator$NewAnimation c8;

   public PresentationAnimationsGenerator(Presentation presentation) {
      this(((SlideSize)presentation.getSlideSize()).n5().u3().u3());
   }

   public PresentationAnimationsGenerator(Dimension frameSize) {
      this(com.aspose.slides.internal.o9b.p8.n5(frameSize));
   }

   public PresentationAnimationsGenerator(Dimension2D frameSize) {
      this(com.aspose.slides.internal.o9b.f2.n5(frameSize).u3());
   }

   PresentationAnimationsGenerator(com.aspose.slides.internal.o9b.p8 frameSize) {
      frameSize.k5(this.n5);
      this.setDefaultDelay(1000);
      this.l6 = new com.aspose.slides.internal.o9b.l6(this.n5.l6(), this.n5.k5(), 139273);
   }

   @Override
   public final void dispose() {
      this.l6.dispose();
   }

   public Dimension getFrameSize() {
      return com.aspose.slides.internal.o9b.p8.l6(this.n5);
   }

   public final int getDefaultDelay() {
      return this.u3;
   }

   public final void setDefaultDelay(int value) {
      this.u3 = value;
   }

   public final boolean getIncludeHiddenSlides() {
      return this.a6;
   }

   public final void setIncludeHiddenSlides(boolean value) {
      this.a6 = value;
   }

   public final int getExportedSlides() {
      return this.u9;
   }

   private void l6(int var1) {
      this.u9 = var1;
   }

   final void n5(int var1) {
      this.k5 = var1;
   }

   final float n5() {
      return this.h0;
   }

   final void n5(float var1) {
      this.h0 = var1;
   }

   public void setNewAnimation(PresentationAnimationsGenerator$NewAnimation anim) {
      this.c8 = anim;
   }

   public final void run(IGenericEnumerable<ISlide> slides) {
      com.aspose.slides.internal.o9b.l6 var2 = null;
      this.l6(0);
      IGenericEnumerator var3 = slides.iterator();

      try {
         while (var3.hasNext()) {
            ISlide var4 = (ISlide)var3.next();
            if (!var4.getHidden() || this.getIncludeHiddenSlides()) {
               e9 var5 = e9.n5(var4, this.n5.u3());
               var5.n5(this.n5());
               SlideShowTransition var6 = (SlideShowTransition)var4.getSlideShowTransition();
               int var7 = (int)var6.getAdvanceAfterTime();
               if (var7 <= 0) {
                  var7 = this.getDefaultDelay();
               }

               double var8 = var7;
               ISequence var28 = var4.getTimeline().getMainSequence();
               k7p var10 = h6i.n5(var28, var5);
               if (var10 != null) {
                  IGenericEnumerator var11 = var28.iterator();

                  try {
                     while (var11.hasNext()) {
                        Effect var12 = (Effect)var11.next();
                        if (var12.getPresetClassType() == 0) {
                           if (var12.u3 >= 0) {
                              if (com.aspose.slides.internal.v6g.k5.l6(var12.getTargetShape(), AutoShape.class)) {
                                 ((AutoShape)var12.getTargetShape()).l6().u3.n5(var12.u3, var12.a6, true);
                              }
                           } else {
                              var12.getTargetShape().setHidden(true);
                           }
                        }
                     }
                  } finally {
                     if (com.aspose.slides.internal.v6g.k5.n5(var11, IDisposable.class)) {
                        var11.dispose();
                     }
                  }
               }

               com.aspose.slides.internal.o9b.l6 var30 = ((Slide)var4).t4().n5(this.n5.u3());
               this.n5(var5, var6, var30, var2);
               if (var10 != null) {
                  var30.dispose();
                  k7p var31 = var10;

                  try {
                     d6m var13 = new d6m(this.n5.u3(), var5, var31);
                     this.n5(var13);
                     var13.setTimePosition(var13.getDuration());
                     var30 = var13.n5();
                     if (var13.getDuration() < var8) {
                        var8 -= var13.getDuration();
                        this.n5(var8, var30);
                     }
                  } finally {
                     if (var31 != null) {
                        var31.dispose();
                     }
                  }
               } else {
                  this.n5(var8, var30);
               }

               if (var2 != var30) {
                  if (var2 != null) {
                     var2.dispose();
                  }

                  var2 = var30;
               }

               this.l6(this.getExportedSlides() + 1);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      if (var2 != null) {
         var2.dispose();
      }
   }

   public final void run(IGenericEnumerable<ISlide> slides, int fps, PresentationPlayer$FrameTick onFrame) {
      PresentationPlayer var4 = new PresentationPlayer(this, fps);

      try {
         var4.setFrameTick(onFrame);
         this.run(slides);
      } finally {
         if (var4 != null) {
            var4.dispose();
         }
      }
   }

   private void n5(e9 var1, SlideShowTransition var2, com.aspose.slides.internal.o9b.l6 var3, com.aspose.slides.internal.o9b.l6 var4) {
      t6r var5 = var2.n5();
      short var6 = 1000;
      int var7 = 0;
      if (!com.aspose.slides.ms.System.d1.n5(var5.n5())) {
         int[] var8 = new int[]{0};
         boolean var9 = !com.aspose.slides.ms.System.a3.n5(var5.n5(), var8);
         var7 = var8[0];
         if (var9) {
            var7 = 1000;
         }
      } else {
         int var71 = var2.getSpeed();
         int[] var73 = new int[]{var71};
         int[] var10 = new int[]{0};
         boolean var11 = !SlideShowTransition.n5(var2.getType(), var73, var10);
         var71 = var73[0];
         var7 = var10[0];
         if (var11) {
            var7 = 1000;
         }
      }

      double var12 = var7;
      if (var2.getType() == 15) {
         if (var3 != null) {
            boolean var74 = true;
            if (com.aspose.slides.internal.v6g.k5.l6(var2.getValue(), OrientationTransition.class)) {
               var74 = com.aspose.slides.internal.v6g.k5.n5(var2.getValue(), OrientationTransition.class).getDirection() == 0;
            }

            boolean var85 = false;
            if (var4 == null) {
               var85 = true;
               var4 = new com.aspose.slides.internal.o9b.l6(var3.e2(), var3.h0());
               com.aspose.slides.internal.o9b.z1 var14 = com.aspose.slides.internal.o9b.z1.n5(var4);

               try {
                  var14.n5(com.aspose.slides.internal.o9b.c8.m3().o8());
               } finally {
                  if (var14 != null) {
                     var14.dispose();
                  }
               }
            }

            z4n var94 = new z4n(var4, var3, var74, var1.k5());
            this.n5(var94, var12);
            if (var85) {
               var4.dispose();
               Object var69 = null;
            }
         }
      } else if (var2.getType() == 9) {
         if (com.aspose.slides.internal.v6g.k5.l6(var2.getValue(), OptionalBlackTransition.class)
            && com.aspose.slides.internal.v6g.k5.n5(var2.getValue(), OptionalBlackTransition.class).getFromBlack()) {
            n4b var76 = new n4b(this.n5.u3());

            try {
               double var16 = 0.0;
               if (var4 != null) {
                  var76.n5(var4);
                  var76.n5(com.aspose.slides.internal.o9b.c8.e2().o8());
                  var76.l6(com.aspose.slides.internal.o9b.c8.m3().o8());
                  var16 = var12 / 2.0;
                  this.n5(var76, var16);
               }

               var76.n5(var3);
               var76.n5(com.aspose.slides.internal.o9b.c8.m3().o8());
               var76.l6(com.aspose.slides.internal.o9b.c8.e2().o8());
               this.n5(var76, var12 - var16);
            } finally {
               if (var76 != null) {
                  var76.dispose();
               }
            }
         } else if (var4 != null && var3 != null) {
            r2t var75 = new r2t(var4, var3);
            this.n5(var75, var12);
         }
      } else if (var2.getType() == 40) {
         n4b var77 = new n4b(this.n5.u3());

         try {
            var77.n5(com.aspose.slides.internal.o9b.c8.m3().o8());
            var77.l6(com.aspose.slides.internal.o9b.c8.w4().o8());
            this.n5(var77, var12 / 2.0);
            var77.n5(var3);
            var77.n5(com.aspose.slides.internal.o9b.c8.w4().o8());
            var77.l6(com.aspose.slides.internal.o9b.c8.e2().o8());
            this.n5(var77, var12 - var12 / 2.0);
         } finally {
            if (var77 != null) {
               var77.dispose();
            }
         }
      } else if (var2.getType() == 13) {
         i2e var78 = new i2e();
         var78.n5(var4);
         var78.l6(var3);
         if (com.aspose.slides.internal.v6g.k5.l6(var2.getValue(), SideDirectionTransition.class)) {
            SideDirectionTransition var86 = (SideDirectionTransition)var2.getValue();
            com.aspose.slides.internal.w0.t4 var95 = j8.n5(var86.getDirection()).n5();
            com.aspose.slides.internal.o9b.p8 var15 = this.n5.u3();
            var15.n5(var15.l6() * -var95.k5);
            var15.l6(var15.k5() * var95.u3);
            var78.n5(var15.u3());
         }

         this.n5(var78, var12);
      } else if (var2.getType() == 5) {
         i2e var79 = new i2e();
         var79.n5(var4);
         var79.l6(var3);
         var79.n5(true);
         if (com.aspose.slides.internal.v6g.k5.l6(var2.getValue(), EightDirectionTransition.class)) {
            EightDirectionTransition var87 = (EightDirectionTransition)var2.getValue();
            com.aspose.slides.internal.w0.t4 var96 = j8.l6(var87.getDirection()).n5();
            com.aspose.slides.internal.o9b.p8 var103 = this.n5.u3();
            var103.n5(var103.l6() * -var96.k5);
            var103.l6(var103.k5() * var96.u3);
            var79.n5(var103.u3());
         }

         this.n5(var79, var12);
      } else if (var2.getType() == 12) {
         x1z var80 = new x1z();
         var80.l6(var4);
         var80.n5(var3);
         if (com.aspose.slides.internal.v6g.k5.l6(var2.getValue(), EightDirectionTransition.class)) {
            EightDirectionTransition var88 = (EightDirectionTransition)var2.getValue();
            com.aspose.slides.internal.w0.t4 var97 = j8.l6(var88.getDirection()).n5();
            com.aspose.slides.internal.w0.t4 var104 = new com.aspose.slides.internal.w0.t4(this.n5.l6(), this.n5.k5());
            var104.k5 = var104.k5 * var97.k5;
            var104.u3 = var104.u3 * var97.u3;
            var80.n5(var104.n5());
         }

         this.n5(var80, var12);
      } else if (var2.getType() == 20 || var2.getType() == 17) {
         double var20 = 0.0;
         if (com.aspose.slides.internal.v6g.k5.l6(var2.getValue(), SideDirectionTransition.class)) {
            SideDirectionTransition var100 = (SideDirectionTransition)var2.getValue();
            switch (var100.getDirection()) {
               case 1:
                  var20 = Math.PI / 2;
                  break;
               case 2:
                  var20 = -Math.PI / 2;
                  break;
               case 3:
                  var20 = Math.PI;
            }
         } else if (com.aspose.slides.internal.v6g.k5.l6(var2.getValue(), CornerDirectionTransition.class)) {
            CornerDirectionTransition var101 = (CornerDirectionTransition)var2.getValue();
            double var22 = Math.PI / 4;
            switch (var101.getDirection()) {
               case 0:
                  var20 = -Math.PI / 4;
                  break;
               case 1:
                  var20 = Math.PI / 4;
                  break;
               case 2:
                  var20 = -Math.PI * 3.0 / 4.0;
                  break;
               case 3:
                  var20 = Math.PI * 3.0 / 4.0;
            }
         }

         x3q var102 = new x3q(this.n5.u3(), var20, false);
         c6 var106 = new c6(this.n5.u3(), var102);
         var106.n5(var4);
         var106.l6(var3);
         c6 var18 = var106;

         try {
            this.n5(var18, var12);
         } finally {
            if (var18 != null) {
               var18.dispose();
            }
         }
      } else if (var2.getType() == 16) {
         j9y var81;
         if (com.aspose.slides.internal.v6g.k5.l6(var2.getValue(), SplitTransition.class)) {
            SplitTransition var89 = (SplitTransition)var2.getValue();
            var81 = new j9y(this.n5.u3(), var89.getDirection() == 1, var89.getOrientation() == 0 ? 1 : 0, false);
         } else {
            var81 = new j9y(this.n5.u3(), true, 0, false);
         }

         c6 var90 = new c6(this.n5.u3(), var81);
         var90.n5(var4);
         var90.l6(var3);
         c6 var98 = var90;

         try {
            this.n5(var98, var12);
         } finally {
            if (var98 != null) {
               var98.dispose();
            }
         }
      } else if (var2.getType() == 21) {
         if (com.aspose.slides.internal.v6g.k5.l6(var2.getValue(), InOutTransition.class)) {
            InOutTransition var82 = (InOutTransition)var2.getValue();
            h3w var91 = new h3w(this.n5.u3());
            var91.n5(var3);
            var91.n5(var82.getDirection() == 0);
            this.n5(var91, var12);
         }
      } else if (var2.getType() == 3 || var2.getType() == 7 || var2.getType() == 11) {
         byte var84;
         switch (var2.getType()) {
            case 7:
               var84 = 1;
               break;
            case 11:
               var84 = 3;
               break;
            default:
               var84 = 0;
         }

         r2n var93 = new r2n(this.n5.u3(), var84);
         var93.n5(var4);
         var93.l6(var3);
         this.n5(var93, var12);
      } else if (var2.getType() == 19 || var2.getType() == 43 || var2.getType() == 18) {
         byte var83 = 0;
         switch (var2.getType()) {
            case 18:
               var83 = 2;
               break;
            case 43:
               var83 = 1;
         }

         WheelEffect var92 = new WheelEffect(this.n5.u3(), var83);
         c6 var99 = new c6(this.n5.u3(), var92);
         var99.n5(var4);
         var99.l6(var3);
         c6 var105 = var99;

         try {
            this.n5(var105, var12);
         } finally {
            if (var105 != null) {
               var105.dispose();
            }
         }
      } else if (var7 > 0) {
         this.n5(var7, var3);
      }
   }

   private void n5(double var1, com.aspose.slides.internal.o9b.l6 var3) {
      this.n5(new r8q(var1, var3));
   }

   private void n5(x4j var1, double var2) {
      com.aspose.slides.internal.o9b.z1 var4 = com.aspose.slides.internal.o9b.z1.n5(this.l6);

      try {
         g8q var5 = new g8q(var4, this.l6, var1, var2);
         this.n5(var5);
      } finally {
         if (var4 != null) {
            var4.dispose();
         }
      }
   }

   private void n5(IPresentationAnimationPlayer var1) {
      if (this.c8 != null) {
         this.c8.invoke(var1);
      }
   }
}
