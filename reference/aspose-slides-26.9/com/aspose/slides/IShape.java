package com.aspose.slides;

import java.io.OutputStream;

public interface IShape extends IHyperlinkContainer, ISlideComponent {
   boolean isTextHolder();

   IPlaceholder getPlaceholder();

   IPlaceholder addPlaceholder(IPlaceholder var1);

   void removePlaceholder();

   ICustomData getCustomData();

   IShapeFrame getRawFrame();

   void setRawFrame(IShapeFrame var1);

   IShapeFrame getFrame();

   void setFrame(IShapeFrame var1);

   ILineFormat getLineFormat();

   IThreeDFormat getThreeDFormat();

   IEffectFormat getEffectFormat();

   IFillFormat getFillFormat();

   IImage getImage();

   IImage getImage(int var1, float var2, float var3);

   boolean getHidden();

   void setHidden(boolean var1);

   int getZOrderPosition();

   int getConnectionSiteCount();

   float getRotation();

   void setRotation(float var1);

   float getX();

   void setX(float var1);

   float getY();

   void setY(float var1);

   float getWidth();

   void setWidth(float var1);

   float getHeight();

   void setHeight(float var1);

   String getAlternativeText();

   void setAlternativeText(String var1);

   String getAlternativeTextTitle();

   void setAlternativeTextTitle(String var1);

   String getName();

   void setName(String var1);

   boolean isDecorative();

   void setDecorative(boolean var1);

   IBaseShapeLock getShapeLock();

   long getUniqueId();

   long getOfficeInteropShapeId();

   boolean isGrouped();

   byte getBlackWhiteMode();

   void setBlackWhiteMode(byte var1);

   IGroupShape getParentGroup();

   void writeAsSvg(OutputStream var1);

   void writeAsSvg(OutputStream var1, ISVGOptions var2);

   IShape getBasePlaceholder();
}
