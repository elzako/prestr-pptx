package com.aspose.slides;

import java.util.UUID;

public class Section extends DomObject<SectionCollection> implements ISection {
   private String n5;
   private com.aspose.slides.ms.System.o0 l6 = new com.aspose.slides.ms.System.o0();
   private ISlide k5;

   Section(String name, SectionCollection parentIntermediate, ISlide startedFromSlide) {
      super(parentIntermediate);
      this.n5 = name;
      this.k5 = startedFromSlide;
      com.aspose.slides.ms.System.o0.l6().k5(this.l6);
   }

   @Override
   public final String getName() {
      return this.n5;
   }

   @Override
   public final void setName(String value) {
      this.n5 = value;
   }

   @Override
   public final UUID getSectionId() {
      return com.aspose.slides.ms.System.o0.n5(this.n5());
   }

   com.aspose.slides.ms.System.o0 n5() {
      return this.l6;
   }

   final void n5(com.aspose.slides.ms.System.o0 var1) {
      var1.k5(this.l6);
   }

   @Override
   public final ISlide getStartedFromSlide() {
      return this.k5;
   }

   final void n5(ISlide var1) {
      this.k5 = var1;
      ISlide[] var2 = new ISlide[]{this.k5};
      this.k5 = var2[0];
   }

   @Override
   public final ISectionSlideCollection getSlidesListOfSection() {
      SectionSlideCollection var1 = new SectionSlideCollection(this);
      if (this.getStartedFromSlide() == null) {
         return var1;
      }

      Presentation var2 = com.aspose.slides.internal.v6g.k5.n5(
         com.aspose.slides.internal.v6g.k5.n5(this.u9, r0g.class).getParent_Immediate(), Presentation.class
      );
      SectionCollection var3 = com.aspose.slides.internal.v6g.k5.n5(this.u9, SectionCollection.class);
      int var4 = var2.getSlides().indexOf(this.getStartedFromSlide());
      int var5 = var3.indexOf(this);
      ISlide var6 = null;
      if (var3.indexOf(this) != var3.size() - 1) {
         for (int var7 = var5 + 1; var7 < var3.size(); var7++) {
            if (var3.get_Item(var7).getStartedFromSlide() != null) {
               var6 = var3.get_Item(var7).getStartedFromSlide();
               break;
            }
         }
      }

      if (var6 != null) {
         for (int var8 = var4; var8 < var2.getSlides().indexOf(var6); var8++) {
            var1.l6(var2.getSlides().get_Item(var8));
         }
      } else {
         for (int var9 = var4; var9 < var2.getSlides().size(); var9++) {
            var1.l6(var2.getSlides().get_Item(var9));
         }
      }

      return var1;
   }
}
