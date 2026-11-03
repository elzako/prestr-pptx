package com.aspose.slides;

public interface IColorScheme extends ISlideComponent {
   IColorFormat getByColorSchemeIndex(byte var1);

   IColorFormat getDark1();

   IColorFormat getLight1();

   IColorFormat getDark2();

   IColorFormat getLight2();

   IColorFormat getAccent1();

   IColorFormat getAccent2();

   IColorFormat getAccent3();

   IColorFormat getAccent4();

   IColorFormat getAccent5();

   IColorFormat getAccent6();

   IColorFormat getHyperlink();

   IColorFormat getFollowedHyperlink();
}
