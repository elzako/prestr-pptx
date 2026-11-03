package com.aspose.slides;

public class TabFactory implements ITabFactory {
   @Override
   public final ITab createTab(double position, int align) {
      return new Tab(position, align);
   }
}
