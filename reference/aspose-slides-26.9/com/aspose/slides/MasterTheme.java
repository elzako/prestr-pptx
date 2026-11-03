package com.aspose.slides;

public final class MasterTheme extends Theme implements IMasterTheme {
   private String n5;
   private n6 l6;
   private ExtraColorSchemeCollection k5;
   private j4b u3 = new j4b();
   private long a6 = 1L;
   private long u9 = 0L;

   MasterTheme(r0g parentImmediate) {
      super(parentImmediate);
      this.l6 = new n6(this);
      this.k5 = new ExtraColorSchemeCollection(this);
      this.l6.n5.l6(new MasterTheme$1(this));
      this.k5.n5.l6(new MasterTheme$2(this));
   }

   final j4b n5() {
      return this.u3;
   }

   @Override
   public IColorScheme getColorScheme() {
      return this.l6.l6;
   }

   @Override
   public IFontScheme getFontScheme() {
      return this.l6.k5;
   }

   @Override
   public IFormatScheme getFormatScheme() {
      return this.l6.u3;
   }

   @Override
   public final IExtraColorSchemeCollection getExtraColorSchemes() {
      return this.k5;
   }

   @Override
   public final String getName() {
      return this.n5;
   }

   @Override
   public final void setName(String value) {
      this.n5 = value;
      this.u3();
   }

   private void u3() {
      this.a6++;
      this.a6();
   }

   private void a6() {
      this.u9 = 0L;
   }

   @Override
   public long getVersion() {
      if ((this.u9 & 4294967295L) == 0L) {
         this.u9 = ((this.a6 & 4294967295L) + (this.l6.n5() & 4294967295L) & 4294967295L) + (this.k5.l6() & 4294967295L) & 4294967295L;
      }

      return this.u9;
   }

   // $VF: synthetic method
   static void n5(MasterTheme var0) {
      var0.a6();
   }
}
