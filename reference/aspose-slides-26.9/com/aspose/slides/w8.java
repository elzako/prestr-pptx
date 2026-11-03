package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.ms.System.IDisposable;

final class w8 extends y0k {
   private boolean n5 = false;

   public w8(AutoShape var1) {
      super(var1);
   }

   public final AutoShape n5() {
      return (AutoShape)super.a6();
   }

   final void l6() {
      TextFrame var1 = this.n5().l6();
      i2h var2 = var1.n5(this.n5()).k5();
      j2x var3 = this.n5().t4();
      l3f var4 = this.y4().l6();
      com.aspose.slides.internal.o9b.y1 var5 = var3.n5(var4.n5.u3(), var4.l6.u3()).y4();
      s3z.n5(var1.u3, var5.s7() - var2.l6 - var2.u3, var5.k5() - var2.k5 - var2.a6, null);
   }

   @Override
   a1v n5(e3 var1, ShapeFrame var2, com.aspose.slides.internal.x4g.s7 var3, a1v[] var4, byte var5, IFillParamSource var6, s5u var7) {
      return this.n5().getUseBackgroundFill() && this.n5().getFillFormat().getFillType() == -1
         ? super.n5(var1, this.h0().y4(), var3, var4, var5, this.h0().getBackground(), var7)
         : super.n5(var1, var2, var3, var4, var5, var6, var7);
   }

   @Override
   void n5(e3 var1, s5u var2, InterruptionToken var3) {
      IPlaceholder var4 = this.a6().getPlaceholder();
      boolean var5 = false;
      boolean var6 = false;
      String var7 = com.aspose.slides.ms.System.d1.n5(this.a6().getAlternativeText()) ? this.a6().getAlternativeTextTitle() : this.a6().getAlternativeText();

      try {
         if (this.n5().getTextFrame() != null && !com.aspose.slides.ms.System.d1.n5(this.n5().getTextFrame().getText()) && !this.n5().a5()) {
            if (var4 != null) {
               if (var4.getType() == 6 || var4.getType() == 5 || var4.getType() == 4) {
                  var5 = var1.n5("Footer");
               } else if (var4.getType() == 7) {
                  var5 = var1.n5("Header");
               }
            }

            if (!var5) {
               if (var1.m1() != null && !com.aspose.slides.internal.v6g.k5.l6(var1.m1(), Chart.class)) {
                  var6 = var1.n5("Textbox", ((ShapeFrame)this.a6().getFrame()).n5().y4(), var7);
               }

               if (var4 != null) {
                  if (var4.getType() == 0 || var4.getType() == 2) {
                     var5 = var1.n5("Title", null, this.a6().getAlternativeText());
                  } else if (var4.getType() == 3) {
                     var5 = var1.n5("SubTitle", null, this.a6().getAlternativeText());
                  }
               }
            }
         }

         if (var2 != null) {
            var2.n5(this.a6().getHyperlinkClick());
         }

         ShapeFrame var8 = null;
         TextFrame var9 = this.n5().l6();
         if (var9 != null && var9.getText() != null && this.n5().getFillFormat().getFillType() == 4) {
            String var10 = com.aspose.slides.ms.System.d1.k5(var9.getText(),new char[]{ ' '});
            if (!this.a6().a5()) {
               if (var10.isEmpty()) {
                  var5 = var1.n5("Figure", ((ShapeFrame)this.a6().getFrame()).n5().y4(), this.a6().getAlternativeText());
               } else if (var10.length() == 1 && var10.charAt(0) == 160) {
                  var5 = var1.n5("Artifact");
               }
            }
         }

         ShapeFrame[] var85 = new ShapeFrame[]{var8};
         boolean var11 = var9 != null
            && var9.getText() != null
            && !"".equals(com.aspose.slides.ms.System.d1.l6(var9.getText()))
            && this.a6().p3().getPresentation().getFontsManager().getFontSubstRuleList().size() != 0
            && !s3z.n5(var9.u3, var85, var2);
         var8 = var85[0];
         if (var11) {
            this.k5();
            l3f var12 = this.t9().l6();
            x4t var13 = new x4t();
            var13.l6 = var8.getRotation();
            var13.u3 = var8.getFlipH() == 1;
            var13.k5 = var8.getFlipV() == 1;
            this.a6().n5(new e4c(var8.getX(), var8.getY()), new e4c(var8.getWidth(), var8.getHeight()), var13);
            super.n5(var1, var2, var3);
            this.a6().n5(var12.l6());
         } else {
            super.n5(var1, var2, var3);
         }

         if (!this.a6().getHidden() && var9 != null) {
            f9 var86 = null;
            if (com.aspose.slides.internal.v6g.k5.n5(var9.getTextFrameFormat(), TextFrameFormat.class).t9() == 2) {
               var86 = new f9();
               com.aspose.slides.internal.o9b.y1 var87 = ((ShapeFrame)this.a6().getFrame()).n5().y4();
               if (this.a6().getFrame().getRotation() != 0.0F) {
                  com.aspose.slides.internal.x4g.s7 var14 = new com.aspose.slides.internal.x4g.s7();

                  try {
                     var14.l6(var87.y4());
                     com.aspose.slides.internal.x4g.m1 var15 = new com.aspose.slides.internal.x4g.m1();

                     try {
                        var15.n5(
                           this.a6().getFrame().getRotation(),
                           new com.aspose.slides.internal.o9b.w1(var87.x8() + var87.s7() / 2.0F, var87.n3() + var87.k5() / 2.0F)
                        );
                        var14.l6(var15);
                     } finally {
                        if (var15 != null) {
                           var15.dispose();
                        }
                     }

                     var14.s7().a6(var87);
                  } finally {
                     if (var14 != null) {
                        var14.dispose();
                     }
                  }
               }

               e3[] var89 = new e3[]{var1};
               var86.n5(var89, var87.y4());
               var1 = var89[0];
            }

            try {
               boolean var88 = l6o.n5(var1, var2, this.n5(), var9);
               if (!var88) {
                  if (com.aspose.slides.internal.v6g.k5.l6(var1, w2.class) && ((w2)var1).k5() != null) {
                     if (!((w2)var1).l6() && v7y.n5(var9)) {
                        TextFrame var91 = new TextFrame(this.n5());
                        var91.n5((ITextFrame)var9);
                        IGenericEnumerator var92 = var91.getParagraphs().iterator();

                        try {
                           while (var92.hasNext()) {
                              IParagraph var16 = (IParagraph)var92.next();
                              IGenericEnumerator var17 = var16.getPortions().iterator();

                              try {
                                 while (var17.hasNext()) {
                                    IPortion var18 = (IPortion)var17.next();
                                    var18.getPortionFormat().getFillFormat().setFillType((byte)0);
                                    var18.getPortionFormat().getLineFormat().getFillFormat().setFillType((byte)0);
                                 }
                              } finally {
                                 if (com.aspose.slides.internal.v6g.k5.n5(var17, IDisposable.class)) {
                                    var17.dispose();
                                 }
                              }
                           }
                        } finally {
                           if (com.aspose.slides.internal.v6g.k5.n5(var92, IDisposable.class)) {
                              var92.dispose();
                           }
                        }

                        this.n5(var1, var2, var91, var3);
                     } else {
                        this.n5(var1, var2, var9, var3);
                     }

                     if (!((w2)var1).l6()) {
                        v7y.n5(var1, var2, this.n5(), var9);
                     }
                  } else {
                     boolean var90 = v7y.n5(var1, var2, this.n5(), var9);
                     if (!var90) {
                        this.n5(var1, var2, var9, var3);
                     }
                  }
               }
            } finally {
               if (var2 != null && var2.e2() != null) {
                  var2.n5((IHyperlink)null);
                  var1.a6();
               }

               if (var86 != null) {
                  e3[] var22 = new e3[]{var1};
                  var86.n5(var22);
                  var1 = var22[0];
               }
            }
         }
      } finally {
         if (var2 != null) {
            var2.n5((IHyperlink)null);
         }

         if (var5) {
            var1.u9();
         }

         if (var6) {
            var1.u9();
         }
      }

      if (this.n5().l6() != null) {
         if (this.n5().l6().n5 != null) {
            this.n5().l6().n5.d5();
         }

         this.n5().l6().u3.a6();
         IGenericEnumerator var82 = this.n5().l6().getParagraphs().iterator();

         try {
            while (var82.hasNext()) {
               Paragraph var83 = (Paragraph)var82.next();
               var83.e2();
            }

            f1z var84 = this.n5().l6().u3;
            ((n6p)var84).x8();
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var82, IDisposable.class)) {
               var82.dispose();
            }
         }
      }
   }

   private void n5(e3 var1, s5u var2, TextFrame var3, InterruptionToken var4) {
      com.aspose.slides.internal.w0.c8 var5 = s3z.n5(var3.u3, var2);
      if (var3.h0()) {
         k0r var6 = new k0r(null);

         try {
            var6.n5(var1, var2, this.n5(), var3, var5);
         } finally {
            var6.dispose();
         }
      } else {
         boolean var13 = false;
         boolean var7 = true;
         if (var3.n3() && !s3z.n5(var3) && !var3.c8()) {
            IFillFormat var8 = this.n5().u3();
            if (var8 != null) {
               Presentation var9 = (Presentation)this.n5().j9().getPresentation();
               boolean var10 = var8.getPictureFillFormat().getPicture().getImage() == ((ImageCollection)var9.getImages()).n5();
               if (!var10) {
                  var7 = false;
               }
            }
         }

         if (var7) {
            if (var2 != null) {
               var2.n5(new com.aspose.slides.internal.o9b.y1(0.0F, 0.0F, var3.u3.k5().n5, this.a6().getHeight()));
               var13 = var2.n5(var1, var3, var5);
            } else {
               var1.k5(var5);
               var13 = var3.u3.n5(var1, var2);
               var1.z3();
            }
         }

         if (!var13) {
            this.l6(var1, var2, var4);
         }
      }
   }

   @Override
   void k5() {
      TextFrame var1 = this.n5().l6();
      if (var1 != null) {
         h9z var2 = ((TextFrameFormat)var1.getTextFrameFormat()).d2();
         if (var1.getParagraphs().getCount() != 0
            && var2.getAutofitType() == 2
            && var1.getTextFrameFormat().getTransform() <= 0
            && !this.n5
            && this.a6().x8 != this.a6().t2()
            && !Connector.n5.containsKey(this.n5().getShapeType())
            && !this.u9().x8()
            && !this.a6().d5()) {
            this.n5 = true;
            float var3 = 0.0F;
            float var4 = 0.0F;
            switch (var1.getParagraphs().get_Item(0).getParagraphFormat().getEffective().getAlignment()) {
               case 0:
               default:
                  break;
               case 1:
               case 3:
               case 4:
                  var3 = 0.5F;
                  break;
               case 2:
                  var3 = 1.0F;
            }

            switch (var2.getAnchoringType()) {
               case 0:
               case 3:
               default:
                  break;
               case 1:
               case 4:
                  var4 = 0.5F;
                  break;
               case 2:
                  var4 = 1.0F;
            }

            l3f var5 = this.y4().l6();
            d2k var6 = d2k.n5(var5.n5, d2k.n5(var5.l6, 2)).u3();
            if (com.aspose.slides.ms.System.n1.k5(var6.n5 + var6.l6)) {
               this.n5 = false;
            } else {
               int var7 = var2.getWrapText() ? 1 : 0;
               int var8 = var2.x8() ? 1 : 0;
               i2h var9 = var1.n5(this.n5()).k5();
               j2x var10 = this.n5().t4();
               com.aspose.slides.internal.o9b.y1 var11 = var10.n5(var5.n5.u3(), var5.l6.u3()).y4();
               com.aspose.slides.internal.w0.c8 var12 = s3z.n5(var5.n5().n5(), var11.y4(), var9.k5(), (byte)0, 0.0F, (byte)var7, (byte)var8);
               com.aspose.slides.internal.o9b.w1[] var13 = new com.aspose.slides.internal.o9b.w1[]{
                  new com.aspose.slides.internal.o9b.w1(var3 * var11.s7(), var4 * var11.k5())
               };
               var12.n5(var13);
               com.aspose.slides.internal.o9b.w1 var14 = var13[0].u3();
               float var15 = var7 == 0 && var8 == 0 ? 1.01F : 1.0F;
               s3z.n5(var1.u3, var11.s7() - var9.l6 - var9.u3, var11.k5() - var9.k5 - var9.a6, null);
               d2k var16 = var1.u3.t2().u3();
               this.n5((var16.n5 + var9.l6 + var9.u3) * var15, (var16.l6 + var9.k5 + var9.a6) * var15);
               this.y4().n5(var5);
               var12 = s3z.n5(var5.n5().n5(), var11.y4(), var9.k5(), (byte)0, 0.0F, (byte)var7, (byte)var8);
               var10 = this.n5().t4();
               var10.n5(var5.n5.u3(), var5.l6.u3()).a6(var11);
               var13[0].n5(var3 * var11.s7());
               var13[0].l6(var4 * var11.k5());
               var12.n5(var13);
               var5.n5.n5 = var5.n5.n5 + (var14.l6() - var13[0].l6());
               var5.n5.l6 = var5.n5.l6 + (var14.k5() - var13[0].k5());
               this.a6().l6(var5.l6());
               var1.u3.a6();
               this.n5 = false;
               this.a6().c8();
            }
         }
      }
   }

   private void n5(float var1, float var2) {
      if (this.n5().l6() != null) {
         com.aspose.slides.internal.o9b.f2 var3 = this.n5().e2().n5().n5(new com.aspose.slides.internal.o9b.f2(var1, var2)).a6();
         ShapeFrame var4 = (ShapeFrame)this.a6().getFrame();
         this.a6().setFrame(new ShapeFrame(var4.getX(), var4.getY(), var3.l6(), var3.k5(), var4.getFlipH(), var4.getFlipV(), var4.getRotation()));
      }
   }

   private void l6(e3 var1, s5u var2, InterruptionToken var3) {
      if (this.n5().l6() != null && this.n5().l6().c8()) {
         LoadOptions var15 = com.aspose.slides.internal.v6g.k5.n5(this.a6().a3().getPresentation(), Presentation.class).a6();
         var15.n5("Rasterization of the current OMML content (mathematical data) is not supported", 1);
         FillFormat var16 = (FillFormat)this.a6().getFillFormat();
         FillFormat var17 = var16.a6();

         try {
            this.a6().getFillFormat().setFillType((byte)4);
            this.a6().getFillFormat().getPictureFillFormat().getPicture().setImage(((ImageCollection)this.u9().getImages()).n5());
            this.a6().getFillFormat().getPictureFillFormat().setPictureFillMode(1);
            super.n5(var1, var2, var3);
         } finally {
            var16.n5((IFillFormat)var17);
         }
      } else if (this.n5().u3() != null) {
         FillFormat var4 = (FillFormat)this.a6().getFillFormat();
         FillFormat var5 = var4.a6();
         boolean var6 = false;
         if (this.a6().s3().u3() == 1) {
            var6 = true;
            this.a6().s3().n5((byte)-1);
         }

         try {
            var4.n5(this.n5().u3());
            super.n5(var1, var2, var3);
         } finally {
            var4.n5((IFillFormat)var5);
            if (var6) {
               this.a6().s3().n5((byte)1);
            }
         }
      } else {
         super.n5(var1, var2, var3);
      }
   }
}
