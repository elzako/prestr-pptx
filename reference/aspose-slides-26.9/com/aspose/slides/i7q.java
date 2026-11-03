package com.aspose.slides;

class i7q implements m2h {
   private static final h7t n5 = new h7t();
   private final z1f<ILineFormat, LineFormat> l6 = new q2r<>(y7o.n5);

   @Override
   public final z1f<ILineFormat, LineFormat> n5() {
      return this.l6;
   }

   public static m2h n5(IPresentationComponent var0) {
      return var0 != null && var0.getPresentation() != null ? ((Presentation)var0.getPresentation()).y2() : n5;
   }
}
