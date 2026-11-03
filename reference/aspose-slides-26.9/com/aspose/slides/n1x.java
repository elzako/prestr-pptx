package com.aspose.slides;

import com.aspose.slides.exceptions.IndexOutOfRangeException;
import com.aspose.slides.exceptions.NotImplementedException;

class n1x extends x8<TextStyle, n1x> implements ITextStyleEffectiveData {
   private t3x[] k5 = new t3x[10];
   private static final n1x u3 = h0();
   private static final n1x a6 = c8();
   private static final n1x u9 = t2();
   private static final n1x h0 = s7();

   n1x(TextStyle var1) {
      super(var1);

      for (int var2 = 0; var2 < this.k5.length; var2++) {
         this.k5[var2] = t3x.c8();
      }
   }

   n1x(TextStyle var1, n1x var2) {
      super(var1);
      if (var2 != null) {
         for (int var3 = 0; var3 < this.k5.length; var3++) {
            this.k5[var3] = var2.n5(var3, this);
         }
      } else {
         for (int var4 = 0; var4 < this.k5.length; var4++) {
            this.k5[var4] = t3x.c8();
         }
      }
   }

   @Override
   public final IParagraphFormatEffectiveData getLevel(int index) {
      return this.n5(index);
   }

   final t3x n5(int var1) {
      if (var1 >= 0 && var1 <= 8) {
         return this.k5[var1 + 1];
      } else {
         throw new IndexOutOfRangeException("Level index must lay in 0..8 interval.");
      }
   }

   @Override
   public final IParagraphFormatEffectiveData getDefaultParagraphFormat() {
      return this.k5[0];
   }

   static n1x n5(TextStyle var0) {
      IPresentationComponent var1 = var0.getParent_IPresentationComponent();
      if (com.aspose.slides.internal.v6g.k5.l6(var1, TextFrame.class)) {
         TextFrame var11 = (TextFrame)var1;
         n1x var12 = null;
         if (com.aspose.slides.internal.v6g.k5.l6(var11.getParent_Immediate(), GeometryShape.class)) {
            GeometryShape var13 = (GeometryShape)var11.getParent_Immediate();
            GeometryShape var18 = com.aspose.slides.internal.v6g.k5.n5(var13.getBasePlaceholder(), GeometryShape.class);
            if (var18 != null) {
               TextFrame var23 = null;
               if (com.aspose.slides.internal.v6g.k5.l6(var18, AutoShape.class)) {
                  var23 = ((AutoShape)var18).l6();
               } else if (com.aspose.slides.internal.v6g.k5.l6(var18, SmartArtShape.class)) {
                  var23 = ((SmartArtShape)var18).k5();
               }

               var12 = var23 != null ? var23.n5.h0().c8() : null;
            }

            if (var12 == null) {
               BaseSlide var24 = (BaseSlide)var11.getSlide();
               MasterSlide var7 = var24.e2();
               if (var7 != null) {
                  IPlaceholder var8 = var13.getPlaceholder();
                  if (var8 != null) {
                     int var9 = TextFrame.a6.l6(var8.getType());
                     switch (var9) {
                        case 0:
                        default:
                           break;
                        case 1:
                           var12 = ((TextStyle)var7.getTitleStyle()).c8();
                           break;
                        case 2:
                           var12 = ((TextStyle)var7.getBodyStyle()).c8();
                           break;
                        case 3:
                           var12 = ((TextStyle)var7.getOtherStyle()).c8();
                     }
                  }
               } else if (com.aspose.slides.internal.v6g.k5.l6(var24, MasterNotesSlide.class) && ((MasterNotesSlide)var24).getNotesStyle() != null) {
                  var12 = ((TextStyle)((MasterNotesSlide)var24).getNotesStyle()).c8();
               }
            }
         } else if (com.aspose.slides.internal.v6g.k5.l6(var11.getParent_Immediate(), Cell.class)) {
            BaseSlide var14 = (BaseSlide)var11.getSlide();
            MasterSlide var19 = var14.e2();
            if (var19 != null) {
               var12 = ((TextStyle)var19.getOtherStyle()).c8();
            }
         } else if (com.aspose.slides.internal.v6g.k5.l6(var11.getParent_Immediate(), IOverridableText.class)) {
            IOverridableText var15 = (IOverridableText)var11.getParent_Immediate();
            Chart var20 = (Chart)var15.getChart();
            BaseSlide var25 = (BaseSlide)var20.getSlide();
            MasterSlide var27 = var25.e2();
            var12 = null;
         }

         if (var12 == null) {
            Chart var16 = null;
            MasterNotesSlide var21 = null;
            Chart[] var26 = new Chart[]{var16};
            boolean var28 = d0u.n5(Chart.class, var11, var26);
            var16 = var26[0];
            if (var28) {
               var12 = u9;
            } else {
               MasterNotesSlide[] var29 = new MasterNotesSlide[]{var21};
               boolean var30 = d0u.n5(MasterNotesSlide.class, var11, var29);
               var21 = var29[0];
               if (var30) {
                  var12 = h0;
               } else {
                  var12 = ((Presentation)var11.getPresentation()).k5.c8();
               }
            }
         }

         return var12;
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, IFormattedTextContainer.class)) {
         n1x var2 = null;
         IFormattedTextContainer var3 = (IFormattedTextContainer)var1;
         Chart var4 = (Chart)var3.getChart();
         BaseSlide var5 = (BaseSlide)var4.getSlide();
         MasterSlide var6 = var5.e2();
         var2 = null;
         if (var2 == null) {
            var2 = ((Presentation)var1.getPresentation()).k5.c8();
         }

         return var2;
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, MasterSlide.class)) {
         return u3;
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, MasterNotesSlide.class)) {
         return h0;
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, Presentation.class)) {
         return u3;
      } else {
         throw new NotImplementedException();
      }
   }

   private static n1x h0() {
      n1x var0 = new n1x((TextStyle)null);
      t3x var1 = t3x.m1;

      for (int var2 = 0; var2 < var0.k5.length; var2++) {
         var0.k5[var2] = var1;
      }

      return var0;
   }

   final n1x u9() {
      return a6;
   }

   private static n1x c8() {
      n1x var0 = new n1x((TextStyle)null);

      for (int var1 = 0; var1 < var0.k5.length; var1++) {
         var0.k5[var1] = t3x.c8();
      }

      return var0;
   }

   private static n1x t2() {
      n1x var0 = new n1x((TextStyle)null);

      for (int var1 = 0; var1 < var0.k5.length; var1++) {
         var0.k5[var1] = t3x.t2();
      }

      return var0;
   }

   private static n1x s7() {
      n1x var0 = new n1x((TextStyle)null);

      for (int var1 = 0; var1 < var0.k5.length; var1++) {
         var0.k5[var1] = t3x.s7();
         var0.k5[var1].y4 = 36.0F * (var1 > 0 ? var1 - 1 : 0);
      }

      return var0;
   }

   private t3x n5(int var1, n1x var2) {
      return this.k5[var1] != t3x.c8() ? new t3x(var2, this.k5[var1], 0) : t3x.c8();
   }

   void n5(i7b var1, TextStyle var2) {
      n1x var3 = var1 == null ? this.u9() : (n1x)var1;

      for (int var4 = 0; var4 < this.k5.length; var4++) {
         ParagraphFormat var5 = var2.u3()[var4];
         t3x var6 = var3.k5[var4];
         t3x var7;
         if (var5 != null) {
            if (!com.aspose.slides.ms.System.j8.l6(var6, t3x.c8())) {
               var7 = new t3x(this, var6, var5);
            } else {
               var7 = new t3x(this, var5);
            }
         } else if (!com.aspose.slides.ms.System.j8.l6(var6, t3x.c8())) {
            var7 = new t3x(this, var6, 0);
         } else {
            var7 = t3x.c8();
         }

         this.k5[var4] = var7;
      }
   }

   @Override
   void n5(IBaseSlide var1, w6a var2) {
      for (int var3 = 0; var3 < this.k5.length; var3++) {
         this.k5[var3].n5(var1, var2);
      }
   }

   @Override
   void n5(IBaseSlide var1) {
      for (int var2 = 0; var2 < this.k5.length; var2++) {
         this.k5[var2].n5(var1);
      }
   }

   boolean n5(n1x var1) {
      if (com.aspose.slides.ms.System.j8.l6(this, var1)) {
         return true;
      }

      if (var1 == null) {
         return false;
      }

      for (int var2 = 0; var2 < this.k5.length; var2++) {
         if (!com.aspose.slides.internal.n8e.v4.n5(this.k5[var2], var1.k5[var2])) {
            return false;
         }
      }

      return true;
   }

   static n1x n5(TextStyle var0, n1x var1) {
      return new n1x(var0, var1);
   }

   @Override
   boolean n5(g8 recoveredArg) {
      return this.n5((com.aspose.slides.n1x)recoveredArg);
   }
}
