package com.aspose.slides;

final class m4n {
   private boolean n5;
   private ILineFormat l6;
   private IFillFormat k5;
   private IEffectFormat u3;
   private PortionFormat a6;
   private ParagraphFormat u9;
   private TextFrameFormat h0;

   public m4n(ILineFormat var1, IFillFormat var2) {
      this(var1, var2, null, null, null, null);
   }

   public m4n(ILineFormat var1, IFillFormat var2, IEffectFormat var3) {
      this(var1, var2, var3, null, null, null);
   }

   public m4n(PortionFormat var1) {
      this(null, null, null, var1, null, null);
   }

   public m4n(ParagraphFormat var1) {
      this(null, null, null, null, var1, null);
   }

   public m4n(TextFrameFormat var1) {
      this(null, null, null, null, null, var1);
   }

   public m4n(ILineFormat var1, IFillFormat var2, IEffectFormat var3, PortionFormat var4, ParagraphFormat var5, TextFrameFormat var6) {
      this(var1, var2, var3, var4, var5, var6, false);
   }

   public m4n(ILineFormat var1, IFillFormat var2, IEffectFormat var3, PortionFormat var4, ParagraphFormat var5, TextFrameFormat var6, boolean var7) {
      this.l6 = var1;
      this.k5 = var2;
      this.u3 = var3;
      this.a6 = var4;
      this.u9 = var5;
      this.h0 = var6;
      this.n5 = var7;
   }

   public final ILineFormat n5() {
      return this.l6;
   }

   public final IFillFormat l6() {
      return this.k5;
   }

   public final IEffectFormat k5() {
      return this.u3;
   }

   public final PortionFormat u3() {
      return this.a6;
   }

   public final ParagraphFormat a6() {
      return this.u9;
   }

   public final TextFrameFormat u9() {
      return this.h0;
   }
}
