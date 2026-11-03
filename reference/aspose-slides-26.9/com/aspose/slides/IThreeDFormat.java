package com.aspose.slides;

public interface IThreeDFormat extends IThreeDParamSource {
   double getContourWidth();

   void setContourWidth(double var1);

   double getExtrusionHeight();

   void setExtrusionHeight(double var1);

   double getDepth();

   void setDepth(double var1);

   IShapeBevel getBevelTop();

   IShapeBevel getBevelBottom();

   IColorFormat getContourColor();

   IColorFormat getExtrusionColor();

   ICamera getCamera();

   ILightRig getLightRig();

   int getMaterial();

   void setMaterial(int var1);

   IThreeDFormatEffectiveData getEffective();
}
