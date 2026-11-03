package com.aspose.slides;

public interface IMasterThemeManager extends IThemeManager {
   boolean isOverrideThemeEnabled();

   void setOverrideThemeEnabled(boolean var1);

   IMasterTheme getOverrideTheme();

   void setOverrideTheme(IMasterTheme var1);
}
