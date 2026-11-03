package com.aspose.slides;

public interface IOverrideTheme extends ITheme {
   boolean isEmpty();

   void initColorScheme();

   void initColorSchemeFrom(IColorScheme var1);

   void initColorSchemeFromInherited();

   void initFontScheme();

   void initFontSchemeFrom(IFontScheme var1);

   void initFontSchemeFromInherited();

   void initFormatScheme();

   void initFormatSchemeFrom(IFormatScheme var1);

   void initFormatSchemeFromInherited();

   void clear();
}
