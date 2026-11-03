package com.aspose.slides;

import java.io.InputStream;

public interface ISlideCollection extends IGenericCollection<ISlide> {
   ISlide get_Item(int var1);

   ISlide addClone(ISlide var1);

   ISlide addClone(ISlide var1, ISection var2);

   ISlide insertClone(int var1, ISlide var2);

   ISlide addEmptySlide(ILayoutSlide var1);

   ISlide insertEmptySlide(int var1, ILayoutSlide var2);

   ISlide addClone(ISlide var1, ILayoutSlide var2);

   ISlide insertClone(int var1, ISlide var2, ILayoutSlide var3);

   ISlide addClone(ISlide var1, IMasterSlide var2, boolean var3);

   ISlide insertClone(int var1, ISlide var2, IMasterSlide var3, boolean var4);

   void remove(ISlide var1);

   void removeAt(int var1);

   ISlide[] toArray();

   ISlide[] toArray(int var1, int var2);

   void reorder(int var1, ISlide var2);

   void reorder(int var1, ISlide... var2);

   int indexOf(ISlide var1);

   ISlide[] addFromPdf(String var1);

   ISlide[] addFromPdf(String var1, PdfImportOptions var2);

   ISlide[] addFromPdf(InputStream var1, PdfImportOptions var2);

   ISlide[] addFromPdf(InputStream var1);

   ISlide[] addFromHtml(String var1, IExternalResourceResolver var2, String var3);

   ISlide[] addFromHtml(String var1);

   ISlide[] addFromHtml(InputStream var1, IExternalResourceResolver var2, String var3);

   ISlide[] addFromHtml(InputStream var1);

   ISlide[] insertFromHtml(int var1, String var2, IExternalResourceResolver var3, String var4);

   ISlide[] insertFromHtml(int var1, String var2);

   ISlide[] insertFromHtml(int var1, InputStream var2, IExternalResourceResolver var3, String var4);

   ISlide[] insertFromHtml(int var1, InputStream var2);

   ISlide[] insertFromHtml(int var1, String var2, boolean var3);

   ISlide[] insertFromHtml(int var1, String var2, IExternalResourceResolver var3, String var4, boolean var5);

   ISlide[] insertFromHtml(int var1, InputStream var2, boolean var3);

   ISlide[] insertFromHtml(int var1, InputStream var2, IExternalResourceResolver var3, String var4, boolean var5);
}
