package com.aspose.slides;

public interface IOleObjectFrame extends IGraphicalObject {
   IPictureFillFormat getSubstitutePictureFormat();

   String getObjectName();

   void setObjectName(String var1);

   IOleEmbeddedDataInfo getEmbeddedData();

   void setEmbeddedData(IOleEmbeddedDataInfo var1);

   String getObjectProgId();

   void setObjectProgId(String var1);

   String getLinkFileName();

   String getLinkPathLong();

   void setLinkPathLong(String var1);

   String getLinkPathRelative();

   String getEmbeddedFileLabel();

   String getEmbeddedFileName();

   boolean isObjectIcon();

   void setObjectIcon(boolean var1);

   boolean isObjectLink();

   boolean getUpdateAutomatic();

   void setUpdateAutomatic(boolean var1);

   String getSubstitutePictureTitle();

   void setSubstitutePictureTitle(String var1);
}
