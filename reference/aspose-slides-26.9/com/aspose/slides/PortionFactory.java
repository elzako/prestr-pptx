package com.aspose.slides;

public class PortionFactory implements IPortionFactory {
   @Override
   public final IPortion createPortion() {
      return new Portion();
   }

   @Override
   public final IPortion createPortion(String str) {
      return new Portion(str);
   }

   @Override
   public final IPortion createPortion(IPortion portion) {
      return new Portion(com.aspose.slides.internal.v6g.k5.n5(portion, Portion.class));
   }
}
