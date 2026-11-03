package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.ms.System.IDisposable;

public final class MathPortion extends Portion implements IMathPortion {
   private final MathParagraph k5;

   @Override
   public final IMathParagraph getMathParagraph() {
      return this.k5;
   }

   public MathPortion() {
      this.k5 = new MathParagraph(this);
      this.k5.n5(true);
   }

   MathPortion(MathParagraph paragraph) {
      if (paragraph.getParent_Immediate() != null) {
         throw new PptxEditException("Can't set already used math paragraph");
      }

      paragraph.n5(this);
      this.k5 = paragraph;
   }

   MathPortion(MathPortion portion) {
      ((PortionFormat)this.getPortionFormat()).n5(portion.l6());
      MathParagraph var2 = new MathParagraph(this);
      var2.n5(portion.k5.n5());
      var2.setJustification(portion.k5.getJustification());
      IGenericEnumerator var3 = portion.k5.iterator();

      try {
         while (var3.hasNext()) {
            IMathBlock var4 = (IMathBlock)var3.next();
            IMathElement[] var5 = new IMathElement[var4.getCount()];
            var4.copyTo(var5, 0);
            MathBlock var6 = new MathBlock();

            for (IMathElement var10 : var5) {
               ((MathElementBase)var10).u3();
               var6.add(var10);
            }

            var2.add(var6);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      this.k5 = var2;
   }

   final void n5() {
      PortionCollection var1 = com.aspose.slides.internal.v6g.k5.n5(this.getParent_Immediate(), PortionCollection.class);
      if (var1 != null && var1.u3() != null) {
         ParagraphCollection var2 = com.aspose.slides.internal.v6g.k5.n5(var1.u3().getParent_Immediate(), ParagraphCollection.class);
         if (var2 != null && var2.k5() != null) {
            var2.k5().l6(true);
         }
      }
   }
}
