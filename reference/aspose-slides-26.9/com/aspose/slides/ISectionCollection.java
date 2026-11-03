package com.aspose.slides;

public interface ISectionCollection extends IGenericCollection<ISection> {
   ISection get_Item(int var1);

   ISection addSection(String var1, ISlide var2);

   ISection addEmptySection(String var1, int var2);

   void removeSectionWithSlides(ISection var1);

   void removeSection(ISection var1);

   void reorderSectionWithSlides(ISection var1, int var2);

   ISection appendEmptySection(String var1);

   int indexOf(ISection var1);

   void clear();
}
