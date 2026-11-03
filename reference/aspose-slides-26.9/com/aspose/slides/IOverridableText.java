package com.aspose.slides;

public interface IOverridableText extends IFormattedTextContainer {
   ITextFrame getTextFrameForOverriding();

   ITextFrame addTextFrameForOverriding(String var1);
}
