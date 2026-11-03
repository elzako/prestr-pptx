package com.aspose.slides;

public interface ISummaryZoomSectionCollection extends IGenericCollection<ISummaryZoomSection> {
   ISummaryZoomSection get_Item(int var1);

   ISummaryZoomSection addSummaryZoomSection(ISection var1);

   ISummaryZoomSection getSummarySection(ISection var1);

   void removeSummaryZoomSection(ISection var1);

   int indexOf(ISummaryZoomSection var1);

   void clear();
}
