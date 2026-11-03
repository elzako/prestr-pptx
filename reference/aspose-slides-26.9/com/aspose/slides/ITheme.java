package com.aspose.slides;

public interface ITheme extends IPresentationComponent {
   IColorScheme getColorScheme();

   IFontScheme getFontScheme();

   IFormatScheme getFormatScheme();

   IThemeEffectiveData getEffective();
}
