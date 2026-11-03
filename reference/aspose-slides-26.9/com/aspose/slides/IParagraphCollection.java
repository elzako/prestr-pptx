package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;

public interface IParagraphCollection extends IGenericEnumerable<IParagraph>, ISlideComponent {
   IParagraph get_Item(int var1);

   int getCount();

   void add(IParagraph var1);

   int add(IParagraphCollection var1);

   void insert(int var1, IParagraph var2);

   void insert(int var1, IParagraphCollection var2);

   void clear();

   void removeAt(int var1);

   boolean remove(IParagraph var1);

   void addFromHtml(String var1);

   void addFromHtml(String var1, IExternalResourceResolver var2, String var3);

   String exportToHtml(int var1, int var2, ITextToHtmlConversionOptions var3);
}
