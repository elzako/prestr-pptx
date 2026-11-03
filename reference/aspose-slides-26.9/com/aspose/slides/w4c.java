package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.ms.System.IDisposable;

class w4c {
   private boolean n5;
   private final com.aspose.slides.internal.k4y.h6q l6;
   private final AutoShape k5;
   private long u3;
   private long a6;
   private long u9;

   public final TextFrame n5() {
      return this.k5.l6();
   }

   public final ThreeDFormat l6() {
      return this.k5.r4();
   }

   public final com.aspose.slides.internal.k4y.a6w k5() {
      if (this.l6.h0() == null) {
         this.l6.n5();
      }

      return this.l6.h0();
   }

   public final void n5(String var1) {
      this.l6.l6(var1);
   }

   public final String u3() {
      return this.l6.a6();
   }

   public final void l6(String var1) {
      this.l6.n5(var1);
   }

   public final int a6() {
      return this.l6.u9();
   }

   public final void n5(int var1) {
      this.l6.n5(var1);
   }

   public final int u9() {
      return this.k5.getShapeType();
   }

   public final void l6(int var1) {
      this.k5.setShapeType(var1);
   }

   public final boolean h0() {
      return (((ParagraphCollection)this.k5.l6().getParagraphs()).u3() & 4294967295L) != (this.u3 & 4294967295L)
         || (((TextFrameFormat)this.k5.l6().getTextFrameFormat()).getVersion() & 4294967295L) != (this.a6 & 4294967295L)
         || (this.s7() & 4294967295L) != (this.u9 & 4294967295L);
   }

   public w4c(com.aspose.slides.internal.k4y.h6q var1, SmartArt var2, t5w var3) {
      this.l6 = var1;
      this.k5 = new AutoShape(var2);
      this.n5(var1.t2() != null);
      TextFrame var4;
      if (var1.t2() != null) {
         var4 = this.k5.x8();
         o4z.n5(var4, var1.t2(), var3);
      } else {
         var4 = (TextFrame)this.k5.addTextFrame(com.aspose.slides.ms.System.d1.n5);
      }

      this.u3 = ((ParagraphCollection)var4.getParagraphs()).u3();
      this.a6 = ((TextFrameFormat)var4.getTextFrameFormat()).getVersion();
      this.u9 = this.s7();
      var4.s7().k5 = new w4c$1(this);
      if (var1.c8() == null) {
         var1.l6();
      }

      n5v.n5(this.k5, var1.c8(), var3);
      if (var1.c8().t2() != null && this.k5.getLineFormat().getFillFormat().getFillType() == -1) {
         this.k5.getLineFormat().getFillFormat().setFillType((byte)1);
      }

      if (this.l6.s7() != null) {
         com.aspose.slides.internal.k4y.c4t var5 = com.aspose.slides.internal.k4y.x1f.l6(this.l6.s7());
         if (var5 != null) {
            y1w.n5(this.k5, var5.c8(), var5.t2(), var3);
            this.k5.setHidden(var5.h0());
            this.k5.setAlternativeText(var5.a6());
            this.k5.setName(var5.u3());
         }
      }
   }

   public final void n5(SmartArtShape var1) {
      n5(this.k5, var1);
      if (this.k5.getFillFormat().getFillType() != -1) {
         ((FillFormat)var1.getFillFormat()).n5(this.k5.getFillFormat());
      }

      if (this.k5.y2().getFillFormat().getFillType() != -1) {
         var1.c4().n5((ILineFormat)this.k5.y2());
      }

      var1.r4().n5((IThreeDFormat)this.k5.r4());
      var1.y1().n5((IEffectFormat)this.k5.y1());
   }

   public final void l6(SmartArtShape var1) {
      n5(var1, this.k5);
      ((FillFormat)this.k5.getFillFormat()).n5(var1.getFillFormat());
      this.k5.c4().n5((ILineFormat)var1.y2());
      this.k5.r4().n5((IThreeDFormat)var1.r4());
      this.k5.y1().n5((IEffectFormat)var1.y1());
   }

   public final void k5(SmartArtShape var1) {
      this.k5.l6().n5((ITextFrame)var1.k5());
   }

   public final void n5(g6c var1) {
      this.l6.n5(new com.aspose.slides.internal.k4y.j3z());
      if (!com.aspose.slides.ms.System.d1.a6(this.k5.l6().getText(), com.aspose.slides.ms.System.d1.n5)) {
         this.l6.h0().n5((byte)-1);
      }

      if (this.k5.l6() != null) {
         IGenericEnumerator var2 = this.k5.l6().getParagraphs().iterator();

         try {
            while (var2.hasNext()) {
               IParagraph var3 = (IParagraph)var2.next();
               IGenericEnumerator var4 = var3.getPortions().iterator();

               try {
                  while (var4.hasNext()) {
                     IPortion var5 = (IPortion)var4.next();
                     if (!com.aspose.slides.ms.System.n1.k5(var5.getPortionFormat().getFontHeight())) {
                        this.l6.h0().u3((byte)1);
                        break;
                     }
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
                     var4.dispose();
                  }
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
               var2.dispose();
            }
         }
      }

      o4z.n5(this.k5.l6(), this.l6.t2(), var1);
      this.l6.c8().n5((com.aspose.slides.internal.k4y.g7)null);
      if (this.k5.getShapeType() != -1 && this.k5.getShapeType() != 0) {
         u7a.l6(this.k5, this.l6.c8());
      }

      this.l6.c8().l6((com.aspose.slides.internal.k4y.g7)null);
      if (this.k5.getFillFormat().getFillType() != -1) {
         x9f.n5(this.k5.getFillFormat(), new w4c$2(this), var1);
      }

      this.l6.c8().n5((com.aspose.slides.internal.k4y.r5w)null);
      if (!this.k5.getLineFormat().isFormatNotDefined()) {
         i3z.n5(this.k5.getLineFormat(), new w4c$3(this));
      }

      this.l6.c8().k5((com.aspose.slides.internal.k4y.g7)null);
      if (!this.k5.getEffectFormat().isNoEffects()) {
         w5i.n5(this.k5.getEffectFormat(), new w4c$4(this), var1);
      }

      this.l6.c8().n5((com.aspose.slides.internal.k4y.q9u)null);
      this.l6.c8().n5((com.aspose.slides.internal.k4y.h6l)null);
      if (this.k5.r4().n5(true)) {
         r6k.n5(this.k5.r4(), new w4c$5(this), new w4c$6(this), null);
      }

      if (this.t2()) {
         if (this.l6.s7() == null) {
            this.l6.u3();
         }

         com.aspose.slides.internal.k4y.c4t var14 = new com.aspose.slides.internal.k4y.c4t();
         var14.n5(this.k5.getName());
         var14.l6(this.k5.getAlternativeText());
         var14.n5(this.k5.getHidden());
         y1w.n5(this.k5, new w4c$7(this, var14), new w4c$8(this, var14), var1);
         com.aspose.slides.internal.k4y.x1f.n5(this.l6.s7(), var14);
      } else {
         this.l6.n5((com.aspose.slides.internal.k4y.x8)null);
      }
   }

   public final boolean c8() {
      return this.n5;
   }

   public final void n5(boolean var1) {
      this.n5 = var1;
   }

   @Override
   public String toString() {
      return this.u3();
   }

   private boolean t2() {
      return !com.aspose.slides.ms.System.d1.n5(this.k5.getName())
         || !com.aspose.slides.ms.System.d1.n5(this.k5.getAlternativeText())
         || this.k5.getHyperlinkClick() != null
         || this.k5.getHyperlinkMouseOver() != null;
   }

   private static void n5(IShape var0, IShape var1) {
      var1.setHidden(var0.getHidden());
      var1.setAlternativeText(var0.getAlternativeText());
      var1.setName(var0.getName());
      if (var0.getHyperlinkClick() != null && var0.getHyperlinkClick().getActionType() == 1) {
         Hyperlink var2 = (Hyperlink)var0.getHyperlinkClick();
         var1.setHyperlinkClick(
            new Hyperlink(var2, var2.getTargetFrame(), var2.getTooltip(), var2.getHistory(), var2.getStopSoundOnClick(), var2.getHighlightClick())
         );
      } else {
         var1.setHyperlinkClick(var0.getHyperlinkClick());
      }

      var1.setHyperlinkMouseOver(var0.getHyperlinkMouseOver());
   }

   private long s7() {
      long var1 = 0L;
      if (this.k5.l6() != null) {
         IGenericEnumerator var3 = this.k5.l6().getParagraphs().iterator();

         try {
            while (var3.hasNext()) {
               IParagraph var4 = (IParagraph)var3.next();
               IGenericEnumerator var5 = var4.getPortions().iterator();

               try {
                  while (var5.hasNext()) {
                     Portion var6 = (Portion)var5.next();
                     var1 = (var1 & 4294967295L) + (var6.l6().getVersion() & 4294967295L) & 4294967295L;
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
                     var5.dispose();
                  }
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               var3.dispose();
            }
         }
      }

      return var1;
   }

   private void x8() {
      SmartArt var1 = com.aspose.slides.internal.v6g.k5.n5(this.k5.p3(), SmartArt.class);
      if (var1 != null) {
         var1.n5().k5(false);
      }
   }

   public static com.aspose.slides.internal.k4y.h6q n5(w4c var0) {
      return var0.l6;
   }

   // $VF: synthetic method
   static void l6(w4c var0) {
      var0.x8();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.k4y.h6q k5(w4c var0) {
      return var0.l6;
   }
}
