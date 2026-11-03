package com.aspose.slides;

public interface IFormatScheme extends ISlideComponent {
   IFillFormatCollection getFillStyles();

   ILineFormatCollection getLineStyles();

   IEffectStyleCollection getEffectStyles();

   IFillFormatCollection getBackgroundFillStyles();
}
