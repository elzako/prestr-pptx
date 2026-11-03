package com.aspose.slides;

import com.aspose.slides.ms.System.IDisposable;
import java.awt.Color;
import java.awt.Dimension;
import java.io.OutputStream;
import java.util.Date;
import java.util.regex.Pattern;

public interface IPresentation extends IPresentationComponent, IDisposable {
   Date getCurrentDateTime();

   void setCurrentDateTime(Date var1);

   IPresentationHeaderFooterManager getHeaderFooterManager();

   IProtectionManager getProtectionManager();

   ISlideCollection getSlides();

   ISectionCollection getSections();

   ISlideSize getSlideSize();

   INotesSize getNotesSize();

   IGlobalLayoutSlideCollection getLayoutSlides();

   IMasterSlideCollection getMasters();

   IMasterNotesSlideManager getMasterNotesSlideManager();

   IMasterHandoutSlideManager getMasterHandoutSlideManager();

   IFontsManager getFontsManager();

   ITextStyle getDefaultTextStyle();

   ICommentAuthorCollection getCommentAuthors();

   IDocumentProperties getDocumentProperties();

   IImageCollection getImages();

   IAudioCollection getAudios();

   IVideoCollection getVideos();

   ICustomData getCustomData();

   IVbaProject getVbaProject();

   void setVbaProject(IVbaProject var1);

   int getSourceFormat();

   IMasterTheme getMasterTheme();

   IHyperlinkQueries getHyperlinkQueries();

   IViewProperties getViewProperties();

   int getFirstSlideNumber();

   void setFirstSlideNumber(int var1);

   ICustomXmlPart[] getAllCustomXmlParts();

   IDigitalSignatureCollection getDigitalSignatures();

   ISensitivityLabelCollection getSensitivityLabels();

   void save(String var1, int var2);

   void save(OutputStream var1, int var2);

   void save(String var1, int var2, ISaveOptions var3);

   void save(OutputStream var1, int var2, ISaveOptions var3);

   void save(String var1, int[] var2, int var3);

   void save(String var1, int[] var2, int var3, ISaveOptions var4);

   void save(OutputStream var1, int[] var2, int var3);

   void save(OutputStream var1, int[] var2, int var3, ISaveOptions var4);

   void save(IXamlOptions var1);

   IImage[] getImages(IRenderingOptions var1);

   IImage[] getImages(IRenderingOptions var1, int[] var2);

   IImage[] getImages(IRenderingOptions var1, float var2, float var3);

   IImage[] getImages(IRenderingOptions var1, int[] var2, float var3, float var4);

   IImage[] getImages(IRenderingOptions var1, Dimension var2);

   IImage[] getImages(IRenderingOptions var1, int[] var2, Dimension var3);

   IBaseSlide getSlideById(long var1);

   void joinPortionsWithSameFormatting();

   void highlightText(String var1, Color var2);

   void highlightText(String var1, Color var2, ITextSearchOptions var3, IFindResultCallback var4);

   void highlightRegex(Pattern var1, Color var2, IFindResultCallback var3);

   void replaceText(String var1, String var2, ITextSearchOptions var3, IFindResultCallback var4);

   void replaceRegex(Pattern var1, String var2, IFindResultCallback var3);
}
