package com.aspose.slides;

import java.util.UUID;

public interface ISection {
   String getName();

   void setName(String var1);

   UUID getSectionId();

   ISlide getStartedFromSlide();

   ISectionSlideCollection getSlidesListOfSection();
}
