package com.aspose.slides;

import java.util.Date;

public interface IDocumentProperties {
   String getAppVersion();

   String getNameOfApplication();

   void setNameOfApplication(String var1);

   String getCompany();

   void setCompany(String var1);

   String getManager();

   void setManager(String var1);

   String getPresentationFormat();

   void setPresentationFormat(String var1);

   boolean getSharedDoc();

   void setSharedDoc(boolean var1);

   String getApplicationTemplate();

   void setApplicationTemplate(String var1);

   double getTotalEditingTime();

   void setTotalEditingTime(double var1);

   String getTitle();

   void setTitle(String var1);

   String getSubject();

   void setSubject(String var1);

   String getAuthor();

   void setAuthor(String var1);

   String getKeywords();

   void setKeywords(String var1);

   String getComments();

   void setComments(String var1);

   String getCategory();

   void setCategory(String var1);

   Date getCreatedTime();

   void setCreatedTime(Date var1);

   Date getLastSavedTime();

   void setLastSavedTime(Date var1);

   Date getLastPrinted();

   void setLastPrinted(Date var1);

   String getLastSavedBy();

   void setLastSavedBy(String var1);

   int getRevisionNumber();

   void setRevisionNumber(int var1);

   String getContentStatus();

   void setContentStatus(String var1);

   String getContentType();

   void setContentType(String var1);

   String getHyperlinkBase();

   void setHyperlinkBase(String var1);

   boolean getScaleCrop();

   void setScaleCrop(boolean var1);

   boolean getLinksUpToDate();

   void setLinksUpToDate(boolean var1);

   boolean getHyperlinksChanged();

   void setHyperlinksChanged(boolean var1);

   int getSlides();

   int getHiddenSlides();

   int getNotes();

   int getParagraphs();

   int getWords();

   int getMultimediaClips();

   String[] getTitlesOfParts();

   IHeadingPair[] getHeadingPairs();

   int getCountOfCustomProperties();

   String getCustomPropertyName(int var1);

   boolean removeCustomProperty(String var1);

   boolean containsCustomProperty(String var1);

   Object get_Item(String var1);

   void set_Item(String var1, Object var2);

   void clearCustomProperties();

   void clearBuiltInProperties();

   void getCustomPropertyValue(String var1, boolean[] var2);

   void getCustomPropertyValue(String var1, int[] var2);

   void getCustomPropertyValue(String var1, Date[] var2);

   void getCustomPropertyValue(String var1, String[] var2);

   void getCustomPropertyValue(String var1, float[] var2);

   void getCustomPropertyValue(String var1, double[] var2);

   void setCustomPropertyValue(String var1, boolean var2);

   void setCustomPropertyValue(String var1, int var2);

   void setCustomPropertyValue(String var1, Date var2);

   void setCustomPropertyValue(String var1, String var2);

   void setCustomPropertyValue(String var1, float var2);

   void setCustomPropertyValue(String var1, double var2);

   ISensitivityLabel[] getSensitivityLabels();
}
