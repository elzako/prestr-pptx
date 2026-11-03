package com.aspose.slides;

import java.awt.Color;

public interface IThreeDFormatEffectiveData extends IThreeDParamSource {
   double getContourWidth();

   double getExtrusionHeight();

   double getDepth();

   IShapeBevelEffectiveData getBevelTop();

   IShapeBevelEffectiveData getBevelBottom();

   Color getContourColor();

   Color getExtrusionColor();

   ICameraEffectiveData getCamera();

   ILightRigEffectiveData getLightRig();

   int getMaterial();
}
