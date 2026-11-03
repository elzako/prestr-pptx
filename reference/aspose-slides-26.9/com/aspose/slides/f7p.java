package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.ms.System.IDisposable;

class f7p {
   public AutoShape n5;
   private IMasterSlide l6;
   private LayoutSlide k5 = null;
   private byte u3;
   private long a6 = 0L;
   private AutoShape u9;
   private TextFrame h0;
   private AutoShape c8;
   private boolean t2 = false;
   private e4c s7 = new e4c();
   private e4c x8 = new e4c();
   private TextStyle n3;
   private byte y4 = -1;
   private float e2 = 1.0F;
   private float t9 = 1.0F;

   final void n5(byte var1) {
      this.u3 = var1;
   }

   public final float n5() {
      return this.e2;
   }

   public final float l6() {
      return this.t9;
   }

   final LayoutSlide n5(String var1) {
      if (this.k5 == null) {
         this.k5 = new LayoutSlide(this.l6, this.u3);
         this.k5.t4().n5(((Presentation)this.l6.getPresentation()).n3().w1());
         this.k5.setName(var1);
         this.k5.t4().l6(true);
         GroupShape var2 = this.k5.k5;
         o4f var3 = var2.R_();
         var3.n5(e4c.k5.u9());
         var2.k5(e4c.k5.u9());
         var2.n5(e4c.k5.u9());
         var2.l6(e4c.k5.u9());
         var2.setAlternativeText("");
         var2.setName("");
      }

      return this.k5;
   }

   final AutoShape n5(String var1, byte var2, byte var3, byte var4) {
      boolean var5 = true;
      this.u9 = this.k5(var4);
      if (this.u9 != null) {
         this.h0 = this.u9.l6();
         this.n5 = this.u9;
      } else {
         switch (var4) {
            case 4:
            case 5:
            case 6:
               var5 = false;
         }
      }

      if (var5) {
         this.a6++;
         this.c8 = ((ShapeCollection)this.k5.k5.getShapes()).y4();
         this.c8.u6();
         if (this.t2) {
            o4f var6 = this.c8.R_();
            var6.n5(this.s7.u9());
            this.c8.k5(this.x8.u9());
            this.t2 = false;
         }

         this.c8.setAlternativeText("");
         this.c8.setName(com.aspose.slides.ms.System.d1.n5(new String[]{var1, " ", com.aspose.slides.ms.System.l4.l6(this.a6)}));
         this.c8.n5(var2, var3, var4, (this.a6 & 4294967295L) - 1L & 4294967295L, false);
         this.c8.getAutoShapeLock().setGroupingLocked(true);
         this.c8.x8();
         if (this.n3 != null) {
            ((TextStyle)this.c8.getTextFrame().getTextFrameFormat().getTextStyle()).n5(this.n3);
            this.n3 = null;
         }

         if (this.y4 != -1) {
            this.c8.getTextFrame().getTextFrameFormat().setAnchoringType(this.y4);
            this.y4 = -1;
         }

         return this.c8;
      } else {
         this.c8 = null;
         this.h0 = null;
         this.n5 = null;
         return null;
      }
   }

   f7p(IMasterSlide var1, byte var2) {
      this.l6 = var1;
      this.u3 = var2;
      this.k5();
   }

   private void k5() {
      this.e2 = ((SlideSize)this.l6.getPresentation().getSlideSize()).n5().l6() / 720.0F;
      this.t9 = ((SlideSize)this.l6.getPresentation().getSlideSize()).n5().k5() / 540.0F;
   }

   private AutoShape k5(byte var1) {
      IGenericEnumerator var2 = this.l6.getShapes().iterator();

      try {
         while (var2.hasNext()) {
            IShape var3 = (IShape)var2.next();
            AutoShape var4 = com.aspose.slides.internal.v6g.k5.n5(var3, AutoShape.class);
            if (var4 != null && var4.getPlaceholder() != null && var4.getPlaceholder().getType() == var1) {
               return var4;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return null;
   }

   final void n5(Portion var1) {
      if (this.h0 != null) {
         ((ParagraphFormat)var1.n3().getParagraphFormat()).n5((ParagraphFormat)this.h0.getParagraphs().get_Item(0).getParagraphFormat());
         if (this.h0.getParagraphs().get_Item(0).getPortions().getCount() > 0) {
            ((PortionFormat)var1.getPortionFormat()).n5((PortionFormat)this.h0.getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat());
         } else if (((Paragraph)this.h0.getParagraphs().get_Item(0)).getEndParagraphPortionFormat() != null) {
            ((PortionFormat)var1.getPortionFormat()).n5((PortionFormat)((Paragraph)this.h0.getParagraphs().get_Item(0)).getEndParagraphPortionFormat());
         }
      }
   }

   public final void n5(double var1, double var3, double var5, double var7) {
      this.s7 = new e4c(var1, var3);
      this.x8 = new e4c(var5, var7);
      this.t2 = true;
   }

   public final void n5(TextStyle var1) {
      this.n3 = var1;
   }

   public final void l6(byte var1) {
      this.y4 = var1;
   }
}
